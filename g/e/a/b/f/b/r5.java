package g.e.a.b.f.b;

import android.os.Bundle;
import java.util.Iterator;
import java.util.TreeSet;

public final /* synthetic */ class r5 implements Runnable {
    public final /* synthetic */ q6 b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ r5(q6 q6Var, Bundle bundle) {
        this.b = q6Var;
        this.c = bundle;
    }

    public final void run() {
        q6 q6Var = this.b;
        Bundle bundle = this.c;
        if (bundle == null) {
            q6Var.a.t().w.b(new Bundle());
            return;
        }
        Bundle a = q6Var.a.t().w.a();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (q6Var.a.A().S(obj)) {
                    q6Var.a.A().z(q6Var.p, (String) null, 27, (String) null, (String) null, 0);
                }
                q6Var.a.d().f3141k.c("Invalid default event parameter type. Name, value", str, obj);
            } else if (q9.U(str)) {
                q6Var.a.d().f3141k.b("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                a.remove(str);
            } else {
                q9 A = q6Var.a.A();
                f fVar = q6Var.a.f3258g;
                if (A.M("param", str, 100, obj)) {
                    q6Var.a.A().A(a, str, obj);
                }
            }
        }
        q6Var.a.A();
        int l2 = q6Var.a.f3258g.l();
        if (a.size() > l2) {
            Iterator it = new TreeSet(a.keySet()).iterator();
            int i2 = 0;
            while (it.hasNext()) {
                String str2 = (String) it.next();
                i2++;
                if (i2 > l2) {
                    a.remove(str2);
                }
            }
            q6Var.a.A().z(q6Var.p, (String) null, 26, (String) null, (String) null, 0);
            q6Var.a.d().f3141k.a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        q6Var.a.t().w.b(a);
        f8 y = q6Var.a.y();
        y.h();
        y.i();
        y.t(new n7(y, y.q(false), a));
    }
}
