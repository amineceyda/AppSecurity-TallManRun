package g.e.a.b.f.b;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import g.e.a.b.b.h.e;

public final class j extends SQLiteOpenHelper {
    public final /* synthetic */ k a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(k kVar, Context context) {
        super(context, "google_app_measurement.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.a = kVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002b A[SYNTHETIC, Splitter:B:7:0x002b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.database.sqlite.SQLiteDatabase getWritableDatabase() {
        /*
            r7 = this;
            g.e.a.b.f.b.k r0 = r7.a
            g.e.a.b.f.b.x8 r1 = r0.f3219e
            g.e.a.b.f.b.n4 r0 = r0.a
            g.e.a.b.f.b.f r0 = r0.f3258g
            long r2 = r1.b
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0011
            goto L_0x0026
        L_0x0011:
            g.e.a.b.b.h.b r0 = r1.a
            g.e.a.b.b.h.c r0 = (g.e.a.b.b.h.c) r0
            java.util.Objects.requireNonNull(r0)
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r0 = r1.b
            long r2 = r2 - r0
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 < 0) goto L_0x0028
        L_0x0026:
            r0 = 1
            goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            if (r0 == 0) goto L_0x0093
            android.database.sqlite.SQLiteDatabase r0 = super.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0030 }
            return r0
        L_0x0030:
            g.e.a.b.f.b.k r0 = r7.a
            g.e.a.b.f.b.x8 r0 = r0.f3219e
            g.e.a.b.b.h.b r1 = r0.a
            g.e.a.b.b.h.c r1 = (g.e.a.b.b.h.c) r1
            java.util.Objects.requireNonNull(r1)
            long r1 = android.os.SystemClock.elapsedRealtime()
            r0.b = r1
            g.e.a.b.f.b.k r0 = r7.a
            g.e.a.b.f.b.n4 r0 = r0.a
            g.e.a.b.f.b.f3 r0 = r0.d()
            g.e.a.b.f.b.d3 r0 = r0.f3136f
            java.lang.String r1 = "Opening the database failed, dropping and recreating it"
            r0.a(r1)
            g.e.a.b.f.b.k r0 = r7.a
            g.e.a.b.f.b.n4 r0 = r0.a
            g.e.a.b.f.b.f r0 = r0.f3258g
            java.lang.String r0 = "google_app_measurement.db"
            g.e.a.b.f.b.k r1 = r7.a
            g.e.a.b.f.b.n4 r1 = r1.a
            android.content.Context r1 = r1.a
            java.io.File r1 = r1.getDatabasePath(r0)
            boolean r1 = r1.delete()
            if (r1 != 0) goto L_0x0077
            g.e.a.b.f.b.k r1 = r7.a
            g.e.a.b.f.b.n4 r1 = r1.a
            g.e.a.b.f.b.f3 r1 = r1.d()
            g.e.a.b.f.b.d3 r1 = r1.f3136f
            java.lang.String r2 = "Failed to delete corrupted db file"
            r1.b(r2, r0)
        L_0x0077:
            android.database.sqlite.SQLiteDatabase r0 = super.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0082 }
            g.e.a.b.f.b.k r1 = r7.a     // Catch:{ SQLiteException -> 0x0082 }
            g.e.a.b.f.b.x8 r1 = r1.f3219e     // Catch:{ SQLiteException -> 0x0082 }
            r1.b = r4     // Catch:{ SQLiteException -> 0x0082 }
            return r0
        L_0x0082:
            r0 = move-exception
            g.e.a.b.f.b.k r1 = r7.a
            g.e.a.b.f.b.n4 r1 = r1.a
            g.e.a.b.f.b.f3 r1 = r1.d()
            g.e.a.b.f.b.d3 r1 = r1.f3136f
            java.lang.String r2 = "Failed to open freshly created database"
            r1.b(r2, r0)
            throw r0
        L_0x0093:
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException
            java.lang.String r1 = "Database open failed"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.j.getWritableDatabase():android.database.sqlite.SQLiteDatabase");
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        e.H(this.a.a.d(), sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        e.A(this.a.a.d(), sQLiteDatabase2, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", k.f3210f);
        e.A(this.a.a.d(), sQLiteDatabase2, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", (String[]) null);
        e.A(this.a.a.d(), sQLiteDatabase2, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", k.f3211g);
        e.A(this.a.a.d(), sQLiteDatabase2, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", k.f3212h);
        e.A(this.a.a.d(), sQLiteDatabase2, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", k.f3214j);
        e.A(this.a.a.d(), sQLiteDatabase2, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", (String[]) null);
        e.A(this.a.a.d(), sQLiteDatabase2, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", k.f3213i);
        e.A(this.a.a.d(), sQLiteDatabase2, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", k.f3215k);
        e.A(this.a.a.d(), sQLiteDatabase2, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", k.f3216l);
        e.A(this.a.a.d(), sQLiteDatabase2, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", (String[]) null);
        e.A(this.a.a.d(), sQLiteDatabase2, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", k.f3217m);
        e.A(this.a.a.d(), sQLiteDatabase2, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", (String[]) null);
        e.A(this.a.a.d(), sQLiteDatabase2, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", (String[]) null);
        e.A(this.a.a.d(), sQLiteDatabase2, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", (String[]) null);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }
}
