package g.i.c.a.a.n.g.b;

import android.os.SystemClock;
import g.c.b.b.f;
import g.i.c.a.a.r.e;

public class b {
    public boolean a;
    public long b;
    public long c;

    /* renamed from: d  reason: collision with root package name */
    public long f4481d;

    /* renamed from: e  reason: collision with root package name */
    public long f4482e;

    /* renamed from: f  reason: collision with root package name */
    public int f4483f = -1;

    public b(boolean z, long j2) {
        this.a = z;
        this.f4482e = j2 * 2;
        a();
    }

    public synchronized void a() {
        if (this.f4483f == 0) {
            c();
        }
        this.f4483f = -1;
        this.c = 0;
        this.f4481d = 0;
    }

    public synchronized void b() {
        if (this.f4483f == 0) {
            c();
        }
        this.f4483f = 0;
        this.b = SystemClock.elapsedRealtime();
    }

    public synchronized void c() {
        d();
        this.f4483f = 1;
    }

    public final synchronized void d() {
        if (this.f4483f == 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.b;
            long j2 = this.f4482e;
            if (elapsedRealtime > j2) {
                if (e.b.a.a) {
                    f.K("TimePinProcessor", "心跳间隔异常，expected interval = " + (((float) this.f4482e) / 2.0f) + ", actual interval = " + j2);
                }
                elapsedRealtime = j2;
            }
            if (this.a) {
                this.c += elapsedRealtime;
            } else {
                this.f4481d += elapsedRealtime;
            }
            this.b = SystemClock.elapsedRealtime();
        }
    }
}
