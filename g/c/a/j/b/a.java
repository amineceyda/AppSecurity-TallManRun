package g.c.a.j.b;

import android.content.Context;
import g.c.b.b.f;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ Context b;

    public /* synthetic */ a(Context context) {
        this.b = context;
    }

    public final void run() {
        f.j0(this.b, "打包日志失败，请重试");
    }
}
