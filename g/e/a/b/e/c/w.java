package g.e.a.b.e.c;

import g.e.a.b.b.h.e;
import java.util.ArrayList;
import java.util.List;

public abstract class w {
    public final List a = new ArrayList();

    public abstract p a(String str, h4 h4Var, List list);

    public final p b(String str) {
        if (this.a.contains(e.T(str))) {
            String valueOf = String.valueOf(str);
            throw new UnsupportedOperationException(valueOf.length() != 0 ? "Command not implemented: ".concat(valueOf) : new String("Command not implemented: "));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
