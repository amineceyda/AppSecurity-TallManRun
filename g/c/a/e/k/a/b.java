package g.c.a.e.k.a;

import android.text.TextUtils;
import com.apkpure.aegon.components.install.AppInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ d b;

    public /* synthetic */ b(d dVar) {
        this.b = dVar;
    }

    public final void run() {
        d dVar = this.b;
        List<AppInfo> e2 = f.e(dVar.a);
        synchronized (dVar.c) {
            dVar.f1995d = false;
        }
        ArrayList arrayList = (ArrayList) e2;
        if (arrayList.size() != 0) {
            synchronized (dVar.f1996e) {
                dVar.f1997f = new HashMap<>();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AppInfo appInfo = (AppInfo) it.next();
                    if (appInfo != null && !TextUtils.isEmpty(appInfo.packageName)) {
                        dVar.f1997f.put(appInfo.packageName, appInfo);
                    }
                }
            }
            d.f1994h = true;
        }
    }
}
