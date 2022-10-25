package g.e.a.b.f.b;

import g.e.a.b.e.c.v3;

public final class y9 {
    public v3 a;
    public Long b;
    public long c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ca f3420d;

    public /* synthetic */ y9(ca caVar) {
        this.f3420d = caVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f4, code lost:
        if (r14 == null) goto L_0x00f9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final g.e.a.b.e.c.v3 a(java.lang.String r18, g.e.a.b.e.c.v3 r19) {
        /*
            r17 = this;
            r1 = r17
            r3 = r18
            r8 = r19
            java.lang.String r0 = r19.z()
            java.util.List r9 = r19.A()
            g.e.a.b.f.b.ca r2 = r1.f3420d
            g.e.a.b.f.b.k9 r2 = r2.b
            g.e.a.b.f.b.m9 r2 = r2.f3233g
            g.e.a.b.f.b.k9.I(r2)
            java.lang.String r2 = "_eid"
            java.lang.Object r4 = g.e.a.b.f.b.m9.n(r8, r2)
            java.lang.Long r4 = (java.lang.Long) r4
            r10 = 0
            if (r4 == 0) goto L_0x0226
            java.lang.String r5 = "_ep"
            boolean r5 = r0.equals(r5)
            r6 = 0
            if (r5 == 0) goto L_0x01de
            g.e.a.b.f.b.ca r0 = r1.f3420d
            g.e.a.b.f.b.k9 r0 = r0.b
            g.e.a.b.f.b.m9 r0 = r0.f3233g
            g.e.a.b.f.b.k9.I(r0)
            java.lang.String r0 = "_en"
            java.lang.Object r0 = g.e.a.b.f.b.m9.n(r8, r0)
            r11 = r0
            java.lang.String r11 = (java.lang.String) r11
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r5 = 0
            if (r0 == 0) goto L_0x0055
            g.e.a.b.f.b.ca r0 = r1.f3420d
            g.e.a.b.f.b.n4 r0 = r0.a
            g.e.a.b.f.b.f3 r0 = r0.d()
            g.e.a.b.f.b.d3 r0 = r0.f3137g
            java.lang.String r2 = "Extra parameter without an event name. eventId"
            r0.b(r2, r4)
            return r5
        L_0x0055:
            g.e.a.b.e.c.v3 r0 = r1.a
            r12 = 1
            if (r0 == 0) goto L_0x006c
            java.lang.Long r0 = r1.b
            if (r0 == 0) goto L_0x006c
            long r13 = r4.longValue()
            java.lang.Long r0 = r1.b
            long r15 = r0.longValue()
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x0123
        L_0x006c:
            g.e.a.b.f.b.ca r0 = r1.f3420d
            g.e.a.b.f.b.k9 r0 = r0.b
            g.e.a.b.f.b.k r13 = r0.c
            g.e.a.b.f.b.k9.I(r13)
            r13.h()
            r13.i()
            android.database.sqlite.SQLiteDatabase r0 = r13.A()     // Catch:{ SQLiteException -> 0x00e5, all -> 0x00e1 }
            r14 = 2
            java.lang.String[] r14 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x00e5, all -> 0x00e1 }
            r14[r10] = r3     // Catch:{ SQLiteException -> 0x00e5, all -> 0x00e1 }
            java.lang.String r15 = r4.toString()     // Catch:{ SQLiteException -> 0x00e5, all -> 0x00e1 }
            r14[r12] = r15     // Catch:{ SQLiteException -> 0x00e5, all -> 0x00e1 }
            java.lang.String r15 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            android.database.Cursor r14 = r0.rawQuery(r15, r14)     // Catch:{ SQLiteException -> 0x00e5, all -> 0x00e1 }
            boolean r0 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x00a8 }
            if (r0 != 0) goto L_0x00aa
            g.e.a.b.f.b.n4 r0 = r13.a     // Catch:{ SQLiteException -> 0x00a8 }
            g.e.a.b.f.b.f3 r0 = r0.d()     // Catch:{ SQLiteException -> 0x00a8 }
            g.e.a.b.f.b.d3 r0 = r0.n     // Catch:{ SQLiteException -> 0x00a8 }
            java.lang.String r15 = "Main event not found"
            r0.a(r15)     // Catch:{ SQLiteException -> 0x00a8 }
            r14.close()
            r0 = r5
            goto L_0x00fa
        L_0x00a8:
            r0 = move-exception
            goto L_0x00e7
        L_0x00aa:
            byte[] r0 = r14.getBlob(r10)     // Catch:{ SQLiteException -> 0x00a8 }
            long r15 = r14.getLong(r12)     // Catch:{ SQLiteException -> 0x00a8 }
            java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch:{ SQLiteException -> 0x00a8 }
            g.e.a.b.e.c.u3 r5 = g.e.a.b.e.c.v3.w()     // Catch:{ IOException -> 0x00ce }
            g.e.a.b.e.c.g6 r0 = g.e.a.b.f.b.m9.B(r5, r0)     // Catch:{ IOException -> 0x00ce }
            g.e.a.b.e.c.u3 r0 = (g.e.a.b.e.c.u3) r0     // Catch:{ IOException -> 0x00ce }
            g.e.a.b.e.c.o7 r0 = r0.j()     // Catch:{ IOException -> 0x00ce }
            g.e.a.b.e.c.v3 r0 = (g.e.a.b.e.c.v3) r0     // Catch:{ IOException -> 0x00ce }
            android.util.Pair r0 = android.util.Pair.create(r0, r15)     // Catch:{ SQLiteException -> 0x00a8 }
            r14.close()
            goto L_0x00fa
        L_0x00ce:
            r0 = move-exception
            g.e.a.b.f.b.n4 r5 = r13.a     // Catch:{ SQLiteException -> 0x00a8 }
            g.e.a.b.f.b.f3 r5 = r5.d()     // Catch:{ SQLiteException -> 0x00a8 }
            g.e.a.b.f.b.d3 r5 = r5.f3136f     // Catch:{ SQLiteException -> 0x00a8 }
            java.lang.String r15 = "Failed to merge main event. appId, eventId"
            java.lang.Object r10 = g.e.a.b.f.b.f3.t(r18)     // Catch:{ SQLiteException -> 0x00a8 }
            r5.d(r15, r10, r4, r0)     // Catch:{ SQLiteException -> 0x00a8 }
            goto L_0x00f6
        L_0x00e1:
            r0 = move-exception
            r5 = 0
            goto L_0x01d8
        L_0x00e5:
            r0 = move-exception
            r14 = 0
        L_0x00e7:
            g.e.a.b.f.b.n4 r5 = r13.a     // Catch:{ all -> 0x01d6 }
            g.e.a.b.f.b.f3 r5 = r5.d()     // Catch:{ all -> 0x01d6 }
            g.e.a.b.f.b.d3 r5 = r5.f3136f     // Catch:{ all -> 0x01d6 }
            java.lang.String r10 = "Error selecting main event"
            r5.b(r10, r0)     // Catch:{ all -> 0x01d6 }
            if (r14 == 0) goto L_0x00f9
        L_0x00f6:
            r14.close()
        L_0x00f9:
            r0 = 0
        L_0x00fa:
            if (r0 == 0) goto L_0x01c5
            java.lang.Object r5 = r0.first
            if (r5 != 0) goto L_0x0102
            goto L_0x01c5
        L_0x0102:
            g.e.a.b.e.c.v3 r5 = (g.e.a.b.e.c.v3) r5
            r1.a = r5
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r13 = r0.longValue()
            r1.c = r13
            g.e.a.b.f.b.ca r0 = r1.f3420d
            g.e.a.b.f.b.k9 r0 = r0.b
            g.e.a.b.f.b.m9 r0 = r0.f3233g
            g.e.a.b.f.b.k9.I(r0)
            g.e.a.b.e.c.v3 r0 = r1.a
            java.lang.Object r0 = g.e.a.b.f.b.m9.n(r0, r2)
            java.lang.Long r0 = (java.lang.Long) r0
            r1.b = r0
        L_0x0123:
            long r13 = r1.c
            r15 = -1
            long r13 = r13 + r15
            r1.c = r13
            int r0 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0165
            g.e.a.b.f.b.ca r0 = r1.f3420d
            g.e.a.b.f.b.k9 r0 = r0.b
            g.e.a.b.f.b.k r2 = r0.c
            g.e.a.b.f.b.k9.I(r2)
            r2.h()
            g.e.a.b.f.b.n4 r0 = r2.a
            g.e.a.b.f.b.f3 r0 = r0.d()
            g.e.a.b.f.b.d3 r0 = r0.n
            java.lang.String r4 = "Clearing complex main event info. appId"
            r0.b(r4, r3)
            android.database.sqlite.SQLiteDatabase r0 = r2.A()     // Catch:{ SQLiteException -> 0x0156 }
            java.lang.String[] r4 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0156 }
            r5 = 0
            r4[r5] = r3     // Catch:{ SQLiteException -> 0x0156 }
            java.lang.String r3 = "delete from main_event_params where app_id=?"
            r0.execSQL(r3, r4)     // Catch:{ SQLiteException -> 0x0156 }
            goto L_0x0177
        L_0x0156:
            r0 = move-exception
            g.e.a.b.f.b.n4 r2 = r2.a
            g.e.a.b.f.b.f3 r2 = r2.d()
            g.e.a.b.f.b.d3 r2 = r2.f3136f
            java.lang.String r3 = "Error clearing complex main event"
            r2.b(r3, r0)
            goto L_0x0177
        L_0x0165:
            g.e.a.b.f.b.ca r0 = r1.f3420d
            g.e.a.b.f.b.k9 r0 = r0.b
            g.e.a.b.f.b.k r2 = r0.c
            g.e.a.b.f.b.k9.I(r2)
            long r5 = r1.c
            g.e.a.b.e.c.v3 r7 = r1.a
            r3 = r18
            r2.q(r3, r4, r5, r7)
        L_0x0177:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            g.e.a.b.e.c.v3 r2 = r1.a
            java.util.List r2 = r2.A()
            java.util.Iterator r2 = r2.iterator()
        L_0x0186:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01a9
            java.lang.Object r3 = r2.next()
            g.e.a.b.e.c.z3 r3 = (g.e.a.b.e.c.z3) r3
            g.e.a.b.f.b.ca r4 = r1.f3420d
            g.e.a.b.f.b.k9 r4 = r4.b
            g.e.a.b.f.b.m9 r4 = r4.f3233g
            g.e.a.b.f.b.k9.I(r4)
            java.lang.String r4 = r3.y()
            g.e.a.b.e.c.z3 r4 = g.e.a.b.f.b.m9.m(r8, r4)
            if (r4 != 0) goto L_0x0186
            r0.add(r3)
            goto L_0x0186
        L_0x01a9:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x01b4
            r0.addAll(r9)
            r9 = r0
            goto L_0x01c3
        L_0x01b4:
            g.e.a.b.f.b.ca r0 = r1.f3420d
            g.e.a.b.f.b.n4 r0 = r0.a
            g.e.a.b.f.b.f3 r0 = r0.d()
            g.e.a.b.f.b.d3 r0 = r0.f3137g
            java.lang.String r2 = "No unique parameters in main event. eventName"
            r0.b(r2, r11)
        L_0x01c3:
            r0 = r11
            goto L_0x0226
        L_0x01c5:
            g.e.a.b.f.b.ca r0 = r1.f3420d
            g.e.a.b.f.b.n4 r0 = r0.a
            g.e.a.b.f.b.f3 r0 = r0.d()
            g.e.a.b.f.b.d3 r0 = r0.f3137g
            java.lang.String r2 = "Extra parameter without existing main event. eventName, eventId"
            r0.c(r2, r11, r4)
            r2 = 0
            return r2
        L_0x01d6:
            r0 = move-exception
            r5 = r14
        L_0x01d8:
            if (r5 == 0) goto L_0x01dd
            r5.close()
        L_0x01dd:
            throw r0
        L_0x01de:
            r1.b = r4
            r1.a = r8
            g.e.a.b.f.b.ca r2 = r1.f3420d
            g.e.a.b.f.b.k9 r2 = r2.b
            g.e.a.b.f.b.m9 r2 = r2.f3233g
            g.e.a.b.f.b.k9.I(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.String r5 = "_epc"
            java.lang.Object r5 = g.e.a.b.f.b.m9.n(r8, r5)
            if (r5 == 0) goto L_0x01f8
            r2 = r5
        L_0x01f8:
            java.lang.Long r2 = (java.lang.Long) r2
            long r10 = r2.longValue()
            r1.c = r10
            int r2 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x0214
            g.e.a.b.f.b.ca r2 = r1.f3420d
            g.e.a.b.f.b.n4 r2 = r2.a
            g.e.a.b.f.b.f3 r2 = r2.d()
            g.e.a.b.f.b.d3 r2 = r2.f3137g
            java.lang.String r3 = "Complex event with zero extra param count. eventName"
            r2.b(r3, r0)
            goto L_0x0226
        L_0x0214:
            g.e.a.b.f.b.ca r2 = r1.f3420d
            g.e.a.b.f.b.k9 r2 = r2.b
            g.e.a.b.f.b.k r2 = r2.c
            g.e.a.b.f.b.k9.I(r2)
            long r5 = r1.c
            r3 = r18
            r7 = r19
            r2.q(r3, r4, r5, r7)
        L_0x0226:
            g.e.a.b.e.c.l7 r2 = r19.n()
            g.e.a.b.e.c.u3 r2 = (g.e.a.b.e.c.u3) r2
            r2.q(r0)
            boolean r0 = r2.f2990d
            if (r0 == 0) goto L_0x0239
            r2.f()
            r3 = 0
            r2.f2990d = r3
        L_0x0239:
            g.e.a.b.e.c.o7 r0 = r2.c
            g.e.a.b.e.c.v3 r0 = (g.e.a.b.e.c.v3) r0
            g.e.a.b.e.c.v3.E(r0)
            boolean r0 = r2.f2990d
            if (r0 == 0) goto L_0x024a
            r2.f()
            r3 = 0
            r2.f2990d = r3
        L_0x024a:
            g.e.a.b.e.c.o7 r0 = r2.c
            g.e.a.b.e.c.v3 r0 = (g.e.a.b.e.c.v3) r0
            g.e.a.b.e.c.v3.D(r0, r9)
            g.e.a.b.e.c.o7 r0 = r2.j()
            g.e.a.b.e.c.v3 r0 = (g.e.a.b.e.c.v3) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.y9.a(java.lang.String, g.e.a.b.e.c.v3):g.e.a.b.e.c.v3");
    }
}
