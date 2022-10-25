package g.i.c.a.a.x.c;

import java.util.List;

public class c implements Runnable {
    public final /* synthetic */ List b;
    public final /* synthetic */ List c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g f4551d;

    public c(g gVar, List list, List list2) {
        this.f4551d = gVar;
        this.b = list;
        this.c = list2;
    }

    public void run() {
        this.f4551d.a.d(this.b, this.c);
    }
}
