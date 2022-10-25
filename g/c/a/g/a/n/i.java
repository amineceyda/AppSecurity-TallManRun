package g.c.a.g.a.n;

import com.tencent.trpcprotocol.projecta.common.common_card.nano.CommonCardData;
import com.tencent.trpcprotocol.projecta.common.common_card.nano.CommonCardItem;
import com.tencent.trpcprotocol.projecta.common.common_card.nano.CommonCardRequest;
import g.c.a.g.a.n.h;
import g.c.a.m.f;
import g.c.b.a.e;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class i {

    /* renamed from: e  reason: collision with root package name */
    public static final Logger f2013e = LoggerFactory.getLogger("MainTabActivityModelLog");
    public List<CommonCardItem> a = new ArrayList();
    public f<a, List<CommonCardItem>, List<CommonCardItem>> b;
    public int c = 1;

    /* renamed from: d  reason: collision with root package name */
    public int f2014d = 1;

    public enum a {
        refresh,
        loadMore
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r3 = r3.data;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(com.tencent.trpcprotocol.projecta.common.common_card.nano.CommonCardItem r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x001e
            com.tencent.trpcprotocol.projecta.common.card_data.nano.CardData[] r3 = r3.data
            if (r3 == 0) goto L_0x001e
            r1 = r3[r0]
            if (r1 == 0) goto L_0x001e
            r1 = r3[r0]
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r1 = r1.appInfo
            if (r1 == 0) goto L_0x001e
            r3 = r3[r0]
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r3 = r3.appInfo
            java.lang.String r3 = r3.packageName
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x001e
            r0 = 1
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a.g.a.n.i.a(com.tencent.trpcprotocol.projecta.common.common_card.nano.CommonCardItem):boolean");
    }

    public final void b(a aVar) {
        Logger logger = f2013e;
        logger.info("fetchCommonCard 当前的 pageIndex {}, 以有数据的长度: {}", (Object) Integer.valueOf(this.f2014d), (Object) Integer.valueOf(this.a.size()));
        if (aVar == a.refresh) {
            this.f2014d = this.c;
        }
        logger.debug("拉取前数据: ");
        e(this.a);
        int i2 = this.f2014d;
        g gVar = new g(this, aVar);
        Logger logger2 = h.a;
        h.b bVar = h.b.trending;
        CommonCardRequest commonCardRequest = new CommonCardRequest();
        StringBuilder i3 = g.a.a.a.a.i("get_topics?page_no=");
        if (i2 <= 0) {
            i2 = 1;
        }
        i3.append(i2);
        i3.append("&page_size=");
        i3.append(10);
        i3.append("&topic_id=");
        i3.append(bVar.a());
        String sb = i3.toString();
        h.a.info("fetchCommonCard url: {}", (Object) sb);
        e.a aVar2 = new e.a();
        aVar2.f(sb);
        aVar2.c = commonCardRequest;
        aVar2.d(a.b);
        aVar2.c(CommonCardData.class, new c(gVar));
        aVar2.b(new b(gVar));
        aVar2.e();
    }

    public final String c(CommonCardItem commonCardItem) {
        return !a(commonCardItem) ? "" : commonCardItem.data[0].appInfo.packageName;
    }

    public final boolean d(CommonCardItem commonCardItem) {
        for (CommonCardItem next : this.a) {
            if (a(next) && c(next).equals(c(commonCardItem))) {
                return false;
            }
        }
        return true;
    }

    public final void e(List<CommonCardItem> list) {
        StringBuilder sb = new StringBuilder();
        for (CommonCardItem next : list) {
            if (a(next)) {
                sb.append(c(next));
                sb.append("  ");
            }
        }
        f2013e.debug("list: {}", (Object) sb);
    }
}
