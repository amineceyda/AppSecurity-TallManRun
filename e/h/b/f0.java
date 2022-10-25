package e.h.b;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import e.e.f.a;
import e.h.b.j0;

public class f0 implements Runnable {
    public final /* synthetic */ j0.a b;
    public final /* synthetic */ Fragment c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ a f1435d;

    public f0(j0.a aVar, Fragment fragment, a aVar2) {
        this.b = aVar;
        this.c = fragment;
        this.f1435d = aVar2;
    }

    public void run() {
        ((FragmentManager.d) this.b).a(this.c, this.f1435d);
    }
}
