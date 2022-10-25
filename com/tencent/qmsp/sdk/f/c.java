package com.tencent.qmsp.sdk.f;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Random;

public class c {
    private byte[] a;
    private byte[] b;
    private byte[] c;

    /* renamed from: d  reason: collision with root package name */
    private int f880d;

    /* renamed from: e  reason: collision with root package name */
    private int f881e;

    /* renamed from: f  reason: collision with root package name */
    private int f882f;

    /* renamed from: g  reason: collision with root package name */
    private int f883g;

    /* renamed from: h  reason: collision with root package name */
    private byte[] f884h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f885i = true;

    /* renamed from: j  reason: collision with root package name */
    private int f886j;

    /* renamed from: k  reason: collision with root package name */
    private Random f887k = new Random();

    private void a() {
        this.f882f = 0;
        while (true) {
            int i2 = this.f882f;
            if (i2 >= 8) {
                break;
            }
            if (this.f885i) {
                byte[] bArr = this.a;
                bArr[i2] = (byte) (bArr[i2] ^ this.b[i2]);
            } else {
                byte[] bArr2 = this.a;
                bArr2[i2] = (byte) (bArr2[i2] ^ this.c[this.f881e + i2]);
            }
            this.f882f = i2 + 1;
        }
        System.arraycopy(b(this.a), 0, this.c, this.f880d, 8);
        this.f882f = 0;
        while (true) {
            int i3 = this.f882f;
            if (i3 < 8) {
                byte[] bArr3 = this.c;
                int i4 = this.f880d + i3;
                bArr3[i4] = (byte) (bArr3[i4] ^ this.b[i3]);
                this.f882f = i3 + 1;
            } else {
                System.arraycopy(this.a, 0, this.b, 0, 8);
                int i5 = this.f880d;
                this.f881e = i5;
                this.f880d = i5 + 8;
                this.f882f = 0;
                this.f885i = false;
                return;
            }
        }
    }

    private boolean a(byte[] bArr, int i2, int i3) {
        this.f882f = 0;
        while (true) {
            int i4 = this.f882f;
            if (i4 >= 8) {
                byte[] a2 = a(this.b);
                this.b = a2;
                if (a2 == null) {
                    return false;
                }
                this.f886j += 8;
                this.f880d += 8;
                this.f882f = 0;
                return true;
            } else if (this.f886j + i4 >= i3) {
                return true;
            } else {
                byte[] bArr2 = this.b;
                bArr2[i4] = (byte) (bArr2[i4] ^ bArr[(this.f880d + i2) + i4]);
                this.f882f = i4 + 1;
            }
        }
    }

    private byte[] a(byte[] bArr) {
        return a(bArr, 0);
    }

    private byte[] a(byte[] bArr, int i2) {
        byte[] bArr2 = bArr;
        int i3 = i2;
        try {
            long b2 = b(bArr2, i3, 4);
            long b3 = b(bArr2, i3 + 4, 4);
            long b4 = b(this.f884h, 0, 4);
            long b5 = b(this.f884h, 4, 4);
            long b6 = b(this.f884h, 8, 4);
            long b7 = b(this.f884h, 12, 4);
            long j2 = 3816266640L;
            int i4 = 16;
            while (true) {
                int i5 = i4 - 1;
                if (i4 > 0) {
                    b3 = (b3 - ((((b2 << 4) + b6) ^ (b2 + j2)) ^ ((b2 >>> 5) + b7))) & 4294967295L;
                    b2 = (b2 - ((((b3 << 4) + b4) ^ (b3 + j2)) ^ ((b3 >>> 5) + b5))) & 4294967295L;
                    j2 = (j2 - 2654435769L) & 4294967295L;
                    i4 = i5;
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8);
                    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                    dataOutputStream.writeInt((int) b2);
                    dataOutputStream.writeInt((int) b3);
                    dataOutputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException unused) {
            return null;
        }
    }

    private int b() {
        return this.f887k.nextInt();
    }

    private static long b(byte[] bArr, int i2, int i3) {
        long j2 = 0;
        int i4 = i3 > 8 ? i2 + 8 : i3 + i2;
        while (i2 < i4) {
            j2 = (j2 << 8) | ((long) (bArr[i2] & 255));
            i2++;
        }
        return (4294967295L & j2) | (j2 >>> 32);
    }

    private byte[] b(byte[] bArr) {
        byte[] bArr2 = bArr;
        try {
            long b2 = b(bArr2, 0, 4);
            long b3 = b(bArr2, 4, 4);
            long b4 = b(this.f884h, 0, 4);
            long b5 = b(this.f884h, 4, 4);
            long b6 = b(this.f884h, 8, 4);
            long b7 = b(this.f884h, 12, 4);
            long j2 = 0;
            int i2 = 16;
            while (true) {
                int i3 = i2 - 1;
                if (i2 > 0) {
                    j2 = (j2 + 2654435769L) & 4294967295L;
                    b2 = (b2 + ((((b3 << 4) + b4) ^ (b3 + j2)) ^ ((b3 >>> 5) + b5))) & 4294967295L;
                    b3 = (b3 + ((((b2 << 4) + b6) ^ (b2 + j2)) ^ ((b2 >>> 5) + b7))) & 4294967295L;
                    i2 = i3;
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8);
                    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                    dataOutputStream.writeInt((int) b2);
                    dataOutputStream.writeInt((int) b3);
                    dataOutputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException unused) {
            return null;
        }
    }

    private byte[] b(byte[] bArr, int i2, int i3, byte[] bArr2) {
        int i4;
        byte[] bArr3 = new byte[8];
        this.a = bArr3;
        this.b = new byte[8];
        this.f882f = 1;
        this.f883g = 0;
        this.f881e = 0;
        this.f880d = 0;
        this.f884h = bArr2;
        this.f885i = true;
        int i5 = (i3 + 10) % 8;
        this.f882f = i5;
        if (i5 != 0) {
            this.f882f = 8 - i5;
        }
        this.c = new byte[(this.f882f + i3 + 10)];
        bArr3[0] = (byte) ((b() & 248) | this.f882f);
        int i6 = 1;
        while (true) {
            i4 = this.f882f;
            if (i6 > i4) {
                break;
            }
            this.a[i6] = (byte) (b() & 255);
            i6++;
        }
        this.f882f = i4 + 1;
        for (int i7 = 0; i7 < 8; i7++) {
            this.b[i7] = 0;
        }
        this.f883g = 1;
        while (this.f883g <= 2) {
            int i8 = this.f882f;
            if (i8 < 8) {
                byte[] bArr4 = this.a;
                this.f882f = i8 + 1;
                bArr4[i8] = (byte) (b() & 255);
                this.f883g++;
            }
            if (this.f882f == 8) {
                a();
            }
        }
        while (i3 > 0) {
            int i9 = this.f882f;
            if (i9 < 8) {
                byte[] bArr5 = this.a;
                this.f882f = i9 + 1;
                bArr5[i9] = bArr[i2];
                i3--;
                i2++;
            }
            if (this.f882f == 8) {
                a();
            }
        }
        this.f883g = 1;
        while (true) {
            int i10 = this.f883g;
            if (i10 > 7) {
                return this.c;
            }
            int i11 = this.f882f;
            if (i11 < 8) {
                byte[] bArr6 = this.a;
                this.f882f = i11 + 1;
                bArr6[i11] = 0;
                this.f883g = i10 + 1;
            }
            if (this.f882f == 8) {
                a();
            }
        }
    }

    public byte[] a(byte[] bArr, int i2, int i3, byte[] bArr2) {
        int i4 = 0;
        this.f881e = 0;
        this.f880d = 0;
        this.f884h = bArr2;
        int i5 = i2 + 8;
        byte[] bArr3 = new byte[i5];
        if (i3 % 8 != 0 || i3 < 16) {
            return null;
        }
        byte[] a2 = a(bArr, i2);
        this.b = a2;
        byte b2 = a2[0] & 7;
        this.f882f = b2;
        int i6 = (i3 - b2) - 10;
        if (i6 < 0) {
            return null;
        }
        for (int i7 = i2; i7 < i5; i7++) {
            bArr3[i7] = 0;
        }
        this.c = new byte[i6];
        this.f881e = 0;
        this.f880d = 8;
        this.f886j = 8;
        this.f882f++;
        this.f883g = 1;
        while (true) {
            int i8 = this.f883g;
            if (i8 <= 2) {
                int i9 = this.f882f;
                if (i9 < 8) {
                    this.f882f = i9 + 1;
                    this.f883g = i8 + 1;
                }
                if (this.f882f == 8) {
                    if (!a(bArr, i2, i3)) {
                        return null;
                    }
                    bArr3 = bArr;
                }
            } else {
                while (i6 != 0) {
                    int i10 = this.f882f;
                    if (i10 < 8) {
                        this.c[i4] = (byte) (bArr3[(this.f881e + i2) + i10] ^ this.b[i10]);
                        i4++;
                        i6--;
                        this.f882f = i10 + 1;
                    }
                    if (this.f882f == 8) {
                        this.f881e = this.f880d - 8;
                        if (!a(bArr, i2, i3)) {
                            return null;
                        }
                        bArr3 = bArr;
                    }
                }
                this.f883g = 1;
                while (this.f883g < 8) {
                    int i11 = this.f882f;
                    if (i11 < 8) {
                        if ((bArr3[(this.f881e + i2) + i11] ^ this.b[i11]) != 0) {
                            return null;
                        }
                        this.f882f = i11 + 1;
                    }
                    if (this.f882f == 8) {
                        this.f881e = this.f880d;
                        if (!a(bArr, i2, i3)) {
                            return null;
                        }
                        bArr3 = bArr;
                    }
                    this.f883g++;
                }
                return this.c;
            }
        }
    }

    public byte[] a(byte[] bArr, byte[] bArr2) {
        return b(bArr, 0, bArr.length, bArr2);
    }
}
