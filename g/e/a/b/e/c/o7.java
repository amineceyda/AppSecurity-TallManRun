package g.e.a.b.e.c;

import g.e.a.b.b.h.e;
import g.e.a.b.e.c.l7;
import g.e.a.b.e.c.o7;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class o7<MessageType extends o7<MessageType, BuilderType>, BuilderType extends l7<MessageType, BuilderType>> extends h6<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    public m9 zzc = m9.f3001f;
    public int zzd = -1;

    public static Object j(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    public static void k(Class cls, o7 o7Var) {
        zza.put(cls, o7Var);
    }

    public static o7 o(Class cls) {
        Map map = zza;
        o7 o7Var = (o7) map.get(cls);
        if (o7Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                o7Var = (o7) map.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (o7Var == null) {
            o7Var = (o7) ((o7) v9.i(cls)).r(6, (Object) null, (Object) null);
            if (o7Var != null) {
                map.put(cls, o7Var);
            } else {
                throw new IllegalStateException();
            }
        }
        return o7Var;
    }

    public static t7 p(t7 t7Var) {
        d8 d8Var = (d8) t7Var;
        int i2 = d8Var.f2916d;
        return d8Var.o(i2 == 0 ? 10 : i2 + i2);
    }

    public static u7 q(u7 u7Var) {
        int size = u7Var.size();
        return u7Var.o(size == 0 ? 10 : size + size);
    }

    public final /* synthetic */ g6 a() {
        return (l7) r(5, (Object) null, (Object) null);
    }

    public final /* synthetic */ g6 b() {
        l7 l7Var = (l7) r(5, (Object) null, (Object) null);
        l7Var.h(this);
        return l7Var;
    }

    public final /* synthetic */ o8 c() {
        return (o7) r(6, (Object) null, (Object) null);
    }

    public final int e() {
        int i2 = this.zzd;
        if (i2 != -1) {
            return i2;
        }
        int e2 = v8.c.a(getClass()).e(this);
        this.zzd = e2;
        return e2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return v8.c.a(getClass()).g(this, (o7) obj);
        }
        return false;
    }

    public final int f() {
        return this.zzd;
    }

    public final void h(int i2) {
        this.zzd = i2;
    }

    public final int hashCode() {
        int i2 = this.zzb;
        if (i2 != 0) {
            return i2;
        }
        int i3 = v8.c.a(getClass()).i(this);
        this.zzb = i3;
        return i3;
    }

    public final void l(x6 x6Var) throws IOException {
        y8 a = v8.c.a(getClass());
        y6 y6Var = x6Var.a;
        if (y6Var == null) {
            y6Var = new y6(x6Var);
        }
        a.h(this, y6Var);
    }

    public final l7 m() {
        return (l7) r(5, (Object) null, (Object) null);
    }

    public final l7 n() {
        l7 l7Var = (l7) r(5, (Object) null, (Object) null);
        l7Var.h(this);
        return l7Var;
    }

    public abstract Object r(int i2, Object obj, Object obj2);

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        e.Q(this, sb, 0);
        return sb.toString();
    }
}
