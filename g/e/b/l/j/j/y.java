package g.e.b.l.j.j;

import android.os.Bundle;
import java.util.concurrent.Callable;

public class y implements Callable<Void> {
    public final /* synthetic */ long a;
    public final /* synthetic */ v b;

    public y(v vVar, long j2) {
        this.b = vVar;
        this.a = j2;
    }

    public Object call() throws Exception {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.a);
        this.b.f3528k.a("_ae", bundle);
        return null;
    }
}
