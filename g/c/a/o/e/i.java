package g.c.a.o.e;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.apkpure.aegon.widgets.swipe.SwipeRefreshLayout;

public class i extends Animation {
    public final /* synthetic */ SwipeRefreshLayout b;

    public i(SwipeRefreshLayout swipeRefreshLayout) {
        this.b = swipeRefreshLayout;
    }

    public void applyTransformation(float f2, Transformation transformation) {
        this.b.setAnimationProgress(f2);
    }
}
