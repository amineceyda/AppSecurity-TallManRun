package g.c.a.e.k.a;

import android.content.Context;
import android.content.Intent;
import com.apkpure.aegon.components.install.AppInfo;
import g.c.a.e.c.c;
import g.c.a.e.k.a.d;
import java.util.Objects;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ d.a b;
    public final /* synthetic */ Context c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f1992d;

    public /* synthetic */ a(d.a aVar, Context context, String str) {
        this.b = aVar;
        this.c = context;
        this.f1992d = str;
    }

    public final void run() {
        d.a aVar = this.b;
        Context context = this.c;
        String str = this.f1992d;
        Objects.requireNonNull(aVar);
        AppInfo d2 = f.d(context, str);
        if (d2 != null) {
            synchronized (d.this.f1996e) {
                if (d.this.d()) {
                    d.this.f1997f.put(d2.packageName, d2);
                }
            }
        }
        Intent intent = new Intent(c.a);
        intent.putExtra("packageName", str);
        e.m.a.a.a(context).b(intent);
        Objects.requireNonNull(d.this);
    }
}
