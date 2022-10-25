package g.c.a.o.g;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import g.c.a.o.g.c;
import i.o.c.f;
import i.o.c.h;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class g<T, VH extends c> extends h<T, c> {
    public static final Logger r = LoggerFactory.getLogger("TitleDecorateAdapter");
    public final String q;

    public static final class a extends c {
        public a(View view, int i2, int i3, f fVar) {
            super(view, i2, i3);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(String str, b<T, VH> bVar) {
        super(bVar);
        h.e(str, "title");
        h.e(bVar, "adapter");
        this.q = str;
    }

    public int getCount() {
        if (this.n.isEmpty()) {
            return 0;
        }
        return this.n.getCount() + 1;
    }

    public T getItem(int i2) {
        if (i2 == 0) {
            return null;
        }
        return this.n.getItem(m(i2));
    }

    public int getItemViewType(int i2) {
        if (i2 == 0) {
            return 1;
        }
        return this.n.getItemViewType(m(i2)) + 1 + 1;
    }

    public void h(c cVar, T t) {
        if (cVar == null) {
            r.warn("onBindViewHolder holder is null.");
            return;
        }
        int m2 = m(cVar.f2189d);
        cVar.f2189d = m2;
        if (cVar instanceof a) {
            a aVar = (a) cVar;
            String str = this.q;
            h.e(cVar, "holder");
            cVar.b(2131298630, str);
            return;
        }
        b<T, VH> bVar = this.n;
        bVar.h(cVar, bVar.getItem(m2));
    }

    public c i(ViewGroup viewGroup, int i2, int i3) {
        if (i2 == 1) {
            LayoutInflater layoutInflater = this.f2182f;
            h.e(layoutInflater, "layoutInflater");
            View inflate = layoutInflater.inflate(2131493495, (ViewGroup) null, false);
            h.d(inflate, "view");
            return new a(inflate, i2, i3, (f) null);
        }
        int m2 = m(i3);
        return this.n.i(viewGroup, this.n.getItemViewType(m2), m2);
    }

    public final int m(int i2) {
        int count = getCount() - this.n.getCount();
        return i2 < count ? i2 : i2 - count;
    }
}
