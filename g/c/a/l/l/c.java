package g.c.a.l.l;

import com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo;
import g.c.a.g.b.a;
import g.c.a.n.b.b;
import i.o.c.h;
import org.slf4j.Logger;

public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ r b;
    public final /* synthetic */ AppDetailInfo c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f2058d;

    public /* synthetic */ c(r rVar, AppDetailInfo appDetailInfo, boolean z) {
        this.b = rVar;
        this.c = appDetailInfo;
        this.f2058d = z;
    }

    public final void run() {
        r rVar = this.b;
        AppDetailInfo appDetailInfo = this.c;
        boolean z = this.f2058d;
        h.e(rVar, "this$0");
        h.e(appDetailInfo, "$appDetailInfo");
        Logger logger = r.q;
        logger.info("Start download apk, is mobile network.");
        a a = g.c.a.g.a.o.c.b().a();
        if (!e.e.d.l.a.U(a)) {
            logger.info("Start download apk, invalid able activity.");
            d0.e(rVar, 22, 2023, 0.0d, 4, (Object) null);
            return;
        }
        b bVar = new b(a, true);
        bVar.o(2131820878);
        bVar.j(2131820879);
        bVar.n(2131820827, new g(rVar, appDetailInfo, z));
        bVar.m(17039360, new h(rVar));
        bVar.i();
    }
}
