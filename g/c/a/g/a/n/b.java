package g.c.a.g.a.n;

import g.c.a.m.e;
import i.o.b.p;

public final /* synthetic */ class b implements p {
    public final /* synthetic */ e b;

    public /* synthetic */ b(e eVar) {
        this.b = eVar;
    }

    public final Object d(Object obj, Object obj2) {
        e eVar = this.b;
        Integer num = (Integer) obj;
        String str = (String) obj2;
        if (eVar != null) {
            eVar.a(null);
        }
        h.a.info("请求配置失败 code {}, message {}", (Object) num, (Object) str);
        return null;
    }
}
