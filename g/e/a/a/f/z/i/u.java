package g.e.a.a.f.z.i;

import android.database.sqlite.SQLiteDatabase;
import g.e.a.a.f.z.i.j0;

public final /* synthetic */ class u implements j0.a {
    public static final /* synthetic */ u a = new u();

    public final void a(SQLiteDatabase sQLiteDatabase) {
        String str = j0.c;
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(j0.c);
    }
}
