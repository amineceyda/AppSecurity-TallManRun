package g.e.a.b.e.c;

import g.e.a.b.b.h.e;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

public abstract class s6 implements Iterable, Serializable {
    public static final s6 b = new r6(v7.b);
    private int zzc = 0;

    static {
        int i2 = j6.a;
    }

    public static int w(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i2);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i3 < i2) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(i3);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i3);
            sb3.append(" >= ");
            sb3.append(i4);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    public static s6 y(byte[] bArr, int i2, int i3) {
        w(i2, i2 + i3, bArr.length);
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return new r6(bArr2);
    }

    public abstract byte c(int i2);

    public abstract byte e(int i2);

    public abstract boolean equals(Object obj);

    public abstract int h();

    public final int hashCode() {
        int i2 = this.zzc;
        if (i2 == 0) {
            int h2 = h();
            i2 = i(h2, 0, h2);
            if (i2 == 0) {
                i2 = 1;
            }
            this.zzc = i2;
        }
        return i2;
    }

    public abstract int i(int i2, int i3, int i4);

    public final /* synthetic */ Iterator iterator() {
        return new n6(this);
    }

    public abstract s6 l(int i2, int i3);

    public abstract String m(Charset charset);

    public abstract void p(m6 m6Var) throws IOException;

    public abstract boolean r();

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(h());
        objArr[2] = h() <= 50 ? e.z(this) : e.z(l(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public final int x() {
        return this.zzc;
    }
}
