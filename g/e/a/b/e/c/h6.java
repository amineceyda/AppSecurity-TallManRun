package g.e.a.b.e.c;

import g.a.a.a.a;
import g.e.a.b.e.c.g6;
import g.e.a.b.e.c.h6;
import java.io.IOException;
import java.util.logging.Logger;

public abstract class h6<MessageType extends h6<MessageType, BuilderType>, BuilderType extends g6<MessageType, BuilderType>> implements o8 {
    public int zzb = 0;

    /* JADX WARNING: type inference failed for: r6v0, types: [java.util.Collection, java.lang.Object, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void g(java.lang.Iterable r6, java.util.List r7) {
        /*
            java.nio.charset.Charset r0 = g.e.a.b.e.c.v7.a
            java.util.Objects.requireNonNull(r6)
            boolean r0 = r6 instanceof g.e.a.b.e.c.z7
            java.lang.String r1 = " is null."
            java.lang.String r2 = "Element at index "
            r3 = 37
            if (r0 == 0) goto L_0x0065
            g.e.a.b.e.c.z7 r6 = (g.e.a.b.e.c.z7) r6
            java.util.List r6 = r6.d()
            r0 = r7
            g.e.a.b.e.c.z7 r0 = (g.e.a.b.e.c.z7) r0
            int r7 = r7.size()
            java.util.Iterator r6 = r6.iterator()
        L_0x0020:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x00c1
            java.lang.Object r4 = r6.next()
            if (r4 != 0) goto L_0x0055
            int r6 = r0.size()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r2)
            int r6 = r6 - r7
            r4.append(r6)
            r4.append(r1)
            java.lang.String r6 = r4.toString()
            int r1 = r0.size()
        L_0x0047:
            int r1 = r1 + -1
            if (r1 < r7) goto L_0x004f
            r0.remove(r1)
            goto L_0x0047
        L_0x004f:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            r7.<init>(r6)
            throw r7
        L_0x0055:
            boolean r5 = r4 instanceof g.e.a.b.e.c.s6
            if (r5 == 0) goto L_0x005f
            g.e.a.b.e.c.s6 r4 = (g.e.a.b.e.c.s6) r4
            r0.n(r4)
            goto L_0x0020
        L_0x005f:
            java.lang.String r4 = (java.lang.String) r4
            r0.add(r4)
            goto L_0x0020
        L_0x0065:
            boolean r0 = r6 instanceof g.e.a.b.e.c.u8
            if (r0 != 0) goto L_0x00c2
            boolean r0 = r7 instanceof java.util.ArrayList
            if (r0 == 0) goto L_0x0080
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0080
            r0 = r7
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r4 = r7.size()
            int r5 = r6.size()
            int r5 = r5 + r4
            r0.ensureCapacity(r5)
        L_0x0080:
            int r0 = r7.size()
            java.util.Iterator r6 = r6.iterator()
        L_0x0088:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x00c1
            java.lang.Object r4 = r6.next()
            if (r4 != 0) goto L_0x00bd
            int r6 = r7.size()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r2)
            int r6 = r6 - r0
            r4.append(r6)
            r4.append(r1)
            java.lang.String r6 = r4.toString()
            int r1 = r7.size()
        L_0x00af:
            int r1 = r1 + -1
            if (r1 < r0) goto L_0x00b7
            r7.remove(r1)
            goto L_0x00af
        L_0x00b7:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            r7.<init>(r6)
            throw r7
        L_0x00bd:
            r7.add(r4)
            goto L_0x0088
        L_0x00c1:
            return
        L_0x00c2:
            r7.addAll(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.e.c.h6.g(java.lang.Iterable, java.util.List):void");
    }

    public final s6 d() {
        try {
            o7 o7Var = (o7) this;
            int e2 = o7Var.e();
            s6 s6Var = s6.b;
            byte[] bArr = new byte[e2];
            Logger logger = x6.b;
            w6 w6Var = new w6(bArr, 0, e2);
            o7Var.l(w6Var);
            if (w6Var.x() == 0) {
                return new r6(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e3) {
            String name = getClass().getName();
            throw new RuntimeException(a.g(new StringBuilder(name.length() + 72), "Serializing ", name, " to a ByteString threw an IOException (should never happen)."), e3);
        }
    }

    public int f() {
        throw null;
    }

    public void h(int i2) {
        throw null;
    }

    public final byte[] i() {
        try {
            o7 o7Var = (o7) this;
            int e2 = o7Var.e();
            byte[] bArr = new byte[e2];
            Logger logger = x6.b;
            w6 w6Var = new w6(bArr, 0, e2);
            o7Var.l(w6Var);
            if (w6Var.x() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e3) {
            String name = getClass().getName();
            throw new RuntimeException(a.g(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e3);
        }
    }
}
