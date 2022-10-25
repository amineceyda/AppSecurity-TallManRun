package g.c.a.d.a.j;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.GlideException;
import g.c.a.e.k.g.e;

public class f implements e {
    public final /* synthetic */ g a;

    public class a implements e {
        public a() {
        }

        public void a(GlideException glideException) {
            f.this.a.f1933g.setVisibility(8);
            f.this.a.f1934h.setVisibility(0);
            f.this.a.f1932f.setVisibility(8);
        }

        public void b(Drawable drawable) {
            f.this.a.f1933g.setVisibility(8);
        }
    }

    public f(g gVar) {
        this.a = gVar;
    }

    public void a(GlideException glideException) {
        g gVar = this.a;
        int i2 = g.f1930l;
        e.e.d.l.a.a0(gVar.c, gVar.f1935i.thumbnailUrl, gVar.f1932f, e.e.d.l.a.Q(), new a());
    }

    public void b(Drawable drawable) {
        this.a.f1933g.setVisibility(8);
    }
}
