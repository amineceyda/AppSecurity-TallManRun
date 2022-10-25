package g.c.a.j.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.preference.ListPreference;
import android.preference.Preference;
import android.util.DisplayMetrics;
import com.apkpure.aegon.application.RealApplicationLike;
import com.apkpure.components.clientchannel.channel.headers.UserInfo;
import e.e.f.b;
import g.c.a.m.l;
import i.o.c.h;
import java.util.Locale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class f extends g {
    @Deprecated
    public static final Logger c = LoggerFactory.getLogger("Settings|LanguagePreferenceHandle");

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(String str) {
        super(str);
        h.e(str, "key");
    }

    public void b(Preference preference, SharedPreferences sharedPreferences, String str) {
        d(preference, true);
    }

    public void c(Context context, Preference preference) {
        this.b = context;
        d(preference, false);
    }

    public final void d(Preference preference, boolean z) {
        Logger logger;
        String str;
        if (!(preference instanceof ListPreference)) {
            logger = c;
            str = "Update app language,preference is not ListPreference.";
        } else {
            ListPreference listPreference = (ListPreference) preference;
            CharSequence entry = listPreference.getEntry();
            if (entry == null) {
                entry = "__auto__";
            }
            listPreference.setSummary(entry);
            logger = c;
            logger.info(h.j("Update app language to ", entry));
            if (this.b == null) {
                str = "Update app language,preference context is null.";
            } else {
                Locale b = l.b();
                Resources resources = this.b.getResources();
                if (resources != null) {
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    Configuration configuration = resources.getConfiguration();
                    if (Build.VERSION.SDK_INT >= 24) {
                        configuration.setLocale(b);
                    } else {
                        configuration.locale = b;
                    }
                    resources.updateConfiguration(configuration, displayMetrics);
                }
                String A = b.A(b);
                UserInfo userInfo = RealApplicationLike.getChannelConfig().m().getUserInfo();
                if (A == null) {
                    A = "";
                }
                userInfo.setLanguage(A);
                if (z) {
                    l.c(this.b, false);
                    return;
                }
                return;
            }
        }
        logger.info(str);
    }
}
