package g.e.a.b.f.b;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.measurement.internal.zzab;
import com.google.android.gms.measurement.internal.zzas;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzks;
import com.google.android.gms.measurement.internal.zzp;
import com.tencent.raft.codegenmeta.utils.Constants;
import e.d.a;
import g.c.b.b.f;
import g.e.a.b.b.h.c;
import g.e.a.b.b.i.b;
import g.e.a.b.e.c.ba;
import g.e.a.b.e.c.e4;
import g.e.a.b.e.c.f4;
import g.e.a.b.e.c.j3;
import g.e.a.b.e.c.lc;
import g.e.a.b.e.c.o4;
import g.e.a.b.e.c.p4;
import g.e.a.b.e.c.u3;
import g.e.a.b.e.c.v3;
import g.e.a.b.e.c.xa;
import g.e.a.b.e.c.y3;
import g.e.a.b.e.c.z3;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public final class k9 implements j5 {
    public static volatile k9 E;
    public final Map A;
    public y6 B;
    public String C;
    public final p9 D = new i9(this);
    public final g4 a;
    public final k3 b;
    public k c;

    /* renamed from: d  reason: collision with root package name */
    public m3 f3230d;

    /* renamed from: e  reason: collision with root package name */
    public z8 f3231e;

    /* renamed from: f  reason: collision with root package name */
    public ca f3232f;

    /* renamed from: g  reason: collision with root package name */
    public final m9 f3233g;

    /* renamed from: h  reason: collision with root package name */
    public w6 f3234h;

    /* renamed from: i  reason: collision with root package name */
    public h8 f3235i;

    /* renamed from: j  reason: collision with root package name */
    public final c9 f3236j;

    /* renamed from: k  reason: collision with root package name */
    public v3 f3237k;

    /* renamed from: l  reason: collision with root package name */
    public final n4 f3238l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3239m = false;
    public boolean n;
    public long o;
    public List p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public FileLock v;
    public FileChannel w;
    public List x;
    public List y;
    public long z;

    public k9(l9 l9Var, n4 n4Var) {
        this.f3238l = n4.u(l9Var.a, (zzcl) null, (Long) null);
        this.z = -1;
        this.f3236j = new c9(this);
        m9 m9Var = new m9(this);
        m9Var.j();
        this.f3233g = m9Var;
        k3 k3Var = new k3(this);
        k3Var.j();
        this.b = k3Var;
        g4 g4Var = new g4(this);
        g4Var.j();
        this.a = g4Var;
        this.A = new HashMap();
        b().r(new d9(this, l9Var));
    }

    public static final boolean H(zzp zzp) {
        return !TextUtils.isEmpty(zzp.zzb) || !TextUtils.isEmpty(zzp.zzq);
    }

    public static final b9 I(b9 b9Var) {
        if (b9Var == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (b9Var.c) {
            return b9Var;
        } else {
            String valueOf = String.valueOf(b9Var.getClass());
            valueOf.length();
            throw new IllegalStateException("Component not initialized: ".concat(valueOf));
        }
    }

    public static k9 O(Context context) {
        Objects.requireNonNull(context, "null reference");
        Objects.requireNonNull(context.getApplicationContext(), "null reference");
        if (E == null) {
            synchronized (k9.class) {
                if (E == null) {
                    E = new k9(new l9(context), (n4) null);
                }
            }
        }
        return E;
    }

    public static final void w(u3 u3Var, int i2, String str) {
        List u2 = u3Var.u();
        int i3 = 0;
        while (i3 < u2.size()) {
            if (!"_err".equals(((z3) u2.get(i3)).y())) {
                i3++;
            } else {
                return;
            }
        }
        y3 w2 = z3.w();
        w2.m("_err");
        w2.l(Long.valueOf((long) i2).longValue());
        z3 z3Var = (z3) w2.j();
        y3 w3 = z3.w();
        w3.m("_ev");
        w3.n(str);
        z3 z3Var2 = (z3) w3.j();
        if (u3Var.f2990d) {
            u3Var.f();
            u3Var.f2990d = false;
        }
        v3.C((v3) u3Var.c, z3Var);
        if (u3Var.f2990d) {
            u3Var.f();
            u3Var.f2990d = false;
        }
        v3.C((v3) u3Var.c, z3Var2);
    }

    public static final void y(u3 u3Var, String str) {
        List u2 = u3Var.u();
        for (int i2 = 0; i2 < u2.size(); i2++) {
            if (str.equals(((z3) u2.get(i2)).y())) {
                u3Var.p(i2);
                return;
            }
        }
    }

    public final Boolean A(w4 w4Var) {
        try {
            if (w4Var.A() != -2147483648L) {
                if (w4Var.A() == ((long) b.a(this.f3238l.a).b(w4Var.L(), 0).versionCode)) {
                    return Boolean.TRUE;
                }
            } else {
                String str = b.a(this.f3238l.a).b(w4Var.L(), 0).versionName;
                String O = w4Var.O();
                if (O != null && O.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final void B() {
        b().h();
        if (this.s || this.t || this.u) {
            d().n.d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.s), Boolean.valueOf(this.t), Boolean.valueOf(this.u));
            return;
        }
        d().n.a("Stopping uploading service(s)");
        List<Runnable> list = this.p;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            List list2 = this.p;
            Objects.requireNonNull(list2, "null reference");
            list2.clear();
        }
    }

    public final void C(e4 e4Var, long j2, boolean z2) {
        o9 o9Var;
        String str = true != z2 ? "_lte" : "_se";
        k kVar = this.c;
        I(kVar);
        o9 H = kVar.H(e4Var.U(), str);
        if (H == null || H.f3279e == null) {
            String U = e4Var.U();
            Objects.requireNonNull((c) e());
            o9Var = new o9(U, "auto", str, System.currentTimeMillis(), Long.valueOf(j2));
        } else {
            String U2 = e4Var.U();
            Objects.requireNonNull((c) e());
            o9Var = new o9(U2, "auto", str, System.currentTimeMillis(), Long.valueOf(((Long) H.f3279e).longValue() + j2));
        }
        o4 v2 = p4.v();
        v2.m(str);
        Objects.requireNonNull((c) e());
        v2.n(System.currentTimeMillis());
        v2.l(((Long) o9Var.f3279e).longValue());
        p4 p4Var = (p4) v2.j();
        int v3 = m9.v(e4Var, str);
        if (v3 >= 0) {
            if (e4Var.f2990d) {
                e4Var.f();
                e4Var.f2990d = false;
            }
            f4.v0((f4) e4Var.c, v3, p4Var);
        } else {
            if (e4Var.f2990d) {
                e4Var.f();
                e4Var.f2990d = false;
            }
            f4.w0((f4) e4Var.c, p4Var);
        }
        if (j2 > 0) {
            k kVar2 = this.c;
            I(kVar2);
            kVar2.s(o9Var);
            d().n.c("Updated engagement user property. scope, value", true != z2 ? "lifetime" : "session-scoped", o9Var.f3279e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x03c9  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x032b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D() {
        /*
            r19 = this;
            r1 = r19
            g.e.a.b.f.b.k4 r0 = r19.b()
            r0.h()
            r19.g()
            long r2 = r1.o
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0043
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            g.e.a.b.b.h.b r0 = r19.e()
            g.e.a.b.b.h.c r0 = (g.e.a.b.b.h.c) r0
            java.util.Objects.requireNonNull(r0)
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r8 = r1.o
            long r6 = r6 - r8
            long r6 = java.lang.Math.abs(r6)
            long r2 = r2 - r6
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0041
            g.e.a.b.f.b.f3 r0 = r19.d()
            g.e.a.b.f.b.d3 r0 = r0.n
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r0.b(r3, r2)
            goto L_0x03dd
        L_0x0041:
            r1.o = r4
        L_0x0043:
            g.e.a.b.f.b.n4 r0 = r1.f3238l
            boolean r0 = r0.i()
            if (r0 == 0) goto L_0x03d2
            boolean r0 = r19.F()
            if (r0 != 0) goto L_0x0053
            goto L_0x03d2
        L_0x0053:
            g.e.a.b.b.h.b r0 = r19.e()
            g.e.a.b.b.h.c r0 = (g.e.a.b.b.h.c) r0
            java.util.Objects.requireNonNull(r0)
            long r2 = java.lang.System.currentTimeMillis()
            r19.K()
            g.e.a.b.f.b.r2 r0 = g.e.a.b.f.b.s2.A
            r6 = 0
            java.lang.Object r0 = r0.a(r6)
            java.lang.Long r0 = (java.lang.Long) r0
            long r7 = r0.longValue()
            long r7 = java.lang.Math.max(r4, r7)
            g.e.a.b.f.b.k r0 = r1.c
            I(r0)
            java.lang.String r9 = "select count(1) > 0 from raw_events where realtime = 1"
            long r9 = r0.v(r9, r6)
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0085
            r0 = 1
            goto L_0x0086
        L_0x0085:
            r0 = 0
        L_0x0086:
            if (r0 != 0) goto L_0x009f
            g.e.a.b.f.b.k r0 = r1.c
            I(r0)
            java.lang.String r9 = "select count(1) > 0 from queue where has_realtime = 1"
            long r9 = r0.v(r9, r6)
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0099
            r0 = 1
            goto L_0x009a
        L_0x0099:
            r0 = 0
        L_0x009a:
            if (r0 == 0) goto L_0x009d
            goto L_0x009f
        L_0x009d:
            r0 = 0
            goto L_0x00a0
        L_0x009f:
            r0 = 1
        L_0x00a0:
            if (r0 == 0) goto L_0x00c8
            g.e.a.b.f.b.f r9 = r19.K()
            java.lang.String r10 = "debug.firebase.analytics.app"
            java.lang.String r13 = ""
            java.lang.String r9 = r9.j(r10, r13)
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 != 0) goto L_0x00c2
            java.lang.String r10 = ".none."
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto L_0x00c2
            r19.K()
            g.e.a.b.f.b.r2 r9 = g.e.a.b.f.b.s2.v
            goto L_0x00cd
        L_0x00c2:
            r19.K()
            g.e.a.b.f.b.r2 r9 = g.e.a.b.f.b.s2.u
            goto L_0x00cd
        L_0x00c8:
            r19.K()
            g.e.a.b.f.b.r2 r9 = g.e.a.b.f.b.s2.t
        L_0x00cd:
            java.lang.Object r9 = r9.a(r6)
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            long r9 = java.lang.Math.max(r4, r9)
            g.e.a.b.f.b.h8 r13 = r1.f3235i
            g.e.a.b.f.b.p3 r13 = r13.f3186j
            long r13 = r13.a()
            g.e.a.b.f.b.h8 r15 = r1.f3235i
            g.e.a.b.f.b.p3 r15 = r15.f3187k
            long r15 = r15.a()
            g.e.a.b.f.b.k r11 = r1.c
            I(r11)
            java.lang.String r12 = "select max(bundle_end_timestamp) from queue"
            long r11 = r11.x(r12, r6, r4)
            g.e.a.b.f.b.k r4 = r1.c
            I(r4)
            java.lang.String r5 = "select max(timestamp) from raw_events"
            r17 = r9
            r9 = 0
            long r4 = r4.x(r5, r6, r9)
            long r4 = java.lang.Math.max(r11, r4)
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x010f
            goto L_0x018f
        L_0x010f:
            long r4 = r4 - r2
            long r4 = java.lang.Math.abs(r4)
            long r4 = r2 - r4
            long r13 = r13 - r2
            long r9 = java.lang.Math.abs(r13)
            long r15 = r15 - r2
            long r11 = java.lang.Math.abs(r15)
            long r11 = r2 - r11
            long r2 = r2 - r9
            long r2 = java.lang.Math.max(r2, r11)
            long r7 = r7 + r4
            if (r0 == 0) goto L_0x0136
            r9 = 0
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0136
            long r7 = java.lang.Math.min(r4, r2)
            long r7 = r7 + r17
        L_0x0136:
            g.e.a.b.f.b.m9 r0 = r1.f3233g
            I(r0)
            r9 = r17
            boolean r0 = r0.K(r2, r9)
            if (r0 != 0) goto L_0x0145
            long r2 = r2 + r9
            goto L_0x0146
        L_0x0145:
            r2 = r7
        L_0x0146:
            r7 = 0
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0191
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0191
            r0 = 0
        L_0x0151:
            r19.K()
            r4 = 20
            g.e.a.b.f.b.r2 r5 = g.e.a.b.f.b.s2.C
            java.lang.Object r5 = r5.a(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            int r4 = java.lang.Math.min(r4, r5)
            if (r0 >= r4) goto L_0x018f
            r19.K()
            g.e.a.b.f.b.r2 r4 = g.e.a.b.f.b.s2.B
            java.lang.Object r4 = r4.a(r6)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            r7 = 0
            long r4 = java.lang.Math.max(r7, r4)
            r7 = 1
            long r7 = r7 << r0
            long r4 = r4 * r7
            long r2 = r2 + r4
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 > 0) goto L_0x0191
            int r0 = r0 + 1
            goto L_0x0151
        L_0x018f:
            r2 = 0
        L_0x0191:
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x03c9
            g.e.a.b.f.b.k3 r0 = r1.b
            I(r0)
            boolean r0 = r0.l()
            if (r0 == 0) goto L_0x0373
            g.e.a.b.f.b.h8 r0 = r1.f3235i
            g.e.a.b.f.b.p3 r0 = r0.f3185i
            long r4 = r0.a()
            r19.K()
            g.e.a.b.f.b.r2 r0 = g.e.a.b.f.b.s2.r
            java.lang.Object r0 = r0.a(r6)
            java.lang.Long r0 = (java.lang.Long) r0
            long r7 = r0.longValue()
            r9 = 0
            long r7 = java.lang.Math.max(r9, r7)
            g.e.a.b.f.b.m9 r0 = r1.f3233g
            I(r0)
            boolean r0 = r0.K(r4, r7)
            if (r0 != 0) goto L_0x01cf
            long r4 = r4 + r7
            long r2 = java.lang.Math.max(r2, r4)
        L_0x01cf:
            g.e.a.b.f.b.m3 r0 = r19.N()
            r0.a()
            g.e.a.b.b.h.b r0 = r19.e()
            g.e.a.b.b.h.c r0 = (g.e.a.b.b.h.c) r0
            java.util.Objects.requireNonNull(r0)
            long r4 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r4
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0211
            r19.K()
            g.e.a.b.f.b.r2 r0 = g.e.a.b.f.b.s2.w
            java.lang.Object r0 = r0.a(r6)
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            long r2 = java.lang.Math.max(r4, r2)
            g.e.a.b.f.b.h8 r0 = r1.f3235i
            g.e.a.b.f.b.p3 r0 = r0.f3186j
            g.e.a.b.b.h.b r4 = r19.e()
            g.e.a.b.b.h.c r4 = (g.e.a.b.b.h.c) r4
            java.util.Objects.requireNonNull(r4)
            long r4 = java.lang.System.currentTimeMillis()
            r0.b(r4)
        L_0x0211:
            g.e.a.b.f.b.f3 r0 = r19.d()
            g.e.a.b.f.b.d3 r0 = r0.n
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            java.lang.String r5 = "Upload scheduled in approximately ms"
            r0.b(r5, r4)
            g.e.a.b.f.b.z8 r0 = r1.f3231e
            I(r0)
            r0.i()
            g.e.a.b.f.b.n4 r4 = r0.a
            g.e.a.b.f.b.b r5 = r4.f3257f
            android.content.Context r4 = r4.a
            boolean r5 = g.e.a.b.f.b.q9.W(r4)
            if (r5 != 0) goto L_0x0241
            g.e.a.b.f.b.n4 r5 = r0.a
            g.e.a.b.f.b.f3 r5 = r5.d()
            g.e.a.b.f.b.d3 r5 = r5.f3143m
            java.lang.String r7 = "Receiver not registered/enabled"
            r5.a(r7)
        L_0x0241:
            boolean r4 = g.e.a.b.f.b.q9.X(r4)
            if (r4 != 0) goto L_0x0254
            g.e.a.b.f.b.n4 r4 = r0.a
            g.e.a.b.f.b.f3 r4 = r4.d()
            g.e.a.b.f.b.d3 r4 = r4.f3143m
            java.lang.String r5 = "Service not registered/enabled"
            r4.a(r5)
        L_0x0254:
            r0.l()
            g.e.a.b.f.b.n4 r4 = r0.a
            g.e.a.b.f.b.f3 r4 = r4.d()
            g.e.a.b.f.b.d3 r4 = r4.n
            java.lang.Long r5 = java.lang.Long.valueOf(r2)
            java.lang.String r7 = "Scheduling upload, millis"
            r4.b(r7, r5)
            g.e.a.b.f.b.n4 r4 = r0.a
            g.e.a.b.b.h.b r4 = r4.n
            g.e.a.b.b.h.c r4 = (g.e.a.b.b.h.c) r4
            java.util.Objects.requireNonNull(r4)
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r9 = r4 + r2
            g.e.a.b.f.b.n4 r4 = r0.a
            g.e.a.b.f.b.f r4 = r4.f3258g
            g.e.a.b.f.b.r2 r4 = g.e.a.b.f.b.s2.x
            java.lang.Object r4 = r4.a(r6)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            r7 = 0
            long r4 = java.lang.Math.max(r7, r4)
            int r11 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r11 >= 0) goto L_0x02a7
            g.e.a.b.f.b.m r4 = r0.o()
            long r4 = r4.c
            int r11 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x029d
            r4 = 1
            goto L_0x029e
        L_0x029d:
            r4 = 0
        L_0x029e:
            if (r4 != 0) goto L_0x02a7
            g.e.a.b.f.b.m r4 = r0.o()
            r4.c(r2)
        L_0x02a7:
            g.e.a.b.f.b.n4 r4 = r0.a
            g.e.a.b.f.b.b r5 = r4.f3257f
            int r5 = android.os.Build.VERSION.SDK_INT
            r7 = 24
            if (r5 < r7) goto L_0x0356
            android.content.Context r4 = r4.a
            android.content.ComponentName r5 = new android.content.ComponentName
            java.lang.String r6 = "com.google.android.gms.measurement.AppMeasurementJobService"
            r5.<init>(r4, r6)
            int r0 = r0.m()
            android.os.PersistableBundle r6 = new android.os.PersistableBundle
            r6.<init>()
            java.lang.String r7 = "action"
            java.lang.String r8 = "com.google.android.gms.measurement.UPLOAD"
            r6.putString(r7, r8)
            android.app.job.JobInfo$Builder r7 = new android.app.job.JobInfo$Builder
            r7.<init>(r0, r5)
            android.app.job.JobInfo$Builder r0 = r7.setMinimumLatency(r2)
            long r2 = r2 + r2
            android.app.job.JobInfo$Builder r0 = r0.setOverrideDeadline(r2)
            android.app.job.JobInfo$Builder r0 = r0.setExtras(r6)
            android.app.job.JobInfo r2 = r0.build()
            java.lang.reflect.Method r0 = g.e.a.b.e.c.t0.a
            java.lang.String r0 = "jobscheduler"
            java.lang.Object r0 = r4.getSystemService(r0)
            r3 = r0
            android.app.job.JobScheduler r3 = (android.app.job.JobScheduler) r3
            java.util.Objects.requireNonNull(r3)
            java.lang.reflect.Method r0 = g.e.a.b.e.c.t0.a
            if (r0 == 0) goto L_0x0352
            java.lang.String r0 = "android.permission.UPDATE_DEVICE_STATS"
            int r0 = r4.checkSelfPermission(r0)
            if (r0 == 0) goto L_0x02fb
            goto L_0x0352
        L_0x02fb:
            java.lang.reflect.Method r0 = g.e.a.b.e.c.t0.b
            if (r0 == 0) goto L_0x0322
            java.lang.Class<android.os.UserHandle> r4 = android.os.UserHandle.class
            r5 = 0
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ IllegalAccessException -> 0x0313, InvocationTargetException -> 0x0311 }
            java.lang.Object r0 = r0.invoke(r4, r6)     // Catch:{ IllegalAccessException -> 0x0313, InvocationTargetException -> 0x0311 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ IllegalAccessException -> 0x0313, InvocationTargetException -> 0x0311 }
            if (r0 == 0) goto L_0x0322
            int r7 = r0.intValue()     // Catch:{ IllegalAccessException -> 0x0313, InvocationTargetException -> 0x0311 }
            goto L_0x0323
        L_0x0311:
            r0 = move-exception
            goto L_0x0314
        L_0x0313:
            r0 = move-exception
        L_0x0314:
            r4 = 6
            java.lang.String r5 = "JobSchedulerCompat"
            boolean r4 = android.util.Log.isLoggable(r5, r4)
            if (r4 == 0) goto L_0x0322
            java.lang.String r4 = "myUserId invocation illegal"
            android.util.Log.e(r5, r4, r0)
        L_0x0322:
            r7 = 0
        L_0x0323:
            java.lang.reflect.Method r0 = g.e.a.b.e.c.t0.a
            java.lang.String r4 = "com.google.android.gms"
            java.lang.String r5 = "UploadAlarm"
            if (r0 == 0) goto L_0x0352
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ IllegalAccessException -> 0x034c, InvocationTargetException -> 0x034a }
            r8 = 0
            r6[r8] = r2     // Catch:{ IllegalAccessException -> 0x034c, InvocationTargetException -> 0x034a }
            r8 = 1
            r6[r8] = r4     // Catch:{ IllegalAccessException -> 0x034c, InvocationTargetException -> 0x034a }
            r4 = 2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ IllegalAccessException -> 0x034c, InvocationTargetException -> 0x034a }
            r6[r4] = r7     // Catch:{ IllegalAccessException -> 0x034c, InvocationTargetException -> 0x034a }
            r4 = 3
            r6[r4] = r5     // Catch:{ IllegalAccessException -> 0x034c, InvocationTargetException -> 0x034a }
            java.lang.Object r0 = r0.invoke(r3, r6)     // Catch:{ IllegalAccessException -> 0x034c, InvocationTargetException -> 0x034a }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ IllegalAccessException -> 0x034c, InvocationTargetException -> 0x034a }
            if (r0 == 0) goto L_0x0372
            r0.intValue()     // Catch:{ IllegalAccessException -> 0x034c, InvocationTargetException -> 0x034a }
            goto L_0x0372
        L_0x034a:
            r0 = move-exception
            goto L_0x034d
        L_0x034c:
            r0 = move-exception
        L_0x034d:
            java.lang.String r4 = "error calling scheduleAsPackage"
            android.util.Log.e(r5, r4, r0)
        L_0x0352:
            r3.schedule(r2)
            goto L_0x0372
        L_0x0356:
            android.app.AlarmManager r7 = r0.f3427d
            if (r7 == 0) goto L_0x0372
            r8 = 2
            g.e.a.b.f.b.r2 r4 = g.e.a.b.f.b.s2.s
            java.lang.Object r4 = r4.a(r6)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            long r11 = java.lang.Math.max(r4, r2)
            android.app.PendingIntent r13 = r0.n()
            r7.setInexactRepeating(r8, r9, r11, r13)
        L_0x0372:
            return
        L_0x0373:
            g.e.a.b.f.b.f3 r0 = r19.d()
            g.e.a.b.f.b.d3 r0 = r0.n
            java.lang.String r2 = "No network"
            r0.a(r2)
            g.e.a.b.f.b.m3 r0 = r19.N()
            g.e.a.b.f.b.k9 r2 = r0.a
            r2.g()
            g.e.a.b.f.b.k9 r2 = r0.a
            g.e.a.b.f.b.k4 r2 = r2.b()
            r2.h()
            boolean r2 = r0.b
            if (r2 == 0) goto L_0x0395
            goto L_0x03e4
        L_0x0395:
            g.e.a.b.f.b.k9 r2 = r0.a
            g.e.a.b.f.b.n4 r2 = r2.f3238l
            android.content.Context r2 = r2.a
            android.content.IntentFilter r3 = new android.content.IntentFilter
            java.lang.String r4 = "android.net.conn.CONNECTIVITY_CHANGE"
            r3.<init>(r4)
            r2.registerReceiver(r0, r3)
            g.e.a.b.f.b.k9 r2 = r0.a
            g.e.a.b.f.b.k3 r2 = r2.b
            I(r2)
            boolean r2 = r2.l()
            r0.c = r2
            g.e.a.b.f.b.k9 r2 = r0.a
            g.e.a.b.f.b.f3 r2 = r2.d()
            g.e.a.b.f.b.d3 r2 = r2.n
            boolean r3 = r0.c
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r4 = "Registering connectivity change receiver. Network connected"
            r2.b(r4, r3)
            r2 = 1
            r0.b = r2
            goto L_0x03e4
        L_0x03c9:
            g.e.a.b.f.b.f3 r0 = r19.d()
            g.e.a.b.f.b.d3 r0 = r0.n
            java.lang.String r2 = "Next upload time is 0"
            goto L_0x03da
        L_0x03d2:
            g.e.a.b.f.b.f3 r0 = r19.d()
            g.e.a.b.f.b.d3 r0 = r0.n
            java.lang.String r2 = "Nothing to upload or uploading impossible"
        L_0x03da:
            r0.a(r2)
        L_0x03dd:
            g.e.a.b.f.b.m3 r0 = r19.N()
            r0.a()
        L_0x03e4:
            g.e.a.b.f.b.z8 r0 = r1.f3231e
            I(r0)
            r0.l()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.k9.D():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0b68, code lost:
        if (r10 > (g.e.a.b.f.b.f.i() + r8)) goto L_0x0b6a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0398 A[Catch:{ NumberFormatException -> 0x07c7, all -> 0x0cfb }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x045c A[Catch:{ NumberFormatException -> 0x07c7, all -> 0x0cfb }] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x04b4 A[Catch:{ NumberFormatException -> 0x07c7, all -> 0x0cfb }] */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0802 A[Catch:{ NumberFormatException -> 0x07c7, all -> 0x0cfb }] */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x084b A[Catch:{ NumberFormatException -> 0x07c7, all -> 0x0cfb }] */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x086b A[Catch:{ NumberFormatException -> 0x07c7, all -> 0x0cfb }] */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x08e3 A[Catch:{ NumberFormatException -> 0x07c7, all -> 0x0cfb }] */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x08e5 A[Catch:{ NumberFormatException -> 0x07c7, all -> 0x0cfb }] */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x08ed A[Catch:{ NumberFormatException -> 0x07c7, all -> 0x0cfb }] */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x0920 A[Catch:{ NumberFormatException -> 0x07c7, all -> 0x0cfb }] */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x0b58 A[Catch:{ NumberFormatException -> 0x07c7, all -> 0x0cfb }] */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x0bdf A[Catch:{ NumberFormatException -> 0x07c7, all -> 0x0cfb }] */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x0bfb A[Catch:{ SQLiteException -> 0x0c13 }] */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x0c5e A[Catch:{ NumberFormatException -> 0x07c7, all -> 0x0cfb }] */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0c8f A[Catch:{ NumberFormatException -> 0x07c7, all -> 0x0cfb }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:69:0x01e1=Splitter:B:69:0x01e1, B:421:0x0ce9=Splitter:B:421:0x0ce9} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean E(java.lang.String r44, long r45) {
        /*
            r43 = this;
            r1 = r43
            java.lang.String r2 = "_npa"
            java.lang.String r3 = "_ai"
            g.e.a.b.f.b.k r4 = r1.c
            I(r4)
            r4.O()
            g.e.a.b.f.b.j9 r4 = new g.e.a.b.f.b.j9     // Catch:{ all -> 0x0cfb }
            r4.<init>(r1)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.k r5 = r1.c     // Catch:{ all -> 0x0cfb }
            I(r5)     // Catch:{ all -> 0x0cfb }
            r6 = 0
            long r9 = r1.z     // Catch:{ all -> 0x0cfb }
            r7 = r45
            r11 = r4
            r5.t(r6, r7, r9, r11)     // Catch:{ all -> 0x0cfb }
            java.util.List r5 = r4.c     // Catch:{ all -> 0x0cfb }
            if (r5 == 0) goto L_0x0ce9
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0cfb }
            if (r5 == 0) goto L_0x002d
            goto L_0x0ce9
        L_0x002d:
            g.e.a.b.e.c.f4 r5 = r4.a     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.l7 r5 = r5.n()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.e4 r5 = (g.e.a.b.e.c.e4) r5     // Catch:{ all -> 0x0cfb }
            r5.l0()     // Catch:{ all -> 0x0cfb }
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = -1
            r14 = 0
            r15 = -1
        L_0x003f:
            java.util.List r8 = r4.c     // Catch:{ all -> 0x0cfb }
            int r8 = r8.size()     // Catch:{ all -> 0x0cfb }
            java.lang.String r6 = "_fr"
            java.lang.String r7 = "_et"
            r16 = r9
            java.lang.String r9 = "_e"
            r17 = r2
            r18 = r3
            if (r10 >= r8) goto L_0x0534
            java.util.List r3 = r4.c     // Catch:{ all -> 0x0cfb }
            java.lang.Object r3 = r3.get(r10)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.v3 r3 = (g.e.a.b.e.c.v3) r3     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.l7 r3 = r3.n()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.u3 r3 = (g.e.a.b.e.c.u3) r3     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.g4 r8 = r1.a     // Catch:{ all -> 0x0cfb }
            I(r8)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.f4 r2 = r4.a     // Catch:{ all -> 0x0cfb }
            java.lang.String r2 = r2.B1()     // Catch:{ all -> 0x0cfb }
            r22 = r11
            java.lang.String r11 = r3.t()     // Catch:{ all -> 0x0cfb }
            boolean r2 = r8.r(r2, r11)     // Catch:{ all -> 0x0cfb }
            java.lang.String r8 = "_err"
            if (r2 == 0) goto L_0x00f0
            g.e.a.b.f.b.f3 r2 = r43.d()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.d3 r2 = r2.r()     // Catch:{ all -> 0x0cfb }
            java.lang.String r6 = "Dropping blocked raw event. appId"
            g.e.a.b.e.c.f4 r7 = r4.a     // Catch:{ all -> 0x0cfb }
            java.lang.String r7 = r7.B1()     // Catch:{ all -> 0x0cfb }
            java.lang.Object r7 = g.e.a.b.f.b.f3.t(r7)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.n4 r9 = r1.f3238l     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.a3 r9 = r9.s()     // Catch:{ all -> 0x0cfb }
            java.lang.String r11 = r3.t()     // Catch:{ all -> 0x0cfb }
            java.lang.String r9 = r9.d(r11)     // Catch:{ all -> 0x0cfb }
            r2.c(r6, r7, r9)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.g4 r2 = r1.a     // Catch:{ all -> 0x0cfb }
            I(r2)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.f4 r6 = r4.a     // Catch:{ all -> 0x0cfb }
            java.lang.String r6 = r6.B1()     // Catch:{ all -> 0x0cfb }
            boolean r2 = r2.p(r6)     // Catch:{ all -> 0x0cfb }
            if (r2 != 0) goto L_0x00e7
            g.e.a.b.f.b.g4 r2 = r1.a     // Catch:{ all -> 0x0cfb }
            I(r2)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.f4 r6 = r4.a     // Catch:{ all -> 0x0cfb }
            java.lang.String r6 = r6.B1()     // Catch:{ all -> 0x0cfb }
            boolean r2 = r2.s(r6)     // Catch:{ all -> 0x0cfb }
            if (r2 == 0) goto L_0x00c2
            goto L_0x00e7
        L_0x00c2:
            java.lang.String r2 = r3.t()     // Catch:{ all -> 0x0cfb }
            boolean r2 = r8.equals(r2)     // Catch:{ all -> 0x0cfb }
            if (r2 != 0) goto L_0x00e7
            g.e.a.b.f.b.q9 r23 = r43.Q()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.p9 r2 = r1.D     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.f4 r6 = r4.a     // Catch:{ all -> 0x0cfb }
            java.lang.String r25 = r6.B1()     // Catch:{ all -> 0x0cfb }
            r26 = 11
            java.lang.String r27 = "_ev"
            java.lang.String r28 = r3.t()     // Catch:{ all -> 0x0cfb }
            r29 = 0
            r24 = r2
            r23.z(r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x0cfb }
        L_0x00e7:
            r7 = r10
            r9 = r16
            r11 = r22
            r10 = r5
            r5 = -1
            goto L_0x052a
        L_0x00f0:
            java.lang.String r2 = r3.t()     // Catch:{ all -> 0x0cfb }
            java.lang.String r11 = g.e.a.b.f.b.k5.a(r18)     // Catch:{ all -> 0x0cfb }
            boolean r2 = r2.equals(r11)     // Catch:{ all -> 0x0cfb }
            if (r2 == 0) goto L_0x016a
            r2 = r18
            r3.q(r2)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.f3 r11 = r43.d()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.d3 r11 = r11.q()     // Catch:{ all -> 0x0cfb }
            r18 = r2
            java.lang.String r2 = "Renaming ad_impression to _ai"
            r11.a(r2)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.f3 r2 = r43.d()     // Catch:{ all -> 0x0cfb }
            java.lang.String r2 = r2.w()     // Catch:{ all -> 0x0cfb }
            r11 = 5
            boolean r2 = android.util.Log.isLoggable(r2, r11)     // Catch:{ all -> 0x0cfb }
            if (r2 == 0) goto L_0x016a
            r2 = 0
        L_0x0122:
            int r11 = r3.l()     // Catch:{ all -> 0x0cfb }
            if (r2 >= r11) goto L_0x016a
            java.lang.String r11 = "ad_platform"
            g.e.a.b.e.c.z3 r23 = r3.s(r2)     // Catch:{ all -> 0x0cfb }
            r24 = r10
            java.lang.String r10 = r23.y()     // Catch:{ all -> 0x0cfb }
            boolean r10 = r11.equals(r10)     // Catch:{ all -> 0x0cfb }
            if (r10 == 0) goto L_0x0165
            g.e.a.b.e.c.z3 r10 = r3.s(r2)     // Catch:{ all -> 0x0cfb }
            java.lang.String r10 = r10.z()     // Catch:{ all -> 0x0cfb }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0cfb }
            if (r10 != 0) goto L_0x0165
            java.lang.String r10 = "admob"
            g.e.a.b.e.c.z3 r11 = r3.s(r2)     // Catch:{ all -> 0x0cfb }
            java.lang.String r11 = r11.z()     // Catch:{ all -> 0x0cfb }
            boolean r10 = r10.equalsIgnoreCase(r11)     // Catch:{ all -> 0x0cfb }
            if (r10 == 0) goto L_0x0165
            g.e.a.b.f.b.f3 r10 = r43.d()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.d3 r10 = r10.s()     // Catch:{ all -> 0x0cfb }
            java.lang.String r11 = "AdMob ad impression logged from app. Potentially duplicative."
            r10.a(r11)     // Catch:{ all -> 0x0cfb }
        L_0x0165:
            int r2 = r2 + 1
            r10 = r24
            goto L_0x0122
        L_0x016a:
            r24 = r10
            g.e.a.b.f.b.g4 r2 = r1.a     // Catch:{ all -> 0x0cfb }
            I(r2)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.f4 r10 = r4.a     // Catch:{ all -> 0x0cfb }
            java.lang.String r10 = r10.B1()     // Catch:{ all -> 0x0cfb }
            java.lang.String r11 = r3.t()     // Catch:{ all -> 0x0cfb }
            boolean r2 = r2.q(r10, r11)     // Catch:{ all -> 0x0cfb }
            java.lang.String r10 = "_c"
            if (r2 != 0) goto L_0x01d8
            g.e.a.b.f.b.m9 r11 = r1.f3233g     // Catch:{ all -> 0x0cfb }
            I(r11)     // Catch:{ all -> 0x0cfb }
            java.lang.String r11 = r3.t()     // Catch:{ all -> 0x0cfb }
            g.c.b.b.f.k(r11)     // Catch:{ all -> 0x0cfb }
            r23 = r13
            int r13 = r11.hashCode()     // Catch:{ all -> 0x0cfb }
            r25 = r12
            r12 = 94660(0x171c4, float:1.32647E-40)
            if (r13 == r12) goto L_0x01bb
            r12 = 95025(0x17331, float:1.33158E-40)
            if (r13 == r12) goto L_0x01b1
            r12 = 95027(0x17333, float:1.33161E-40)
            if (r13 == r12) goto L_0x01a7
            goto L_0x01c5
        L_0x01a7:
            java.lang.String r12 = "_ui"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x01c5
            r11 = 1
            goto L_0x01c6
        L_0x01b1:
            java.lang.String r12 = "_ug"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x01c5
            r11 = 2
            goto L_0x01c6
        L_0x01bb:
            java.lang.String r12 = "_in"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x01c5
            r11 = 0
            goto L_0x01c6
        L_0x01c5:
            r11 = -1
        L_0x01c6:
            if (r11 == 0) goto L_0x01dc
            r12 = 1
            if (r11 == r12) goto L_0x01dc
            r12 = 2
            if (r11 == r12) goto L_0x01dc
            r27 = r5
            r26 = r7
            r7 = r14
            r19 = r15
            r2 = 0
            goto L_0x0396
        L_0x01d8:
            r25 = r12
            r23 = r13
        L_0x01dc:
            r26 = r7
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x01e1:
            int r7 = r3.l()     // Catch:{ all -> 0x0cfb }
            r27 = r5
            java.lang.String r5 = "_r"
            if (r11 >= r7) goto L_0x0248
            g.e.a.b.e.c.z3 r7 = r3.s(r11)     // Catch:{ all -> 0x0cfb }
            java.lang.String r7 = r7.y()     // Catch:{ all -> 0x0cfb }
            boolean r7 = r10.equals(r7)     // Catch:{ all -> 0x0cfb }
            if (r7 == 0) goto L_0x0216
            g.e.a.b.e.c.z3 r5 = r3.s(r11)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.l7 r5 = r5.n()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.y3 r5 = (g.e.a.b.e.c.y3) r5     // Catch:{ all -> 0x0cfb }
            r7 = r14
            r19 = r15
            r14 = 1
            r5.l(r14)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.o7 r5 = r5.j()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.z3 r5 = (g.e.a.b.e.c.z3) r5     // Catch:{ all -> 0x0cfb }
            r3.r(r11, r5)     // Catch:{ all -> 0x0cfb }
            r12 = 1
            goto L_0x0240
        L_0x0216:
            r7 = r14
            r19 = r15
            g.e.a.b.e.c.z3 r14 = r3.s(r11)     // Catch:{ all -> 0x0cfb }
            java.lang.String r14 = r14.y()     // Catch:{ all -> 0x0cfb }
            boolean r5 = r5.equals(r14)     // Catch:{ all -> 0x0cfb }
            if (r5 == 0) goto L_0x0240
            g.e.a.b.e.c.z3 r5 = r3.s(r11)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.l7 r5 = r5.n()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.y3 r5 = (g.e.a.b.e.c.y3) r5     // Catch:{ all -> 0x0cfb }
            r13 = 1
            r5.l(r13)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.o7 r5 = r5.j()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.z3 r5 = (g.e.a.b.e.c.z3) r5     // Catch:{ all -> 0x0cfb }
            r3.r(r11, r5)     // Catch:{ all -> 0x0cfb }
            r13 = 1
        L_0x0240:
            int r11 = r11 + 1
            r14 = r7
            r15 = r19
            r5 = r27
            goto L_0x01e1
        L_0x0248:
            r7 = r14
            r19 = r15
            if (r12 != 0) goto L_0x0279
            if (r2 == 0) goto L_0x0279
            g.e.a.b.f.b.f3 r11 = r43.d()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.d3 r11 = r11.q()     // Catch:{ all -> 0x0cfb }
            java.lang.String r12 = "Marking event as conversion"
            g.e.a.b.f.b.n4 r14 = r1.f3238l     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.a3 r14 = r14.s()     // Catch:{ all -> 0x0cfb }
            java.lang.String r15 = r3.t()     // Catch:{ all -> 0x0cfb }
            java.lang.String r14 = r14.d(r15)     // Catch:{ all -> 0x0cfb }
            r11.b(r12, r14)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.y3 r11 = g.e.a.b.e.c.z3.w()     // Catch:{ all -> 0x0cfb }
            r11.m(r10)     // Catch:{ all -> 0x0cfb }
            r14 = 1
            r11.l(r14)     // Catch:{ all -> 0x0cfb }
            r3.o(r11)     // Catch:{ all -> 0x0cfb }
        L_0x0279:
            if (r13 != 0) goto L_0x02a5
            g.e.a.b.f.b.f3 r11 = r43.d()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.d3 r11 = r11.q()     // Catch:{ all -> 0x0cfb }
            java.lang.String r12 = "Marking event as real-time"
            g.e.a.b.f.b.n4 r13 = r1.f3238l     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.a3 r13 = r13.s()     // Catch:{ all -> 0x0cfb }
            java.lang.String r14 = r3.t()     // Catch:{ all -> 0x0cfb }
            java.lang.String r13 = r13.d(r14)     // Catch:{ all -> 0x0cfb }
            r11.b(r12, r13)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.y3 r11 = g.e.a.b.e.c.z3.w()     // Catch:{ all -> 0x0cfb }
            r11.m(r5)     // Catch:{ all -> 0x0cfb }
            r12 = 1
            r11.l(r12)     // Catch:{ all -> 0x0cfb }
            r3.o(r11)     // Catch:{ all -> 0x0cfb }
        L_0x02a5:
            g.e.a.b.f.b.k r11 = r1.c     // Catch:{ all -> 0x0cfb }
            I(r11)     // Catch:{ all -> 0x0cfb }
            long r29 = r43.x()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.f4 r12 = r4.a     // Catch:{ all -> 0x0cfb }
            java.lang.String r31 = r12.B1()     // Catch:{ all -> 0x0cfb }
            r32 = 0
            r33 = 1
            r28 = r11
            g.e.a.b.f.b.i r11 = r28.E(r29, r31, r32, r33)     // Catch:{ all -> 0x0cfb }
            long r11 = r11.f3191e     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.f r13 = r43.K()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.f4 r14 = r4.a     // Catch:{ all -> 0x0cfb }
            java.lang.String r14 = r14.B1()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.r2 r15 = g.e.a.b.f.b.s2.o     // Catch:{ all -> 0x0cfb }
            int r13 = r13.n(r14, r15)     // Catch:{ all -> 0x0cfb }
            long r13 = (long) r13     // Catch:{ all -> 0x0cfb }
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 <= 0) goto L_0x02d9
            y(r3, r5)     // Catch:{ all -> 0x0cfb }
            goto L_0x02db
        L_0x02d9:
            r16 = 1
        L_0x02db:
            java.lang.String r5 = r3.t()     // Catch:{ all -> 0x0cfb }
            boolean r5 = g.e.a.b.f.b.q9.V(r5)     // Catch:{ all -> 0x0cfb }
            if (r5 == 0) goto L_0x0396
            if (r2 == 0) goto L_0x0396
            g.e.a.b.f.b.k r5 = r1.c     // Catch:{ all -> 0x0cfb }
            I(r5)     // Catch:{ all -> 0x0cfb }
            long r29 = r43.x()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.f4 r11 = r4.a     // Catch:{ all -> 0x0cfb }
            java.lang.String r31 = r11.B1()     // Catch:{ all -> 0x0cfb }
            r32 = 1
            r33 = 0
            r28 = r5
            g.e.a.b.f.b.i r5 = r28.E(r29, r31, r32, r33)     // Catch:{ all -> 0x0cfb }
            long r11 = r5.c     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.f r5 = r43.K()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.f4 r13 = r4.a     // Catch:{ all -> 0x0cfb }
            java.lang.String r13 = r13.B1()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.r2 r14 = g.e.a.b.f.b.s2.n     // Catch:{ all -> 0x0cfb }
            int r5 = r5.n(r13, r14)     // Catch:{ all -> 0x0cfb }
            long r13 = (long) r5     // Catch:{ all -> 0x0cfb }
            int r5 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r5 <= 0) goto L_0x0396
            g.e.a.b.f.b.f3 r5 = r43.d()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.d3 r5 = r5.r()     // Catch:{ all -> 0x0cfb }
            java.lang.String r11 = "Too many conversions. Not logging as conversion. appId"
            g.e.a.b.e.c.f4 r12 = r4.a     // Catch:{ all -> 0x0cfb }
            java.lang.String r12 = r12.B1()     // Catch:{ all -> 0x0cfb }
            java.lang.Object r12 = g.e.a.b.f.b.f3.t(r12)     // Catch:{ all -> 0x0cfb }
            r5.b(r11, r12)     // Catch:{ all -> 0x0cfb }
            r5 = 0
            r11 = 0
            r12 = 0
            r13 = -1
        L_0x0332:
            int r14 = r3.l()     // Catch:{ all -> 0x0cfb }
            if (r11 >= r14) goto L_0x035c
            g.e.a.b.e.c.z3 r14 = r3.s(r11)     // Catch:{ all -> 0x0cfb }
            java.lang.String r15 = r14.y()     // Catch:{ all -> 0x0cfb }
            boolean r15 = r10.equals(r15)     // Catch:{ all -> 0x0cfb }
            if (r15 == 0) goto L_0x034e
            g.e.a.b.e.c.l7 r5 = r14.n()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.y3 r5 = (g.e.a.b.e.c.y3) r5     // Catch:{ all -> 0x0cfb }
            r13 = r11
            goto L_0x0359
        L_0x034e:
            java.lang.String r14 = r14.y()     // Catch:{ all -> 0x0cfb }
            boolean r14 = r8.equals(r14)     // Catch:{ all -> 0x0cfb }
            if (r14 == 0) goto L_0x0359
            r12 = 1
        L_0x0359:
            int r11 = r11 + 1
            goto L_0x0332
        L_0x035c:
            if (r12 == 0) goto L_0x0365
            if (r5 == 0) goto L_0x0364
            r3.p(r13)     // Catch:{ all -> 0x0cfb }
            goto L_0x0396
        L_0x0364:
            r5 = 0
        L_0x0365:
            if (r5 == 0) goto L_0x037f
            g.e.a.b.e.c.l7 r5 = r5.clone()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.y3 r5 = (g.e.a.b.e.c.y3) r5     // Catch:{ all -> 0x0cfb }
            r5.m(r8)     // Catch:{ all -> 0x0cfb }
            r11 = 10
            r5.l(r11)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.o7 r5 = r5.j()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.z3 r5 = (g.e.a.b.e.c.z3) r5     // Catch:{ all -> 0x0cfb }
            r3.r(r13, r5)     // Catch:{ all -> 0x0cfb }
            goto L_0x0396
        L_0x037f:
            g.e.a.b.f.b.f3 r5 = r43.d()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.d3 r5 = r5.p()     // Catch:{ all -> 0x0cfb }
            java.lang.String r8 = "Did not find conversion parameter. appId"
            g.e.a.b.e.c.f4 r11 = r4.a     // Catch:{ all -> 0x0cfb }
            java.lang.String r11 = r11.B1()     // Catch:{ all -> 0x0cfb }
            java.lang.Object r11 = g.e.a.b.f.b.f3.t(r11)     // Catch:{ all -> 0x0cfb }
            r5.b(r8, r11)     // Catch:{ all -> 0x0cfb }
        L_0x0396:
            if (r2 == 0) goto L_0x044f
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0cfb }
            java.util.List r5 = r3.u()     // Catch:{ all -> 0x0cfb }
            r2.<init>(r5)     // Catch:{ all -> 0x0cfb }
            r5 = 0
            r8 = -1
            r11 = -1
        L_0x03a4:
            int r12 = r2.size()     // Catch:{ all -> 0x0cfb }
            java.lang.String r13 = "currency"
            java.lang.String r14 = "value"
            if (r5 >= r12) goto L_0x03d4
            java.lang.Object r12 = r2.get(r5)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.z3 r12 = (g.e.a.b.e.c.z3) r12     // Catch:{ all -> 0x0cfb }
            java.lang.String r12 = r12.y()     // Catch:{ all -> 0x0cfb }
            boolean r12 = r14.equals(r12)     // Catch:{ all -> 0x0cfb }
            if (r12 == 0) goto L_0x03c0
            r8 = r5
            goto L_0x03d1
        L_0x03c0:
            java.lang.Object r12 = r2.get(r5)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.z3 r12 = (g.e.a.b.e.c.z3) r12     // Catch:{ all -> 0x0cfb }
            java.lang.String r12 = r12.y()     // Catch:{ all -> 0x0cfb }
            boolean r12 = r13.equals(r12)     // Catch:{ all -> 0x0cfb }
            if (r12 == 0) goto L_0x03d1
            r11 = r5
        L_0x03d1:
            int r5 = r5 + 1
            goto L_0x03a4
        L_0x03d4:
            r5 = -1
            if (r8 != r5) goto L_0x03d9
            goto L_0x0450
        L_0x03d9:
            java.lang.Object r5 = r2.get(r8)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.z3 r5 = (g.e.a.b.e.c.z3) r5     // Catch:{ all -> 0x0cfb }
            boolean r5 = r5.N()     // Catch:{ all -> 0x0cfb }
            if (r5 != 0) goto L_0x040a
            java.lang.Object r5 = r2.get(r8)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.z3 r5 = (g.e.a.b.e.c.z3) r5     // Catch:{ all -> 0x0cfb }
            boolean r5 = r5.L()     // Catch:{ all -> 0x0cfb }
            if (r5 != 0) goto L_0x040a
            g.e.a.b.f.b.f3 r2 = r43.d()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.d3 r2 = r2.s()     // Catch:{ all -> 0x0cfb }
            java.lang.String r5 = "Value must be specified with a numeric type."
            r2.a(r5)     // Catch:{ all -> 0x0cfb }
            r3.p(r8)     // Catch:{ all -> 0x0cfb }
            y(r3, r10)     // Catch:{ all -> 0x0cfb }
            r2 = 18
            w(r3, r2, r14)     // Catch:{ all -> 0x0cfb }
            goto L_0x044f
        L_0x040a:
            r5 = -1
            if (r11 != r5) goto L_0x040e
            goto L_0x0436
        L_0x040e:
            java.lang.Object r2 = r2.get(r11)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.z3 r2 = (g.e.a.b.e.c.z3) r2     // Catch:{ all -> 0x0cfb }
            java.lang.String r2 = r2.z()     // Catch:{ all -> 0x0cfb }
            int r11 = r2.length()     // Catch:{ all -> 0x0cfb }
            r12 = 3
            if (r11 != r12) goto L_0x0436
            r11 = 0
        L_0x0420:
            int r12 = r2.length()     // Catch:{ all -> 0x0cfb }
            if (r11 >= r12) goto L_0x0450
            int r12 = r2.codePointAt(r11)     // Catch:{ all -> 0x0cfb }
            boolean r14 = java.lang.Character.isLetter(r12)     // Catch:{ all -> 0x0cfb }
            if (r14 == 0) goto L_0x0436
            int r12 = java.lang.Character.charCount(r12)     // Catch:{ all -> 0x0cfb }
            int r11 = r11 + r12
            goto L_0x0420
        L_0x0436:
            g.e.a.b.f.b.f3 r2 = r43.d()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.d3 r2 = r2.s()     // Catch:{ all -> 0x0cfb }
            java.lang.String r11 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.a(r11)     // Catch:{ all -> 0x0cfb }
            r3.p(r8)     // Catch:{ all -> 0x0cfb }
            y(r3, r10)     // Catch:{ all -> 0x0cfb }
            r2 = 19
            w(r3, r2, r13)     // Catch:{ all -> 0x0cfb }
            goto L_0x0450
        L_0x044f:
            r5 = -1
        L_0x0450:
            java.lang.String r2 = r3.t()     // Catch:{ all -> 0x0cfb }
            boolean r2 = r9.equals(r2)     // Catch:{ all -> 0x0cfb }
            r8 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x04b4
            g.e.a.b.f.b.m9 r2 = r1.f3233g     // Catch:{ all -> 0x0cfb }
            I(r2)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.o7 r2 = r3.j()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.v3 r2 = (g.e.a.b.e.c.v3) r2     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.z3 r2 = g.e.a.b.f.b.m9.m(r2, r6)     // Catch:{ all -> 0x0cfb }
            if (r2 != 0) goto L_0x04af
            if (r7 == 0) goto L_0x04a4
            long r10 = r7.n()     // Catch:{ all -> 0x0cfb }
            long r12 = r3.n()     // Catch:{ all -> 0x0cfb }
            long r10 = r10 - r12
            long r10 = java.lang.Math.abs(r10)     // Catch:{ all -> 0x0cfb }
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x04a4
            g.e.a.b.e.c.l7 r2 = r7.clone()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.u3 r2 = (g.e.a.b.e.c.u3) r2     // Catch:{ all -> 0x0cfb }
            boolean r6 = r1.G(r3, r2)     // Catch:{ all -> 0x0cfb }
            if (r6 == 0) goto L_0x0498
            r6 = r19
            r10 = r27
            r10.A(r6, r2)     // Catch:{ all -> 0x0cfb }
            r13 = r23
            r2 = 0
            r14 = 0
            goto L_0x04a0
        L_0x0498:
            r6 = r19
            r10 = r27
            r2 = r3
            r14 = r7
            r13 = r22
        L_0x04a0:
            r12 = r2
            r15 = r6
            goto L_0x0516
        L_0x04a4:
            r6 = r19
            r10 = r27
            r12 = r3
            r15 = r6
            r14 = r7
            r13 = r22
            goto L_0x0516
        L_0x04af:
            r6 = r19
            r10 = r27
            goto L_0x050f
        L_0x04b4:
            r6 = r19
            r10 = r27
            java.lang.String r2 = "_vs"
            java.lang.String r11 = r3.t()     // Catch:{ all -> 0x0cfb }
            boolean r2 = r2.equals(r11)     // Catch:{ all -> 0x0cfb }
            if (r2 == 0) goto L_0x050f
            g.e.a.b.f.b.m9 r2 = r1.f3233g     // Catch:{ all -> 0x0cfb }
            I(r2)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.o7 r2 = r3.j()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.v3 r2 = (g.e.a.b.e.c.v3) r2     // Catch:{ all -> 0x0cfb }
            r11 = r26
            g.e.a.b.e.c.z3 r2 = g.e.a.b.f.b.m9.m(r2, r11)     // Catch:{ all -> 0x0cfb }
            if (r2 != 0) goto L_0x050f
            if (r25 == 0) goto L_0x0509
            long r11 = r25.n()     // Catch:{ all -> 0x0cfb }
            long r13 = r3.n()     // Catch:{ all -> 0x0cfb }
            long r11 = r11 - r13
            long r11 = java.lang.Math.abs(r11)     // Catch:{ all -> 0x0cfb }
            int r2 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x0509
            g.e.a.b.e.c.l7 r2 = r25.clone()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.u3 r2 = (g.e.a.b.e.c.u3) r2     // Catch:{ all -> 0x0cfb }
            boolean r7 = r1.G(r2, r3)     // Catch:{ all -> 0x0cfb }
            if (r7 == 0) goto L_0x04ff
            r8 = r23
            r10.A(r8, r2)     // Catch:{ all -> 0x0cfb }
            r15 = r6
            r2 = 0
            r12 = 0
            goto L_0x0506
        L_0x04ff:
            r8 = r23
            r2 = r3
            r15 = r22
            r12 = r25
        L_0x0506:
            r14 = r2
            r13 = r8
            goto L_0x0516
        L_0x0509:
            r8 = r23
            r14 = r3
            r15 = r22
            goto L_0x0513
        L_0x050f:
            r8 = r23
            r15 = r6
            r14 = r7
        L_0x0513:
            r13 = r8
            r12 = r25
        L_0x0516:
            java.util.List r2 = r4.c     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.o7 r6 = r3.j()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.v3 r6 = (g.e.a.b.e.c.v3) r6     // Catch:{ all -> 0x0cfb }
            r7 = r24
            r2.set(r7, r6)     // Catch:{ all -> 0x0cfb }
            int r11 = r22 + 1
            r10.f0(r3)     // Catch:{ all -> 0x0cfb }
            r9 = r16
        L_0x052a:
            int r2 = r7 + 1
            r5 = r10
            r3 = r18
            r10 = r2
            r2 = r17
            goto L_0x003f
        L_0x0534:
            r10 = r5
            r22 = r11
            r11 = r7
            r2 = 0
            r12 = r2
            r7 = r22
            r5 = 0
        L_0x053e:
            if (r5 >= r7) goto L_0x058e
            g.e.a.b.e.c.v3 r8 = r10.b0(r5)     // Catch:{ all -> 0x0cfb }
            java.lang.String r14 = r8.z()     // Catch:{ all -> 0x0cfb }
            boolean r14 = r9.equals(r14)     // Catch:{ all -> 0x0cfb }
            if (r14 == 0) goto L_0x0561
            g.e.a.b.f.b.m9 r14 = r1.f3233g     // Catch:{ all -> 0x0cfb }
            I(r14)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.z3 r14 = g.e.a.b.f.b.m9.m(r8, r6)     // Catch:{ all -> 0x0cfb }
            if (r14 == 0) goto L_0x0561
            r10.s0(r5)     // Catch:{ all -> 0x0cfb }
            int r7 = r7 + -1
            int r5 = r5 + -1
            goto L_0x058b
        L_0x0561:
            g.e.a.b.f.b.m9 r14 = r1.f3233g     // Catch:{ all -> 0x0cfb }
            I(r14)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.z3 r8 = g.e.a.b.f.b.m9.m(r8, r11)     // Catch:{ all -> 0x0cfb }
            if (r8 == 0) goto L_0x058b
            boolean r14 = r8.N()     // Catch:{ all -> 0x0cfb }
            if (r14 == 0) goto L_0x057b
            long r14 = r8.v()     // Catch:{ all -> 0x0cfb }
            java.lang.Long r8 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0cfb }
            goto L_0x057c
        L_0x057b:
            r8 = 0
        L_0x057c:
            if (r8 == 0) goto L_0x058b
            long r14 = r8.longValue()     // Catch:{ all -> 0x0cfb }
            int r18 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r18 <= 0) goto L_0x058b
            long r14 = r8.longValue()     // Catch:{ all -> 0x0cfb }
            long r12 = r12 + r14
        L_0x058b:
            r8 = 1
            int r5 = r5 + r8
            goto L_0x053e
        L_0x058e:
            r5 = 0
            r1.C(r10, r12, r5)     // Catch:{ all -> 0x0cfb }
            java.util.List r5 = r10.W()     // Catch:{ all -> 0x0cfb }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0cfb }
        L_0x059a:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0cfb }
            java.lang.String r7 = "_se"
            if (r6 == 0) goto L_0x05c0
            java.lang.String r6 = "_s"
            java.lang.Object r8 = r5.next()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.v3 r8 = (g.e.a.b.e.c.v3) r8     // Catch:{ all -> 0x0cfb }
            java.lang.String r8 = r8.z()     // Catch:{ all -> 0x0cfb }
            boolean r6 = r6.equals(r8)     // Catch:{ all -> 0x0cfb }
            if (r6 == 0) goto L_0x059a
            g.e.a.b.f.b.k r5 = r1.c     // Catch:{ all -> 0x0cfb }
            I(r5)     // Catch:{ all -> 0x0cfb }
            java.lang.String r6 = r10.U()     // Catch:{ all -> 0x0cfb }
            r5.l(r6, r7)     // Catch:{ all -> 0x0cfb }
        L_0x05c0:
            java.lang.String r5 = "_sid"
            int r5 = g.e.a.b.f.b.m9.v(r10, r5)     // Catch:{ all -> 0x0cfb }
            if (r5 < 0) goto L_0x05cd
            r5 = 1
            r1.C(r10, r12, r5)     // Catch:{ all -> 0x0cfb }
            goto L_0x05ed
        L_0x05cd:
            int r5 = g.e.a.b.f.b.m9.v(r10, r7)     // Catch:{ all -> 0x0cfb }
            if (r5 < 0) goto L_0x05ed
            r10.t0(r5)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.f3 r5 = r43.d()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.d3 r5 = r5.p()     // Catch:{ all -> 0x0cfb }
            java.lang.String r6 = "Session engagement user property is in the bundle without session ID. appId"
            g.e.a.b.e.c.f4 r7 = r4.a     // Catch:{ all -> 0x0cfb }
            java.lang.String r7 = r7.B1()     // Catch:{ all -> 0x0cfb }
            java.lang.Object r7 = g.e.a.b.f.b.f3.t(r7)     // Catch:{ all -> 0x0cfb }
            r5.b(r6, r7)     // Catch:{ all -> 0x0cfb }
        L_0x05ed:
            g.e.a.b.f.b.m9 r5 = r1.f3233g     // Catch:{ all -> 0x0cfb }
            I(r5)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.n4 r6 = r5.a     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.f3 r6 = r6.d()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.d3 r6 = r6.q()     // Catch:{ all -> 0x0cfb }
            java.lang.String r7 = "Checking account type status for ad personalization signals"
            r6.a(r7)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.k9 r6 = r5.b     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.g4 r6 = r6.a     // Catch:{ all -> 0x0cfb }
            I(r6)     // Catch:{ all -> 0x0cfb }
            java.lang.String r7 = r10.U()     // Catch:{ all -> 0x0cfb }
            boolean r6 = r6.n(r7)     // Catch:{ all -> 0x0cfb }
            if (r6 == 0) goto L_0x0684
            g.e.a.b.f.b.k9 r6 = r5.b     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.k r6 = r6.c     // Catch:{ all -> 0x0cfb }
            I(r6)     // Catch:{ all -> 0x0cfb }
            java.lang.String r7 = r10.U()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.w4 r6 = r6.C(r7)     // Catch:{ all -> 0x0cfb }
            if (r6 == 0) goto L_0x0684
            boolean r6 = r6.y()     // Catch:{ all -> 0x0cfb }
            if (r6 == 0) goto L_0x0684
            g.e.a.b.f.b.n4 r6 = r5.a     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.n r6 = r6.p()     // Catch:{ all -> 0x0cfb }
            boolean r6 = r6.r()     // Catch:{ all -> 0x0cfb }
            if (r6 == 0) goto L_0x0684
            g.e.a.b.f.b.n4 r6 = r5.a     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.f3 r6 = r6.d()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.d3 r6 = r6.o()     // Catch:{ all -> 0x0cfb }
            java.lang.String r7 = "Turning off ad personalization due to account type"
            r6.a(r7)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.o4 r6 = g.e.a.b.e.c.p4.v()     // Catch:{ all -> 0x0cfb }
            r7 = r17
            r6.m(r7)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.n4 r5 = r5.a     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.n r5 = r5.p()     // Catch:{ all -> 0x0cfb }
            long r8 = r5.o()     // Catch:{ all -> 0x0cfb }
            r6.n(r8)     // Catch:{ all -> 0x0cfb }
            r8 = 1
            r6.l(r8)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.o7 r5 = r6.j()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.p4 r5 = (g.e.a.b.e.c.p4) r5     // Catch:{ all -> 0x0cfb }
            r6 = 0
        L_0x0666:
            int r8 = r10.Y()     // Catch:{ all -> 0x0cfb }
            if (r6 >= r8) goto L_0x0681
            g.e.a.b.e.c.p4 r8 = r10.T(r6)     // Catch:{ all -> 0x0cfb }
            java.lang.String r8 = r8.x()     // Catch:{ all -> 0x0cfb }
            boolean r8 = r7.equals(r8)     // Catch:{ all -> 0x0cfb }
            if (r8 == 0) goto L_0x067e
            r10.R(r6, r5)     // Catch:{ all -> 0x0cfb }
            goto L_0x0684
        L_0x067e:
            int r6 = r6 + 1
            goto L_0x0666
        L_0x0681:
            r10.h0(r5)     // Catch:{ all -> 0x0cfb }
        L_0x0684:
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10.P(r5)     // Catch:{ all -> 0x0cfb }
            r5 = -9223372036854775808
            r10.z(r5)     // Catch:{ all -> 0x0cfb }
            r5 = 0
        L_0x0692:
            int r6 = r10.L()     // Catch:{ all -> 0x0cfb }
            if (r5 >= r6) goto L_0x06c5
            g.e.a.b.e.c.v3 r6 = r10.b0(r5)     // Catch:{ all -> 0x0cfb }
            long r7 = r6.v()     // Catch:{ all -> 0x0cfb }
            long r11 = r10.a0()     // Catch:{ all -> 0x0cfb }
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r9 >= 0) goto L_0x06af
            long r7 = r6.v()     // Catch:{ all -> 0x0cfb }
            r10.P(r7)     // Catch:{ all -> 0x0cfb }
        L_0x06af:
            long r7 = r6.v()     // Catch:{ all -> 0x0cfb }
            long r11 = r10.Z()     // Catch:{ all -> 0x0cfb }
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r9 <= 0) goto L_0x06c2
            long r6 = r6.v()     // Catch:{ all -> 0x0cfb }
            r10.z(r6)     // Catch:{ all -> 0x0cfb }
        L_0x06c2:
            int r5 = r5 + 1
            goto L_0x0692
        L_0x06c5:
            r10.r0()     // Catch:{ all -> 0x0cfb }
            r10.j0()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.ca r5 = r1.f3232f     // Catch:{ all -> 0x0cfb }
            I(r5)     // Catch:{ all -> 0x0cfb }
            java.lang.String r23 = r10.U()     // Catch:{ all -> 0x0cfb }
            java.util.List r24 = r10.W()     // Catch:{ all -> 0x0cfb }
            java.util.List r25 = r10.X()     // Catch:{ all -> 0x0cfb }
            long r6 = r10.a0()     // Catch:{ all -> 0x0cfb }
            java.lang.Long r26 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0cfb }
            long r6 = r10.Z()     // Catch:{ all -> 0x0cfb }
            java.lang.Long r27 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0cfb }
            r22 = r5
            java.util.List r5 = r22.l(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x0cfb }
            r10.c0(r5)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.f r5 = r43.K()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.f4 r6 = r4.a     // Catch:{ all -> 0x0cfb }
            java.lang.String r6 = r6.B1()     // Catch:{ all -> 0x0cfb }
            boolean r5 = r5.x(r6)     // Catch:{ all -> 0x0cfb }
            if (r5 == 0) goto L_0x0a37
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ all -> 0x0cfb }
            r5.<init>()     // Catch:{ all -> 0x0cfb }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0cfb }
            r6.<init>()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.q9 r7 = r43.Q()     // Catch:{ all -> 0x0cfb }
            java.security.SecureRandom r7 = r7.s()     // Catch:{ all -> 0x0cfb }
            r8 = 0
        L_0x0718:
            int r9 = r10.L()     // Catch:{ all -> 0x0cfb }
            if (r8 >= r9) goto L_0x0a01
            g.e.a.b.e.c.v3 r9 = r10.b0(r8)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.l7 r9 = r9.n()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.u3 r9 = (g.e.a.b.e.c.u3) r9     // Catch:{ all -> 0x0cfb }
            java.lang.String r11 = r9.t()     // Catch:{ all -> 0x0cfb }
            java.lang.String r12 = "_ep"
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0cfb }
            java.lang.String r12 = "_efs"
            java.lang.String r13 = "_sr"
            if (r11 == 0) goto L_0x07ab
            g.e.a.b.f.b.m9 r11 = r1.f3233g     // Catch:{ all -> 0x0cfb }
            I(r11)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.o7 r11 = r9.j()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.v3 r11 = (g.e.a.b.e.c.v3) r11     // Catch:{ all -> 0x0cfb }
            java.lang.String r14 = "_en"
            java.lang.Object r11 = g.e.a.b.f.b.m9.n(r11, r14)     // Catch:{ all -> 0x0cfb }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0cfb }
            java.lang.Object r14 = r5.get(r11)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.p r14 = (g.e.a.b.f.b.p) r14     // Catch:{ all -> 0x0cfb }
            if (r14 != 0) goto L_0x076a
            g.e.a.b.f.b.k r14 = r1.c     // Catch:{ all -> 0x0cfb }
            I(r14)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.f4 r15 = r4.a     // Catch:{ all -> 0x0cfb }
            java.lang.String r15 = r15.B1()     // Catch:{ all -> 0x0cfb }
            g.c.b.b.f.n(r11)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.p r14 = r14.G(r15, r11)     // Catch:{ all -> 0x0cfb }
            if (r14 == 0) goto L_0x076a
            r5.put(r11, r14)     // Catch:{ all -> 0x0cfb }
        L_0x076a:
            if (r14 == 0) goto L_0x0914
            java.lang.Long r11 = r14.f3285i     // Catch:{ all -> 0x0cfb }
            if (r11 != 0) goto L_0x0914
            java.lang.Long r11 = r14.f3286j     // Catch:{ all -> 0x0cfb }
            if (r11 == 0) goto L_0x0788
            long r17 = r11.longValue()     // Catch:{ all -> 0x0cfb }
            r20 = 1
            int r11 = (r17 > r20 ? 1 : (r17 == r20 ? 0 : -1))
            if (r11 <= 0) goto L_0x0788
            g.e.a.b.f.b.m9 r11 = r1.f3233g     // Catch:{ all -> 0x0cfb }
            I(r11)     // Catch:{ all -> 0x0cfb }
            java.lang.Long r11 = r14.f3286j     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.m9.N(r9, r13, r11)     // Catch:{ all -> 0x0cfb }
        L_0x0788:
            java.lang.Boolean r11 = r14.f3287k     // Catch:{ all -> 0x0cfb }
            if (r11 == 0) goto L_0x07a0
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x0cfb }
            if (r11 == 0) goto L_0x07a0
            g.e.a.b.f.b.m9 r11 = r1.f3233g     // Catch:{ all -> 0x0cfb }
            I(r11)     // Catch:{ all -> 0x0cfb }
            r13 = 1
            java.lang.Long r11 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.m9.N(r9, r12, r11)     // Catch:{ all -> 0x0cfb }
        L_0x07a0:
            g.e.a.b.e.c.o7 r11 = r9.j()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.v3 r11 = (g.e.a.b.e.c.v3) r11     // Catch:{ all -> 0x0cfb }
            r6.add(r11)     // Catch:{ all -> 0x0cfb }
            goto L_0x0914
        L_0x07ab:
            g.e.a.b.f.b.g4 r11 = r1.a     // Catch:{ all -> 0x0cfb }
            I(r11)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.f4 r14 = r4.a     // Catch:{ all -> 0x0cfb }
            java.lang.String r14 = r14.B1()     // Catch:{ all -> 0x0cfb }
            java.lang.String r15 = "measurement.account.time_zone_offset_minutes"
            java.lang.String r15 = r11.a(r14, r15)     // Catch:{ all -> 0x0cfb }
            boolean r17 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x0cfb }
            if (r17 != 0) goto L_0x07dc
            long r14 = java.lang.Long.parseLong(r15)     // Catch:{ NumberFormatException -> 0x07c7 }
            goto L_0x07de
        L_0x07c7:
            r0 = move-exception
            r15 = r0
            g.e.a.b.f.b.n4 r11 = r11.a     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.f3 r11 = r11.d()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.d3 r11 = r11.r()     // Catch:{ all -> 0x0cfb }
            java.lang.String r2 = "Unable to parse timezone offset. appId"
            java.lang.Object r3 = g.e.a.b.f.b.f3.t(r14)     // Catch:{ all -> 0x0cfb }
            r11.c(r2, r3, r15)     // Catch:{ all -> 0x0cfb }
        L_0x07dc:
            r14 = 0
        L_0x07de:
            g.e.a.b.f.b.q9 r2 = r43.Q()     // Catch:{ all -> 0x0cfb }
            r46 = r12
            long r11 = r9.n()     // Catch:{ all -> 0x0cfb }
            long r2 = r2.o0(r11, r14)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.o7 r11 = r9.j()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.v3 r11 = (g.e.a.b.e.c.v3) r11     // Catch:{ all -> 0x0cfb }
            r20 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r20)     // Catch:{ all -> 0x0cfb }
            r22 = r14
            java.lang.String r14 = "_dbg"
            boolean r15 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x0cfb }
            if (r15 != 0) goto L_0x0836
            java.util.List r11 = r11.A()     // Catch:{ all -> 0x0cfb }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0cfb }
        L_0x080a:
            boolean r15 = r11.hasNext()     // Catch:{ all -> 0x0cfb }
            if (r15 == 0) goto L_0x0836
            java.lang.Object r15 = r11.next()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.z3 r15 = (g.e.a.b.e.c.z3) r15     // Catch:{ all -> 0x0cfb }
            r24 = r11
            java.lang.String r11 = r15.y()     // Catch:{ all -> 0x0cfb }
            boolean r11 = r14.equals(r11)     // Catch:{ all -> 0x0cfb }
            if (r11 == 0) goto L_0x0833
            long r14 = r15.v()     // Catch:{ all -> 0x0cfb }
            java.lang.Long r11 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0cfb }
            boolean r11 = r12.equals(r11)     // Catch:{ all -> 0x0cfb }
            if (r11 != 0) goto L_0x0831
            goto L_0x0836
        L_0x0831:
            r11 = 1
            goto L_0x0849
        L_0x0833:
            r11 = r24
            goto L_0x080a
        L_0x0836:
            g.e.a.b.f.b.g4 r11 = r1.a     // Catch:{ all -> 0x0cfb }
            I(r11)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.f4 r12 = r4.a     // Catch:{ all -> 0x0cfb }
            java.lang.String r12 = r12.B1()     // Catch:{ all -> 0x0cfb }
            java.lang.String r14 = r9.t()     // Catch:{ all -> 0x0cfb }
            int r11 = r11.l(r12, r14)     // Catch:{ all -> 0x0cfb }
        L_0x0849:
            if (r11 > 0) goto L_0x086b
            g.e.a.b.f.b.f3 r2 = r43.d()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.d3 r2 = r2.r()     // Catch:{ all -> 0x0cfb }
            java.lang.String r3 = "Sample rate must be positive. event, rate"
            java.lang.String r12 = r9.t()     // Catch:{ all -> 0x0cfb }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0cfb }
            r2.c(r3, r12, r11)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.o7 r2 = r9.j()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.v3 r2 = (g.e.a.b.e.c.v3) r2     // Catch:{ all -> 0x0cfb }
            r6.add(r2)     // Catch:{ all -> 0x0cfb }
            goto L_0x0914
        L_0x086b:
            java.lang.String r12 = r9.t()     // Catch:{ all -> 0x0cfb }
            java.lang.Object r12 = r5.get(r12)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.p r12 = (g.e.a.b.f.b.p) r12     // Catch:{ all -> 0x0cfb }
            if (r12 != 0) goto L_0x08cb
            g.e.a.b.f.b.k r12 = r1.c     // Catch:{ all -> 0x0cfb }
            I(r12)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.f4 r14 = r4.a     // Catch:{ all -> 0x0cfb }
            java.lang.String r14 = r14.B1()     // Catch:{ all -> 0x0cfb }
            java.lang.String r15 = r9.t()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.p r12 = r12.G(r14, r15)     // Catch:{ all -> 0x0cfb }
            if (r12 != 0) goto L_0x08cb
            g.e.a.b.f.b.f3 r12 = r43.d()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.d3 r12 = r12.r()     // Catch:{ all -> 0x0cfb }
            java.lang.String r14 = "Event being bundled has no eventAggregate. appId, eventName"
            g.e.a.b.e.c.f4 r15 = r4.a     // Catch:{ all -> 0x0cfb }
            java.lang.String r15 = r15.B1()     // Catch:{ all -> 0x0cfb }
            r24 = r2
            java.lang.String r2 = r9.t()     // Catch:{ all -> 0x0cfb }
            r12.c(r14, r15, r2)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.p r2 = new g.e.a.b.f.b.p     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.f4 r3 = r4.a     // Catch:{ all -> 0x0cfb }
            java.lang.String r27 = r3.B1()     // Catch:{ all -> 0x0cfb }
            java.lang.String r28 = r9.t()     // Catch:{ all -> 0x0cfb }
            r29 = 1
            r31 = 1
            r33 = 1
            long r35 = r9.n()     // Catch:{ all -> 0x0cfb }
            r37 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r26 = r2
            r26.<init>(r27, r28, r29, r31, r33, r35, r37, r39, r40, r41, r42)     // Catch:{ all -> 0x0cfb }
            goto L_0x08ce
        L_0x08cb:
            r24 = r2
            r2 = r12
        L_0x08ce:
            g.e.a.b.f.b.m9 r3 = r1.f3233g     // Catch:{ all -> 0x0cfb }
            I(r3)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.o7 r3 = r9.j()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.v3 r3 = (g.e.a.b.e.c.v3) r3     // Catch:{ all -> 0x0cfb }
            java.lang.String r12 = "_eid"
            java.lang.Object r3 = g.e.a.b.f.b.m9.n(r3, r12)     // Catch:{ all -> 0x0cfb }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ all -> 0x0cfb }
            if (r3 == 0) goto L_0x08e5
            r12 = 1
            goto L_0x08e6
        L_0x08e5:
            r12 = 0
        L_0x08e6:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x0cfb }
            r14 = 1
            if (r11 != r14) goto L_0x0920
            g.e.a.b.e.c.o7 r3 = r9.j()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.v3 r3 = (g.e.a.b.e.c.v3) r3     // Catch:{ all -> 0x0cfb }
            r6.add(r3)     // Catch:{ all -> 0x0cfb }
            boolean r3 = r12.booleanValue()     // Catch:{ all -> 0x0cfb }
            if (r3 == 0) goto L_0x0914
            java.lang.Long r3 = r2.f3285i     // Catch:{ all -> 0x0cfb }
            if (r3 != 0) goto L_0x0908
            java.lang.Long r3 = r2.f3286j     // Catch:{ all -> 0x0cfb }
            if (r3 != 0) goto L_0x0908
            java.lang.Boolean r3 = r2.f3287k     // Catch:{ all -> 0x0cfb }
            if (r3 == 0) goto L_0x0914
        L_0x0908:
            r3 = 0
            g.e.a.b.f.b.p r2 = r2.a(r3, r3, r3)     // Catch:{ all -> 0x0cfb }
            java.lang.String r3 = r9.t()     // Catch:{ all -> 0x0cfb }
            r5.put(r3, r2)     // Catch:{ all -> 0x0cfb }
        L_0x0914:
            r10.A(r8, r9)     // Catch:{ all -> 0x0cfb }
            r25 = r4
            r24 = r7
            r2 = 1
            r7 = r5
            goto L_0x09f6
        L_0x0920:
            int r14 = r7.nextInt(r11)     // Catch:{ all -> 0x0cfb }
            if (r14 != 0) goto L_0x0961
            g.e.a.b.f.b.m9 r3 = r1.f3233g     // Catch:{ all -> 0x0cfb }
            I(r3)     // Catch:{ all -> 0x0cfb }
            long r14 = (long) r11     // Catch:{ all -> 0x0cfb }
            java.lang.Long r3 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.m9.N(r9, r13, r3)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.o7 r11 = r9.j()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.v3 r11 = (g.e.a.b.e.c.v3) r11     // Catch:{ all -> 0x0cfb }
            r6.add(r11)     // Catch:{ all -> 0x0cfb }
            boolean r11 = r12.booleanValue()     // Catch:{ all -> 0x0cfb }
            if (r11 == 0) goto L_0x0947
            r11 = 0
            g.e.a.b.f.b.p r2 = r2.a(r11, r3, r11)     // Catch:{ all -> 0x0cfb }
        L_0x0947:
            java.lang.String r3 = r9.t()     // Catch:{ all -> 0x0cfb }
            long r11 = r9.n()     // Catch:{ all -> 0x0cfb }
            r14 = r24
            g.e.a.b.f.b.p r2 = r2.b(r11, r14)     // Catch:{ all -> 0x0cfb }
            r5.put(r3, r2)     // Catch:{ all -> 0x0cfb }
            r25 = r4
            r24 = r7
            r2 = 1
            r7 = r5
            goto L_0x09f3
        L_0x0961:
            r14 = r24
            r24 = r7
            java.lang.Long r7 = r2.f3284h     // Catch:{ all -> 0x0cfb }
            if (r7 == 0) goto L_0x0976
            long r22 = r7.longValue()     // Catch:{ all -> 0x0cfb }
            r28 = r2
            r27 = r3
            r25 = r4
            r26 = r5
            goto L_0x098c
        L_0x0976:
            g.e.a.b.f.b.q9 r7 = r43.Q()     // Catch:{ all -> 0x0cfb }
            r25 = r4
            r26 = r5
            long r4 = r9.m()     // Catch:{ all -> 0x0cfb }
            r28 = r2
            r27 = r3
            r2 = r22
            long r22 = r7.o0(r4, r2)     // Catch:{ all -> 0x0cfb }
        L_0x098c:
            int r2 = (r22 > r14 ? 1 : (r22 == r14 ? 0 : -1))
            if (r2 == 0) goto L_0x09d6
            g.e.a.b.f.b.m9 r2 = r1.f3233g     // Catch:{ all -> 0x0cfb }
            I(r2)     // Catch:{ all -> 0x0cfb }
            r2 = 1
            java.lang.Long r4 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0cfb }
            r5 = r46
            g.e.a.b.f.b.m9.N(r9, r5, r4)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.m9 r4 = r1.f3233g     // Catch:{ all -> 0x0cfb }
            I(r4)     // Catch:{ all -> 0x0cfb }
            long r4 = (long) r11     // Catch:{ all -> 0x0cfb }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.m9.N(r9, r13, r4)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.o7 r5 = r9.j()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.v3 r5 = (g.e.a.b.e.c.v3) r5     // Catch:{ all -> 0x0cfb }
            r6.add(r5)     // Catch:{ all -> 0x0cfb }
            boolean r5 = r12.booleanValue()     // Catch:{ all -> 0x0cfb }
            if (r5 == 0) goto L_0x09c6
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0cfb }
            r7 = r28
            r11 = 0
            g.e.a.b.f.b.p r4 = r7.a(r11, r4, r5)     // Catch:{ all -> 0x0cfb }
            goto L_0x09c9
        L_0x09c6:
            r7 = r28
            r4 = r7
        L_0x09c9:
            java.lang.String r5 = r9.t()     // Catch:{ all -> 0x0cfb }
            long r11 = r9.n()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.p r4 = r4.b(r11, r14)     // Catch:{ all -> 0x0cfb }
            goto L_0x09eb
        L_0x09d6:
            r7 = r28
            r2 = 1
            boolean r4 = r12.booleanValue()     // Catch:{ all -> 0x0cfb }
            if (r4 == 0) goto L_0x09f1
            java.lang.String r5 = r9.t()     // Catch:{ all -> 0x0cfb }
            r4 = r27
            r11 = 0
            g.e.a.b.f.b.p r4 = r7.a(r4, r11, r11)     // Catch:{ all -> 0x0cfb }
        L_0x09eb:
            r7 = r26
            r7.put(r5, r4)     // Catch:{ all -> 0x0cfb }
            goto L_0x09f3
        L_0x09f1:
            r7 = r26
        L_0x09f3:
            r10.A(r8, r9)     // Catch:{ all -> 0x0cfb }
        L_0x09f6:
            int r8 = r8 + 1
            r5 = r7
            r7 = r24
            r4 = r25
            r2 = 0
            goto L_0x0718
        L_0x0a01:
            r25 = r4
            r7 = r5
            int r2 = r6.size()     // Catch:{ all -> 0x0cfb }
            int r3 = r10.L()     // Catch:{ all -> 0x0cfb }
            if (r2 >= r3) goto L_0x0a14
            r10.l0()     // Catch:{ all -> 0x0cfb }
            r10.d0(r6)     // Catch:{ all -> 0x0cfb }
        L_0x0a14:
            java.util.Set r2 = r7.entrySet()     // Catch:{ all -> 0x0cfb }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0cfb }
        L_0x0a1c:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0cfb }
            if (r3 == 0) goto L_0x0a39
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0cfb }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.k r4 = r1.c     // Catch:{ all -> 0x0cfb }
            I(r4)     // Catch:{ all -> 0x0cfb }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.p r3 = (g.e.a.b.f.b.p) r3     // Catch:{ all -> 0x0cfb }
            r4.o(r3)     // Catch:{ all -> 0x0cfb }
            goto L_0x0a1c
        L_0x0a37:
            r25 = r4
        L_0x0a39:
            r2 = r25
            g.e.a.b.e.c.f4 r3 = r2.a     // Catch:{ all -> 0x0cfb }
            java.lang.String r3 = r3.B1()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.k r4 = r1.c     // Catch:{ all -> 0x0cfb }
            I(r4)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.w4 r4 = r4.C(r3)     // Catch:{ all -> 0x0cfb }
            if (r4 != 0) goto L_0x0a64
            g.e.a.b.f.b.f3 r4 = r43.d()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.d3 r4 = r4.p()     // Catch:{ all -> 0x0cfb }
            java.lang.String r5 = "Bundling raw events w/o app info. appId"
            g.e.a.b.e.c.f4 r6 = r2.a     // Catch:{ all -> 0x0cfb }
            java.lang.String r6 = r6.B1()     // Catch:{ all -> 0x0cfb }
            java.lang.Object r6 = g.e.a.b.f.b.f3.t(r6)     // Catch:{ all -> 0x0cfb }
            r4.b(r5, r6)     // Catch:{ all -> 0x0cfb }
            goto L_0x0ac0
        L_0x0a64:
            int r5 = r10.L()     // Catch:{ all -> 0x0cfb }
            if (r5 <= 0) goto L_0x0ac0
            long r5 = r4.G()     // Catch:{ all -> 0x0cfb }
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0a78
            r10.I(r5)     // Catch:{ all -> 0x0cfb }
            goto L_0x0a7b
        L_0x0a78:
            r10.o0()     // Catch:{ all -> 0x0cfb }
        L_0x0a7b:
            long r7 = r4.I()     // Catch:{ all -> 0x0cfb }
            r11 = 0
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x0a86
            goto L_0x0a87
        L_0x0a86:
            r5 = r7
        L_0x0a87:
            int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r7 == 0) goto L_0x0a8f
            r10.J(r5)     // Catch:{ all -> 0x0cfb }
            goto L_0x0a92
        L_0x0a8f:
            r10.p0()     // Catch:{ all -> 0x0cfb }
        L_0x0a92:
            r4.b()     // Catch:{ all -> 0x0cfb }
            long r5 = r4.H()     // Catch:{ all -> 0x0cfb }
            int r6 = (int) r5     // Catch:{ all -> 0x0cfb }
            r10.q(r6)     // Catch:{ all -> 0x0cfb }
            long r5 = r10.a0()     // Catch:{ all -> 0x0cfb }
            r4.u(r5)     // Catch:{ all -> 0x0cfb }
            long r5 = r10.Z()     // Catch:{ all -> 0x0cfb }
            r4.r(r5)     // Catch:{ all -> 0x0cfb }
            java.lang.String r5 = r4.K()     // Catch:{ all -> 0x0cfb }
            if (r5 == 0) goto L_0x0ab5
            r10.E(r5)     // Catch:{ all -> 0x0cfb }
            goto L_0x0ab8
        L_0x0ab5:
            r10.m0()     // Catch:{ all -> 0x0cfb }
        L_0x0ab8:
            g.e.a.b.f.b.k r5 = r1.c     // Catch:{ all -> 0x0cfb }
            I(r5)     // Catch:{ all -> 0x0cfb }
            r5.n(r4)     // Catch:{ all -> 0x0cfb }
        L_0x0ac0:
            int r4 = r10.L()     // Catch:{ all -> 0x0cfb }
            if (r4 <= 0) goto L_0x0c40
            g.e.a.b.f.b.n4 r4 = r1.f3238l     // Catch:{ all -> 0x0cfb }
            r4.f()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.g4 r4 = r1.a     // Catch:{ all -> 0x0cfb }
            I(r4)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.f4 r5 = r2.a     // Catch:{ all -> 0x0cfb }
            java.lang.String r5 = r5.B1()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.j3 r4 = r4.m(r5)     // Catch:{ all -> 0x0cfb }
            r5 = -1
            if (r4 == 0) goto L_0x0aed
            boolean r7 = r4.H()     // Catch:{ all -> 0x0cfb }
            if (r7 != 0) goto L_0x0ae5
            goto L_0x0aed
        L_0x0ae5:
            long r7 = r4.u()     // Catch:{ all -> 0x0cfb }
            r10.s(r7)     // Catch:{ all -> 0x0cfb }
            goto L_0x0b14
        L_0x0aed:
            g.e.a.b.e.c.f4 r4 = r2.a     // Catch:{ all -> 0x0cfb }
            java.lang.String r4 = r4.y()     // Catch:{ all -> 0x0cfb }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0cfb }
            if (r4 == 0) goto L_0x0afd
            r10.s(r5)     // Catch:{ all -> 0x0cfb }
            goto L_0x0b14
        L_0x0afd:
            g.e.a.b.f.b.f3 r4 = r43.d()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.d3 r4 = r4.r()     // Catch:{ all -> 0x0cfb }
            java.lang.String r7 = "Did not find measurement config or missing version info. appId"
            g.e.a.b.e.c.f4 r8 = r2.a     // Catch:{ all -> 0x0cfb }
            java.lang.String r8 = r8.B1()     // Catch:{ all -> 0x0cfb }
            java.lang.Object r8 = g.e.a.b.f.b.f3.t(r8)     // Catch:{ all -> 0x0cfb }
            r4.b(r7, r8)     // Catch:{ all -> 0x0cfb }
        L_0x0b14:
            g.e.a.b.f.b.k r4 = r1.c     // Catch:{ all -> 0x0cfb }
            I(r4)     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.o7 r7 = r10.j()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.e.c.f4 r7 = (g.e.a.b.e.c.f4) r7     // Catch:{ all -> 0x0cfb }
            r4.h()     // Catch:{ all -> 0x0cfb }
            r4.i()     // Catch:{ all -> 0x0cfb }
            g.c.b.b.f.n(r7)     // Catch:{ all -> 0x0cfb }
            java.lang.String r8 = r7.B1()     // Catch:{ all -> 0x0cfb }
            g.c.b.b.f.k(r8)     // Catch:{ all -> 0x0cfb }
            boolean r8 = r7.U0()     // Catch:{ all -> 0x0cfb }
            g.c.b.b.f.q(r8)     // Catch:{ all -> 0x0cfb }
            r4.R()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.n4 r8 = r4.a     // Catch:{ all -> 0x0cfb }
            g.e.a.b.b.h.b r8 = r8.e()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.b.h.c r8 = (g.e.a.b.b.h.c) r8     // Catch:{ all -> 0x0cfb }
            long r8 = r8.a()     // Catch:{ all -> 0x0cfb }
            long r10 = r7.p1()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.n4 r12 = r4.a     // Catch:{ all -> 0x0cfb }
            r12.o()     // Catch:{ all -> 0x0cfb }
            long r12 = g.e.a.b.f.b.f.i()     // Catch:{ all -> 0x0cfb }
            long r12 = r8 - r12
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x0b6a
            long r10 = r7.p1()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.n4 r12 = r4.a     // Catch:{ all -> 0x0cfb }
            r12.o()     // Catch:{ all -> 0x0cfb }
            long r12 = g.e.a.b.f.b.f.i()     // Catch:{ all -> 0x0cfb }
            long r12 = r12 + r8
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x0b8d
        L_0x0b6a:
            g.e.a.b.f.b.n4 r10 = r4.a     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.f3 r10 = r10.d()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.d3 r10 = r10.r()     // Catch:{ all -> 0x0cfb }
            java.lang.String r11 = "Storing bundle outside of the max uploading time span. appId, now, timestamp"
            java.lang.String r12 = r7.B1()     // Catch:{ all -> 0x0cfb }
            java.lang.Object r12 = g.e.a.b.f.b.f3.t(r12)     // Catch:{ all -> 0x0cfb }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0cfb }
            long r13 = r7.p1()     // Catch:{ all -> 0x0cfb }
            java.lang.Long r9 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0cfb }
            r10.d(r11, r12, r8, r9)     // Catch:{ all -> 0x0cfb }
        L_0x0b8d:
            byte[] r8 = r7.i()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.k9 r9 = r4.b     // Catch:{ IOException -> 0x0c2a }
            g.e.a.b.f.b.m9 r9 = r9.f3233g     // Catch:{ IOException -> 0x0c2a }
            I(r9)     // Catch:{ IOException -> 0x0c2a }
            byte[] r8 = r9.M(r8)     // Catch:{ IOException -> 0x0c2a }
            g.e.a.b.f.b.n4 r9 = r4.a     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.f3 r9 = r9.d()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.d3 r9 = r9.q()     // Catch:{ all -> 0x0cfb }
            java.lang.String r10 = "Saving bundle, size"
            int r11 = r8.length     // Catch:{ all -> 0x0cfb }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0cfb }
            r9.b(r10, r11)     // Catch:{ all -> 0x0cfb }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x0cfb }
            r9.<init>()     // Catch:{ all -> 0x0cfb }
            java.lang.String r10 = "app_id"
            java.lang.String r11 = r7.B1()     // Catch:{ all -> 0x0cfb }
            r9.put(r10, r11)     // Catch:{ all -> 0x0cfb }
            java.lang.String r10 = "bundle_end_timestamp"
            long r11 = r7.p1()     // Catch:{ all -> 0x0cfb }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0cfb }
            r9.put(r10, r11)     // Catch:{ all -> 0x0cfb }
            java.lang.String r10 = "data"
            r9.put(r10, r8)     // Catch:{ all -> 0x0cfb }
            java.lang.String r8 = "has_realtime"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x0cfb }
            r9.put(r8, r10)     // Catch:{ all -> 0x0cfb }
            boolean r8 = r7.a1()     // Catch:{ all -> 0x0cfb }
            if (r8 == 0) goto L_0x0bec
            java.lang.String r8 = "retry_count"
            int r10 = r7.i1()     // Catch:{ all -> 0x0cfb }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0cfb }
            r9.put(r8, r10)     // Catch:{ all -> 0x0cfb }
        L_0x0bec:
            android.database.sqlite.SQLiteDatabase r8 = r4.A()     // Catch:{ SQLiteException -> 0x0c13 }
            java.lang.String r10 = "queue"
            r11 = 0
            long r8 = r8.insert(r10, r11, r9)     // Catch:{ SQLiteException -> 0x0c13 }
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 != 0) goto L_0x0c40
            g.e.a.b.f.b.n4 r5 = r4.a     // Catch:{ SQLiteException -> 0x0c13 }
            g.e.a.b.f.b.f3 r5 = r5.d()     // Catch:{ SQLiteException -> 0x0c13 }
            g.e.a.b.f.b.d3 r5 = r5.p()     // Catch:{ SQLiteException -> 0x0c13 }
            java.lang.String r6 = "Failed to insert bundle (got -1). appId"
            java.lang.String r8 = r7.B1()     // Catch:{ SQLiteException -> 0x0c13 }
            java.lang.Object r8 = g.e.a.b.f.b.f3.t(r8)     // Catch:{ SQLiteException -> 0x0c13 }
            r5.b(r6, r8)     // Catch:{ SQLiteException -> 0x0c13 }
            goto L_0x0c40
        L_0x0c13:
            r0 = move-exception
            r5 = r0
            g.e.a.b.f.b.n4 r4 = r4.a     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.f3 r4 = r4.d()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.d3 r4 = r4.p()     // Catch:{ all -> 0x0cfb }
            java.lang.String r6 = "Error storing bundle. appId"
            java.lang.String r7 = r7.B1()     // Catch:{ all -> 0x0cfb }
        L_0x0c25:
            java.lang.Object r7 = g.e.a.b.f.b.f3.t(r7)     // Catch:{ all -> 0x0cfb }
            goto L_0x0c3d
        L_0x0c2a:
            r0 = move-exception
            r5 = r0
            g.e.a.b.f.b.n4 r4 = r4.a     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.f3 r4 = r4.d()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.d3 r4 = r4.p()     // Catch:{ all -> 0x0cfb }
            java.lang.String r6 = "Data loss. Failed to serialize bundle. appId"
            java.lang.String r7 = r7.B1()     // Catch:{ all -> 0x0cfb }
            goto L_0x0c25
        L_0x0c3d:
            r4.c(r6, r7, r5)     // Catch:{ all -> 0x0cfb }
        L_0x0c40:
            g.e.a.b.f.b.k r4 = r1.c     // Catch:{ all -> 0x0cfb }
            I(r4)     // Catch:{ all -> 0x0cfb }
            java.util.List r2 = r2.b     // Catch:{ all -> 0x0cfb }
            g.c.b.b.f.n(r2)     // Catch:{ all -> 0x0cfb }
            r4.h()     // Catch:{ all -> 0x0cfb }
            r4.i()     // Catch:{ all -> 0x0cfb }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0cfb }
            java.lang.String r6 = "rowid in ("
            r5.<init>(r6)     // Catch:{ all -> 0x0cfb }
            r6 = 0
        L_0x0c58:
            int r7 = r2.size()     // Catch:{ all -> 0x0cfb }
            if (r6 >= r7) goto L_0x0c75
            if (r6 == 0) goto L_0x0c65
            java.lang.String r7 = ","
            r5.append(r7)     // Catch:{ all -> 0x0cfb }
        L_0x0c65:
            java.lang.Object r7 = r2.get(r6)     // Catch:{ all -> 0x0cfb }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0cfb }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0cfb }
            r5.append(r7)     // Catch:{ all -> 0x0cfb }
            int r6 = r6 + 1
            goto L_0x0c58
        L_0x0c75:
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ all -> 0x0cfb }
            android.database.sqlite.SQLiteDatabase r6 = r4.A()     // Catch:{ all -> 0x0cfb }
            java.lang.String r7 = "raw_events"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0cfb }
            r8 = 0
            int r5 = r6.delete(r7, r5, r8)     // Catch:{ all -> 0x0cfb }
            int r6 = r2.size()     // Catch:{ all -> 0x0cfb }
            if (r5 == r6) goto L_0x0caa
            g.e.a.b.f.b.n4 r4 = r4.a     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.f3 r4 = r4.d()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.d3 r4 = r4.p()     // Catch:{ all -> 0x0cfb }
            java.lang.String r6 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0cfb }
            int r2 = r2.size()     // Catch:{ all -> 0x0cfb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0cfb }
            r4.c(r6, r5, r2)     // Catch:{ all -> 0x0cfb }
        L_0x0caa:
            g.e.a.b.f.b.k r2 = r1.c     // Catch:{ all -> 0x0cfb }
            I(r2)     // Catch:{ all -> 0x0cfb }
            android.database.sqlite.SQLiteDatabase r4 = r2.A()     // Catch:{ all -> 0x0cfb }
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0cc2 }
            r6 = 0
            r5[r6] = r3     // Catch:{ SQLiteException -> 0x0cc2 }
            r6 = 1
            r5[r6] = r3     // Catch:{ SQLiteException -> 0x0cc2 }
            java.lang.String r6 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r4.execSQL(r6, r5)     // Catch:{ SQLiteException -> 0x0cc2 }
            goto L_0x0cd7
        L_0x0cc2:
            r0 = move-exception
            r4 = r0
            g.e.a.b.f.b.n4 r2 = r2.a     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.f3 r2 = r2.d()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.d3 r2 = r2.p()     // Catch:{ all -> 0x0cfb }
            java.lang.String r5 = "Failed to remove unused event metadata. appId"
            java.lang.Object r3 = g.e.a.b.f.b.f3.t(r3)     // Catch:{ all -> 0x0cfb }
            r2.c(r5, r3, r4)     // Catch:{ all -> 0x0cfb }
        L_0x0cd7:
            g.e.a.b.f.b.k r2 = r1.c     // Catch:{ all -> 0x0cfb }
            I(r2)     // Catch:{ all -> 0x0cfb }
            r2.m()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.k r2 = r1.c
            I(r2)
            r2.P()
            r2 = 1
            return r2
        L_0x0ce9:
            g.e.a.b.f.b.k r2 = r1.c     // Catch:{ all -> 0x0cfb }
            I(r2)     // Catch:{ all -> 0x0cfb }
            r2.m()     // Catch:{ all -> 0x0cfb }
            g.e.a.b.f.b.k r2 = r1.c
            I(r2)
            r2.P()
            r2 = 0
            return r2
        L_0x0cfb:
            r0 = move-exception
            r2 = r0
            g.e.a.b.f.b.k r3 = r1.c
            I(r3)
            r3.P()
            goto L_0x0d07
        L_0x0d06:
            throw r2
        L_0x0d07:
            goto L_0x0d06
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.k9.E(java.lang.String, long):boolean");
    }

    public final boolean F() {
        b().h();
        g();
        k kVar = this.c;
        I(kVar);
        if (!(kVar.v("select count(1) > 0 from raw_events", (String[]) null) != 0)) {
            k kVar2 = this.c;
            I(kVar2);
            return !TextUtils.isEmpty(kVar2.J());
        }
    }

    public final boolean G(u3 u3Var, u3 u3Var2) {
        f.g("_e".equals(u3Var.t()));
        I(this.f3233g);
        z3 m2 = m9.m((v3) u3Var.j(), "_sc");
        String str = null;
        String z2 = m2 == null ? null : m2.z();
        I(this.f3233g);
        z3 m3 = m9.m((v3) u3Var2.j(), "_pc");
        if (m3 != null) {
            str = m3.z();
        }
        if (str == null || !str.equals(z2)) {
            return false;
        }
        f.g("_e".equals(u3Var.t()));
        I(this.f3233g);
        z3 m4 = m9.m((v3) u3Var.j(), "_et");
        if (m4 == null || !m4.N() || m4.v() <= 0) {
            return true;
        }
        long v2 = m4.v();
        I(this.f3233g);
        z3 m5 = m9.m((v3) u3Var2.j(), "_et");
        if (m5 != null && m5.v() > 0) {
            v2 += m5.v();
        }
        I(this.f3233g);
        m9.N(u3Var2, "_et", Long.valueOf(v2));
        I(this.f3233g);
        m9.N(u3Var, "_fr", 1L);
        return true;
    }

    public final w4 J(zzp zzp) {
        g gVar = g.ANALYTICS_STORAGE;
        b().h();
        g();
        Objects.requireNonNull(zzp, "null reference");
        f.k(zzp.zza);
        k kVar = this.c;
        I(kVar);
        w4 C2 = kVar.C(zzp.zza);
        h c2 = L(zzp.zza).c(h.b(zzp.zzv));
        g gVar2 = g.AD_STORAGE;
        String n2 = c2.e(gVar2) ? this.f3235i.n(zzp.zza) : "";
        if (C2 == null) {
            C2 = new w4(this.f3238l, zzp.zza);
            if (c2.e(gVar)) {
                C2.f(R(c2));
            }
            if (c2.e(gVar2)) {
                C2.w(n2);
            }
        } else {
            if (c2.e(gVar2) && n2 != null) {
                C2.a.b().h();
                if (!n2.equals(C2.f3378e)) {
                    C2.w(n2);
                    ba.b();
                    f K = K();
                    r2 r2Var = s2.l0;
                    if (!K.u((String) null, r2Var) || !K().u((String) null, s2.q0) || !"00000000-0000-0000-0000-000000000000".equals(this.f3235i.m(zzp.zza, c2).first)) {
                        C2.f(R(c2));
                    }
                    ba.b();
                    if (K().u((String) null, r2Var) && !"00000000-0000-0000-0000-000000000000".equals(this.f3235i.m(zzp.zza, c2).first)) {
                        k kVar2 = this.c;
                        I(kVar2);
                        if (kVar2.H(zzp.zza, "_id") != null) {
                            k kVar3 = this.c;
                            I(kVar3);
                            if (kVar3.H(zzp.zza, "_lair") == null) {
                                Objects.requireNonNull((c) e());
                                o9 o9Var = new o9(zzp.zza, "auto", "_lair", System.currentTimeMillis(), 1L);
                                k kVar4 = this.c;
                                I(kVar4);
                                kVar4.s(o9Var);
                            }
                        }
                    }
                }
            }
            if (TextUtils.isEmpty(C2.M()) && c2.e(gVar)) {
                C2.f(R(c2));
            }
        }
        C2.o(zzp.zzb);
        C2.c(zzp.zzq);
        if (!TextUtils.isEmpty(zzp.zzk)) {
            C2.n(zzp.zzk);
        }
        long j2 = zzp.zze;
        if (j2 != 0) {
            C2.p(j2);
        }
        if (!TextUtils.isEmpty(zzp.zzc)) {
            C2.h(zzp.zzc);
        }
        C2.i(zzp.zzj);
        String str = zzp.zzd;
        if (str != null) {
            C2.g(str);
        }
        C2.k(zzp.zzf);
        C2.v(zzp.zzh);
        if (!TextUtils.isEmpty(zzp.zzg)) {
            C2.q(zzp.zzg);
        }
        if (!K().u((String) null, s2.h0)) {
            C2.e(zzp.zzl);
        }
        C2.d(zzp.zzo);
        Boolean bool = zzp.zzr;
        C2.a.b().h();
        boolean z2 = C2.C;
        Boolean bool2 = C2.s;
        C2.C = z2 | (!((bool2 == null && bool == null) ? true : bool2 == null ? false : bool2.equals(bool)));
        C2.s = bool;
        C2.l(zzp.zzs);
        xa.b();
        if (K().u((String) null, s2.v0)) {
            C2.x(zzp.zzt);
        } else {
            xa.b();
            if (K().u((String) null, s2.u0)) {
                C2.x((List) null);
            }
        }
        C2.a.b().h();
        if (C2.C) {
            k kVar5 = this.c;
            I(kVar5);
            kVar5.n(C2);
        }
        return C2;
    }

    public final f K() {
        n4 n4Var = this.f3238l;
        Objects.requireNonNull(n4Var, "null reference");
        return n4Var.f3258g;
    }

    public final h L(String str) {
        String str2;
        h hVar = h.b;
        b().h();
        g();
        h hVar2 = (h) this.A.get(str);
        if (hVar2 != null) {
            return hVar2;
        }
        k kVar = this.c;
        I(kVar);
        Objects.requireNonNull(str, "null reference");
        kVar.h();
        kVar.i();
        Cursor cursor = null;
        try {
            Cursor rawQuery = kVar.A().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
            if (rawQuery.moveToFirst()) {
                str2 = rawQuery.getString(0);
                rawQuery.close();
            } else {
                rawQuery.close();
                str2 = "G1";
            }
            h b2 = h.b(str2);
            s(str, b2);
            return b2;
        } catch (SQLiteException e2) {
            kVar.a.d().f3136f.c("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e2);
            throw e2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final k M() {
        k kVar = this.c;
        I(kVar);
        return kVar;
    }

    public final m3 N() {
        m3 m3Var = this.f3230d;
        if (m3Var != null) {
            return m3Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final m9 P() {
        m9 m9Var = this.f3233g;
        I(m9Var);
        return m9Var;
    }

    public final q9 Q() {
        n4 n4Var = this.f3238l;
        Objects.requireNonNull(n4Var, "null reference");
        return n4Var.A();
    }

    public final String R(h hVar) {
        if (!hVar.e(g.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        Q().s().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r10 = this;
            g.e.a.b.f.b.k4 r0 = r10.b()
            r0.h()
            r10.g()
            boolean r0 = r10.n
            if (r0 != 0) goto L_0x01a4
            r0 = 1
            r10.n = r0
            g.e.a.b.f.b.k4 r1 = r10.b()
            r1.h()
            java.nio.channels.FileLock r1 = r10.v
            java.lang.String r2 = "Storage concurrent access okay"
            r3 = 0
            if (r1 == 0) goto L_0x0031
            boolean r1 = r1.isValid()
            if (r1 != 0) goto L_0x0026
            goto L_0x0031
        L_0x0026:
            g.e.a.b.f.b.f3 r1 = r10.d()
            g.e.a.b.f.b.d3 r1 = r1.n
            r1.a(r2)
        L_0x002f:
            r1 = 1
            goto L_0x0092
        L_0x0031:
            g.e.a.b.f.b.k r1 = r10.c
            g.e.a.b.f.b.n4 r1 = r1.a
            g.e.a.b.f.b.f r1 = r1.f3258g
            g.e.a.b.f.b.n4 r1 = r10.f3238l
            android.content.Context r1 = r1.a
            java.io.File r1 = r1.getFilesDir()
            java.io.File r4 = new java.io.File
            java.lang.String r5 = "google_app_measurement.db"
            r4.<init>(r1, r5)
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x0085, IOException -> 0x007b, OverlappingFileLockException -> 0x0071 }
            java.lang.String r5 = "rw"
            r1.<init>(r4, r5)     // Catch:{ FileNotFoundException -> 0x0085, IOException -> 0x007b, OverlappingFileLockException -> 0x0071 }
            java.nio.channels.FileChannel r1 = r1.getChannel()     // Catch:{ FileNotFoundException -> 0x0085, IOException -> 0x007b, OverlappingFileLockException -> 0x0071 }
            r10.w = r1     // Catch:{ FileNotFoundException -> 0x0085, IOException -> 0x007b, OverlappingFileLockException -> 0x0071 }
            java.nio.channels.FileLock r1 = r1.tryLock()     // Catch:{ FileNotFoundException -> 0x0085, IOException -> 0x007b, OverlappingFileLockException -> 0x0071 }
            r10.v = r1     // Catch:{ FileNotFoundException -> 0x0085, IOException -> 0x007b, OverlappingFileLockException -> 0x0071 }
            if (r1 == 0) goto L_0x0065
            g.e.a.b.f.b.f3 r1 = r10.d()     // Catch:{ FileNotFoundException -> 0x0085, IOException -> 0x007b, OverlappingFileLockException -> 0x0071 }
            g.e.a.b.f.b.d3 r1 = r1.n     // Catch:{ FileNotFoundException -> 0x0085, IOException -> 0x007b, OverlappingFileLockException -> 0x0071 }
            r1.a(r2)     // Catch:{ FileNotFoundException -> 0x0085, IOException -> 0x007b, OverlappingFileLockException -> 0x0071 }
            goto L_0x002f
        L_0x0065:
            g.e.a.b.f.b.f3 r1 = r10.d()     // Catch:{ FileNotFoundException -> 0x0085, IOException -> 0x007b, OverlappingFileLockException -> 0x0071 }
            g.e.a.b.f.b.d3 r1 = r1.f3136f     // Catch:{ FileNotFoundException -> 0x0085, IOException -> 0x007b, OverlappingFileLockException -> 0x0071 }
            java.lang.String r2 = "Storage concurrent data access panic"
            r1.a(r2)     // Catch:{ FileNotFoundException -> 0x0085, IOException -> 0x007b, OverlappingFileLockException -> 0x0071 }
            goto L_0x0091
        L_0x0071:
            r1 = move-exception
            g.e.a.b.f.b.f3 r2 = r10.d()
            g.e.a.b.f.b.d3 r2 = r2.f3139i
            java.lang.String r4 = "Storage lock already acquired"
            goto L_0x008e
        L_0x007b:
            r1 = move-exception
            g.e.a.b.f.b.f3 r2 = r10.d()
            g.e.a.b.f.b.d3 r2 = r2.f3136f
            java.lang.String r4 = "Failed to access storage lock file"
            goto L_0x008e
        L_0x0085:
            r1 = move-exception
            g.e.a.b.f.b.f3 r2 = r10.d()
            g.e.a.b.f.b.d3 r2 = r2.f3136f
            java.lang.String r4 = "Failed to acquire storage lock"
        L_0x008e:
            r2.b(r4, r1)
        L_0x0091:
            r1 = 0
        L_0x0092:
            if (r1 == 0) goto L_0x01a4
            java.nio.channels.FileChannel r1 = r10.w
            g.e.a.b.f.b.k4 r2 = r10.b()
            r2.h()
            java.lang.String r2 = "Bad channel to read from"
            r4 = 0
            r6 = 4
            if (r1 == 0) goto L_0x00e0
            boolean r7 = r1.isOpen()
            if (r7 != 0) goto L_0x00ab
            goto L_0x00e0
        L_0x00ab:
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r6)
            r1.position(r4)     // Catch:{ IOException -> 0x00d3 }
            int r1 = r1.read(r7)     // Catch:{ IOException -> 0x00d3 }
            if (r1 == r6) goto L_0x00cb
            r7 = -1
            if (r1 == r7) goto L_0x00e9
            g.e.a.b.f.b.f3 r7 = r10.d()     // Catch:{ IOException -> 0x00d3 }
            g.e.a.b.f.b.d3 r7 = r7.f3139i     // Catch:{ IOException -> 0x00d3 }
            java.lang.String r8 = "Unexpected data length. Bytes read"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x00d3 }
            r7.b(r8, r1)     // Catch:{ IOException -> 0x00d3 }
            goto L_0x00e9
        L_0x00cb:
            r7.flip()     // Catch:{ IOException -> 0x00d3 }
            int r3 = r7.getInt()     // Catch:{ IOException -> 0x00d3 }
            goto L_0x00e9
        L_0x00d3:
            r1 = move-exception
            g.e.a.b.f.b.f3 r7 = r10.d()
            g.e.a.b.f.b.d3 r7 = r7.f3136f
            java.lang.String r8 = "Failed to read from channel"
            r7.b(r8, r1)
            goto L_0x00e9
        L_0x00e0:
            g.e.a.b.f.b.f3 r1 = r10.d()
            g.e.a.b.f.b.d3 r1 = r1.f3136f
            r1.a(r2)
        L_0x00e9:
            g.e.a.b.f.b.n4 r1 = r10.f3238l
            g.e.a.b.f.b.w2 r1 = r1.q()
            r1.i()
            int r1 = r1.f3369e
            g.e.a.b.f.b.k4 r7 = r10.b()
            r7.h()
            if (r3 <= r1) goto L_0x0111
            g.e.a.b.f.b.f3 r0 = r10.d()
            g.e.a.b.f.b.d3 r0 = r0.f3136f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "Panic: can't downgrade version. Previous, current version"
        L_0x010d:
            r0.c(r3, r2, r1)
            return
        L_0x0111:
            if (r3 >= r1) goto L_0x01a4
            java.nio.channels.FileChannel r7 = r10.w
            g.e.a.b.f.b.k4 r8 = r10.b()
            r8.h()
            if (r7 == 0) goto L_0x0189
            boolean r8 = r7.isOpen()
            if (r8 != 0) goto L_0x0125
            goto L_0x0189
        L_0x0125:
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r6)
            r2.putInt(r1)
            r2.flip()
            r7.truncate(r4)     // Catch:{ IOException -> 0x017c }
            g.e.a.b.f.b.f r6 = r10.K()     // Catch:{ IOException -> 0x017c }
            g.e.a.b.f.b.r2 r8 = g.e.a.b.f.b.s2.g0     // Catch:{ IOException -> 0x017c }
            r9 = 0
            boolean r6 = r6.u(r9, r8)     // Catch:{ IOException -> 0x017c }
            if (r6 == 0) goto L_0x0148
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x017c }
            r8 = 19
            if (r6 > r8) goto L_0x0148
            r7.position(r4)     // Catch:{ IOException -> 0x017c }
        L_0x0148:
            r7.write(r2)     // Catch:{ IOException -> 0x017c }
            r7.force(r0)     // Catch:{ IOException -> 0x017c }
            long r4 = r7.size()     // Catch:{ IOException -> 0x017c }
            r8 = 4
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x016b
            g.e.a.b.f.b.f3 r0 = r10.d()     // Catch:{ IOException -> 0x017c }
            g.e.a.b.f.b.d3 r0 = r0.f3136f     // Catch:{ IOException -> 0x017c }
            java.lang.String r2 = "Error writing to channel. Bytes written"
            long r4 = r7.size()     // Catch:{ IOException -> 0x017c }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ IOException -> 0x017c }
            r0.b(r2, r4)     // Catch:{ IOException -> 0x017c }
        L_0x016b:
            g.e.a.b.f.b.f3 r0 = r10.d()
            g.e.a.b.f.b.d3 r0 = r0.n
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "Storage version upgraded. Previous, current version"
            goto L_0x010d
        L_0x017c:
            r0 = move-exception
            g.e.a.b.f.b.f3 r2 = r10.d()
            g.e.a.b.f.b.d3 r2 = r2.f3136f
            java.lang.String r4 = "Failed to write to channel"
            r2.b(r4, r0)
            goto L_0x0192
        L_0x0189:
            g.e.a.b.f.b.f3 r0 = r10.d()
            g.e.a.b.f.b.d3 r0 = r0.f3136f
            r0.a(r2)
        L_0x0192:
            g.e.a.b.f.b.f3 r0 = r10.d()
            g.e.a.b.f.b.d3 r0 = r0.f3136f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "Storage version upgrade failed. Previous, current version"
            goto L_0x010d
        L_0x01a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.k9.a():void");
    }

    public final k4 b() {
        n4 n4Var = this.f3238l;
        Objects.requireNonNull(n4Var, "null reference");
        return n4Var.b();
    }

    public final Context c() {
        return this.f3238l.a;
    }

    public final f3 d() {
        n4 n4Var = this.f3238l;
        Objects.requireNonNull(n4Var, "null reference");
        return n4Var.d();
    }

    public final g.e.a.b.b.h.b e() {
        n4 n4Var = this.f3238l;
        Objects.requireNonNull(n4Var, "null reference");
        return n4Var.n;
    }

    public final b f() {
        throw null;
    }

    public final void g() {
        if (!this.f3239m) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    public final void h(w4 w4Var) {
        b().h();
        if (!TextUtils.isEmpty(w4Var.Q()) || !TextUtils.isEmpty(w4Var.J())) {
            c9 c9Var = this.f3236j;
            Uri.Builder builder = new Uri.Builder();
            String Q = w4Var.Q();
            if (TextUtils.isEmpty(Q)) {
                Q = w4Var.J();
            }
            a aVar = null;
            Uri.Builder encodedAuthority = builder.scheme((String) s2.f3328e.a((Object) null)).encodedAuthority((String) s2.f3329f.a((Object) null));
            String valueOf = String.valueOf(Q);
            Uri.Builder appendQueryParameter = encodedAuthority.path(valueOf.length() != 0 ? "config/app/".concat(valueOf) : new String("config/app/")).appendQueryParameter("app_instance_id", w4Var.M()).appendQueryParameter(Constants.Raft.PLATFORM, "android");
            c9Var.a.f3258g.p();
            appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(55005)).appendQueryParameter("runtime_version", "0");
            String uri = builder.build().toString();
            try {
                String L = w4Var.L();
                Objects.requireNonNull(L, "null reference");
                URL url = new URL(uri);
                d().n.b("Fetching remote configuration", L);
                g4 g4Var = this.a;
                I(g4Var);
                j3 m2 = g4Var.m(L);
                g4 g4Var2 = this.a;
                I(g4Var2);
                g4Var2.h();
                String str = (String) g4Var2.f3173k.get(L);
                if (m2 != null && !TextUtils.isEmpty(str)) {
                    aVar = new a();
                    aVar.put("If-Modified-Since", str);
                }
                this.s = true;
                k3 k3Var = this.b;
                I(k3Var);
                f9 f9Var = new f9(this);
                k3Var.h();
                k3Var.i();
                k3Var.a.b().q(new j3(k3Var, L, url, (byte[]) null, aVar, f9Var));
            } catch (MalformedURLException unused) {
                d().f3136f.c("Failed to parse config URL. Not fetching. appId", f3.t(w4Var.L()), uri);
            }
        } else {
            String L2 = w4Var.L();
            Objects.requireNonNull(L2, "null reference");
            l(L2, 204, (Throwable) null, (byte[]) null, (Map) null);
        }
    }

    public final void i(zzau zzau, zzp zzp) {
        zzau zzau2;
        List<zzab> list;
        List<zzab> list2;
        List<zzab> list3;
        d3 d3Var;
        String str;
        Object t2;
        String f2;
        Object obj;
        String str2;
        zzp zzp2 = zzp;
        String str3 = "null reference";
        Objects.requireNonNull(zzp2, str3);
        f.k(zzp2.zza);
        b().h();
        g();
        String str4 = zzp2.zza;
        zzau zzau3 = zzau;
        long j2 = zzau3.zzd;
        lc.b();
        y6 y6Var = null;
        if (K().u((String) null, s2.r0)) {
            g3 b2 = g3.b(zzau);
            b().h();
            if (!(this.B == null || (str2 = this.C) == null || !str2.equals(str4))) {
                y6Var = this.B;
            }
            q9.w(y6Var, b2.f3165d, false);
            zzau3 = b2.a();
        }
        I(this.f3233g);
        if (m9.l(zzau3, zzp2)) {
            if (!zzp2.zzh) {
                J(zzp2);
                return;
            }
            List list4 = zzp2.zzt;
            if (list4 == null) {
                zzau2 = zzau3;
            } else if (list4.contains(zzau3.zza)) {
                Bundle f3 = zzau3.zzb.f();
                f3.putLong("ga_safelisted", 1);
                zzau2 = new zzau(zzau3.zza, new zzas(f3), zzau3.zzc, zzau3.zzd);
            } else {
                d().f3143m.d("Dropping non-safelisted event. appId, event name, origin", str4, zzau3.zza, zzau3.zzc);
                return;
            }
            k kVar = this.c;
            I(kVar);
            kVar.O();
            try {
                k kVar2 = this.c;
                I(kVar2);
                f.k(str4);
                kVar2.h();
                kVar2.i();
                if (j2 < 0) {
                    kVar2.a.d().f3139i.c("Invalid time querying timed out conditional properties", f3.t(str4), Long.valueOf(j2));
                    list = Collections.emptyList();
                } else {
                    list = kVar2.L("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str4, String.valueOf(j2)});
                }
                for (zzab zzab : list) {
                    if (zzab != null) {
                        d().n.d("User property timed out", zzab.zza, this.f3238l.f3264m.f(zzab.zzc.zzb), zzab.zzc.c());
                        zzau zzau4 = zzab.zzg;
                        if (zzau4 != null) {
                            v(new zzau(zzau4, j2), zzp2);
                        }
                        k kVar3 = this.c;
                        I(kVar3);
                        kVar3.w(str4, zzab.zzc.zzb);
                    }
                }
                k kVar4 = this.c;
                I(kVar4);
                f.k(str4);
                kVar4.h();
                kVar4.i();
                if (j2 < 0) {
                    kVar4.a.d().f3139i.c("Invalid time querying expired conditional properties", f3.t(str4), Long.valueOf(j2));
                    list2 = Collections.emptyList();
                } else {
                    list2 = kVar4.L("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str4, String.valueOf(j2)});
                }
                ArrayList arrayList = new ArrayList(list2.size());
                for (zzab zzab2 : list2) {
                    if (zzab2 != null) {
                        d().n.d("User property expired", zzab2.zza, this.f3238l.f3264m.f(zzab2.zzc.zzb), zzab2.zzc.c());
                        k kVar5 = this.c;
                        I(kVar5);
                        kVar5.l(str4, zzab2.zzc.zzb);
                        zzau zzau5 = zzab2.zzk;
                        if (zzau5 != null) {
                            arrayList.add(zzau5);
                        }
                        k kVar6 = this.c;
                        I(kVar6);
                        kVar6.w(str4, zzab2.zzc.zzb);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    v(new zzau((zzau) it.next(), j2), zzp2);
                }
                k kVar7 = this.c;
                I(kVar7);
                String str5 = zzau2.zza;
                f.k(str4);
                f.k(str5);
                kVar7.h();
                kVar7.i();
                if (j2 < 0) {
                    kVar7.a.d().f3139i.d("Invalid time querying triggered conditional properties", f3.t(str4), kVar7.a.f3264m.d(str5), Long.valueOf(j2));
                    list3 = Collections.emptyList();
                } else {
                    list3 = kVar7.L("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str4, str5, String.valueOf(j2)});
                }
                ArrayList arrayList2 = new ArrayList(list3.size());
                for (zzab zzab3 : list3) {
                    if (zzab3 != null) {
                        zzks zzks = zzab3.zzc;
                        String str6 = zzab3.zza;
                        Objects.requireNonNull(str6, str3);
                        String str7 = zzab3.zzb;
                        String str8 = zzks.zzb;
                        Object c2 = zzks.c();
                        Objects.requireNonNull(c2, str3);
                        String str9 = str3;
                        o9 o9Var = r4;
                        o9 o9Var2 = new o9(str6, str7, str8, j2, c2);
                        k kVar8 = this.c;
                        I(kVar8);
                        if (kVar8.s(o9Var)) {
                            d3Var = d().n;
                            str = "User property triggered";
                            t2 = zzab3.zza;
                            f2 = this.f3238l.f3264m.f(o9Var.c);
                            obj = o9Var.f3279e;
                        } else {
                            d3Var = d().f3136f;
                            str = "Too many active user properties, ignoring";
                            t2 = f3.t(zzab3.zza);
                            f2 = this.f3238l.f3264m.f(o9Var.c);
                            obj = o9Var.f3279e;
                        }
                        d3Var.d(str, t2, f2, obj);
                        zzau zzau6 = zzab3.zzi;
                        if (zzau6 != null) {
                            arrayList2.add(zzau6);
                        }
                        zzab3.zzc = new zzks(o9Var);
                        zzab3.zze = true;
                        k kVar9 = this.c;
                        I(kVar9);
                        kVar9.r(zzab3);
                        str3 = str9;
                    }
                }
                v(zzau2, zzp2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    v(new zzau((zzau) it2.next(), j2), zzp2);
                }
                k kVar10 = this.c;
                I(kVar10);
                kVar10.m();
            } finally {
                k kVar11 = this.c;
                I(kVar11);
                kVar11.P();
            }
        }
    }

    public final void j(zzau zzau, String str) {
        zzau zzau2 = zzau;
        String str2 = str;
        k kVar = this.c;
        I(kVar);
        w4 C2 = kVar.C(str2);
        if (C2 == null || TextUtils.isEmpty(C2.O())) {
            d().f3143m.b("No app data available; dropping event", str2);
            return;
        }
        Boolean A2 = A(C2);
        if (A2 == null) {
            if (!"_ui".equals(zzau2.zza)) {
                d().f3139i.b("Could not find package. appId", f3.t(str));
            }
        } else if (!A2.booleanValue()) {
            d().f3136f.b("App version does not match; dropping event. appId", f3.t(str));
            return;
        }
        String Q = C2.Q();
        String O = C2.O();
        long A3 = C2.A();
        String N = C2.N();
        long F = C2.F();
        long C3 = C2.C();
        boolean z2 = C2.z();
        zzp zzp = r2;
        String P = C2.P();
        long s2 = C2.s();
        boolean y2 = C2.y();
        String J = C2.J();
        C2.a.b().h();
        zzp zzp2 = new zzp(str, Q, O, A3, N, F, C3, (String) null, z2, false, P, s2, 0, 0, y2, false, J, C2.s, C2.D(), C2.a(), L(str2).d());
        k(zzau, zzp);
    }

    public final void k(zzau zzau, zzp zzp) {
        f.k(zzp.zza);
        g3 b2 = g3.b(zzau);
        q9 Q = Q();
        Bundle bundle = b2.f3165d;
        k kVar = this.c;
        I(kVar);
        Q.x(bundle, kVar.B(zzp.zza));
        Q().y(b2, K().m(zzp.zza));
        zzau a2 = b2.a();
        if ("_cmp".equals(a2.zza) && "referrer API v2".equals(a2.zzb.m("_cis"))) {
            String m2 = a2.zzb.m("gclid");
            if (!TextUtils.isEmpty(m2)) {
                t(new zzks("_lgclid", a2.zzd, m2, "auto"), zzp);
            }
        }
        i(a2, zzp);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048 A[Catch:{ all -> 0x0059, all -> 0x0172 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c A[Catch:{ all -> 0x0059, all -> 0x0172 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0124 A[Catch:{ all -> 0x0059, all -> 0x0172 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0130 A[Catch:{ all -> 0x0059, all -> 0x0172 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(java.lang.String r8, int r9, java.lang.Throwable r10, byte[] r11, java.util.Map r12) {
        /*
            r7 = this;
            g.e.a.b.f.b.k4 r0 = r7.b()
            r0.h()
            r7.g()
            g.c.b.b.f.k(r8)
            r0 = 0
            if (r11 != 0) goto L_0x0012
            byte[] r11 = new byte[r0]     // Catch:{ all -> 0x0172 }
        L_0x0012:
            g.e.a.b.f.b.f3 r1 = r7.d()     // Catch:{ all -> 0x0172 }
            g.e.a.b.f.b.d3 r1 = r1.n     // Catch:{ all -> 0x0172 }
            int r2 = r11.length     // Catch:{ all -> 0x0172 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0172 }
            java.lang.String r3 = "onConfigFetched. Response size"
            r1.b(r3, r2)     // Catch:{ all -> 0x0172 }
            g.e.a.b.f.b.k r1 = r7.c     // Catch:{ all -> 0x0172 }
            I(r1)     // Catch:{ all -> 0x0172 }
            r1.O()     // Catch:{ all -> 0x0172 }
            g.e.a.b.f.b.k r1 = r7.c     // Catch:{ all -> 0x0059 }
            I(r1)     // Catch:{ all -> 0x0059 }
            g.e.a.b.f.b.w4 r1 = r1.C(r8)     // Catch:{ all -> 0x0059 }
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 304(0x130, float:4.26E-43)
            if (r9 == r3) goto L_0x0041
            r3 = 204(0xcc, float:2.86E-43)
            if (r9 == r3) goto L_0x0041
            if (r9 != r4) goto L_0x0045
            r9 = 304(0x130, float:4.26E-43)
        L_0x0041:
            if (r10 != 0) goto L_0x0045
            r3 = 1
            goto L_0x0046
        L_0x0045:
            r3 = 0
        L_0x0046:
            if (r1 != 0) goto L_0x005c
            g.e.a.b.f.b.f3 r9 = r7.d()     // Catch:{ all -> 0x0059 }
            g.e.a.b.f.b.d3 r9 = r9.f3139i     // Catch:{ all -> 0x0059 }
            java.lang.String r10 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r8 = g.e.a.b.f.b.f3.t(r8)     // Catch:{ all -> 0x0059 }
            r9.b(r10, r8)     // Catch:{ all -> 0x0059 }
            goto L_0x0153
        L_0x0059:
            r8 = move-exception
            goto L_0x0169
        L_0x005c:
            r5 = 404(0x194, float:5.66E-43)
            r6 = 0
            if (r3 != 0) goto L_0x00cd
            if (r9 != r5) goto L_0x0064
            goto L_0x00cd
        L_0x0064:
            g.e.a.b.b.h.b r11 = r7.e()     // Catch:{ all -> 0x0059 }
            g.e.a.b.b.h.c r11 = (g.e.a.b.b.h.c) r11     // Catch:{ all -> 0x0059 }
            java.util.Objects.requireNonNull(r11)     // Catch:{ all -> 0x0059 }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0059 }
            r1.m(r11)     // Catch:{ all -> 0x0059 }
            g.e.a.b.f.b.k r11 = r7.c     // Catch:{ all -> 0x0059 }
            I(r11)     // Catch:{ all -> 0x0059 }
            r11.n(r1)     // Catch:{ all -> 0x0059 }
            g.e.a.b.f.b.f3 r11 = r7.d()     // Catch:{ all -> 0x0059 }
            g.e.a.b.f.b.d3 r11 = r11.n     // Catch:{ all -> 0x0059 }
            java.lang.String r12 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0059 }
            r11.c(r12, r1, r10)     // Catch:{ all -> 0x0059 }
            g.e.a.b.f.b.g4 r10 = r7.a     // Catch:{ all -> 0x0059 }
            I(r10)     // Catch:{ all -> 0x0059 }
            r10.h()     // Catch:{ all -> 0x0059 }
            java.util.Map r10 = r10.f3173k     // Catch:{ all -> 0x0059 }
            r10.put(r8, r6)     // Catch:{ all -> 0x0059 }
            g.e.a.b.f.b.h8 r8 = r7.f3235i     // Catch:{ all -> 0x0059 }
            g.e.a.b.f.b.p3 r8 = r8.f3187k     // Catch:{ all -> 0x0059 }
            g.e.a.b.b.h.b r10 = r7.e()     // Catch:{ all -> 0x0059 }
            g.e.a.b.b.h.c r10 = (g.e.a.b.b.h.c) r10     // Catch:{ all -> 0x0059 }
            java.util.Objects.requireNonNull(r10)     // Catch:{ all -> 0x0059 }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0059 }
            r8.b(r10)     // Catch:{ all -> 0x0059 }
            r8 = 503(0x1f7, float:7.05E-43)
            if (r9 == r8) goto L_0x00b4
            r8 = 429(0x1ad, float:6.01E-43)
            if (r9 != r8) goto L_0x00c8
        L_0x00b4:
            g.e.a.b.f.b.h8 r8 = r7.f3235i     // Catch:{ all -> 0x0059 }
            g.e.a.b.f.b.p3 r8 = r8.f3185i     // Catch:{ all -> 0x0059 }
            g.e.a.b.b.h.b r9 = r7.e()     // Catch:{ all -> 0x0059 }
            g.e.a.b.b.h.c r9 = (g.e.a.b.b.h.c) r9     // Catch:{ all -> 0x0059 }
            java.util.Objects.requireNonNull(r9)     // Catch:{ all -> 0x0059 }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0059 }
            r8.b(r9)     // Catch:{ all -> 0x0059 }
        L_0x00c8:
            r7.D()     // Catch:{ all -> 0x0059 }
            goto L_0x0153
        L_0x00cd:
            if (r12 == 0) goto L_0x00d8
            java.lang.String r10 = "Last-Modified"
            java.lang.Object r10 = r12.get(r10)     // Catch:{ all -> 0x0059 }
            java.util.List r10 = (java.util.List) r10     // Catch:{ all -> 0x0059 }
            goto L_0x00d9
        L_0x00d8:
            r10 = r6
        L_0x00d9:
            if (r10 == 0) goto L_0x00e8
            int r12 = r10.size()     // Catch:{ all -> 0x0059 }
            if (r12 <= 0) goto L_0x00e8
            java.lang.Object r10 = r10.get(r0)     // Catch:{ all -> 0x0059 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0059 }
            goto L_0x00e9
        L_0x00e8:
            r10 = r6
        L_0x00e9:
            if (r9 == r5) goto L_0x00f7
            if (r9 != r4) goto L_0x00ee
            goto L_0x00f7
        L_0x00ee:
            g.e.a.b.f.b.g4 r12 = r7.a     // Catch:{ all -> 0x0059 }
            I(r12)     // Catch:{ all -> 0x0059 }
            r12.t(r8, r11, r10)     // Catch:{ all -> 0x0059 }
            goto L_0x010a
        L_0x00f7:
            g.e.a.b.f.b.g4 r10 = r7.a     // Catch:{ all -> 0x0059 }
            I(r10)     // Catch:{ all -> 0x0059 }
            g.e.a.b.e.c.j3 r10 = r10.m(r8)     // Catch:{ all -> 0x0059 }
            if (r10 != 0) goto L_0x010a
            g.e.a.b.f.b.g4 r10 = r7.a     // Catch:{ all -> 0x0059 }
            I(r10)     // Catch:{ all -> 0x0059 }
            r10.t(r8, r6, r6)     // Catch:{ all -> 0x0059 }
        L_0x010a:
            g.e.a.b.b.h.b r10 = r7.e()     // Catch:{ all -> 0x0059 }
            g.e.a.b.b.h.c r10 = (g.e.a.b.b.h.c) r10     // Catch:{ all -> 0x0059 }
            java.util.Objects.requireNonNull(r10)     // Catch:{ all -> 0x0059 }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0059 }
            r1.j(r10)     // Catch:{ all -> 0x0059 }
            g.e.a.b.f.b.k r10 = r7.c     // Catch:{ all -> 0x0059 }
            I(r10)     // Catch:{ all -> 0x0059 }
            r10.n(r1)     // Catch:{ all -> 0x0059 }
            if (r9 != r5) goto L_0x0130
            g.e.a.b.f.b.f3 r9 = r7.d()     // Catch:{ all -> 0x0059 }
            g.e.a.b.f.b.d3 r9 = r9.f3141k     // Catch:{ all -> 0x0059 }
            java.lang.String r10 = "Config not found. Using empty config. appId"
            r9.b(r10, r8)     // Catch:{ all -> 0x0059 }
            goto L_0x013f
        L_0x0130:
            g.e.a.b.f.b.f3 r8 = r7.d()     // Catch:{ all -> 0x0059 }
            g.e.a.b.f.b.d3 r8 = r8.n     // Catch:{ all -> 0x0059 }
            java.lang.String r10 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0059 }
            r8.c(r10, r9, r2)     // Catch:{ all -> 0x0059 }
        L_0x013f:
            g.e.a.b.f.b.k3 r8 = r7.b     // Catch:{ all -> 0x0059 }
            I(r8)     // Catch:{ all -> 0x0059 }
            boolean r8 = r8.l()     // Catch:{ all -> 0x0059 }
            if (r8 == 0) goto L_0x00c8
            boolean r8 = r7.F()     // Catch:{ all -> 0x0059 }
            if (r8 == 0) goto L_0x00c8
            r7.u()     // Catch:{ all -> 0x0059 }
        L_0x0153:
            g.e.a.b.f.b.k r8 = r7.c     // Catch:{ all -> 0x0059 }
            I(r8)     // Catch:{ all -> 0x0059 }
            r8.m()     // Catch:{ all -> 0x0059 }
            g.e.a.b.f.b.k r8 = r7.c     // Catch:{ all -> 0x0172 }
            I(r8)     // Catch:{ all -> 0x0172 }
            r8.P()     // Catch:{ all -> 0x0172 }
            r7.s = r0
            r7.B()
            return
        L_0x0169:
            g.e.a.b.f.b.k r9 = r7.c     // Catch:{ all -> 0x0172 }
            I(r9)     // Catch:{ all -> 0x0172 }
            r9.P()     // Catch:{ all -> 0x0172 }
            throw r8     // Catch:{ all -> 0x0172 }
        L_0x0172:
            r8 = move-exception
            r7.s = r0
            r7.B()
            goto L_0x017a
        L_0x0179:
            throw r8
        L_0x017a:
            goto L_0x0179
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.k9.l(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:123:0x03b9 A[Catch:{ SQLiteException -> 0x01cf, all -> 0x054d }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x03df A[Catch:{ SQLiteException -> 0x01cf, all -> 0x054d }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x03f2 A[SYNTHETIC, Splitter:B:128:0x03f2] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x049b A[Catch:{ SQLiteException -> 0x01cf, all -> 0x054d }] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x04b9 A[Catch:{ SQLiteException -> 0x01cf, all -> 0x054d }] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x051f A[Catch:{ SQLiteException -> 0x01cf, all -> 0x054d }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x012f A[Catch:{ SQLiteException -> 0x01cf, all -> 0x054d }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01e3 A[Catch:{ SQLiteException -> 0x01cf, all -> 0x054d }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01e7 A[Catch:{ SQLiteException -> 0x01cf, all -> 0x054d }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0243 A[Catch:{ SQLiteException -> 0x01cf, all -> 0x054d }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0252 A[Catch:{ SQLiteException -> 0x01cf, all -> 0x054d }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0262 A[Catch:{ SQLiteException -> 0x01cf, all -> 0x054d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(com.google.android.gms.measurement.internal.zzp r24) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "com.android.vending"
            java.lang.String r6 = "_pfo"
            java.lang.String r7 = "_uwa"
            java.lang.String r0 = "app_id=?"
            g.e.a.b.f.b.k4 r8 = r23.b()
            r8.h()
            r23.g()
            java.lang.String r8 = "null reference"
            java.util.Objects.requireNonNull(r2, r8)
            java.lang.String r9 = r2.zza
            g.c.b.b.f.k(r9)
            boolean r9 = H(r24)
            if (r9 == 0) goto L_0x0557
            g.e.a.b.f.b.k r9 = r1.c
            I(r9)
            java.lang.String r10 = r2.zza
            g.e.a.b.f.b.w4 r9 = r9.C(r10)
            r10 = 0
            if (r9 == 0) goto L_0x0065
            java.lang.String r12 = r9.Q()
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 == 0) goto L_0x0065
            java.lang.String r12 = r2.zzb
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x0065
            r9.j(r10)
            g.e.a.b.f.b.k r12 = r1.c
            I(r12)
            r12.n(r9)
            g.e.a.b.f.b.g4 r9 = r1.a
            I(r9)
            java.lang.String r12 = r2.zza
            r9.h()
            java.util.Map r9 = r9.f3169g
            r9.remove(r12)
        L_0x0065:
            boolean r9 = r2.zzh
            if (r9 != 0) goto L_0x006d
            r23.J(r24)
            return
        L_0x006d:
            long r12 = r2.zzm
            int r9 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x0080
            g.e.a.b.b.h.b r9 = r23.e()
            g.e.a.b.b.h.c r9 = (g.e.a.b.b.h.c) r9
            java.util.Objects.requireNonNull(r9)
            long r12 = java.lang.System.currentTimeMillis()
        L_0x0080:
            g.e.a.b.f.b.n4 r9 = r1.f3238l
            g.e.a.b.f.b.n r9 = r9.p()
            r9.h()
            r15 = 0
            r9.f3251f = r15
            r9.f3252g = r10
            int r9 = r2.zzn
            r14 = 1
            if (r9 == 0) goto L_0x00ab
            if (r9 == r14) goto L_0x00ab
            g.e.a.b.f.b.f3 r11 = r23.d()
            g.e.a.b.f.b.d3 r11 = r11.f3139i
            java.lang.String r15 = r2.zza
            java.lang.Object r15 = g.e.a.b.f.b.f3.t(r15)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r10 = "Incorrect app type, assuming installed app. appId, appType"
            r11.c(r10, r15, r9)
            r9 = 0
        L_0x00ab:
            g.e.a.b.f.b.k r10 = r1.c
            I(r10)
            r10.O()
            g.e.a.b.f.b.k r10 = r1.c     // Catch:{ all -> 0x054d }
            I(r10)     // Catch:{ all -> 0x054d }
            java.lang.String r11 = r2.zza     // Catch:{ all -> 0x054d }
            java.lang.String r15 = "_npa"
            g.e.a.b.f.b.o9 r10 = r10.H(r11, r15)     // Catch:{ all -> 0x054d }
            if (r10 == 0) goto L_0x00d0
            java.lang.String r11 = "auto"
            java.lang.String r14 = r10.b     // Catch:{ all -> 0x054d }
            boolean r11 = r11.equals(r14)     // Catch:{ all -> 0x054d }
            if (r11 == 0) goto L_0x00cd
            goto L_0x00d0
        L_0x00cd:
            r22 = r3
            goto L_0x011f
        L_0x00d0:
            java.lang.Boolean r11 = r2.zzr     // Catch:{ all -> 0x054d }
            if (r11 == 0) goto L_0x010a
            com.google.android.gms.measurement.internal.zzks r15 = new com.google.android.gms.measurement.internal.zzks     // Catch:{ all -> 0x054d }
            java.lang.String r20 = "_npa"
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x054d }
            r14 = 1
            if (r14 == r11) goto L_0x00e2
            r21 = 0
            goto L_0x00e4
        L_0x00e2:
            r21 = 1
        L_0x00e4:
            java.lang.Long r11 = java.lang.Long.valueOf(r21)     // Catch:{ all -> 0x054d }
            java.lang.String r21 = "auto"
            r22 = r3
            r3 = 1
            r14 = r15
            r3 = r15
            r15 = r20
            r16 = r12
            r18 = r11
            r19 = r21
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x054d }
            if (r10 == 0) goto L_0x0106
            java.lang.Object r10 = r10.f3279e     // Catch:{ all -> 0x054d }
            java.lang.Long r11 = r3.zzd     // Catch:{ all -> 0x054d }
            boolean r10 = r10.equals(r11)     // Catch:{ all -> 0x054d }
            if (r10 != 0) goto L_0x011f
        L_0x0106:
            r1.t(r3, r2)     // Catch:{ all -> 0x054d }
            goto L_0x011f
        L_0x010a:
            r22 = r3
            if (r10 == 0) goto L_0x011f
            com.google.android.gms.measurement.internal.zzks r3 = new com.google.android.gms.measurement.internal.zzks     // Catch:{ all -> 0x054d }
            java.lang.String r15 = "_npa"
            r18 = 0
            java.lang.String r19 = "auto"
            r14 = r3
            r16 = r12
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x054d }
            r1.o(r3, r2)     // Catch:{ all -> 0x054d }
        L_0x011f:
            g.e.a.b.f.b.k r3 = r1.c     // Catch:{ all -> 0x054d }
            I(r3)     // Catch:{ all -> 0x054d }
            java.lang.String r10 = r2.zza     // Catch:{ all -> 0x054d }
            java.util.Objects.requireNonNull(r10, r8)     // Catch:{ all -> 0x054d }
            g.e.a.b.f.b.w4 r15 = r3.C(r10)     // Catch:{ all -> 0x054d }
            if (r15 == 0) goto L_0x01e3
            g.e.a.b.f.b.q9 r3 = r23.Q()     // Catch:{ all -> 0x054d }
            java.lang.String r10 = r2.zzb     // Catch:{ all -> 0x054d }
            java.lang.String r11 = r15.Q()     // Catch:{ all -> 0x054d }
            java.lang.String r14 = r2.zzq     // Catch:{ all -> 0x054d }
            r20 = r4
            java.lang.String r4 = r15.J()     // Catch:{ all -> 0x054d }
            boolean r3 = r3.Z(r10, r11, r14, r4)     // Catch:{ all -> 0x054d }
            if (r3 == 0) goto L_0x01e5
            g.e.a.b.f.b.f3 r3 = r23.d()     // Catch:{ all -> 0x054d }
            g.e.a.b.f.b.d3 r3 = r3.f3139i     // Catch:{ all -> 0x054d }
            java.lang.String r4 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r10 = r15.L()     // Catch:{ all -> 0x054d }
            java.lang.Object r10 = g.e.a.b.f.b.f3.t(r10)     // Catch:{ all -> 0x054d }
            r3.b(r4, r10)     // Catch:{ all -> 0x054d }
            g.e.a.b.f.b.k r3 = r1.c     // Catch:{ all -> 0x054d }
            I(r3)     // Catch:{ all -> 0x054d }
            java.lang.String r4 = r15.L()     // Catch:{ all -> 0x054d }
            r3.i()     // Catch:{ all -> 0x054d }
            r3.h()     // Catch:{ all -> 0x054d }
            g.c.b.b.f.k(r4)     // Catch:{ all -> 0x054d }
            android.database.sqlite.SQLiteDatabase r10 = r3.A()     // Catch:{ SQLiteException -> 0x01cf }
            r11 = 1
            java.lang.String[] r14 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x01cf }
            r11 = 0
            r14[r11] = r4     // Catch:{ SQLiteException -> 0x01cf }
            java.lang.String r11 = "events"
            int r11 = r10.delete(r11, r0, r14)     // Catch:{ SQLiteException -> 0x01cf }
            java.lang.String r15 = "user_attributes"
            int r15 = r10.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01cf }
            int r11 = r11 + r15
            java.lang.String r15 = "conditional_properties"
            int r15 = r10.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01cf }
            int r11 = r11 + r15
            java.lang.String r15 = "apps"
            int r15 = r10.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01cf }
            int r11 = r11 + r15
            java.lang.String r15 = "raw_events"
            int r15 = r10.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01cf }
            int r11 = r11 + r15
            java.lang.String r15 = "raw_events_metadata"
            int r15 = r10.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01cf }
            int r11 = r11 + r15
            java.lang.String r15 = "event_filters"
            int r15 = r10.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01cf }
            int r11 = r11 + r15
            java.lang.String r15 = "property_filters"
            int r15 = r10.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01cf }
            int r11 = r11 + r15
            java.lang.String r15 = "audience_filter_values"
            int r15 = r10.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01cf }
            int r11 = r11 + r15
            java.lang.String r15 = "consent_settings"
            int r0 = r10.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01cf }
            int r11 = r11 + r0
            if (r11 <= 0) goto L_0x01e1
            g.e.a.b.f.b.n4 r0 = r3.a     // Catch:{ SQLiteException -> 0x01cf }
            g.e.a.b.f.b.f3 r0 = r0.d()     // Catch:{ SQLiteException -> 0x01cf }
            g.e.a.b.f.b.d3 r0 = r0.n     // Catch:{ SQLiteException -> 0x01cf }
            java.lang.String r10 = "Deleted application data. app, records"
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ SQLiteException -> 0x01cf }
            r0.c(r10, r4, r11)     // Catch:{ SQLiteException -> 0x01cf }
            goto L_0x01e1
        L_0x01cf:
            r0 = move-exception
            g.e.a.b.f.b.n4 r3 = r3.a     // Catch:{ all -> 0x054d }
            g.e.a.b.f.b.f3 r3 = r3.d()     // Catch:{ all -> 0x054d }
            g.e.a.b.f.b.d3 r3 = r3.f3136f     // Catch:{ all -> 0x054d }
            java.lang.String r10 = "Error deleting application data. appId, error"
            java.lang.Object r4 = g.e.a.b.f.b.f3.t(r4)     // Catch:{ all -> 0x054d }
            r3.c(r10, r4, r0)     // Catch:{ all -> 0x054d }
        L_0x01e1:
            r15 = 0
            goto L_0x01e5
        L_0x01e3:
            r20 = r4
        L_0x01e5:
            if (r15 == 0) goto L_0x023e
            long r3 = r15.A()     // Catch:{ all -> 0x054d }
            r10 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x01fe
            long r3 = r15.A()     // Catch:{ all -> 0x054d }
            long r10 = r2.zzj     // Catch:{ all -> 0x054d }
            int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x01fe
            r14 = 1
            goto L_0x01ff
        L_0x01fe:
            r14 = 0
        L_0x01ff:
            java.lang.String r0 = r15.O()     // Catch:{ all -> 0x054d }
            long r3 = r15.A()     // Catch:{ all -> 0x054d }
            r10 = -2147483648(0xffffffff80000000, double:NaN)
            int r15 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r15 != 0) goto L_0x021a
            if (r0 == 0) goto L_0x021a
            java.lang.String r3 = r2.zzc     // Catch:{ all -> 0x054d }
            boolean r3 = r0.equals(r3)     // Catch:{ all -> 0x054d }
            if (r3 != 0) goto L_0x021a
            r3 = 1
            goto L_0x021b
        L_0x021a:
            r3 = 0
        L_0x021b:
            r3 = r3 | r14
            if (r3 == 0) goto L_0x023e
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x054d }
            r3.<init>()     // Catch:{ all -> 0x054d }
            java.lang.String r4 = "_pv"
            r3.putString(r4, r0)     // Catch:{ all -> 0x054d }
            com.google.android.gms.measurement.internal.zzau r0 = new com.google.android.gms.measurement.internal.zzau     // Catch:{ all -> 0x054d }
            com.google.android.gms.measurement.internal.zzas r4 = new com.google.android.gms.measurement.internal.zzas     // Catch:{ all -> 0x054d }
            r4.<init>(r3)     // Catch:{ all -> 0x054d }
            java.lang.String r15 = "_au"
            java.lang.String r17 = "auto"
            r14 = r0
            r16 = r4
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x054d }
            r1.i(r0, r2)     // Catch:{ all -> 0x054d }
        L_0x023e:
            r23.J(r24)     // Catch:{ all -> 0x054d }
            if (r9 != 0) goto L_0x0252
            g.e.a.b.f.b.k r0 = r1.c     // Catch:{ all -> 0x054d }
            I(r0)     // Catch:{ all -> 0x054d }
            java.lang.String r3 = r2.zza     // Catch:{ all -> 0x054d }
            java.lang.String r4 = "_f"
            g.e.a.b.f.b.p r0 = r0.G(r3, r4)     // Catch:{ all -> 0x054d }
            r14 = 0
            goto L_0x0260
        L_0x0252:
            g.e.a.b.f.b.k r0 = r1.c     // Catch:{ all -> 0x054d }
            I(r0)     // Catch:{ all -> 0x054d }
            java.lang.String r3 = r2.zza     // Catch:{ all -> 0x054d }
            java.lang.String r4 = "_v"
            g.e.a.b.f.b.p r0 = r0.G(r3, r4)     // Catch:{ all -> 0x054d }
            r14 = 1
        L_0x0260:
            if (r0 != 0) goto L_0x051f
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
            long r9 = r12 / r3
            r11 = r6
            r21 = r7
            r6 = 1
            long r9 = r9 + r6
            long r9 = r9 * r3
            java.lang.String r3 = "_dac"
            java.lang.String r4 = "_et"
            java.lang.String r15 = "_r"
            java.lang.String r6 = "_c"
            if (r14 != 0) goto L_0x04d3
            com.google.android.gms.measurement.internal.zzks r0 = new com.google.android.gms.measurement.internal.zzks     // Catch:{ all -> 0x054d }
            java.lang.String r7 = "_fot"
            java.lang.Long r18 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x054d }
            java.lang.String r19 = "auto"
            r14 = r0
            r9 = r15
            r15 = r7
            r16 = r12
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x054d }
            r1.t(r0, r2)     // Catch:{ all -> 0x054d }
            g.e.a.b.f.b.k4 r0 = r23.b()     // Catch:{ all -> 0x054d }
            r0.h()     // Catch:{ all -> 0x054d }
            g.e.a.b.f.b.v3 r7 = r1.f3237k     // Catch:{ all -> 0x054d }
            java.util.Objects.requireNonNull(r7, r8)     // Catch:{ all -> 0x054d }
            java.lang.String r0 = r2.zza     // Catch:{ all -> 0x054d }
            if (r0 == 0) goto L_0x0379
            boolean r10 = r0.isEmpty()     // Catch:{ all -> 0x054d }
            if (r10 == 0) goto L_0x02a6
            goto L_0x0379
        L_0x02a6:
            g.e.a.b.f.b.n4 r10 = r7.a     // Catch:{ all -> 0x054d }
            g.e.a.b.f.b.k4 r10 = r10.b()     // Catch:{ all -> 0x054d }
            r10.h()     // Catch:{ all -> 0x054d }
            boolean r10 = r7.a()     // Catch:{ all -> 0x054d }
            if (r10 != 0) goto L_0x02c4
            g.e.a.b.f.b.n4 r0 = r7.a     // Catch:{ all -> 0x054d }
            g.e.a.b.f.b.f3 r0 = r0.d()     // Catch:{ all -> 0x054d }
            g.e.a.b.f.b.d3 r0 = r0.f3142l     // Catch:{ all -> 0x054d }
            java.lang.String r5 = "Install Referrer Reporter is not available"
        L_0x02bf:
            r0.a(r5)     // Catch:{ all -> 0x054d }
            goto L_0x0385
        L_0x02c4:
            g.e.a.b.f.b.u3 r10 = new g.e.a.b.f.b.u3     // Catch:{ all -> 0x054d }
            r10.<init>(r7, r0)     // Catch:{ all -> 0x054d }
            g.e.a.b.f.b.n4 r0 = r7.a     // Catch:{ all -> 0x054d }
            g.e.a.b.f.b.k4 r0 = r0.b()     // Catch:{ all -> 0x054d }
            r0.h()     // Catch:{ all -> 0x054d }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x054d }
            java.lang.String r14 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r0.<init>(r14)     // Catch:{ all -> 0x054d }
            android.content.ComponentName r14 = new android.content.ComponentName     // Catch:{ all -> 0x054d }
            java.lang.String r15 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r14.<init>(r5, r15)     // Catch:{ all -> 0x054d }
            r0.setComponent(r14)     // Catch:{ all -> 0x054d }
            g.e.a.b.f.b.n4 r14 = r7.a     // Catch:{ all -> 0x054d }
            android.content.Context r14 = r14.a     // Catch:{ all -> 0x054d }
            android.content.pm.PackageManager r14 = r14.getPackageManager()     // Catch:{ all -> 0x054d }
            if (r14 != 0) goto L_0x02f8
            g.e.a.b.f.b.n4 r0 = r7.a     // Catch:{ all -> 0x054d }
            g.e.a.b.f.b.f3 r0 = r0.d()     // Catch:{ all -> 0x054d }
            g.e.a.b.f.b.d3 r0 = r0.f3140j     // Catch:{ all -> 0x054d }
            java.lang.String r5 = "Failed to obtain Package Manager to verify binding conditions for Install Referrer"
            goto L_0x02bf
        L_0x02f8:
            r15 = 0
            java.util.List r14 = r14.queryIntentServices(r0, r15)     // Catch:{ all -> 0x054d }
            if (r14 == 0) goto L_0x036d
            boolean r16 = r14.isEmpty()     // Catch:{ all -> 0x054d }
            if (r16 != 0) goto L_0x036d
            java.lang.Object r14 = r14.get(r15)     // Catch:{ all -> 0x054d }
            android.content.pm.ResolveInfo r14 = (android.content.pm.ResolveInfo) r14     // Catch:{ all -> 0x054d }
            android.content.pm.ServiceInfo r14 = r14.serviceInfo     // Catch:{ all -> 0x054d }
            if (r14 == 0) goto L_0x0385
            java.lang.String r15 = r14.packageName     // Catch:{ all -> 0x054d }
            java.lang.String r14 = r14.name     // Catch:{ all -> 0x054d }
            if (r14 == 0) goto L_0x0361
            boolean r5 = r5.equals(r15)     // Catch:{ all -> 0x054d }
            if (r5 == 0) goto L_0x0361
            boolean r5 = r7.a()     // Catch:{ all -> 0x054d }
            if (r5 == 0) goto L_0x0361
            android.content.Intent r5 = new android.content.Intent     // Catch:{ all -> 0x054d }
            r5.<init>(r0)     // Catch:{ all -> 0x054d }
            g.e.a.b.b.g.a r0 = g.e.a.b.b.g.a.b()     // Catch:{ RuntimeException -> 0x034e }
            g.e.a.b.f.b.n4 r14 = r7.a     // Catch:{ RuntimeException -> 0x034e }
            android.content.Context r14 = r14.a     // Catch:{ RuntimeException -> 0x034e }
            r15 = 1
            boolean r0 = r0.a(r14, r5, r10, r15)     // Catch:{ RuntimeException -> 0x034e }
            g.e.a.b.f.b.n4 r5 = r7.a     // Catch:{ RuntimeException -> 0x034e }
            g.e.a.b.f.b.f3 r5 = r5.d()     // Catch:{ RuntimeException -> 0x034e }
            g.e.a.b.f.b.d3 r5 = r5.n     // Catch:{ RuntimeException -> 0x034e }
            java.lang.String r10 = "Install Referrer Service is"
            java.lang.String r14 = "available"
            java.lang.String r15 = "not available"
            r16 = r14
            r14 = 1
            if (r14 == r0) goto L_0x0348
            r14 = r15
            goto L_0x034a
        L_0x0348:
            r14 = r16
        L_0x034a:
            r5.b(r10, r14)     // Catch:{ RuntimeException -> 0x034e }
            goto L_0x0385
        L_0x034e:
            r0 = move-exception
            g.e.a.b.f.b.n4 r5 = r7.a     // Catch:{ all -> 0x054d }
            g.e.a.b.f.b.f3 r5 = r5.d()     // Catch:{ all -> 0x054d }
            g.e.a.b.f.b.d3 r5 = r5.f3136f     // Catch:{ all -> 0x054d }
            java.lang.String r7 = "Exception occurred while binding to Install Referrer Service"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x054d }
            r5.b(r7, r0)     // Catch:{ all -> 0x054d }
            goto L_0x0385
        L_0x0361:
            g.e.a.b.f.b.n4 r0 = r7.a     // Catch:{ all -> 0x054d }
            g.e.a.b.f.b.f3 r0 = r0.d()     // Catch:{ all -> 0x054d }
            g.e.a.b.f.b.d3 r0 = r0.f3139i     // Catch:{ all -> 0x054d }
            java.lang.String r5 = "Play Store version 8.3.73 or higher required for Install Referrer"
            goto L_0x02bf
        L_0x036d:
            g.e.a.b.f.b.n4 r0 = r7.a     // Catch:{ all -> 0x054d }
            g.e.a.b.f.b.f3 r0 = r0.d()     // Catch:{ all -> 0x054d }
            g.e.a.b.f.b.d3 r0 = r0.f3142l     // Catch:{ all -> 0x054d }
            java.lang.String r5 = "Play Service for fetching Install Referrer is unavailable on device"
            goto L_0x02bf
        L_0x0379:
            g.e.a.b.f.b.n4 r0 = r7.a     // Catch:{ all -> 0x054d }
            g.e.a.b.f.b.f3 r0 = r0.d()     // Catch:{ all -> 0x054d }
            g.e.a.b.f.b.d3 r0 = r0.f3140j     // Catch:{ all -> 0x054d }
            java.lang.String r5 = "Install Referrer Reporter was called with invalid app package name"
            goto L_0x02bf
        L_0x0385:
            g.e.a.b.f.b.k4 r0 = r23.b()     // Catch:{ all -> 0x054d }
            r0.h()     // Catch:{ all -> 0x054d }
            r23.g()     // Catch:{ all -> 0x054d }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x054d }
            r5.<init>()     // Catch:{ all -> 0x054d }
            r14 = 1
            r5.putLong(r6, r14)     // Catch:{ all -> 0x054d }
            r5.putLong(r9, r14)     // Catch:{ all -> 0x054d }
            r6 = r21
            r9 = 0
            r5.putLong(r6, r9)     // Catch:{ all -> 0x054d }
            r5.putLong(r11, r9)     // Catch:{ all -> 0x054d }
            r7 = r20
            r5.putLong(r7, r9)     // Catch:{ all -> 0x054d }
            r15 = r22
            r5.putLong(r15, r9)     // Catch:{ all -> 0x054d }
            r9 = 1
            r5.putLong(r4, r9)     // Catch:{ all -> 0x054d }
            boolean r0 = r2.zzp     // Catch:{ all -> 0x054d }
            if (r0 == 0) goto L_0x03bc
            r5.putLong(r3, r9)     // Catch:{ all -> 0x054d }
        L_0x03bc:
            java.lang.String r3 = r2.zza     // Catch:{ all -> 0x054d }
            java.util.Objects.requireNonNull(r3, r8)     // Catch:{ all -> 0x054d }
            g.e.a.b.f.b.k r0 = r1.c     // Catch:{ all -> 0x054d }
            I(r0)     // Catch:{ all -> 0x054d }
            g.c.b.b.f.k(r3)     // Catch:{ all -> 0x054d }
            r0.h()     // Catch:{ all -> 0x054d }
            r0.i()     // Catch:{ all -> 0x054d }
            java.lang.String r4 = "first_open_count"
            long r9 = r0.y(r3, r4)     // Catch:{ all -> 0x054d }
            g.e.a.b.f.b.n4 r0 = r1.f3238l     // Catch:{ all -> 0x054d }
            android.content.Context r0 = r0.a     // Catch:{ all -> 0x054d }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x054d }
            if (r0 != 0) goto L_0x03f2
            g.e.a.b.f.b.f3 r0 = r23.d()     // Catch:{ all -> 0x054d }
            g.e.a.b.f.b.d3 r0 = r0.f3136f     // Catch:{ all -> 0x054d }
            java.lang.String r4 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.Object r3 = g.e.a.b.f.b.f3.t(r3)     // Catch:{ all -> 0x054d }
            r0.b(r4, r3)     // Catch:{ all -> 0x054d }
        L_0x03ee:
            r3 = 0
            goto L_0x04b5
        L_0x03f2:
            g.e.a.b.f.b.n4 r0 = r1.f3238l     // Catch:{ NameNotFoundException -> 0x0406 }
            android.content.Context r0 = r0.a     // Catch:{ NameNotFoundException -> 0x0406 }
            g.e.a.b.b.i.a r0 = g.e.a.b.b.i.b.a(r0)     // Catch:{ NameNotFoundException -> 0x0406 }
            android.content.Context r0 = r0.a     // Catch:{ NameNotFoundException -> 0x0406 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0406 }
            r4 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r3, r4)     // Catch:{ NameNotFoundException -> 0x0406 }
            goto L_0x0417
        L_0x0406:
            r0 = move-exception
            g.e.a.b.f.b.f3 r4 = r23.d()     // Catch:{ all -> 0x054d }
            g.e.a.b.f.b.d3 r4 = r4.f3136f     // Catch:{ all -> 0x054d }
            java.lang.String r8 = "Package info is null, first open report might be inaccurate. appId"
            java.lang.Object r14 = g.e.a.b.f.b.f3.t(r3)     // Catch:{ all -> 0x054d }
            r4.c(r8, r14, r0)     // Catch:{ all -> 0x054d }
            r0 = 0
        L_0x0417:
            if (r0 == 0) goto L_0x0470
            r22 = r15
            long r14 = r0.firstInstallTime     // Catch:{ all -> 0x054d }
            r16 = 0
            int r4 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            r20 = r7
            if (r4 == 0) goto L_0x046d
            long r7 = r0.lastUpdateTime     // Catch:{ all -> 0x054d }
            int r0 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x044d
            g.e.a.b.f.b.f r0 = r23.K()     // Catch:{ all -> 0x054d }
            g.e.a.b.f.b.r2 r4 = g.e.a.b.f.b.s2.c0     // Catch:{ all -> 0x054d }
            r7 = 0
            boolean r0 = r0.u(r7, r4)     // Catch:{ all -> 0x054d }
            if (r0 == 0) goto L_0x0447
            r14 = 0
            int r0 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x0445
            r14 = 1
            r5.putLong(r6, r14)     // Catch:{ all -> 0x054d }
            r9 = 0
        L_0x0445:
            r14 = 0
            goto L_0x044f
        L_0x0447:
            r14 = 1
            r5.putLong(r6, r14)     // Catch:{ all -> 0x054d }
            goto L_0x0445
        L_0x044d:
            r7 = 0
            r14 = 1
        L_0x044f:
            com.google.android.gms.measurement.internal.zzks r0 = new com.google.android.gms.measurement.internal.zzks     // Catch:{ all -> 0x054d }
            java.lang.String r15 = "_fi"
            r4 = 1
            if (r4 == r14) goto L_0x0459
            r16 = 0
            goto L_0x045b
        L_0x0459:
            r16 = 1
        L_0x045b:
            java.lang.Long r18 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x054d }
            java.lang.String r19 = "auto"
            r14 = r0
            r4 = r22
            r16 = r12
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x054d }
            r1.t(r0, r2)     // Catch:{ all -> 0x054d }
            goto L_0x0474
        L_0x046d:
            r4 = r22
            goto L_0x0473
        L_0x0470:
            r20 = r7
            r4 = r15
        L_0x0473:
            r7 = 0
        L_0x0474:
            g.e.a.b.f.b.n4 r0 = r1.f3238l     // Catch:{ NameNotFoundException -> 0x0488 }
            android.content.Context r0 = r0.a     // Catch:{ NameNotFoundException -> 0x0488 }
            g.e.a.b.b.i.a r0 = g.e.a.b.b.i.b.a(r0)     // Catch:{ NameNotFoundException -> 0x0488 }
            android.content.Context r0 = r0.a     // Catch:{ NameNotFoundException -> 0x0488 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0488 }
            r6 = 0
            android.content.pm.ApplicationInfo r15 = r0.getApplicationInfo(r3, r6)     // Catch:{ NameNotFoundException -> 0x0488 }
            goto L_0x0499
        L_0x0488:
            r0 = move-exception
            g.e.a.b.f.b.f3 r6 = r23.d()     // Catch:{ all -> 0x054d }
            g.e.a.b.f.b.d3 r6 = r6.f3136f     // Catch:{ all -> 0x054d }
            java.lang.String r8 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.Object r3 = g.e.a.b.f.b.f3.t(r3)     // Catch:{ all -> 0x054d }
            r6.c(r8, r3, r0)     // Catch:{ all -> 0x054d }
            r15 = r7
        L_0x0499:
            if (r15 == 0) goto L_0x03ee
            int r0 = r15.flags     // Catch:{ all -> 0x054d }
            r3 = 1
            r0 = r0 & r3
            if (r0 == 0) goto L_0x04a8
            r3 = r20
            r6 = 1
            r5.putLong(r3, r6)     // Catch:{ all -> 0x054d }
        L_0x04a8:
            int r0 = r15.flags     // Catch:{ all -> 0x054d }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x03ee
            r6 = 1
            r5.putLong(r4, r6)     // Catch:{ all -> 0x054d }
            goto L_0x03ee
        L_0x04b5:
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x04bc
            r5.putLong(r11, r9)     // Catch:{ all -> 0x054d }
        L_0x04bc:
            com.google.android.gms.measurement.internal.zzau r0 = new com.google.android.gms.measurement.internal.zzau     // Catch:{ all -> 0x054d }
            com.google.android.gms.measurement.internal.zzas r3 = new com.google.android.gms.measurement.internal.zzas     // Catch:{ all -> 0x054d }
            r3.<init>(r5)     // Catch:{ all -> 0x054d }
            java.lang.String r15 = "_f"
            java.lang.String r17 = "auto"
            r14 = r0
            r16 = r3
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x054d }
            r1.k(r0, r2)     // Catch:{ all -> 0x054d }
            goto L_0x053c
        L_0x04d3:
            r5 = r15
            com.google.android.gms.measurement.internal.zzks r0 = new com.google.android.gms.measurement.internal.zzks     // Catch:{ all -> 0x054d }
            java.lang.String r15 = "_fvt"
            java.lang.Long r18 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x054d }
            java.lang.String r19 = "auto"
            r14 = r0
            r16 = r12
            r14.<init>(r15, r16, r18, r19)     // Catch:{ all -> 0x054d }
            r1.t(r0, r2)     // Catch:{ all -> 0x054d }
            g.e.a.b.f.b.k4 r0 = r23.b()     // Catch:{ all -> 0x054d }
            r0.h()     // Catch:{ all -> 0x054d }
            r23.g()     // Catch:{ all -> 0x054d }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x054d }
            r0.<init>()     // Catch:{ all -> 0x054d }
            r7 = 1
            r0.putLong(r6, r7)     // Catch:{ all -> 0x054d }
            r0.putLong(r5, r7)     // Catch:{ all -> 0x054d }
            r0.putLong(r4, r7)     // Catch:{ all -> 0x054d }
            boolean r4 = r2.zzp     // Catch:{ all -> 0x054d }
            if (r4 == 0) goto L_0x0508
            r0.putLong(r3, r7)     // Catch:{ all -> 0x054d }
        L_0x0508:
            com.google.android.gms.measurement.internal.zzau r3 = new com.google.android.gms.measurement.internal.zzau     // Catch:{ all -> 0x054d }
            com.google.android.gms.measurement.internal.zzas r4 = new com.google.android.gms.measurement.internal.zzas     // Catch:{ all -> 0x054d }
            r4.<init>(r0)     // Catch:{ all -> 0x054d }
            java.lang.String r15 = "_v"
            java.lang.String r17 = "auto"
            r14 = r3
            r16 = r4
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x054d }
        L_0x051b:
            r1.k(r3, r2)     // Catch:{ all -> 0x054d }
            goto L_0x053c
        L_0x051f:
            boolean r0 = r2.zzi     // Catch:{ all -> 0x054d }
            if (r0 == 0) goto L_0x053c
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x054d }
            r0.<init>()     // Catch:{ all -> 0x054d }
            com.google.android.gms.measurement.internal.zzau r3 = new com.google.android.gms.measurement.internal.zzau     // Catch:{ all -> 0x054d }
            com.google.android.gms.measurement.internal.zzas r4 = new com.google.android.gms.measurement.internal.zzas     // Catch:{ all -> 0x054d }
            r4.<init>(r0)     // Catch:{ all -> 0x054d }
            java.lang.String r15 = "_cd"
            java.lang.String r17 = "auto"
            r14 = r3
            r16 = r4
            r18 = r12
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x054d }
            goto L_0x051b
        L_0x053c:
            g.e.a.b.f.b.k r0 = r1.c     // Catch:{ all -> 0x054d }
            I(r0)     // Catch:{ all -> 0x054d }
            r0.m()     // Catch:{ all -> 0x054d }
            g.e.a.b.f.b.k r0 = r1.c
            I(r0)
            r0.P()
            return
        L_0x054d:
            r0 = move-exception
            g.e.a.b.f.b.k r2 = r1.c
            I(r2)
            r2.P()
            throw r0
        L_0x0557:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.k9.m(com.google.android.gms.measurement.internal.zzp):void");
    }

    public final void n(zzab zzab, zzp zzp) {
        Objects.requireNonNull(zzab, "null reference");
        f.k(zzab.zza);
        Objects.requireNonNull(zzab.zzc, "null reference");
        f.k(zzab.zzc.zzb);
        b().h();
        g();
        if (H(zzp)) {
            if (zzp.zzh) {
                k kVar = this.c;
                I(kVar);
                kVar.O();
                try {
                    J(zzp);
                    String str = zzab.zza;
                    Objects.requireNonNull(str, "null reference");
                    k kVar2 = this.c;
                    I(kVar2);
                    zzab D2 = kVar2.D(str, zzab.zzc.zzb);
                    if (D2 != null) {
                        d().f3143m.c("Removing conditional user property", zzab.zza, this.f3238l.f3264m.f(zzab.zzc.zzb));
                        k kVar3 = this.c;
                        I(kVar3);
                        kVar3.w(str, zzab.zzc.zzb);
                        if (D2.zze) {
                            k kVar4 = this.c;
                            I(kVar4);
                            kVar4.l(str, zzab.zzc.zzb);
                        }
                        zzau zzau = zzab.zzk;
                        if (zzau != null) {
                            zzas zzas = zzau.zzb;
                            Bundle f2 = zzas != null ? zzas.f() : null;
                            q9 Q = Q();
                            zzau zzau2 = zzab.zzk;
                            Objects.requireNonNull(zzau2, "null reference");
                            zzau s0 = Q.s0(str, zzau2.zza, f2, D2.zzb, zzab.zzk.zzd, true, true);
                            Objects.requireNonNull(s0, "null reference");
                            v(s0, zzp);
                        }
                    } else {
                        d().f3139i.c("Conditional user property doesn't exist", f3.t(zzab.zza), this.f3238l.f3264m.f(zzab.zzc.zzb));
                    }
                    k kVar5 = this.c;
                    I(kVar5);
                    kVar5.m();
                } finally {
                    k kVar6 = this.c;
                    I(kVar6);
                    kVar6.P();
                }
            } else {
                J(zzp);
            }
        }
    }

    public final void o(zzks zzks, zzp zzp) {
        b().h();
        g();
        if (H(zzp)) {
            if (!zzp.zzh) {
                J(zzp);
            } else if (!"_npa".equals(zzks.zzb) || zzp.zzr == null) {
                d().f3143m.b("Removing user property", this.f3238l.f3264m.f(zzks.zzb));
                k kVar = this.c;
                I(kVar);
                kVar.O();
                try {
                    J(zzp);
                    ba.b();
                    if (this.f3238l.f3258g.u((String) null, s2.l0)) {
                        if (this.f3238l.f3258g.u((String) null, s2.n0) && "_id".equals(zzks.zzb)) {
                            k kVar2 = this.c;
                            I(kVar2);
                            String str = zzp.zza;
                            Objects.requireNonNull(str, "null reference");
                            kVar2.l(str, "_lair");
                        }
                    }
                    k kVar3 = this.c;
                    I(kVar3);
                    String str2 = zzp.zza;
                    Objects.requireNonNull(str2, "null reference");
                    kVar3.l(str2, zzks.zzb);
                    k kVar4 = this.c;
                    I(kVar4);
                    kVar4.m();
                    d().f3143m.b("User property removed", this.f3238l.f3264m.f(zzks.zzb));
                } finally {
                    k kVar5 = this.c;
                    I(kVar5);
                    kVar5.P();
                }
            } else {
                d().f3143m.a("Falling back to manifest metadata value for ad personalization");
                Objects.requireNonNull((c) e());
                t(new zzks("_npa", System.currentTimeMillis(), Long.valueOf(true != zzp.zzr.booleanValue() ? 0 : 1), "auto"), zzp);
            }
        }
    }

    public final void p(zzp zzp) {
        if (this.x != null) {
            ArrayList arrayList = new ArrayList();
            this.y = arrayList;
            arrayList.addAll(this.x);
        }
        k kVar = this.c;
        I(kVar);
        String str = zzp.zza;
        Objects.requireNonNull(str, "null reference");
        f.k(str);
        kVar.h();
        kVar.i();
        try {
            SQLiteDatabase A2 = kVar.A();
            String[] strArr = {str};
            int delete = A2.delete("apps", "app_id=?", strArr) + A2.delete("events", "app_id=?", strArr) + A2.delete("user_attributes", "app_id=?", strArr) + A2.delete("conditional_properties", "app_id=?", strArr) + A2.delete("raw_events", "app_id=?", strArr) + A2.delete("raw_events_metadata", "app_id=?", strArr) + A2.delete("queue", "app_id=?", strArr) + A2.delete("audience_filter_values", "app_id=?", strArr) + A2.delete("main_event_params", "app_id=?", strArr) + A2.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                kVar.a.d().n.c("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e2) {
            kVar.a.d().f3136f.c("Error resetting analytics data. appId, error", f3.t(str), e2);
        }
        if (zzp.zzh) {
            m(zzp);
        }
    }

    public final void q(String str, y6 y6Var) {
        b().h();
        String str2 = this.C;
        if (str2 == null || str2.equals(str) || y6Var != null) {
            this.C = str;
            this.B = y6Var;
        }
    }

    public final void r(zzab zzab, zzp zzp) {
        d3 d3Var;
        String str;
        Object t2;
        String f2;
        Object c2;
        d3 d3Var2;
        String str2;
        Object t3;
        String f3;
        Object obj;
        zzau zzau;
        Objects.requireNonNull(zzab, "null reference");
        f.k(zzab.zza);
        Objects.requireNonNull(zzab.zzb, "null reference");
        Objects.requireNonNull(zzab.zzc, "null reference");
        f.k(zzab.zzc.zzb);
        b().h();
        g();
        if (H(zzp)) {
            if (!zzp.zzh) {
                J(zzp);
                return;
            }
            zzab zzab2 = new zzab(zzab);
            boolean z2 = false;
            zzab2.zze = false;
            k kVar = this.c;
            I(kVar);
            kVar.O();
            try {
                k kVar2 = this.c;
                I(kVar2);
                String str3 = zzab2.zza;
                Objects.requireNonNull(str3, "null reference");
                zzab D2 = kVar2.D(str3, zzab2.zzc.zzb);
                if (D2 != null && !D2.zzb.equals(zzab2.zzb)) {
                    d().f3139i.d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f3238l.f3264m.f(zzab2.zzc.zzb), zzab2.zzb, D2.zzb);
                }
                if (D2 != null && D2.zze) {
                    zzab2.zzb = D2.zzb;
                    zzab2.zzd = D2.zzd;
                    zzab2.zzh = D2.zzh;
                    zzab2.zzf = D2.zzf;
                    zzab2.zzi = D2.zzi;
                    zzab2.zze = true;
                    zzks zzks = zzab2.zzc;
                    zzab2.zzc = new zzks(zzks.zzb, D2.zzc.zzc, zzks.c(), D2.zzc.zzf);
                } else if (TextUtils.isEmpty(zzab2.zzf)) {
                    zzks zzks2 = zzab2.zzc;
                    zzab2.zzc = new zzks(zzks2.zzb, zzab2.zzd, zzks2.c(), zzab2.zzc.zzf);
                    zzab2.zze = true;
                    z2 = true;
                }
                if (zzab2.zze) {
                    zzks zzks3 = zzab2.zzc;
                    String str4 = zzab2.zza;
                    Objects.requireNonNull(str4, "null reference");
                    String str5 = zzab2.zzb;
                    String str6 = zzks3.zzb;
                    long j2 = zzks3.zzc;
                    Object c3 = zzks3.c();
                    Objects.requireNonNull(c3, "null reference");
                    o9 o9Var = new o9(str4, str5, str6, j2, c3);
                    k kVar3 = this.c;
                    I(kVar3);
                    if (kVar3.s(o9Var)) {
                        d3Var2 = d().f3143m;
                        str2 = "User property updated immediately";
                        t3 = zzab2.zza;
                        f3 = this.f3238l.f3264m.f(o9Var.c);
                        obj = o9Var.f3279e;
                    } else {
                        d3Var2 = d().f3136f;
                        str2 = "(2)Too many active user properties, ignoring";
                        t3 = f3.t(zzab2.zza);
                        f3 = this.f3238l.f3264m.f(o9Var.c);
                        obj = o9Var.f3279e;
                    }
                    d3Var2.d(str2, t3, f3, obj);
                    if (z2 && (zzau = zzab2.zzi) != null) {
                        v(new zzau(zzau, zzab2.zzd), zzp);
                    }
                }
                k kVar4 = this.c;
                I(kVar4);
                if (kVar4.r(zzab2)) {
                    d3Var = d().f3143m;
                    str = "Conditional property added";
                    t2 = zzab2.zza;
                    f2 = this.f3238l.f3264m.f(zzab2.zzc.zzb);
                    c2 = zzab2.zzc.c();
                } else {
                    d3Var = d().f3136f;
                    str = "Too many conditional properties, ignoring";
                    t2 = f3.t(zzab2.zza);
                    f2 = this.f3238l.f3264m.f(zzab2.zzc.zzb);
                    c2 = zzab2.zzc.c();
                }
                d3Var.d(str, t2, f2, c2);
                k kVar5 = this.c;
                I(kVar5);
                kVar5.m();
            } finally {
                k kVar6 = this.c;
                I(kVar6);
                kVar6.P();
            }
        }
    }

    public final void s(String str, h hVar) {
        b().h();
        g();
        this.A.put(str, hVar);
        k kVar = this.c;
        I(kVar);
        Objects.requireNonNull(str, "null reference");
        kVar.h();
        kVar.i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", hVar.d());
        try {
            if (kVar.A().insertWithOnConflict("consent_settings", (String) null, contentValues, 5) == -1) {
                kVar.a.d().f3136f.b("Failed to insert/update consent setting (got -1). appId", f3.t(str));
            }
        } catch (SQLiteException e2) {
            kVar.a.d().f3136f.c("Error storing consent setting. appId, error", f3.t(str), e2);
        }
    }

    public final void t(zzks zzks, zzp zzp) {
        k kVar;
        String str;
        long j2;
        zzks zzks2 = zzks;
        zzp zzp2 = zzp;
        b().h();
        g();
        if (H(zzp)) {
            if (!zzp2.zzh) {
                J(zzp2);
                return;
            }
            int k0 = Q().k0(zzks2.zzb);
            if (k0 != 0) {
                q9 Q = Q();
                String str2 = zzks2.zzb;
                K();
                String q2 = Q.q(str2, 24, true);
                String str3 = zzks2.zzb;
                Q().z(this.D, zzp2.zza, k0, "_ev", q2, str3 != null ? str3.length() : 0);
                return;
            }
            int g0 = Q().g0(zzks2.zzb, zzks.c());
            if (g0 != 0) {
                q9 Q2 = Q();
                String str4 = zzks2.zzb;
                K();
                String q3 = Q2.q(str4, 24, true);
                Object c2 = zzks.c();
                Q().z(this.D, zzp2.zza, g0, "_ev", q3, (c2 == null || (!(c2 instanceof String) && !(c2 instanceof CharSequence))) ? 0 : c2.toString().length());
                return;
            }
            Object p2 = Q().p(zzks2.zzb, zzks.c());
            if (p2 != null) {
                if ("_sid".equals(zzks2.zzb)) {
                    long j3 = zzks2.zzc;
                    String str5 = zzks2.zzf;
                    String str6 = zzp2.zza;
                    Objects.requireNonNull(str6, "null reference");
                    k kVar2 = this.c;
                    I(kVar2);
                    o9 H = kVar2.H(str6, "_sno");
                    if (H != null) {
                        Object obj = H.f3279e;
                        if (obj instanceof Long) {
                            j2 = ((Long) obj).longValue();
                            t(new zzks("_sno", j3, Long.valueOf(j2 + 1), str5), zzp2);
                        }
                    }
                    if (H != null) {
                        d().f3139i.b("Retrieved last session number from database does not contain a valid (long) value", H.f3279e);
                    }
                    k kVar3 = this.c;
                    I(kVar3);
                    p G = kVar3.G(str6, "_s");
                    if (G != null) {
                        j2 = G.c;
                        d().n.b("Backfill the session number. Last used session number", Long.valueOf(j2));
                    } else {
                        j2 = 0;
                    }
                    t(new zzks("_sno", j3, Long.valueOf(j2 + 1), str5), zzp2);
                }
                String str7 = zzp2.zza;
                Objects.requireNonNull(str7, "null reference");
                String str8 = zzks2.zzf;
                Objects.requireNonNull(str8, "null reference");
                o9 o9Var = new o9(str7, str8, zzks2.zzb, zzks2.zzc, p2);
                d().n.c("Setting user property", this.f3238l.f3264m.f(o9Var.c), p2);
                k kVar4 = this.c;
                I(kVar4);
                kVar4.O();
                try {
                    ba.b();
                    if (this.f3238l.f3258g.u((String) null, s2.l0) && "_id".equals(o9Var.c)) {
                        if (this.f3238l.f3258g.u((String) null, s2.o0)) {
                            k kVar5 = this.c;
                            I(kVar5);
                            o9 H2 = kVar5.H(zzp2.zza, "_id");
                            if (H2 != null && !o9Var.f3279e.equals(H2.f3279e)) {
                                kVar = this.c;
                                I(kVar);
                                str = zzp2.zza;
                            }
                        } else {
                            kVar = this.c;
                            I(kVar);
                            str = zzp2.zza;
                        }
                        kVar.l(str, "_lair");
                    }
                    J(zzp2);
                    k kVar6 = this.c;
                    I(kVar6);
                    boolean s2 = kVar6.s(o9Var);
                    k kVar7 = this.c;
                    I(kVar7);
                    kVar7.m();
                    if (!s2) {
                        d().f3136f.c("Too many unique user properties are set. Ignoring user property", this.f3238l.f3264m.f(o9Var.c), o9Var.f3279e);
                        Q().z(this.D, zzp2.zza, 9, (String) null, (String) null, 0);
                    }
                } finally {
                    k kVar8 = this.c;
                    I(kVar8);
                    kVar8.P();
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:198|199) */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0200, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0201, code lost:
        r3 = r9.a.d().f3136f;
        r4 = "Failed to merge queued bundle. appId";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0250, code lost:
        r0 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:?, code lost:
        d().f3136f.c("Failed to parse upload URL. Not uploading. appId", g.e.a.b.f.b.f3.t(r7), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x04ea, code lost:
        if (r3 != null) goto L_0x04ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x010e, code lost:
        if (r12 != null) goto L_0x0110;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:198:0x046c */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0275 A[SYNTHETIC, Splitter:B:135:0x0275] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x027e A[Catch:{ all -> 0x0116, all -> 0x0513 }] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0481 A[Catch:{ all -> 0x0116, all -> 0x0513 }] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x04f6 A[Catch:{ all -> 0x0116, all -> 0x0513 }] */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x050f A[SYNTHETIC, Splitter:B:238:0x050f] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011a A[Catch:{ all -> 0x0116, all -> 0x0513 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:48:0x0110=Splitter:B:48:0x0110, B:45:0x0101=Splitter:B:45:0x0101, B:224:0x04ec=Splitter:B:224:0x04ec, B:123:0x024d=Splitter:B:123:0x024d, B:189:0x03ee=Splitter:B:189:0x03ee, B:132:0x025e=Splitter:B:132:0x025e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u() {
        /*
            r23 = this;
            r1 = r23
            g.e.a.b.f.b.g r2 = g.e.a.b.f.b.g.AD_STORAGE
            g.e.a.b.f.b.k4 r0 = r23.b()
            r0.h()
            r23.g()
            r3 = 1
            r1.u = r3
            r4 = 0
            g.e.a.b.f.b.n4 r0 = r1.f3238l     // Catch:{ all -> 0x0513 }
            g.e.a.b.f.b.b r5 = r0.f3257f     // Catch:{ all -> 0x0513 }
            g.e.a.b.f.b.f8 r0 = r0.y()     // Catch:{ all -> 0x0513 }
            java.lang.Boolean r0 = r0.f3158e     // Catch:{ all -> 0x0513 }
            if (r0 != 0) goto L_0x0027
            g.e.a.b.f.b.f3 r0 = r23.d()     // Catch:{ all -> 0x0513 }
            g.e.a.b.f.b.d3 r0 = r0.f3139i     // Catch:{ all -> 0x0513 }
            java.lang.String r2 = "Upload data called on the client side before use of service was decided"
            goto L_0x0052
        L_0x0027:
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0513 }
            if (r0 == 0) goto L_0x0036
            g.e.a.b.f.b.f3 r0 = r23.d()     // Catch:{ all -> 0x0513 }
            g.e.a.b.f.b.d3 r0 = r0.f3136f     // Catch:{ all -> 0x0513 }
            java.lang.String r2 = "Upload called in the client side when service should be used"
            goto L_0x0052
        L_0x0036:
            long r5 = r1.o     // Catch:{ all -> 0x0513 }
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x003f
            goto L_0x006c
        L_0x003f:
            g.e.a.b.f.b.k4 r0 = r23.b()     // Catch:{ all -> 0x0513 }
            r0.h()     // Catch:{ all -> 0x0513 }
            java.util.List r0 = r1.x     // Catch:{ all -> 0x0513 }
            if (r0 == 0) goto L_0x0056
            g.e.a.b.f.b.f3 r0 = r23.d()     // Catch:{ all -> 0x0513 }
            g.e.a.b.f.b.d3 r0 = r0.n     // Catch:{ all -> 0x0513 }
            java.lang.String r2 = "Uploading requested multiple times"
        L_0x0052:
            r0.a(r2)     // Catch:{ all -> 0x0513 }
            goto L_0x006f
        L_0x0056:
            g.e.a.b.f.b.k3 r0 = r1.b     // Catch:{ all -> 0x0513 }
            I(r0)     // Catch:{ all -> 0x0513 }
            boolean r0 = r0.l()     // Catch:{ all -> 0x0513 }
            if (r0 != 0) goto L_0x0073
            g.e.a.b.f.b.f3 r0 = r23.d()     // Catch:{ all -> 0x0513 }
            g.e.a.b.f.b.d3 r0 = r0.n     // Catch:{ all -> 0x0513 }
            java.lang.String r2 = "Network not connected, ignoring upload request"
            r0.a(r2)     // Catch:{ all -> 0x0513 }
        L_0x006c:
            r23.D()     // Catch:{ all -> 0x0513 }
        L_0x006f:
            r1.u = r4
            goto L_0x0507
        L_0x0073:
            g.e.a.b.b.h.b r0 = r23.e()     // Catch:{ all -> 0x0513 }
            g.e.a.b.b.h.c r0 = (g.e.a.b.b.h.c) r0     // Catch:{ all -> 0x0513 }
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x0513 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0513 }
            g.e.a.b.f.b.f r0 = r23.K()     // Catch:{ all -> 0x0513 }
            g.e.a.b.f.b.r2 r9 = g.e.a.b.f.b.s2.Q     // Catch:{ all -> 0x0513 }
            r10 = 0
            int r0 = r0.n(r10, r9)     // Catch:{ all -> 0x0513 }
            r23.K()     // Catch:{ all -> 0x0513 }
            g.e.a.b.f.b.r2 r9 = g.e.a.b.f.b.s2.f3327d     // Catch:{ all -> 0x0513 }
            java.lang.Object r9 = r9.a(r10)     // Catch:{ all -> 0x0513 }
            java.lang.Long r9 = (java.lang.Long) r9     // Catch:{ all -> 0x0513 }
            long r11 = r9.longValue()     // Catch:{ all -> 0x0513 }
            long r11 = r5 - r11
            r9 = 0
        L_0x009d:
            if (r9 >= r0) goto L_0x00a8
            boolean r13 = r1.E(r10, r11)     // Catch:{ all -> 0x0513 }
            if (r13 == 0) goto L_0x00a8
            int r9 = r9 + 1
            goto L_0x009d
        L_0x00a8:
            g.e.a.b.f.b.h8 r0 = r1.f3235i     // Catch:{ all -> 0x0513 }
            g.e.a.b.f.b.p3 r0 = r0.f3186j     // Catch:{ all -> 0x0513 }
            long r11 = r0.a()     // Catch:{ all -> 0x0513 }
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x00c9
            g.e.a.b.f.b.f3 r0 = r23.d()     // Catch:{ all -> 0x0513 }
            g.e.a.b.f.b.d3 r0 = r0.f3143m     // Catch:{ all -> 0x0513 }
            java.lang.String r7 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r8 = r5 - r11
            long r8 = java.lang.Math.abs(r8)     // Catch:{ all -> 0x0513 }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0513 }
            r0.b(r7, r8)     // Catch:{ all -> 0x0513 }
        L_0x00c9:
            g.e.a.b.f.b.k r0 = r1.c     // Catch:{ all -> 0x0513 }
            I(r0)     // Catch:{ all -> 0x0513 }
            java.lang.String r7 = r0.J()     // Catch:{ all -> 0x0513 }
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0513 }
            r8 = -1
            if (r0 != 0) goto L_0x0485
            long r11 = r1.z     // Catch:{ all -> 0x0513 }
            int r0 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x011e
            g.e.a.b.f.b.k r11 = r1.c     // Catch:{ all -> 0x0513 }
            I(r11)     // Catch:{ all -> 0x0513 }
            android.database.sqlite.SQLiteDatabase r0 = r11.A()     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fd }
            java.lang.String r12 = "select rowid from raw_events order by rowid desc limit 1;"
            android.database.Cursor r12 = r0.rawQuery(r12, r10)     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fd }
            boolean r0 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x00fb }
            if (r0 != 0) goto L_0x00f6
            goto L_0x0110
        L_0x00f6:
            long r8 = r12.getLong(r4)     // Catch:{ SQLiteException -> 0x00fb }
            goto L_0x0110
        L_0x00fb:
            r0 = move-exception
            goto L_0x0101
        L_0x00fd:
            r0 = move-exception
            goto L_0x0118
        L_0x00ff:
            r0 = move-exception
            r12 = r10
        L_0x0101:
            g.e.a.b.f.b.n4 r11 = r11.a     // Catch:{ all -> 0x0116 }
            g.e.a.b.f.b.f3 r11 = r11.d()     // Catch:{ all -> 0x0116 }
            g.e.a.b.f.b.d3 r11 = r11.f3136f     // Catch:{ all -> 0x0116 }
            java.lang.String r13 = "Error querying raw events"
            r11.b(r13, r0)     // Catch:{ all -> 0x0116 }
            if (r12 == 0) goto L_0x0113
        L_0x0110:
            r12.close()     // Catch:{ all -> 0x0513 }
        L_0x0113:
            r1.z = r8     // Catch:{ all -> 0x0513 }
            goto L_0x011e
        L_0x0116:
            r0 = move-exception
            r10 = r12
        L_0x0118:
            if (r10 == 0) goto L_0x011d
            r10.close()     // Catch:{ all -> 0x0513 }
        L_0x011d:
            throw r0     // Catch:{ all -> 0x0513 }
        L_0x011e:
            g.e.a.b.f.b.f r0 = r23.K()     // Catch:{ all -> 0x0513 }
            g.e.a.b.f.b.r2 r8 = g.e.a.b.f.b.s2.f3330g     // Catch:{ all -> 0x0513 }
            int r0 = r0.n(r7, r8)     // Catch:{ all -> 0x0513 }
            g.e.a.b.f.b.f r8 = r23.K()     // Catch:{ all -> 0x0513 }
            g.e.a.b.f.b.r2 r9 = g.e.a.b.f.b.s2.f3331h     // Catch:{ all -> 0x0513 }
            int r8 = r8.n(r7, r9)     // Catch:{ all -> 0x0513 }
            int r8 = java.lang.Math.max(r4, r8)     // Catch:{ all -> 0x0513 }
            g.e.a.b.f.b.k r9 = r1.c     // Catch:{ all -> 0x0513 }
            I(r9)     // Catch:{ all -> 0x0513 }
            r9.h()     // Catch:{ all -> 0x0513 }
            r9.i()     // Catch:{ all -> 0x0513 }
            if (r0 <= 0) goto L_0x0145
            r11 = 1
            goto L_0x0146
        L_0x0145:
            r11 = 0
        L_0x0146:
            g.c.b.b.f.g(r11)     // Catch:{ all -> 0x0513 }
            if (r8 <= 0) goto L_0x014d
            r11 = 1
            goto L_0x014e
        L_0x014d:
            r11 = 0
        L_0x014e:
            g.c.b.b.f.g(r11)     // Catch:{ all -> 0x0513 }
            g.c.b.b.f.k(r7)     // Catch:{ all -> 0x0513 }
            android.database.sqlite.SQLiteDatabase r12 = r9.A()     // Catch:{ SQLiteException -> 0x025a, all -> 0x0256 }
            java.lang.String r13 = "rowid"
            java.lang.String r14 = "data"
            java.lang.String r15 = "retry_count"
            java.lang.String[] r14 = new java.lang.String[]{r13, r14, r15}     // Catch:{ SQLiteException -> 0x025a, all -> 0x0256 }
            java.lang.String[] r15 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x025a, all -> 0x0256 }
            r15[r4] = r7     // Catch:{ SQLiteException -> 0x025a, all -> 0x0256 }
            java.lang.String r13 = "queue"
            java.lang.String r16 = "app_id=?"
            r17 = 0
            r18 = 0
            java.lang.String r19 = "rowid"
            java.lang.String r20 = java.lang.String.valueOf(r0)     // Catch:{ SQLiteException -> 0x025a, all -> 0x0256 }
            r0 = r15
            r15 = r16
            r16 = r0
            android.database.Cursor r12 = r12.query(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ SQLiteException -> 0x025a, all -> 0x0256 }
            boolean r0 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x0252 }
            if (r0 != 0) goto L_0x018e
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x0252 }
            r12.close()     // Catch:{ all -> 0x0513 }
            r21 = r5
            goto L_0x0278
        L_0x018e:
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0252 }
            r13.<init>()     // Catch:{ SQLiteException -> 0x0252 }
            r14 = 0
        L_0x0194:
            long r15 = r12.getLong(r4)     // Catch:{ SQLiteException -> 0x0252 }
            byte[] r0 = r12.getBlob(r3)     // Catch:{ IOException -> 0x022c }
            g.e.a.b.f.b.k9 r3 = r9.b     // Catch:{ IOException -> 0x022c }
            g.e.a.b.f.b.m9 r3 = r3.f3233g     // Catch:{ IOException -> 0x022c }
            I(r3)     // Catch:{ IOException -> 0x022c }
            java.io.ByteArrayInputStream r10 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x0219 }
            r10.<init>(r0)     // Catch:{ IOException -> 0x0219 }
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0219 }
            r0.<init>(r10)     // Catch:{ IOException -> 0x0219 }
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0219 }
            r4.<init>()     // Catch:{ IOException -> 0x0219 }
            r11 = 1024(0x400, float:1.435E-42)
            byte[] r11 = new byte[r11]     // Catch:{ IOException -> 0x0219 }
            r21 = r5
        L_0x01b8:
            int r5 = r0.read(r11)     // Catch:{ IOException -> 0x0217 }
            if (r5 > 0) goto L_0x0212
            r0.close()     // Catch:{ IOException -> 0x0217 }
            r10.close()     // Catch:{ IOException -> 0x0217 }
            byte[] r0 = r4.toByteArray()     // Catch:{ IOException -> 0x0217 }
            boolean r3 = r13.isEmpty()     // Catch:{ SQLiteException -> 0x0210 }
            if (r3 != 0) goto L_0x01d4
            int r3 = r0.length     // Catch:{ SQLiteException -> 0x0210 }
            int r3 = r3 + r14
            if (r3 <= r8) goto L_0x01d4
            goto L_0x024d
        L_0x01d4:
            g.e.a.b.e.c.e4 r3 = g.e.a.b.e.c.f4.x1()     // Catch:{ IOException -> 0x0200 }
            g.e.a.b.e.c.g6 r3 = g.e.a.b.f.b.m9.B(r3, r0)     // Catch:{ IOException -> 0x0200 }
            g.e.a.b.e.c.e4 r3 = (g.e.a.b.e.c.e4) r3     // Catch:{ IOException -> 0x0200 }
            r4 = 2
            boolean r5 = r12.isNull(r4)     // Catch:{ SQLiteException -> 0x0210 }
            if (r5 != 0) goto L_0x01ec
            int r5 = r12.getInt(r4)     // Catch:{ SQLiteException -> 0x0210 }
            r3.N(r5)     // Catch:{ SQLiteException -> 0x0210 }
        L_0x01ec:
            int r0 = r0.length     // Catch:{ SQLiteException -> 0x0210 }
            int r14 = r14 + r0
            g.e.a.b.e.c.o7 r0 = r3.j()     // Catch:{ SQLiteException -> 0x0210 }
            g.e.a.b.e.c.f4 r0 = (g.e.a.b.e.c.f4) r0     // Catch:{ SQLiteException -> 0x0210 }
            java.lang.Long r3 = java.lang.Long.valueOf(r15)     // Catch:{ SQLiteException -> 0x0210 }
            android.util.Pair r0 = android.util.Pair.create(r0, r3)     // Catch:{ SQLiteException -> 0x0210 }
            r13.add(r0)     // Catch:{ SQLiteException -> 0x0210 }
            goto L_0x023d
        L_0x0200:
            r0 = move-exception
            g.e.a.b.f.b.n4 r3 = r9.a     // Catch:{ SQLiteException -> 0x0210 }
            g.e.a.b.f.b.f3 r3 = r3.d()     // Catch:{ SQLiteException -> 0x0210 }
            g.e.a.b.f.b.d3 r3 = r3.f3136f     // Catch:{ SQLiteException -> 0x0210 }
            java.lang.String r4 = "Failed to merge queued bundle. appId"
        L_0x020b:
            java.lang.Object r5 = g.e.a.b.f.b.f3.t(r7)     // Catch:{ SQLiteException -> 0x0210 }
            goto L_0x023a
        L_0x0210:
            r0 = move-exception
            goto L_0x025e
        L_0x0212:
            r6 = 0
            r4.write(r11, r6, r5)     // Catch:{ IOException -> 0x0217 }
            goto L_0x01b8
        L_0x0217:
            r0 = move-exception
            goto L_0x021c
        L_0x0219:
            r0 = move-exception
            r21 = r5
        L_0x021c:
            g.e.a.b.f.b.n4 r3 = r3.a     // Catch:{ IOException -> 0x022a }
            g.e.a.b.f.b.f3 r3 = r3.d()     // Catch:{ IOException -> 0x022a }
            g.e.a.b.f.b.d3 r3 = r3.f3136f     // Catch:{ IOException -> 0x022a }
            java.lang.String r4 = "Failed to ungzip content"
            r3.b(r4, r0)     // Catch:{ IOException -> 0x022a }
            throw r0     // Catch:{ IOException -> 0x022a }
        L_0x022a:
            r0 = move-exception
            goto L_0x022f
        L_0x022c:
            r0 = move-exception
            r21 = r5
        L_0x022f:
            g.e.a.b.f.b.n4 r3 = r9.a     // Catch:{ SQLiteException -> 0x0210 }
            g.e.a.b.f.b.f3 r3 = r3.d()     // Catch:{ SQLiteException -> 0x0210 }
            g.e.a.b.f.b.d3 r3 = r3.f3136f     // Catch:{ SQLiteException -> 0x0210 }
            java.lang.String r4 = "Failed to unzip queued bundle. appId"
            goto L_0x020b
        L_0x023a:
            r3.c(r4, r5, r0)     // Catch:{ SQLiteException -> 0x0210 }
        L_0x023d:
            boolean r0 = r12.moveToNext()     // Catch:{ SQLiteException -> 0x0210 }
            if (r0 == 0) goto L_0x024d
            if (r14 <= r8) goto L_0x0246
            goto L_0x024d
        L_0x0246:
            r5 = r21
            r3 = 1
            r4 = 0
            r10 = 0
            goto L_0x0194
        L_0x024d:
            r12.close()     // Catch:{ all -> 0x0513 }
            r0 = r13
            goto L_0x0278
        L_0x0252:
            r0 = move-exception
            r21 = r5
            goto L_0x025e
        L_0x0256:
            r0 = move-exception
            r10 = 0
            goto L_0x047f
        L_0x025a:
            r0 = move-exception
            r21 = r5
            r12 = 0
        L_0x025e:
            g.e.a.b.f.b.n4 r3 = r9.a     // Catch:{ all -> 0x047d }
            g.e.a.b.f.b.f3 r3 = r3.d()     // Catch:{ all -> 0x047d }
            g.e.a.b.f.b.d3 r3 = r3.f3136f     // Catch:{ all -> 0x047d }
            java.lang.String r4 = "Error querying bundles. appId"
            java.lang.Object r5 = g.e.a.b.f.b.f3.t(r7)     // Catch:{ all -> 0x047d }
            r3.c(r4, r5, r0)     // Catch:{ all -> 0x047d }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x047d }
            if (r12 == 0) goto L_0x0278
            r12.close()     // Catch:{ all -> 0x0513 }
        L_0x0278:
            boolean r3 = r0.isEmpty()     // Catch:{ all -> 0x0513 }
            if (r3 != 0) goto L_0x0504
            g.e.a.b.f.b.h r3 = r1.L(r7)     // Catch:{ all -> 0x0513 }
            boolean r3 = r3.e(r2)     // Catch:{ all -> 0x0513 }
            if (r3 == 0) goto L_0x02dd
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x0513 }
        L_0x028c:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0513 }
            if (r4 == 0) goto L_0x02ab
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0513 }
            android.util.Pair r4 = (android.util.Pair) r4     // Catch:{ all -> 0x0513 }
            java.lang.Object r4 = r4.first     // Catch:{ all -> 0x0513 }
            g.e.a.b.e.c.f4 r4 = (g.e.a.b.e.c.f4) r4     // Catch:{ all -> 0x0513 }
            java.lang.String r5 = r4.C()     // Catch:{ all -> 0x0513 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0513 }
            if (r5 != 0) goto L_0x028c
            java.lang.String r3 = r4.C()     // Catch:{ all -> 0x0513 }
            goto L_0x02ac
        L_0x02ab:
            r3 = 0
        L_0x02ac:
            if (r3 == 0) goto L_0x02dd
            r4 = 0
        L_0x02af:
            int r5 = r0.size()     // Catch:{ all -> 0x0513 }
            if (r4 >= r5) goto L_0x02dd
            java.lang.Object r5 = r0.get(r4)     // Catch:{ all -> 0x0513 }
            android.util.Pair r5 = (android.util.Pair) r5     // Catch:{ all -> 0x0513 }
            java.lang.Object r5 = r5.first     // Catch:{ all -> 0x0513 }
            g.e.a.b.e.c.f4 r5 = (g.e.a.b.e.c.f4) r5     // Catch:{ all -> 0x0513 }
            java.lang.String r6 = r5.C()     // Catch:{ all -> 0x0513 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0513 }
            if (r6 == 0) goto L_0x02ca
            goto L_0x02da
        L_0x02ca:
            java.lang.String r5 = r5.C()     // Catch:{ all -> 0x0513 }
            boolean r5 = r5.equals(r3)     // Catch:{ all -> 0x0513 }
            if (r5 != 0) goto L_0x02da
            r5 = 0
            java.util.List r0 = r0.subList(r5, r4)     // Catch:{ all -> 0x0513 }
            goto L_0x02dd
        L_0x02da:
            int r4 = r4 + 1
            goto L_0x02af
        L_0x02dd:
            g.e.a.b.e.c.c4 r3 = g.e.a.b.e.c.d4.s()     // Catch:{ all -> 0x0513 }
            int r4 = r0.size()     // Catch:{ all -> 0x0513 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0513 }
            int r6 = r0.size()     // Catch:{ all -> 0x0513 }
            r5.<init>(r6)     // Catch:{ all -> 0x0513 }
            g.e.a.b.f.b.f r6 = r23.K()     // Catch:{ all -> 0x0513 }
            g.e.a.b.f.b.e r6 = r6.c     // Catch:{ all -> 0x0513 }
            java.lang.String r8 = "gaia_collection_enabled"
            java.lang.String r6 = r6.a(r7, r8)     // Catch:{ all -> 0x0513 }
            java.lang.String r8 = "1"
            boolean r6 = r8.equals(r6)     // Catch:{ all -> 0x0513 }
            if (r6 == 0) goto L_0x030e
            g.e.a.b.f.b.h r6 = r1.L(r7)     // Catch:{ all -> 0x0513 }
            boolean r6 = r6.e(r2)     // Catch:{ all -> 0x0513 }
            if (r6 == 0) goto L_0x030e
            r6 = 1
            goto L_0x030f
        L_0x030e:
            r6 = 0
        L_0x030f:
            g.e.a.b.f.b.h r8 = r1.L(r7)     // Catch:{ all -> 0x0513 }
            boolean r2 = r8.e(r2)     // Catch:{ all -> 0x0513 }
            g.e.a.b.f.b.h r8 = r1.L(r7)     // Catch:{ all -> 0x0513 }
            g.e.a.b.f.b.g r9 = g.e.a.b.f.b.g.ANALYTICS_STORAGE     // Catch:{ all -> 0x0513 }
            boolean r8 = r8.e(r9)     // Catch:{ all -> 0x0513 }
            r9 = 0
        L_0x0322:
            if (r9 >= r4) goto L_0x03b1
            java.lang.Object r10 = r0.get(r9)     // Catch:{ all -> 0x0513 }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ all -> 0x0513 }
            java.lang.Object r10 = r10.first     // Catch:{ all -> 0x0513 }
            g.e.a.b.e.c.f4 r10 = (g.e.a.b.e.c.f4) r10     // Catch:{ all -> 0x0513 }
            g.e.a.b.e.c.l7 r10 = r10.n()     // Catch:{ all -> 0x0513 }
            g.e.a.b.e.c.e4 r10 = (g.e.a.b.e.c.e4) r10     // Catch:{ all -> 0x0513 }
            java.lang.Object r11 = r0.get(r9)     // Catch:{ all -> 0x0513 }
            android.util.Pair r11 = (android.util.Pair) r11     // Catch:{ all -> 0x0513 }
            java.lang.Object r11 = r11.second     // Catch:{ all -> 0x0513 }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0513 }
            r5.add(r11)     // Catch:{ all -> 0x0513 }
            g.e.a.b.f.b.f r11 = r23.K()     // Catch:{ all -> 0x0513 }
            r11.p()     // Catch:{ all -> 0x0513 }
            boolean r11 = r10.f2990d     // Catch:{ all -> 0x0513 }
            if (r11 == 0) goto L_0x0352
            r10.f()     // Catch:{ all -> 0x0513 }
            r11 = 0
            r10.f2990d = r11     // Catch:{ all -> 0x0513 }
        L_0x0352:
            g.e.a.b.e.c.o7 r11 = r10.c     // Catch:{ all -> 0x0513 }
            g.e.a.b.e.c.f4 r11 = (g.e.a.b.e.c.f4) r11     // Catch:{ all -> 0x0513 }
            g.e.a.b.e.c.f4.O0(r11)     // Catch:{ all -> 0x0513 }
            boolean r11 = r10.f2990d     // Catch:{ all -> 0x0513 }
            if (r11 == 0) goto L_0x0363
            r10.f()     // Catch:{ all -> 0x0513 }
            r11 = 0
            r10.f2990d = r11     // Catch:{ all -> 0x0513 }
        L_0x0363:
            g.e.a.b.e.c.o7 r11 = r10.c     // Catch:{ all -> 0x0513 }
            g.e.a.b.e.c.f4 r11 = (g.e.a.b.e.c.f4) r11     // Catch:{ all -> 0x0513 }
            r12 = r21
            g.e.a.b.e.c.f4.y0(r11, r12)     // Catch:{ all -> 0x0513 }
            g.e.a.b.f.b.n4 r11 = r1.f3238l     // Catch:{ all -> 0x0513 }
            g.e.a.b.f.b.b r11 = r11.f3257f     // Catch:{ all -> 0x0513 }
            r11 = 0
            r10.O(r11)     // Catch:{ all -> 0x0513 }
            if (r6 != 0) goto L_0x0379
            r10.k0()     // Catch:{ all -> 0x0513 }
        L_0x0379:
            if (r2 != 0) goto L_0x0381
            r10.q0()     // Catch:{ all -> 0x0513 }
            r10.n0()     // Catch:{ all -> 0x0513 }
        L_0x0381:
            if (r8 != 0) goto L_0x0386
            r10.i0()     // Catch:{ all -> 0x0513 }
        L_0x0386:
            g.e.a.b.f.b.f r11 = r23.K()     // Catch:{ all -> 0x0513 }
            g.e.a.b.f.b.r2 r14 = g.e.a.b.f.b.s2.U     // Catch:{ all -> 0x0513 }
            boolean r11 = r11.u(r7, r14)     // Catch:{ all -> 0x0513 }
            if (r11 == 0) goto L_0x03a8
            g.e.a.b.e.c.o7 r11 = r10.j()     // Catch:{ all -> 0x0513 }
            g.e.a.b.e.c.f4 r11 = (g.e.a.b.e.c.f4) r11     // Catch:{ all -> 0x0513 }
            byte[] r11 = r11.i()     // Catch:{ all -> 0x0513 }
            g.e.a.b.f.b.m9 r14 = r1.f3233g     // Catch:{ all -> 0x0513 }
            I(r14)     // Catch:{ all -> 0x0513 }
            long r14 = r14.w(r11)     // Catch:{ all -> 0x0513 }
            r10.r(r14)     // Catch:{ all -> 0x0513 }
        L_0x03a8:
            r3.l(r10)     // Catch:{ all -> 0x0513 }
            int r9 = r9 + 1
            r21 = r12
            goto L_0x0322
        L_0x03b1:
            r12 = r21
            g.e.a.b.f.b.f3 r0 = r23.d()     // Catch:{ all -> 0x0513 }
            java.lang.String r0 = r0.w()     // Catch:{ all -> 0x0513 }
            r2 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r2)     // Catch:{ all -> 0x0513 }
            if (r0 == 0) goto L_0x03d2
            g.e.a.b.f.b.m9 r0 = r1.f3233g     // Catch:{ all -> 0x0513 }
            I(r0)     // Catch:{ all -> 0x0513 }
            g.e.a.b.e.c.o7 r2 = r3.j()     // Catch:{ all -> 0x0513 }
            g.e.a.b.e.c.d4 r2 = (g.e.a.b.e.c.d4) r2     // Catch:{ all -> 0x0513 }
            java.lang.String r0 = r0.C(r2)     // Catch:{ all -> 0x0513 }
            goto L_0x03d3
        L_0x03d2:
            r0 = 0
        L_0x03d3:
            g.e.a.b.f.b.m9 r2 = r1.f3233g     // Catch:{ all -> 0x0513 }
            I(r2)     // Catch:{ all -> 0x0513 }
            g.e.a.b.e.c.o7 r2 = r3.j()     // Catch:{ all -> 0x0513 }
            g.e.a.b.e.c.d4 r2 = (g.e.a.b.e.c.d4) r2     // Catch:{ all -> 0x0513 }
            byte[] r15 = r2.i()     // Catch:{ all -> 0x0513 }
            r23.K()     // Catch:{ all -> 0x0513 }
            g.e.a.b.f.b.r2 r2 = g.e.a.b.f.b.s2.q     // Catch:{ all -> 0x0513 }
            r6 = 0
            java.lang.Object r2 = r2.a(r6)     // Catch:{ all -> 0x0513 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0513 }
            java.net.URL r14 = new java.net.URL     // Catch:{ MalformedURLException -> 0x046c }
            r14.<init>(r2)     // Catch:{ MalformedURLException -> 0x046c }
            boolean r6 = r5.isEmpty()     // Catch:{ MalformedURLException -> 0x046c }
            r8 = 1
            r6 = r6 ^ r8
            g.c.b.b.f.g(r6)     // Catch:{ MalformedURLException -> 0x046c }
            java.util.List r6 = r1.x     // Catch:{ MalformedURLException -> 0x046c }
            if (r6 == 0) goto L_0x040e
            g.e.a.b.f.b.f3 r5 = r23.d()     // Catch:{ MalformedURLException -> 0x046c }
            g.e.a.b.f.b.d3 r5 = r5.p()     // Catch:{ MalformedURLException -> 0x046c }
            java.lang.String r6 = "Set uploading progress before finishing the previous upload"
            r5.a(r6)     // Catch:{ MalformedURLException -> 0x046c }
            goto L_0x0415
        L_0x040e:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x046c }
            r6.<init>(r5)     // Catch:{ MalformedURLException -> 0x046c }
            r1.x = r6     // Catch:{ MalformedURLException -> 0x046c }
        L_0x0415:
            g.e.a.b.f.b.h8 r5 = r1.f3235i     // Catch:{ MalformedURLException -> 0x046c }
            g.e.a.b.f.b.p3 r5 = r5.f3187k     // Catch:{ MalformedURLException -> 0x046c }
            r5.b(r12)     // Catch:{ MalformedURLException -> 0x046c }
            java.lang.String r5 = "?"
            if (r4 <= 0) goto L_0x0428
            g.e.a.b.e.c.f4 r3 = r3.m()     // Catch:{ MalformedURLException -> 0x046c }
            java.lang.String r5 = r3.B1()     // Catch:{ MalformedURLException -> 0x046c }
        L_0x0428:
            g.e.a.b.f.b.f3 r3 = r23.d()     // Catch:{ MalformedURLException -> 0x046c }
            g.e.a.b.f.b.d3 r3 = r3.q()     // Catch:{ MalformedURLException -> 0x046c }
            java.lang.String r4 = "Uploading data. app, uncompressed size, data"
            int r6 = r15.length     // Catch:{ MalformedURLException -> 0x046c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ MalformedURLException -> 0x046c }
            r3.d(r4, r5, r6, r0)     // Catch:{ MalformedURLException -> 0x046c }
            r3 = 1
            r1.t = r3     // Catch:{ MalformedURLException -> 0x046c }
            g.e.a.b.f.b.k3 r12 = r1.b     // Catch:{ MalformedURLException -> 0x046c }
            I(r12)     // Catch:{ MalformedURLException -> 0x046c }
            g.e.a.b.f.b.e9 r0 = new g.e.a.b.f.b.e9     // Catch:{ MalformedURLException -> 0x046c }
            r0.<init>(r1, r7)     // Catch:{ MalformedURLException -> 0x046c }
            r12.h()     // Catch:{ MalformedURLException -> 0x046c }
            r12.i()     // Catch:{ MalformedURLException -> 0x046c }
            g.c.b.b.f.n(r14)     // Catch:{ MalformedURLException -> 0x046c }
            g.c.b.b.f.n(r15)     // Catch:{ MalformedURLException -> 0x046c }
            g.c.b.b.f.n(r0)     // Catch:{ MalformedURLException -> 0x046c }
            g.e.a.b.f.b.n4 r3 = r12.a     // Catch:{ MalformedURLException -> 0x046c }
            g.e.a.b.f.b.k4 r3 = r3.b()     // Catch:{ MalformedURLException -> 0x046c }
            g.e.a.b.f.b.j3 r4 = new g.e.a.b.f.b.j3     // Catch:{ MalformedURLException -> 0x046c }
            r16 = 0
            r11 = r4
            r13 = r7
            r17 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17)     // Catch:{ MalformedURLException -> 0x046c }
            r3.q(r4)     // Catch:{ MalformedURLException -> 0x046c }
            goto L_0x0504
        L_0x046c:
            g.e.a.b.f.b.f3 r0 = r23.d()     // Catch:{ all -> 0x0513 }
            g.e.a.b.f.b.d3 r0 = r0.f3136f     // Catch:{ all -> 0x0513 }
            java.lang.String r3 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r4 = g.e.a.b.f.b.f3.t(r7)     // Catch:{ all -> 0x0513 }
            r0.c(r3, r4, r2)     // Catch:{ all -> 0x0513 }
            goto L_0x0504
        L_0x047d:
            r0 = move-exception
            r10 = r12
        L_0x047f:
            if (r10 == 0) goto L_0x0484
            r10.close()     // Catch:{ all -> 0x0513 }
        L_0x0484:
            throw r0     // Catch:{ all -> 0x0513 }
        L_0x0485:
            r12 = r5
            r1.z = r8     // Catch:{ all -> 0x0513 }
            g.e.a.b.f.b.k r2 = r1.c     // Catch:{ all -> 0x0513 }
            I(r2)     // Catch:{ all -> 0x0513 }
            r23.K()     // Catch:{ all -> 0x0513 }
            g.e.a.b.f.b.r2 r0 = g.e.a.b.f.b.s2.f3327d     // Catch:{ all -> 0x0513 }
            r6 = 0
            java.lang.Object r0 = r0.a(r6)     // Catch:{ all -> 0x0513 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0513 }
            long r3 = r0.longValue()     // Catch:{ all -> 0x0513 }
            long r3 = r12 - r3
            r2.h()     // Catch:{ all -> 0x0513 }
            r2.i()     // Catch:{ all -> 0x0513 }
            android.database.sqlite.SQLiteDatabase r0 = r2.A()     // Catch:{ SQLiteException -> 0x04db, all -> 0x04d8 }
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x04db, all -> 0x04d8 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ SQLiteException -> 0x04db, all -> 0x04d8 }
            r4 = 0
            r5[r4] = r3     // Catch:{ SQLiteException -> 0x04db, all -> 0x04d8 }
            java.lang.String r3 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            android.database.Cursor r3 = r0.rawQuery(r3, r5)     // Catch:{ SQLiteException -> 0x04db, all -> 0x04d8 }
            boolean r0 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x04cd }
            if (r0 != 0) goto L_0x04cf
            g.e.a.b.f.b.n4 r0 = r2.a     // Catch:{ SQLiteException -> 0x04cd }
            g.e.a.b.f.b.f3 r0 = r0.d()     // Catch:{ SQLiteException -> 0x04cd }
            g.e.a.b.f.b.d3 r0 = r0.n     // Catch:{ SQLiteException -> 0x04cd }
            java.lang.String r4 = "No expired configs for apps with pending events"
            r0.a(r4)     // Catch:{ SQLiteException -> 0x04cd }
            goto L_0x04ec
        L_0x04cd:
            r0 = move-exception
            goto L_0x04dd
        L_0x04cf:
            r4 = 0
            java.lang.String r10 = r3.getString(r4)     // Catch:{ SQLiteException -> 0x04cd }
            r3.close()     // Catch:{ all -> 0x0513 }
            goto L_0x04f0
        L_0x04d8:
            r0 = move-exception
            r10 = r6
            goto L_0x050d
        L_0x04db:
            r0 = move-exception
            r3 = r6
        L_0x04dd:
            g.e.a.b.f.b.n4 r2 = r2.a     // Catch:{ all -> 0x050b }
            g.e.a.b.f.b.f3 r2 = r2.d()     // Catch:{ all -> 0x050b }
            g.e.a.b.f.b.d3 r2 = r2.f3136f     // Catch:{ all -> 0x050b }
            java.lang.String r4 = "Error selecting expired configs"
            r2.b(r4, r0)     // Catch:{ all -> 0x050b }
            if (r3 == 0) goto L_0x04ef
        L_0x04ec:
            r3.close()     // Catch:{ all -> 0x0513 }
        L_0x04ef:
            r10 = r6
        L_0x04f0:
            boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0513 }
            if (r0 != 0) goto L_0x0504
            g.e.a.b.f.b.k r0 = r1.c     // Catch:{ all -> 0x0513 }
            I(r0)     // Catch:{ all -> 0x0513 }
            g.e.a.b.f.b.w4 r0 = r0.C(r10)     // Catch:{ all -> 0x0513 }
            if (r0 == 0) goto L_0x0504
            r1.h(r0)     // Catch:{ all -> 0x0513 }
        L_0x0504:
            r2 = 0
            r1.u = r2
        L_0x0507:
            r23.B()
            return
        L_0x050b:
            r0 = move-exception
            r10 = r3
        L_0x050d:
            if (r10 == 0) goto L_0x0512
            r10.close()     // Catch:{ all -> 0x0513 }
        L_0x0512:
            throw r0     // Catch:{ all -> 0x0513 }
        L_0x0513:
            r0 = move-exception
            r2 = 0
            r1.u = r2
            r23.B()
            goto L_0x051c
        L_0x051b:
            throw r0
        L_0x051c:
            goto L_0x051b
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.k9.u():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:218:0x074a, code lost:
        if (r14.size() == 0) goto L_0x074c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x03ac A[Catch:{ SQLiteException -> 0x02b7, all -> 0x0a97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x03d9  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0538 A[Catch:{ SQLiteException -> 0x02b7, all -> 0x0a97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0572 A[Catch:{ SQLiteException -> 0x02b7, all -> 0x0a97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x05eb A[Catch:{ SQLiteException -> 0x02b7, all -> 0x0a97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0635 A[Catch:{ SQLiteException -> 0x02b7, all -> 0x0a97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0642 A[Catch:{ SQLiteException -> 0x02b7, all -> 0x0a97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x064f A[Catch:{ SQLiteException -> 0x02b7, all -> 0x0a97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x065d A[Catch:{ SQLiteException -> 0x02b7, all -> 0x0a97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x066e A[Catch:{ SQLiteException -> 0x02b7, all -> 0x0a97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x06ac A[Catch:{ SQLiteException -> 0x02b7, all -> 0x0a97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x06c7 A[Catch:{ SQLiteException -> 0x02b7, all -> 0x0a97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x074f A[Catch:{ SQLiteException -> 0x02b7, all -> 0x0a97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x076d A[Catch:{ SQLiteException -> 0x02b7, all -> 0x0a97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x07db A[Catch:{ SQLiteException -> 0x02b7, all -> 0x0a97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x07e8 A[Catch:{ SQLiteException -> 0x02b7, all -> 0x0a97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0804 A[Catch:{ SQLiteException -> 0x02b7, all -> 0x0a97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x089b A[Catch:{ SQLiteException -> 0x02b7, all -> 0x0a97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x08b7 A[Catch:{ SQLiteException -> 0x02b7, all -> 0x0a97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0953 A[Catch:{ SQLiteException -> 0x02b7, all -> 0x0a97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x09f7 A[Catch:{ SQLiteException -> 0x0a12 }] */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x0a0d  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x0960 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x017e A[Catch:{ SQLiteException -> 0x02b7, all -> 0x0a97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0191 A[Catch:{ SQLiteException -> 0x02b7, all -> 0x0a97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0212 A[Catch:{ SQLiteException -> 0x02b7, all -> 0x0a97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02f4 A[Catch:{ SQLiteException -> 0x02b7, all -> 0x0a97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x033c A[Catch:{ SQLiteException -> 0x02b7, all -> 0x0a97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x033f A[Catch:{ SQLiteException -> 0x02b7, all -> 0x0a97 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v(com.google.android.gms.measurement.internal.zzau r35, com.google.android.gms.measurement.internal.zzp r36) {
        /*
            r34 = this;
            r1 = r34
            r2 = r35
            r3 = r36
            java.lang.String r4 = "metadata_fingerprint"
            java.lang.String r5 = "app_id"
            java.lang.String r6 = "raw_events"
            java.lang.String r7 = "_sno"
            g.c.b.b.f.n(r36)
            java.lang.String r8 = r3.zza
            g.c.b.b.f.k(r8)
            long r8 = java.lang.System.nanoTime()
            g.e.a.b.f.b.k4 r10 = r34.b()
            r10.h()
            r34.g()
            java.lang.String r10 = r3.zza
            g.e.a.b.f.b.m9 r11 = r1.f3233g
            I(r11)
            boolean r11 = g.e.a.b.f.b.m9.l(r35, r36)
            if (r11 != 0) goto L_0x0032
            return
        L_0x0032:
            boolean r11 = r3.zzh
            if (r11 == 0) goto L_0x0aa2
            g.e.a.b.f.b.g4 r11 = r1.a
            I(r11)
            java.lang.String r12 = r2.zza
            boolean r11 = r11.r(r10, r12)
            java.lang.String r15 = "_err"
            r14 = 0
            if (r11 == 0) goto L_0x00e1
            g.e.a.b.f.b.f3 r3 = r34.d()
            g.e.a.b.f.b.d3 r3 = r3.r()
            java.lang.Object r4 = g.e.a.b.f.b.f3.t(r10)
            g.e.a.b.f.b.n4 r5 = r1.f3238l
            g.e.a.b.f.b.a3 r5 = r5.s()
            java.lang.String r6 = r2.zza
            java.lang.String r5 = r5.d(r6)
            java.lang.String r6 = "Dropping blocked event. appId"
            r3.c(r6, r4, r5)
            g.e.a.b.f.b.g4 r3 = r1.a
            I(r3)
            boolean r3 = r3.p(r10)
            if (r3 != 0) goto L_0x0097
            g.e.a.b.f.b.g4 r3 = r1.a
            I(r3)
            boolean r3 = r3.s(r10)
            if (r3 == 0) goto L_0x007a
            goto L_0x0097
        L_0x007a:
            java.lang.String r3 = r2.zza
            boolean r3 = r15.equals(r3)
            if (r3 != 0) goto L_0x00e0
            g.e.a.b.f.b.q9 r11 = r34.Q()
            g.e.a.b.f.b.p9 r12 = r1.D
            r14 = 11
            java.lang.String r2 = r2.zza
            r17 = 0
            java.lang.String r15 = "_ev"
            r13 = r10
            r16 = r2
            r11.z(r12, r13, r14, r15, r16, r17)
            return
        L_0x0097:
            g.e.a.b.f.b.k r2 = r1.c
            I(r2)
            g.e.a.b.f.b.w4 r2 = r2.C(r10)
            if (r2 == 0) goto L_0x00e0
            long r3 = r2.E()
            long r5 = r2.B()
            long r3 = java.lang.Math.max(r3, r5)
            g.e.a.b.b.h.b r5 = r34.e()
            g.e.a.b.b.h.c r5 = (g.e.a.b.b.h.c) r5
            long r5 = r5.a()
            long r5 = r5 - r3
            long r3 = java.lang.Math.abs(r5)
            r34.K()
            g.e.a.b.f.b.r2 r5 = g.e.a.b.f.b.s2.z
            java.lang.Object r5 = r5.a(r14)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00e0
            g.e.a.b.f.b.f3 r3 = r34.d()
            g.e.a.b.f.b.d3 r3 = r3.o()
            java.lang.String r4 = "Fetching config for blocked app"
            r3.a(r4)
            r1.h(r2)
        L_0x00e0:
            return
        L_0x00e1:
            g.e.a.b.f.b.g3 r2 = g.e.a.b.f.b.g3.b(r35)
            g.e.a.b.f.b.q9 r11 = r34.Q()
            g.e.a.b.f.b.f r12 = r34.K()
            int r12 = r12.m(r10)
            r11.y(r2, r12)
            com.google.android.gms.measurement.internal.zzau r2 = r2.a()
            g.e.a.b.f.b.f3 r11 = r34.d()
            java.lang.String r11 = r11.w()
            r13 = 2
            boolean r11 = android.util.Log.isLoggable(r11, r13)
            if (r11 == 0) goto L_0x011e
            g.e.a.b.f.b.f3 r11 = r34.d()
            g.e.a.b.f.b.d3 r11 = r11.q()
            g.e.a.b.f.b.n4 r12 = r1.f3238l
            g.e.a.b.f.b.a3 r12 = r12.s()
            java.lang.String r12 = r12.c(r2)
            java.lang.String r13 = "Logging event"
            r11.b(r13, r12)
        L_0x011e:
            g.e.a.b.f.b.k r11 = r1.c
            I(r11)
            r11.O()
            r1.J(r3)     // Catch:{ all -> 0x0a97 }
            g.e.a.b.e.c.ba.b()     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.f r11 = r34.K()     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.r2 r12 = g.e.a.b.f.b.s2.l0     // Catch:{ all -> 0x0a97 }
            boolean r11 = r11.u(r14, r12)     // Catch:{ all -> 0x0a97 }
            if (r11 != 0) goto L_0x0150
            g.e.a.b.f.b.f r11 = r34.K()     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.r2 r12 = g.e.a.b.f.b.s2.m0     // Catch:{ all -> 0x0a97 }
            boolean r11 = r11.u(r14, r12)     // Catch:{ all -> 0x0a97 }
            if (r11 == 0) goto L_0x0150
            g.e.a.b.f.b.k r11 = r1.c     // Catch:{ all -> 0x0a97 }
            I(r11)     // Catch:{ all -> 0x0a97 }
            java.lang.String r12 = r3.zza     // Catch:{ all -> 0x0a97 }
            java.lang.String r13 = "_lair"
            r11.l(r12, r13)     // Catch:{ all -> 0x0a97 }
        L_0x0150:
            java.lang.String r11 = "ecommerce_purchase"
            java.lang.String r12 = r2.zza     // Catch:{ all -> 0x0a97 }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0a97 }
            java.lang.String r12 = "refund"
            r28 = 1
            if (r11 != 0) goto L_0x0173
            java.lang.String r11 = "purchase"
            java.lang.String r13 = r2.zza     // Catch:{ all -> 0x0a97 }
            boolean r11 = r11.equals(r13)     // Catch:{ all -> 0x0a97 }
            if (r11 != 0) goto L_0x0173
            java.lang.String r11 = r2.zza     // Catch:{ all -> 0x0a97 }
            boolean r11 = r12.equals(r11)     // Catch:{ all -> 0x0a97 }
            if (r11 == 0) goto L_0x0171
            goto L_0x0173
        L_0x0171:
            r11 = 0
            goto L_0x0174
        L_0x0173:
            r11 = 1
        L_0x0174:
            java.lang.String r13 = "_iap"
            java.lang.String r14 = r2.zza     // Catch:{ all -> 0x0a97 }
            boolean r13 = r13.equals(r14)     // Catch:{ all -> 0x0a97 }
            if (r13 != 0) goto L_0x0187
            if (r11 == 0) goto L_0x0182
            r11 = 1
            goto L_0x0187
        L_0x0182:
            r29 = r8
            r8 = r15
            goto L_0x0329
        L_0x0187:
            com.google.android.gms.measurement.internal.zzas r13 = r2.zzb     // Catch:{ all -> 0x0a97 }
            java.lang.String r14 = "currency"
            java.lang.String r13 = r13.m(r14)     // Catch:{ all -> 0x0a97 }
            if (r11 == 0) goto L_0x0200
            com.google.android.gms.measurement.internal.zzas r11 = r2.zzb     // Catch:{ all -> 0x0a97 }
            java.lang.Double r11 = r11.h()     // Catch:{ all -> 0x0a97 }
            double r18 = r11.doubleValue()     // Catch:{ all -> 0x0a97 }
            r20 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r18 = r18 * r20
            r22 = 0
            int r11 = (r18 > r22 ? 1 : (r18 == r22 ? 0 : -1))
            if (r11 != 0) goto L_0x01be
            com.google.android.gms.measurement.internal.zzas r11 = r2.zzb     // Catch:{ all -> 0x0a97 }
            java.lang.Long r11 = r11.i()     // Catch:{ all -> 0x0a97 }
            r22 = r15
            long r14 = r11.longValue()     // Catch:{ all -> 0x0a97 }
            double r14 = (double) r14
            java.lang.Double.isNaN(r14)
            java.lang.Double.isNaN(r14)
            double r18 = r14 * r20
            goto L_0x01c0
        L_0x01be:
            r22 = r15
        L_0x01c0:
            r14 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r11 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r11 > 0) goto L_0x01da
            r14 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r11 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r11 < 0) goto L_0x01da
            long r14 = java.lang.Math.round(r18)     // Catch:{ all -> 0x0a97 }
            java.lang.String r11 = r2.zza     // Catch:{ all -> 0x0a97 }
            boolean r11 = r12.equals(r11)     // Catch:{ all -> 0x0a97 }
            if (r11 == 0) goto L_0x020c
            long r14 = -r14
            goto L_0x020c
        L_0x01da:
            g.e.a.b.f.b.f3 r2 = r34.d()     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.d3 r2 = r2.r()     // Catch:{ all -> 0x0a97 }
            java.lang.String r3 = "Data lost. Currency value is too big. appId"
            java.lang.Object r4 = g.e.a.b.f.b.f3.t(r10)     // Catch:{ all -> 0x0a97 }
            java.lang.Double r5 = java.lang.Double.valueOf(r18)     // Catch:{ all -> 0x0a97 }
            r2.c(r3, r4, r5)     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.k r2 = r1.c     // Catch:{ all -> 0x0a97 }
            I(r2)     // Catch:{ all -> 0x0a97 }
            r2.m()     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.k r2 = r1.c
            I(r2)
            r2.P()
            return
        L_0x0200:
            r22 = r15
            com.google.android.gms.measurement.internal.zzas r11 = r2.zzb     // Catch:{ all -> 0x0a97 }
            java.lang.Long r11 = r11.i()     // Catch:{ all -> 0x0a97 }
            long r14 = r11.longValue()     // Catch:{ all -> 0x0a97 }
        L_0x020c:
            boolean r11 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x0a97 }
            if (r11 != 0) goto L_0x0325
            java.util.Locale r11 = java.util.Locale.US     // Catch:{ all -> 0x0a97 }
            java.lang.String r11 = r13.toUpperCase(r11)     // Catch:{ all -> 0x0a97 }
            java.lang.String r12 = "[A-Z]{3}"
            boolean r12 = r11.matches(r12)     // Catch:{ all -> 0x0a97 }
            if (r12 == 0) goto L_0x0325
            java.lang.String r12 = "_ltv_"
            int r13 = r11.length()     // Catch:{ all -> 0x0a97 }
            if (r13 == 0) goto L_0x022e
            java.lang.String r11 = r12.concat(r11)     // Catch:{ all -> 0x0a97 }
        L_0x022c:
            r13 = r11
            goto L_0x0234
        L_0x022e:
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x0a97 }
            r11.<init>(r12)     // Catch:{ all -> 0x0a97 }
            goto L_0x022c
        L_0x0234:
            g.e.a.b.f.b.k r11 = r1.c     // Catch:{ all -> 0x0a97 }
            I(r11)     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.o9 r11 = r11.H(r10, r13)     // Catch:{ all -> 0x0a97 }
            if (r11 == 0) goto L_0x027b
            java.lang.Object r11 = r11.f3279e     // Catch:{ all -> 0x0a97 }
            boolean r12 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0a97 }
            if (r12 != 0) goto L_0x0246
            goto L_0x027b
        L_0x0246:
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0a97 }
            long r11 = r11.longValue()     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.o9 r18 = new g.e.a.b.f.b.o9     // Catch:{ all -> 0x0a97 }
            r19 = r13
            java.lang.String r13 = r2.zzc     // Catch:{ all -> 0x0a97 }
            g.e.a.b.b.h.b r20 = r34.e()     // Catch:{ all -> 0x0a97 }
            g.e.a.b.b.h.c r20 = (g.e.a.b.b.h.c) r20     // Catch:{ all -> 0x0a97 }
            long r20 = r20.a()     // Catch:{ all -> 0x0a97 }
            long r11 = r11 + r14
            java.lang.Long r23 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0a97 }
            r11 = r18
            r12 = r10
            r16 = r19
            r14 = 2
            r15 = 0
            r29 = r8
            r8 = 0
            r9 = 2
            r14 = r16
            r8 = r22
            r9 = 0
            r15 = r20
            r17 = r23
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0a97 }
        L_0x0278:
            r9 = r18
            goto L_0x02e9
        L_0x027b:
            r29 = r8
            r16 = r13
            r8 = r22
            r9 = 0
            g.e.a.b.f.b.k r11 = r1.c     // Catch:{ all -> 0x0a97 }
            I(r11)     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.f r12 = r34.K()     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.r2 r13 = g.e.a.b.f.b.s2.E     // Catch:{ all -> 0x0a97 }
            int r12 = r12.n(r10, r13)     // Catch:{ all -> 0x0a97 }
            int r12 = r12 + -1
            g.c.b.b.f.k(r10)     // Catch:{ all -> 0x0a97 }
            r11.h()     // Catch:{ all -> 0x0a97 }
            r11.i()     // Catch:{ all -> 0x0a97 }
            android.database.sqlite.SQLiteDatabase r13 = r11.A()     // Catch:{ SQLiteException -> 0x02b7 }
            r9 = 3
            java.lang.String[] r9 = new java.lang.String[r9]     // Catch:{ SQLiteException -> 0x02b7 }
            r17 = 0
            r9[r17] = r10     // Catch:{ SQLiteException -> 0x02b7 }
            r9[r28] = r10     // Catch:{ SQLiteException -> 0x02b7 }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ SQLiteException -> 0x02b7 }
            r17 = 2
            r9[r17] = r12     // Catch:{ SQLiteException -> 0x02b7 }
            java.lang.String r12 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r13.execSQL(r12, r9)     // Catch:{ SQLiteException -> 0x02b7 }
            goto L_0x02cc
        L_0x02b7:
            r0 = move-exception
            r9 = r0
            g.e.a.b.f.b.n4 r11 = r11.a     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.f3 r11 = r11.d()     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.d3 r11 = r11.p()     // Catch:{ all -> 0x0a97 }
            java.lang.String r12 = "Error pruning currencies. appId"
            java.lang.Object r13 = g.e.a.b.f.b.f3.t(r10)     // Catch:{ all -> 0x0a97 }
            r11.c(r12, r13, r9)     // Catch:{ all -> 0x0a97 }
        L_0x02cc:
            g.e.a.b.f.b.o9 r18 = new g.e.a.b.f.b.o9     // Catch:{ all -> 0x0a97 }
            java.lang.String r13 = r2.zzc     // Catch:{ all -> 0x0a97 }
            g.e.a.b.b.h.b r9 = r34.e()     // Catch:{ all -> 0x0a97 }
            g.e.a.b.b.h.c r9 = (g.e.a.b.b.h.c) r9     // Catch:{ all -> 0x0a97 }
            long r19 = r9.a()     // Catch:{ all -> 0x0a97 }
            java.lang.Long r17 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0a97 }
            r11 = r18
            r12 = r10
            r14 = r16
            r15 = r19
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0a97 }
            goto L_0x0278
        L_0x02e9:
            g.e.a.b.f.b.k r11 = r1.c     // Catch:{ all -> 0x0a97 }
            I(r11)     // Catch:{ all -> 0x0a97 }
            boolean r11 = r11.s(r9)     // Catch:{ all -> 0x0a97 }
            if (r11 != 0) goto L_0x0329
            g.e.a.b.f.b.f3 r11 = r34.d()     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.d3 r11 = r11.p()     // Catch:{ all -> 0x0a97 }
            java.lang.String r12 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r13 = g.e.a.b.f.b.f3.t(r10)     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.n4 r14 = r1.f3238l     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.a3 r14 = r14.s()     // Catch:{ all -> 0x0a97 }
            java.lang.String r15 = r9.c     // Catch:{ all -> 0x0a97 }
            java.lang.String r14 = r14.f(r15)     // Catch:{ all -> 0x0a97 }
            java.lang.Object r9 = r9.f3279e     // Catch:{ all -> 0x0a97 }
            r11.d(r12, r13, r14, r9)     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.q9 r11 = r34.Q()     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.p9 r12 = r1.D     // Catch:{ all -> 0x0a97 }
            r14 = 9
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r10
            r11.z(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0a97 }
            goto L_0x0329
        L_0x0325:
            r29 = r8
            r8 = r22
        L_0x0329:
            java.lang.String r9 = r2.zza     // Catch:{ all -> 0x0a97 }
            boolean r9 = g.e.a.b.f.b.q9.V(r9)     // Catch:{ all -> 0x0a97 }
            java.lang.String r11 = r2.zza     // Catch:{ all -> 0x0a97 }
            boolean r8 = r8.equals(r11)     // Catch:{ all -> 0x0a97 }
            r34.Q()     // Catch:{ all -> 0x0a97 }
            com.google.android.gms.measurement.internal.zzas r11 = r2.zzb     // Catch:{ all -> 0x0a97 }
            if (r11 != 0) goto L_0x033f
            r16 = 0
            goto L_0x0368
        L_0x033f:
            android.os.Bundle r12 = r11.zza     // Catch:{ all -> 0x0a97 }
            java.util.Set r12 = r12.keySet()     // Catch:{ all -> 0x0a97 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x0a97 }
            r16 = 0
        L_0x034d:
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x0a97 }
            if (r13 == 0) goto L_0x0368
            java.lang.Object r13 = r12.next()     // Catch:{ all -> 0x0a97 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0a97 }
            java.lang.Object r13 = r11.l(r13)     // Catch:{ all -> 0x0a97 }
            boolean r14 = r13 instanceof android.os.Parcelable[]     // Catch:{ all -> 0x0a97 }
            if (r14 == 0) goto L_0x034d
            android.os.Parcelable[] r13 = (android.os.Parcelable[]) r13     // Catch:{ all -> 0x0a97 }
            int r13 = r13.length     // Catch:{ all -> 0x0a97 }
            long r13 = (long) r13     // Catch:{ all -> 0x0a97 }
            long r16 = r16 + r13
            goto L_0x034d
        L_0x0368:
            r23 = 1
            long r16 = r16 + r23
            g.e.a.b.f.b.k r11 = r1.c     // Catch:{ all -> 0x0a97 }
            I(r11)     // Catch:{ all -> 0x0a97 }
            long r12 = r34.x()     // Catch:{ all -> 0x0a97 }
            r20 = 1
            r21 = 0
            r25 = 0
            r32 = r4
            r33 = r5
            r4 = 0
            r14 = r10
            r15 = r16
            r17 = r20
            r18 = r9
            r19 = r21
            r20 = r8
            r21 = r25
            g.e.a.b.f.b.i r11 = r11.F(r12, r14, r15, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0a97 }
            long r12 = r11.b     // Catch:{ all -> 0x0a97 }
            r34.K()     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.r2 r14 = g.e.a.b.f.b.s2.f3334k     // Catch:{ all -> 0x0a97 }
            r15 = 0
            java.lang.Object r14 = r14.a(r15)     // Catch:{ all -> 0x0a97 }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x0a97 }
            int r14 = r14.intValue()     // Catch:{ all -> 0x0a97 }
            long r14 = (long) r14     // Catch:{ all -> 0x0a97 }
            long r12 = r12 - r14
            r14 = 1000(0x3e8, double:4.94E-321)
            int r16 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r16 <= 0) goto L_0x03d9
            long r12 = r12 % r14
            int r2 = (r12 > r23 ? 1 : (r12 == r23 ? 0 : -1))
            if (r2 != 0) goto L_0x03c8
            g.e.a.b.f.b.f3 r2 = r34.d()     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.d3 r2 = r2.p()     // Catch:{ all -> 0x0a97 }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = g.e.a.b.f.b.f3.t(r10)     // Catch:{ all -> 0x0a97 }
            long r5 = r11.b     // Catch:{ all -> 0x0a97 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0a97 }
            r2.c(r3, r4, r5)     // Catch:{ all -> 0x0a97 }
        L_0x03c8:
            g.e.a.b.f.b.k r2 = r1.c     // Catch:{ all -> 0x0a97 }
            I(r2)     // Catch:{ all -> 0x0a97 }
            r2.m()     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.k r2 = r1.c
            I(r2)
            r2.P()
            return
        L_0x03d9:
            if (r9 == 0) goto L_0x0436
            long r12 = r11.a     // Catch:{ all -> 0x0a97 }
            r34.K()     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.r2 r14 = g.e.a.b.f.b.s2.f3336m     // Catch:{ all -> 0x0a97 }
            r15 = 0
            java.lang.Object r14 = r14.a(r15)     // Catch:{ all -> 0x0a97 }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x0a97 }
            int r14 = r14.intValue()     // Catch:{ all -> 0x0a97 }
            long r14 = (long) r14     // Catch:{ all -> 0x0a97 }
            long r12 = r12 - r14
            int r14 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r14 <= 0) goto L_0x0436
            r14 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 % r14
            int r3 = (r12 > r23 ? 1 : (r12 == r23 ? 0 : -1))
            if (r3 != 0) goto L_0x0411
            g.e.a.b.f.b.f3 r3 = r34.d()     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.d3 r3 = r3.p()     // Catch:{ all -> 0x0a97 }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r5 = g.e.a.b.f.b.f3.t(r10)     // Catch:{ all -> 0x0a97 }
            long r6 = r11.a     // Catch:{ all -> 0x0a97 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0a97 }
            r3.c(r4, r5, r6)     // Catch:{ all -> 0x0a97 }
        L_0x0411:
            g.e.a.b.f.b.q9 r11 = r34.Q()     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.p9 r12 = r1.D     // Catch:{ all -> 0x0a97 }
            r14 = 16
            java.lang.String r15 = "_ev"
            java.lang.String r2 = r2.zza     // Catch:{ all -> 0x0a97 }
            r17 = 0
            r13 = r10
            r16 = r2
            r11.z(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.k r2 = r1.c     // Catch:{ all -> 0x0a97 }
            I(r2)     // Catch:{ all -> 0x0a97 }
            r2.m()     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.k r2 = r1.c
            I(r2)
            r2.P()
            return
        L_0x0436:
            r12 = 1000000(0xf4240, float:1.401298E-39)
            if (r8 == 0) goto L_0x0486
            long r13 = r11.f3190d     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.f r8 = r34.K()     // Catch:{ all -> 0x0a97 }
            java.lang.String r15 = r3.zza     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.r2 r4 = g.e.a.b.f.b.s2.f3335l     // Catch:{ all -> 0x0a97 }
            int r4 = r8.n(r15, r4)     // Catch:{ all -> 0x0a97 }
            int r4 = java.lang.Math.min(r12, r4)     // Catch:{ all -> 0x0a97 }
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)     // Catch:{ all -> 0x0a97 }
            long r4 = (long) r4     // Catch:{ all -> 0x0a97 }
            long r13 = r13 - r4
            r4 = 0
            int r8 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x0486
            int r2 = (r13 > r23 ? 1 : (r13 == r23 ? 0 : -1))
            if (r2 != 0) goto L_0x0475
            g.e.a.b.f.b.f3 r2 = r34.d()     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.d3 r2 = r2.p()     // Catch:{ all -> 0x0a97 }
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = g.e.a.b.f.b.f3.t(r10)     // Catch:{ all -> 0x0a97 }
            long r5 = r11.f3190d     // Catch:{ all -> 0x0a97 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0a97 }
            r2.c(r3, r4, r5)     // Catch:{ all -> 0x0a97 }
        L_0x0475:
            g.e.a.b.f.b.k r2 = r1.c     // Catch:{ all -> 0x0a97 }
            I(r2)     // Catch:{ all -> 0x0a97 }
            r2.m()     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.k r2 = r1.c
            I(r2)
            r2.P()
            return
        L_0x0486:
            com.google.android.gms.measurement.internal.zzas r4 = r2.zzb     // Catch:{ all -> 0x0a97 }
            android.os.Bundle r4 = r4.f()     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.q9 r5 = r34.Q()     // Catch:{ all -> 0x0a97 }
            java.lang.String r8 = "_o"
            java.lang.String r11 = r2.zzc     // Catch:{ all -> 0x0a97 }
            r5.A(r4, r8, r11)     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.q9 r5 = r34.Q()     // Catch:{ all -> 0x0a97 }
            boolean r5 = r5.R(r10)     // Catch:{ all -> 0x0a97 }
            java.lang.String r8 = "_r"
            if (r5 == 0) goto L_0x04b7
            g.e.a.b.f.b.q9 r5 = r34.Q()     // Catch:{ all -> 0x0a97 }
            java.lang.Long r11 = java.lang.Long.valueOf(r23)     // Catch:{ all -> 0x0a97 }
            java.lang.String r13 = "_dbg"
            r5.A(r4, r13, r11)     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.q9 r5 = r34.Q()     // Catch:{ all -> 0x0a97 }
            r5.A(r4, r8, r11)     // Catch:{ all -> 0x0a97 }
        L_0x04b7:
            java.lang.String r5 = "_s"
            java.lang.String r11 = r2.zza     // Catch:{ all -> 0x0a97 }
            boolean r5 = r5.equals(r11)     // Catch:{ all -> 0x0a97 }
            if (r5 == 0) goto L_0x04dd
            g.e.a.b.f.b.k r5 = r1.c     // Catch:{ all -> 0x0a97 }
            I(r5)     // Catch:{ all -> 0x0a97 }
            java.lang.String r11 = r3.zza     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.o9 r5 = r5.H(r11, r7)     // Catch:{ all -> 0x0a97 }
            if (r5 == 0) goto L_0x04dd
            java.lang.Object r11 = r5.f3279e     // Catch:{ all -> 0x0a97 }
            boolean r11 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0a97 }
            if (r11 == 0) goto L_0x04dd
            g.e.a.b.f.b.q9 r11 = r34.Q()     // Catch:{ all -> 0x0a97 }
            java.lang.Object r5 = r5.f3279e     // Catch:{ all -> 0x0a97 }
            r11.A(r4, r7, r5)     // Catch:{ all -> 0x0a97 }
        L_0x04dd:
            g.e.a.b.f.b.k r5 = r1.c     // Catch:{ all -> 0x0a97 }
            I(r5)     // Catch:{ all -> 0x0a97 }
            g.c.b.b.f.k(r10)     // Catch:{ all -> 0x0a97 }
            r5.h()     // Catch:{ all -> 0x0a97 }
            r5.i()     // Catch:{ all -> 0x0a97 }
            android.database.sqlite.SQLiteDatabase r7 = r5.A()     // Catch:{ SQLiteException -> 0x051a }
            g.e.a.b.f.b.n4 r11 = r5.a     // Catch:{ SQLiteException -> 0x051a }
            g.e.a.b.f.b.f r11 = r11.o()     // Catch:{ SQLiteException -> 0x051a }
            g.e.a.b.f.b.r2 r13 = g.e.a.b.f.b.s2.p     // Catch:{ SQLiteException -> 0x051a }
            int r11 = r11.n(r10, r13)     // Catch:{ SQLiteException -> 0x051a }
            int r11 = java.lang.Math.min(r12, r11)     // Catch:{ SQLiteException -> 0x051a }
            r15 = 0
            int r11 = java.lang.Math.max(r15, r11)     // Catch:{ SQLiteException -> 0x0517 }
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ SQLiteException -> 0x0517 }
            r12 = 2
            java.lang.String[] r12 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0517 }
            r12[r15] = r10     // Catch:{ SQLiteException -> 0x0517 }
            r12[r28] = r11     // Catch:{ SQLiteException -> 0x0517 }
            java.lang.String r11 = "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)"
            int r5 = r7.delete(r6, r11, r12)     // Catch:{ SQLiteException -> 0x0517 }
            long r11 = (long) r5
            goto L_0x0532
        L_0x0517:
            r0 = move-exception
        L_0x0518:
            r7 = r0
            goto L_0x051d
        L_0x051a:
            r0 = move-exception
            r15 = 0
            goto L_0x0518
        L_0x051d:
            g.e.a.b.f.b.n4 r5 = r5.a     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.f3 r5 = r5.d()     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.d3 r5 = r5.p()     // Catch:{ all -> 0x0a97 }
            java.lang.String r11 = "Error deleting over the limit events. appId"
            java.lang.Object r12 = g.e.a.b.f.b.f3.t(r10)     // Catch:{ all -> 0x0a97 }
            r5.c(r11, r12, r7)     // Catch:{ all -> 0x0a97 }
            r11 = 0
        L_0x0532:
            r13 = 0
            int r5 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r5 <= 0) goto L_0x054d
            g.e.a.b.f.b.f3 r5 = r34.d()     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.d3 r5 = r5.r()     // Catch:{ all -> 0x0a97 }
            java.lang.String r7 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r13 = g.e.a.b.f.b.f3.t(r10)     // Catch:{ all -> 0x0a97 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0a97 }
            r5.c(r7, r13, r11)     // Catch:{ all -> 0x0a97 }
        L_0x054d:
            g.e.a.b.f.b.o r5 = new g.e.a.b.f.b.o     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.n4 r12 = r1.f3238l     // Catch:{ all -> 0x0a97 }
            java.lang.String r13 = r2.zzc     // Catch:{ all -> 0x0a97 }
            java.lang.String r7 = r2.zza     // Catch:{ all -> 0x0a97 }
            long r2 = r2.zzd     // Catch:{ all -> 0x0a97 }
            r18 = 0
            r11 = r5
            r14 = r10
            r31 = 0
            r15 = r7
            r16 = r2
            r20 = r4
            r11.<init>((g.e.a.b.f.b.n4) r12, (java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r15, (long) r16, (long) r18, (android.os.Bundle) r20)     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.k r2 = r1.c     // Catch:{ all -> 0x0a97 }
            I(r2)     // Catch:{ all -> 0x0a97 }
            java.lang.String r3 = r5.b     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.p r2 = r2.G(r10, r3)     // Catch:{ all -> 0x0a97 }
            if (r2 != 0) goto L_0x05eb
            g.e.a.b.f.b.k r2 = r1.c     // Catch:{ all -> 0x0a97 }
            I(r2)     // Catch:{ all -> 0x0a97 }
            long r2 = r2.z(r10)     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.f r4 = r34.K()     // Catch:{ all -> 0x0a97 }
            int r4 = r4.k(r10)     // Catch:{ all -> 0x0a97 }
            long r11 = (long) r4     // Catch:{ all -> 0x0a97 }
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 < 0) goto L_0x05cd
            if (r9 == 0) goto L_0x05cd
            g.e.a.b.f.b.f3 r2 = r34.d()     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.d3 r2 = r2.p()     // Catch:{ all -> 0x0a97 }
            java.lang.String r3 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r4 = g.e.a.b.f.b.f3.t(r10)     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.n4 r6 = r1.f3238l     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.a3 r6 = r6.s()     // Catch:{ all -> 0x0a97 }
            java.lang.String r5 = r5.b     // Catch:{ all -> 0x0a97 }
            java.lang.String r5 = r6.d(r5)     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.f r6 = r34.K()     // Catch:{ all -> 0x0a97 }
            int r6 = r6.k(r10)     // Catch:{ all -> 0x0a97 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0a97 }
            r2.d(r3, r4, r5, r6)     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.q9 r11 = r34.Q()     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.p9 r12 = r1.D     // Catch:{ all -> 0x0a97 }
            r14 = 8
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r10
            r11.z(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.k r2 = r1.c
            I(r2)
            r2.P()
            return
        L_0x05cd:
            g.e.a.b.f.b.p r2 = new g.e.a.b.f.b.p     // Catch:{ all -> 0x0a97 }
            java.lang.String r13 = r5.b     // Catch:{ all -> 0x0a97 }
            long r3 = r5.f3269d     // Catch:{ all -> 0x0a97 }
            r14 = 0
            r16 = 0
            r18 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r11 = r2
            r12 = r10
            r20 = r3
            r11.<init>(r12, r13, r14, r16, r18, r20, r22, r24, r25, r26, r27)     // Catch:{ all -> 0x0a97 }
            goto L_0x05f9
        L_0x05eb:
            g.e.a.b.f.b.n4 r3 = r1.f3238l     // Catch:{ all -> 0x0a97 }
            long r9 = r2.f3282f     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.o r5 = r5.a(r3, r9)     // Catch:{ all -> 0x0a97 }
            long r3 = r5.f3269d     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.p r2 = r2.c(r3)     // Catch:{ all -> 0x0a97 }
        L_0x05f9:
            g.e.a.b.f.b.k r3 = r1.c     // Catch:{ all -> 0x0a97 }
            I(r3)     // Catch:{ all -> 0x0a97 }
            r3.o(r2)     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.k4 r2 = r34.b()     // Catch:{ all -> 0x0a97 }
            r2.h()     // Catch:{ all -> 0x0a97 }
            r34.g()     // Catch:{ all -> 0x0a97 }
            g.c.b.b.f.n(r5)     // Catch:{ all -> 0x0a97 }
            g.c.b.b.f.n(r36)     // Catch:{ all -> 0x0a97 }
            java.lang.String r2 = r5.a     // Catch:{ all -> 0x0a97 }
            g.c.b.b.f.k(r2)     // Catch:{ all -> 0x0a97 }
            java.lang.String r2 = r5.a     // Catch:{ all -> 0x0a97 }
            r3 = r36
            java.lang.String r4 = r3.zza     // Catch:{ all -> 0x0a97 }
            boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x0a97 }
            g.c.b.b.f.g(r2)     // Catch:{ all -> 0x0a97 }
            g.e.a.b.e.c.e4 r2 = g.e.a.b.e.c.f4.x1()     // Catch:{ all -> 0x0a97 }
            r2.K()     // Catch:{ all -> 0x0a97 }
            r2.H()     // Catch:{ all -> 0x0a97 }
            java.lang.String r4 = r3.zza     // Catch:{ all -> 0x0a97 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0a97 }
            if (r4 != 0) goto L_0x063a
            java.lang.String r4 = r3.zza     // Catch:{ all -> 0x0a97 }
            r2.l(r4)     // Catch:{ all -> 0x0a97 }
        L_0x063a:
            java.lang.String r4 = r3.zzd     // Catch:{ all -> 0x0a97 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0a97 }
            if (r4 != 0) goto L_0x0647
            java.lang.String r4 = r3.zzd     // Catch:{ all -> 0x0a97 }
            r2.n(r4)     // Catch:{ all -> 0x0a97 }
        L_0x0647:
            java.lang.String r4 = r3.zzc     // Catch:{ all -> 0x0a97 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0a97 }
            if (r4 != 0) goto L_0x0654
            java.lang.String r4 = r3.zzc     // Catch:{ all -> 0x0a97 }
            r2.o(r4)     // Catch:{ all -> 0x0a97 }
        L_0x0654:
            long r9 = r3.zzj     // Catch:{ all -> 0x0a97 }
            r11 = -2147483648(0xffffffff80000000, double:NaN)
            int r4 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r4 == 0) goto L_0x0661
            int r4 = (int) r9     // Catch:{ all -> 0x0a97 }
            r2.p(r4)     // Catch:{ all -> 0x0a97 }
        L_0x0661:
            long r9 = r3.zze     // Catch:{ all -> 0x0a97 }
            r2.D(r9)     // Catch:{ all -> 0x0a97 }
            java.lang.String r4 = r3.zzb     // Catch:{ all -> 0x0a97 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0a97 }
            if (r4 != 0) goto L_0x0673
            java.lang.String r4 = r3.zzb     // Catch:{ all -> 0x0a97 }
            r2.C(r4)     // Catch:{ all -> 0x0a97 }
        L_0x0673:
            java.lang.String r4 = r3.zza     // Catch:{ all -> 0x0a97 }
            g.c.b.b.f.n(r4)     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.h r4 = r1.L(r4)     // Catch:{ all -> 0x0a97 }
            java.lang.String r7 = r3.zzv     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.h r7 = g.e.a.b.f.b.h.b(r7)     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.h r4 = r4.c(r7)     // Catch:{ all -> 0x0a97 }
            java.lang.String r4 = r4.d()     // Catch:{ all -> 0x0a97 }
            r2.t(r4)     // Catch:{ all -> 0x0a97 }
            java.lang.String r4 = r2.V()     // Catch:{ all -> 0x0a97 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0a97 }
            if (r4 == 0) goto L_0x06a4
            java.lang.String r4 = r3.zzq     // Catch:{ all -> 0x0a97 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0a97 }
            if (r4 != 0) goto L_0x06a4
            java.lang.String r4 = r3.zzq     // Catch:{ all -> 0x0a97 }
            r2.u0(r4)     // Catch:{ all -> 0x0a97 }
        L_0x06a4:
            long r9 = r3.zzf     // Catch:{ all -> 0x0a97 }
            r11 = 0
            int r4 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r4 == 0) goto L_0x06af
            r2.u(r9)     // Catch:{ all -> 0x0a97 }
        L_0x06af:
            long r9 = r3.zzs     // Catch:{ all -> 0x0a97 }
            r2.y(r9)     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.m9 r4 = r1.f3233g     // Catch:{ all -> 0x0a97 }
            I(r4)     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.k9 r7 = r4.b     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.n4 r7 = r7.f3238l     // Catch:{ all -> 0x0a97 }
            android.content.Context r7 = r7.c()     // Catch:{ all -> 0x0a97 }
            java.util.Map r7 = g.e.a.b.f.b.s2.b(r7)     // Catch:{ all -> 0x0a97 }
            if (r7 == 0) goto L_0x074c
            int r9 = r7.size()     // Catch:{ all -> 0x0a97 }
            if (r9 != 0) goto L_0x06cf
            goto L_0x074c
        L_0x06cf:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0a97 }
            r14.<init>()     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.r2 r9 = g.e.a.b.f.b.s2.P     // Catch:{ all -> 0x0a97 }
            r10 = 0
            java.lang.Object r9 = r9.a(r10)     // Catch:{ all -> 0x0a97 }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ all -> 0x0a97 }
            int r9 = r9.intValue()     // Catch:{ all -> 0x0a97 }
            java.util.Set r7 = r7.entrySet()     // Catch:{ all -> 0x0a97 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0a97 }
        L_0x06e9:
            boolean r10 = r7.hasNext()     // Catch:{ all -> 0x0a97 }
            if (r10 == 0) goto L_0x0746
            java.lang.Object r10 = r7.next()     // Catch:{ all -> 0x0a97 }
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10     // Catch:{ all -> 0x0a97 }
            java.lang.Object r11 = r10.getKey()     // Catch:{ all -> 0x0a97 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0a97 }
            java.lang.String r12 = "measurement.id."
            boolean r11 = r11.startsWith(r12)     // Catch:{ all -> 0x0a97 }
            if (r11 == 0) goto L_0x06e9
            java.lang.Object r10 = r10.getValue()     // Catch:{ NumberFormatException -> 0x0734 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ NumberFormatException -> 0x0734 }
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ NumberFormatException -> 0x0734 }
            if (r10 == 0) goto L_0x06e9
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ NumberFormatException -> 0x0734 }
            r14.add(r10)     // Catch:{ NumberFormatException -> 0x0734 }
            int r10 = r14.size()     // Catch:{ NumberFormatException -> 0x0734 }
            if (r10 < r9) goto L_0x06e9
            g.e.a.b.f.b.n4 r10 = r4.a     // Catch:{ NumberFormatException -> 0x0734 }
            g.e.a.b.f.b.f3 r10 = r10.d()     // Catch:{ NumberFormatException -> 0x0734 }
            g.e.a.b.f.b.d3 r10 = r10.r()     // Catch:{ NumberFormatException -> 0x0734 }
            java.lang.String r11 = "Too many experiment IDs. Number of IDs"
            int r12 = r14.size()     // Catch:{ NumberFormatException -> 0x0734 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ NumberFormatException -> 0x0734 }
            r10.b(r11, r12)     // Catch:{ NumberFormatException -> 0x0734 }
            goto L_0x0746
        L_0x0734:
            r0 = move-exception
            r10 = r0
            g.e.a.b.f.b.n4 r11 = r4.a     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.f3 r11 = r11.d()     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.d3 r11 = r11.r()     // Catch:{ all -> 0x0a97 }
            java.lang.String r12 = "Experiment ID NumberFormatException"
            r11.b(r12, r10)     // Catch:{ all -> 0x0a97 }
            goto L_0x06e9
        L_0x0746:
            int r4 = r14.size()     // Catch:{ all -> 0x0a97 }
            if (r4 != 0) goto L_0x074d
        L_0x074c:
            r14 = 0
        L_0x074d:
            if (r14 == 0) goto L_0x0752
            r2.e0(r14)     // Catch:{ all -> 0x0a97 }
        L_0x0752:
            java.lang.String r4 = r3.zza     // Catch:{ all -> 0x0a97 }
            g.c.b.b.f.n(r4)     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.h r4 = r1.L(r4)     // Catch:{ all -> 0x0a97 }
            java.lang.String r7 = r3.zzv     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.h r7 = g.e.a.b.f.b.h.b(r7)     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.h r4 = r4.c(r7)     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.g r7 = g.e.a.b.f.b.g.AD_STORAGE     // Catch:{ all -> 0x0a97 }
            boolean r9 = r4.e(r7)     // Catch:{ all -> 0x0a97 }
            if (r9 == 0) goto L_0x0797
            g.e.a.b.f.b.h8 r9 = r1.f3235i     // Catch:{ all -> 0x0a97 }
            java.lang.String r10 = r3.zza     // Catch:{ all -> 0x0a97 }
            android.util.Pair r9 = r9.m(r10, r4)     // Catch:{ all -> 0x0a97 }
            java.lang.Object r10 = r9.first     // Catch:{ all -> 0x0a97 }
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10     // Catch:{ all -> 0x0a97 }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0a97 }
            if (r10 != 0) goto L_0x0797
            boolean r10 = r3.zzo     // Catch:{ all -> 0x0a97 }
            if (r10 == 0) goto L_0x0797
            java.lang.Object r10 = r9.first     // Catch:{ all -> 0x0a97 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0a97 }
            r2.M(r10)     // Catch:{ all -> 0x0a97 }
            java.lang.Object r9 = r9.second     // Catch:{ all -> 0x0a97 }
            if (r9 == 0) goto L_0x0797
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x0a97 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0a97 }
            r2.F(r9)     // Catch:{ all -> 0x0a97 }
        L_0x0797:
            g.e.a.b.f.b.n4 r9 = r1.f3238l     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.n r9 = r9.p()     // Catch:{ all -> 0x0a97 }
            r9.k()     // Catch:{ all -> 0x0a97 }
            java.lang.String r9 = android.os.Build.MODEL     // Catch:{ all -> 0x0a97 }
            r2.v(r9)     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.n4 r9 = r1.f3238l     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.n r9 = r9.p()     // Catch:{ all -> 0x0a97 }
            r9.k()     // Catch:{ all -> 0x0a97 }
            java.lang.String r9 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0a97 }
            r2.G(r9)     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.n4 r9 = r1.f3238l     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.n r9 = r9.p()     // Catch:{ all -> 0x0a97 }
            long r9 = r9.p()     // Catch:{ all -> 0x0a97 }
            int r10 = (int) r9     // Catch:{ all -> 0x0a97 }
            r2.Q(r10)     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.n4 r9 = r1.f3238l     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.n r9 = r9.p()     // Catch:{ all -> 0x0a97 }
            java.lang.String r9 = r9.q()     // Catch:{ all -> 0x0a97 }
            r2.S(r9)     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.f r9 = r34.K()     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.r2 r10 = g.e.a.b.f.b.s2.h0     // Catch:{ all -> 0x0a97 }
            r11 = 0
            boolean r9 = r9.u(r11, r10)     // Catch:{ all -> 0x0a97 }
            if (r9 != 0) goto L_0x07e0
            long r11 = r3.zzl     // Catch:{ all -> 0x0a97 }
            r2.v0(r11)     // Catch:{ all -> 0x0a97 }
        L_0x07e0:
            g.e.a.b.f.b.n4 r9 = r1.f3238l     // Catch:{ all -> 0x0a97 }
            boolean r9 = r9.g()     // Catch:{ all -> 0x0a97 }
            if (r9 == 0) goto L_0x07f7
            r2.U()     // Catch:{ all -> 0x0a97 }
            r9 = 0
            boolean r11 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0a97 }
            if (r11 == 0) goto L_0x07f3
            goto L_0x07f7
        L_0x07f3:
            r2.w()     // Catch:{ all -> 0x0a97 }
            throw r9
        L_0x07f7:
            g.e.a.b.f.b.k r9 = r1.c     // Catch:{ all -> 0x0a97 }
            I(r9)     // Catch:{ all -> 0x0a97 }
            java.lang.String r11 = r3.zza     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.w4 r9 = r9.C(r11)     // Catch:{ all -> 0x0a97 }
            if (r9 != 0) goto L_0x0875
            g.e.a.b.f.b.w4 r9 = new g.e.a.b.f.b.w4     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.n4 r11 = r1.f3238l     // Catch:{ all -> 0x0a97 }
            java.lang.String r12 = r3.zza     // Catch:{ all -> 0x0a97 }
            r9.<init>(r11, r12)     // Catch:{ all -> 0x0a97 }
            java.lang.String r11 = r1.R(r4)     // Catch:{ all -> 0x0a97 }
            r9.f(r11)     // Catch:{ all -> 0x0a97 }
            java.lang.String r11 = r3.zzk     // Catch:{ all -> 0x0a97 }
            r9.n(r11)     // Catch:{ all -> 0x0a97 }
            java.lang.String r11 = r3.zzb     // Catch:{ all -> 0x0a97 }
            r9.o(r11)     // Catch:{ all -> 0x0a97 }
            boolean r7 = r4.e(r7)     // Catch:{ all -> 0x0a97 }
            if (r7 == 0) goto L_0x082f
            g.e.a.b.f.b.h8 r7 = r1.f3235i     // Catch:{ all -> 0x0a97 }
            java.lang.String r11 = r3.zza     // Catch:{ all -> 0x0a97 }
            java.lang.String r7 = r7.n(r11)     // Catch:{ all -> 0x0a97 }
            r9.w(r7)     // Catch:{ all -> 0x0a97 }
        L_0x082f:
            r11 = 0
            r9.t(r11)     // Catch:{ all -> 0x0a97 }
            r9.u(r11)     // Catch:{ all -> 0x0a97 }
            r9.r(r11)     // Catch:{ all -> 0x0a97 }
            java.lang.String r7 = r3.zzc     // Catch:{ all -> 0x0a97 }
            r9.h(r7)     // Catch:{ all -> 0x0a97 }
            long r11 = r3.zzj     // Catch:{ all -> 0x0a97 }
            r9.i(r11)     // Catch:{ all -> 0x0a97 }
            java.lang.String r7 = r3.zzd     // Catch:{ all -> 0x0a97 }
            r9.g(r7)     // Catch:{ all -> 0x0a97 }
            long r11 = r3.zze     // Catch:{ all -> 0x0a97 }
            r9.p(r11)     // Catch:{ all -> 0x0a97 }
            long r11 = r3.zzf     // Catch:{ all -> 0x0a97 }
            r9.k(r11)     // Catch:{ all -> 0x0a97 }
            boolean r7 = r3.zzh     // Catch:{ all -> 0x0a97 }
            r9.v(r7)     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.f r7 = r34.K()     // Catch:{ all -> 0x0a97 }
            r11 = 0
            boolean r7 = r7.u(r11, r10)     // Catch:{ all -> 0x0a97 }
            if (r7 != 0) goto L_0x0868
            long r10 = r3.zzl     // Catch:{ all -> 0x0a97 }
            r9.e(r10)     // Catch:{ all -> 0x0a97 }
        L_0x0868:
            long r10 = r3.zzs     // Catch:{ all -> 0x0a97 }
            r9.l(r10)     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.k r7 = r1.c     // Catch:{ all -> 0x0a97 }
            I(r7)     // Catch:{ all -> 0x0a97 }
            r7.n(r9)     // Catch:{ all -> 0x0a97 }
        L_0x0875:
            g.e.a.b.f.b.g r7 = g.e.a.b.f.b.g.ANALYTICS_STORAGE     // Catch:{ all -> 0x0a97 }
            boolean r4 = r4.e(r7)     // Catch:{ all -> 0x0a97 }
            if (r4 == 0) goto L_0x0891
            java.lang.String r4 = r9.M()     // Catch:{ all -> 0x0a97 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0a97 }
            if (r4 != 0) goto L_0x0891
            java.lang.String r4 = r9.M()     // Catch:{ all -> 0x0a97 }
            g.c.b.b.f.n(r4)     // Catch:{ all -> 0x0a97 }
            r2.m(r4)     // Catch:{ all -> 0x0a97 }
        L_0x0891:
            java.lang.String r4 = r9.P()     // Catch:{ all -> 0x0a97 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0a97 }
            if (r4 != 0) goto L_0x08a5
            java.lang.String r4 = r9.P()     // Catch:{ all -> 0x0a97 }
            g.c.b.b.f.n(r4)     // Catch:{ all -> 0x0a97 }
            r2.B(r4)     // Catch:{ all -> 0x0a97 }
        L_0x08a5:
            g.e.a.b.f.b.k r4 = r1.c     // Catch:{ all -> 0x0a97 }
            I(r4)     // Catch:{ all -> 0x0a97 }
            java.lang.String r3 = r3.zza     // Catch:{ all -> 0x0a97 }
            java.util.List r3 = r4.M(r3)     // Catch:{ all -> 0x0a97 }
            r13 = 0
        L_0x08b1:
            int r4 = r3.size()     // Catch:{ all -> 0x0a97 }
            if (r13 >= r4) goto L_0x08e7
            g.e.a.b.e.c.o4 r4 = g.e.a.b.e.c.p4.v()     // Catch:{ all -> 0x0a97 }
            java.lang.Object r7 = r3.get(r13)     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.o9 r7 = (g.e.a.b.f.b.o9) r7     // Catch:{ all -> 0x0a97 }
            java.lang.String r7 = r7.c     // Catch:{ all -> 0x0a97 }
            r4.m(r7)     // Catch:{ all -> 0x0a97 }
            java.lang.Object r7 = r3.get(r13)     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.o9 r7 = (g.e.a.b.f.b.o9) r7     // Catch:{ all -> 0x0a97 }
            long r9 = r7.f3278d     // Catch:{ all -> 0x0a97 }
            r4.n(r9)     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.m9 r7 = r1.f3233g     // Catch:{ all -> 0x0a97 }
            I(r7)     // Catch:{ all -> 0x0a97 }
            java.lang.Object r9 = r3.get(r13)     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.o9 r9 = (g.e.a.b.f.b.o9) r9     // Catch:{ all -> 0x0a97 }
            java.lang.Object r9 = r9.f3279e     // Catch:{ all -> 0x0a97 }
            r7.I(r4, r9)     // Catch:{ all -> 0x0a97 }
            r2.g0(r4)     // Catch:{ all -> 0x0a97 }
            int r13 = r13 + 1
            goto L_0x08b1
        L_0x08e7:
            g.e.a.b.f.b.k r3 = r1.c     // Catch:{ IOException -> 0x0a4b }
            I(r3)     // Catch:{ IOException -> 0x0a4b }
            g.e.a.b.e.c.o7 r4 = r2.j()     // Catch:{ IOException -> 0x0a4b }
            g.e.a.b.e.c.f4 r4 = (g.e.a.b.e.c.f4) r4     // Catch:{ IOException -> 0x0a4b }
            r3.h()     // Catch:{ IOException -> 0x0a4b }
            r3.i()     // Catch:{ IOException -> 0x0a4b }
            g.c.b.b.f.n(r4)     // Catch:{ IOException -> 0x0a4b }
            java.lang.String r7 = r4.B1()     // Catch:{ IOException -> 0x0a4b }
            g.c.b.b.f.k(r7)     // Catch:{ IOException -> 0x0a4b }
            byte[] r7 = r4.i()     // Catch:{ IOException -> 0x0a4b }
            g.e.a.b.f.b.k9 r9 = r3.b     // Catch:{ IOException -> 0x0a4b }
            g.e.a.b.f.b.m9 r9 = r9.f3233g     // Catch:{ IOException -> 0x0a4b }
            I(r9)     // Catch:{ IOException -> 0x0a4b }
            long r9 = r9.w(r7)     // Catch:{ IOException -> 0x0a4b }
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ IOException -> 0x0a4b }
            r11.<init>()     // Catch:{ IOException -> 0x0a4b }
            java.lang.String r12 = r4.B1()     // Catch:{ IOException -> 0x0a4b }
            r13 = r33
            r11.put(r13, r12)     // Catch:{ IOException -> 0x0a4b }
            java.lang.Long r12 = java.lang.Long.valueOf(r9)     // Catch:{ IOException -> 0x0a4b }
            r14 = r32
            r11.put(r14, r12)     // Catch:{ IOException -> 0x0a4b }
            java.lang.String r12 = "metadata"
            r11.put(r12, r7)     // Catch:{ IOException -> 0x0a4b }
            android.database.sqlite.SQLiteDatabase r7 = r3.A()     // Catch:{ SQLiteException -> 0x0a2f }
            java.lang.String r12 = "raw_events_metadata"
            r15 = 4
            r16 = r2
            r2 = 0
            r7.insertWithOnConflict(r12, r2, r11, r15)     // Catch:{ SQLiteException -> 0x0a2d }
            g.e.a.b.f.b.k r2 = r1.c     // Catch:{ all -> 0x0a97 }
            I(r2)     // Catch:{ all -> 0x0a97 }
            com.google.android.gms.measurement.internal.zzas r3 = r5.f3271f     // Catch:{ all -> 0x0a97 }
            android.os.Bundle r3 = r3.zza     // Catch:{ all -> 0x0a97 }
            java.util.Set r3 = r3.keySet()     // Catch:{ all -> 0x0a97 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0a97 }
        L_0x094d:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0a97 }
            if (r4 == 0) goto L_0x0960
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0a97 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0a97 }
            boolean r4 = r8.equals(r4)     // Catch:{ all -> 0x0a97 }
            if (r4 == 0) goto L_0x094d
            goto L_0x099a
        L_0x0960:
            g.e.a.b.f.b.g4 r3 = r1.a     // Catch:{ all -> 0x0a97 }
            I(r3)     // Catch:{ all -> 0x0a97 }
            java.lang.String r4 = r5.a     // Catch:{ all -> 0x0a97 }
            java.lang.String r7 = r5.b     // Catch:{ all -> 0x0a97 }
            boolean r3 = r3.q(r4, r7)     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.k r15 = r1.c     // Catch:{ all -> 0x0a97 }
            I(r15)     // Catch:{ all -> 0x0a97 }
            long r16 = r34.x()     // Catch:{ all -> 0x0a97 }
            java.lang.String r4 = r5.a     // Catch:{ all -> 0x0a97 }
            r19 = 0
            r20 = 0
            r18 = r4
            g.e.a.b.f.b.i r4 = r15.E(r16, r18, r19, r20)     // Catch:{ all -> 0x0a97 }
            if (r3 == 0) goto L_0x0998
            long r3 = r4.f3191e     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.f r7 = r34.K()     // Catch:{ all -> 0x0a97 }
            java.lang.String r8 = r5.a     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.r2 r11 = g.e.a.b.f.b.s2.o     // Catch:{ all -> 0x0a97 }
            int r7 = r7.n(r8, r11)     // Catch:{ all -> 0x0a97 }
            long r7 = (long) r7     // Catch:{ all -> 0x0a97 }
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 >= 0) goto L_0x0998
            goto L_0x099a
        L_0x0998:
            r28 = 0
        L_0x099a:
            r2.h()     // Catch:{ all -> 0x0a97 }
            r2.i()     // Catch:{ all -> 0x0a97 }
            g.c.b.b.f.n(r5)     // Catch:{ all -> 0x0a97 }
            java.lang.String r3 = r5.a     // Catch:{ all -> 0x0a97 }
            g.c.b.b.f.k(r3)     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.k9 r3 = r2.b     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.m9 r3 = r3.f3233g     // Catch:{ all -> 0x0a97 }
            I(r3)     // Catch:{ all -> 0x0a97 }
            g.e.a.b.e.c.v3 r3 = r3.A(r5)     // Catch:{ all -> 0x0a97 }
            byte[] r3 = r3.i()     // Catch:{ all -> 0x0a97 }
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x0a97 }
            r4.<init>()     // Catch:{ all -> 0x0a97 }
            java.lang.String r7 = r5.a     // Catch:{ all -> 0x0a97 }
            r4.put(r13, r7)     // Catch:{ all -> 0x0a97 }
            java.lang.String r7 = "name"
            java.lang.String r8 = r5.b     // Catch:{ all -> 0x0a97 }
            r4.put(r7, r8)     // Catch:{ all -> 0x0a97 }
            java.lang.String r7 = "timestamp"
            long r11 = r5.f3269d     // Catch:{ all -> 0x0a97 }
            java.lang.Long r8 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0a97 }
            r4.put(r7, r8)     // Catch:{ all -> 0x0a97 }
            java.lang.Long r7 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0a97 }
            r4.put(r14, r7)     // Catch:{ all -> 0x0a97 }
            java.lang.String r7 = "data"
            r4.put(r7, r3)     // Catch:{ all -> 0x0a97 }
            java.lang.String r3 = "realtime"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r28)     // Catch:{ all -> 0x0a97 }
            r4.put(r3, r7)     // Catch:{ all -> 0x0a97 }
            android.database.sqlite.SQLiteDatabase r3 = r2.A()     // Catch:{ SQLiteException -> 0x0a12 }
            r7 = 0
            long r3 = r3.insert(r6, r7, r4)     // Catch:{ SQLiteException -> 0x0a12 }
            r6 = -1
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0a0d
            g.e.a.b.f.b.n4 r3 = r2.a     // Catch:{ SQLiteException -> 0x0a12 }
            g.e.a.b.f.b.f3 r3 = r3.d()     // Catch:{ SQLiteException -> 0x0a12 }
            g.e.a.b.f.b.d3 r3 = r3.p()     // Catch:{ SQLiteException -> 0x0a12 }
            java.lang.String r4 = "Failed to insert raw event (got -1). appId"
            java.lang.String r6 = r5.a     // Catch:{ SQLiteException -> 0x0a12 }
            java.lang.Object r6 = g.e.a.b.f.b.f3.t(r6)     // Catch:{ SQLiteException -> 0x0a12 }
            r3.b(r4, r6)     // Catch:{ SQLiteException -> 0x0a12 }
            goto L_0x0a64
        L_0x0a0d:
            r2 = 0
            r1.o = r2     // Catch:{ all -> 0x0a97 }
            goto L_0x0a64
        L_0x0a12:
            r0 = move-exception
            r3 = r0
            g.e.a.b.f.b.n4 r2 = r2.a     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.f3 r2 = r2.d()     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.d3 r2 = r2.p()     // Catch:{ all -> 0x0a97 }
            java.lang.String r4 = "Error storing raw event. appId"
            java.lang.String r5 = r5.a     // Catch:{ all -> 0x0a97 }
            java.lang.Object r5 = g.e.a.b.f.b.f3.t(r5)     // Catch:{ all -> 0x0a97 }
            r2.c(r4, r5, r3)     // Catch:{ all -> 0x0a97 }
            goto L_0x0a64
        L_0x0a2a:
            r0 = move-exception
        L_0x0a2b:
            r2 = r0
            goto L_0x0a4f
        L_0x0a2d:
            r0 = move-exception
            goto L_0x0a32
        L_0x0a2f:
            r0 = move-exception
            r16 = r2
        L_0x0a32:
            r2 = r0
            g.e.a.b.f.b.n4 r3 = r3.a     // Catch:{ IOException -> 0x0a2a }
            g.e.a.b.f.b.f3 r3 = r3.d()     // Catch:{ IOException -> 0x0a2a }
            g.e.a.b.f.b.d3 r3 = r3.p()     // Catch:{ IOException -> 0x0a2a }
            java.lang.String r5 = "Error storing raw event metadata. appId"
            java.lang.String r4 = r4.B1()     // Catch:{ IOException -> 0x0a2a }
            java.lang.Object r4 = g.e.a.b.f.b.f3.t(r4)     // Catch:{ IOException -> 0x0a2a }
            r3.c(r5, r4, r2)     // Catch:{ IOException -> 0x0a2a }
            throw r2     // Catch:{ IOException -> 0x0a2a }
        L_0x0a4b:
            r0 = move-exception
            r16 = r2
            goto L_0x0a2b
        L_0x0a4f:
            g.e.a.b.f.b.f3 r3 = r34.d()     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.d3 r3 = r3.p()     // Catch:{ all -> 0x0a97 }
            java.lang.String r4 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r5 = r16.U()     // Catch:{ all -> 0x0a97 }
            java.lang.Object r5 = g.e.a.b.f.b.f3.t(r5)     // Catch:{ all -> 0x0a97 }
            r3.c(r4, r5, r2)     // Catch:{ all -> 0x0a97 }
        L_0x0a64:
            g.e.a.b.f.b.k r2 = r1.c     // Catch:{ all -> 0x0a97 }
            I(r2)     // Catch:{ all -> 0x0a97 }
            r2.m()     // Catch:{ all -> 0x0a97 }
            g.e.a.b.f.b.k r2 = r1.c
            I(r2)
            r2.P()
            r34.D()
            g.e.a.b.f.b.f3 r2 = r34.d()
            g.e.a.b.f.b.d3 r2 = r2.q()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r29
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.b(r4, r3)
            return
        L_0x0a97:
            r0 = move-exception
            r2 = r0
            g.e.a.b.f.b.k r3 = r1.c
            I(r3)
            r3.P()
            throw r2
        L_0x0aa2:
            r1.J(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.k9.v(com.google.android.gms.measurement.internal.zzau, com.google.android.gms.measurement.internal.zzp):void");
    }

    public final long x() {
        Objects.requireNonNull((c) e());
        long currentTimeMillis = System.currentTimeMillis();
        h8 h8Var = this.f3235i;
        h8Var.i();
        h8Var.h();
        long a2 = h8Var.f3188l.a();
        if (a2 == 0) {
            a2 = ((long) h8Var.a.A().s().nextInt(86400000)) + 1;
            h8Var.f3188l.b(a2);
        }
        return ((((currentTimeMillis + a2) / 1000) / 60) / 60) / 24;
    }

    public final zzp z(String str) {
        String str2;
        Object obj;
        d3 d3Var;
        k kVar = this.c;
        I(kVar);
        String str3 = str;
        w4 C2 = kVar.C(str3);
        if (C2 == null || TextUtils.isEmpty(C2.O())) {
            d3Var = d().f3143m;
            String str4 = str3;
            str2 = "No app data available; dropping";
            obj = str4;
        } else {
            Boolean A2 = A(C2);
            if (A2 == null || A2.booleanValue()) {
                String Q = C2.Q();
                String O = C2.O();
                long A3 = C2.A();
                String N = C2.N();
                long F = C2.F();
                long C3 = C2.C();
                boolean z2 = C2.z();
                String P = C2.P();
                long s2 = C2.s();
                boolean y2 = C2.y();
                String J = C2.J();
                C2.a.b().h();
                return new zzp(str, Q, O, A3, N, F, C3, (String) null, z2, false, P, s2, 0, 0, y2, false, J, C2.s, C2.D(), C2.a(), L(str).d());
            }
            d3Var = d().f3136f;
            obj = f3.t(str);
            str2 = "App version does not match; dropping. appId";
        }
        d3Var.b(str2, obj);
        return null;
    }
}
