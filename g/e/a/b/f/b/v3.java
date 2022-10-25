package g.e.a.b.f.b;

import g.e.a.b.b.i.a;
import g.e.a.b.b.i.b;

public final class v3 {
    public final n4 a;

    public v3(k9 k9Var) {
        this.a = k9Var.f3238l;
    }

    public final boolean a() {
        try {
            a a2 = b.a(this.a.a);
            if (a2 == null) {
                this.a.d().n.a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            } else if (a2.a.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e2) {
            this.a.d().n.b("Failed to retrieve Play Store version for Install Referrer", e2);
            return false;
        }
    }
}
