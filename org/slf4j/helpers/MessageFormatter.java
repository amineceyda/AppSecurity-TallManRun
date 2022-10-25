package org.slf4j.helpers;

import g.a.a.a.a;
import java.util.HashMap;
import java.util.Map;

public final class MessageFormatter {
    public static final char DELIM_START = '{';
    public static final char DELIM_STOP = '}';
    public static final String DELIM_STR = "{}";
    private static final char ESCAPE_CHAR = '\\';

    public static final FormattingTuple arrayFormat(String str, Object[] objArr) {
        Throwable throwableCandidate = getThrowableCandidate(objArr);
        if (throwableCandidate != null) {
            objArr = trimmedCopy(objArr);
        }
        return arrayFormat(str, objArr, throwableCandidate);
    }

    public static final FormattingTuple arrayFormat(String str, Object[] objArr, Throwable th) {
        int i2;
        HashMap hashMap;
        Object obj;
        if (str == null) {
            return new FormattingTuple((String) null, objArr, th);
        }
        if (objArr == null) {
            return new FormattingTuple(str);
        }
        StringBuilder sb = new StringBuilder(str.length() + 50);
        int i3 = 0;
        int i4 = 0;
        while (i3 < objArr.length) {
            int indexOf = str.indexOf(DELIM_STR, i4);
            if (indexOf != -1) {
                if (!isEscapedDelimeter(str, indexOf)) {
                    sb.append(str, i4, indexOf);
                    obj = objArr[i3];
                    hashMap = new HashMap();
                } else if (!isDoubleEscaped(str, indexOf)) {
                    i3--;
                    sb.append(str, i4, indexOf - 1);
                    sb.append(DELIM_START);
                    i2 = indexOf + 1;
                    i4 = i2;
                    i3++;
                } else {
                    sb.append(str, i4, indexOf - 1);
                    obj = objArr[i3];
                    hashMap = new HashMap();
                }
                deeplyAppendParameter(sb, obj, hashMap);
                i2 = indexOf + 2;
                i4 = i2;
                i3++;
            } else if (i4 == 0) {
                return new FormattingTuple(str, objArr, th);
            } else {
                sb.append(str, i4, str.length());
                return new FormattingTuple(sb.toString(), objArr, th);
            }
        }
        sb.append(str, i4, str.length());
        return new FormattingTuple(sb.toString(), objArr, th);
    }

    private static void booleanArrayAppend(StringBuilder sb, boolean[] zArr) {
        sb.append('[');
        int length = zArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            sb.append(zArr[i2]);
            if (i2 != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    private static void byteArrayAppend(StringBuilder sb, byte[] bArr) {
        sb.append('[');
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            sb.append(bArr[i2]);
            if (i2 != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    private static void charArrayAppend(StringBuilder sb, char[] cArr) {
        sb.append('[');
        int length = cArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            sb.append(cArr[i2]);
            if (i2 != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    private static void deeplyAppendParameter(StringBuilder sb, Object obj, Map<Object[], Object> map) {
        if (obj == null) {
            sb.append("null");
        } else if (!obj.getClass().isArray()) {
            safeObjectAppend(sb, obj);
        } else if (obj instanceof boolean[]) {
            booleanArrayAppend(sb, (boolean[]) obj);
        } else if (obj instanceof byte[]) {
            byteArrayAppend(sb, (byte[]) obj);
        } else if (obj instanceof char[]) {
            charArrayAppend(sb, (char[]) obj);
        } else if (obj instanceof short[]) {
            shortArrayAppend(sb, (short[]) obj);
        } else if (obj instanceof int[]) {
            intArrayAppend(sb, (int[]) obj);
        } else if (obj instanceof long[]) {
            longArrayAppend(sb, (long[]) obj);
        } else if (obj instanceof float[]) {
            floatArrayAppend(sb, (float[]) obj);
        } else if (obj instanceof double[]) {
            doubleArrayAppend(sb, (double[]) obj);
        } else {
            objectArrayAppend(sb, (Object[]) obj, map);
        }
    }

    private static void doubleArrayAppend(StringBuilder sb, double[] dArr) {
        sb.append('[');
        int length = dArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            sb.append(dArr[i2]);
            if (i2 != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    private static void floatArrayAppend(StringBuilder sb, float[] fArr) {
        sb.append('[');
        int length = fArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            sb.append(fArr[i2]);
            if (i2 != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    public static final FormattingTuple format(String str, Object obj) {
        return arrayFormat(str, new Object[]{obj});
    }

    public static final FormattingTuple format(String str, Object obj, Object obj2) {
        return arrayFormat(str, new Object[]{obj, obj2});
    }

    public static Throwable getThrowableCandidate(Object[] objArr) {
        if (!(objArr == null || objArr.length == 0)) {
            Throwable th = objArr[objArr.length - 1];
            if (th instanceof Throwable) {
                return th;
            }
        }
        return null;
    }

    private static void intArrayAppend(StringBuilder sb, int[] iArr) {
        sb.append('[');
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            sb.append(iArr[i2]);
            if (i2 != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    public static final boolean isDoubleEscaped(String str, int i2) {
        return i2 >= 2 && str.charAt(i2 - 2) == '\\';
    }

    public static final boolean isEscapedDelimeter(String str, int i2) {
        return i2 != 0 && str.charAt(i2 - 1) == '\\';
    }

    private static void longArrayAppend(StringBuilder sb, long[] jArr) {
        sb.append('[');
        int length = jArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            sb.append(jArr[i2]);
            if (i2 != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    private static void objectArrayAppend(StringBuilder sb, Object[] objArr, Map<Object[], Object> map) {
        sb.append('[');
        if (!map.containsKey(objArr)) {
            map.put(objArr, (Object) null);
            int length = objArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                deeplyAppendParameter(sb, objArr[i2], map);
                if (i2 != length - 1) {
                    sb.append(", ");
                }
            }
            map.remove(objArr);
        } else {
            sb.append("...");
        }
        sb.append(']');
    }

    private static void safeObjectAppend(StringBuilder sb, Object obj) {
        try {
            sb.append(obj.toString());
        } catch (Throwable th) {
            StringBuilder i2 = a.i("SLF4J: Failed toString() invocation on an object of type [");
            i2.append(obj.getClass().getName());
            i2.append("]");
            Util.report(i2.toString(), th);
            sb.append("[FAILED toString()]");
        }
    }

    private static void shortArrayAppend(StringBuilder sb, short[] sArr) {
        sb.append('[');
        int length = sArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            sb.append(sArr[i2]);
            if (i2 != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    public static Object[] trimmedCopy(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            throw new IllegalStateException("non-sensical empty or null argument array");
        }
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        if (length > 0) {
            System.arraycopy(objArr, 0, objArr2, 0, length);
        }
        return objArr2;
    }
}
