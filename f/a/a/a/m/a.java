package f.a.a.a.m;

import f.a.a.a.b;
import f.a.a.b.w.d;
import f.a.a.b.w.h;
import f.a.a.b.w.i;
import org.slf4j.Marker;

public abstract class a extends d implements i {

    /* renamed from: e  reason: collision with root package name */
    public boolean f1674e = false;

    public boolean k() {
        return this.f1674e;
    }

    public abstract h s(Marker marker, b bVar, f.a.a.a.a aVar, String str, Object[] objArr, Throwable th);

    public void start() {
        this.f1674e = true;
    }

    public void stop() {
        this.f1674e = false;
    }
}
