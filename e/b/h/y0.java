package e.b.h;

import android.view.View;
import android.view.Window;
import e.b.g.i.a;
import g.i.c.a.a.i.b;

public class y0 implements View.OnClickListener {
    public final a b;
    public final /* synthetic */ z0 c;

    public y0(z0 z0Var) {
        this.c = z0Var;
        this.b = new a(z0Var.a.getContext(), 0, 16908332, 0, z0Var.f1221i);
    }

    public void onClick(View view) {
        z0 z0Var = this.c;
        Window.Callback callback = z0Var.f1224l;
        if (callback != null && z0Var.f1225m) {
            callback.onMenuItemSelected(0, this.b);
        }
        b.C0166b.a.j(view);
    }
}
