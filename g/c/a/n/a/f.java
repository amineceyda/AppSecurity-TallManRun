package g.c.a.n.a;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo;
import g.c.a.m.e;
import i.o.c.h;

public final /* synthetic */ class f implements DialogInterface.OnClickListener {
    public final /* synthetic */ k b;
    public final /* synthetic */ i c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Context f2095d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ e f2096e;

    public /* synthetic */ f(k kVar, i iVar, Context context, e eVar) {
        this.b = kVar;
        this.c = iVar;
        this.f2095d = context;
        this.f2096e = eVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        k kVar = this.b;
        i iVar = this.c;
        Context context = this.f2095d;
        e eVar = this.f2096e;
        h.e(kVar, "$downloadButtonStateInfo");
        h.e(iVar, "this$0");
        h.e(context, "$context");
        AppDetailInfo appDetailInfo = kVar.c;
        h.c(appDetailInfo);
        kVar.b = iVar.f(context, appDetailInfo, kVar.f2108d);
        if (eVar != null) {
            eVar.a(kVar);
        }
    }
}
