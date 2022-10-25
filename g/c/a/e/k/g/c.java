package g.c.a.e.k.g;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.load.engine.GlideException;
import g.d.a.p.d;
import g.d.a.p.i.h;

public final class c implements d<Drawable> {
    public final /* synthetic */ e a;

    public class a implements Runnable {
        public final /* synthetic */ GlideException b;

        public a(GlideException glideException) {
            this.b = glideException;
        }

        public void run() {
            c.this.a.a(this.b);
        }
    }

    public c(e eVar) {
        this.a = eVar;
    }

    public boolean a(Object obj, Object obj2, h hVar, g.d.a.l.a aVar, boolean z) {
        Drawable drawable = (Drawable) obj;
        if (this.a == null) {
            return false;
        }
        new Handler(Looper.getMainLooper()).post(new d(this, drawable));
        return false;
    }

    public boolean b(GlideException glideException, Object obj, h<Drawable> hVar, boolean z) {
        if (this.a == null) {
            return false;
        }
        new Handler(Looper.getMainLooper()).post(new a(glideException));
        return false;
    }
}
