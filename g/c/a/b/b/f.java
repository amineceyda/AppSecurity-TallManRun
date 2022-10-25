package g.c.a.b.b;

import android.content.DialogInterface;
import android.view.KeyEvent;

public final class f implements DialogInterface.OnKeyListener {
    public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            return false;
        }
        if (dialogInterface == null) {
            return true;
        }
        dialogInterface.dismiss();
        return true;
    }
}
