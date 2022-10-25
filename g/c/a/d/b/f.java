package g.c.a.d.b;

import com.apkpure.aegon.widgets.xlistview.XListView;
import com.tencent.trpcprotocol.projecta.common.paging.nano.Paging;
import com.tencent.trpcprotocol.projecta.search_svr.search_svr.nano.SearchQueryRsp;
import i.o.c.h;

public final class f implements XListView.a {
    public final /* synthetic */ g b;

    public f(g gVar) {
        this.b = gVar;
    }

    public void a() {
        g gVar = this.b;
        String str = gVar.b;
        if (str == null || str.length() == 0) {
            g.f1952i.info("Search keyWork is null or empty.");
            return;
        }
        String str2 = gVar.b;
        h.c(str2);
        String str3 = gVar.c;
        e eVar = gVar.f1956g;
        long j2 = 1;
        if (eVar != null) {
            SearchQueryRsp searchQueryRsp = eVar.n;
            Paging paging = searchQueryRsp == null ? null : searchQueryRsp.page;
            j2 = 1 + (paging == null ? 0 : paging.currentPage);
        }
        gVar.b(str2, str3, j2);
    }
}
