package f.a.a.a.i;

import f.a.a.a.l.c;
import java.util.concurrent.atomic.AtomicLong;

public class n extends e {

    /* renamed from: g  reason: collision with root package name */
    public AtomicLong f1644g = new AtomicLong(System.currentTimeMillis());

    public String h(Object obj) {
        c cVar = (c) obj;
        return Long.toString(this.f1644g.getAndIncrement());
    }
}
