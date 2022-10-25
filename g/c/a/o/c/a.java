package g.c.a.o.c;

import android.animation.ValueAnimator;
import com.apkpure.aegon.widgets.layout.FingerFrameLayout;

public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ FingerFrameLayout a;

    public /* synthetic */ a(FingerFrameLayout fingerFrameLayout) {
        this.a = fingerFrameLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        FingerFrameLayout fingerFrameLayout = this.a;
        if (fingerFrameLayout.f313h) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            fingerFrameLayout.f312g = floatValue;
            fingerFrameLayout.setScrollY(-((int) floatValue));
        }
    }
}
