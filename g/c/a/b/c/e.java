package g.c.a.b.c;

import android.content.Context;
import com.tencent.crabshell.common.DataSavingUtils;
import g.c.a.e.h.a.f;

public final /* synthetic */ class e implements g.c.a.b.c.i.e {
    public final /* synthetic */ Context a;

    public /* synthetic */ e(Context context) {
        this.a = context;
    }

    public final void a(String str) {
        Context context = this.a;
        h.a.info("fetch KEY_REPORT_BEACON_TYPE :{}", (Object) str);
        DataSavingUtils.putData(context, "report_beacon_type", str);
        f.j();
    }
}
