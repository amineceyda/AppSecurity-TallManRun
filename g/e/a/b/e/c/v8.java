package g.e.a.b.e.c;

import java.nio.charset.Charset;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class v8 {
    public static final v8 c = new v8();
    public final z8 a = new g8();
    public final ConcurrentMap b = new ConcurrentHashMap();

    public final y8 a(Class cls) {
        j8 j8Var;
        c7 c7Var;
        l9 l9Var;
        c8 c8Var;
        s8 s8Var;
        j8 j8Var2;
        l9 l9Var2;
        c8 c8Var2;
        s8 s8Var2;
        r8 r8Var;
        Class cls2;
        Charset charset = v7.a;
        Objects.requireNonNull(cls, "messageType");
        y8 y8Var = (y8) this.b.get(cls);
        if (y8Var == null) {
            g8 g8Var = (g8) this.a;
            Objects.requireNonNull(g8Var);
            Class<o7> cls3 = o7.class;
            Class cls4 = a9.a;
            if (cls3.isAssignableFrom(cls) || (cls2 = a9.a) == null || cls2.isAssignableFrom(cls)) {
                l8 a2 = g8Var.a.a(cls);
                boolean j2 = a2.j();
                boolean isAssignableFrom = cls3.isAssignableFrom(cls);
                if (j2) {
                    if (isAssignableFrom) {
                        l9 l9Var3 = a9.f2885d;
                        c7 c7Var2 = e7.a;
                        r8Var = new r8(l9Var3, e7.a, a2.c());
                    } else {
                        l9 l9Var4 = a9.b;
                        c7 c7Var3 = e7.b;
                        if (c7Var3 != null) {
                            r8Var = new r8(l9Var4, c7Var3, a2.c());
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    y8Var = r8Var;
                } else {
                    boolean z = false;
                    c7 c7Var4 = null;
                    if (isAssignableFrom) {
                        if (a2.k() == 1) {
                            z = true;
                        }
                        if (z) {
                            s8Var2 = t8.b;
                            c8Var2 = c8.b;
                            l9Var2 = a9.f2885d;
                            c7 c7Var5 = e7.a;
                            c7Var4 = e7.a;
                        } else {
                            s8Var2 = t8.b;
                            c8Var2 = c8.b;
                            l9Var2 = a9.f2885d;
                        }
                        j8Var2 = k8.b;
                    } else {
                        if (a2.k() == 1) {
                            z = true;
                        }
                        if (z) {
                            s8 s8Var3 = t8.a;
                            c8 c8Var3 = c8.a;
                            l9 l9Var5 = a9.b;
                            c7 c7Var6 = e7.b;
                            if (c7Var6 != null) {
                                j8Var = k8.a;
                                c7Var = c7Var6;
                                s8Var = s8Var3;
                                l9Var = l9Var5;
                                c8Var = c8Var3;
                                y8Var = q8.C(a2, s8Var, c8Var, l9Var, c7Var, j8Var);
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        } else {
                            s8Var2 = t8.a;
                            c8Var2 = c8.a;
                            l9Var2 = a9.c;
                            j8Var2 = k8.a;
                        }
                    }
                    c7Var = c7Var4;
                    j8Var = j8Var2;
                    c8Var = c8Var2;
                    l9Var = l9Var2;
                    s8Var = s8Var2;
                    y8Var = q8.C(a2, s8Var, c8Var, l9Var, c7Var, j8Var);
                }
                y8 y8Var2 = (y8) this.b.putIfAbsent(cls, y8Var);
                return y8Var2 == null ? y8Var : y8Var2;
            }
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }
}
