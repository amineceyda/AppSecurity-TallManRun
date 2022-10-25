package m.a.a.a.c;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

public class a implements Closeable {

    /* renamed from: f  reason: collision with root package name */
    public static final long[] f5116f = new long[64];
    public final InputStream b;
    public final ByteOrder c;

    /* renamed from: d  reason: collision with root package name */
    public long f5117d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f5118e = 0;

    static {
        for (int i2 = 1; i2 <= 63; i2++) {
            long[] jArr = f5116f;
            jArr[i2] = (jArr[i2 - 1] << 1) + 1;
        }
    }

    public a(InputStream inputStream, ByteOrder byteOrder) {
        this.b = inputStream;
        this.c = byteOrder;
    }

    public long a(int i2) throws IOException {
        long j2;
        long j3;
        if (i2 < 0 || i2 > 63) {
            throw new IllegalArgumentException("count must not be negative or greater than 63");
        }
        while (true) {
            int i3 = this.f5118e;
            if (i3 < i2) {
                long read = (long) this.b.read();
                if (read < 0) {
                    return read;
                }
                if (this.c == ByteOrder.LITTLE_ENDIAN) {
                    j3 = this.f5117d;
                    read <<= this.f5118e;
                } else {
                    j3 = this.f5117d << 8;
                    this.f5117d = j3;
                }
                this.f5117d = read | j3;
                this.f5118e += 8;
            } else {
                if (this.c == ByteOrder.LITTLE_ENDIAN) {
                    long j4 = this.f5117d;
                    j2 = f5116f[i2] & j4;
                    this.f5117d = j4 >>> i2;
                } else {
                    j2 = f5116f[i2] & (this.f5117d >> (i3 - i2));
                }
                this.f5118e = i3 - i2;
                return j2;
            }
        }
    }

    public void close() throws IOException {
        this.b.close();
    }
}
