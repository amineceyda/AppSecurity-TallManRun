package g.i.c.a.a.x.d;

import android.content.Context;
import android.content.SharedPreferences;
import e.e.c.b;
import g.i.c.a.a.x.b.a;
import java.util.Objects;

public class h {
    public a a = a.b();
    public g.i.c.a.a.x.e.a b = new g.i.c.a.a.x.e.a();
    public Context c;

    public h(Context context) {
        this.c = context;
    }

    public final String a(String str, String str2) {
        return b(this.c).getString(str, (String) null);
    }

    public final SharedPreferences b(Context context) {
        return context.getSharedPreferences("datong_storage", 0);
    }

    public final void c(String str, String str2) {
        SharedPreferences.Editor edit = b(this.c).edit();
        edit.putString(str, str2);
        Objects.requireNonNull(b.b().a);
        try {
            edit.apply();
        } catch (AbstractMethodError unused) {
            edit.commit();
        }
    }
}
