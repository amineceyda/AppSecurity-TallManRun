package g.d.a.m;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import g.d.a.g;
import g.d.a.m.c;
import g.d.a.p.b;
import g.d.a.r.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public final class e implements c {
    public final Context b;
    public final c.a c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2629d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2630e;

    /* renamed from: f  reason: collision with root package name */
    public final BroadcastReceiver f2631f = new a();

    public class a extends BroadcastReceiver {
        public a() {
        }

        public void onReceive(Context context, Intent intent) {
            e eVar = e.this;
            boolean z = eVar.f2629d;
            eVar.f2629d = eVar.l(context);
            if (z != e.this.f2629d) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    StringBuilder i2 = g.a.a.a.a.i("connectivity changed, isConnected: ");
                    i2.append(e.this.f2629d);
                    Log.d("ConnectivityMonitor", i2.toString());
                }
                e eVar2 = e.this;
                c.a aVar = eVar2.c;
                boolean z2 = eVar2.f2629d;
                g.b bVar = (g.b) aVar;
                Objects.requireNonNull(bVar);
                if (z2) {
                    synchronized (g.this) {
                        n nVar = bVar.a;
                        Iterator it = ((ArrayList) j.e(nVar.a)).iterator();
                        while (it.hasNext()) {
                            b bVar2 = (b) it.next();
                            if (!bVar2.k() && !bVar2.e()) {
                                bVar2.clear();
                                if (!nVar.c) {
                                    bVar2.i();
                                } else {
                                    nVar.b.add(bVar2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public e(Context context, c.a aVar) {
        this.b = context.getApplicationContext();
        this.c = aVar;
    }

    public void a() {
        if (!this.f2630e) {
            this.f2629d = l(this.b);
            try {
                this.b.registerReceiver(this.f2631f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f2630e = true;
            } catch (SecurityException e2) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register", e2);
                }
            }
        }
    }

    public void e() {
        if (this.f2630e) {
            this.b.unregisterReceiver(this.f2631f);
            this.f2630e = false;
        }
    }

    public void k() {
    }

    @SuppressLint({"MissingPermission"})
    public boolean l(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        Objects.requireNonNull(connectivityManager, "Argument must not be null");
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (RuntimeException e2) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e2);
            }
            return true;
        }
    }
}
