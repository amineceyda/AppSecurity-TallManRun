package g.d.a.l.u;

import g.d.a.l.l;
import g.d.a.l.s.d;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public interface n<Model, Data> {

    public static class a<Data> {
        public final l a;
        public final List<l> b;
        public final d<Data> c;

        public a(l lVar, d<Data> dVar) {
            List<l> emptyList = Collections.emptyList();
            Objects.requireNonNull(lVar, "Argument must not be null");
            this.a = lVar;
            Objects.requireNonNull(emptyList, "Argument must not be null");
            this.b = emptyList;
            Objects.requireNonNull(dVar, "Argument must not be null");
            this.c = dVar;
        }
    }

    a<Data> a(Model model, int i2, int i3, g.d.a.l.n nVar);

    boolean b(Model model);
}
