package g.c.a.d.b;

import com.apkpure.aegon.widgets.flowlayout.LiteTagFlowLayout;
import com.tencent.trpcprotocol.projecta.search_svr.search_svr.nano.GetSearchHotWordsRsp;
import com.tencent.trpcprotocol.projecta.search_svr.search_svr.nano.SearchTopKeywordInfo;
import g.a.a.a.a;
import g.c.b.a.d;
import i.j;
import i.l.c;
import i.o.b.l;
import i.o.c.h;
import i.o.c.i;
import java.util.ArrayList;
import org.slf4j.Logger;

public final class k extends i implements l<d<GetSearchHotWordsRsp>, j> {
    public final /* synthetic */ i this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(i iVar) {
        super(1);
        this.this$0 = iVar;
    }

    public Object g(Object obj) {
        Logger logger;
        String str;
        SearchTopKeywordInfo[] searchTopKeywordInfoArr;
        SearchTopKeywordInfo[] searchTopKeywordInfoArr2;
        d dVar = (d) obj;
        h.e(dVar, "resp");
        if (!dVar.d()) {
            logger = i.f1960g;
            str = "Get search hot words start.";
        } else {
            GetSearchHotWordsRsp getSearchHotWordsRsp = (GetSearchHotWordsRsp) dVar.b;
            ArrayList arrayList = null;
            SearchTopKeywordInfo[] searchTopKeywordInfoArr3 = getSearchHotWordsRsp == null ? null : getSearchHotWordsRsp.searchHotWord;
            boolean z = true;
            if (searchTopKeywordInfoArr3 != null) {
                if (!(searchTopKeywordInfoArr3.length == 0)) {
                    z = false;
                }
            }
            if (z) {
                logger = i.f1960g;
                str = "Get search hot words is null or empty.";
            } else {
                Logger logger2 = i.f1960g;
                StringBuilder i2 = a.i("Get search hot words success, size[");
                GetSearchHotWordsRsp getSearchHotWordsRsp2 = (GetSearchHotWordsRsp) dVar.b;
                i2.append((getSearchHotWordsRsp2 == null || (searchTopKeywordInfoArr2 = getSearchHotWordsRsp2.searchHotWord) == null) ? null : Integer.valueOf(searchTopKeywordInfoArr2.length));
                i2.append(']');
                logger2.debug(i2.toString());
                h hVar = this.this$0.f1961d;
                if (hVar != null) {
                    GetSearchHotWordsRsp getSearchHotWordsRsp3 = (GetSearchHotWordsRsp) dVar.b;
                    if (!(getSearchHotWordsRsp3 == null || (searchTopKeywordInfoArr = getSearchHotWordsRsp3.searchHotWord) == null)) {
                        h.e(searchTopKeywordInfoArr, "$this$toMutableList");
                        arrayList = new ArrayList(c.c(searchTopKeywordInfoArr));
                    }
                    hVar.a = arrayList;
                    LiteTagFlowLayout liteTagFlowLayout = (LiteTagFlowLayout) hVar.b;
                    liteTagFlowLayout.n.clear();
                    liteTagFlowLayout.a();
                }
                return j.a;
            }
        }
        logger.info(str);
        return j.a;
    }
}
