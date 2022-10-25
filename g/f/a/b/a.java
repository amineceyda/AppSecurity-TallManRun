package g.f.a.b;

import g.f.a.b.h;
import g.f.a.c.c;
import g.f.a.d.i;
import g.f.a.g.d;
import g.f.a.g.f;
import g.f.a.g.h;
import g.f.a.g.j;
import g.f.a.i.b;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public abstract class a<T, ID> implements g<T, ID> {

    /* renamed from: j  reason: collision with root package name */
    public static final ThreadLocal<List<a<?, ?>>> f3841j = new C0134a();
    public j<T, ID> b;
    public c c;

    /* renamed from: d  reason: collision with root package name */
    public final Class<T> f3842d;

    /* renamed from: e  reason: collision with root package name */
    public b<T> f3843e;

    /* renamed from: f  reason: collision with root package name */
    public g.f.a.i.c<T, ID> f3844f;

    /* renamed from: g  reason: collision with root package name */
    public g.f.a.h.c f3845g;

    /* renamed from: h  reason: collision with root package name */
    public f<T> f3846h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3847i;

    /* renamed from: g.f.a.b.a$a  reason: collision with other inner class name */
    public static class C0134a extends ThreadLocal<List<a<?, ?>>> {
        public Object initialValue() {
            return new ArrayList(10);
        }
    }

    public a(g.f.a.h.c cVar, b<T> bVar) throws SQLException {
        this.f3842d = bVar.a;
        this.f3843e = bVar;
        if (cVar != null) {
            this.f3845g = cVar;
            e();
        }
    }

    public g.f.a.h.c O() {
        return this.f3845g;
    }

    public int P(String str, String... strArr) throws SQLException {
        c();
        try {
            int e2 = this.b.e(((g.f.a.a.b) this.f3845g).b(this.f3844f.f4017d), str, strArr);
            Objects.requireNonNull((g.f.a.a.b) this.f3845g);
            return e2;
        } catch (SQLException e3) {
            throw e.e.i.b.j("Could not run raw execute statement " + str, e3);
        } catch (Throwable th) {
            Objects.requireNonNull((g.f.a.a.b) this.f3845g);
            throw th;
        }
    }

    public int Q(T t) throws SQLException {
        c();
        if (t == null) {
            return 0;
        }
        if (t instanceof g.f.a.f.a) {
            g.f.a.f.a aVar = (g.f.a.f.a) t;
        }
        try {
            this.b.c(((g.f.a.a.b) this.f3845g).b(this.f3844f.f4017d), t, (m) null);
            return 1;
        } finally {
            Objects.requireNonNull((g.f.a.a.b) this.f3845g);
        }
    }

    public int S(T t) throws SQLException {
        c();
        if (t == null) {
            return 0;
        }
        try {
            return this.b.d(((g.f.a.a.b) this.f3845g).b(this.f3844f.f4017d), t, (m) null);
        } finally {
            Objects.requireNonNull((g.f.a.a.b) this.f3845g);
        }
    }

    public f<T> V(d<T> dVar, int i2) throws SQLException {
        c();
        try {
            h<T, ID> b2 = this.b.b(this, this.f3845g, dVar, (m) null, i2);
            this.f3846h = b2;
            return b2;
        } catch (SQLException e2) {
            StringBuilder i3 = g.a.a.a.a.i("Could not build prepared-query iterator for ");
            i3.append(this.f3842d);
            throw e.e.i.b.j(i3.toString(), e2);
        }
    }

    public Class<T> a() {
        return this.f3842d;
    }

    public void c() {
        if (!this.f3847i) {
            throw new IllegalStateException("you must call initialize() before you can use the dao");
        }
    }

    public void e() throws SQLException {
        a aVar;
        if (!this.f3847i) {
            g.f.a.h.c cVar = this.f3845g;
            if (cVar != null) {
                c cVar2 = ((g.f.a.a.b) cVar).f3835e;
                this.c = cVar2;
                if (cVar2 != null) {
                    b<T> bVar = this.f3843e;
                    if (bVar == null) {
                        this.f3844f = new g.f.a.i.c<>(cVar, this, this.f3842d);
                    } else {
                        bVar.a(cVar);
                        this.f3844f = new g.f.a.i.c<>(this.c, this, this.f3843e);
                    }
                    this.b = new j<>(this.c, this.f3844f, this);
                    List list = f3841j.get();
                    list.add(this);
                    if (list.size() <= 1) {
                        int i2 = 0;
                        while (i2 < list.size()) {
                            try {
                                aVar = (a) list.get(i2);
                                h.f(this.f3845g, aVar);
                                for (i c2 : aVar.f3844f.f4018e) {
                                    c2.c(this.f3845g, aVar.f3842d);
                                }
                                aVar.f3847i = true;
                                i2++;
                            } catch (SQLException e2) {
                                g.f.a.h.c cVar3 = this.f3845g;
                                synchronized (h.class) {
                                    if (cVar3 != null) {
                                        h.a aVar2 = new h.a(cVar3, aVar.a());
                                        Map<h.a, g<?, ?>> map = h.b;
                                        if (map != null) {
                                            map.remove(aVar2);
                                        }
                                        throw e2;
                                    }
                                    throw new IllegalArgumentException("connectionSource argument cannot be null");
                                }
                            } catch (Throwable th) {
                                list.clear();
                                f3841j.remove();
                                throw th;
                            }
                        }
                        list.clear();
                        f3841j.remove();
                        return;
                    }
                    return;
                }
                StringBuilder i3 = g.a.a.a.a.i("connectionSource is getting a null DatabaseType in ");
                i3.append(getClass().getSimpleName());
                throw new IllegalStateException(i3.toString());
            }
            StringBuilder i4 = g.a.a.a.a.i("connectionSource was never set on ");
            i4.append(getClass().getSimpleName());
            throw new IllegalStateException(i4.toString());
        }
    }

    public List<T> f(d<T> dVar) throws SQLException {
        c();
        return this.b.g(this.f3845g, dVar, (m) null);
    }

    public f<T> iterator() {
        c();
        try {
            j<T, ID> jVar = this.b;
            g.f.a.h.c cVar = this.f3845g;
            jVar.f();
            g.f.a.g.h<T, ID> b2 = jVar.b(this, cVar, jVar.f3986d, (m) null, -1);
            this.f3846h = b2;
            return b2;
        } catch (Exception e2) {
            StringBuilder i2 = g.a.a.a.a.i("Could not build iterator for ");
            i2.append(this.f3842d);
            throw new IllegalStateException(i2.toString(), e2);
        }
    }

    public f<T, ID> q() {
        c();
        return new f<>(this.c, this.f3844f, this);
    }

    public void s() {
    }

    public int t(T t) throws SQLException {
        c();
        if (t == null) {
            return 0;
        }
        if (t instanceof g.f.a.f.a) {
            g.f.a.f.a aVar = (g.f.a.f.a) t;
        }
        try {
            return this.b.h(((g.f.a.a.b) this.f3845g).b(this.f3844f.f4017d), t, (m) null);
        } finally {
            Objects.requireNonNull((g.f.a.a.b) this.f3845g);
        }
    }

    public List<T> u() throws SQLException {
        c();
        j<T, ID> jVar = this.b;
        g.f.a.h.c cVar = this.f3845g;
        jVar.f();
        return jVar.g(cVar, jVar.f3986d, (m) null);
    }

    public a(g.f.a.h.c cVar, Class<T> cls) throws SQLException {
        this.f3842d = cls;
        this.f3843e = null;
        if (cVar != null) {
            this.f3845g = cVar;
            e();
        }
    }
}
