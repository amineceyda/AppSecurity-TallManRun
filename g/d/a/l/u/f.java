package g.d.a.l.u;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import g.d.a.l.s.d;
import g.d.a.l.u.n;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class f<Data> implements n<File, Data> {
    public final d<Data> a;

    public static class a<Data> implements o<File, Data> {
        public final d<Data> a;

        public a(d<Data> dVar) {
            this.a = dVar;
        }

        public final n<File, Data> b(r rVar) {
            return new f(this.a);
        }

        public final void c() {
        }
    }

    public static class b extends a<ParcelFileDescriptor> {

        public class a implements d<ParcelFileDescriptor> {
            public Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            public Object b(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }

            public void c(Object obj) throws IOException {
                ((ParcelFileDescriptor) obj).close();
            }
        }

        public b() {
            super(new a());
        }
    }

    public static final class c<Data> implements g.d.a.l.s.d<Data> {
        public final File b;
        public final d<Data> c;

        /* renamed from: d  reason: collision with root package name */
        public Data f2546d;

        public c(File file, d<Data> dVar) {
            this.b = file;
            this.c = dVar;
        }

        public Class<Data> a() {
            return this.c.a();
        }

        public void b() {
            Data data = this.f2546d;
            if (data != null) {
                try {
                    this.c.c(data);
                } catch (IOException unused) {
                }
            }
        }

        public void cancel() {
        }

        public g.d.a.l.a e() {
            return g.d.a.l.a.LOCAL;
        }

        public void f(g.d.a.e eVar, d.a<? super Data> aVar) {
            try {
                Data b2 = this.c.b(this.b);
                this.f2546d = b2;
                aVar.d(b2);
            } catch (FileNotFoundException e2) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e2);
                }
                aVar.c(e2);
            }
        }
    }

    public interface d<Data> {
        Class<Data> a();

        Data b(File file) throws FileNotFoundException;

        void c(Data data) throws IOException;
    }

    public static class e extends a<InputStream> {

        public class a implements d<InputStream> {
            public Class<InputStream> a() {
                return InputStream.class;
            }

            public Object b(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }

            public void c(Object obj) throws IOException {
                ((InputStream) obj).close();
            }
        }

        public e() {
            super(new a());
        }
    }

    public f(d<Data> dVar) {
        this.a = dVar;
    }

    public n.a a(Object obj, int i2, int i3, g.d.a.l.n nVar) {
        File file = (File) obj;
        return new n.a(new g.d.a.q.b(file), new c(file, this.a));
    }

    public /* bridge */ /* synthetic */ boolean b(Object obj) {
        File file = (File) obj;
        return true;
    }
}
