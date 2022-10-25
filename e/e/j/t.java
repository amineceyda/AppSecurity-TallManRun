package e.e.j;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import e.b.c.w;
import java.lang.ref.WeakReference;

public final class t {
    public WeakReference<View> a;
    public int b = -1;

    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ u a;
        public final /* synthetic */ View b;

        public a(t tVar, u uVar, View view) {
            this.a = uVar;
            this.b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.a.a(this.b);
        }

        public void onAnimationEnd(Animator animator) {
            this.a.b(this.b);
        }

        public void onAnimationStart(Animator animator) {
            this.a.c(this.b);
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ w a;
        public final /* synthetic */ View b;

        public b(t tVar, w wVar, View view) {
            this.a = wVar;
            this.b = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((View) w.this.f948d.getParent()).invalidate();
        }
    }

    public t(View view) {
        this.a = new WeakReference<>(view);
    }

    public t a(float f2) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
        return this;
    }

    public void b() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public t c(long j2) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
        return this;
    }

    public t d(u uVar) {
        View view = (View) this.a.get();
        if (view != null) {
            e(view, uVar);
        }
        return this;
    }

    public final void e(View view, u uVar) {
        if (uVar != null) {
            view.animate().setListener(new a(this, uVar, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    public t f(w wVar) {
        View view = (View) this.a.get();
        if (view != null) {
            b bVar = null;
            if (wVar != null) {
                bVar = new b(this, wVar, view);
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }

    public t g(float f2) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
        return this;
    }
}
