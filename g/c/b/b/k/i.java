package g.c.b.b.k;

import com.apkpure.components.installer.ui.InstallApksActivity;
import g.c.b.b.i.d;
import i.o.c.h;
import java.util.Objects;

public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ InstallApksActivity b;

    public /* synthetic */ i(InstallApksActivity installApksActivity) {
        this.b = installApksActivity;
    }

    public final void run() {
        InstallApksActivity installApksActivity = this.b;
        InstallApksActivity.a aVar = InstallApksActivity.r;
        h.e(installApksActivity, "this$0");
        d.b bVar = (d.b) installApksActivity.q.getValue();
        Objects.requireNonNull(bVar);
        try {
            if (d.b) {
                bVar.a.unregisterReceiver(bVar);
                d.b = false;
            }
        } catch (Exception unused) {
        }
    }
}
