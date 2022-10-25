package g.e.b.l.j.j;

import android.content.SharedPreferences;
import g.e.a.b.g.g;
import g.e.b.h;
import g.e.b.l.j.f;

public class g0 {
    public final SharedPreferences a;
    public final h b;
    public final Object c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public g<Void> f3488d = new g<>();

    /* renamed from: e  reason: collision with root package name */
    public boolean f3489e = false;

    /* renamed from: f  reason: collision with root package name */
    public Boolean f3490f;

    /* renamed from: g  reason: collision with root package name */
    public final g<Void> f3491g = new g<>();

    /* JADX WARNING: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g0(g.e.b.h r7) {
        /*
            r6 = this;
            r6.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r6.c = r0
            g.e.a.b.g.g r0 = new g.e.a.b.g.g
            r0.<init>()
            r6.f3488d = r0
            r0 = 0
            r6.f3489e = r0
            g.e.a.b.g.g r1 = new g.e.a.b.g.g
            r1.<init>()
            r6.f3491g = r1
            r7.a()
            android.content.Context r1 = r7.a
            r6.b = r7
            android.content.SharedPreferences r7 = g.e.b.l.j.j.l.g(r1)
            r6.a = r7
            java.lang.String r2 = "firebase_crashlytics_collection_enabled"
            boolean r3 = r7.contains(r2)
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x003d
            r6.f3489e = r0
            boolean r7 = r7.getBoolean(r2, r4)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L_0x003e
        L_0x003d:
            r7 = r5
        L_0x003e:
            if (r7 != 0) goto L_0x008d
            java.lang.String r7 = "firebase_crashlytics_collection_enabled"
            android.content.pm.PackageManager r2 = r1.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0069 }
            if (r2 == 0) goto L_0x007a
            java.lang.String r1 = r1.getPackageName()     // Catch:{ NameNotFoundException -> 0x0069 }
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo(r1, r3)     // Catch:{ NameNotFoundException -> 0x0069 }
            if (r1 == 0) goto L_0x007a
            android.os.Bundle r2 = r1.metaData     // Catch:{ NameNotFoundException -> 0x0069 }
            if (r2 == 0) goto L_0x007a
            boolean r2 = r2.containsKey(r7)     // Catch:{ NameNotFoundException -> 0x0069 }
            if (r2 == 0) goto L_0x007a
            android.os.Bundle r1 = r1.metaData     // Catch:{ NameNotFoundException -> 0x0069 }
            boolean r7 = r1.getBoolean(r7)     // Catch:{ NameNotFoundException -> 0x0069 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ NameNotFoundException -> 0x0069 }
            goto L_0x007b
        L_0x0069:
            r7 = move-exception
            g.e.b.l.j.f r1 = g.e.b.l.j.f.a
            r2 = 6
            boolean r1 = r1.a(r2)
            if (r1 == 0) goto L_0x007a
            java.lang.String r1 = "FirebaseCrashlytics"
            java.lang.String r2 = "Could not read data collection permission from manifest"
            android.util.Log.e(r1, r2, r7)
        L_0x007a:
            r7 = r5
        L_0x007b:
            if (r7 != 0) goto L_0x0081
            r6.f3489e = r0
            r7 = r5
            goto L_0x008d
        L_0x0081:
            r6.f3489e = r4
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r7 = r0.equals(r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
        L_0x008d:
            r6.f3490f = r7
            java.lang.Object r7 = r6.c
            monitor-enter(r7)
            boolean r0 = r6.a()     // Catch:{ all -> 0x009f }
            if (r0 == 0) goto L_0x009d
            g.e.a.b.g.g<java.lang.Void> r0 = r6.f3488d     // Catch:{ all -> 0x009f }
            r0.b(r5)     // Catch:{ all -> 0x009f }
        L_0x009d:
            monitor-exit(r7)     // Catch:{ all -> 0x009f }
            return
        L_0x009f:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x009f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.b.l.j.j.g0.<init>(g.e.b.h):void");
    }

    public synchronized boolean a() {
        boolean booleanValue;
        Boolean bool = this.f3490f;
        booleanValue = bool != null ? bool.booleanValue() : this.b.f();
        f.a.b(String.format("Crashlytics automatic data collection %s by %s.", new Object[]{booleanValue ? "ENABLED" : "DISABLED", this.f3490f == null ? "global Firebase setting" : this.f3489e ? "firebase_crashlytics_collection_enabled manifest flag" : "API"}));
        return booleanValue;
    }
}
