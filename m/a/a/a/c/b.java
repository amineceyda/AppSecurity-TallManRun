package m.a.a.a.c;

import com.tencent.raft.measure.utils.MeasureConst;
import java.nio.charset.Charset;

public class b {
    public static final Charset a = Charset.forName(MeasureConst.CHARSET_UTF8);

    static {
        Charset.forName("ISO-8859-1");
        Charset.forName("US-ASCII");
        Charset.forName("UTF-16");
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
    }
}
