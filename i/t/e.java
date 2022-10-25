package i.t;

import g.c.b.b.f;
import i.o.c.h;
import i.q.a;
import i.q.b;
import i.q.c;
import java.util.Collection;

public class e extends d {
    public static boolean a(CharSequence charSequence, CharSequence charSequence2, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        h.e(charSequence, "$this$contains");
        h.e(charSequence2, "other");
        return i(charSequence, (String) charSequence2, 0, z, 2) >= 0;
    }

    public static boolean b(String str, String str2, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        h.e(str, "$this$endsWith");
        h.e(str2, "suffix");
        if (!z) {
            return str.endsWith(str2);
        }
        return k(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static final boolean c(String str, String str2, boolean z) {
        if (str == null) {
            return false;
        }
        return !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static final int d(CharSequence charSequence) {
        h.e(charSequence, "$this$lastIndex");
        return charSequence.length() - 1;
    }

    public static final int e(CharSequence charSequence, String str, int i2, boolean z) {
        h.e(charSequence, "$this$indexOf");
        h.e(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i2);
        }
        return g(charSequence, str, i2, charSequence.length(), z, false, 16);
    }

    public static final int f(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z, boolean z2) {
        a aVar;
        boolean z3;
        if (!z2) {
            if (i2 < 0) {
                i2 = 0;
            }
            int length = charSequence.length();
            if (i3 > length) {
                i3 = length;
            }
            aVar = new c(i2, i3);
        } else {
            int d2 = d(charSequence);
            if (i2 > d2) {
                i2 = d2;
            }
            if (i3 < 0) {
                i3 = 0;
            }
            aVar = new a(i2, i3, -1);
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int i4 = aVar.b;
            int i5 = aVar.c;
            int i6 = aVar.f4578d;
            if (i6 < 0 ? i4 >= i5 : i4 <= i5) {
                while (true) {
                    int length2 = charSequence2.length();
                    h.e(charSequence2, "$this$regionMatchesImpl");
                    h.e(charSequence, "other");
                    if (i4 >= 0 && charSequence2.length() - length2 >= 0 && i4 <= charSequence.length() - length2) {
                        int i7 = 0;
                        while (true) {
                            if (i7 >= length2) {
                                z3 = true;
                                break;
                            } else if (!f.z(charSequence2.charAt(0 + i7), charSequence.charAt(i4 + i7), z)) {
                                break;
                            } else {
                                i7++;
                            }
                        }
                    }
                    z3 = false;
                    if (!z3) {
                        if (i4 == i5) {
                            break;
                        }
                        i4 += i6;
                    } else {
                        return i4;
                    }
                }
            }
        } else {
            int i8 = aVar.b;
            int i9 = aVar.c;
            int i10 = aVar.f4578d;
            if (i10 < 0 ? i8 >= i9 : i8 <= i9) {
                while (true) {
                    if (!k((String) charSequence2, 0, (String) charSequence, i8, charSequence2.length(), z)) {
                        if (i8 == i9) {
                            break;
                        }
                        i8 += i10;
                    } else {
                        return i8;
                    }
                }
            }
        }
        return -1;
    }

    public static /* synthetic */ int g(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z, boolean z2, int i4) {
        return f(charSequence, charSequence2, i2, i3, z, (i4 & 16) != 0 ? false : z2);
    }

    public static int h(CharSequence charSequence, char c, int i2, boolean z, int i3) {
        boolean z2;
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        h.e(charSequence, "$this$indexOf");
        if (!z) {
            return ((String) charSequence).indexOf(c, i2);
        }
        char[] cArr = {c};
        h.e(charSequence, "$this$indexOfAny");
        h.e(cArr, "chars");
        if (!z) {
            return ((String) charSequence).indexOf(i.l.c.f(cArr), i2);
        }
        if (i2 < 0) {
            i2 = 0;
        }
        int d2 = d(charSequence);
        if (i2 <= d2) {
            while (true) {
                char charAt = charSequence.charAt(i2);
                int i4 = 0;
                while (true) {
                    if (i4 >= 1) {
                        z2 = false;
                        break;
                    } else if (f.z(cArr[i4], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i4++;
                    }
                }
                if (!z2) {
                    if (i2 == d2) {
                        break;
                    }
                    i2++;
                } else {
                    return i2;
                }
            }
        }
        return -1;
    }

    public static /* synthetic */ int i(CharSequence charSequence, String str, int i2, boolean z, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return e(charSequence, str, i2, z);
    }

    public static final boolean j(CharSequence charSequence) {
        boolean z;
        h.e(charSequence, "$this$isBlank");
        if (charSequence.length() == 0) {
            return true;
        }
        h.e(charSequence, "$this$indices");
        c cVar = new c(0, charSequence.length() - 1);
        if (!(cVar instanceof Collection) || !((Collection) cVar).isEmpty()) {
            i.l.h c = cVar.iterator();
            while (true) {
                if (((b) c).hasNext()) {
                    if (!f.R(charSequence.charAt(c.a()))) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = true;
        if (z) {
            return true;
        }
        return false;
    }

    public static final boolean k(String str, int i2, String str2, int i3, int i4, boolean z) {
        h.e(str, "$this$regionMatches");
        h.e(str2, "other");
        return !z ? str.regionMatches(i2, str2, i3, i4) : str.regionMatches(z, i2, str2, i3, i4);
    }

    public static String l(String str, String str2, String str3, boolean z, int i2) {
        int i3 = 0;
        if ((i2 & 4) != 0) {
            z = false;
        }
        h.e(str, "$this$replace");
        h.e(str2, "oldValue");
        h.e(str3, "newValue");
        int e2 = e(str, str2, 0, z);
        if (e2 < 0) {
            return str;
        }
        int length = str2.length();
        int i4 = 1;
        if (length >= 1) {
            i4 = length;
        }
        int length2 = str3.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append(str, i3, e2);
                sb.append(str3);
                i3 = e2 + length;
                if (e2 >= str.length() || (e2 = e(str, str2, e2 + i4, z)) <= 0) {
                    sb.append(str, i3, str.length());
                    String sb2 = sb.toString();
                    h.d(sb2, "stringBuilder.append(this, i, length).toString()");
                }
                sb.append(str, i3, e2);
                sb.append(str3);
                i3 = e2 + length;
                break;
            } while ((e2 = e(str, str2, e2 + i4, z)) <= 0);
            sb.append(str, i3, str.length());
            String sb22 = sb.toString();
            h.d(sb22, "stringBuilder.append(this, i, length).toString()");
            return sb22;
        }
        throw new OutOfMemoryError();
    }

    public static boolean m(String str, String str2, boolean z, int i2) {
        boolean z2 = (i2 & 2) != 0 ? false : z;
        h.e(str, "$this$startsWith");
        h.e(str2, "prefix");
        if (!z2) {
            return str.startsWith(str2);
        }
        return k(str, 0, str2, 0, str2.length(), z2);
    }

    public static String n(String str, char c, String str2, int i2) {
        String str3 = (i2 & 2) != 0 ? str : null;
        h.e(str, "$this$substringAfterLast");
        h.e(str3, "missingDelimiterValue");
        int d2 = d(str);
        h.e(str, "$this$lastIndexOf");
        int lastIndexOf = str.lastIndexOf(c, d2);
        if (lastIndexOf == -1) {
            return str3;
        }
        String substring = str.substring(lastIndexOf + 1, str.length());
        h.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }
}
