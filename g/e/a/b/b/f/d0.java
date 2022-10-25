package g.e.a.b.b.f;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import g.c.b.b.f;
import g.e.a.b.b.g.a;
import g.e.a.b.e.b.d;
import java.util.HashMap;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

public final class d0 extends c {
    @GuardedBy("connectionStatus")
    public final HashMap<a0, b0> c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public final Context f2861d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Handler f2862e;

    /* renamed from: f  reason: collision with root package name */
    public final c0 f2863f;

    /* renamed from: g  reason: collision with root package name */
    public final a f2864g;

    /* renamed from: h  reason: collision with root package name */
    public final long f2865h;

    /* renamed from: i  reason: collision with root package name */
    public final long f2866i;

    public d0(Context context, Looper looper) {
        c0 c0Var = new c0(this);
        this.f2863f = c0Var;
        this.f2861d = context.getApplicationContext();
        this.f2862e = new d(looper, c0Var);
        this.f2864g = a.b();
        this.f2865h = 5000;
        this.f2866i = 300000;
    }

    public final boolean b(a0 a0Var, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean z;
        f.o(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.c) {
            try {
                b0 b0Var = this.c.get(a0Var);
                if (b0Var == null) {
                    b0Var = new b0(this, a0Var);
                    b0Var.a.put(serviceConnection, serviceConnection);
                    b0Var.a(str, (Executor) null);
                    this.c.put(a0Var, b0Var);
                } else {
                    this.f2862e.removeMessages(0, a0Var);
                    if (!b0Var.a.containsKey(serviceConnection)) {
                        b0Var.a.put(serviceConnection, serviceConnection);
                        int i2 = b0Var.b;
                        if (i2 == 1) {
                            ((t) serviceConnection).onServiceConnected(b0Var.f2859f, b0Var.f2857d);
                        } else if (i2 == 2) {
                            b0Var.a(str, (Executor) null);
                        }
                    } else {
                        String a0Var2 = a0Var.toString();
                        StringBuilder sb = new StringBuilder(a0Var2.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(a0Var2);
                        throw new IllegalStateException(sb.toString());
                    }
                }
                z = b0Var.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
