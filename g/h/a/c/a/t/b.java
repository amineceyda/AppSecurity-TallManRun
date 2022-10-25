package g.h.a.c.a.t;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import i.j;
import i.o.c.h;
import i.o.c.i;
import java.util.Objects;

public final class b extends BroadcastReceiver {
    public i.o.b.a<j> a = C0141b.b;
    public i.o.b.a<j> b = a.b;

    public static final class a extends i implements i.o.b.a<j> {
        public static final a b = new a();

        public a() {
            super(0);
        }

        public Object a() {
            return j.a;
        }
    }

    /* renamed from: g.h.a.c.a.t.b$b  reason: collision with other inner class name */
    public static final class C0141b extends i implements i.o.b.a<j> {
        public static final C0141b b = new C0141b();

        public C0141b() {
            super(0);
        }

        public Object a() {
            return j.a;
        }
    }

    public void onReceive(Context context, Intent intent) {
        h.e(context, "context");
        h.e(intent, "intent");
        h.e(context, "context");
        Object systemService = context.getSystemService("connectivity");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        (activeNetworkInfo != null && activeNetworkInfo.isConnected() ? this.b : this.a).a();
    }
}
