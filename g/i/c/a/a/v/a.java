package g.i.c.a.a.v;

import android.app.Activity;
import android.content.DialogInterface;

public final class a implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity b;

    public a(Activity activity) {
        this.b = activity;
    }

    public void onClick(DialogInterface dialogInterface, int i2) {
        this.b.finish();
    }
}
