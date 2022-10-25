package com.tencent.beacon.a.d;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v4.media.session.PlaybackStateCompat;
import com.tencent.beacon.a.b.g;
import g.a.a.a.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public class c extends SQLiteOpenHelper {
    private String a = "";

    public c(String str) {
        super(com.tencent.beacon.a.c.c.d().c(), a.w("beacon_db_", str), (SQLiteDatabase.CursorFactory) null, 1);
        com.tencent.beacon.base.util.c.a("[DB]", 0, "DBOpenHelper construc.", new Object[0]);
        this.a = "beacon_db_" + str;
    }

    private boolean a(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor;
        try {
            ArrayList arrayList = new ArrayList();
            cursor = sQLiteDatabase.query("sqlite_master", new String[]{"name"}, "type = 'table'", (String[]) null, (String) null, (String) null, (String) null);
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    try {
                        arrayList.add(cursor.getString(0));
                    } catch (Throwable th) {
                        th = th;
                    }
                }
            }
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (!str.equals("sqlite_sequence")) {
                        if (!str.equals("android_metadata")) {
                            sQLiteDatabase.execSQL("drop table if exists " + str);
                            com.tencent.beacon.base.util.c.a("[DB]", 1, "[db] drop %s", str);
                        }
                    }
                }
            }
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            return true;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            try {
                g.e().a("608", "[db] drop all tables error! ", th);
                com.tencent.beacon.base.util.c.a(th);
                return false;
            } finally {
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
            }
        }
    }

    private void b(SQLiteDatabase sQLiteDatabase) {
        if (a(sQLiteDatabase)) {
            com.tencent.beacon.base.util.c.a("[DB]", 0, "[db] drop all success recreate!", new Object[0]);
            onCreate(sQLiteDatabase);
            return;
        }
        com.tencent.beacon.base.util.c.e("[db] drop all fail try deleted file,may next time will success!", new Object[0]);
        File databasePath = com.tencent.beacon.a.c.c.d().c().getDatabasePath(this.a);
        if (databasePath != null && databasePath.canWrite()) {
            databasePath.delete();
        }
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        super.onConfigure(sQLiteDatabase);
        sQLiteDatabase.setPageSize(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
        sQLiteDatabase.enableWriteAheadLogging();
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        com.tencent.beacon.base.util.c.a("[DB]", 0, "DBOpenHelper onCreate.", new Object[0]);
        try {
            for (String execSQL : b.a) {
                sQLiteDatabase.execSQL(execSQL);
            }
        } catch (SQLException e2) {
            g e3 = g.e();
            StringBuilder i2 = a.i("error msg: ");
            i2.append(e2.getMessage());
            e3.a("601", i2.toString(), e2);
            com.tencent.beacon.base.util.c.b("[DB] crate db table error!", new Object[0]);
            com.tencent.beacon.base.util.c.a((Throwable) e2);
        }
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        com.tencent.beacon.base.util.c.a("[DB]", 0, "[db] Downgrade a db  [%s] from v %d to  v%d , deleted all tables!", this.a, Integer.valueOf(i2), Integer.valueOf(i3));
        b(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        com.tencent.beacon.base.util.c.a("[DB]", 0, "[db] Upgrade a db  [%s] from v %d to v %d , deleted all tables!", this.a, Integer.valueOf(i2), Integer.valueOf(i3));
        b(sQLiteDatabase);
    }
}
