package g.c.a.j.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.Preference;
import i.o.c.h;

public abstract class c {
    public final String a;
    public Context b;

    public c(String str) {
        h.e(str, "key");
        this.a = str;
    }

    public boolean a(Preference preference) {
        h.e(preference, "preference");
        return false;
    }

    public void b(Preference preference, SharedPreferences sharedPreferences, String str) {
    }

    public void c(Context context, Preference preference) {
        this.b = context;
    }
}
