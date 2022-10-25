package com.tencent.raft.raftframework;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.raft.raftannotation.RService;
import com.tencent.raft.raftframework.config.RaftConfig;
import com.tencent.raft.raftframework.constant.RAFTConstants;
import com.tencent.raft.raftframework.declare.IRADeclareManager;
import com.tencent.raft.raftframework.declare.RADeclareManager;
import com.tencent.raft.raftframework.exception.RAFTCallBeforeInitException;
import com.tencent.raft.raftframework.exception.RAFTIPCNotSupportException;
import com.tencent.raft.raftframework.exception.RAFTNotDeclareServiceException;
import com.tencent.raft.raftframework.log.ILogDelegate;
import com.tencent.raft.raftframework.log.RLog;
import com.tencent.raft.raftframework.remote.RAFTRemoteProxy;
import com.tencent.raft.raftframework.remote.RemoteProxyUtil;
import com.tencent.raft.raftframework.service.IRAServiceManager;
import com.tencent.raft.raftframework.service.IRServiceManager;
import com.tencent.raft.raftframework.service.RAServiceManager;
import com.tencent.raft.raftframework.service.RServiceManager;
import com.tencent.raft.raftframework.sla.SLAReporter;
import com.tencent.raft.raftframework.util.InterfaceUtils;
import com.tencent.raft.raftframework.util.ProcessUtil;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
public class RAApplicationContext {
    public static final String INIT_CLASS = "com.tencent.raft.generate.RaftServiceEntryMap";
    private static final int STATE_INITIALING = 2;
    private static final int STATE_INIT_FINISH = 3;
    private static final int STATE_ZYGOTE = 1;
    public static final String TAG = "RAApplicationContext";
    private static final String TRANSFORM_CLASS = "com.tencent.raft.transform.RaftServiceEntryMap";
    private static RAApplicationContext sInstance;
    private Context mContext;
    private IRADeclareManager mDeclareManager;
    private IRServiceManager mRServiceManager;
    private SLAReporter mSLAReporter;
    private IRAServiceManager mServiceManager;
    private AtomicInteger mState = new AtomicInteger(1);

    public class a implements Runnable {
        public final /* synthetic */ Context b;
        public final /* synthetic */ RaftConfig c;

        public a(Context context, RaftConfig raftConfig) {
            this.b = context;
            this.c = raftConfig;
        }

        public void run() {
            RAApplicationContext.this.startupSync(this.b, this.c);
        }
    }

    private RAApplicationContext() {
    }

    private void ensureStartup() {
        if (this.mState.compareAndSet(2, 2)) {
            startupSync(this.mContext, RAFT.getConfig());
        }
    }

    @Deprecated
    public static RAApplicationContext getGlobalContext() {
        return getInstance();
    }

    public static synchronized RAApplicationContext getInstance() {
        RAApplicationContext rAApplicationContext;
        synchronized (RAApplicationContext.class) {
            if (sInstance == null) {
                sInstance = new RAApplicationContext();
            }
            rAApplicationContext = sInstance;
        }
        return rAApplicationContext;
    }

    public static RAApplicationContext newInstance() {
        return new RAApplicationContext();
    }

    @Deprecated
    public static void setLogDelegate(ILogDelegate iLogDelegate) {
        RLog.setLogDelegate(iLogDelegate);
    }

    public <T> Map<String, T> getAllRService(Class<T> cls) throws RAFTCallBeforeInitException {
        ensureStartup();
        if (hasStartUp()) {
            long nanoTime = System.nanoTime();
            try {
                Map<String, T> allRService = this.mRServiceManager.getAllRService(cls);
                this.mSLAReporter.reportGetServiceFinish(nanoTime, true, (Class<?>) cls, 3);
                return allRService;
            } catch (Throwable th) {
                this.mSLAReporter.reportGetServiceException(nanoTime, cls, 3, th);
                throw th;
            }
        } else {
            throw new RAFTCallBeforeInitException();
        }
    }

    public Context getContext() {
        return this.mContext;
    }

    public synchronized String getDeclareConstant(String str) {
        return this.mDeclareManager.getDeclareConstant(str);
    }

    public synchronized Object getDeclareService(String str) {
        Object declareService;
        long nanoTime = System.nanoTime();
        declareService = this.mDeclareManager.getDeclareService(str);
        this.mSLAReporter.reportGetServiceFinish(nanoTime, declareService != null, str, 4);
        return declareService;
    }

    public <T> T getIPCSync(Class<T> cls, String str) throws RAFTCallBeforeInitException, RAFTNotDeclareServiceException, RAFTIPCNotSupportException {
        ensureStartup();
        if (!hasStartUp()) {
            throw new RAFTCallBeforeInitException();
        } else if (TextUtils.isEmpty(ProcessUtil.getProcessName(this.mContext))) {
            return getRService(cls, str);
        } else {
            if (cls.isAnnotationPresent(RService.class)) {
                long nanoTime = System.nanoTime();
                if (RAFT.getConfig().getProcessCheck().check(cls, "", true)) {
                    if (RAFT.getConfig().isForceCheck()) {
                        try {
                            RemoteProxyUtil.verifyClass(cls);
                        } catch (RAFTIPCNotSupportException e2) {
                            this.mSLAReporter.reportGetIPCService(nanoTime, cls, RAFTIPCNotSupportException.Reason.UNSUPPORTED_METHOD);
                            throw e2;
                        }
                    }
                    try {
                        T proxy = RAFTRemoteProxy.getProxy(cls, str);
                        this.mSLAReporter.reportGetIPCService(nanoTime, cls, (RAFTIPCNotSupportException.Reason) null);
                        return proxy;
                    } catch (Throwable th) {
                        SLAReporter sLAReporter = this.mSLAReporter;
                        RAFTIPCNotSupportException.Reason reason = RAFTIPCNotSupportException.Reason.UNSUPPORTED_PROXY;
                        sLAReporter.reportGetIPCService(nanoTime, cls, reason);
                        StringBuilder i2 = g.a.a.a.a.i("Proxy expect ");
                        i2.append(cls.getName());
                        i2.append(", but is exception");
                        throw new RAFTIPCNotSupportException(i2.toString(), reason, th);
                    }
                } else {
                    SLAReporter sLAReporter2 = this.mSLAReporter;
                    RAFTIPCNotSupportException.Reason reason2 = RAFTIPCNotSupportException.Reason.UNSUPPORTED_PROCESS;
                    sLAReporter2.reportGetIPCService(nanoTime, cls, reason2);
                    throw new RAFTIPCNotSupportException((Class<?>) cls, reason2);
                }
            } else {
                throw new RAFTNotDeclareServiceException(cls);
            }
        }
    }

    public <T> T getRService(Class<T> cls, String str) throws RAFTCallBeforeInitException, RAFTNotDeclareServiceException {
        ensureStartup();
        if (!hasStartUp()) {
            throw new RAFTCallBeforeInitException();
        } else if (cls.isAnnotationPresent(RService.class)) {
            long nanoTime = System.nanoTime();
            try {
                T t = this.mRServiceManager.get(cls, str);
                this.mSLAReporter.reportGetServiceFinish(nanoTime, true, (Class<?>) cls, 2);
                return t;
            } catch (Throwable th) {
                this.mSLAReporter.reportGetServiceException(nanoTime, cls, 2, th);
                throw th;
            }
        } else {
            throw new RAFTNotDeclareServiceException(cls);
        }
    }

    @Deprecated
    public <T> T getService(Class<T> cls) throws RAFTCallBeforeInitException {
        return cls.isAnnotationPresent(RService.class) ? getRService(cls, "") : getService(cls, (IServiceProvider) null);
    }

    /* JADX INFO: finally extract failed */
    @Deprecated
    public <T> T getService(Class<T> cls, IServiceProvider iServiceProvider) throws RAFTCallBeforeInitException {
        boolean isStandardRaftInterface = InterfaceUtils.isStandardRaftInterface(cls);
        ensureStartup();
        if (hasStartUp()) {
            long nanoTime = System.nanoTime();
            try {
                T service = this.mServiceManager.getService(cls, iServiceProvider);
                boolean z = false;
                this.mSLAReporter.reportGetServiceFinish(nanoTime, service != null, (Class<?>) cls, isStandardRaftInterface ? 5 : 1);
                if (isStandardRaftInterface) {
                    SLAReporter sLAReporter = this.mSLAReporter;
                    if (service != null) {
                        z = true;
                    }
                    sLAReporter.reportGetStandardServiceFinish(nanoTime, z, cls);
                }
                return service;
            } catch (Throwable th) {
                this.mSLAReporter.reportGetServiceException(nanoTime, cls, isStandardRaftInterface ? 5 : 1, th);
                if (isStandardRaftInterface) {
                    return null;
                }
                throw th;
            }
        } else if (isStandardRaftInterface) {
            return null;
        } else {
            throw new RAFTCallBeforeInitException();
        }
    }

    public boolean hasStartUp() {
        return this.mState.get() == 3;
    }

    public void notifyConfigChange() {
        SLAReporter sLAReporter = this.mSLAReporter;
        if (sLAReporter != null) {
            sLAReporter.open(RAFT.getConfig().isOpenSLAReporter());
        }
        if (RAFT.getConfig().getRemoteProxy() != null) {
            RAFTRemoteProxy.init(RAFT.getConfig().getRemoteProxy());
        }
        RLog.setLogDelegate(RAFT.getConfig().getLogDelegate());
    }

    @Deprecated
    public void shutdown() {
        ensureStartup();
        if (hasStartUp()) {
            this.mState.compareAndSet(3, 1);
            StringBuilder i2 = g.a.a.a.a.i("shutdown [");
            i2.append(hashCode());
            i2.append("]");
            RLog.d(TAG, i2.toString());
            this.mServiceManager.destroy();
            this.mServiceManager = null;
            this.mDeclareManager.destroy();
            this.mDeclareManager = null;
            this.mRServiceManager.destroy();
            this.mRServiceManager = null;
            SLAReporter sLAReporter = this.mSLAReporter;
            if (sLAReporter != null) {
                sLAReporter.release();
                this.mSLAReporter = null;
            }
            this.mContext = null;
        }
    }

    public void startup(Context context) {
        startup(context, RAFT.getConfig());
    }

    public void startup(Context context, RaftConfig raftConfig) {
        this.mContext = context;
        if (this.mState.compareAndSet(1, 2)) {
            raftConfig.getExecutor().execute(new a(context, raftConfig));
            return;
        }
        RLog.e(TAG, "cannot startup again");
    }

    public void startup(Context context, boolean z) {
        RaftConfig config = RAFT.getConfig();
        config.setOpenSLAReporter(z);
        startup(context, config);
    }

    public synchronized void startupSync(Context context, RaftConfig raftConfig) {
        try {
            if (!this.mState.compareAndSet(3, 3)) {
                if (this.mSLAReporter == null) {
                    this.mSLAReporter = new SLAReporter(context, raftConfig.getExecutor());
                }
                this.mSLAReporter.open(raftConfig.isOpenSLAReporter());
                this.mSLAReporter.reportOnFrameworkStartup();
                RLog.d(TAG, "startup [" + hashCode() + "], current RAFT version:" + RAFTConstants.RAFT_VERSION);
                if (RAFT.getConfig().getRemoteProxy() != null) {
                    RAFTRemoteProxy.init(RAFT.getConfig().getRemoteProxy());
                }
                this.mServiceManager = new RAServiceManager(INIT_CLASS);
                this.mDeclareManager = new RADeclareManager(INIT_CLASS);
                this.mRServiceManager = new RServiceManager(TRANSFORM_CLASS);
                this.mState.compareAndSet(2, 3);
                this.mSLAReporter.reportOnFrameworkStartupFinish((Exception) null);
            } else {
                return;
            }
        } catch (Exception e2) {
            RLog.d(TAG, "startup abort", e2);
            this.mState.compareAndSet(2, 1);
            this.mSLAReporter.reportOnFrameworkStartupFinish(e2);
        }
    }
}
