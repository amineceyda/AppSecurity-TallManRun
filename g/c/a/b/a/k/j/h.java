package g.c.a.b.a.k.j;

import android.view.View;
import g.i.c.a.a.i.b;
import java.util.Objects;

public final /* synthetic */ class h implements View.OnClickListener {
    public final /* synthetic */ r b;

    public /* synthetic */ h(r rVar) {
        this.b = rVar;
    }

    public final void onClick(View view) {
        r rVar = this.b;
        Objects.requireNonNull(rVar);
        r.w.info("详情页, 加载错误,刷新");
        rVar.f1897j.setVisibility(0);
        rVar.f1897j.postInvalidate();
        rVar.q.setVisibility(8);
        rVar.c.a();
        b.C0166b.a.j(view);
    }
}
