package f.a.a.b.w;

import f.a.a.b.c;
import f.a.a.b.x.a;
import f.a.a.b.x.b;
import f.a.a.b.x.h;
import java.io.PrintStream;

public class d implements c {
    public int b;
    public f.a.a.b.d c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f1843d;

    public d() {
        this.b = 0;
        this.f1843d = this;
    }

    public d(c cVar) {
        this.b = 0;
        this.f1843d = cVar;
    }

    public void c(String str, Throwable th) {
        o(new a(str, this.f1843d, th));
    }

    public void g(f.a.a.b.d dVar) {
        f.a.a.b.d dVar2 = this.c;
        if (dVar2 == null) {
            this.c = dVar;
        } else if (dVar2 != dVar) {
            throw new IllegalStateException("Context has been already set");
        }
    }

    public void m(String str) {
        o(new a(str, this.f1843d));
    }

    public void n(String str) {
        o(new b(str, this.f1843d));
    }

    public void o(f.a.a.b.x.d dVar) {
        f.a.a.b.d dVar2 = this.c;
        if (dVar2 == null) {
            int i2 = this.b;
            this.b = i2 + 1;
            if (i2 == 0) {
                PrintStream printStream = System.out;
                printStream.println("LOGBACK: No context given for " + this);
                return;
            }
            return;
        }
        c cVar = dVar2.f1685d;
        if (cVar != null) {
            cVar.a(dVar);
        }
    }

    public void p(String str) {
        o(new h(str, this.f1843d));
    }

    public void q(String str, Throwable th) {
        o(new h(str, this.f1843d, th));
    }

    public f.a.a.b.d r() {
        return this.c;
    }
}
