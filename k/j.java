package k;

import g.a.a.a.a;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import k.h0.c;
import k.h0.g.d;

public final class j {

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f4897j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f4898k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l  reason: collision with root package name */
    public static final Pattern f4899l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f4900m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public final String a;
    public final String b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4901d;

    /* renamed from: e  reason: collision with root package name */
    public final String f4902e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f4903f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f4904g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f4905h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f4906i;

    public j(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = j2;
        this.f4901d = str3;
        this.f4902e = str4;
        this.f4903f = z;
        this.f4904g = z2;
        this.f4906i = z3;
        this.f4905h = z4;
    }

    public static int a(String str, int i2, int i3, boolean z) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (((charAt < ' ' && charAt != 9) || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static long b(String str, int i2, int i3) {
        int a2 = a(str, i2, i3, false);
        Matcher matcher = f4900m.matcher(str);
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        while (a2 < i3) {
            int a3 = a(str, a2 + 1, i3, true);
            matcher.region(a2, a3);
            if (i5 == -1 && matcher.usePattern(f4900m).matches()) {
                i5 = Integer.parseInt(matcher.group(1));
                i8 = Integer.parseInt(matcher.group(2));
                i9 = Integer.parseInt(matcher.group(3));
            } else if (i6 != -1 || !matcher.usePattern(f4899l).matches()) {
                if (i7 == -1) {
                    Pattern pattern = f4898k;
                    if (matcher.usePattern(pattern).matches()) {
                        i7 = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                    }
                }
                if (i4 == -1 && matcher.usePattern(f4897j).matches()) {
                    i4 = Integer.parseInt(matcher.group(1));
                }
            } else {
                i6 = Integer.parseInt(matcher.group(1));
            }
            a2 = a(str, a3 + 1, i3, false);
        }
        if (i4 >= 70 && i4 <= 99) {
            i4 += 1900;
        }
        if (i4 >= 0 && i4 <= 69) {
            i4 += 2000;
        }
        if (i4 < 1601) {
            throw new IllegalArgumentException();
        } else if (i7 == -1) {
            throw new IllegalArgumentException();
        } else if (i6 < 1 || i6 > 31) {
            throw new IllegalArgumentException();
        } else if (i5 < 0 || i5 > 23) {
            throw new IllegalArgumentException();
        } else if (i8 < 0 || i8 > 59) {
            throw new IllegalArgumentException();
        } else if (i9 < 0 || i9 > 59) {
            throw new IllegalArgumentException();
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(c.n);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i4);
            gregorianCalendar.set(2, i7 - 1);
            gregorianCalendar.set(5, i6);
            gregorianCalendar.set(11, i5);
            gregorianCalendar.set(12, i8);
            gregorianCalendar.set(13, i9);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return jVar.a.equals(this.a) && jVar.b.equals(this.b) && jVar.f4901d.equals(this.f4901d) && jVar.f4902e.equals(this.f4902e) && jVar.c == this.c && jVar.f4903f == this.f4903f && jVar.f4904g == this.f4904g && jVar.f4905h == this.f4905h && jVar.f4906i == this.f4906i;
    }

    public int hashCode() {
        int a2 = a.a(this.f4902e, a.a(this.f4901d, a.a(this.b, a.a(this.a, 527, 31), 31), 31), 31);
        long j2 = this.c;
        return ((((((((a2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f4903f ^ true ? 1 : 0)) * 31) + (this.f4904g ^ true ? 1 : 0)) * 31) + (this.f4905h ^ true ? 1 : 0)) * 31) + (this.f4906i ^ true ? 1 : 0);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('=');
        sb.append(this.b);
        if (this.f4905h) {
            if (this.c == Long.MIN_VALUE) {
                str = "; max-age=0";
            } else {
                sb.append("; expires=");
                str = d.a.get().format(new Date(this.c));
            }
            sb.append(str);
        }
        if (!this.f4906i) {
            sb.append("; domain=");
            sb.append(this.f4901d);
        }
        sb.append("; path=");
        sb.append(this.f4902e);
        if (this.f4903f) {
            sb.append("; secure");
        }
        if (this.f4904g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
