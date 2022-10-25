package com.ola.qsea.p;

import com.ola.qsea.sdk.IAsyncQseaListener;
import com.ola.qsea.sdk.Qsea;

public class l implements Runnable {
    public final /* synthetic */ IAsyncQseaListener a;
    public final /* synthetic */ o b;

    public l(o oVar, IAsyncQseaListener iAsyncQseaListener) {
        this.b = oVar;
        this.a = iAsyncQseaListener;
    }

    public void run() {
        Qsea qsea = this.b.getQsea();
        if (qsea == null || qsea.isEmpty()) {
            this.b.a(this.a);
        } else {
            this.a.onQseaDispatch(qsea);
        }
    }
}
