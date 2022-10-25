package g.e.a.b.e.c;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class b7 {
    public static volatile b7 b;
    public static volatile b7 c;

    /* renamed from: d  reason: collision with root package name */
    public static final b7 f2907d = new b7(true);
    public final Map a;

    public b7() {
        this.a = new HashMap();
    }

    public b7(boolean z) {
        this.a = Collections.emptyMap();
    }

    public static b7 a() {
        b7 b7Var = b;
        if (b7Var == null) {
            synchronized (b7.class) {
                b7Var = b;
                if (b7Var == null) {
                    b7Var = f2907d;
                    b = b7Var;
                }
            }
        }
        return b7Var;
    }
}
