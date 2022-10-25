package g.e.a.b.f.b;

import com.google.android.gms.measurement.internal.zzas;
import java.util.Iterator;

public final class q implements Iterator {
    public final Iterator b;
    public final /* synthetic */ zzas c;

    public q(zzas zzas) {
        this.c = zzas;
        this.b = zzas.zza.keySet().iterator();
    }

    /* renamed from: a */
    public final String next() {
        return (String) this.b.next();
    }

    public final boolean hasNext() {
        return this.b.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
