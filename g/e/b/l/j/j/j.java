package g.e.b.l.j.j;

import android.os.Process;

public abstract class j implements Runnable {
    public abstract void a();

    public final void run() {
        Process.setThreadPriority(10);
        a();
    }
}
