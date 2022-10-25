package j.a;

import g.c.b.b.f;
import j.a.t1.a;
import java.util.Objects;

public abstract class l0 extends v {
    public long c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4611d;

    /* renamed from: e  reason: collision with root package name */
    public a<g0<?>> f4612e;

    public final void O(boolean z) {
        long P = this.c - P(z);
        this.c = P;
        if (P <= 0 && this.f4611d) {
            shutdown();
        }
    }

    public final long P(boolean z) {
        return z ? 4294967296L : 1;
    }

    public final void Q(g0<?> g0Var) {
        a<g0<?>> aVar = this.f4612e;
        if (aVar == null) {
            aVar = new a<>();
            this.f4612e = aVar;
        }
        Object[] objArr = aVar.a;
        int i2 = aVar.c;
        objArr[i2] = g0Var;
        int length = (objArr.length - 1) & (i2 + 1);
        aVar.c = length;
        int i3 = aVar.b;
        if (length == i3) {
            int length2 = objArr.length;
            Object[] objArr2 = new Object[(length2 << 1)];
            f.t(objArr, objArr2, 0, i3, 0, 10);
            Object[] objArr3 = aVar.a;
            int length3 = objArr3.length;
            int i4 = aVar.b;
            f.t(objArr3, objArr2, length3 - i4, 0, i4, 4);
            aVar.a = objArr2;
            aVar.b = 0;
            aVar.c = length2;
        }
    }

    public final void S(boolean z) {
        this.c = P(z) + this.c;
        if (!z) {
            this.f4611d = true;
        }
    }

    public final boolean V() {
        return this.c >= P(true);
    }

    public final boolean X() {
        a<g0<?>> aVar = this.f4612e;
        if (aVar != null) {
            int i2 = aVar.b;
            Object obj = null;
            if (i2 != aVar.c) {
                Object[] objArr = aVar.a;
                Object obj2 = objArr[i2];
                objArr[i2] = null;
                aVar.b = (i2 + 1) & (objArr.length - 1);
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type T");
                obj = obj2;
            }
            g0 g0Var = (g0) obj;
            if (g0Var != null) {
                g0Var.run();
                return true;
            }
        }
        return false;
    }

    public void shutdown() {
    }
}
