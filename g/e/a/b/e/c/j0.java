package g.e.a.b.e.c;

import java.util.List;

public final class j0 extends w {
    public final p a(String str, h4 h4Var, List list) {
        if (str == null || str.isEmpty() || !h4Var.g(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", new Object[]{str}));
        }
        p d2 = h4Var.d(str);
        if (d2 instanceof j) {
            return ((j) d2).a(h4Var, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", new Object[]{str}));
    }
}
