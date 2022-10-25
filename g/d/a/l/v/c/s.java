package g.d.a.l.v.c;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import g.d.a.l.n;
import g.d.a.l.p;
import g.d.a.l.t.v;
import g.d.a.r.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

public final class s implements p<InputStream, Bitmap> {
    public final d a = new d();

    public v a(Object obj, int i2, int i3, n nVar) throws IOException {
        InputStream inputStream = (InputStream) obj;
        AtomicReference<byte[]> atomicReference = a.a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = a.a.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int read = inputStream.read(andSet);
            if (read >= 0) {
                byteArrayOutputStream.write(andSet, 0, read);
            } else {
                a.a.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return this.a.a(ImageDecoder.createSource((ByteBuffer) ByteBuffer.allocateDirect(byteArray.length).put(byteArray).position(0)), i2, i3, nVar);
            }
        }
    }

    public /* bridge */ /* synthetic */ boolean b(Object obj, n nVar) throws IOException {
        InputStream inputStream = (InputStream) obj;
        return true;
    }
}
