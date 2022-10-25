package g.c.b.b.k;

import android.content.Context;
import com.apkpure.components.installer.ui.InstallApksActivity;
import g.c.b.b.c;
import g.c.b.b.i.d;
import g.c.b.b.i.e.k;
import g.c.b.b.j.a;
import org.slf4j.Logger;

public final class o implements d.a {
    public final /* synthetic */ InstallApksActivity a;

    public o(InstallApksActivity installApksActivity) {
        this.a = installApksActivity;
    }

    public void a(Context context, String str) {
        k kVar;
        Logger logger = InstallApksActivity.s;
        StringBuilder sb = new StringBuilder();
        sb.append("received package ");
        sb.append(str);
        sb.append(" installed:");
        c.b bVar = c.f2226m;
        sb.append(bVar.a().f2232i);
        logger.info(sb.toString());
        if (i.l.c.d(bVar.a().f2232i, str)) {
            InstallApksActivity installApksActivity = this.a;
            if (!installApksActivity.o) {
                installApksActivity.o = true;
                a aVar = installApksActivity.f335d;
                if (!(aVar == null || (kVar = installApksActivity.c) == null)) {
                    kVar.e(aVar);
                }
                installApksActivity.j();
            }
            bVar.a().f2232i.clear();
        }
    }
}
