package g.c.b.b.k;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import com.apkpure.components.installer.ui.InstallApksActivity;
import g.c.b.b.i.e.k;
import g.c.b.b.j.a;
import i.o.c.h;

public final /* synthetic */ class e implements View.OnClickListener {
    public final /* synthetic */ InstallApksActivity b;
    public final /* synthetic */ Button c;

    public /* synthetic */ e(InstallApksActivity installApksActivity, Button button) {
        this.b = installApksActivity;
        this.c = button;
    }

    public final void onClick(View view) {
        InstallApksActivity installApksActivity = this.b;
        Button button = this.c;
        InstallApksActivity.a aVar = InstallApksActivity.r;
        h.e(installApksActivity, "this$0");
        h.e(button, "$this_apply");
        if (installApksActivity.f335d != null) {
            Context context = button.getContext();
            h.d(context, "context");
            a aVar2 = installApksActivity.f335d;
            if (aVar2 != null) {
                String str = aVar2.a;
                if (str != null) {
                    h.e(context, "context");
                    h.e(str, "packageName");
                    h.e(context, "context");
                    h.e(str, "packageName");
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = null;
                    } else {
                        launchIntentForPackage.addFlags(268435456);
                    }
                    if (launchIntentForPackage != null) {
                        try {
                            context.startActivity(launchIntentForPackage);
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                    k kVar = installApksActivity.c;
                    if (kVar != null) {
                        a aVar3 = installApksActivity.f335d;
                        if (aVar3 != null) {
                            h.e(aVar3, "installTask");
                            kVar.a().post(new g.c.b.b.i.e.h(kVar));
                        } else {
                            h.k("mInstallTask");
                            throw null;
                        }
                    }
                    installApksActivity.finish();
                    return;
                }
                return;
            }
            h.k("mInstallTask");
            throw null;
        }
    }
}
