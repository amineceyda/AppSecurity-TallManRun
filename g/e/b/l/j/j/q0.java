package g.e.b.l.j.j;

import android.os.Looper;
import g.e.a.b.b.h.e;
import g.e.a.b.g.f;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class q0 {
    public static final ExecutorService a = e.c("awaitEvenIfOnMainThread task continuation executor");

    public static <T> T a(f<T> fVar) throws InterruptedException, TimeoutException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        fVar.e(a, new g(countDownLatch));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(4, TimeUnit.SECONDS);
        } else {
            countDownLatch.await();
        }
        if (fVar.k()) {
            return fVar.h();
        }
        if (fVar.i()) {
            throw new CancellationException("Task is already canceled");
        } else if (fVar.j()) {
            throw new IllegalStateException(fVar.g());
        } else {
            throw new TimeoutException();
        }
    }
}
