package g.c.a.g.a.n.j;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.apkpure.aegon.components.statistics.datong.DTStatInfo;
import com.apkpure.aegon.widgets.xlistview.XListView;
import com.tencent.trpcprotocol.projecta.common.common_card.nano.CommonCardItem;
import g.c.a.g.a.n.i;
import g.c.a.g.b.a;
import g.c.a.o.g.b;
import g.c.a.o.g.c;
import i.o.c.f;
import i.o.c.h;
import java.util.List;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class j extends b<CommonCardItem, c> implements g {
    public static final Logger p = LoggerFactory.getLogger("RecommendedForYouAdapter");
    public boolean n;
    public final i o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(XListView xListView) {
        super(xListView, (List) null, 0, (View) null, 14);
        h.e(xListView, "listView");
        i iVar = new i();
        this.o = iVar;
        d dVar = new d(this);
        i.f2013e.info("init 加载数据");
        iVar.c = 2;
        iVar.b = dVar;
    }

    public void b() {
        i iVar = this.o;
        Objects.requireNonNull(iVar);
        i.f2013e.info("下拉刷新");
        iVar.b(i.a.refresh);
    }

    public void c() {
        i iVar = this.o;
        Objects.requireNonNull(iVar);
        i.f2013e.info("加载下一页");
        iVar.b(i.a.loadMore);
    }

    public boolean d() {
        return this.n;
    }

    public void h(c cVar, Object obj) {
        CommonCardItem commonCardItem = (CommonCardItem) obj;
        DTStatInfo dTStatInfo = new DTStatInfo();
        if (this.b.getContext() != null && (this.b.getContext() instanceof a)) {
            Context context = this.b.getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type com.apkpure.aegon.main.base.BaseActivity");
            dTStatInfo = new DTStatInfo(((a) context).p);
        }
        dTStatInfo.moduleName = "recommend_for_you";
        dTStatInfo.modelType = 1141;
        dTStatInfo.position = "4";
        Objects.requireNonNull(cVar, "null cannot be cast to non-null type com.apkpure.aegon.main.activity.maintab.viewholder.HorizontalAppCardViewHolder");
        ((g.c.a.g.a.n.k.b) cVar).f(commonCardItem, dTStatInfo);
    }

    public c i(ViewGroup viewGroup, int i2, int i3) {
        View inflate = LayoutInflater.from(this.f2187k).inflate(2131493500, (ViewGroup) null, false);
        h.d(inflate, "view");
        return new g.c.a.g.a.n.k.b(inflate, i2, i3, (f) null);
    }
}
