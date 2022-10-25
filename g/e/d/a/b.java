package g.e.d.a;

import com.google.android.gms.common.ConnectionResult;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.tencent.raft.measure.utils.MeasureConst;
import g.a.a.a.a;
import g.e.d.a.c;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

public final class b {
    public static final Charset a = Charset.forName(MeasureConst.CHARSET_UTF8);
    public static final Object b = new Object();

    static {
        Charset.forName("ISO-8859-1");
    }

    public static <K, V> int a(Map<K, V> map, int i2, int i3, int i4) {
        int k2 = CodedOutputByteBufferNano.k(i2);
        int i5 = 0;
        for (Map.Entry next : map.entrySet()) {
            Object key = next.getKey();
            Object value = next.getValue();
            if (key == null || value == null) {
                throw new IllegalStateException("keys and values in maps cannot be null");
            }
            int c = CodedOutputByteBufferNano.c(2, i4, value) + CodedOutputByteBufferNano.c(1, i3, key);
            i5 += CodedOutputByteBufferNano.h(c) + k2 + c;
        }
        return i5;
    }

    public static final <K, V> Map<K, V> b(a aVar, Map<K, V> map, c.C0132c cVar, int i2, int i3, V v, int i4, int i5) throws IOException {
        if (map == null) {
            map = new HashMap<>();
        }
        int b2 = aVar.b(aVar.m());
        Object obj = null;
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                break;
            } else if (p == i4) {
                obj = aVar.h(i2);
            } else if (p == i5) {
                if (i3 == 11) {
                    aVar.g((d) v);
                } else {
                    v = aVar.h(i3);
                }
            } else if (!aVar.s(p)) {
                break;
            }
        }
        aVar.a(0);
        aVar.f3821g = b2;
        aVar.q();
        if (obj == null) {
            obj = c(i2);
        }
        if (v == null) {
            v = c(i3);
        }
        map.put(obj, v);
        return map;
    }

    public static Object c(int i2) {
        switch (i2) {
            case 1:
                return Double.valueOf(0.0d);
            case 2:
                return Float.valueOf(0.0f);
            case 3:
            case 4:
            case 6:
            case ConnectionResult.API_UNAVAILABLE:
            case ConnectionResult.SERVICE_UPDATING:
                return 0L;
            case 5:
            case 7:
            case ConnectionResult.CANCELED:
            case ConnectionResult.TIMEOUT:
            case ConnectionResult.INTERRUPTED:
            case ConnectionResult.SIGN_IN_FAILED:
                return 0;
            case 8:
                return Boolean.FALSE;
            case 9:
                return "";
            case 12:
                return e.c;
            default:
                throw new IllegalArgumentException(a.r("Type: ", i2, " is not a primitive type."));
        }
    }

    public static <K, V> void d(CodedOutputByteBufferNano codedOutputByteBufferNano, Map<K, V> map, int i2, int i3, int i4) throws IOException {
        for (Map.Entry next : map.entrySet()) {
            Object key = next.getKey();
            Object value = next.getValue();
            if (key == null || value == null) {
                throw new IllegalStateException("keys and values in maps cannot be null");
            }
            int c = CodedOutputByteBufferNano.c(2, i4, value) + CodedOutputByteBufferNano.c(1, i3, key);
            codedOutputByteBufferNano.A((i2 << 3) | 2);
            codedOutputByteBufferNano.A(c);
            codedOutputByteBufferNano.s(1, i3, key);
            codedOutputByteBufferNano.s(2, i4, value);
        }
    }
}
