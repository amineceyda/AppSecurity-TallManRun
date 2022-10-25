package g.c.a.l.n;

import android.content.Context;
import android.view.View;
import com.apkpure.aegon.application.RealApplicationLike;
import com.apkpure.aegon.signstuff.view.StuffApkInstallView;
import g.c.a.l.l.o;
import g.i.c.a.a.i.b;
import i.o.c.h;
import org.slf4j.Logger;

public final /* synthetic */ class f implements View.OnClickListener {
    public final /* synthetic */ StuffApkInstallView b;

    public /* synthetic */ f(StuffApkInstallView stuffApkInstallView) {
        this.b = stuffApkInstallView;
    }

    public final void onClick(View view) {
        StuffApkInstallView stuffApkInstallView = this.b;
        Logger logger = StuffApkInstallView.S;
        h.e(stuffApkInstallView, "this$0");
        Context context = RealApplicationLike.context;
        o oVar = stuffApkInstallView.B;
        g.c.a.e.k.a.f.g(context, oVar == null ? null : oVar.g());
        stuffApkInstallView.h();
        b.C0166b.a.j(view);
    }
}
