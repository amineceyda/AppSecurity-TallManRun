package g.e.b.l.j.n;

import java.io.File;
import java.nio.charset.Charset;
import java.util.Comparator;

public final /* synthetic */ class a implements Comparator {
    public static final /* synthetic */ a b = new a();

    public final int compare(Object obj, Object obj2) {
        Charset charset = e.f3686d;
        return ((File) obj2).getName().compareTo(((File) obj).getName());
    }
}
