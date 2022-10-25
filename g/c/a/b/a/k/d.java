package g.c.a.b.a.k;

import com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo;
import g.c.a.b.a.k.f;
import g.c.a.m.e;
import java.util.Objects;

public final /* synthetic */ class d implements e {
    public final /* synthetic */ f a;

    public /* synthetic */ d(f fVar) {
        this.a = fVar;
    }

    public final void a(Object obj) {
        f fVar = this.a;
        AppDetailInfo appDetailInfo = (AppDetailInfo) obj;
        Objects.requireNonNull(fVar);
        if (appDetailInfo == null) {
            f.f1878d.info("详情页拉取 app info 为空, (仅打印, 依然有回调.)");
        }
        fVar.b = appDetailInfo;
        f.a aVar = f.a.fetch;
        e<f.a> eVar = fVar.c;
        if (eVar != null) {
            eVar.a(aVar);
        }
    }
}
