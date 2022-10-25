package g.f.a.a;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.google.android.gms.common.ConnectionResult;
import g.f.a.d.i;
import g.f.a.d.k;
import g.f.a.g.i;
import g.f.a.g.l.c;
import g.f.a.h.b;
import g.f.a.h.d;
import g.f.a.h.f;
import java.io.IOException;
import java.sql.SQLException;

public class c implements d {

    /* renamed from: d  reason: collision with root package name */
    public static g.f.a.e.c f3836d = g.f.a.e.d.a(c.class);
    public final SQLiteDatabase b;
    public final boolean c;

    public c(SQLiteDatabase sQLiteDatabase, boolean z, boolean z2) {
        this.b = sQLiteDatabase;
        this.c = z2;
        f3836d.j("{}: db {} opened, read-write = {}", this, sQLiteDatabase, Boolean.valueOf(z));
    }

    public final void a(SQLiteStatement sQLiteStatement, Object[] objArr, i[] iVarArr) throws SQLException {
        if (objArr != null) {
            for (int i2 = 0; i2 < objArr.length; i2++) {
                byte[] bArr = objArr[i2];
                if (bArr == null) {
                    sQLiteStatement.bindNull(i2 + 1);
                } else {
                    k k2 = iVarArr[i2].k();
                    switch (k2.ordinal()) {
                        case 0:
                        case 1:
                        case 4:
                            sQLiteStatement.bindString(i2 + 1, bArr.toString());
                            break;
                        case 2:
                        case ConnectionResult.CANCELED:
                        case ConnectionResult.TIMEOUT:
                            throw new SQLException("Invalid Android type: " + k2);
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                            sQLiteStatement.bindLong(i2 + 1, ((Number) bArr).longValue());
                            break;
                        case 6:
                        case 12:
                            sQLiteStatement.bindBlob(i2 + 1, bArr);
                            break;
                        case 10:
                        case 11:
                            sQLiteStatement.bindDouble(i2 + 1, ((Number) bArr).doubleValue());
                            break;
                        default:
                            throw new SQLException("Unknown sql argument type: " + k2);
                    }
                }
            }
        }
    }

    public b b(String str, i.a aVar, g.f.a.d.i[] iVarArr, int i2, boolean z) {
        a aVar2 = new a(str, this.b, aVar, this.c, z);
        f3836d.j("{}: compiled statement got {}: {}", this, aVar2, str);
        return aVar2;
    }

    public void close() throws IOException {
        try {
            this.b.close();
            f3836d.i("{}: db {} closed", this, this.b);
        } catch (android.database.SQLException e2) {
            throw new IOException("problems closing the database connection", e2);
        }
    }

    public int d(String str, Object[] objArr, g.f.a.d.i[] iVarArr, f fVar) throws SQLException {
        SQLiteStatement sQLiteStatement = null;
        try {
            SQLiteStatement compileStatement = this.b.compileStatement(str);
            a(compileStatement, objArr, iVarArr);
            long executeInsert = compileStatement.executeInsert();
            if (fVar != null) {
                ((c.b) fVar).a(Long.valueOf(executeInsert));
            }
            f3836d.j("{}: insert statement is compiled and executed, changed {}: {}", this, 1, str);
            compileStatement.close();
            return 1;
        } catch (android.database.SQLException e2) {
            throw e.e.i.b.j("inserting to database failed: " + str, e2);
        } catch (Throwable th) {
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
            }
            throw th;
        }
    }

    public final String[] f(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        String[] strArr = new String[objArr.length];
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                strArr[i2] = null;
            } else {
                strArr[i2] = obj.toString();
            }
        }
        return strArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r0 == null) goto L_0x002d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g(java.lang.String r3, java.lang.Object[] r4, g.f.a.d.i[] r5, java.lang.String r6) throws java.sql.SQLException {
        /*
            r2 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r2.b     // Catch:{ SQLException -> 0x0040 }
            android.database.sqlite.SQLiteStatement r1 = r1.compileStatement(r3)     // Catch:{ SQLException -> 0x0040 }
            r2.a(r1, r4, r5)     // Catch:{ SQLException -> 0x003b, all -> 0x0039 }
            r1.execute()     // Catch:{ SQLException -> 0x003b, all -> 0x0039 }
            r1.close()
            android.database.sqlite.SQLiteDatabase r4 = r2.b     // Catch:{ SQLException -> 0x001e, all -> 0x0020 }
            java.lang.String r5 = "SELECT CHANGES()"
            android.database.sqlite.SQLiteStatement r0 = r4.compileStatement(r5)     // Catch:{ SQLException -> 0x001e, all -> 0x0020 }
            long r4 = r0.simpleQueryForLong()     // Catch:{ SQLException -> 0x001e, all -> 0x0020 }
            int r5 = (int) r4
            goto L_0x002a
        L_0x001e:
            goto L_0x0027
        L_0x0020:
            r3 = move-exception
            if (r0 == 0) goto L_0x0026
            r0.close()
        L_0x0026:
            throw r3
        L_0x0027:
            r5 = 1
            if (r0 == 0) goto L_0x002d
        L_0x002a:
            r0.close()
        L_0x002d:
            g.f.a.e.c r4 = f3836d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            java.lang.String r1 = "{} statement is compiled and executed, changed {}: {}"
            r4.j(r1, r6, r0, r3)
            return r5
        L_0x0039:
            r3 = move-exception
            goto L_0x0058
        L_0x003b:
            r4 = move-exception
            r0 = r1
            goto L_0x0041
        L_0x003e:
            r3 = move-exception
            goto L_0x0057
        L_0x0040:
            r4 = move-exception
        L_0x0041:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x003e }
            r5.<init>()     // Catch:{ all -> 0x003e }
            java.lang.String r6 = "updating database failed: "
            r5.append(r6)     // Catch:{ all -> 0x003e }
            r5.append(r3)     // Catch:{ all -> 0x003e }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x003e }
            java.sql.SQLException r3 = e.e.i.b.j(r3, r4)     // Catch:{ all -> 0x003e }
            throw r3     // Catch:{ all -> 0x003e }
        L_0x0057:
            r1 = r0
        L_0x0058:
            if (r1 == 0) goto L_0x005d
            r1.close()
        L_0x005d:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: g.f.a.a.c.g(java.lang.String, java.lang.Object[], g.f.a.d.i[], java.lang.String):int");
    }

    public String toString() {
        return c.class.getSimpleName() + "@" + Integer.toHexString(hashCode());
    }
}
