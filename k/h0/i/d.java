package k.h0.i;

import g.a.a.a.a;
import java.io.IOException;
import k.h0.c;
import l.h;

public final class d {
    public static final h a = h.g("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    public static final String[] b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    public static final String[] c = new String[64];

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f4813d = new String[256];

    static {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            String[] strArr = f4813d;
            if (i3 >= strArr.length) {
                break;
            }
            strArr[i3] = c.n("%8s", Integer.toBinaryString(i3)).replace(' ', '0');
            i3++;
        }
        String[] strArr2 = c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i4 = 0; i4 < 1; i4++) {
            int i5 = iArr[i4];
            String[] strArr3 = c;
            strArr3[i5 | 8] = a.f(new StringBuilder(), strArr3[i5], "|PADDED");
        }
        String[] strArr4 = c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i6 = 0; i6 < 3; i6++) {
            int i7 = iArr2[i6];
            for (int i8 = 0; i8 < 1; i8++) {
                int i9 = iArr[i8];
                String[] strArr5 = c;
                int i10 = i9 | i7;
                strArr5[i10] = strArr5[i9] + '|' + strArr5[i7];
                StringBuilder sb = new StringBuilder();
                sb.append(strArr5[i9]);
                sb.append('|');
                strArr5[i10 | 8] = a.f(sb, strArr5[i7], "|PADDED");
            }
        }
        while (true) {
            String[] strArr6 = c;
            if (i2 < strArr6.length) {
                if (strArr6[i2] == null) {
                    strArr6[i2] = f4813d[i2];
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public static String a(boolean z, int i2, int i3, byte b2, byte b3) {
        String str;
        String str2;
        String str3;
        String[] strArr = b;
        String n = b2 < strArr.length ? strArr[b2] : c.n("0x%02x", Byte.valueOf(b2));
        if (b3 == 0) {
            str = "";
        } else {
            if (!(b2 == 2 || b2 == 3)) {
                if (b2 == 4 || b2 == 6) {
                    str = b3 == 1 ? "ACK" : f4813d[b3];
                } else if (!(b2 == 7 || b2 == 8)) {
                    String[] strArr2 = c;
                    String str4 = b3 < strArr2.length ? strArr2[b3] : f4813d[b3];
                    if (b2 == 5 && (b3 & 4) != 0) {
                        str2 = "HEADERS";
                        str3 = "PUSH_PROMISE";
                    } else if (b2 != 0 || (b3 & 32) == 0) {
                        str = str4;
                    } else {
                        str2 = "PRIORITY";
                        str3 = "COMPRESSED";
                    }
                    str = str4.replace(str2, str3);
                }
            }
            str = f4813d[b3];
        }
        Object[] objArr = new Object[5];
        objArr[0] = z ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = Integer.valueOf(i3);
        objArr[3] = n;
        objArr[4] = str;
        return c.n("%s 0x%08x %5d %-13s %s", objArr);
    }

    public static IllegalArgumentException b(String str, Object... objArr) {
        throw new IllegalArgumentException(c.n(str, objArr));
    }

    public static IOException c(String str, Object... objArr) throws IOException {
        throw new IOException(c.n(str, objArr));
    }
}
