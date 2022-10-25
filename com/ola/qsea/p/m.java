package com.ola.qsea.p;

import com.ola.qsea.h.b;
import com.ola.qsea.r.a;
import com.ola.qsea.sdk.IAsyncQseaListener;
import com.ola.qsea.sdk.Qsea;

public class m implements IAsyncQseaListener {
    public final /* synthetic */ o a;

    public m(o oVar) {
        this.a = oVar;
    }

    public void onQseaDispatch(Qsea qsea) {
        b.a().a(this.a.f493d);
        b.a().c(this.a.f494e);
        this.a.k();
        a.a(this.a.f493d).e();
    }
}
