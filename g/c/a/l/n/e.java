package g.c.a.l.n;

import android.view.View;
import com.apkpure.aegon.signstuff.view.StuffApkInstallView;
import g.c.a.e.h.b.d;
import g.c.a.l.i;
import g.c.a.l.l.o;
import g.c.b.b.f;
import g.i.c.a.a.i.b;
import i.o.c.h;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import org.slf4j.Logger;

public final /* synthetic */ class e implements View.OnClickListener {
    public final /* synthetic */ StuffApkInstallView b;

    public /* synthetic */ e(StuffApkInstallView stuffApkInstallView) {
        this.b = stuffApkInstallView;
    }

    public final void onClick(View view) {
        StuffApkInstallView stuffApkInstallView = this.b;
        Logger logger = StuffApkInstallView.S;
        h.e(stuffApkInstallView, "this$0");
        f.f(stuffApkInstallView.v, (CancellationException) null, 1);
        stuffApkInstallView.a();
        if (stuffApkInstallView.A) {
            i iVar = i.a;
            View view2 = stuffApkInstallView.s;
            o oVar = stuffApkInstallView.B;
            String g2 = oVar == null ? null : oVar.g();
            HashMap hashMap = new HashMap();
            hashMap.put("pop_type", "fast_download_pop");
            if (g2 == null) {
                g2 = "";
            }
            hashMap.put("package_name", g2);
            d.g(view2, "fold_button", hashMap);
            iVar.e(view2);
            if (view2 != null) {
                d.e("clck", view2, d.c(view2.getContext(), (Map<String, Object>) null));
            }
        }
        b.C0166b.a.j(view);
    }
}
