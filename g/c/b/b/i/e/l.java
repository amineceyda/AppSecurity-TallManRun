package g.c.b.b.i.e;

import android.content.Context;
import g.c.b.b.c;
import g.c.b.b.i.d;
import g.c.b.b.j.a;
import java.util.Map;
import java.util.Objects;

public final class l implements d.a {
    public final /* synthetic */ k a;

    public l(k kVar) {
        this.a = kVar;
    }

    public void a(Context context, String str) {
        String str2 = str;
        if (str2 != null) {
            c.b bVar = c.f2226m;
            if (bVar.a().f2232i.contains(str2)) {
                long currentTimeMillis = System.currentTimeMillis();
                Objects.requireNonNull(this.a);
                if (currentTimeMillis - 0 > 200) {
                    a aVar = r1;
                    a aVar2 = new a(str, (String) null, 0, (String) null, (String) null, (String) null, (String) null, 0, false, false, (Map) null, 2046);
                    this.a.e(aVar);
                    bVar.a().f2232i.clear();
                }
            }
        }
    }
}
