package g.c.b.b.i.e;

import g.c.b.b.j.a;
import i.o.c.h;

public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ k b;
    public final /* synthetic */ a c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f2266d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f2267e;

    public /* synthetic */ f(k kVar, a aVar, int i2, String str) {
        this.b = kVar;
        this.c = aVar;
        this.f2266d = i2;
        this.f2267e = str;
    }

    public final void run() {
        k kVar = this.b;
        a aVar = this.c;
        int i2 = this.f2266d;
        String str = this.f2267e;
        h.e(kVar, "this$0");
        h.e(aVar, "$installTask");
        h.e(str, "$msg");
        kVar.f();
        kVar.b.j(aVar, i2, str);
    }
}
