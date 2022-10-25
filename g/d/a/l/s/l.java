package g.d.a.l.s;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import g.d.a.e;
import g.d.a.l.a;
import g.d.a.l.s.d;
import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class l<T> implements d<T> {
    public final Uri b;
    public final ContentResolver c;

    /* renamed from: d  reason: collision with root package name */
    public T f2424d;

    public l(ContentResolver contentResolver, Uri uri) {
        this.c = contentResolver;
        this.b = uri;
    }

    public void b() {
        T t = this.f2424d;
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

    public abstract T d(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    public a e() {
        return a.LOCAL;
    }

    public final void f(e eVar, d.a<? super T> aVar) {
        try {
            T d2 = d(this.b, this.c);
            this.f2424d = d2;
            aVar.d(d2);
        } catch (FileNotFoundException e2) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e2);
            }
            aVar.c(e2);
        }
    }
}
