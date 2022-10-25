package g.e.a.b.f.b;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzab;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzks;
import com.tencent.crabshell.common.AppVersion;
import g.a.a.a.a;
import g.c.b.b.f;
import g.e.a.b.b.h.c;
import g.e.a.b.e.c.v3;
import g.e.a.b.e.c.xa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.slf4j.Marker;

public final class k extends b9 {

    /* renamed from: f  reason: collision with root package name */
    public static final String[] f3210f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f3211g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: h  reason: collision with root package name */
    public static final String[] f3212h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;"};

    /* renamed from: i  reason: collision with root package name */
    public static final String[] f3213i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: j  reason: collision with root package name */
    public static final String[] f3214j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: k  reason: collision with root package name */
    public static final String[] f3215k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: l  reason: collision with root package name */
    public static final String[] f3216l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m  reason: collision with root package name */
    public static final String[] f3217m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: d  reason: collision with root package name */
    public final j f3218d;

    /* renamed from: e  reason: collision with root package name */
    public final x8 f3219e = new x8(this.a.n);

    public k(k9 k9Var) {
        super(k9Var);
        f fVar = this.a.f3258g;
        this.f3218d = new j(this, this.a.a);
    }

    public static final void u(ContentValues contentValues, String str, Object obj) {
        f.k("value");
        Objects.requireNonNull(obj, "null reference");
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    public final SQLiteDatabase A() {
        h();
        try {
            return this.f3218d.getWritableDatabase();
        } catch (SQLiteException e2) {
            this.a.d().f3139i.b("Error opening database", e2);
            throw e2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle B(java.lang.String r8) {
        /*
            r7 = this;
            r7.h()
            r7.i()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.A()     // Catch:{ SQLiteException -> 0x00bd, all -> 0x00bb }
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x00bd, all -> 0x00bb }
            r3 = 0
            r2[r3] = r8     // Catch:{ SQLiteException -> 0x00bd, all -> 0x00bb }
            java.lang.String r4 = "select parameters from default_event_params where app_id=?"
            android.database.Cursor r1 = r1.rawQuery(r4, r2)     // Catch:{ SQLiteException -> 0x00bd, all -> 0x00bb }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x002e }
            if (r2 != 0) goto L_0x0031
            g.e.a.b.f.b.n4 r8 = r7.a     // Catch:{ SQLiteException -> 0x002e }
            g.e.a.b.f.b.f3 r8 = r8.d()     // Catch:{ SQLiteException -> 0x002e }
            g.e.a.b.f.b.d3 r8 = r8.n     // Catch:{ SQLiteException -> 0x002e }
            java.lang.String r2 = "Default event parameters not found"
            r8.a(r2)     // Catch:{ SQLiteException -> 0x002e }
            r1.close()
            return r0
        L_0x002e:
            r8 = move-exception
            goto L_0x00bf
        L_0x0031:
            byte[] r2 = r1.getBlob(r3)     // Catch:{ SQLiteException -> 0x002e }
            g.e.a.b.e.c.u3 r3 = g.e.a.b.e.c.v3.w()     // Catch:{ IOException -> 0x00a5 }
            g.e.a.b.e.c.g6 r2 = g.e.a.b.f.b.m9.B(r3, r2)     // Catch:{ IOException -> 0x00a5 }
            g.e.a.b.e.c.u3 r2 = (g.e.a.b.e.c.u3) r2     // Catch:{ IOException -> 0x00a5 }
            g.e.a.b.e.c.o7 r2 = r2.j()     // Catch:{ IOException -> 0x00a5 }
            g.e.a.b.e.c.v3 r2 = (g.e.a.b.e.c.v3) r2     // Catch:{ IOException -> 0x00a5 }
            g.e.a.b.f.b.k9 r8 = r7.b     // Catch:{ SQLiteException -> 0x002e }
            g.e.a.b.f.b.m9 r8 = r8.f3233g     // Catch:{ SQLiteException -> 0x002e }
            g.e.a.b.f.b.k9.I(r8)     // Catch:{ SQLiteException -> 0x002e }
            java.util.List r8 = r2.A()     // Catch:{ SQLiteException -> 0x002e }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ SQLiteException -> 0x002e }
            r2.<init>()     // Catch:{ SQLiteException -> 0x002e }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ SQLiteException -> 0x002e }
        L_0x0059:
            boolean r3 = r8.hasNext()     // Catch:{ SQLiteException -> 0x002e }
            if (r3 == 0) goto L_0x00a1
            java.lang.Object r3 = r8.next()     // Catch:{ SQLiteException -> 0x002e }
            g.e.a.b.e.c.z3 r3 = (g.e.a.b.e.c.z3) r3     // Catch:{ SQLiteException -> 0x002e }
            java.lang.String r4 = r3.y()     // Catch:{ SQLiteException -> 0x002e }
            boolean r5 = r3.L()     // Catch:{ SQLiteException -> 0x002e }
            if (r5 == 0) goto L_0x0077
            double r5 = r3.s()     // Catch:{ SQLiteException -> 0x002e }
            r2.putDouble(r4, r5)     // Catch:{ SQLiteException -> 0x002e }
            goto L_0x0059
        L_0x0077:
            boolean r5 = r3.M()     // Catch:{ SQLiteException -> 0x002e }
            if (r5 == 0) goto L_0x0085
            float r3 = r3.t()     // Catch:{ SQLiteException -> 0x002e }
            r2.putFloat(r4, r3)     // Catch:{ SQLiteException -> 0x002e }
            goto L_0x0059
        L_0x0085:
            boolean r5 = r3.P()     // Catch:{ SQLiteException -> 0x002e }
            if (r5 == 0) goto L_0x0093
            java.lang.String r3 = r3.z()     // Catch:{ SQLiteException -> 0x002e }
            r2.putString(r4, r3)     // Catch:{ SQLiteException -> 0x002e }
            goto L_0x0059
        L_0x0093:
            boolean r5 = r3.N()     // Catch:{ SQLiteException -> 0x002e }
            if (r5 == 0) goto L_0x0059
            long r5 = r3.v()     // Catch:{ SQLiteException -> 0x002e }
            r2.putLong(r4, r5)     // Catch:{ SQLiteException -> 0x002e }
            goto L_0x0059
        L_0x00a1:
            r1.close()
            return r2
        L_0x00a5:
            r2 = move-exception
            g.e.a.b.f.b.n4 r3 = r7.a     // Catch:{ SQLiteException -> 0x002e }
            g.e.a.b.f.b.f3 r3 = r3.d()     // Catch:{ SQLiteException -> 0x002e }
            g.e.a.b.f.b.d3 r3 = r3.f3136f     // Catch:{ SQLiteException -> 0x002e }
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = g.e.a.b.f.b.f3.t(r8)     // Catch:{ SQLiteException -> 0x002e }
            r3.c(r4, r8, r2)     // Catch:{ SQLiteException -> 0x002e }
            r1.close()
            return r0
        L_0x00bb:
            r8 = move-exception
            goto L_0x00d4
        L_0x00bd:
            r8 = move-exception
            r1 = r0
        L_0x00bf:
            g.e.a.b.f.b.n4 r2 = r7.a     // Catch:{ all -> 0x00d2 }
            g.e.a.b.f.b.f3 r2 = r2.d()     // Catch:{ all -> 0x00d2 }
            g.e.a.b.f.b.d3 r2 = r2.f3136f     // Catch:{ all -> 0x00d2 }
            java.lang.String r3 = "Error selecting default event parameters"
            r2.b(r3, r8)     // Catch:{ all -> 0x00d2 }
            if (r1 == 0) goto L_0x00d1
            r1.close()
        L_0x00d1:
            return r0
        L_0x00d2:
            r8 = move-exception
            r0 = r1
        L_0x00d4:
            if (r0 == 0) goto L_0x00d9
            r0.close()
        L_0x00d9:
            goto L_0x00db
        L_0x00da:
            throw r8
        L_0x00db:
            goto L_0x00da
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.k.B(java.lang.String):android.os.Bundle");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ee A[Catch:{ SQLiteException -> 0x0251 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00f0 A[Catch:{ SQLiteException -> 0x0251 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x010d A[Catch:{ SQLiteException -> 0x0251 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x010f A[Catch:{ SQLiteException -> 0x0251 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x012c A[Catch:{ SQLiteException -> 0x0251 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x012e A[Catch:{ SQLiteException -> 0x0251 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x014b A[Catch:{ SQLiteException -> 0x0251 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x014d A[Catch:{ SQLiteException -> 0x0251 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x016d A[Catch:{ SQLiteException -> 0x0251 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0171 A[Catch:{ SQLiteException -> 0x0251 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0199 A[Catch:{ SQLiteException -> 0x0251 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x019b A[Catch:{ SQLiteException -> 0x0251 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01b8 A[Catch:{ SQLiteException -> 0x0251 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01ba A[Catch:{ SQLiteException -> 0x0251 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01d7 A[Catch:{ SQLiteException -> 0x0251 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01f0 A[Catch:{ SQLiteException -> 0x0251 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x020c A[Catch:{ SQLiteException -> 0x0251 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x020d A[Catch:{ SQLiteException -> 0x0251 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x021c A[Catch:{ SQLiteException -> 0x0251 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x023f A[Catch:{ SQLiteException -> 0x0251 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0276  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final g.e.a.b.f.b.w4 C(java.lang.String r34) {
        /*
            r33 = this;
            r1 = r33
            r2 = r34
            g.c.b.b.f.k(r34)
            r33.h()
            r33.i()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r33.A()     // Catch:{ SQLiteException -> 0x0259, all -> 0x0257 }
            java.lang.String r5 = "app_instance_id"
            java.lang.String r6 = "gmp_app_id"
            java.lang.String r7 = "resettable_device_id_hash"
            java.lang.String r8 = "last_bundle_index"
            java.lang.String r9 = "last_bundle_start_timestamp"
            java.lang.String r10 = "last_bundle_end_timestamp"
            java.lang.String r11 = "app_version"
            java.lang.String r12 = "app_store"
            java.lang.String r13 = "gmp_version"
            java.lang.String r14 = "dev_cert_hash"
            java.lang.String r15 = "measurement_enabled"
            java.lang.String r16 = "day"
            java.lang.String r17 = "daily_public_events_count"
            java.lang.String r18 = "daily_events_count"
            java.lang.String r19 = "daily_conversions_count"
            java.lang.String r20 = "config_fetched_time"
            java.lang.String r21 = "failed_config_fetch_time"
            java.lang.String r22 = "app_version_int"
            java.lang.String r23 = "firebase_instance_id"
            java.lang.String r24 = "daily_error_events_count"
            java.lang.String r25 = "daily_realtime_events_count"
            java.lang.String r26 = "health_monitor_sample"
            java.lang.String r27 = "android_id"
            java.lang.String r28 = "adid_reporting_enabled"
            java.lang.String r29 = "admob_app_id"
            java.lang.String r30 = "dynamite_version"
            java.lang.String r31 = "safelisted_events"
            java.lang.String r32 = "ga_app_id"
            java.lang.String[] r6 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32}     // Catch:{ SQLiteException -> 0x0259, all -> 0x0257 }
            r0 = 1
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0259, all -> 0x0257 }
            r12 = 0
            r8[r12] = r2     // Catch:{ SQLiteException -> 0x0259, all -> 0x0257 }
            java.lang.String r5 = "apps"
            java.lang.String r7 = "app_id=?"
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x0259, all -> 0x0257 }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0251 }
            if (r5 != 0) goto L_0x0069
            r4.close()
            return r3
        L_0x0069:
            g.e.a.b.f.b.w4 r5 = new g.e.a.b.f.b.w4     // Catch:{ SQLiteException -> 0x0251 }
            g.e.a.b.f.b.k9 r6 = r1.b     // Catch:{ SQLiteException -> 0x0251 }
            g.e.a.b.f.b.n4 r6 = r6.f3238l     // Catch:{ SQLiteException -> 0x0251 }
            r5.<init>(r6, r2)     // Catch:{ SQLiteException -> 0x0251 }
            java.lang.String r6 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x0251 }
            r5.f(r6)     // Catch:{ SQLiteException -> 0x0251 }
            java.lang.String r6 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x0251 }
            r5.o(r6)     // Catch:{ SQLiteException -> 0x0251 }
            r6 = 2
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x0251 }
            r5.w(r6)     // Catch:{ SQLiteException -> 0x0251 }
            r6 = 3
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0251 }
            r5.t(r6)     // Catch:{ SQLiteException -> 0x0251 }
            r6 = 4
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0251 }
            r5.u(r6)     // Catch:{ SQLiteException -> 0x0251 }
            r6 = 5
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0251 }
            r5.r(r6)     // Catch:{ SQLiteException -> 0x0251 }
            r6 = 6
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x0251 }
            r5.h(r6)     // Catch:{ SQLiteException -> 0x0251 }
            r6 = 7
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x0251 }
            r5.g(r6)     // Catch:{ SQLiteException -> 0x0251 }
            r6 = 8
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0251 }
            r5.p(r6)     // Catch:{ SQLiteException -> 0x0251 }
            r6 = 9
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0251 }
            r5.k(r6)     // Catch:{ SQLiteException -> 0x0251 }
            r6 = 10
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x0251 }
            if (r7 != 0) goto L_0x00d3
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x0251 }
            if (r6 == 0) goto L_0x00d1
            goto L_0x00d3
        L_0x00d1:
            r6 = 0
            goto L_0x00d4
        L_0x00d3:
            r6 = 1
        L_0x00d4:
            r5.v(r6)     // Catch:{ SQLiteException -> 0x0251 }
            r6 = 11
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0251 }
            g.e.a.b.f.b.n4 r8 = r5.a     // Catch:{ SQLiteException -> 0x0251 }
            g.e.a.b.f.b.k4 r8 = r8.b()     // Catch:{ SQLiteException -> 0x0251 }
            r8.h()     // Catch:{ SQLiteException -> 0x0251 }
            boolean r8 = r5.C     // Catch:{ SQLiteException -> 0x0251 }
            long r9 = r5.v     // Catch:{ SQLiteException -> 0x0251 }
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L_0x00f0
            r9 = 1
            goto L_0x00f1
        L_0x00f0:
            r9 = 0
        L_0x00f1:
            r8 = r8 | r9
            r5.C = r8     // Catch:{ SQLiteException -> 0x0251 }
            r5.v = r6     // Catch:{ SQLiteException -> 0x0251 }
            r6 = 12
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0251 }
            g.e.a.b.f.b.n4 r8 = r5.a     // Catch:{ SQLiteException -> 0x0251 }
            g.e.a.b.f.b.k4 r8 = r8.b()     // Catch:{ SQLiteException -> 0x0251 }
            r8.h()     // Catch:{ SQLiteException -> 0x0251 }
            boolean r8 = r5.C     // Catch:{ SQLiteException -> 0x0251 }
            long r9 = r5.w     // Catch:{ SQLiteException -> 0x0251 }
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L_0x010f
            r9 = 1
            goto L_0x0110
        L_0x010f:
            r9 = 0
        L_0x0110:
            r8 = r8 | r9
            r5.C = r8     // Catch:{ SQLiteException -> 0x0251 }
            r5.w = r6     // Catch:{ SQLiteException -> 0x0251 }
            r6 = 13
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0251 }
            g.e.a.b.f.b.n4 r8 = r5.a     // Catch:{ SQLiteException -> 0x0251 }
            g.e.a.b.f.b.k4 r8 = r8.b()     // Catch:{ SQLiteException -> 0x0251 }
            r8.h()     // Catch:{ SQLiteException -> 0x0251 }
            boolean r8 = r5.C     // Catch:{ SQLiteException -> 0x0251 }
            long r9 = r5.x     // Catch:{ SQLiteException -> 0x0251 }
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L_0x012e
            r9 = 1
            goto L_0x012f
        L_0x012e:
            r9 = 0
        L_0x012f:
            r8 = r8 | r9
            r5.C = r8     // Catch:{ SQLiteException -> 0x0251 }
            r5.x = r6     // Catch:{ SQLiteException -> 0x0251 }
            r6 = 14
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0251 }
            g.e.a.b.f.b.n4 r8 = r5.a     // Catch:{ SQLiteException -> 0x0251 }
            g.e.a.b.f.b.k4 r8 = r8.b()     // Catch:{ SQLiteException -> 0x0251 }
            r8.h()     // Catch:{ SQLiteException -> 0x0251 }
            boolean r8 = r5.C     // Catch:{ SQLiteException -> 0x0251 }
            long r9 = r5.y     // Catch:{ SQLiteException -> 0x0251 }
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L_0x014d
            r9 = 1
            goto L_0x014e
        L_0x014d:
            r9 = 0
        L_0x014e:
            r8 = r8 | r9
            r5.C = r8     // Catch:{ SQLiteException -> 0x0251 }
            r5.y = r6     // Catch:{ SQLiteException -> 0x0251 }
            r6 = 15
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0251 }
            r5.j(r6)     // Catch:{ SQLiteException -> 0x0251 }
            r6 = 16
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0251 }
            r5.m(r6)     // Catch:{ SQLiteException -> 0x0251 }
            r6 = 17
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x0251 }
            if (r7 == 0) goto L_0x0171
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x0176
        L_0x0171:
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x0251 }
            long r6 = (long) r6     // Catch:{ SQLiteException -> 0x0251 }
        L_0x0176:
            r5.i(r6)     // Catch:{ SQLiteException -> 0x0251 }
            r6 = 18
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x0251 }
            r5.n(r6)     // Catch:{ SQLiteException -> 0x0251 }
            r6 = 19
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0251 }
            g.e.a.b.f.b.n4 r8 = r5.a     // Catch:{ SQLiteException -> 0x0251 }
            g.e.a.b.f.b.k4 r8 = r8.b()     // Catch:{ SQLiteException -> 0x0251 }
            r8.h()     // Catch:{ SQLiteException -> 0x0251 }
            boolean r8 = r5.C     // Catch:{ SQLiteException -> 0x0251 }
            long r9 = r5.z     // Catch:{ SQLiteException -> 0x0251 }
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L_0x019b
            r9 = 1
            goto L_0x019c
        L_0x019b:
            r9 = 0
        L_0x019c:
            r8 = r8 | r9
            r5.C = r8     // Catch:{ SQLiteException -> 0x0251 }
            r5.z = r6     // Catch:{ SQLiteException -> 0x0251 }
            r6 = 20
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0251 }
            g.e.a.b.f.b.n4 r8 = r5.a     // Catch:{ SQLiteException -> 0x0251 }
            g.e.a.b.f.b.k4 r8 = r8.b()     // Catch:{ SQLiteException -> 0x0251 }
            r8.h()     // Catch:{ SQLiteException -> 0x0251 }
            boolean r8 = r5.C     // Catch:{ SQLiteException -> 0x0251 }
            long r9 = r5.A     // Catch:{ SQLiteException -> 0x0251 }
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L_0x01ba
            r9 = 1
            goto L_0x01bb
        L_0x01ba:
            r9 = 0
        L_0x01bb:
            r8 = r8 | r9
            r5.C = r8     // Catch:{ SQLiteException -> 0x0251 }
            r5.A = r6     // Catch:{ SQLiteException -> 0x0251 }
            r6 = 21
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x0251 }
            r5.q(r6)     // Catch:{ SQLiteException -> 0x0251 }
            g.e.a.b.f.b.n4 r6 = r1.a     // Catch:{ SQLiteException -> 0x0251 }
            g.e.a.b.f.b.f r6 = r6.f3258g     // Catch:{ SQLiteException -> 0x0251 }
            g.e.a.b.f.b.r2 r7 = g.e.a.b.f.b.s2.h0     // Catch:{ SQLiteException -> 0x0251 }
            boolean r6 = r6.u(r3, r7)     // Catch:{ SQLiteException -> 0x0251 }
            r7 = 0
            if (r6 != 0) goto L_0x01e8
            r6 = 22
            boolean r9 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x0251 }
            if (r9 == 0) goto L_0x01e1
            r9 = r7
            goto L_0x01e5
        L_0x01e1:
            long r9 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0251 }
        L_0x01e5:
            r5.e(r9)     // Catch:{ SQLiteException -> 0x0251 }
        L_0x01e8:
            r6 = 23
            boolean r9 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x0251 }
            if (r9 != 0) goto L_0x01f8
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x0251 }
            if (r6 == 0) goto L_0x01f7
            goto L_0x01f8
        L_0x01f7:
            r0 = 0
        L_0x01f8:
            r5.d(r0)     // Catch:{ SQLiteException -> 0x0251 }
            r0 = 24
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x0251 }
            r5.c(r0)     // Catch:{ SQLiteException -> 0x0251 }
            r0 = 25
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x0251 }
            if (r6 == 0) goto L_0x020d
            goto L_0x0211
        L_0x020d:
            long r7 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x0251 }
        L_0x0211:
            r5.l(r7)     // Catch:{ SQLiteException -> 0x0251 }
            r0 = 26
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x0251 }
            if (r6 != 0) goto L_0x022e
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x0251 }
            java.lang.String r6 = ","
            r7 = -1
            java.lang.String[] r0 = r0.split(r6, r7)     // Catch:{ SQLiteException -> 0x0251 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ SQLiteException -> 0x0251 }
            r5.x(r0)     // Catch:{ SQLiteException -> 0x0251 }
        L_0x022e:
            g.e.a.b.f.b.n4 r0 = r5.a     // Catch:{ SQLiteException -> 0x0251 }
            g.e.a.b.f.b.k4 r0 = r0.b()     // Catch:{ SQLiteException -> 0x0251 }
            r0.h()     // Catch:{ SQLiteException -> 0x0251 }
            r5.C = r12     // Catch:{ SQLiteException -> 0x0251 }
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x0251 }
            if (r0 == 0) goto L_0x0253
            g.e.a.b.f.b.n4 r0 = r1.a     // Catch:{ SQLiteException -> 0x0251 }
            g.e.a.b.f.b.f3 r0 = r0.d()     // Catch:{ SQLiteException -> 0x0251 }
            g.e.a.b.f.b.d3 r0 = r0.f3136f     // Catch:{ SQLiteException -> 0x0251 }
            java.lang.String r6 = "Got multiple records for app, expected one. appId"
            java.lang.Object r7 = g.e.a.b.f.b.f3.t(r34)     // Catch:{ SQLiteException -> 0x0251 }
            r0.b(r6, r7)     // Catch:{ SQLiteException -> 0x0251 }
            goto L_0x0253
        L_0x0251:
            r0 = move-exception
            goto L_0x025b
        L_0x0253:
            r4.close()
            return r5
        L_0x0257:
            r0 = move-exception
            goto L_0x0274
        L_0x0259:
            r0 = move-exception
            r4 = r3
        L_0x025b:
            g.e.a.b.f.b.n4 r5 = r1.a     // Catch:{ all -> 0x0272 }
            g.e.a.b.f.b.f3 r5 = r5.d()     // Catch:{ all -> 0x0272 }
            g.e.a.b.f.b.d3 r5 = r5.f3136f     // Catch:{ all -> 0x0272 }
            java.lang.String r6 = "Error querying app. appId"
            java.lang.Object r2 = g.e.a.b.f.b.f3.t(r34)     // Catch:{ all -> 0x0272 }
            r5.c(r6, r2, r0)     // Catch:{ all -> 0x0272 }
            if (r4 == 0) goto L_0x0271
            r4.close()
        L_0x0271:
            return r3
        L_0x0272:
            r0 = move-exception
            r3 = r4
        L_0x0274:
            if (r3 == 0) goto L_0x0279
            r3.close()
        L_0x0279:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.k.C(java.lang.String):g.e.a.b.f.b.w4");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0121  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzab D(java.lang.String r31, java.lang.String r32) {
        /*
            r30 = this;
            r1 = r30
            r8 = r32
            g.c.b.b.f.k(r31)
            g.c.b.b.f.k(r32)
            r30.h()
            r30.i()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r30.A()     // Catch:{ SQLiteException -> 0x00fc, all -> 0x00fa }
            java.lang.String r11 = "origin"
            java.lang.String r12 = "value"
            java.lang.String r13 = "active"
            java.lang.String r14 = "trigger_event_name"
            java.lang.String r15 = "trigger_timeout"
            java.lang.String r16 = "timed_out_event"
            java.lang.String r17 = "creation_timestamp"
            java.lang.String r18 = "triggered_event"
            java.lang.String r19 = "triggered_timestamp"
            java.lang.String r20 = "time_to_live"
            java.lang.String r21 = "expired_event"
            java.lang.String[] r12 = new java.lang.String[]{r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}     // Catch:{ SQLiteException -> 0x00fc, all -> 0x00fa }
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x00fc, all -> 0x00fa }
            r2 = 0
            r14[r2] = r31     // Catch:{ SQLiteException -> 0x00fc, all -> 0x00fa }
            r3 = 1
            r14[r3] = r8     // Catch:{ SQLiteException -> 0x00fc, all -> 0x00fa }
            java.lang.String r11 = "conditional_properties"
            java.lang.String r13 = "app_id=? and name=?"
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x00fc, all -> 0x00fa }
            boolean r4 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x00f8 }
            if (r4 != 0) goto L_0x004f
            r10.close()
            return r9
        L_0x004f:
            java.lang.String r4 = r10.getString(r2)     // Catch:{ SQLiteException -> 0x00f8 }
            if (r4 != 0) goto L_0x0057
            java.lang.String r4 = ""
        L_0x0057:
            r17 = r4
            java.lang.Object r6 = r1.I(r10, r3)     // Catch:{ SQLiteException -> 0x00f8 }
            int r0 = r10.getInt(r0)     // Catch:{ SQLiteException -> 0x00f8 }
            if (r0 == 0) goto L_0x0066
            r21 = 1
            goto L_0x0068
        L_0x0066:
            r21 = 0
        L_0x0068:
            r0 = 3
            java.lang.String r22 = r10.getString(r0)     // Catch:{ SQLiteException -> 0x00f8 }
            r0 = 4
            long r24 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f8 }
            g.e.a.b.f.b.k9 r0 = r1.b     // Catch:{ SQLiteException -> 0x00f8 }
            g.e.a.b.f.b.m9 r0 = r0.f3233g     // Catch:{ SQLiteException -> 0x00f8 }
            g.e.a.b.f.b.k9.I(r0)     // Catch:{ SQLiteException -> 0x00f8 }
            r2 = 5
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x00f8 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzau> r3 = com.google.android.gms.measurement.internal.zzau.CREATOR     // Catch:{ SQLiteException -> 0x00f8 }
            android.os.Parcelable r0 = r0.y(r2, r3)     // Catch:{ SQLiteException -> 0x00f8 }
            r23 = r0
            com.google.android.gms.measurement.internal.zzau r23 = (com.google.android.gms.measurement.internal.zzau) r23     // Catch:{ SQLiteException -> 0x00f8 }
            r0 = 6
            long r19 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f8 }
            g.e.a.b.f.b.k9 r0 = r1.b     // Catch:{ SQLiteException -> 0x00f8 }
            g.e.a.b.f.b.m9 r0 = r0.f3233g     // Catch:{ SQLiteException -> 0x00f8 }
            g.e.a.b.f.b.k9.I(r0)     // Catch:{ SQLiteException -> 0x00f8 }
            r2 = 7
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x00f8 }
            android.os.Parcelable r0 = r0.y(r2, r3)     // Catch:{ SQLiteException -> 0x00f8 }
            r26 = r0
            com.google.android.gms.measurement.internal.zzau r26 = (com.google.android.gms.measurement.internal.zzau) r26     // Catch:{ SQLiteException -> 0x00f8 }
            r0 = 8
            long r4 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f8 }
            r0 = 9
            long r27 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f8 }
            g.e.a.b.f.b.k9 r0 = r1.b     // Catch:{ SQLiteException -> 0x00f8 }
            g.e.a.b.f.b.m9 r0 = r0.f3233g     // Catch:{ SQLiteException -> 0x00f8 }
            g.e.a.b.f.b.k9.I(r0)     // Catch:{ SQLiteException -> 0x00f8 }
            r2 = 10
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x00f8 }
            android.os.Parcelable r0 = r0.y(r2, r3)     // Catch:{ SQLiteException -> 0x00f8 }
            r29 = r0
            com.google.android.gms.measurement.internal.zzau r29 = (com.google.android.gms.measurement.internal.zzau) r29     // Catch:{ SQLiteException -> 0x00f8 }
            com.google.android.gms.measurement.internal.zzks r18 = new com.google.android.gms.measurement.internal.zzks     // Catch:{ SQLiteException -> 0x00f8 }
            r2 = r18
            r3 = r32
            r7 = r17
            r2.<init>(r3, r4, r6, r7)     // Catch:{ SQLiteException -> 0x00f8 }
            com.google.android.gms.measurement.internal.zzab r0 = new com.google.android.gms.measurement.internal.zzab     // Catch:{ SQLiteException -> 0x00f8 }
            r15 = r0
            r16 = r31
            r15.<init>(r16, r17, r18, r19, r21, r22, r23, r24, r26, r27, r29)     // Catch:{ SQLiteException -> 0x00f8 }
            boolean r2 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x00f8 }
            if (r2 == 0) goto L_0x00f4
            g.e.a.b.f.b.n4 r2 = r1.a     // Catch:{ SQLiteException -> 0x00f8 }
            g.e.a.b.f.b.f3 r2 = r2.d()     // Catch:{ SQLiteException -> 0x00f8 }
            g.e.a.b.f.b.d3 r2 = r2.f3136f     // Catch:{ SQLiteException -> 0x00f8 }
            java.lang.String r3 = "Got multiple records for conditional property, expected one"
            java.lang.Object r4 = g.e.a.b.f.b.f3.t(r31)     // Catch:{ SQLiteException -> 0x00f8 }
            g.e.a.b.f.b.n4 r5 = r1.a     // Catch:{ SQLiteException -> 0x00f8 }
            g.e.a.b.f.b.a3 r5 = r5.f3264m     // Catch:{ SQLiteException -> 0x00f8 }
            java.lang.String r5 = r5.f(r8)     // Catch:{ SQLiteException -> 0x00f8 }
            r2.c(r3, r4, r5)     // Catch:{ SQLiteException -> 0x00f8 }
        L_0x00f4:
            r10.close()
            return r0
        L_0x00f8:
            r0 = move-exception
            goto L_0x00fe
        L_0x00fa:
            r0 = move-exception
            goto L_0x011f
        L_0x00fc:
            r0 = move-exception
            r10 = r9
        L_0x00fe:
            g.e.a.b.f.b.n4 r2 = r1.a     // Catch:{ all -> 0x011d }
            g.e.a.b.f.b.f3 r2 = r2.d()     // Catch:{ all -> 0x011d }
            g.e.a.b.f.b.d3 r2 = r2.f3136f     // Catch:{ all -> 0x011d }
            java.lang.String r3 = "Error querying conditional property"
            java.lang.Object r4 = g.e.a.b.f.b.f3.t(r31)     // Catch:{ all -> 0x011d }
            g.e.a.b.f.b.n4 r5 = r1.a     // Catch:{ all -> 0x011d }
            g.e.a.b.f.b.a3 r5 = r5.f3264m     // Catch:{ all -> 0x011d }
            java.lang.String r5 = r5.f(r8)     // Catch:{ all -> 0x011d }
            r2.d(r3, r4, r5, r0)     // Catch:{ all -> 0x011d }
            if (r10 == 0) goto L_0x011c
            r10.close()
        L_0x011c:
            return r9
        L_0x011d:
            r0 = move-exception
            r9 = r10
        L_0x011f:
            if (r9 == 0) goto L_0x0124
            r9.close()
        L_0x0124:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.k.D(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzab");
    }

    public final i E(long j2, String str, boolean z, boolean z2) {
        return F(j2, str, 1, false, false, z, false, z2);
    }

    public final i F(long j2, String str, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        f.k(str);
        h();
        i();
        String[] strArr = {str};
        i iVar = new i();
        Cursor cursor = null;
        try {
            SQLiteDatabase A = A();
            cursor = A.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                this.a.d().f3139i.b("Not updating daily counts, app is not known. appId", f3.t(str));
                cursor.close();
                return iVar;
            }
            if (cursor.getLong(0) == j2) {
                iVar.b = cursor.getLong(1);
                iVar.a = cursor.getLong(2);
                iVar.c = cursor.getLong(3);
                iVar.f3190d = cursor.getLong(4);
                iVar.f3191e = cursor.getLong(5);
            }
            if (z) {
                iVar.b += j3;
            }
            if (z2) {
                iVar.a += j3;
            }
            if (z3) {
                iVar.c += j3;
            }
            if (z4) {
                iVar.f3190d += j3;
            }
            if (z5) {
                iVar.f3191e += j3;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("day", Long.valueOf(j2));
            contentValues.put("daily_public_events_count", Long.valueOf(iVar.a));
            contentValues.put("daily_events_count", Long.valueOf(iVar.b));
            contentValues.put("daily_conversions_count", Long.valueOf(iVar.c));
            contentValues.put("daily_error_events_count", Long.valueOf(iVar.f3190d));
            contentValues.put("daily_realtime_events_count", Long.valueOf(iVar.f3191e));
            A.update("apps", contentValues, "app_id=?", strArr);
            cursor.close();
            return iVar;
        } catch (SQLiteException e2) {
            this.a.d().f3136f.c("Error updating daily counts. appId", f3.t(str), e2);
            if (cursor != null) {
                cursor.close();
            }
            return iVar;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x014a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final g.e.a.b.f.b.p G(java.lang.String r28, java.lang.String r29) {
        /*
            r27 = this;
            r1 = r27
            r15 = r29
            g.c.b.b.f.k(r28)
            g.c.b.b.f.k(r29)
            r27.h()
            r27.i()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r2 = "lifetime_count"
            java.lang.String r3 = "current_bundle_count"
            java.lang.String r4 = "last_fire_timestamp"
            java.lang.String r5 = "last_bundled_timestamp"
            java.lang.String r6 = "last_bundled_day"
            java.lang.String r7 = "last_sampled_complex_event_id"
            java.lang.String r8 = "last_sampling_rate"
            java.lang.String r9 = "last_exempt_from_sampling"
            java.lang.String r10 = "current_session_count"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10}
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.<init>(r2)
            r19 = 0
            android.database.sqlite.SQLiteDatabase r2 = r27.A()     // Catch:{ SQLiteException -> 0x0121, all -> 0x011f }
            r10 = 0
            java.lang.String[] r3 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0121, all -> 0x011f }
            java.lang.Object[] r0 = r0.toArray(r3)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011f }
            r4 = r0
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ SQLiteException -> 0x0121, all -> 0x011f }
            r0 = 2
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0121, all -> 0x011f }
            r6[r10] = r28     // Catch:{ SQLiteException -> 0x0121, all -> 0x011f }
            r11 = 1
            r6[r11] = r15     // Catch:{ SQLiteException -> 0x0121, all -> 0x011f }
            java.lang.String r3 = "events"
            java.lang.String r5 = "app_id=? and name=?"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r13 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011f }
            boolean r2 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            if (r2 != 0) goto L_0x005c
            r13.close()
            return r19
        L_0x005c:
            long r5 = r13.getLong(r10)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            long r7 = r13.getLong(r11)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            long r16 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            r0 = 3
            boolean r2 = r13.isNull(r0)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            r3 = 0
            if (r2 == 0) goto L_0x0074
            r20 = r3
            goto L_0x0078
        L_0x0074:
            long r20 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
        L_0x0078:
            r0 = 4
            boolean r2 = r13.isNull(r0)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            if (r2 == 0) goto L_0x0082
            r0 = r19
            goto L_0x008a
        L_0x0082:
            long r22 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            java.lang.Long r0 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
        L_0x008a:
            r2 = 5
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            if (r9 == 0) goto L_0x0094
            r18 = r19
            goto L_0x009e
        L_0x0094:
            long r22 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            java.lang.Long r2 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            r18 = r2
        L_0x009e:
            r2 = 6
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            if (r9 == 0) goto L_0x00a8
            r22 = r19
            goto L_0x00b2
        L_0x00a8:
            long r22 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            java.lang.Long r2 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            r22 = r2
        L_0x00b2:
            r2 = 7
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            if (r9 != 0) goto L_0x00cb
            long r23 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            r25 = 1
            int r2 = (r23 > r25 ? 1 : (r23 == r25 ? 0 : -1))
            if (r2 != 0) goto L_0x00c4
            r10 = 1
        L_0x00c4:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            r23 = r2
            goto L_0x00cd
        L_0x00cb:
            r23 = r19
        L_0x00cd:
            r2 = 8
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            if (r9 == 0) goto L_0x00d7
            r9 = r3
            goto L_0x00dc
        L_0x00d7:
            long r2 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            r9 = r2
        L_0x00dc:
            g.e.a.b.f.b.p r24 = new g.e.a.b.f.b.p     // Catch:{ SQLiteException -> 0x0119, all -> 0x0113 }
            r2 = r24
            r3 = r28
            r4 = r29
            r11 = r16
            r25 = r13
            r13 = r20
            r15 = r0
            r16 = r18
            r17 = r22
            r18 = r23
            r2.<init>(r3, r4, r5, r7, r9, r11, r13, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x0111, all -> 0x010f }
            boolean r0 = r25.moveToNext()     // Catch:{ SQLiteException -> 0x0111, all -> 0x010f }
            if (r0 == 0) goto L_0x010b
            g.e.a.b.f.b.n4 r0 = r1.a     // Catch:{ SQLiteException -> 0x0111, all -> 0x010f }
            g.e.a.b.f.b.f3 r0 = r0.d()     // Catch:{ SQLiteException -> 0x0111, all -> 0x010f }
            g.e.a.b.f.b.d3 r0 = r0.f3136f     // Catch:{ SQLiteException -> 0x0111, all -> 0x010f }
            java.lang.String r2 = "Got multiple records for event aggregates, expected one. appId"
            java.lang.Object r3 = g.e.a.b.f.b.f3.t(r28)     // Catch:{ SQLiteException -> 0x0111, all -> 0x010f }
            r0.b(r2, r3)     // Catch:{ SQLiteException -> 0x0111, all -> 0x010f }
        L_0x010b:
            r25.close()
            return r24
        L_0x010f:
            r0 = move-exception
            goto L_0x0116
        L_0x0111:
            r0 = move-exception
            goto L_0x011c
        L_0x0113:
            r0 = move-exception
            r25 = r13
        L_0x0116:
            r19 = r25
            goto L_0x0148
        L_0x0119:
            r0 = move-exception
            r25 = r13
        L_0x011c:
            r13 = r25
            goto L_0x0124
        L_0x011f:
            r0 = move-exception
            goto L_0x0148
        L_0x0121:
            r0 = move-exception
            r13 = r19
        L_0x0124:
            g.e.a.b.f.b.n4 r2 = r1.a     // Catch:{ all -> 0x0145 }
            g.e.a.b.f.b.f3 r2 = r2.d()     // Catch:{ all -> 0x0145 }
            g.e.a.b.f.b.d3 r2 = r2.f3136f     // Catch:{ all -> 0x0145 }
            java.lang.String r3 = "Error querying events. appId"
            java.lang.Object r4 = g.e.a.b.f.b.f3.t(r28)     // Catch:{ all -> 0x0145 }
            g.e.a.b.f.b.n4 r5 = r1.a     // Catch:{ all -> 0x0145 }
            g.e.a.b.f.b.a3 r5 = r5.f3264m     // Catch:{ all -> 0x0145 }
            r6 = r29
            java.lang.String r5 = r5.d(r6)     // Catch:{ all -> 0x0145 }
            r2.d(r3, r4, r5, r0)     // Catch:{ all -> 0x0145 }
            if (r13 == 0) goto L_0x0144
            r13.close()
        L_0x0144:
            return r19
        L_0x0145:
            r0 = move-exception
            r19 = r13
        L_0x0148:
            if (r19 == 0) goto L_0x014d
            r19.close()
        L_0x014d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.k.G(java.lang.String, java.lang.String):g.e.a.b.f.b.p");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final g.e.a.b.f.b.o9 H(java.lang.String r20, java.lang.String r21) {
        /*
            r19 = this;
            r1 = r19
            r9 = r21
            g.c.b.b.f.k(r20)
            g.c.b.b.f.k(r21)
            r19.h()
            r19.i()
            r10 = 0
            android.database.sqlite.SQLiteDatabase r11 = r19.A()     // Catch:{ SQLiteException -> 0x007c, all -> 0x007a }
            java.lang.String r0 = "set_timestamp"
            java.lang.String r2 = "value"
            java.lang.String r3 = "origin"
            java.lang.String[] r13 = new java.lang.String[]{r0, r2, r3}     // Catch:{ SQLiteException -> 0x007c, all -> 0x007a }
            r0 = 2
            java.lang.String[] r15 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x007c, all -> 0x007a }
            r2 = 0
            r15[r2] = r20     // Catch:{ SQLiteException -> 0x007c, all -> 0x007a }
            r3 = 1
            r15[r3] = r9     // Catch:{ SQLiteException -> 0x007c, all -> 0x007a }
            java.lang.String r12 = "user_attributes"
            java.lang.String r14 = "app_id=? and name=?"
            r16 = 0
            r17 = 0
            r18 = 0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x007c, all -> 0x007a }
            boolean r4 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0074 }
            if (r4 != 0) goto L_0x0040
            r11.close()
            return r10
        L_0x0040:
            long r6 = r11.getLong(r2)     // Catch:{ SQLiteException -> 0x0074 }
            java.lang.Object r8 = r1.I(r11, r3)     // Catch:{ SQLiteException -> 0x0074 }
            if (r8 != 0) goto L_0x004e
            r11.close()
            return r10
        L_0x004e:
            java.lang.String r4 = r11.getString(r0)     // Catch:{ SQLiteException -> 0x0074 }
            g.e.a.b.f.b.o9 r0 = new g.e.a.b.f.b.o9     // Catch:{ SQLiteException -> 0x0074 }
            r2 = r0
            r3 = r20
            r5 = r21
            r2.<init>(r3, r4, r5, r6, r8)     // Catch:{ SQLiteException -> 0x0074 }
            boolean r2 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x0074 }
            if (r2 == 0) goto L_0x0076
            g.e.a.b.f.b.n4 r2 = r1.a     // Catch:{ SQLiteException -> 0x0074 }
            g.e.a.b.f.b.f3 r2 = r2.d()     // Catch:{ SQLiteException -> 0x0074 }
            g.e.a.b.f.b.d3 r2 = r2.f3136f     // Catch:{ SQLiteException -> 0x0074 }
            java.lang.String r3 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r4 = g.e.a.b.f.b.f3.t(r20)     // Catch:{ SQLiteException -> 0x0074 }
            r2.b(r3, r4)     // Catch:{ SQLiteException -> 0x0074 }
            goto L_0x0076
        L_0x0074:
            r0 = move-exception
            goto L_0x007e
        L_0x0076:
            r11.close()
            return r0
        L_0x007a:
            r0 = move-exception
            goto L_0x009f
        L_0x007c:
            r0 = move-exception
            r11 = r10
        L_0x007e:
            g.e.a.b.f.b.n4 r2 = r1.a     // Catch:{ all -> 0x009d }
            g.e.a.b.f.b.f3 r2 = r2.d()     // Catch:{ all -> 0x009d }
            g.e.a.b.f.b.d3 r2 = r2.f3136f     // Catch:{ all -> 0x009d }
            java.lang.String r3 = "Error querying user property. appId"
            java.lang.Object r4 = g.e.a.b.f.b.f3.t(r20)     // Catch:{ all -> 0x009d }
            g.e.a.b.f.b.n4 r5 = r1.a     // Catch:{ all -> 0x009d }
            g.e.a.b.f.b.a3 r5 = r5.f3264m     // Catch:{ all -> 0x009d }
            java.lang.String r5 = r5.f(r9)     // Catch:{ all -> 0x009d }
            r2.d(r3, r4, r5, r0)     // Catch:{ all -> 0x009d }
            if (r11 == 0) goto L_0x009c
            r11.close()
        L_0x009c:
            return r10
        L_0x009d:
            r0 = move-exception
            r10 = r11
        L_0x009f:
            if (r10 == 0) goto L_0x00a4
            r10.close()
        L_0x00a4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.k.H(java.lang.String, java.lang.String):g.e.a.b.f.b.o9");
    }

    public final Object I(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        if (type == 0) {
            this.a.d().f3136f.a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i2));
            }
            if (type == 3) {
                return cursor.getString(i2);
            }
            if (type != 4) {
                this.a.d().f3136f.b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            this.a.d().f3136f.a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String J() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.A()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0022, all -> 0x0020 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x001e }
            if (r2 == 0) goto L_0x001a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x001e }
            r0.close()
            return r1
        L_0x001a:
            r0.close()
            return r1
        L_0x001e:
            r2 = move-exception
            goto L_0x0025
        L_0x0020:
            r0 = move-exception
            goto L_0x003c
        L_0x0022:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L_0x0025:
            g.e.a.b.f.b.n4 r3 = r6.a     // Catch:{ all -> 0x0038 }
            g.e.a.b.f.b.f3 r3 = r3.d()     // Catch:{ all -> 0x0038 }
            g.e.a.b.f.b.d3 r3 = r3.f3136f     // Catch:{ all -> 0x0038 }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r4, r2)     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0037
            r0.close()
        L_0x0037:
            return r1
        L_0x0038:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x003c:
            if (r1 == 0) goto L_0x0041
            r1.close()
        L_0x0041:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.k.J():java.lang.String");
    }

    public final List K(String str, String str2, String str3) {
        f.k(str);
        h();
        i();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat(Marker.ANY_MARKER));
            sb.append(" and name glob ?");
        }
        return L(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final List L(String str, String[] strArr) {
        h();
        i();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            f fVar = this.a.f3258g;
            Cursor query = A().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, (String) null, (String) null, "rowid", "1001");
            if (query.moveToFirst()) {
                while (true) {
                    int size = arrayList.size();
                    n4 n4Var = this.a;
                    f fVar2 = n4Var.f3258g;
                    if (size < 1000) {
                        String string = query.getString(0);
                        String string2 = query.getString(1);
                        String string3 = query.getString(2);
                        Object I = I(query, 3);
                        boolean z = query.getInt(4) != 0;
                        String string4 = query.getString(5);
                        long j2 = query.getLong(6);
                        m9 m9Var = this.b.f3233g;
                        k9.I(m9Var);
                        byte[] blob = query.getBlob(7);
                        Parcelable.Creator<zzau> creator = zzau.CREATOR;
                        long j3 = query.getLong(8);
                        m9 m9Var2 = this.b.f3233g;
                        k9.I(m9Var2);
                        long j4 = query.getLong(10);
                        long j5 = query.getLong(11);
                        m9 m9Var3 = this.b.f3233g;
                        k9.I(m9Var3);
                        arrayList.add(new zzab(string, string2, new zzks(string3, j4, I, string2), j3, z, string4, (zzau) m9Var.y(blob, creator), j2, (zzau) m9Var2.y(query.getBlob(9), creator), j5, (zzau) m9Var3.y(query.getBlob(12), creator)));
                        if (!query.moveToNext()) {
                            break;
                        }
                    } else {
                        d3 d3Var = n4Var.d().f3136f;
                        f fVar3 = this.a.f3258g;
                        d3Var.b("Read more than the max allowed conditional properties, ignoring extra", 1000);
                        break;
                    }
                }
                query.close();
                return arrayList;
            }
            query.close();
            return arrayList;
        } catch (SQLiteException e2) {
            this.a.d().f3136f.b("Error querying conditional user property value", e2);
            List emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final List M(String str) {
        f.k(str);
        h();
        i();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            f fVar = this.a.f3258g;
            Cursor query = A().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, (String) null, (String) null, "rowid", AppVersion.VERSION_CODE);
            if (query.moveToFirst()) {
                do {
                    String string = query.getString(0);
                    String string2 = query.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j2 = query.getLong(2);
                    Object I = I(query, 3);
                    if (I == null) {
                        this.a.d().f3136f.b("Read invalid user property value, ignoring it. appId", f3.t(str));
                    } else {
                        arrayList.add(new o9(str, str2, string, j2, I));
                    }
                } while (query.moveToNext());
                query.close();
                return arrayList;
            }
            query.close();
            return arrayList;
        } catch (SQLiteException e2) {
            this.a.d().f3136f.c("Error querying user properties. appId", f3.t(str), e2);
            List emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List N(java.lang.String r17, java.lang.String r18, java.lang.String r19) {
        /*
            r16 = this;
            r1 = r16
            g.c.b.b.f.k(r17)
            r16.h()
            r16.i()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r10 = "1001"
            r11 = 0
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00f6 }
            r12 = 3
            r2.<init>(r12)     // Catch:{ SQLiteException -> 0x00f6 }
            r13 = r17
            r2.add(r13)     // Catch:{ SQLiteException -> 0x00f4 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00f4 }
            java.lang.String r4 = "app_id=?"
            r3.<init>(r4)     // Catch:{ SQLiteException -> 0x00f4 }
            boolean r4 = android.text.TextUtils.isEmpty(r18)     // Catch:{ SQLiteException -> 0x00f4 }
            if (r4 != 0) goto L_0x0036
            r14 = r18
            r2.add(r14)     // Catch:{ SQLiteException -> 0x00b0 }
            java.lang.String r4 = " and origin=?"
            r3.append(r4)     // Catch:{ SQLiteException -> 0x00b0 }
            goto L_0x0038
        L_0x0036:
            r14 = r18
        L_0x0038:
            boolean r4 = android.text.TextUtils.isEmpty(r19)     // Catch:{ SQLiteException -> 0x00b0 }
            if (r4 != 0) goto L_0x0050
            java.lang.String r4 = java.lang.String.valueOf(r19)     // Catch:{ SQLiteException -> 0x00b0 }
            java.lang.String r5 = "*"
            java.lang.String r4 = r4.concat(r5)     // Catch:{ SQLiteException -> 0x00b0 }
            r2.add(r4)     // Catch:{ SQLiteException -> 0x00b0 }
            java.lang.String r4 = " and name glob ?"
            r3.append(r4)     // Catch:{ SQLiteException -> 0x00b0 }
        L_0x0050:
            int r4 = r2.size()     // Catch:{ SQLiteException -> 0x00b0 }
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x00b0 }
            java.lang.Object[] r2 = r2.toArray(r4)     // Catch:{ SQLiteException -> 0x00b0 }
            r6 = r2
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch:{ SQLiteException -> 0x00b0 }
            android.database.sqlite.SQLiteDatabase r2 = r16.A()     // Catch:{ SQLiteException -> 0x00b0 }
            java.lang.String r4 = "user_attributes"
            java.lang.String r5 = "name"
            java.lang.String r7 = "set_timestamp"
            java.lang.String r8 = "value"
            java.lang.String r9 = "origin"
            java.lang.String[] r5 = new java.lang.String[]{r5, r7, r8, r9}     // Catch:{ SQLiteException -> 0x00b0 }
            java.lang.String r7 = r3.toString()     // Catch:{ SQLiteException -> 0x00b0 }
            java.lang.String r9 = "rowid"
            g.e.a.b.f.b.n4 r3 = r1.a     // Catch:{ SQLiteException -> 0x00b0 }
            g.e.a.b.f.b.f r3 = r3.f3258g     // Catch:{ SQLiteException -> 0x00b0 }
            r8 = 0
            r15 = 0
            r3 = r4
            r4 = r5
            r5 = r7
            r7 = r8
            r8 = r15
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x00b0 }
            boolean r2 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x00b0 }
            if (r2 != 0) goto L_0x008e
            r11.close()
            return r0
        L_0x008e:
            int r2 = r0.size()     // Catch:{ SQLiteException -> 0x00b0 }
            g.e.a.b.f.b.n4 r3 = r1.a     // Catch:{ SQLiteException -> 0x00b0 }
            g.e.a.b.f.b.f r4 = r3.f3258g     // Catch:{ SQLiteException -> 0x00b0 }
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r2 < r4) goto L_0x00b2
            g.e.a.b.f.b.f3 r2 = r3.d()     // Catch:{ SQLiteException -> 0x00b0 }
            g.e.a.b.f.b.d3 r2 = r2.f3136f     // Catch:{ SQLiteException -> 0x00b0 }
            java.lang.String r3 = "Read more than the max allowed user properties, ignoring excess"
            g.e.a.b.f.b.n4 r5 = r1.a     // Catch:{ SQLiteException -> 0x00b0 }
            g.e.a.b.f.b.f r5 = r5.f3258g     // Catch:{ SQLiteException -> 0x00b0 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ SQLiteException -> 0x00b0 }
            r2.b(r3, r4)     // Catch:{ SQLiteException -> 0x00b0 }
            goto L_0x00f0
        L_0x00ae:
            r0 = move-exception
            goto L_0x0116
        L_0x00b0:
            r0 = move-exception
            goto L_0x00fb
        L_0x00b2:
            r2 = 0
            java.lang.String r6 = r11.getString(r2)     // Catch:{ SQLiteException -> 0x00b0 }
            r2 = 1
            long r7 = r11.getLong(r2)     // Catch:{ SQLiteException -> 0x00b0 }
            r2 = 2
            java.lang.Object r9 = r1.I(r11, r2)     // Catch:{ SQLiteException -> 0x00b0 }
            java.lang.String r14 = r11.getString(r12)     // Catch:{ SQLiteException -> 0x00b0 }
            if (r9 != 0) goto L_0x00db
            g.e.a.b.f.b.n4 r2 = r1.a     // Catch:{ SQLiteException -> 0x00b0 }
            g.e.a.b.f.b.f3 r2 = r2.d()     // Catch:{ SQLiteException -> 0x00b0 }
            g.e.a.b.f.b.d3 r2 = r2.f3136f     // Catch:{ SQLiteException -> 0x00b0 }
            java.lang.String r3 = "(2)Read invalid user property value, ignoring it"
            java.lang.Object r4 = g.e.a.b.f.b.f3.t(r17)     // Catch:{ SQLiteException -> 0x00b0 }
            r10 = r19
            r2.d(r3, r4, r14, r10)     // Catch:{ SQLiteException -> 0x00b0 }
            goto L_0x00e9
        L_0x00db:
            r10 = r19
            g.e.a.b.f.b.o9 r2 = new g.e.a.b.f.b.o9     // Catch:{ SQLiteException -> 0x00b0 }
            r3 = r2
            r4 = r17
            r5 = r14
            r3.<init>(r4, r5, r6, r7, r9)     // Catch:{ SQLiteException -> 0x00b0 }
            r0.add(r2)     // Catch:{ SQLiteException -> 0x00b0 }
        L_0x00e9:
            boolean r2 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x00b0 }
            if (r2 == 0) goto L_0x00f0
            goto L_0x008e
        L_0x00f0:
            r11.close()
            return r0
        L_0x00f4:
            r0 = move-exception
            goto L_0x00f9
        L_0x00f6:
            r0 = move-exception
            r13 = r17
        L_0x00f9:
            r14 = r18
        L_0x00fb:
            g.e.a.b.f.b.n4 r2 = r1.a     // Catch:{ all -> 0x00ae }
            g.e.a.b.f.b.f3 r2 = r2.d()     // Catch:{ all -> 0x00ae }
            g.e.a.b.f.b.d3 r2 = r2.f3136f     // Catch:{ all -> 0x00ae }
            java.lang.String r3 = "(2)Error querying user properties"
            java.lang.Object r4 = g.e.a.b.f.b.f3.t(r17)     // Catch:{ all -> 0x00ae }
            r2.d(r3, r4, r14, r0)     // Catch:{ all -> 0x00ae }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00ae }
            if (r11 == 0) goto L_0x0115
            r11.close()
        L_0x0115:
            return r0
        L_0x0116:
            if (r11 == 0) goto L_0x011b
            r11.close()
        L_0x011b:
            goto L_0x011d
        L_0x011c:
            throw r0
        L_0x011d:
            goto L_0x011c
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.k.N(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final void O() {
        i();
        A().beginTransaction();
    }

    public final void P() {
        i();
        A().endTransaction();
    }

    public final void Q(List list) {
        h();
        i();
        if (list.size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        } else if (p()) {
            String join = TextUtils.join(",", list);
            String g2 = a.g(new StringBuilder(String.valueOf(join).length() + 2), "(", join, ")");
            if (v(a.g(new StringBuilder(g2.length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", g2, " AND retry_count =  2147483647 LIMIT 1"), (String[]) null) > 0) {
                this.a.d().f3139i.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase A = A();
                StringBuilder sb = new StringBuilder(g2.length() + 127);
                sb.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb.append(g2);
                sb.append(" AND (retry_count IS NULL OR retry_count < ");
                sb.append(Integer.MAX_VALUE);
                sb.append(")");
                A.execSQL(sb.toString());
            } catch (SQLiteException e2) {
                this.a.d().f3136f.b("Error incrementing retry count. error", e2);
            }
        }
    }

    public final void R() {
        h();
        i();
        if (p()) {
            long a = this.b.f3235i.f3184h.a();
            Objects.requireNonNull((c) this.a.n);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(elapsedRealtime - a);
            f fVar = this.a.f3258g;
            if (abs > ((Long) s2.y.a((Object) null)).longValue()) {
                this.b.f3235i.f3184h.b(elapsedRealtime);
                h();
                i();
                if (p()) {
                    SQLiteDatabase A = A();
                    Objects.requireNonNull((c) this.a.n);
                    f fVar2 = this.a.f3258g;
                    int delete = A.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(f.i())});
                    if (delete > 0) {
                        this.a.d().n.b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    public final boolean k() {
        return false;
    }

    public final void l(String str, String str2) {
        f.k(str);
        f.k(str2);
        h();
        i();
        try {
            A().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            this.a.d().f3136f.d("Error deleting user property. appId", f3.t(str), this.a.f3264m.f(str2), e2);
        }
    }

    public final void m() {
        i();
        A().setTransactionSuccessful();
    }

    public final void n(w4 w4Var) {
        h();
        i();
        String L = w4Var.L();
        Objects.requireNonNull(L, "null reference");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", L);
        contentValues.put("app_instance_id", w4Var.M());
        contentValues.put("gmp_app_id", w4Var.Q());
        w4Var.a.b().h();
        contentValues.put("resettable_device_id_hash", w4Var.f3378e);
        contentValues.put("last_bundle_index", Long.valueOf(w4Var.H()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(w4Var.I()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(w4Var.G()));
        contentValues.put("app_version", w4Var.O());
        contentValues.put("app_store", w4Var.N());
        contentValues.put("gmp_version", Long.valueOf(w4Var.F()));
        contentValues.put("dev_cert_hash", Long.valueOf(w4Var.C()));
        contentValues.put("measurement_enabled", Boolean.valueOf(w4Var.z()));
        w4Var.a.b().h();
        contentValues.put("day", Long.valueOf(w4Var.v));
        w4Var.a.b().h();
        contentValues.put("daily_public_events_count", Long.valueOf(w4Var.w));
        w4Var.a.b().h();
        contentValues.put("daily_events_count", Long.valueOf(w4Var.x));
        w4Var.a.b().h();
        contentValues.put("daily_conversions_count", Long.valueOf(w4Var.y));
        w4Var.a.b().h();
        contentValues.put("config_fetched_time", Long.valueOf(w4Var.D));
        w4Var.a.b().h();
        contentValues.put("failed_config_fetch_time", Long.valueOf(w4Var.E));
        contentValues.put("app_version_int", Long.valueOf(w4Var.A()));
        contentValues.put("firebase_instance_id", w4Var.P());
        w4Var.a.b().h();
        contentValues.put("daily_error_events_count", Long.valueOf(w4Var.z));
        w4Var.a.b().h();
        contentValues.put("daily_realtime_events_count", Long.valueOf(w4Var.A));
        w4Var.a.b().h();
        contentValues.put("health_monitor_sample", w4Var.B);
        contentValues.put("android_id", Long.valueOf(w4Var.s()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(w4Var.y()));
        contentValues.put("admob_app_id", w4Var.J());
        contentValues.put("dynamite_version", Long.valueOf(w4Var.D()));
        List a = w4Var.a();
        if (a != null) {
            if (a.isEmpty()) {
                this.a.d().f3139i.b("Safelisted events should not be an empty list. appId", L);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", a));
            }
        }
        xa.b();
        if (this.a.f3258g.u((String) null, s2.u0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase A = A();
            if (((long) A.update("apps", contentValues, "app_id = ?", new String[]{L})) == 0 && A.insertWithOnConflict("apps", (String) null, contentValues, 5) == -1) {
                this.a.d().f3136f.b("Failed to insert/update app (got -1). appId", f3.t(L));
            }
        } catch (SQLiteException e2) {
            this.a.d().f3136f.c("Error storing app. appId", f3.t(L), e2);
        }
    }

    public final void o(p pVar) {
        Objects.requireNonNull(pVar, "null reference");
        h();
        i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", pVar.a);
        contentValues.put("name", pVar.b);
        contentValues.put("lifetime_count", Long.valueOf(pVar.c));
        contentValues.put("current_bundle_count", Long.valueOf(pVar.f3280d));
        contentValues.put("last_fire_timestamp", Long.valueOf(pVar.f3282f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(pVar.f3283g));
        contentValues.put("last_bundled_day", pVar.f3284h);
        contentValues.put("last_sampled_complex_event_id", pVar.f3285i);
        contentValues.put("last_sampling_rate", pVar.f3286j);
        contentValues.put("current_session_count", Long.valueOf(pVar.f3281e));
        Boolean bool = pVar.f3287k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (A().insertWithOnConflict("events", (String) null, contentValues, 5) == -1) {
                this.a.d().f3136f.b("Failed to insert/update event aggregates (got -1). appId", f3.t(pVar.a));
            }
        } catch (SQLiteException e2) {
            this.a.d().f3136f.c("Error storing event aggregates. appId", f3.t(pVar.a), e2);
        }
    }

    public final boolean p() {
        n4 n4Var = this.a;
        Context context = n4Var.a;
        f fVar = n4Var.f3258g;
        return context.getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean q(String str, Long l2, long j2, v3 v3Var) {
        h();
        i();
        Objects.requireNonNull(v3Var, "null reference");
        f.k(str);
        byte[] i2 = v3Var.i();
        this.a.d().n.c("Saving complex main event, appId, data size", this.a.f3264m.d(str), Integer.valueOf(i2.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l2);
        contentValues.put("children_to_process", Long.valueOf(j2));
        contentValues.put("main_event", i2);
        try {
            if (A().insertWithOnConflict("main_event_params", (String) null, contentValues, 5) != -1) {
                return true;
            }
            this.a.d().f3136f.b("Failed to insert complex main event (got -1). appId", f3.t(str));
            return false;
        } catch (SQLiteException e2) {
            this.a.d().f3136f.c("Error storing complex main event. appId", f3.t(str), e2);
            return false;
        }
    }

    public final boolean r(zzab zzab) {
        h();
        i();
        String str = zzab.zza;
        Objects.requireNonNull(str, "null reference");
        if (H(str, zzab.zzc.zzb) == null) {
            long v = v("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            f fVar = this.a.f3258g;
            if (v >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzab.zzb);
        contentValues.put("name", zzab.zzc.zzb);
        Object c = zzab.zzc.c();
        Objects.requireNonNull(c, "null reference");
        u(contentValues, "value", c);
        contentValues.put("active", Boolean.valueOf(zzab.zze));
        contentValues.put("trigger_event_name", zzab.zzf);
        contentValues.put("trigger_timeout", Long.valueOf(zzab.zzh));
        contentValues.put("timed_out_event", this.a.A().a0(zzab.zzg));
        contentValues.put("creation_timestamp", Long.valueOf(zzab.zzd));
        contentValues.put("triggered_event", this.a.A().a0(zzab.zzi));
        contentValues.put("triggered_timestamp", Long.valueOf(zzab.zzc.zzc));
        contentValues.put("time_to_live", Long.valueOf(zzab.zzj));
        contentValues.put("expired_event", this.a.A().a0(zzab.zzk));
        try {
            if (A().insertWithOnConflict("conditional_properties", (String) null, contentValues, 5) == -1) {
                this.a.d().f3136f.b("Failed to insert/update conditional user property (got -1)", f3.t(str));
            }
        } catch (SQLiteException e2) {
            this.a.d().f3136f.c("Error storing conditional user property", f3.t(str), e2);
        }
        return true;
    }

    public final boolean s(o9 o9Var) {
        h();
        i();
        if (H(o9Var.a, o9Var.c) == null) {
            if (q9.V(o9Var.c)) {
                if (v("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{o9Var.a}) >= ((long) this.a.f3258g.o(o9Var.a, s2.G, 25, 100))) {
                    return false;
                }
            } else if (!"_npa".equals(o9Var.c)) {
                long v = v("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{o9Var.a, o9Var.b});
                f fVar = this.a.f3258g;
                if (v >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", o9Var.a);
        contentValues.put("origin", o9Var.b);
        contentValues.put("name", o9Var.c);
        contentValues.put("set_timestamp", Long.valueOf(o9Var.f3278d));
        u(contentValues, "value", o9Var.f3279e);
        try {
            if (A().insertWithOnConflict("user_attributes", (String) null, contentValues, 5) == -1) {
                this.a.d().f3136f.b("Failed to insert/update user property (got -1). appId", f3.t(o9Var.a));
            }
        } catch (SQLiteException e2) {
            this.a.d().f3136f.c("Error storing user property. appId", f3.t(o9Var.a), e2);
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v34, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v29, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v30, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v32, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r4v0, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v4, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01f5, code lost:
        r0 = th;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01fd, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01fe, code lost:
        r4 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01f5 A[ExcHandler: all (th java.lang.Throwable), PHI: r3 
      PHI: (r3v5 java.lang.String) = (r3v0 java.lang.String), (r3v0 java.lang.String), (r3v0 java.lang.String), (r3v0 java.lang.String), (r3v0 java.lang.String), (r3v15 java.lang.String), (r3v17 java.lang.String), (r3v19 java.lang.String), (r3v21 java.lang.String), (r3v23 java.lang.String), (r3v25 java.lang.String), (r3v27 java.lang.String), (r3v29 java.lang.String), (r3v31 java.lang.String) binds: [B:1:0x000b, B:30:0x0089, B:24:0x0074, B:13:0x003d, B:7:0x0020, B:41:0x00c1, B:47:0x00f9, B:86:0x01e0, B:87:?, B:51:0x010d, B:80:0x01c8, B:81:?, B:74:0x01ad, B:64:0x017f] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x000b] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0212  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:30:0x0089=Splitter:B:30:0x0089, B:13:0x003d=Splitter:B:13:0x003d} */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t(java.lang.String r21, long r22, long r24, g.e.a.b.f.b.j9 r26) {
        /*
            r20 = this;
            r1 = r20
            r2 = r26
            r20.h()
            r20.i()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r0 = r20.A()     // Catch:{ SQLiteException -> 0x01fd, all -> 0x01f5 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ SQLiteException -> 0x01fd, all -> 0x01f5 }
            java.lang.String r5 = ""
            r13 = -1
            r15 = 0
            r12 = 1
            r11 = 2
            if (r4 == 0) goto L_0x0070
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x002f
            java.lang.String[] r4 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x01fd, all -> 0x01f5 }
            java.lang.String r6 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x01fd, all -> 0x01f5 }
            r4[r15] = r6     // Catch:{ SQLiteException -> 0x01fd, all -> 0x01f5 }
            java.lang.String r6 = java.lang.String.valueOf(r22)     // Catch:{ SQLiteException -> 0x01fd, all -> 0x01f5 }
            r4[r12] = r6     // Catch:{ SQLiteException -> 0x01fd, all -> 0x01f5 }
            goto L_0x0037
        L_0x002f:
            java.lang.String[] r4 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x01fd, all -> 0x01f5 }
            java.lang.String r6 = java.lang.String.valueOf(r22)     // Catch:{ SQLiteException -> 0x01fd, all -> 0x01f5 }
            r4[r15] = r6     // Catch:{ SQLiteException -> 0x01fd, all -> 0x01f5 }
        L_0x0037:
            int r6 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r6 == 0) goto L_0x003d
            java.lang.String r5 = "rowid <= ? and "
        L_0x003d:
            int r6 = r5.length()     // Catch:{ SQLiteException -> 0x01fd, all -> 0x01f5 }
            int r6 = r6 + 148
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x01fd, all -> 0x01f5 }
            r7.<init>(r6)     // Catch:{ SQLiteException -> 0x01fd, all -> 0x01f5 }
            java.lang.String r6 = "select app_id, metadata_fingerprint from raw_events where "
            r7.append(r6)     // Catch:{ SQLiteException -> 0x01fd, all -> 0x01f5 }
            r7.append(r5)     // Catch:{ SQLiteException -> 0x01fd, all -> 0x01f5 }
            java.lang.String r5 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r7.append(r5)     // Catch:{ SQLiteException -> 0x01fd, all -> 0x01f5 }
            java.lang.String r5 = r7.toString()     // Catch:{ SQLiteException -> 0x01fd, all -> 0x01f5 }
            android.database.Cursor r4 = r0.rawQuery(r5, r4)     // Catch:{ SQLiteException -> 0x01fd, all -> 0x01f5 }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x01fb }
            if (r5 != 0) goto L_0x0067
            r4.close()
            return
        L_0x0067:
            java.lang.String r3 = r4.getString(r15)     // Catch:{ SQLiteException -> 0x01fb }
            java.lang.String r5 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x01fb }
            goto L_0x00b7
        L_0x0070:
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x007f
            java.lang.String[] r4 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x01fd, all -> 0x01f5 }
            r4[r15] = r3     // Catch:{ SQLiteException -> 0x01fd, all -> 0x01f5 }
            java.lang.String r6 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x01fd, all -> 0x01f5 }
            r4[r12] = r6     // Catch:{ SQLiteException -> 0x01fd, all -> 0x01f5 }
            goto L_0x0083
        L_0x007f:
            java.lang.String[] r4 = new java.lang.String[]{r3}     // Catch:{ SQLiteException -> 0x01fd, all -> 0x01f5 }
        L_0x0083:
            int r6 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r6 == 0) goto L_0x0089
            java.lang.String r5 = " and rowid <= ?"
        L_0x0089:
            int r6 = r5.length()     // Catch:{ SQLiteException -> 0x01fd, all -> 0x01f5 }
            int r6 = r6 + 84
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x01fd, all -> 0x01f5 }
            r7.<init>(r6)     // Catch:{ SQLiteException -> 0x01fd, all -> 0x01f5 }
            java.lang.String r6 = "select metadata_fingerprint from raw_events where app_id = ?"
            r7.append(r6)     // Catch:{ SQLiteException -> 0x01fd, all -> 0x01f5 }
            r7.append(r5)     // Catch:{ SQLiteException -> 0x01fd, all -> 0x01f5 }
            java.lang.String r5 = " order by rowid limit 1;"
            r7.append(r5)     // Catch:{ SQLiteException -> 0x01fd, all -> 0x01f5 }
            java.lang.String r5 = r7.toString()     // Catch:{ SQLiteException -> 0x01fd, all -> 0x01f5 }
            android.database.Cursor r4 = r0.rawQuery(r5, r4)     // Catch:{ SQLiteException -> 0x01fd, all -> 0x01f5 }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x01fb }
            if (r5 != 0) goto L_0x00b3
            r4.close()
            return
        L_0x00b3:
            java.lang.String r5 = r4.getString(r15)     // Catch:{ SQLiteException -> 0x01fb }
        L_0x00b7:
            r4.close()     // Catch:{ SQLiteException -> 0x01fb }
            r16 = r3
            r3 = r4
            r17 = r5
            java.lang.String r4 = "metadata"
            java.lang.String[] r6 = new java.lang.String[]{r4}     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            java.lang.String[] r8 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            r8[r15] = r16     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            r8[r12] = r17     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            java.lang.String r5 = "raw_events_metadata"
            java.lang.String r7 = "app_id = ? and metadata_fingerprint = ?"
            r9 = 0
            r10 = 0
            java.lang.String r18 = "rowid"
            java.lang.String r19 = "2"
            r4 = r0
            r11 = r18
            r12 = r19
            android.database.Cursor r3 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            boolean r4 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            if (r4 != 0) goto L_0x00f9
            g.e.a.b.f.b.n4 r0 = r1.a     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            g.e.a.b.f.b.f3 r0 = r0.d()     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            g.e.a.b.f.b.d3 r0 = r0.f3136f     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            java.lang.String r2 = "Raw event metadata record is missing. appId"
            java.lang.Object r4 = g.e.a.b.f.b.f3.t(r16)     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            r0.b(r2, r4)     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            r3.close()
            return
        L_0x00f9:
            byte[] r4 = r3.getBlob(r15)     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            g.e.a.b.e.c.e4 r5 = g.e.a.b.e.c.f4.x1()     // Catch:{ IOException -> 0x01df }
            g.e.a.b.e.c.g6 r4 = g.e.a.b.f.b.m9.B(r5, r4)     // Catch:{ IOException -> 0x01df }
            g.e.a.b.e.c.e4 r4 = (g.e.a.b.e.c.e4) r4     // Catch:{ IOException -> 0x01df }
            g.e.a.b.e.c.o7 r4 = r4.j()     // Catch:{ IOException -> 0x01df }
            g.e.a.b.e.c.f4 r4 = (g.e.a.b.e.c.f4) r4     // Catch:{ IOException -> 0x01df }
            boolean r5 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            if (r5 == 0) goto L_0x0124
            g.e.a.b.f.b.n4 r5 = r1.a     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            g.e.a.b.f.b.f3 r5 = r5.d()     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            g.e.a.b.f.b.d3 r5 = r5.f3139i     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            java.lang.String r6 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r7 = g.e.a.b.f.b.f3.t(r16)     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            r5.b(r6, r7)     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
        L_0x0124:
            r3.close()     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            r2.a = r4     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            r12 = 3
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x013f
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            java.lang.String[] r5 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            r5[r15] = r16     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            r13 = 1
            r5[r13] = r17     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            java.lang.String r6 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            r14 = 2
            r5[r14] = r6     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            goto L_0x0149
        L_0x013f:
            r13 = 1
            r14 = 2
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String[] r5 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            r5[r15] = r16     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            r5[r13] = r17     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
        L_0x0149:
            r7 = r4
            r8 = r5
            java.lang.String r4 = "rowid"
            java.lang.String r5 = "name"
            java.lang.String r6 = "timestamp"
            java.lang.String r9 = "data"
            java.lang.String[] r6 = new java.lang.String[]{r4, r5, r6, r9}     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            java.lang.String r5 = "raw_events"
            r9 = 0
            r10 = 0
            java.lang.String r11 = "rowid"
            r17 = 0
            r4 = r0
            r14 = 3
            r12 = r17
            android.database.Cursor r3 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            boolean r0 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            if (r0 == 0) goto L_0x01c8
        L_0x016d:
            long r4 = r3.getLong(r15)     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            byte[] r0 = r3.getBlob(r14)     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            g.e.a.b.e.c.u3 r6 = g.e.a.b.e.c.v3.w()     // Catch:{ IOException -> 0x01ab }
            g.e.a.b.e.c.g6 r0 = g.e.a.b.f.b.m9.B(r6, r0)     // Catch:{ IOException -> 0x01ab }
            g.e.a.b.e.c.u3 r0 = (g.e.a.b.e.c.u3) r0     // Catch:{ IOException -> 0x01ab }
            java.lang.String r6 = r3.getString(r13)     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            r0.q(r6)     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            r6 = 2
            long r7 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            boolean r9 = r0.f2990d     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            if (r9 == 0) goto L_0x0194
            r0.f()     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            r0.f2990d = r15     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
        L_0x0194:
            g.e.a.b.e.c.o7 r9 = r0.c     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            g.e.a.b.e.c.v3 r9 = (g.e.a.b.e.c.v3) r9     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            g.e.a.b.e.c.v3.H(r9, r7)     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            g.e.a.b.e.c.o7 r0 = r0.j()     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            g.e.a.b.e.c.v3 r0 = (g.e.a.b.e.c.v3) r0     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            boolean r0 = r2.a(r4, r0)     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            if (r0 != 0) goto L_0x01be
            r3.close()
            return
        L_0x01ab:
            r0 = move-exception
            r6 = 2
            g.e.a.b.f.b.n4 r4 = r1.a     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            g.e.a.b.f.b.f3 r4 = r4.d()     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            g.e.a.b.f.b.d3 r4 = r4.f3136f     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            java.lang.String r5 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r7 = g.e.a.b.f.b.f3.t(r16)     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            r4.c(r5, r7, r0)     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
        L_0x01be:
            boolean r0 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            if (r0 != 0) goto L_0x016d
            r3.close()
            return
        L_0x01c8:
            g.e.a.b.f.b.n4 r0 = r1.a     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            g.e.a.b.f.b.f3 r0 = r0.d()     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            g.e.a.b.f.b.d3 r0 = r0.f3139i     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            java.lang.String r2 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r4 = g.e.a.b.f.b.f3.t(r16)     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            r0.b(r2, r4)     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            r3.close()
            return
        L_0x01dd:
            r0 = move-exception
            goto L_0x01f7
        L_0x01df:
            r0 = move-exception
            g.e.a.b.f.b.n4 r2 = r1.a     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            g.e.a.b.f.b.f3 r2 = r2.d()     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            g.e.a.b.f.b.d3 r2 = r2.f3136f     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            java.lang.String r4 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r5 = g.e.a.b.f.b.f3.t(r16)     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            r2.c(r4, r5, r0)     // Catch:{ SQLiteException -> 0x01dd, all -> 0x01f5 }
            r3.close()
            return
        L_0x01f5:
            r0 = move-exception
            goto L_0x0218
        L_0x01f7:
            r4 = r3
            r3 = r16
            goto L_0x01ff
        L_0x01fb:
            r0 = move-exception
            goto L_0x01ff
        L_0x01fd:
            r0 = move-exception
            r4 = r3
        L_0x01ff:
            g.e.a.b.f.b.n4 r2 = r1.a     // Catch:{ all -> 0x0216 }
            g.e.a.b.f.b.f3 r2 = r2.d()     // Catch:{ all -> 0x0216 }
            g.e.a.b.f.b.d3 r2 = r2.f3136f     // Catch:{ all -> 0x0216 }
            java.lang.String r5 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r3 = g.e.a.b.f.b.f3.t(r3)     // Catch:{ all -> 0x0216 }
            r2.c(r5, r3, r0)     // Catch:{ all -> 0x0216 }
            if (r4 == 0) goto L_0x0215
            r4.close()
        L_0x0215:
            return
        L_0x0216:
            r0 = move-exception
            r3 = r4
        L_0x0218:
            if (r3 == 0) goto L_0x021d
            r3.close()
        L_0x021d:
            goto L_0x021f
        L_0x021e:
            throw r0
        L_0x021f:
            goto L_0x021e
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.k.t(java.lang.String, long, long, g.e.a.b.f.b.j9):void");
    }

    public final long v(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = A().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j2 = cursor.getLong(0);
                cursor.close();
                return j2;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e2) {
            this.a.d().f3136f.c("Database error", str, e2);
            throw e2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final int w(String str, String str2) {
        f.k(str);
        f.k(str2);
        h();
        i();
        try {
            return A().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            this.a.d().f3136f.d("Error deleting conditional property", f3.t(str), this.a.f3264m.f(str2), e2);
            return 0;
        }
    }

    public final long x(String str, String[] strArr, long j2) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = A().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j3 = rawQuery.getLong(0);
                rawQuery.close();
                return j3;
            }
            rawQuery.close();
            return j2;
        } catch (SQLiteException e2) {
            this.a.d().f3136f.c("Database error", str, e2);
            throw e2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final long y(String str, String str2) {
        String str3 = str;
        f.k(str);
        f.k("first_open_count");
        h();
        i();
        SQLiteDatabase A = A();
        A.beginTransaction();
        long j2 = 0;
        try {
            long x = x("select first_open_count from app2 where app_id=?", new String[]{str3}, -1);
            if (x == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str3);
                contentValues.put("first_open_count", 0);
                contentValues.put("previous_install_count", 0);
                if (A.insertWithOnConflict("app2", (String) null, contentValues, 5) == -1) {
                    this.a.d().f3136f.c("Failed to insert column (got -1). appId", f3.t(str), "first_open_count");
                    A.endTransaction();
                    return -1;
                }
                x = 0;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str3);
                contentValues2.put("first_open_count", Long.valueOf(1 + x));
                if (((long) A.update("app2", contentValues2, "app_id = ?", new String[]{str3})) == 0) {
                    this.a.d().f3136f.c("Failed to update column (got 0). appId", f3.t(str), "first_open_count");
                    A.endTransaction();
                    return -1;
                }
                A.setTransactionSuccessful();
                A.endTransaction();
                return x;
            } catch (SQLiteException e2) {
                e = e2;
                j2 = x;
                try {
                    this.a.d().f3136f.d("Error inserting column. appId", f3.t(str), "first_open_count", e);
                    A.endTransaction();
                    return j2;
                } catch (Throwable th) {
                    A.endTransaction();
                    throw th;
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            this.a.d().f3136f.d("Error inserting column. appId", f3.t(str), "first_open_count", e);
            A.endTransaction();
            return j2;
        }
    }

    public final long z(String str) {
        f.k(str);
        return x("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }
}
