package m.a.a.a.a.b;

import g.a.a.a.a;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class c {
    public final int[] a;

    public c(int i2) {
        int[] iArr = new int[((1 << (i2 + 1)) - 1)];
        this.a = iArr;
        Arrays.fill(iArr, -1);
    }

    public static c b(InputStream inputStream, int i2) throws IOException {
        int read = inputStream.read() + 1;
        if (read != 0) {
            byte[] bArr = new byte[read];
            new DataInputStream(inputStream).readFully(bArr);
            int[] iArr = new int[i2];
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < read; i5++) {
                byte b = bArr[i5];
                int i6 = ((b & 240) >> 4) + 1;
                int i7 = (b & 15) + 1;
                int i8 = 0;
                while (i8 < i6) {
                    iArr[i4] = i7;
                    i8++;
                    i4++;
                }
                i3 = Math.max(i3, i7);
            }
            int[] iArr2 = new int[i2];
            for (int i9 = 0; i9 < i2; i9++) {
                iArr2[i9] = i9;
            }
            int[] iArr3 = new int[i2];
            int i10 = 0;
            for (int i11 = 0; i11 < i2; i11++) {
                for (int i12 = 0; i12 < i2; i12++) {
                    if (iArr[i12] == i11) {
                        iArr3[i10] = i11;
                        iArr2[i10] = i12;
                        i10++;
                    }
                }
            }
            int[] iArr4 = new int[i2];
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = i2 - 1; i16 >= 0; i16--) {
                i13 += i14;
                if (iArr3[i16] != i15) {
                    i15 = iArr3[i16];
                    i14 = 1 << (16 - i15);
                }
                iArr4[iArr2[i16]] = i13;
            }
            c cVar = new c(i3);
            for (int i17 = 0; i17 < i2; i17++) {
                int i18 = iArr[i17];
                if (i18 > 0) {
                    cVar.a(0, Integer.reverse(iArr4[i17] << 16), i18, i17);
                }
            }
            return cVar;
        }
        throw new IOException("Cannot read the size of the encoded tree, unexpected end of stream");
    }

    public void a(int i2, int i3, int i4, int i5) {
        if (i4 == 0) {
            int[] iArr = this.a;
            if (iArr[i2] == -1) {
                iArr[i2] = i5;
                return;
            }
            throw new IllegalArgumentException(a.e(a.j("Tree value at index ", i2, " has already been assigned ("), this.a[i2], ")"));
        }
        this.a[i2] = -2;
        a((i2 * 2) + 1 + (i3 & 1), i3 >>> 1, i4 - 1, i5);
    }

    public int c(d dVar) throws IOException {
        int i2 = 0;
        while (true) {
            int a2 = (int) dVar.a(1);
            if (a2 == -1) {
                return -1;
            }
            int i3 = (i2 * 2) + 1 + a2;
            int i4 = this.a[i3];
            if (i4 == -2) {
                i2 = i3;
            } else if (i4 != -1) {
                return i4;
            } else {
                throw new IOException("The child " + a2 + " of node at index " + i2 + " is not defined");
            }
        }
    }
}
