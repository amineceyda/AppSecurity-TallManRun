package g.c.a.d.b;

import android.content.Context;
import android.view.View;
import com.apkpure.aegon.components.statistics.datong.DTStatInfo;
import com.tencent.trpcprotocol.projecta.common.cmsresponse.nano.CmsItemList;
import g.c.a.o.g.c;
import g.i.c.a.a.i.b;
import i.o.c.h;
import i.o.c.o;
import java.util.Objects;

public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ c b;
    public final /* synthetic */ o c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ CmsItemList f1948d;

    public /* synthetic */ a(c cVar, o oVar, CmsItemList cmsItemList) {
        this.b = cVar;
        this.c = oVar;
        this.f1948d = cmsItemList;
    }

    public final void onClick(View view) {
        c cVar = this.b;
        o oVar = this.c;
        CmsItemList cmsItemList = this.f1948d;
        h.e(cVar, "$holder");
        h.e(oVar, "$dtStatInfo");
        if (cVar.b.getContext() != null && (cVar.b.getContext() instanceof g.c.a.g.b.a)) {
            Context context = cVar.b.getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type com.apkpure.aegon.main.base.BaseActivity");
            ((g.c.a.g.b.a) context).w(g.c.a.e.h.b.a.a((DTStatInfo) oVar.element));
        }
        g.c.a.g.d.a.b(view.getContext(), cmsItemList.appInfo);
        b.C0166b.a.j(view);
    }
}
