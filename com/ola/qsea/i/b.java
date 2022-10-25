package com.ola.qsea.i;

import com.ola.qsea.g.a;
import com.tencent.raft.raftframework.sla.SLAConstant;

public class b extends a<Boolean> {
    public b(a<?>... aVarArr) {
        super(aVarArr);
    }

    public Boolean a(a<Boolean> aVar, String str) {
        String a = a(str, a(aVar));
        return (a == null || a.isEmpty()) ? aVar.a() : Boolean.valueOf(SLAConstant.TYPE_DEPRECATED_START.equals(a));
    }
}
