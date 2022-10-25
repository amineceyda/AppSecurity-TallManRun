package g.d.a.l.s;

import g.d.a.l.t.b0.b;
import java.io.IOException;
import java.io.OutputStream;

public final class c extends OutputStream {
    public final OutputStream b;
    public byte[] c;

    /* renamed from: d  reason: collision with root package name */
    public b f2415d;

    /* renamed from: e  reason: collision with root package name */
    public int f2416e;

    public c(OutputStream outputStream, b bVar) {
        this.b = outputStream;
        this.f2415d = bVar;
        this.c = (byte[]) bVar.d(65536, byte[].class);
    }

    /* JADX INFO: finally extract failed */
    public void close() throws IOException {
        try {
            flush();
            this.b.close();
            byte[] bArr = this.c;
            if (bArr != null) {
                this.f2415d.put(bArr);
                this.c = null;
            }
        } catch (Throwable th) {
            this.b.close();
            throw th;
        }
    }

    public void flush() throws IOException {
        int i2 = this.f2416e;
        if (i2 > 0) {
            this.b.write(this.c, 0, i2);
            this.f2416e = 0;
        }
        this.b.flush();
    }

    public void write(int i2) throws IOException {
        byte[] bArr = this.c;
        int i3 = this.f2416e;
        int i4 = i3 + 1;
        this.f2416e = i4;
        bArr[i3] = (byte) i2;
        if (i4 == bArr.length && i4 > 0) {
            this.b.write(bArr, 0, i4);
            this.f2416e = 0;
        }
    }

    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = 0;
        do {
            int i5 = i3 - i4;
            int i6 = i2 + i4;
            int i7 = this.f2416e;
            if (i7 != 0 || i5 < this.c.length) {
                int min = Math.min(i5, this.c.length - i7);
                System.arraycopy(bArr, i6, this.c, this.f2416e, min);
                int i8 = this.f2416e + min;
                this.f2416e = i8;
                i4 += min;
                byte[] bArr2 = this.c;
                if (i8 == bArr2.length && i8 > 0) {
                    this.b.write(bArr2, 0, i8);
                    this.f2416e = 0;
                    continue;
                }
            } else {
                this.b.write(bArr, i6, i5);
                return;
            }
        } while (i4 < i3);
    }
}
