package g.c.a.l.n;

import android.view.View;
import android.widget.Button;
import com.apkpure.aegon.signstuff.view.StuffApkInstallView;
import g.c.a.l.i;
import g.c.a.l.l.d0;
import g.c.a.l.l.o;
import g.i.c.a.a.i.b;
import i.o.c.h;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;

public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ StuffApkInstallView b;

    public /* synthetic */ d(StuffApkInstallView stuffApkInstallView) {
        this.b = stuffApkInstallView;
    }

    public final void onClick(View view) {
        Integer num;
        String num2;
        StuffApkInstallView stuffApkInstallView = this.b;
        Logger logger = StuffApkInstallView.S;
        h.e(stuffApkInstallView, "this$0");
        String str = null;
        if (stuffApkInstallView.A) {
            i iVar = i.a;
            Button button = stuffApkInstallView.o;
            o oVar = stuffApkInstallView.B;
            String g2 = oVar == null ? null : oVar.g();
            o oVar2 = stuffApkInstallView.B;
            if (oVar2 == null) {
                num = null;
            } else {
                num = Integer.valueOf(oVar2.c);
            }
            if (button != null) {
                button.setTag(num);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("pop_type", "fast_download_pop");
            String str2 = "";
            if (g2 == null) {
                g2 = str2;
            }
            hashMap.put("package_name", g2);
            if (!(num == null || (num2 = num.toString()) == null)) {
                str2 = num2;
            }
            hashMap.put("status", str2);
            g.c.a.e.h.b.d.g(button, "retry_button", hashMap);
            iVar.e(button);
            if (button != null) {
                g.c.a.e.h.b.d.e("clck", button, g.c.a.e.h.b.d.c(button.getContext(), (Map<String, Object>) null));
            }
        }
        o oVar3 = stuffApkInstallView.B;
        if (oVar3 != null) {
            str = oVar3.g();
        }
        if (!(str == null || str.length() == 0)) {
            g.c.a.l.d dVar = g.c.a.l.d.a;
            d0 d0Var = g.c.a.l.d.f2042e;
            if (d0Var == null) {
                g.c.a.l.d.b.info("Re install, apkManager is null.");
            } else {
                h.c(d0Var);
                d0Var.k();
            }
            stuffApkInstallView.n();
        }
        b.C0166b.a.j(view);
    }
}
