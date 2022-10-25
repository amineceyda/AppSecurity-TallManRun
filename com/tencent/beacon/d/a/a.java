package com.tencent.beacon.d.a;

import com.tencent.beacon.a.c.b;
import com.tencent.beacon.a.c.e;
import com.tencent.beacon.a.c.g;

public class a implements Runnable {
    public final /* synthetic */ c a;

    public a(c cVar) {
        this.a = cVar;
    }

    public void run() {
        e l2 = e.l();
        g e2 = g.e();
        this.a.f653g.put("A19", l2.q());
        this.a.f653g.put("A85", b.f583d ? "Y" : "N");
        this.a.f653g.put("A20", e2.j());
        this.a.f653g.put("A69", e2.k());
        this.a.f654h.b(this.a.f653g);
    }
}
