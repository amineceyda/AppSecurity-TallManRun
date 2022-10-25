package g.e.a.b.e.c;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzcl;
import g.e.a.b.b.h.e;
import g.e.a.b.c.b;
import java.util.Objects;

public final class n1 extends b2 {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f3004f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f3005g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Context f3006h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Bundle f3007i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ m2 f3008j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n1(m2 m2Var, String str, String str2, Context context, Bundle bundle) {
        super(m2Var, true);
        this.f3008j = m2Var;
        this.f3004f = str;
        this.f3005g = str2;
        this.f3006h = context;
        this.f3007i = bundle;
    }

    public final void a() {
        String str;
        String str2;
        String str3;
        try {
            z0 z0Var = null;
            if (m2.b(this.f3004f, this.f3005g)) {
                str = this.f3005g;
                str2 = this.f3004f;
                str3 = this.f3008j.a;
            } else {
                str3 = null;
                str2 = null;
                str = null;
            }
            Objects.requireNonNull(this.f3006h, "null reference");
            m2 m2Var = this.f3008j;
            Context context = this.f3006h;
            Objects.requireNonNull(m2Var);
            try {
                z0Var = y0.asInterface(DynamiteModule.c(context, DynamiteModule.b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
            } catch (DynamiteModule.LoadingException e2) {
                m2Var.a(e2, true, false);
            }
            m2Var.f3000h = z0Var;
            if (this.f3008j.f3000h == null) {
                Log.w(this.f3008j.a, "Failed to connect to measurement client.");
                return;
            }
            int a = DynamiteModule.a(this.f3006h, ModuleDescriptor.MODULE_ID);
            int d2 = DynamiteModule.d(this.f3006h, ModuleDescriptor.MODULE_ID, false);
            zzcl zzcl = new zzcl(55005, (long) Math.max(a, d2), d2 < a, str3, str2, str, this.f3007i, e.y(this.f3006h));
            z0 z0Var2 = this.f3008j.f3000h;
            Objects.requireNonNull(z0Var2, "null reference");
            z0Var2.initialize(new b(this.f3006h), zzcl, this.b);
        } catch (Exception e3) {
            this.f3008j.a(e3, true, false);
        }
    }
}
