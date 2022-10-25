package i.t;

import com.tencent.raft.measure.utils.MeasureConst;
import i.o.c.h;
import java.nio.charset.Charset;

public final class a {
    public static final Charset a;

    static {
        Charset forName = Charset.forName(MeasureConst.CHARSET_UTF8);
        h.d(forName, "Charset.forName(\"UTF-8\")");
        a = forName;
        h.d(Charset.forName("UTF-16"), "Charset.forName(\"UTF-16\")");
        h.d(Charset.forName("UTF-16BE"), "Charset.forName(\"UTF-16BE\")");
        h.d(Charset.forName("UTF-16LE"), "Charset.forName(\"UTF-16LE\")");
        h.d(Charset.forName("US-ASCII"), "Charset.forName(\"US-ASCII\")");
        h.d(Charset.forName("ISO-8859-1"), "Charset.forName(\"ISO-8859-1\")");
    }
}
