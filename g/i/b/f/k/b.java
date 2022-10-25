package g.i.b.f.k;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.LinkedList;
import java.util.List;

public final class b {
    public e a;
    public long b = 0;
    public long c = 0;

    /* renamed from: d  reason: collision with root package name */
    public long f4287d = 0;

    /* renamed from: e  reason: collision with root package name */
    public long f4288e = 0;

    /* renamed from: f  reason: collision with root package name */
    public long f4289f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f4290g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f4291h = 0;

    /* renamed from: i  reason: collision with root package name */
    public List<a> f4292i = new LinkedList();

    public static class a {
        public int a = 0;
        public int b = 0;

        public a(int i2) {
            this.a = i2;
        }
    }

    /* renamed from: g.i.b.f.k.b$b  reason: collision with other inner class name */
    public abstract class C0159b extends SQLiteOpenHelper {
        public C0159b(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        }

        public final void a(SQLiteDatabase sQLiteDatabase) {
            try {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS history_task_table (id INTEGER PRIMARY KEY AUTOINCREMENT,taskid TEXT,type INTEGER,knownsize TEXT,category TEXT,priority TEXT,url TEXT,saveDir TEXT,saveName TEXT,status INTEGER,totalLen INTEGER,rcvLen INTEGER,pencent INTEGER);");
            } catch (SQLException e2) {
                throw e2;
            }
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            a(sQLiteDatabase);
        }

        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS history_task_table");
            } catch (SQLException e2) {
                try {
                    e2.printStackTrace();
                } catch (Exception e3) {
                    e3.printStackTrace();
                    return;
                }
            }
            a(sQLiteDatabase);
        }

        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            super.onOpen(sQLiteDatabase);
            try {
                int version = sQLiteDatabase.getVersion();
                if (version <= 0) {
                    onUpgrade(sQLiteDatabase, version, 1);
                } else if (version > 1) {
                    onDowngrade(sQLiteDatabase, version, 1);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS history_task_table");
            } catch (SQLException e2) {
                try {
                    e2.printStackTrace();
                } catch (Exception e3) {
                    e3.printStackTrace();
                    return;
                }
            }
            a(sQLiteDatabase);
        }
    }

    public final class c extends C0159b {
        public c(Context context) {
            super(context, "history_task_table");
        }
    }

    public b(e eVar) {
        this.a = eVar;
    }
}
