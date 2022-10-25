package g.e.a.b.b.f;

import android.content.ServiceConnection;
import g.c.b.b.f;
import java.util.concurrent.Executor;

public abstract class c {
    public static final Object a = new Object();
    public static d0 b;

    public final void a(String str, String str2, int i2, ServiceConnection serviceConnection, String str3, boolean z) {
        a0 a0Var = new a0(str, str2, i2, z);
        d0 d0Var = (d0) this;
        f.o(serviceConnection, "ServiceConnection must not be null");
        synchronized (d0Var.c) {
            b0 b0Var = d0Var.c.get(a0Var);
            if (b0Var == null) {
                String a0Var2 = a0Var.toString();
                StringBuilder sb = new StringBuilder(a0Var2.length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(a0Var2);
                throw new IllegalStateException(sb.toString());
            } else if (b0Var.a.containsKey(serviceConnection)) {
                b0Var.a.remove(serviceConnection);
                if (b0Var.a.isEmpty()) {
                    d0Var.f2862e.sendMessageDelayed(d0Var.f2862e.obtainMessage(0, a0Var), d0Var.f2865h);
                }
            } else {
                String a0Var3 = a0Var.toString();
                StringBuilder sb2 = new StringBuilder(a0Var3.length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(a0Var3);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public abstract boolean b(a0 a0Var, ServiceConnection serviceConnection, String str, Executor executor);
}
