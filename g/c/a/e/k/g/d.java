package g.c.a.e.k.g;

import android.graphics.drawable.Drawable;

public class d implements Runnable {
    public final /* synthetic */ Drawable b;
    public final /* synthetic */ c c;

    public d(c cVar, Drawable drawable) {
        this.c = cVar;
        this.b = drawable;
    }

    public void run() {
        this.c.a.b(this.b);
    }
}
