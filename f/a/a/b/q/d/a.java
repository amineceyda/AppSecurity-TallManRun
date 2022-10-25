package f.a.a.b.q.d;

import com.tencent.raft.codegenmeta.utils.Constants;
import f.a.a.b.d;
import f.a.a.b.w.e;
import org.xml.sax.Locator;

public class a extends e {
    public a(d dVar, j jVar) {
        super(dVar, jVar);
    }

    public Object i() {
        Class<j> cls = j.class;
        Locator locator = ((j) this.f1844d).f1748f;
        if (locator != null) {
            return cls.getName() + "@" + locator.getLineNumber() + Constants.KEY_INDEX_FILE_SEPARATOR + locator.getColumnNumber();
        }
        return cls.getName() + "@NA:NA";
    }
}
