package com.tencent.qmsp.sdk.e;

import com.tencent.qmsp.sdk.c.f;
import com.tencent.qmsp.sdk.c.h;
import com.tencent.qmsp.sdk.c.i;
import com.tencent.qmsp.sdk.f.g;

public class b {

    public static class a implements Runnable {
        public void run() {
            try {
                if (com.tencent.qmsp.sdk.app.a.getContext() != null) {
                    h.a(com.tencent.qmsp.sdk.app.a.getContext());
                } else {
                    g.d("qmsp.cbid", 2, "Context is null!");
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void a() {
        f.i().c().postDelayed(new a(), (long) i.f824f);
    }
}
