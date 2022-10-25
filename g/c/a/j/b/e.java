package g.c.a.j.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.ListPreference;
import android.preference.Preference;
import g.c.a.m.l;
import i.o.c.h;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class e extends c {
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public static final Logger f2034f = LoggerFactory.getLogger("Developer|DeveloperPreferenceHandle");
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f2035d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f2036e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(String str, int i2, int i3, int i4, boolean z, boolean z2, int i5) {
        super(str);
        i4 = (i5 & 8) != 0 ? 0 : i4;
        z = (i5 & 16) != 0 ? true : z;
        z2 = (i5 & 32) != 0 ? false : z2;
        h.e(str, "key");
        this.c = i4;
        this.f2035d = z;
        this.f2036e = z2;
    }

    public void b(Preference preference, SharedPreferences sharedPreferences, String str) {
        d(preference);
        if (this.f2035d) {
            l.c(this.b, this.f2036e);
        }
    }

    public void c(Context context, Preference preference) {
        this.b = context;
        if (!(preference instanceof ListPreference)) {
            f2034f.info("Init value preference is not ListPreference.");
            return;
        }
        ListPreference listPreference = (ListPreference) preference;
        String value = listPreference.getValue();
        if (value == null || value.length() == 0) {
            listPreference.setValue(listPreference.getEntryValues()[this.c].toString());
        }
        d(preference);
    }

    public final void d(Preference preference) {
        if (preference instanceof ListPreference) {
            ListPreference listPreference = (ListPreference) preference;
            CharSequence entry = listPreference.getEntry();
            if (entry == null) {
                entry = "";
            }
            listPreference.setSummary(entry);
        }
    }
}
