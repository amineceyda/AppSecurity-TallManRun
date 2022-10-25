package g.e.b.j.a.c;

import android.os.Bundle;
import g.e.a.b.f.a.a;
import g.e.a.b.f.b.k5;
import g.e.b.l.f;
import java.util.Set;

public final class c implements a.C0110a {
    public final /* synthetic */ d a;

    public c(d dVar) {
        this.a = dVar;
    }

    public final void a(String str, String str2, Bundle bundle, long j2) {
        if (this.a.a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            Set set = b.a;
            String a2 = k5.a(str2);
            if (a2 != null) {
                str2 = a2;
            }
            bundle2.putString("events", str2);
            ((f) this.a.b).a(2, bundle2);
        }
    }
}
