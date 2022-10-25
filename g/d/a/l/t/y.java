package g.d.a.l.t;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public class y {
    public boolean a;
    public final Handler b = new Handler(Looper.getMainLooper(), new a());

    public static final class a implements Handler.Callback {
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((v) message.obj).d();
            return true;
        }
    }

    public synchronized void a(v<?> vVar, boolean z) {
        if (!this.a) {
            if (!z) {
                this.a = true;
                vVar.d();
                this.a = false;
            }
        }
        this.b.obtainMessage(1, vVar).sendToTarget();
    }
}
