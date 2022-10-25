package g.c.a.m;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import com.apkpure.aegon.main.activity.SplashActivity;
import e.e.f.b;
import g.c.a.e.c.d;
import g.c.a.e.c.e;
import java.util.Locale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class l implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: e  reason: collision with root package name */
    public static final Logger f2090e = LoggerFactory.getLogger("SettingsLog");

    /* renamed from: f  reason: collision with root package name */
    public static volatile l f2091f;
    public Context b;
    public SharedPreferences c;

    /* renamed from: d  reason: collision with root package name */
    public e f2092d;

    public class a implements d {
        public a() {
        }

        public void a(Context context) {
            int a2 = g.c.a.e.f.b.a.a(context);
            String str = g.c.a.e.f.b.a.a;
            if (a2 == 1 || a2 == 2) {
                g.c.a.b.d.a.a(context, "download_rate_limit");
                g.c.a.b.d.a.a(context, "upload_rate_limit");
            }
        }
    }

    public l() {
    }

    public l(Context context) {
        this.b = context;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        this.c = defaultSharedPreferences;
        f2090e.info("defaultSharedPreferences init success.{}", (Object) Integer.valueOf(defaultSharedPreferences.hashCode()));
        PreferenceManager.setDefaultValues(context, 2132017169, false);
        this.c.registerOnSharedPreferenceChangeListener(this);
        e eVar = new e(context, new a());
        this.f2092d = eVar;
        eVar.a();
    }

    public static Locale b() {
        try {
            return f2091f.a();
        } catch (Throwable unused) {
            return Build.VERSION.SDK_INT >= 26 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
        }
    }

    public static void c(Context context, boolean z) {
        try {
            Intent intent = new Intent(context, SplashActivity.class);
            intent.setFlags(268468224);
            context.startActivity(intent);
            if (z) {
                System.exit(0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final Locale a() {
        if (this.c == null) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.b);
            this.c = defaultSharedPreferences;
            f2090e.warn("defaultSharedPreferences use exception, reset new.: {}", (Object) Integer.valueOf(defaultSharedPreferences.hashCode()));
            this.c.registerOnSharedPreferenceChangeListener(this);
        }
        String string = this.c.getString("language", "__auto__");
        if (!"__auto__".equals(string)) {
            return b.i(string);
        }
        try {
            return this.b.getPackageManager().getResourcesForApplication("android").getConfiguration().locale;
        } catch (Exception unused) {
            return Build.VERSION.SDK_INT >= 26 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
        }
    }

    public void finalize() {
        e eVar = this.f2092d;
        if (eVar.c) {
            eVar.a.unregisterReceiver(eVar);
            eVar.c = false;
        }
        this.c.unregisterOnSharedPreferenceChangeListener(this);
        try {
            super.finalize();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        f2090e.debug("onSharedPreferenceChanged: {}, key: {}", (Object) Integer.valueOf(sharedPreferences.hashCode()), (Object) str);
        g.c.a.b.d.a.a(this.b, str);
    }
}
