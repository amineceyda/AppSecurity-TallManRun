package g.c.b.b.k;

import android.view.View;
import com.apkpure.components.installer.ui.InstallApksActivity;
import i.o.c.h;

public final /* synthetic */ class j implements View.OnClickListener {
    public final /* synthetic */ InstallApksActivity b;

    public /* synthetic */ j(InstallApksActivity installApksActivity) {
        this.b = installApksActivity;
    }

    public final void onClick(View view) {
        InstallApksActivity installApksActivity = this.b;
        InstallApksActivity.a aVar = InstallApksActivity.r;
        h.e(installApksActivity, "this$0");
        installApksActivity.finish();
    }
}
