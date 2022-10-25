package g.d.a.l.v.c;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import g.d.a.l.n;
import g.d.a.l.p;
import g.d.a.l.s.m;
import g.d.a.l.t.v;
import g.d.a.l.v.c.r;
import java.io.IOException;
import java.util.Objects;

public final class u implements p<ParcelFileDescriptor, Bitmap> {
    public final l a;

    public u(l lVar) {
        this.a = lVar;
    }

    public v a(Object obj, int i2, int i3, n nVar) throws IOException {
        l lVar = this.a;
        return lVar.a(new r.b((ParcelFileDescriptor) obj, lVar.f2592d, lVar.c), i2, i3, nVar, l.f2589k);
    }

    public boolean b(Object obj, n nVar) throws IOException {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        Objects.requireNonNull(this.a);
        return m.c();
    }
}
