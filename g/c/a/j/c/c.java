package g.c.a.j.c;

import android.content.Context;
import android.content.DialogInterface;
import g.c.a.g.d.a;
import i.o.c.h;

public final /* synthetic */ class c implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context b;
    public final /* synthetic */ d c;

    public /* synthetic */ c(Context context, d dVar) {
        this.b = context;
        this.c = dVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        Context context = this.b;
        d dVar = this.c;
        h.e(context, "$context");
        h.e(dVar, "this$0");
        a.d(context, dVar.f2038e);
        dialogInterface.dismiss();
    }
}
