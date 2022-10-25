package g.e.a.b.f.b;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;

public final class z2 extends w3 {
    public final x2 c = new x2(this, this.a.a);

    /* renamed from: d  reason: collision with root package name */
    public boolean f3422d;

    public z2(n4 n4Var) {
        super(n4Var);
    }

    public final boolean k() {
        return false;
    }

    public final SQLiteDatabase l() throws SQLiteException {
        if (this.f3422d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f3422d = true;
        return null;
    }

    public final void m() {
        int delete;
        h();
        try {
            SQLiteDatabase l2 = l();
            if (l2 != null && (delete = l2.delete("messages", (String) null, (String[]) null)) > 0) {
                this.a.d().n.b("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e2) {
            this.a.d().f3136f.b("Error resetting local analytics data. error", e2);
        }
    }

    public final boolean n() {
        h();
        if (!this.f3422d && this.a.a.getDatabasePath("google_app_measurement_local.db").exists()) {
            int i2 = 0;
            int i3 = 5;
            while (i2 < 5) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase l2 = l();
                    if (l2 == null) {
                        this.f3422d = true;
                        return false;
                    }
                    l2.beginTransaction();
                    l2.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    l2.setTransactionSuccessful();
                    l2.endTransaction();
                    l2.close();
                    return true;
                } catch (SQLiteFullException e2) {
                    this.a.d().f3136f.b("Error deleting app launch break from local database", e2);
                    this.f3422d = true;
                    if (sQLiteDatabase == null) {
                        i2++;
                    }
                    sQLiteDatabase.close();
                    i2++;
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep((long) i3);
                    i3 += 20;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                        i2++;
                    } else {
                        i2++;
                    }
                } catch (SQLiteException e3) {
                    if (sQLiteDatabase != null) {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    }
                    this.a.d().f3136f.b("Error deleting app launch break from local database", e3);
                    this.f3422d = true;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                        i2++;
                    } else {
                        i2++;
                    }
                } catch (Throwable th) {
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                    throw th;
                }
            }
            this.a.d().f3139i.a("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r7v5, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v8, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v10 */
    /* JADX WARNING: type inference failed for: r7v11 */
    /* JADX WARNING: type inference failed for: r7v12 */
    /* JADX WARNING: type inference failed for: r7v13 */
    /* JADX WARNING: type inference failed for: r7v14 */
    /* JADX WARNING: type inference failed for: r7v15 */
    /* JADX WARNING: type inference failed for: r7v16 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c6 A[SYNTHETIC, Splitter:B:47:0x00c6] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0118 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0118 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0118 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean o(int r17, byte[] r18) {
        /*
            r16 = this;
            r1 = r16
            r16.h()
            boolean r0 = r1.f3422d
            r2 = 0
            if (r0 == 0) goto L_0x000b
            return r2
        L_0x000b:
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            java.lang.String r4 = "type"
            r3.put(r4, r0)
            java.lang.String r0 = "entry"
            r4 = r18
            r3.put(r0, r4)
            g.e.a.b.f.b.n4 r0 = r1.a
            g.e.a.b.f.b.f r0 = r0.f3258g
            r4 = 5
            r5 = 0
            r6 = 5
        L_0x0027:
            if (r5 >= r4) goto L_0x012e
            r7 = 0
            r8 = 1
            android.database.sqlite.SQLiteDatabase r9 = r16.l()     // Catch:{ SQLiteFullException -> 0x00fb, SQLiteDatabaseLockedException -> 0x00e9, SQLiteException -> 0x00c2, all -> 0x00be }
            if (r9 != 0) goto L_0x0034
            r1.f3422d = r8     // Catch:{ SQLiteFullException -> 0x00bc, SQLiteDatabaseLockedException -> 0x00ea, SQLiteException -> 0x00b8 }
            return r2
        L_0x0034:
            r9.beginTransaction()     // Catch:{ SQLiteFullException -> 0x00bc, SQLiteDatabaseLockedException -> 0x00ea, SQLiteException -> 0x00b8 }
            java.lang.String r0 = "select count(1) from messages"
            android.database.Cursor r10 = r9.rawQuery(r0, r7)     // Catch:{ SQLiteFullException -> 0x00bc, SQLiteDatabaseLockedException -> 0x00ea, SQLiteException -> 0x00b8 }
            r11 = 0
            if (r10 == 0) goto L_0x0052
            boolean r0 = r10.moveToFirst()     // Catch:{ SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b1, SQLiteException -> 0x004e, all -> 0x004c }
            if (r0 == 0) goto L_0x0052
            long r11 = r10.getLong(r2)     // Catch:{ SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b1, SQLiteException -> 0x004e, all -> 0x004c }
            goto L_0x0052
        L_0x004c:
            r0 = move-exception
            goto L_0x00ac
        L_0x004e:
            r0 = move-exception
            goto L_0x00af
        L_0x0050:
            r0 = move-exception
            goto L_0x00b3
        L_0x0052:
            java.lang.String r0 = "messages"
            r13 = 100000(0x186a0, double:4.94066E-319)
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 < 0) goto L_0x0099
            g.e.a.b.f.b.n4 r15 = r1.a     // Catch:{ SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b1, SQLiteException -> 0x004e, all -> 0x004c }
            g.e.a.b.f.b.f3 r15 = r15.d()     // Catch:{ SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b1, SQLiteException -> 0x004e, all -> 0x004c }
            g.e.a.b.f.b.d3 r15 = r15.f3136f     // Catch:{ SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b1, SQLiteException -> 0x004e, all -> 0x004c }
            java.lang.String r4 = "Data loss, local db full"
            r15.a(r4)     // Catch:{ SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b1, SQLiteException -> 0x004e, all -> 0x004c }
            long r13 = r13 - r11
            r11 = 1
            long r13 = r13 + r11
            java.lang.String[] r4 = new java.lang.String[r8]     // Catch:{ SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b1, SQLiteException -> 0x004e, all -> 0x004c }
            java.lang.String r11 = java.lang.Long.toString(r13)     // Catch:{ SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b1, SQLiteException -> 0x004e, all -> 0x004c }
            r4[r2] = r11     // Catch:{ SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b1, SQLiteException -> 0x004e, all -> 0x004c }
            java.lang.String r11 = "rowid in (select rowid from messages order by rowid asc limit ?)"
            int r4 = r9.delete(r0, r11, r4)     // Catch:{ SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b1, SQLiteException -> 0x004e, all -> 0x004c }
            long r11 = (long) r4     // Catch:{ SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b1, SQLiteException -> 0x004e, all -> 0x004c }
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0099
            g.e.a.b.f.b.n4 r4 = r1.a     // Catch:{ SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b1, SQLiteException -> 0x004e, all -> 0x004c }
            g.e.a.b.f.b.f3 r4 = r4.d()     // Catch:{ SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b1, SQLiteException -> 0x004e, all -> 0x004c }
            g.e.a.b.f.b.d3 r4 = r4.f3136f     // Catch:{ SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b1, SQLiteException -> 0x004e, all -> 0x004c }
            java.lang.String r15 = "Different delete count than expected in local db. expected, received, difference"
            java.lang.Long r2 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b1, SQLiteException -> 0x004e, all -> 0x004c }
            java.lang.Long r8 = java.lang.Long.valueOf(r11)     // Catch:{ SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b1, SQLiteException -> 0x004e, all -> 0x004c }
            long r13 = r13 - r11
            java.lang.Long r11 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b1, SQLiteException -> 0x004e, all -> 0x004c }
            r4.d(r15, r2, r8, r11)     // Catch:{ SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b1, SQLiteException -> 0x004e, all -> 0x004c }
        L_0x0099:
            r9.insertOrThrow(r0, r7, r3)     // Catch:{ SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b1, SQLiteException -> 0x004e, all -> 0x004c }
            r9.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b1, SQLiteException -> 0x004e, all -> 0x004c }
            r9.endTransaction()     // Catch:{ SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b1, SQLiteException -> 0x004e, all -> 0x004c }
            if (r10 == 0) goto L_0x00a7
            r10.close()
        L_0x00a7:
            r9.close()
            r2 = 1
            return r2
        L_0x00ac:
            r7 = r10
            goto L_0x0123
        L_0x00af:
            r7 = r10
            goto L_0x00b9
        L_0x00b1:
            r7 = r10
            goto L_0x00ea
        L_0x00b3:
            r7 = r10
            goto L_0x00fd
        L_0x00b5:
            r0 = move-exception
            goto L_0x0123
        L_0x00b8:
            r0 = move-exception
        L_0x00b9:
            r2 = r7
            r7 = r9
            goto L_0x00c4
        L_0x00bc:
            r0 = move-exception
            goto L_0x00fd
        L_0x00be:
            r0 = move-exception
            r9 = r7
            goto L_0x0123
        L_0x00c2:
            r0 = move-exception
            r2 = r7
        L_0x00c4:
            if (r7 == 0) goto L_0x00cf
            boolean r4 = r7.inTransaction()     // Catch:{ all -> 0x00e7 }
            if (r4 == 0) goto L_0x00cf
            r7.endTransaction()     // Catch:{ all -> 0x00e7 }
        L_0x00cf:
            g.e.a.b.f.b.n4 r4 = r1.a     // Catch:{ all -> 0x00e7 }
            g.e.a.b.f.b.f3 r4 = r4.d()     // Catch:{ all -> 0x00e7 }
            g.e.a.b.f.b.d3 r4 = r4.f3136f     // Catch:{ all -> 0x00e7 }
            java.lang.String r8 = "Error writing entry to local database"
            r4.b(r8, r0)     // Catch:{ all -> 0x00e7 }
            r4 = 1
            r1.f3422d = r4     // Catch:{ all -> 0x00e7 }
            if (r2 == 0) goto L_0x00e4
            r2.close()
        L_0x00e4:
            if (r7 == 0) goto L_0x0118
            goto L_0x0115
        L_0x00e7:
            r0 = move-exception
            goto L_0x0121
        L_0x00e9:
            r9 = r7
        L_0x00ea:
            long r10 = (long) r6
            android.os.SystemClock.sleep(r10)     // Catch:{ all -> 0x00b5 }
            int r6 = r6 + 20
            if (r7 == 0) goto L_0x00f5
            r7.close()
        L_0x00f5:
            if (r9 == 0) goto L_0x0118
            r9.close()
            goto L_0x0118
        L_0x00fb:
            r0 = move-exception
            r9 = r7
        L_0x00fd:
            g.e.a.b.f.b.n4 r2 = r1.a     // Catch:{ all -> 0x011e }
            g.e.a.b.f.b.f3 r2 = r2.d()     // Catch:{ all -> 0x011e }
            g.e.a.b.f.b.d3 r2 = r2.f3136f     // Catch:{ all -> 0x011e }
            java.lang.String r4 = "Error writing entry; local database full"
            r2.b(r4, r0)     // Catch:{ all -> 0x011e }
            r2 = 1
            r1.f3422d = r2     // Catch:{ all -> 0x011e }
            if (r7 == 0) goto L_0x0112
            r7.close()
        L_0x0112:
            if (r9 == 0) goto L_0x0118
            r7 = r9
        L_0x0115:
            r7.close()
        L_0x0118:
            int r5 = r5 + 1
            r2 = 0
            r4 = 5
            goto L_0x0027
        L_0x011e:
            r0 = move-exception
            r2 = r7
            r7 = r9
        L_0x0121:
            r9 = r7
            r7 = r2
        L_0x0123:
            if (r7 == 0) goto L_0x0128
            r7.close()
        L_0x0128:
            if (r9 == 0) goto L_0x012d
            r9.close()
        L_0x012d:
            throw r0
        L_0x012e:
            g.e.a.b.f.b.n4 r0 = r1.a
            g.e.a.b.f.b.f3 r0 = r0.d()
            g.e.a.b.f.b.d3 r0 = r0.n
            java.lang.String r2 = "Failed to write entry to local database"
            r0.a(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.z2.o(int, byte[]):boolean");
    }
}
