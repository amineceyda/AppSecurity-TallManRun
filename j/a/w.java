package j.a;

import g.c.b.b.f;
import java.lang.Thread;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;

public final class w {
    public static final List<CoroutineExceptionHandler> a = f.s0(f.e(a.a()));

    public static final void a(i.m.f fVar, Throwable th) {
        Throwable th2;
        for (CoroutineExceptionHandler handleException : a) {
            try {
                handleException.handleException(fVar, th);
            } catch (Throwable th3) {
                Thread currentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
                if (th == th3) {
                    th2 = th;
                } else {
                    th2 = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    f.c(th2, th);
                }
                uncaughtExceptionHandler.uncaughtException(currentThread, th2);
            }
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
