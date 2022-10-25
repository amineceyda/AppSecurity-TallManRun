package g.c.a.j.c;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceGroup;
import android.preference.PreferenceScreen;
import android.view.View;
import android.widget.ListView;
import com.apkpure.aegon.person.activity.InnerFeedBackActivity;
import g.i.c.a.a.q.c.d;
import i.l.c;
import java.util.ArrayList;
import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class h extends d implements SharedPreferences.OnSharedPreferenceChangeListener {
    @Deprecated
    public static final Logger c = LoggerFactory.getLogger("Settings|SettingsFragment");
    public final ArrayList<g> b = c.b(new f("language"), new i("privacy_policy", "https://api.pureapk.com/m/v2/page/privacy-policy.html"), new i("permissions", "https://api.pureapk.com/m/v3/page/permission.html"), new i("contributor", "https://api.pureapk.com/m/v3/page/contributor.html"), new i("open_source_licence", "https://api.pureapk.com/m/v3/page/open-source-library.html"), new d("about"), new e("developer", InnerFeedBackActivity.class));

    public final g a(String str) {
        T t;
        Iterator<T> it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (i.o.c.h.a(((g) t).a, str)) {
                break;
            }
        }
        return (g) t;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(2132017169);
        Preference findPreference = findPreference("developer");
        Preference findPreference2 = findPreference("category_one");
        if (findPreference2 instanceof PreferenceGroup) {
            ((PreferenceGroup) findPreference2).removePreference(findPreference);
        }
        for (g gVar : this.b) {
            gVar.c(getActivity(), findPreference(gVar.a));
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
        g a;
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
        i.o.c.h.e(sharedPreferences, "sharedPreferences");
        i.o.c.h.e(str, "key");
        g a = a(str);
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
