package g.e.b.l;

import android.content.Context;
import g.e.b.h;
import g.e.b.l.j.f;
import g.e.b.l.j.j.a0;
import g.e.b.l.j.j.v;
import g.e.b.l.j.j.w;
import java.util.Objects;

public class i {
    public final a0 a;

    public i(a0 a0Var) {
        this.a = a0Var;
    }

    public static i a() {
        h b = h.b();
        b.a();
        i iVar = (i) b.f3443d.a(i.class);
        Objects.requireNonNull(iVar, "FirebaseCrashlytics component is not present.");
        return iVar;
    }

    public void b(String str) {
        a0 a0Var = this.a;
        Objects.requireNonNull(a0Var);
        long currentTimeMillis = System.currentTimeMillis() - a0Var.c;
        v vVar = a0Var.f3475f;
        vVar.f3522e.b(new w(vVar, currentTimeMillis, str));
    }

    public void c(String str, String str2) {
        v vVar = this.a.f3475f;
        Objects.requireNonNull(vVar);
        try {
            vVar.f3521d.a(str, str2);
        } catch (IllegalArgumentException e2) {
            Context context = vVar.a;
            if (context != null) {
                if ((context.getApplicationInfo().flags & 2) != 0) {
                    throw e2;
                }
            }
            f.a.c("Attempting to set custom attribute with null key, ignoring.");
        }
    }
}
