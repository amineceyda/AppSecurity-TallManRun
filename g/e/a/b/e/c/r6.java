package g.e.a.b.e.c;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

public class r6 extends q6 {
    public final byte[] zza;

    public r6(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zza = bArr;
    }

    public byte c(int i2) {
        return this.zza[i2];
    }

    public byte e(int i2) {
        return this.zza[i2];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s6) || h() != ((s6) obj).h()) {
            return false;
        }
        if (h() == 0) {
            return true;
        }
        if (!(obj instanceof r6)) {
            return obj.equals(this);
        }
        r6 r6Var = (r6) obj;
        int x = x();
        int x2 = r6Var.x();
        if (x != 0 && x2 != 0 && x != x2) {
            return false;
        }
        int h2 = h();
        if (h2 > r6Var.h()) {
            int h3 = h();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(h2);
            sb.append(h3);
            throw new IllegalArgumentException(sb.toString());
        } else if (h2 <= r6Var.h()) {
            byte[] bArr = this.zza;
            byte[] bArr2 = r6Var.zza;
            r6Var.z();
            int i2 = 0;
            int i3 = 0;
            while (i2 < h2) {
                if (bArr[i2] != bArr2[i3]) {
                    return false;
                }
                i2++;
                i3++;
            }
            return true;
        } else {
            int h4 = r6Var.h();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(h2);
            sb2.append(", ");
            sb2.append(h4);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public int h() {
        return this.zza.length;
    }

    public final int i(int i2, int i3, int i4) {
        byte[] bArr = this.zza;
        Charset charset = v7.a;
        for (int i5 = 0; i5 < i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    public final s6 l(int i2, int i3) {
        int w = s6.w(0, i3, h());
        return w == 0 ? s6.b : new p6(this.zza, w);
    }

    public final String m(Charset charset) {
        return new String(this.zza, 0, h(), charset);
    }

    public final void p(m6 m6Var) throws IOException {
        ((w6) m6Var).y(this.zza, 0, h());
    }

    public final boolean r() {
        return y9.d(this.zza, 0, h());
    }

    public int z() {
        return 0;
    }
}
