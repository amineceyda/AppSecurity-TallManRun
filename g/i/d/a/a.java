package g.i.d.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.raft.measure.config.MeasureAppConfig;
import com.tencent.raft.measure.config.MeasureAppConfigBuilder;
import com.tencent.raft.measure.config.RAFTComConfig;
import com.tencent.raft.measure.exception.ComConfigInvalidException;
import com.tencent.raft.measure.log.RLog;
import com.tencent.raft.measure.report.ATTAReporter;
import com.tencent.raft.measure.report.AppInfo;
import com.tencent.raft.measure.report.SLIReportItem;
import com.tencent.raft.measure.report.StartUpReportItem;
import com.tencent.raft.measure.utils.MeasureConst;
import com.tencent.raft.measure.utils.SamplingUtil;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final Object f4564d = new Object();
    public final ATTAReporter a = new ATTAReporter(MeasureConst.ATTA_APP_ID, MeasureConst.ATTA_TOKEN);
    public MeasureAppConfig b = new MeasureAppConfigBuilder().create();
    public AppInfo c;

    /* renamed from: g.i.d.a.a$a  reason: collision with other inner class name */
    public class C0189a implements Runnable {
        public final /* synthetic */ Context b;
        public final /* synthetic */ RAFTComConfig c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String f4565d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ String f4566e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ String f4567f;

        public C0189a(Context context, RAFTComConfig rAFTComConfig, String str, String str2, String str3) {
            this.b = context;
            this.c = rAFTComConfig;
            this.f4565d = str;
            this.f4566e = str2;
            this.f4567f = str3;
        }

        public void run() {
            try {
                a.a(a.this, this.b, this.c, this.f4565d, this.f4566e, this.f4567f);
                a.b(a.this, this.b, this.c);
            } catch (Throwable th) {
                RLog.d("MeasureCore", "reportInner error", th);
                if (a.this.b.isDebug()) {
                    throw th;
                }
            }
        }
    }

    public static void a(a aVar, Context context, RAFTComConfig rAFTComConfig, String str, String str2, String str3) {
        Objects.requireNonNull(aVar);
        if (!rAFTComConfig.isDataValid()) {
            StringBuilder i2 = g.a.a.a.a.i("SLIComConfig not valid ");
            i2.append(rAFTComConfig.toString());
            RLog.d("MeasureCore", i2.toString());
            if (aVar.b.isDebug()) {
                throw new ComConfigInvalidException(rAFTComConfig);
            }
        } else if (!aVar.d(context)) {
            RLog.d("MeasureCore", "appItem is init fail! ");
        } else {
            SLIReportItem sLIReportItem = new SLIReportItem(rAFTComConfig, str, str2, str3);
            sLIReportItem.setAppInfo(aVar.c);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(sLIReportItem.toUrlParams());
            aVar.a.doPostBatchReport(jSONArray);
        }
    }

    public static void b(a aVar, Context context, RAFTComConfig rAFTComConfig) {
        if (!aVar.d(context)) {
            RLog.d("MeasureCore", "appItem is init fail! ");
            return;
        }
        SamplingUtil.SamplingResult startUpSampling = SamplingUtil.startUpSampling(rAFTComConfig);
        if (startUpSampling == SamplingUtil.SamplingResult.REPORT) {
            StartUpReportItem startUpReportItem = new StartUpReportItem(rAFTComConfig, aVar.c);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(startUpReportItem.toUrlParams());
            aVar.a.doPostBatchReport(jSONArray);
        } else if (startUpSampling != SamplingUtil.SamplingResult.REPEAT_LIMIT) {
            StringBuilder i2 = g.a.a.a.a.i("filter Usage for ");
            i2.append(rAFTComConfig.getUniKey());
            i2.append(" reason = ");
            i2.append(startUpSampling.name());
            RLog.d("MeasureCore", i2.toString());
        }
    }

    public static void c(a aVar, Context context, RAFTComConfig rAFTComConfig) {
        Objects.requireNonNull(aVar);
        SharedPreferences sharedPreferences = context.getSharedPreferences(MeasureConst.CRASH_MONITOR_SP_NAME, 0);
        if (rAFTComConfig.getComVersion().equals(sharedPreferences.getString(rAFTComConfig.getComName(), ""))) {
            StringBuilder i2 = g.a.a.a.a.i("exist same version ");
            i2.append(rAFTComConfig.toString());
            RLog.d("MeasureCore", i2.toString());
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(rAFTComConfig.getComName(), rAFTComConfig.getComVersion());
        edit.apply();
    }

    public final boolean d(Context context) {
        if (this.c != null) {
            return true;
        }
        synchronized (f4564d) {
            if (this.c == null) {
                try {
                    AppInfo appInfo = new AppInfo(context.getPackageName(), context.getString(context.getApplicationInfo().labelRes), context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName);
                    this.c = appInfo;
                    appInfo.ensureNotNull();
                } catch (Exception e2) {
                    RLog.e("MeasureCore", "initAppItem exception", e2);
                }
            }
        }
        if (this.c != null) {
            return true;
        }
        RLog.d("MeasureCore", "appItem is init fail! ");
        return false;
    }

    public void e(Context context, RAFTComConfig rAFTComConfig, String str, String str2, int i2, String str3) {
        SamplingUtil.SamplingResult sLISamplingResult = SamplingUtil.getSLISamplingResult(context, rAFTComConfig, str, i2);
        if (sLISamplingResult == SamplingUtil.SamplingResult.REPORT) {
            this.b.getExecutor().schedule(new C0189a(context, rAFTComConfig, str, str2, str3), 5000, TimeUnit.MILLISECONDS);
        } else if (this.b.isDebug()) {
            StringBuilder n = g.a.a.a.a.n("filter report for key=", str, " reason = ");
            n.append(sLISamplingResult.name());
            RLog.d("MeasureCore", n.toString());
        }
    }
}
