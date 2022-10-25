package g.e.a.b.e.c;

import g.e.a.b.b.h.e;
import g.e.a.b.f.b.e4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class bd extends j {

    /* renamed from: d  reason: collision with root package name */
    public final boolean f2908d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f2909e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ cd f2910f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bd(cd cdVar, boolean z, boolean z2) {
        super("log");
        this.f2910f = cdVar;
        this.f2908d = z;
        this.f2909e = z2;
    }

    public final p a(h4 h4Var, List list) {
        e4 e4Var;
        List list2;
        e.c0("log", 1, list);
        if (list.size() == 1) {
            this.f2910f.f2911d.a(3, h4Var.b((p) list.get(0)).e(), Collections.emptyList(), this.f2908d, this.f2909e);
        } else {
            int C = e.C(h4Var.b((p) list.get(0)).d().doubleValue());
            int i2 = C != 2 ? C != 3 ? C != 5 ? C != 6 ? 3 : 2 : 5 : 1 : 4;
            String e2 = h4Var.b((p) list.get(1)).e();
            if (list.size() == 2) {
                e4Var = this.f2910f.f2911d;
                list2 = Collections.emptyList();
            } else {
                ArrayList arrayList = new ArrayList();
                for (int i3 = 2; i3 < Math.min(list.size(), 5); i3++) {
                    arrayList.add(h4Var.b((p) list.get(i3)).e());
                }
                e4Var = this.f2910f.f2911d;
                list2 = arrayList;
            }
            e4Var.a(i2, e2, list2, this.f2908d, this.f2909e);
        }
        return p.E;
    }
}
