package g.e.a.b.g;

import java.util.concurrent.Executor;

public final class w<TResult, TContinuationResult> implements d<TContinuationResult>, c, b, x {
    public final Executor a;
    public final e<TResult, TContinuationResult> b;
    public final b0<TContinuationResult> c;

    public w(Executor executor, e<TResult, TContinuationResult> eVar, b0<TContinuationResult> b0Var) {
        this.a = executor;
        this.b = eVar;
        this.c = b0Var;
    }

    public final void a() {
        this.c.o();
    }

    public final void b(f<TResult> fVar) {
        this.a.execute(new v(this, fVar));
    }

    public final void c(TContinuationResult tcontinuationresult) {
        this.c.n(tcontinuationresult);
    }

    public final void d(Exception exc) {
        this.c.m(exc);
    }
}
