package m.a.a.a.a.b;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public enum j0 {
    STORED(0),
    UNSHRINKING(1),
    EXPANDING_LEVEL_1(2),
    EXPANDING_LEVEL_2(3),
    EXPANDING_LEVEL_3(4),
    EXPANDING_LEVEL_4(5),
    IMPLODING(6),
    TOKENIZATION(7),
    DEFLATED(8),
    ENHANCED_DEFLATED(9),
    PKWARE_IMPLODING(10),
    BZIP2(12),
    LZMA(14),
    JPEG(96),
    WAVPACK(97),
    PPMD(98),
    AES_ENCRYPTED(99),
    UNKNOWN;
    
    public static final Map<Integer, j0> t = null;
    private final int code;

    /* access modifiers changed from: public */
    static {
        HashMap hashMap = new HashMap();
        j0[] values = values();
        for (int i2 = 0; i2 < 18; i2++) {
            j0 j0Var = values[i2];
            hashMap.put(Integer.valueOf(j0Var.code), j0Var);
        }
        t = Collections.unmodifiableMap(hashMap);
    }

    /* access modifiers changed from: public */
    j0(int i2) {
        this.code = i2;
    }

    public int a() {
        return this.code;
    }
}
