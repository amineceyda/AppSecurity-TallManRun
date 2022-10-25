package g.c.a.n.a;

import android.content.Context;
import com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo;
import g.c.a.m.e;
import i.o.c.h;

public final /* synthetic */ class g implements e {
    public final /* synthetic */ k a;
    public final /* synthetic */ i b;
    public final /* synthetic */ Context c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ e f2097d;

    public /* synthetic */ g(k kVar, i iVar, Context context, e eVar) {
        this.a = kVar;
        this.b = iVar;
        this.c = context;
        this.f2097d = eVar;
    }

    public final void a(Object obj) {
        k kVar = this.a;
        i iVar = this.b;
        Context context = this.c;
        e eVar = this.f2097d;
        AppDetailInfo appDetailInfo = (AppDetailInfo) obj;
        h.e(kVar, "$downloadButtonStateInfo");
        h.e(iVar, "this$0");
        h.e(context, "$context");
        if (appDetailInfo != null) {
            kVar.c = appDetailInfo;
            iVar.b(context, kVar, eVar);
        }
    }
}
