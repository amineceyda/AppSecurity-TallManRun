package k.h0.i;

public enum a {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    f4790g(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);
    
    public final int httpCode;

    /* access modifiers changed from: public */
    a(int i2) {
        this.httpCode = i2;
    }

    public static a a(int i2) {
        a[] values = values();
        for (int i3 = 0; i3 < 11; i3++) {
            a aVar = values[i3];
            if (aVar.httpCode == i2) {
                return aVar;
            }
        }
        return null;
    }
}
