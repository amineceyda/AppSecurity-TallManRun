package g.f.a.a;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import g.f.a.e.b;
import g.f.a.e.d;
import g.f.a.h.a;
import g.f.a.h.c;
import java.sql.SQLException;

public class b extends a implements c {

    /* renamed from: f  reason: collision with root package name */
    public static final g.f.a.e.c f3833f = d.a(b.class);
    public final SQLiteOpenHelper c;

    /* renamed from: d  reason: collision with root package name */
    public g.f.a.h.d f3834d = null;

    /* renamed from: e  reason: collision with root package name */
    public final g.f.a.c.c f3835e = new g.f.a.c.d();

    public b(SQLiteOpenHelper sQLiteOpenHelper) {
        this.c = sQLiteOpenHelper;
    }

    public void a(g.f.a.h.d dVar) {
        g.f.a.e.c cVar = f3833f;
        b.a aVar = b.a.ERROR;
        a.C0138a aVar2 = this.b.get();
        if (dVar != null) {
            if (aVar2 == null) {
                Object obj = g.f.a.e.c.b;
                cVar.g(aVar, (Throwable) null, "no connection has been saved when clear() called", obj, obj, obj, (Object[]) null);
                return;
            }
            g.f.a.h.d dVar2 = aVar2.a;
            if (dVar2 == dVar) {
                int i2 = aVar2.b - 1;
                aVar2.b = i2;
                if (i2 == 0) {
                    this.b.set((Object) null);
                    return;
                }
                return;
            }
            cVar.g(aVar, (Throwable) null, "connection saved {} is not the one being cleared {}", dVar2, dVar, g.f.a.e.c.b, (Object[]) null);
        }
    }

    public g.f.a.h.d b(String str) throws SQLException {
        a.C0138a aVar = this.b.get();
        g.f.a.h.d dVar = aVar == null ? null : aVar.a;
        if (dVar != null) {
            return dVar;
        }
        g.f.a.h.d dVar2 = this.f3834d;
        if (dVar2 == null) {
            try {
                SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
                c cVar = new c(writableDatabase, true, false);
                this.f3834d = cVar;
                f3833f.j("created connection {} for db {}, helper {}", cVar, writableDatabase, this.c);
            } catch (android.database.SQLException e2) {
                StringBuilder i2 = g.a.a.a.a.i("Getting a writable database from helper ");
                i2.append(this.c);
                i2.append(" failed");
                throw e.e.i.b.j(i2.toString(), e2);
            }
        } else {
            f3833f.j("{}: returning read-write connection {}, helper {}", this, dVar2, this.c);
        }
        return this.f3834d;
    }

    public void close() {
    }

    public boolean d(g.f.a.h.d dVar) throws SQLException {
        a.C0138a aVar = this.b.get();
        if (aVar == null) {
            this.b.set(new a.C0138a(dVar));
            return true;
        } else if (aVar.a == dVar) {
            aVar.b++;
            return false;
        } else {
            throw new SQLException("trying to save connection " + dVar + " but already have saved connection " + aVar.a);
        }
    }

    public String toString() {
        return b.class.getSimpleName() + "@" + Integer.toHexString(hashCode());
    }
}
