package g.e.a.a.f.z.i;

import android.database.sqlite.SQLiteDatabase;
import g.e.a.a.f.x.a.f;
import g.e.a.a.f.z.i.h0;

public final /* synthetic */ class k implements h0.b {
    public final /* synthetic */ long a;

    public /* synthetic */ k(long j2) {
        this.a = j2;
    }

    public final Object a(Object obj) {
        return (f) h0.q(((SQLiteDatabase) obj).rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new c(this.a));
    }
}
