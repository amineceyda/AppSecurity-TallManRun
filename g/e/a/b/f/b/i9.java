package g.e.a.b.f.b;

import android.os.Bundle;
import android.text.TextUtils;

public final class i9 implements p9 {
    public final /* synthetic */ k9 a;

    public i9(k9 k9Var) {
        this.a = k9Var;
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            n4 n4Var = this.a.f3238l;
            if (n4Var != null) {
                n4Var.d().f3136f.b("AppId not known when logging event", "_err");
                return;
            }
            return;
        }
        this.a.b().r(new h9(this, str, bundle));
    }
}
