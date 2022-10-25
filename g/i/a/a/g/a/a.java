package g.i.a.a.g.a;

import android.util.Log;
import com.tencent.assistant.alive.log.IXLogService;
import com.tencent.raft.raftannotation.RServiceImpl;

@RServiceImpl(bindInterface = {IXLogService.class})
public class a implements IXLogService {
    public void a(String str, int i2, String str2, String str3, Throwable th) {
        String str4 = "processFlag: " + str2 + ", " + str3;
        if (i2 == 2) {
            Log.v(str, str4, th);
        } else if (i2 == 3) {
            Log.d(str, str4, th);
        } else if (i2 == 4) {
            Log.i(str, str4, th);
        } else if (i2 == 5) {
            Log.w(str, str4, th);
        } else if (i2 == 6) {
            Log.e(str, str4, th);
        }
    }

    public void b(Throwable th) {
        if (th != null) {
            th.printStackTrace();
        }
    }
}
