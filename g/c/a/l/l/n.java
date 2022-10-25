package g.c.a.l.l;

import com.apkpure.aegon.main.activity.SplashActivity;
import g.c.a.g.a.o.c;
import g.c.a.m.d;
import i.o.c.h;

public final /* synthetic */ class n implements d {
    public final /* synthetic */ d0 a;

    public /* synthetic */ n(d0 d0Var) {
        this.a = d0Var;
    }

    public final void a() {
        d0 d0Var = this.a;
        h.e(d0Var, "this$0");
        if (c.b().c() instanceof SplashActivity) {
            d0.f2060l.info("App enter foreground, current activity is SplashActivity.");
            return;
        }
        d0.f2060l.info("App enter foreground.");
        d0Var.b.postDelayed(l.b, 1000);
    }
}
