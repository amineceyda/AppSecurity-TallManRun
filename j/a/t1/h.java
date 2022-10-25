package j.a.t1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class h<E> {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_cur");
    private volatile Object _cur;

    public h(boolean z) {
        this._cur = new i(8, z);
    }

    public final boolean a(E e2) {
        while (true) {
            i iVar = (i) this._cur;
            int a2 = iVar.a(e2);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                a.compareAndSet(this, iVar, iVar.e());
            } else if (a2 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            i iVar = (i) this._cur;
            if (!iVar.b()) {
                a.compareAndSet(this, iVar, iVar.e());
            } else {
                return;
            }
        }
    }

    public final int c() {
        return ((i) this._cur).c();
    }

    public final E d() {
        while (true) {
            i iVar = (i) this._cur;
            E f2 = iVar.f();
            if (f2 != i.f4625g) {
                return f2;
            }
            a.compareAndSet(this, iVar, iVar.e());
        }
    }
}
