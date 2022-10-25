package g.i.c.a.a.b0;

import android.text.TextUtils;
import g.a.a.a.a;
import g.c.b.b.f;

public class m extends h {
    public String b;

    public m(String str, String str2) {
        super(str);
        this.b = str2;
    }

    public String a() {
        String str;
        String str2 = this.b;
        Class<String> cls = String.class;
        try {
            Class<?> cls2 = Class.forName("android.os.SystemProperties");
            str = (String) cls2.getMethod("get", new Class[]{cls, cls}).invoke(cls2, new Object[]{str2, null});
        } catch (Exception e2) {
            f.x("SystemUtils", "getSystemProperty " + e2);
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return !TextUtils.isEmpty(this.a) ? a.g(new StringBuilder(), this.a, " ", str) : str;
    }
}
