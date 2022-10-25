package g.c.a.l.n;

import android.content.Context;
import android.view.View;
import com.apkpure.aegon.signstuff.view.StuffApkInstallView;
import g.c.a.l.d;
import g.c.a.l.l.c0;
import g.i.c.a.a.i.b;
import i.o.c.h;
import org.slf4j.Logger;

public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ StuffApkInstallView b;

    public /* synthetic */ c(StuffApkInstallView stuffApkInstallView) {
        this.b = stuffApkInstallView;
    }

    public final void onClick(View view) {
        StuffApkInstallView stuffApkInstallView = this.b;
        Logger logger = StuffApkInstallView.S;
        h.e(stuffApkInstallView, "this$0");
        stuffApkInstallView.h();
        c0 c0Var = stuffApkInstallView.C;
        if (c0Var != null) {
            d dVar = d.a;
            Context context = stuffApkInstallView.getContext();
            h.d(context, "context");
            dVar.n(context, c0Var);
        }
        b.C0166b.a.j(view);
    }
}
