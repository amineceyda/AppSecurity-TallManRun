package g.c.a.g.a.n.j;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.apkpure.aegon.components.statistics.datong.DTStatInfo;
import com.apkpure.aegon.view.button.DownloadButton;
import com.apkpure.aegon.widgets.xlistview.XListView;
import com.tencent.raft.raftframework.sla.SLAConstant;
import com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo;
import com.tencent.trpcprotocol.projecta.common.card_data.nano.CardData;
import com.tencent.trpcprotocol.projecta.common.common_card.nano.CommonCardItem;
import g.c.a.e.k.a.f;
import g.c.a.g.a.n.i;
import g.c.a.g.a.n.k.c;
import g.c.a.g.b.a;
import g.c.a.o.g.b;
import i.o.c.h;
import java.util.List;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class i extends b<CommonCardItem, c> implements g {
    public static final Logger p = LoggerFactory.getLogger("Hours24TopGamesAdapter");
    public boolean n;
    public final g.c.a.g.a.n.i o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(XListView xListView) {
        super(xListView, (List) null, 0, (View) null, 14);
        h.e(xListView, "listView");
        g.c.a.g.a.n.i iVar = new g.c.a.g.a.n.i();
        this.o = iVar;
        c cVar = new c(this);
        g.c.a.g.a.n.i.f2013e.info("init 加载数据");
        iVar.c = 1;
        iVar.b = cVar;
    }

    public void b() {
        this.n = false;
        g.c.a.g.a.n.i iVar = this.o;
        Objects.requireNonNull(iVar);
        g.c.a.g.a.n.i.f2013e.info("下拉刷新");
        iVar.b(i.a.refresh);
    }

    public void c() {
        g.c.a.g.a.n.i iVar = this.o;
        Objects.requireNonNull(iVar);
        g.c.a.g.a.n.i.f2013e.info("加载下一页");
        iVar.b(i.a.loadMore);
    }

    public boolean d() {
        return this.n;
    }

    public void h(g.c.a.o.g.c cVar, Object obj) {
        Object obj2;
        Logger logger;
        CardData cardData;
        c cVar2 = (c) cVar;
        CommonCardItem commonCardItem = (CommonCardItem) obj;
        String str = null;
        CardData[] cardDataArr = commonCardItem == null ? null : commonCardItem.data;
        boolean z = false;
        AppDetailInfo appDetailInfo = (cardDataArr == null || (cardData = cardDataArr[0]) == null) ? null : cardData.appInfo;
        String str2 = "MainTabCardsAdapter onBindViewHolder item.data is empty: {}";
        if (appDetailInfo == null) {
            p.info(str2);
            return;
        }
        DTStatInfo dTStatInfo = new DTStatInfo();
        if (this.b.getContext() != null && (this.b.getContext() instanceof a)) {
            Context context = this.b.getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type com.apkpure.aegon.main.base.BaseActivity");
            dTStatInfo = new DTStatInfo(((a) context).p);
        }
        dTStatInfo.appId = f.c(appDetailInfo);
        dTStatInfo.moduleName = "discover_app";
        dTStatInfo.modelType = 1016;
        dTStatInfo.position = SLAConstant.TYPE_DEPRECATED_START;
        if (cVar2 != null) {
            h.e(dTStatInfo, "dtStatInfo");
            cVar2.f2025j = dTStatInfo;
            boolean z2 = true;
            if ((commonCardItem == null ? null : commonCardItem.data) == null) {
                logger = cVar2.f2022g;
                if (commonCardItem == null) {
                    z = true;
                }
                obj2 = Boolean.valueOf(z);
                str2 = "MainTabCardsAdapter onBindViewHolder item is empty: {}";
            } else {
                CardData[] cardDataArr2 = commonCardItem.data;
                h.d(cardDataArr2, "item.data");
                if (cardDataArr2.length != 0) {
                    z2 = false;
                }
                if (!z2) {
                    CardData[] cardDataArr3 = commonCardItem.data;
                    if (cardDataArr3[0].appInfo != null) {
                        AppDetailInfo appDetailInfo2 = cardDataArr3[0].appInfo;
                        cVar2.f2023h = appDetailInfo2;
                        TextView textView = cVar2.f2024i.b;
                        if (appDetailInfo2 != null) {
                            str = appDetailInfo2.title;
                        }
                        textView.setText(str);
                        ImageView imageView = cVar2.f2024i.a;
                        h.d(imageView, "binding.appIcon");
                        cVar2.d(imageView, cVar2.f2023h);
                        DownloadButton downloadButton = cVar2.f2024i.c;
                        h.d(downloadButton, "binding.downloadButton");
                        cVar2.e(downloadButton, cVar2.f2023h, cVar2.f2189d, dTStatInfo);
                        return;
                    }
                }
                logger = cVar2.f2022g;
                obj2 = Integer.valueOf(commonCardItem.data.length);
            }
            logger.info(str2, obj2);
        }
    }

    public g.c.a.o.g.c i(ViewGroup viewGroup, int i2, int i3) {
        View inflate = LayoutInflater.from(this.f2187k).inflate(2131493502, (ViewGroup) null, false);
        h.d(inflate, "view");
        return new c(inflate, i2, i3, (i.o.c.f) null);
    }
}
