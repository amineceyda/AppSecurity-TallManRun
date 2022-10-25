package f.a.a.b.w;

import f.a.a.b.c;
import f.a.a.b.d;
import f.a.a.b.x.a;
import java.io.PrintStream;

public class e implements c {
    public int b = 0;
    public d c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f1844d;

    public e(d dVar, Object obj) {
        this.c = dVar;
        this.f1844d = obj;
    }

    public void b(String str) {
        h(new a(str, i()));
    }

    public void c(String str, Throwable th) {
        h(new a(str, i(), th));
    }

    public void g(d dVar) {
        d dVar2 = this.c;
        if (dVar2 == null) {
            this.c = dVar;
        } else if (dVar2 != dVar) {
            throw new IllegalStateException("Context has been already set");
        }
    }

    public void h(f.a.a.b.x.d dVar) {
        d dVar2 = this.c;
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

    public Object i() {
        return this.f1844d;
    }
}
