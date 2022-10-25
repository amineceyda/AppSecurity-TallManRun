package i.p.d;

import i.o.c.h;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public final class a extends i.p.a {
    public int c(int i2, int i3) {
        return ThreadLocalRandom.current().nextInt(i2, i3);
    }

    public Random d() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        h.d(current, "ThreadLocalRandom.current()");
        return current;
    }
}
