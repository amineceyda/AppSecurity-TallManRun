package g.c.b.b.k;

import android.content.DialogInterface;
import android.os.Build;
import com.apkpure.components.installer.ui.InstallApksActivity;
import i.o.c.h;

public final /* synthetic */ class k implements DialogInterface.OnClickListener {
    public final /* synthetic */ InstallApksActivity b;

    public /* synthetic */ k(InstallApksActivity installApksActivity) {
        this.b = installApksActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        InstallApksActivity installApksActivity = this.b;
        InstallApksActivity.a aVar = InstallApksActivity.r;
        h.e(installApksActivity, "this$0");
        dialogInterface.dismiss();
        if (Build.VERSION.SDK_INT >= 26) {
            installApksActivity.g();
        }
    }
}
