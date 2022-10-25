package g.e.a.b.e.c;

import java.util.Collections;
import java.util.List;

public final class a8 extends c8 {
    public static final Class c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public final void a(Object obj, long j2) {
        Object obj2;
        List list = (List) v9.j(obj, j2);
        if (list instanceof z7) {
            obj2 = ((z7) list).b();
        } else if (!c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof u8) || !(list instanceof u7)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                u7 u7Var = (u7) list;
                if (u7Var.k()) {
                    u7Var.j();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        v9.f3057d.p(obj, j2, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: g.e.a.b.e.c.y7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: g.e.a.b.e.c.y7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: g.e.a.b.e.c.y7} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.lang.Object r5, java.lang.Object r6, long r7) {
        /*
            r4 = this;
            java.lang.Object r6 = g.e.a.b.e.c.v9.j(r6, r7)
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            java.lang.Object r1 = g.e.a.b.e.c.v9.j(r5, r7)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0036
            boolean r2 = r1 instanceof g.e.a.b.e.c.z7
            if (r2 == 0) goto L_0x0020
            g.e.a.b.e.c.y7 r1 = new g.e.a.b.e.c.y7
            r1.<init>((int) r0)
            goto L_0x0069
        L_0x0020:
            boolean r2 = r1 instanceof g.e.a.b.e.c.u8
            if (r2 == 0) goto L_0x0030
            boolean r2 = r1 instanceof g.e.a.b.e.c.u7
            if (r2 == 0) goto L_0x0030
            g.e.a.b.e.c.u7 r1 = (g.e.a.b.e.c.u7) r1
            g.e.a.b.e.c.u7 r0 = r1.o(r0)
        L_0x002e:
            r1 = r0
            goto L_0x0069
        L_0x0030:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            goto L_0x0069
        L_0x0036:
            java.lang.Class r2 = c
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L_0x0051
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
        L_0x004f:
            r1 = r2
            goto L_0x0069
        L_0x0051:
            boolean r2 = r1 instanceof g.e.a.b.e.c.q9
            if (r2 == 0) goto L_0x006f
            g.e.a.b.e.c.y7 r2 = new g.e.a.b.e.c.y7
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>((int) r3)
            g.e.a.b.e.c.q9 r1 = (g.e.a.b.e.c.q9) r1
            int r0 = r2.size()
            r2.addAll(r0, r1)
            goto L_0x004f
        L_0x0069:
            g.e.a.b.e.c.u9 r0 = g.e.a.b.e.c.v9.f3057d
            r0.p(r5, r7, r1)
            goto L_0x008a
        L_0x006f:
            boolean r2 = r1 instanceof g.e.a.b.e.c.u8
            if (r2 == 0) goto L_0x008a
            boolean r2 = r1 instanceof g.e.a.b.e.c.u7
            if (r2 == 0) goto L_0x008a
            r2 = r1
            g.e.a.b.e.c.u7 r2 = (g.e.a.b.e.c.u7) r2
            boolean r3 = r2.k()
            if (r3 != 0) goto L_0x008a
            int r1 = r1.size()
            int r1 = r1 + r0
            g.e.a.b.e.c.u7 r0 = r2.o(r1)
            goto L_0x002e
        L_0x008a:
            int r0 = r1.size()
            int r2 = r6.size()
            if (r0 <= 0) goto L_0x0099
            if (r2 <= 0) goto L_0x0099
            r1.addAll(r6)
        L_0x0099:
            if (r0 > 0) goto L_0x009c
            goto L_0x009d
        L_0x009c:
            r6 = r1
        L_0x009d:
            g.e.a.b.e.c.u9 r0 = g.e.a.b.e.c.v9.f3057d
            r0.p(r5, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.e.c.a8.b(java.lang.Object, java.lang.Object, long):void");
    }
}
