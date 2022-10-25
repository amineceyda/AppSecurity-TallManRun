package e.e.g;

import android.content.Context;
import e.e.g.j;
import java.util.concurrent.Callable;

public class h implements Callable<j.a> {
    public final /* synthetic */ String a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ e c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f1323d;

    public h(String str, Context context, e eVar, int i2) {
        this.a = str;
        this.b = context;
        this.c = eVar;
        this.f1323d = i2;
    }

    public Object call() throws Exception {
        return j.a(this.a, this.b, this.c, this.f1323d);
    }
}
