package g.e.a.a.f;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class m implements Object<Executor> {

    public static final class a {
        public static final m a = new m();
    }

    public Object get() {
        return new o(Executors.newSingleThreadExecutor());
    }
}
