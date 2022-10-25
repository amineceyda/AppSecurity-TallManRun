package e.h.b;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import e.h.b.b;

public class e implements Animation.AnimationListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ b.f c;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            e eVar = e.this;
            eVar.a.endViewTransition(eVar.b);
            e.this.c.a();
        }
    }

    public e(b bVar, ViewGroup viewGroup, View view, b.f fVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = fVar;
    }

    public void onAnimationEnd(Animation animation) {
        this.a.post(new a());
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
