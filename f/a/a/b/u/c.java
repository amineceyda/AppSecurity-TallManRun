package f.a.a.b.u;

import ch.qos.logback.core.rolling.RolloverFailure;
import f.a.a.b.f;
import f.a.a.b.u.j.b;
import f.a.a.b.w.d;
import f.a.a.b.w.i;

public abstract class c extends d implements i {

    /* renamed from: e  reason: collision with root package name */
    public b f1797e = b.b;

    /* renamed from: f  reason: collision with root package name */
    public f.a.a.b.u.j.i f1798f;

    /* renamed from: g  reason: collision with root package name */
    public String f1799g;

    /* renamed from: h  reason: collision with root package name */
    public f<?> f1800h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1801i;

    public boolean k() {
        return this.f1801i;
    }

    public abstract String s();

    public void start() {
        this.f1801i = true;
    }

    public void stop() {
        this.f1801i = false;
    }

    public abstract void t() throws RolloverFailure;
}
