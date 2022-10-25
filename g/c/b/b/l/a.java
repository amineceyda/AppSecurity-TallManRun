package g.c.b.b.l;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.os.Build;
import g.c.b.b.f;
import i.o.c.h;

public final /* synthetic */ class a implements DialogInterface.OnClickListener {
    public final /* synthetic */ i b;

    public /* synthetic */ a(i iVar) {
        this.b = iVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        i iVar = this.b;
        h.e(iVar, "this$0");
        dialogInterface.dismiss();
        if (Build.VERSION.SDK_INT < 21 || f.P()) {
            iVar.a();
            return;
        }
        PackageInstaller packageInstaller = iVar.a.getPackageManager().getPackageInstaller();
        Activity activity = iVar.a;
        Intent intent = new Intent(activity, activity.getClass());
        intent.setAction(iVar.c);
        packageInstaller.uninstall(iVar.b, PendingIntent.getActivity(iVar.a, 2, intent, 0).getIntentSender());
    }
}
