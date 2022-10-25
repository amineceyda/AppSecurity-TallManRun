package g.c.a.o.g;

import com.apkpure.aegon.widgets.swipe.SwipeRefreshLayout;
import g.c.a.o.g.c;
import i.o.c.h;

public final class f<T, VH extends c> extends h<T, c> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(String str, b<T, VH> bVar, SwipeRefreshLayout swipeRefreshLayout, int i2, int i3) {
        super(new g(str, new e(bVar, swipeRefreshLayout, i2, i3)));
        h.e(str, "title");
        h.e(bVar, "adapter");
    }
}
