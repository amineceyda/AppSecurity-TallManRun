package g.e.a.b.f.b;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzp;
import g.c.b.b.f;
import g.e.a.b.b.h.c;
import g.e.a.b.b.h.e;
import g.e.a.b.e.c.mb;
import java.util.EnumMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class q6 extends w3 {
    public p6 c;

    /* renamed from: d  reason: collision with root package name */
    public t9 f3302d;

    /* renamed from: e  reason: collision with root package name */
    public final Set f3303e = new CopyOnWriteArraySet();

    /* renamed from: f  reason: collision with root package name */
    public boolean f3304f;

    /* renamed from: g  reason: collision with root package name */
    public final AtomicReference f3305g = new AtomicReference();

    /* renamed from: h  reason: collision with root package name */
    public final Object f3306h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public h f3307i = new h((Boolean) null, (Boolean) null);

    /* renamed from: j  reason: collision with root package name */
    public int f3308j = 100;

    /* renamed from: k  reason: collision with root package name */
    public final AtomicLong f3309k = new AtomicLong(0);

    /* renamed from: l  reason: collision with root package name */
    public long f3310l = -1;

    /* renamed from: m  reason: collision with root package name */
    public int f3311m = 100;
    public final w9 n;
    public boolean o = true;
    public final p9 p = new f6(this);

    public q6(n4 n4Var) {
        super(n4Var);
        this.n = new w9(n4Var);
    }

    public static void G(q6 q6Var, h hVar, int i2, long j2, boolean z, boolean z2) {
        q6Var.h();
        q6Var.i();
        if (j2 > q6Var.f3310l || !h.f(q6Var.f3311m, i2)) {
            s3 t = q6Var.a.t();
            n4 n4Var = t.a;
            t.h();
            if (t.u(i2)) {
                SharedPreferences.Editor edit = t.o().edit();
                edit.putString("consent_settings", hVar.d());
                edit.putInt("consent_source", i2);
                edit.apply();
                q6Var.f3310l = j2;
                q6Var.f3311m = i2;
                f8 y = q6Var.a.y();
                y.h();
                y.i();
                if (z) {
                    y.u();
                    y.a.r().m();
                }
                if (y.o()) {
                    y.t(new s7(y, y.q(false)));
                }
                if (z2) {
                    q6Var.a.y().y(new AtomicReference());
                    return;
                }
                return;
            }
            q6Var.a.d().f3142l.b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i2));
            return;
        }
        q6Var.a.d().f3142l.b("Dropped out-of-date consent setting, proposed settings", hVar);
    }

    public final void A(String str, String str2, Object obj, boolean z, long j2) {
        int i2;
        String str3 = str2;
        Object obj2 = obj;
        String str4 = str == null ? "app" : str;
        if (z) {
            i2 = this.a.A().k0(str3);
        } else {
            q9 A = this.a.A();
            if (A.P("user property", str3)) {
                if (!A.L("user property", m5.a, (String[]) null, str3)) {
                    i2 = 15;
                } else {
                    f fVar = A.a.f3258g;
                    if (A.K("user property", 24, str3)) {
                        i2 = 0;
                    }
                }
            }
            i2 = 6;
        }
        if (i2 != 0) {
            q9 A2 = this.a.A();
            f fVar2 = this.a.f3258g;
            this.a.A().z(this.p, (String) null, i2, "_ev", A2.q(str3, 24, true), str3 != null ? str2.length() : 0);
        } else if (obj2 != null) {
            int g0 = this.a.A().g0(str3, obj2);
            if (g0 != 0) {
                q9 A3 = this.a.A();
                f fVar3 = this.a.f3258g;
                this.a.A().z(this.p, (String) null, g0, "_ev", A3.q(str3, 24, true), ((obj2 instanceof String) || (obj2 instanceof CharSequence)) ? obj.toString().length() : 0);
                return;
            }
            Object p2 = this.a.A().p(str3, obj2);
            if (p2 != null) {
                t(str4, str2, j2, p2);
            }
        } else {
            t(str4, str2, j2, (Object) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B(java.lang.String r10, java.lang.String r11, java.lang.Object r12, long r13) {
        /*
            r9 = this;
            g.c.b.b.f.k(r10)
            g.c.b.b.f.k(r11)
            r9.h()
            r9.i()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r11)
            r1 = 1
            java.lang.String r2 = "_npa"
            if (r0 == 0) goto L_0x0065
            boolean r0 = r12 instanceof java.lang.String
            if (r0 == 0) goto L_0x0053
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x0053
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            java.lang.String r12 = "false"
            boolean r11 = r12.equals(r11)
            r3 = 1
            if (r1 == r11) goto L_0x0037
            r5 = 0
            goto L_0x0038
        L_0x0037:
            r5 = r3
        L_0x0038:
            java.lang.Long r11 = java.lang.Long.valueOf(r5)
            g.e.a.b.f.b.n4 r0 = r9.a
            g.e.a.b.f.b.s3 r0 = r0.t()
            g.e.a.b.f.b.r3 r0 = r0.f3346m
            long r5 = r11.longValue()
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x004e
            java.lang.String r12 = "true"
        L_0x004e:
            r0.b(r12)
            r7 = r11
            goto L_0x0063
        L_0x0053:
            if (r12 != 0) goto L_0x0065
            g.e.a.b.f.b.n4 r11 = r9.a
            g.e.a.b.f.b.s3 r11 = r11.t()
            g.e.a.b.f.b.r3 r11 = r11.f3346m
            java.lang.String r0 = "unset"
            r11.b(r0)
            r7 = r12
        L_0x0063:
            r4 = r2
            goto L_0x0067
        L_0x0065:
            r4 = r11
            r7 = r12
        L_0x0067:
            g.e.a.b.f.b.n4 r11 = r9.a
            boolean r11 = r11.g()
            if (r11 != 0) goto L_0x007d
            g.e.a.b.f.b.n4 r10 = r9.a
            g.e.a.b.f.b.f3 r10 = r10.d()
            g.e.a.b.f.b.d3 r10 = r10.n
            java.lang.String r11 = "User property not set since app measurement is disabled"
            r10.a(r11)
            return
        L_0x007d:
            g.e.a.b.f.b.n4 r11 = r9.a
            boolean r11 = r11.i()
            if (r11 != 0) goto L_0x0086
            return
        L_0x0086:
            com.google.android.gms.measurement.internal.zzks r11 = new com.google.android.gms.measurement.internal.zzks
            r3 = r11
            r5 = r13
            r8 = r10
            r3.<init>(r4, r5, r7, r8)
            g.e.a.b.f.b.n4 r10 = r9.a
            g.e.a.b.f.b.f8 r10 = r10.y()
            r10.h()
            r10.i()
            r10.u()
            g.e.a.b.f.b.n4 r12 = r10.a
            g.e.a.b.f.b.z2 r12 = r12.r()
            java.util.Objects.requireNonNull(r12)
            android.os.Parcel r13 = android.os.Parcel.obtain()
            r14 = 0
            g.e.a.b.f.b.n9.a(r11, r13, r14)
            byte[] r0 = r13.marshall()
            r13.recycle()
            int r13 = r0.length
            r2 = 131072(0x20000, float:1.83671E-40)
            if (r13 <= r2) goto L_0x00c8
            g.e.a.b.f.b.n4 r12 = r12.a
            g.e.a.b.f.b.f3 r12 = r12.d()
            g.e.a.b.f.b.d3 r12 = r12.f3137g
            java.lang.String r13 = "User property too long for local database. Sending directly to service"
            r12.a(r13)
            goto L_0x00cc
        L_0x00c8:
            boolean r14 = r12.o(r1, r0)
        L_0x00cc:
            com.google.android.gms.measurement.internal.zzp r12 = r10.q(r1)
            g.e.a.b.f.b.h7 r13 = new g.e.a.b.f.b.h7
            r13.<init>(r10, r12, r14, r11)
            r10.t(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.q6.B(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void C(Bundle bundle, long j2) {
        if (TextUtils.isEmpty(this.a.q().n())) {
            v(bundle, 0, j2);
        } else {
            this.a.d().f3141k.a("Using developer consent only; google app id found");
        }
    }

    public final void D(Boolean bool, boolean z) {
        h();
        i();
        this.a.d().f3143m.b("Setting app measurement enabled (FE)", bool);
        this.a.t().r(bool);
        if (z) {
            s3 t = this.a.t();
            n4 n4Var = t.a;
            t.h();
            SharedPreferences.Editor edit = t.o().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        n4 n4Var2 = this.a;
        n4Var2.b().h();
        if (n4Var2.D || (bool != null && !bool.booleanValue())) {
            E();
        }
    }

    public final void E() {
        h();
        String a = this.a.t().f3346m.a();
        if (a != null) {
            if ("unset".equals(a)) {
                Objects.requireNonNull((c) this.a.n);
                B("app", "_npa", (Object) null, System.currentTimeMillis());
            } else {
                Long valueOf = Long.valueOf(true != "true".equals(a) ? 0 : 1);
                Objects.requireNonNull((c) this.a.n);
                B("app", "_npa", valueOf, System.currentTimeMillis());
            }
        }
        if (!this.a.g() || !this.o) {
            this.a.d().f3143m.a("Updating Scion state (FE)");
            f8 y = this.a.y();
            y.h();
            y.i();
            y.t(new r7(y, y.q(true)));
            return;
        }
        this.a.d().f3143m.a("Recording app launch after enabling measurement for the first time (FE)");
        H();
        mb.b();
        if (this.a.f3258g.u((String) null, s2.e0)) {
            this.a.z().f3390d.a();
        }
        this.a.b().r(new u5(this));
    }

    public final String F() {
        return (String) this.f3305g.get();
    }

    public final void H() {
        h();
        i();
        if (this.a.i()) {
            if (this.a.f3258g.u((String) null, s2.Y)) {
                f fVar = this.a.f3258g;
                b bVar = fVar.a.f3257f;
                Boolean s = fVar.s("google_analytics_deferred_deep_link_enabled");
                if (s != null && s.booleanValue()) {
                    this.a.d().f3143m.a("Deferred Deep Link feature enabled.");
                    this.a.b().r(new q5(this));
                }
            }
            f8 y = this.a.y();
            y.h();
            y.i();
            zzp q = y.q(true);
            y.a.r().o(3, new byte[0]);
            y.t(new l7(y, q));
            this.o = false;
            s3 t = this.a.t();
            t.h();
            String string = t.o().getString("previous_os_version", (String) null);
            t.a.p().k();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = t.o().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                this.a.p().k();
                if (!string.equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    o("auto", "_ou", bundle);
                }
            }
        }
    }

    public final void I(String str, String str2, Bundle bundle) {
        Objects.requireNonNull((c) this.a.n);
        long currentTimeMillis = System.currentTimeMillis();
        f.k(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        this.a.b().r(new b6(this, bundle2));
    }

    public final boolean k() {
        return false;
    }

    public final void l() {
        if ((this.a.a.getApplicationContext() instanceof Application) && this.c != null) {
            ((Application) this.a.a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.c);
        }
    }

    public final void m(String str, String str2, Bundle bundle) {
        Objects.requireNonNull((c) this.a.n);
        n(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        if (r3 > 100) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0082, code lost:
        if (r6 > 100) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00da, code lost:
        r2 = r1.a.d().n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e2, code lost:
        if (r13 != null) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e4, code lost:
        r3 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e7, code lost:
        r3 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e8, code lost:
        if (r14 != null) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ea, code lost:
        r4 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ed, code lost:
        r4 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ee, code lost:
        r2.c("Logging screen view with name, class", r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f5, code lost:
        if (r1.c != null) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f7, code lost:
        r2 = r1.f3147d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fa, code lost:
        r2 = r1.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00fc, code lost:
        r12 = new g.e.a.b.f.b.y6(r13, r14, r1.a.A().n0(), true, r26);
        r1.c = r12;
        r1.f3147d = r2;
        r1.f3152i = r12;
        java.util.Objects.requireNonNull((g.e.a.b.b.h.c) r1.a.n);
        r1.a.b().r(new g.e.a.b.f.b.z6(r1, r0, r12, r2, android.os.SystemClock.elapsedRealtime()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n(java.lang.String r21, java.lang.String r22, android.os.Bundle r23, boolean r24, boolean r25, long r26) {
        /*
            r20 = this;
            r11 = r20
            if (r21 != 0) goto L_0x0008
            java.lang.String r0 = "app"
            r2 = r0
            goto L_0x000a
        L_0x0008:
            r2 = r21
        L_0x000a:
            if (r23 != 0) goto L_0x0012
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            goto L_0x0014
        L_0x0012:
            r0 = r23
        L_0x0014:
            java.lang.String r1 = "screen_view"
            r3 = r22
            boolean r1 = g.e.a.b.f.b.q9.Y(r3, r1)
            r4 = 0
            if (r1 == 0) goto L_0x0141
            g.e.a.b.f.b.n4 r1 = r11.a
            g.e.a.b.f.b.f7 r1 = r1.x()
            java.lang.Object r5 = r1.f3155l
            monitor-enter(r5)
            boolean r2 = r1.f3154k     // Catch:{ all -> 0x013e }
            if (r2 != 0) goto L_0x003c
            g.e.a.b.f.b.n4 r0 = r1.a     // Catch:{ all -> 0x013e }
            g.e.a.b.f.b.f3 r0 = r0.d()     // Catch:{ all -> 0x013e }
            g.e.a.b.f.b.d3 r0 = r0.f3141k     // Catch:{ all -> 0x013e }
            java.lang.String r1 = "Cannot log screen view event when the app is in the background."
            r0.a(r1)     // Catch:{ all -> 0x013e }
        L_0x0039:
            monitor-exit(r5)     // Catch:{ all -> 0x013e }
            goto L_0x013d
        L_0x003c:
            java.lang.String r2 = "screen_name"
            java.lang.String r13 = r0.getString(r2)     // Catch:{ all -> 0x013e }
            r2 = 100
            if (r13 == 0) goto L_0x006c
            int r3 = r13.length()     // Catch:{ all -> 0x013e }
            if (r3 <= 0) goto L_0x0056
            int r3 = r13.length()     // Catch:{ all -> 0x013e }
            g.e.a.b.f.b.n4 r6 = r1.a     // Catch:{ all -> 0x013e }
            g.e.a.b.f.b.f r6 = r6.f3258g     // Catch:{ all -> 0x013e }
            if (r3 <= r2) goto L_0x006c
        L_0x0056:
            g.e.a.b.f.b.n4 r0 = r1.a     // Catch:{ all -> 0x013e }
            g.e.a.b.f.b.f3 r0 = r0.d()     // Catch:{ all -> 0x013e }
            g.e.a.b.f.b.d3 r0 = r0.f3141k     // Catch:{ all -> 0x013e }
            java.lang.String r1 = "Invalid screen name length for screen view. Length"
            int r2 = r13.length()     // Catch:{ all -> 0x013e }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x013e }
            r0.b(r1, r2)     // Catch:{ all -> 0x013e }
            goto L_0x0039
        L_0x006c:
            java.lang.String r3 = "screen_class"
            java.lang.String r3 = r0.getString(r3)     // Catch:{ all -> 0x013e }
            if (r3 == 0) goto L_0x009a
            int r6 = r3.length()     // Catch:{ all -> 0x013e }
            if (r6 <= 0) goto L_0x0084
            int r6 = r3.length()     // Catch:{ all -> 0x013e }
            g.e.a.b.f.b.n4 r7 = r1.a     // Catch:{ all -> 0x013e }
            g.e.a.b.f.b.f r7 = r7.f3258g     // Catch:{ all -> 0x013e }
            if (r6 <= r2) goto L_0x009a
        L_0x0084:
            g.e.a.b.f.b.n4 r0 = r1.a     // Catch:{ all -> 0x013e }
            g.e.a.b.f.b.f3 r0 = r0.d()     // Catch:{ all -> 0x013e }
            g.e.a.b.f.b.d3 r0 = r0.f3141k     // Catch:{ all -> 0x013e }
            java.lang.String r1 = "Invalid screen class length for screen view. Length"
            int r2 = r3.length()     // Catch:{ all -> 0x013e }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x013e }
            r0.b(r1, r2)     // Catch:{ all -> 0x013e }
            goto L_0x0039
        L_0x009a:
            if (r3 != 0) goto L_0x00af
            android.app.Activity r2 = r1.f3150g     // Catch:{ all -> 0x013e }
            if (r2 == 0) goto L_0x00ab
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x013e }
            java.lang.String r3 = "Activity"
            java.lang.String r2 = r1.p(r2, r3)     // Catch:{ all -> 0x013e }
            goto L_0x00ad
        L_0x00ab:
            java.lang.String r2 = "Activity"
        L_0x00ad:
            r14 = r2
            goto L_0x00b0
        L_0x00af:
            r14 = r3
        L_0x00b0:
            g.e.a.b.f.b.y6 r2 = r1.c     // Catch:{ all -> 0x013e }
            boolean r3 = r1.f3151h     // Catch:{ all -> 0x013e }
            if (r3 == 0) goto L_0x00d9
            if (r2 == 0) goto L_0x00d9
            r1.f3151h = r4     // Catch:{ all -> 0x013e }
            java.lang.String r3 = r2.b     // Catch:{ all -> 0x013e }
            boolean r3 = g.e.a.b.f.b.q9.Y(r3, r14)     // Catch:{ all -> 0x013e }
            java.lang.String r2 = r2.a     // Catch:{ all -> 0x013e }
            boolean r2 = g.e.a.b.f.b.q9.Y(r2, r13)     // Catch:{ all -> 0x013e }
            if (r3 == 0) goto L_0x00d9
            if (r2 == 0) goto L_0x00d9
            g.e.a.b.f.b.n4 r0 = r1.a     // Catch:{ all -> 0x013e }
            g.e.a.b.f.b.f3 r0 = r0.d()     // Catch:{ all -> 0x013e }
            g.e.a.b.f.b.d3 r0 = r0.f3141k     // Catch:{ all -> 0x013e }
            java.lang.String r1 = "Ignoring call to log screen view event with duplicate parameters."
            r0.a(r1)     // Catch:{ all -> 0x013e }
            goto L_0x0039
        L_0x00d9:
            monitor-exit(r5)     // Catch:{ all -> 0x013e }
            g.e.a.b.f.b.n4 r2 = r1.a
            g.e.a.b.f.b.f3 r2 = r2.d()
            g.e.a.b.f.b.d3 r2 = r2.n
            if (r13 != 0) goto L_0x00e7
            java.lang.String r3 = "null"
            goto L_0x00e8
        L_0x00e7:
            r3 = r13
        L_0x00e8:
            if (r14 != 0) goto L_0x00ed
            java.lang.String r4 = "null"
            goto L_0x00ee
        L_0x00ed:
            r4 = r14
        L_0x00ee:
            java.lang.String r5 = "Logging screen view with name, class"
            r2.c(r5, r3, r4)
            g.e.a.b.f.b.y6 r2 = r1.c
            if (r2 != 0) goto L_0x00fa
            g.e.a.b.f.b.y6 r2 = r1.f3147d
            goto L_0x00fc
        L_0x00fa:
            g.e.a.b.f.b.y6 r2 = r1.c
        L_0x00fc:
            g.e.a.b.f.b.y6 r3 = new g.e.a.b.f.b.y6
            g.e.a.b.f.b.n4 r4 = r1.a
            g.e.a.b.f.b.q9 r4 = r4.A()
            long r15 = r4.n0()
            r17 = 1
            r12 = r3
            r18 = r26
            r12.<init>(r13, r14, r15, r17, r18)
            r1.c = r3
            r1.f3147d = r2
            r1.f3152i = r3
            g.e.a.b.f.b.n4 r4 = r1.a
            g.e.a.b.b.h.b r4 = r4.n
            g.e.a.b.b.h.c r4 = (g.e.a.b.b.h.c) r4
            java.util.Objects.requireNonNull(r4)
            long r4 = android.os.SystemClock.elapsedRealtime()
            g.e.a.b.f.b.n4 r6 = r1.a
            g.e.a.b.f.b.k4 r6 = r6.b()
            g.e.a.b.f.b.z6 r7 = new g.e.a.b.f.b.z6
            r21 = r7
            r22 = r1
            r23 = r0
            r24 = r3
            r25 = r2
            r26 = r4
            r21.<init>(r22, r23, r24, r25, r26)
            r6.r(r7)
        L_0x013d:
            return
        L_0x013e:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x013e }
            throw r0
        L_0x0141:
            r1 = 1
            if (r25 == 0) goto L_0x0151
            g.e.a.b.f.b.t9 r5 = r11.f3302d
            if (r5 == 0) goto L_0x0151
            boolean r5 = g.e.a.b.f.b.q9.U(r22)
            if (r5 == 0) goto L_0x014f
            goto L_0x0151
        L_0x014f:
            r8 = 0
            goto L_0x0152
        L_0x0151:
            r8 = 1
        L_0x0152:
            r10 = 0
            r1 = r20
            r3 = r22
            r4 = r26
            r6 = r0
            r7 = r25
            r9 = r24
            r1.s(r2, r3, r4, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.q6.n(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long):void");
    }

    public final void o(String str, String str2, Bundle bundle) {
        h();
        Objects.requireNonNull((c) this.a.n);
        p(str, str2, System.currentTimeMillis(), bundle);
    }

    public final void p(String str, String str2, long j2, Bundle bundle) {
        h();
        q(str, str2, j2, bundle, true, this.f3302d == null || q9.U(str2), true, (String) null);
    }

    /* JADX WARNING: type inference failed for: r14v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r14v18 */
    /* JADX WARNING: type inference failed for: r14v19 */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0198, code lost:
        if (r32 == false) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01b3, code lost:
        if (r32 == false) goto L_0x01b5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0224  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(java.lang.String r25, java.lang.String r26, long r27, android.os.Bundle r29, boolean r30, boolean r31, boolean r32, java.lang.String r33) {
        /*
            r24 = this;
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r12 = r29
            java.lang.String r0 = "com.google.android.gms.tagmanager.TagManagerService"
            g.c.b.b.f.k(r25)
            java.lang.String r13 = "null reference"
            java.util.Objects.requireNonNull(r12, r13)
            r24.h()
            r24.i()
            g.e.a.b.f.b.n4 r1 = r7.a
            boolean r1 = r1.g()
            if (r1 == 0) goto L_0x055f
            g.e.a.b.f.b.n4 r1 = r7.a
            g.e.a.b.f.b.w2 r1 = r1.q()
            java.util.List r1 = r1.f3373i
            if (r1 == 0) goto L_0x0041
            boolean r1 = r1.contains(r9)
            if (r1 == 0) goto L_0x0033
            goto L_0x0041
        L_0x0033:
            g.e.a.b.f.b.n4 r0 = r7.a
            g.e.a.b.f.b.f3 r0 = r0.d()
            g.e.a.b.f.b.d3 r0 = r0.f3143m
            java.lang.String r1 = "Dropping non-safelisted event. event name, origin"
            r0.c(r1, r9, r8)
            return
        L_0x0041:
            boolean r1 = r7.f3304f
            r14 = 0
            r15 = 1
            r5 = 0
            if (r1 != 0) goto L_0x0093
            r7.f3304f = r15
            g.e.a.b.f.b.n4 r1 = r7.a     // Catch:{ ClassNotFoundException -> 0x0086 }
            boolean r2 = r1.f3256e     // Catch:{ ClassNotFoundException -> 0x0086 }
            if (r2 != 0) goto L_0x005b
            android.content.Context r1 = r1.a     // Catch:{ ClassNotFoundException -> 0x0086 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0086 }
            java.lang.Class r0 = java.lang.Class.forName(r0, r15, r1)     // Catch:{ ClassNotFoundException -> 0x0086 }
            goto L_0x005f
        L_0x005b:
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0086 }
        L_0x005f:
            java.lang.Class[] r1 = new java.lang.Class[r15]     // Catch:{ Exception -> 0x0077 }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r5] = r2     // Catch:{ Exception -> 0x0077 }
            java.lang.String r2 = "initialize"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r1)     // Catch:{ Exception -> 0x0077 }
            java.lang.Object[] r1 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x0077 }
            g.e.a.b.f.b.n4 r2 = r7.a     // Catch:{ Exception -> 0x0077 }
            android.content.Context r2 = r2.a     // Catch:{ Exception -> 0x0077 }
            r1[r5] = r2     // Catch:{ Exception -> 0x0077 }
            r0.invoke(r14, r1)     // Catch:{ Exception -> 0x0077 }
            goto L_0x0093
        L_0x0077:
            r0 = move-exception
            g.e.a.b.f.b.n4 r1 = r7.a     // Catch:{ ClassNotFoundException -> 0x0086 }
            g.e.a.b.f.b.f3 r1 = r1.d()     // Catch:{ ClassNotFoundException -> 0x0086 }
            g.e.a.b.f.b.d3 r1 = r1.f3139i     // Catch:{ ClassNotFoundException -> 0x0086 }
            java.lang.String r2 = "Failed to invoke Tag Manager's initialize() method"
            r1.b(r2, r0)     // Catch:{ ClassNotFoundException -> 0x0086 }
            goto L_0x0093
        L_0x0086:
            g.e.a.b.f.b.n4 r0 = r7.a
            g.e.a.b.f.b.f3 r0 = r0.d()
            g.e.a.b.f.b.d3 r0 = r0.f3142l
            java.lang.String r1 = "Tag Manager is not found and thus will not be used"
            r0.a(r1)
        L_0x0093:
            java.lang.String r0 = "_cmp"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00c5
            java.lang.String r0 = "gclid"
            boolean r1 = r12.containsKey(r0)
            if (r1 == 0) goto L_0x00c5
            g.e.a.b.f.b.n4 r1 = r7.a
            g.e.a.b.f.b.b r1 = r1.f3257f
            java.lang.String r4 = r12.getString(r0)
            g.e.a.b.f.b.n4 r0 = r7.a
            g.e.a.b.b.h.b r0 = r0.n
            g.e.a.b.b.h.c r0 = (g.e.a.b.b.h.c) r0
            java.util.Objects.requireNonNull(r0)
            long r16 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_lgclid"
            r1 = r24
            r14 = 0
            r5 = r16
            r1.B(r2, r3, r4, r5)
            goto L_0x00c6
        L_0x00c5:
            r14 = 0
        L_0x00c6:
            g.e.a.b.f.b.n4 r0 = r7.a
            g.e.a.b.f.b.b r0 = r0.f3257f
            if (r30 == 0) goto L_0x00ec
            java.lang.String[] r0 = g.e.a.b.f.b.q9.f3315h
            r0 = r0[r14]
            boolean r0 = r0.equals(r9)
            r0 = r0 ^ r15
            if (r0 == 0) goto L_0x00ec
            g.e.a.b.f.b.n4 r0 = r7.a
            g.e.a.b.f.b.q9 r0 = r0.A()
            g.e.a.b.f.b.n4 r1 = r7.a
            g.e.a.b.f.b.s3 r1 = r1.t()
            g.e.a.b.f.b.o3 r1 = r1.w
            android.os.Bundle r1 = r1.a()
            r0.x(r12, r1)
        L_0x00ec:
            r0 = 40
            if (r32 != 0) goto L_0x016e
            g.e.a.b.f.b.n4 r1 = r7.a
            g.e.a.b.f.b.b r1 = r1.f3257f
            java.lang.String r1 = "_iap"
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x016e
            g.e.a.b.f.b.n4 r1 = r7.a
            g.e.a.b.f.b.q9 r1 = r1.A()
            java.lang.String r2 = "event"
            boolean r3 = r1.P(r2, r9)
            r5 = 2
            if (r3 != 0) goto L_0x010c
            goto L_0x0125
        L_0x010c:
            java.lang.String[] r3 = g.e.a.b.f.b.k5.a
            java.lang.String[] r4 = g.e.a.b.f.b.k5.b
            boolean r3 = r1.L(r2, r3, r4, r9)
            if (r3 != 0) goto L_0x0119
            r5 = 13
            goto L_0x0125
        L_0x0119:
            g.e.a.b.f.b.n4 r3 = r1.a
            g.e.a.b.f.b.f r3 = r3.f3258g
            boolean r1 = r1.K(r2, r0, r9)
            if (r1 != 0) goto L_0x0124
            goto L_0x0125
        L_0x0124:
            r5 = 0
        L_0x0125:
            if (r5 == 0) goto L_0x016e
            g.e.a.b.f.b.n4 r1 = r7.a
            g.e.a.b.f.b.f3 r1 = r1.d()
            g.e.a.b.f.b.d3 r1 = r1.f3138h
            g.e.a.b.f.b.n4 r2 = r7.a
            g.e.a.b.f.b.a3 r2 = r2.f3264m
            java.lang.String r2 = r2.d(r9)
            java.lang.String r3 = "Invalid public event name. Event will not be logged (FE)"
            r1.b(r3, r2)
            g.e.a.b.f.b.n4 r1 = r7.a
            g.e.a.b.f.b.q9 r1 = r1.A()
            g.e.a.b.f.b.n4 r2 = r7.a
            g.e.a.b.f.b.f r2 = r2.f3258g
            java.lang.String r0 = r1.q(r9, r0, r15)
            if (r9 == 0) goto L_0x0151
            int r1 = r26.length()
            r14 = r1
        L_0x0151:
            g.e.a.b.f.b.n4 r1 = r7.a
            g.e.a.b.f.b.q9 r1 = r1.A()
            g.e.a.b.f.b.p9 r2 = r7.p
            r3 = 0
            java.lang.String r4 = "_ev"
            r25 = r1
            r26 = r2
            r27 = r3
            r28 = r5
            r29 = r4
            r30 = r0
            r31 = r14
            r25.z(r26, r27, r28, r29, r30, r31)
            return
        L_0x016e:
            g.e.a.b.e.c.lc.b()
            g.e.a.b.f.b.n4 r1 = r7.a
            g.e.a.b.f.b.f r1 = r1.f3258g
            g.e.a.b.f.b.r2 r2 = g.e.a.b.f.b.s2.r0
            r3 = 0
            boolean r1 = r1.u(r3, r2)
            java.lang.String r2 = "_sc"
            if (r1 == 0) goto L_0x019b
            g.e.a.b.f.b.n4 r1 = r7.a
            g.e.a.b.f.b.b r3 = r1.f3257f
            g.e.a.b.f.b.f7 r1 = r1.x()
            g.e.a.b.f.b.y6 r1 = r1.o(r14)
            if (r1 == 0) goto L_0x0196
            boolean r3 = r12.containsKey(r2)
            if (r3 != 0) goto L_0x0196
            r1.f3412d = r15
        L_0x0196:
            if (r30 == 0) goto L_0x01b7
            if (r32 != 0) goto L_0x01b7
            goto L_0x01b5
        L_0x019b:
            g.e.a.b.f.b.n4 r1 = r7.a
            g.e.a.b.f.b.b r3 = r1.f3257f
            g.e.a.b.f.b.f7 r1 = r1.x()
            g.e.a.b.f.b.y6 r1 = r1.o(r14)
            if (r1 == 0) goto L_0x01b1
            boolean r3 = r12.containsKey(r2)
            if (r3 != 0) goto L_0x01b1
            r1.f3412d = r15
        L_0x01b1:
            if (r30 == 0) goto L_0x01b7
            if (r32 != 0) goto L_0x01b7
        L_0x01b5:
            r5 = 1
            goto L_0x01b8
        L_0x01b7:
            r5 = 0
        L_0x01b8:
            g.e.a.b.f.b.q9.w(r1, r12, r5)
            java.lang.String r1 = "am"
            boolean r1 = r1.equals(r8)
            boolean r3 = g.e.a.b.f.b.q9.U(r26)
            if (r30 == 0) goto L_0x021a
            g.e.a.b.f.b.t9 r4 = r7.f3302d
            if (r4 == 0) goto L_0x021a
            if (r3 != 0) goto L_0x021a
            if (r1 == 0) goto L_0x01d2
            r16 = 1
            goto L_0x021c
        L_0x01d2:
            g.e.a.b.f.b.n4 r0 = r7.a
            g.e.a.b.f.b.f3 r0 = r0.d()
            g.e.a.b.f.b.d3 r0 = r0.f3143m
            g.e.a.b.f.b.n4 r1 = r7.a
            g.e.a.b.f.b.a3 r1 = r1.f3264m
            java.lang.String r1 = r1.d(r9)
            g.e.a.b.f.b.n4 r2 = r7.a
            g.e.a.b.f.b.a3 r2 = r2.f3264m
            java.lang.String r2 = r2.b(r12)
            java.lang.String r3 = "Passing event to registered event handler (FE)"
            r0.c(r3, r1, r2)
            g.e.a.b.f.b.t9 r0 = r7.f3302d
            java.util.Objects.requireNonNull(r0, r13)
            g.e.a.b.f.b.t9 r13 = r7.f3302d
            java.util.Objects.requireNonNull(r13)
            g.e.a.b.e.c.f1 r1 = r13.a     // Catch:{ RemoteException -> 0x0207 }
            r2 = r25
            r3 = r26
            r4 = r29
            r5 = r27
            r1.d(r2, r3, r4, r5)     // Catch:{ RemoteException -> 0x0207 }
            goto L_0x0219
        L_0x0207:
            r0 = move-exception
            com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r1 = r13.b
            g.e.a.b.f.b.n4 r1 = r1.a
            if (r1 == 0) goto L_0x0219
            g.e.a.b.f.b.f3 r1 = r1.d()
            g.e.a.b.f.b.d3 r1 = r1.f3139i
            java.lang.String r2 = "Event interceptor threw exception"
            r1.b(r2, r0)
        L_0x0219:
            return
        L_0x021a:
            r16 = r1
        L_0x021c:
            g.e.a.b.f.b.n4 r1 = r7.a
            boolean r1 = r1.i()
            if (r1 == 0) goto L_0x055e
            g.e.a.b.f.b.n4 r1 = r7.a
            g.e.a.b.f.b.q9 r1 = r1.A()
            int r1 = r1.h0(r9)
            if (r1 == 0) goto L_0x0276
            g.e.a.b.f.b.n4 r2 = r7.a
            g.e.a.b.f.b.f3 r2 = r2.d()
            g.e.a.b.f.b.d3 r2 = r2.f3138h
            g.e.a.b.f.b.n4 r3 = r7.a
            g.e.a.b.f.b.a3 r3 = r3.f3264m
            java.lang.String r3 = r3.d(r9)
            java.lang.String r4 = "Invalid event name. Event will not be logged (FE)"
            r2.b(r4, r3)
            g.e.a.b.f.b.n4 r2 = r7.a
            g.e.a.b.f.b.q9 r2 = r2.A()
            g.e.a.b.f.b.n4 r3 = r7.a
            g.e.a.b.f.b.f r3 = r3.f3258g
            java.lang.String r0 = r2.q(r9, r0, r15)
            if (r9 == 0) goto L_0x025a
            int r5 = r26.length()
            r14 = r5
        L_0x025a:
            g.e.a.b.f.b.n4 r2 = r7.a
            g.e.a.b.f.b.q9 r2 = r2.A()
            g.e.a.b.f.b.p9 r3 = r7.p
            java.lang.String r4 = "_ev"
            r25 = r2
            r26 = r3
            r27 = r33
            r28 = r1
            r29 = r4
            r30 = r0
            r31 = r14
            r25.z(r26, r27, r28, r29, r30, r31)
            return
        L_0x0276:
            java.lang.String r0 = "_o"
            java.lang.String r1 = "_sn"
            java.lang.String r3 = "_si"
            java.lang.String[] r1 = new java.lang.String[]{r0, r1, r2, r3}
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.util.List r5 = java.util.Collections.unmodifiableList(r1)
            g.e.a.b.f.b.n4 r1 = r7.a
            g.e.a.b.f.b.q9 r1 = r1.A()
            r2 = r33
            r3 = r26
            r4 = r29
            r6 = r32
            android.os.Bundle r12 = r1.r0(r2, r3, r4, r5, r6)
            java.util.Objects.requireNonNull(r12, r13)
            g.e.a.b.f.b.n4 r1 = r7.a
            g.e.a.b.f.b.b r2 = r1.f3257f
            g.e.a.b.f.b.f7 r1 = r1.x()
            g.e.a.b.f.b.y6 r1 = r1.o(r14)
            r5 = 0
            java.lang.String r13 = "_ae"
            if (r1 == 0) goto L_0x02df
            boolean r1 = r13.equals(r9)
            if (r1 == 0) goto L_0x02df
            g.e.a.b.f.b.n4 r1 = r7.a
            g.e.a.b.f.b.w8 r1 = r1.z()
            g.e.a.b.f.b.t8 r1 = r1.f3391e
            g.e.a.b.f.b.w8 r2 = r1.f3359d
            g.e.a.b.f.b.n4 r2 = r2.a
            g.e.a.b.b.h.b r2 = r2.n
            g.e.a.b.b.h.c r2 = (g.e.a.b.b.h.c) r2
            java.util.Objects.requireNonNull(r2)
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r14 = r1.b
            long r14 = r2 - r14
            r1.b = r2
            int r1 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x02df
            g.e.a.b.f.b.n4 r1 = r7.a
            g.e.a.b.f.b.q9 r1 = r1.A()
            r1.u(r12, r14)
        L_0x02df:
            g.e.a.b.e.c.db.b()
            g.e.a.b.f.b.n4 r1 = r7.a
            g.e.a.b.f.b.f r1 = r1.f3258g
            g.e.a.b.f.b.r2 r2 = g.e.a.b.f.b.s2.d0
            r14 = 0
            boolean r1 = r1.u(r14, r2)
            if (r1 == 0) goto L_0x0366
            java.lang.String r1 = "auto"
            boolean r1 = r1.equals(r8)
            java.lang.String r2 = "_ffr"
            if (r1 != 0) goto L_0x0345
            java.lang.String r1 = "_ssr"
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x0345
            g.e.a.b.f.b.n4 r1 = r7.a
            g.e.a.b.f.b.q9 r1 = r1.A()
            java.lang.String r3 = r12.getString(r2)
            boolean r2 = g.e.a.b.b.h.g.a(r3)
            if (r2 == 0) goto L_0x0313
            r3 = r14
            goto L_0x0319
        L_0x0313:
            if (r3 == 0) goto L_0x0319
            java.lang.String r3 = r3.trim()
        L_0x0319:
            g.e.a.b.f.b.n4 r2 = r1.a
            g.e.a.b.f.b.s3 r2 = r2.t()
            g.e.a.b.f.b.r3 r2 = r2.t
            java.lang.String r2 = r2.a()
            boolean r2 = g.e.a.b.f.b.q9.Y(r3, r2)
            if (r2 != 0) goto L_0x0337
            g.e.a.b.f.b.n4 r1 = r1.a
            g.e.a.b.f.b.s3 r1 = r1.t()
            g.e.a.b.f.b.r3 r1 = r1.t
            r1.b(r3)
            goto L_0x0366
        L_0x0337:
            g.e.a.b.f.b.n4 r0 = r1.a
            g.e.a.b.f.b.f3 r0 = r0.d()
            g.e.a.b.f.b.d3 r0 = r0.f3143m
            java.lang.String r1 = "Not logging duplicate session_start_with_rollout event"
            r0.a(r1)
            return
        L_0x0345:
            boolean r1 = r13.equals(r9)
            if (r1 == 0) goto L_0x0366
            g.e.a.b.f.b.n4 r1 = r7.a
            g.e.a.b.f.b.q9 r1 = r1.A()
            g.e.a.b.f.b.n4 r1 = r1.a
            g.e.a.b.f.b.s3 r1 = r1.t()
            g.e.a.b.f.b.r3 r1 = r1.t
            java.lang.String r1 = r1.a()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x0366
            r12.putString(r2, r1)
        L_0x0366:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r15.add(r12)
            g.e.a.b.f.b.n4 r1 = r7.a
            g.e.a.b.f.b.s3 r1 = r1.t()
            g.e.a.b.f.b.p3 r1 = r1.o
            long r1 = r1.a()
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x03ee
            g.e.a.b.f.b.n4 r1 = r7.a
            g.e.a.b.f.b.s3 r1 = r1.t()
            boolean r1 = r1.t(r10)
            if (r1 == 0) goto L_0x03ee
            g.e.a.b.f.b.n4 r1 = r7.a
            g.e.a.b.f.b.s3 r1 = r1.t()
            g.e.a.b.f.b.n3 r1 = r1.q
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x03ee
            g.e.a.b.f.b.n4 r1 = r7.a
            g.e.a.b.f.b.f3 r1 = r1.d()
            g.e.a.b.f.b.d3 r1 = r1.n
            java.lang.String r2 = "Current session is expired, remove the session number, ID, and engagement time"
            r1.a(r2)
            r4 = 0
            g.e.a.b.f.b.n4 r1 = r7.a
            g.e.a.b.b.h.b r1 = r1.n
            g.e.a.b.b.h.c r1 = (g.e.a.b.b.h.c) r1
            java.util.Objects.requireNonNull(r1)
            long r18 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_sid"
            r1 = r24
            r29 = r15
            r14 = r5
            r5 = r18
            r1.B(r2, r3, r4, r5)
            g.e.a.b.f.b.n4 r1 = r7.a
            g.e.a.b.b.h.b r1 = r1.n
            g.e.a.b.b.h.c r1 = (g.e.a.b.b.h.c) r1
            java.util.Objects.requireNonNull(r1)
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_sno"
            r1 = r24
            r1.B(r2, r3, r4, r5)
            g.e.a.b.f.b.n4 r1 = r7.a
            g.e.a.b.b.h.b r1 = r1.n
            g.e.a.b.b.h.c r1 = (g.e.a.b.b.h.c) r1
            java.util.Objects.requireNonNull(r1)
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_se"
            r1 = r24
            r1.B(r2, r3, r4, r5)
            goto L_0x03f1
        L_0x03ee:
            r29 = r15
            r14 = r5
        L_0x03f1:
            java.lang.String r1 = "extend_session"
            long r1 = r12.getLong(r1, r14)
            r3 = 1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0416
            g.e.a.b.f.b.n4 r1 = r7.a
            g.e.a.b.f.b.f3 r1 = r1.d()
            g.e.a.b.f.b.d3 r1 = r1.n
            java.lang.String r2 = "EXTEND_SESSION param attached: initiate a new session or extend the current active session"
            r1.a(r2)
            g.e.a.b.f.b.n4 r1 = r7.a
            g.e.a.b.f.b.w8 r1 = r1.z()
            g.e.a.b.f.b.u8 r1 = r1.f3390d
            r2 = 1
            r1.b(r10, r2)
        L_0x0416:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r2 = r12.keySet()
            r1.<init>(r2)
            java.util.Collections.sort(r1)
            int r2 = r1.size()
            r5 = 0
        L_0x0427:
            if (r5 >= r2) goto L_0x0472
            java.lang.Object r3 = r1.get(r5)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x046f
            g.e.a.b.f.b.n4 r4 = r7.a
            r4.A()
            java.lang.Object r4 = r12.get(r3)
            boolean r6 = r4 instanceof android.os.Bundle
            if (r6 == 0) goto L_0x0447
            r6 = 1
            android.os.Bundle[] r14 = new android.os.Bundle[r6]
            android.os.Bundle r4 = (android.os.Bundle) r4
            r6 = 0
            r14[r6] = r4
            goto L_0x046a
        L_0x0447:
            boolean r6 = r4 instanceof android.os.Parcelable[]
            if (r6 == 0) goto L_0x0455
            android.os.Parcelable[] r4 = (android.os.Parcelable[]) r4
            int r6 = r4.length
            java.lang.Class<android.os.Bundle[]> r14 = android.os.Bundle[].class
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r6, r14)
            goto L_0x0465
        L_0x0455:
            boolean r6 = r4 instanceof java.util.ArrayList
            if (r6 == 0) goto L_0x0469
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r6 = r4.size()
            android.os.Bundle[] r6 = new android.os.Bundle[r6]
            java.lang.Object[] r4 = r4.toArray(r6)
        L_0x0465:
            android.os.Bundle[] r4 = (android.os.Bundle[]) r4
            r14 = r4
            goto L_0x046a
        L_0x0469:
            r14 = 0
        L_0x046a:
            if (r14 == 0) goto L_0x046f
            r12.putParcelableArray(r3, r14)
        L_0x046f:
            int r5 = r5 + 1
            goto L_0x0427
        L_0x0472:
            r12 = 0
        L_0x0473:
            int r1 = r29.size()
            if (r12 >= r1) goto L_0x0530
            r14 = r29
            java.lang.Object r1 = r14.get(r12)
            android.os.Bundle r1 = (android.os.Bundle) r1
            if (r12 == 0) goto L_0x0486
            java.lang.String r2 = "_ep"
            goto L_0x0487
        L_0x0486:
            r2 = r9
        L_0x0487:
            r1.putString(r0, r8)
            if (r31 == 0) goto L_0x0496
            g.e.a.b.f.b.n4 r3 = r7.a
            g.e.a.b.f.b.q9 r3 = r3.A()
            android.os.Bundle r1 = r3.q0(r1)
        L_0x0496:
            r15 = r1
            com.google.android.gms.measurement.internal.zzau r5 = new com.google.android.gms.measurement.internal.zzau
            com.google.android.gms.measurement.internal.zzas r3 = new com.google.android.gms.measurement.internal.zzas
            r3.<init>(r15)
            r1 = r5
            r4 = r25
            r30 = r0
            r0 = r5
            r5 = r27
            r1.<init>(r2, r3, r4, r5)
            g.e.a.b.f.b.n4 r1 = r7.a
            g.e.a.b.f.b.f8 r1 = r1.y()
            java.util.Objects.requireNonNull(r1)
            r1.h()
            r1.i()
            r1.u()
            g.e.a.b.f.b.n4 r2 = r1.a
            g.e.a.b.f.b.z2 r2 = r2.r()
            java.util.Objects.requireNonNull(r2)
            android.os.Parcel r3 = android.os.Parcel.obtain()
            r4 = 0
            g.e.a.b.f.b.s.a(r0, r3, r4)
            byte[] r4 = r3.marshall()
            r3.recycle()
            int r3 = r4.length
            r5 = 131072(0x20000, float:1.83671E-40)
            if (r3 <= r5) goto L_0x04e9
            g.e.a.b.f.b.n4 r2 = r2.a
            g.e.a.b.f.b.f3 r2 = r2.d()
            g.e.a.b.f.b.d3 r2 = r2.f3137g
            java.lang.String r3 = "Event is too long for local database. Sending event directly to service"
            r2.a(r3)
            r2 = 1
            r21 = 0
            goto L_0x04f1
        L_0x04e9:
            r3 = 0
            boolean r5 = r2.o(r3, r4)
            r21 = r5
            r2 = 1
        L_0x04f1:
            com.google.android.gms.measurement.internal.zzp r20 = r1.q(r2)
            g.e.a.b.f.b.t7 r2 = new g.e.a.b.f.b.t7
            r18 = r2
            r19 = r1
            r22 = r0
            r23 = r33
            r18.<init>(r19, r20, r21, r22, r23)
            r1.t(r2)
            if (r16 != 0) goto L_0x0528
            java.util.Set r0 = r7.f3303e
            java.util.Iterator r0 = r0.iterator()
        L_0x050d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0528
            java.lang.Object r1 = r0.next()
            g.e.a.b.f.b.n5 r1 = (g.e.a.b.f.b.n5) r1
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r15)
            r2 = r25
            r3 = r26
            r5 = r27
            r1.a(r2, r3, r4, r5)
            goto L_0x050d
        L_0x0528:
            int r12 = r12 + 1
            r0 = r30
            r29 = r14
            goto L_0x0473
        L_0x0530:
            g.e.a.b.f.b.n4 r0 = r7.a
            g.e.a.b.f.b.b r1 = r0.f3257f
            g.e.a.b.f.b.f7 r0 = r0.x()
            r1 = 0
            g.e.a.b.f.b.y6 r0 = r0.o(r1)
            if (r0 == 0) goto L_0x055e
            boolean r0 = r13.equals(r9)
            if (r0 == 0) goto L_0x055e
            g.e.a.b.f.b.n4 r0 = r7.a
            g.e.a.b.f.b.w8 r0 = r0.z()
            g.e.a.b.f.b.n4 r1 = r7.a
            g.e.a.b.b.h.b r1 = r1.n
            g.e.a.b.b.h.c r1 = (g.e.a.b.b.h.c) r1
            java.util.Objects.requireNonNull(r1)
            long r1 = android.os.SystemClock.elapsedRealtime()
            g.e.a.b.f.b.t8 r0 = r0.f3391e
            r3 = 1
            r0.a(r3, r3, r1)
        L_0x055e:
            return
        L_0x055f:
            g.e.a.b.f.b.n4 r0 = r7.a
            g.e.a.b.f.b.f3 r0 = r0.d()
            g.e.a.b.f.b.d3 r0 = r0.f3143m
            java.lang.String r1 = "Event not sent since app measurement is disabled"
            r0.a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.q6.q(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    public final void r(long j2, boolean z) {
        h();
        i();
        this.a.d().f3143m.a("Resetting analytics data (FE)");
        w8 z2 = this.a.z();
        z2.h();
        t8 t8Var = z2.f3391e;
        t8Var.c.a();
        t8Var.a = 0;
        t8Var.b = 0;
        boolean g2 = this.a.g();
        s3 t = this.a.t();
        t.f3338e.b(j2);
        if (!TextUtils.isEmpty(t.a.t().t.a())) {
            t.t.b((String) null);
        }
        mb.b();
        f fVar = t.a.f3258g;
        r2 r2Var = s2.e0;
        if (fVar.u((String) null, r2Var)) {
            t.o.b(0);
        }
        if (!t.a.f3258g.w()) {
            t.s(!g2);
        }
        t.u.b((String) null);
        t.v.b(0);
        t.w.b((Bundle) null);
        if (z) {
            f8 y = this.a.y();
            y.h();
            y.i();
            zzp q = y.q(false);
            y.u();
            y.a.r().m();
            y.t(new i7(y, q));
        }
        mb.b();
        if (this.a.f3258g.u((String) null, r2Var)) {
            this.a.z().f3390d.a();
        }
        this.o = !g2;
    }

    public final void s(String str, String str2, long j2, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i2 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i2 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i2];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i2] = new Bundle((Bundle) parcelable);
                        }
                        i2++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i2 < list.size()) {
                        Object obj2 = list.get(i2);
                        if (obj2 instanceof Bundle) {
                            list.set(i2, new Bundle((Bundle) obj2));
                        }
                        i2++;
                    }
                }
            }
        }
        this.a.b().r(new x5(this, str, str2, j2, bundle2, z, z2, z3, (String) null));
    }

    public final void t(String str, String str2, long j2, Object obj) {
        this.a.b().r(new y5(this, str, str2, obj, j2));
    }

    public final void u(Bundle bundle, long j2) {
        Class<Long> cls = Long.class;
        Class<String> cls2 = String.class;
        Objects.requireNonNull(bundle, "null reference");
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.a.d().f3139i.a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        e.v(bundle2, "app_id", cls2, (Object) null);
        e.v(bundle2, "origin", cls2, (Object) null);
        e.v(bundle2, "name", cls2, (Object) null);
        e.v(bundle2, "value", Object.class, (Object) null);
        e.v(bundle2, "trigger_event_name", cls2, (Object) null);
        e.v(bundle2, "trigger_timeout", cls, 0L);
        e.v(bundle2, "timed_out_event_name", cls2, (Object) null);
        e.v(bundle2, "timed_out_event_params", Bundle.class, (Object) null);
        e.v(bundle2, "triggered_event_name", cls2, (Object) null);
        e.v(bundle2, "triggered_event_params", Bundle.class, (Object) null);
        e.v(bundle2, "time_to_live", cls, 0L);
        e.v(bundle2, "expired_event_name", cls2, (Object) null);
        e.v(bundle2, "expired_event_params", Bundle.class, (Object) null);
        f.k(bundle2.getString("name"));
        f.k(bundle2.getString("origin"));
        Objects.requireNonNull(bundle2.get("value"), "null reference");
        bundle2.putLong("creation_timestamp", j2);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (this.a.A().k0(string) != 0) {
            this.a.d().f3136f.b("Invalid conditional user property name", this.a.f3264m.f(string));
        } else if (this.a.A().g0(string, obj) == 0) {
            Object p2 = this.a.A().p(string, obj);
            if (p2 == null) {
                this.a.d().f3136f.c("Unable to normalize conditional user property value", this.a.f3264m.f(string), obj);
                return;
            }
            e.G(bundle2, p2);
            long j3 = bundle2.getLong("trigger_timeout");
            if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
                n4 n4Var = this.a;
                f fVar = n4Var.f3258g;
                if (j3 > 15552000000L || j3 < 1) {
                    n4Var.d().f3136f.c("Invalid conditional user property timeout", this.a.f3264m.f(string), Long.valueOf(j3));
                    return;
                }
            }
            long j4 = bundle2.getLong("time_to_live");
            n4 n4Var2 = this.a;
            f fVar2 = n4Var2.f3258g;
            if (j4 > 15552000000L || j4 < 1) {
                n4Var2.d().f3136f.c("Invalid conditional user property time to live", this.a.f3264m.f(string), Long.valueOf(j4));
            } else {
                n4Var2.b().r(new a6(this, bundle2));
            }
        } else {
            this.a.d().f3136f.c("Invalid conditional user property value", this.a.f3264m.f(string), obj);
        }
    }

    public final void v(Bundle bundle, int i2, long j2) {
        String str;
        i();
        h hVar = h.b;
        g[] values = g.values();
        int i3 = 0;
        while (true) {
            if (i3 >= 2) {
                str = null;
                break;
            }
            g gVar = values[i3];
            if (bundle.containsKey(gVar.zzd) && (str = bundle.getString(gVar.zzd)) != null && h.i(str) == null) {
                break;
            }
            i3++;
        }
        if (str != null) {
            this.a.d().f3141k.b("Ignoring invalid consent setting", str);
            this.a.d().f3141k.a("Valid consent values are 'granted', 'denied'");
        }
        w(h.a(bundle), i2, j2);
    }

    public final void w(h hVar, int i2, long j2) {
        boolean z;
        int i3;
        boolean z2;
        h hVar2 = hVar;
        int i4 = i2;
        g gVar = g.ANALYTICS_STORAGE;
        i();
        if (i4 != -10 && ((Boolean) hVar2.a.get(g.AD_STORAGE)) == null && ((Boolean) hVar2.a.get(gVar)) == null) {
            this.a.d().f3141k.a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f3306h) {
            try {
                z = true;
                i3 = 0;
                if (h.f(i4, this.f3308j)) {
                    boolean g2 = hVar2.g(this.f3307i);
                    boolean z3 = hVar2.e(gVar) && !this.f3307i.e(gVar);
                    h hVar3 = this.f3307i;
                    EnumMap enumMap = new EnumMap(g.class);
                    g[] values = g.values();
                    while (i3 < 2) {
                        g gVar2 = values[i3];
                        Boolean bool = (Boolean) hVar2.a.get(gVar2);
                        if (bool == null) {
                            bool = (Boolean) hVar3.a.get(gVar2);
                        }
                        enumMap.put(gVar2, bool);
                        i3++;
                    }
                    hVar2 = new h(enumMap);
                    this.f3307i = hVar2;
                    this.f3308j = i4;
                    z2 = z3;
                    i3 = g2;
                } else {
                    z = false;
                    z2 = false;
                }
            } finally {
                while (true) {
                }
            }
        }
        if (!z) {
            this.a.d().f3142l.b("Ignoring lower-priority consent settings, proposed settings", hVar2);
            return;
        }
        long andIncrement = this.f3309k.getAndIncrement();
        if (i3 != 0) {
            this.f3305g.set((Object) null);
            this.a.b().s(new l6(this, hVar2, j2, i2, andIncrement, z2));
        } else if (i4 == 30 || i4 == -10) {
            this.a.b().s(new m6(this, hVar2, i2, andIncrement, z2));
        } else {
            this.a.b().r(new n6(this, hVar2, i2, andIncrement, z2));
        }
    }

    public final void x(t9 t9Var) {
        t9 t9Var2;
        h();
        i();
        if (!(t9Var == null || t9Var == (t9Var2 = this.f3302d))) {
            f.r(t9Var2 == null, "EventInterceptor already set.");
        }
        this.f3302d = t9Var;
    }

    public final void y(h hVar) {
        h();
        boolean z = (hVar.e(g.ANALYTICS_STORAGE) && hVar.e(g.AD_STORAGE)) || this.a.y().o();
        n4 n4Var = this.a;
        n4Var.b().h();
        if (z != n4Var.D) {
            n4 n4Var2 = this.a;
            n4Var2.b().h();
            n4Var2.D = z;
            s3 t = this.a.t();
            n4 n4Var3 = t.a;
            t.h();
            Boolean valueOf = t.o().contains("measurement_enabled_from_api") ? Boolean.valueOf(t.o().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || valueOf == null || valueOf.booleanValue()) {
                D(Boolean.valueOf(z), false);
            }
        }
    }

    public final void z(Object obj) {
        Objects.requireNonNull((c) this.a.n);
        A("auto", "_ldl", obj, true, System.currentTimeMillis());
    }
}
