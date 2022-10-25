package g.e.a.b.g;

import java.util.concurrent.Executor;

public final class m<TResult, TContinuationResult> implements x<TResult> {
    public final Executor a;
    public final a<TResult, TContinuationResult> b;
    public final b0<TContinuationResult> c;

    public m(Executor executor, a<TResult, TContinuationResult> aVar, b0<TContinuationResult> b0Var) {
        this.a = executor;
        this.b = aVar;
        this.c = b0Var;
    }

    public final void b(f<TResult> fVar) {
        this.a.execute(new l(this, fVar));
    }
}
