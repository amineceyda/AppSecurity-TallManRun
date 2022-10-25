package g.c.a.o.c;

import android.animation.Animator;
import android.view.ViewGroup;
import com.apkpure.aegon.widgets.layout.FingerFrameLayout;

public class d implements Animator.AnimatorListener {
    public final /* synthetic */ FingerFrameLayout a;

    public d(FingerFrameLayout fingerFrameLayout) {
        this.a = fingerFrameLayout;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        FingerFrameLayout fingerFrameLayout = this.a;
        if (fingerFrameLayout.f313h) {
            fingerFrameLayout.f312g = 0.0f;
            ViewGroup viewGroup = (ViewGroup) fingerFrameLayout.getParent();
            if (!(viewGroup == null || viewGroup.getBackground() == null || !this.a.b)) {
                viewGroup.getBackground().mutate().setAlpha(255);
            }
            FingerFrameLayout.a(this.a);
            this.a.f313h = false;
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        this.a.f313h = true;
    }
}
