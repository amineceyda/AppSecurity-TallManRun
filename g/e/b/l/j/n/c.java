package g.e.b.l.j.n;

import java.io.File;
import java.nio.charset.Charset;
import java.util.Comparator;

public final /* synthetic */ class c implements Comparator {
    public static final /* synthetic */ c b = new c();

    public final int compare(Object obj, Object obj2) {
        Charset charset = e.f3686d;
        String name = ((File) obj).getName();
        int i2 = e.f3687e;
        return name.substring(0, i2).compareTo(((File) obj2).getName().substring(0, i2));
    }
}
