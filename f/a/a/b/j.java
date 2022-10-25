package f.a.a.b;

import f.a.a.b.w.d;
import f.a.a.b.w.g;
import f.a.a.b.x.h;
import g.a.a.a.a;

public abstract class j<E> extends d implements a<E> {

    /* renamed from: e  reason: collision with root package name */
    public boolean f1697e = false;

    /* renamed from: f  reason: collision with root package name */
    public ThreadLocal<Boolean> f1698f = new ThreadLocal<>();

    /* renamed from: g  reason: collision with root package name */
    public String f1699g;

    /* renamed from: h  reason: collision with root package name */
    public g<E> f1700h = new g<>();

    /* renamed from: i  reason: collision with root package name */
    public int f1701i = 0;

    /* renamed from: j  reason: collision with root package name */
    public int f1702j = 0;

    public void a(E e2) {
        Boolean bool = Boolean.TRUE;
        if (!bool.equals(this.f1698f.get())) {
            try {
                this.f1698f.set(bool);
                if (!this.f1697e) {
                    int i2 = this.f1701i;
                    this.f1701i = i2 + 1;
                    if (i2 < 3) {
                        o(new h("Attempted to append to non started appender [" + this.f1699g + "].", this));
                    }
                } else if (this.f1700h.a(e2) != f.a.a.b.w.h.DENY) {
                    s(e2);
                    this.f1698f.set(Boolean.FALSE);
                    return;
                }
                this.f1698f.set(Boolean.FALSE);
            } catch (Exception e3) {
                int i3 = this.f1702j;
                this.f1702j = i3 + 1;
                if (i3 < 3) {
                    c("Appender [" + this.f1699g + "] failed to append.", e3);
                }
            } catch (Throwable th) {
                this.f1698f.set(Boolean.FALSE);
                throw th;
            }
        }
    }

    public void e(String str) {
        this.f1699g = str;
    }

    public String getName() {
        return this.f1699g;
    }

    public boolean k() {
        return this.f1697e;
    }

    public abstract void s(E e2);

    public void start() {
        this.f1697e = true;
    }

    public void stop() {
        this.f1697e = false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("[");
        return a.f(sb, this.f1699g, "]");
    }
}
