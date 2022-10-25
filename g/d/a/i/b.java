package g.d.a.i;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class b implements Closeable {
    public final InputStream b;
    public final Charset c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f2370d;

    /* renamed from: e  reason: collision with root package name */
    public int f2371e;

    /* renamed from: f  reason: collision with root package name */
    public int f2372f;

    public class a extends ByteArrayOutputStream {
        public a(int i2) {
            super(i2);
        }

        public String toString() {
            int i2 = this.count;
            if (i2 > 0 && this.buf[i2 - 1] == 13) {
                i2--;
            }
            try {
                return new String(this.buf, 0, i2, b.this.c.name());
            } catch (UnsupportedEncodingException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public b(InputStream inputStream, Charset charset) {
        if (charset == null) {
            throw null;
        } else if (charset.equals(c.a)) {
            this.b = inputStream;
            this.c = charset;
            this.f2370d = new byte[8192];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public final void a() throws IOException {
        InputStream inputStream = this.b;
        byte[] bArr = this.f2370d;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f2371e = 0;
            this.f2372f = read;
            return;
        }
        throw new EOFException();
    }

    public String b() throws IOException {
        int i2;
        byte[] bArr;
        int i3;
        synchronized (this.b) {
            if (this.f2370d != null) {
                if (this.f2371e >= this.f2372f) {
                    a();
                }
                for (int i4 = this.f2371e; i4 != this.f2372f; i4++) {
                    byte[] bArr2 = this.f2370d;
                    if (bArr2[i4] == 10) {
                        if (i4 != this.f2371e) {
                            i3 = i4 - 1;
                            if (bArr2[i3] == 13) {
                                byte[] bArr3 = this.f2370d;
                                int i5 = this.f2371e;
                                String str = new String(bArr3, i5, i3 - i5, this.c.name());
                                this.f2371e = i4 + 1;
                                return str;
                            }
                        }
                        i3 = i4;
                        byte[] bArr32 = this.f2370d;
                        int i52 = this.f2371e;
                        String str2 = new String(bArr32, i52, i3 - i52, this.c.name());
                        this.f2371e = i4 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.f2372f - this.f2371e) + 80);
                loop1:
                while (true) {
                    byte[] bArr4 = this.f2370d;
                    int i6 = this.f2371e;
                    aVar.write(bArr4, i6, this.f2372f - i6);
                    this.f2372f = -1;
                    a();
                    i2 = this.f2371e;
                    while (true) {
                        if (i2 != this.f2372f) {
                            bArr = this.f2370d;
                            if (bArr[i2] == 10) {
                                break loop1;
                            }
                            i2++;
                        }
                    }
                }
                int i7 = this.f2371e;
                if (i2 != i7) {
                    aVar.write(bArr, i7, i2 - i7);
                }
                this.f2371e = i2 + 1;
                String aVar2 = aVar.toString();
                return aVar2;
            }
            throw new IOException("LineReader is closed");
        }
    }

    public void close() throws IOException {
        synchronized (this.b) {
            if (this.f2370d != null) {
                this.f2370d = null;
                this.b.close();
            }
        }
    }
}
