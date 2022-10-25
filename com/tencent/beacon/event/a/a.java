package com.tencent.beacon.event.a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.tencent.beacon.a.b.g;
import com.tencent.beacon.a.d.c;
import com.tencent.beacon.a.d.d;
import com.tencent.beacon.event.EventBean;
import com.tencent.beacon.event.c.b;
import java.util.ArrayList;
import java.util.List;

public class a implements d<EventBean> {
    private static volatile a a;
    private final SQLiteStatement b;
    private final SQLiteStatement c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f681d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private final Object f682e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private b f683f = b.a();

    /* renamed from: g  reason: collision with root package name */
    private SQLiteDatabase f684g;

    /* renamed from: h  reason: collision with root package name */
    private SQLiteDatabase f685h;

    /* renamed from: i  reason: collision with root package name */
    private long f686i;

    /* renamed from: j  reason: collision with root package name */
    private long f687j;

    private a() {
        c cVar = new c(com.tencent.beacon.a.c.b.c(com.tencent.beacon.a.c.c.d().c()));
        this.f684g = cVar.getWritableDatabase();
        SQLiteDatabase readableDatabase = cVar.getReadableDatabase();
        this.f685h = readableDatabase;
        this.b = readableDatabase.compileStatement("INSERT INTO t_r_e (_appKey,_time,_length,_data )VALUES(?,?,?,?)");
        this.c = this.f685h.compileStatement("INSERT INTO t_n_e (_appKey,_time,_length,_data )VALUES(?,?,?,?)");
        this.f686i = a("t_r_e");
        long a2 = a("t_n_e");
        this.f687j = a2;
        if (this.f686i != 0 || a2 != 0) {
            StringBuilder i2 = g.a.a.a.a.i(" realtime: ");
            i2.append(this.f686i);
            i2.append(", normal: ");
            i2.append(this.f687j);
            String sb = i2.toString();
            com.tencent.beacon.base.util.c.a("[EventDAO]", sb, new Object[0]);
            g e2 = g.e();
            e2.a("607", "[EventDAO]" + sb);
        }
    }

    public static a a() {
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    a = new a();
                }
            }
        }
        return a;
    }

    private List<EventBean> a(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            b bVar = new b();
            bVar.a = cursor.getLong(0);
            bVar.f688d = cursor.getString(1);
            bVar.b = (long) cursor.getInt(2);
            bVar.c = cursor.getLong(3);
            bVar.f689e = cursor.getBlob(4);
            arrayList.add(this.f683f.c().a(bVar));
        }
        if (!cursor.isClosed()) {
            cursor.close();
        }
        return arrayList;
    }

    private void a(boolean z, boolean z2, long j2) {
        if (z) {
            synchronized (this.f681d) {
                this.f686i = z2 ? this.f686i + j2 : this.f686i - j2;
                com.tencent.beacon.base.util.c.a("[EventDAO]", "current db realtime:%s", Long.valueOf(this.f686i));
            }
            return;
        }
        synchronized (this.f682e) {
            this.f687j = z2 ? this.f687j + j2 : this.f687j - j2;
            com.tencent.beacon.base.util.c.a("[EventDAO]", "current db normal:%s", Long.valueOf(this.f687j));
        }
    }

    public long a(String str) {
        Cursor cursor = null;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT count(?) FROM ");
            sb.append(str);
            String sb2 = sb.toString();
            Cursor rawQuery = this.f685h.rawQuery(sb2, new String[]{"_id"});
            rawQuery.moveToFirst();
            long j2 = rawQuery.getLong(0);
            if (rawQuery.isClosed()) {
                return j2;
            }
            rawQuery.close();
            return j2;
        } catch (Exception e2) {
            g e3 = g.e();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("type: ");
            sb3.append(str);
            sb3.append(" query err: ");
            sb3.append(e2.getMessage());
            e3.a("605", sb3.toString(), e2);
            com.tencent.beacon.base.util.c.a((Throwable) e2);
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            return -1;
        } catch (Throwable th) {
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            throw th;
        }
    }

    public List<EventBean> a(String str, String str2, int i2) {
        long currentTimeMillis = System.currentTimeMillis();
        List<EventBean> list = null;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(" SELECT * FROM ");
            sb.append(str);
            sb.append(" WHERE ");
            sb.append("_id");
            sb.append(" NOT IN (");
            sb.append(str2);
            sb.append(") ORDER BY ");
            sb.append("_time");
            sb.append(" DESC LIMIT ");
            sb.append(i2);
            list = a(this.f685h.rawQuery(sb.toString(), (String[]) null));
        } catch (Exception e2) {
            com.tencent.beacon.base.util.c.a((Throwable) e2);
            g e3 = g.e();
            StringBuilder n = g.a.a.a.a.n("type: ", str, " query err: ");
            n.append(e2.getMessage());
            e3.a("605", n.toString(), e2);
        }
        com.tencent.beacon.base.util.c.a("[EventDAO]", "query tableName: %s, args: %s", str, str2);
        com.tencent.beacon.base.util.c.a("[EventDAO]", "query cost time: %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        return list;
    }

    public boolean a(int i2) {
        boolean z = false;
        if (i2 == 1) {
            synchronized (this.f681d) {
                if (this.f686i >= ((long) com.tencent.beacon.e.b.a().b())) {
                    z = true;
                }
            }
            return z;
        }
        synchronized (this.f682e) {
            if (this.f687j >= ((long) com.tencent.beacon.e.b.a().b())) {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007e, code lost:
        if (r12.c.executeInsert() >= 0) goto L_0x0080;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0113  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(com.tencent.beacon.event.EventBean r13) {
        /*
            r12 = this;
            java.lang.String r0 = " insert err: "
            java.lang.String r1 = "type: "
            java.lang.String r2 = "603"
            r3 = 0
            if (r13 != 0) goto L_0x000a
            return r3
        L_0x000a:
            com.tencent.beacon.event.c.b r4 = r12.f683f
            com.tencent.beacon.base.net.a.c r4 = r4.b()
            java.lang.Object r4 = r4.a(r13)
            com.tencent.beacon.event.a.b r4 = (com.tencent.beacon.event.a.b) r4
            int r13 = r13.getEventType()
            boolean r13 = com.tencent.beacon.event.c.d.a((int) r13)
            r5 = 1
            android.database.sqlite.SQLiteDatabase r6 = r12.f684g     // Catch:{ Exception -> 0x00b7 }
            r6.beginTransactionNonExclusive()     // Catch:{ Exception -> 0x00b7 }
            android.database.sqlite.SQLiteStatement r6 = r12.b     // Catch:{ Exception -> 0x00b7 }
            r6.clearBindings()     // Catch:{ Exception -> 0x00b7 }
            r6 = 4
            r7 = 3
            r8 = 2
            if (r13 == 0) goto L_0x004b
            android.database.sqlite.SQLiteStatement r9 = r12.b     // Catch:{ Exception -> 0x00b7 }
            java.lang.String r10 = r4.f688d     // Catch:{ Exception -> 0x00b7 }
            r9.bindString(r5, r10)     // Catch:{ Exception -> 0x00b7 }
            android.database.sqlite.SQLiteStatement r9 = r12.b     // Catch:{ Exception -> 0x00b7 }
            long r10 = r4.b     // Catch:{ Exception -> 0x00b7 }
            r9.bindLong(r8, r10)     // Catch:{ Exception -> 0x00b7 }
            android.database.sqlite.SQLiteStatement r8 = r12.b     // Catch:{ Exception -> 0x00b7 }
            long r9 = r4.c     // Catch:{ Exception -> 0x00b7 }
            r8.bindLong(r7, r9)     // Catch:{ Exception -> 0x00b7 }
            android.database.sqlite.SQLiteStatement r7 = r12.b     // Catch:{ Exception -> 0x00b7 }
            byte[] r4 = r4.f689e     // Catch:{ Exception -> 0x00b7 }
            r7.bindBlob(r6, r4)     // Catch:{ Exception -> 0x00b7 }
            goto L_0x0067
        L_0x004b:
            android.database.sqlite.SQLiteStatement r9 = r12.c     // Catch:{ Exception -> 0x00b7 }
            java.lang.String r10 = r4.f688d     // Catch:{ Exception -> 0x00b7 }
            r9.bindString(r5, r10)     // Catch:{ Exception -> 0x00b7 }
            android.database.sqlite.SQLiteStatement r9 = r12.c     // Catch:{ Exception -> 0x00b7 }
            long r10 = r4.b     // Catch:{ Exception -> 0x00b7 }
            r9.bindLong(r8, r10)     // Catch:{ Exception -> 0x00b7 }
            android.database.sqlite.SQLiteStatement r8 = r12.c     // Catch:{ Exception -> 0x00b7 }
            long r9 = r4.c     // Catch:{ Exception -> 0x00b7 }
            r8.bindLong(r7, r9)     // Catch:{ Exception -> 0x00b7 }
            android.database.sqlite.SQLiteStatement r7 = r12.c     // Catch:{ Exception -> 0x00b7 }
            byte[] r4 = r4.f689e     // Catch:{ Exception -> 0x00b7 }
            r7.bindBlob(r6, r4)     // Catch:{ Exception -> 0x00b7 }
        L_0x0067:
            r6 = 0
            if (r13 == 0) goto L_0x0076
            android.database.sqlite.SQLiteStatement r4 = r12.b     // Catch:{ Exception -> 0x00b7 }
            long r8 = r4.executeInsert()     // Catch:{ Exception -> 0x00b7 }
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x0082
            goto L_0x0080
        L_0x0076:
            android.database.sqlite.SQLiteStatement r4 = r12.c     // Catch:{ Exception -> 0x00b7 }
            long r8 = r4.executeInsert()     // Catch:{ Exception -> 0x00b7 }
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x0082
        L_0x0080:
            r4 = 1
            goto L_0x0083
        L_0x0082:
            r4 = 0
        L_0x0083:
            android.database.sqlite.SQLiteDatabase r6 = r12.f684g     // Catch:{ Exception -> 0x008f }
            r6.setTransactionSuccessful()     // Catch:{ Exception -> 0x008f }
            android.database.sqlite.SQLiteDatabase r6 = r12.f684g     // Catch:{ Exception -> 0x008f }
            r6.endTransaction()     // Catch:{ Exception -> 0x008f }
            goto L_0x010b
        L_0x008f:
            r6 = move-exception
            com.tencent.beacon.a.b.g r7 = com.tencent.beacon.a.b.g.e()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r1)
            r8.append(r13)
            r8.append(r0)
            java.lang.String r0 = r6.getMessage()
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            r7.a(r2, r0, r6)
            com.tencent.beacon.base.util.c.a((java.lang.Throwable) r6)
            goto L_0x010b
        L_0x00b4:
            r3 = move-exception
            goto L_0x0132
        L_0x00b7:
            r4 = move-exception
            com.tencent.beacon.a.b.g r6 = com.tencent.beacon.a.b.g.e()     // Catch:{ all -> 0x00b4 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b4 }
            r7.<init>()     // Catch:{ all -> 0x00b4 }
            r7.append(r1)     // Catch:{ all -> 0x00b4 }
            r7.append(r13)     // Catch:{ all -> 0x00b4 }
            r7.append(r0)     // Catch:{ all -> 0x00b4 }
            java.lang.String r8 = r4.getMessage()     // Catch:{ all -> 0x00b4 }
            r7.append(r8)     // Catch:{ all -> 0x00b4 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00b4 }
            r6.a(r2, r7, r4)     // Catch:{ all -> 0x00b4 }
            com.tencent.beacon.base.util.c.a((java.lang.Throwable) r4)     // Catch:{ all -> 0x00b4 }
            android.database.sqlite.SQLiteDatabase r4 = r12.f684g     // Catch:{ Exception -> 0x00e6 }
            r4.setTransactionSuccessful()     // Catch:{ Exception -> 0x00e6 }
            android.database.sqlite.SQLiteDatabase r4 = r12.f684g     // Catch:{ Exception -> 0x00e6 }
            r4.endTransaction()     // Catch:{ Exception -> 0x00e6 }
            goto L_0x010a
        L_0x00e6:
            r4 = move-exception
            com.tencent.beacon.a.b.g r6 = com.tencent.beacon.a.b.g.e()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            r7.append(r13)
            r7.append(r0)
            java.lang.String r0 = r4.getMessage()
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            r6.a(r2, r0, r4)
            com.tencent.beacon.base.util.c.a((java.lang.Throwable) r4)
        L_0x010a:
            r4 = 0
        L_0x010b:
            if (r4 == 0) goto L_0x0113
            r0 = 1
            r12.a((boolean) r13, (boolean) r5, (long) r0)
            goto L_0x0131
        L_0x0113:
            com.tencent.beacon.a.b.g r0 = com.tencent.beacon.a.b.g.e()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r5.append(r13)
            java.lang.String r13 = " insert result: "
            r5.append(r13)
            r5.append(r3)
            java.lang.String r13 = r5.toString()
            r0.a(r2, r13)
        L_0x0131:
            return r4
        L_0x0132:
            android.database.sqlite.SQLiteDatabase r4 = r12.f684g     // Catch:{ Exception -> 0x013d }
            r4.setTransactionSuccessful()     // Catch:{ Exception -> 0x013d }
            android.database.sqlite.SQLiteDatabase r4 = r12.f684g     // Catch:{ Exception -> 0x013d }
            r4.endTransaction()     // Catch:{ Exception -> 0x013d }
            goto L_0x0161
        L_0x013d:
            r4 = move-exception
            com.tencent.beacon.a.b.g r5 = com.tencent.beacon.a.b.g.e()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            r6.append(r13)
            r6.append(r0)
            java.lang.String r13 = r4.getMessage()
            r6.append(r13)
            java.lang.String r13 = r6.toString()
            r5.a(r2, r13, r4)
            com.tencent.beacon.base.util.c.a((java.lang.Throwable) r4)
        L_0x0161:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.beacon.event.a.a.a(com.tencent.beacon.event.EventBean):boolean");
    }

    public boolean a(String str, String str2) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("_id IN (");
            sb.append(str2);
            sb.append(")");
            int delete = this.f684g.delete(str, sb.toString(), (String[]) null);
            a(str.equals("t_r_e"), false, (long) delete);
            return delete >= 0;
        } catch (Exception e2) {
            g e3 = g.e();
            StringBuilder n = g.a.a.a.a.n("type: ", str, " delete err: ");
            n.append(e2.getMessage());
            n.append(" target: ");
            n.append(str2);
            e3.a("606", n.toString(), e2);
            com.tencent.beacon.base.util.c.a((Throwable) e2);
            return false;
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.String[], android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r8 == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        if (r1.isClosed() == false) goto L_0x004a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map<java.lang.String, java.lang.Integer> b(java.lang.String r8) {
        /*
            r7 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0050 }
            r2.<init>()     // Catch:{ Exception -> 0x0050 }
            java.lang.String r3 = "SELECT _appKey,count(_appKey) FROM "
            r2.append(r3)     // Catch:{ Exception -> 0x0050 }
            r2.append(r8)     // Catch:{ Exception -> 0x0050 }
            java.lang.String r3 = " GROUP BY "
            r2.append(r3)     // Catch:{ Exception -> 0x0050 }
            java.lang.String r3 = "_appKey"
            r2.append(r3)     // Catch:{ Exception -> 0x0050 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0050 }
            android.database.sqlite.SQLiteDatabase r3 = r7.f685h     // Catch:{ Exception -> 0x0050 }
            android.database.Cursor r1 = r3.rawQuery(r2, r1)     // Catch:{ Exception -> 0x0050 }
            boolean r2 = r1.moveToFirst()     // Catch:{ Exception -> 0x0050 }
            if (r2 == 0) goto L_0x0044
        L_0x002d:
            r2 = 0
            java.lang.String r2 = r1.getString(r2)     // Catch:{ Exception -> 0x0050 }
            r3 = 1
            int r3 = r1.getInt(r3)     // Catch:{ Exception -> 0x0050 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0050 }
            r0.put(r2, r3)     // Catch:{ Exception -> 0x0050 }
            boolean r2 = r1.moveToNext()     // Catch:{ Exception -> 0x0050 }
            if (r2 != 0) goto L_0x002d
        L_0x0044:
            boolean r8 = r1.isClosed()
            if (r8 != 0) goto L_0x0083
        L_0x004a:
            r1.close()
            goto L_0x0083
        L_0x004e:
            r8 = move-exception
            goto L_0x0084
        L_0x0050:
            r2 = move-exception
            com.tencent.beacon.a.b.g r3 = com.tencent.beacon.a.b.g.e()     // Catch:{ all -> 0x004e }
            java.lang.String r4 = "605"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x004e }
            r5.<init>()     // Catch:{ all -> 0x004e }
            java.lang.String r6 = "type: "
            r5.append(r6)     // Catch:{ all -> 0x004e }
            r5.append(r8)     // Catch:{ all -> 0x004e }
            java.lang.String r8 = " query err: "
            r5.append(r8)     // Catch:{ all -> 0x004e }
            java.lang.String r8 = r2.getMessage()     // Catch:{ all -> 0x004e }
            r5.append(r8)     // Catch:{ all -> 0x004e }
            java.lang.String r8 = r5.toString()     // Catch:{ all -> 0x004e }
            r3.a(r4, r8, r2)     // Catch:{ all -> 0x004e }
            com.tencent.beacon.base.util.c.a((java.lang.Throwable) r2)     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x0083
            boolean r8 = r1.isClosed()
            if (r8 != 0) goto L_0x0083
            goto L_0x004a
        L_0x0083:
            return r0
        L_0x0084:
            if (r1 == 0) goto L_0x008f
            boolean r0 = r1.isClosed()
            if (r0 != 0) goto L_0x008f
            r1.close()
        L_0x008f:
            goto L_0x0091
        L_0x0090:
            throw r8
        L_0x0091:
            goto L_0x0090
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.beacon.event.a.a.b(java.lang.String):java.util.Map");
    }
}
