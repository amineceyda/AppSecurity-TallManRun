package f.a.a.b.u.j;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Date;

public class w implements FilenameFilter {
    public final /* synthetic */ Date a;
    public final /* synthetic */ x b;

    public w(x xVar, Date date) {
        this.b = xVar;
        this.a = date;
    }

    public boolean accept(File file, String str) {
        Date e2 = this.b.f1837f.e(this.b.f1842k.a(str));
        x xVar = this.b;
        return e2.compareTo(this.b.f1837f.e(xVar.f1837f.b(this.a, -xVar.f1838g))) < 0;
    }
}
