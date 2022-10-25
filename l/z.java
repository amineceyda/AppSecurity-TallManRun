package l;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class z {

    /* renamed from: d  reason: collision with root package name */
    public static final z f4990d = new a();
    public boolean a;
    public long b;
    public long c;

    public class a extends z {
        public z d(long j2) {
            return this;
        }

        public void f() throws IOException {
        }

        public z g(long j2, TimeUnit timeUnit) {
            return this;
        }
    }

    public z a() {
        this.a = false;
        return this;
    }

    public z b() {
        this.c = 0;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline");
    }

    public z d(long j2) {
        this.a = true;
        this.b = j2;
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public void f() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public z g(long j2, TimeUnit timeUnit) {
        if (j2 < 0) {
            throw new IllegalArgumentException(g.a.a.a.a.s("timeout < 0: ", j2));
        } else if (timeUnit != null) {
            this.c = timeUnit.toNanos(j2);
            return this;
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }
}
