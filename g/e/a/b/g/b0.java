package g.e.a.b.g;

import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.RuntimeExecutionException;
import g.c.b.b.f;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

public final class b0<TResult> extends f<TResult> {
    public final Object a = new Object();
    public final y<TResult> b = new y<>();
    @GuardedBy("mLock")
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f3432d;
    @GuardedBy("mLock")

    /* renamed from: e  reason: collision with root package name */
    public TResult f3433e;
    @GuardedBy("mLock")

    /* renamed from: f  reason: collision with root package name */
    public Exception f3434f;

    public final f<TResult> a(Executor executor, b bVar) {
        this.b.a(new q(executor, bVar));
        q();
        return this;
    }

    public final f<TResult> b(Executor executor, c cVar) {
        this.b.a(new s(executor, cVar));
        q();
        return this;
    }

    public final f<TResult> c(Executor executor, d<? super TResult> dVar) {
        this.b.a(new u(executor, dVar));
        q();
        return this;
    }

    public final <TContinuationResult> f<TContinuationResult> d(a<TResult, TContinuationResult> aVar) {
        return e(h.a, aVar);
    }

    public final <TContinuationResult> f<TContinuationResult> e(Executor executor, a<TResult, TContinuationResult> aVar) {
        b0 b0Var = new b0();
        this.b.a(new m(executor, aVar, b0Var));
        q();
        return b0Var;
    }

    public final <TContinuationResult> f<TContinuationResult> f(Executor executor, a<TResult, f<TContinuationResult>> aVar) {
        b0 b0Var = new b0();
        this.b.a(new o(executor, aVar, b0Var));
        q();
        return b0Var;
    }

    public final Exception g() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f3434f;
        }
        return exc;
    }

    public final TResult h() {
        TResult tresult;
        synchronized (this.a) {
            f.r(this.c, "Task is not yet complete");
            if (!this.f3432d) {
                Exception exc = this.f3434f;
                if (exc == null) {
                    tresult = this.f3433e;
                } else {
                    throw new RuntimeExecutionException(exc);
                }
            } else {
                throw new CancellationException("Task is already canceled.");
            }
        }
        return tresult;
    }

    public final boolean i() {
        return this.f3432d;
    }

    public final boolean j() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    public final boolean k() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.c && !this.f3432d && this.f3434f == null) {
                z = true;
            }
        }
        return z;
    }

    public final <TContinuationResult> f<TContinuationResult> l(Executor executor, e<TResult, TContinuationResult> eVar) {
        b0 b0Var = new b0();
        this.b.a(new w(executor, eVar, b0Var));
        q();
        return b0Var;
    }

    public final void m(Exception exc) {
        f.o(exc, "Exception must not be null");
        synchronized (this.a) {
            p();
            this.c = true;
            this.f3434f = exc;
        }
        this.b.b(this);
    }

    public final void n(TResult tresult) {
        synchronized (this.a) {
            p();
            this.c = true;
            this.f3433e = tresult;
        }
        this.b.b(this);
    }

    public final boolean o() {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.f3432d = true;
            this.b.b(this);
            return true;
        }
    }

    @GuardedBy("mLock")
    public final void p() {
        Throwable th;
        String str;
        if (this.c) {
            int i2 = DuplicateTaskCompletionException.b;
            if (j()) {
                Exception g2 = g();
                if (g2 != null) {
                    str = "failure";
                } else if (k()) {
                    String valueOf = String.valueOf(h());
                    valueOf.length();
                    str = "result ".concat(valueOf);
                } else {
                    str = i() ? "cancellation" : "unknown issue";
                }
                th = new DuplicateTaskCompletionException(str.length() != 0 ? "Complete with: ".concat(str) : new String("Complete with: "), g2);
            } else {
                th = new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            throw th;
        }
    }

    public final void q() {
        synchronized (this.a) {
            if (this.c) {
                this.b.b(this);
            }
        }
    }
}
