package g.e.a.a.f.z.i;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import g.e.a.a.f.c0.a;
import g.e.a.a.f.p;
import g.e.a.a.f.z.i.h0;

public final /* synthetic */ class f implements h0.b {
    public final /* synthetic */ long a;
    public final /* synthetic */ p b;

    public /* synthetic */ f(long j2, p pVar) {
        this.a = j2;
        this.b = pVar;
    }

    public final Object a(Object obj) {
        long j2 = this.a;
        p pVar = this.b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j2));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(a.a(pVar.d()))}) < 1) {
            contentValues.put("backend_name", pVar.b());
            contentValues.put("priority", Integer.valueOf(a.a(pVar.d())));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }
}
