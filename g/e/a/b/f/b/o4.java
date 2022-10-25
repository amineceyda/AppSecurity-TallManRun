package g.e.a.b.f.b;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzas;
import g.c.b.b.f;
import g.e.a.b.e.c.u3;
import g.e.a.b.e.c.v3;
import g.e.a.b.e.c.y3;
import g.e.a.b.e.c.z3;
import java.util.Iterator;
import java.util.Objects;

public final /* synthetic */ class o4 implements Runnable {
    public final /* synthetic */ g5 b;
    public final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Bundle f3273d;

    public /* synthetic */ o4(g5 g5Var, String str, Bundle bundle) {
        this.b = g5Var;
        this.c = str;
        this.f3273d = bundle;
    }

    public final void run() {
        zzas zzas;
        g5 g5Var = this.b;
        String str = this.c;
        Bundle bundle = this.f3273d;
        k kVar = g5Var.a.c;
        k9.I(kVar);
        kVar.h();
        kVar.i();
        n4 n4Var = kVar.a;
        f.k(str);
        f.k("dep");
        TextUtils.isEmpty("");
        if (bundle == null || bundle.isEmpty()) {
            zzas = new zzas(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2 == null) {
                    n4Var.d().f3136f.a("Param name can't be null");
                } else {
                    Object o = n4Var.A().o(str2, bundle2.get(str2));
                    if (o == null) {
                        n4Var.d().f3139i.b("Param value can't be null", n4Var.f3264m.e(str2));
                    } else {
                        n4Var.A().A(bundle2, str2, o);
                    }
                }
                it.remove();
            }
            zzas = new zzas(bundle2);
        }
        m9 m9Var = kVar.b.f3233g;
        k9.I(m9Var);
        u3 w = v3.w();
        if (w.f2990d) {
            w.f();
            w.f2990d = false;
        }
        v3.I((v3) w.c, 0);
        for (String str3 : zzas.zza.keySet()) {
            y3 w2 = z3.w();
            w2.m(str3);
            Object l2 = zzas.l(str3);
            Objects.requireNonNull(l2, "null reference");
            m9Var.H(w2, l2);
            w.o(w2);
        }
        byte[] i2 = ((v3) w.j()).i();
        kVar.a.d().n.c("Saving default event parameters, appId, data size", kVar.a.f3264m.d(str), Integer.valueOf(i2.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", i2);
        try {
            if (kVar.A().insertWithOnConflict("default_event_params", (String) null, contentValues, 5) == -1) {
                kVar.a.d().f3136f.b("Failed to insert default event parameters (got -1). appId", f3.t(str));
            }
        } catch (SQLiteException e2) {
            kVar.a.d().f3136f.c("Error storing default event parameters. appId", f3.t(str), e2);
        }
    }
}
