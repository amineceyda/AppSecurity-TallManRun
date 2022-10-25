package j.a;

public final class n1 {
    public static final ThreadLocal<l0> a = new ThreadLocal<>();
    public static final n1 b = null;

    public static final l0 a() {
        ThreadLocal<l0> threadLocal = a;
        l0 l0Var = threadLocal.get();
        if (l0Var != null) {
            return l0Var;
        }
        c cVar = new c(Thread.currentThread());
        threadLocal.set(cVar);
        return cVar;
    }
}
