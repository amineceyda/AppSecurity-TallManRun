package f.a.a.b.q.e;

import ch.qos.logback.core.joran.util.IntrospectionException;
import ch.qos.logback.core.util.PropertySetterException;
import e.e.f.b;
import f.a.a.b.q.d.c;
import f.a.a.b.q.d.h;
import g.a.a.a.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

public class d extends f.a.a.b.w.d {

    /* renamed from: e  reason: collision with root package name */
    public Object f1753e;

    /* renamed from: f  reason: collision with root package name */
    public Class<?> f1754f;

    /* renamed from: g  reason: collision with root package name */
    public c[] f1755g;

    /* renamed from: h  reason: collision with root package name */
    public b[] f1756h;

    public d(Object obj) {
        this.f1753e = obj;
        this.f1754f = obj.getClass();
    }

    public void A(Method method, Object obj) {
        Class<?> cls = obj.getClass();
        try {
            method.invoke(this.f1753e, new Object[]{obj});
        } catch (Exception e2) {
            StringBuilder i2 = a.i("Could not invoke method ");
            i2.append(method.getName());
            i2.append(" in class ");
            i2.append(this.f1753e.getClass().getName());
            i2.append(" with parameter of type ");
            i2.append(cls.getName());
            c(i2.toString(), e2);
        }
    }

    public final boolean B(String str, Class[] clsArr, Object obj) {
        StringBuilder sb;
        String str2;
        Class<?> cls = obj.getClass();
        if (clsArr.length != 1) {
            sb = a.n("Wrong number of parameters in setter method for property [", str, "] in ");
            str2 = this.f1753e.getClass().getName();
        } else if (clsArr[0].isAssignableFrom(obj.getClass())) {
            return true;
        } else {
            StringBuilder i2 = a.i("A \"");
            i2.append(cls.getName());
            i2.append("\" object is not assignable to a \"");
            i2.append(clsArr[0].getName());
            i2.append("\" variable.");
            m(i2.toString());
            m("The class \"" + clsArr[0].getName() + "\" was loaded by ");
            m("[" + clsArr[0].getClassLoader() + "] whereas object of type ");
            sb = new StringBuilder();
            sb.append("\"");
            sb.append(cls.getName());
            sb.append("\" was loaded by [");
            sb.append(cls.getClassLoader());
            str2 = "].";
        }
        sb.append(str2);
        m(sb.toString());
        return false;
    }

    public void C(String str, Object obj) {
        Class<?> cls;
        StringBuilder sb;
        c y = y(b.e(str));
        if (y == null) {
            sb = a.n("Could not find PropertyDescriptor for [", str, "] in ");
            cls = this.f1754f;
        } else {
            Method method = y.a;
            if (method == null) {
                sb = a.n("Not setter method for property [", str, "] in ");
                cls = this.f1753e.getClass();
            } else if (B(str, method.getParameterTypes(), obj)) {
                try {
                    A(method, obj);
                    return;
                } catch (Exception e2) {
                    StringBuilder i2 = a.i("Could not set component ");
                    i2.append(this.f1753e);
                    i2.append(" for parent component ");
                    i2.append(this.f1753e);
                    c(i2.toString(), e2);
                    return;
                }
            } else {
                return;
            }
        }
        sb.append(cls.getName());
        p(sb.toString());
    }

    public void D(c cVar, String str, String str2) throws PropertySetterException {
        Method method = cVar.a;
        if (method != null) {
            Class[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 1) {
                try {
                    Object a = e.a(this, str2, parameterTypes[0]);
                    if (a != null) {
                        try {
                            method.invoke(this.f1753e, new Object[]{a});
                        } catch (Exception e2) {
                            throw new PropertySetterException((Throwable) e2);
                        }
                    } else {
                        StringBuilder i2 = a.i("Conversion to type [");
                        i2.append(parameterTypes[0]);
                        i2.append("] failed.");
                        throw new PropertySetterException(i2.toString());
                    }
                } catch (Throwable th) {
                    StringBuilder i3 = a.i("Conversion to type [");
                    i3.append(parameterTypes[0]);
                    i3.append("] failed. ");
                    throw new PropertySetterException(i3.toString(), th);
                }
            } else {
                throw new PropertySetterException("#params for setter != 1");
            }
        } else {
            throw new PropertySetterException(a.c("No setter for property [", str, "]."));
        }
    }

    public void E(String str, String str2) {
        if (str2 != null) {
            String e2 = b.e(str);
            c y = y(e2);
            if (y == null) {
                StringBuilder n = a.n("No such property [", e2, "] in ");
                n.append(this.f1754f.getName());
                n.append(".");
                p(n.toString());
                return;
            }
            try {
                D(y, e2, str2);
            } catch (PropertySetterException e3) {
                q(a.d("Failed to set property [", e2, "] to value \"", str2, "\". "), e3);
            }
        }
    }

    public final String s(String str) {
        return str.substring(0, 1).toUpperCase(Locale.US) + str.substring(1);
    }

    public f.a.a.b.z.a t(String str) {
        f.a.a.b.z.a aVar = f.a.a.b.z.a.NOT_FOUND;
        Method v = v(str);
        if (v != null) {
            f.a.a.b.z.a u = u(v);
            int ordinal = u.ordinal();
            if (ordinal == 0) {
                return aVar;
            }
            if (ordinal == 1) {
                return f.a.a.b.z.a.AS_BASIC_PROPERTY_COLLECTION;
            }
            if (ordinal == 2) {
                return f.a.a.b.z.a.AS_COMPLEX_PROPERTY_COLLECTION;
            }
            if (ordinal == 3 || ordinal == 4) {
                m("Unexpected AggregationType " + u);
            }
        }
        c y = y(b.e(str));
        Method method = y != null ? y.a : null;
        return method != null ? u(method) : aVar;
    }

    public final f.a.a.b.z.a u(Method method) {
        Class<?> x = x(method);
        if (x == null) {
            return f.a.a.b.z.a.NOT_FOUND;
        }
        Package packageR = x.getPackage();
        boolean z = true;
        if (!x.isPrimitive() && ((packageR == null || !"java.lang".equals(packageR.getName())) && !e.b(x) && !x.isEnum() && !Charset.class.isAssignableFrom(x))) {
            z = false;
        }
        return z ? f.a.a.b.z.a.AS_BASIC_PROPERTY : f.a.a.b.z.a.AS_COMPLEX_PROPERTY;
    }

    public final Method v(String str) {
        String w = a.w("add", s(str));
        if (this.f1756h == null) {
            z();
        }
        int i2 = 0;
        while (true) {
            b[] bVarArr = this.f1756h;
            if (i2 >= bVarArr.length) {
                return null;
            }
            if (w.equals(bVarArr[i2].a)) {
                return this.f1756h[i2].b;
            }
            i2++;
        }
    }

    public Class<?> w(String str, f.a.a.b.z.a aVar, f.a.a.b.q.d.d dVar) {
        Class<?> cls;
        Method method;
        Class cls2 = this.f1753e.getClass();
        Objects.requireNonNull(dVar);
        String lowerCase = str.toLowerCase(Locale.US);
        while (true) {
            if (cls2 == null) {
                cls = null;
                break;
            }
            cls = dVar.a.get(new h(cls2, lowerCase));
            if (cls != null) {
                break;
            }
            cls2 = cls2.getSuperclass();
        }
        if (cls != null) {
            return cls;
        }
        String s = s(str);
        if (aVar == f.a.a.b.z.a.AS_COMPLEX_PROPERTY_COLLECTION) {
            method = v(s);
        } else if (aVar == f.a.a.b.z.a.AS_COMPLEX_PROPERTY) {
            c y = y(b.e(s));
            method = y != null ? y.a : null;
        } else {
            throw new IllegalStateException(aVar + " not allowed here");
        }
        if (method == null) {
            return null;
        }
        c cVar = (c) method.getAnnotation(c.class);
        Class<?> value = cVar != null ? cVar.value() : null;
        if (value != null) {
            return value;
        }
        Class<?> x = x(method);
        if (x == null) {
            return null;
        }
        boolean z = false;
        if (!x.isInterface()) {
            try {
                if (x.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]) != null) {
                    z = true;
                }
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        if (z) {
            return x;
        }
        return null;
    }

    public final Class<?> x(Method method) {
        if (method == null) {
            return null;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length != 1) {
            return null;
        }
        return parameterTypes[0];
    }

    public c y(String str) {
        if (this.f1755g == null) {
            z();
        }
        int i2 = 0;
        while (true) {
            c[] cVarArr = this.f1755g;
            if (i2 >= cVarArr.length) {
                return null;
            }
            if (str.equals(cVarArr[i2].b)) {
                return this.f1755g[i2];
            }
            i2++;
        }
    }

    public void z() {
        try {
            this.f1755g = b.n(this.f1754f);
            Class<?> cls = this.f1754f;
            ArrayList arrayList = new ArrayList();
            for (Method method : cls.getMethods()) {
                arrayList.add(new b(method.getName(), method));
            }
            this.f1756h = (b[]) arrayList.toArray(new b[0]);
        } catch (IntrospectionException e2) {
            StringBuilder i2 = a.i("Failed to introspect ");
            i2.append(this.f1753e);
            i2.append(": ");
            i2.append(e2.getMessage());
            m(i2.toString());
            this.f1755g = new c[0];
            this.f1756h = new b[0];
        }
    }
}
