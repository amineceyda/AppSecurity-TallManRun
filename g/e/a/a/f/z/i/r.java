package g.e.a.a.f.z.i;

import android.database.sqlite.SQLiteDatabase;
import g.e.a.a.f.z.i.j0;

public final /* synthetic */ class r implements j0.a {
    public static final /* synthetic */ r a = new r();

    public final void a(SQLiteDatabase sQLiteDatabase) {
        String str = j0.c;
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
