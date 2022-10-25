package com.ola.qsea.w;

import android.content.Context;
import com.ola.qsea.c.a;
import com.ola.qsea.shellapi.IDependency;
import com.ola.qsea.u.b;

public class d {
    public static final b a = new a();

    public static b a() {
        return a;
    }

    public static b a(String str) {
        b a2 = b.a();
        IDependency a3 = a2.a("StrategyProvider" + str);
        return a3 instanceof b ? (b) a3 : a;
    }

    public static void a(Context context, String str, b bVar, k kVar) {
        a(str, bVar);
        a.a().a(new c(str, context, kVar));
    }

    public static void a(String str, b bVar) {
        b a2 = b.a();
        a2.a("StrategyProvider" + str, bVar);
    }
}
