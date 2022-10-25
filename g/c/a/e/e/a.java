package g.c.a.e.e;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class a {
    public static final Logger a = LoggerFactory.getLogger("LoggerRoute");

    public static void a(String str, String str2) {
        a.debug("tag: {}, msg: {}", (Object) str, (Object) str2);
    }

    public static void b(String str, String str2) {
        a.info("tag: {}, msg: {}", (Object) str, (Object) str2);
    }
}
