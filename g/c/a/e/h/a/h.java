package g.c.a.e.h.a;

import android.content.SharedPreferences;
import android.text.TextUtils;
import g.a.a.a.a;
import g.c.a.e.i.b.a;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class h {

    /* renamed from: d  reason: collision with root package name */
    public static final Logger f1985d = LoggerFactory.getLogger("QimeiManagerLog");

    /* renamed from: e  reason: collision with root package name */
    public static volatile h f1986e = null;
    public String a = null;
    public String b = null;
    public String c = "";

    public static h a() {
        if (f1986e == null) {
            synchronized (h.class) {
                if (f1986e == null) {
                    f1986e = new h();
                }
            }
        }
        return f1986e;
    }

    public String b() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        this.a = d("key_qimei_cache");
        StringBuilder i2 = a.i("getQimei from setting:");
        i2.append(this.a);
        g.c.a.e.e.a.a("QimeiManager", i2.toString());
        return this.a;
    }

    public String c() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        this.b = d("key_qimei_36_cache");
        StringBuilder i2 = a.i("getQimei36 from setting:");
        i2.append(this.b);
        g.c.a.e.e.a.a("QimeiManager", i2.toString());
        return this.b;
    }

    public final String d(String str) {
        a.b bVar = g.c.a.e.i.b.a.c;
        if (bVar.d().b == null) {
            bVar.d().a();
        }
        SharedPreferences sharedPreferences = bVar.d().b;
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.getString(str, "");
    }

    public final String e(String str, String str2, String str3) {
        SharedPreferences.Editor editor;
        if (TextUtils.isEmpty(str3) || (!TextUtils.isEmpty(str2) && str2.equals(str3))) {
            return str2;
        }
        g.c.a.e.e.a.a("QimeiManager", "save qimei to setting:" + str + " from " + str2 + " to " + str3);
        a.b bVar = g.c.a.e.i.b.a.c;
        if (bVar.d().b == null) {
            bVar.d().a();
        }
        SharedPreferences sharedPreferences = bVar.d().b;
        if (sharedPreferences == null) {
            editor = null;
        } else {
            editor = sharedPreferences.edit();
        }
        if (editor != null) {
            editor.putString(str, str3);
        }
        if (editor != null) {
            editor.apply();
        }
        return str3;
    }
}
