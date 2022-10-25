package l;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class l extends z {

    /* renamed from: e  reason: collision with root package name */
    public z f4972e;

    public l(z zVar) {
        if (zVar != null) {
            this.f4972e = zVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public z a() {
        return this.f4972e.a();
    }

    public z b() {
        return this.f4972e.b();
    }

    public long c() {
        return this.f4972e.c();
    }

    public z d(long j2) {
        return this.f4972e.d(j2);
    }

    public boolean e() {
        return this.f4972e.e();
    }

    public void f() throws IOException {
        this.f4972e.f();
    }

    public z g(long j2, TimeUnit timeUnit) {
        return this.f4972e.g(j2, timeUnit);
    }
}
