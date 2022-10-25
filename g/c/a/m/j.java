package g.c.a.m;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class j {
    public static final Logger a = LoggerFactory.getLogger("LoggerRoute");

    public static void a(String str, String str2) {
        a.debug("tag: {}, msg: {}", (Object) str, (Object) str2);
    }
}
