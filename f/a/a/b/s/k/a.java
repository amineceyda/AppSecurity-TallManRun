package f.a.a.b.s.k;

import f.a.a.b.s.b;
import f.a.a.b.s.c;
import f.a.a.b.s.f;
import f.a.a.b.w.d;
import java.util.Map;

public class a<E> extends d {

    /* renamed from: e  reason: collision with root package name */
    public b<E> f1772e;

    /* renamed from: f  reason: collision with root package name */
    public b<E> f1773f;

    /* renamed from: g  reason: collision with root package name */
    public final d f1774g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<String, String> f1775h;

    public a(d dVar, Map<String, String> map) {
        this.f1774g = dVar;
        this.f1775h = map;
    }

    public final void s(b<E> bVar) {
        if (this.f1772e == null) {
            this.f1773f = bVar;
            this.f1772e = bVar;
            return;
        }
        b<E> bVar2 = this.f1773f;
        if (bVar2.b == null) {
            bVar2.b = bVar;
            this.f1773f = bVar;
            return;
        }
        throw new IllegalStateException("Next converter has been already set");
    }

    public b<E> t() {
        f fVar;
        b bVar;
        c cVar;
        f.a.a.b.s.a aVar;
        this.f1773f = null;
        this.f1772e = null;
        for (d dVar = this.f1774g; dVar != null; dVar = dVar.c) {
            int i2 = dVar.a;
            if (i2 != 0) {
                if (i2 == 1) {
                    f fVar2 = (f) dVar;
                    String str = (String) fVar2.b;
                    String str2 = this.f1775h.get(str);
                    if (str2 != null) {
                        try {
                            cVar = (c) e.e.f.b.r(str2, c.class, this.c);
                        } catch (Exception e2) {
                            c(g.a.a.a.a.d("Failed to instantiate converter class [", str2, "] for keyword [", str, "]"), e2);
                        }
                    } else {
                        m("There is no conversion class registered for conversion word [" + str + "]");
                        cVar = null;
                    }
                    if (cVar != null) {
                        f.a.a.b.s.d dVar2 = fVar2.f1777d;
                        if (cVar.c == null) {
                            cVar.c = dVar2;
                            cVar.f1759e = fVar2.f1781e;
                            bVar = cVar;
                        } else {
                            throw new IllegalStateException("FormattingInfo has been already set");
                        }
                    } else {
                        StringBuilder i3 = g.a.a.a.a.i("%PARSER_ERROR[");
                        i3.append(fVar2.b);
                        i3.append("]");
                        fVar = new f(i3.toString());
                        StringBuilder i4 = g.a.a.a.a.i("[");
                        i4.append(fVar2.b);
                        i4.append("] is not a valid conversion word");
                        o(new f.a.a.b.x.a(i4.toString(), this));
                        s(fVar);
                    }
                } else if (i2 != 2) {
                    continue;
                } else {
                    b bVar2 = (b) dVar;
                    String str3 = (String) bVar2.b;
                    String str4 = this.f1775h.get(str3);
                    if (str4 != null) {
                        try {
                            aVar = (f.a.a.b.s.a) e.e.f.b.r(str4, f.a.a.b.s.a.class, this.c);
                        } catch (Exception e3) {
                            c(g.a.a.a.a.d("Failed to instantiate converter class [", str4, "] as a composite converter for keyword [", str3, "]"), e3);
                        }
                    } else {
                        m("There is no conversion class registered for composite conversion word [" + str3 + "]");
                        aVar = null;
                    }
                    if (aVar == null) {
                        StringBuilder i5 = g.a.a.a.a.i("Failed to create converter for [%");
                        i5.append(bVar2.b);
                        i5.append("] keyword");
                        m(i5.toString());
                        StringBuilder i6 = g.a.a.a.a.i("%PARSER_ERROR[");
                        i6.append(bVar2.b);
                        i6.append("]");
                        fVar = new f(i6.toString());
                        s(fVar);
                    } else {
                        f.a.a.b.s.d dVar3 = bVar2.f1777d;
                        if (aVar.c == null) {
                            aVar.c = dVar3;
                            aVar.f1759e = bVar2.f1781e;
                            a aVar2 = new a(bVar2.f1776f, this.f1775h);
                            aVar2.g(this.c);
                            aVar.f1757g = aVar2.t();
                            bVar = aVar;
                        } else {
                            throw new IllegalStateException("FormattingInfo has been already set");
                        }
                    }
                }
                s(bVar);
            } else {
                s(new f((String) dVar.b));
            }
        }
        return this.f1772e;
    }
}
