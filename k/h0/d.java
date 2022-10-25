package k.h0;

import java.util.concurrent.ThreadFactory;

public class d implements ThreadFactory {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;

    public d(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.a);
        thread.setDaemon(this.b);
        return thread;
    }
}
