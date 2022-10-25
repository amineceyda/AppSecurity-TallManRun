package g.f.a.g;

import g.f.a.a.a;
import g.f.a.b.f;
import g.f.a.b.g;
import g.f.a.b.m;
import g.f.a.e.c;
import g.f.a.e.d;
import g.f.a.h.b;
import g.f.a.h.e;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Objects;

public class h<T, ID> implements f<T> {
    public static final c o = d.a(h.class);
    public final Class<?> b;
    public final g<T, ID> c;

    /* renamed from: d  reason: collision with root package name */
    public final g.f.a.h.c f3962d;

    /* renamed from: e  reason: collision with root package name */
    public final g.f.a.h.d f3963e;

    /* renamed from: f  reason: collision with root package name */
    public final b f3964f;

    /* renamed from: g  reason: collision with root package name */
    public final e f3965g;

    /* renamed from: h  reason: collision with root package name */
    public final c<T> f3966h;

    /* renamed from: i  reason: collision with root package name */
    public final String f3967i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3968j = true;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3969k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3970l;

    /* renamed from: m  reason: collision with root package name */
    public T f3971m;
    public int n;

    public h(Class<?> cls, g<T, ID> gVar, c<T> cVar, g.f.a.h.c cVar2, g.f.a.h.d dVar, b bVar, String str, m mVar) throws SQLException {
        this.b = cls;
        this.c = gVar;
        this.f3966h = cVar;
        this.f3962d = cVar2;
        this.f3963e = dVar;
        this.f3964f = bVar;
        this.f3965g = ((a) bVar).b(mVar);
        this.f3967i = str;
        if (str != null) {
            o.c("starting iterator @{} for '{}'", Integer.valueOf(hashCode()), str);
        }
    }

    public void G() {
        this.f3971m = null;
        this.f3968j = false;
        this.f3970l = false;
    }

    public boolean a() throws SQLException {
        boolean z;
        if (this.f3969k) {
            return false;
        }
        if (this.f3970l) {
            return true;
        }
        if (this.f3968j) {
            this.f3968j = false;
            z = ((g.f.a.a.d) this.f3965g).a();
        } else {
            z = ((g.f.a.a.d) this.f3965g).u();
        }
        if (!z) {
            e.e.i.b.d(this, "iterator");
        }
        this.f3970l = true;
        return z;
    }

    public T b() throws SQLException {
        boolean z;
        if (this.f3969k) {
            return null;
        }
        if (!this.f3970l) {
            if (this.f3968j) {
                this.f3968j = false;
                z = ((g.f.a.a.d) this.f3965g).a();
            } else {
                z = ((g.f.a.a.d) this.f3965g).u();
            }
            if (!z) {
                this.f3968j = false;
                return null;
            }
        }
        this.f3968j = false;
        T a = this.f3966h.a(this.f3965g);
        this.f3971m = a;
        this.f3970l = false;
        this.n++;
        return a;
    }

    public void close() throws IOException {
        if (!this.f3969k) {
            ((a) this.f3964f).close();
            this.f3969k = true;
            this.f3971m = null;
            if (this.f3967i != null) {
                o.c("closed iterator @{} after {} rows", Integer.valueOf(hashCode()), Integer.valueOf(this.n));
            }
            try {
                Objects.requireNonNull((g.f.a.a.b) this.f3962d);
            } catch (SQLException e2) {
                throw new IOException("could not release connection", e2);
            }
        }
    }

    public void d() throws SQLException {
        T t = this.f3971m;
        if (t != null) {
            g<T, ID> gVar = this.c;
            if (gVar != null) {
                try {
                    gVar.S(t);
                } finally {
                    this.f3971m = null;
                }
            } else {
                StringBuilder i2 = g.a.a.a.a.i("Cannot remove ");
                i2.append(this.b);
                i2.append(" object because classDao not initialized");
                throw new IllegalStateException(i2.toString());
            }
        } else {
            StringBuilder i3 = g.a.a.a.a.i("No last ");
            i3.append(this.b);
            i3.append(" object to remove. Must be called after a call to next.");
            throw new IllegalStateException(i3.toString());
        }
    }

    public boolean hasNext() {
        try {
            return a();
        } catch (SQLException e2) {
            this.f3971m = null;
            try {
                close();
            } catch (IOException unused) {
            }
            StringBuilder i2 = g.a.a.a.a.i("Errors getting more results of ");
            i2.append(this.b);
            throw new IllegalStateException(i2.toString(), e2);
        }
    }

    public T next() {
        try {
            T b2 = b();
            if (b2 != null) {
                return b2;
            }
            e = null;
            this.f3971m = null;
            try {
                close();
            } catch (IOException unused) {
            }
            StringBuilder i2 = g.a.a.a.a.i("Could not get next result for ");
            i2.append(this.b);
            throw new IllegalStateException(i2.toString(), e);
        } catch (SQLException e2) {
            e = e2;
        }
    }

    public void remove() {
        try {
            d();
        } catch (SQLException e2) {
            try {
                close();
            } catch (IOException unused) {
            }
            StringBuilder i2 = g.a.a.a.a.i("Could not delete ");
            i2.append(this.b);
            i2.append(" object ");
            i2.append(this.f3971m);
            throw new IllegalStateException(i2.toString(), e2);
        }
    }
}
