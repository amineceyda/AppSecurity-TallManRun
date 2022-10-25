package k.h0.e;

import com.tencent.raft.measure.report.ATTAReporter;
import com.tencent.raft.raftframework.sla.SLAConstant;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import k.c0;
import k.h0.c;
import k.h0.g.f;
import k.q;
import k.s;
import k.v;
import k.x;

public final class a implements s {
    public a(c cVar) {
    }

    public static boolean b(String str) {
        return ATTAReporter.KEY_CONTENT_LENGTH.equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || ATTAReporter.KEY_CONTENT_TYPE.equalsIgnoreCase(str);
    }

    public static boolean c(String str) {
        return !"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str);
    }

    public static c0 d(c0 c0Var) {
        if (c0Var == null || c0Var.f4692h == null) {
            return c0Var;
        }
        c0.a aVar = new c0.a(c0Var);
        aVar.f4701g = null;
        return aVar.a();
    }

    public c0 a(s.a aVar) throws IOException {
        System.currentTimeMillis();
        f fVar = (f) aVar;
        x xVar = fVar.f4764f;
        b bVar = new b(xVar, (c0) null);
        if (xVar != null && xVar.a().f4684j) {
            bVar = new b((x) null, (c0) null);
        }
        x xVar2 = bVar.a;
        c0 c0Var = bVar.b;
        if (xVar2 == null && c0Var == null) {
            c0.a aVar2 = new c0.a();
            aVar2.a = fVar.f4764f;
            aVar2.b = v.HTTP_1_1;
            aVar2.c = 504;
            aVar2.f4698d = "Unsatisfiable Request (only-if-cached)";
            aVar2.f4701g = c.c;
            aVar2.f4705k = -1;
            aVar2.f4706l = System.currentTimeMillis();
            return aVar2.a();
        } else if (xVar2 == null) {
            Objects.requireNonNull(c0Var);
            c0.a aVar3 = new c0.a(c0Var);
            aVar3.b(d(c0Var));
            return aVar3.a();
        } else {
            f fVar2 = (f) aVar;
            c0 b = fVar2.b(xVar2, fVar2.b, fVar2.c, fVar2.f4762d);
            if (c0Var != null) {
                if (b.f4688d == 304) {
                    c0.a aVar4 = new c0.a(c0Var);
                    q qVar = c0Var.f4691g;
                    q qVar2 = b.f4691g;
                    ArrayList arrayList = new ArrayList(20);
                    int f2 = qVar.f();
                    for (int i2 = 0; i2 < f2; i2++) {
                        String d2 = qVar.d(i2);
                        String g2 = qVar.g(i2);
                        if ((!"Warning".equalsIgnoreCase(d2) || !g2.startsWith(SLAConstant.TYPE_DEPRECATED_START)) && (b(d2) || !c(d2) || qVar2.c(d2) == null)) {
                            arrayList.add(d2);
                            arrayList.add(g2.trim());
                        }
                    }
                    int f3 = qVar2.f();
                    for (int i3 = 0; i3 < f3; i3++) {
                        String d3 = qVar2.d(i3);
                        if (!b(d3) && c(d3)) {
                            String g3 = qVar2.g(i3);
                            arrayList.add(d3);
                            arrayList.add(g3.trim());
                        }
                    }
                    q.a aVar5 = new q.a();
                    Collections.addAll(aVar5.a, (String[]) arrayList.toArray(new String[arrayList.size()]));
                    aVar4.f4700f = aVar5;
                    aVar4.f4705k = b.f4696l;
                    aVar4.f4706l = b.f4697m;
                    aVar4.b(d(c0Var));
                    c0 d4 = d(b);
                    if (d4 != null) {
                        aVar4.c("networkResponse", d4);
                    }
                    aVar4.f4702h = d4;
                    aVar4.a();
                    b.f4692h.close();
                    throw null;
                }
                c.f(c0Var.f4692h);
            }
            c0.a aVar6 = new c0.a(b);
            aVar6.b(d(c0Var));
            c0 d5 = d(b);
            if (d5 != null) {
                aVar6.c("networkResponse", d5);
            }
            aVar6.f4702h = d5;
            return aVar6.a();
        }
    }
}
