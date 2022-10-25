package g.e.a.b.f.b;

import java.lang.Thread;

public final class h4 implements Thread.UncaughtExceptionHandler {
    public final String a;
    public final /* synthetic */ k4 b;

    public h4(k4 k4Var, String str) {
        this.b = k4Var;
        this.a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.b.a.d().f3136f.b(this.a, th);
    }
}
