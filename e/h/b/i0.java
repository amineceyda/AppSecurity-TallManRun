package e.h.b;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;
import e.d.a;
import e.h.b.j0;
import java.util.ArrayList;

public class i0 implements Runnable {
    public final /* synthetic */ l0 b;
    public final /* synthetic */ a c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f1457d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ j0.b f1458e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1459f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ View f1460g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Fragment f1461h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Fragment f1462i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ boolean f1463j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1464k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Object f1465l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ Rect f1466m;

    public i0(l0 l0Var, a aVar, Object obj, j0.b bVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
        this.b = l0Var;
        this.c = aVar;
        this.f1457d = obj;
        this.f1458e = bVar;
        this.f1459f = arrayList;
        this.f1460g = view;
        this.f1461h = fragment;
        this.f1462i = fragment2;
        this.f1463j = z;
        this.f1464k = arrayList2;
        this.f1465l = obj2;
        this.f1466m = rect;
    }

    public void run() {
        a<String, View> e2 = j0.e(this.b, this.c, this.f1457d, this.f1458e);
        if (e2 != null) {
            this.f1459f.addAll(e2.values());
            this.f1459f.add(this.f1460g);
        }
        j0.c(this.f1461h, this.f1462i, this.f1463j, e2, false);
        Object obj = this.f1457d;
        if (obj != null) {
            this.b.w(obj, this.f1464k, this.f1459f);
            View k2 = j0.k(e2, this.f1458e, this.f1465l, this.f1463j);
            if (k2 != null) {
                this.b.i(k2, this.f1466m);
            }
        }
    }
}
