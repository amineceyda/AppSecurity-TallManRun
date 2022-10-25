package g.e.a.a.f.z.i;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import g.e.a.a.f.x.a.c;
import g.e.a.a.f.z.i.h0;

public final /* synthetic */ class i implements h0.b {
    public final /* synthetic */ String a;
    public final /* synthetic */ c.a b;
    public final /* synthetic */ long c;

    public /* synthetic */ i(String str, c.a aVar, long j2) {
        this.a = str;
        this.b = aVar;
        this.c = j2;
    }

    public final Object a(Object obj) {
        String str = this.a;
        c.a aVar = this.b;
        long j2 = this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (!((Boolean) h0.q(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(aVar.a())}), p.a)).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(aVar.a()));
            contentValues.put("events_dropped_count", Long.valueOf(j2));
            sQLiteDatabase.insert("log_event_dropped", (String) null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j2 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(aVar.a())});
        }
        return null;
    }
}
