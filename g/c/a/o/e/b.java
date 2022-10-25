package g.c.a.o.e;

import android.animation.ValueAnimator;
import g.c.a.o.e.d;

public class b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ d.a a;
    public final /* synthetic */ d b;

    public b(d dVar, d.a aVar) {
        this.b = dVar;
        this.a = aVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.b.d(floatValue, this.a);
        this.b.a(floatValue, this.a, false);
        this.b.invalidateSelf();
    }
}
