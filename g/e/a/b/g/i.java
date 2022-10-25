package g.e.a.b.g;

import java.util.concurrent.CountDownLatch;

public final class i implements j {
    public final CountDownLatch a = new CountDownLatch(1);

    public final void a() {
        this.a.countDown();
    }

    public final void c(Object obj) {
        this.a.countDown();
    }

    public final void d(Exception exc) {
        this.a.countDown();
    }
}
