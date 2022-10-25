package g.c.a.o.g;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.apkpure.aegon.widgets.NestedHorizontalScrollView;
import com.apkpure.aegon.widgets.swipe.SwipeRefreshLayout;
import g.c.a.f.i;
import g.c.a.o.g.c;
import i.o.c.h;
import java.util.ArrayList;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class e<T, VH extends c> extends h<T, c> {
    public static final Logger t = LoggerFactory.getLogger("HorizontalDecorateAdapter");
    public final SwipeRefreshLayout q;
    public final int r;
    public final int s;

    public static final class a extends c {

        /* renamed from: f  reason: collision with root package name */
        public final i f2192f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view, SwipeRefreshLayout swipeRefreshLayout, int i2, int i3) {
            super(view, i2, i3);
            h.e(view, "itemView");
            LinearLayout linearLayout = (LinearLayout) view.findViewById(2131298640);
            if (linearLayout != null) {
                NestedHorizontalScrollView nestedHorizontalScrollView = (NestedHorizontalScrollView) view;
                i iVar = new i(nestedHorizontalScrollView, linearLayout, nestedHorizontalScrollView);
                h.d(iVar, "bind(itemView)");
                this.f2192f = iVar;
                iVar.b.setSwipeRefreshLayout(swipeRefreshLayout);
                return;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(2131298640)));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(b<T, VH> bVar, SwipeRefreshLayout swipeRefreshLayout, int i2, int i3) {
        super(bVar);
        h.e(bVar, "adapter");
        this.q = swipeRefreshLayout;
        this.r = i2;
        this.s = i3;
    }

    public void c() {
    }

    public int getCount() {
        return this.n.isEmpty() ? 0 : 1;
    }

    public void h(c cVar, T t2) {
        View view;
        if (!(cVar instanceof a)) {
            t.warn("onBindViewHolder holder is not HorizontalItemViewHolder.");
            return;
        }
        ArrayList<c> arrayList = new ArrayList<>();
        int count = this.n.getCount();
        int i2 = 0;
        if (count > 0) {
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                VH i5 = this.n.i((ViewGroup) null, this.n.getItemViewType(i3), i3);
                if (i5 != null) {
                    i5.f2189d = i3;
                }
                arrayList.add(i5);
                b<T, VH> bVar = this.n;
                bVar.h(i5, bVar.getItem(i3));
                if (i4 >= count) {
                    break;
                }
                i3 = i4;
            }
        }
        a aVar = (a) cVar;
        Objects.requireNonNull(aVar);
        h.e(arrayList, "views");
        h.e(this, "adapter");
        int i6 = this.r;
        int i7 = this.s;
        if (i6 > 0) {
            aVar.f2192f.b.setScrollModel(NestedHorizontalScrollView.a.PAGE);
            aVar.f2192f.b.setPageWidth(i6);
        }
        aVar.f2192f.a.removeAllViews();
        LinearLayout linearLayout = null;
        for (c cVar2 : arrayList) {
            if (i2 % i7 == 0) {
                linearLayout = new LinearLayout(aVar.f2190e);
                linearLayout.setOrientation(1);
                aVar.f2192f.a.addView(linearLayout, new LinearLayout.LayoutParams(i6, -2));
            }
            if (linearLayout != null) {
                if (cVar2 == null) {
                    view = null;
                } else {
                    view = cVar2.b;
                }
                linearLayout.addView(view);
            }
            i2++;
        }
    }

    public c i(ViewGroup viewGroup, int i2, int i3) {
        LayoutInflater layoutInflater = this.f2182f;
        SwipeRefreshLayout swipeRefreshLayout = this.q;
        h.e(layoutInflater, "layoutInflater");
        View inflate = layoutInflater.inflate(2131493496, (ViewGroup) null, false);
        h.d(inflate, "view");
        return new a(inflate, swipeRefreshLayout, i2, i3);
    }
}
