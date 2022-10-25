package g.e.a.b.f.b;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import g.e.a.b.b.h.c;
import java.util.Objects;

public final class w9 {
    public final n4 a;

    public w9(n4 n4Var) {
        this.a = n4Var;
    }

    public final void a(String str, Bundle bundle) {
        String str2;
        this.a.b().h();
        if (!this.a.g()) {
            if (bundle.isEmpty()) {
                str2 = null;
            } else {
                if (true == str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str3 : bundle.keySet()) {
                    builder.appendQueryParameter(str3, bundle.getString(str3));
                }
                str2 = builder.build().toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                this.a.t().u.b(str2);
                p3 p3Var = this.a.t().v;
                Objects.requireNonNull((c) this.a.n);
                p3Var.b(System.currentTimeMillis());
            }
        }
    }

    public final boolean b() {
        return this.a.t().v.a() > 0;
    }

    public final boolean c() {
        if (!b()) {
            return false;
        }
        Objects.requireNonNull((c) this.a.n);
        if (System.currentTimeMillis() - this.a.t().v.a() > this.a.f3258g.q((String) null, s2.R)) {
            return true;
        }
        return false;
    }
}
