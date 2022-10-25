package f.a.a.b.u.j;

import java.io.File;
import java.io.FilenameFilter;

public final class g implements FilenameFilter {
    public final /* synthetic */ String a;

    public g(String str) {
        this.a = str;
    }

    public boolean accept(File file, String str) {
        return str.matches(this.a);
    }
}
