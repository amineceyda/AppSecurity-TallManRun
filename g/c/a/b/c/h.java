package g.c.a.b.c;

import android.content.Context;
import g.c.a.b.c.i.d;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class h {
    public static final Logger a = LoggerFactory.getLogger("RainbowConfigLog");

    public final void a(Context context) {
        d.b("esReportUrl", new d(context));
        d.b("logReportSampleEs", new b(context));
        d.b("logReportSampleBeacon", new a(context));
        d.b("report_beacon_type", new e(context));
        d.b("needReportKey", new c(context));
    }
}
