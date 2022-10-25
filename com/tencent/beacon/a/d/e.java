package com.tencent.beacon.a.d;

import com.tencent.beacon.a.b.g;

public class e implements Runnable {
    public final /* synthetic */ g a;

    public e(g gVar) {
        this.a = gVar;
    }

    public void run() {
        try {
            synchronized (this.a.a) {
                byte[] a2 = g.a(this.a.c.toString().getBytes("ISO8859-1"));
                if (a2 != null) {
                    if (((long) (a2.length + 10)) > this.a.f616e) {
                        long unused = this.a.f616e = (long) (a2.length + 10);
                        g gVar = this.a;
                        gVar.a(gVar.f616e);
                    }
                    this.a.f615d.putInt(0, a2.length);
                    this.a.f615d.position(10);
                    this.a.f615d.put(a2);
                    this.a.f615d.force();
                }
            }
        } catch (Exception e2) {
            g.e().a("504", "[properties] write to file error!", e2);
        }
    }
}
