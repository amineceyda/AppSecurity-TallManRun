package com.tencent.assistant.alive.jni;

import g.i.a.a.a.b;
import g.i.a.a.e.a;
import g.i.a.a.j.d.c;

public class KeepAliveJniApi {
    public static boolean c;
    public long a;
    public final a b = new a();

    static {
        try {
            System.loadLibrary("daemon_acc_v2.1.5");
            c = true;
        } catch (UnsatisfiedLinkError e2) {
            g.i.a.a.m.a.b(e2);
            c = false;
        }
    }

    public KeepAliveJniApi(b bVar) {
        g.i.a.a.j.d.b bVar2 = new g.i.a.a.j.d.b(bVar.a(), bVar.f4085h.a);
        this.a = init(bVar2.e(), bVar2.c);
        c cVar = new c(bVar.a(), bVar.f4085h.a());
        setServiceComponent(this.a, cVar.e(), cVar.c);
        g.i.a.a.m.a.a("KeepAliveJniApi", String.format("init handle with instr code: %d, service code: %d", new Object[]{Integer.valueOf(bVar2.e()), Integer.valueOf(cVar.e())}));
    }

    public final native boolean doWatch(long j2, String str, String str2, String str3);

    public final native long init(int i2, long j2);

    public final native boolean setServiceComponent(long j2, int i2, long j3);
}
