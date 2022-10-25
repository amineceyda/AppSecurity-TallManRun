package g.e.a.b.e.c;

import com.google.android.gms.internal.measurement.zzd;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class w0 {
    public final g3 a;
    public h4 b;
    public final c c = new c();

    /* renamed from: d  reason: collision with root package name */
    public final id f3062d = new id();

    public w0() {
        g3 g3Var = new g3();
        this.a = g3Var;
        this.b = g3Var.b.a();
        g3Var.f2932d.a.put("internal.registerCallback", new a(this));
        g3Var.f2932d.a.put("internal.eventLogger", new a0(this));
    }

    public final void a(v4 v4Var) throws zzd {
        j jVar;
        try {
            this.b = this.a.b.a();
            if (!(this.a.a(this.b, (z4[]) v4Var.u().toArray(new z4[0])) instanceof h)) {
                for (t4 t4Var : v4Var.s().v()) {
                    List u = t4Var.u();
                    String t = t4Var.t();
                    Iterator it = u.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            p a2 = this.a.a(this.b, (z4) it.next());
                            if (a2 instanceof m) {
                                h4 h4Var = this.b;
                                if (!h4Var.g(t)) {
                                    jVar = null;
                                } else {
                                    p d2 = h4Var.d(t);
                                    if (!(d2 instanceof j)) {
                                        String valueOf = String.valueOf(t);
                                        throw new IllegalStateException(valueOf.length() != 0 ? "Invalid function name: ".concat(valueOf) : new String("Invalid function name: "));
                                    }
                                    jVar = (j) d2;
                                }
                                if (jVar == null) {
                                    String valueOf2 = String.valueOf(t);
                                    throw new IllegalStateException(valueOf2.length() != 0 ? "Rule function is undefined: ".concat(valueOf2) : new String("Rule function is undefined: "));
                                }
                                jVar.a(this.b, Collections.singletonList(a2));
                            } else {
                                throw new IllegalArgumentException("Invalid rule definition");
                            }
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    public final boolean b(b bVar) throws zzd {
        try {
            c cVar = this.c;
            cVar.a = bVar;
            cVar.b = bVar.clone();
            cVar.c.clear();
            this.a.c.f("runtime.counter", new i(Double.valueOf(0.0d)));
            this.f3062d.a(this.b.a(), this.c);
            c cVar2 = this.c;
            if ((!cVar2.b.equals(cVar2.a)) || (!this.c.c.isEmpty())) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }
}
