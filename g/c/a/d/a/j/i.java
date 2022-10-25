package g.c.a.d.a.j;

import android.text.TextUtils;
import g.h.a.c.a.p;
import g.h.a.c.a.r.a;
import i.o.c.h;

public class i extends a {
    public final /* synthetic */ k b;

    public i(k kVar) {
        this.b = kVar;
    }

    public void b(p pVar, float f2) {
        h.e(pVar, "youTubePlayer");
        if (!TextUtils.isEmpty(this.b.f1943i.lengthSeconds) && f2 >= Float.parseFloat(this.b.f1943i.lengthSeconds) - 1.0f) {
            this.b.f1942h.setVisibility(0);
            this.b.f1940f.setVisibility(0);
        }
    }

    public void j(p pVar) {
        h.e(pVar, "youTubePlayer");
        k kVar = this.b;
        kVar.p = pVar;
        pVar.f(kVar.f1943i.videoId, 0.0f);
    }
}
