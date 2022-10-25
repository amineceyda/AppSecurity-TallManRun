package k;

import java.io.Closeable;
import javax.annotation.Nullable;
import k.h0.c;
import l.g;

public abstract class e0 implements Closeable {
    public abstract long a();

    @Nullable
    public abstract t b();

    public void close() {
        c.f(d());
    }

    public abstract g d();

    /* JADX WARNING: Can't wrap try/catch for region: R(7:1|2|(3:4|5|(1:7))|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0014 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String f() throws java.io.IOException {
        /*
            r3 = this;
            l.g r0 = r3.d()
            k.t r1 = r3.b()     // Catch:{ all -> 0x0020 }
            java.nio.charset.Charset r2 = k.h0.c.f4731i     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x0014
            java.lang.String r1 = r1.f4923d     // Catch:{ IllegalArgumentException -> 0x0014 }
            if (r1 == 0) goto L_0x0014
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r1)     // Catch:{ IllegalArgumentException -> 0x0014 }
        L_0x0014:
            java.nio.charset.Charset r1 = k.h0.c.b(r0, r2)     // Catch:{ all -> 0x0020 }
            java.lang.String r1 = r0.c0(r1)     // Catch:{ all -> 0x0020 }
            k.h0.c.f(r0)
            return r1
        L_0x0020:
            r1 = move-exception
            k.h0.c.f(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k.e0.f():java.lang.String");
    }
}
