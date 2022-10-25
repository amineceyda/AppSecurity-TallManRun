package g.c.b.b.k;

import android.content.Context;
import android.content.DialogInterface;
import com.apkpure.components.installer.ui.InstallApksActivity;
import g.c.b.b.l.e;
import i.o.c.h;

public final /* synthetic */ class d implements DialogInterface.OnClickListener {
    public final /* synthetic */ InstallApksActivity b;

    public /* synthetic */ d(InstallApksActivity installApksActivity) {
        this.b = installApksActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        InstallApksActivity installApksActivity = this.b;
        InstallApksActivity.a aVar = InstallApksActivity.r;
        h.e(installApksActivity, "this$0");
        dialogInterface.dismiss();
        installApksActivity.finish();
        e.f(installApksActivity, installApksActivity.f342k == 3);
        Context context = installApksActivity.b;
        if (context != null) {
            e.g(context);
        } else {
            h.k("context");
            throw null;
        }
    }
}
