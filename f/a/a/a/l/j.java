package f.a.a.a.l;

import e.e.f.b;
import g.a.a.a.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;

public class j implements d {

    /* renamed from: j  reason: collision with root package name */
    public static final Method f1665j;

    /* renamed from: k  reason: collision with root package name */
    public static final j[] f1666k = new j[0];

    /* renamed from: l  reason: collision with root package name */
    public static final i[] f1667l = new i[0];
    public Throwable a;
    public String b;
    public String c;

    /* renamed from: d  reason: collision with root package name */
    public i[] f1668d;

    /* renamed from: e  reason: collision with root package name */
    public int f1669e;

    /* renamed from: f  reason: collision with root package name */
    public j f1670f;

    /* renamed from: g  reason: collision with root package name */
    public j[] f1671g = f1666k;

    /* renamed from: h  reason: collision with root package name */
    public transient h f1672h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1673i;

    static {
        Method method;
        try {
            method = Throwable.class.getMethod("getSuppressed", new Class[0]);
        } catch (NoSuchMethodException unused) {
            method = null;
        }
        f1665j = method;
    }

    public j(Throwable th, Set<Throwable> set) {
        i[] iVarArr;
        this.f1673i = false;
        this.a = th;
        this.b = th.getClass().getName();
        this.c = th.getMessage();
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace == null) {
            iVarArr = new i[0];
        } else {
            int length = stackTrace.length;
            i[] iVarArr2 = new i[length];
            for (int i2 = 0; i2 < length; i2++) {
                iVarArr2[i2] = new i(stackTrace[i2]);
            }
            iVarArr = iVarArr2;
        }
        this.f1668d = iVarArr;
        if (set.contains(th)) {
            StringBuilder i3 = a.i("CIRCULAR REFERENCE:");
            i3.append(th.getClass().getName());
            this.b = i3.toString();
            this.f1668d = f1667l;
            return;
        }
        set.add(th);
        Throwable cause = th.getCause();
        if (cause != null) {
            j jVar = new j(cause, set);
            this.f1670f = jVar;
            jVar.f1669e = b.h(cause.getStackTrace(), this.f1668d);
        }
        Method method = f1665j;
        if (method != null) {
            try {
                Object invoke = method.invoke(th, new Object[0]);
                if (invoke instanceof Throwable[]) {
                    Throwable[] thArr = (Throwable[]) invoke;
                    if (thArr.length > 0) {
                        this.f1671g = new j[thArr.length];
                        for (int i4 = 0; i4 < thArr.length; i4++) {
                            this.f1671g[i4] = new j(thArr[i4], set);
                            this.f1671g[i4].f1669e = b.h(thArr[i4].getStackTrace(), this.f1668d);
                        }
                    }
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }
}
