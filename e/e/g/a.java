package e.e.g;

import android.graphics.Typeface;
import e.e.c.c.g;
import e.e.d.d;

public class a implements Runnable {
    public final /* synthetic */ m b;
    public final /* synthetic */ Typeface c;

    public a(c cVar, m mVar, Typeface typeface) {
        this.b = mVar;
        this.c = typeface;
    }

    public void run() {
        m mVar = this.b;
        Typeface typeface = this.c;
        g gVar = ((d.a) mVar).a;
        if (gVar != null) {
            gVar.d(typeface);
        }
    }
}
