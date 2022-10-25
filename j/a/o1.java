package j.a;

import i.m.f;

public final class o1 extends v {
    public static final o1 c = new o1();

    public boolean F(f fVar) {
        return false;
    }

    public String toString() {
        return "Dispatchers.Unconfined";
    }

    public void v(f fVar, Runnable runnable) {
        if (((q1) fVar.get(q1.b)) == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }
}
