package j.a;

import i.j;
import i.m.f;
import i.o.b.l;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineExceptionHandler;

public interface y0 extends f.a {
    public static final a P = a.a;

    public static final class a implements f.b<y0> {
        public static final /* synthetic */ a a = new a();

        static {
            int i2 = CoroutineExceptionHandler.O;
        }
    }

    boolean a();

    i0 n(boolean z, boolean z2, l<? super Throwable, j> lVar);

    CancellationException o();

    void q(CancellationException cancellationException);

    boolean start();

    j x(l lVar);
}
