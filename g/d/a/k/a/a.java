package g.d.a.k.a;

import android.util.Log;
import com.bumptech.glide.load.HttpException;
import g.d.a.l.s.d;
import g.d.a.l.u.g;
import g.d.a.r.c;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Objects;
import k.c0;
import k.d;
import k.e;
import k.e0;
import k.u;
import k.x;

public class a implements d<InputStream>, e {
    public final d.a b;
    public final g c;

    /* renamed from: d  reason: collision with root package name */
    public InputStream f2400d;

    /* renamed from: e  reason: collision with root package name */
    public e0 f2401e;

    /* renamed from: f  reason: collision with root package name */
    public d.a<? super InputStream> f2402f;

    /* renamed from: g  reason: collision with root package name */
    public volatile k.d f2403g;

    public a(d.a aVar, g gVar) {
        this.b = aVar;
        this.c = gVar;
    }

    public Class<InputStream> a() {
        return InputStream.class;
    }

    public void b() {
        try {
            InputStream inputStream = this.f2400d;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException unused) {
        }
        e0 e0Var = this.f2401e;
        if (e0Var != null) {
            e0Var.close();
        }
        this.f2402f = null;
    }

    public void cancel() {
        k.d dVar = this.f2403g;
        if (dVar != null) {
            dVar.cancel();
        }
    }

    public g.d.a.l.a e() {
        return g.d.a.l.a.REMOTE;
    }

    public void f(g.d.a.e eVar, d.a<? super InputStream> aVar) {
        x.a aVar2 = new x.a();
        aVar2.g(this.c.d());
        for (Map.Entry next : this.c.b.a().entrySet()) {
            aVar2.c.a((String) next.getKey(), (String) next.getValue());
        }
        x a = aVar2.a();
        this.f2402f = aVar;
        this.f2403g = ((u) this.b).a(a);
        this.f2403g.x(this);
    }

    public void onFailure(k.d dVar, IOException iOException) {
        if (Log.isLoggable("OkHttpFetcher", 3)) {
            Log.d("OkHttpFetcher", "OkHttp failed to obtain result", iOException);
        }
        this.f2402f.c(iOException);
    }

    public void onResponse(k.d dVar, c0 c0Var) {
        this.f2401e = c0Var.f4692h;
        if (c0Var.b()) {
            e0 e0Var = this.f2401e;
            Objects.requireNonNull(e0Var, "Argument must not be null");
            c cVar = new c(this.f2401e.d().d0(), e0Var.a());
            this.f2400d = cVar;
            this.f2402f.d(cVar);
            return;
        }
        this.f2402f.c(new HttpException(c0Var.f4689e, c0Var.f4688d));
    }
}
