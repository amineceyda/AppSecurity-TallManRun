package g.e.a.a.f.z.i;

import g.e.a.a.f.x.a.a;
import g.e.a.a.f.z.i.h0;
import java.util.Map;

public final /* synthetic */ class n implements h0.b {
    public final /* synthetic */ h0 a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ a.C0104a c;

    public /* synthetic */ n(h0 h0Var, Map map, a.C0104a aVar) {
        this.a = h0Var;
        this.b = map;
        this.c = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0079 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r10) {
        /*
            r9 = this;
            g.e.a.a.f.z.i.h0 r0 = r9.a
            java.util.Map r1 = r9.b
            g.e.a.a.f.x.a.a$a r2 = r9.c
            android.database.Cursor r10 = (android.database.Cursor) r10
            java.util.Objects.requireNonNull(r0)
            g.e.a.a.f.x.a.c$a r3 = g.e.a.a.f.x.a.c.a.REASON_UNKNOWN
        L_0x000d:
            boolean r4 = r10.moveToNext()
            if (r4 == 0) goto L_0x008a
            r4 = 0
            java.lang.String r4 = r10.getString(r4)
            r5 = 1
            int r5 = r10.getInt(r5)
            int r6 = r3.a()
            if (r5 != r6) goto L_0x0024
            goto L_0x0065
        L_0x0024:
            g.e.a.a.f.x.a.c$a r6 = g.e.a.a.f.x.a.c.a.MESSAGE_TOO_OLD
            int r7 = r6.a()
            if (r5 != r7) goto L_0x002d
            goto L_0x0066
        L_0x002d:
            g.e.a.a.f.x.a.c$a r6 = g.e.a.a.f.x.a.c.a.CACHE_FULL
            int r7 = r6.a()
            if (r5 != r7) goto L_0x0036
            goto L_0x0066
        L_0x0036:
            g.e.a.a.f.x.a.c$a r6 = g.e.a.a.f.x.a.c.a.PAYLOAD_TOO_BIG
            int r7 = r6.a()
            if (r5 != r7) goto L_0x003f
            goto L_0x0066
        L_0x003f:
            g.e.a.a.f.x.a.c$a r6 = g.e.a.a.f.x.a.c.a.MAX_RETRIES_REACHED
            int r7 = r6.a()
            if (r5 != r7) goto L_0x0048
            goto L_0x0066
        L_0x0048:
            g.e.a.a.f.x.a.c$a r6 = g.e.a.a.f.x.a.c.a.INVALID_PAYLOD
            int r7 = r6.a()
            if (r5 != r7) goto L_0x0051
            goto L_0x0066
        L_0x0051:
            g.e.a.a.f.x.a.c$a r6 = g.e.a.a.f.x.a.c.a.SERVER_ERROR
            int r7 = r6.a()
            if (r5 != r7) goto L_0x005a
            goto L_0x0066
        L_0x005a:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "SQLiteEventStore"
            java.lang.String r7 = "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN"
            e.e.d.l.a.t(r6, r7, r5)
        L_0x0065:
            r6 = r3
        L_0x0066:
            r5 = 2
            long r7 = r10.getLong(r5)
            boolean r5 = r1.containsKey(r4)
            if (r5 != 0) goto L_0x0079
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r1.put(r4, r5)
        L_0x0079:
            java.lang.Object r4 = r1.get(r4)
            java.util.List r4 = (java.util.List) r4
            int r5 = g.e.a.a.f.x.a.c.c
            g.e.a.a.f.x.a.c r5 = new g.e.a.a.f.x.a.c
            r5.<init>(r7, r6)
            r4.add(r5)
            goto L_0x000d
        L_0x008a:
            java.util.Set r10 = r1.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x0092:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x00c0
            java.lang.Object r1 = r10.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            int r3 = g.e.a.a.f.x.a.d.c
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            g.e.a.a.f.x.a.d r4 = new g.e.a.a.f.x.a.d
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r4.<init>(r3, r1)
            java.util.List<g.e.a.a.f.x.a.d> r1 = r2.b
            r1.add(r4)
            goto L_0x0092
        L_0x00c0:
            g.e.a.a.f.b0.a r10 = r0.c
            long r3 = r10.a()
            g.e.a.a.f.z.i.k r10 = new g.e.a.a.f.z.i.k
            r10.<init>(r3)
            java.lang.Object r10 = r0.k(r10)
            g.e.a.a.f.x.a.f r10 = (g.e.a.a.f.x.a.f) r10
            r2.a = r10
            int r10 = g.e.a.a.f.x.a.b.b
            int r10 = g.e.a.a.f.x.a.e.c
            android.database.sqlite.SQLiteDatabase r10 = r0.g()
            java.lang.String r1 = "PRAGMA page_count"
            android.database.sqlite.SQLiteStatement r10 = r10.compileStatement(r1)
            long r3 = r10.simpleQueryForLong()
            android.database.sqlite.SQLiteDatabase r10 = r0.g()
            java.lang.String r1 = "PRAGMA page_size"
            android.database.sqlite.SQLiteStatement r10 = r10.compileStatement(r1)
            long r5 = r10.simpleQueryForLong()
            long r5 = r5 * r3
            g.e.a.a.f.z.i.b0 r10 = g.e.a.a.f.z.i.b0.a
            long r3 = r10.e()
            g.e.a.a.f.x.a.e r10 = new g.e.a.a.f.x.a.e
            r10.<init>(r5, r3)
            g.e.a.a.f.x.a.b r1 = new g.e.a.a.f.x.a.b
            r1.<init>(r10)
            r2.c = r1
            g.e.a.a.f.w.a<java.lang.String> r10 = r0.f2823f
            java.lang.Object r10 = r10.get()
            java.lang.String r10 = (java.lang.String) r10
            r2.f2784d = r10
            g.e.a.a.f.x.a.a r10 = new g.e.a.a.f.x.a.a
            g.e.a.a.f.x.a.f r0 = r2.a
            java.util.List<g.e.a.a.f.x.a.d> r1 = r2.b
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            g.e.a.a.f.x.a.b r3 = r2.c
            java.lang.String r2 = r2.f2784d
            r10.<init>(r0, r1, r3, r2)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.a.f.z.i.n.a(java.lang.Object):java.lang.Object");
    }
}
