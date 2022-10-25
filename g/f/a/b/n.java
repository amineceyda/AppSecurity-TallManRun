package g.f.a.b;

import g.f.a.e.b;
import g.f.a.e.c;
import g.f.a.e.d;
import g.f.a.g.f;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

public class n<T, ID> implements g<T, ID> {
    public static final c c = d.a(n.class);
    public g<T, ID> b;

    public n(g<T, ID> gVar) {
        this.b = gVar;
    }

    public g.f.a.h.c O() {
        return this.b.O();
    }

    public int P(String str, String... strArr) {
        try {
            return this.b.P(str, strArr);
        } catch (SQLException e2) {
            c(e2, "executeRaw threw exception on: " + str);
            throw new RuntimeException(e2);
        }
    }

    public int Q(T t) {
        try {
            return this.b.Q(t);
        } catch (SQLException e2) {
            c(e2, "create threw exception on: " + t);
            throw new RuntimeException(e2);
        }
    }

    public int S(T t) {
        try {
            return this.b.S(t);
        } catch (SQLException e2) {
            c(e2, "delete threw exception on: " + t);
            throw new RuntimeException(e2);
        }
    }

    public f<T> V(g.f.a.g.d<T> dVar, int i2) {
        try {
            return this.b.V(dVar, i2);
        } catch (SQLException e2) {
            c(e2, "iterator threw exception on: " + dVar);
            throw new RuntimeException(e2);
        }
    }

    public Class<T> a() {
        return this.b.a();
    }

    public final void c(Exception exc, String str) {
        c cVar = c;
        b.a aVar = b.a.DEBUG;
        Object obj = c.b;
        cVar.g(aVar, exc, str, obj, obj, obj, (Object[]) null);
    }

    public f<T> iterator() {
        return this.b.iterator();
    }

    /* renamed from: iterator  reason: collision with other method in class */
    public Iterator m4iterator() {
        return this.b.iterator();
    }

    public f<T, ID> q() {
        return this.b.q();
    }

    public void s() {
        this.b.s();
    }

    public int t(T t) {
        try {
            return this.b.t(t);
        } catch (SQLException e2) {
            c(e2, "update threw exception on: " + t);
            throw new RuntimeException(e2);
        }
    }

    public List<T> u() {
        try {
            return this.b.u();
        } catch (SQLException e2) {
            c(e2, "queryForAll threw exception");
            throw new RuntimeException(e2);
        }
    }
}
