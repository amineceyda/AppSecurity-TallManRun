package g.i.a.a.f;

import android.app.Activity;
import android.app.Application;
import java.lang.ref.WeakReference;

public class b {
    public Application a = null;
    public WeakReference<Activity> b = null;
    public boolean c = false;

    public b(Application application, String str) {
        this.a = application;
        if (0 == 0) {
            this.c = true;
            application.registerActivityLifecycleCallbacks(new a(this));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a() {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.app.Application r1 = r8.a
            java.lang.String r2 = "activity"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1
            java.util.List r1 = r1.getRunningAppProcesses()
            java.util.Iterator r1 = r1.iterator()
        L_0x0017:
            boolean r2 = r1.hasNext()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0076
            java.lang.Object r2 = r1.next()
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2
            java.lang.String r5 = r2.processName
            android.app.Application r6 = r8.a
            java.lang.String r6 = r6.getPackageName()
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L_0x0034
            goto L_0x0017
        L_0x0034:
            int r5 = r2.importance
            r6 = 100
            if (r5 <= r6) goto L_0x003b
            goto L_0x006e
        L_0x003b:
            int r5 = r2.importanceReasonCode
            if (r5 == 0) goto L_0x0040
            goto L_0x006e
        L_0x0040:
            r5 = 2
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0059 }
            r7 = 21
            if (r6 > r7) goto L_0x0049
            r6 = 1
            goto L_0x004a
        L_0x0049:
            r6 = 0
        L_0x004a:
            if (r6 != 0) goto L_0x005d
            java.lang.Class<android.app.ActivityManager$RunningAppProcessInfo> r6 = android.app.ActivityManager.RunningAppProcessInfo.class
            java.lang.String r7 = "processState"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r7)     // Catch:{ Exception -> 0x0059 }
            int r6 = r6.getInt(r2)     // Catch:{ Exception -> 0x0059 }
            goto L_0x005e
        L_0x0059:
            r6 = move-exception
            g.i.a.a.m.a.b(r6)
        L_0x005d:
            r6 = 2
        L_0x005e:
            if (r6 <= r5) goto L_0x0061
            goto L_0x006e
        L_0x0061:
            java.lang.ref.WeakReference<android.app.Activity> r5 = r8.b
            if (r5 == 0) goto L_0x006c
            java.lang.Object r5 = r5.get()
            if (r5 == 0) goto L_0x006c
            goto L_0x006d
        L_0x006c:
            r3 = 0
        L_0x006d:
            r4 = r3
        L_0x006e:
            if (r4 == 0) goto L_0x0017
            java.lang.String r2 = r2.processName
            r0.add(r2)
            goto L_0x0017
        L_0x0076:
            int r0 = r0.size()
            if (r0 == 0) goto L_0x007d
            goto L_0x007e
        L_0x007d:
            r3 = 0
        L_0x007e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.a.a.f.b.a():boolean");
    }
}
