package com.tencent.beacon.a.b;

import com.tencent.beacon.base.util.c;
import com.tencent.beacon.base.util.e;

public class h implements Runnable {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ i b;

    public h(i iVar, Runnable runnable) {
        this.b = iVar;
        this.a = runnable;
    }

    public void run() {
        try {
            this.a.run();
        } catch (Throwable th) {
            if (i.f575e.addAndGet(1) < 100) {
                g.e().a("599", "[task] run occur error!", th);
            }
            e.a(th.getMessage());
            c.a(th);
        }
    }
}
