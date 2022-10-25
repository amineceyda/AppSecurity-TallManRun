package g.c.b.b.m;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageInstaller;
import com.apkpure.components.installer.ui.InstallApksActivity;
import com.apkpure.components.installer.ui.InstallReceiverActivity;
import g.c.b.b.f;
import i.o.c.h;
import j.a.h0;
import j.a.t1.j;
import j.a.x;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class d {
    public final Context a;
    public final Logger b = LoggerFactory.getLogger("SeekSessionPackageInstaller");
    public final x c;

    /* renamed from: d  reason: collision with root package name */
    public PackageInstaller.Session f2302d;

    public d(Context context) {
        h.e(context, "context");
        this.a = context;
        h0 h0Var = h0.c;
        this.c = f.a(j.b);
    }

    public final void a(boolean z) {
        PackageInstaller.Session session = this.f2302d;
        if (session != null) {
            InstallApksActivity.a aVar = InstallApksActivity.r;
            h.e("install", "position");
            InstallApksActivity.a aVar2 = InstallApksActivity.r;
            Intent intent = z ? new Intent(this.a, InstallApksActivity.class) : new Intent(this.a, InstallReceiverActivity.class);
            intent.setAction(aVar.a(this.a));
            IntentSender intentSender = PendingIntent.getActivity(this.a, 0, intent, 0).getIntentSender();
            this.b.debug(h.j("开始拉起页面...", Long.valueOf(System.currentTimeMillis())));
            session.commit(intentSender);
        }
    }
}
