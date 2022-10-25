package com.ola.qsea.t;

import com.ola.qsea.m.a;
import com.ola.qsea.w.d;
import com.tencent.beacon.event.open.EventResult;
import java.util.Random;

public class c {
    public static final Random a = new Random(System.currentTimeMillis());

    public static int a() {
        return a.nextInt(3) + 1;
    }

    public static boolean a(String str) {
        int nextInt = a.nextInt(EventResult.ERROR_CODE_SAMPLE);
        a.b("CollectRate", "抽样结果为：sample = %d", Integer.valueOf(nextInt));
        return nextInt <= d.a(str).A();
    }
}
