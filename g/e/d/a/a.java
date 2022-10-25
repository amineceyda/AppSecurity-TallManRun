package g.e.d.a;

import com.google.android.gms.common.ConnectionResult;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;

public final class a {
    public final byte[] a;
    public int b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f3818d;

    /* renamed from: e  reason: collision with root package name */
    public int f3819e;

    /* renamed from: f  reason: collision with root package name */
    public int f3820f;

    /* renamed from: g  reason: collision with root package name */
    public int f3821g = Integer.MAX_VALUE;

    /* renamed from: h  reason: collision with root package name */
    public int f3822h;

    public a(byte[] bArr, int i2, int i3) {
        this.a = bArr;
        this.b = i2;
        this.c = i3 + i2;
        this.f3819e = i2;
    }

    public void a(int i2) throws InvalidProtocolBufferNanoException {
        if (this.f3820f != i2) {
            throw new InvalidProtocolBufferNanoException("Protocol message end-group tag did not match expected tag.");
        }
    }

    public int b(int i2) throws InvalidProtocolBufferNanoException {
        if (i2 >= 0) {
            int i3 = i2 + this.f3819e;
            int i4 = this.f3821g;
            if (i3 <= i4) {
                this.f3821g = i3;
                q();
                return i4;
            }
            throw InvalidProtocolBufferNanoException.b();
        }
        throw InvalidProtocolBufferNanoException.a();
    }

    public boolean c() throws IOException {
        return m() != 0;
    }

    public byte[] d() throws IOException {
        int m2 = m();
        int i2 = this.c;
        int i3 = this.f3819e;
        if (m2 > i2 - i3 || m2 <= 0) {
            return m2 == 0 ? e.c : j(m2);
        }
        byte[] bArr = new byte[m2];
        System.arraycopy(this.a, i3, bArr, 0, m2);
        this.f3819e += m2;
        return bArr;
    }

    public double e() throws IOException {
        return Double.longBitsToDouble(l());
    }

    public float f() throws IOException {
        return Float.intBitsToFloat(k());
    }

    public void g(d dVar) throws IOException {
        int m2 = m();
        if (this.f3822h < 64) {
            int b2 = b(m2);
            this.f3822h++;
            dVar.mergeFrom(this);
            a(0);
            this.f3822h--;
            this.f3821g = b2;
            q();
            return;
        }
        throw new InvalidProtocolBufferNanoException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public Object h(int i2) throws IOException {
        switch (i2) {
            case 1:
                return Double.valueOf(e());
            case 2:
                return Float.valueOf(f());
            case 3:
                return Long.valueOf(n());
            case 4:
                return Long.valueOf(n());
            case 5:
                return Integer.valueOf(m());
            case 6:
                return Long.valueOf(l());
            case 7:
                return Integer.valueOf(k());
            case 8:
                return Boolean.valueOf(c());
            case 9:
                return o();
            case 12:
                return d();
            case ConnectionResult.CANCELED:
                return Integer.valueOf(m());
            case ConnectionResult.TIMEOUT:
                return Integer.valueOf(m());
            case ConnectionResult.INTERRUPTED:
                return Integer.valueOf(k());
            case ConnectionResult.API_UNAVAILABLE:
                return Long.valueOf(l());
            case ConnectionResult.SIGN_IN_FAILED:
                int m2 = m();
                return Integer.valueOf((-(m2 & 1)) ^ (m2 >>> 1));
            case ConnectionResult.SERVICE_UPDATING:
                long n = n();
                return Long.valueOf((-(n & 1)) ^ (n >>> 1));
            default:
                throw new IllegalArgumentException(g.a.a.a.a.q("Unknown type ", i2));
        }
    }

    public byte i() throws IOException {
        int i2 = this.f3819e;
        if (i2 != this.c) {
            byte[] bArr = this.a;
            this.f3819e = i2 + 1;
            return bArr[i2];
        }
        throw InvalidProtocolBufferNanoException.b();
    }

    public byte[] j(int i2) throws IOException {
        if (i2 >= 0) {
            int i3 = this.f3819e;
            int i4 = i3 + i2;
            int i5 = this.f3821g;
            if (i4 > i5) {
                t(i5 - i3);
                throw InvalidProtocolBufferNanoException.b();
            } else if (i2 <= this.c - i3) {
                byte[] bArr = new byte[i2];
                System.arraycopy(this.a, i3, bArr, 0, i2);
                this.f3819e += i2;
                return bArr;
            } else {
                throw InvalidProtocolBufferNanoException.b();
            }
        } else {
            throw InvalidProtocolBufferNanoException.a();
        }
    }

    public int k() throws IOException {
        return (i() & 255) | ((i() & 255) << 8) | ((i() & 255) << 16) | ((i() & 255) << 24);
    }

    public long l() throws IOException {
        byte i2 = i();
        byte i3 = i();
        return ((((long) i3) & 255) << 8) | (((long) i2) & 255) | ((((long) i()) & 255) << 16) | ((((long) i()) & 255) << 24) | ((((long) i()) & 255) << 32) | ((((long) i()) & 255) << 40) | ((((long) i()) & 255) << 48) | ((((long) i()) & 255) << 56);
    }

    public int m() throws IOException {
        int i2;
        byte i3 = i();
        if (i3 >= 0) {
            return i3;
        }
        byte b2 = i3 & Byte.MAX_VALUE;
        byte i4 = i();
        if (i4 >= 0) {
            i2 = i4 << 7;
        } else {
            b2 |= (i4 & Byte.MAX_VALUE) << 7;
            byte i5 = i();
            if (i5 >= 0) {
                i2 = i5 << 14;
            } else {
                b2 |= (i5 & Byte.MAX_VALUE) << 14;
                byte i6 = i();
                if (i6 >= 0) {
                    i2 = i6 << 21;
                } else {
                    byte b3 = b2 | ((i6 & Byte.MAX_VALUE) << 21);
                    byte i7 = i();
                    byte b4 = b3 | (i7 << 28);
                    if (i7 >= 0) {
                        return b4;
                    }
                    for (int i8 = 0; i8 < 5; i8++) {
                        if (i() >= 0) {
                            return b4;
                        }
                    }
                    throw new InvalidProtocolBufferNanoException("CodedInputStream encountered a malformed varint.");
                }
            }
        }
        return b2 | i2;
    }

    public long n() throws IOException {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte i3 = i();
            j2 |= ((long) (i3 & Byte.MAX_VALUE)) << i2;
            if ((i3 & 128) == 0) {
                return j2;
            }
        }
        throw new InvalidProtocolBufferNanoException("CodedInputStream encountered a malformed varint.");
    }

    public String o() throws IOException {
        int m2 = m();
        if (m2 > this.c - this.f3819e || m2 <= 0) {
            return new String(j(m2), b.a);
        }
        String str = new String(this.a, this.f3819e, m2, b.a);
        this.f3819e += m2;
        return str;
    }

    public int p() throws IOException {
        if (this.f3819e == this.c) {
            this.f3820f = 0;
            return 0;
        }
        int m2 = m();
        this.f3820f = m2;
        if (m2 != 0) {
            return m2;
        }
        throw new InvalidProtocolBufferNanoException("Protocol message contained an invalid tag (zero).");
    }

    public final void q() {
        int i2 = this.c + this.f3818d;
        this.c = i2;
        int i3 = this.f3821g;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f3818d = i4;
            this.c = i2 - i4;
            return;
        }
        this.f3818d = 0;
    }

    public void r(int i2) {
        int i3 = this.f3819e;
        int i4 = this.b;
        if (i2 > i3 - i4) {
            StringBuilder j2 = g.a.a.a.a.j("Position ", i2, " is beyond current ");
            j2.append(this.f3819e - this.b);
            throw new IllegalArgumentException(j2.toString());
        } else if (i2 >= 0) {
            this.f3819e = i4 + i2;
        } else {
            throw new IllegalArgumentException(g.a.a.a.a.q("Bad position ", i2));
        }
    }

    public boolean s(int i2) throws IOException {
        int p;
        int i3 = i2 & 7;
        if (i3 == 0) {
            m();
            return true;
        } else if (i3 == 1) {
            l();
            return true;
        } else if (i3 == 2) {
            t(m());
            return true;
        } else if (i3 == 3) {
            do {
                p = p();
                if (p == 0 || !s(p)) {
                    a(((i2 >>> 3) << 3) | 4);
                }
                p = p();
                break;
            } while (!s(p));
            a(((i2 >>> 3) << 3) | 4);
            return true;
        } else if (i3 == 4) {
            return false;
        } else {
            if (i3 == 5) {
                k();
                return true;
            }
            throw new InvalidProtocolBufferNanoException("Protocol message tag had invalid wire type.");
        }
    }

    public void t(int i2) throws IOException {
        if (i2 >= 0) {
            int i3 = this.f3819e;
            int i4 = i3 + i2;
            int i5 = this.f3821g;
            if (i4 > i5) {
                t(i5 - i3);
                throw InvalidProtocolBufferNanoException.b();
            } else if (i2 <= this.c - i3) {
                this.f3819e = i3 + i2;
            } else {
                throw InvalidProtocolBufferNanoException.b();
            }
        } else {
            throw InvalidProtocolBufferNanoException.a();
        }
    }
}
