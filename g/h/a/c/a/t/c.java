package g.h.a.c.a.t;

import g.h.a.c.a.n;
import g.h.a.c.a.o;
import g.h.a.c.a.p;
import g.h.a.c.a.r.a;
import i.o.c.h;

public final class c extends a {
    public boolean b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public n f4051d;

    /* renamed from: e  reason: collision with root package name */
    public String f4052e;

    /* renamed from: f  reason: collision with root package name */
    public float f4053f;

    public void b(p pVar, float f2) {
        h.e(pVar, "youTubePlayer");
        this.f4053f = f2;
    }

    public void g(p pVar, String str) {
        h.e(pVar, "youTubePlayer");
        h.e(str, "videoId");
        this.f4052e = str;
    }

    public void h(p pVar, o oVar) {
        h.e(pVar, "youTubePlayer");
        h.e(oVar, "state");
        int ordinal = oVar.ordinal();
        if (ordinal == 2) {
            this.c = false;
        } else if (ordinal == 3) {
            this.c = true;
        } else if (ordinal == 4) {
            this.c = false;
        }
    }

    public void p(p pVar, n nVar) {
        h.e(pVar, "youTubePlayer");
        h.e(nVar, "error");
        if (nVar == n.HTML_5_PLAYER) {
            this.f4051d = nVar;
        }
    }
}
