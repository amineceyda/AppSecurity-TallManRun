package com.tencent.raft.raftframework.sla;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import com.tencent.raft.measure.utils.MeasureConst;
import com.tencent.raft.raftframework.RAFT;
import com.tencent.raft.raftframework.exception.RAFTCallWrongProcessException;
import com.tencent.raft.raftframework.exception.RAFTIPCNotSupportException;
import com.tencent.raft.raftframework.exception.RAFTNotDeclareServiceException;
import com.tencent.raft.raftframework.exception.RAFTServiceNotFoundException;
import com.tencent.raft.raftframework.exception.RAFTServiceNotMatchException;
import com.tencent.raft.raftframework.log.ILogDelegate;
import com.tencent.raft.raftframework.log.RLog;
import com.tencent.raft.raftframework.util.AppUtils;
import com.tencent.raft.raftframework.util.ProcessUtil;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

public class SLAReporter {
    public static final int GROUP_ID_MUST_REPORT = -1;
    public static final String PERMISSION_NET = "android.permission.INTERNET";
    public static final double REPORT_NS_MS = 1000000.0d;
    private static final int SINGER_SERVICE_MAX_REPORT_COUNT = 5;
    public static final String TAG = "SLAReporter";
    /* access modifiers changed from: private */
    public StringBuilder baseURL;
    private Context context;
    private final Executor executor;
    private long frameworkStartupNs;
    private int groupId = 1;
    private boolean isInit = false;
    public boolean open = true;
    private final ConcurrentHashMap<String, g.i.d.b.a.a> reportService = new ConcurrentHashMap<>(64);

    public class a implements Runnable {
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ List f912d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ String f913e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ long f914f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ String f915g;

        public a(String str, String str2, List list, String str3, long j2, String str4) {
            this.b = str;
            this.c = str2;
            this.f912d = list;
            this.f913e = str3;
            this.f914f = j2;
            this.f915g = str4;
        }

        public void run() {
            SLAReporter.this.initIfNeeded();
            SLAReporter.this.recordServiceReportCount(this.b, this.c);
            List<Pair> list = this.f912d;
            if (list == null) {
                list = new ArrayList<>();
            }
            SLAReporter.this.updateParamList(this.b, this.f913e, this.f914f, this.c, this.f915g, list);
            StringBuilder sb = new StringBuilder(SLAReporter.this.baseURL);
            for (Pair pair : list) {
                sb.append("&");
                sb.append((String) pair.first);
                sb.append("=");
                sb.append(SLAReporter.urlEncodeParam((String) pair.second));
            }
            if (RAFT.getConfig().isDebugVersion()) {
                ILogDelegate logDelegate = RAFT.getConfig().getLogDelegate();
                StringBuilder i2 = g.a.a.a.a.i("reportInfo=");
                i2.append(sb.toString());
                logDelegate.debug(SLAReporter.TAG, i2.toString());
            }
            SLAReporter.this.reportInner(sb.toString());
        }
    }

    public SLAReporter(Context context2, Executor executor2) {
        this.context = context2;
        this.executor = executor2;
    }

    private int applyForGroupId() {
        int i2 = this.groupId;
        this.groupId = i2 + 1;
        return i2;
    }

    /* access modifiers changed from: private */
    public synchronized void initIfNeeded() {
        if (!this.isInit) {
            StringBuilder sb = new StringBuilder("https://h.trace.qq.com/kv");
            this.baseURL = sb;
            sb.append("?attaid=");
            sb.append("0c500034918");
            StringBuilder sb2 = this.baseURL;
            sb2.append("&token=");
            sb2.append("4483379541");
            this.baseURL.append("&client_type=android");
            this.isInit = true;
        }
    }

    /* access modifiers changed from: private */
    public void recordServiceReportCount(String str, String str2) {
        if (SLAConstant.GET_SERVICE_COST.compareTo(str) == 0 || SLAConstant.GET_SERVICE_SUCCESS.compareTo(str) == 0) {
            synchronized (this.reportService) {
                g.i.d.b.a.a aVar = new g.i.d.b.a.a(1);
                g.i.d.b.a.a put = this.reportService.put(str2, aVar);
                if (put != null) {
                    aVar.a = put.a + 1;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void reportInner(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.String r0 = ", path: "
            java.lang.String r1 = "SLAReporter"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r2 < r3) goto L_0x000d
            android.net.TrafficStats.getAndSetThreadStatsTag(r3)
        L_0x000d:
            r2 = 0
            r3 = 0
            r4 = 1
            java.net.URL r5 = new java.net.URL     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
            r5.<init>(r11)     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
            java.net.URLConnection r5 = r5.openConnection()     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
            r2 = 5000(0x1388, float:7.006E-42)
            r5.setConnectTimeout(r2)     // Catch:{ Exception -> 0x0055 }
            java.lang.String r2 = "GET"
            r5.setRequestMethod(r2)     // Catch:{ Exception -> 0x0055 }
            int r2 = r5.getResponseCode()     // Catch:{ Exception -> 0x0055 }
            com.tencent.raft.raftframework.config.RaftConfig r6 = com.tencent.raft.raftframework.RAFT.getConfig()     // Catch:{ Exception -> 0x0055 }
            boolean r6 = r6.isDebugVersion()     // Catch:{ Exception -> 0x0055 }
            if (r6 == 0) goto L_0x0051
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0055 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0055 }
            r7.<init>()     // Catch:{ Exception -> 0x0055 }
            java.lang.String r8 = "report code: "
            r7.append(r8)     // Catch:{ Exception -> 0x0055 }
            r7.append(r2)     // Catch:{ Exception -> 0x0055 }
            r7.append(r0)     // Catch:{ Exception -> 0x0055 }
            r7.append(r11)     // Catch:{ Exception -> 0x0055 }
            java.lang.String r2 = r7.toString()     // Catch:{ Exception -> 0x0055 }
            r6[r3] = r2     // Catch:{ Exception -> 0x0055 }
            com.tencent.raft.raftframework.log.RLog.d(r1, r6)     // Catch:{ Exception -> 0x0055 }
        L_0x0051:
            r5.disconnect()
            goto L_0x007e
        L_0x0055:
            r2 = move-exception
            goto L_0x005d
        L_0x0057:
            r11 = move-exception
            goto L_0x0081
        L_0x0059:
            r5 = move-exception
            r9 = r5
            r5 = r2
            r2 = r9
        L_0x005d:
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x007f }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x007f }
            r6.<init>()     // Catch:{ all -> 0x007f }
            java.lang.String r7 = "report error: "
            r6.append(r7)     // Catch:{ all -> 0x007f }
            r6.append(r2)     // Catch:{ all -> 0x007f }
            r6.append(r0)     // Catch:{ all -> 0x007f }
            r6.append(r11)     // Catch:{ all -> 0x007f }
            java.lang.String r11 = r6.toString()     // Catch:{ all -> 0x007f }
            r4[r3] = r11     // Catch:{ all -> 0x007f }
            com.tencent.raft.raftframework.log.RLog.w(r1, r4)     // Catch:{ all -> 0x007f }
            if (r5 == 0) goto L_0x007e
            goto L_0x0051
        L_0x007e:
            return
        L_0x007f:
            r11 = move-exception
            r2 = r5
        L_0x0081:
            if (r2 == 0) goto L_0x0086
            r2.disconnect()
        L_0x0086:
            goto L_0x0088
        L_0x0087:
            throw r11
        L_0x0088:
            goto L_0x0087
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.raft.raftframework.sla.SLAReporter.reportInner(java.lang.String):void");
    }

    /* access modifiers changed from: private */
    public void updateParamList(String str, String str2, long j2, String str3, String str4, List<Pair<String, String>> list) {
        String str5;
        list.add(Pair.create("app_debug", RAFT.getConfig().isDebugVersion() ? "0" : SLAConstant.TYPE_DEPRECATED_START));
        list.add(Pair.create("event_name", str));
        list.add(Pair.create("event_value", str2));
        list.add(Pair.create("event_cost", j2 + ""));
        if (!TextUtils.isEmpty(str3)) {
            list.add(Pair.create("r1", str3));
        }
        if (!TextUtils.isEmpty(str4)) {
            list.add(Pair.create("r2", str4));
        }
        Context context2 = this.context;
        String str6 = "app_bundle_id";
        if (context2 != null) {
            list.add(Pair.create("app_name", AppUtils.getApplicationName(context2)));
            list.add(Pair.create(str6, this.context.getPackageName()));
            list.add(Pair.create("app_version_name", AppUtils.getAppVersionName(this.context)));
            list.add(Pair.create("app_version_code", String.valueOf(AppUtils.getAppVersionCode(this.context))));
            str5 = ProcessUtil.getProcessName(this.context);
            if (TextUtils.isEmpty(str5)) {
                str5 = "main";
            }
            str6 = "processName";
        } else {
            list.add(Pair.create("app_name", "RAFTAndroid"));
            str5 = "com.tencent.raft";
        }
        list.add(Pair.create(str6, str5));
        list.add(Pair.create("raft_version", "0.5.2.13"));
    }

    /* access modifiers changed from: private */
    public static String urlEncodeParam(String str) {
        if (!(str == null || str.length() == 0)) {
            try {
                return URLEncoder.encode(str, MeasureConst.CHARSET_UTF8);
            } catch (UnsupportedEncodingException unused) {
                RLog.d(TAG, "UnsupportedEncodingException:UTF-8");
            }
        }
        return "null";
    }

    private boolean whetherReportWithSample(int i2) {
        return i2 == -1 || i2 % 100 == 1;
    }

    public Executor getExecutor() {
        return this.executor;
    }

    public void open(boolean z) {
        this.open = z;
        RLog.d(TAG, "set open: " + z + " ,real: " + this.open);
    }

    public void release() {
        this.context = null;
    }

    public void report(int i2, String str, String str2, long j2, String str3, String str4) {
        report(i2, str, str2, j2, str3, str4, (List<Pair<String, String>>) null);
    }

    public void report(int i2, String str, String str2, long j2, String str3, String str4, List<Pair<String, String>> list) {
        if (whetherReportWithSample(i2)) {
            this.executor.execute(new a(str, str3, list, str2, j2, str4));
        }
    }

    public void report(String str, String str2, long j2, String str3, String str4) {
        report(-1, str, str2, j2, str3, str4);
    }

    public void reportGetIPCService(long j2, Class<?> cls, RAFTIPCNotSupportException.Reason reason) {
        int applyForGroupId;
        String canonicalName;
        String str;
        String str2;
        String str3;
        if (this.open) {
            long nanoTime = System.nanoTime() - j2;
            if (reason != null) {
                int ordinal = reason.ordinal();
                str3 = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? "" : "UNSUPPORTED_PROXY" : "UNSUPPORTED_THREAD" : "UNSUPPORTED_METHOD" : "UNSUPPORTED_PROCESS";
                applyForGroupId = -1;
                canonicalName = cls.getCanonicalName();
                str = SLAConstant.GET_IPC_SERVICE;
                str2 = "0";
            } else {
                applyForGroupId = applyForGroupId();
                double d2 = (double) nanoTime;
                Double.isNaN(d2);
                nanoTime = (long) (d2 / 1000000.0d);
                canonicalName = cls.getCanonicalName();
                str = SLAConstant.GET_IPC_SERVICE;
                str2 = SLAConstant.TYPE_DEPRECATED_START;
                str3 = "";
            }
            report(applyForGroupId, str, str2, nanoTime, canonicalName, str3);
        }
    }

    public void reportGetServiceException(long j2, Class<?> cls, int i2, Throwable th) {
        if (this.open) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Pair.create("exception_message", th.getMessage()));
            arrayList.add(Pair.create("exception_type", th.getClass().getSimpleName()));
            String valueOf = ((th instanceof RAFTServiceNotFoundException) || (th instanceof RAFTCallWrongProcessException) || (th instanceof RAFTNotDeclareServiceException) || (th instanceof RAFTServiceNotMatchException)) ? String.valueOf(1) : String.valueOf(0);
            ArrayList arrayList2 = arrayList;
            report(applyForGroupId(), SLAConstant.GET_SERVICE_COST, valueOf, System.nanoTime() - j2, cls.getCanonicalName(), String.valueOf(i2), arrayList2);
            report(-1, SLAConstant.GET_SERVICE_ERROR, valueOf, System.nanoTime() - j2, cls.getCanonicalName(), String.valueOf(i2), arrayList2);
        }
    }

    public void reportGetServiceFinish(long j2, boolean z, Class<?> cls, int i2) {
        reportGetServiceFinish(j2, z, cls.getCanonicalName(), i2);
    }

    public void reportGetServiceFinish(long j2, boolean z, String str, int i2) {
        if (this.open) {
            if (z || i2 != 5) {
                g.i.d.b.a.a aVar = this.reportService.get(str);
                if (aVar == null || aVar.a <= 5) {
                    int applyForGroupId = applyForGroupId();
                    long nanoTime = System.nanoTime() - j2;
                    double d2 = (double) nanoTime;
                    Double.isNaN(d2);
                    Double.isNaN(d2);
                    report(applyForGroupId, SLAConstant.GET_SERVICE_COST, String.valueOf(d2 / 1000000.0d), nanoTime, str, String.valueOf(i2));
                    report(applyForGroupId, SLAConstant.GET_SERVICE_SUCCESS, z ? SLAConstant.TYPE_DEPRECATED_START : "0", 0, str, String.valueOf(i2));
                }
            }
        }
    }

    public void reportGetStandardServiceFinish(long j2, boolean z, Class<?> cls) {
        if (this.open) {
            report(applyForGroupId(), SLAConstant.GET_STANDARD_INTERFACE_SERVICE, z ? SLAConstant.TYPE_DEPRECATED_START : "0", System.nanoTime() - j2, cls.getCanonicalName(), "");
        }
    }

    public void reportOnFrameworkStartup() {
        if (this.open) {
            this.frameworkStartupNs = System.nanoTime();
            SharedPreferences.Editor edit = this.context.getSharedPreferences(MeasureConst.CRASH_MONITOR_SP_NAME, 0).edit();
            edit.putString("a321c41aa2", "0.5.2.13");
            edit.apply();
        }
    }

    public void reportOnFrameworkStartupFinish(Exception exc) {
        if (this.open) {
            SharedPreferences sharedPreferences = this.context.getSharedPreferences("raft_config", 0);
            if (!sharedPreferences.getBoolean("app_sla_report", false)) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putBoolean("app_sla_report", true);
                edit.apply();
                ArrayList arrayList = new ArrayList();
                arrayList.add(Pair.create("app_name", AppUtils.getApplicationName(this.context)));
                arrayList.add(Pair.create("app_bundle_id", this.context.getPackageName()));
                report(-1, SLAConstant.APP_INFO, "0", 0, (String) null, (String) null, arrayList);
                long nanoTime = System.nanoTime() - this.frameworkStartupNs;
                double d2 = (double) nanoTime;
                Double.isNaN(d2);
                String valueOf = String.valueOf(d2 / 1000000.0d);
                String str = exc == null ? SLAConstant.TYPE_DEPRECATED_START : "0";
                report("launch_cost", valueOf, nanoTime, str, exc == null ? "" : exc.getMessage());
                report("launch_success", SLAConstant.TYPE_DEPRECATED_START, 0, (String) null, (String) null);
            }
        }
    }

    public void sampleReport(String str, String str2, long j2) {
        report(applyForGroupId(), str, str2, j2, (String) null, (String) null);
    }
}
