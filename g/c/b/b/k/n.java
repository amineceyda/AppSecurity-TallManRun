package g.c.b.b.k;

import android.content.Context;
import g.c.b.b.f;
import i.o.c.h;

public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;

    public /* synthetic */ n(Context context, int i2) {
        this.b = context;
        this.c = i2;
    }

    public final void run() {
        Context context = this.b;
        int i2 = this.c;
        h.e(context, "$context");
        f.j0(context, context.getResources().getString(i2));
    }
}
