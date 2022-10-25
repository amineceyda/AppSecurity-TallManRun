package g.c.a.j.b;

import android.content.Context;
import android.preference.Preference;
import g.c.a.e.k.e.a;
import i.o.c.h;

public final class d extends c {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(String str) {
        super(str);
        h.e(str, "key");
    }

    public boolean a(Preference preference) {
        h.e(preference, "preference");
        return false;
    }

    public void c(Context context, Preference preference) {
        this.b = context;
        if (preference != null) {
            preference.setSummary(a.a().getAbsolutePath());
        }
    }
}
