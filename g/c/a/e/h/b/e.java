package g.c.a.e.h.b;

import g.c.a.m.j;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class e {
    public static final Logger a = LoggerFactory.getLogger("DTReportUtils");

    public static String a(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        try {
            return URLEncoder.encode(str, StandardCharsets.UTF_8.name());
        } catch (Exception e2) {
            j.a.error("tag: {}, msg: {}", (Object) "TextUtil", (Object) "encodeStr: " + e2);
            return str;
        }
    }
}
