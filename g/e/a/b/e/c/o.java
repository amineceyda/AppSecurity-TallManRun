package g.e.a.b.e.c;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class o extends j implements l {

    /* renamed from: d  reason: collision with root package name */
    public final List f3010d;

    /* renamed from: e  reason: collision with root package name */
    public final List f3011e;

    /* renamed from: f  reason: collision with root package name */
    public h4 f3012f;

    public o(o oVar) {
        super(oVar.b);
        ArrayList arrayList = new ArrayList(oVar.f3010d.size());
        this.f3010d = arrayList;
        arrayList.addAll(oVar.f3010d);
        ArrayList arrayList2 = new ArrayList(oVar.f3011e.size());
        this.f3011e = arrayList2;
        arrayList2.addAll(oVar.f3011e);
        this.f3012f = oVar.f3012f;
    }

    public o(String str, List list, List list2, h4 h4Var) {
        super(str);
        this.f3010d = new ArrayList();
        this.f3012f = h4Var;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f3010d.add(((p) it.next()).e());
            }
        }
        this.f3011e = new ArrayList(list2);
    }

    public final p a(h4 h4Var, List list) {
        p pVar;
        String str;
        h4 a = this.f3012f.a();
        for (int i2 = 0; i2 < this.f3010d.size(); i2++) {
            if (i2 < list.size()) {
                str = (String) this.f3010d.get(i2);
                pVar = h4Var.b((p) list.get(i2));
            } else {
                str = (String) this.f3010d.get(i2);
                pVar = p.E;
            }
            a.e(str, pVar);
        }
        for (p pVar2 : this.f3011e) {
            p b = a.b(pVar2);
            if (b instanceof q) {
                b = a.b(pVar2);
            }
            if (b instanceof h) {
                return ((h) b).b;
            }
        }
        return p.E;
    }

    public final p l() {
        return new o(this);
    }
}
