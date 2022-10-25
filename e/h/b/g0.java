package e.h.b;

import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

public class g0 implements Runnable {
    public final /* synthetic */ Object b;
    public final /* synthetic */ l0 c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ View f1446d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Fragment f1447e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1448f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1449g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1450h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Object f1451i;

    public g0(Object obj, l0 l0Var, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.b = obj;
        this.c = l0Var;
        this.f1446d = view;
        this.f1447e = fragment;
        this.f1448f = arrayList;
        this.f1449g = arrayList2;
        this.f1450h = arrayList3;
        this.f1451i = obj2;
    }

    public void run() {
        Object obj = this.b;
        if (obj != null) {
            this.c.n(obj, this.f1446d);
            this.f1449g.addAll(j0.h(this.c, this.b, this.f1447e, this.f1448f, this.f1446d));
        }
        if (this.f1450h != null) {
            if (this.f1451i != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f1446d);
                this.c.o(this.f1451i, this.f1450h, arrayList);
            }
            this.f1450h.clear();
            this.f1450h.add(this.f1446d);
        }
    }
}
