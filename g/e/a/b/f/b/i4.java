package g.e.a.b.f.b;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public final class i4 extends FutureTask implements Comparable {
    public final long b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final String f3196d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ k4 f3197e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i4(k4 k4Var, Runnable runnable, boolean z, String str) {
        super(runnable, (Object) null);
        this.f3197e = k4Var;
        long andIncrement = k4.f3220k.getAndIncrement();
        this.b = andIncrement;
        this.f3196d = str;
        this.c = z;
        if (andIncrement == Long.MAX_VALUE) {
            k4Var.a.d().f3136f.a("Tasks index overflow");
        }
    }

    public final int compareTo(Object obj) {
        i4 i4Var = (i4) obj;
        boolean z = this.c;
        if (z != i4Var.c) {
            return !z ? 1 : -1;
        }
        long j2 = this.b;
        long j3 = i4Var.b;
        if (j2 < j3) {
            return -1;
        }
        if (j2 > j3) {
            return 1;
        }
        this.f3197e.a.d().f3137g.b("Two tasks share the same index. index", Long.valueOf(this.b));
        return 0;
    }

    public final void setException(Throwable th) {
        this.f3197e.a.d().f3136f.b(this.f3196d, th);
        super.setException(th);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i4(k4 k4Var, Callable callable, boolean z) {
        super(callable);
        this.f3197e = k4Var;
        long andIncrement = k4.f3220k.getAndIncrement();
        this.b = andIncrement;
        this.f3196d = "Task exception on worker thread";
        this.c = z;
        if (andIncrement == Long.MAX_VALUE) {
            k4Var.a.d().f3136f.a("Tasks index overflow");
        }
    }
}
