package m.a.b.a.a.a.b;

import g.a.a.a.a;
import java.util.Date;
import java.util.zip.ZipException;

public class s implements g0 {

    /* renamed from: e  reason: collision with root package name */
    public static final k0 f5212e = new k0(10);

    /* renamed from: f  reason: collision with root package name */
    public static final k0 f5213f = new k0(1);

    /* renamed from: g  reason: collision with root package name */
    public static final k0 f5214g = new k0(24);
    public d0 b;
    public d0 c;

    /* renamed from: d  reason: collision with root package name */
    public d0 f5215d;

    public s() {
        d0 d0Var = d0.b;
        this.b = d0Var;
        this.c = d0Var;
        this.f5215d = d0Var;
    }

    public static Date f(d0 d0Var) {
        if (d0Var == null || d0.b.equals(d0Var)) {
            return null;
        }
        return new Date((d0Var.b() - 116444736000000000L) / 10000);
    }

    public k0 a() {
        return f5212e;
    }

    public k0 b() {
        return new k0(32);
    }

    public byte[] c() {
        return h();
    }

    public k0 d() {
        return b();
    }

    public void e(byte[] bArr, int i2, int i3) throws ZipException {
        d0 d0Var = d0.b;
        this.b = d0Var;
        this.c = d0Var;
        this.f5215d = d0Var;
        g(bArr, i2, i3);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        d0 d0Var = this.b;
        d0 d0Var2 = sVar.b;
        if (d0Var != d0Var2 && (d0Var == null || !d0Var.equals(d0Var2))) {
            return false;
        }
        d0 d0Var3 = this.c;
        d0 d0Var4 = sVar.c;
        if (d0Var3 != d0Var4 && (d0Var3 == null || !d0Var3.equals(d0Var4))) {
            return false;
        }
        d0 d0Var5 = this.f5215d;
        d0 d0Var6 = sVar.f5215d;
        return d0Var5 == d0Var6 || (d0Var5 != null && d0Var5.equals(d0Var6));
    }

    public void g(byte[] bArr, int i2, int i3) throws ZipException {
        int i4 = i3 + i2;
        int i5 = i2 + 4;
        while (i5 + 4 <= i4) {
            k0 k0Var = new k0(bArr, i5);
            int i6 = i5 + 2;
            if (!k0Var.equals(f5213f)) {
                i5 = i6 + new k0(bArr, i6).c() + 2;
            } else if (i4 - i6 >= 26) {
                if (f5214g.equals(new k0(bArr, i6))) {
                    int i7 = i6 + 2;
                    this.b = new d0(bArr, i7);
                    int i8 = i7 + 8;
                    this.c = new d0(bArr, i8);
                    this.f5215d = new d0(bArr, i8 + 8);
                    return;
                }
                return;
            } else {
                return;
            }
        }
    }

    public byte[] h() {
        byte[] bArr = new byte[b().c()];
        System.arraycopy(f5213f.a(), 0, bArr, 4, 2);
        System.arraycopy(f5214g.a(), 0, bArr, 6, 2);
        System.arraycopy(this.b.a(), 0, bArr, 8, 8);
        System.arraycopy(this.c.a(), 0, bArr, 16, 8);
        System.arraycopy(this.f5215d.a(), 0, bArr, 24, 8);
        return bArr;
    }

    public int hashCode() {
        d0 d0Var = this.b;
        int i2 = -123;
        if (d0Var != null) {
            i2 = -123 ^ d0Var.hashCode();
        }
        d0 d0Var2 = this.c;
        if (d0Var2 != null) {
            i2 ^= Integer.rotateLeft(d0Var2.hashCode(), 11);
        }
        d0 d0Var3 = this.f5215d;
        return d0Var3 != null ? i2 ^ Integer.rotateLeft(d0Var3.hashCode(), 22) : i2;
    }

    public String toString() {
        StringBuilder l2 = a.l("0x000A Zip Extra Field:", " Modify:[");
        l2.append(f(this.b));
        l2.append("] ");
        l2.append(" Access:[");
        l2.append(f(this.c));
        l2.append("] ");
        l2.append(" Create:[");
        l2.append(f(this.f5215d));
        l2.append("] ");
        return l2.toString();
    }
}
