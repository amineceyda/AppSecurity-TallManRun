package g.c.a.d.a.j;

import android.view.View;
import g.c.a.p.a;
import g.h.a.c.a.r.c;

public class j implements c {
    public final /* synthetic */ k b;

    public j(k kVar) {
        this.b = kVar;
    }

    public void c() {
        try {
            this.b.f1946l.setFinger(true);
            this.b.getActivity().setRequestedOrientation(1);
            this.b.getActivity().getWindow().clearFlags(1024);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void i() {
        try {
            this.b.f1946l.setFinger(false);
            this.b.getActivity().setRequestedOrientation(0);
            this.b.getActivity().getWindow().setFlags(1024, 1024);
            a aVar = this.b.f1944j;
            aVar.a.getWindow().getDecorView().setSystemUiVisibility(5894);
            for (View view : aVar.b) {
                if (view != null) {
                    view.setVisibility(8);
                    view.invalidate();
                }
            }
            this.b.f1939e.b.f549f.b();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
