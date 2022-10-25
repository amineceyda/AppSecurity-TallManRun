package g.e.a.b.f.b;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

public final class f6 implements p9 {
    public final /* synthetic */ q6 a;

    public f6(q6 q6Var) {
        this.a = q6Var;
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.a.m("auto", "_err", bundle);
            return;
        }
        Objects.requireNonNull(this.a);
        n4.j();
        throw null;
    }
}
