package g.c.a.b.a.k.j;

import android.text.TextUtils;
import android.view.View;
import g.c.a.g.d.a;
import g.i.c.a.a.i.b;

public final /* synthetic */ class f implements View.OnClickListener {
    public final /* synthetic */ o b;

    public /* synthetic */ f(o oVar) {
        this.b = oVar;
    }

    public final void onClick(View view) {
        o oVar = this.b;
        if (!TextUtils.isEmpty(oVar.c.b.sourceInfo.url)) {
            a.d(oVar.b, oVar.c.b.sourceInfo.url);
        }
        b.C0166b.a.j(view);
    }
}
