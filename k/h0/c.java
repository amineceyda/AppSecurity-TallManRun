package k.h0;

import android.support.v4.media.session.PlaybackStateCompat;
import com.tencent.raft.codegenmeta.utils.Constants;
import com.tencent.raft.measure.utils.MeasureConst;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import k.b0;
import k.d0;
import k.e0;
import k.h0.i.b;
import k.q;
import k.r;
import k.t;
import l.e;
import l.g;
import l.h;
import l.y;
import l.z;

public final class c {
    public static final byte[] a;
    public static final String[] b = new String[0];
    public static final e0 c;

    /* renamed from: d  reason: collision with root package name */
    public static final h f4726d = h.b("efbbbf");

    /* renamed from: e  reason: collision with root package name */
    public static final h f4727e = h.b("feff");

    /* renamed from: f  reason: collision with root package name */
    public static final h f4728f = h.b("fffe");

    /* renamed from: g  reason: collision with root package name */
    public static final h f4729g = h.b("0000ffff");

    /* renamed from: h  reason: collision with root package name */
    public static final h f4730h = h.b("ffff0000");

    /* renamed from: i  reason: collision with root package name */
    public static final Charset f4731i = Charset.forName(MeasureConst.CHARSET_UTF8);

    /* renamed from: j  reason: collision with root package name */
    public static final Charset f4732j = Charset.forName("UTF-16BE");

    /* renamed from: k  reason: collision with root package name */
    public static final Charset f4733k = Charset.forName("UTF-16LE");

    /* renamed from: l  reason: collision with root package name */
    public static final Charset f4734l = Charset.forName("UTF-32BE");

    /* renamed from: m  reason: collision with root package name */
    public static final Charset f4735m = Charset.forName("UTF-32LE");
    public static final TimeZone n = TimeZone.getTimeZone("GMT");
    public static final Comparator<String> o = new a();
    public static final Method p;
    public static final Pattern q = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public class a implements Comparator<String> {
        public int compare(Object obj, Object obj2) {
            return ((String) obj).compareTo((String) obj2);
        }
    }

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        e eVar = new e();
        eVar.u(bArr);
        Method method = null;
        c = new d0((t) null, (long) 0, eVar);
        b0.d((t) null, bArr);
        Charset.forName("ISO-8859-1");
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class});
        } catch (Exception unused) {
        }
        p = method;
    }

    public static AssertionError a(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    public static Charset b(g gVar, Charset charset) throws IOException {
        h hVar = f4726d;
        if (gVar.a0(0, hVar)) {
            gVar.c((long) hVar.p());
            return f4731i;
        }
        h hVar2 = f4727e;
        if (gVar.a0(0, hVar2)) {
            gVar.c((long) hVar2.p());
            return f4732j;
        }
        h hVar3 = f4728f;
        if (gVar.a0(0, hVar3)) {
            gVar.c((long) hVar3.p());
            return f4733k;
        }
        h hVar4 = f4729g;
        if (gVar.a0(0, hVar4)) {
            gVar.c((long) hVar4.p());
            return f4734l;
        }
        h hVar5 = f4730h;
        if (!gVar.a0(0, hVar5)) {
            return charset;
        }
        gVar.c((long) hVar5.p());
        return f4735m;
    }

    public static String c(String str) {
        int i2 = -1;
        boolean z = true;
        int i3 = 0;
        if (str.contains(Constants.KEY_INDEX_FILE_SEPARATOR)) {
            InetAddress i4 = (!str.startsWith("[") || !str.endsWith("]")) ? i(str, 0, str.length()) : i(str, 1, str.length() - 1);
            if (i4 == null) {
                return null;
            }
            byte[] address = i4.getAddress();
            if (address.length == 16) {
                int i5 = 0;
                int i6 = 0;
                while (i5 < address.length) {
                    int i7 = i5;
                    while (i7 < 16 && address[i7] == 0 && address[i7 + 1] == 0) {
                        i7 += 2;
                    }
                    int i8 = i7 - i5;
                    if (i8 > i6 && i8 >= 4) {
                        i2 = i5;
                        i6 = i8;
                    }
                    i5 = i7 + 2;
                }
                e eVar = new e();
                while (i3 < address.length) {
                    if (i3 == i2) {
                        eVar.O(58);
                        i3 += i6;
                        if (i3 == 16) {
                            eVar.O(58);
                        }
                    } else {
                        if (i3 > 0) {
                            eVar.O(58);
                        }
                        eVar.r((long) (((address[i3] & 255) << 8) | (address[i3 + 1] & 255)));
                        i3 += 2;
                    }
                }
                return eVar.o();
            }
            throw new AssertionError(g.a.a.a.a.c("Invalid IPv6 address: '", str, "'"));
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (lowerCase.isEmpty()) {
                return null;
            }
            int i9 = 0;
            while (true) {
                if (i9 >= lowerCase.length()) {
                    z = false;
                    break;
                }
                char charAt = lowerCase.charAt(i9);
                if (charAt <= 31) {
                    break;
                } else if (charAt >= 127) {
                    break;
                } else if (" #%/:?@[\\]".indexOf(charAt) != -1) {
                    break;
                } else {
                    i9++;
                }
            }
            if (z) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static int d(String str, long j2, TimeUnit timeUnit) {
        if (j2 >= 0) {
            Objects.requireNonNull(timeUnit, "unit == null");
            long millis = timeUnit.toMillis(j2);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException(g.a.a.a.a.w(str, " too large."));
            } else if (millis != 0 || j2 <= 0) {
                return (int) millis;
            } else {
                throw new IllegalArgumentException(g.a.a.a.a.w(str, " too small."));
            }
        } else {
            throw new IllegalArgumentException(g.a.a.a.a.w(str, " < 0"));
        }
    }

    public static void e(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void f(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void g(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e2) {
                if (!t(e2)) {
                    throw e2;
                }
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused) {
            }
        }
    }

    public static int h(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        char c3 = 'a';
        if (c2 < 'a' || c2 > 'f') {
            c3 = 'A';
            if (c2 < 'A' || c2 > 'F') {
                return -1;
            }
        }
        return (c2 - c3) + 10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00d7, code lost:
        if (r7 == 16) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00da, code lost:
        if (r8 != -1) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00dc, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00dd, code lost:
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00ef, code lost:
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00f6, code lost:
        throw new java.lang.AssertionError();
     */
    @javax.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.net.InetAddress i(java.lang.String r16, int r17, int r18) {
        /*
            r0 = r16
            r1 = r18
            r2 = 16
            byte[] r3 = new byte[r2]
            r4 = -1
            r5 = 0
            r6 = r17
            r7 = 0
            r8 = -1
            r9 = -1
        L_0x000f:
            r10 = 0
            if (r6 >= r1) goto L_0x00d5
            if (r7 != r2) goto L_0x0015
            return r10
        L_0x0015:
            int r11 = r6 + 2
            r12 = 4
            r13 = 255(0xff, float:3.57E-43)
            if (r11 > r1) goto L_0x0032
            java.lang.String r14 = "::"
            r15 = 2
            boolean r14 = r0.regionMatches(r6, r14, r5, r15)
            if (r14 == 0) goto L_0x0032
            if (r8 == r4) goto L_0x0028
            return r10
        L_0x0028:
            int r7 = r7 + 2
            r8 = r7
            if (r11 != r1) goto L_0x002f
            goto L_0x00d5
        L_0x002f:
            r9 = r11
            goto L_0x00a2
        L_0x0032:
            if (r7 == 0) goto L_0x00a1
            java.lang.String r11 = ":"
            r14 = 1
            boolean r11 = r0.regionMatches(r6, r11, r5, r14)
            if (r11 == 0) goto L_0x0041
            int r6 = r6 + 1
            goto L_0x00a1
        L_0x0041:
            java.lang.String r11 = "."
            boolean r6 = r0.regionMatches(r6, r11, r5, r14)
            if (r6 == 0) goto L_0x00a0
            int r6 = r7 + -2
            r11 = r6
        L_0x004c:
            if (r9 >= r1) goto L_0x0094
            if (r11 != r2) goto L_0x0051
            goto L_0x0097
        L_0x0051:
            if (r11 == r6) goto L_0x005e
            char r15 = r0.charAt(r9)
            r14 = 46
            if (r15 == r14) goto L_0x005c
            goto L_0x0097
        L_0x005c:
            int r9 = r9 + 1
        L_0x005e:
            r14 = r9
            r15 = 0
        L_0x0060:
            if (r14 >= r1) goto L_0x0082
            char r5 = r0.charAt(r14)
            r2 = 48
            if (r5 < r2) goto L_0x0082
            r4 = 57
            if (r5 <= r4) goto L_0x006f
            goto L_0x0082
        L_0x006f:
            if (r15 != 0) goto L_0x0074
            if (r9 == r14) goto L_0x0074
            goto L_0x0097
        L_0x0074:
            int r15 = r15 * 10
            int r15 = r15 + r5
            int r15 = r15 - r2
            if (r15 <= r13) goto L_0x007b
            goto L_0x0097
        L_0x007b:
            int r14 = r14 + 1
            r2 = 16
            r4 = -1
            r5 = 0
            goto L_0x0060
        L_0x0082:
            int r2 = r14 - r9
            if (r2 != 0) goto L_0x0087
            goto L_0x0097
        L_0x0087:
            int r2 = r11 + 1
            byte r4 = (byte) r15
            r3[r11] = r4
            r11 = r2
            r9 = r14
            r2 = 16
            r4 = -1
            r5 = 0
            r14 = 1
            goto L_0x004c
        L_0x0094:
            int r6 = r6 + r12
            if (r11 == r6) goto L_0x0099
        L_0x0097:
            r14 = 0
            goto L_0x009a
        L_0x0099:
            r14 = 1
        L_0x009a:
            if (r14 != 0) goto L_0x009d
            return r10
        L_0x009d:
            int r7 = r7 + 2
            goto L_0x00d5
        L_0x00a0:
            return r10
        L_0x00a1:
            r9 = r6
        L_0x00a2:
            r6 = r9
            r2 = 0
        L_0x00a4:
            if (r6 >= r1) goto L_0x00b8
            char r4 = r0.charAt(r6)
            int r4 = h(r4)
            r5 = -1
            if (r4 != r5) goto L_0x00b2
            goto L_0x00b8
        L_0x00b2:
            int r2 = r2 << 4
            int r2 = r2 + r4
            int r6 = r6 + 1
            goto L_0x00a4
        L_0x00b8:
            int r4 = r6 - r9
            if (r4 == 0) goto L_0x00d4
            if (r4 <= r12) goto L_0x00bf
            goto L_0x00d4
        L_0x00bf:
            int r4 = r7 + 1
            int r5 = r2 >>> 8
            r5 = r5 & r13
            byte r5 = (byte) r5
            r3[r7] = r5
            int r7 = r4 + 1
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r3[r4] = r2
            r2 = 16
            r4 = -1
            r5 = 0
            goto L_0x000f
        L_0x00d4:
            return r10
        L_0x00d5:
            r0 = 16
            if (r7 == r0) goto L_0x00eb
            r1 = -1
            if (r8 != r1) goto L_0x00dd
            return r10
        L_0x00dd:
            int r1 = r7 - r8
            int r2 = 16 - r1
            java.lang.System.arraycopy(r3, r8, r3, r2, r1)
            int r2 = 16 - r7
            int r2 = r2 + r8
            r0 = 0
            java.util.Arrays.fill(r3, r8, r2, r0)
        L_0x00eb:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r3)     // Catch:{ UnknownHostException -> 0x00f0 }
            return r0
        L_0x00f0:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            goto L_0x00f7
        L_0x00f6:
            throw r0
        L_0x00f7:
            goto L_0x00f6
        */
        throw new UnsupportedOperationException("Method not decompiled: k.h0.c.i(java.lang.String, int, int):java.net.InetAddress");
    }

    public static int j(String str, int i2, int i3, char c2) {
        while (i2 < i3) {
            if (str.charAt(i2) == c2) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int k(String str, int i2, int i3, String str2) {
        while (i2 < i3) {
            if (str2.indexOf(str.charAt(i2)) != -1) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static boolean l(y yVar, int i2, TimeUnit timeUnit) {
        try {
            return v(yVar, i2, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean m(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static String n(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String o(r rVar, boolean z) {
        String str;
        if (rVar.f4910d.contains(Constants.KEY_INDEX_FILE_SEPARATOR)) {
            str = g.a.a.a.a.f(g.a.a.a.a.i("["), rVar.f4910d, "]");
        } else {
            str = rVar.f4910d;
        }
        if (!z && rVar.f4911e == r.c(rVar.a)) {
            return str;
        }
        StringBuilder l2 = g.a.a.a.a.l(str, Constants.KEY_INDEX_FILE_SEPARATOR);
        l2.append(rVar.f4911e);
        return l2.toString();
    }

    public static <T> List<T> p(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <T> List<T> q(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static int r(String str) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt <= 31 || charAt >= 127) {
                return i2;
            }
        }
        return -1;
    }

    public static String[] s(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i2]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i2++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean t(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static boolean u(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (!(strArr == null || strArr2 == null || strArr.length == 0 || strArr2.length == 0)) {
            for (String str : strArr) {
                for (String compare : strArr2) {
                    if (comparator.compare(str, compare) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean v(y yVar, int i2, TimeUnit timeUnit) throws IOException {
        long nanoTime = System.nanoTime();
        long c2 = yVar.i().e() ? yVar.i().c() - nanoTime : Long.MAX_VALUE;
        yVar.i().d(Math.min(c2, timeUnit.toNanos((long) i2)) + nanoTime);
        try {
            e eVar = new e();
            while (yVar.M(eVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                eVar.a();
            }
            int i3 = (c2 > Long.MAX_VALUE ? 1 : (c2 == Long.MAX_VALUE ? 0 : -1));
            z i4 = yVar.i();
            if (i3 == 0) {
                i4.a();
            } else {
                i4.d(nanoTime + c2);
            }
            return true;
        } catch (InterruptedIOException unused) {
            int i5 = (c2 > Long.MAX_VALUE ? 1 : (c2 == Long.MAX_VALUE ? 0 : -1));
            z i6 = yVar.i();
            if (i5 == 0) {
                i6.a();
            } else {
                i6.d(nanoTime + c2);
            }
            return false;
        } catch (Throwable th) {
            int i7 = (c2 > Long.MAX_VALUE ? 1 : (c2 == Long.MAX_VALUE ? 0 : -1));
            z i8 = yVar.i();
            if (i7 == 0) {
                i8.a();
            } else {
                i8.d(nanoTime + c2);
            }
            throw th;
        }
    }

    public static int w(String str, int i2, int i3) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int x(String str, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            char charAt = str.charAt(i4);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i4 + 1;
            }
        }
        return i2;
    }

    public static q y(List<b> list) {
        q.a aVar = new q.a();
        for (b next : list) {
            a.a.a(aVar, next.a.t(), next.b.t());
        }
        return new q(aVar);
    }

    public static String z(String str, int i2, int i3) {
        int w = w(str, i2, i3);
        return str.substring(w, x(str, w, i3));
    }
}
