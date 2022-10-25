package g.e.a.b.e.c;

import com.tencent.raft.measure.utils.MeasureConst;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

public final class v7 {
    public static final Charset a = Charset.forName(MeasureConst.CHARSET_UTF8);
    public static final byte[] b;

    static {
        Charset.forName("US-ASCII");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        int i2 = 0 + 0;
    }

    public static int a(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int b(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static Object c(Object obj, Object obj2) {
        g6 b2 = ((o8) obj).b();
        o8 o8Var = (o8) obj2;
        Objects.requireNonNull(b2);
        l7 l7Var = (l7) b2;
        if (l7Var.b.getClass().isInstance(o8Var)) {
            l7Var.h((o7) ((h6) o8Var));
            return l7Var.k();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
