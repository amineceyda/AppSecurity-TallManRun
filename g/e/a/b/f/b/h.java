package g.e.a.b.f.b;

import android.os.Bundle;
import java.util.EnumMap;

public final class h {
    public static final h b = new h((Boolean) null, (Boolean) null);
    public final EnumMap a;

    public h(Boolean bool, Boolean bool2) {
        EnumMap enumMap = new EnumMap(g.class);
        this.a = enumMap;
        enumMap.put(g.AD_STORAGE, bool);
        enumMap.put(g.ANALYTICS_STORAGE, bool2);
    }

    public h(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(g.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public static h a(Bundle bundle) {
        if (bundle == null) {
            return b;
        }
        EnumMap enumMap = new EnumMap(g.class);
        g[] values = g.values();
        for (int i2 = 0; i2 < 2; i2++) {
            g gVar = values[i2];
            enumMap.put(gVar, i(bundle.getString(gVar.zzd)));
        }
        return new h(enumMap);
    }

    public static h b(String str) {
        EnumMap enumMap = new EnumMap(g.class);
        if (str != null) {
            int i2 = 0;
            while (true) {
                g[] gVarArr = g.f3163d;
                if (i2 >= 2) {
                    break;
                }
                g gVar = gVarArr[i2];
                int i3 = i2 + 2;
                if (i3 < str.length()) {
                    char charAt = str.charAt(i3);
                    Boolean bool = null;
                    if (charAt != '-') {
                        if (charAt == '0') {
                            bool = Boolean.FALSE;
                        } else if (charAt == '1') {
                            bool = Boolean.TRUE;
                        }
                    }
                    enumMap.put(gVar, bool);
                }
                i2++;
            }
        }
        return new h(enumMap);
    }

    public static boolean f(int i2, int i3) {
        return i2 <= i3;
    }

    public static final int h(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    public static Boolean i(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final h c(h hVar) {
        EnumMap enumMap = new EnumMap(g.class);
        g[] values = g.values();
        for (int i2 = 0; i2 < 2; i2++) {
            g gVar = values[i2];
            Boolean bool = (Boolean) this.a.get(gVar);
            Boolean bool2 = (Boolean) hVar.a.get(gVar);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                bool = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
            }
            enumMap.put(gVar, bool);
        }
        return new h(enumMap);
    }

    public final String d() {
        StringBuilder sb = new StringBuilder("G1");
        g[] gVarArr = g.f3163d;
        for (int i2 = 0; i2 < 2; i2++) {
            Boolean bool = (Boolean) this.a.get(gVarArr[i2]);
            sb.append(bool == null ? '-' : bool.booleanValue() ? '1' : '0');
        }
        return sb.toString();
    }

    public final boolean e(g gVar) {
        Boolean bool = (Boolean) this.a.get(gVar);
        return bool == null || bool.booleanValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        g[] values = g.values();
        for (int i2 = 0; i2 < 2; i2++) {
            g gVar = values[i2];
            if (h((Boolean) this.a.get(gVar)) != h((Boolean) hVar.a.get(gVar))) {
                return false;
            }
        }
        return true;
    }

    public final boolean g(h hVar) {
        for (g gVar : (g[]) this.a.keySet().toArray(new g[0])) {
            Boolean bool = (Boolean) this.a.get(gVar);
            Boolean bool2 = (Boolean) hVar.a.get(gVar);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = 17;
        for (Boolean h2 : this.a.values()) {
            i2 = (i2 * 31) + h(h2);
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("settings: ");
        g[] values = g.values();
        for (int i2 = 0; i2 < 2; i2++) {
            g gVar = values[i2];
            if (i2 != 0) {
                sb.append(", ");
            }
            sb.append(gVar.name());
            sb.append("=");
            Boolean bool = (Boolean) this.a.get(gVar);
            sb.append((this.a.containsKey(gVar) || bool == null) ? "uninitialized" : true != bool.booleanValue() ? "denied" : "granted");
        }
        return sb.toString();
    }
}
