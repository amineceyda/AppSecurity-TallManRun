package k.h0.j;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import k.v;

public final class c extends f {
    public final Method c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f4886d;

    public c(Method method, Method method2) {
        this.c = method;
        this.f4886d = method2;
    }

    public void f(SSLSocket sSLSocket, String str, List<v> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> b = f.b(list);
            ArrayList arrayList = (ArrayList) b;
            this.c.invoke(sSLParameters, new Object[]{arrayList.toArray(new String[arrayList.size()])});
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw k.h0.c.a("unable to set ssl parameters", e2);
        }
    }

    @Nullable
    public String i(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f4886d.invoke(sSLSocket, new Object[0]);
            if (str == null || str.equals("")) {
                return null;
            }
            return str;
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw k.h0.c.a("unable to get selected protocols", e2);
        }
    }
}
