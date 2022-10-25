package e.h.b;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;
import e.d.a;

public class h0 implements Runnable {
    public final /* synthetic */ Fragment b;
    public final /* synthetic */ Fragment c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f1452d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ a f1453e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ View f1454f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ l0 f1455g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Rect f1456h;

    public h0(Fragment fragment, Fragment fragment2, boolean z, a aVar, View view, l0 l0Var, Rect rect) {
        this.b = fragment;
        this.c = fragment2;
        this.f1452d = z;
        this.f1453e = aVar;
        this.f1454f = view;
        this.f1455g = l0Var;
        this.f1456h = rect;
    }

    public void run() {
        j0.c(this.b, this.c, this.f1452d, this.f1453e, false);
        View view = this.f1454f;
        if (view != null) {
            this.f1455g.i(view, this.f1456h);
        }
    }
}
