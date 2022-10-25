package f.a.a.a.k;

import ch.qos.logback.core.joran.spi.ActionException;
import f.a.a.b.q.c.c;
import f.a.a.b.q.c.d;
import f.a.a.b.q.d.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import org.xml.sax.Attributes;

public class b extends f.a.a.b.q.b.b implements c {

    /* renamed from: e  reason: collision with root package name */
    public List<d> f1651e;

    public void h(d dVar) {
        this.f1651e.add(dVar);
    }

    public void s(i iVar, String str, Attributes attributes) throws ActionException {
        this.f1651e = new ArrayList();
        if (iVar.f1743i.contains(this)) {
            iVar.p("InPlayListener " + this + " has been already registered");
            return;
        }
        iVar.f1743i.add(this);
    }

    public void u(i iVar, String str) throws ActionException {
        iVar.f1743i.remove(this);
        Object u = iVar.u();
        if (u instanceof c) {
            c cVar = (c) u;
            HashMap hashMap = new HashMap(iVar.f1741g);
            List<d> list = this.f1651e;
            Objects.requireNonNull(cVar);
            cVar.f1652k = new a(list, (String) null, hashMap);
        }
    }
}
