package g.e.a.b.f.b;

import java.util.List;

public final class e4 {
    public final /* synthetic */ g4 a;

    public e4(g4 g4Var) {
        this.a = g4Var;
    }

    public final void a(int i2, String str, List list, boolean z, boolean z2) {
        d3 d3Var;
        int i3 = i2 - 1;
        if (i3 == 0) {
            d3Var = this.a.a.d().f3143m;
        } else if (i3 == 1) {
            f3 d2 = this.a.a.d();
            if (z) {
                d3Var = d2.f3137g;
            } else if (!z2) {
                d3Var = d2.f3138h;
            } else {
                d3Var = d2.f3136f;
            }
        } else if (i3 == 3) {
            d3Var = this.a.a.d().n;
        } else if (i3 != 4) {
            d3Var = this.a.a.d().f3142l;
        } else {
            f3 d3 = this.a.a.d();
            if (z) {
                d3Var = d3.f3140j;
            } else if (!z2) {
                d3Var = d3.f3141k;
            } else {
                d3Var = d3.f3139i;
            }
        }
        int size = list.size();
        if (size == 1) {
            d3Var.b(str, list.get(0));
        } else if (size == 2) {
            d3Var.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            d3Var.a(str);
        } else {
            d3Var.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
