package g.e.a.a.f;

import android.content.Context;
import g.e.a.a.f.b0.a;
import g.e.a.a.f.j;
import g.e.a.a.f.z.e;
import g.e.a.a.f.z.h.n;
import g.e.a.a.f.z.h.u;
import g.e.a.a.f.z.h.w;
import java.util.Objects;

public class s implements r {

    /* renamed from: e  reason: collision with root package name */
    public static volatile t f2774e;
    public final a a;
    public final a b;
    public final e c;

    /* renamed from: d  reason: collision with root package name */
    public final u f2775d;

    public s(a aVar, a aVar2, e eVar, u uVar, w wVar) {
        this.a = aVar;
        this.b = aVar2;
        this.c = eVar;
        this.f2775d = uVar;
        wVar.a.execute(new n(wVar));
    }

    public static s a() {
        t tVar = f2774e;
        if (tVar != null) {
            return ((j) tVar).n.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f2774e == null) {
            synchronized (s.class) {
                if (f2774e == null) {
                    Objects.requireNonNull(context);
                    Class<Context> cls = Context.class;
                    f2774e = new j(context, (j.a) null);
                }
            }
        }
    }
}
