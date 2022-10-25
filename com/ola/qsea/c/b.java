package com.ola.qsea.c;

import com.ola.qsea.l.g;
import com.ola.qsea.m.a;

public class b implements Runnable {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ c b;

    public b(c cVar, Runnable runnable) {
        this.b = cVar;
        this.a = runnable;
    }

    public void run() {
        try {
            this.a.run();
        } catch (Throwable th) {
            g.a(th.getMessage());
            a.a(th);
        }
    }
}
