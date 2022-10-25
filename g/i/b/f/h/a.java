package g.i.b.f.h;

import android.content.Context;
import android.net.ConnectivityManager;
import g.i.b.e.c;

public class a {
    public static volatile a b;
    public Context a;

    public a(Context context) {
        this.a = context;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public static a a() {
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a(c.f4125g);
                }
            }
        }
        return b;
    }
}
