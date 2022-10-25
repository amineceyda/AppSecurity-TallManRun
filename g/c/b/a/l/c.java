package g.c.b.a.l;

import android.util.Log;
import g.c.b.a.j.g;
import i.o.c.h;

public final class c implements g {
    public static final c a = new c();
    public static g b;
    public static boolean c;

    public void d(String str, String str2) {
        h.e(str, "tag");
        h.e(str2, "message");
        g gVar = b;
        if (gVar == null) {
            Log.d(h.j("ClientChannel|", str), str2);
        } else if (gVar != null) {
            gVar.d(h.j("ClientChannel|", str), str2);
        }
    }

    public void e(String str, String str2) {
        h.e(str, "tag");
        h.e(str2, "message");
        g gVar = b;
        String j2 = h.j("ClientChannel|", str);
        if (gVar != null) {
            gVar.e(j2, str2);
        } else {
            Log.e(j2, str2);
        }
    }

    public void i(String str, String str2) {
        h.e(str, "tag");
        h.e(str2, "message");
        g gVar = b;
        String j2 = h.j("ClientChannel|", str);
        if (gVar != null) {
            gVar.i(j2, str2);
        } else {
            Log.i(j2, str2);
        }
    }
}
