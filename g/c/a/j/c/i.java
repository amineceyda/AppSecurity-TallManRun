package g.c.a.j.c;

import android.content.Context;
import android.preference.Preference;
import g.c.a.g.d.a;
import i.o.c.h;

public final class i extends g {
    public final String c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(String str, String str2) {
        super(str);
        h.e(str, "key");
        this.c = str2;
    }

    public boolean a(Preference preference) {
        h.e(preference, "preference");
        Context context = this.b;
        if (context == null) {
            return false;
        }
        a.d(context, this.c);
        return false;
    }
}
