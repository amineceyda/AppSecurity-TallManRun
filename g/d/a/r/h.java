package g.d.a.r;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class h extends FilterInputStream {
    public int b = Integer.MIN_VALUE;

    public h(InputStream inputStream) {
        super(inputStream);
    }

    public final long a(long j2) {
        int i2 = this.b;
        if (i2 == 0) {
            return -1;
        }
        return (i2 == Integer.MIN_VALUE || j2 <= ((long) i2)) ? j2 : (long) i2;
    }

    public int available() throws IOException {
        int i2 = this.b;
        return i2 == Integer.MIN_VALUE ? super.available() : Math.min(i2, super.available());
    }

    public final void b(long j2) {
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE && j2 != -1) {
            this.b = (int) (((long) i2) - j2);
        }
    }

    public synchronized void mark(int i2) {
        super.mark(i2);
        this.b = i2;
    }

    public int read() throws IOException {
        if (a(1) == -1) {
            return -1;
        }
        int read = super.read();
        b(1);
        return read;
    }

    public int read(byte[] bArr, int i2, int i3) throws IOException {
        int a = (int) a((long) i3);
        if (a == -1) {
            return -1;
        }
        int read = super.read(bArr, i2, a);
        b((long) read);
        return read;
    }

    public synchronized void reset() throws IOException {
        super.reset();
        this.b = Integer.MIN_VALUE;
    }

    public long skip(long j2) throws IOException {
        long a = a(j2);
        if (a == -1) {
            return 0;
        }
        long skip = super.skip(a);
        b(skip);
        return skip;
    }
}
