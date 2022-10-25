package g.e.a.b.e.c;

import java.util.Iterator;
import java.util.Map;

public final class g9 implements Iterator {
    public int b = -1;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public Iterator f2939d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ i9 f2940e;

    public /* synthetic */ g9(i9 i9Var) {
        this.f2940e = i9Var;
    }

    public final Iterator a() {
        if (this.f2939d == null) {
            this.f2939d = this.f2940e.f2957d.entrySet().iterator();
        }
        return this.f2939d;
    }

    public final boolean hasNext() {
        if (this.b + 1 < this.f2940e.c.size()) {
            return true;
        }
        if (this.f2940e.f2957d.isEmpty() || !a().hasNext()) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ Object next() {
        this.c = true;
        int i2 = this.b + 1;
        this.b = i2;
        return (Map.Entry) (i2 < this.f2940e.c.size() ? this.f2940e.c.get(this.b) : a().next());
    }

    public final void remove() {
        if (this.c) {
            this.c = false;
            i9 i9Var = this.f2940e;
            int i2 = i9.f2956h;
            i9Var.h();
            if (this.b < this.f2940e.c.size()) {
                i9 i9Var2 = this.f2940e;
                int i3 = this.b;
                this.b = i3 - 1;
                i9Var2.f(i3);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
