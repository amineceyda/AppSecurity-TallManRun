package g.c.a.g.a.o;

import android.os.Process;

public final /* synthetic */ class b implements Runnable {
    public static final /* synthetic */ b b = new b();

    public final void run() {
        d.a.info("killProcess");
        Process.killProcess(Process.myPid());
        System.exit(1);
    }
}
