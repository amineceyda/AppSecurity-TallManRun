package g.e.a.b.g;

import java.util.concurrent.Executor;

public abstract class f<TResult> {
    public f<TResult> a(Executor executor, b bVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public abstract f<TResult> b(Executor executor, c cVar);

    public abstract f<TResult> c(Executor executor, d<? super TResult> dVar);

    public <TContinuationResult> f<TContinuationResult> d(a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> f<TContinuationResult> e(Executor executor, a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> f<TContinuationResult> f(Executor executor, a<TResult, f<TContinuationResult>> aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception g();

    public abstract TResult h();

    public abstract boolean i();

    public abstract boolean j();

    public abstract boolean k();

    public <TContinuationResult> f<TContinuationResult> l(Executor executor, e<TResult, TContinuationResult> eVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
