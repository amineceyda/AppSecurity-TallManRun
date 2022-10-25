package g.d.a.r;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class e {
    public static final Executor a = new a();
    public static final Executor b = new b();

    public class a implements Executor {
        public final Handler b = new Handler(Looper.getMainLooper());

        public void execute(Runnable runnable) {
            this.b.post(runnable);
        }
    }

    public class b implements Executor {
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }
}
