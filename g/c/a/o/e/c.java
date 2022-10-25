package g.c.a.o.e;

import android.animation.Animator;
import g.c.a.o.e.d;

public class c implements Animator.AnimatorListener {
    public final /* synthetic */ d.a a;
    public final /* synthetic */ d b;

    public c(d dVar, d.a aVar) {
        this.b = dVar;
        this.a = aVar;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
        this.b.a(1.0f, this.a, true);
        d.a aVar = this.a;
        aVar.f2164k = aVar.f2158e;
        aVar.f2165l = aVar.f2159f;
        aVar.f2166m = aVar.f2160g;
        aVar.a((aVar.f2163j + 1) % aVar.f2162i.length);
        d dVar = this.b;
        if (dVar.f2156g) {
            dVar.f2156g = false;
            animator.cancel();
            animator.setDuration(1332);
            animator.start();
            this.a.b(false);
            return;
        }
        dVar.f2155f += 1.0f;
    }

    public void onAnimationStart(Animator animator) {
        this.b.f2155f = 0.0f;
    }
}
