package g.i.b.e.f.c.a;

import g.i.b.e.c;
import g.i.b.e.f.j;
import g.i.b.e.h.e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class b {
    public static volatile b b;
    public Map<String, String> a = new a();

    public class a extends LinkedHashMap<String, String> {
        public a() {
            super(8, 1.0f, true);
        }

        public final boolean removeEldestEntry(Map.Entry<String, String> entry) {
            return size() > 8;
        }
    }

    public b() {
        c(j.f(e(), "", true), false);
    }

    public static b a() {
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = new b();
                }
            }
        }
        return b;
    }

    public static String e() {
        return "HalleyOperInfo_" + c.f4126h;
    }

    public final void b(String str, String str2) {
        if (!e.e(str) && !"unknown".equals(str) && !e.e(str2) && !"unknown".equals(str2)) {
            synchronized (this.a) {
                if (!str2.equals(this.a.get(str))) {
                    this.a.put(str, str2);
                    j.e(e(), d(), true);
                }
            }
        }
    }

    public final void c(String str, boolean z) {
        try {
            if (!e.e(str)) {
                synchronized (this.a) {
                    this.a.clear();
                    String[] split = str.split("h;l");
                    if (split != null) {
                        for (String split2 : split) {
                            String[] split3 = split2.split("h,l");
                            if (split3.length == 2) {
                                this.a.put(split3[0], split3[1]);
                            }
                        }
                    }
                }
                if (z) {
                    j.e(e(), str, true);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        synchronized (this.a) {
            ArrayList arrayList = new ArrayList(this.a.keySet());
            ArrayList arrayList2 = new ArrayList(this.a.values());
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                sb.append((String) arrayList.get(i2));
                sb.append("h,l");
                sb.append((String) arrayList2.get(i2));
                sb.append("h;l");
            }
        }
        return sb.toString();
    }
}
