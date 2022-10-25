package g.e.a.a.f.z;

import g.e.a.a.b;
import g.e.a.a.f.z.h.q;
import g.e.a.a.f.z.h.r;
import g.e.a.a.f.z.h.t;
import h.a.a;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class f implements Object<t> {
    public final a<g.e.a.a.f.b0.a> a;

    public f(a<g.e.a.a.f.b0.a> aVar) {
        this.a = aVar;
    }

    public Object get() {
        g.e.a.a.f.b0.a aVar = this.a.get();
        HashMap hashMap = new HashMap();
        b bVar = b.DEFAULT;
        t.a.C0105a a2 = t.a.a();
        a2.b(30000);
        a2.c(86400000);
        hashMap.put(bVar, a2.a());
        b bVar2 = b.HIGHEST;
        t.a.C0105a a3 = t.a.a();
        a3.b(1000);
        a3.c(86400000);
        hashMap.put(bVar2, a3.a());
        b bVar3 = b.VERY_LOW;
        t.a.C0105a a4 = t.a.a();
        a4.b(86400000);
        a4.c(86400000);
        Set<t.b> unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(new t.b[]{t.b.NETWORK_UNMETERED, t.b.DEVICE_IDLE})));
        r.b bVar4 = (r.b) a4;
        Objects.requireNonNull(unmodifiableSet, "Null flags");
        bVar4.c = unmodifiableSet;
        hashMap.put(bVar3, bVar4.a());
        Objects.requireNonNull(aVar, "missing required property: clock");
        int size = hashMap.keySet().size();
        b.values();
        if (size >= 3) {
            new HashMap();
            return new q(aVar, hashMap);
        }
        throw new IllegalStateException("Not all priorities have been configured");
    }
}
