package g.f.a.a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.common.ConnectionResult;
import g.f.a.a.f.a;
import g.f.a.b.m;
import g.f.a.d.k;
import g.f.a.e.c;
import g.f.a.e.d;
import g.f.a.g.i;
import g.f.a.h.b;
import g.f.a.h.e;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class a implements b {

    /* renamed from: k  reason: collision with root package name */
    public static c f3823k = d.a(a.class);

    /* renamed from: l  reason: collision with root package name */
    public static final String[] f3824l = new String[0];

    /* renamed from: m  reason: collision with root package name */
    public static final g.f.a.a.f.a f3825m = g.f.a.a.f.b.a;
    public final String b;
    public final SQLiteDatabase c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a f3826d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f3827e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f3828f;

    /* renamed from: g  reason: collision with root package name */
    public Cursor f3829g;

    /* renamed from: h  reason: collision with root package name */
    public List<Object> f3830h;

    /* renamed from: i  reason: collision with root package name */
    public Integer f3831i;

    /* renamed from: j  reason: collision with root package name */
    public a.C0133a f3832j;

    public a(String str, SQLiteDatabase sQLiteDatabase, i.a aVar, boolean z, boolean z2) {
        this.b = str;
        this.c = sQLiteDatabase;
        this.f3826d = aVar;
        this.f3827e = z;
        this.f3828f = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        if (r3 == null) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int a() throws java.sql.SQLException {
        /*
            r6 = this;
            g.f.a.g.i$a r0 = r6.f3826d
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0067
            android.database.sqlite.SQLiteDatabase r0 = r6.c
            java.lang.String r1 = "runExecute"
            java.lang.String r2 = r6.b
            java.util.List<java.lang.Object> r3 = r6.f3830h
            if (r3 != 0) goto L_0x0015
            java.lang.String[] r3 = f3824l
            goto L_0x001f
        L_0x0015:
            int r4 = r3.size()
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Object[] r3 = r3.toArray(r4)
        L_0x001f:
            r0.execSQL(r2, r3)     // Catch:{ SQLException -> 0x0048 }
            r3 = 0
            java.lang.String r4 = "SELECT CHANGES()"
            android.database.sqlite.SQLiteStatement r3 = r0.compileStatement(r4)     // Catch:{ SQLException -> 0x0036, all -> 0x002f }
            long r4 = r3.simpleQueryForLong()     // Catch:{ SQLException -> 0x0036, all -> 0x002f }
            int r0 = (int) r4
            goto L_0x0039
        L_0x002f:
            r0 = move-exception
            if (r3 == 0) goto L_0x0035
            r3.close()
        L_0x0035:
            throw r0
        L_0x0036:
            r0 = 1
            if (r3 == 0) goto L_0x003c
        L_0x0039:
            r3.close()
        L_0x003c:
            g.f.a.e.c r3 = f3823k
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.String r5 = "executing statement {} changed {} rows: {}"
            r3.j(r5, r1, r4, r2)
            return r0
        L_0x0048:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Problems executing "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " Android statement: "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            java.sql.SQLException r0 = e.e.i.b.j(r1, r0)
            throw r0
        L_0x0067:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot call execute on a "
            java.lang.StringBuilder r1 = g.a.a.a.a.i(r1)
            g.f.a.g.i$a r2 = r6.f3826d
            r1.append(r2)
            java.lang.String r2 = " statement"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.f.a.a.a.a():int");
    }

    public e b(m mVar) throws SQLException {
        String str;
        if (this.f3826d.b()) {
            if (this.f3829g == null) {
                try {
                    if (this.f3831i == null) {
                        str = this.b;
                    } else {
                        str = this.b + " LIMIT " + this.f3831i;
                    }
                    if (this.f3827e) {
                        this.f3832j = f3825m.b();
                    }
                    g.f.a.a.f.a aVar = f3825m;
                    SQLiteDatabase sQLiteDatabase = this.c;
                    List<Object> list = this.f3830h;
                    Cursor a = aVar.a(sQLiteDatabase, str, list == null ? f3824l : (String[]) list.toArray(new String[list.size()]), this.f3832j);
                    this.f3829g = a;
                    a.moveToFirst();
                    f3823k.i("{}: started rawQuery cursor for: {}", this, str);
                } catch (android.database.SQLException e2) {
                    throw e.e.i.b.j("Problems executing Android query: " + null, e2);
                }
            }
            return new d(this.f3829g, mVar, this.f3828f);
        }
        StringBuilder i2 = g.a.a.a.a.i("Cannot call query on a ");
        i2.append(this.f3826d);
        i2.append(" statement");
        throw new IllegalArgumentException(i2.toString());
    }

    public void close() throws IOException {
        Cursor cursor = this.f3829g;
        if (cursor != null && !cursor.isClosed()) {
            try {
                this.f3829g.close();
            } catch (android.database.SQLException e2) {
                throw new IOException("Problems closing Android cursor", e2);
            }
        }
        this.f3832j = null;
    }

    public void d(int i2, Object obj, k kVar) throws SQLException {
        List<Object> list;
        if (this.f3829g == null) {
            if (this.f3830h == null) {
                this.f3830h = new ArrayList();
            }
            if (obj == null) {
                this.f3830h.add(i2, (Object) null);
                return;
            }
            switch (kVar.ordinal()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    list = this.f3830h;
                    obj = obj.toString();
                    break;
                case 6:
                case 12:
                    list = this.f3830h;
                    break;
                case ConnectionResult.CANCELED:
                case ConnectionResult.TIMEOUT:
                    throw new SQLException("Invalid Android type: " + kVar);
                default:
                    throw new SQLException("Unknown sql argument type: " + kVar);
            }
            list.add(i2, obj);
            return;
        }
        throw new SQLException("Query already run. Cannot add argument values.");
    }

    public String toString() {
        return a.class.getSimpleName() + "@" + Integer.toHexString(hashCode());
    }
}
