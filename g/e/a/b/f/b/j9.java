package g.e.a.b.f.b;

import g.e.a.b.e.c.f4;
import g.e.a.b.e.c.v3;
import java.util.ArrayList;
import java.util.List;

public final class j9 {
    public f4 a;
    public List b;
    public List c;

    /* renamed from: d  reason: collision with root package name */
    public long f3208d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ k9 f3209e;

    public /* synthetic */ j9(k9 k9Var) {
        this.f3209e = k9Var;
    }

    public final boolean a(long j2, v3 v3Var) {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        if (this.b == null) {
            this.b = new ArrayList();
        }
        if (this.c.size() > 0 && ((((v3) this.c.get(0)).v() / 1000) / 60) / 60 != ((v3Var.v() / 1000) / 60) / 60) {
            return false;
        }
        long e2 = this.f3208d + ((long) v3Var.e());
        this.f3209e.K();
        if (e2 >= ((long) Math.max(0, ((Integer) s2.f3332i.a((Object) null)).intValue()))) {
            return false;
        }
        this.f3208d = e2;
        this.c.add(v3Var);
        this.b.add(Long.valueOf(j2));
        int size = this.c.size();
        this.f3209e.K();
        if (size >= Math.max(1, ((Integer) s2.f3333j.a((Object) null)).intValue())) {
            return false;
        }
        return true;
    }
}
