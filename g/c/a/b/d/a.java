package g.c.a.b.d;

import android.content.Context;
import android.content.Intent;

public class a {
    public static final String a = (a.class.getPackage().getName() + ".SETTING_CHANGED");

    public static void a(Context context, String str) {
        Intent intent = new Intent(a);
        intent.putExtra("key", str);
        e.m.a.a.a(context).b(intent);
    }
}
