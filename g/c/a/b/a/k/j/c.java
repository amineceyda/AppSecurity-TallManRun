package g.c.a.b.a.k.j;

import android.content.Context;
import android.text.Layout;
import android.widget.TextView;
import e.e.d.l.a;

public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ o b;

    public /* synthetic */ c(o oVar) {
        this.b = oVar;
    }

    public final void run() {
        o oVar = this.b;
        TextView textView = oVar.A;
        Layout layout = textView.getLayout();
        if (layout != null && layout.getLineCount() > textView.getMaxLines()) {
            oVar.C.setVisibility(0);
            oVar.C.setOnClickListener(new a(oVar));
            Context context = oVar.b;
            a.T(context, oVar.C, a.C(context, 2131165306), a.C(oVar.b, 2131165324));
        }
    }
}
