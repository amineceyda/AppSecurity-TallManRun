package g.c.c;

import android.os.Process;
import org.slf4j.Logger;

public final /* synthetic */ class d implements g.c.a.m.d {
    public static final /* synthetic */ d a = new d();

    public final void a() {
        Logger logger = l.a;
        if (!g.c.a.g.a.o.d.b) {
            l.a.info("直接杀死杀死进程.");
            g.c.a.g.a.o.d.a.info("killProcess");
            Process.killProcess(Process.myPid());
            System.exit(1);
        }
    }
}
