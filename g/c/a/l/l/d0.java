package g.c.a.l.l;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.apkpure.aegon.app.event.SystemPackageEvent$Receiver;
import com.apkpure.aegon.application.AegonApplication;
import com.apkpure.aegon.components.install.AppInfo;
import com.apkpure.aegon.components.models.Asset;
import com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo;
import g.c.a.b.d.b;
import g.c.a.g.a.o.c;
import g.c.a.l.j;
import g.c.a.m.d;
import g.c.b.b.f;
import i.o.c.h;
import j.a.x;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class d0 {

    /* renamed from: l  reason: collision with root package name */
    public static final Logger f2060l = LoggerFactory.getLogger("BaseApkManager");
    public Context a;
    public Handler b = new Handler(Looper.getMainLooper());
    public final x c = f.b();

    /* renamed from: d  reason: collision with root package name */
    public long f2061d;

    /* renamed from: e  reason: collision with root package name */
    public long f2062e;

    /* renamed from: f  reason: collision with root package name */
    public o f2063f = new o(0, (String) null, (String) null, 0, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, 0.0d, (j) null, 0, (Bitmap) null, 0, (g.c.b.b.j.a) null, (Map) null, false, 33554431);

    /* renamed from: g  reason: collision with root package name */
    public e0 f2064g;

    /* renamed from: h  reason: collision with root package name */
    public g.c.a.e.h.b.a f2065h;

    /* renamed from: i  reason: collision with root package name */
    public SystemPackageEvent$Receiver f2066i;

    /* renamed from: j  reason: collision with root package name */
    public final d f2067j = new n(this);

    /* renamed from: k  reason: collision with root package name */
    public final d f2068k = new k(this);

    public static final class a implements b {
        public final /* synthetic */ d0 a;

        public a(d0 d0Var) {
            this.a = d0Var;
        }

        public void a(Context context, String str) {
            String str2;
            h.e(context, "context");
            h.e(str, "packageName");
            o oVar = this.a.f2063f;
            if (oVar == null) {
                str2 = null;
            } else {
                str2 = oVar.g();
            }
            if (h.a(str, str2)) {
                d0.f2060l.info("Receiver system package install success.");
                this.a.g(context, str);
            }
        }

        public void b(Context context, String str) {
            h.e(context, "context");
            h.e(str, "packageName");
        }
    }

    public d0() {
        Context context = AegonApplication.getContext();
        h.d(context, "getContext()");
        this.a = context;
    }

    public static void e(d0 d0Var, int i2, int i3, double d2, int i4, Object obj) {
        Integer num;
        Integer num2 = null;
        if ((i4 & 1) != 0) {
            o oVar = d0Var.f2063f;
            if (oVar == null) {
                num = null;
            } else {
                num = Integer.valueOf(oVar.c);
            }
            i2 = num.intValue();
        }
        if ((i4 & 2) != 0) {
            o oVar2 = d0Var.f2063f;
            if (oVar2 != null) {
                num2 = Integer.valueOf(oVar2.c);
            }
            i3 = num2.intValue();
        }
        if ((i4 & 4) != 0) {
            d2 = 0.0d;
        }
        d0Var.d(i2, i3, d2);
    }

    public final void a() {
        g.c.a.g.a.o.d.a(this.f2068k);
        d dVar = this.f2067j;
        Logger logger = g.c.a.g.a.o.d.a;
        List<d> list = g.c.a.g.a.o.d.f2030d;
        logger.info("callback len: {}. addIsForegroundListen {}", (Object) Integer.valueOf(list.size()), (Object) dVar);
        if (dVar != null && !list.contains(dVar)) {
            list.add(dVar);
        }
    }

    public final Asset b(o oVar) {
        h.e(oVar, "apkDescription");
        String c2 = g.c.a.e.k.h.b.c(oVar);
        if (c2 == null || c2.length() == 0) {
            f2060l.info("ApkDescription to asset json is null.");
            return null;
        }
        Asset asset = (Asset) g.c.a.e.k.h.b.b(c2, Asset.class);
        if (asset == null) {
            f2060l.info("ApkDescription to asset, asset is null.");
        }
        return asset;
    }

    public abstract void c(o oVar, g.c.a.e.h.b.a aVar, e0 e0Var);

    public final void d(int i2, int i3, double d2) {
        if (this.f2064g == null) {
            f2060l.info("notify statu");
            return;
        }
        if (this.f2063f == null) {
            this.f2063f = new o(0, (String) null, (String) null, 0, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, 0.0d, (j) null, 0, (Bitmap) null, 0, (g.c.b.b.j.a) null, (Map) null, false, 33554431);
        }
        o oVar = this.f2063f;
        if (oVar != null) {
            oVar.c = i2;
        }
        if (oVar != null) {
            oVar.f2071e = i3;
        }
        if (oVar != null) {
            oVar.a = d2;
        }
        if (h.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            e0 e0Var = this.f2064g;
            if (e0Var != null) {
                e0Var.a(this.f2063f);
                return;
            }
            return;
        }
        this.b.post(new m(this));
    }

    public abstract void f();

    public abstract void g(Context context, String str);

    public final void h() {
        SystemPackageEvent$Receiver systemPackageEvent$Receiver = new SystemPackageEvent$Receiver(this.a, new a(this));
        this.f2066i = systemPackageEvent$Receiver;
        h.c(systemPackageEvent$Receiver);
        systemPackageEvent$Receiver.a(999);
    }

    public abstract boolean i();

    public final void j() {
        d dVar = this.f2068k;
        Logger logger = g.c.a.g.a.o.d.a;
        List<d> list = g.c.a.g.a.o.d.c;
        logger.info("callback len: {}. removeIsBackgroundListen {}", (Object) Integer.valueOf(list.size()), (Object) dVar);
        if (dVar != null && list.contains(dVar)) {
            list.remove(dVar);
        }
        d dVar2 = this.f2067j;
        List<d> list2 = g.c.a.g.a.o.d.f2030d;
        logger.info("callback len: {}. removeIsBackgroundListen {}", (Object) Integer.valueOf(list2.size()), (Object) dVar2);
        if (dVar2 != null && list2.contains(dVar2)) {
            list2.remove(dVar2);
        }
    }

    public void k() {
    }

    public final void l(o oVar) {
        h.e(oVar, "<set-?>");
        this.f2063f = oVar;
    }

    public final boolean m(o oVar) {
        h.e(oVar, "apkDescription");
        String g2 = oVar.g();
        int k2 = oVar.k();
        AppInfo d2 = g.c.a.e.k.a.f.d(AegonApplication.getContext(), g2);
        if (d2 != null) {
            String str = d2.packageName;
            h.d(str, "appInfo.packageName");
            if (str.contentEquals(g2) && d2.versionCode == k2) {
                e(this, 50, 2004, 0.0d, 4, (Object) null);
                Context c2 = c.b().c();
                if (c2 == null) {
                    c2 = AegonApplication.getContext();
                }
                AppDetailInfo appDetailInfo = new AppDetailInfo();
                appDetailInfo.packageName = g2;
                g.c.a.g.d.a.b(c2, appDetailInfo);
                return true;
            }
        }
        f2060l.info("Try to open app detail activity fail.");
        return false;
    }

    public final void n() {
        SystemPackageEvent$Receiver systemPackageEvent$Receiver = this.f2066i;
        if (systemPackageEvent$Receiver != null && systemPackageEvent$Receiver.f260d) {
            systemPackageEvent$Receiver.b.unregisterReceiver(systemPackageEvent$Receiver);
            systemPackageEvent$Receiver.f260d = false;
        }
    }
}
