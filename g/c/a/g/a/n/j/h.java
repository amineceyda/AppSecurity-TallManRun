package g.c.a.g.a.n.j;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.apkpure.aegon.widgets.swipe.SwipeRefreshLayout;
import com.apkpure.aegon.widgets.xlistview.XListView;
import com.tencent.trpcprotocol.projecta.common.common_card.nano.CommonCardItem;
import g.c.a.o.g.c;
import g.c.a.o.g.d;
import g.c.a.o.g.f;
import g.c.a.o.g.g;
import java.util.List;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class h extends g.c.a.o.g.b<g.c.a.o.g.b<Object, c>, a> implements g {
    @Deprecated
    public static final Logger u = LoggerFactory.getLogger("MainTabCardsAdapterLog");
    public final int n;
    public final d o;
    public final f<CommonCardItem, g.c.a.g.a.n.k.c> p;
    public final f<CommonCardItem, g.c.a.g.a.n.k.b> q;
    public final f<CommonCardItem, g.c.a.g.a.n.k.b> r;
    public final g<CommonCardItem, c> s;
    public final b t;

    public static final class a extends c {

        /* renamed from: f  reason: collision with root package name */
        public final c f2016f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar, int i2, int i3) {
            super(cVar.b, i2, i3);
            i.o.c.h.e(cVar, "viewHolder");
            this.f2016f = cVar;
        }
    }

    public static final class b extends DataSetObserver {
        public final /* synthetic */ h a;

        public b(h hVar) {
            this.a = hVar;
        }

        public void onChanged() {
            this.a.notifyDataSetChanged();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(XListView xListView, SwipeRefreshLayout swipeRefreshLayout) {
        super(xListView, (List) null, 0, (View) null, 14);
        i.o.c.h.e(xListView, "listView");
        int dimension = (int) ((this.f2187k.getResources().getDimension(2131165269) * 6.0f) + (this.f2187k.getResources().getDimension(2131165287) * 3.0f));
        this.n = dimension;
        f fVar = new f(g(2131821942), new i(xListView), swipeRefreshLayout, -2, 1);
        this.p = fVar;
        SwipeRefreshLayout swipeRefreshLayout2 = swipeRefreshLayout;
        int i2 = dimension;
        f fVar2 = new f(g(2131821944), new f(xListView), swipeRefreshLayout2, i2, 3);
        this.q = fVar2;
        f fVar3 = new f(g(2131821943), new e(xListView), swipeRefreshLayout2, i2, 3);
        this.r = fVar3;
        g<CommonCardItem, c> gVar = new g<>(g(2131821946), new j(xListView));
        this.s = gVar;
        b bVar = new b(this);
        this.t = bVar;
        fVar.registerDataSetObserver(bVar);
        fVar2.registerDataSetObserver(bVar);
        fVar3.registerDataSetObserver(bVar);
        gVar.registerDataSetObserver(bVar);
        this.o = new d(fVar, fVar2, fVar3, gVar);
        b();
    }

    public void b() {
        List<BaseAdapter> list = this.o.b;
        if (list != null) {
            for (BaseAdapter baseAdapter : list) {
                if (baseAdapter instanceof g) {
                    ((g) baseAdapter).b();
                }
            }
        }
    }

    public void c() {
        g.c.a.o.g.b<T, VH> bVar = this.s.n;
        if (bVar instanceof g) {
            ((g) bVar).c();
        }
    }

    public boolean d() {
        List<BaseAdapter> list = this.o.b;
        if (list == null) {
            return true;
        }
        for (BaseAdapter baseAdapter : list) {
            if ((baseAdapter instanceof g) && !((g) baseAdapter).d()) {
                return false;
            }
        }
        return true;
    }

    public int getCount() {
        return this.o.getCount();
    }

    public int getItemViewType(int i2) {
        return this.o.getItemViewType(i2);
    }

    public void h(c cVar, Object obj) {
        a aVar = (a) cVar;
        g.c.a.o.g.b bVar = (g.c.a.o.g.b) obj;
        if (aVar == null) {
            u.warn("onBindViewHolder holder is null.");
            return;
        }
        aVar.f2016f.f2189d = this.o.b(aVar.f2189d)[1];
        if (bVar != null) {
            c cVar2 = aVar.f2016f;
            bVar.h(cVar2, bVar.getItem(cVar2.f2189d));
        }
    }

    public c i(ViewGroup viewGroup, int i2, int i3) {
        int i4 = this.o.b(i3)[1];
        g.c.a.o.g.b<Object, c> m2 = getItem(i3);
        c i5 = m2.i(viewGroup, m2.getItemViewType(i4), i4);
        i.o.c.h.c(i5);
        return new a(i5, i2, i3);
    }

    /* renamed from: m */
    public g.c.a.o.g.b<Object, c> getItem(int i2) {
        d dVar = this.o;
        BaseAdapter a2 = dVar.a(dVar.b(i2)[0]);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type com.apkpure.aegon.widgets.xlistview.BaseQuickAdapter<kotlin.Any, com.apkpure.aegon.widgets.xlistview.BaseViewHolder>");
        return (g.c.a.o.g.b) a2;
    }

    public void notifyDataSetChanged() {
        if (getCount() > 0) {
            super.notifyDataSetChanged();
        }
    }

    public void notifyDataSetInvalidated() {
        if (d()) {
            super.notifyDataSetInvalidated();
        }
    }
}
