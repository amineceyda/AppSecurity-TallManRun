package g.e.b.p;

import android.content.Context;
import e.e.d.l.a;
import g.e.a.b.b.h.e;
import g.e.a.b.g.f;
import g.e.b.q.b;
import g.e.b.t.h;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class g implements j, k {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f3725f = 0;
    public final b<l> a;
    public final Context b;
    public final b<h> c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<h> f3726d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f3727e;

    public g(Context context, String str, Set<h> set, b<h> bVar) {
        a aVar = new a(context, str);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), d.a);
        this.a = aVar;
        this.f3726d = set;
        this.f3727e = threadPoolExecutor;
        this.c = bVar;
        this.b = context;
    }

    public f<String> a() {
        return a.Y(this.b) ^ true ? e.h("") : e.d(this.f3727e, new c(this));
    }

    public f<Void> b() {
        return this.f3726d.size() <= 0 ? e.h(null) : a.Y(this.b) ^ true ? e.h(null) : e.d(this.f3727e, new e(this));
    }
}
