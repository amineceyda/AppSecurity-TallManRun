package g.c.a.l.n;

import android.content.DialogInterface;
import android.view.KeyEvent;
import g.c.a.l.d;

public final class l implements DialogInterface.OnKeyListener {
    public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            return false;
        }
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        d.a.m();
        return true;
    }
}
