package g.e.a.b.f.b;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public final class k3 extends b9 {
    public k3(k9 k9Var) {
        super(k9Var);
    }

    public final boolean k() {
        return false;
    }

    public final boolean l() {
        i();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.a.a.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }
}
