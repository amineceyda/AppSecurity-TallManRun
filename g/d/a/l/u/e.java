package g.d.a.l.u;

import android.util.Base64;
import g.d.a.l.s.d;
import g.d.a.l.u.n;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public final class e<Model, Data> implements n<Model, Data> {
    public final a<Data> a;

    public interface a<Data> {
    }

    public static final class b<Data> implements d<Data> {
        public final String b;
        public final a<Data> c;

        /* renamed from: d  reason: collision with root package name */
        public Data f2545d;

        public b(String str, a<Data> aVar) {
            this.b = str;
            this.c = aVar;
        }

        public Class<Data> a() {
            Objects.requireNonNull((c.a) this.c);
            return InputStream.class;
        }

        public void b() {
            try {
                a<Data> aVar = this.c;
                Data data = this.f2545d;
                Objects.requireNonNull((c.a) aVar);
                ((InputStream) data).close();
            } catch (IOException unused) {
            }
        }

        public void cancel() {
        }

        public g.d.a.l.a e() {
            return g.d.a.l.a.LOCAL;
        }

        public void f(g.d.a.e eVar, d.a<? super Data> aVar) {
            try {
                Data a = ((c.a) this.c).a(this.b);
                this.f2545d = a;
                aVar.d(a);
            } catch (IllegalArgumentException e2) {
                aVar.c(e2);
            }
        }
    }

    public static final class c<Model> implements o<Model, InputStream> {
        public final a<InputStream> a = new a(this);

        public class a implements a<InputStream> {
            public a(c cVar) {
            }

            public Object a(String str) throws IllegalArgumentException {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    } else if (str.substring(0, indexOf).endsWith(";base64")) {
                        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    } else {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                } else {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
            }
        }

        public n<Model, InputStream> b(r rVar) {
            return new e(this.a);
        }

        public void c() {
        }
    }

    public e(a<Data> aVar) {
        this.a = aVar;
    }

    public n.a<Data> a(Model model, int i2, int i3, g.d.a.l.n nVar) {
        return new n.a<>(new g.d.a.q.b(model), new b(model.toString(), this.a));
    }

    public boolean b(Model model) {
        return model.toString().startsWith("data:image");
    }
}
