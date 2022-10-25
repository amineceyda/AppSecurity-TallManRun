package g.f.a.i;

import com.google.android.gms.common.ConnectionResult;
import g.f.a.a.b;
import g.f.a.b.a;
import g.f.a.b.g;
import g.f.a.b.m;
import g.f.a.d.i;
import g.f.a.d.k;
import g.f.a.e.c;
import g.f.a.g.i;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class d {
    public static c a = g.f.a.e.d.a(d.class);
    public static final i[] b = new i[0];

    public static <T, ID> void a(g.f.a.c.c cVar, c<T, ID> cVar2, List<String> list, boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        for (i iVar : cVar2.f4018e) {
            String m2 = z2 ? iVar.m() : iVar.j();
            if (m2 != null) {
                List list2 = (List) hashMap.get(m2);
                if (list2 == null) {
                    list2 = new ArrayList();
                    hashMap.put(m2, list2);
                }
                list2.add(iVar.f3875d);
            }
        }
        StringBuilder sb = new StringBuilder(128);
        for (Map.Entry entry : hashMap.entrySet()) {
            a.f("creating index '{}' for table '{}", entry.getKey(), cVar2.f4017d);
            sb.append("CREATE ");
            if (z2) {
                sb.append("UNIQUE ");
            }
            sb.append("INDEX ");
            if (z) {
                sb.append("IF NOT EXISTS ");
            }
            g.f.a.c.d dVar = (g.f.a.c.d) cVar;
            dVar.b(sb, (String) entry.getKey());
            sb.append(" ON ");
            dVar.b(sb, cVar2.f4017d);
            sb.append(" ( ");
            boolean z3 = true;
            for (String str : (List) entry.getValue()) {
                if (z3) {
                    z3 = false;
                } else {
                    sb.append(", ");
                }
                dVar.b(sb, str);
            }
            sb.append(" )");
            list.add(sb.toString());
            sb.setLength(0);
        }
    }

    public static <T, ID> int b(g<T, ID> gVar, boolean z) throws SQLException {
        if (gVar instanceof a) {
            return c(gVar.O(), ((a) gVar).f3844f, z);
        }
        return c(gVar.O(), new c(gVar.O(), (a) null, gVar.a()), z);
    }

    public static <T, ID> int c(g.f.a.h.c cVar, c<T, ID> cVar2, boolean z) throws SQLException {
        g.f.a.c.c cVar3;
        ArrayList arrayList;
        int i2;
        boolean z2;
        c<T, ID> cVar4 = cVar2;
        boolean z3 = z;
        g.f.a.c.c cVar5 = ((b) cVar).f3835e;
        a.e("creating table '{}'", cVar4.f4017d);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        StringBuilder sb = new StringBuilder(256);
        sb.append("CREATE TABLE ");
        if (z3) {
            Objects.requireNonNull(cVar5);
            sb.append("IF NOT EXISTS ");
        }
        g.f.a.c.d dVar = (g.f.a.c.d) cVar5;
        dVar.b(sb, cVar4.f4017d);
        sb.append(" (");
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        i[] iVarArr = cVar4.f4018e;
        int length = iVarArr.length;
        int i3 = 0;
        boolean z4 = true;
        while (i3 < length) {
            i iVar = iVarArr[i3];
            i[] iVarArr2 = iVarArr;
            if (iVar.f3876e.F) {
                cVar3 = cVar5;
                arrayList = arrayList3;
                i2 = length;
            } else {
                if (z4) {
                    z4 = false;
                } else {
                    sb.append(", ");
                }
                String str = iVar.f3876e.A;
                if (str == null) {
                    k kVar = k.LONG;
                    i2 = length;
                    dVar.b(sb, iVar.f3875d);
                    sb.append(' ');
                    g.f.a.d.b bVar = iVar.f3883l;
                    if (iVar.f3876e.f3867f == 0) {
                        bVar.p();
                    }
                    z2 = z4;
                    String str2 = "INTEGER";
                    arrayList = arrayList3;
                    cVar3 = cVar5;
                    switch (bVar.a().ordinal()) {
                        case 0:
                            sb.append("VARCHAR");
                            break;
                        case 1:
                            sb.append("TEXT");
                            break;
                        case 2:
                            sb.append("VARCHAR");
                            break;
                        case 3:
                            sb.append("SMALLINT");
                            break;
                        case 4:
                            sb.append("CHAR");
                            break;
                        case 5:
                            sb.append("TINYINT");
                            break;
                        case 6:
                            sb.append("BLOB");
                            break;
                        case 7:
                            sb.append("SMALLINT");
                            break;
                        case 8:
                            sb.append(str2);
                            break;
                        case 9:
                            if (iVar.k() != kVar || !iVar.f3878g) {
                                str2 = "BIGINT";
                            }
                            sb.append(str2);
                            break;
                        case 10:
                            sb.append("FLOAT");
                            break;
                        case 11:
                            sb.append("DOUBLE PRECISION");
                            break;
                        case 12:
                            sb.append("BLOB");
                            break;
                        case ConnectionResult.TIMEOUT:
                            sb.append("NUMERIC");
                            break;
                        case ConnectionResult.INTERRUPTED:
                            throw new UnsupportedOperationException("UUID is not supported by this database type");
                        case ConnectionResult.API_UNAVAILABLE:
                            String c = bVar.c();
                            if (c != null) {
                                sb.append(c);
                                break;
                            }
                            break;
                        default:
                            StringBuilder i4 = g.a.a.a.a.i("Unknown SQL-type ");
                            i4.append(bVar.a());
                            throw new IllegalArgumentException(i4.toString());
                    }
                    sb.append(' ');
                    if (!iVar.p() || iVar.q()) {
                        if (iVar.f3878g && !iVar.q()) {
                            if (iVar.k() == k.INTEGER || iVar.k() == kVar) {
                                sb.append("PRIMARY KEY AUTOINCREMENT ");
                            } else {
                                throw new IllegalArgumentException("Sqlite requires that auto-increment generated-id be integer or long type");
                            }
                        }
                        if (!iVar.f3878g) {
                            Object obj = iVar.f3884m;
                            if (obj != null) {
                                sb.append("DEFAULT ");
                                if (iVar.f3883l.j()) {
                                    String obj2 = obj.toString();
                                    sb.append('\'');
                                    sb.append(obj2);
                                    sb.append('\'');
                                } else {
                                    sb.append(obj);
                                }
                                sb.append(' ');
                            }
                            if (!iVar.f3876e.f3868g) {
                                sb.append("NOT NULL ");
                            }
                            if (iVar.f3876e.q) {
                                StringBuilder i5 = g.a.a.a.a.i(" UNIQUE (");
                                dVar.b(i5, iVar.f3875d);
                                i5.append(')');
                                arrayList4.add(i5.toString());
                            }
                        }
                    } else {
                        throw new SQLException("GeneratedIdSequence is not supported by database " + "Android SQLite" + " for field " + iVar);
                    }
                } else {
                    cVar3 = cVar5;
                    arrayList = arrayList3;
                    i2 = length;
                    z2 = z4;
                    dVar.b(sb, iVar.f3875d);
                    sb.append(' ');
                    sb.append(str);
                    sb.append(' ');
                }
                z4 = z2;
            }
            i3++;
            boolean z5 = z;
            iVarArr = iVarArr2;
            length = i2;
            arrayList3 = arrayList;
            cVar5 = cVar3;
        }
        g.f.a.c.c cVar6 = cVar5;
        ArrayList arrayList7 = arrayList3;
        StringBuilder sb2 = null;
        for (i iVar2 : cVar4.f4018e) {
            if ((!iVar2.f3878g || iVar2.q()) && iVar2.f3877f) {
                if (sb2 == null) {
                    sb2 = new StringBuilder(48);
                    sb2.append("PRIMARY KEY (");
                } else {
                    sb2.append(',');
                }
                dVar.b(sb2, iVar2.f3875d);
            }
        }
        if (sb2 != null) {
            sb2.append(") ");
            arrayList4.add(sb2.toString());
        }
        StringBuilder sb3 = null;
        for (i iVar3 : cVar4.f4018e) {
            if (iVar3.f3876e.r) {
                if (sb3 == null) {
                    sb3 = new StringBuilder(48);
                    sb3.append("UNIQUE (");
                } else {
                    sb3.append(',');
                }
                dVar.b(sb3, iVar3.f3875d);
            }
        }
        if (sb3 != null) {
            sb3.append(") ");
            arrayList4.add(sb3.toString());
        }
        Iterator it = arrayList4.iterator();
        while (it.hasNext()) {
            sb.append(", ");
            sb.append((String) it.next());
        }
        sb.append(") ");
        arrayList2.addAll(arrayList5);
        arrayList2.add(sb.toString());
        arrayList2.addAll(arrayList6);
        boolean z6 = z;
        a(dVar, cVar4, arrayList2, z6, false);
        a(dVar, cVar4, arrayList2, z6, true);
        g.f.a.h.d b2 = ((b) cVar).b(cVar4.f4017d);
        Objects.requireNonNull(cVar6);
        return f(b2, "create", arrayList2, false, false, false) + d(b2, arrayList7);
    }

    public static int d(g.f.a.h.d dVar, List list) throws SQLException {
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            g.f.a.h.b bVar = null;
            try {
                g.f.a.h.b bVar2 = ((g.f.a.a.c) dVar).b(str, i.a.SELECT, b, -1, false);
                try {
                    g.f.a.a.d dVar2 = (g.f.a.a.d) ((g.f.a.a.a) bVar2).b((m) null);
                    int i3 = 0;
                    for (boolean a2 = dVar2.a(); a2; a2 = dVar2.u()) {
                        i3++;
                    }
                    a.f("executing create table after-query got {} results: {}", Integer.valueOf(i3), str);
                    e.e.i.b.d(bVar2, "compiled statement");
                    i2++;
                } catch (SQLException e2) {
                    e = e2;
                    bVar = bVar2;
                    try {
                        throw e.e.i.b.j("executing create table after-query failed: " + str, e);
                    } catch (Throwable th) {
                        th = th;
                        bVar2 = bVar;
                        e.e.i.b.d(bVar2, "compiled statement");
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    e.e.i.b.d(bVar2, "compiled statement");
                    throw th;
                }
            } catch (SQLException e3) {
                e = e3;
                throw e.e.i.b.j("executing create table after-query failed: " + str, e);
            }
        }
        return i2;
    }

    public static <T, ID> int e(g.f.a.c.c cVar, g.f.a.h.c cVar2, c<T, ID> cVar3, boolean z) throws SQLException {
        a.e("dropping table '{}'", cVar3.f4017d);
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (g.f.a.d.i iVar : cVar3.f4018e) {
            String j2 = iVar.j();
            if (j2 != null) {
                hashSet.add(j2);
            }
            String m2 = iVar.m();
            if (m2 != null) {
                hashSet.add(m2);
            }
        }
        StringBuilder sb = new StringBuilder(48);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            a.f("dropping index '{}' for table '{}", str, cVar3.f4017d);
            sb.append("DROP INDEX ");
            ((g.f.a.c.d) cVar).b(sb, str);
            arrayList.add(sb.toString());
            sb.setLength(0);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (g.f.a.d.i iVar2 : cVar3.f4018e) {
            Objects.requireNonNull((g.f.a.c.a) cVar);
        }
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("DROP TABLE ");
        ((g.f.a.c.d) cVar).b(sb2, cVar3.f4017d);
        sb2.append(' ');
        arrayList.addAll(arrayList2);
        arrayList.add(sb2.toString());
        arrayList.addAll(arrayList3);
        g.f.a.h.d b2 = ((b) cVar2).b(cVar3.f4017d);
        Objects.requireNonNull(cVar);
        return f(b2, "drop", arrayList, z, false, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0054 A[SYNTHETIC, Splitter:B:21:0x0054] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b7 A[SYNTHETIC, Splitter:B:33:0x00b7] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int f(g.f.a.h.d r17, java.lang.String r18, java.util.Collection<java.lang.String> r19, boolean r20, boolean r21, boolean r22) throws java.sql.SQLException {
        /*
            g.f.a.e.b$a r9 = g.f.a.e.b.a.INFO
            java.lang.String r10 = "compiled statement"
            java.util.Iterator r11 = r19.iterator()
            r12 = 0
            r13 = 0
        L_0x000a:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00d1
            java.lang.Object r0 = r11.next()
            r14 = r0
            java.lang.String r14 = (java.lang.String) r14
            r7 = 0
            g.f.a.g.i$a r3 = g.f.a.g.i.a.EXECUTE     // Catch:{ SQLException -> 0x004d, all -> 0x004a }
            g.f.a.d.i[] r4 = b     // Catch:{ SQLException -> 0x004d, all -> 0x004a }
            r5 = -1
            r6 = 0
            r1 = r17
            g.f.a.a.c r1 = (g.f.a.a.c) r1     // Catch:{ SQLException -> 0x004d, all -> 0x004a }
            r2 = r14
            g.f.a.h.b r15 = r1.b(r2, r3, r4, r5, r6)     // Catch:{ SQLException -> 0x004d, all -> 0x004a }
            r0 = r15
            g.f.a.a.a r0 = (g.f.a.a.a) r0     // Catch:{ SQLException -> 0x0047 }
            int r16 = r0.a()     // Catch:{ SQLException -> 0x0047 }
            g.f.a.e.c r1 = a     // Catch:{ SQLException -> 0x0040 }
            java.lang.String r4 = "executed {} table statement changed {} rows: {}"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r16)     // Catch:{ SQLException -> 0x0040 }
            r3 = 0
            r8 = 0
            r2 = r9
            r5 = r18
            r7 = r14
            r1.g(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLException -> 0x0040 }
            goto L_0x0061
        L_0x0040:
            r0 = move-exception
            r6 = r0
            goto L_0x0052
        L_0x0043:
            r0 = move-exception
            r7 = r15
            goto L_0x00cd
        L_0x0047:
            r0 = move-exception
            r7 = r15
            goto L_0x004e
        L_0x004a:
            r0 = move-exception
            goto L_0x00cd
        L_0x004d:
            r0 = move-exception
        L_0x004e:
            r6 = r0
            r15 = r7
            r16 = 0
        L_0x0052:
            if (r20 == 0) goto L_0x00b7
            g.f.a.e.c r1 = a     // Catch:{ all -> 0x0043 }
            java.lang.String r4 = "ignoring {} error '{}' for statement: {}"
            r3 = 0
            r8 = 0
            r2 = r9
            r5 = r18
            r7 = r14
            r1.g(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0043 }
        L_0x0061:
            r0 = r16
            e.e.i.b.d(r15, r10)
            if (r0 >= 0) goto L_0x008f
            if (r21 == 0) goto L_0x006b
            goto L_0x00b3
        L_0x006b:
            java.sql.SQLException r1 = new java.sql.SQLException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "SQL statement "
            r2.append(r3)
            r2.append(r14)
            java.lang.String r3 = " updated "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " rows, we were expecting >= 0"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x008f:
            if (r0 <= 0) goto L_0x00b3
            if (r22 != 0) goto L_0x0094
            goto L_0x00b3
        L_0x0094:
            java.sql.SQLException r1 = new java.sql.SQLException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "SQL statement updated "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " rows, we were expecting == 0: "
            r2.append(r0)
            r2.append(r14)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x00b3:
            int r13 = r13 + 1
            goto L_0x000a
        L_0x00b7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0043 }
            r0.<init>()     // Catch:{ all -> 0x0043 }
            java.lang.String r1 = "SQL statement failed: "
            r0.append(r1)     // Catch:{ all -> 0x0043 }
            r0.append(r14)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0043 }
            java.sql.SQLException r0 = e.e.i.b.j(r0, r6)     // Catch:{ all -> 0x0043 }
            throw r0     // Catch:{ all -> 0x0043 }
        L_0x00cd:
            e.e.i.b.d(r7, r10)
            throw r0
        L_0x00d1:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: g.f.a.i.d.f(g.f.a.h.d, java.lang.String, java.util.Collection, boolean, boolean, boolean):int");
    }
}
