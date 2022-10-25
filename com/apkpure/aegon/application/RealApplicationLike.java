package com.apkpure.aegon.application;

import android.app.Application;
import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.apkpure.aegon.view.button.DownloadButton;
import com.apkpure.crabshell.GlobalConst;
import com.tencent.crabshell.ApplicationLifeCycle;
import com.tencent.crabshell.DefaultApplicationLike;
import com.tencent.raft.raftframework.RAFT;
import com.tencent.raft.raftframework.config.RaftConfig;
import e.e.i.b;
import g.c.a.e.f.a.a;
import g.c.a.e.h.b.d;
import g.c.a.e.i.b.a;
import g.c.a.g.a.o.c;
import g.c.a.m.g;
import g.c.a.m.l;
import g.c.b.a.e;
import g.e.b.l.i;
import i.o.c.h;
import java.io.File;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RealApplicationLike extends DefaultApplicationLike {
    public static final String BETA_PROCESS_NAME = "com.apkpure.aegon:beta";
    public static final String MAIN_PROCESS_NAME = "com.apkpure.aegon";
    private static final String REAL_APPLICATION_LIKE_TAG = "RealApplicationLikeLite";
    private static volatile RealApplicationLike app;
    public static Application application;
    private static a channelConfig;
    public static Context context;
    private static Logger logger;

    public static Application getApplication() {
        return application;
    }

    public static a getChannelConfig() {
        if (channelConfig == null) {
            channelConfig = new a(getApplication());
        }
        return channelConfig;
    }

    public static Context getContext() {
        return context;
    }

    public static ApplicationLifeCycle getInstance() {
        if (app == null) {
            synchronized (RealApplicationLike.class) {
                if (app == null) {
                    app = new RealApplicationLike();
                }
            }
        }
        return app;
    }

    private void initClientChannel() {
        try {
            e.b bVar = e.f2206e;
            bVar.c(getChannelConfig());
            bVar.b();
        } catch (Exception e2) {
            Logger logger2 = logger;
            StringBuilder i2 = g.a.a.a.a.i("init client channel exception: ");
            i2.append(e2.getMessage());
            logger2.info(i2.toString());
        }
    }

    private void initKeepLive(Application application2) {
        Logger logger2 = g.g.a.a;
        boolean z = false;
        boolean z2 = application2.getSharedPreferences("keepLiveFlag", 0).getBoolean("keepAliveOpen", true);
        logger.info("Process name: {}, isKeepAlive: {}", (Object) b.y(), (Object) Boolean.valueOf(z2));
        if (z2) {
            Logger logger3 = g.a;
            String valueOf = String.valueOf(GlobalConst.VERSIONCODE);
            if (valueOf != null) {
                String string = application2.getSharedPreferences("keepLiveFlag", 0).getString("ignoreKeepLiveOpenVersion", "0");
                if (!TextUtils.isEmpty(string)) {
                    String[] split = string.split("\\|");
                    if (split.length != 0) {
                        int length = split.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                break;
                            } else if (valueOf.equals(split[i2])) {
                                z = true;
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                }
            }
            logger.info("Process name: {}, isIgnoreVersion: {}", (Object) b.y(), (Object) Boolean.valueOf(z));
            if (!z) {
                logger.info("Process name: {}, KeepAlive start success.", (Object) b.y());
                try {
                    g.g.a.d(application2);
                } catch (Throwable th) {
                    logger.warn("开始保活异常: {}", (Object) th.getMessage(), (Object) th);
                }
            }
        }
    }

    private void initLogger(Application application2) {
        StringBuilder sb = new StringBuilder();
        sb.append(application2.getFilesDir().getAbsolutePath());
        String f2 = g.a.a.a.a.f(sb, File.separator, "log");
        File file = new File(f2);
        if (!file.exists()) {
            file.mkdir();
        }
        b.i(f2, true);
        logger = LoggerFactory.getLogger(REAL_APPLICATION_LIKE_TAG);
        b.b(new g.b.a.a.b() {
            public int d(String str, String str2) {
                return 0;
            }

            public int e(String str, String str2) {
                i a = i.a();
                a.b("tag: " + str + " msg: " + str2);
                return 0;
            }

            public int i(String str, String str2) {
                i a = i.a();
                a.b("tag: " + str + " msg: " + str2);
                return 0;
            }

            public int v(String str, String str2) {
                return 0;
            }

            public int w(String str, String str2) {
                i a = i.a();
                a.b("tag: " + str + " msg: " + str2);
                return 0;
            }
        });
        logger.info("\n\ninit logger done: {}", (Object) b.y());
    }

    private void initReportUtils() {
        try {
            d.b();
            g.c.a.e.h.a.d.a();
        } catch (Throwable th) {
            th.printStackTrace();
            logger.info("初始化 report 异常", th);
        }
    }

    private void initSettings(Application application2) {
        try {
            if (l.f2091f == null) {
                synchronized (l.class) {
                    if (l.f2091f == null) {
                        l.f2091f = new l(application2);
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
            logger.info("初始化 Setting 异常", th);
        }
    }

    public static String versionDesc() {
        return "versionName: 1.01.10 versionCode: 1011015 buildNo: 9027";
    }

    public void attachBaseContext(Application application2) {
        super.attachBaseContext(application2);
        initLogger(application2);
        if (!RAFT.isInit()) {
            RAFT.init(application2, RaftConfig.createBuilder().setForceCheck(true).build());
            initKeepLive(application2);
        }
    }

    public void onCreate(Application application2) {
        Log.i(REAL_APPLICATION_LIKE_TAG, versionDesc());
        logger.info("Process name: {} ,application onCreate begin. version Info: {}", (Object) b.y(), (Object) versionDesc());
        super.onCreate(application2);
        application = application2;
        context = application2.getApplicationContext();
        if (b.I(application2)) {
            initSettings(application2);
            initClientChannel();
            a.b bVar = g.c.a.e.i.b.a.c;
            Context context2 = context;
            Objects.requireNonNull(bVar);
            h.e(context2, "context");
            bVar.d().a = context2;
            bVar.d().b = PreferenceManager.getDefaultSharedPreferences(context2);
            g.c.a.e.a.a.a();
            c.b().d();
            initReportUtils();
            b.D().a(new g.c.a.c.a(application2));
            DownloadButton downloadButton = DownloadButton.f288l;
            DownloadButton.g(application2);
            g.c.a.l.d.a.b();
            g.c.c.l.e();
        }
        logger.info("Process name: {} ,application onCreate end.", (Object) b.y());
    }
}
