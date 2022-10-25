package g.e.a.b.e.c;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.helpers.MessageFormatter;

public final class b {
    public String a;
    public final long b;
    public final Map c;

    public b(String str, long j2, Map map) {
        this.a = str;
        this.b = j2;
        HashMap hashMap = new HashMap();
        this.c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    /* renamed from: a */
    public final b clone() {
        return new b(this.a, this.b, new HashMap(this.c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.b == bVar.b && this.a.equals(bVar.a)) {
            return this.c.equals(bVar.c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        long j2 = this.b;
        return this.c.hashCode() + (((hashCode * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.a;
        long j2 = this.b;
        String obj = this.c.toString();
        StringBuilder sb = new StringBuilder(obj.length() + String.valueOf(str).length() + 55);
        sb.append("Event{name='");
        sb.append(str);
        sb.append("', timestamp=");
        sb.append(j2);
        sb.append(", params=");
        sb.append(obj);
        sb.append(MessageFormatter.DELIM_STOP);
        return sb.toString();
    }
}
