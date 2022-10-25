package g.d.a.l.v.h;

import g.d.a.l.n;
import g.d.a.l.t.v;
import g.d.a.l.v.d.b;
import g.d.a.l.v.g.c;
import g.d.a.r.a;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

public class d implements e<c, byte[]> {
    public v<byte[]> a(v<c> vVar, n nVar) {
        byte[] bArr;
        ByteBuffer asReadOnlyBuffer = vVar.get().b.a.a.g().asReadOnlyBuffer();
        AtomicReference<byte[]> atomicReference = a.a;
        a.b bVar = (asReadOnlyBuffer.isReadOnly() || !asReadOnlyBuffer.hasArray()) ? null : new a.b(asReadOnlyBuffer.array(), asReadOnlyBuffer.arrayOffset(), asReadOnlyBuffer.limit());
        if (bVar != null && bVar.a == 0 && bVar.b == bVar.c.length) {
            bArr = asReadOnlyBuffer.array();
        } else {
            ByteBuffer asReadOnlyBuffer2 = asReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr2 = new byte[asReadOnlyBuffer2.limit()];
            asReadOnlyBuffer2.position(0);
            asReadOnlyBuffer2.get(bArr2);
            bArr = bArr2;
        }
        return new b(bArr);
    }
}
