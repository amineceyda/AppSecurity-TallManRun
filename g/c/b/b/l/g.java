package g.c.b.b.l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

@SuppressLint({"ApplySharedPref"})
public final class g {
    public static final e.d.g<String, g> b = new e.d.g<>();
    public SharedPreferences a;

    public g(Context context, String str, int i2) {
        this.a = context.getSharedPreferences(str, i2);
    }

    public static g a(Context context) {
        return b(context, "", 0);
    }

    public static g b(Context context, String str, int i2) {
        boolean z = false;
        if (str != null) {
            int length = str.length();
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                } else if (!Character.isWhitespace(str.charAt(i3))) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        z = true;
        if (z) {
            str = "spUtils";
        }
        e.d.g<String, g> gVar = b;
        g gVar2 = gVar.get(str);
        if (gVar2 != null) {
            return gVar2;
        }
        g gVar3 = new g(context, str, i2);
        gVar.put(str, gVar3);
        return gVar3;
    }
}
