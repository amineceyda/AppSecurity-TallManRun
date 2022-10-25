package g.e.a.b.f.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.measurement.internal.zzab;
import g.e.a.b.b.f.r;
import g.e.a.b.b.g.a;
import g.e.a.b.b.h.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public final class f8 extends w3 {
    public final e8 c;

    /* renamed from: d  reason: collision with root package name */
    public v2 f3157d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Boolean f3158e;

    /* renamed from: f  reason: collision with root package name */
    public final m f3159f;

    /* renamed from: g  reason: collision with root package name */
    public final x8 f3160g;

    /* renamed from: h  reason: collision with root package name */
    public final List f3161h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public final m f3162i;

    public f8(n4 n4Var) {
        super(n4Var);
        this.f3160g = new x8(n4Var.n);
        this.c = new e8(this);
        this.f3159f = new o7(this, n4Var);
        this.f3162i = new q7(this, n4Var);
    }

    public static void v(f8 f8Var, ComponentName componentName) {
        f8Var.h();
        if (f8Var.f3157d != null) {
            f8Var.f3157d = null;
            f8Var.a.d().n.b("Disconnected from device MeasurementService", componentName);
            f8Var.h();
            f8Var.w();
        }
    }

    public final boolean k() {
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v48, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v56, resolved type: int} */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:69|70|71|72) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:84|85|86|87) */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0220, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0222, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0224, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x01a6, code lost:
        r17 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ff, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r9.a.d().f3136f.a("Failed to load event from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0114, code lost:
        r17 = r17;
        r17 = r17;
        r17 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r14.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        r9.a.d().f3136f.a("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r7.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        r9.a.d().f3136f.a("Failed to load conditional user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        r7.recycle();
        r0 = null;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0107 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x013c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x0170 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x021c A[SYNTHETIC, Splitter:B:131:0x021c] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0224 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:14:0x0059] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x024d A[SYNTHETIC, Splitter:B:156:0x024d] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x02d3  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x021f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x02a3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x02a3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x02a3 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(g.e.a.b.f.b.v2 r28, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable r29, com.google.android.gms.measurement.internal.zzp r30) {
        /*
            r27 = this;
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            r27.h()
            r27.i()
            r27.u()
            g.e.a.b.f.b.n4 r0 = r1.a
            g.e.a.b.f.b.f r0 = r0.f3258g
            r5 = 100
            r6 = 0
            r0 = 100
            r7 = 0
        L_0x001b:
            r8 = 1001(0x3e9, float:1.403E-42)
            if (r7 >= r8) goto L_0x0350
            if (r0 != r5) goto L_0x0350
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            g.e.a.b.f.b.n4 r0 = r1.a
            g.e.a.b.f.b.z2 r9 = r0.r()
            java.lang.String r10 = "rowid"
            java.lang.String r11 = "Error reading entries from local database"
            r9.h()
            boolean r0 = r9.f3422d
            if (r0 == 0) goto L_0x0038
            goto L_0x005b
        L_0x0038:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            g.e.a.b.f.b.n4 r0 = r9.a
            android.content.Context r0 = r0.a
            java.lang.String r14 = "google_app_measurement_local.db"
            java.io.File r0 = r0.getDatabasePath(r14)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x02ce
            r14 = 5
            r12 = 5
            r15 = 0
        L_0x0050:
            if (r15 >= r14) goto L_0x02bd
            r14 = 1
            android.database.sqlite.SQLiteDatabase r5 = r9.l()     // Catch:{ SQLiteFullException -> 0x0283, SQLiteDatabaseLockedException -> 0x026d, SQLiteException -> 0x0243, all -> 0x023e }
            if (r5 != 0) goto L_0x005f
            r9.f3422d = r14     // Catch:{ SQLiteFullException -> 0x0235, SQLiteDatabaseLockedException -> 0x022d, SQLiteException -> 0x0226, all -> 0x0224 }
        L_0x005b:
            r17 = r7
            goto L_0x02cc
        L_0x005f:
            r5.beginTransaction()     // Catch:{ SQLiteFullException -> 0x0235, SQLiteDatabaseLockedException -> 0x022d, SQLiteException -> 0x0226, all -> 0x0224 }
            java.lang.String r0 = "3"
            java.lang.String r17 = "messages"
            java.lang.String[] r18 = new java.lang.String[]{r10}     // Catch:{ all -> 0x0213 }
            java.lang.String r19 = "type=?"
            java.lang.String[] r20 = new java.lang.String[]{r0}     // Catch:{ all -> 0x0213 }
            r21 = 0
            r22 = 0
            java.lang.String r23 = "rowid desc"
            java.lang.String r24 = "1"
            r16 = r5
            android.database.Cursor r14 = r16.query(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0213 }
            boolean r0 = r14.moveToFirst()     // Catch:{ all -> 0x020c }
            r25 = -1
            if (r0 == 0) goto L_0x008e
            long r16 = r14.getLong(r6)     // Catch:{ all -> 0x020c }
            r14.close()     // Catch:{ SQLiteFullException -> 0x0235, SQLiteDatabaseLockedException -> 0x022d, SQLiteException -> 0x0226, all -> 0x0224 }
            goto L_0x0093
        L_0x008e:
            r14.close()     // Catch:{ SQLiteFullException -> 0x0235, SQLiteDatabaseLockedException -> 0x022d, SQLiteException -> 0x0226, all -> 0x0224 }
            r16 = r25
        L_0x0093:
            int r0 = (r16 > r25 ? 1 : (r16 == r25 ? 0 : -1))
            if (r0 == 0) goto L_0x00a9
            java.lang.String r0 = "rowid<?"
            r14 = 1
            java.lang.String[] r6 = new java.lang.String[r14]     // Catch:{ SQLiteFullException -> 0x0235, SQLiteDatabaseLockedException -> 0x022d, SQLiteException -> 0x0226, all -> 0x0224 }
            java.lang.String r14 = java.lang.String.valueOf(r16)     // Catch:{ SQLiteFullException -> 0x0235, SQLiteDatabaseLockedException -> 0x022d, SQLiteException -> 0x0226, all -> 0x0224 }
            r16 = 0
            r6[r16] = r14     // Catch:{ SQLiteFullException -> 0x0235, SQLiteDatabaseLockedException -> 0x022d, SQLiteException -> 0x0226, all -> 0x0224 }
            r19 = r0
            r20 = r6
            goto L_0x00ad
        L_0x00a9:
            r19 = 0
            r20 = 0
        L_0x00ad:
            java.lang.String r0 = "type"
            java.lang.String r6 = "entry"
            java.lang.String[] r18 = new java.lang.String[]{r10, r0, r6}     // Catch:{ SQLiteFullException -> 0x0235, SQLiteDatabaseLockedException -> 0x022d, SQLiteException -> 0x0226, all -> 0x0224 }
            java.lang.String r17 = "messages"
            r21 = 0
            r22 = 0
            java.lang.String r23 = "rowid asc"
            r6 = 100
            java.lang.String r24 = java.lang.Integer.toString(r6)     // Catch:{ SQLiteFullException -> 0x0235, SQLiteDatabaseLockedException -> 0x022d, SQLiteException -> 0x0226, all -> 0x0224 }
            r16 = r5
            android.database.Cursor r6 = r16.query(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ SQLiteFullException -> 0x0235, SQLiteDatabaseLockedException -> 0x022d, SQLiteException -> 0x0226, all -> 0x0224 }
        L_0x00c9:
            boolean r0 = r6.moveToNext()     // Catch:{ SQLiteFullException -> 0x0206, SQLiteDatabaseLockedException -> 0x0200, SQLiteException -> 0x01fa }
            if (r0 == 0) goto L_0x01b7
            r14 = 0
            long r25 = r6.getLong(r14)     // Catch:{ SQLiteFullException -> 0x0206, SQLiteDatabaseLockedException -> 0x0200, SQLiteException -> 0x01fa }
            r14 = 1
            int r0 = r6.getInt(r14)     // Catch:{ SQLiteFullException -> 0x0206, SQLiteDatabaseLockedException -> 0x0200, SQLiteException -> 0x01fa }
            r14 = 2
            r16 = r10
            byte[] r10 = r6.getBlob(r14)     // Catch:{ SQLiteFullException -> 0x01b3, SQLiteDatabaseLockedException -> 0x01b0, SQLiteException -> 0x01ac }
            if (r0 != 0) goto L_0x011d
            android.os.Parcel r14 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01b3, SQLiteDatabaseLockedException -> 0x01b0, SQLiteException -> 0x01ac }
            int r0 = r10.length     // Catch:{ SafeParcelReader$ParseException -> 0x0105, all -> 0x0101 }
            r17 = r7
            r7 = 0
            r14.unmarshall(r10, r7, r0)     // Catch:{ SafeParcelReader$ParseException -> 0x0107 }
            r14.setDataPosition(r7)     // Catch:{ SafeParcelReader$ParseException -> 0x0107 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzau> r0 = com.google.android.gms.measurement.internal.zzau.CREATOR     // Catch:{ SafeParcelReader$ParseException -> 0x0107 }
            java.lang.Object r0 = r0.createFromParcel(r14)     // Catch:{ SafeParcelReader$ParseException -> 0x0107 }
            com.google.android.gms.measurement.internal.zzau r0 = (com.google.android.gms.measurement.internal.zzau) r0     // Catch:{ SafeParcelReader$ParseException -> 0x0107 }
            r14.recycle()     // Catch:{ SQLiteFullException -> 0x01f7, SQLiteDatabaseLockedException -> 0x0204, SQLiteException -> 0x01f3 }
            if (r0 == 0) goto L_0x01a6
            goto L_0x0183
        L_0x00ff:
            r0 = move-exception
            goto L_0x0119
        L_0x0101:
            r0 = move-exception
            r17 = r7
            goto L_0x0119
        L_0x0105:
            r17 = r7
        L_0x0107:
            g.e.a.b.f.b.n4 r0 = r9.a     // Catch:{ all -> 0x00ff }
            g.e.a.b.f.b.f3 r0 = r0.d()     // Catch:{ all -> 0x00ff }
            g.e.a.b.f.b.d3 r0 = r0.f3136f     // Catch:{ all -> 0x00ff }
            java.lang.String r7 = "Failed to load event from local database"
            r0.a(r7)     // Catch:{ all -> 0x00ff }
            r14.recycle()     // Catch:{ SQLiteFullException -> 0x01f7, SQLiteDatabaseLockedException -> 0x0204, SQLiteException -> 0x01f3 }
            goto L_0x01a6
        L_0x0119:
            r14.recycle()     // Catch:{ SQLiteFullException -> 0x01f7, SQLiteDatabaseLockedException -> 0x0204, SQLiteException -> 0x01f3 }
            throw r0     // Catch:{ SQLiteFullException -> 0x01f7, SQLiteDatabaseLockedException -> 0x0204, SQLiteException -> 0x01f3 }
        L_0x011d:
            r17 = r7
            r7 = 1
            if (r0 != r7) goto L_0x0154
            android.os.Parcel r7 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01f7, SQLiteDatabaseLockedException -> 0x0204, SQLiteException -> 0x01f3 }
            int r0 = r10.length     // Catch:{ SafeParcelReader$ParseException -> 0x013c }
            r14 = 0
            r7.unmarshall(r10, r14, r0)     // Catch:{ SafeParcelReader$ParseException -> 0x013c }
            r7.setDataPosition(r14)     // Catch:{ SafeParcelReader$ParseException -> 0x013c }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzks> r0 = com.google.android.gms.measurement.internal.zzks.CREATOR     // Catch:{ SafeParcelReader$ParseException -> 0x013c }
            java.lang.Object r0 = r0.createFromParcel(r7)     // Catch:{ SafeParcelReader$ParseException -> 0x013c }
            com.google.android.gms.measurement.internal.zzks r0 = (com.google.android.gms.measurement.internal.zzks) r0     // Catch:{ SafeParcelReader$ParseException -> 0x013c }
            r7.recycle()     // Catch:{ SQLiteFullException -> 0x01f7, SQLiteDatabaseLockedException -> 0x0204, SQLiteException -> 0x01f3 }
            goto L_0x014d
        L_0x013a:
            r0 = move-exception
            goto L_0x0150
        L_0x013c:
            g.e.a.b.f.b.n4 r0 = r9.a     // Catch:{ all -> 0x013a }
            g.e.a.b.f.b.f3 r0 = r0.d()     // Catch:{ all -> 0x013a }
            g.e.a.b.f.b.d3 r0 = r0.f3136f     // Catch:{ all -> 0x013a }
            java.lang.String r10 = "Failed to load user property from local database"
            r0.a(r10)     // Catch:{ all -> 0x013a }
            r7.recycle()     // Catch:{ SQLiteFullException -> 0x01f7, SQLiteDatabaseLockedException -> 0x0204, SQLiteException -> 0x01f3 }
            r0 = 0
        L_0x014d:
            if (r0 == 0) goto L_0x01a6
            goto L_0x0183
        L_0x0150:
            r7.recycle()     // Catch:{ SQLiteFullException -> 0x01f7, SQLiteDatabaseLockedException -> 0x0204, SQLiteException -> 0x01f3 }
            throw r0     // Catch:{ SQLiteFullException -> 0x01f7, SQLiteDatabaseLockedException -> 0x0204, SQLiteException -> 0x01f3 }
        L_0x0154:
            if (r0 != r14) goto L_0x018b
            android.os.Parcel r7 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01f7, SQLiteDatabaseLockedException -> 0x0204, SQLiteException -> 0x01f3 }
            int r0 = r10.length     // Catch:{ SafeParcelReader$ParseException -> 0x0170 }
            r14 = 0
            r7.unmarshall(r10, r14, r0)     // Catch:{ SafeParcelReader$ParseException -> 0x0170 }
            r7.setDataPosition(r14)     // Catch:{ SafeParcelReader$ParseException -> 0x0170 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzab> r0 = com.google.android.gms.measurement.internal.zzab.CREATOR     // Catch:{ SafeParcelReader$ParseException -> 0x0170 }
            java.lang.Object r0 = r0.createFromParcel(r7)     // Catch:{ SafeParcelReader$ParseException -> 0x0170 }
            com.google.android.gms.measurement.internal.zzab r0 = (com.google.android.gms.measurement.internal.zzab) r0     // Catch:{ SafeParcelReader$ParseException -> 0x0170 }
            r7.recycle()     // Catch:{ SQLiteFullException -> 0x01f7, SQLiteDatabaseLockedException -> 0x0204, SQLiteException -> 0x01f3 }
            goto L_0x0181
        L_0x016e:
            r0 = move-exception
            goto L_0x0187
        L_0x0170:
            g.e.a.b.f.b.n4 r0 = r9.a     // Catch:{ all -> 0x016e }
            g.e.a.b.f.b.f3 r0 = r0.d()     // Catch:{ all -> 0x016e }
            g.e.a.b.f.b.d3 r0 = r0.f3136f     // Catch:{ all -> 0x016e }
            java.lang.String r10 = "Failed to load conditional user property from local database"
            r0.a(r10)     // Catch:{ all -> 0x016e }
            r7.recycle()     // Catch:{ SQLiteFullException -> 0x01f7, SQLiteDatabaseLockedException -> 0x0204, SQLiteException -> 0x01f3 }
            r0 = 0
        L_0x0181:
            if (r0 == 0) goto L_0x01a6
        L_0x0183:
            r13.add(r0)     // Catch:{ SQLiteFullException -> 0x01f7, SQLiteDatabaseLockedException -> 0x0204, SQLiteException -> 0x01f3 }
            goto L_0x01a6
        L_0x0187:
            r7.recycle()     // Catch:{ SQLiteFullException -> 0x01f7, SQLiteDatabaseLockedException -> 0x0204, SQLiteException -> 0x01f3 }
            throw r0     // Catch:{ SQLiteFullException -> 0x01f7, SQLiteDatabaseLockedException -> 0x0204, SQLiteException -> 0x01f3 }
        L_0x018b:
            r7 = 3
            if (r0 != r7) goto L_0x0199
            g.e.a.b.f.b.n4 r0 = r9.a     // Catch:{ SQLiteFullException -> 0x01f7, SQLiteDatabaseLockedException -> 0x0204, SQLiteException -> 0x01f3 }
            g.e.a.b.f.b.f3 r0 = r0.d()     // Catch:{ SQLiteFullException -> 0x01f7, SQLiteDatabaseLockedException -> 0x0204, SQLiteException -> 0x01f3 }
            g.e.a.b.f.b.d3 r0 = r0.f3139i     // Catch:{ SQLiteFullException -> 0x01f7, SQLiteDatabaseLockedException -> 0x0204, SQLiteException -> 0x01f3 }
            java.lang.String r7 = "Skipping app launch break"
            goto L_0x01a3
        L_0x0199:
            g.e.a.b.f.b.n4 r0 = r9.a     // Catch:{ SQLiteFullException -> 0x01f7, SQLiteDatabaseLockedException -> 0x0204, SQLiteException -> 0x01f3 }
            g.e.a.b.f.b.f3 r0 = r0.d()     // Catch:{ SQLiteFullException -> 0x01f7, SQLiteDatabaseLockedException -> 0x0204, SQLiteException -> 0x01f3 }
            g.e.a.b.f.b.d3 r0 = r0.f3136f     // Catch:{ SQLiteFullException -> 0x01f7, SQLiteDatabaseLockedException -> 0x0204, SQLiteException -> 0x01f3 }
            java.lang.String r7 = "Unknown record type in local database"
        L_0x01a3:
            r0.a(r7)     // Catch:{ SQLiteFullException -> 0x01f7, SQLiteDatabaseLockedException -> 0x0204, SQLiteException -> 0x01f3 }
        L_0x01a6:
            r10 = r16
            r7 = r17
            goto L_0x00c9
        L_0x01ac:
            r0 = move-exception
            r17 = r7
            goto L_0x01f4
        L_0x01b0:
            r17 = r7
            goto L_0x0204
        L_0x01b3:
            r0 = move-exception
            r17 = r7
            goto L_0x01f8
        L_0x01b7:
            r17 = r7
            r16 = r10
            r7 = 1
            java.lang.String[] r0 = new java.lang.String[r7]     // Catch:{ SQLiteFullException -> 0x01f7, SQLiteDatabaseLockedException -> 0x0204, SQLiteException -> 0x01f3 }
            java.lang.String r7 = java.lang.Long.toString(r25)     // Catch:{ SQLiteFullException -> 0x01f7, SQLiteDatabaseLockedException -> 0x0204, SQLiteException -> 0x01f3 }
            r10 = 0
            r0[r10] = r7     // Catch:{ SQLiteFullException -> 0x01f1, SQLiteDatabaseLockedException -> 0x0233, SQLiteException -> 0x01ee }
            java.lang.String r7 = "messages"
            java.lang.String r14 = "rowid <= ?"
            int r0 = r5.delete(r7, r14, r0)     // Catch:{ SQLiteFullException -> 0x01f1, SQLiteDatabaseLockedException -> 0x0233, SQLiteException -> 0x01ee }
            int r7 = r13.size()     // Catch:{ SQLiteFullException -> 0x01f1, SQLiteDatabaseLockedException -> 0x0233, SQLiteException -> 0x01ee }
            if (r0 >= r7) goto L_0x01e0
            g.e.a.b.f.b.n4 r0 = r9.a     // Catch:{ SQLiteFullException -> 0x01f1, SQLiteDatabaseLockedException -> 0x0233, SQLiteException -> 0x01ee }
            g.e.a.b.f.b.f3 r0 = r0.d()     // Catch:{ SQLiteFullException -> 0x01f1, SQLiteDatabaseLockedException -> 0x0233, SQLiteException -> 0x01ee }
            g.e.a.b.f.b.d3 r0 = r0.f3136f     // Catch:{ SQLiteFullException -> 0x01f1, SQLiteDatabaseLockedException -> 0x0233, SQLiteException -> 0x01ee }
            java.lang.String r7 = "Fewer entries removed from local database than expected"
            r0.a(r7)     // Catch:{ SQLiteFullException -> 0x01f1, SQLiteDatabaseLockedException -> 0x0233, SQLiteException -> 0x01ee }
        L_0x01e0:
            r5.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x01f1, SQLiteDatabaseLockedException -> 0x0233, SQLiteException -> 0x01ee }
            r5.endTransaction()     // Catch:{ SQLiteFullException -> 0x01f1, SQLiteDatabaseLockedException -> 0x0233, SQLiteException -> 0x01ee }
            r6.close()
            r5.close()
            goto L_0x02d0
        L_0x01ee:
            r0 = move-exception
            goto L_0x024b
        L_0x01f1:
            r0 = move-exception
            goto L_0x023c
        L_0x01f3:
            r0 = move-exception
        L_0x01f4:
            r10 = 0
            goto L_0x024b
        L_0x01f7:
            r0 = move-exception
        L_0x01f8:
            r10 = 0
            goto L_0x023c
        L_0x01fa:
            r0 = move-exception
            r17 = r7
            r16 = r10
            goto L_0x01f4
        L_0x0200:
            r17 = r7
            r16 = r10
        L_0x0204:
            r10 = 0
            goto L_0x0233
        L_0x0206:
            r0 = move-exception
            r17 = r7
            r16 = r10
            goto L_0x01f8
        L_0x020c:
            r0 = move-exception
            r17 = r7
            r16 = r10
            r10 = 0
            goto L_0x021a
        L_0x0213:
            r0 = move-exception
            r17 = r7
            r16 = r10
            r10 = 0
            r14 = 0
        L_0x021a:
            if (r14 == 0) goto L_0x021f
            r14.close()     // Catch:{ SQLiteFullException -> 0x0222, SQLiteDatabaseLockedException -> 0x0232, SQLiteException -> 0x0220, all -> 0x0224 }
        L_0x021f:
            throw r0     // Catch:{ SQLiteFullException -> 0x0222, SQLiteDatabaseLockedException -> 0x0232, SQLiteException -> 0x0220, all -> 0x0224 }
        L_0x0220:
            r0 = move-exception
            goto L_0x024a
        L_0x0222:
            r0 = move-exception
            goto L_0x023b
        L_0x0224:
            r0 = move-exception
            goto L_0x0240
        L_0x0226:
            r0 = move-exception
            r17 = r7
            r16 = r10
            r10 = 0
            goto L_0x024a
        L_0x022d:
            r17 = r7
            r16 = r10
            r10 = 0
        L_0x0232:
            r6 = 0
        L_0x0233:
            r7 = r11
            goto L_0x0275
        L_0x0235:
            r0 = move-exception
            r17 = r7
            r16 = r10
            r10 = 0
        L_0x023b:
            r6 = 0
        L_0x023c:
            r7 = r11
            goto L_0x028b
        L_0x023e:
            r0 = move-exception
            r5 = 0
        L_0x0240:
            r12 = 0
            goto L_0x02b2
        L_0x0243:
            r0 = move-exception
            r17 = r7
            r16 = r10
            r10 = 0
            r5 = 0
        L_0x024a:
            r6 = 0
        L_0x024b:
            if (r5 == 0) goto L_0x0256
            boolean r7 = r5.inTransaction()     // Catch:{ all -> 0x02b0 }
            if (r7 == 0) goto L_0x0256
            r5.endTransaction()     // Catch:{ all -> 0x02b0 }
        L_0x0256:
            g.e.a.b.f.b.n4 r7 = r9.a     // Catch:{ all -> 0x02b0 }
            g.e.a.b.f.b.f3 r7 = r7.d()     // Catch:{ all -> 0x02b0 }
            g.e.a.b.f.b.d3 r7 = r7.f3136f     // Catch:{ all -> 0x02b0 }
            r7.b(r11, r0)     // Catch:{ all -> 0x02b0 }
            r7 = 1
            r9.f3422d = r7     // Catch:{ all -> 0x02b0 }
            if (r6 == 0) goto L_0x0269
            r6.close()
        L_0x0269:
            r7 = r11
            if (r5 == 0) goto L_0x02a3
            goto L_0x02a0
        L_0x026d:
            r17 = r7
            r16 = r10
            r10 = 0
            r7 = r11
            r5 = 0
            r6 = 0
        L_0x0275:
            long r10 = (long) r12
            android.os.SystemClock.sleep(r10)     // Catch:{ all -> 0x02b0 }
            int r12 = r12 + 20
            if (r6 == 0) goto L_0x0280
            r6.close()
        L_0x0280:
            if (r5 == 0) goto L_0x02a3
            goto L_0x02a0
        L_0x0283:
            r0 = move-exception
            r17 = r7
            r16 = r10
            r7 = r11
            r5 = 0
            r6 = 0
        L_0x028b:
            g.e.a.b.f.b.n4 r10 = r9.a     // Catch:{ all -> 0x02b0 }
            g.e.a.b.f.b.f3 r10 = r10.d()     // Catch:{ all -> 0x02b0 }
            g.e.a.b.f.b.d3 r10 = r10.f3136f     // Catch:{ all -> 0x02b0 }
            r10.b(r7, r0)     // Catch:{ all -> 0x02b0 }
            r10 = 1
            r9.f3422d = r10     // Catch:{ all -> 0x02b0 }
            if (r6 == 0) goto L_0x029e
            r6.close()
        L_0x029e:
            if (r5 == 0) goto L_0x02a3
        L_0x02a0:
            r5.close()
        L_0x02a3:
            int r15 = r15 + 1
            r11 = r7
            r10 = r16
            r7 = r17
            r5 = 100
            r6 = 0
            r14 = 5
            goto L_0x0050
        L_0x02b0:
            r0 = move-exception
            r12 = r6
        L_0x02b2:
            if (r12 == 0) goto L_0x02b7
            r12.close()
        L_0x02b7:
            if (r5 == 0) goto L_0x02bc
            r5.close()
        L_0x02bc:
            throw r0
        L_0x02bd:
            r17 = r7
            g.e.a.b.f.b.n4 r0 = r9.a
            g.e.a.b.f.b.f3 r0 = r0.d()
            g.e.a.b.f.b.d3 r0 = r0.f3139i
            java.lang.String r5 = "Failed to read events from database in reasonable time"
            r0.a(r5)
        L_0x02cc:
            r12 = 0
            goto L_0x02d1
        L_0x02ce:
            r17 = r7
        L_0x02d0:
            r12 = r13
        L_0x02d1:
            if (r12 == 0) goto L_0x02dc
            r8.addAll(r12)
            int r0 = r12.size()
            r5 = r0
            goto L_0x02dd
        L_0x02dc:
            r5 = 0
        L_0x02dd:
            r6 = 100
            if (r3 == 0) goto L_0x02e6
            if (r5 >= r6) goto L_0x02e6
            r8.add(r3)
        L_0x02e6:
            int r7 = r8.size()
            r9 = 0
        L_0x02eb:
            if (r9 >= r7) goto L_0x0348
            java.lang.Object r0 = r8.get(r9)
            com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable r0 = (com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable) r0
            boolean r10 = r0 instanceof com.google.android.gms.measurement.internal.zzau
            if (r10 == 0) goto L_0x0309
            com.google.android.gms.measurement.internal.zzau r0 = (com.google.android.gms.measurement.internal.zzau) r0     // Catch:{ RemoteException -> 0x02fd }
            r2.t(r0, r4)     // Catch:{ RemoteException -> 0x02fd }
            goto L_0x0345
        L_0x02fd:
            r0 = move-exception
            g.e.a.b.f.b.n4 r10 = r1.a
            g.e.a.b.f.b.f3 r10 = r10.d()
            g.e.a.b.f.b.d3 r10 = r10.f3136f
            java.lang.String r11 = "Failed to send event to the service"
            goto L_0x0334
        L_0x0309:
            boolean r10 = r0 instanceof com.google.android.gms.measurement.internal.zzks
            if (r10 == 0) goto L_0x031f
            com.google.android.gms.measurement.internal.zzks r0 = (com.google.android.gms.measurement.internal.zzks) r0     // Catch:{ RemoteException -> 0x0313 }
            r2.q(r0, r4)     // Catch:{ RemoteException -> 0x0313 }
            goto L_0x0345
        L_0x0313:
            r0 = move-exception
            g.e.a.b.f.b.n4 r10 = r1.a
            g.e.a.b.f.b.f3 r10 = r10.d()
            g.e.a.b.f.b.d3 r10 = r10.f3136f
            java.lang.String r11 = "Failed to send user property to the service"
            goto L_0x0334
        L_0x031f:
            boolean r10 = r0 instanceof com.google.android.gms.measurement.internal.zzab
            if (r10 == 0) goto L_0x0338
            com.google.android.gms.measurement.internal.zzab r0 = (com.google.android.gms.measurement.internal.zzab) r0     // Catch:{ RemoteException -> 0x0329 }
            r2.g(r0, r4)     // Catch:{ RemoteException -> 0x0329 }
            goto L_0x0345
        L_0x0329:
            r0 = move-exception
            g.e.a.b.f.b.n4 r10 = r1.a
            g.e.a.b.f.b.f3 r10 = r10.d()
            g.e.a.b.f.b.d3 r10 = r10.f3136f
            java.lang.String r11 = "Failed to send conditional user property to the service"
        L_0x0334:
            r10.b(r11, r0)
            goto L_0x0345
        L_0x0338:
            g.e.a.b.f.b.n4 r0 = r1.a
            g.e.a.b.f.b.f3 r0 = r0.d()
            g.e.a.b.f.b.d3 r0 = r0.f3136f
            java.lang.String r10 = "Discarding data. Unrecognized parcel type."
            r0.a(r10)
        L_0x0345:
            int r9 = r9 + 1
            goto L_0x02eb
        L_0x0348:
            int r7 = r17 + 1
            r0 = r5
            r5 = 100
            r6 = 0
            goto L_0x001b
        L_0x0350:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.f8.l(g.e.a.b.f.b.v2, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable, com.google.android.gms.measurement.internal.zzp):void");
    }

    public final void m(zzab zzab) {
        boolean z;
        h();
        i();
        n4 n4Var = this.a;
        b bVar = n4Var.f3257f;
        z2 r = n4Var.r();
        byte[] a0 = r.a.A().a0(zzab);
        if (a0.length > 131072) {
            r.a.d().f3137g.a("Conditional user property too long for local database. Sending directly to service");
            z = false;
        } else {
            z = r.o(2, a0);
        }
        t(new v7(this, q(true), z, new zzab(zzab), zzab));
    }

    public final boolean n() {
        h();
        i();
        return this.f3157d != null;
    }

    public final boolean o() {
        h();
        i();
        return !p() || this.a.A().l0() >= ((Integer) s2.i0.a((Object) null)).intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d8, code lost:
        if (r0 == null) goto L_0x00da;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0113  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean p() {
        /*
            r7 = this;
            r7.h()
            r7.i()
            java.lang.Boolean r0 = r7.f3158e
            if (r0 != 0) goto L_0x0133
            r7.h()
            r7.i()
            g.e.a.b.f.b.n4 r0 = r7.a
            g.e.a.b.f.b.s3 r0 = r0.t()
            r0.h()
            android.content.SharedPreferences r1 = r0.o()
            java.lang.String r2 = "use_service"
            boolean r1 = r1.contains(r2)
            r3 = 0
            if (r1 != 0) goto L_0x0028
            r0 = 0
            goto L_0x0034
        L_0x0028:
            android.content.SharedPreferences r0 = r0.o()
            boolean r0 = r0.getBoolean(r2, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0034:
            r1 = 1
            if (r0 == 0) goto L_0x003f
            boolean r4 = r0.booleanValue()
            if (r4 == 0) goto L_0x003f
            goto L_0x012d
        L_0x003f:
            g.e.a.b.f.b.n4 r4 = r7.a
            g.e.a.b.f.b.b r5 = r4.f3257f
            g.e.a.b.f.b.w2 r4 = r4.q()
            r4.i()
            int r4 = r4.f3374j
            if (r4 != r1) goto L_0x0050
            goto L_0x00f8
        L_0x0050:
            g.e.a.b.f.b.n4 r4 = r7.a
            g.e.a.b.f.b.f3 r4 = r4.d()
            g.e.a.b.f.b.d3 r4 = r4.n
            java.lang.String r5 = "Checking service availability"
            r4.a(r5)
            g.e.a.b.f.b.n4 r4 = r7.a
            g.e.a.b.f.b.q9 r4 = r4.A()
            java.util.Objects.requireNonNull(r4)
            g.e.a.b.b.b r5 = g.e.a.b.b.b.b
            g.e.a.b.f.b.n4 r4 = r4.a
            android.content.Context r4 = r4.a
            r6 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r4 = r5.a(r4, r6)
            if (r4 == 0) goto L_0x00eb
            if (r4 == r1) goto L_0x00dd
            r5 = 2
            if (r4 == r5) goto L_0x00bc
            r0 = 3
            if (r4 == r0) goto L_0x00ad
            r0 = 9
            if (r4 == r0) goto L_0x00a2
            r0 = 18
            if (r4 == r0) goto L_0x0097
            g.e.a.b.f.b.n4 r0 = r7.a
            g.e.a.b.f.b.f3 r0 = r0.d()
            g.e.a.b.f.b.d3 r0 = r0.f3139i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.String r4 = "Unexpected service status"
            r0.b(r4, r1)
            goto L_0x00ba
        L_0x0097:
            g.e.a.b.f.b.n4 r0 = r7.a
            g.e.a.b.f.b.f3 r0 = r0.d()
            g.e.a.b.f.b.d3 r0 = r0.f3139i
            java.lang.String r3 = "Service updating"
            goto L_0x00f5
        L_0x00a2:
            g.e.a.b.f.b.n4 r0 = r7.a
            g.e.a.b.f.b.f3 r0 = r0.d()
            g.e.a.b.f.b.d3 r0 = r0.f3139i
            java.lang.String r1 = "Service invalid"
            goto L_0x00b7
        L_0x00ad:
            g.e.a.b.f.b.n4 r0 = r7.a
            g.e.a.b.f.b.f3 r0 = r0.d()
            g.e.a.b.f.b.d3 r0 = r0.f3139i
            java.lang.String r1 = "Service disabled"
        L_0x00b7:
            r0.a(r1)
        L_0x00ba:
            r1 = 0
            goto L_0x00da
        L_0x00bc:
            g.e.a.b.f.b.n4 r4 = r7.a
            g.e.a.b.f.b.f3 r4 = r4.d()
            g.e.a.b.f.b.d3 r4 = r4.f3143m
            java.lang.String r5 = "Service container out of date"
            r4.a(r5)
            g.e.a.b.f.b.n4 r4 = r7.a
            g.e.a.b.f.b.q9 r4 = r4.A()
            int r4 = r4.l0()
            r5 = 17443(0x4423, float:2.4443E-41)
            if (r4 >= r5) goto L_0x00d8
            goto L_0x00f9
        L_0x00d8:
            if (r0 != 0) goto L_0x00ba
        L_0x00da:
            r3 = r1
            r1 = 0
            goto L_0x00f9
        L_0x00dd:
            g.e.a.b.f.b.n4 r0 = r7.a
            g.e.a.b.f.b.f3 r0 = r0.d()
            g.e.a.b.f.b.d3 r0 = r0.n
            java.lang.String r4 = "Service missing"
            r0.a(r4)
            goto L_0x00f9
        L_0x00eb:
            g.e.a.b.f.b.n4 r0 = r7.a
            g.e.a.b.f.b.f3 r0 = r0.d()
            g.e.a.b.f.b.d3 r0 = r0.n
            java.lang.String r3 = "Service available"
        L_0x00f5:
            r0.a(r3)
        L_0x00f8:
            r3 = 1
        L_0x00f9:
            if (r3 != 0) goto L_0x0113
            g.e.a.b.f.b.n4 r0 = r7.a
            g.e.a.b.f.b.f r0 = r0.f3258g
            boolean r0 = r0.y()
            if (r0 == 0) goto L_0x0113
            g.e.a.b.f.b.n4 r0 = r7.a
            g.e.a.b.f.b.f3 r0 = r0.d()
            g.e.a.b.f.b.d3 r0 = r0.f3136f
            java.lang.String r1 = "No way to upload. Consider using the full version of Analytics"
            r0.a(r1)
            goto L_0x012c
        L_0x0113:
            if (r1 == 0) goto L_0x012c
            g.e.a.b.f.b.n4 r0 = r7.a
            g.e.a.b.f.b.s3 r0 = r0.t()
            r0.h()
            android.content.SharedPreferences r0 = r0.o()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putBoolean(r2, r3)
            r0.apply()
        L_0x012c:
            r1 = r3
        L_0x012d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r7.f3158e = r0
        L_0x0133:
            java.lang.Boolean r0 = r7.f3158e
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.f8.p():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0270  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzp q(boolean r37) {
        /*
            r36 = this;
            r1 = r36
            g.e.a.b.f.b.n4 r0 = r1.a
            g.e.a.b.f.b.b r2 = r0.f3257f
            g.e.a.b.f.b.w2 r2 = r0.q()
            r3 = 0
            r5 = 1
            r6 = 0
            if (r37 == 0) goto L_0x00c9
            g.e.a.b.f.b.n4 r0 = r1.a
            g.e.a.b.f.b.f3 r0 = r0.d()
            g.e.a.b.f.b.n4 r7 = r0.a
            g.e.a.b.f.b.s3 r7 = r7.t()
            g.e.a.b.f.b.q3 r7 = r7.f3337d
            if (r7 != 0) goto L_0x0022
            goto L_0x00c9
        L_0x0022:
            g.e.a.b.f.b.n4 r0 = r0.a
            g.e.a.b.f.b.s3 r0 = r0.t()
            g.e.a.b.f.b.q3 r0 = r0.f3337d
            g.e.a.b.f.b.s3 r7 = r0.f3301e
            r7.h()
            g.e.a.b.f.b.s3 r7 = r0.f3301e
            r7.h()
            g.e.a.b.f.b.s3 r7 = r0.f3301e
            android.content.SharedPreferences r7 = r7.o()
            java.lang.String r8 = r0.a
            long r7 = r7.getLong(r8, r3)
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 != 0) goto L_0x0049
            r0.a()
            r7 = r3
            goto L_0x005d
        L_0x0049:
            g.e.a.b.f.b.s3 r9 = r0.f3301e
            g.e.a.b.f.b.n4 r9 = r9.a
            g.e.a.b.b.h.b r9 = r9.n
            g.e.a.b.b.h.c r9 = (g.e.a.b.b.h.c) r9
            java.util.Objects.requireNonNull(r9)
            long r9 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r9
            long r7 = java.lang.Math.abs(r7)
        L_0x005d:
            long r9 = r0.f3300d
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x0064
            goto L_0x006c
        L_0x0064:
            long r9 = r9 + r9
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x006e
            r0.a()
        L_0x006c:
            r0 = r6
            goto L_0x009c
        L_0x006e:
            g.e.a.b.f.b.s3 r7 = r0.f3301e
            android.content.SharedPreferences r7 = r7.o()
            java.lang.String r8 = r0.c
            java.lang.String r7 = r7.getString(r8, r6)
            g.e.a.b.f.b.s3 r8 = r0.f3301e
            android.content.SharedPreferences r8 = r8.o()
            java.lang.String r9 = r0.b
            long r8 = r8.getLong(r9, r3)
            r0.a()
            if (r7 == 0) goto L_0x009a
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0090
            goto L_0x009a
        L_0x0090:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r0.<init>(r7, r8)
            goto L_0x009c
        L_0x009a:
            android.util.Pair r0 = g.e.a.b.f.b.s3.x
        L_0x009c:
            if (r0 == 0) goto L_0x00c9
            android.util.Pair r7 = g.e.a.b.f.b.s3.x
            if (r0 != r7) goto L_0x00a3
            goto L_0x00c9
        L_0x00a3:
            java.lang.Object r7 = r0.second
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.Object r0 = r0.first
            java.lang.String r0 = (java.lang.String) r0
            int r8 = r7.length()
            java.lang.String r9 = java.lang.String.valueOf(r0)
            int r9 = r9.length()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            int r8 = r8 + r5
            int r8 = r8 + r9
            r10.<init>(r8)
            java.lang.String r8 = ":"
            java.lang.String r0 = g.a.a.a.a.g(r10, r7, r8, r0)
            r18 = r0
            goto L_0x00cb
        L_0x00c9:
            r18 = r6
        L_0x00cb:
            r2.h()
            com.google.android.gms.measurement.internal.zzp r35 = new com.google.android.gms.measurement.internal.zzp
            java.lang.String r8 = r2.m()
            java.lang.String r9 = r2.n()
            r2.i()
            java.lang.String r10 = r2.f3368d
            r2.i()
            int r0 = r2.f3369e
            long r11 = (long) r0
            r2.i()
            java.lang.String r0 = r2.f3370f
            java.lang.String r7 = "null reference"
            java.util.Objects.requireNonNull(r0, r7)
            java.lang.String r13 = r2.f3370f
            g.e.a.b.f.b.n4 r0 = r2.a
            g.e.a.b.f.b.f r0 = r0.f3258g
            r0.p()
            r2.i()
            r2.h()
            long r14 = r2.f3371g
            r7 = 0
            int r0 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0186
            g.e.a.b.f.b.n4 r0 = r2.a
            g.e.a.b.f.b.q9 r3 = r0.A()
            g.e.a.b.f.b.n4 r0 = r2.a
            android.content.Context r0 = r0.a
            java.lang.String r4 = r0.getPackageName()
            r3.h()
            g.c.b.b.f.k(r4)
            android.content.pm.PackageManager r14 = r0.getPackageManager()
            java.security.MessageDigest r15 = g.e.a.b.f.b.q9.r()
            r16 = -1
            if (r15 != 0) goto L_0x0131
            g.e.a.b.f.b.n4 r0 = r3.a
            g.e.a.b.f.b.f3 r0 = r0.d()
            g.e.a.b.f.b.d3 r0 = r0.f3136f
            java.lang.String r3 = "Could not get MD5 instance"
            r0.a(r3)
            goto L_0x017f
        L_0x0131:
            if (r14 == 0) goto L_0x017d
            boolean r4 = r3.T(r0, r4)     // Catch:{ NameNotFoundException -> 0x016f }
            if (r4 != 0) goto L_0x017d
            g.e.a.b.b.i.a r0 = g.e.a.b.b.i.b.a(r0)     // Catch:{ NameNotFoundException -> 0x016f }
            g.e.a.b.f.b.n4 r4 = r3.a     // Catch:{ NameNotFoundException -> 0x016f }
            android.content.Context r4 = r4.a     // Catch:{ NameNotFoundException -> 0x016f }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x016f }
            r14 = 64
            android.content.pm.PackageInfo r0 = r0.b(r4, r14)     // Catch:{ NameNotFoundException -> 0x016f }
            android.content.pm.Signature[] r0 = r0.signatures     // Catch:{ NameNotFoundException -> 0x016f }
            if (r0 == 0) goto L_0x0161
            int r4 = r0.length     // Catch:{ NameNotFoundException -> 0x016f }
            if (r4 <= 0) goto L_0x0161
            r0 = r0[r7]     // Catch:{ NameNotFoundException -> 0x016f }
            byte[] r0 = r0.toByteArray()     // Catch:{ NameNotFoundException -> 0x016f }
            byte[] r0 = r15.digest(r0)     // Catch:{ NameNotFoundException -> 0x016f }
            long r16 = g.e.a.b.f.b.q9.m0(r0)     // Catch:{ NameNotFoundException -> 0x016f }
            goto L_0x017f
        L_0x0161:
            g.e.a.b.f.b.n4 r0 = r3.a     // Catch:{ NameNotFoundException -> 0x016f }
            g.e.a.b.f.b.f3 r0 = r0.d()     // Catch:{ NameNotFoundException -> 0x016f }
            g.e.a.b.f.b.d3 r0 = r0.f3139i     // Catch:{ NameNotFoundException -> 0x016f }
            java.lang.String r4 = "Could not get signatures"
            r0.a(r4)     // Catch:{ NameNotFoundException -> 0x016f }
            goto L_0x017f
        L_0x016f:
            r0 = move-exception
            g.e.a.b.f.b.n4 r3 = r3.a
            g.e.a.b.f.b.f3 r3 = r3.d()
            g.e.a.b.f.b.d3 r3 = r3.f3136f
            java.lang.String r4 = "Package name not found"
            r3.b(r4, r0)
        L_0x017d:
            r16 = 0
        L_0x017f:
            r3 = r16
            r2.f3371g = r3
            r16 = r3
            goto L_0x0188
        L_0x0186:
            r16 = r14
        L_0x0188:
            g.e.a.b.f.b.n4 r0 = r2.a
            boolean r19 = r0.g()
            g.e.a.b.f.b.n4 r0 = r2.a
            g.e.a.b.f.b.s3 r0 = r0.t()
            boolean r0 = r0.p
            r20 = r0 ^ 1
            r2.h()
            g.e.a.b.f.b.n4 r0 = r2.a
            boolean r0 = r0.g()
            if (r0 != 0) goto L_0x01a5
            goto L_0x021d
        L_0x01a5:
            g.e.a.b.e.c.rc r0 = g.e.a.b.e.c.rc.c
            g.e.a.b.e.c.sc r0 = r0.c()
            r0.c()
            g.e.a.b.f.b.n4 r0 = r2.a
            g.e.a.b.f.b.f r0 = r0.f3258g
            g.e.a.b.f.b.r2 r3 = g.e.a.b.f.b.s2.b0
            boolean r0 = r0.u(r6, r3)
            if (r0 == 0) goto L_0x01c8
            g.e.a.b.f.b.n4 r0 = r2.a
            g.e.a.b.f.b.f3 r0 = r0.d()
            g.e.a.b.f.b.d3 r0 = r0.n
            java.lang.String r3 = "Disabled IID for tests."
        L_0x01c4:
            r0.a(r3)
            goto L_0x021d
        L_0x01c8:
            g.e.a.b.f.b.n4 r0 = r2.a     // Catch:{ ClassNotFoundException -> 0x021d }
            android.content.Context r0 = r0.a     // Catch:{ ClassNotFoundException -> 0x021d }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x021d }
            java.lang.String r3 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r0 = r0.loadClass(r3)     // Catch:{ ClassNotFoundException -> 0x021d }
            if (r0 != 0) goto L_0x01d9
            goto L_0x021d
        L_0x01d9:
            java.lang.Class[] r3 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0212 }
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r3[r7] = r4     // Catch:{ Exception -> 0x0212 }
            java.lang.String r4 = "getInstance"
            java.lang.reflect.Method r3 = r0.getDeclaredMethod(r4, r3)     // Catch:{ Exception -> 0x0212 }
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0212 }
            g.e.a.b.f.b.n4 r5 = r2.a     // Catch:{ Exception -> 0x0212 }
            android.content.Context r5 = r5.a     // Catch:{ Exception -> 0x0212 }
            r4[r7] = r5     // Catch:{ Exception -> 0x0212 }
            java.lang.Object r3 = r3.invoke(r6, r4)     // Catch:{ Exception -> 0x0212 }
            if (r3 != 0) goto L_0x01f4
            goto L_0x021d
        L_0x01f4:
            java.lang.String r4 = "getFirebaseInstanceId"
            java.lang.Class[] r5 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x0207 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r5)     // Catch:{ Exception -> 0x0207 }
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0207 }
            java.lang.Object r0 = r0.invoke(r3, r4)     // Catch:{ Exception -> 0x0207 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0207 }
            r21 = r0
            goto L_0x021f
        L_0x0207:
            g.e.a.b.f.b.n4 r0 = r2.a
            g.e.a.b.f.b.f3 r0 = r0.d()
            g.e.a.b.f.b.d3 r0 = r0.f3141k
            java.lang.String r3 = "Failed to retrieve Firebase Instance Id"
            goto L_0x01c4
        L_0x0212:
            g.e.a.b.f.b.n4 r0 = r2.a
            g.e.a.b.f.b.f3 r0 = r0.d()
            g.e.a.b.f.b.d3 r0 = r0.f3140j
            java.lang.String r3 = "Failed to obtain Firebase Analytics instance"
            goto L_0x01c4
        L_0x021d:
            r21 = r6
        L_0x021f:
            g.e.a.b.f.b.n4 r0 = r2.a
            g.e.a.b.f.b.s3 r3 = r0.t()
            g.e.a.b.f.b.p3 r3 = r3.f3338e
            long r3 = r3.a()
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0234
            long r3 = r0.G
            goto L_0x023a
        L_0x0234:
            long r5 = r0.G
            long r3 = java.lang.Math.min(r5, r3)
        L_0x023a:
            r24 = r3
            r2.i()
            int r0 = r2.f3374j
            g.e.a.b.f.b.n4 r3 = r2.a
            g.e.a.b.f.b.f r3 = r3.f3258g
            boolean r27 = r3.t()
            g.e.a.b.f.b.n4 r3 = r2.a
            g.e.a.b.f.b.s3 r3 = r3.t()
            r3.h()
            android.content.SharedPreferences r3 = r3.o()
            java.lang.String r4 = "deferred_analytics_collection"
            r5 = 0
            boolean r28 = r3.getBoolean(r4, r5)
            r2.i()
            java.lang.String r3 = r2.f3376l
            g.e.a.b.f.b.n4 r4 = r2.a
            g.e.a.b.f.b.f r4 = r4.f3258g
            java.lang.String r5 = "google_analytics_default_allow_ad_personalization_signals"
            java.lang.Boolean r4 = r4.s(r5)
            if (r4 != 0) goto L_0x0270
            r4 = 0
            goto L_0x027a
        L_0x0270:
            boolean r4 = r4.booleanValue()
            r4 = r4 ^ 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
        L_0x027a:
            r30 = r4
            r22 = 0
            long r4 = r2.f3372h
            r31 = r4
            java.util.List r4 = r2.f3373i
            r33 = r4
            g.e.a.b.f.b.n4 r2 = r2.a
            g.e.a.b.f.b.s3 r2 = r2.t()
            g.e.a.b.f.b.h r2 = r2.p()
            java.lang.String r34 = r2.d()
            r14 = 55005(0xd6dd, double:2.7176E-319)
            r7 = r35
            r26 = r0
            r29 = r3
            r7.<init>(r8, r9, r10, r11, r13, r14, r16, r18, r19, r20, r21, r22, r24, r26, r27, r28, r29, r30, r31, r33, r34)
            return r35
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.f8.q(boolean):com.google.android.gms.measurement.internal.zzp");
    }

    public final void r() {
        h();
        this.a.d().n.b("Processing queued up service tasks", Integer.valueOf(this.f3161h.size()));
        for (Runnable run : this.f3161h) {
            try {
                run.run();
            } catch (RuntimeException e2) {
                this.a.d().f3136f.b("Task exception while flushing queue", e2);
            }
        }
        this.f3161h.clear();
        this.f3162i.a();
    }

    public final void s() {
        h();
        x8 x8Var = this.f3160g;
        Objects.requireNonNull((c) x8Var.a);
        x8Var.b = SystemClock.elapsedRealtime();
        m mVar = this.f3159f;
        f fVar = this.a.f3258g;
        mVar.c(((Long) s2.J.a((Object) null)).longValue());
    }

    public final void t(Runnable runnable) throws IllegalStateException {
        h();
        if (n()) {
            runnable.run();
            return;
        }
        int size = this.f3161h.size();
        n4 n4Var = this.a;
        f fVar = n4Var.f3258g;
        if (((long) size) >= 1000) {
            n4Var.d().f3136f.a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.f3161h.add(runnable);
        this.f3162i.c(60000);
        w();
    }

    public final boolean u() {
        b bVar = this.a.f3257f;
        return true;
    }

    public final void w() {
        h();
        i();
        if (!n()) {
            if (p()) {
                e8 e8Var = this.c;
                e8Var.c.h();
                Context context = e8Var.c.a.a;
                synchronized (e8Var) {
                    if (e8Var.a) {
                        e8Var.c.a.d().n.a("Connection attempt already in progress");
                    } else if (e8Var.b == null || (!e8Var.b.d() && !e8Var.b.c())) {
                        e8Var.b = new b3(context, Looper.getMainLooper(), e8Var, e8Var);
                        e8Var.c.a.d().n.a("Connecting to remote service");
                        e8Var.a = true;
                        Objects.requireNonNull(e8Var.b, "null reference");
                        e8Var.b.a();
                    } else {
                        e8Var.c.a.d().n.a("Already awaiting connection attempt");
                    }
                }
            } else if (!this.a.f3258g.y()) {
                n4 n4Var = this.a;
                b bVar = n4Var.f3257f;
                List<ResolveInfo> queryIntentServices = n4Var.a.getPackageManager().queryIntentServices(new Intent().setClassName(this.a.a, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices == null || queryIntentServices.size() <= 0) {
                    this.a.d().f3136f.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                    return;
                }
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                n4 n4Var2 = this.a;
                Context context2 = n4Var2.a;
                b bVar2 = n4Var2.f3257f;
                intent.setComponent(new ComponentName(context2, "com.google.android.gms.measurement.AppMeasurementService"));
                e8 e8Var2 = this.c;
                e8Var2.c.h();
                Context context3 = e8Var2.c.a.a;
                a b = a.b();
                synchronized (e8Var2) {
                    if (e8Var2.a) {
                        e8Var2.c.a.d().n.a("Connection attempt already in progress");
                    } else {
                        e8Var2.c.a.d().n.a("Using local app measurement service");
                        e8Var2.a = true;
                        b.a(context3, intent, e8Var2.c.c, 129);
                    }
                }
            }
        }
    }

    public final void x() {
        h();
        i();
        e8 e8Var = this.c;
        if (e8Var.b != null && (e8Var.b.c() || e8Var.b.d())) {
            b3 b3Var = e8Var.b;
            b3Var.t.incrementAndGet();
            synchronized (b3Var.f2854k) {
                int size = b3Var.f2854k.size();
                for (int i2 = 0; i2 < size; i2++) {
                    r rVar = b3Var.f2854k.get(i2);
                    synchronized (rVar) {
                        rVar.a = null;
                    }
                }
                b3Var.f2854k.clear();
            }
            synchronized (b3Var.f2850g) {
                b3Var.f2851h = null;
            }
            b3Var.i(1, null);
        }
        e8Var.b = null;
        try {
            a.b().c(this.a.a, this.c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f3157d = null;
    }

    public final void y(AtomicReference atomicReference) {
        h();
        i();
        t(new j7(this, atomicReference, q(false)));
    }
}
