package g.e.b.l.j.j;

public enum h0 {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    
    private final int id;

    /* access modifiers changed from: public */
    h0(int i2) {
        this.id = i2;
    }

    public int f() {
        return this.id;
    }

    public String toString() {
        return Integer.toString(this.id);
    }
}
