package g.e.a.b.f.b;

import android.content.Intent;

public final /* synthetic */ class i8 implements Runnable {
    public final /* synthetic */ m8 b;
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f3 f3198d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Intent f3199e;

    public /* synthetic */ i8(m8 m8Var, int i2, f3 f3Var, Intent intent) {
        this.b = m8Var;
        this.c = i2;
        this.f3198d = f3Var;
        this.f3199e = intent;
    }

    public final void run() {
        m8 m8Var = this.b;
        int i2 = this.c;
        f3 f3Var = this.f3198d;
        Intent intent = this.f3199e;
        if (((l8) m8Var.a).b(i2)) {
            f3Var.n.b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i2));
            m8Var.c().n.a("Completed wakeful intent.");
            ((l8) m8Var.a).a(intent);
        }
    }
}
