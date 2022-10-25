package g.c.a.o.g;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import g.c.a.g.a.n.j.g;
import g.c.a.o.g.c;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class h<T, VH extends c> extends b<T, VH> implements g {
    public static final Logger p = LoggerFactory.getLogger("WrapDecorateAdapter");
    public final b<T, VH> n;
    public final a o;

    public static final class a extends DataSetObserver {
        public final /* synthetic */ h<T, VH> a;

        public a(h<T, VH> hVar) {
            this.a = hVar;
        }

        public void onChanged() {
            this.a.notifyDataSetChanged();
        }

        public void onInvalidated() {
            this.a.notifyDataSetInvalidated();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(b<T, VH> bVar) {
        super(bVar.b, (List) null, 0, (View) null, 14);
        i.o.c.h.e(bVar, "adapter");
        this.n = bVar;
        a aVar = new a(this);
        this.o = aVar;
        bVar.registerDataSetObserver(aVar);
    }

    public void b() {
        b<T, VH> bVar = this.n;
        if (bVar instanceof g) {
            ((g) bVar).b();
        }
    }

    public void c() {
        b<T, VH> bVar = this.n;
        if (bVar instanceof g) {
            ((g) bVar).c();
        }
    }

    public boolean d() {
        b<T, VH> bVar = this.n;
        if (bVar instanceof g) {
            return ((g) bVar).d();
        }
        return true;
    }

    public int getCount() {
        return this.n.getCount();
    }

    public int getItemViewType(int i2) {
        return this.n.getItemViewType(i2);
    }

    public int getViewTypeCount() {
        return this.n.getViewTypeCount();
    }

    public void h(VH vh, T t) {
        this.n.h(vh, t);
    }

    public VH i(ViewGroup viewGroup, int i2, int i3) {
        return this.n.i(viewGroup, i2, i3);
    }
}
