package g.i.d.a;

import android.content.Context;
import com.tencent.raft.measure.config.RAFTComConfig;
import com.tencent.raft.measure.log.RLog;

public class b implements Runnable {
    public final /* synthetic */ Context b;
    public final /* synthetic */ RAFTComConfig c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ a f4569d;

    public b(a aVar, Context context, RAFTComConfig rAFTComConfig) {
        this.f4569d = aVar;
        this.b = context;
        this.c = rAFTComConfig;
    }

    public void run() {
        try {
            a.c(this.f4569d, this.b, this.c);
            a.b(this.f4569d, this.b, this.c);
        } catch (Throwable th) {
            RLog.d("MeasureCore", "reportInner error", th);
            if (this.f4569d.b.isDebug()) {
                throw th;
            }
        }
    }
}
