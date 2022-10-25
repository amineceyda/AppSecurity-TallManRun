package g.c.a.d.b;

import android.view.View;
import com.apkpure.aegon.widgets.swipe.SwipeRefreshLayout;
import g.c.a.f.f;
import g.i.c.a.a.i.b;
import i.o.c.h;

public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ g b;

    public /* synthetic */ c(g gVar) {
        this.b = gVar;
    }

    public final void onClick(View view) {
        g gVar = this.b;
        h.e(gVar, "this$0");
        f fVar = gVar.f1953d;
        SwipeRefreshLayout swipeRefreshLayout = fVar == null ? null : fVar.c;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(true);
        }
        gVar.a();
        b.C0166b.a.j(view);
    }
}
