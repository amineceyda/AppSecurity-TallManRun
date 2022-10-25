package g.e.c;

import com.google.gson.JsonIOException;
import g.e.c.t.z.b;
import g.e.c.v.a;
import g.e.c.v.c;
import java.io.IOException;

public abstract class q<T> {
    public abstract T a(a aVar) throws IOException;

    public final j b(T t) {
        try {
            b bVar = new b();
            c(bVar, t);
            return bVar.h0();
        } catch (IOException e2) {
            throw new JsonIOException((Throwable) e2);
        }
    }

    public abstract void c(c cVar, T t) throws IOException;
}
