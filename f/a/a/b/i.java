package f.a.a.b;

import f.a.a.b.m.a;
import f.a.a.b.s.h;
import f.a.a.b.w.f;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantLock;

public class i<E> extends j<E> {

    /* renamed from: k  reason: collision with root package name */
    public a<E> f1694k;

    /* renamed from: l  reason: collision with root package name */
    public final ReentrantLock f1695l = new ReentrantLock(false);

    /* renamed from: m  reason: collision with root package name */
    public OutputStream f1696m;
    public boolean n = true;

    public void s(E e2) {
        if (this.f1697e) {
            x(e2);
        }
    }

    public void start() {
        int i2;
        if (this.f1694k == null) {
            o(new f.a.a.b.x.a(g.a.a.a.a.f(g.a.a.a.a.i("No encoder set for the appender named \""), this.f1699g, "\"."), this));
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (this.f1696m == null) {
            o(new f.a.a.b.x.a(g.a.a.a.a.f(g.a.a.a.a.i("No output stream set for the appender named \""), this.f1699g, "\"."), this));
            i2++;
        }
        if (i2 == 0) {
            this.f1697e = true;
        }
    }

    public void stop() {
        this.f1695l.lock();
        try {
            t();
            this.f1697e = false;
        } finally {
            this.f1695l.unlock();
        }
    }

    public void t() {
        if (this.f1696m != null) {
            try {
                u();
                this.f1696m.close();
                this.f1696m = null;
            } catch (IOException e2) {
                o(new f.a.a.b.x.a("Could not close output stream for OutputStreamAppender.", this, e2));
            }
        }
    }

    public void u() {
        a<E> aVar = this.f1694k;
        if (aVar != null && this.f1696m != null) {
            try {
                h hVar = (h) aVar;
                byte[] bArr = null;
                if (hVar.f1767e != null) {
                    StringBuilder sb = new StringBuilder();
                    Objects.requireNonNull(hVar.f1767e);
                    hVar.t(sb, (String) null);
                    Objects.requireNonNull(hVar.f1767e);
                    hVar.t(sb, (String) null);
                    bArr = hVar.u(sb.toString());
                }
                y(bArr);
            } catch (IOException e2) {
                this.f1697e = false;
                o(new f.a.a.b.x.a(g.a.a.a.a.f(g.a.a.a.a.i("Failed to write footer for appender named ["), this.f1699g, "]."), this, e2));
            }
        }
    }

    public void v() {
        a<E> aVar = this.f1694k;
        if (aVar != null && this.f1696m != null) {
            try {
                y(aVar.s());
            } catch (IOException e2) {
                this.f1697e = false;
                o(new f.a.a.b.x.a(g.a.a.a.a.f(g.a.a.a.a.i("Failed to initialize encoder for appender named ["), this.f1699g, "]."), this, e2));
            }
        }
    }

    public void w(OutputStream outputStream) {
        this.f1695l.lock();
        try {
            t();
            this.f1696m = outputStream;
            if (this.f1694k == null) {
                p("Encoder has not been set. Cannot invoke its init method.");
            } else {
                v();
            }
        } finally {
            this.f1695l.unlock();
        }
    }

    public void x(E e2) {
        if (this.f1697e) {
            try {
                if (e2 instanceof f) {
                    ((f) e2).b();
                }
                y(((h) this.f1694k).f1767e.s(e2).getBytes());
            } catch (IOException e3) {
                this.f1697e = false;
                o(new f.a.a.b.x.a("IO failure in appender", this, e3));
            }
        }
    }

    public final void y(byte[] bArr) throws IOException {
        if (bArr != null && bArr.length != 0) {
            this.f1695l.lock();
            try {
                this.f1696m.write(bArr);
                if (this.n) {
                    this.f1696m.flush();
                }
            } finally {
                this.f1695l.unlock();
            }
        }
    }
}
