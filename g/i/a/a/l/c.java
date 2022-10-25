package g.i.a.a.l;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.Map;

public class c {
    public Handler a = null;
    public Map<Integer, a> b = new HashMap();

    public static class a {
        public static c a = new c((b) null);
    }

    public c(b bVar) {
        HandlerThread handlerThread = new HandlerThread("timer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        if (looper != null) {
            this.a = new b(this, looper);
        }
    }

    public void a(a aVar) {
        int f2 = aVar.f();
        if (this.b.get(Integer.valueOf(f2)) == null) {
            g.i.a.a.m.a.a("TimerThread", String.format("addJob name is %s", new Object[]{aVar.getName()}));
            this.b.put(Integer.valueOf(f2), aVar);
            Handler handler = this.a;
            if (handler != null) {
                this.a.sendMessage(handler.obtainMessage(f2, 0, 0, aVar));
            }
        }
    }
}
