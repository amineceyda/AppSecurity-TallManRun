package g.e.b.l.j.k;

import g.e.b.l.j.f;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class d {
    public final Map<String, String> a = new HashMap();
    public final int b;
    public final int c;

    public d(int i2, int i3) {
        this.b = i2;
        this.c = i3;
    }

    public static String b(String str, int i2) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        return trim.length() > i2 ? trim.substring(0, i2) : trim;
    }

    public synchronized Map<String, String> a() {
        return Collections.unmodifiableMap(new HashMap(this.a));
    }

    public synchronized boolean c(String str, String str2) {
        boolean z;
        if (str != null) {
            String b2 = b(str, this.c);
            if (this.a.size() >= this.b) {
                if (!this.a.containsKey(b2)) {
                    f fVar = f.a;
                    fVar.f("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.b);
                    return false;
                }
            }
            String b3 = b(str2, this.c);
            String str3 = this.a.get(b2);
            if (str3 == null) {
                z = b3 == null;
            } else {
                z = str3.equals(b3);
            }
            if (z) {
                return false;
            }
            Map<String, String> map = this.a;
            if (str2 == null) {
                b3 = "";
            }
            map.put(b2, b3);
            return true;
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public synchronized void d(Map<String, String> map) {
        int i2 = 0;
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            if (str != null) {
                String b2 = b(str, this.c);
                if (this.a.size() >= this.b) {
                    if (!this.a.containsKey(b2)) {
                        i2++;
                    }
                }
                String str2 = (String) next.getValue();
                this.a.put(b2, str2 == null ? "" : b(str2, this.c));
            } else {
                throw new IllegalArgumentException("Custom attribute key must not be null.");
            }
        }
        if (i2 > 0) {
            f fVar = f.a;
            fVar.f("Ignored " + i2 + " entries when adding custom keys. Maximum allowable: " + this.b);
        }
    }
}
