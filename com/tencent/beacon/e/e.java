package com.tencent.beacon.e;

public class e implements Runnable {
    public final /* synthetic */ g a;

    public e(g gVar) {
        this.a = gVar;
    }

    public void run() {
        if (this.a.c != null) {
            g gVar = this.a;
            gVar.a(gVar.c);
        }
    }
}
