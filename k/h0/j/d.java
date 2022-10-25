package k.h0.j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;
import k.h0.c;
import k.v;

public class d extends f {
    public final Method c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f4887d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f4888e;

    /* renamed from: f  reason: collision with root package name */
    public final Class<?> f4889f;

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f4890g;

    public static class a implements InvocationHandler {
        public final List<String> a;
        public boolean b;
        public String c;

        public a(List<String> list) {
            this.a = list;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            Object obj2;
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = c.b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.b = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.a;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            obj2 = this.a.get(0);
                            break;
                        } else if (this.a.contains(list.get(i2))) {
                            obj2 = list.get(i2);
                            break;
                        } else {
                            i2++;
                        }
                    }
                    String str = (String) obj2;
                    this.c = str;
                    return str;
                } else if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                } else {
                    this.c = (String) objArr[0];
                    return null;
                }
            }
        }
    }

    public d(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.c = method;
        this.f4887d = method2;
        this.f4888e = method3;
        this.f4889f = cls;
        this.f4890g = cls2;
    }

    public void a(SSLSocket sSLSocket) {
        try {
            this.f4888e.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw c.a("unable to remove alpn", e2);
        }
    }

    public void f(SSLSocket sSLSocket, String str, List<v> list) {
        List<String> b = f.b(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(f.class.getClassLoader(), new Class[]{this.f4889f, this.f4890g}, new a(b));
            this.c.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw c.a("unable to set alpn", e2);
        }
    }

    @Nullable
    public String i(SSLSocket sSLSocket) {
        try {
            a aVar = (a) Proxy.getInvocationHandler(this.f4887d.invoke((Object) null, new Object[]{sSLSocket}));
            boolean z = aVar.b;
            if (!z && aVar.c == null) {
                f.a.l(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            } else if (z) {
                return null;
            } else {
                return aVar.c;
            }
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw c.a("unable to get selected protocol", e2);
        }
    }
}
