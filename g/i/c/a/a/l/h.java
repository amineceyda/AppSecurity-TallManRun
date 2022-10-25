package g.i.c.a.a.l;

import java.util.Collections;
import java.util.Map;

public class h {
    public String a;
    public Map<String, ?> b;

    public String a() {
        return this.a;
    }

    public Map<String, Object> b() {
        Map<String, ?> map = this.b;
        if (map == null) {
            return null;
        }
        return Collections.unmodifiableMap(map);
    }
}
