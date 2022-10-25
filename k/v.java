package k;

import g.a.a.a.a;
import java.io.IOException;

public enum v {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    
    private final String protocol;

    /* access modifiers changed from: public */
    v(String str) {
        this.protocol = str;
    }

    public static v a(String str) throws IOException {
        v vVar = HTTP_1_0;
        if (str.equals(vVar.protocol)) {
            return vVar;
        }
        v vVar2 = HTTP_1_1;
        if (str.equals(vVar2.protocol)) {
            return vVar2;
        }
        v vVar3 = H2_PRIOR_KNOWLEDGE;
        if (str.equals(vVar3.protocol)) {
            return vVar3;
        }
        v vVar4 = HTTP_2;
        if (str.equals(vVar4.protocol)) {
            return vVar4;
        }
        v vVar5 = SPDY_3;
        if (str.equals(vVar5.protocol)) {
            return vVar5;
        }
        v vVar6 = QUIC;
        if (str.equals(vVar6.protocol)) {
            return vVar6;
        }
        throw new IOException(a.w("Unexpected protocol: ", str));
    }

    public String toString() {
        return this.protocol;
    }
}
