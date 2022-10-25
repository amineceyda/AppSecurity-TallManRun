package g.i.a.a.h;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.tencent.assistant.alive.api.IKeepAliveService;
import com.tencent.raft.raftframework.RAFT;
import g.i.a.a.a.b;
import org.slf4j.Logger;

public class a extends Service {
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        g.i.a.a.m.a.a("AliveService", "AliveService onStartCommand");
        b c = ((IKeepAliveService) RAFT.get(IKeepAliveService.class)).c();
        if (!(c == null || c.b == null)) {
            Logger logger = g.g.a.a;
            String y = e.e.i.b.y();
            if (y == null) {
                y = "";
            }
            logger.debug("Process name:{}, onProcessCall: {}", (Object) y, (Object) "call_type_service");
        }
        super.onCreate();
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        return 1;
    }
}
