package g.e.a.b.f.b;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.measurement.internal.zzas;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzp;
import g.e.a.b.e.c.b;
import g.e.a.b.e.c.c;
import g.e.a.b.e.c.w0;
import java.util.Map;
import java.util.Objects;

public final class z4 implements Runnable {
    public final /* synthetic */ zzau b;
    public final /* synthetic */ zzp c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g5 f3423d;

    public z4(g5 g5Var, zzau zzau, zzp zzp) {
        this.f3423d = g5Var;
        this.b = zzau;
        this.c = zzp;
    }

    public final void run() {
        String str;
        String str2;
        d3 d3Var;
        zzas zzas;
        g5 g5Var = this.f3423d;
        zzau zzau = this.b;
        Objects.requireNonNull(g5Var);
        if (!(!"_cmp".equals(zzau.zza) || (zzas = zzau.zzb) == null || zzas.c() == 0)) {
            String m2 = zzau.zzb.m("_cis");
            if ("referrer broadcast".equals(m2) || "referrer API".equals(m2)) {
                g5Var.a.d().f3142l.b("Event has been filtered ", zzau.toString());
                zzau = new zzau("_cmpx", zzau.zzb, zzau.zzc, zzau.zzd);
            }
        }
        g5 g5Var2 = this.f3423d;
        zzp zzp = this.c;
        g4 g4Var = g5Var2.a.a;
        k9.I(g4Var);
        if (g4Var.o(zzp.zza)) {
            g5Var2.a.d().n.b("EES config found for", zzp.zza);
            g4 g4Var2 = g5Var2.a.a;
            k9.I(g4Var2);
            String str3 = zzp.zza;
            w0 w0Var = TextUtils.isEmpty(str3) ? null : (w0) g4Var2.f3171i.b(str3);
            if (w0Var != null) {
                try {
                    m9 m9Var = g5Var2.a.f3233g;
                    k9.I(m9Var);
                    Map G = m9Var.G(zzau.zzb.f(), true);
                    String a = k5.a(zzau.zza);
                    if (a == null) {
                        a = zzau.zza;
                    }
                    if (w0Var.b(new b(a, zzau.zzd, G))) {
                        c cVar = w0Var.c;
                        if (!cVar.b.equals(cVar.a)) {
                            g5Var2.a.d().n.b("EES edited event", zzau.zza);
                            m9 m9Var2 = g5Var2.a.f3233g;
                            k9.I(m9Var2);
                            zzau = m9Var2.z(w0Var.c.b);
                        }
                        g5Var2.a.a();
                        g5Var2.a.i(zzau, zzp);
                        if (!w0Var.c.c.isEmpty()) {
                            for (b bVar : w0Var.c.c) {
                                g5Var2.a.d().n.b("EES logging created event", bVar.a);
                                m9 m9Var3 = g5Var2.a.f3233g;
                                k9.I(m9Var3);
                                zzau z = m9Var3.z(bVar);
                                g5Var2.a.a();
                                g5Var2.a.i(z, zzp);
                            }
                            return;
                        }
                        return;
                    }
                } catch (zzd unused) {
                    g5Var2.a.d().f3136f.c("EES error. appId, eventName", zzp.zzb, zzau.zza);
                }
                d3Var = g5Var2.a.d().n;
                str2 = zzau.zza;
                str = "EES was not applied to event";
            } else {
                d3Var = g5Var2.a.d().n;
                str2 = zzp.zza;
                str = "EES not loaded for";
            }
            d3Var.b(str, str2);
        }
        g5Var2.a.a();
        g5Var2.a.i(zzau, zzp);
    }
}
