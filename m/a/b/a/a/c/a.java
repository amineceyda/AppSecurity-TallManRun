package m.a.b.a.a.c;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

public class a implements Closeable {

    /* renamed from: f  reason: collision with root package name */
    public static final long[] f5245f = new long[64];
    public final InputStream b;
    public final ByteOrder c;

    /* renamed from: d  reason: collision with root package name */
    public long f5246d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f5247e = 0;

    static {
        for (int i2 = 1; i2 <= 63; i2++) {
            long[] jArr = f5245f;
            jArr[i2] = (jArr[i2 - 1] << 1) + 1;
        }
    }

    public a(InputStream inputStream, ByteOrder byteOrder) {
        this.b = inputStream;
        this.c = byteOrder;
    }

    public long a(int i2) throws IOException {
        int i3;
        long j2;
        long j3;
        long j4;
        long j5;
        if (i2 < 0 || i2 > 63) {
            throw new IllegalArgumentException("count must not be negative or greater than 63");
        }
        while (true) {
            i3 = this.f5247e;
            j2 = 0;
            if (i3 >= i2 || i3 >= 57) {
                int i4 = 0;
            } else {
                long read = (long) this.b.read();
                if (read < 0) {
                    return read;
                }
                if (this.c == ByteOrder.LITTLE_ENDIAN) {
                    j5 = this.f5246d;
                    read <<= this.f5247e;
                } else {
                    j5 = this.f5246d << 8;
                    this.f5246d = j5;
                }
                this.f5246d = j5 | read;
                this.f5247e += 8;
            }
        }
        int i42 = 0;
        if (i3 < i2) {
            int i5 = i2 - i3;
            i42 = 8 - i5;
            long read2 = (long) this.b.read();
            if (read2 < 0) {
                return read2;
            }
            if (this.c == ByteOrder.LITTLE_ENDIAN) {
                long[] jArr = f5245f;
                this.f5246d = ((jArr[i5] & read2) << this.f5247e) | this.f5246d;
                read2 >>>= i5;
                j4 = jArr[i42];
            } else {
                long j6 = this.f5246d << i5;
                this.f5246d = j6;
                long[] jArr2 = f5245f;
                this.f5246d = j6 | ((read2 >>> i42) & jArr2[i5]);
                j4 = jArr2[i42];
            }
            j2 = j4 & read2;
            this.f5247e = i2;
        }
        if (i42 == 0) {
            if (this.c == ByteOrder.LITTLE_ENDIAN) {
                long j7 = this.f5246d;
                j3 = f5245f[i2] & j7;
                this.f5246d = j7 >>> i2;
            } else {
                j3 = f5245f[i2] & (this.f5246d >> (this.f5247e - i2));
            }
            this.f5247e -= i2;
            return j3;
        }
        this.f5246d = j2;
        this.f5247e = i42;
        return this.f5246d & f5245f[i2];
    }

    public void close() throws IOException {
        this.b.close();
    }
}
