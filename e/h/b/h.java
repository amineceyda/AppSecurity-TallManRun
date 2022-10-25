package e.h.b;

import android.os.Bundle;
import android.os.Parcelable;
import e.k.e;
import e.p.a;

public class h implements a.b {
    public final /* synthetic */ j a;

    public h(j jVar) {
        this.a = jVar;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        do {
        } while (j.l(this.a.k(), e.b.CREATED));
        this.a.f1468j.e(e.a.ON_STOP);
        Parcelable c0 = this.a.f1467i.a.f1505e.c0();
        if (c0 != null) {
            bundle.putParcelable("android:support:fragments", c0);
        }
        return bundle;
    }
}
