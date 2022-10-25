package g.c.b.b.i.e;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import g.c.b.b.f;
import g.c.b.b.i.c;
import g.c.b.b.i.d;
import i.o.c.h;
import i.o.c.i;

public final class k {
    public final Context a;
    public final c b;
    public final i.c c = f.U(a.b);

    /* renamed from: d  reason: collision with root package name */
    public g.c.b.b.j.a f2268d;

    /* renamed from: e  reason: collision with root package name */
    public final i.c f2269e = f.U(new b(this));

    /* renamed from: f  reason: collision with root package name */
    public Runnable f2270f;

    public static final class a extends i implements i.o.b.a<Handler> {
        public static final a b = new a();

        public a() {
            super(0);
        }

        public Object a() {
            return new Handler(Looper.getMainLooper());
        }
    }

    public static final class b extends i implements i.o.b.a<d.b> {
        public final /* synthetic */ k this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(k kVar) {
            super(0);
            this.this$0 = kVar;
        }

        public Object a() {
            k kVar = this.this$0;
            return new d.b(kVar.a, new l(kVar));
        }
    }

    public k(Context context, c cVar) {
        h.e(context, "context");
        h.e(cVar, "listener");
        this.a = context;
        this.b = cVar;
    }

    public final Handler a() {
        return (Handler) this.c.getValue();
    }

    public final void b(g.c.b.b.j.a aVar) {
        h.e(aVar, "installTask");
        if (this.f2270f != null) {
            Handler a2 = a();
            Runnable runnable = this.f2270f;
            h.c(runnable);
            a2.removeCallbacks(runnable);
        }
        this.f2270f = new d(this, aVar);
        Handler a3 = a();
        Runnable runnable2 = this.f2270f;
        h.c(runnable2);
        a3.post(runnable2);
    }

    public final void c(g.c.b.b.j.a aVar, int i2, String str) {
        h.e(aVar, "installTask");
        h.e(str, "msg");
        String str2 = aVar.a;
        if (str2 != null) {
            g.c.b.b.l.d.c(str2, this.a);
        }
        a().post(new f(this, aVar, i2, str));
    }

    public final void d(g.c.b.b.j.a aVar) {
        h.e(aVar, "installTask");
        if (this.f2270f != null) {
            Handler a2 = a();
            Runnable runnable = this.f2270f;
            h.c(runnable);
            a2.removeCallbacks(runnable);
        }
        this.f2270f = new a(this, aVar);
        Handler a3 = a();
        Runnable runnable2 = this.f2270f;
        h.c(runnable2);
        a3.post(runnable2);
    }

    public final void e(g.c.b.b.j.a aVar) {
        h.e(aVar, "installTask");
        String str = aVar.a;
        if (str != null) {
            g.c.b.b.l.d.c(str, this.a);
        }
        a().post(new g(this, aVar));
    }

    public final void f() {
        a().post(new c(this));
    }
}
