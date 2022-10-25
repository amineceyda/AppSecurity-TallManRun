package e.h.b;

import android.view.View;
import android.view.ViewGroup;
import e.e.f.a;
import e.h.b.b;

public class f implements a.C0042a {
    public final /* synthetic */ View a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ b.f c;

    public f(b bVar, View view, ViewGroup viewGroup, b.f fVar) {
        this.a = view;
        this.b = viewGroup;
        this.c = fVar;
    }

    public void a() {
        this.a.clearAnimation();
        this.b.endViewTransition(this.a);
        this.c.a();
    }
}
