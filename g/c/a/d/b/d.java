package g.c.a.d.b;

import android.view.View;
import com.tencent.trpcprotocol.projecta.search_svr.search_svr.nano.SearchTopKeywordInfo;
import g.c.a.d.b.h;
import g.i.c.a.a.i.b;
import i.o.c.h;

public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ h b;
    public final /* synthetic */ View c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ SearchTopKeywordInfo f1949d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f1950e;

    public /* synthetic */ d(h hVar, View view, SearchTopKeywordInfo searchTopKeywordInfo, int i2) {
        this.b = hVar;
        this.c = view;
        this.f1949d = searchTopKeywordInfo;
        this.f1950e = i2;
    }

    public final void onClick(View view) {
        h hVar = this.b;
        View view2 = this.c;
        SearchTopKeywordInfo searchTopKeywordInfo = this.f1949d;
        int i2 = this.f1950e;
        h.e(hVar, "this$0");
        h.a aVar = hVar.f1958e;
        if (aVar != null) {
            i.o.c.h.d(view2, "layout");
            aVar.a(view2, searchTopKeywordInfo, i2);
        }
        b.C0166b.a.j(view);
    }
}
