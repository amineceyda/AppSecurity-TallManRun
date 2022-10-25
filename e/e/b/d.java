package e.e.b;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class d {
    public static final Class<?> a;
    public static final Field b;
    public static final Field c;

    /* renamed from: d  reason: collision with root package name */
    public static final Method f1266d;

    /* renamed from: e  reason: collision with root package name */
    public static final Method f1267e;

    /* renamed from: f  reason: collision with root package name */
    public static final Method f1268f;

    /* renamed from: g  reason: collision with root package name */
    public static final Handler f1269g = new Handler(Looper.getMainLooper());

    public class a implements Runnable {
        public final /* synthetic */ c b;
        public final /* synthetic */ Object c;

        public a(c cVar, Object obj) {
            this.b = cVar;
            this.c = obj;
        }

        public void run() {
            this.b.b = this.c;
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ Application b;
        public final /* synthetic */ c c;

        public b(Application application, c cVar) {
            this.b = application;
            this.c = cVar;
        }

        public void run() {
            this.b.unregisterActivityLifecycleCallbacks(this.c);
        }
    }

    public static final class c implements Application.ActivityLifecycleCallbacks {
        public Object b;
        public Activity c;

        /* renamed from: d  reason: collision with root package name */
        public final int f1270d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1271e = false;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1272f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1273g = false;

        public c(Activity activity) {
            this.c = activity;
            this.f1270d = activity.hashCode();
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.c == activity) {
                this.c = null;
                this.f1272f = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.f1272f && !this.f1273g && !this.f1271e) {
                Object obj = this.b;
                int i2 = this.f1270d;
                boolean z = false;
                try {
                    Object obj2 = d.c.get(activity);
                    if (obj2 == obj) {
                        if (activity.hashCode() == i2) {
                            d.f1269g.postAtFrontOfQueue(new e(d.b.get(activity), obj2));
                            z = true;
                        }
                    }
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while fetching field values", th);
                }
                if (z) {
                    this.f1273g = true;
                    this.b = null;
                }
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.c == activity) {
                this.f1271e = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005d A[SYNTHETIC, Splitter:B:25:0x005d] */
    static {
        /*
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            f1269g = r0
            r0 = 0
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x0013 }
            goto L_0x0014
        L_0x0013:
            r1 = r0
        L_0x0014:
            a = r1
            r1 = 1
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            java.lang.String r3 = "mMainThread"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ all -> 0x0023 }
            r2.setAccessible(r1)     // Catch:{ all -> 0x0023 }
            goto L_0x0024
        L_0x0023:
            r2 = r0
        L_0x0024:
            b = r2
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            java.lang.String r3 = "mToken"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ all -> 0x0032 }
            r2.setAccessible(r1)     // Catch:{ all -> 0x0032 }
            goto L_0x0033
        L_0x0032:
            r2 = r0
        L_0x0033:
            c = r2
            java.lang.Class<?> r2 = a
            r3 = 3
            java.lang.String r4 = "performStopActivity"
            r5 = 2
            r6 = 0
            if (r2 != 0) goto L_0x0040
        L_0x003e:
            r2 = r0
            goto L_0x0055
        L_0x0040:
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ all -> 0x003e }
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch:{ all -> 0x003e }
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x003e }
            r7[r1] = r8     // Catch:{ all -> 0x003e }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r5] = r8     // Catch:{ all -> 0x003e }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r7)     // Catch:{ all -> 0x003e }
            r2.setAccessible(r1)     // Catch:{ all -> 0x003e }
        L_0x0055:
            f1266d = r2
            java.lang.Class<?> r2 = a
            if (r2 != 0) goto L_0x005d
        L_0x005b:
            r2 = r0
            goto L_0x006e
        L_0x005d:
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ all -> 0x005b }
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch:{ all -> 0x005b }
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x005b }
            r7[r1] = r8     // Catch:{ all -> 0x005b }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r7)     // Catch:{ all -> 0x005b }
            r2.setAccessible(r1)     // Catch:{ all -> 0x005b }
        L_0x006e:
            f1267e = r2
            java.lang.Class<?> r2 = a
            boolean r4 = a()
            if (r4 == 0) goto L_0x00af
            if (r2 != 0) goto L_0x007b
            goto L_0x00af
        L_0x007b:
            java.lang.String r4 = "requestRelaunchActivity"
            r7 = 9
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch:{ all -> 0x00af }
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch:{ all -> 0x00af }
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r1] = r6     // Catch:{ all -> 0x00af }
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r5] = r6     // Catch:{ all -> 0x00af }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00af }
            r7[r3] = r5     // Catch:{ all -> 0x00af }
            r3 = 4
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00af }
            r7[r3] = r5     // Catch:{ all -> 0x00af }
            r3 = 5
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r7[r3] = r6     // Catch:{ all -> 0x00af }
            r3 = 6
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r7[r3] = r6     // Catch:{ all -> 0x00af }
            r3 = 7
            r7[r3] = r5     // Catch:{ all -> 0x00af }
            r3 = 8
            r7[r3] = r5     // Catch:{ all -> 0x00af }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r7)     // Catch:{ all -> 0x00af }
            r2.setAccessible(r1)     // Catch:{ all -> 0x00af }
            r0 = r2
        L_0x00af:
            f1268f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e.b.d.<clinit>():void");
    }

    public static boolean a() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 == 26 || i2 == 27;
    }

    public static boolean b(Activity activity) {
        Object obj;
        Application application;
        c cVar;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (a() && f1268f == null) {
            return false;
        } else {
            if (f1267e == null && f1266d == null) {
                return false;
            }
            try {
                Object obj2 = c.get(activity);
                if (obj2 == null || (obj = b.get(activity)) == null) {
                    return false;
                }
                application = activity.getApplication();
                cVar = new c(activity);
                application.registerActivityLifecycleCallbacks(cVar);
                Handler handler = f1269g;
                handler.post(new a(cVar, obj2));
                if (a()) {
                    Method method = f1268f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, new Object[]{obj2, null, null, 0, bool, null, null, bool, bool});
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, cVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
