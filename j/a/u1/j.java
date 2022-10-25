package j.a.u1;

import g.a.a.a.a;
import g.c.b.b.f;

public final class j extends h {

    /* renamed from: d  reason: collision with root package name */
    public final Runnable f4659d;

    public j(Runnable runnable, long j2, i iVar) {
        super(j2, iVar);
        this.f4659d = runnable;
    }

    public void run() {
        try {
            this.f4659d.run();
        } finally {
            this.c.g();
        }
    }

    public String toString() {
        StringBuilder i2 = a.i("Task[");
        i2.append(f.B(this.f4659d));
        i2.append('@');
        i2.append(f.E(this.f4659d));
        i2.append(", ");
        i2.append(this.b);
        i2.append(", ");
        i2.append(this.c);
        i2.append(']');
        return i2.toString();
    }
}
