package g.e.c.t.z;

import g.e.c.g;
import g.e.c.j;
import g.e.c.k;
import g.e.c.l;
import g.e.c.m;
import g.e.c.v.c;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public final class b extends c {
    public static final Writer p = new a();
    public static final m q = new m("closed");

    /* renamed from: m  reason: collision with root package name */
    public final List<j> f3783m = new ArrayList();
    public String n;
    public j o = k.a;

    public class a extends Writer {
        public void close() throws IOException {
            throw new AssertionError();
        }

        public void flush() throws IOException {
            throw new AssertionError();
        }

        public void write(char[] cArr, int i2, int i3) {
            throw new AssertionError();
        }
    }

    public b() {
        super(p);
    }

    public c V(long j2) throws IOException {
        j0(new m((Number) Long.valueOf(j2)));
        return this;
    }

    public c X(Boolean bool) throws IOException {
        if (bool == null) {
            j0(k.a);
            return this;
        }
        j0(new m(bool));
        return this;
    }

    public c Y(Number number) throws IOException {
        if (number == null) {
            j0(k.a);
            return this;
        }
        if (!this.f3814g) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        j0(new m(number));
        return this;
    }

    public c b() throws IOException {
        g gVar = new g();
        j0(gVar);
        this.f3783m.add(gVar);
        return this;
    }

    public void close() throws IOException {
        if (this.f3783m.isEmpty()) {
            this.f3783m.add(q);
            return;
        }
        throw new IOException("Incomplete document");
    }

    public c d() throws IOException {
        l lVar = new l();
        j0(lVar);
        this.f3783m.add(lVar);
        return this;
    }

    public c e0(String str) throws IOException {
        if (str == null) {
            j0(k.a);
            return this;
        }
        j0(new m(str));
        return this;
    }

    public c f0(boolean z) throws IOException {
        j0(new m(Boolean.valueOf(z)));
        return this;
    }

    public void flush() throws IOException {
    }

    public c g() throws IOException {
        if (this.f3783m.isEmpty() || this.n != null) {
            throw new IllegalStateException();
        } else if (i0() instanceof g) {
            List<j> list = this.f3783m;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public j h0() {
        if (this.f3783m.isEmpty()) {
            return this.o;
        }
        StringBuilder i2 = g.a.a.a.a.i("Expected one JSON element but was ");
        i2.append(this.f3783m);
        throw new IllegalStateException(i2.toString());
    }

    public final j i0() {
        List<j> list = this.f3783m;
        return list.get(list.size() - 1);
    }

    public c j() throws IOException {
        if (this.f3783m.isEmpty() || this.n != null) {
            throw new IllegalStateException();
        } else if (i0() instanceof l) {
            List<j> list = this.f3783m;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public final void j0(j jVar) {
        if (this.n != null) {
            if (!(jVar instanceof k) || this.f3817j) {
                ((l) i0()).a.put(this.n, jVar);
            }
            this.n = null;
        } else if (this.f3783m.isEmpty()) {
            this.o = jVar;
        } else {
            j i0 = i0();
            if (i0 instanceof g) {
                ((g) i0).b.add(jVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public c q(String str) throws IOException {
        if (this.f3783m.isEmpty() || this.n != null) {
            throw new IllegalStateException();
        } else if (i0() instanceof l) {
            this.n = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public c t() throws IOException {
        j0(k.a);
        return this;
    }
}
