package e.k;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public abstract class s {
    public final Map<String, Object> a = new HashMap();
    public volatile boolean b = false;

    public void a() {
    }

    public <T> T b(String str, T t) {
        T t2;
        synchronized (this.a) {
            t2 = this.a.get(str);
            if (t2 == null) {
                this.a.put(str, t);
            }
        }
        if (t2 != null) {
            t = t2;
        }
        if (this.b && (t instanceof Closeable)) {
            try {
                ((Closeable) t).close();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
        return t;
    }
}
