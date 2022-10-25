package g.c.a.d.b;

import i.j;
import i.o.b.p;
import i.o.c.h;
import i.o.c.i;
import org.slf4j.Logger;

public final class l extends i implements p<Integer, String, j> {
    public static final l b = new l();

    public l() {
        super(2);
    }

    public Object d(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        String str = (String) obj2;
        h.e(str, "message");
        Logger logger = i.f1960g;
        logger.info("Get search hot words fail,code[" + intValue + "] message[" + str + ']');
        return j.a;
    }
}
