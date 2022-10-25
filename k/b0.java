package k;

import java.io.IOException;
import javax.annotation.Nullable;
import k.h0.c;
import l.f;

public abstract class b0 {
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0010  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static k.b0 c(@javax.annotation.Nullable k.t r2, java.lang.String r3) {
        /*
            java.nio.charset.Charset r0 = k.h0.c.f4731i
            if (r2 == 0) goto L_0x0027
            java.lang.String r0 = r2.f4923d     // Catch:{ IllegalArgumentException -> 0x000d }
            if (r0 == 0) goto L_0x000d
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)     // Catch:{ IllegalArgumentException -> 0x000d }
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 != 0) goto L_0x0027
            java.nio.charset.Charset r0 = k.h0.c.f4731i
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r2 = "; charset=utf-8"
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            k.t r2 = k.t.b(r2)
        L_0x0027:
            byte[] r3 = r3.getBytes(r0)
            k.b0 r2 = d(r2, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k.b0.c(k.t, java.lang.String):k.b0");
    }

    public static b0 d(@Nullable t tVar, byte[] bArr) {
        int length = bArr.length;
        c.e((long) bArr.length, (long) 0, (long) length);
        return new z(tVar, length, bArr, 0);
    }

    public abstract long a() throws IOException;

    @Nullable
    public abstract t b();

    public abstract void e(f fVar) throws IOException;
}
