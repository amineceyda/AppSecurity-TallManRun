package com.ola.qsea.p;

import android.text.TextUtils;
import com.ola.qsea.m.a;
import com.ola.qsea.sdk.Qsea;
import com.ola.qsea.t.c;
import com.tencent.raft.raftframework.sla.SLAConstant;

public class b implements Runnable {
    public final /* synthetic */ c a;

    public b(c cVar) {
        this.a = cVar;
    }

    public void run() {
        this.a.b.b();
        a.b(c.a, "collectionRateTask is running", new Object[0]);
        if (TextUtils.isEmpty(com.ola.qsea.k.a.c(this.a.c).e("is_first"))) {
            String valueOf = String.valueOf(com.ola.qsea.t.b.a());
            int a2 = c.a();
            this.a.a(a2);
            Qsea e2 = p.e(this.a.c);
            if (e2 != null) {
                String str = "0";
                String unused = this.a.f460e = TextUtils.isEmpty(e2.a()) ? str : SLAConstant.TYPE_DEPRECATED_START;
                c cVar = this.a;
                if (!TextUtils.isEmpty(e2.b())) {
                    str = SLAConstant.TYPE_DEPRECATED_START;
                }
                String unused2 = cVar.f461f = str;
            }
            com.ola.qsea.o.c.a(this.a.c, this.a.f460e, this.a.f461f, valueOf, (long) a2);
        }
    }
}
