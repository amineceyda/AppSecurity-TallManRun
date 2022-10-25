package g.d.a.l.v.c;

import android.media.MediaDataSource;
import g.d.a.l.v.c.a0;
import java.nio.ByteBuffer;

public class b0 extends MediaDataSource {
    public final /* synthetic */ ByteBuffer b;

    public b0(a0.d dVar, ByteBuffer byteBuffer) {
        this.b = byteBuffer;
    }

    public void close() {
    }

    public long getSize() {
        return (long) this.b.limit();
    }

    public int readAt(long j2, byte[] bArr, int i2, int i3) {
        if (j2 >= ((long) this.b.limit())) {
            return -1;
        }
        this.b.position((int) j2);
        int min = Math.min(i3, this.b.remaining());
        this.b.get(bArr, i2, min);
        return min;
    }
}
