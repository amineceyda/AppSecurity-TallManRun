package g.c.a.b.a;

import android.os.Process;
import com.apkpure.aegon.app.activity.RestartActivity;

public final /* synthetic */ class i implements Runnable {
    public static final /* synthetic */ i b = new i();

    public final void run() {
        int i2 = RestartActivity.b;
        Process.killProcess(Process.myPid());
    }
}
