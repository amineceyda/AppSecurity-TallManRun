package g.c.c.n;

import g.c.a.m.f;
import i.o.b.p;

public final /* synthetic */ class c implements p {
    public final /* synthetic */ f b;

    public /* synthetic */ c(f fVar) {
        this.b = fVar;
    }

    public final Object d(Object obj, Object obj2) {
        f fVar = this.b;
        Integer num = (Integer) obj;
        String str = (String) obj2;
        g.a.info("请求配置失败 code {}, message {}", (Object) num, (Object) str);
        if (fVar != null) {
            fVar.a(null, num, str);
        }
        return null;
    }
}
