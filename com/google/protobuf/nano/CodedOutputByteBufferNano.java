package com.google.protobuf.nano;

import com.google.android.gms.common.ConnectionResult;
import g.a.a.a.a;
import g.e.d.a.d;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public final class CodedOutputByteBufferNano {
    public final ByteBuffer a;

    public static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException(int i2, int i3) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + i2 + " limit " + i3 + ").");
        }
    }

    public CodedOutputByteBufferNano(byte[] bArr, int i2, int i3) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i2, i3);
        this.a = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public static int a(int i2, boolean z) {
        return k(i2) + 1;
    }

    public static int b(int i2, double d2) {
        return k(i2) + 8;
    }

    public static int c(int i2, int i3, Object obj) {
        int i4;
        int i5;
        switch (i3) {
            case 1:
                return b(i2, ((Double) obj).doubleValue());
            case 2:
                return d(i2, ((Float) obj).floatValue());
            case 3:
                return f(i2, ((Long) obj).longValue());
            case 4:
                return l(i2, ((Long) obj).longValue());
            case 5:
                return e(i2, ((Integer) obj).intValue());
            case 6:
                ((Long) obj).longValue();
                return k(i2) + 8;
            case 7:
                ((Integer) obj).intValue();
                return k(i2) + 4;
            case 8:
                return a(i2, ((Boolean) obj).booleanValue());
            case 9:
                return j(i2, (String) obj);
            case 10:
                i5 = k(i2) * 2;
                i4 = ((d) obj).getSerializedSize();
                break;
            case 11:
                return g(i2, (d) obj);
            case 12:
                byte[] bArr = (byte[]) obj;
                i5 = k(i2);
                i4 = h(bArr.length) + bArr.length;
                break;
            case ConnectionResult.CANCELED:
                int intValue = ((Integer) obj).intValue();
                i5 = k(i2);
                i4 = h(intValue);
                break;
            case ConnectionResult.TIMEOUT:
                int intValue2 = ((Integer) obj).intValue();
                i5 = k(i2);
                i4 = h(intValue2);
                break;
            case ConnectionResult.INTERRUPTED:
                ((Integer) obj).intValue();
                return k(i2) + 4;
            case ConnectionResult.API_UNAVAILABLE:
                ((Long) obj).longValue();
                return k(i2) + 8;
            case ConnectionResult.SIGN_IN_FAILED:
                int intValue3 = ((Integer) obj).intValue();
                i5 = k(i2);
                i4 = h((intValue3 >> 31) ^ (intValue3 << 1));
                break;
            case ConnectionResult.SERVICE_UPDATING:
                long longValue = ((Long) obj).longValue();
                i5 = k(i2);
                i4 = i((longValue >> 63) ^ (longValue << 1));
                break;
            default:
                throw new IllegalArgumentException(a.q("Unknown type: ", i3));
        }
        return i4 + i5;
    }

    public static int d(int i2, float f2) {
        return k(i2) + 4;
    }

    public static int e(int i2, int i3) {
        return k(i2) + (i3 >= 0 ? h(i3) : 10);
    }

    public static int f(int i2, long j2) {
        return k(i2) + i(j2);
    }

    public static int g(int i2, d dVar) {
        int k2 = k(i2);
        int serializedSize = dVar.getSerializedSize();
        return k2 + h(serializedSize) + serializedSize;
    }

    public static int h(int i2) {
        if ((i2 & -128) == 0) {
            return 1;
        }
        if ((i2 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i2) == 0) {
            return 3;
        }
        return (i2 & -268435456) == 0 ? 4 : 5;
    }

    public static int i(long j2) {
        if ((-128 & j2) == 0) {
            return 1;
        }
        if ((-16384 & j2) == 0) {
            return 2;
        }
        if ((-2097152 & j2) == 0) {
            return 3;
        }
        if ((-268435456 & j2) == 0) {
            return 4;
        }
        if ((-34359738368L & j2) == 0) {
            return 5;
        }
        if ((-4398046511104L & j2) == 0) {
            return 6;
        }
        if ((-562949953421312L & j2) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j2) == 0) {
            return 8;
        }
        return (j2 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int j(int i2, String str) {
        int k2 = k(i2);
        int o = o(str);
        return k2 + h(o) + o;
    }

    public static int k(int i2) {
        return h((i2 << 3) | 0);
    }

    public static int l(int i2, long j2) {
        return k(i2) + i(j2);
    }

    public static int m(CharSequence charSequence, byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        char charAt;
        int length = charSequence.length();
        int i6 = i3 + i2;
        int i7 = 0;
        while (i7 < length && (i5 = i7 + i2) < i6 && (charAt = charSequence.charAt(i7)) < 128) {
            bArr[i5] = (byte) charAt;
            i7++;
        }
        if (i7 == length) {
            return i2 + length;
        }
        int i8 = i2 + i7;
        while (i7 < length) {
            char charAt2 = charSequence.charAt(i7);
            if (charAt2 < 128 && i8 < i6) {
                i4 = i8 + 1;
                bArr[i8] = (byte) charAt2;
            } else if (charAt2 < 2048 && i8 <= i6 - 2) {
                int i9 = i8 + 1;
                bArr[i8] = (byte) ((charAt2 >>> 6) | 960);
                i8 = i9 + 1;
                bArr[i9] = (byte) ((charAt2 & '?') | 128);
                i7++;
            } else if ((charAt2 < 55296 || 57343 < charAt2) && i8 <= i6 - 3) {
                int i10 = i8 + 1;
                bArr[i8] = (byte) ((charAt2 >>> 12) | 480);
                int i11 = i10 + 1;
                bArr[i10] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i4 = i11 + 1;
                bArr[i11] = (byte) ((charAt2 & '?') | 128);
            } else if (i8 <= i6 - 4) {
                int i12 = i7 + 1;
                if (i12 != charSequence.length()) {
                    char charAt3 = charSequence.charAt(i12);
                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                        int i13 = i8 + 1;
                        bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                        int i14 = i13 + 1;
                        bArr[i13] = (byte) (((codePoint >>> 12) & 63) | 128);
                        int i15 = i14 + 1;
                        bArr[i14] = (byte) (((codePoint >>> 6) & 63) | 128);
                        i8 = i15 + 1;
                        bArr[i15] = (byte) ((codePoint & 63) | 128);
                        i7 = i12;
                        i7++;
                    } else {
                        i7 = i12;
                    }
                }
                StringBuilder i16 = a.i("Unpaired surrogate at index ");
                i16.append(i7 - 1);
                throw new IllegalArgumentException(i16.toString());
            } else {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i8);
            }
            i8 = i4;
            i7++;
        }
        return i8;
    }

    public static void n(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i2;
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        } else if (byteBuffer.hasArray()) {
            try {
                byteBuffer.position(m(charSequence, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()) - byteBuffer.arrayOffset());
            } catch (ArrayIndexOutOfBoundsException e2) {
                BufferOverflowException bufferOverflowException = new BufferOverflowException();
                bufferOverflowException.initCause(e2);
                throw bufferOverflowException;
            }
        } else {
            int length = charSequence.length();
            int i3 = 0;
            while (i3 < length) {
                char charAt = charSequence.charAt(i3);
                if (charAt >= 128) {
                    if (charAt < 2048) {
                        i2 = (charAt >>> 6) | 960;
                    } else if (charAt < 55296 || 57343 < charAt) {
                        byteBuffer.put((byte) ((charAt >>> 12) | 480));
                        i2 = ((charAt >>> 6) & 63) | 128;
                    } else {
                        int i4 = i3 + 1;
                        if (i4 != charSequence.length()) {
                            char charAt2 = charSequence.charAt(i4);
                            if (Character.isSurrogatePair(charAt, charAt2)) {
                                int codePoint = Character.toCodePoint(charAt, charAt2);
                                byteBuffer.put((byte) ((codePoint >>> 18) | 240));
                                byteBuffer.put((byte) (((codePoint >>> 12) & 63) | 128));
                                byteBuffer.put((byte) (((codePoint >>> 6) & 63) | 128));
                                byteBuffer.put((byte) ((codePoint & 63) | 128));
                                i3 = i4;
                                i3++;
                            } else {
                                i3 = i4;
                            }
                        }
                        StringBuilder i5 = a.i("Unpaired surrogate at index ");
                        i5.append(i3 - 1);
                        throw new IllegalArgumentException(i5.toString());
                    }
                    byteBuffer.put((byte) i2);
                    charAt = (charAt & '?') | 128;
                }
                byteBuffer.put((byte) charAt);
                i3++;
            }
        }
    }

    public static int o(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        while (i3 < length && charSequence.charAt(i3) < 128) {
            i3++;
        }
        int i4 = length;
        while (true) {
            if (i3 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i3);
            if (charAt < 2048) {
                i4 += (127 - charAt) >>> 31;
                i3++;
            } else {
                int length2 = charSequence.length();
                while (i3 < length2) {
                    char charAt2 = charSequence.charAt(i3);
                    if (charAt2 < 2048) {
                        i2 += (127 - charAt2) >>> 31;
                    } else {
                        i2 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i3) >= 65536) {
                                i3++;
                            } else {
                                throw new IllegalArgumentException(a.q("Unpaired surrogate at index ", i3));
                            }
                        }
                    }
                    i3++;
                }
                i4 += i2;
            }
        }
        if (i4 >= length) {
            return i4;
        }
        StringBuilder i5 = a.i("UTF-8 length does not fit in int: ");
        i5.append(((long) i4) + 4294967296L);
        throw new IllegalArgumentException(i5.toString());
    }

    public void A(int i2) throws IOException {
        while ((i2 & -128) != 0) {
            x((i2 & 127) | 128);
            i2 >>>= 7;
        }
        x(i2);
    }

    public void B(long j2) throws IOException {
        while ((-128 & j2) != 0) {
            x((((int) j2) & 127) | 128);
            j2 >>>= 7;
        }
        x((int) j2);
    }

    public void C(int i2, String str) throws IOException {
        A((i2 << 3) | 2);
        try {
            int h2 = h(str.length());
            if (h2 == h(str.length() * 3)) {
                int position = this.a.position();
                if (this.a.remaining() >= h2) {
                    this.a.position(position + h2);
                    n(str, this.a);
                    int position2 = this.a.position();
                    this.a.position(position);
                    A((position2 - position) - h2);
                    this.a.position(position2);
                    return;
                }
                throw new OutOfSpaceException(position + h2, this.a.limit());
            }
            A(o(str));
            n(str, this.a);
        } catch (BufferOverflowException e2) {
            OutOfSpaceException outOfSpaceException = new OutOfSpaceException(this.a.position(), this.a.limit());
            outOfSpaceException.initCause(e2);
            throw outOfSpaceException;
        }
    }

    public void D(int i2, long j2) throws IOException {
        A((i2 << 3) | 0);
        B(j2);
    }

    public void p(int i2, boolean z) throws IOException {
        A((i2 << 3) | 0);
        x(z ? 1 : 0);
    }

    public void q(int i2, byte[] bArr) throws IOException {
        A((i2 << 3) | 2);
        A(bArr.length);
        int length = bArr.length;
        if (this.a.remaining() >= length) {
            this.a.put(bArr, 0, length);
            return;
        }
        throw new OutOfSpaceException(this.a.position(), this.a.limit());
    }

    public void r(int i2, double d2) throws IOException {
        A((i2 << 3) | 1);
        z(Double.doubleToLongBits(d2));
    }

    public void s(int i2, int i3, Object obj) throws IOException {
        switch (i3) {
            case 1:
                double doubleValue = ((Double) obj).doubleValue();
                A((i2 << 3) | 1);
                z(Double.doubleToLongBits(doubleValue));
                return;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                A((i2 << 3) | 5);
                y(Float.floatToIntBits(floatValue));
                return;
            case 3:
                long longValue = ((Long) obj).longValue();
                A((i2 << 3) | 0);
                B(longValue);
                return;
            case 4:
                long longValue2 = ((Long) obj).longValue();
                A((i2 << 3) | 0);
                B(longValue2);
                return;
            case 5:
                u(i2, ((Integer) obj).intValue());
                return;
            case 6:
                long longValue3 = ((Long) obj).longValue();
                A((i2 << 3) | 1);
                z(longValue3);
                return;
            case 7:
                int intValue = ((Integer) obj).intValue();
                A((i2 << 3) | 5);
                y(intValue);
                return;
            case 8:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                A((i2 << 3) | 0);
                x(booleanValue ? 1 : 0);
                return;
            case 9:
                C(i2, (String) obj);
                return;
            case 10:
                int i4 = i2 << 3;
                A(i4 | 3);
                ((d) obj).writeTo(this);
                A(i4 | 4);
                return;
            case 11:
                w(i2, (d) obj);
                return;
            case 12:
                q(i2, (byte[]) obj);
                return;
            case ConnectionResult.CANCELED:
                int intValue2 = ((Integer) obj).intValue();
                A((i2 << 3) | 0);
                A(intValue2);
                return;
            case ConnectionResult.TIMEOUT:
                int intValue3 = ((Integer) obj).intValue();
                A((i2 << 3) | 0);
                A(intValue3);
                return;
            case ConnectionResult.INTERRUPTED:
                int intValue4 = ((Integer) obj).intValue();
                A((i2 << 3) | 5);
                y(intValue4);
                return;
            case ConnectionResult.API_UNAVAILABLE:
                long longValue4 = ((Long) obj).longValue();
                A((i2 << 3) | 1);
                z(longValue4);
                return;
            case ConnectionResult.SIGN_IN_FAILED:
                int intValue5 = ((Integer) obj).intValue();
                A((i2 << 3) | 0);
                A((intValue5 << 1) ^ (intValue5 >> 31));
                return;
            case ConnectionResult.SERVICE_UPDATING:
                long longValue5 = ((Long) obj).longValue();
                A((i2 << 3) | 0);
                B((longValue5 >> 63) ^ (longValue5 << 1));
                return;
            default:
                throw new IOException(a.q("Unknown type: ", i3));
        }
    }

    public void t(int i2, float f2) throws IOException {
        A((i2 << 3) | 5);
        y(Float.floatToIntBits(f2));
    }

    public void u(int i2, int i3) throws IOException {
        A((i2 << 3) | 0);
        if (i3 >= 0) {
            A(i3);
        } else {
            B((long) i3);
        }
    }

    public void v(int i2, long j2) throws IOException {
        A((i2 << 3) | 0);
        B(j2);
    }

    public void w(int i2, d dVar) throws IOException {
        A((i2 << 3) | 2);
        A(dVar.getCachedSize());
        dVar.writeTo(this);
    }

    public void x(int i2) throws IOException {
        byte b = (byte) i2;
        if (this.a.hasRemaining()) {
            this.a.put(b);
            return;
        }
        throw new OutOfSpaceException(this.a.position(), this.a.limit());
    }

    public void y(int i2) throws IOException {
        if (this.a.remaining() >= 4) {
            this.a.putInt(i2);
            return;
        }
        throw new OutOfSpaceException(this.a.position(), this.a.limit());
    }

    public void z(long j2) throws IOException {
        if (this.a.remaining() >= 8) {
            this.a.putLong(j2);
            return;
        }
        throw new OutOfSpaceException(this.a.position(), this.a.limit());
    }
}
