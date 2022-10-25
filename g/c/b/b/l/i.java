package g.c.b.b.l;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import g.c.b.b.i.c;
import g.c.b.b.j.a;
import g.c.b.b.k.r;
import i.o.c.h;

public final class i {
    public final Activity a;
    public final String b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final c f2300d;

    /* renamed from: e  reason: collision with root package name */
    public final a f2301e;

    public i(Activity activity, String str, String str2, c cVar, a aVar) {
        h.e(activity, "activity");
        h.e(str, "packageName");
        h.e(str2, "actions");
        h.e(cVar, "listener");
        h.e(aVar, "installTask");
        this.a = activity;
        this.b = str;
        this.c = str2;
        this.f2300d = cVar;
        this.f2301e = aVar;
        r rVar = r.a;
        h.e(activity, "context");
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            new Handler(Looper.getMainLooper()).post(new c(this));
        }
    }

    public final void a() {
        Intent intent = new Intent("android.intent.action.UNINSTALL_PACKAGE");
        intent.setData(Uri.parse(h.j("package:", this.b)));
        intent.putExtra("android.intent.extra.RETURN_RESULT", true);
        Activity activity = this.a;
        int i2 = e.e.b.a.b;
        activity.startActivityForResult(intent, 2, (Bundle) null);
    }
}
