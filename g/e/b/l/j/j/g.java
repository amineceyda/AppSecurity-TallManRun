package g.e.b.l.j.j;

import g.e.a.b.g.a;
import g.e.a.b.g.f;
import java.util.concurrent.CountDownLatch;

public final /* synthetic */ class g implements a {
    public final /* synthetic */ CountDownLatch a;

    public /* synthetic */ g(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    public final Object a(f fVar) {
        this.a.countDown();
        return null;
    }
}
