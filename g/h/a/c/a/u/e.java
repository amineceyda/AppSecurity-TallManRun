package g.h.a.c.a.u;

import i.o.c.h;

public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ n b;
    public final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ float f4058d;

    public /* synthetic */ e(n nVar, String str, float f2) {
        this.b = nVar;
        this.c = str;
        this.f4058d = f2;
    }

    public final void run() {
        n nVar = this.b;
        String str = this.c;
        float f2 = this.f4058d;
        int i2 = n.f4059i;
        h.e(nVar, "this$0");
        h.e(str, "$videoId");
        nVar.loadUrl("javascript:cueVideo('" + str + "', " + f2 + ')');
    }
}
