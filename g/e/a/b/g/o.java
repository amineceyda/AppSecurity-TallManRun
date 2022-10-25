package g.e.a.b.g;

import java.util.concurrent.Executor;

public final class o<TResult, TContinuationResult> implements d<TContinuationResult>, c, b, x {
    public final Executor a;
    public final a<TResult, f<TContinuationResult>> b;
    public final b0<TContinuationResult> c;

    public o(Executor executor, a<TResult, f<TContinuationResult>> aVar, b0<TContinuationResult> b0Var) {
        this.a = executor;
        this.b = aVar;
        this.c = b0Var;
    }

    public final void a() {
        this.c.o();
    }

    public final void b(f<TResult> fVar) {
        this.a.execute(new n(this, fVar));
    }

    public final void c(TContinuationResult tcontinuationresult) {
        this.c.n(tcontinuationresult);
    }

    public final void d(Exception exc) {
        this.c.m(exc);
    }
}
