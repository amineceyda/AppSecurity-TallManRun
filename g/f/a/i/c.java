package g.f.a.i;

import e.e.i.b;
import g.f.a.b.a;
import g.f.a.d.f;
import g.f.a.d.i;
import java.lang.reflect.Constructor;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class c<T, ID> {

    /* renamed from: k  reason: collision with root package name */
    public static final i[] f4016k = new i[0];
    public final g.f.a.c.c a;
    public final a<T, ID> b;
    public final Class<T> c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4017d;

    /* renamed from: e  reason: collision with root package name */
    public final i[] f4018e;

    /* renamed from: f  reason: collision with root package name */
    public final i[] f4019f;

    /* renamed from: g  reason: collision with root package name */
    public final i f4020g;

    /* renamed from: h  reason: collision with root package name */
    public final Constructor<T> f4021h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f4022i;

    /* renamed from: j  reason: collision with root package name */
    public Map<String, i> f4023j;

    public c(g.f.a.c.c cVar, a<T, ID> aVar, b<T> bVar) throws SQLException {
        this.a = cVar;
        this.b = aVar;
        this.c = bVar.a;
        this.f4017d = bVar.b;
        i[] iVarArr = bVar.f4014d;
        if (iVarArr != null) {
            this.f4018e = iVarArr;
            i iVar = null;
            boolean z = false;
            int i2 = 0;
            for (i iVar2 : iVarArr) {
                if (iVar2.f3877f || iVar2.f3878g || iVar2.p()) {
                    if (iVar == null) {
                        iVar = iVar2;
                    } else {
                        StringBuilder i3 = g.a.a.a.a.i("More than 1 idField configured for class ");
                        i3.append(this.c);
                        i3.append(" (");
                        i3.append(iVar);
                        i3.append(",");
                        i3.append(iVar2);
                        i3.append(")");
                        throw new SQLException(i3.toString());
                    }
                }
                f fVar = iVar2.f3876e;
                z = fVar.B ? true : z;
                if (fVar.F) {
                    i2++;
                }
            }
            this.f4020g = iVar;
            if (bVar.f4015e == null) {
                Class<T> cls = bVar.a;
                try {
                    Constructor<T>[] declaredConstructors = cls.getDeclaredConstructors();
                    int length = declaredConstructors.length;
                    int i4 = 0;
                    while (i4 < length) {
                        Constructor<T> constructor = declaredConstructors[i4];
                        if (constructor.getParameterTypes().length == 0) {
                            if (!constructor.isAccessible()) {
                                try {
                                    constructor.setAccessible(true);
                                } catch (SecurityException unused) {
                                    throw new IllegalArgumentException(g.a.a.a.a.v("Could not open access to constructor for ", cls));
                                }
                            }
                            bVar.f4015e = constructor;
                        } else {
                            i4++;
                        }
                    }
                    if (cls.getEnclosingClass() == null) {
                        throw new IllegalArgumentException(g.a.a.a.a.v("Can't find a no-arg constructor for ", cls));
                    }
                    throw new IllegalArgumentException("Can't find a no-arg constructor for " + cls + ".  Missing static on inner class?");
                } catch (Exception e2) {
                    throw new IllegalArgumentException(g.a.a.a.a.v("Can't lookup declared constructors for ", cls), e2);
                }
            }
            this.f4021h = bVar.f4015e;
            this.f4022i = z;
            if (i2 == 0) {
                this.f4019f = f4016k;
                return;
            }
            this.f4019f = new i[i2];
            int i5 = 0;
            for (i iVar3 : this.f4018e) {
                if (iVar3.f3876e.F) {
                    this.f4019f[i5] = iVar3;
                    i5++;
                }
            }
            return;
        }
        throw new SQLException("Field types have not been extracted in table config");
    }

    public T a() throws SQLException {
        try {
            a<T, ID> aVar = this.b;
            if (aVar != null) {
                Objects.requireNonNull(aVar);
            }
            T newInstance = this.f4021h.newInstance(new Object[0]);
            if (newInstance instanceof g.f.a.f.a) {
                Objects.requireNonNull((g.f.a.f.a) newInstance);
            }
            return newInstance;
        } catch (Exception e2) {
            StringBuilder i2 = g.a.a.a.a.i("Could not create object for ");
            i2.append(this.f4021h.getDeclaringClass());
            throw b.j(i2.toString(), e2);
        }
    }

    public i b(String str) {
        int i2 = 0;
        if (this.f4023j == null) {
            HashMap hashMap = new HashMap();
            for (i iVar : this.f4018e) {
                hashMap.put(((g.f.a.c.a) this.a).a(iVar.f3875d, true), iVar);
            }
            this.f4023j = hashMap;
        }
        i iVar2 = this.f4023j.get(((g.f.a.c.a) this.a).a(str, true));
        if (iVar2 != null) {
            return iVar2;
        }
        i[] iVarArr = this.f4018e;
        int length = iVarArr.length;
        while (i2 < length) {
            i iVar3 = iVarArr[i2];
            if (!iVar3.h().equals(str)) {
                i2++;
            } else {
                StringBuilder i3 = g.a.a.a.a.i("You should use columnName '");
                i3.append(iVar3.f3875d);
                i3.append("' for table ");
                i3.append(this.f4017d);
                i3.append(" instead of fieldName '");
                i3.append(iVar3.h());
                i3.append("'");
                throw new IllegalArgumentException(i3.toString());
            }
        }
        StringBuilder n = g.a.a.a.a.n("Unknown column name '", str, "' in table ");
        n.append(this.f4017d);
        throw new IllegalArgumentException(n.toString());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(g.f.a.h.c r5, g.f.a.b.a<T, ID> r6, java.lang.Class<T> r7) throws java.sql.SQLException {
        /*
            r4 = this;
            r0 = r5
            g.f.a.a.b r0 = (g.f.a.a.b) r0
            g.f.a.c.c r0 = r0.f3835e
            g.f.a.f.b r1 = g.f.a.i.b.f4013f
            r1 = r5
            g.f.a.a.b r1 = (g.f.a.a.b) r1
            g.f.a.c.c r1 = r1.f3835e
            java.lang.String r2 = g.f.a.i.b.c(r1, r7)
            java.util.Objects.requireNonNull(r1)
            g.f.a.i.b r3 = new g.f.a.i.b
            g.f.a.d.i[] r5 = g.f.a.i.b.b(r5, r7, r2)
            r3.<init>(r1, r7, r2, r5)
            r4.<init>((g.f.a.c.c) r0, r6, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.f.a.i.c.<init>(g.f.a.h.c, g.f.a.b.a, java.lang.Class):void");
    }
}
