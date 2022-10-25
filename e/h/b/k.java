package e.h.b;

import android.animation.Animator;
import android.view.View;
import androidx.fragment.app.Fragment;
import e.e.f.a;

public class k implements a.C0042a {
    public final /* synthetic */ Fragment a;

    public k(Fragment fragment) {
        this.a = fragment;
    }

    public void a() {
        if (this.a.getAnimatingAway() != null) {
            View animatingAway = this.a.getAnimatingAway();
            this.a.setAnimatingAway((View) null);
            animatingAway.clearAnimation();
        }
        this.a.setAnimator((Animator) null);
    }
}
