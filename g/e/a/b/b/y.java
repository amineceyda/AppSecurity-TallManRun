package g.e.a.b.b;

import java.util.concurrent.Callable;

public final class y extends z {

    /* renamed from: e  reason: collision with root package name */
    public final Callable<String> f2876e;

    public /* synthetic */ y(Callable callable) {
        super(false, (String) null, (Throwable) null);
        this.f2876e = callable;
    }

    public final String a() {
        try {
            return this.f2876e.call();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
