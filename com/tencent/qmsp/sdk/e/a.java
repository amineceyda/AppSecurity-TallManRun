package com.tencent.qmsp.sdk.e;

import com.tencent.qmsp.sdk.c.f;

public class a {

    /* renamed from: com.tencent.qmsp.sdk.e.a$a  reason: collision with other inner class name */
    public static class C0015a implements Runnable {
        public void run() {
            try {
                f.i().b().a(false);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void a() {
        f.i().c().post(new C0015a());
    }
}
