package e.e.c.c;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import e.b.h.x;
import java.util.Objects;

public abstract class g {

    public class a implements Runnable {
        public final /* synthetic */ Typeface b;

        public a(Typeface typeface) {
            this.b = typeface;
        }

        public void run() {
            g.this.d(this.b);
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ int b;

        public b(int i2) {
            this.b = i2;
        }

        public void run() {
            Objects.requireNonNull((x.a) g.this);
        }
    }

    public static Handler c(Handler handler) {
        return handler == null ? new Handler(Looper.getMainLooper()) : handler;
    }

    public final void a(int i2, Handler handler) {
        c(handler).post(new b(i2));
    }

    public final void b(Typeface typeface, Handler handler) {
        c(handler).post(new a(typeface));
    }

    public abstract void d(Typeface typeface);
}
