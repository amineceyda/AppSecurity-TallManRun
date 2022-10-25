package g.i.b.e.e;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import g.i.b.e.c;
import g.i.b.e.h.b;
import java.util.concurrent.ConcurrentHashMap;

public class e extends SQLiteOpenHelper {
    public static volatile e a;

    public static final class a {
        public long a;
        public String b;

        public a(long j2, String str) {
            this.a = j2;
            this.b = str;
        }

        public a(long j2, String str, String str2) {
            this.a = j2;
            this.b = str;
        }
    }

    static {
        new ConcurrentHashMap();
    }

    public e(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 2);
    }

    public static e b(String str) {
        if (a == null) {
            synchronized (e.class) {
                if (a == null) {
                    String str2 = c.o ? "_test_" : "_";
                    a = new e(c.f4125g, "HalleyAction_" + c.f4126h + str2 + c.a() + "_" + str + ".db");
                }
            }
        }
        return a;
    }

    public static void c(SQLiteDatabase sQLiteDatabase) {
        b.f("halley-cloud-HalleyActionDB", "dropTable");
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS halley_action_tbl");
        } catch (SQLException unused) {
        }
    }

    public static void e(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS halley_action_tbl (key INTEGER PRIMARY KEY AUTOINCREMENT,data TEXT,state TEXT);");
            b.f("halley-cloud-HalleyActionDB", "db created.");
        } catch (SQLException e2) {
            throw e2;
        }
    }

    public static void f(String str) {
        b.c("halley-cloud-HalleyActionDB", "print msg db on:".concat(str));
    }

    public final int a(boolean z, boolean z2) {
        StringBuilder sb;
        boolean z3 = z;
        boolean z4 = z2;
        int i2 = 0;
        Cursor cursor = null;
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            Cursor query = (!z3 || !z4) ? z3 ? writableDatabase.query("halley_action_tbl", new String[]{"key"}, "state=?", new String[]{"add"}, (String) null, (String) null, (String) null) : writableDatabase.query("halley_action_tbl", new String[]{"key"}, "state=?", new String[]{"remove"}, (String) null, (String) null, (String) null) : writableDatabase.query("halley_action_tbl", new String[]{"key"}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
            if (query != null) {
                i2 = query.getCount();
            }
            if (query != null) {
                query.close();
            }
            sb = new StringBuilder("queryRecordCount add:");
            sb.append(z3);
            sb.append(", remove:");
            sb.append(z4);
            sb.append(",count:");
            sb.append(i2);
        } catch (Throwable th) {
            Throwable th2 = th;
            if (cursor != null) {
                cursor.close();
            }
            b.c("halley-cloud-HalleyActionDB", "queryRecordCount add:" + z3 + ", remove:" + z4 + ",count:0");
            throw th2;
        }
        b.c("halley-cloud-HalleyActionDB", sb.toString());
        return i2;
    }

    public final long d(String str) {
        b.c("halley-cloud-HalleyActionDB", "insertRecord:".concat(String.valueOf(str)));
        f("insertRecord start");
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("data", str);
            contentValues.put("state", "add");
            return writableDatabase.insert("halley_action_tbl", (String) null, contentValues);
        } catch (Exception e2) {
            b.e("halley-cloud-HalleyActionDB", "insertRecord failed.", e2);
            return -1;
        } finally {
            f("insertRecord end");
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        e(sQLiteDatabase);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        try {
            c(sQLiteDatabase);
            e(sQLiteDatabase);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        try {
            int version = sQLiteDatabase.getVersion();
            b.f("halley-cloud-HalleyActionDB", "onOpen, old version:" + version + ", cur version:2");
            if (version < 2) {
                onUpgrade(sQLiteDatabase, version, 2);
            } else if (version > 2) {
                onDowngrade(sQLiteDatabase, version, 2);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        try {
            c(sQLiteDatabase);
            e(sQLiteDatabase);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
