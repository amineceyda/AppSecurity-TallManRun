package g.c.a.l.l;

import android.content.DialogInterface;
import com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo;
import i.o.c.h;

public final /* synthetic */ class d implements DialogInterface.OnClickListener {
    public final /* synthetic */ r b;
    public final /* synthetic */ AppDetailInfo c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f2059d;

    public /* synthetic */ d(r rVar, AppDetailInfo appDetailInfo, boolean z) {
        this.b = rVar;
        this.c = appDetailInfo;
        this.f2059d = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        r rVar = this.b;
        AppDetailInfo appDetailInfo = this.c;
        boolean z = this.f2059d;
        h.e(rVar, "this$0");
        h.e(appDetailInfo, "$appDetailInfo");
        rVar.o(appDetailInfo, z, true);
        dialogInterface.dismiss();
    }
}
