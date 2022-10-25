package g.c.b.b.m;

import android.content.pm.PackageInstaller;
import g.c.b.b.f;
import g.c.b.c.b.a;
import i.j;
import i.m.d;
import i.m.j.a.e;
import i.m.j.a.h;
import i.o.b.p;
import i.o.c.r;
import j.a.h0;
import j.a.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;

@e(c = "com.apkpure.components.installer.xapk.SeekSessionPackageInstaller$openWrite$1", f = "SeekableSessionPackageInstaller.kt", l = {72}, m = "invokeSuspend")
public final class c extends h implements p<x, d<? super j>, Object> {
    public final /* synthetic */ List<a.C0077a> $apkFiles;
    public final /* synthetic */ g.c.b.b.i.a $listener;
    public final /* synthetic */ PackageInstaller.Session $session;
    public final /* synthetic */ a $xApk;
    public int label;
    public final /* synthetic */ d this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(d dVar, a aVar, List<a.C0077a> list, PackageInstaller.Session session, g.c.b.b.i.a aVar2, d<? super c> dVar2) {
        super(2, dVar2);
        this.this$0 = dVar;
        this.$xApk = aVar;
        this.$apkFiles = list;
        this.$session = session;
        this.$listener = aVar2;
    }

    public final d<j> a(Object obj, d<?> dVar) {
        return new c(this.this$0, this.$xApk, this.$apkFiles, this.$session, this.$listener, dVar);
    }

    public Object d(Object obj, Object obj2) {
        x xVar = (x) obj;
        return new c(this.this$0, this.$xApk, this.$apkFiles, this.$session, this.$listener, (d) obj2).l(j.a);
    }

    public final Object l(Object obj) {
        i.m.i.a aVar = i.m.i.a.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            f.q0(obj);
            d dVar = this.this$0;
            a aVar2 = this.$xApk;
            List<a.C0077a> list = this.$apkFiles;
            PackageInstaller.Session session = this.$session;
            g.c.b.b.i.a aVar3 = this.$listener;
            this.label = 1;
            Objects.requireNonNull(dVar);
            h0 h0Var = h0.c;
            obj = f.x0(h0.b, new b(dVar, list, aVar2, session, aVar3, (d<? super b>) null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i2 == 1) {
            f.q0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (obj instanceof Throwable) {
            this.$listener.d(5, f.D(obj));
        } else {
            if ((obj instanceof List) && !(obj instanceof i.o.c.s.a)) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r.a(obj));
                this.$listener.b(arrayList);
            }
            f.f(this.this$0.c, (CancellationException) null, 1);
        }
        return j.a;
    }
}
