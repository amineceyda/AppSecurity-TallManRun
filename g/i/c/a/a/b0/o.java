package g.i.c.a.a.b0;

import android.content.Context;
import android.content.SharedPreferences;
import g.i.c.a.a.y.a;

public class o {
    public static volatile long a;
    public static SharedPreferences b;

    public static SharedPreferences a(Context context) {
        if (b == null) {
            b = context.getSharedPreferences("ussn_sp_profile", 0);
        }
        return b;
    }

    public static void b(Context context) {
        a.a(new b(context));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0025 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void c(long r3) {
        /*
            java.lang.Class<g.i.c.a.a.b0.o> r0 = g.i.c.a.a.b0.o.class
            monitor-enter(r0)
            android.content.Context r1 = g.i.c.a.a.b0.f.c()     // Catch:{ all -> 0x002a }
            if (r1 != 0) goto L_0x000b
            monitor-exit(r0)
            return
        L_0x000b:
            android.content.SharedPreferences r1 = a(r1)     // Catch:{ all -> 0x002a }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x002a }
            java.lang.String r2 = "dt_ussn_sp_key"
            r1.putLong(r2, r3)     // Catch:{ all -> 0x002a }
            e.e.c.b r3 = e.e.c.b.b()     // Catch:{ all -> 0x002a }
            e.e.c.b$a r3 = r3.a     // Catch:{ all -> 0x002a }
            java.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x002a }
            r1.apply()     // Catch:{ AbstractMethodError -> 0x0025 }
            goto L_0x0028
        L_0x0025:
            r1.commit()     // Catch:{ all -> 0x002a }
        L_0x0028:
            monitor-exit(r0)
            return
        L_0x002a:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.c.a.a.b0.o.c(long):void");
    }
}
