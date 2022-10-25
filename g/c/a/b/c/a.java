package g.c.a.b.c;

import android.content.Context;
import com.tencent.crabshell.common.DataSavingUtils;
import g.c.a.b.c.i.e;

public final /* synthetic */ class a implements e {
    public final /* synthetic */ Context a;

    public /* synthetic */ a(Context context) {
        this.a = context;
    }

    public final void a(String str) {
        Context context = this.a;
        h.a.info("fetch KEY_LOG_REPORT_SAMPLE_BEACON :{}", (Object) str);
        DataSavingUtils.putData(context, "logReportSampleBeacon", str);
    }
}
