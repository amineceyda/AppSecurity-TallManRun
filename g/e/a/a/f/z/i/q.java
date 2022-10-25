package g.e.a.a.f.z.i;

import android.database.sqlite.SQLiteDatabase;
import g.e.a.a.f.z.i.j0;

public final /* synthetic */ class q implements j0.a {
    public static final /* synthetic */ q a = new q();

    public final void a(SQLiteDatabase sQLiteDatabase) {
        String str = j0.c;
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }
}
