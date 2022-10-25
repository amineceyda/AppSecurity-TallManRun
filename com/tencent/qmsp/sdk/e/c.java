package com.tencent.qmsp.sdk.e;

import com.tencent.qmsp.sdk.c.f;
import com.tencent.qmsp.sdk.c.i;
import com.tencent.qmsp.sdk.f.g;

public class c {

    public static class a implements Runnable {
        public void run() {
            try {
                if (com.tencent.qmsp.sdk.app.a.getContext() != null) {
                    com.tencent.qmsp.sdk.d.c cVar = new com.tencent.qmsp.sdk.d.c(com.tencent.qmsp.sdk.app.a.getContext());
                    f.i().a(cVar);
                    cVar.a();
                    return;
                }
                g.d("qp.updTask", 2, "Context is null!");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void a() {
        f.i().c().postDelayed(new a(), (long) i.f823e);
    }
}
