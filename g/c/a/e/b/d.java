package g.c.a.e.b;

import android.content.Context;
import android.text.TextUtils;
import com.apkpure.aegon.components.download.DownloadTask;
import com.apkpure.aegon.components.models.AppDigest;
import g.c.a.e.c.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class d {

    /* renamed from: d  reason: collision with root package name */
    public static final Logger f1964d = LoggerFactory.getLogger("DownloadInfoHelperLog");

    /* renamed from: e  reason: collision with root package name */
    public static volatile d f1965e;
    public final Context a;
    public final Set<String> b = new HashSet();
    public final List<g.c.a.m.d> c = new ArrayList();

    public d(Context context) {
        AppDigest d2;
        this.a = context;
        CopyOnWriteArrayList<DownloadTask> h2 = e.i(context).h();
        if (h2 == null || h2.isEmpty()) {
            f1964d.info("tasks is null {}", (Object) Boolean.valueOf(h2 == null));
        } else {
            for (DownloadTask next : h2) {
                if (!(next == null || next.getDownloadDate() == null || System.currentTimeMillis() - next.getDownloadDate().getTime() > 1296000000 || (d2 = AppDigest.d(next.getUserData())) == null || g.c.a.e.k.a.d.b(this.a).c(d2))) {
                    if ((!next.isSuccess() && !next.isMissing()) || this.b.contains(next.getSimpleDisplayInfo().b())) {
                        this.b.add(next.getSimpleDisplayInfo().b());
                    }
                }
            }
        }
        new b.C0060b(this.a, new c(this)).a();
    }

    public static boolean a(d dVar, DownloadTask downloadTask) {
        Objects.requireNonNull(dVar);
        if (downloadTask == null || downloadTask.getSimpleDisplayInfo() == null) {
            return true;
        }
        return TextUtils.isEmpty(downloadTask.getSimpleDisplayInfo().b());
    }

    public static d c(Context context) {
        if (f1965e == null) {
            synchronized (e.class) {
                if (f1965e == null) {
                    f1965e = new d(context);
                }
            }
        }
        return f1965e;
    }

    public void b(g.c.a.m.d dVar) {
        if (dVar == null || this.c.contains(dVar)) {
            f1964d.info("添加的下载信息监听器出错: {}, size: {}", (Object) Boolean.valueOf(dVar == null), (Object) Integer.valueOf(this.c.size()));
            return;
        }
        this.c.add(dVar);
        if (!this.b.isEmpty()) {
            dVar.a();
        }
    }

    public void d() {
        g.c.a.m.d next;
        Iterator<g.c.a.m.d> it = this.c.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            next.a();
        }
    }

    public void e(g.c.a.m.d dVar) {
        if (dVar == null || this.c.size() == 0) {
            f1964d.info("移除的下载信息监听器出错: {}, size: {}", (Object) Boolean.valueOf(dVar == null), (Object) Integer.valueOf(this.c.size()));
        } else if (!this.c.contains(dVar)) {
            f1964d.info("要移除的下载信息监听器为注册");
        } else {
            this.c.remove(dVar);
        }
    }
}
