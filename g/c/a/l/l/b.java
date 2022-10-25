package g.c.a.l.l;

import com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo;
import g.c.a.g.a.o.c;
import g.c.a.g.b.a;
import i.o.c.h;

public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ r b;
    public final /* synthetic */ AppDetailInfo c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f2056d;

    public /* synthetic */ b(r rVar, AppDetailInfo appDetailInfo, boolean z) {
        this.b = rVar;
        this.c = appDetailInfo;
        this.f2056d = z;
    }

    public final void run() {
        r rVar = this.b;
        AppDetailInfo appDetailInfo = this.c;
        boolean z = this.f2056d;
        h.e(rVar, "this$0");
        h.e(appDetailInfo, "$appDetailInfo");
        a a = c.b().a();
        if (!e.e.d.l.a.U(a)) {
            r.q.info("Check compatible, invalid able activity.");
            d0.e(rVar, 22, 2028, 0.0d, 4, (Object) null);
            return;
        }
        int color = a.getResources().getColor(2131100019);
        g.c.a.n.b.b bVar = new g.c.a.n.b.b(a, true);
        bVar.k(2131820999, Integer.valueOf(color));
        bVar.n(17039379, new d(rVar, appDetailInfo, z));
        bVar.m(17039369, new f(rVar));
        bVar.e();
    }
}
