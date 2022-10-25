package g.i.b.f.h;

import android.os.SystemClock;
import java.io.InputStream;
import java.util.ArrayList;

public class d {
    public static volatile d b;
    public ArrayList<a> a = new ArrayList<>();

    public class a extends InputStream {
        public final InputStream b;
        public int c;

        public a(d dVar, InputStream inputStream, int i2) {
            this.b = inputStream;
            this.c = i2 <= 0 ? 0 : i2;
        }

        public final int read() {
            return this.b.read();
        }

        public final int read(byte[] bArr) {
            return read(bArr, 0, bArr.length);
        }

        public final int read(byte[] bArr, int i2, int i3) {
            int i4 = this.c;
            if (i4 <= 0) {
                return this.b.read(bArr, i2, i3);
            }
            int i5 = i4 * 1024;
            int i6 = 0;
            while (i6 < i3) {
                int min = Math.min(i5, i3 - i6);
                long currentTimeMillis = System.currentTimeMillis();
                int read = this.b.read(bArr, i2 + i6, min);
                if (read <= 0) {
                    return -1;
                }
                i6 += read;
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                long j2 = (long) ((read * 1000) / i5);
                if (currentTimeMillis2 < j2) {
                    long j3 = j2 - currentTimeMillis2;
                    if (j3 > 0) {
                        SystemClock.sleep(j3);
                    }
                }
            }
            return i6;
        }
    }

    public static d a() {
        if (b == null) {
            synchronized (d.class) {
                if (b == null) {
                    b = new d();
                }
            }
        }
        return b;
    }
}
