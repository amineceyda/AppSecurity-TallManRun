package g.c.b.b.l;

import android.os.Handler;
import android.os.Message;

public class h extends Handler {
    public Handler a;

    public h(Handler handler) {
        this.a = handler;
    }

    public void handleMessage(Message message) {
        try {
            this.a.handleMessage(message);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
