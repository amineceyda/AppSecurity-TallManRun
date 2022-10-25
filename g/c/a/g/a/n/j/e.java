package g.c.a.g.a.n.j;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.apkpure.aegon.components.statistics.datong.DTStatInfo;
import com.apkpure.aegon.widgets.xlistview.XListView;
import com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo;
import com.tencent.trpcprotocol.projecta.common.card_data.nano.CardData;
import com.tencent.trpcprotocol.projecta.common.common_card.nano.CommonCardItem;
import g.c.a.e.k.a.f;
import g.c.a.g.a.n.h;
import g.c.a.g.b.a;
import g.c.a.o.g.b;
import g.c.a.o.g.c;
import i.o.c.h;
import java.util.List;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class e extends b<CommonCardItem, g.c.a.g.a.n.k.b> implements g {
    public static final Logger o = LoggerFactory.getLogger("Hours24TopGamesAdapter");
    public boolean n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(XListView xListView) {
        super(xListView, (List) null, 0, (View) null, 14);
        h.e(xListView, "listView");
    }

    public void b() {
        this.n = false;
        g.c.a.g.a.n.h.a(h.a.APP_24H, 1, 9, new a(this));
    }

    public void c() {
    }

    public boolean d() {
        return this.n;
    }

    public void h(c cVar, Object obj) {
        CardData cardData;
        g.c.a.g.a.n.k.b bVar = (g.c.a.g.a.n.k.b) cVar;
        CommonCardItem commonCardItem = (CommonCardItem) obj;
        AppDetailInfo appDetailInfo = null;
        CardData[] cardDataArr = commonCardItem == null ? null : commonCardItem.data;
        if (!(cardDataArr == null || (cardData = cardDataArr[0]) == null)) {
            appDetailInfo = cardData.appInfo;
        }
        if (appDetailInfo == null) {
            o.info("MainTabCardsAdapter onBindViewHolder item.data is empty: {}");
            return;
        }
        DTStatInfo dTStatInfo = new DTStatInfo();
        if (this.b.getContext() != null && (this.b.getContext() instanceof a)) {
            Context context = this.b.getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type com.apkpure.aegon.main.base.BaseActivity");
            dTStatInfo = new DTStatInfo(((a) context).p);
        }
        dTStatInfo.appId = f.c(appDetailInfo);
        dTStatInfo.moduleName = "popular_apps_24h";
        dTStatInfo.modelType = 1011;
        dTStatInfo.position = "3";
        if (bVar != null) {
            bVar.f(commonCardItem, dTStatInfo);
        }
    }

    public c i(ViewGroup viewGroup, int i2, int i3) {
        View inflate = LayoutInflater.from(this.f2187k).inflate(2131493500, (ViewGroup) null, false);
        i.o.c.h.d(inflate, "view");
        return new g.c.a.g.a.n.k.b(inflate, i2, i3, (i.o.c.f) null);
    }
}
