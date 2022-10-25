package g.c.a.e.k.a;

import android.content.Context;
import android.content.IntentFilter;
import com.apkpure.aegon.application.RealApplicationLike;
import com.apkpure.aegon.components.install.AppInfo;
import com.apkpure.aegon.components.models.AppDigest;
import e.e.i.b;
import g.c.a.e.c.f;
import g.c.a.e.c.g;
import java.util.HashMap;

public class d {

    /* renamed from: g  reason: collision with root package name */
    public static volatile d f1993g;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f1994h;
    public Context a;
    public g b;
    public final Object c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1995d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f1996e;

    /* renamed from: f  reason: collision with root package name */
    public HashMap<String, AppInfo> f1997f;

    public class a implements f {
        public a() {
        }
    }

    public d() {
        this.c = new Object();
        this.f1995d = false;
        this.f1996e = new Object();
        new HashMap();
        new HashMap();
        new HashMap();
    }

    public d(Context context) {
        Object obj = new Object();
        this.c = obj;
        this.f1995d = false;
        this.f1996e = new Object();
        new HashMap();
        new HashMap();
        new HashMap();
        f1994h = false;
        this.a = context;
        g gVar = new g(context, new a());
        this.b = gVar;
        if (!gVar.c) {
            IntentFilter intentFilter = new IntentFilter(RealApplicationLike.MAIN_PROCESS_NAME);
            intentFilter.setPriority(1000);
            intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
            intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
            intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
            intentFilter.addDataScheme("package");
            gVar.a.registerReceiver(gVar, intentFilter);
            gVar.c = true;
        }
        synchronized (obj) {
            if (!this.f1995d) {
                this.f1995d = true;
                b.D().a(new b(this));
            }
        }
    }

    public static d b(Context context) {
        if (f1993g == null) {
            synchronized (d.class) {
                Context applicationContext = context.getApplicationContext();
                if (f1993g == null) {
                    f1993g = new d(applicationContext);
                }
            }
        }
        return f1993g;
    }

    public AppInfo a(String str) {
        AppInfo appInfo;
        synchronized (this.f1996e) {
            appInfo = d() ? this.f1997f.get(str) : null;
        }
        return appInfo;
    }

    public boolean c(AppDigest appDigest) {
        AppInfo a2 = a(appDigest.a());
        if (a2 == null) {
            return false;
        }
        return appDigest.c(a2.a());
    }

    public final boolean d() {
        boolean z;
        synchronized (this.f1996e) {
            z = this.f1997f != null;
        }
        return z;
    }

    public void finalize() {
        g gVar = this.b;
        if (gVar.c) {
            gVar.a.unregisterReceiver(gVar);
            gVar.c = false;
        }
        try {
            super.finalize();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
