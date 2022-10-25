package g.i.c.a.a.h;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.os.Process;
import g.i.c.a.a.b0.e;
import g.i.c.a.a.b0.f;
import java.util.Objects;

public class d {
    public int a = 2;
    public int b = 2;
    public int c = -1;

    /* renamed from: d  reason: collision with root package name */
    public final e<e> f4429d = new e<>();

    /* renamed from: e  reason: collision with root package name */
    public final BroadcastReceiver f4430e;

    /* renamed from: f  reason: collision with root package name */
    public final BroadcastReceiver f4431f;

    public class a extends BroadcastReceiver {
        public a() {
        }

        public void onReceive(Context context, Intent intent) {
            d dVar = d.this;
            Objects.requireNonNull(dVar);
            if (intent != null && intent.getIntExtra("app_process_id", -1) != Process.myPid()) {
                g.i.c.a.a.y.a.f(new c(dVar), 200);
            }
        }
    }

    public class b extends BroadcastReceiver {
        public b() {
        }

        public void onReceive(Context context, Intent intent) {
            d dVar = d.this;
            Objects.requireNonNull(dVar);
            int intExtra = intent.getIntExtra("app_status", 2);
            int intExtra2 = intent.getIntExtra("app_process_id", -1);
            if (intExtra2 != Process.myPid()) {
                if (dVar.c != intExtra2) {
                    if (intExtra == 1 && dVar.b != intExtra) {
                        dVar.c = intExtra2;
                    } else {
                        return;
                    }
                }
                dVar.b = intExtra;
                dVar.b();
            }
        }
    }

    public static class c {
        public static final d a = new d((a) null);
    }

    public d(a aVar) {
        a aVar2 = new a();
        this.f4430e = aVar2;
        b bVar = new b();
        this.f4431f = bVar;
        if (f.c() != null) {
            f.c().registerReceiver(bVar, new IntentFilter("action_app_in_out"));
            f.c().registerReceiver(aVar2, new IntentFilter("action_app_process_start"));
            Intent intent = new Intent("action_app_process_start");
            intent.putExtra("app_process_id", Process.myPid());
            PackageInfo d2 = f.d();
            intent.setPackage(d2 != null ? d2.packageName : "");
            f.c().sendBroadcast(intent);
        }
    }

    public static d a() {
        return c.a;
    }

    public final void b() {
        g.i.c.a.a.y.a.e(new b(this));
    }

    public final void c() {
        Intent intent = new Intent("action_app_in_out");
        intent.putExtra("app_status", this.a);
        PackageInfo d2 = f.d();
        intent.setPackage(d2 != null ? d2.packageName : "");
        intent.putExtra("app_process_id", Process.myPid());
        if (f.c() != null) {
            f.c().sendBroadcast(intent);
        }
    }
}
