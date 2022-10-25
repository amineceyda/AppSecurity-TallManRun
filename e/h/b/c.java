package e.h.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import e.h.b.b;
import e.h.b.q0;

public class c extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ q0.d f1417d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ b.f f1418e;

    public c(b bVar, ViewGroup viewGroup, View view, boolean z, q0.d dVar, b.f fVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.f1417d = dVar;
        this.f1418e = fVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.a.endViewTransition(this.b);
        if (this.c) {
            this.f1417d.a.a(this.b);
        }
        this.f1418e.a();
    }
}
