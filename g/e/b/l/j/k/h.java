package g.e.b.l.j.k;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class h implements Closeable {

    /* renamed from: h  reason: collision with root package name */
    public static final Logger f3531h = Logger.getLogger(h.class.getName());
    public final RandomAccessFile b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f3532d;

    /* renamed from: e  reason: collision with root package name */
    public b f3533e;

    /* renamed from: f  reason: collision with root package name */
    public b f3534f;

    /* renamed from: g  reason: collision with root package name */
    public final byte[] f3535g = new byte[16];

    public class a implements d {
        public boolean a = true;
        public final /* synthetic */ StringBuilder b;

        public a(h hVar, StringBuilder sb) {
            this.b = sb;
        }

        public void a(InputStream inputStream, int i2) throws IOException {
            if (this.a) {
                this.a = false;
            } else {
                this.b.append(", ");
            }
            this.b.append(i2);
        }
    }

    public static class b {
        public static final b c = new b(0, 0);
        public final int a;
        public final int b;

        public b(int i2, int i3) {
            this.a = i2;
            this.b = i3;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(b.class.getSimpleName());
            sb.append("[position = ");
            sb.append(this.a);
            sb.append(", length = ");
            return g.a.a.a.a.e(sb, this.b, "]");
        }
    }

    public interface d {
        void a(InputStream inputStream, int i2) throws IOException;
    }

    /* JADX INFO: finally extract failed */
    public h(File file) throws IOException {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
                randomAccessFile.seek(0);
                byte[] bArr = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i2 = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    x(bArr, i2, iArr[i3]);
                    i2 += 4;
                }
                randomAccessFile.write(bArr);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.b = randomAccessFile2;
        randomAccessFile2.seek(0);
        randomAccessFile2.readFully(this.f3535g);
        int n = n(this.f3535g, 0);
        this.c = n;
        if (((long) n) <= randomAccessFile2.length()) {
            this.f3532d = n(this.f3535g, 4);
            int n2 = n(this.f3535g, 8);
            int n3 = n(this.f3535g, 12);
            this.f3533e = k(n2);
            this.f3534f = k(n3);
            return;
        }
        StringBuilder i4 = g.a.a.a.a.i("File is truncated. Expected length: ");
        i4.append(this.c);
        i4.append(", Actual length: ");
        i4.append(randomAccessFile2.length());
        throw new IOException(i4.toString());
    }

    public static int a(h hVar, int i2) {
        int i3 = hVar.c;
        return i2 < i3 ? i2 : (i2 + 16) - i3;
    }

    public static int n(byte[] bArr, int i2) {
        return ((bArr[i2] & 255) << 24) + ((bArr[i2 + 1] & 255) << 16) + ((bArr[i2 + 2] & 255) << 8) + (bArr[i2 + 3] & 255);
    }

    public static void x(byte[] bArr, int i2, int i3) {
        bArr[i2] = (byte) (i3 >> 24);
        bArr[i2 + 1] = (byte) (i3 >> 16);
        bArr[i2 + 2] = (byte) (i3 >> 8);
        bArr[i2 + 3] = (byte) i3;
    }

    public void b(byte[] bArr) throws IOException {
        int i2;
        int length = bArr.length;
        synchronized (this) {
            if ((0 | length) >= 0) {
                if (length <= bArr.length - 0) {
                    f(length);
                    boolean j2 = j();
                    if (j2) {
                        i2 = 16;
                    } else {
                        b bVar = this.f3534f;
                        i2 = u(bVar.a + 4 + bVar.b);
                    }
                    b bVar2 = new b(i2, length);
                    x(this.f3535g, 0, length);
                    s(bVar2.a, this.f3535g, 0, 4);
                    s(bVar2.a + 4, bArr, 0, length);
                    v(this.c, this.f3532d + 1, j2 ? bVar2.a : this.f3533e.a, bVar2.a);
                    this.f3534f = bVar2;
                    this.f3532d++;
                    if (j2) {
                        this.f3533e = bVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public synchronized void close() throws IOException {
        this.b.close();
    }

    public synchronized void d() throws IOException {
        v(4096, 0, 0, 0);
        this.f3532d = 0;
        b bVar = b.c;
        this.f3533e = bVar;
        this.f3534f = bVar;
        if (this.c > 4096) {
            this.b.setLength((long) 4096);
            this.b.getChannel().force(true);
        }
        this.c = 4096;
    }

    public final void f(int i2) throws IOException {
        int i3 = i2 + 4;
        int t = this.c - t();
        if (t < i3) {
            int i4 = this.c;
            do {
                t += i4;
                i4 <<= 1;
            } while (t < i3);
            this.b.setLength((long) i4);
            this.b.getChannel().force(true);
            b bVar = this.f3534f;
            int u = u(bVar.a + 4 + bVar.b);
            if (u < this.f3533e.a) {
                FileChannel channel = this.b.getChannel();
                channel.position((long) this.c);
                long j2 = (long) (u - 4);
                if (channel.transferTo(16, j2, channel) != j2) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            int i5 = this.f3534f.a;
            int i6 = this.f3533e.a;
            if (i5 < i6) {
                int i7 = (this.c + i5) - 16;
                v(i4, this.f3532d, i6, i7);
                this.f3534f = new b(i7, this.f3534f.b);
            } else {
                v(i4, this.f3532d, i6, i5);
            }
            this.c = i4;
        }
    }

    public synchronized void g(d dVar) throws IOException {
        int i2 = this.f3533e.a;
        for (int i3 = 0; i3 < this.f3532d; i3++) {
            b k2 = k(i2);
            dVar.a(new c(k2, (a) null), k2.b);
            i2 = u(k2.a + 4 + k2.b);
        }
    }

    public synchronized boolean j() {
        return this.f3532d == 0;
    }

    public final b k(int i2) throws IOException {
        if (i2 == 0) {
            return b.c;
        }
        this.b.seek((long) i2);
        return new b(i2, this.b.readInt());
    }

    public synchronized void o() throws IOException {
        if (j()) {
            throw new NoSuchElementException();
        } else if (this.f3532d == 1) {
            d();
        } else {
            b bVar = this.f3533e;
            int u = u(bVar.a + 4 + bVar.b);
            q(u, this.f3535g, 0, 4);
            int n = n(this.f3535g, 0);
            v(this.c, this.f3532d - 1, u, this.f3534f.a);
            this.f3532d--;
            this.f3533e = new b(u, n);
        }
    }

    public final void q(int i2, byte[] bArr, int i3, int i4) throws IOException {
        RandomAccessFile randomAccessFile;
        int i5 = this.c;
        if (i2 >= i5) {
            i2 = (i2 + 16) - i5;
        }
        if (i2 + i4 <= i5) {
            this.b.seek((long) i2);
            randomAccessFile = this.b;
        } else {
            int i6 = i5 - i2;
            this.b.seek((long) i2);
            this.b.readFully(bArr, i3, i6);
            this.b.seek(16);
            randomAccessFile = this.b;
            i3 += i6;
            i4 -= i6;
        }
        randomAccessFile.readFully(bArr, i3, i4);
    }

    public final void s(int i2, byte[] bArr, int i3, int i4) throws IOException {
        RandomAccessFile randomAccessFile;
        int i5 = this.c;
        if (i2 >= i5) {
            i2 = (i2 + 16) - i5;
        }
        if (i2 + i4 <= i5) {
            this.b.seek((long) i2);
            randomAccessFile = this.b;
        } else {
            int i6 = i5 - i2;
            this.b.seek((long) i2);
            this.b.write(bArr, i3, i6);
            this.b.seek(16);
            randomAccessFile = this.b;
            i3 += i6;
            i4 -= i6;
        }
        randomAccessFile.write(bArr, i3, i4);
    }

    public int t() {
        if (this.f3532d == 0) {
            return 16;
        }
        b bVar = this.f3534f;
        int i2 = bVar.a;
        int i3 = this.f3533e.a;
        return i2 >= i3 ? (i2 - i3) + 4 + bVar.b + 16 : (((i2 + 4) + bVar.b) + this.c) - i3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(h.class.getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.c);
        sb.append(", size=");
        sb.append(this.f3532d);
        sb.append(", first=");
        sb.append(this.f3533e);
        sb.append(", last=");
        sb.append(this.f3534f);
        sb.append(", element lengths=[");
        try {
            g(new a(this, sb));
        } catch (IOException e2) {
            f3531h.log(Level.WARNING, "read error", e2);
        }
        sb.append("]]");
        return sb.toString();
    }

    public final int u(int i2) {
        int i3 = this.c;
        return i2 < i3 ? i2 : (i2 + 16) - i3;
    }

    public final void v(int i2, int i3, int i4, int i5) throws IOException {
        byte[] bArr = this.f3535g;
        int[] iArr = {i2, i3, i4, i5};
        int i6 = 0;
        for (int i7 = 0; i7 < 4; i7++) {
            x(bArr, i6, iArr[i7]);
            i6 += 4;
        }
        this.b.seek(0);
        this.b.write(this.f3535g);
    }

    public final class c extends InputStream {
        public int b;
        public int c;

        public c(b bVar, a aVar) {
            int i2 = bVar.a + 4;
            int i3 = h.this.c;
            this.b = i2 >= i3 ? (i2 + 16) - i3 : i2;
            this.c = bVar.b;
        }

        public int read() throws IOException {
            if (this.c == 0) {
                return -1;
            }
            h.this.b.seek((long) this.b);
            int read = h.this.b.read();
            this.b = h.a(h.this, this.b + 1);
            this.c--;
            return read;
        }

        public int read(byte[] bArr, int i2, int i3) throws IOException {
            Objects.requireNonNull(bArr, "buffer");
            if ((i2 | i3) < 0 || i3 > bArr.length - i2) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i4 = this.c;
            if (i4 <= 0) {
                return -1;
            }
            if (i3 > i4) {
                i3 = i4;
            }
            h.this.q(this.b, bArr, i2, i3);
            this.b = h.a(h.this, this.b + i3);
            this.c -= i3;
            return i3;
        }
    }
}
