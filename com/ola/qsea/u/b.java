package com.ola.qsea.u;

import com.ola.qsea.shellapi.IDependency;
import java.util.HashMap;

public class b {
    public static final HashMap<String, IDependency> a = new HashMap<>();

    public static final class a {
        public static final b a = new b();
    }

    public b() {
    }

    public static b a() {
        return a.a;
    }

    public IDependency a(String str) {
        return a.get(str);
    }

    public void a(String str, IDependency iDependency) {
        a.put(str, iDependency);
    }
}
