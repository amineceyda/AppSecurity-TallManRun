package g.e.b.l.j.k;

import g.e.b.l.j.k.h;
import java.io.IOException;
import java.io.InputStream;

public class i implements h.d {
    public final /* synthetic */ byte[] a;
    public final /* synthetic */ int[] b;

    public i(j jVar, byte[] bArr, int[] iArr) {
        this.a = bArr;
        this.b = iArr;
    }

    public void a(InputStream inputStream, int i2) throws IOException {
        try {
            inputStream.read(this.a, this.b[0], i2);
            int[] iArr = this.b;
            iArr[0] = iArr[0] + i2;
        } finally {
            inputStream.close();
        }
    }
}
