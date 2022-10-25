package g.f.a.b;

import g.a.a.a.a;
import g.f.a.d.i;
import g.f.a.g.f;
import g.f.a.g.g;
import g.f.a.g.k;
import g.f.a.g.l.e;
import g.f.a.g.m.b;
import g.f.a.i.c;
import java.io.IOException;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public abstract class d<T, ID> implements k<T>, Serializable {
    private static final long serialVersionUID = -5158840898186237589L;
    public final transient g<T, ID> b;
    public final transient i c;

    /* renamed from: d  reason: collision with root package name */
    public final transient Object f3848d;

    /* renamed from: e  reason: collision with root package name */
    public transient g.f.a.g.d<T> f3849e;

    /* renamed from: f  reason: collision with root package name */
    public final transient String f3850f;

    /* renamed from: g  reason: collision with root package name */
    public final transient boolean f3851g;

    /* renamed from: h  reason: collision with root package name */
    public final transient Object f3852h;

    public d(g<T, ID> gVar, Object obj, Object obj2, i iVar, String str, boolean z) {
        this.b = gVar;
        this.c = iVar;
        this.f3848d = obj2;
        this.f3850f = str;
        this.f3851g = z;
        this.f3852h = obj;
    }

    public boolean add(T t) {
        try {
            return x(t);
        } catch (SQLException e2) {
            throw new IllegalStateException("Could not create data element in dao", e2);
        }
    }

    public boolean addAll(Collection<? extends T> collection) {
        boolean z = false;
        for (Object x : collection) {
            try {
                if (x(x)) {
                    z = true;
                }
            } catch (SQLException e2) {
                throw new IllegalStateException("Could not create data elements in dao", e2);
            }
        }
        return z;
    }

    public void clear() {
        if (this.b != null) {
            f g2 = g();
            while (g2.hasNext()) {
                try {
                    g2.next();
                    g2.remove();
                } catch (Throwable th) {
                    if (g2 != null) {
                        try {
                            g2.close();
                        } catch (IOException unused) {
                        }
                    }
                    throw th;
                }
            }
            try {
                g2.close();
            } catch (IOException unused2) {
            }
        }
    }

    public g.f.a.g.d<T> e0() throws SQLException {
        g<T, ID> gVar = this.b;
        if (gVar == null) {
            return null;
        }
        if (this.f3849e == null) {
            g gVar2 = new g();
            Object obj = this.f3848d;
            gVar2.c = true;
            gVar2.f3961d = obj;
            f<T, ID> q = gVar.q();
            String str = this.f3850f;
            if (str != null) {
                boolean z = this.f3851g;
                if (!q.a.b(str).f3876e.F) {
                    b bVar = new b(str, z);
                    if (q.f3960l == null) {
                        q.f3960l = new ArrayList();
                    }
                    q.f3960l.add(bVar);
                } else {
                    throw new IllegalArgumentException(a.w("Can't orderBy foreign collection field: ", str));
                }
            }
            c<T, ID> cVar = q.a;
            k<T, ID> kVar = new k<>(cVar, q, q.c);
            q.f3976g = kVar;
            String str2 = this.c.f3875d;
            g.f.a.g.m.c cVar2 = new g.f.a.g.m.c(str2, cVar.b(str2), gVar2, "=");
            int i2 = kVar.f3993f;
            if (i2 == kVar.f3992e.length) {
                g.f.a.g.m.a[] aVarArr = new g.f.a.g.m.a[(i2 * 2)];
                for (int i3 = 0; i3 < kVar.f3993f; i3++) {
                    g.f.a.g.m.a[] aVarArr2 = kVar.f3992e;
                    aVarArr[i3] = aVarArr2[i3];
                    aVarArr2[i3] = null;
                }
                kVar.f3992e = aVarArr;
            }
            g.f.a.g.m.a[] aVarArr3 = kVar.f3992e;
            int i4 = kVar.f3993f;
            kVar.f3993f = i4 + 1;
            aVarArr3[i4] = cVar2;
            e<T, ID> f2 = kVar.b.f((Long) null, false);
            this.f3849e = f2;
            Object obj2 = this.f3852h;
            Object obj3 = this.f3848d;
            f2.f3996i = obj2;
            f2.f3997j = obj3;
        }
        return this.f3849e;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        if (this.b == null) {
            return false;
        }
        f g2 = g();
        while (g2.hasNext()) {
            try {
                if (!collection.contains(g2.next())) {
                    g2.remove();
                    z = true;
                }
            } catch (Throwable th) {
                if (g2 != null) {
                    try {
                        g2.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        }
        try {
            g2.close();
        } catch (IOException unused2) {
        }
        return z;
    }

    public final boolean x(T t) throws SQLException {
        if (this.b == null) {
            return false;
        }
        if (this.f3852h != null) {
            i iVar = this.c;
            Object e2 = iVar.e(t);
            if (iVar.o(e2)) {
                e2 = null;
            }
            if (e2 == null) {
                this.c.b(t, this.f3852h, true, (m) null);
            }
        }
        this.b.Q(t);
        return true;
    }
}
