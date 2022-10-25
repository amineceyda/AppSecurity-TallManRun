package e.e.g;

import android.os.Handler;
import java.util.concurrent.Callable;

public class o<T> implements Runnable {
    public Callable<T> b;
    public e.e.i.a<T> c;

    /* renamed from: d  reason: collision with root package name */
    public Handler f1327d;

    public class a implements Runnable {
        public final /* synthetic */ e.e.i.a b;
        public final /* synthetic */ Object c;

        public a(o oVar, e.e.i.a aVar, Object obj) {
            this.b = aVar;
            this.c = obj;
        }

        public void run() {
            this.b.a(this.c);
        }
    }

    public o(Handler handler, Callable<T> callable, e.e.i.a<T> aVar) {
        this.b = callable;
        this.c = aVar;
        this.f1327d = handler;
    }

    public void run() {
        T t;
        try {
            t = this.b.call();
        } catch (Exception unused) {
            t = null;
        }
        this.f1327d.post(new a(this, this.c, t));
    }
}
