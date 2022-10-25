package g.f.a.g.m;

import g.a.a.a.a;
import g.f.a.d.b;
import g.f.a.d.i;
import java.sql.SQLException;

public class c implements a {
    public final String a;
    public final i b;
    public final Object c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4012d;

    public c(String str, i iVar, Object obj, String str2) throws SQLException {
        boolean z;
        if (iVar.f3876e.F) {
            z = false;
        } else {
            b bVar = iVar.f3883l;
            if (bVar != null) {
                z = bVar.v();
            } else {
                throw new SQLException("Internal error.  Data-persister is not configured for field.  Please post _full_ exception with associated data objects to mailing list: " + iVar);
            }
        }
        if (z) {
            this.a = str;
            this.b = iVar;
            this.c = obj;
            this.f4012d = str2;
            return;
        }
        StringBuilder n = a.n("Field '", str, "' is of data type ");
        n.append(iVar.f3883l);
        n.append(" which can not be compared");
        throw new SQLException(n.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(g.f.a.c.c r9, g.f.a.d.i r10, java.lang.StringBuilder r11, java.util.List r12, java.lang.Object r13) {
        /*
            r8 = this;
            if (r13 == 0) goto L_0x00e5
            boolean r0 = r13 instanceof g.f.a.g.a
            r1 = 0
            r2 = 63
            r3 = 1
            if (r0 == 0) goto L_0x0019
            r11.append(r2)
            g.f.a.g.a r13 = (g.f.a.g.a) r13
            java.lang.String r9 = r8.a
            r13.d(r9, r10)
            r12.add(r13)
            goto L_0x00dc
        L_0x0019:
            boolean r0 = r13 instanceof g.f.a.g.b
            if (r0 == 0) goto L_0x0027
            g.f.a.g.b r13 = (g.f.a.g.b) r13
            r10 = 0
            g.f.a.c.d r9 = (g.f.a.c.d) r9
            r9.b(r11, r10)
            goto L_0x00dc
        L_0x0027:
            g.f.a.d.b r0 = r10.f3883l
            boolean r0 = r0.r()
            if (r0 == 0) goto L_0x0045
            r11.append(r2)
            g.f.a.g.g r9 = new g.f.a.g.g
            r9.<init>()
            java.lang.String r0 = r8.a
            r9.d(r0, r10)
            r9.c = r3
            r9.f3961d = r13
            r12.add(r9)
            goto L_0x00dc
        L_0x0045:
            g.f.a.d.f r0 = r10.f3876e
            boolean r0 = r0.f3872k
            if (r0 == 0) goto L_0x0068
            java.lang.Class r0 = r10.l()
            java.lang.Class r2 = r13.getClass()
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto L_0x0068
            g.f.a.d.i r4 = r10.p
            java.lang.Object r7 = r4.e(r13)
            r2 = r8
            r3 = r9
            r5 = r11
            r6 = r12
            r2.a(r3, r4, r5, r6, r7)
            goto L_0x00dd
        L_0x0068:
            g.f.a.d.b r12 = r10.f3883l
            boolean r12 = r12.k()
            if (r12 == 0) goto L_0x0089
            java.lang.Object r10 = r10.d(r13)
            java.lang.String r10 = r10.toString()
            g.f.a.c.a r9 = (g.f.a.c.a) r9
            java.util.Objects.requireNonNull(r9)
            r9 = 39
            r11.append(r9)
            r11.append(r10)
            r11.append(r9)
            goto L_0x00dc
        L_0x0089:
            g.f.a.d.f r9 = r10.f3876e
            boolean r9 = r9.f3872k
            if (r9 == 0) goto L_0x00d5
            java.lang.Object r9 = r10.d(r13)
            java.lang.String r9 = r9.toString()
            int r12 = r9.length()
            if (r12 <= 0) goto L_0x00d1
            char r12 = r9.charAt(r1)
            java.lang.String r13 = "0123456789.-+"
            int r12 = r13.indexOf(r12)
            if (r12 < 0) goto L_0x00aa
            goto L_0x00d1
        L_0x00aa:
            java.sql.SQLException r11 = new java.sql.SQLException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Foreign field "
            r12.append(r13)
            r12.append(r10)
            java.lang.String r10 = " does not seem to be producing a numerical value '"
            r12.append(r10)
            r12.append(r9)
            java.lang.String r9 = "'. Maybe you are passing the wrong object to comparison: "
            r12.append(r9)
            r12.append(r8)
            java.lang.String r9 = r12.toString()
            r11.<init>(r9)
            throw r11
        L_0x00d1:
            r11.append(r9)
            goto L_0x00dc
        L_0x00d5:
            java.lang.Object r9 = r10.d(r13)
            r11.append(r9)
        L_0x00dc:
            r1 = 1
        L_0x00dd:
            if (r1 == 0) goto L_0x00e4
            r9 = 32
            r11.append(r9)
        L_0x00e4:
            return
        L_0x00e5:
            java.sql.SQLException r9 = new java.sql.SQLException
            java.lang.String r11 = "argument for '"
            java.lang.StringBuilder r11 = g.a.a.a.a.i(r11)
            java.lang.String r10 = r10.h()
            r11.append(r10)
            java.lang.String r10 = "' is null"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: g.f.a.g.m.c.a(g.f.a.c.c, g.f.a.d.i, java.lang.StringBuilder, java.util.List, java.lang.Object):void");
    }

    public String toString() {
        return this.a + ' ' + this.f4012d + ' ' + ' ' + this.c;
    }
}
