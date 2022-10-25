package g.c.a.j.b;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceScreen;
import android.view.View;
import android.widget.ListView;
import g.i.c.a.a.q.c.d;
import i.l.c;
import i.o.c.h;
import java.util.ArrayList;
import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class b extends d implements SharedPreferences.OnSharedPreferenceChangeListener {
    @Deprecated
    public static final Logger c = LoggerFactory.getLogger("Developer|DeveloperFragment");
    public final ArrayList<c> b = c.b(new g("developer_share_log"), new e("developer_host", 1, 0, 0, false, false, 60), new e("developer_log_level", 0, 0, 2, false, false, 54), new h("developer_install"), new h("developer_load_crab"), new h("developer_roll_back"), new h("developer_restart_process"), new h("developer_fetch_crab_version"), new h("developer_version_show"), new d("developer_download_path"));

    public final c a(String str) {
        T t;
        Iterator<T> it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (h.a(((c) t).a, str)) {
                break;
            }
        }
        return (c) t;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(2132017166);
        Preference findPreference = findPreference("developer_debug");
        Preference findPreference2 = findPreference("developer_beta");
        getPreferenceScreen().removePreference(findPreference);
        getPreferenceScreen().removePreference(findPreference2);
        for (c cVar : this.b) {
            cVar.c(getActivity(), findPreference(cVar.a));
        }
    }

    public void onPause() {
        super.onPause();
        SharedPreferences sharedPreferences = getPreferenceManager().getSharedPreferences();
        if (sharedPreferences != null) {
            sharedPreferences.unregisterOnSharedPreferenceChangeListener(this);
        }
    }

    public boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) {
        String key;
        c a;
        Boolean bool = null;
        if (!(preference == null || (key = preference.getKey()) == null || (a = a(key)) == null)) {
            bool = Boolean.valueOf(a.a(preference));
        }
        return bool == null ? super.onPreferenceTreeClick(preferenceScreen, preference) : bool.booleanValue();
    }

    public void onResume() {
        super.onResume();
        SharedPreferences sharedPreferences = getPreferenceManager().getSharedPreferences();
        if (sharedPreferences != null) {
            sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        }
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        h.e(sharedPreferences, "sharedPreferences");
        h.e(str, "key");
        c a = a(str);
        if (a != null) {
            a.b(findPreference(str), sharedPreferences, str);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ListView listView = view == null ? null : (ListView) view.findViewById(16908298);
        if (listView != null) {
            listView.setDivider((Drawable) null);
        }
    }
}
