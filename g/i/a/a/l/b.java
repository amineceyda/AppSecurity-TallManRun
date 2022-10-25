package g.i.a.a.l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public class b extends Handler {
    public final /* synthetic */ c a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(c cVar, Looper looper) {
        super(looper);
        this.a = cVar;
    }

    public void handleMessage(Message message) {
        int i2 = message.what;
        a aVar = (a) message.obj;
        aVar.v();
        c cVar = this.a;
        cVar.a.sendMessageDelayed(cVar.a.obtainMessage(i2, 0, 0, aVar), aVar.X());
    }
}
