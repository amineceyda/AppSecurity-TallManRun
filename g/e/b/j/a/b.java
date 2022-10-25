package g.e.b.j.a;

import g.e.b.j.a.a;
import g.e.b.j.a.c.d;
import g.e.b.j.a.c.f;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public class b implements a {
    public static volatile a c;
    public final g.e.a.b.f.a.a a;
    public final Map b = new ConcurrentHashMap();

    public class a implements a.C0111a {
        public a(b bVar, String str) {
        }
    }

    public b(g.e.a.b.f.a.a aVar) {
        Objects.requireNonNull(aVar, "null reference");
        this.a = aVar;
    }

    public a.C0111a a(String str, a.b bVar) {
        Objects.requireNonNull(bVar, "null reference");
        if (!g.e.b.j.a.c.b.a(str)) {
            return null;
        }
        if (!str.isEmpty() && this.b.containsKey(str) && this.b.get(str) != null) {
            return null;
        }
        g.e.a.b.f.a.a aVar = this.a;
        Object dVar = "fiam".equals(str) ? new d(aVar, bVar) : ("crash".equals(str) || "clx".equals(str)) ? new f(aVar, bVar) : null;
        if (dVar == null) {
            return null;
        }
        this.b.put(str, dVar);
        return new a(this, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ad A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(java.lang.String r6, java.lang.String r7, android.os.Bundle r8) {
        /*
            r5 = this;
            if (r8 != 0) goto L_0x0007
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
        L_0x0007:
            boolean r0 = g.e.b.j.a.c.b.a(r6)
            if (r0 != 0) goto L_0x000e
            return
        L_0x000e:
            java.util.List r0 = g.e.b.j.a.c.b.b
            boolean r0 = r0.contains(r7)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0019
            goto L_0x0031
        L_0x0019:
            java.util.List r0 = g.e.b.j.a.c.b.f3453d
            java.util.Iterator r0 = r0.iterator()
        L_0x001f:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0033
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r8.containsKey(r3)
            if (r3 == 0) goto L_0x001f
        L_0x0031:
            r0 = 0
            goto L_0x0034
        L_0x0033:
            r0 = 1
        L_0x0034:
            if (r0 != 0) goto L_0x0037
            return
        L_0x0037:
            java.lang.String r0 = "_cmp"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x0041
            goto L_0x00aa
        L_0x0041:
            boolean r0 = g.e.b.j.a.c.b.a(r6)
            if (r0 != 0) goto L_0x0049
            goto L_0x00ab
        L_0x0049:
            java.util.List r0 = g.e.b.j.a.c.b.f3453d
            java.util.Iterator r0 = r0.iterator()
        L_0x004f:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0062
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r8.containsKey(r3)
            if (r3 == 0) goto L_0x004f
            goto L_0x00ab
        L_0x0062:
            int r0 = r6.hashCode()
            r3 = 101200(0x18b50, float:1.41811E-40)
            r4 = 2
            if (r0 == r3) goto L_0x008b
            r3 = 101230(0x18b6e, float:1.41853E-40)
            if (r0 == r3) goto L_0x0081
            r3 = 3142703(0x2ff42f, float:4.403865E-39)
            if (r0 == r3) goto L_0x0077
            goto L_0x0095
        L_0x0077:
            java.lang.String r0 = "fiam"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0095
            r0 = 2
            goto L_0x0096
        L_0x0081:
            java.lang.String r0 = "fdl"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0095
            r0 = 1
            goto L_0x0096
        L_0x008b:
            java.lang.String r0 = "fcm"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0095
            r0 = 0
            goto L_0x0096
        L_0x0095:
            r0 = -1
        L_0x0096:
            if (r0 == 0) goto L_0x00a3
            if (r0 == r2) goto L_0x00a0
            if (r0 == r4) goto L_0x009d
            goto L_0x00ab
        L_0x009d:
            java.lang.String r0 = "fiam_integration"
            goto L_0x00a5
        L_0x00a0:
            java.lang.String r0 = "fdl_integration"
            goto L_0x00a5
        L_0x00a3:
            java.lang.String r0 = "fcm_integration"
        L_0x00a5:
            java.lang.String r1 = "_cis"
            r8.putString(r1, r0)
        L_0x00aa:
            r1 = 1
        L_0x00ab:
            if (r1 != 0) goto L_0x00ae
            return
        L_0x00ae:
            java.lang.String r0 = "clx"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x00c5
            java.lang.String r0 = "_ae"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x00c5
            r0 = 1
            java.lang.String r2 = "_r"
            r8.putLong(r2, r0)
        L_0x00c5:
            g.e.a.b.f.a.a r0 = r5.a
            g.e.a.b.e.c.m2 r0 = r0.a
            r0.d(r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.b.j.a.b.b(java.lang.String, java.lang.String, android.os.Bundle):void");
    }
}
