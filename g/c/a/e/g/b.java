package g.c.a.e.g;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

public final class b implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context b;

    public b(Context context) {
        this.b = context;
    }

    public void onClick(DialogInterface dialogInterface, int i2) {
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", this.b.getPackageName(), (String) null));
        if (intent.resolveActivity(this.b.getPackageManager()) != null) {
            this.b.startActivity(intent);
        }
    }
}
