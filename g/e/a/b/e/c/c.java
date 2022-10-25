package g.e.a.b.e.c;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class c {
    public b a;
    public b b;
    public final List c;

    public c() {
        this.a = new b("", 0, (Map) null);
        this.b = new b("", 0, (Map) null);
        this.c = new ArrayList();
    }

    public c(b bVar) {
        this.a = bVar;
        this.b = bVar.clone();
        this.c = new ArrayList();
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        c cVar = new c(this.a.clone());
        for (b a2 : this.c) {
            cVar.c.add(a2.clone());
        }
        return cVar;
    }
}
