package g.e.b.l;

import android.os.Bundle;
import g.e.b.j.a.a;
import g.e.b.l.j.h.b;
import java.util.Locale;

public class f implements a.b {
    public b a;
    public b b;

    public void a(int i2, Bundle bundle) {
        g.e.b.l.j.f.a.e(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", new Object[]{Integer.valueOf(i2), bundle}));
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            b bVar = "clx".equals(bundle2.getString("_o")) ? this.a : this.b;
            if (bVar != null) {
                bVar.b(string, bundle2);
            }
        }
    }
}
