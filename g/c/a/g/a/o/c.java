package g.c.a.g.a.o;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.apkpure.aegon.application.AegonApplication;
import com.apkpure.aegon.main.activity.MainTabActivity;
import g.c.a.b.b.d;
import i.o.c.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Stack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class c {

    /* renamed from: f  reason: collision with root package name */
    public static final Logger f2026f = LoggerFactory.getLogger("ActivityManagerLog");

    /* renamed from: g  reason: collision with root package name */
    public static c f2027g;
    public int a = 0;
    public final Stack<Activity> b = new Stack<>();
    public final Stack<Activity> c = new Stack<>();

    /* renamed from: d  reason: collision with root package name */
    public int f2028d = -1;

    /* renamed from: e  reason: collision with root package name */
    public final Application.ActivityLifecycleCallbacks f2029e = new a();

    public class a implements Application.ActivityLifecycleCallbacks {
        public a() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            Object obj;
            Logger logger = c.f2026f;
            if (activity == null) {
                obj = "null activity";
            } else {
                obj = activity.getComponentName();
            }
            logger.info("onActivityCreated {}", obj);
            c cVar = c.this;
            if (cVar.f2028d == -1) {
                cVar.f2028d = 0;
                try {
                    Intent launchIntentForPackage = activity.getPackageManager().getLaunchIntentForPackage(activity.getPackageName());
                    if (!(launchIntentForPackage == null || launchIntentForPackage.getComponent() == null)) {
                        String className = launchIntentForPackage.getComponent().getClassName();
                        String className2 = activity.getComponentName().getClassName();
                        if (!TextUtils.isEmpty(className) && !className.equals(className2) && !"om.tencent.qqdownloader.notification.QDNotificationSupportActivity".equals(className2)) {
                            if (!"com.tencent.qqdownloader.backgroundstart.BackgroundSupportActivity".equals(className2)) {
                                launchIntentForPackage.addFlags(67108864);
                                activity.startActivity(launchIntentForPackage);
                                activity.finish();
                            }
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            Objects.requireNonNull(c.this);
        }

        public void onActivityDestroyed(Activity activity) {
            Object obj;
            Logger logger = c.f2026f;
            if (activity == null) {
                obj = "null activity";
            } else {
                obj = activity.getComponentName();
            }
            logger.info("onActivityDestroyed {}", obj);
            c.this.c.remove(activity);
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
            d dVar = d.a;
            h.e(activity, "context");
            d dVar2 = d.a;
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            Object obj;
            Logger logger = c.f2026f;
            if (activity == null) {
                obj = "null activity";
            } else {
                obj = activity.getComponentName();
            }
            logger.info("onActivityStarted {}", obj);
            if (!c.this.b.contains(activity)) {
                c.this.b.add(activity);
            }
            if (!c.this.b.isEmpty() && (!d.b)) {
                if (activity.getComponentName() != null) {
                    logger.info("noticeAppIsForeground: {}", (Object) activity.getComponentName().toString());
                }
                d.b = true;
                Logger logger2 = d.a;
                logger2.info("setAppIsForeground, IsBackground: {}, activity: {}", (Object) false, (Object) activity.getComponentName().toString());
                List<g.c.a.m.d> list = d.f2030d;
                if (!list.isEmpty()) {
                    logger2.info("通知进入后台的监听器");
                    synchronized (list) {
                        for (g.c.a.m.d next : list) {
                            if (next != null) {
                                try {
                                    next.a();
                                } catch (Exception e2) {
                                    d.a.warn("setAppIsBackground callBack exception:", (Throwable) e2);
                                }
                            }
                        }
                    }
                }
            }
            if (!c.this.c.contains(activity)) {
                c.this.c.add(activity);
            }
            c.this.a++;
        }

        public void onActivityStopped(Activity activity) {
            Object obj;
            Logger logger = c.f2026f;
            if (activity == null) {
                obj = "null activity";
            } else {
                obj = activity.getComponentName();
            }
            logger.info("onActivityStopped {}", obj);
            c.this.b.remove(activity);
            c cVar = c.this;
            cVar.a--;
            System.currentTimeMillis();
            Objects.requireNonNull(c.this);
            if (c.this.b.isEmpty()) {
                if (activity.getComponentName() != null) {
                    logger.info("noticeAppIsBackground: {}", (Object) activity.getComponentName().toString());
                }
                d.b = false;
                Logger logger2 = d.a;
                logger2.info("setAppIsBackground, IsBackground: {} activity: {}", (Object) Boolean.TRUE, (Object) activity.getComponentName().toString());
                List<g.c.a.m.d> list = d.c;
                if (!list.isEmpty()) {
                    logger2.info("通知进入后台的监听器");
                    synchronized (list) {
                        for (g.c.a.m.d next : list) {
                            if (next != null) {
                                try {
                                    next.a();
                                } catch (Exception e2) {
                                    d.a.warn("setAppIsBackground callBack exception:", (Throwable) e2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    static {
        new ArrayList();
    }

    public static c b() {
        if (f2027g == null) {
            synchronized (c.class) {
                if (f2027g == null) {
                    f2027g = new c();
                }
            }
        }
        return f2027g;
    }

    public g.c.a.g.b.a a() {
        synchronized (this.c) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                Activity activity = (Activity) it.next();
                if (activity instanceof MainTabActivity) {
                    MainTabActivity mainTabActivity = (MainTabActivity) activity;
                    return mainTabActivity;
                }
            }
            return null;
        }
    }

    public Activity c() {
        Stack<Activity> stack = this.b;
        if (stack == null || stack.isEmpty()) {
            return null;
        }
        return (Activity) this.b.lastElement();
    }

    public void d() {
        Application application = AegonApplication.getApplication();
        if (application != null) {
            application.registerActivityLifecycleCallbacks(this.f2029e);
        }
    }
}
