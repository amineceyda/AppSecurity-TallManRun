package g.e.a.b.f.b;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

public final class u5 implements Runnable {
    public final /* synthetic */ q6 b;

    public u5(q6 q6Var) {
        this.b = q6Var;
    }

    public final void run() {
        w9 w9Var = this.b.n;
        w9Var.a.b().h();
        if (w9Var.b()) {
            if (w9Var.c()) {
                w9Var.a.t().u.b((String) null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1);
                w9Var.a.v().o("auto", "_cmpx", bundle);
            } else {
                String a = w9Var.a.t().u.a();
                if (TextUtils.isEmpty(a)) {
                    w9Var.a.d().f3137g.a("Cache still valid but referrer not found");
                } else {
                    long a2 = ((w9Var.a.t().v.a() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(a);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String next : parse.getQueryParameterNames()) {
                        bundle2.putString(next, parse.getQueryParameter(next));
                    }
                    ((Bundle) pair.second).putLong("_cc", a2);
                    Object obj = pair.first;
                    w9Var.a.v().o(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                w9Var.a.t().u.b((String) null);
            }
            w9Var.a.t().v.b(0);
        }
    }
}
