package g.c.a.l.l;

import com.apkpure.aegon.components.models.Asset;
import com.apkpure.aegon.signstuff.apk.XApkDownloadTask;
import e.e.d.l.a;
import g.c.a.e.c.b;
import g.c.a.l.o.b;
import g.c.a.l.o.i;
import g.d.a.j.e;
import i.o.c.h;
import java.io.File;
import java.util.Objects;
import org.slf4j.Logger;

public final class a0 implements b {
    public final /* synthetic */ b0 a;
    public final /* synthetic */ Asset b;
    public final /* synthetic */ String c;

    public a0(b0 b0Var, Asset asset, String str) {
        this.a = b0Var;
        this.b = asset;
        this.c = str;
    }

    public void a() {
        h.e(this, "this");
        b0.p.info("onStart");
    }

    public void b(File file) {
        h.e(file, "file");
        a.h0(this, file);
        Logger logger = b0.p;
        StringBuilder i2 = g.a.a.a.a.i("onSuccess path[");
        i2.append(file.getPath());
        i2.append(']');
        logger.debug(i2.toString());
        b0 b0Var = this.a;
        Asset asset = this.b;
        String str = this.c;
        Objects.requireNonNull(b0Var);
        if (asset == null) {
            logger.info("Add download task, asset is null.");
            return;
        }
        b.C0060b bVar = new b.C0060b(b0Var.a, new w(b0Var));
        b0Var.f2057m = bVar;
        bVar.a();
        b0Var.n = j.a;
        XApkDownloadTask.a(new XApkDownloadTask(b0Var.f2063f, asset, str, (XApkDownloadTask.a) null), b0Var.n);
    }

    public void c(double d2) {
        h.e(this, "this");
    }

    public void d(Throwable th) {
        h.e(th, e.u);
        b0.p.info(h.j("onFailed", th));
    }

    public void e(String str) {
        a.i0(this, str);
    }

    public void f(i iVar) {
        a.g0(this, iVar);
    }

    public void g() {
        h.e(this, "this");
    }
}
