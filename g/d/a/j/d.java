package g.d.a.j;

import android.util.Log;
import com.tencent.beacon.pack.AbstractJceStruct;
import g.a.a.a.a;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.Objects;

public class d {
    public final byte[] a = new byte[256];
    public ByteBuffer b;
    public c c;

    /* renamed from: d  reason: collision with root package name */
    public int f2389d = 0;

    public final boolean a() {
        return this.c.b != 0;
    }

    public c b() {
        if (this.b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (a()) {
            return this.c;
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < 6; i2++) {
                sb.append((char) c());
            }
            if (!sb.toString().startsWith("GIF")) {
                this.c.b = 1;
            } else {
                this.c.f2383f = f();
                this.c.f2384g = f();
                int c2 = c();
                c cVar = this.c;
                cVar.f2385h = (c2 & 128) != 0;
                cVar.f2386i = (int) Math.pow(2.0d, (double) ((c2 & 7) + 1));
                this.c.f2387j = c();
                c cVar2 = this.c;
                c();
                Objects.requireNonNull(cVar2);
                if (this.c.f2385h && !a()) {
                    c cVar3 = this.c;
                    cVar3.a = e(cVar3.f2386i);
                    c cVar4 = this.c;
                    cVar4.f2388k = cVar4.a[cVar4.f2387j];
                }
            }
            if (!a()) {
                boolean z = false;
                while (!z && !a() && this.c.c <= Integer.MAX_VALUE) {
                    int c3 = c();
                    if (c3 == 33) {
                        int c4 = c();
                        if (c4 != 1) {
                            if (c4 == 249) {
                                this.c.f2381d = new b();
                                c();
                                int c5 = c();
                                b bVar = this.c.f2381d;
                                int i3 = (c5 & 28) >> 2;
                                bVar.f2376g = i3;
                                if (i3 == 0) {
                                    bVar.f2376g = 1;
                                }
                                bVar.f2375f = (c5 & 1) != 0;
                                int f2 = f();
                                if (f2 < 2) {
                                    f2 = 10;
                                }
                                b bVar2 = this.c.f2381d;
                                bVar2.f2378i = f2 * 10;
                                bVar2.f2377h = c();
                                c();
                            } else if (c4 != 254 && c4 == 255) {
                                d();
                                StringBuilder sb2 = new StringBuilder();
                                for (int i4 = 0; i4 < 11; i4++) {
                                    sb2.append((char) this.a[i4]);
                                }
                                if (sb2.toString().equals("NETSCAPE2.0")) {
                                    do {
                                        d();
                                        byte[] bArr = this.a;
                                        if (bArr[0] == 1) {
                                            byte b2 = bArr[1];
                                            byte b3 = bArr[2];
                                            Objects.requireNonNull(this.c);
                                        }
                                        if (this.f2389d <= 0) {
                                            break;
                                        }
                                    } while (a());
                                }
                            }
                        }
                        g();
                    } else if (c3 == 44) {
                        c cVar5 = this.c;
                        if (cVar5.f2381d == null) {
                            cVar5.f2381d = new b();
                        }
                        cVar5.f2381d.a = f();
                        this.c.f2381d.b = f();
                        this.c.f2381d.c = f();
                        this.c.f2381d.f2373d = f();
                        int c6 = c();
                        boolean z2 = (c6 & 128) != 0;
                        int pow = (int) Math.pow(2.0d, (double) ((c6 & 7) + 1));
                        b bVar3 = this.c.f2381d;
                        bVar3.f2374e = (c6 & 64) != 0;
                        if (z2) {
                            bVar3.f2380k = e(pow);
                        } else {
                            bVar3.f2380k = null;
                        }
                        this.c.f2381d.f2379j = this.b.position();
                        c();
                        g();
                        if (!a()) {
                            c cVar6 = this.c;
                            cVar6.c++;
                            cVar6.f2382e.add(cVar6.f2381d);
                        }
                    } else if (c3 != 59) {
                        this.c.b = 1;
                    } else {
                        z = true;
                    }
                }
                c cVar7 = this.c;
                if (cVar7.c < 0) {
                    cVar7.b = 1;
                }
            }
            return this.c;
        }
    }

    public final int c() {
        try {
            return this.b.get() & 255;
        } catch (Exception unused) {
            this.c.b = 1;
            return 0;
        }
    }

    public final void d() {
        int c2 = c();
        this.f2389d = c2;
        if (c2 > 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                try {
                    int i4 = this.f2389d;
                    if (i2 < i4) {
                        i3 = i4 - i2;
                        this.b.get(this.a, i2, i3);
                        i2 += i3;
                    } else {
                        return;
                    }
                } catch (Exception e2) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        StringBuilder k2 = a.k("Error Reading Block n: ", i2, " count: ", i3, " blockSize: ");
                        k2.append(this.f2389d);
                        Log.d("GifHeaderParser", k2.toString(), e2);
                    }
                    this.c.b = 1;
                    return;
                }
            }
        }
    }

    public final int[] e(int i2) {
        byte[] bArr = new byte[(i2 * 3)];
        int[] iArr = null;
        try {
            this.b.get(bArr);
            iArr = new int[256];
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2) {
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i6 + 1;
                int i8 = i3 + 1;
                iArr[i3] = ((bArr[i4] & 255) << 16) | AbstractJceStruct.BYTE | ((bArr[i5] & 255) << 8) | (bArr[i6] & 255);
                i4 = i7;
                i3 = i8;
            }
        } catch (BufferUnderflowException e2) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e2);
            }
            this.c.b = 1;
        }
        return iArr;
    }

    public final int f() {
        return this.b.getShort();
    }

    public final void g() {
        int c2;
        do {
            c2 = c();
            this.b.position(Math.min(this.b.position() + c2, this.b.limit()));
        } while (c2 > 0);
    }
}
