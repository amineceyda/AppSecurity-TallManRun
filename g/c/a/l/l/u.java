package g.c.a.l.l;

import android.content.Context;
import com.apkpure.aegon.application.AegonApplication;
import com.apkpure.aegon.components.models.Asset;
import com.apkpure.aegon.signstuff.apk.XApkDownloadTask;
import g.c.a.e.c.b;
import g.c.a.l.i;
import g.c.a.l.o.b;
import g.c.b.b.c;
import g.c.b.b.f;
import g.c.b.b.j.b;
import i.j;
import i.m.d;
import i.m.j.a.e;
import i.m.j.a.h;
import i.o.b.p;
import j.a.x;
import j.a.y;
import java.io.File;
import java.util.Objects;
import org.slf4j.Logger;

public final class u implements b {
    public final /* synthetic */ String a;
    public final /* synthetic */ v b;
    public final /* synthetic */ Asset c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f2076d;

    @e(c = "com.apkpure.aegon.signstuff.apk.ApkManagerFileManager$realStart$1$onSuccess$1", f = "ApkManagerFileManager.kt", l = {}, m = "invokeSuspend")
    public static final class a extends h implements p<x, d<? super j>, Object> {
        public final /* synthetic */ Asset $asset;
        public final /* synthetic */ File $file;
        public final /* synthetic */ String $outPath;
        public int label;
        public final /* synthetic */ v this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(v vVar, File file, Asset asset, String str, d<? super a> dVar) {
            super(2, dVar);
            this.this$0 = vVar;
            this.$file = file;
            this.$asset = asset;
            this.$outPath = str;
        }

        public final d<j> a(Object obj, d<?> dVar) {
            return new a(this.this$0, this.$file, this.$asset, this.$outPath, dVar);
        }

        public Object d(Object obj, Object obj2) {
            x xVar = (x) obj;
            a aVar = new a(this.this$0, this.$file, this.$asset, this.$outPath, (d) obj2);
            j jVar = j.a;
            aVar.l(jVar);
            return jVar;
        }

        public final Object l(Object obj) {
            if (this.label == 0) {
                f.q0(obj);
                this.this$0.f2062e = System.currentTimeMillis();
                v vVar = this.this$0;
                long j2 = vVar.f2062e - vVar.f2061d;
                Logger logger = v.o;
                logger.debug("OnWalleListener success diff:" + j2 + "ms");
                i.a.c(this.this$0.f2063f);
                v vVar2 = this.this$0;
                File file = this.$file;
                Objects.requireNonNull(vVar2);
                logger.info("Start install");
                o oVar = vVar2.f2063f;
                oVar.c = 60;
                oVar.f2071e = 0;
                e0 e0Var = vVar2.f2064g;
                if (e0Var != null) {
                    e0Var.a(oVar);
                }
                b.a aVar = new b.a();
                aVar.a = 4;
                aVar.f2288e = 0;
                aVar.b(new t(vVar2));
                g.c.b.b.j.b a = aVar.a();
                vVar2.a();
                vVar2.h();
                c a2 = c.f2226m.a();
                Context context = AegonApplication.getContext();
                i.o.c.h.d(context, "getContext()");
                String absolutePath = file.getAbsolutePath();
                i.o.c.h.d(absolutePath, "file.absolutePath");
                a2.n(context, absolutePath, a, false, g.c.b.b.l.f.FAST_DOWNLOAD);
                v vVar3 = this.this$0;
                Asset asset = this.$asset;
                String str = this.$outPath;
                Objects.requireNonNull(vVar3);
                if (asset == null) {
                    logger.info("Add download task, asset is null.");
                } else {
                    b.C0060b bVar = new b.C0060b(vVar3.a, new s(vVar3));
                    vVar3.f2077m = bVar;
                    bVar.a();
                    vVar3.n = i.a;
                    XApkDownloadTask.a(new XApkDownloadTask(vVar3.f2063f, asset, str, (XApkDownloadTask.a) null), vVar3.n);
                }
                return j.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public u(String str, v vVar, Asset asset, String str2) {
        this.a = str;
        this.b = vVar;
        this.c = asset;
        this.f2076d = str2;
    }

    public void a() {
        v.o.info("OnWalleListener onStart");
        i.a.a(this.a, 207);
        this.b.f2061d = System.currentTimeMillis();
        v vVar = this.b;
        o oVar = vVar.f2063f;
        oVar.c = 20;
        oVar.f2071e = 2007;
        e0 e0Var = vVar.f2064g;
        if (e0Var != null) {
            e0Var.a(oVar);
        }
    }

    public void b(File file) {
        i.o.c.h.e(file, "file");
        v.o.info(i.o.c.h.j("OnWalleListener onSuccess", file.getAbsolutePath()));
        i.a.a(this.a, 208);
        v vVar = this.b;
        f.S(vVar.c, (i.m.f) null, (y) null, new a(vVar, file, this.c, this.f2076d, (d<? super a>) null), 3, (Object) null);
    }

    public void c(double d2) {
        v.o.debug(i.o.c.h.j("OnWalleListener progress:", Double.valueOf(d2)));
        v vVar = this.b;
        o oVar = vVar.f2063f;
        oVar.a = d2;
        oVar.c = 21;
        e0 e0Var = vVar.f2064g;
        if (e0Var != null) {
            e0Var.a(oVar);
        }
    }

    public void d(Throwable th) {
        i.o.c.h.e(th, g.d.a.j.e.u);
        v.o.info(i.o.c.h.j("OnWalleListener onFailed", th));
        i.a.a(this.a, 209);
        v vVar = this.b;
        o oVar = vVar.f2063f;
        oVar.c = 22;
        oVar.f2071e = 2008;
        e0 e0Var = vVar.f2064g;
        if (e0Var != null) {
            e0Var.a(oVar);
        }
    }

    public void e(String str) {
        e.e.d.l.a.i0(this, str);
    }

    public void f(g.c.a.l.o.i iVar) {
        e.e.d.l.a.g0(this, iVar);
    }

    public void g() {
        i.o.c.h.e(this, "this");
    }
}
