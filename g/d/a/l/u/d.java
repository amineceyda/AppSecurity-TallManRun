package g.d.a.l.u;

import android.util.Log;
import g.d.a.e;
import g.d.a.l.s.d;
import g.d.a.l.u.n;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public class d implements n<File, ByteBuffer> {

    public static final class a implements g.d.a.l.s.d<ByteBuffer> {
        public final File b;

        public a(File file) {
            this.b = file;
        }

        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        public void b() {
        }

        public void cancel() {
        }

        public g.d.a.l.a e() {
            return g.d.a.l.a.LOCAL;
        }

        public void f(e eVar, d.a<? super ByteBuffer> aVar) {
            try {
                aVar.d(g.d.a.r.a.a(this.b));
            } catch (IOException e2) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e2);
                }
                aVar.c(e2);
            }
        }
    }

    public static class b implements o<File, ByteBuffer> {
        public n<File, ByteBuffer> b(r rVar) {
            return new d();
        }

        public void c() {
        }
    }

    public n.a a(Object obj, int i2, int i3, g.d.a.l.n nVar) {
        File file = (File) obj;
        return new n.a(new g.d.a.q.b(file), new a(file));
    }

    public /* bridge */ /* synthetic */ boolean b(Object obj) {
        File file = (File) obj;
        return true;
    }
}
