package e.h.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import e.e.f.a;
import e.h.b.j0;

public class m extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ Fragment c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ j0.a f1484d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ a f1485e;

    public m(ViewGroup viewGroup, View view, Fragment fragment, j0.a aVar, a aVar2) {
        this.a = viewGroup;
        this.b = view;
        this.c = fragment;
        this.f1484d = aVar;
        this.f1485e = aVar2;
    }

    public void onAnimationEnd(Animator animator) {
        this.a.endViewTransition(this.b);
        Animator animator2 = this.c.getAnimator();
        this.c.setAnimator((Animator) null);
        if (animator2 != null && this.a.indexOfChild(this.b) < 0) {
            ((FragmentManager.d) this.f1484d).a(this.c, this.f1485e);
        }
    }
}
