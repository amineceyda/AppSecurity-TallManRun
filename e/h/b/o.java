package e.h.b;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

public class o extends AnimationSet implements Runnable {
    public final ViewGroup b;
    public final View c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1486d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1487e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1488f = true;

    public o(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.b = viewGroup;
        this.c = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    public boolean getTransformation(long j2, Transformation transformation) {
        this.f1488f = true;
        if (this.f1486d) {
            return !this.f1487e;
        }
        if (!super.getTransformation(j2, transformation)) {
            this.f1486d = true;
            e.e.j.o.a(this.b, this);
        }
        return true;
    }

    public boolean getTransformation(long j2, Transformation transformation, float f2) {
        this.f1488f = true;
        if (this.f1486d) {
            return !this.f1487e;
        }
        if (!super.getTransformation(j2, transformation, f2)) {
            this.f1486d = true;
            e.e.j.o.a(this.b, this);
        }
        return true;
    }

    public void run() {
        if (this.f1486d || !this.f1488f) {
            this.b.endViewTransition(this.c);
            this.f1487e = true;
            return;
        }
        this.f1488f = false;
        this.b.post(this);
    }
}
