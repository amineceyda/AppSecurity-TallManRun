package g.c.a.e.h.b.g;

import com.tencent.raft.raftframework.sla.SLAConstant;

public enum a {
    STATUS_LOGIN(SLAConstant.TYPE_DEPRECATED_START),
    STATUS_LOGOUT("-1");
    
    private String value;

    /* access modifiers changed from: public */
    a(String str) {
        this.value = str;
    }

    public final String a() {
        return this.value;
    }
}
