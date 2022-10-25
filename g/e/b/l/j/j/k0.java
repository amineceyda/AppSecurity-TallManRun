package g.e.b.l.j.j;

import android.content.Context;
import android.content.SharedPreferences;
import g.a.a.a.a;
import g.e.b.r.f;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

public class k0 implements l0 {

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f3501g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h  reason: collision with root package name */
    public static final String f3502h = Pattern.quote("/");
    public final m0 a;
    public final Context b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final f f3503d;

    /* renamed from: e  reason: collision with root package name */
    public final g0 f3504e;

    /* renamed from: f  reason: collision with root package name */
    public String f3505f;

    public k0(Context context, String str, f fVar, g0 g0Var) {
        if (str != null) {
            this.b = context;
            this.c = str;
            this.f3503d = fVar;
            this.f3504e = g0Var;
            this.a = new m0();
            return;
        }
        throw new IllegalArgumentException("appIdentifier must not be null");
    }

    public static String b() {
        StringBuilder i2 = a.i("SYN_");
        i2.append(UUID.randomUUID().toString());
        return i2.toString();
    }

    public final synchronized String a(String str, SharedPreferences sharedPreferences) {
        String lowerCase;
        String uuid = UUID.randomUUID().toString();
        lowerCase = uuid == null ? null : f3501g.matcher(uuid).replaceAll("").toLowerCase(Locale.US);
        g.e.b.l.j.f fVar = g.e.b.l.j.f.a;
        fVar.e("Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a3 A[Catch:{ Exception -> 0x0044 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String c() {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = r7.f3505f     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r7)
            return r0
        L_0x0007:
            g.e.b.l.j.f r0 = g.e.b.l.j.f.a     // Catch:{ all -> 0x00d0 }
            java.lang.String r1 = "Determining Crashlytics installation ID..."
            r0.e(r1)     // Catch:{ all -> 0x00d0 }
            android.content.Context r1 = r7.b     // Catch:{ all -> 0x00d0 }
            android.content.SharedPreferences r1 = g.e.b.l.j.j.l.g(r1)     // Catch:{ all -> 0x00d0 }
            java.lang.String r2 = "firebase.installation.id"
            r3 = 0
            java.lang.String r2 = r1.getString(r2, r3)     // Catch:{ all -> 0x00d0 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d0 }
            r4.<init>()     // Catch:{ all -> 0x00d0 }
            java.lang.String r5 = "Cached Firebase Installation ID: "
            r4.append(r5)     // Catch:{ all -> 0x00d0 }
            r4.append(r2)     // Catch:{ all -> 0x00d0 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00d0 }
            r0.e(r4)     // Catch:{ all -> 0x00d0 }
            g.e.b.l.j.j.g0 r0 = r7.f3504e     // Catch:{ all -> 0x00d0 }
            boolean r0 = r0.a()     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x0088
            g.e.b.r.f r0 = r7.f3503d     // Catch:{ all -> 0x00d0 }
            g.e.a.b.g.f r0 = r0.f()     // Catch:{ all -> 0x00d0 }
            java.lang.Object r0 = g.e.b.l.j.j.q0.a(r0)     // Catch:{ Exception -> 0x0044 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0044 }
            goto L_0x0056
        L_0x0044:
            r0 = move-exception
            g.e.b.l.j.f r4 = g.e.b.l.j.f.a     // Catch:{ all -> 0x00d0 }
            r5 = 5
            boolean r4 = r4.a(r5)     // Catch:{ all -> 0x00d0 }
            if (r4 == 0) goto L_0x0055
            java.lang.String r4 = "FirebaseCrashlytics"
            java.lang.String r5 = "Failed to retrieve Firebase Installations ID."
            android.util.Log.w(r4, r5, r0)     // Catch:{ all -> 0x00d0 }
        L_0x0055:
            r0 = r3
        L_0x0056:
            g.e.b.l.j.f r4 = g.e.b.l.j.f.a     // Catch:{ all -> 0x00d0 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d0 }
            r5.<init>()     // Catch:{ all -> 0x00d0 }
            java.lang.String r6 = "Fetched Firebase Installation ID: "
            r5.append(r6)     // Catch:{ all -> 0x00d0 }
            r5.append(r0)     // Catch:{ all -> 0x00d0 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00d0 }
            r4.e(r5)     // Catch:{ all -> 0x00d0 }
            if (r0 != 0) goto L_0x0076
            if (r2 != 0) goto L_0x0075
            java.lang.String r0 = b()     // Catch:{ all -> 0x00d0 }
            goto L_0x0076
        L_0x0075:
            r0 = r2
        L_0x0076:
            boolean r2 = r0.equals(r2)     // Catch:{ all -> 0x00d0 }
            if (r2 == 0) goto L_0x0083
            java.lang.String r0 = "crashlytics.installation.id"
        L_0x007e:
            java.lang.String r0 = r1.getString(r0, r3)     // Catch:{ all -> 0x00d0 }
            goto L_0x009f
        L_0x0083:
            java.lang.String r0 = r7.a(r0, r1)     // Catch:{ all -> 0x00d0 }
            goto L_0x009f
        L_0x0088:
            if (r2 == 0) goto L_0x0094
            java.lang.String r0 = "SYN_"
            boolean r0 = r2.startsWith(r0)     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x0094
            r0 = 1
            goto L_0x0095
        L_0x0094:
            r0 = 0
        L_0x0095:
            if (r0 == 0) goto L_0x009a
            java.lang.String r0 = "crashlytics.installation.id"
            goto L_0x007e
        L_0x009a:
            java.lang.String r0 = b()     // Catch:{ all -> 0x00d0 }
            goto L_0x0083
        L_0x009f:
            r7.f3505f = r0     // Catch:{ all -> 0x00d0 }
            if (r0 != 0) goto L_0x00b4
            g.e.b.l.j.f r0 = g.e.b.l.j.f.a     // Catch:{ all -> 0x00d0 }
            java.lang.String r2 = "Unable to determine Crashlytics Install Id, creating a new one."
            r0.f(r2)     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = b()     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = r7.a(r0, r1)     // Catch:{ all -> 0x00d0 }
            r7.f3505f = r0     // Catch:{ all -> 0x00d0 }
        L_0x00b4:
            g.e.b.l.j.f r0 = g.e.b.l.j.f.a     // Catch:{ all -> 0x00d0 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d0 }
            r1.<init>()     // Catch:{ all -> 0x00d0 }
            java.lang.String r2 = "Crashlytics installation ID: "
            r1.append(r2)     // Catch:{ all -> 0x00d0 }
            java.lang.String r2 = r7.f3505f     // Catch:{ all -> 0x00d0 }
            r1.append(r2)     // Catch:{ all -> 0x00d0 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00d0 }
            r0.e(r1)     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = r7.f3505f     // Catch:{ all -> 0x00d0 }
            monitor-exit(r7)
            return r0
        L_0x00d0:
            r0 = move-exception
            monitor-exit(r7)
            goto L_0x00d4
        L_0x00d3:
            throw r0
        L_0x00d4:
            goto L_0x00d3
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.b.l.j.j.k0.c():java.lang.String");
    }

    public String d() {
        String str;
        m0 m0Var = this.a;
        Context context = this.b;
        synchronized (m0Var) {
            if (m0Var.a == null) {
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName == null) {
                    installerPackageName = "";
                }
                m0Var.a = installerPackageName;
            }
            str = "".equals(m0Var.a) ? null : m0Var.a;
        }
        return str;
    }

    public final String e(String str) {
        return str.replaceAll(f3502h, "");
    }
}
