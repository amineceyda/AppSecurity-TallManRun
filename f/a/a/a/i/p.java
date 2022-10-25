package f.a.a.a.i;

import f.a.a.a.l.c;
import java.util.Map;

public class p extends e {

    /* renamed from: g  reason: collision with root package name */
    public String f1645g;

    /* renamed from: h  reason: collision with root package name */
    public String f1646h = "";

    public String h(Object obj) {
        Map<String, String> d2 = ((c) obj).d();
        if (d2 != null) {
            String str = this.f1645g;
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                boolean z = true;
                for (Map.Entry next : d2.entrySet()) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append((String) next.getKey());
                    sb.append('=');
                    sb.append((String) next.getValue());
                }
                return sb.toString();
            }
            String str2 = d2.get(str);
            if (str2 != null) {
                return str2;
            }
        }
        return this.f1646h;
    }

    public void start() {
        String m2 = m();
        String[] strArr = new String[2];
        if (m2 != null) {
            strArr[0] = m2;
            int indexOf = m2.indexOf(":-");
            if (indexOf != -1) {
                strArr[0] = m2.substring(0, indexOf);
                strArr[1] = m2.substring(indexOf + 2);
            }
        }
        this.f1645g = strArr[0];
        if (strArr[1] != null) {
            this.f1646h = strArr[1];
        }
        this.f1760f = true;
    }

    public void stop() {
        this.f1645g = null;
        this.f1760f = false;
    }
}
