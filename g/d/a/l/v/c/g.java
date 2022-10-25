package g.d.a.l.v.c;

import android.graphics.Bitmap;
import g.d.a.l.n;
import g.d.a.l.p;
import g.d.a.l.t.v;
import g.d.a.r.a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public class g implements p<ByteBuffer, Bitmap> {
    public final l a;

    public g(l lVar) {
        this.a = lVar;
    }

    public v a(Object obj, int i2, int i3, n nVar) throws IOException {
        AtomicReference<byte[]> atomicReference = a.a;
        return this.a.b(new a.C0100a((ByteBuffer) obj), i2, i3, nVar, l.f2589k);
    }

    public boolean b(Object obj, n nVar) throws IOException {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        Objects.requireNonNull(this.a);
        return true;
    }
}
