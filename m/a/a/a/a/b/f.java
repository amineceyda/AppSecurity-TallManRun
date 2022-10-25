package m.a.a.a.a.b;

import java.io.IOException;
import java.io.InputStream;

public class f extends InputStream {
    public final InputStream b;
    public d c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5014d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5015e;

    /* renamed from: f  reason: collision with root package name */
    public final int f5016f;

    /* renamed from: g  reason: collision with root package name */
    public c f5017g;

    /* renamed from: h  reason: collision with root package name */
    public c f5018h;

    /* renamed from: i  reason: collision with root package name */
    public c f5019i;

    /* renamed from: j  reason: collision with root package name */
    public final e f5020j = new e(32768);

    public f(int i2, int i3, InputStream inputStream) {
        if (i2 != 4096 && i2 != 8192) {
            throw new IllegalArgumentException("The dictionary size must be 4096 or 8192");
        } else if (i3 == 2 || i3 == 3) {
            this.f5014d = i2;
            this.f5015e = i3;
            this.f5016f = i3;
            this.b = inputStream;
        } else {
            throw new IllegalArgumentException("The number of trees must be 2 or 3");
        }
    }

    public final void a() throws IOException {
        int i2;
        b();
        int a = (int) this.c.a(1);
        if (a == 1) {
            c cVar = this.f5017g;
            if (cVar != null) {
                i2 = cVar.c(this.c);
            } else {
                i2 = (int) this.c.a(8);
            }
            if (i2 != -1) {
                e eVar = this.f5020j;
                byte[] bArr = eVar.a;
                int i3 = eVar.c;
                bArr[i3] = (byte) i2;
                eVar.c = (i3 + 1) % 32768;
            }
        } else if (a == 0) {
            int i4 = this.f5014d == 4096 ? 6 : 7;
            int a2 = (int) this.c.a(i4);
            int c2 = this.f5019i.c(this.c);
            if (c2 != -1 || a2 > 0) {
                int i5 = (c2 << i4) | a2;
                int c3 = this.f5018h.c(this.c);
                if (c3 == 63) {
                    c3 = (int) (((long) c3) + this.c.a(8));
                }
                int i6 = c3 + this.f5016f;
                e eVar2 = this.f5020j;
                int i7 = eVar2.c - (i5 + 1);
                int i8 = i6 + i7;
                while (i7 < i8) {
                    byte[] bArr2 = eVar2.a;
                    int i9 = eVar2.c;
                    bArr2[i9] = bArr2[(i7 + 32768) % 32768];
                    eVar2.c = (i9 + 1) % 32768;
                    i7++;
                }
            }
        }
    }

    public final void b() throws IOException {
        if (this.c == null) {
            if (this.f5015e == 3) {
                this.f5017g = c.b(this.b, 256);
            }
            this.f5018h = c.b(this.b, 64);
            this.f5019i = c.b(this.b, 64);
            this.c = new d(this.b);
        }
    }

    public int read() throws IOException {
        e eVar = this.f5020j;
        boolean z = false;
        if (!(eVar.b != eVar.c)) {
            a();
        }
        e eVar2 = this.f5020j;
        int i2 = eVar2.b;
        if (i2 != eVar2.c) {
            z = true;
        }
        if (!z) {
            return -1;
        }
        byte b2 = eVar2.a[i2];
        eVar2.b = (i2 + 1) % 32768;
        return b2 & 255;
    }
}
