package g.f.a.g;

import g.f.a.a.b;
import g.f.a.b.g;
import g.f.a.b.m;
import g.f.a.d.i;
import g.f.a.d.k;
import g.f.a.e.c;
import g.f.a.e.d;
import g.f.a.g.i;
import g.f.a.h.e;
import java.io.Closeable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class j<T, ID> implements c<String[]> {

    /* renamed from: i  reason: collision with root package name */
    public static c f3984i = d.a(j.class);

    /* renamed from: j  reason: collision with root package name */
    public static final i[] f3985j = new i[0];
    public final g.f.a.c.c a;
    public final g.f.a.i.c<T, ID> b;
    public final g<T, ID> c;

    /* renamed from: d  reason: collision with root package name */
    public d<T> f3986d;

    /* renamed from: e  reason: collision with root package name */
    public g.f.a.g.l.c<T, ID> f3987e;

    /* renamed from: f  reason: collision with root package name */
    public g.f.a.g.l.g<T, ID> f3988f;

    /* renamed from: g  reason: collision with root package name */
    public g.f.a.g.l.d<T, ID> f3989g;

    /* renamed from: h  reason: collision with root package name */
    public final ThreadLocal<Boolean> f3990h = new a(this);

    public class a extends ThreadLocal<Boolean> {
        public a(j jVar) {
        }

        public /* bridge */ /* synthetic */ Object initialValue() {
            return Boolean.FALSE;
        }
    }

    public j(g.f.a.c.c cVar, g.f.a.i.c<T, ID> cVar2, g<T, ID> gVar) {
        this.a = cVar;
        this.b = cVar2;
        this.c = gVar;
    }

    public Object a(e eVar) throws SQLException {
        g.f.a.a.d dVar = (g.f.a.a.d) eVar;
        int columnCount = dVar.b.getColumnCount();
        String[] strArr = new String[columnCount];
        for (int i2 = 0; i2 < columnCount; i2++) {
            strArr[i2] = dVar.s(i2);
        }
        return strArr;
    }

    public h<T, ID> b(g.f.a.b.a<T, ID> aVar, g.f.a.h.c cVar, e<T> eVar, m mVar, int i2) throws SQLException {
        g.f.a.h.d b2 = ((b) cVar).b(this.b.f4017d);
        g.f.a.h.b bVar = null;
        try {
            g.f.a.g.l.e eVar2 = (g.f.a.g.l.e) eVar;
            g.f.a.h.b e2 = eVar2.e(b2, i.a.SELECT, i2);
            try {
                h hVar = new h(this.b.c, aVar, eVar2, cVar, b2, e2, eVar2.f3999d, mVar);
                e.e.i.b.d((Closeable) null, "compiled statement");
                return hVar;
            } catch (Throwable th) {
                th = th;
                bVar = e2;
                e.e.i.b.d(bVar, "compiled statement");
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            e.e.i.b.d(bVar, "compiled statement");
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0114 A[Catch:{ SQLException -> 0x01d1, SQLException -> 0x01e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0149 A[Catch:{ SQLException -> 0x01d1, SQLException -> 0x01e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0182 A[Catch:{ SQLException -> 0x01d1, SQLException -> 0x01e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0189 A[Catch:{ SQLException -> 0x01d1, SQLException -> 0x01e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0194 A[Catch:{ SQLException -> 0x01d1, SQLException -> 0x01e9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int c(g.f.a.h.d r18, T r19, g.f.a.b.m r20) throws java.sql.SQLException {
        /*
            r17 = this;
            r1 = r17
            r2 = r19
            g.f.a.g.l.c<T, ID> r0 = r1.f3987e
            r3 = 0
            r5 = 0
            if (r0 != 0) goto L_0x00bd
            g.f.a.c.c r0 = r1.a
            g.f.a.i.c<T, ID> r7 = r1.b
            int r6 = g.f.a.g.l.c.f4001j
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r8 = 128(0x80, float:1.794E-43)
            r6.<init>(r8)
            java.lang.String r8 = r7.f4017d
            java.lang.String r9 = "INSERT INTO "
            g.f.a.g.l.b.c(r0, r6, r9, r8)
            g.f.a.d.i[] r8 = r7.f4018e
            int r9 = r8.length
            r10 = -1
            r10 = 0
            r11 = -1
            r12 = 0
        L_0x0025:
            if (r10 >= r9) goto L_0x003b
            r13 = r8[r10]
            boolean r14 = g.f.a.g.l.c.f(r0, r13)
            if (r14 == 0) goto L_0x0038
            g.f.a.d.f r13 = r13.f3876e
            boolean r13 = r13.C
            if (r13 == 0) goto L_0x0036
            r11 = r12
        L_0x0036:
            int r12 = r12 + 1
        L_0x0038:
            int r10 = r10 + 1
            goto L_0x0025
        L_0x003b:
            g.f.a.d.i[] r9 = new g.f.a.d.i[r12]
            if (r12 != 0) goto L_0x004b
            r8 = r0
            g.f.a.c.b r8 = (g.f.a.c.b) r8
            java.util.Objects.requireNonNull(r8)
            java.lang.String r8 = "DEFAULT VALUES"
            r6.append(r8)
            goto L_0x009e
        L_0x004b:
            r8 = 40
            r6.append(r8)
            g.f.a.d.i[] r8 = r7.f4018e
            int r10 = r8.length
            r12 = 0
            r13 = 1
            r14 = 0
        L_0x0056:
            r15 = 44
            if (r12 >= r10) goto L_0x0075
            r4 = r8[r12]
            boolean r16 = g.f.a.g.l.c.f(r0, r4)
            if (r16 != 0) goto L_0x0063
            goto L_0x0072
        L_0x0063:
            if (r13 == 0) goto L_0x0067
            r13 = 0
            goto L_0x006a
        L_0x0067:
            r6.append(r15)
        L_0x006a:
            g.f.a.g.l.b.b(r0, r6, r4, r3)
            int r15 = r14 + 1
            r9[r14] = r4
            r14 = r15
        L_0x0072:
            int r12 = r12 + 1
            goto L_0x0056
        L_0x0075:
            java.lang.String r4 = ") VALUES ("
            r6.append(r4)
            g.f.a.d.i[] r4 = r7.f4018e
            int r8 = r4.length
            r10 = 1
            r12 = 0
        L_0x007f:
            if (r12 >= r8) goto L_0x0099
            r13 = r4[r12]
            boolean r13 = g.f.a.g.l.c.f(r0, r13)
            if (r13 != 0) goto L_0x008a
            goto L_0x0096
        L_0x008a:
            if (r10 == 0) goto L_0x008e
            r10 = 0
            goto L_0x0091
        L_0x008e:
            r6.append(r15)
        L_0x0091:
            r13 = 63
            r6.append(r13)
        L_0x0096:
            int r12 = r12 + 1
            goto L_0x007f
        L_0x0099:
            r4 = 41
            r6.append(r4)
        L_0x009e:
            g.f.a.d.i r4 = r7.f4020g
            if (r4 != 0) goto L_0x00a3
            goto L_0x00a7
        L_0x00a3:
            java.lang.String r4 = r4.f3879h
            if (r4 != 0) goto L_0x00a9
        L_0x00a7:
            r10 = r3
            goto L_0x00b1
        L_0x00a9:
            g.f.a.c.a r0 = (g.f.a.c.a) r0
            java.util.Objects.requireNonNull(r0)
            java.lang.String r0 = ""
            r10 = r0
        L_0x00b1:
            g.f.a.g.l.c r0 = new g.f.a.g.l.c
            java.lang.String r8 = r6.toString()
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            r1.f3987e = r0
        L_0x00bd:
            g.f.a.g.l.c<T, ID> r4 = r1.f3987e
            g.f.a.c.c r0 = r1.a
            java.lang.String r6 = "insert arguments: {}"
            g.f.a.d.i r7 = r4.c
            if (r7 == 0) goto L_0x010d
            g.f.a.d.f r8 = r7.f3876e
            boolean r8 = r8.z
            if (r8 == 0) goto L_0x00d9
            java.lang.Object r8 = r7.e(r2)
            boolean r7 = r7.o(r8)
            if (r7 != 0) goto L_0x00d9
            r7 = 0
            goto L_0x00da
        L_0x00d9:
            r7 = 1
        L_0x00da:
            g.f.a.d.i r8 = r4.c
            boolean r8 = r8.q()
            if (r8 == 0) goto L_0x00f4
            g.f.a.d.i r8 = r4.c
            boolean r9 = r8.f3878g
            if (r9 == 0) goto L_0x00f4
            if (r7 == 0) goto L_0x010d
            g.f.a.d.b r0 = r8.f3883l
            java.lang.Object r0 = r0.s()
            r8.b(r2, r0, r5, r3)
            goto L_0x010d
        L_0x00f4:
            g.f.a.d.i r8 = r4.c
            boolean r8 = r8.p()
            if (r8 == 0) goto L_0x00ff
            java.util.Objects.requireNonNull(r0)
        L_0x00ff:
            g.f.a.d.i r0 = r4.c
            boolean r0 = r0.f3878g
            if (r0 == 0) goto L_0x010d
            if (r7 == 0) goto L_0x010d
            g.f.a.g.l.c$b r0 = new g.f.a.g.l.c$b
            r0.<init>(r3)
            goto L_0x010e
        L_0x010d:
            r0 = r3
        L_0x010e:
            g.f.a.i.c<T, ID> r7 = r4.a     // Catch:{ SQLException -> 0x01e9 }
            boolean r8 = r7.f4022i     // Catch:{ SQLException -> 0x01e9 }
            if (r8 == 0) goto L_0x013d
            g.f.a.d.i[] r7 = r7.f4018e     // Catch:{ SQLException -> 0x01e9 }
            int r8 = r7.length     // Catch:{ SQLException -> 0x01e9 }
            r9 = 0
        L_0x0118:
            if (r9 >= r8) goto L_0x013d
            r10 = r7[r9]     // Catch:{ SQLException -> 0x01e9 }
            g.f.a.d.f r11 = r10.f3876e     // Catch:{ SQLException -> 0x01e9 }
            boolean r11 = r11.B     // Catch:{ SQLException -> 0x01e9 }
            if (r11 != 0) goto L_0x0123
            goto L_0x013a
        L_0x0123:
            java.lang.Object r11 = r10.f(r2)     // Catch:{ SQLException -> 0x01e9 }
            if (r11 == 0) goto L_0x013a
            g.f.a.d.i r12 = r10.p     // Catch:{ SQLException -> 0x01e9 }
            java.lang.Object r13 = r12.e(r11)     // Catch:{ SQLException -> 0x01e9 }
            boolean r12 = r12.o(r13)     // Catch:{ SQLException -> 0x01e9 }
            if (r12 == 0) goto L_0x013a
            g.f.a.b.a<?, ?> r10 = r10.t     // Catch:{ SQLException -> 0x01e9 }
            r10.Q(r11)     // Catch:{ SQLException -> 0x01e9 }
        L_0x013a:
            int r9 = r9 + 1
            goto L_0x0118
        L_0x013d:
            java.lang.Object[] r7 = r4.d(r2)     // Catch:{ SQLException -> 0x01e9 }
            int r8 = r4.f4004i     // Catch:{ SQLException -> 0x01e9 }
            if (r8 < 0) goto L_0x0160
            r9 = r7[r8]     // Catch:{ SQLException -> 0x01e9 }
            if (r9 != 0) goto L_0x0160
            g.f.a.d.i[] r9 = r4.f4000e     // Catch:{ SQLException -> 0x01e9 }
            r8 = r9[r8]     // Catch:{ SQLException -> 0x01e9 }
            g.f.a.d.b r9 = r8.f3883l     // Catch:{ SQLException -> 0x01e9 }
            if (r9 != 0) goto L_0x0153
            r9 = r3
            goto L_0x0157
        L_0x0153:
            java.lang.Object r9 = r9.q(r3)     // Catch:{ SQLException -> 0x01e9 }
        L_0x0157:
            int r10 = r4.f4004i     // Catch:{ SQLException -> 0x01e9 }
            java.lang.Object r8 = r8.d(r9)     // Catch:{ SQLException -> 0x01e9 }
            r7[r10] = r8     // Catch:{ SQLException -> 0x01e9 }
            goto L_0x0161
        L_0x0160:
            r9 = r3
        L_0x0161:
            java.lang.String r8 = r4.f3999d     // Catch:{ SQLException -> 0x01d1 }
            g.f.a.d.i[] r10 = r4.f4000e     // Catch:{ SQLException -> 0x01d1 }
            r11 = r18
            g.f.a.a.c r11 = (g.f.a.a.c) r11     // Catch:{ SQLException -> 0x01d1 }
            r11.d(r8, r7, r10, r0)     // Catch:{ SQLException -> 0x01d1 }
            g.f.a.e.c r8 = g.f.a.g.l.b.f3998f     // Catch:{ SQLException -> 0x01e9 }
            java.lang.String r10 = "insert data with statement '{}' and {} args, changed {} rows"
            java.lang.String r11 = r4.f3999d     // Catch:{ SQLException -> 0x01e9 }
            int r12 = r7.length     // Catch:{ SQLException -> 0x01e9 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ SQLException -> 0x01e9 }
            r13 = 1
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)     // Catch:{ SQLException -> 0x01e9 }
            r8.d(r10, r11, r12, r14)     // Catch:{ SQLException -> 0x01e9 }
            int r8 = r7.length     // Catch:{ SQLException -> 0x01e9 }
            if (r8 <= 0) goto L_0x0187
            g.f.a.e.c r8 = g.f.a.g.l.b.f3998f     // Catch:{ SQLException -> 0x01e9 }
            r8.h(r6, r7)     // Catch:{ SQLException -> 0x01e9 }
        L_0x0187:
            if (r9 == 0) goto L_0x0192
            g.f.a.d.i[] r6 = r4.f4000e     // Catch:{ SQLException -> 0x01e9 }
            int r7 = r4.f4004i     // Catch:{ SQLException -> 0x01e9 }
            r6 = r6[r7]     // Catch:{ SQLException -> 0x01e9 }
            r6.b(r2, r9, r5, r3)     // Catch:{ SQLException -> 0x01e9 }
        L_0x0192:
            if (r0 == 0) goto L_0x01b8
            java.lang.Number r0 = r0.a     // Catch:{ SQLException -> 0x01e9 }
            if (r0 == 0) goto L_0x01b0
            long r5 = r0.longValue()     // Catch:{ SQLException -> 0x01e9 }
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x01a8
            java.lang.String r5 = "keyholder"
            r4.e(r2, r0, r5, r3)     // Catch:{ SQLException -> 0x01e9 }
            goto L_0x01b8
        L_0x01a8:
            java.sql.SQLException r0 = new java.sql.SQLException     // Catch:{ SQLException -> 0x01e9 }
            java.lang.String r3 = "generated-id key must not be 0 value, maybe a schema mismatch between entity and database table?"
            r0.<init>(r3)     // Catch:{ SQLException -> 0x01e9 }
            throw r0     // Catch:{ SQLException -> 0x01e9 }
        L_0x01b0:
            java.sql.SQLException r0 = new java.sql.SQLException     // Catch:{ SQLException -> 0x01e9 }
            java.lang.String r3 = "generated-id key was not set by the update call, maybe a schema mismatch between entity and database table?"
            r0.<init>(r3)     // Catch:{ SQLException -> 0x01e9 }
            throw r0     // Catch:{ SQLException -> 0x01e9 }
        L_0x01b8:
            g.f.a.b.g<T, ID> r0 = r1.c
            if (r0 == 0) goto L_0x01cf
            java.lang.ThreadLocal<java.lang.Boolean> r0 = r1.f3990h
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x01cf
            g.f.a.b.g<T, ID> r0 = r1.c
            r0.s()
        L_0x01cf:
            r0 = 1
            return r0
        L_0x01d1:
            r0 = move-exception
            g.f.a.e.c r3 = g.f.a.g.l.b.f3998f     // Catch:{ SQLException -> 0x01e9 }
            java.lang.String r5 = "insert data with statement '{}' and {} args, threw exception: {}"
            java.lang.String r8 = r4.f3999d     // Catch:{ SQLException -> 0x01e9 }
            int r9 = r7.length     // Catch:{ SQLException -> 0x01e9 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ SQLException -> 0x01e9 }
            r3.d(r5, r8, r9, r0)     // Catch:{ SQLException -> 0x01e9 }
            int r3 = r7.length     // Catch:{ SQLException -> 0x01e9 }
            if (r3 <= 0) goto L_0x01e8
            g.f.a.e.c r3 = g.f.a.g.l.b.f3998f     // Catch:{ SQLException -> 0x01e9 }
            r3.h(r6, r7)     // Catch:{ SQLException -> 0x01e9 }
        L_0x01e8:
            throw r0     // Catch:{ SQLException -> 0x01e9 }
        L_0x01e9:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Unable to run insert stmt on object "
            r3.append(r5)
            r3.append(r2)
            java.lang.String r2 = ": "
            r3.append(r2)
            java.lang.String r2 = r4.f3999d
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.sql.SQLException r0 = e.e.i.b.j(r2, r0)
            goto L_0x020b
        L_0x020a:
            throw r0
        L_0x020b:
            goto L_0x020a
        */
        throw new UnsupportedOperationException("Method not decompiled: g.f.a.g.j.c(g.f.a.h.d, java.lang.Object, g.f.a.b.m):int");
    }

    public int d(g.f.a.h.d dVar, T t, m mVar) throws SQLException {
        if (this.f3989g == null) {
            g.f.a.c.c cVar = this.a;
            g.f.a.i.c<T, ID> cVar2 = this.b;
            int i2 = g.f.a.g.l.d.f4005g;
            g.f.a.d.i iVar = cVar2.f4020g;
            if (iVar != null) {
                StringBuilder sb = new StringBuilder(64);
                g.f.a.g.l.b.c(cVar, sb, "DELETE FROM ", cVar2.f4017d);
                sb.append("WHERE ");
                g.f.a.g.l.b.b(cVar, sb, iVar, (List<g.f.a.d.i>) null);
                sb.append("= ?");
                this.f3989g = new g.f.a.g.l.d<>(cVar2, sb.toString(), new g.f.a.d.i[]{iVar});
            } else {
                StringBuilder i3 = g.a.a.a.a.i("Cannot delete from ");
                i3.append(cVar2.c);
                i3.append(" because it doesn't have an id field");
                throw new SQLException(i3.toString());
            }
        }
        g.f.a.g.l.d<T, ID> dVar2 = this.f3989g;
        Objects.requireNonNull(dVar2);
        try {
            Object[] d2 = dVar2.d(t);
            int g2 = ((g.f.a.a.c) dVar).g(dVar2.f3999d, d2, dVar2.f4000e, "deleted");
            g.f.a.g.l.b.f3998f.d("delete data with statement '{}' and {} args, changed {} rows", dVar2.f3999d, Integer.valueOf(d2.length), Integer.valueOf(g2));
            if (d2.length > 0) {
                g.f.a.g.l.b.f3998f.h("delete arguments: {}", d2);
            }
            if (this.c != null && !this.f3990h.get().booleanValue()) {
                this.c.s();
            }
            return g2;
        } catch (SQLException e2) {
            throw e.e.i.b.j("Unable to run delete stmt on object " + t + ": " + dVar2.f3999d, e2);
        }
    }

    public int e(g.f.a.h.d dVar, String str, String[] strArr) throws SQLException {
        f3984i.b("running raw execute statement: {}", str);
        if (strArr.length > 0) {
            f3984i.h("execute arguments: {}", strArr);
        }
        g.f.a.h.b b2 = ((g.f.a.a.c) dVar).b(str, i.a.EXECUTE, f3985j, -1, false);
        int i2 = 0;
        while (i2 < strArr.length) {
            try {
                ((g.f.a.a.a) b2).d(i2, strArr[i2], k.STRING);
                i2++;
            } catch (Throwable th) {
                e.e.i.b.d(b2, "compiled statement");
                throw th;
            }
        }
        int a2 = ((g.f.a.a.a) b2).a();
        e.e.i.b.d(b2, "compiled statement");
        return a2;
    }

    public final void f() throws SQLException {
        if (this.f3986d == null) {
            this.f3986d = new f(this.a, this.b, this.c).f((Long) null, true);
        }
    }

    public List<T> g(g.f.a.h.c cVar, e<T> eVar, m mVar) throws SQLException {
        h<T, ID> b2 = b((g.f.a.b.a) null, cVar, eVar, mVar, -1);
        try {
            ArrayList arrayList = new ArrayList();
            while (b2.a()) {
                arrayList.add(b2.b());
            }
            f3984i.c("query of '{}' returned {} results", ((g.f.a.g.l.e) eVar).f3999d, Integer.valueOf(arrayList.size()));
            return arrayList;
        } finally {
            e.e.i.b.d(b2, "iterator");
        }
    }

    public int h(g.f.a.h.d dVar, T t, m mVar) throws SQLException {
        int i2;
        Object obj;
        g.f.a.d.i[] iVarArr;
        List list;
        boolean z;
        T t2 = t;
        if (this.f3988f == null) {
            g.f.a.c.c cVar = this.a;
            g.f.a.i.c<T, ID> cVar2 = this.b;
            int i3 = g.f.a.g.l.g.f4009i;
            g.f.a.d.i iVar = cVar2.f4020g;
            if (iVar != null) {
                StringBuilder sb = new StringBuilder(64);
                g.f.a.g.l.b.c(cVar, sb, "UPDATE ", cVar2.f4017d);
                g.f.a.d.i iVar2 = null;
                int i4 = -1;
                int i5 = 0;
                for (g.f.a.d.i iVar3 : cVar2.f4018e) {
                    if (g.f.a.g.l.g.e(iVar3, iVar)) {
                        if (iVar3.f3876e.C) {
                            i4 = i5;
                            iVar2 = iVar3;
                        }
                        i5++;
                    }
                }
                int i6 = i5 + 1;
                if (iVar2 != null) {
                    i6++;
                }
                g.f.a.d.i[] iVarArr2 = new g.f.a.d.i[i6];
                g.f.a.d.i[] iVarArr3 = cVar2.f4018e;
                int length = iVarArr3.length;
                int i7 = 0;
                int i8 = 0;
                boolean z2 = true;
                while (i7 < length) {
                    g.f.a.d.i iVar4 = iVarArr3[i7];
                    if (!g.f.a.g.l.g.e(iVar4, iVar)) {
                        iVarArr = iVarArr3;
                    } else {
                        if (z2) {
                            sb.append("SET ");
                            list = null;
                            iVarArr = iVarArr3;
                            z = false;
                        } else {
                            iVarArr = iVarArr3;
                            sb.append(", ");
                            boolean z3 = z2;
                            list = null;
                            z = z3;
                        }
                        g.f.a.g.l.b.b(cVar, sb, iVar4, list);
                        iVarArr2[i8] = iVar4;
                        sb.append("= ?");
                        i8++;
                        z2 = z;
                    }
                    i7++;
                    iVarArr3 = iVarArr;
                }
                sb.append(' ');
                sb.append("WHERE ");
                g.f.a.g.l.b.b(cVar, sb, iVar, (List<g.f.a.d.i>) null);
                sb.append("= ?");
                int i9 = i8 + 1;
                iVarArr2[i8] = iVar;
                if (iVar2 != null) {
                    sb.append(" AND ");
                    g.f.a.g.l.b.b(cVar, sb, iVar2, (List<g.f.a.d.i>) null);
                    sb.append("= ?");
                    iVarArr2[i9] = iVar2;
                }
                this.f3988f = new g.f.a.g.l.g(cVar2, sb.toString(), iVarArr2, iVar2, i4);
            } else {
                StringBuilder i10 = g.a.a.a.a.i("Cannot update ");
                i10.append(cVar2.c);
                i10.append(" because it doesn't have an id field");
                throw new SQLException(i10.toString());
            }
        }
        g.f.a.g.l.g<T, ID> gVar = this.f3988f;
        Objects.requireNonNull(gVar);
        try {
            if (gVar.f4000e.length <= 1) {
                i2 = 0;
            } else {
                Object[] d2 = gVar.d(t2);
                g.f.a.d.i iVar5 = gVar.f4010g;
                if (iVar5 != null) {
                    Object e2 = iVar5.e(t2);
                    g.f.a.d.b bVar = gVar.f4010g.f3883l;
                    obj = bVar == null ? null : bVar.q(e2);
                    d2[gVar.f4011h] = gVar.f4010g.d(obj);
                } else {
                    obj = null;
                }
                int g2 = ((g.f.a.a.c) dVar).g(gVar.f3999d, d2, gVar.f4000e, "updated");
                if (g2 > 0 && obj != null) {
                    gVar.f4010g.b(t2, obj, false, (m) null);
                }
                g.f.a.g.l.b.f3998f.d("update data with statement '{}' and {} args, changed {} rows", gVar.f3999d, Integer.valueOf(d2.length), Integer.valueOf(g2));
                if (d2.length > 0) {
                    g.f.a.g.l.b.f3998f.h("update arguments: {}", d2);
                }
                i2 = g2;
            }
            if (this.c != null && !this.f3990h.get().booleanValue()) {
                this.c.s();
            }
            return i2;
        } catch (SQLException e3) {
            throw e.e.i.b.j("Unable to run update stmt on object " + t2 + ": " + gVar.f3999d, e3);
        }
    }
}
