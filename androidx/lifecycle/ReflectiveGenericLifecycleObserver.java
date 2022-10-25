package androidx.lifecycle;

import e.k.b;
import e.k.e;
import e.k.f;
import e.k.h;

public class ReflectiveGenericLifecycleObserver implements f {
    public final Object b;
    public final b.a c;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.b = obj;
        this.c = b.c.b(obj.getClass());
    }

    public void d(h hVar, e.a aVar) {
        b.a aVar2 = this.c;
        Object obj = this.b;
        b.a.a(aVar2.a.get(aVar), hVar, aVar, obj);
        b.a.a(aVar2.a.get(e.a.ON_ANY), hVar, aVar, obj);
    }
}
