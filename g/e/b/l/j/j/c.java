package g.e.b.l.j.j;

import android.util.Log;
import g.e.a.b.g.a;
import g.e.a.b.g.f;
import java.io.File;
import java.util.Objects;

public final /* synthetic */ class c implements a {
    public final /* synthetic */ n0 a;

    public /* synthetic */ c(n0 n0Var) {
        this.a = n0Var;
    }

    public final Object a(f fVar) {
        boolean z;
        Objects.requireNonNull(this.a);
        if (fVar.k()) {
            e0 e0Var = (e0) fVar.h();
            g.e.b.l.j.f fVar2 = g.e.b.l.j.f.a;
            StringBuilder i2 = g.a.a.a.a.i("Crashlytics report successfully enqueued to DataTransport: ");
            i2.append(e0Var.c());
            fVar2.b(i2.toString());
            File b = e0Var.b();
            if (b.delete()) {
                StringBuilder i3 = g.a.a.a.a.i("Deleted report file: ");
                i3.append(b.getPath());
                fVar2.b(i3.toString());
            } else {
                StringBuilder i4 = g.a.a.a.a.i("Crashlytics could not delete report file: ");
                i4.append(b.getPath());
                fVar2.f(i4.toString());
            }
            z = true;
        } else {
            g.e.b.l.j.f fVar3 = g.e.b.l.j.f.a;
            Exception g2 = fVar.g();
            if (fVar3.a(5)) {
                Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", g2);
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
