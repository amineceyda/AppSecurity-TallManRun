package g.e.a.b.f.b;

import android.os.SystemClock;
import android.util.Pair;
import g.e.a.b.a.a.a;
import g.e.a.b.b.h.c;
import g.e.a.b.e.c.ba;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public final class h8 extends b9 {

    /* renamed from: d  reason: collision with root package name */
    public final Map f3180d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public String f3181e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3182f;

    /* renamed from: g  reason: collision with root package name */
    public long f3183g;

    /* renamed from: h  reason: collision with root package name */
    public final p3 f3184h;

    /* renamed from: i  reason: collision with root package name */
    public final p3 f3185i;

    /* renamed from: j  reason: collision with root package name */
    public final p3 f3186j;

    /* renamed from: k  reason: collision with root package name */
    public final p3 f3187k;

    /* renamed from: l  reason: collision with root package name */
    public final p3 f3188l;

    public h8(k9 k9Var) {
        super(k9Var);
        s3 t = this.a.t();
        t.getClass();
        this.f3184h = new p3(t, "last_delete_stale", 0);
        s3 t2 = this.a.t();
        t2.getClass();
        this.f3185i = new p3(t2, "backoff", 0);
        s3 t3 = this.a.t();
        t3.getClass();
        this.f3186j = new p3(t3, "last_upload", 0);
        s3 t4 = this.a.t();
        t4.getClass();
        this.f3187k = new p3(t4, "last_upload_attempt", 0);
        s3 t5 = this.a.t();
        t5.getClass();
        this.f3188l = new p3(t5, "midnight_offset", 0);
    }

    public final boolean k() {
        return false;
    }

    @Deprecated
    public final Pair l(String str) {
        g8 g8Var;
        h();
        Objects.requireNonNull((c) this.a.n);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ba.b();
        if (this.a.f3258g.u((String) null, s2.p0)) {
            g8 g8Var2 = (g8) this.f3180d.get(str);
            if (g8Var2 != null && elapsedRealtime < g8Var2.c) {
                return new Pair(g8Var2.a, Boolean.valueOf(g8Var2.b));
            }
            long q = this.a.f3258g.q(str, s2.b) + elapsedRealtime;
            try {
                a.C0106a a = a.a(this.a.a);
                String str2 = a.a;
                if (str2 != null) {
                    g8Var = new g8(str2, a.b, q);
                } else {
                    g8Var = new g8("", a.b, q);
                }
            } catch (Exception e2) {
                this.a.d().f3143m.b("Unable to get advertising id", e2);
                g8Var = new g8("", false, q);
            }
            this.f3180d.put(str, g8Var);
            return new Pair(g8Var.a, Boolean.valueOf(g8Var.b));
        }
        String str3 = this.f3181e;
        if (str3 != null && elapsedRealtime < this.f3183g) {
            return new Pair(str3, Boolean.valueOf(this.f3182f));
        }
        this.f3183g = this.a.f3258g.q(str, s2.b) + elapsedRealtime;
        try {
            a.C0106a a2 = a.a(this.a.a);
            this.f3181e = "";
            String str4 = a2.a;
            if (str4 != null) {
                this.f3181e = str4;
            }
            this.f3182f = a2.b;
        } catch (Exception e3) {
            this.a.d().f3143m.b("Unable to get advertising id", e3);
            this.f3181e = "";
        }
        return new Pair(this.f3181e, Boolean.valueOf(this.f3182f));
    }

    public final Pair m(String str, h hVar) {
        return hVar.e(g.AD_STORAGE) ? l(str) : new Pair("", Boolean.FALSE);
    }

    @Deprecated
    public final String n(String str) {
        h();
        String str2 = (String) l(str).first;
        MessageDigest r = q9.r();
        if (r == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, r.digest(str2.getBytes()))});
    }
}
