package com.tencent.beacon.e;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.tencent.beacon.a.d.a;
import com.tencent.beacon.base.util.b;
import com.tencent.beacon.base.util.c;
import com.tencent.beacon.module.ModuleName;
import com.tencent.beacon.module.StrategyModule;
import java.util.Locale;

public final class j {
    private static String a;

    public static class a extends SQLiteOpenHelper {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Context context, String str) {
            super(context, TextUtils.isEmpty(str) ? "beacon_db" : g.a.a.a.a.w("beacon_db_", str), (SQLiteDatabase.CursorFactory) null, 30);
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(String.format(Locale.US, "CREATE TABLE %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT, %s int unique , %s int , %s blob)", new Object[]{"t_strategy", "_id", "_key", "_ut", "_datas"}));
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            c.a("[db] Upgrade a db  [%s] from v %d to v %d , deleted all tables!", "beacon_db", Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.tencent.beacon.e.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.tencent.beacon.e.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: com.tencent.beacon.e.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: com.tencent.beacon.e.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: com.tencent.beacon.e.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: android.database.Cursor} */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0037, code lost:
        return null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b0 A[SYNTHETIC, Splitter:B:68:0x00b0] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00c9 A[SYNTHETIC, Splitter:B:80:0x00c9] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized com.tencent.beacon.e.i a(android.content.Context r15, int r16) {
        /*
            r0 = r15
            java.lang.Class<com.tencent.beacon.e.j> r1 = com.tencent.beacon.e.j.class
            monitor-enter(r1)
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L_0x0011
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x00de }
            java.lang.String r2 = "[db] context is null"
            com.tencent.beacon.base.util.c.e(r2, r0)     // Catch:{ all -> 0x00de }
            monitor-exit(r1)
            return r3
        L_0x0011:
            com.tencent.beacon.a.c.c r4 = com.tencent.beacon.a.c.c.d()     // Catch:{ all -> 0x00de }
            java.lang.String r4 = r4.f()     // Catch:{ all -> 0x00de }
            com.tencent.beacon.e.j$a r5 = new com.tencent.beacon.e.j$a     // Catch:{ Exception -> 0x009d, all -> 0x009a }
            r5.<init>(r15, r4)     // Catch:{ Exception -> 0x009d, all -> 0x009a }
            android.database.sqlite.SQLiteDatabase r4 = r5.getWritableDatabase()     // Catch:{ Exception -> 0x009d, all -> 0x009a }
            if (r4 != 0) goto L_0x003b
            java.lang.String r0 = "[db] getWritableDatabase fail!"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0097 }
            com.tencent.beacon.base.util.c.e(r0, r2)     // Catch:{ Exception -> 0x0097 }
            if (r4 == 0) goto L_0x0036
            boolean r0 = r4.isOpen()     // Catch:{ all -> 0x00de }
            if (r0 == 0) goto L_0x0036
            r4.close()     // Catch:{ all -> 0x00de }
        L_0x0036:
            monitor-exit(r1)
            return r3
        L_0x0038:
            r0 = move-exception
            goto L_0x00c7
        L_0x003b:
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ Exception -> 0x0097 }
            java.lang.String r5 = " %s = %d "
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0097 }
            java.lang.String r7 = "_key"
            r6[r2] = r7     // Catch:{ Exception -> 0x0097 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r16)     // Catch:{ Exception -> 0x0097 }
            r14 = 1
            r6[r14] = r7     // Catch:{ Exception -> 0x0097 }
            java.lang.String r9 = java.lang.String.format(r0, r5, r6)     // Catch:{ Exception -> 0x0097 }
            java.lang.String r7 = "t_strategy"
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r6 = r4
            android.database.Cursor r5 = r6.query(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0097 }
            if (r5 == 0) goto L_0x0082
            boolean r0 = r5.moveToNext()     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            if (r0 == 0) goto L_0x0082
            com.tencent.beacon.e.i r3 = a(r5)     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            if (r3 == 0) goto L_0x0082
            java.lang.String r0 = "[db] read strategy key: %d"
            java.lang.Object[] r6 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            int r7 = r3.b     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            r6[r2] = r7     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            com.tencent.beacon.base.util.c.a((java.lang.String) r0, (java.lang.Object[]) r6)     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            goto L_0x0082
        L_0x007b:
            r0 = move-exception
            r3 = r5
            goto L_0x00c7
        L_0x007e:
            r0 = move-exception
            r2 = r3
            r3 = r5
            goto L_0x00a0
        L_0x0082:
            if (r5 == 0) goto L_0x008d
            boolean r0 = r5.isClosed()     // Catch:{ all -> 0x00de }
            if (r0 != 0) goto L_0x008d
            r5.close()     // Catch:{ all -> 0x00de }
        L_0x008d:
            boolean r0 = r4.isOpen()     // Catch:{ all -> 0x00de }
            if (r0 == 0) goto L_0x00c5
            r4.close()     // Catch:{ all -> 0x00de }
            goto L_0x00c5
        L_0x0097:
            r0 = move-exception
            r2 = r3
            goto L_0x00a0
        L_0x009a:
            r0 = move-exception
            r4 = r3
            goto L_0x00c7
        L_0x009d:
            r0 = move-exception
            r2 = r3
            r4 = r2
        L_0x00a0:
            com.tencent.beacon.a.b.g r5 = com.tencent.beacon.a.b.g.e()     // Catch:{ all -> 0x0038 }
            java.lang.String r6 = "605"
            java.lang.String r7 = "[db] TB: t_strategy query fail!"
            r5.a(r6, r7)     // Catch:{ all -> 0x0038 }
            com.tencent.beacon.base.util.c.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x0038 }
            if (r3 == 0) goto L_0x00b9
            boolean r0 = r3.isClosed()     // Catch:{ all -> 0x00de }
            if (r0 != 0) goto L_0x00b9
            r3.close()     // Catch:{ all -> 0x00de }
        L_0x00b9:
            if (r4 == 0) goto L_0x00c4
            boolean r0 = r4.isOpen()     // Catch:{ all -> 0x00de }
            if (r0 == 0) goto L_0x00c4
            r4.close()     // Catch:{ all -> 0x00de }
        L_0x00c4:
            r3 = r2
        L_0x00c5:
            monitor-exit(r1)
            return r3
        L_0x00c7:
            if (r3 == 0) goto L_0x00d2
            boolean r2 = r3.isClosed()     // Catch:{ all -> 0x00de }
            if (r2 != 0) goto L_0x00d2
            r3.close()     // Catch:{ all -> 0x00de }
        L_0x00d2:
            if (r4 == 0) goto L_0x00dd
            boolean r2 = r4.isOpen()     // Catch:{ all -> 0x00de }
            if (r2 == 0) goto L_0x00dd
            r4.close()     // Catch:{ all -> 0x00de }
        L_0x00dd:
            throw r0     // Catch:{ all -> 0x00de }
        L_0x00de:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.beacon.e.j.a(android.content.Context, int):com.tencent.beacon.e.i");
    }

    private static i a(Cursor cursor) {
        if (cursor == null || cursor.isBeforeFirst() || cursor.isAfterLast()) {
            return null;
        }
        c.a("[db] parse bean.", new Object[0]);
        i iVar = new i();
        iVar.a = cursor.getLong(cursor.getColumnIndex("_id"));
        iVar.b = cursor.getInt(cursor.getColumnIndex("_key"));
        iVar.c = cursor.getBlob(cursor.getColumnIndex("_datas"));
        return iVar;
    }

    public static String a() {
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        com.tencent.beacon.a.d.a a2 = com.tencent.beacon.a.d.a.a();
        a = a2.getString("initsdkdate", "");
        if (!b.d().equals(a)) {
            a.C0005a edit = a2.edit();
            if (b.a((SharedPreferences.Editor) edit)) {
                edit.putString("initsdkdate", b.d());
            }
        }
        return a;
    }

    public static boolean b() {
        com.tencent.beacon.a.d.a a2 = com.tencent.beacon.a.d.a.a();
        int i2 = b.d().equals(a()) ? a2.getInt("QUERY_TIMES_KEY", 0) : 0;
        if (i2 <= a.a().c()) {
            int i3 = i2 + 1;
            a.C0005a edit = a2.edit();
            if (!b.a((SharedPreferences.Editor) edit)) {
                return false;
            }
            edit.putInt("QUERY_TIMES_KEY", i3);
            return false;
        }
        c.d("[strategy] sdk init max times", new Object[0]);
        return true;
    }

    public static boolean c() {
        b b = ((StrategyModule) com.tencent.beacon.a.c.c.d().a(ModuleName.STRATEGY)).b();
        if (b.k()) {
            com.tencent.beacon.a.d.a a2 = com.tencent.beacon.a.d.a.a();
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = ((currentTimeMillis / 60000) + 480) % 1440;
            if (j2 >= 0 && j2 <= 30 && currentTimeMillis - a2.getLong("last_success_strategy_query_time", 0) <= 90000000) {
                return true;
            }
            if (b.d().equals(a())) {
                return a2.getInt("today_success_strategy_query_times", 0) >= b.e();
            }
            a.C0005a edit = a2.edit();
            if (b.a((SharedPreferences.Editor) edit)) {
                edit.putInt("today_success_strategy_query_times", 0);
            }
        }
        return false;
    }

    public static void d() {
        b b = ((StrategyModule) com.tencent.beacon.a.c.c.d().a(ModuleName.STRATEGY)).b();
        if (b != null && b.k()) {
            com.tencent.beacon.a.d.a a2 = com.tencent.beacon.a.d.a.a();
            int i2 = a2.getInt("today_success_strategy_query_times", 0) + 1;
            a.C0005a edit = a2.edit();
            if (b.a((SharedPreferences.Editor) edit)) {
                edit.putInt("today_success_strategy_query_times", i2).putLong("last_success_strategy_query_time", System.currentTimeMillis());
            }
        }
    }
}
