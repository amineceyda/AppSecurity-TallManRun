package g.f.a.a.f;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.CancellationSignal;
import g.f.a.a.f.a;

public class d extends c {

    public static class a implements a.C0133a {
        public final CancellationSignal a = new CancellationSignal();
    }

    public Cursor a(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, a.C0133a aVar) {
        if (aVar == null) {
            return sQLiteDatabase.rawQuery(str, strArr);
        }
        return sQLiteDatabase.rawQuery(str, strArr, ((a) aVar).a);
    }

    public a.C0133a b() {
        return new a();
    }
}
