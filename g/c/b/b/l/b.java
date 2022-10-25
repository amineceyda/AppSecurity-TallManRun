package g.c.b.b.l;

import android.content.DialogInterface;
import g.c.b.b.f;
import i.o.c.h;

public final /* synthetic */ class b implements DialogInterface.OnClickListener {
    public final /* synthetic */ i b;

    public /* synthetic */ b(i iVar) {
        this.b = iVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        i iVar = this.b;
        h.e(iVar, "this$0");
        dialogInterface.dismiss();
        iVar.f2300d.j(iVar.f2301e, 7, f.C(7));
    }
}
