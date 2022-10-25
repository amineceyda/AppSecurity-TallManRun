package g.f.a.b;

import g.f.a.e.c;
import g.f.a.e.d;
import java.lang.reflect.Constructor;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class h {
    public static Map<Class<?>, g.f.a.i.b<?>> a;
    public static Map<a, g<?, ?>> b;
    public static Map<b, g<?, ?>> c;

    /* renamed from: d  reason: collision with root package name */
    public static c f3853d = d.a(h.class);

    public static class a {
        public g.f.a.h.c a;
        public Class<?> b;

        public a(g.f.a.h.c cVar, Class<?> cls) {
            this.a = cVar;
            this.b = cls;
        }

        public boolean equals(Object obj) {
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.b.equals(aVar.b) && this.a.equals(aVar.a);
        }

        public int hashCode() {
            return this.a.hashCode() + ((this.b.hashCode() + 31) * 31);
        }
    }

    public static class b {
        public g.f.a.h.c a;
        public g.f.a.i.b<?> b;

        public b(g.f.a.h.c cVar, g.f.a.i.b<?> bVar) {
            this.a = cVar;
            this.b = bVar;
        }

        public boolean equals(Object obj) {
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.b.equals(bVar.b) && this.a.equals(bVar.a);
        }

        public int hashCode() {
            return this.a.hashCode() + ((this.b.hashCode() + 31) * 31);
        }
    }

    public static synchronized void a(Collection<g.f.a.i.b<?>> collection) {
        synchronized (h.class) {
            HashMap hashMap = a == null ? new HashMap() : new HashMap(a);
            for (g.f.a.i.b next : collection) {
                hashMap.put(next.a, next);
                f3853d.e("Loaded configuration for {}", next.a);
            }
            a = hashMap;
        }
    }

    public static synchronized <D extends g<T, ?>, T> D b(g.f.a.h.c cVar, Class<T> cls) throws SQLException {
        D d2;
        synchronized (h.class) {
            if (cVar != null) {
                D e2 = e(new a(cVar, cls));
                if (e2 != null) {
                    return e2;
                }
                Map<Class<?>, g.f.a.i.b<?>> map = a;
                D d3 = null;
                if (map != null) {
                    g.f.a.i.b bVar = map.get(cls);
                    if (bVar != null) {
                        d3 = c(cVar, bVar);
                    }
                }
                if (d3 != null) {
                    return d3;
                }
                g.f.a.i.a aVar = (g.f.a.i.a) cls.getAnnotation(g.f.a.i.a.class);
                if (!(aVar == null || aVar.daoClass() == Void.class)) {
                    if (aVar.daoClass() != a.class) {
                        Class daoClass = aVar.daoClass();
                        Object[] objArr = {cVar, cls};
                        Constructor d4 = d(daoClass, objArr);
                        if (d4 == null) {
                            objArr = new Object[]{cVar};
                            d4 = d(daoClass, objArr);
                            if (d4 == null) {
                                throw new SQLException("Could not find public constructor with ConnectionSource and optional Class parameters " + daoClass + ".  Missing static on class?");
                            }
                        }
                        try {
                            d2 = (g) d4.newInstance(objArr);
                            f3853d.b("created dao for class {} from constructor", cls);
                            f(cVar, d2);
                            return d2;
                        } catch (Exception e3) {
                            throw e.e.i.b.j("Could not call the constructor in class " + daoClass, e3);
                        }
                    }
                }
                g.f.a.i.b<T> c2 = ((g.f.a.c.d) ((g.f.a.a.b) cVar).f3835e).c(cVar, cls);
                if (c2 == null) {
                    ThreadLocal<List<a<?, ?>>> threadLocal = a.f3841j;
                    d2 = new b(cVar, cls);
                } else {
                    ThreadLocal<List<a<?, ?>>> threadLocal2 = a.f3841j;
                    d2 = new c(cVar, c2);
                }
                f3853d.b("created dao for class {} with reflection", cls);
                f(cVar, d2);
                return d2;
            }
            throw new IllegalArgumentException("connectionSource argument cannot be null");
        }
    }

    public static <D extends g<T, ?>, T> D c(g.f.a.h.c cVar, g.f.a.i.b<T> bVar) throws SQLException {
        D d2;
        b bVar2 = new b(cVar, bVar);
        if (c == null) {
            c = new HashMap();
        }
        D d3 = (g) c.get(bVar2);
        if (d3 == null) {
            d3 = null;
        }
        if (d3 != null) {
            return d3;
        }
        Class<T> cls = bVar.a;
        a aVar = new a(cVar, cls);
        D e2 = e(aVar);
        if (e2 != null) {
            if (c == null) {
                c = new HashMap();
            }
            c.put(bVar2, e2);
            return e2;
        }
        g.f.a.i.a aVar2 = (g.f.a.i.a) bVar.a.getAnnotation(g.f.a.i.a.class);
        if (aVar2 == null || aVar2.daoClass() == Void.class || aVar2.daoClass() == a.class) {
            ThreadLocal<List<a<?, ?>>> threadLocal = a.f3841j;
            d2 = new c(cVar, bVar);
        } else {
            Class daoClass = aVar2.daoClass();
            Object[] objArr = {cVar, bVar};
            Constructor d4 = d(daoClass, objArr);
            if (d4 != null) {
                try {
                    d2 = (g) d4.newInstance(objArr);
                } catch (Exception e3) {
                    throw e.e.i.b.j("Could not call the constructor in class " + daoClass, e3);
                }
            } else {
                throw new SQLException(g.a.a.a.a.v("Could not find public constructor with ConnectionSource, DatabaseTableConfig parameters in class ", daoClass));
            }
        }
        if (c == null) {
            c = new HashMap();
        }
        c.put(bVar2, d2);
        f3853d.b("created dao for class {} from table config", cls);
        if (e(aVar) == null) {
            if (b == null) {
                b = new HashMap();
            }
            b.put(aVar, d2);
        }
        return d2;
    }

    public static Constructor<?> d(Class<?> cls, Object[] objArr) {
        boolean z;
        for (Constructor<?> constructor : cls.getConstructors()) {
            Class[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length == objArr.length) {
                int i2 = 0;
                while (true) {
                    if (i2 >= parameterTypes.length) {
                        z = true;
                        break;
                    } else if (!parameterTypes[i2].isAssignableFrom(objArr[i2].getClass())) {
                        z = false;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z) {
                    return constructor;
                }
            }
        }
        return null;
    }

    public static <T> g<?, ?> e(a aVar) {
        if (b == null) {
            b = new HashMap();
        }
        g<?, ?> gVar = b.get(aVar);
        if (gVar == null) {
            return null;
        }
        return gVar;
    }

    public static synchronized void f(g.f.a.h.c cVar, g<?, ?> gVar) {
        synchronized (h.class) {
            if (cVar != null) {
                a aVar = new a(cVar, gVar.a());
                if (b == null) {
                    b = new HashMap();
                }
                b.put(aVar, gVar);
            } else {
                throw new IllegalArgumentException("connectionSource argument cannot be null");
            }
        }
    }
}
