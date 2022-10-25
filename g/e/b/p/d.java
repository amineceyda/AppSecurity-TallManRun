package g.e.b.p;

import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class d implements ThreadFactory {
    public static final /* synthetic */ d a = new d();

    public final Thread newThread(Runnable runnable) {
        int i2 = g.f3725f;
        return new Thread(runnable, "heartbeat-information-executor");
    }
}
