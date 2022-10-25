package i.p;

import java.util.Random;

public abstract class a extends c {
    public int a(int i2) {
        return ((-i2) >> 31) & (d().nextInt() >>> (32 - i2));
    }

    public int b() {
        return d().nextInt();
    }

    public abstract Random d();
}
