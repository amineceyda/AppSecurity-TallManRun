package g.c.a.e.i.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.preference.PreferenceManager;
import i.c;
import i.d;
import i.o.c.f;
import i.o.c.h;
import i.o.c.i;
import i.o.c.l;
import i.o.c.p;
import i.r.e;
import java.util.Locale;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class a {
    public static final b c = new b((f) null);

    /* renamed from: d  reason: collision with root package name */
    public static final Logger f1988d = LoggerFactory.getLogger("SettingsLog");

    /* renamed from: e  reason: collision with root package name */
    public static final c<a> f1989e = g.c.b.b.f.T(d.SYNCHRONIZED, C0062a.b);
    public Context a;
    public SharedPreferences b;

    /* renamed from: g.c.a.e.i.b.a$a  reason: collision with other inner class name */
    public static final class C0062a extends i implements i.o.b.a<a> {
        public static final C0062a b = new C0062a();

        public C0062a() {
            super(0);
        }

        public Object a() {
            return new a();
        }
    }

    public static final class b {
        public static final /* synthetic */ e<Object>[] a;

        static {
            l lVar = new l(p.a(b.class), "sharedInstance", "getSharedInstance()Lcom/apkpure/aegon/components/storage/preference/PreferenceSettings;");
            Objects.requireNonNull(p.a);
            a = new e[]{lVar};
        }

        public b() {
        }

        public b(f fVar) {
        }

        public final String a() {
            a d2 = d();
            d2.a();
            SharedPreferences sharedPreferences = d2.b;
            h.c(sharedPreferences);
            Context context = d2.a;
            h.c(context);
            return sharedPreferences.getString("download_complete_installation_type", context.getString(2131820865));
        }

        public final Integer b(String str) {
            if (d().b == null) {
                d().a();
            }
            SharedPreferences sharedPreferences = d().b;
            if (sharedPreferences == null) {
                return null;
            }
            return Integer.valueOf(sharedPreferences.getInt(str, 0));
        }

        public final Locale c() {
            try {
                return d().b();
            } catch (Throwable unused) {
                return Build.VERSION.SDK_INT >= 26 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
            }
        }

        public final a d() {
            return a.f1989e.getValue();
        }
    }

    public final void a() {
        if (this.b == null) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.a);
            this.b = defaultSharedPreferences;
            f1988d.warn("defaultSharedPreferences use exception, reset new.: {}", (Object) Integer.valueOf(defaultSharedPreferences != null ? defaultSharedPreferences.hashCode() : 0));
        }
    }

    public final Locale b() {
        String str;
        a();
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences == null || (str = sharedPreferences.getString("language", "__auto__")) == null) {
            str = "__auto__";
        }
        if (!h.a("__auto__", str)) {
            return e.e.f.b.i(str);
        }
        try {
            Context context = this.a;
            PackageManager packageManager = context == null ? null : context.getPackageManager();
            Resources resourcesForApplication = packageManager == null ? null : packageManager.getResourcesForApplication("android");
            if (resourcesForApplication == null) {
                return null;
            }
            Configuration configuration = resourcesForApplication.getConfiguration();
            if (configuration == null) {
                return null;
            }
            return configuration.locale;
        } catch (Exception unused) {
            Objects.requireNonNull(c);
            return Build.VERSION.SDK_INT >= 26 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
        }
    }
}
