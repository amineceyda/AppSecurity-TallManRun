package g.e.b.l.j.p;

import g.e.b.l.j.n.f;
import java.io.File;

public class a {
    public final File a;

    public a(f fVar) {
        this.a = fVar.a("com.crashlytics.settings.json");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003f A[Catch:{ all -> 0x0048 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject a() {
        /*
            r8 = this;
            java.lang.String r0 = "Error while closing settings cache file."
            g.e.b.l.j.f r1 = g.e.b.l.j.f.a
            java.lang.String r2 = "Checking for cached settings..."
            r1.b(r2)
            r2 = 0
            java.io.File r3 = r8.a     // Catch:{ Exception -> 0x0031, all -> 0x002f }
            boolean r4 = r3.exists()     // Catch:{ Exception -> 0x0031, all -> 0x002f }
            if (r4 == 0) goto L_0x0024
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0031, all -> 0x002f }
            r1.<init>(r3)     // Catch:{ Exception -> 0x0031, all -> 0x002f }
            java.lang.String r3 = g.e.b.l.j.j.l.m(r1)     // Catch:{ Exception -> 0x0022 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0022 }
            r4.<init>(r3)     // Catch:{ Exception -> 0x0022 }
            r2 = r1
            goto L_0x002a
        L_0x0022:
            r3 = move-exception
            goto L_0x0034
        L_0x0024:
            java.lang.String r3 = "Settings file does not exist."
            r1.e(r3)     // Catch:{ Exception -> 0x0031, all -> 0x002f }
            r4 = r2
        L_0x002a:
            g.e.b.l.j.j.l.a(r2, r0)
            r2 = r4
            goto L_0x0047
        L_0x002f:
            r1 = move-exception
            goto L_0x004c
        L_0x0031:
            r1 = move-exception
            r3 = r1
            r1 = r2
        L_0x0034:
            g.e.b.l.j.f r4 = g.e.b.l.j.f.a     // Catch:{ all -> 0x0048 }
            java.lang.String r5 = "Failed to fetch cached settings"
            r6 = 6
            boolean r4 = r4.a(r6)     // Catch:{ all -> 0x0048 }
            if (r4 == 0) goto L_0x0044
            java.lang.String r4 = "FirebaseCrashlytics"
            android.util.Log.e(r4, r5, r3)     // Catch:{ all -> 0x0048 }
        L_0x0044:
            g.e.b.l.j.j.l.a(r1, r0)
        L_0x0047:
            return r2
        L_0x0048:
            r2 = move-exception
            r7 = r2
            r2 = r1
            r1 = r7
        L_0x004c:
            g.e.b.l.j.j.l.a(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.b.l.j.p.a.a():org.json.JSONObject");
    }
}
