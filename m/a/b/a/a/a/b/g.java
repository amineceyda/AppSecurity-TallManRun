package m.a.b.a.a.a.b;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipException;

public class g {
    public static final Map<k0, Class<?>> a = new ConcurrentHashMap();

    public static final class a {
        public static final a a = new a(2);

        public a(int i2) {
        }
    }

    static {
        c(b.class);
        c(y.class);
        c(z.class);
        c(j.class);
        c(o.class);
        c(n.class);
        c(a0.class);
        c(s.class);
        c(t.class);
        c(u.class);
        c(v.class);
        c(w.class);
        c(x.class);
    }

    public static g0 a(k0 k0Var) throws InstantiationException, IllegalAccessException {
        Class cls = a.get(k0Var);
        if (cls != null) {
            return (g0) cls.newInstance();
        }
        q qVar = new q();
        qVar.b = k0Var;
        return qVar;
    }

    public static g0[] b(byte[] bArr, boolean z, a aVar) throws ZipException {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            if (i2 > bArr.length - 4) {
                break;
            }
            k0 k0Var = new k0(bArr, i2);
            int c = new k0(bArr, i2 + 2).c();
            int i3 = i2 + 4;
            if (i3 + c > bArr.length) {
                p pVar = new p();
                if (z) {
                    pVar.g(bArr, i2, bArr.length - i2);
                } else {
                    pVar.e(bArr, i2, bArr.length - i2);
                }
                arrayList.add(pVar);
            } else {
                try {
                    g0 a2 = a(k0Var);
                    if (z) {
                        a2.g(bArr, i3, c);
                    } else {
                        a2.e(bArr, i3, c);
                    }
                    arrayList.add(a2);
                    i2 += c + 4;
                } catch (IllegalAccessException | InstantiationException e2) {
                    throw ((ZipException) new ZipException(e2.getMessage()).initCause(e2));
                }
            }
        }
        return (g0[]) arrayList.toArray(new g0[arrayList.size()]);
    }

    public static void c(Class<?> cls) {
        try {
            a.put(((g0) cls.newInstance()).a(), cls);
        } catch (ClassCastException unused) {
            throw new RuntimeException(cls + " doesn't implement ZipExtraField");
        } catch (InstantiationException unused2) {
            throw new RuntimeException(cls + " is not a concrete class");
        } catch (IllegalAccessException unused3) {
            throw new RuntimeException(cls + "'s no-arg constructor is not public");
        }
    }
}
