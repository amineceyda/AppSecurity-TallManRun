package com.ola.qsea.i;

import com.ola.qsea.g.a;

public class d extends a<Integer> {
    public d(a<?>... aVarArr) {
        super(aVarArr);
    }

    public Integer a(a<Integer> aVar, String str) {
        String a = a(str, a(aVar));
        if (a != null && !a.isEmpty()) {
            try {
                return Integer.valueOf(Integer.parseInt(a));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return aVar.a();
    }
}
