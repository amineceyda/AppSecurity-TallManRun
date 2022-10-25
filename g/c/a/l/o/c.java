package g.c.a.l.o;

import g.c.a.e.k.d.b;
import i.o.c.h;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public final class c extends FileInputStream {
    public final long b;
    public long c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(File file, long j2, long j3) {
        super(file);
        h.e(file, "file");
        this.b = j3;
        skip(j2);
    }

    public int read(byte[] bArr) throws IOException {
        h.e(bArr, b.a);
        long j2 = this.c;
        long j3 = this.b;
        if (j2 >= j3) {
            this.c = 0;
            return -1;
        }
        int i2 = (int) (j3 - j2);
        int length = bArr.length;
        if (i2 > length) {
            i2 = length;
        }
        int read = read(bArr, 0, i2);
        if (read == -1) {
            return -1;
        }
        this.c += (long) read;
        return read;
    }
}
