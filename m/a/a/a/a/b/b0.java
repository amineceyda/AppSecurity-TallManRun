package m.a.a.a.a.b;

import g.a.a.a.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import m.a.a.a.a.b.g;

public class b0 extends ZipEntry {

    /* renamed from: k  reason: collision with root package name */
    public static final byte[] f5002k = new byte[0];

    /* renamed from: l  reason: collision with root package name */
    public static final g0[] f5003l = new g0[0];
    public int b = -1;
    public long c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f5004d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f5005e = 0;

    /* renamed from: f  reason: collision with root package name */
    public long f5006f = 0;

    /* renamed from: g  reason: collision with root package name */
    public g0[] f5007g;

    /* renamed from: h  reason: collision with root package name */
    public p f5008h = null;

    /* renamed from: i  reason: collision with root package name */
    public String f5009i = null;

    /* renamed from: j  reason: collision with root package name */
    public i f5010j = new i();

    public b0() {
        super("");
        g("");
    }

    public final g0[] a() {
        g0[] g0VarArr = this.f5007g;
        if (g0VarArr == null) {
            p pVar = this.f5008h;
            if (pVar == null) {
                return f5003l;
            }
            return new g0[]{pVar};
        } else if (this.f5008h == null) {
            return g0VarArr;
        } else {
            int length = g0VarArr.length + 1;
            g0[] g0VarArr2 = new g0[length];
            System.arraycopy(g0VarArr, 0, g0VarArr2, 0, Math.min(g0VarArr.length, length));
            g0VarArr2[this.f5007g.length] = this.f5008h;
            return g0VarArr2;
        }
    }

    public byte[] b() {
        byte[] c2;
        g0[] a = a();
        Map<k0, Class<?>> map = g.a;
        boolean z = a.length > 0 && (a[a.length - 1] instanceof p);
        int length = a.length;
        if (z) {
            length--;
        }
        int i2 = length * 4;
        for (g0 d2 : a) {
            i2 += d2.d().c();
        }
        byte[] bArr = new byte[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            System.arraycopy(a[i4].a().a(), 0, bArr, i3, 2);
            System.arraycopy(a[i4].d().a(), 0, bArr, i3 + 2, 2);
            i3 += 4;
            byte[] c3 = a[i4].c();
            if (c3 != null) {
                System.arraycopy(c3, 0, bArr, i3, c3.length);
                i3 += c3.length;
            }
        }
        if (z && (c2 = a[a.length - 1].c()) != null) {
            System.arraycopy(c2, 0, bArr, i3, c2.length);
        }
        return bArr;
    }

    public g0 c(k0 k0Var) {
        g0[] g0VarArr = this.f5007g;
        if (g0VarArr == null) {
            return null;
        }
        for (g0 g0Var : g0VarArr) {
            if (k0Var.equals(g0Var.a())) {
                return g0Var;
            }
        }
        return null;
    }

    public Object clone() {
        b0 b0Var = (b0) super.clone();
        b0Var.f5004d = this.f5004d;
        b0Var.f5006f = this.f5006f;
        b0Var.f(a());
        return b0Var;
    }

    public final void d(g0[] g0VarArr, boolean z) throws ZipException {
        if (this.f5007g == null) {
            f(g0VarArr);
            return;
        }
        for (p pVar : g0VarArr) {
            boolean z2 = pVar instanceof p;
            g0 c2 = z2 ? this.f5008h : c(pVar.a());
            if (c2 == null) {
                if (z2) {
                    this.f5008h = pVar;
                } else if (this.f5007g == null) {
                    this.f5007g = new g0[]{pVar};
                } else {
                    if (c(pVar.a()) != null) {
                        k0 a = pVar.a();
                        if (this.f5007g != null) {
                            ArrayList arrayList = new ArrayList();
                            for (g0 g0Var : this.f5007g) {
                                if (!a.equals(g0Var.a())) {
                                    arrayList.add(g0Var);
                                }
                            }
                            if (this.f5007g.length != arrayList.size()) {
                                this.f5007g = (g0[]) arrayList.toArray(new g0[arrayList.size()]);
                                e();
                            } else {
                                throw new NoSuchElementException();
                            }
                        } else {
                            throw new NoSuchElementException();
                        }
                    }
                    g0[] g0VarArr2 = this.f5007g;
                    int length = g0VarArr2.length + 1;
                    g0[] g0VarArr3 = new g0[length];
                    System.arraycopy(g0VarArr2, 0, g0VarArr3, 0, Math.min(g0VarArr2.length, length));
                    g0VarArr3[length - 1] = pVar;
                    this.f5007g = g0VarArr3;
                }
                e();
            } else if (z) {
                byte[] h2 = pVar.h();
                c2.g(h2, 0, h2.length);
            } else {
                byte[] c3 = pVar.c();
                c2.e(c3, 0, c3.length);
            }
        }
        e();
    }

    public void e() {
        byte[] h2;
        g0[] a = a();
        Map<k0, Class<?>> map = g.a;
        boolean z = a.length > 0 && (a[a.length - 1] instanceof p);
        int length = a.length;
        if (z) {
            length--;
        }
        int i2 = length * 4;
        for (g0 b2 : a) {
            i2 += b2.b().c();
        }
        byte[] bArr = new byte[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            System.arraycopy(a[i4].a().a(), 0, bArr, i3, 2);
            System.arraycopy(a[i4].b().a(), 0, bArr, i3 + 2, 2);
            i3 += 4;
            byte[] h3 = a[i4].h();
            if (h3 != null) {
                System.arraycopy(h3, 0, bArr, i3, h3.length);
                i3 += h3.length;
            }
        }
        if (z && (h2 = a[a.length - 1].h()) != null) {
            System.arraycopy(h2, 0, bArr, i3, h2.length);
        }
        super.setExtra(bArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b0 b0Var = (b0) obj;
        String name = getName();
        String name2 = b0Var.getName();
        if (name == null) {
            if (name2 != null) {
                return false;
            }
        } else if (!name.equals(name2)) {
            return false;
        }
        String comment = getComment();
        String comment2 = b0Var.getComment();
        if (comment == null) {
            comment = "";
        }
        if (comment2 == null) {
            comment2 = "";
        }
        if (getTime() == b0Var.getTime() && comment.equals(comment2) && this.f5004d == b0Var.f5004d && this.f5005e == b0Var.f5005e && this.f5006f == b0Var.f5006f && this.b == b0Var.b && this.c == b0Var.c && getCrc() == b0Var.getCrc() && getCompressedSize() == b0Var.getCompressedSize() && Arrays.equals(b(), b0Var.b())) {
            byte[] extra = getExtra();
            if (extra == null) {
                extra = f5002k;
            }
            byte[] extra2 = b0Var.getExtra();
            if (extra2 == null) {
                extra2 = f5002k;
            }
            if (!Arrays.equals(extra, extra2) || !this.f5010j.equals(b0Var.f5010j)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void f(g0[] g0VarArr) {
        ArrayList arrayList = new ArrayList();
        for (p pVar : g0VarArr) {
            if (pVar instanceof p) {
                this.f5008h = pVar;
            } else {
                arrayList.add(pVar);
            }
        }
        this.f5007g = (g0[]) arrayList.toArray(new g0[arrayList.size()]);
        e();
    }

    public void g(String str) {
        if (str != null && this.f5005e == 0 && !str.contains("/")) {
            str = str.replace('\\', '/');
        }
        this.f5009i = str;
    }

    public int getMethod() {
        return this.b;
    }

    public String getName() {
        String str = this.f5009i;
        return str == null ? super.getName() : str;
    }

    public long getSize() {
        return this.c;
    }

    public int hashCode() {
        return getName().hashCode();
    }

    public boolean isDirectory() {
        return getName().endsWith("/");
    }

    public void setExtra(byte[] bArr) throws RuntimeException {
        try {
            d(g.b(bArr, true, g.a.a), true);
        } catch (ZipException e2) {
            StringBuilder i2 = a.i("Error parsing extra fields for entry: ");
            i2.append(getName());
            i2.append(" - ");
            i2.append(e2.getMessage());
            throw new RuntimeException(i2.toString(), e2);
        }
    }

    public void setMethod(int i2) {
        if (i2 >= 0) {
            this.b = i2;
            return;
        }
        throw new IllegalArgumentException(a.q("ZIP compression method can not be negative: ", i2));
    }

    public void setSize(long j2) {
        if (j2 >= 0) {
            this.c = j2;
            return;
        }
        throw new IllegalArgumentException("invalid entry size");
    }
}
