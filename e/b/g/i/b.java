package e.b.g.i;

import android.content.Context;
import android.view.LayoutInflater;
import e.b.g.i.m;

public abstract class b implements m {
    public Context b;
    public Context c;

    /* renamed from: d  reason: collision with root package name */
    public g f1018d;

    /* renamed from: e  reason: collision with root package name */
    public LayoutInflater f1019e;

    /* renamed from: f  reason: collision with root package name */
    public m.a f1020f;

    /* renamed from: g  reason: collision with root package name */
    public int f1021g;

    /* renamed from: h  reason: collision with root package name */
    public int f1022h;

    /* renamed from: i  reason: collision with root package name */
    public n f1023i;

    public b(Context context, int i2, int i3) {
        this.b = context;
        this.f1019e = LayoutInflater.from(context);
        this.f1021g = i2;
        this.f1022h = i3;
    }

    public boolean i(g gVar, i iVar) {
        return false;
    }

    public boolean j(g gVar, i iVar) {
        return false;
    }

    public void k(m.a aVar) {
        this.f1020f = aVar;
    }
}
