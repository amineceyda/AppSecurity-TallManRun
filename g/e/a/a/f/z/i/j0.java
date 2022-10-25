package g.e.a.a.f.z.i;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

public final class j0 extends SQLiteOpenHelper {
    public static final String c;

    /* renamed from: d  reason: collision with root package name */
    public static int f2826d = 5;

    /* renamed from: e  reason: collision with root package name */
    public static final a f2827e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f2828f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f2829g;

    /* renamed from: h  reason: collision with root package name */
    public static final a f2830h;

    /* renamed from: i  reason: collision with root package name */
    public static final a f2831i;

    /* renamed from: j  reason: collision with root package name */
    public static final List<a> f2832j;
    public final int a;
    public boolean b = false;

    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        StringBuilder i2 = g.a.a.a.a.i("INSERT INTO global_log_event_state VALUES (");
        i2.append(System.currentTimeMillis());
        i2.append(")");
        c = i2.toString();
        t tVar = t.a;
        f2827e = tVar;
        q qVar = q.a;
        f2828f = qVar;
        r rVar = r.a;
        f2829g = rVar;
        s sVar = s.a;
        f2830h = sVar;
        u uVar = u.a;
        f2831i = uVar;
        f2832j = Arrays.asList(new a[]{tVar, qVar, rVar, sVar, uVar});
    }

    public j0(Context context, String str, int i2) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i2);
        this.a = i2;
    }

    public final void a(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        List<a> list = f2832j;
        if (i3 <= list.size()) {
            while (i2 < i3) {
                f2832j.get(i2).a(sQLiteDatabase);
                i2++;
            }
            return;
        }
        StringBuilder k2 = g.a.a.a.a.k("Migration from ", i2, " to ", i3, " was requested, but cannot be performed. Only ");
        k2.append(list.size());
        k2.append(" migrations are provided");
        throw new IllegalArgumentException(k2.toString());
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i2 = this.a;
        if (!this.b) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, i2);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.b) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, i3);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.b) {
            onConfigure(sQLiteDatabase);
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        if (!this.b) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, i2, i3);
    }
}
