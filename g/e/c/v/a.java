package g.e.c.v;

import com.google.android.gms.common.ConnectionResult;
import com.google.gson.stream.MalformedJsonException;
import g.e.c.t.p;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

public class a implements Closeable {
    public static final char[] q = ")]}'\n".toCharArray();
    public final Reader b;
    public boolean c = false;

    /* renamed from: d  reason: collision with root package name */
    public final char[] f3790d = new char[1024];

    /* renamed from: e  reason: collision with root package name */
    public int f3791e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f3792f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f3793g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f3794h = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f3795i = 0;

    /* renamed from: j  reason: collision with root package name */
    public long f3796j;

    /* renamed from: k  reason: collision with root package name */
    public int f3797k;

    /* renamed from: l  reason: collision with root package name */
    public String f3798l;

    /* renamed from: m  reason: collision with root package name */
    public int[] f3799m;
    public int n;
    public String[] o;
    public int[] p;

    /* renamed from: g.e.c.v.a$a  reason: collision with other inner class name */
    public class C0131a extends p {
    }

    static {
        p.a = new C0131a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f3799m = iArr;
        this.n = 0;
        this.n = 0 + 1;
        iArr[0] = 6;
        this.o = new String[32];
        this.p = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.b = reader;
    }

    public String F() throws IOException {
        String str;
        char c2;
        int i2 = this.f3795i;
        if (i2 == 0) {
            i2 = f();
        }
        if (i2 == 14) {
            str = V();
        } else {
            if (i2 == 12) {
                c2 = '\'';
            } else if (i2 == 13) {
                c2 = '\"';
            } else {
                StringBuilder i3 = g.a.a.a.a.i("Expected a name but was ");
                i3.append(X());
                i3.append(s());
                throw new IllegalStateException(i3.toString());
            }
            str = Q(c2);
        }
        this.f3795i = 0;
        this.o[this.n - 1] = str;
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r1 != '/') goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        r9.f3791e = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        if (r4 != r2) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
        r9.f3791e = r4 - 1;
        r2 = k(2);
        r9.f3791e++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0065, code lost:
        if (r2 != false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0067, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0068, code lost:
        d();
        r2 = r9.f3791e;
        r4 = r0[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
        if (r4 == '*') goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0073, code lost:
        if (r4 == '/') goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0075, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0076, code lost:
        r9.f3791e = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007b, code lost:
        r9.f3791e = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007f, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0085, code lost:
        if ((r9.f3791e + 2) <= r9.f3792f) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008b, code lost:
        if (k(2) == false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008e, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0090, code lost:
        r1 = r9.f3790d;
        r2 = r9.f3791e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0096, code lost:
        if (r1[r2] != 10) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0098, code lost:
        r9.f3793g++;
        r9.f3794h = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a2, code lost:
        if (r4 >= 2) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b1, code lost:
        if (r9.f3790d[r9.f3791e + r4] == "*/".charAt(r4)) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b3, code lost:
        r9.f3791e++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b9, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bc, code lost:
        if (r3 == false) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c3, code lost:
        i0("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c9, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ca, code lost:
        r9.f3791e = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ce, code lost:
        if (r1 != '#') goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d0, code lost:
        d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d8, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int O(boolean r10) throws java.io.IOException {
        /*
            r9 = this;
            char[] r0 = r9.f3790d
        L_0x0002:
            int r1 = r9.f3791e
        L_0x0004:
            int r2 = r9.f3792f
        L_0x0006:
            r3 = 1
            if (r1 != r2) goto L_0x0030
            r9.f3791e = r1
            boolean r1 = r9.k(r3)
            if (r1 != 0) goto L_0x002c
            if (r10 != 0) goto L_0x0015
            r10 = -1
            return r10
        L_0x0015:
            java.io.EOFException r10 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            java.lang.StringBuilder r0 = g.a.a.a.a.i(r0)
            java.lang.String r1 = r9.s()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L_0x002c:
            int r1 = r9.f3791e
            int r2 = r9.f3792f
        L_0x0030:
            int r4 = r1 + 1
            char r1 = r0[r1]
            r5 = 10
            if (r1 != r5) goto L_0x0041
            int r1 = r9.f3793g
            int r1 = r1 + r3
            r9.f3793g = r1
            r9.f3794h = r4
            goto L_0x00d9
        L_0x0041:
            r6 = 32
            if (r1 == r6) goto L_0x00d9
            r6 = 13
            if (r1 == r6) goto L_0x00d9
            r6 = 9
            if (r1 != r6) goto L_0x004f
            goto L_0x00d9
        L_0x004f:
            r6 = 47
            if (r1 != r6) goto L_0x00ca
            r9.f3791e = r4
            r7 = 2
            if (r4 != r2) goto L_0x0068
            int r4 = r4 + -1
            r9.f3791e = r4
            boolean r2 = r9.k(r7)
            int r4 = r9.f3791e
            int r4 = r4 + r3
            r9.f3791e = r4
            if (r2 != 0) goto L_0x0068
            return r1
        L_0x0068:
            r9.d()
            int r2 = r9.f3791e
            char r4 = r0[r2]
            r8 = 42
            if (r4 == r8) goto L_0x007b
            if (r4 == r6) goto L_0x0076
            return r1
        L_0x0076:
            int r2 = r2 + 1
            r9.f3791e = r2
            goto L_0x00d3
        L_0x007b:
            int r2 = r2 + 1
            r9.f3791e = r2
        L_0x007f:
            int r1 = r9.f3791e
            int r1 = r1 + r7
            int r2 = r9.f3792f
            r4 = 0
            if (r1 <= r2) goto L_0x0090
            boolean r1 = r9.k(r7)
            if (r1 == 0) goto L_0x008e
            goto L_0x0090
        L_0x008e:
            r3 = 0
            goto L_0x00bc
        L_0x0090:
            char[] r1 = r9.f3790d
            int r2 = r9.f3791e
            char r1 = r1[r2]
            if (r1 != r5) goto L_0x00a2
            int r1 = r9.f3793g
            int r1 = r1 + r3
            r9.f3793g = r1
            int r2 = r2 + 1
            r9.f3794h = r2
            goto L_0x00b3
        L_0x00a2:
            if (r4 >= r7) goto L_0x00bc
            char[] r1 = r9.f3790d
            int r2 = r9.f3791e
            int r2 = r2 + r4
            char r1 = r1[r2]
            java.lang.String r2 = "*/"
            char r2 = r2.charAt(r4)
            if (r1 == r2) goto L_0x00b9
        L_0x00b3:
            int r1 = r9.f3791e
            int r1 = r1 + r3
            r9.f3791e = r1
            goto L_0x007f
        L_0x00b9:
            int r4 = r4 + 1
            goto L_0x00a2
        L_0x00bc:
            if (r3 == 0) goto L_0x00c3
            int r1 = r9.f3791e
            int r1 = r1 + r7
            goto L_0x0004
        L_0x00c3:
            java.lang.String r10 = "Unterminated comment"
            r9.i0(r10)
            r10 = 0
            throw r10
        L_0x00ca:
            r2 = 35
            r9.f3791e = r4
            if (r1 != r2) goto L_0x00d8
            r9.d()
        L_0x00d3:
            r9.g0()
            goto L_0x0002
        L_0x00d8:
            return r1
        L_0x00d9:
            r1 = r4
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.c.v.a.O(boolean):int");
    }

    public void P() throws IOException {
        int i2 = this.f3795i;
        if (i2 == 0) {
            i2 = f();
        }
        if (i2 == 7) {
            this.f3795i = 0;
            int[] iArr = this.p;
            int i3 = this.n - 1;
            iArr[i3] = iArr[i3] + 1;
            return;
        }
        StringBuilder i4 = g.a.a.a.a.i("Expected null but was ");
        i4.append(X());
        i4.append(s());
        throw new IllegalStateException(i4.toString());
    }

    public final String Q(char c2) throws IOException {
        char[] cArr = this.f3790d;
        StringBuilder sb = null;
        while (true) {
            int i2 = this.f3791e;
            int i3 = this.f3792f;
            int i4 = i2;
            while (true) {
                if (i2 < i3) {
                    int i5 = i2 + 1;
                    char c3 = cArr[i2];
                    if (c3 == c2) {
                        this.f3791e = i5;
                        int i6 = (i5 - i4) - 1;
                        if (sb == null) {
                            return new String(cArr, i4, i6);
                        }
                        sb.append(cArr, i4, i6);
                        return sb.toString();
                    } else if (c3 == '\\') {
                        this.f3791e = i5;
                        int i7 = (i5 - i4) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((i7 + 1) * 2, 16));
                        }
                        sb.append(cArr, i4, i7);
                        sb.append(e0());
                    } else {
                        if (c3 == 10) {
                            this.f3793g++;
                            this.f3794h = i5;
                        }
                        i2 = i5;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i2 - i4) * 2, 16));
                    }
                    sb.append(cArr, i4, i2 - i4);
                    this.f3791e = i2;
                    if (!k(1)) {
                        i0("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    public String S() throws IOException {
        String str;
        char c2;
        int i2 = this.f3795i;
        if (i2 == 0) {
            i2 = f();
        }
        if (i2 == 10) {
            str = V();
        } else {
            if (i2 == 8) {
                c2 = '\'';
            } else if (i2 == 9) {
                c2 = '\"';
            } else if (i2 == 11) {
                str = this.f3798l;
                this.f3798l = null;
            } else if (i2 == 15) {
                str = Long.toString(this.f3796j);
            } else if (i2 == 16) {
                str = new String(this.f3790d, this.f3791e, this.f3797k);
                this.f3791e += this.f3797k;
            } else {
                StringBuilder i3 = g.a.a.a.a.i("Expected a string but was ");
                i3.append(X());
                i3.append(s());
                throw new IllegalStateException(i3.toString());
            }
            str = Q(c2);
        }
        this.f3795i = 0;
        int[] iArr = this.p;
        int i4 = this.n - 1;
        iArr[i4] = iArr[i4] + 1;
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        d();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String V() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = 0
        L_0x0003:
            int r3 = r6.f3791e
            int r4 = r3 + r2
            int r5 = r6.f3792f
            if (r4 >= r5) goto L_0x004e
            char[] r4 = r6.f3790d
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005c
            r4 = 10
            if (r3 == r4) goto L_0x005c
            r4 = 12
            if (r3 == r4) goto L_0x005c
            r4 = 13
            if (r3 == r4) goto L_0x005c
            r4 = 32
            if (r3 == r4) goto L_0x005c
            r4 = 35
            if (r3 == r4) goto L_0x004a
            r4 = 44
            if (r3 == r4) goto L_0x005c
            r4 = 47
            if (r3 == r4) goto L_0x004a
            r4 = 61
            if (r3 == r4) goto L_0x004a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 58
            if (r3 == r4) goto L_0x005c
            r4 = 59
            if (r3 == r4) goto L_0x004a
            switch(r3) {
                case 91: goto L_0x005c;
                case 92: goto L_0x004a;
                case 93: goto L_0x005c;
                default: goto L_0x0047;
            }
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x004a:
            r6.d()
            goto L_0x005c
        L_0x004e:
            char[] r3 = r6.f3790d
            int r3 = r3.length
            if (r2 >= r3) goto L_0x005e
            int r3 = r2 + 1
            boolean r3 = r6.k(r3)
            if (r3 == 0) goto L_0x005c
            goto L_0x0003
        L_0x005c:
            r0 = r2
            goto L_0x007e
        L_0x005e:
            if (r1 != 0) goto L_0x006b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L_0x006b:
            char[] r3 = r6.f3790d
            int r4 = r6.f3791e
            r1.append(r3, r4, r2)
            int r3 = r6.f3791e
            int r3 = r3 + r2
            r6.f3791e = r3
            r2 = 1
            boolean r2 = r6.k(r2)
            if (r2 != 0) goto L_0x0002
        L_0x007e:
            if (r1 != 0) goto L_0x008a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f3790d
            int r3 = r6.f3791e
            r1.<init>(r2, r3, r0)
            goto L_0x0095
        L_0x008a:
            char[] r2 = r6.f3790d
            int r3 = r6.f3791e
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L_0x0095:
            int r2 = r6.f3791e
            int r2 = r2 + r0
            r6.f3791e = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.c.v.a.V():java.lang.String");
    }

    public b X() throws IOException {
        int i2 = this.f3795i;
        if (i2 == 0) {
            i2 = f();
        }
        switch (i2) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case ConnectionResult.CANCELED:
            case ConnectionResult.TIMEOUT:
                return b.NAME;
            case ConnectionResult.INTERRUPTED:
            case ConnectionResult.API_UNAVAILABLE:
                return b.NUMBER;
            case ConnectionResult.SIGN_IN_FAILED:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final void Y(int i2) {
        int i3 = this.n;
        int[] iArr = this.f3799m;
        if (i3 == iArr.length) {
            int i4 = i3 * 2;
            this.f3799m = Arrays.copyOf(iArr, i4);
            this.p = Arrays.copyOf(this.p, i4);
            this.o = (String[]) Arrays.copyOf(this.o, i4);
        }
        int[] iArr2 = this.f3799m;
        int i5 = this.n;
        this.n = i5 + 1;
        iArr2[i5] = i2;
    }

    public void a() throws IOException {
        int i2 = this.f3795i;
        if (i2 == 0) {
            i2 = f();
        }
        if (i2 == 3) {
            Y(1);
            this.p[this.n - 1] = 0;
            this.f3795i = 0;
            return;
        }
        StringBuilder i3 = g.a.a.a.a.i("Expected BEGIN_ARRAY but was ");
        i3.append(X());
        i3.append(s());
        throw new IllegalStateException(i3.toString());
    }

    public void b() throws IOException {
        int i2 = this.f3795i;
        if (i2 == 0) {
            i2 = f();
        }
        if (i2 == 1) {
            Y(3);
            this.f3795i = 0;
            return;
        }
        StringBuilder i3 = g.a.a.a.a.i("Expected BEGIN_OBJECT but was ");
        i3.append(X());
        i3.append(s());
        throw new IllegalStateException(i3.toString());
    }

    public void close() throws IOException {
        this.f3795i = 0;
        this.f3799m[0] = 8;
        this.n = 1;
        this.b.close();
    }

    public final void d() throws IOException {
        if (!this.c) {
            i0("Use JsonReader.setLenient(true) to accept malformed JSON");
            throw null;
        }
    }

    public final char e0() throws IOException {
        int i2;
        int i3;
        if (this.f3791e != this.f3792f || k(1)) {
            char[] cArr = this.f3790d;
            int i4 = this.f3791e;
            int i5 = i4 + 1;
            this.f3791e = i5;
            char c2 = cArr[i4];
            if (c2 == 10) {
                this.f3793g++;
                this.f3794h = i5;
            } else if (!(c2 == '\"' || c2 == '\'' || c2 == '/' || c2 == '\\')) {
                if (c2 == 'b') {
                    return 8;
                }
                if (c2 == 'f') {
                    return 12;
                }
                if (c2 == 'n') {
                    return 10;
                }
                if (c2 == 'r') {
                    return 13;
                }
                if (c2 == 't') {
                    return 9;
                }
                if (c2 != 'u') {
                    i0("Invalid escape sequence");
                    throw null;
                } else if (i5 + 4 <= this.f3792f || k(4)) {
                    char c3 = 0;
                    int i6 = this.f3791e;
                    int i7 = i6 + 4;
                    while (i6 < i7) {
                        char c4 = this.f3790d[i6];
                        char c5 = (char) (c3 << 4);
                        if (c4 < '0' || c4 > '9') {
                            if (c4 >= 'a' && c4 <= 'f') {
                                i3 = c4 - 'a';
                            } else if (c4 < 'A' || c4 > 'F') {
                                StringBuilder i8 = g.a.a.a.a.i("\\u");
                                i8.append(new String(this.f3790d, this.f3791e, 4));
                                throw new NumberFormatException(i8.toString());
                            } else {
                                i3 = c4 - 'A';
                            }
                            i2 = i3 + 10;
                        } else {
                            i2 = c4 - '0';
                        }
                        c3 = (char) (i2 + c5);
                        i6++;
                    }
                    this.f3791e += 4;
                    return c3;
                } else {
                    i0("Unterminated escape sequence");
                    throw null;
                }
            }
            return c2;
        }
        i0("Unterminated escape sequence");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0205, code lost:
        if (q(r6) != false) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0207, code lost:
        if (r13 != 2) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0209, code lost:
        if (r15 == false) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x020f, code lost:
        if (r10 != Long.MIN_VALUE) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0211, code lost:
        if (r16 == false) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0217, code lost:
        if (r10 != 0) goto L_0x021b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0219, code lost:
        if (r16 != false) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x021b, code lost:
        if (r16 == false) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x021e, code lost:
        r10 = -r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x021f, code lost:
        r0.f3796j = r10;
        r0.f3791e += r9;
        r6 = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x022b, code lost:
        if (r13 == 2) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x022e, code lost:
        if (r13 == 4) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0231, code lost:
        if (r13 != 7) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0233, code lost:
        r0.f3797k = r9;
        r6 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0239, code lost:
        r0.f3795i = r6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0174 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int f() throws java.io.IOException {
        /*
            r19 = this;
            r0 = r19
            int[] r1 = r0.f3799m
            int r2 = r0.n
            int r3 = r2 + -1
            r3 = r1[r3]
            r7 = 93
            r8 = 59
            r9 = 44
            r10 = 6
            r11 = 3
            r12 = 7
            r13 = 0
            r14 = 5
            r15 = 4
            r5 = 2
            r6 = 0
            r4 = 1
            if (r3 != r4) goto L_0x0020
            int r2 = r2 - r4
            r1[r2] = r5
            goto L_0x00d1
        L_0x0020:
            if (r3 != r5) goto L_0x003a
            int r1 = r0.O(r4)
            if (r1 == r9) goto L_0x00d1
            if (r1 == r8) goto L_0x0035
            if (r1 != r7) goto L_0x002f
            r0.f3795i = r15
            return r15
        L_0x002f:
            java.lang.String r1 = "Unterminated array"
            r0.i0(r1)
            throw r13
        L_0x0035:
            r19.d()
            goto L_0x00d1
        L_0x003a:
            if (r3 == r11) goto L_0x02b8
            if (r3 != r14) goto L_0x0040
            goto L_0x02b8
        L_0x0040:
            if (r3 != r15) goto L_0x0074
            int r2 = r2 - r4
            r1[r2] = r14
            int r1 = r0.O(r4)
            r2 = 58
            if (r1 == r2) goto L_0x00d1
            r2 = 61
            if (r1 != r2) goto L_0x006e
            r19.d()
            int r1 = r0.f3791e
            int r2 = r0.f3792f
            if (r1 < r2) goto L_0x0060
            boolean r1 = r0.k(r4)
            if (r1 == 0) goto L_0x00d1
        L_0x0060:
            char[] r1 = r0.f3790d
            int r2 = r0.f3791e
            char r1 = r1[r2]
            r15 = 62
            if (r1 != r15) goto L_0x00d1
            int r2 = r2 + r4
            r0.f3791e = r2
            goto L_0x00d1
        L_0x006e:
            java.lang.String r1 = "Expected ':'"
            r0.i0(r1)
            throw r13
        L_0x0074:
            if (r3 != r10) goto L_0x00b6
            boolean r1 = r0.c
            if (r1 == 0) goto L_0x00ae
            r0.O(r4)
            int r1 = r0.f3791e
            int r1 = r1 - r4
            r0.f3791e = r1
            char[] r2 = q
            int r15 = r2.length
            int r1 = r1 + r15
            int r15 = r0.f3792f
            if (r1 <= r15) goto L_0x0092
            int r1 = r2.length
            boolean r1 = r0.k(r1)
            if (r1 != 0) goto L_0x0092
            goto L_0x00ae
        L_0x0092:
            r1 = 0
        L_0x0093:
            char[] r2 = q
            int r15 = r2.length
            if (r1 >= r15) goto L_0x00a8
            char[] r15 = r0.f3790d
            int r13 = r0.f3791e
            int r13 = r13 + r1
            char r13 = r15[r13]
            char r2 = r2[r1]
            if (r13 == r2) goto L_0x00a4
            goto L_0x00ae
        L_0x00a4:
            int r1 = r1 + 1
            r13 = 0
            goto L_0x0093
        L_0x00a8:
            int r1 = r0.f3791e
            int r2 = r2.length
            int r1 = r1 + r2
            r0.f3791e = r1
        L_0x00ae:
            int[] r1 = r0.f3799m
            int r2 = r0.n
            int r2 = r2 - r4
            r1[r2] = r12
            goto L_0x00d1
        L_0x00b6:
            if (r3 != r12) goto L_0x00cd
            int r1 = r0.O(r6)
            r2 = -1
            if (r1 != r2) goto L_0x00c4
            r1 = 17
        L_0x00c1:
            r0.f3795i = r1
            return r1
        L_0x00c4:
            r19.d()
            int r1 = r0.f3791e
            int r1 = r1 - r4
            r0.f3791e = r1
            goto L_0x00d1
        L_0x00cd:
            r1 = 8
            if (r3 == r1) goto L_0x02b0
        L_0x00d1:
            int r1 = r0.O(r4)
            r2 = 34
            if (r1 == r2) goto L_0x02ac
            r2 = 39
            if (r1 == r2) goto L_0x02a5
            if (r1 == r9) goto L_0x028e
            if (r1 == r8) goto L_0x028e
            r2 = 91
            if (r1 == r2) goto L_0x028b
            if (r1 == r7) goto L_0x0286
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x0283
            int r1 = r0.f3791e
            int r1 = r1 - r4
            r0.f3791e = r1
            char[] r2 = r0.f3790d
            char r1 = r2[r1]
            r2 = 116(0x74, float:1.63E-43)
            if (r1 == r2) goto L_0x011a
            r2 = 84
            if (r1 != r2) goto L_0x00fd
            goto L_0x011a
        L_0x00fd:
            r2 = 102(0x66, float:1.43E-43)
            if (r1 == r2) goto L_0x0114
            r2 = 70
            if (r1 != r2) goto L_0x0106
            goto L_0x0114
        L_0x0106:
            r2 = 110(0x6e, float:1.54E-43)
            if (r1 == r2) goto L_0x010e
            r2 = 78
            if (r1 != r2) goto L_0x0169
        L_0x010e:
            java.lang.String r1 = "null"
            java.lang.String r2 = "NULL"
            r3 = 7
            goto L_0x011f
        L_0x0114:
            java.lang.String r1 = "false"
            java.lang.String r2 = "FALSE"
            r3 = 6
            goto L_0x011f
        L_0x011a:
            java.lang.String r1 = "true"
            java.lang.String r2 = "TRUE"
            r3 = 5
        L_0x011f:
            int r7 = r1.length()
            r8 = 1
        L_0x0124:
            if (r8 >= r7) goto L_0x014d
            int r9 = r0.f3791e
            int r9 = r9 + r8
            int r13 = r0.f3792f
            if (r9 < r13) goto L_0x0136
            int r9 = r8 + 1
            boolean r9 = r0.k(r9)
            if (r9 != 0) goto L_0x0136
            goto L_0x0169
        L_0x0136:
            char[] r9 = r0.f3790d
            int r13 = r0.f3791e
            int r13 = r13 + r8
            char r9 = r9[r13]
            char r13 = r1.charAt(r8)
            if (r9 == r13) goto L_0x014a
            char r13 = r2.charAt(r8)
            if (r9 == r13) goto L_0x014a
            goto L_0x0169
        L_0x014a:
            int r8 = r8 + 1
            goto L_0x0124
        L_0x014d:
            int r1 = r0.f3791e
            int r1 = r1 + r7
            int r2 = r0.f3792f
            if (r1 < r2) goto L_0x015c
            int r1 = r7 + 1
            boolean r1 = r0.k(r1)
            if (r1 == 0) goto L_0x016b
        L_0x015c:
            char[] r1 = r0.f3790d
            int r2 = r0.f3791e
            int r2 = r2 + r7
            char r1 = r1[r2]
            boolean r1 = r0.q(r1)
            if (r1 == 0) goto L_0x016b
        L_0x0169:
            r3 = 0
            goto L_0x0172
        L_0x016b:
            int r1 = r0.f3791e
            int r1 = r1 + r7
            r0.f3791e = r1
            r0.f3795i = r3
        L_0x0172:
            if (r3 == 0) goto L_0x0175
            return r3
        L_0x0175:
            char[] r1 = r0.f3790d
            int r2 = r0.f3791e
            int r3 = r0.f3792f
            r7 = 0
            r10 = r7
            r9 = 0
            r13 = 0
            r15 = 1
            r16 = 0
        L_0x0183:
            int r6 = r2 + r9
            if (r6 != r3) goto L_0x019b
            int r2 = r1.length
            if (r9 != r2) goto L_0x018d
        L_0x018a:
            r6 = 0
            goto L_0x0266
        L_0x018d:
            int r2 = r9 + 1
            boolean r2 = r0.k(r2)
            if (r2 != 0) goto L_0x0197
            goto L_0x0207
        L_0x0197:
            int r2 = r0.f3791e
            int r3 = r0.f3792f
        L_0x019b:
            int r6 = r2 + r9
            char r6 = r1[r6]
            r12 = 43
            if (r6 == r12) goto L_0x0259
            r12 = 69
            if (r6 == r12) goto L_0x024f
            r12 = 101(0x65, float:1.42E-43)
            if (r6 == r12) goto L_0x024f
            r12 = 45
            if (r6 == r12) goto L_0x0243
            r12 = 46
            if (r6 == r12) goto L_0x023c
            r12 = 48
            if (r6 < r12) goto L_0x0201
            r12 = 57
            if (r6 <= r12) goto L_0x01bc
            goto L_0x0201
        L_0x01bc:
            if (r13 == r4) goto L_0x01f7
            if (r13 != 0) goto L_0x01c1
            goto L_0x01f7
        L_0x01c1:
            if (r13 != r5) goto L_0x01eb
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 != 0) goto L_0x01c8
            goto L_0x018a
        L_0x01c8:
            r17 = 10
            long r17 = r17 * r10
            int r6 = r6 + -48
            long r7 = (long) r6
            long r17 = r17 - r7
            r6 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r8 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x01e5
            int r8 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x01e3
            int r6 = (r17 > r10 ? 1 : (r17 == r10 ? 0 : -1))
            if (r6 >= 0) goto L_0x01e3
            goto L_0x01e5
        L_0x01e3:
            r6 = 0
            goto L_0x01e6
        L_0x01e5:
            r6 = 1
        L_0x01e6:
            r15 = r15 & r6
            r10 = r17
            r7 = 6
            goto L_0x01fd
        L_0x01eb:
            r6 = 3
            r7 = 6
            if (r13 != r6) goto L_0x01f1
            r13 = 4
            goto L_0x01fd
        L_0x01f1:
            if (r13 == r14) goto L_0x01f5
            if (r13 != r7) goto L_0x01fd
        L_0x01f5:
            r13 = 7
            goto L_0x01fd
        L_0x01f7:
            r7 = 6
            int r6 = r6 + -48
            int r6 = -r6
            long r10 = (long) r6
            r13 = 2
        L_0x01fd:
            r17 = 0
            goto L_0x025f
        L_0x0201:
            boolean r1 = r0.q(r6)
            if (r1 != 0) goto L_0x018a
        L_0x0207:
            if (r13 != r5) goto L_0x022b
            if (r15 == 0) goto L_0x022b
            r1 = -9223372036854775808
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x0213
            if (r16 == 0) goto L_0x022b
        L_0x0213:
            r17 = 0
            int r1 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r1 != 0) goto L_0x021b
            if (r16 != 0) goto L_0x022b
        L_0x021b:
            if (r16 == 0) goto L_0x021e
            goto L_0x021f
        L_0x021e:
            long r10 = -r10
        L_0x021f:
            r0.f3796j = r10
            int r1 = r0.f3791e
            int r1 = r1 + r9
            r0.f3791e = r1
            r1 = 15
            r6 = 15
            goto L_0x0239
        L_0x022b:
            if (r13 == r5) goto L_0x0233
            r1 = 4
            if (r13 == r1) goto L_0x0233
            r1 = 7
            if (r13 != r1) goto L_0x018a
        L_0x0233:
            r0.f3797k = r9
            r1 = 16
            r6 = 16
        L_0x0239:
            r0.f3795i = r6
            goto L_0x0266
        L_0x023c:
            r17 = r7
            r7 = 6
            if (r13 != r5) goto L_0x018a
            r13 = 3
            goto L_0x025f
        L_0x0243:
            r17 = r7
            r7 = 6
            if (r13 != 0) goto L_0x024c
            r13 = 1
            r16 = 1
            goto L_0x025f
        L_0x024c:
            if (r13 != r14) goto L_0x018a
            goto L_0x025e
        L_0x024f:
            r17 = r7
            r7 = 6
            if (r13 == r5) goto L_0x0257
            r6 = 4
            if (r13 != r6) goto L_0x018a
        L_0x0257:
            r13 = 5
            goto L_0x025f
        L_0x0259:
            r17 = r7
            r7 = 6
            if (r13 != r14) goto L_0x018a
        L_0x025e:
            r13 = 6
        L_0x025f:
            int r9 = r9 + 1
            r7 = r17
            r12 = 7
            goto L_0x0183
        L_0x0266:
            if (r6 == 0) goto L_0x0269
            return r6
        L_0x0269:
            char[] r1 = r0.f3790d
            int r2 = r0.f3791e
            char r1 = r1[r2]
            boolean r1 = r0.q(r1)
            if (r1 == 0) goto L_0x027c
            r19.d()
            r1 = 10
            goto L_0x00c1
        L_0x027c:
            java.lang.String r1 = "Expected value"
            r0.i0(r1)
            r1 = 0
            throw r1
        L_0x0283:
            r0.f3795i = r4
            return r4
        L_0x0286:
            if (r3 != r4) goto L_0x028e
            r1 = 4
            goto L_0x00c1
        L_0x028b:
            r1 = 3
            goto L_0x00c1
        L_0x028e:
            if (r3 == r4) goto L_0x029a
            if (r3 != r5) goto L_0x0293
            goto L_0x029a
        L_0x0293:
            java.lang.String r1 = "Unexpected value"
            r0.i0(r1)
            r1 = 0
            throw r1
        L_0x029a:
            r19.d()
            int r1 = r0.f3791e
            int r1 = r1 - r4
            r0.f3791e = r1
            r1 = 7
            goto L_0x00c1
        L_0x02a5:
            r19.d()
            r1 = 8
            goto L_0x00c1
        L_0x02ac:
            r1 = 9
            goto L_0x00c1
        L_0x02b0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L_0x02b8:
            int r2 = r2 - r4
            r6 = 4
            r1[r2] = r6
            r1 = 125(0x7d, float:1.75E-43)
            if (r3 != r14) goto L_0x02d7
            int r2 = r0.O(r4)
            if (r2 == r9) goto L_0x02d7
            if (r2 == r8) goto L_0x02d4
            if (r2 != r1) goto L_0x02cd
            r0.f3795i = r5
            return r5
        L_0x02cd:
            java.lang.String r1 = "Unterminated object"
            r0.i0(r1)
            r1 = 0
            throw r1
        L_0x02d4:
            r19.d()
        L_0x02d7:
            int r2 = r0.O(r4)
            r6 = 34
            if (r2 == r6) goto L_0x0310
            r6 = 39
            if (r2 == r6) goto L_0x0309
            java.lang.String r6 = "Expected name"
            if (r2 == r1) goto L_0x02ff
            r19.d()
            int r1 = r0.f3791e
            int r1 = r1 - r4
            r0.f3791e = r1
            char r1 = (char) r2
            boolean r1 = r0.q(r1)
            if (r1 == 0) goto L_0x02fa
            r1 = 14
            goto L_0x00c1
        L_0x02fa:
            r0.i0(r6)
            r1 = 0
            throw r1
        L_0x02ff:
            r1 = 0
            if (r3 == r14) goto L_0x0305
            r0.f3795i = r5
            return r5
        L_0x0305:
            r0.i0(r6)
            throw r1
        L_0x0309:
            r19.d()
            r1 = 12
            goto L_0x00c1
        L_0x0310:
            r1 = 13
            goto L_0x00c1
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.c.v.a.f():int");
    }

    public final void f0(char c2) throws IOException {
        char[] cArr = this.f3790d;
        while (true) {
            int i2 = this.f3791e;
            int i3 = this.f3792f;
            while (true) {
                if (i2 < i3) {
                    int i4 = i2 + 1;
                    char c3 = cArr[i2];
                    if (c3 == c2) {
                        this.f3791e = i4;
                        return;
                    } else if (c3 == '\\') {
                        this.f3791e = i4;
                        e0();
                        break;
                    } else {
                        if (c3 == 10) {
                            this.f3793g++;
                            this.f3794h = i4;
                        }
                        i2 = i4;
                    }
                } else {
                    this.f3791e = i2;
                    if (!k(1)) {
                        i0("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    public void g() throws IOException {
        int i2 = this.f3795i;
        if (i2 == 0) {
            i2 = f();
        }
        if (i2 == 4) {
            int i3 = this.n - 1;
            this.n = i3;
            int[] iArr = this.p;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f3795i = 0;
            return;
        }
        StringBuilder i5 = g.a.a.a.a.i("Expected END_ARRAY but was ");
        i5.append(X());
        i5.append(s());
        throw new IllegalStateException(i5.toString());
    }

    public final void g0() throws IOException {
        char c2;
        do {
            if (this.f3791e < this.f3792f || k(1)) {
                char[] cArr = this.f3790d;
                int i2 = this.f3791e;
                int i3 = i2 + 1;
                this.f3791e = i3;
                c2 = cArr[i2];
                if (c2 == 10) {
                    this.f3793g++;
                    this.f3794h = i3;
                    return;
                }
            } else {
                return;
            }
        } while (c2 != 13);
    }

    public void h0() throws IOException {
        int i2;
        char c2;
        int i3 = 0;
        do {
            int i4 = this.f3795i;
            if (i4 == 0) {
                i4 = f();
            }
            if (i4 == 3) {
                Y(1);
            } else if (i4 == 1) {
                Y(3);
            } else if (i4 == 4 || i4 == 2) {
                this.n--;
                i3--;
                this.f3795i = 0;
            } else if (i4 == 14 || i4 == 10) {
                while (true) {
                    i2 = 0;
                    while (true) {
                        int i5 = this.f3791e + i2;
                        if (i5 < this.f3792f) {
                            char c3 = this.f3790d[i5];
                            if (!(c3 == 9 || c3 == 10 || c3 == 12 || c3 == 13 || c3 == ' ')) {
                                if (c3 != '#') {
                                    if (c3 != ',') {
                                        if (!(c3 == '/' || c3 == '=')) {
                                            if (!(c3 == '{' || c3 == '}' || c3 == ':')) {
                                                if (c3 != ';') {
                                                    switch (c3) {
                                                        case '[':
                                                        case ']':
                                                            break;
                                                        case '\\':
                                                            break;
                                                        default:
                                                            i2++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            this.f3791e = i5;
                            if (!k(1)) {
                            }
                        }
                    }
                }
                d();
                this.f3791e += i2;
                this.f3795i = 0;
            } else {
                if (i4 == 8 || i4 == 12) {
                    c2 = '\'';
                } else if (i4 == 9 || i4 == 13) {
                    c2 = '\"';
                } else {
                    if (i4 == 16) {
                        this.f3791e += this.f3797k;
                    }
                    this.f3795i = 0;
                }
                f0(c2);
                this.f3795i = 0;
            }
            i3++;
            this.f3795i = 0;
        } while (i3 != 0);
        int[] iArr = this.p;
        int i6 = this.n;
        int i7 = i6 - 1;
        iArr[i7] = iArr[i7] + 1;
        this.o[i6 - 1] = "null";
    }

    public final IOException i0(String str) throws IOException {
        StringBuilder i2 = g.a.a.a.a.i(str);
        i2.append(s());
        throw new MalformedJsonException(i2.toString());
    }

    public void j() throws IOException {
        int i2 = this.f3795i;
        if (i2 == 0) {
            i2 = f();
        }
        if (i2 == 2) {
            int i3 = this.n - 1;
            this.n = i3;
            this.o[i3] = null;
            int[] iArr = this.p;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f3795i = 0;
            return;
        }
        StringBuilder i5 = g.a.a.a.a.i("Expected END_OBJECT but was ");
        i5.append(X());
        i5.append(s());
        throw new IllegalStateException(i5.toString());
    }

    public final boolean k(int i2) throws IOException {
        int i3;
        int i4;
        char[] cArr = this.f3790d;
        int i5 = this.f3794h;
        int i6 = this.f3791e;
        this.f3794h = i5 - i6;
        int i7 = this.f3792f;
        if (i7 != i6) {
            int i8 = i7 - i6;
            this.f3792f = i8;
            System.arraycopy(cArr, i6, cArr, 0, i8);
        } else {
            this.f3792f = 0;
        }
        this.f3791e = 0;
        do {
            Reader reader = this.b;
            int i9 = this.f3792f;
            int read = reader.read(cArr, i9, cArr.length - i9);
            if (read == -1) {
                return false;
            }
            i3 = this.f3792f + read;
            this.f3792f = i3;
            if (this.f3793g == 0 && (i4 = this.f3794h) == 0 && i3 > 0 && cArr[0] == 65279) {
                this.f3791e++;
                this.f3794h = i4 + 1;
                i2++;
                continue;
            }
        } while (i3 < i2);
        return true;
    }

    public String n() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i2 = this.n;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.f3799m[i3];
            if (i4 == 1 || i4 == 2) {
                sb.append('[');
                sb.append(this.p[i3]);
                sb.append(']');
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                sb.append('.');
                String[] strArr = this.o;
                if (strArr[i3] != null) {
                    sb.append(strArr[i3]);
                }
            }
        }
        return sb.toString();
    }

    public boolean o() throws IOException {
        int i2 = this.f3795i;
        if (i2 == 0) {
            i2 = f();
        }
        return (i2 == 2 || i2 == 4) ? false : true;
    }

    public final boolean q(char c2) throws IOException {
        if (c2 == 9 || c2 == 10 || c2 == 12 || c2 == 13 || c2 == ' ') {
            return false;
        }
        if (c2 != '#') {
            if (c2 == ',') {
                return false;
            }
            if (!(c2 == '/' || c2 == '=')) {
                if (c2 == '{' || c2 == '}' || c2 == ':') {
                    return false;
                }
                if (c2 != ';') {
                    switch (c2) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        d();
        return false;
    }

    public String s() {
        StringBuilder k2 = g.a.a.a.a.k(" at line ", this.f3793g + 1, " column ", (this.f3791e - this.f3794h) + 1, " path ");
        k2.append(n());
        return k2.toString();
    }

    public boolean t() throws IOException {
        int i2 = this.f3795i;
        if (i2 == 0) {
            i2 = f();
        }
        if (i2 == 5) {
            this.f3795i = 0;
            int[] iArr = this.p;
            int i3 = this.n - 1;
            iArr[i3] = iArr[i3] + 1;
            return true;
        } else if (i2 == 6) {
            this.f3795i = 0;
            int[] iArr2 = this.p;
            int i4 = this.n - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return false;
        } else {
            StringBuilder i5 = g.a.a.a.a.i("Expected a boolean but was ");
            i5.append(X());
            i5.append(s());
            throw new IllegalStateException(i5.toString());
        }
    }

    public String toString() {
        return getClass().getSimpleName() + s();
    }

    public double u() throws IOException {
        String str;
        int i2 = this.f3795i;
        if (i2 == 0) {
            i2 = f();
        }
        if (i2 == 15) {
            this.f3795i = 0;
            int[] iArr = this.p;
            int i3 = this.n - 1;
            iArr[i3] = iArr[i3] + 1;
            return (double) this.f3796j;
        }
        if (i2 == 16) {
            this.f3798l = new String(this.f3790d, this.f3791e, this.f3797k);
            this.f3791e += this.f3797k;
        } else {
            if (i2 == 8 || i2 == 9) {
                str = Q(i2 == 8 ? '\'' : '\"');
            } else if (i2 == 10) {
                str = V();
            } else if (i2 != 11) {
                StringBuilder i4 = g.a.a.a.a.i("Expected a double but was ");
                i4.append(X());
                i4.append(s());
                throw new IllegalStateException(i4.toString());
            }
            this.f3798l = str;
        }
        this.f3795i = 11;
        double parseDouble = Double.parseDouble(this.f3798l);
        if (this.c || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f3798l = null;
            this.f3795i = 0;
            int[] iArr2 = this.p;
            int i5 = this.n - 1;
            iArr2[i5] = iArr2[i5] + 1;
            return parseDouble;
        }
        throw new MalformedJsonException("JSON forbids NaN and infinities: " + parseDouble + s());
    }

    public int v() throws IOException {
        String str;
        int i2 = this.f3795i;
        if (i2 == 0) {
            i2 = f();
        }
        if (i2 == 15) {
            long j2 = this.f3796j;
            int i3 = (int) j2;
            if (j2 == ((long) i3)) {
                this.f3795i = 0;
                int[] iArr = this.p;
                int i4 = this.n - 1;
                iArr[i4] = iArr[i4] + 1;
                return i3;
            }
            StringBuilder i5 = g.a.a.a.a.i("Expected an int but was ");
            i5.append(this.f3796j);
            i5.append(s());
            throw new NumberFormatException(i5.toString());
        }
        if (i2 == 16) {
            this.f3798l = new String(this.f3790d, this.f3791e, this.f3797k);
            this.f3791e += this.f3797k;
        } else if (i2 == 8 || i2 == 9 || i2 == 10) {
            if (i2 == 10) {
                str = V();
            } else {
                str = Q(i2 == 8 ? '\'' : '\"');
            }
            this.f3798l = str;
            try {
                int parseInt = Integer.parseInt(this.f3798l);
                this.f3795i = 0;
                int[] iArr2 = this.p;
                int i6 = this.n - 1;
                iArr2[i6] = iArr2[i6] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder i7 = g.a.a.a.a.i("Expected an int but was ");
            i7.append(X());
            i7.append(s());
            throw new IllegalStateException(i7.toString());
        }
        this.f3795i = 11;
        double parseDouble = Double.parseDouble(this.f3798l);
        int i8 = (int) parseDouble;
        if (((double) i8) == parseDouble) {
            this.f3798l = null;
            this.f3795i = 0;
            int[] iArr3 = this.p;
            int i9 = this.n - 1;
            iArr3[i9] = iArr3[i9] + 1;
            return i8;
        }
        StringBuilder i10 = g.a.a.a.a.i("Expected an int but was ");
        i10.append(this.f3798l);
        i10.append(s());
        throw new NumberFormatException(i10.toString());
    }

    public long x() throws IOException {
        String str;
        int i2 = this.f3795i;
        if (i2 == 0) {
            i2 = f();
        }
        if (i2 == 15) {
            this.f3795i = 0;
            int[] iArr = this.p;
            int i3 = this.n - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.f3796j;
        }
        if (i2 == 16) {
            this.f3798l = new String(this.f3790d, this.f3791e, this.f3797k);
            this.f3791e += this.f3797k;
        } else if (i2 == 8 || i2 == 9 || i2 == 10) {
            if (i2 == 10) {
                str = V();
            } else {
                str = Q(i2 == 8 ? '\'' : '\"');
            }
            this.f3798l = str;
            try {
                long parseLong = Long.parseLong(this.f3798l);
                this.f3795i = 0;
                int[] iArr2 = this.p;
                int i4 = this.n - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder i5 = g.a.a.a.a.i("Expected a long but was ");
            i5.append(X());
            i5.append(s());
            throw new IllegalStateException(i5.toString());
        }
        this.f3795i = 11;
        double parseDouble = Double.parseDouble(this.f3798l);
        long j2 = (long) parseDouble;
        if (((double) j2) == parseDouble) {
            this.f3798l = null;
            this.f3795i = 0;
            int[] iArr3 = this.p;
            int i6 = this.n - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return j2;
        }
        StringBuilder i7 = g.a.a.a.a.i("Expected a long but was ");
        i7.append(this.f3798l);
        i7.append(s());
        throw new NumberFormatException(i7.toString());
    }
}
