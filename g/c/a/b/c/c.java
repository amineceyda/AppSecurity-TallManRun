package g.c.a.b.c;

import android.content.Context;
import com.tencent.crabshell.common.DataSavingUtils;
import g.c.a.b.c.i.e;
import g.c.a.e.h.a.f;

public final /* synthetic */ class c implements e {
    public final /* synthetic */ Context a;

    public /* synthetic */ c(Context context) {
        this.a = context;
    }

    public final void a(String str) {
        Context context = this.a;
        h.a.info("fetch KEY_NEED_REPORT_KEYS :{}", (Object) str);
        DataSavingUtils.putData(context, "needReportKey", str);
        f.h();
    }
}
