package g.c.a.l.n;

import android.content.DialogInterface;
import com.apkpure.aegon.signstuff.view.StuffApkInstallView;

public final /* synthetic */ class g implements DialogInterface.OnClickListener {
    public final /* synthetic */ StuffApkInstallView b;

    public /* synthetic */ g(StuffApkInstallView stuffApkInstallView) {
        this.b = stuffApkInstallView;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        StuffApkInstallView.g(this.b, dialogInterface, i2);
    }
}
