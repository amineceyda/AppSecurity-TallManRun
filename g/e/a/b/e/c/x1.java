package g.e.a.b.e.c;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class x1 implements ThreadFactory {
    public final ThreadFactory a = Executors.defaultThreadFactory();

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
