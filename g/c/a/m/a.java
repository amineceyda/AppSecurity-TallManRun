package g.c.a.m;

import android.content.Context;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f2087d;

    public /* synthetic */ a(Context context, String str, String str2) {
        this.b = context;
        this.c = str;
        this.f2087d = str2;
    }

    public final void run() {
        g.a(this.b, this.c, this.f2087d);
    }
}
