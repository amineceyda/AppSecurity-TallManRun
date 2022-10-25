package e.e.j;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

public final class o implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View b;
    public ViewTreeObserver c;

    /* renamed from: d  reason: collision with root package name */
    public final Runnable f1338d;

    public o(View view, Runnable runnable) {
        this.b = view;
        this.c = view.getViewTreeObserver();
        this.f1338d = runnable;
    }

    public static o a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        o oVar = new o(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(oVar);
        view.addOnAttachStateChangeListener(oVar);
        return oVar;
    }

    public void b() {
        (this.c.isAlive() ? this.c : this.b.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.b.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        b();
        this.f1338d.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.c = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
