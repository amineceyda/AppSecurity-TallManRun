package com.ola.qsea.i;

import com.ola.qsea.g.a;

public class e extends a<String> {
    public e(a<?>... aVarArr) {
        super(aVarArr);
    }

    public String a(a<String> aVar, String str) {
        String a = a(str, a(aVar));
        return (a == null || a.isEmpty()) ? aVar.a() : a;
    }
}
