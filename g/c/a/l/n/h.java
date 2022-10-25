package g.c.a.l.n;

import com.apkpure.aegon.signstuff.view.StuffApkInstallView;
import g.c.b.b.f;
import i.j;
import i.m.d;
import i.m.e;
import i.m.f;
import i.m.i.a;
import i.m.j.a.e;
import i.o.b.p;
import j.a.b0;
import j.a.c0;
import j.a.g;
import j.a.x;

@e(c = "com.apkpure.aegon.signstuff.view.StuffApkInstallView$delayHide$1", f = "StuffApkInstallView.kt", l = {306}, m = "invokeSuspend")
public final class h extends i.m.j.a.h implements p<x, d<? super j>, Object> {
    public int label;
    public final /* synthetic */ StuffApkInstallView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(StuffApkInstallView stuffApkInstallView, d<? super h> dVar) {
        super(2, dVar);
        this.this$0 = stuffApkInstallView;
    }

    public final d<j> a(Object obj, d<?> dVar) {
        return new h(this.this$0, dVar);
    }

    public Object d(Object obj, Object obj2) {
        x xVar = (x) obj;
        return new h(this.this$0, (d) obj2).l(j.a);
    }

    public final Object l(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            f.q0(obj);
            this.label = 1;
            g gVar = new g(f.M(this), 1);
            gVar.r();
            i.m.f c = gVar.c();
            int i3 = i.m.e.N;
            f.a aVar2 = c.get(e.a.a);
            if (!(aVar2 instanceof c0)) {
                aVar2 = null;
            }
            c0 c0Var = (c0) aVar2;
            if (c0Var == null) {
                c0Var = b0.a;
            }
            c0Var.f(6000, gVar);
            Object m2 = gVar.m();
            if (m2 == aVar) {
                i.o.c.h.e(this, "frame");
            }
            if (m2 == aVar) {
                return aVar;
            }
        } else if (i2 == 1) {
            g.c.b.b.f.q0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        StuffApkInstallView stuffApkInstallView = this.this$0;
        if (stuffApkInstallView.x) {
            stuffApkInstallView.a();
        }
        return j.a;
    }
}
