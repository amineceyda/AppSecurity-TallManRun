package g.c.b.b.k;

import android.view.View;
import com.apkpure.components.installer.ui.InstallApksActivity;
import g.c.b.b.i.e.b;
import g.c.b.b.i.e.k;
import g.c.b.b.j.a;
import i.o.c.h;

public final /* synthetic */ class f implements View.OnClickListener {
    public final /* synthetic */ InstallApksActivity b;

    public /* synthetic */ f(InstallApksActivity installApksActivity) {
        this.b = installApksActivity;
    }

    public final void onClick(View view) {
        InstallApksActivity installApksActivity = this.b;
        InstallApksActivity.a aVar = InstallApksActivity.r;
        h.e(installApksActivity, "this$0");
        a aVar2 = installApksActivity.f335d;
        if (aVar2 != null) {
            k kVar = installApksActivity.c;
            if (kVar != null) {
                h.e(aVar2, "installTask");
                kVar.a().post(new b(kVar));
            }
            installApksActivity.finish();
        }
    }
}
