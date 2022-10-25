package g.c.a.c;

import android.app.Application;
import com.apkpure.aegon.application.RealApplicationLike;
import g.c.a.b.b.d;
import g.c.a.e.b.e;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ Application b;

    public /* synthetic */ a(Application application) {
        this.b = application;
    }

    public final void run() {
        Application application = this.b;
        e.j(application);
        g.c.a.e.b.i.a.a().b(application);
        d.a.i(RealApplicationLike.getContext());
    }
}
