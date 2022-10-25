package g.c.a.b.a.k;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import g.c.a.b.a.k.i.a;
import g.c.a.o.g.b;
import g.c.a.o.g.c;
import g.d.a.l.v.g.i;
import g.d.a.p.e;
import java.util.List;
import java.util.Objects;

public class h extends b<a, c> {
    public final Context n;
    public int o = 0;

    public h(ViewGroup viewGroup, List<a> list) {
        super(viewGroup, list, 2131493493, (View) null);
        Context context = viewGroup.getContext();
        this.n = context;
        this.o = context.getResources().getDimensionPixelSize(2131165316);
    }

    public void h(c cVar, Object obj) {
        String str;
        int i2;
        a aVar = (a) obj;
        String str2 = aVar.c;
        ImageView imageView = (ImageView) cVar.a(2131298641);
        ImageView imageView2 = (ImageView) cVar.a(2131298617);
        if ("type_tube".equals(str2)) {
            str = aVar.b.imageInfo.thumbnail.url;
            i2 = 0;
        } else if ("type_img".equals(str2)) {
            str = aVar.a.thumbnail.url;
            i2 = 8;
        } else {
            str = "";
            e eVar = (e) e.e.d.l.a.R(e.e.d.l.a.u0(this.n, 3)).h(Integer.MIN_VALUE, this.o);
            Objects.requireNonNull(eVar);
            e.e.d.l.a.a0(this.n, str, imageView, (e) eVar.l(i.b, Boolean.TRUE), new g(this, imageView));
        }
        imageView2.setVisibility(i2);
        e eVar2 = (e) e.e.d.l.a.R(e.e.d.l.a.u0(this.n, 3)).h(Integer.MIN_VALUE, this.o);
        Objects.requireNonNull(eVar2);
        e.e.d.l.a.a0(this.n, str, imageView, (e) eVar2.l(i.b, Boolean.TRUE), new g(this, imageView));
    }
}
