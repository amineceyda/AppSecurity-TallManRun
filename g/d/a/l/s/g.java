package g.d.a.l.s;

import g.a.a.a.a;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class g extends FilterInputStream {

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f2417d;

    /* renamed from: e  reason: collision with root package name */
    public static final int f2418e;

    /* renamed from: f  reason: collision with root package name */
    public static final int f2419f;
    public final byte b;
    public int c;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f2417d = bArr;
        int length = bArr.length;
        f2418e = length;
        f2419f = length + 2;
    }

    public g(InputStream inputStream, int i2) {
        super(inputStream);
        if (i2 < -1 || i2 > 8) {
            throw new IllegalArgumentException(a.q("Cannot add invalid orientation: ", i2));
        }
        this.b = (byte) i2;
    }

    public void mark(int i2) {
        throw new UnsupportedOperationException();
    }

    public boolean markSupported() {
        return false;
    }

    public int read() throws IOException {
        int i2;
        int i3 = this.c;
        int read = (i3 < 2 || i3 > (i2 = f2419f)) ? super.read() : i3 == i2 ? this.b : f2417d[i3 - 2] & 255;
        if (read != -1) {
            this.c++;
        }
        return read;
    }

    public int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4;
        int i5 = this.c;
        int i6 = f2419f;
        if (i5 > i6) {
            i4 = super.read(bArr, i2, i3);
        } else if (i5 == i6) {
            bArr[i2] = this.b;
            i4 = 1;
        } else if (i5 < 2) {
            i4 = super.read(bArr, i2, 2 - i5);
        } else {
            int min = Math.min(i6 - i5, i3);
            System.arraycopy(f2417d, this.c - 2, bArr, i2, min);
            i4 = min;
        }
        if (i4 > 0) {
            this.c += i4;
        }
        return i4;
    }

    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    public long skip(long j2) throws IOException {
        long skip = super.skip(j2);
        if (skip > 0) {
            this.c = (int) (((long) this.c) + skip);
        }
        return skip;
    }
}
