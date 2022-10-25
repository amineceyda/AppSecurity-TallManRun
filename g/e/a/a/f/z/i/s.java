package g.e.a.a.f.z.i;

import android.database.sqlite.SQLiteDatabase;
import g.e.a.a.f.z.i.j0;

public final /* synthetic */ class s implements j0.a {
    public static final /* synthetic */ s a = new s();

    public final void a(SQLiteDatabase sQLiteDatabase) {
        String str = j0.c;
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }
}
