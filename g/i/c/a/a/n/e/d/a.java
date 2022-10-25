package g.i.c.a.a.n.e.d;

import android.text.TextUtils;
import java.util.Map;

public abstract class a implements o {
    public void a(Map<String, Object> map, Map<String, Object> map2) {
        Object c;
        if ((map2 instanceof Map) && map2.containsKey("lvtm") && (c = c(map2, "lvtm")) != null) {
            map.put("dt_lvtm", c);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r3 = c(r10, "pgid");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(java.util.Map<java.lang.String, java.lang.Object> r9, java.util.Map r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof java.util.Map
            if (r0 == 0) goto L_0x0074
            boolean r1 = r9 instanceof java.util.Map
            if (r1 == 0) goto L_0x0074
            java.lang.String r1 = "pgid"
            r2 = 0
            if (r0 != 0) goto L_0x000e
            goto L_0x0014
        L_0x000e:
            java.lang.Object r3 = r8.c(r10, r1)
            if (r3 != 0) goto L_0x0016
        L_0x0014:
            r3 = r2
            goto L_0x001a
        L_0x0016:
            java.lang.String r3 = r3.toString()
        L_0x001a:
            java.lang.String r4 = "pg_contentid"
            if (r0 != 0) goto L_0x001f
            goto L_0x0025
        L_0x001f:
            java.lang.Object r5 = r8.c(r10, r4)
            if (r5 != 0) goto L_0x0027
        L_0x0025:
            r5 = r2
            goto L_0x002b
        L_0x0027:
            java.lang.String r5 = r5.toString()
        L_0x002b:
            java.lang.String r1 = r8.d(r10, r1)
            java.lang.String r4 = r8.d(r10, r4)
            if (r0 == 0) goto L_0x0049
            java.lang.String r6 = "pg_stp"
            boolean r7 = r10.containsKey(r6)
            if (r7 == 0) goto L_0x0049
            java.lang.Object r6 = r8.c(r10, r6)
            if (r6 != 0) goto L_0x0044
            goto L_0x0049
        L_0x0044:
            java.lang.String r6 = r6.toString()
            goto L_0x004a
        L_0x0049:
            r6 = r2
        L_0x004a:
            java.lang.String r7 = "dt_pgid"
            r8.e(r9, r7, r3)
            java.lang.String r3 = "dt_pg_contentid"
            r8.e(r9, r3, r5)
            java.lang.String r3 = "dt_ref_pgid"
            r8.e(r9, r3, r1)
            java.lang.String r1 = "dt_refpg_contentid"
            r8.e(r9, r1, r4)
            java.lang.String r1 = "dt_pgstp"
            r8.e(r9, r1, r6)
            if (r0 != 0) goto L_0x0066
            goto L_0x006c
        L_0x0066:
            java.lang.String r0 = "is_interactive_flag"
            java.lang.Object r2 = r10.remove(r0)
        L_0x006c:
            java.lang.String r0 = "dt_is_interactive_flag"
            r8.e(r10, r0, r2)
            r8.e(r9, r0, r2)
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.c.a.a.n.e.d.a.b(java.util.Map, java.util.Map):void");
    }

    public Object c(Map<?, ?> map, String str) {
        return map.get(str);
    }

    public final String d(Map<?, ?> map, String str) {
        Object c;
        if ((map instanceof Map) && map.containsKey("ref_pg")) {
            Object obj = map.get("ref_pg");
            if (obj instanceof Map) {
                Map map2 = (Map) obj;
                if (map2.containsKey(str) && (c = c(map2, str)) != null) {
                    return c.toString();
                }
            }
        }
        return null;
    }

    public final void e(Map<String, Object> map, String str, Object obj) {
        if (obj != null) {
            if (!(obj instanceof String) || !TextUtils.isEmpty((String) obj)) {
                map.put(str, obj);
            }
        }
    }
}
