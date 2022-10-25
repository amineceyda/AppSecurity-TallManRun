package g.c.a.o.c;

import android.animation.ValueAnimator;
import com.apkpure.aegon.widgets.layout.FingerFrameLayout;

public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ FingerFrameLayout a;

    public /* synthetic */ b(FingerFrameLayout fingerFrameLayout) {
        this.a = fingerFrameLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        FingerFrameLayout fingerFrameLayout = this.a;
        if (fingerFrameLayout.f313h) {
            fingerFrameLayout.setScrollY(-((int) ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }
}
