package g.d.a.l;

import com.tencent.raft.measure.utils.MeasureConst;
import java.nio.charset.Charset;
import java.security.MessageDigest;

public interface l {
    public static final Charset a = Charset.forName(MeasureConst.CHARSET_UTF8);

    void b(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
