package g.e.a.b.f.b;

import java.util.Map;
import java.util.Set;

public final class ca extends b9 {

    /* renamed from: d  reason: collision with root package name */
    public String f3120d;

    /* renamed from: e  reason: collision with root package name */
    public Set f3121e;

    /* renamed from: f  reason: collision with root package name */
    public Map f3122f;

    /* renamed from: g  reason: collision with root package name */
    public Long f3123g;

    /* renamed from: h  reason: collision with root package name */
    public Long f3124h;

    public ca(k9 k9Var) {
        super(k9Var);
    }

    public final boolean k() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02fc, code lost:
        if (r5 != null) goto L_0x02fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x070d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0713, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0714, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0734, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x073f, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x08e7, code lost:
        if (r13 == null) goto L_0x08ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0a15, code lost:
        if (r7 != false) goto L_0x0a20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x016c, code lost:
        if (r5 != null) goto L_0x016e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03cd  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0594  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0713 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:239:0x0676] */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0734  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x073f  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x075b  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x07fd  */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x08f4  */
    /* JADX WARNING: Removed duplicated region for block: B:402:0x0a46  */
    /* JADX WARNING: Removed duplicated region for block: B:419:0x0ada  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01af A[Catch:{ SQLiteException -> 0x0221 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01bd A[SYNTHETIC, Splitter:B:65:0x01bd] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0248  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List l(java.lang.String r64, java.util.List r65, java.util.List r66, java.lang.Long r67, java.lang.Long r68) {
        /*
            r63 = this;
            r9 = r63
            java.lang.String r10 = "current_results"
            g.c.b.b.f.k(r64)
            g.c.b.b.f.n(r65)
            g.c.b.b.f.n(r66)
            r0 = r64
            r9.f3120d = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r9.f3121e = r0
            e.d.a r0 = new e.d.a
            r0.<init>()
            r9.f3122f = r0
            r0 = r67
            r9.f3123g = r0
            r0 = r68
            r9.f3124h = r0
            java.util.Iterator r0 = r65.iterator()
        L_0x002b:
            boolean r1 = r0.hasNext()
            r11 = 0
            r12 = 1
            if (r1 == 0) goto L_0x0047
            java.lang.Object r1 = r0.next()
            g.e.a.b.e.c.v3 r1 = (g.e.a.b.e.c.v3) r1
            java.lang.String r1 = r1.z()
            java.lang.String r2 = "_s"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x002b
            r1 = 1
            goto L_0x0048
        L_0x0047:
            r1 = 0
        L_0x0048:
            g.e.a.b.e.c.jb.b()
            g.e.a.b.f.b.n4 r0 = r9.a
            g.e.a.b.f.b.f r0 = r0.o()
            java.lang.String r2 = r9.f3120d
            g.e.a.b.f.b.r2 r3 = g.e.a.b.f.b.s2.X
            boolean r13 = r0.u(r2, r3)
            g.e.a.b.e.c.jb.b()
            g.e.a.b.f.b.n4 r0 = r9.a
            g.e.a.b.f.b.f r0 = r0.o()
            java.lang.String r2 = r9.f3120d
            g.e.a.b.f.b.r2 r3 = g.e.a.b.f.b.s2.W
            boolean r14 = r0.u(r2, r3)
            if (r1 == 0) goto L_0x00af
            g.e.a.b.f.b.k9 r0 = r9.b
            g.e.a.b.f.b.k r2 = r0.M()
            java.lang.String r3 = r9.f3120d
            r2.i()
            r2.h()
            g.c.b.b.f.k(r3)
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            java.lang.String r5 = "current_session_count"
            r0.put(r5, r4)
            android.database.sqlite.SQLiteDatabase r4 = r2.A()     // Catch:{ SQLiteException -> 0x009b }
            java.lang.String[] r5 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x009b }
            r5[r11] = r3     // Catch:{ SQLiteException -> 0x009b }
            java.lang.String r6 = "events"
            java.lang.String r7 = "app_id = ?"
            r4.update(r6, r0, r7, r5)     // Catch:{ SQLiteException -> 0x009b }
            goto L_0x00af
        L_0x009b:
            r0 = move-exception
            g.e.a.b.f.b.n4 r2 = r2.a
            g.e.a.b.f.b.f3 r2 = r2.d()
            g.e.a.b.f.b.d3 r2 = r2.p()
            java.lang.Object r3 = g.e.a.b.f.b.f3.t(r3)
            java.lang.String r4 = "Error resetting session-scoped event counts. appId"
            r2.c(r4, r3, r0)
        L_0x00af:
            java.util.Map r0 = java.util.Collections.emptyMap()
            java.lang.String r15 = "Failed to merge filter. appId"
            java.lang.String r8 = "Database error querying filters. appId"
            java.lang.String r7 = "data"
            java.lang.String r6 = "audience_id"
            if (r14 == 0) goto L_0x0179
            if (r13 == 0) goto L_0x0179
            g.e.a.b.f.b.k9 r0 = r9.b
            g.e.a.b.f.b.k r2 = r0.M()
            java.lang.String r3 = r9.f3120d
            g.c.b.b.f.k(r3)
            e.d.a r4 = new e.d.a
            r4.<init>()
            android.database.sqlite.SQLiteDatabase r16 = r2.A()
            java.lang.String[] r18 = new java.lang.String[]{r6, r7}     // Catch:{ SQLiteException -> 0x0155, all -> 0x0152 }
            java.lang.String[] r0 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0155, all -> 0x0152 }
            r0[r11] = r3     // Catch:{ SQLiteException -> 0x0155, all -> 0x0152 }
            java.lang.String r17 = "event_filters"
            java.lang.String r19 = "app_id=?"
            r21 = 0
            r22 = 0
            r23 = 0
            r20 = r0
            android.database.Cursor r5 = r16.query(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ SQLiteException -> 0x0155, all -> 0x0152 }
            boolean r0 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x0150 }
            if (r0 == 0) goto L_0x014b
        L_0x00f1:
            byte[] r0 = r5.getBlob(r12)     // Catch:{ SQLiteException -> 0x0150 }
            g.e.a.b.e.c.q2 r12 = g.e.a.b.e.c.r2.u()     // Catch:{ IOException -> 0x012b }
            g.e.a.b.e.c.g6 r0 = g.e.a.b.f.b.m9.B(r12, r0)     // Catch:{ IOException -> 0x012b }
            g.e.a.b.e.c.q2 r0 = (g.e.a.b.e.c.q2) r0     // Catch:{ IOException -> 0x012b }
            g.e.a.b.e.c.o7 r0 = r0.j()     // Catch:{ IOException -> 0x012b }
            g.e.a.b.e.c.r2 r0 = (g.e.a.b.e.c.r2) r0     // Catch:{ IOException -> 0x012b }
            boolean r12 = r0.F()     // Catch:{ SQLiteException -> 0x0150 }
            if (r12 != 0) goto L_0x010c
            goto L_0x013d
        L_0x010c:
            int r12 = r5.getInt(r11)     // Catch:{ SQLiteException -> 0x0150 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ SQLiteException -> 0x0150 }
            java.lang.Object r16 = r4.get(r12)     // Catch:{ SQLiteException -> 0x0150 }
            java.util.List r16 = (java.util.List) r16     // Catch:{ SQLiteException -> 0x0150 }
            if (r16 != 0) goto L_0x0125
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0150 }
            r11.<init>()     // Catch:{ SQLiteException -> 0x0150 }
            r4.put(r12, r11)     // Catch:{ SQLiteException -> 0x0150 }
            goto L_0x0127
        L_0x0125:
            r11 = r16
        L_0x0127:
            r11.add(r0)     // Catch:{ SQLiteException -> 0x0150 }
            goto L_0x013d
        L_0x012b:
            r0 = move-exception
            g.e.a.b.f.b.n4 r11 = r2.a     // Catch:{ SQLiteException -> 0x0150 }
            g.e.a.b.f.b.f3 r11 = r11.d()     // Catch:{ SQLiteException -> 0x0150 }
            g.e.a.b.f.b.d3 r11 = r11.p()     // Catch:{ SQLiteException -> 0x0150 }
            java.lang.Object r12 = g.e.a.b.f.b.f3.t(r3)     // Catch:{ SQLiteException -> 0x0150 }
            r11.c(r15, r12, r0)     // Catch:{ SQLiteException -> 0x0150 }
        L_0x013d:
            boolean r0 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x0150 }
            if (r0 != 0) goto L_0x0148
            r5.close()
            r11 = r4
            goto L_0x017a
        L_0x0148:
            r11 = 0
            r12 = 1
            goto L_0x00f1
        L_0x014b:
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0150 }
            goto L_0x016e
        L_0x0150:
            r0 = move-exception
            goto L_0x0157
        L_0x0152:
            r0 = move-exception
            r5 = 0
            goto L_0x0173
        L_0x0155:
            r0 = move-exception
            r5 = 0
        L_0x0157:
            g.e.a.b.f.b.n4 r2 = r2.a     // Catch:{ all -> 0x0172 }
            g.e.a.b.f.b.f3 r2 = r2.d()     // Catch:{ all -> 0x0172 }
            g.e.a.b.f.b.d3 r2 = r2.p()     // Catch:{ all -> 0x0172 }
            java.lang.Object r3 = g.e.a.b.f.b.f3.t(r3)     // Catch:{ all -> 0x0172 }
            r2.c(r8, r3, r0)     // Catch:{ all -> 0x0172 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0172 }
            if (r5 == 0) goto L_0x0179
        L_0x016e:
            r5.close()
            goto L_0x0179
        L_0x0172:
            r0 = move-exception
        L_0x0173:
            if (r5 == 0) goto L_0x0178
            r5.close()
        L_0x0178:
            throw r0
        L_0x0179:
            r11 = r0
        L_0x017a:
            g.e.a.b.f.b.k9 r0 = r9.b
            g.e.a.b.f.b.k r2 = r0.M()
            java.lang.String r3 = r9.f3120d
            r2.i()
            r2.h()
            g.c.b.b.f.k(r3)
            android.database.sqlite.SQLiteDatabase r16 = r2.A()
            java.lang.String[] r18 = new java.lang.String[]{r6, r10}     // Catch:{ SQLiteException -> 0x0229, all -> 0x0225 }
            r4 = 1
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0229, all -> 0x0225 }
            r4 = 0
            r0[r4] = r3     // Catch:{ SQLiteException -> 0x0229, all -> 0x0225 }
            java.lang.String r17 = "audience_filter_values"
            java.lang.String r19 = "app_id=?"
            r21 = 0
            r22 = 0
            r23 = 0
            r20 = r0
            android.database.Cursor r4 = r16.query(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ SQLiteException -> 0x0229, all -> 0x0225 }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0221 }
            if (r0 != 0) goto L_0x01bd
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0221 }
            r4.close()
            r12 = r0
            r18 = r6
            r19 = r7
            goto L_0x024c
        L_0x01bd:
            e.d.a r5 = new e.d.a     // Catch:{ SQLiteException -> 0x0221 }
            r5.<init>()     // Catch:{ SQLiteException -> 0x0221 }
        L_0x01c2:
            r12 = 0
            int r16 = r4.getInt(r12)     // Catch:{ SQLiteException -> 0x0221 }
            r12 = 1
            byte[] r0 = r4.getBlob(r12)     // Catch:{ SQLiteException -> 0x0221 }
            g.e.a.b.e.c.k4 r12 = g.e.a.b.e.c.l4.x()     // Catch:{ IOException -> 0x01ea }
            g.e.a.b.e.c.g6 r0 = g.e.a.b.f.b.m9.B(r12, r0)     // Catch:{ IOException -> 0x01ea }
            g.e.a.b.e.c.k4 r0 = (g.e.a.b.e.c.k4) r0     // Catch:{ IOException -> 0x01ea }
            g.e.a.b.e.c.o7 r0 = r0.j()     // Catch:{ IOException -> 0x01ea }
            g.e.a.b.e.c.l4 r0 = (g.e.a.b.e.c.l4) r0     // Catch:{ IOException -> 0x01ea }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r16)     // Catch:{ SQLiteException -> 0x0221 }
            r5.put(r12, r0)     // Catch:{ SQLiteException -> 0x0221 }
            r17 = r5
            r18 = r6
            r19 = r7
            goto L_0x0208
        L_0x01ea:
            r0 = move-exception
            g.e.a.b.f.b.n4 r12 = r2.a     // Catch:{ SQLiteException -> 0x0221 }
            g.e.a.b.f.b.f3 r12 = r12.d()     // Catch:{ SQLiteException -> 0x0221 }
            g.e.a.b.f.b.d3 r12 = r12.p()     // Catch:{ SQLiteException -> 0x0221 }
            r17 = r5
            java.lang.String r5 = "Failed to merge filter results. appId, audienceId, error"
            r18 = r6
            java.lang.Object r6 = g.e.a.b.f.b.f3.t(r3)     // Catch:{ SQLiteException -> 0x021d }
            r19 = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r16)     // Catch:{ SQLiteException -> 0x021b }
            r12.d(r5, r6, r7, r0)     // Catch:{ SQLiteException -> 0x021b }
        L_0x0208:
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x021b }
            if (r0 != 0) goto L_0x0214
            r4.close()
            r12 = r17
            goto L_0x024c
        L_0x0214:
            r5 = r17
            r6 = r18
            r7 = r19
            goto L_0x01c2
        L_0x021b:
            r0 = move-exception
            goto L_0x022f
        L_0x021d:
            r0 = move-exception
        L_0x021e:
            r19 = r7
            goto L_0x022f
        L_0x0221:
            r0 = move-exception
            r18 = r6
            goto L_0x021e
        L_0x0225:
            r0 = move-exception
            r5 = 0
            goto L_0x0ad8
        L_0x0229:
            r0 = move-exception
            r18 = r6
            r19 = r7
            r4 = 0
        L_0x022f:
            g.e.a.b.f.b.n4 r2 = r2.a     // Catch:{ all -> 0x0ad6 }
            g.e.a.b.f.b.f3 r2 = r2.d()     // Catch:{ all -> 0x0ad6 }
            g.e.a.b.f.b.d3 r2 = r2.p()     // Catch:{ all -> 0x0ad6 }
            java.lang.String r5 = "Database error querying filter results. appId"
            java.lang.Object r3 = g.e.a.b.f.b.f3.t(r3)     // Catch:{ all -> 0x0ad6 }
            r2.c(r5, r3, r0)     // Catch:{ all -> 0x0ad6 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0ad6 }
            if (r4 == 0) goto L_0x024b
            r4.close()
        L_0x024b:
            r12 = r0
        L_0x024c:
            boolean r0 = r12.isEmpty()
            r7 = 2
            if (r0 == 0) goto L_0x025e
        L_0x0253:
            r28 = r8
            r23 = r10
            r11 = r18
            r12 = r19
            r13 = 2
            goto L_0x0584
        L_0x025e:
            java.util.HashSet r2 = new java.util.HashSet
            java.util.Set r0 = r12.keySet()
            r2.<init>(r0)
            if (r1 == 0) goto L_0x03d1
            java.lang.String r1 = r9.f3120d
            g.c.b.b.f.k(r1)
            g.c.b.b.f.n(r12)
            e.d.a r3 = new e.d.a
            r3.<init>()
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x027e
            goto L_0x03c8
        L_0x027e:
            g.e.a.b.f.b.k9 r0 = r9.b
            g.e.a.b.f.b.k r4 = r0.M()
            r4.i()
            r4.h()
            g.c.b.b.f.k(r1)
            e.d.a r0 = new e.d.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r5 = r4.A()
            java.lang.String[] r6 = new java.lang.String[r7]     // Catch:{ SQLiteException -> 0x02e3, all -> 0x02df }
            r16 = 0
            r6[r16] = r1     // Catch:{ SQLiteException -> 0x02e3, all -> 0x02df }
            r16 = 1
            r6[r16] = r1     // Catch:{ SQLiteException -> 0x02e3, all -> 0x02df }
            java.lang.String r7 = "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
            android.database.Cursor r5 = r5.rawQuery(r7, r6)     // Catch:{ SQLiteException -> 0x02e3, all -> 0x02df }
            boolean r6 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x02dd }
            if (r6 == 0) goto L_0x02d8
        L_0x02ac:
            r6 = 0
            int r7 = r5.getInt(r6)     // Catch:{ SQLiteException -> 0x02dd }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch:{ SQLiteException -> 0x02dd }
            java.lang.Object r7 = r0.get(r6)     // Catch:{ SQLiteException -> 0x02dd }
            java.util.List r7 = (java.util.List) r7     // Catch:{ SQLiteException -> 0x02dd }
            if (r7 != 0) goto L_0x02c5
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x02dd }
            r7.<init>()     // Catch:{ SQLiteException -> 0x02dd }
            r0.put(r6, r7)     // Catch:{ SQLiteException -> 0x02dd }
        L_0x02c5:
            r6 = 1
            int r17 = r5.getInt(r6)     // Catch:{ SQLiteException -> 0x02dd }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r17)     // Catch:{ SQLiteException -> 0x02dd }
            r7.add(r6)     // Catch:{ SQLiteException -> 0x02dd }
            boolean r6 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x02dd }
            if (r6 != 0) goto L_0x02ac
            goto L_0x02fe
        L_0x02d8:
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x02dd }
            goto L_0x02fe
        L_0x02dd:
            r0 = move-exception
            goto L_0x02e5
        L_0x02df:
            r0 = move-exception
            r5 = 0
            goto L_0x03cb
        L_0x02e3:
            r0 = move-exception
            r5 = 0
        L_0x02e5:
            g.e.a.b.f.b.n4 r4 = r4.a     // Catch:{ all -> 0x03ca }
            g.e.a.b.f.b.f3 r4 = r4.d()     // Catch:{ all -> 0x03ca }
            g.e.a.b.f.b.d3 r4 = r4.p()     // Catch:{ all -> 0x03ca }
            java.lang.String r6 = "Database error querying scoped filters. appId"
            java.lang.Object r1 = g.e.a.b.f.b.f3.t(r1)     // Catch:{ all -> 0x03ca }
            r4.c(r6, r1, r0)     // Catch:{ all -> 0x03ca }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x03ca }
            if (r5 == 0) goto L_0x0301
        L_0x02fe:
            r5.close()
        L_0x0301:
            java.util.Set r1 = r12.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0309:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x03c8
            java.lang.Object r4 = r1.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.Object r6 = r12.get(r5)
            g.e.a.b.e.c.l4 r6 = (g.e.a.b.e.c.l4) r6
            java.lang.Object r7 = r0.get(r5)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x03bb
            boolean r17 = r7.isEmpty()
            if (r17 == 0) goto L_0x0333
            goto L_0x03bb
        L_0x0333:
            g.e.a.b.f.b.k9 r5 = r9.b
            g.e.a.b.f.b.m9 r5 = r5.P()
            r17 = r0
            java.util.List r0 = r6.C()
            java.util.List r0 = r5.E(r0, r7)
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L_0x03b7
            g.e.a.b.e.c.l7 r5 = r6.n()
            g.e.a.b.e.c.k4 r5 = (g.e.a.b.e.c.k4) r5
            r5.n()
            r5.l(r0)
            g.e.a.b.f.b.k9 r0 = r9.b
            g.e.a.b.f.b.m9 r0 = r0.P()
            r20 = r1
            java.util.List r1 = r6.E()
            java.util.List r0 = r0.E(r1, r7)
            r5.o()
            r5.m(r0)
            r0 = 0
        L_0x036c:
            int r1 = r6.s()
            if (r0 >= r1) goto L_0x038a
            g.e.a.b.e.c.t3 r1 = r6.w(r0)
            int r1 = r1.s()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = r7.contains(r1)
            if (r1 == 0) goto L_0x0387
            r5.p(r0)
        L_0x0387:
            int r0 = r0 + 1
            goto L_0x036c
        L_0x038a:
            r0 = 0
        L_0x038b:
            int r1 = r6.u()
            if (r0 >= r1) goto L_0x03a9
            g.e.a.b.e.c.n4 r1 = r6.A(r0)
            int r1 = r1.t()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = r7.contains(r1)
            if (r1 == 0) goto L_0x03a6
            r5.q(r0)
        L_0x03a6:
            int r0 = r0 + 1
            goto L_0x038b
        L_0x03a9:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            g.e.a.b.e.c.o7 r1 = r5.j()
            g.e.a.b.e.c.l4 r1 = (g.e.a.b.e.c.l4) r1
            r3.put(r0, r1)
            goto L_0x03c2
        L_0x03b7:
            r0 = r17
            goto L_0x0309
        L_0x03bb:
            r17 = r0
            r20 = r1
            r3.put(r5, r6)
        L_0x03c2:
            r0 = r17
            r1 = r20
            goto L_0x0309
        L_0x03c8:
            r0 = r3
            goto L_0x03d2
        L_0x03ca:
            r0 = move-exception
        L_0x03cb:
            if (r5 == 0) goto L_0x03d0
            r5.close()
        L_0x03d0:
            throw r0
        L_0x03d1:
            r0 = r12
        L_0x03d2:
            java.util.Iterator r17 = r2.iterator()
        L_0x03d6:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x0253
            java.lang.Object r1 = r17.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r20 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            java.lang.Object r1 = r0.get(r1)
            g.e.a.b.e.c.l4 r1 = (g.e.a.b.e.c.l4) r1
            java.util.BitSet r5 = new java.util.BitSet
            r5.<init>()
            java.util.BitSet r6 = new java.util.BitSet
            r6.<init>()
            e.d.a r7 = new e.d.a
            r7.<init>()
            if (r1 == 0) goto L_0x043e
            int r2 = r1.s()
            if (r2 != 0) goto L_0x0408
            goto L_0x043e
        L_0x0408:
            java.util.List r2 = r1.B()
            java.util.Iterator r2 = r2.iterator()
        L_0x0410:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x043e
            java.lang.Object r3 = r2.next()
            g.e.a.b.e.c.t3 r3 = (g.e.a.b.e.c.t3) r3
            boolean r4 = r3.z()
            if (r4 == 0) goto L_0x0410
            int r4 = r3.s()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r21 = r3.y()
            if (r21 == 0) goto L_0x0439
            long r21 = r3.t()
            java.lang.Long r3 = java.lang.Long.valueOf(r21)
            goto L_0x043a
        L_0x0439:
            r3 = 0
        L_0x043a:
            r7.put(r4, r3)
            goto L_0x0410
        L_0x043e:
            e.d.a r4 = new e.d.a
            r4.<init>()
            if (r1 == 0) goto L_0x048e
            int r2 = r1.u()
            if (r2 != 0) goto L_0x044c
            goto L_0x048e
        L_0x044c:
            java.util.List r2 = r1.D()
            java.util.Iterator r2 = r2.iterator()
        L_0x0454:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x048e
            java.lang.Object r3 = r2.next()
            g.e.a.b.e.c.n4 r3 = (g.e.a.b.e.c.n4) r3
            boolean r21 = r3.A()
            if (r21 == 0) goto L_0x0454
            int r21 = r3.s()
            if (r21 <= 0) goto L_0x0454
            int r21 = r3.t()
            r22 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            int r21 = r3.s()
            r23 = r2
            int r2 = r21 + -1
            long r2 = r3.u(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r4.put(r0, r2)
            r0 = r22
            r2 = r23
            goto L_0x0454
        L_0x048e:
            r22 = r0
            if (r1 == 0) goto L_0x04e3
            r0 = 0
        L_0x0493:
            int r2 = r1.v()
            int r2 = r2 * 64
            if (r0 >= r2) goto L_0x04e3
            java.util.List r2 = r1.E()
            boolean r2 = g.e.a.b.f.b.m9.J(r2, r0)
            if (r2 == 0) goto L_0x04d1
            g.e.a.b.f.b.n4 r2 = r9.a
            g.e.a.b.f.b.f3 r2 = r2.d()
            g.e.a.b.f.b.d3 r2 = r2.q()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            r21 = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r23 = r10
            java.lang.String r10 = "Filter already evaluated. audience ID, filter ID"
            r2.c(r10, r3, r8)
            r6.set(r0)
            java.util.List r2 = r1.C()
            boolean r2 = g.e.a.b.f.b.m9.J(r2, r0)
            if (r2 == 0) goto L_0x04d5
            r5.set(r0)
            goto L_0x04dc
        L_0x04d1:
            r21 = r8
            r23 = r10
        L_0x04d5:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r7.remove(r2)
        L_0x04dc:
            int r0 = r0 + 1
            r8 = r21
            r10 = r23
            goto L_0x0493
        L_0x04e3:
            r21 = r8
            r23 = r10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            java.lang.Object r1 = r12.get(r0)
            r8 = r1
            g.e.a.b.e.c.l4 r8 = (g.e.a.b.e.c.l4) r8
            if (r14 == 0) goto L_0x0552
            if (r13 == 0) goto L_0x0552
            java.lang.Object r0 = r11.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0552
            java.lang.Long r1 = r9.f3124h
            if (r1 == 0) goto L_0x0552
            java.lang.Long r1 = r9.f3123g
            if (r1 != 0) goto L_0x0507
            goto L_0x0552
        L_0x0507:
            java.util.Iterator r0 = r0.iterator()
        L_0x050b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0552
            java.lang.Object r1 = r0.next()
            g.e.a.b.e.c.r2 r1 = (g.e.a.b.e.c.r2) r1
            int r2 = r1.t()
            java.lang.Long r3 = r9.f3124h
            long r24 = r3.longValue()
            r26 = 1000(0x3e8, double:4.94E-321)
            long r24 = r24 / r26
            boolean r1 = r1.D()
            if (r1 == 0) goto L_0x0533
            java.lang.Long r1 = r9.f3123g
            long r24 = r1.longValue()
            long r24 = r24 / r26
        L_0x0533:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            boolean r2 = r7.containsKey(r1)
            if (r2 == 0) goto L_0x0544
            java.lang.Long r2 = java.lang.Long.valueOf(r24)
            r7.put(r1, r2)
        L_0x0544:
            boolean r2 = r4.containsKey(r1)
            if (r2 == 0) goto L_0x050b
            java.lang.Long r2 = java.lang.Long.valueOf(r24)
            r4.put(r1, r2)
            goto L_0x050b
        L_0x0552:
            g.e.a.b.f.b.x9 r0 = new g.e.a.b.f.b.x9
            java.lang.String r3 = r9.f3120d
            r1 = r0
            r2 = r63
            r10 = r4
            r4 = r8
            r8 = 0
            r24 = r11
            r11 = r18
            r64 = r12
            r16 = r13
            r12 = r19
            r13 = 2
            r28 = r21
            r8 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            java.util.Map r1 = r9.f3122f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            r1.put(r2, r0)
            r13 = r16
            r0 = r22
            r10 = r23
            r11 = r24
            r8 = r28
            r12 = r64
            goto L_0x03d6
        L_0x0584:
            boolean r0 = r65.isEmpty()
            java.lang.String r1 = "Skipping failed audience ID"
            if (r0 == 0) goto L_0x0594
        L_0x058c:
            r18 = r11
            r19 = r12
            r12 = r28
            goto L_0x07f3
        L_0x0594:
            g.e.a.b.f.b.y9 r2 = new g.e.a.b.f.b.y9
            r2.<init>(r9)
            e.d.a r3 = new e.d.a
            r3.<init>()
            java.util.Iterator r4 = r65.iterator()
        L_0x05a2:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x058c
            java.lang.Object r0 = r4.next()
            g.e.a.b.e.c.v3 r0 = (g.e.a.b.e.c.v3) r0
            java.lang.String r5 = r9.f3120d
            g.e.a.b.e.c.v3 r5 = r2.a(r5, r0)
            if (r5 == 0) goto L_0x05a2
            g.e.a.b.f.b.k9 r6 = r9.b
            g.e.a.b.f.b.k r6 = r6.M()
            java.lang.String r7 = r9.f3120d
            java.lang.String r8 = r5.z()
            java.lang.String r10 = r0.z()
            g.e.a.b.f.b.p r10 = r6.G(r7, r10)
            if (r10 != 0) goto L_0x060b
            g.e.a.b.f.b.n4 r10 = r6.a
            g.e.a.b.f.b.f3 r10 = r10.d()
            g.e.a.b.f.b.d3 r10 = r10.r()
            java.lang.Object r14 = g.e.a.b.f.b.f3.t(r7)
            g.e.a.b.f.b.n4 r6 = r6.a
            g.e.a.b.f.b.a3 r6 = r6.s()
            java.lang.String r6 = r6.d(r8)
            java.lang.String r8 = "Event aggregate wasn't created during raw event logging. appId, event"
            r10.c(r8, r14, r6)
            g.e.a.b.f.b.p r6 = new g.e.a.b.f.b.p
            r29 = r6
            java.lang.String r31 = r0.z()
            r32 = 1
            r34 = 1
            r36 = 1
            long r38 = r0.v()
            r40 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r30 = r7
            r29.<init>(r30, r31, r32, r34, r36, r38, r40, r42, r43, r44, r45)
            goto L_0x0640
        L_0x060b:
            g.e.a.b.f.b.p r6 = new g.e.a.b.f.b.p
            r46 = r6
            java.lang.String r0 = r10.a
            r47 = r0
            java.lang.String r0 = r10.b
            r48 = r0
            long r7 = r10.c
            r16 = 1
            long r49 = r7 + r16
            long r7 = r10.f3280d
            long r51 = r7 + r16
            long r7 = r10.f3281e
            long r53 = r7 + r16
            long r7 = r10.f3282f
            r55 = r7
            long r7 = r10.f3283g
            r57 = r7
            java.lang.Long r0 = r10.f3284h
            r59 = r0
            java.lang.Long r0 = r10.f3285i
            r60 = r0
            java.lang.Long r0 = r10.f3286j
            r61 = r0
            java.lang.Boolean r0 = r10.f3287k
            r62 = r0
            r46.<init>(r47, r48, r49, r51, r53, r55, r57, r59, r60, r61, r62)
        L_0x0640:
            g.e.a.b.f.b.k9 r0 = r9.b
            g.e.a.b.f.b.k r0 = r0.M()
            r0.o(r6)
            long r7 = r6.c
            java.lang.String r10 = r5.z()
            java.lang.Object r0 = r3.get(r10)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L_0x0743
            g.e.a.b.f.b.k9 r0 = r9.b
            g.e.a.b.f.b.k r14 = r0.M()
            java.lang.String r13 = r9.f3120d
            r14.i()
            r14.h()
            g.c.b.b.f.k(r13)
            g.c.b.b.f.k(r10)
            r64 = r2
            e.d.a r2 = new e.d.a
            r2.<init>()
            android.database.sqlite.SQLiteDatabase r29 = r14.A()
            java.lang.String[] r31 = new java.lang.String[]{r11, r12}     // Catch:{ SQLiteException -> 0x0716, all -> 0x0713 }
            r65 = r4
            r4 = 2
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x070d, all -> 0x0713 }
            r4 = 0
            r0[r4] = r13     // Catch:{ SQLiteException -> 0x070d, all -> 0x0713 }
            r4 = 1
            r0[r4] = r10     // Catch:{ SQLiteException -> 0x070d, all -> 0x0713 }
            java.lang.String r30 = "event_filters"
            java.lang.String r32 = "app_id=? AND event_name=?"
            r34 = 0
            r35 = 0
            r36 = 0
            r33 = r0
            android.database.Cursor r4 = r29.query(r30, r31, r32, r33, r34, r35, r36)     // Catch:{ SQLiteException -> 0x070d, all -> 0x0713 }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0709 }
            if (r0 == 0) goto L_0x06f8
        L_0x069b:
            r18 = r11
            r11 = 1
            byte[] r0 = r4.getBlob(r11)     // Catch:{ SQLiteException -> 0x06f4 }
            g.e.a.b.e.c.q2 r11 = g.e.a.b.e.c.r2.u()     // Catch:{ IOException -> 0x06d4 }
            g.e.a.b.e.c.g6 r0 = g.e.a.b.f.b.m9.B(r11, r0)     // Catch:{ IOException -> 0x06d4 }
            g.e.a.b.e.c.q2 r0 = (g.e.a.b.e.c.q2) r0     // Catch:{ IOException -> 0x06d4 }
            g.e.a.b.e.c.o7 r0 = r0.j()     // Catch:{ IOException -> 0x06d4 }
            g.e.a.b.e.c.r2 r0 = (g.e.a.b.e.c.r2) r0     // Catch:{ IOException -> 0x06d4 }
            r11 = 0
            int r17 = r4.getInt(r11)     // Catch:{ SQLiteException -> 0x06f4 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r17)     // Catch:{ SQLiteException -> 0x06f4 }
            java.lang.Object r17 = r2.get(r11)     // Catch:{ SQLiteException -> 0x06f4 }
            java.util.List r17 = (java.util.List) r17     // Catch:{ SQLiteException -> 0x06f4 }
            r19 = r12
            if (r17 != 0) goto L_0x06ce
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0707 }
            r12.<init>()     // Catch:{ SQLiteException -> 0x0707 }
            r2.put(r11, r12)     // Catch:{ SQLiteException -> 0x0707 }
            goto L_0x06d0
        L_0x06ce:
            r12 = r17
        L_0x06d0:
            r12.add(r0)     // Catch:{ SQLiteException -> 0x0707 }
            goto L_0x06e8
        L_0x06d4:
            r0 = move-exception
            r19 = r12
            g.e.a.b.f.b.n4 r11 = r14.a     // Catch:{ SQLiteException -> 0x0707 }
            g.e.a.b.f.b.f3 r11 = r11.d()     // Catch:{ SQLiteException -> 0x0707 }
            g.e.a.b.f.b.d3 r11 = r11.p()     // Catch:{ SQLiteException -> 0x0707 }
            java.lang.Object r12 = g.e.a.b.f.b.f3.t(r13)     // Catch:{ SQLiteException -> 0x0707 }
            r11.c(r15, r12, r0)     // Catch:{ SQLiteException -> 0x0707 }
        L_0x06e8:
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x0707 }
            if (r0 != 0) goto L_0x06ef
            goto L_0x0700
        L_0x06ef:
            r11 = r18
            r12 = r19
            goto L_0x069b
        L_0x06f4:
            r0 = move-exception
        L_0x06f5:
            r19 = r12
            goto L_0x071b
        L_0x06f8:
            r18 = r11
            r19 = r12
            java.util.Map r2 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0707 }
        L_0x0700:
            r4.close()
            r0 = r2
            r12 = r28
            goto L_0x0737
        L_0x0707:
            r0 = move-exception
            goto L_0x071b
        L_0x0709:
            r0 = move-exception
            r18 = r11
            goto L_0x06f5
        L_0x070d:
            r0 = move-exception
        L_0x070e:
            r18 = r11
            r19 = r12
            goto L_0x071a
        L_0x0713:
            r0 = move-exception
            r5 = 0
            goto L_0x073d
        L_0x0716:
            r0 = move-exception
            r65 = r4
            goto L_0x070e
        L_0x071a:
            r4 = 0
        L_0x071b:
            g.e.a.b.f.b.n4 r2 = r14.a     // Catch:{ all -> 0x073b }
            g.e.a.b.f.b.f3 r2 = r2.d()     // Catch:{ all -> 0x073b }
            g.e.a.b.f.b.d3 r2 = r2.p()     // Catch:{ all -> 0x073b }
            java.lang.Object r11 = g.e.a.b.f.b.f3.t(r13)     // Catch:{ all -> 0x073b }
            r12 = r28
            r2.c(r12, r11, r0)     // Catch:{ all -> 0x073b }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x073b }
            if (r4 == 0) goto L_0x0737
            r4.close()
        L_0x0737:
            r3.put(r10, r0)
            goto L_0x074d
        L_0x073b:
            r0 = move-exception
            r5 = r4
        L_0x073d:
            if (r5 == 0) goto L_0x0742
            r5.close()
        L_0x0742:
            throw r0
        L_0x0743:
            r64 = r2
            r65 = r4
            r18 = r11
            r19 = r12
            r12 = r28
        L_0x074d:
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0755:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x07e6
            java.lang.Object r4 = r2.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.util.Set r10 = r9.f3121e
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            boolean r10 = r10.contains(r11)
            if (r10 == 0) goto L_0x077f
            g.e.a.b.f.b.n4 r4 = r9.a
            g.e.a.b.f.b.f3 r4 = r4.d()
            g.e.a.b.f.b.d3 r4 = r4.q()
            r4.b(r1, r11)
            goto L_0x0755
        L_0x077f:
            java.lang.Object r10 = r0.get(r11)
            java.util.List r10 = (java.util.List) r10
            java.util.Iterator r10 = r10.iterator()
            r11 = 1
        L_0x078a:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L_0x07d5
            java.lang.Object r11 = r10.next()
            g.e.a.b.e.c.r2 r11 = (g.e.a.b.e.c.r2) r11
            g.e.a.b.f.b.z9 r13 = new g.e.a.b.f.b.z9
            java.lang.String r14 = r9.f3120d
            r13.<init>(r9, r14, r4, r11)
            java.lang.Long r14 = r9.f3123g
            r17 = r0
            java.lang.Long r0 = r9.f3124h
            int r11 = r11.t()
            boolean r36 = r9.n(r4, r11)
            r29 = r13
            r30 = r14
            r31 = r0
            r32 = r5
            r33 = r7
            r35 = r6
            boolean r11 = r29.i(r30, r31, r32, r33, r35, r36)
            if (r11 == 0) goto L_0x07cb
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            g.e.a.b.f.b.x9 r0 = r9.m(r0)
            r0.b(r13)
            r0 = r17
            goto L_0x078a
        L_0x07cb:
            java.util.Set r0 = r9.f3121e
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            r0.add(r10)
            goto L_0x07d7
        L_0x07d5:
            r17 = r0
        L_0x07d7:
            if (r11 != 0) goto L_0x07e2
            java.util.Set r0 = r9.f3121e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.add(r4)
        L_0x07e2:
            r0 = r17
            goto L_0x0755
        L_0x07e6:
            r2 = r64
            r4 = r65
            r28 = r12
            r11 = r18
            r12 = r19
            r13 = 2
            goto L_0x05a2
        L_0x07f3:
            boolean r0 = r66.isEmpty()
            if (r0 == 0) goto L_0x07fd
        L_0x07f9:
            r11 = r18
            goto L_0x0a2c
        L_0x07fd:
            e.d.a r2 = new e.d.a
            r2.<init>()
            java.util.Iterator r3 = r66.iterator()
        L_0x0806:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x07f9
            java.lang.Object r0 = r3.next()
            r4 = r0
            g.e.a.b.e.c.p4 r4 = (g.e.a.b.e.c.p4) r4
            java.lang.String r5 = r4.x()
            java.lang.Object r0 = r2.get(r5)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L_0x08f8
            g.e.a.b.f.b.k9 r0 = r9.b
            g.e.a.b.f.b.k r6 = r0.M()
            java.lang.String r7 = r9.f3120d
            r6.i()
            r6.h()
            g.c.b.b.f.k(r7)
            g.c.b.b.f.k(r5)
            e.d.a r8 = new e.d.a
            r8.<init>()
            android.database.sqlite.SQLiteDatabase r29 = r6.A()
            r11 = r18
            r10 = r19
            java.lang.String[] r31 = new java.lang.String[]{r11, r10}     // Catch:{ SQLiteException -> 0x08ce, all -> 0x08cb }
            r13 = 2
            java.lang.String[] r0 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x08ce, all -> 0x08cb }
            r13 = 0
            r0[r13] = r7     // Catch:{ SQLiteException -> 0x08ce, all -> 0x08cb }
            r13 = 1
            r0[r13] = r5     // Catch:{ SQLiteException -> 0x08ce, all -> 0x08cb }
            java.lang.String r30 = "property_filters"
            java.lang.String r32 = "app_id=? AND property_name=?"
            r34 = 0
            r35 = 0
            r36 = 0
            r33 = r0
            android.database.Cursor r13 = r29.query(r30, r31, r32, r33, r34, r35, r36)     // Catch:{ SQLiteException -> 0x08ce, all -> 0x08cb }
            boolean r0 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x08c7 }
            if (r0 == 0) goto L_0x08be
        L_0x0863:
            r14 = 1
            byte[] r0 = r13.getBlob(r14)     // Catch:{ SQLiteException -> 0x08c7 }
            g.e.a.b.e.c.y2 r15 = g.e.a.b.e.c.z2.u()     // Catch:{ IOException -> 0x089a }
            g.e.a.b.e.c.g6 r0 = g.e.a.b.f.b.m9.B(r15, r0)     // Catch:{ IOException -> 0x089a }
            g.e.a.b.e.c.y2 r0 = (g.e.a.b.e.c.y2) r0     // Catch:{ IOException -> 0x089a }
            g.e.a.b.e.c.o7 r0 = r0.j()     // Catch:{ IOException -> 0x089a }
            g.e.a.b.e.c.z2 r0 = (g.e.a.b.e.c.z2) r0     // Catch:{ IOException -> 0x089a }
            r15 = 0
            int r17 = r13.getInt(r15)     // Catch:{ SQLiteException -> 0x08c7 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r17)     // Catch:{ SQLiteException -> 0x08c7 }
            java.lang.Object r17 = r8.get(r14)     // Catch:{ SQLiteException -> 0x08c7 }
            java.util.List r17 = (java.util.List) r17     // Catch:{ SQLiteException -> 0x08c7 }
            if (r17 != 0) goto L_0x0892
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x08c7 }
            r15.<init>()     // Catch:{ SQLiteException -> 0x08c7 }
            r8.put(r14, r15)     // Catch:{ SQLiteException -> 0x08c7 }
            goto L_0x0894
        L_0x0892:
            r15 = r17
        L_0x0894:
            r15.add(r0)     // Catch:{ SQLiteException -> 0x08c7 }
            r64 = r3
            goto L_0x08b0
        L_0x089a:
            r0 = move-exception
            g.e.a.b.f.b.n4 r14 = r6.a     // Catch:{ SQLiteException -> 0x08c7 }
            g.e.a.b.f.b.f3 r14 = r14.d()     // Catch:{ SQLiteException -> 0x08c7 }
            g.e.a.b.f.b.d3 r14 = r14.p()     // Catch:{ SQLiteException -> 0x08c7 }
            java.lang.String r15 = "Failed to merge filter"
            r64 = r3
            java.lang.Object r3 = g.e.a.b.f.b.f3.t(r7)     // Catch:{ SQLiteException -> 0x08c5 }
            r14.c(r15, r3, r0)     // Catch:{ SQLiteException -> 0x08c5 }
        L_0x08b0:
            boolean r0 = r13.moveToNext()     // Catch:{ SQLiteException -> 0x08c5 }
            if (r0 != 0) goto L_0x08bb
            r13.close()
            r0 = r8
            goto L_0x08ec
        L_0x08bb:
            r3 = r64
            goto L_0x0863
        L_0x08be:
            r64 = r3
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x08c5 }
            goto L_0x08e9
        L_0x08c5:
            r0 = move-exception
            goto L_0x08d2
        L_0x08c7:
            r0 = move-exception
            r64 = r3
            goto L_0x08d2
        L_0x08cb:
            r0 = move-exception
            r5 = 0
            goto L_0x08f2
        L_0x08ce:
            r0 = move-exception
            r64 = r3
            r13 = 0
        L_0x08d2:
            g.e.a.b.f.b.n4 r3 = r6.a     // Catch:{ all -> 0x08f0 }
            g.e.a.b.f.b.f3 r3 = r3.d()     // Catch:{ all -> 0x08f0 }
            g.e.a.b.f.b.d3 r3 = r3.p()     // Catch:{ all -> 0x08f0 }
            java.lang.Object r6 = g.e.a.b.f.b.f3.t(r7)     // Catch:{ all -> 0x08f0 }
            r3.c(r12, r6, r0)     // Catch:{ all -> 0x08f0 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x08f0 }
            if (r13 == 0) goto L_0x08ec
        L_0x08e9:
            r13.close()
        L_0x08ec:
            r2.put(r5, r0)
            goto L_0x08fe
        L_0x08f0:
            r0 = move-exception
            r5 = r13
        L_0x08f2:
            if (r5 == 0) goto L_0x08f7
            r5.close()
        L_0x08f7:
            throw r0
        L_0x08f8:
            r64 = r3
            r11 = r18
            r10 = r19
        L_0x08fe:
            java.util.Set r3 = r0.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0906:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0a24
            java.lang.Object r5 = r3.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.util.Set r6 = r9.f3121e
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            boolean r6 = r6.contains(r7)
            if (r6 == 0) goto L_0x0931
            g.e.a.b.f.b.n4 r0 = r9.a
            g.e.a.b.f.b.f3 r0 = r0.d()
            g.e.a.b.f.b.d3 r0 = r0.q()
            r0.b(r1, r7)
            goto L_0x0a24
        L_0x0931:
            java.lang.Object r6 = r0.get(r7)
            java.util.List r6 = (java.util.List) r6
            java.util.Iterator r6 = r6.iterator()
            r7 = 1
        L_0x093c:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0a13
            java.lang.Object r7 = r6.next()
            g.e.a.b.e.c.z2 r7 = (g.e.a.b.e.c.z2) r7
            g.e.a.b.f.b.n4 r8 = r9.a
            g.e.a.b.f.b.f3 r8 = r8.d()
            java.lang.String r8 = r8.w()
            r13 = 2
            boolean r8 = android.util.Log.isLoggable(r8, r13)
            if (r8 == 0) goto L_0x09a6
            g.e.a.b.f.b.n4 r8 = r9.a
            g.e.a.b.f.b.f3 r8 = r8.d()
            g.e.a.b.f.b.d3 r8 = r8.q()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r5)
            boolean r15 = r7.B()
            if (r15 == 0) goto L_0x0976
            int r15 = r7.s()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            goto L_0x0977
        L_0x0976:
            r15 = 0
        L_0x0977:
            g.e.a.b.f.b.n4 r13 = r9.a
            g.e.a.b.f.b.a3 r13 = r13.s()
            r65 = r0
            java.lang.String r0 = r7.w()
            java.lang.String r0 = r13.f(r0)
            java.lang.String r13 = "Evaluating filter. audience, filter, property"
            r8.d(r13, r14, r15, r0)
            g.e.a.b.f.b.n4 r0 = r9.a
            g.e.a.b.f.b.f3 r0 = r0.d()
            g.e.a.b.f.b.d3 r0 = r0.q()
            g.e.a.b.f.b.k9 r8 = r9.b
            g.e.a.b.f.b.m9 r8 = r8.P()
            java.lang.String r8 = r8.D(r7)
            java.lang.String r13 = "Filter definition"
            r0.b(r13, r8)
            goto L_0x09a8
        L_0x09a6:
            r65 = r0
        L_0x09a8:
            boolean r0 = r7.B()
            if (r0 == 0) goto L_0x09e9
            int r0 = r7.s()
            r8 = 256(0x100, float:3.59E-43)
            if (r0 <= r8) goto L_0x09b7
            goto L_0x09e9
        L_0x09b7:
            g.e.a.b.f.b.ba r0 = new g.e.a.b.f.b.ba
            java.lang.String r8 = r9.f3120d
            r0.<init>(r9, r8, r5, r7)
            java.lang.Long r8 = r9.f3123g
            java.lang.Long r13 = r9.f3124h
            int r7 = r7.s()
            boolean r7 = r9.n(r5, r7)
            boolean r7 = r0.i(r8, r13, r4, r7)
            if (r7 == 0) goto L_0x09df
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            g.e.a.b.f.b.x9 r8 = r9.m(r8)
            r8.b(r0)
            r0 = r65
            goto L_0x093c
        L_0x09df:
            java.util.Set r0 = r9.f3121e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r0.add(r6)
            goto L_0x0a15
        L_0x09e9:
            g.e.a.b.f.b.n4 r0 = r9.a
            g.e.a.b.f.b.f3 r0 = r0.d()
            g.e.a.b.f.b.d3 r0 = r0.r()
            java.lang.String r6 = r9.f3120d
            java.lang.Object r6 = g.e.a.b.f.b.f3.t(r6)
            boolean r8 = r7.B()
            if (r8 == 0) goto L_0x0a08
            int r7 = r7.s()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x0a09
        L_0x0a08:
            r7 = 0
        L_0x0a09:
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r8 = "Invalid property filter ID. appId, id"
            r0.c(r8, r6, r7)
            goto L_0x0a17
        L_0x0a13:
            r65 = r0
        L_0x0a15:
            if (r7 != 0) goto L_0x0a20
        L_0x0a17:
            java.util.Set r0 = r9.f3121e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.add(r5)
        L_0x0a20:
            r0 = r65
            goto L_0x0906
        L_0x0a24:
            r3 = r64
            r19 = r10
            r18 = r11
            goto L_0x0806
        L_0x0a2c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Map r0 = r9.f3122f
            java.util.Set r0 = r0.keySet()
            java.util.Set r2 = r9.f3121e
            r0.removeAll(r2)
            java.util.Iterator r2 = r0.iterator()
        L_0x0a40:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0ad5
            java.lang.Object r0 = r2.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.util.Map r3 = r9.f3122f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r3.get(r4)
            g.e.a.b.f.b.x9 r3 = (g.e.a.b.f.b.x9) r3
            g.c.b.b.f.n(r3)
            g.e.a.b.e.c.r3 r0 = r3.a(r0)
            r1.add(r0)
            g.e.a.b.f.b.k9 r3 = r9.b
            g.e.a.b.f.b.k r3 = r3.M()
            java.lang.String r5 = r9.f3120d
            g.e.a.b.e.c.l4 r0 = r0.v()
            r3.i()
            r3.h()
            g.c.b.b.f.k(r5)
            g.c.b.b.f.n(r0)
            byte[] r0 = r0.i()
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            java.lang.String r7 = "app_id"
            r6.put(r7, r5)
            r6.put(r11, r4)
            r4 = r23
            r6.put(r4, r0)
            android.database.sqlite.SQLiteDatabase r0 = r3.A()     // Catch:{ SQLiteException -> 0x0abc }
            java.lang.String r7 = "audience_filter_values"
            r8 = 5
            r10 = 0
            long r6 = r0.insertWithOnConflict(r7, r10, r6, r8)     // Catch:{ SQLiteException -> 0x0aba }
            r12 = -1
            int r0 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x0ad1
            g.e.a.b.f.b.n4 r0 = r3.a     // Catch:{ SQLiteException -> 0x0aba }
            g.e.a.b.f.b.f3 r0 = r0.d()     // Catch:{ SQLiteException -> 0x0aba }
            g.e.a.b.f.b.d3 r0 = r0.p()     // Catch:{ SQLiteException -> 0x0aba }
            java.lang.String r6 = "Failed to insert filter results (got -1). appId"
            java.lang.Object r7 = g.e.a.b.f.b.f3.t(r5)     // Catch:{ SQLiteException -> 0x0aba }
            r0.b(r6, r7)     // Catch:{ SQLiteException -> 0x0aba }
            goto L_0x0ad1
        L_0x0aba:
            r0 = move-exception
            goto L_0x0abe
        L_0x0abc:
            r0 = move-exception
            r10 = 0
        L_0x0abe:
            g.e.a.b.f.b.n4 r3 = r3.a
            g.e.a.b.f.b.f3 r3 = r3.d()
            g.e.a.b.f.b.d3 r3 = r3.p()
            java.lang.Object r5 = g.e.a.b.f.b.f3.t(r5)
            java.lang.String r6 = "Error storing filter results. appId"
            r3.c(r6, r5, r0)
        L_0x0ad1:
            r23 = r4
            goto L_0x0a40
        L_0x0ad5:
            return r1
        L_0x0ad6:
            r0 = move-exception
            r5 = r4
        L_0x0ad8:
            if (r5 == 0) goto L_0x0add
            r5.close()
        L_0x0add:
            goto L_0x0adf
        L_0x0ade:
            throw r0
        L_0x0adf:
            goto L_0x0ade
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.ca.l(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }

    public final x9 m(Integer num) {
        if (this.f3122f.containsKey(num)) {
            return (x9) this.f3122f.get(num);
        }
        x9 x9Var = new x9(this, this.f3120d);
        this.f3122f.put(num, x9Var);
        return x9Var;
    }

    public final boolean n(int i2, int i3) {
        x9 x9Var = (x9) this.f3122f.get(Integer.valueOf(i2));
        if (x9Var == null) {
            return false;
        }
        return x9Var.f3404d.get(i3);
    }
}
