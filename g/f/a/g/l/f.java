package g.f.a.g.l;

import g.a.a.a.a;
import g.f.a.d.i;
import g.f.a.i.c;
import java.sql.SQLException;
import java.util.List;

public class f<T, ID> extends a<T, ID> {
    public f(c<T, ID> cVar, String str, i[] iVarArr, i[] iVarArr2, String str2) {
        super(cVar, str, iVarArr, iVarArr2);
    }

    public static <T, ID> f<T, ID> e(g.f.a.c.c cVar, c<T, ID> cVar2, i iVar) throws SQLException {
        if (iVar == null && (iVar = cVar2.f4020g) == null) {
            StringBuilder i2 = a.i("Cannot query-for-id with ");
            i2.append(cVar2.c);
            i2.append(" because it doesn't have an id field");
            throw new SQLException(i2.toString());
        }
        StringBuilder sb = new StringBuilder(64);
        b.c(cVar, sb, "SELECT * FROM ", cVar2.f4017d);
        sb.append("WHERE ");
        b.b(cVar, sb, iVar, (List<i>) null);
        sb.append("= ?");
        return new f(cVar2, sb.toString(), new i[]{iVar}, cVar2.f4018e, "query-for-id");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        if (r3 == null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0058, code lost:
        if (r3 == null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
        if (r3 == null) goto L_0x0067;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e2 A[SYNTHETIC, Splitter:B:53:0x00e2] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T f(g.f.a.h.d r12, ID r13, g.f.a.b.m r14) throws java.sql.SQLException {
        /*
            r11 = this;
            if (r14 == 0) goto L_0x000b
            java.lang.Class<T> r0 = r11.b
            java.lang.Object r0 = r14.b(r0, r13)
            if (r0 == 0) goto L_0x000b
            return r0
        L_0x000b:
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            g.f.a.d.i r3 = r11.c
            java.lang.Object r13 = r3.d(r13)
            r1[r2] = r13
            java.lang.String r13 = r11.f3999d
            g.f.a.a.c r12 = (g.f.a.a.c) r12
            java.util.Objects.requireNonNull(r12)
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r12.b     // Catch:{ SQLException -> 0x00c7, all -> 0x00c4 }
            java.lang.String[] r4 = r12.f(r1)     // Catch:{ SQLException -> 0x00c7, all -> 0x00c4 }
            android.database.Cursor r3 = r3.rawQuery(r13, r4)     // Catch:{ SQLException -> 0x00c7, all -> 0x00c4 }
            g.f.a.a.d r4 = new g.f.a.a.d     // Catch:{ SQLException -> 0x00c2 }
            r4.<init>(r3, r14, r0)     // Catch:{ SQLException -> 0x00c2 }
            g.f.a.e.c r14 = g.f.a.a.c.f3836d     // Catch:{ SQLException -> 0x00bf, all -> 0x00bc }
            java.lang.String r5 = "{}: queried for one result: {}"
            r14.i(r5, r12, r13)     // Catch:{ SQLException -> 0x00bf, all -> 0x00bc }
            boolean r12 = r4.a()     // Catch:{ SQLException -> 0x00bf, all -> 0x00bc }
            if (r12 != 0) goto L_0x0045
            android.database.Cursor r12 = r4.b     // Catch:{ IOException -> 0x0041 }
            r12.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0042
        L_0x0041:
        L_0x0042:
            if (r3 == 0) goto L_0x0067
            goto L_0x0064
        L_0x0045:
            java.lang.Object r2 = r11.a(r4)     // Catch:{ SQLException -> 0x00bf, all -> 0x00bc }
            boolean r12 = r4.u()     // Catch:{ SQLException -> 0x00bf, all -> 0x00bc }
            if (r12 == 0) goto L_0x005b
            java.lang.Object r2 = g.f.a.h.d.M     // Catch:{ SQLException -> 0x00bf, all -> 0x00bc }
            android.database.Cursor r12 = r4.b     // Catch:{ IOException -> 0x0057 }
            r12.close()     // Catch:{ IOException -> 0x0057 }
            goto L_0x0058
        L_0x0057:
        L_0x0058:
            if (r3 == 0) goto L_0x0067
            goto L_0x0064
        L_0x005b:
            android.database.Cursor r12 = r4.b     // Catch:{ IOException -> 0x0061 }
            r12.close()     // Catch:{ IOException -> 0x0061 }
            goto L_0x0062
        L_0x0061:
        L_0x0062:
            if (r3 == 0) goto L_0x0067
        L_0x0064:
            r3.close()
        L_0x0067:
            java.lang.String r12 = "{} arguments: {}"
            java.lang.String r13 = "query-for-id"
            if (r2 != 0) goto L_0x0078
            g.f.a.e.c r14 = g.f.a.g.l.b.f3998f
            java.lang.String r3 = r11.f3999d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r4 = "{} using '{}' and {} args, got no results"
            goto L_0x0086
        L_0x0078:
            java.lang.Object r14 = g.f.a.h.d.M
            if (r2 == r14) goto L_0x008f
            g.f.a.e.c r14 = g.f.a.g.l.b.f3998f
            java.lang.String r3 = r11.f3999d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r4 = "{} using '{}' and {} args, got 1 result"
        L_0x0086:
            r14.d(r4, r13, r3, r0)
            g.f.a.e.c r14 = g.f.a.g.l.b.f3998f
            r14.i(r12, r13, r1)
            return r2
        L_0x008f:
            g.f.a.e.c r3 = g.f.a.g.l.b.f3998f
            java.lang.String r8 = r11.f3999d
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            g.f.a.e.b$a r4 = g.f.a.e.b.a.ERROR
            r5 = 0
            r10 = 0
            java.lang.String r6 = "{} using '{}' and {} args, got >1 results"
            java.lang.String r7 = "query-for-id"
            r3.g(r4, r5, r6, r7, r8, r9, r10)
            g.f.a.e.c r14 = g.f.a.g.l.b.f3998f
            r14.i(r12, r13, r1)
            java.sql.SQLException r12 = new java.sql.SQLException
            java.lang.String r14 = " got more than 1 result: "
            java.lang.StringBuilder r13 = g.a.a.a.a.l(r13, r14)
            java.lang.String r14 = r11.f3999d
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L_0x00bc:
            r12 = move-exception
            r2 = r4
            goto L_0x00e0
        L_0x00bf:
            r12 = move-exception
            r2 = r4
            goto L_0x00c9
        L_0x00c2:
            r12 = move-exception
            goto L_0x00c9
        L_0x00c4:
            r12 = move-exception
            r3 = r2
            goto L_0x00e0
        L_0x00c7:
            r12 = move-exception
            r3 = r2
        L_0x00c9:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x00df }
            r14.<init>()     // Catch:{ all -> 0x00df }
            java.lang.String r0 = "queryForOne from database failed: "
            r14.append(r0)     // Catch:{ all -> 0x00df }
            r14.append(r13)     // Catch:{ all -> 0x00df }
            java.lang.String r13 = r14.toString()     // Catch:{ all -> 0x00df }
            java.sql.SQLException r12 = e.e.i.b.j(r13, r12)     // Catch:{ all -> 0x00df }
            throw r12     // Catch:{ all -> 0x00df }
        L_0x00df:
            r12 = move-exception
        L_0x00e0:
            if (r2 == 0) goto L_0x00e9
            android.database.Cursor r13 = r2.b     // Catch:{ IOException -> 0x00e8 }
            r13.close()     // Catch:{ IOException -> 0x00e8 }
            goto L_0x00e9
        L_0x00e8:
        L_0x00e9:
            if (r3 == 0) goto L_0x00ee
            r3.close()
        L_0x00ee:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: g.f.a.g.l.f.f(g.f.a.h.d, java.lang.Object, g.f.a.b.m):java.lang.Object");
    }
}
