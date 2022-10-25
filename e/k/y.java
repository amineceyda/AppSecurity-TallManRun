package e.k;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class y {
    public final HashMap<String, s> a = new HashMap<>();

    public final void a() {
        for (s next : this.a.values()) {
            next.b = true;
            Map<String, Object> map = next.a;
            if (map != null) {
                synchronized (map) {
                    for (Object next2 : next.a.values()) {
                        if (next2 instanceof Closeable) {
                            try {
                                ((Closeable) next2).close();
                            } catch (IOException e2) {
                                throw new RuntimeException(e2);
                            }
                        }
                    }
                }
            }
            next.a();
        }
        this.a.clear();
    }
}
