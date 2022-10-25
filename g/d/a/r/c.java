package g.d.a.r;

import g.a.a.a.a;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class c extends FilterInputStream {
    public final long b;
    public int c;

    public c(InputStream inputStream, long j2) {
        super(inputStream);
        this.b = j2;
    }

    public final int a(int i2) throws IOException {
        if (i2 >= 0) {
            this.c += i2;
        } else if (this.b - ((long) this.c) > 0) {
            StringBuilder i3 = a.i("Failed to read all expected data, expected: ");
            i3.append(this.b);
            i3.append(", but read: ");
            i3.append(this.c);
            throw new IOException(i3.toString());
        }
        return i2;
    }

    public synchronized int available() throws IOException {
        return (int) Math.max(this.b - ((long) this.c), (long) this.in.available());
    }

    public synchronized int read() throws IOException {
        int read;
        read = super.read();
        a(read >= 0 ? 1 : -1);
        return read;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public synchronized int read(byte[] bArr, int i2, int i3) throws IOException {
        int read;
        read = super.read(bArr, i2, i3);
        a(read);
        return read;
    }
}
