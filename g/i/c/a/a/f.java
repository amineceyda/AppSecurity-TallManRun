package g.i.c.a.a;

public enum f {
    APP_START_UP(0),
    CALL_UP_FROM_OUTER(1),
    REENTER_FOREGROUND_AND_TIMEOUT(2),
    ADDITIONAL_SESSION_REENTER_FOREGROUND(3);
    
    public final int reason;

    /* access modifiers changed from: public */
    f(int i2) {
        this.reason = i2;
    }
}
