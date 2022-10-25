package g.e.b.l.j.n;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.charset.Charset;

public final /* synthetic */ class b implements FilenameFilter {
    public static final /* synthetic */ b a = new b();

    public final boolean accept(File file, String str) {
        Charset charset = e.f3686d;
        return str.startsWith("event") && !str.endsWith("_");
    }
}
