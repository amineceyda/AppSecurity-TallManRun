package g.e.a.a.f.z.i;

import java.util.Objects;

public final class f0 implements Object<b0> {

    public static final class a {
        public static final f0 a = new f0();
    }

    public Object get() {
        b0 b0Var = b0.a;
        Objects.requireNonNull(b0Var, "Cannot return null from a non-@Nullable @Provides method");
        return b0Var;
    }
}
