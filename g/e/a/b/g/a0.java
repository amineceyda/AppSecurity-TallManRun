package g.e.a.b.g;

import android.os.Handler;
import android.os.Looper;
import g.e.a.b.e.d.a;
import java.util.concurrent.Executor;

public final class a0 implements Executor {
    public final Handler b = new a(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.b.post(runnable);
    }
}
