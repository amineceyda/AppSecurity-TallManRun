package g.b.a.a;

import g.a.a.a.a;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class c {
    public static Logger a = LoggerFactory.getLogger("LogUtil");

    public static String a(String str, String str2, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return "[" + str + "]-" + str2;
        }
        StringBuilder n = a.n("[", str, "]-");
        n.append(String.format(str2, objArr));
        return n.toString();
    }
}
