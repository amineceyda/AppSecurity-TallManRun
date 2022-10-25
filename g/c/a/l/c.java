package g.c.a.l;

public enum c {
    b(2),
    c(3),
    UN_KNOW(-1);
    
    private int type;

    /* access modifiers changed from: public */
    c(int i2) {
        this.type = i2;
    }

    public final int a() {
        return this.type;
    }
}
