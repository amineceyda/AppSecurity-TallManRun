package g.e.b.n.i;

import g.e.b.n.a;
import java.io.IOException;
import java.io.Writer;

public class d implements a {
    public final /* synthetic */ e a;

    public d(e eVar) {
        this.a = eVar;
    }

    public void a(Object obj, Writer writer) throws IOException {
        e eVar = this.a;
        f fVar = new f(writer, eVar.a, eVar.b, eVar.c, eVar.f3712d);
        fVar.g(obj, false);
        fVar.i();
        fVar.b.flush();
    }
}
