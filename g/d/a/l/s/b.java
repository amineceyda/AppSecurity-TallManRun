package g.d.a.l.s;

import android.content.res.AssetManager;
import android.util.Log;
import g.d.a.e;
import g.d.a.l.a;
import g.d.a.l.s.d;
import java.io.IOException;

public abstract class b<T> implements d<T> {
    public final String b;
    public final AssetManager c;

    /* renamed from: d  reason: collision with root package name */
    public T f2414d;

    public b(AssetManager assetManager, String str) {
        this.c = assetManager;
        this.b = str;
    }

    public void b() {
        T t = this.f2414d;
        if (t != null) {
            try {
                c(t);
            } catch (IOException unused) {
            }
        }
    }

    public abstract void c(T t) throws IOException;

    public void cancel() {
    }

    public abstract T d(AssetManager assetManager, String str) throws IOException;

    public a e() {
        return a.LOCAL;
    }

    public void f(e eVar, d.a<? super T> aVar) {
        try {
            T d2 = d(this.c, this.b);
            this.f2414d = d2;
            aVar.d(d2);
        } catch (IOException e2) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e2);
            }
            aVar.c(e2);
        }
    }
}
