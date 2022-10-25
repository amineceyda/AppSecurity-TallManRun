package g.e.b.n.j;

import java.io.OutputStream;

public final class d extends OutputStream {
    public long b = 0;

    public void write(int i2) {
        this.b++;
    }

    public void write(byte[] bArr) {
        this.b += (long) bArr.length;
    }

    public void write(byte[] bArr, int i2, int i3) {
        int i4;
        if (i2 < 0 || i2 > bArr.length || i3 < 0 || (i4 = i2 + i3) > bArr.length || i4 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.b += (long) i3;
    }
}
