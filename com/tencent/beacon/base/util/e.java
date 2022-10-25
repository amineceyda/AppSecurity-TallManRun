package com.tencent.beacon.base.util;

import android.text.TextUtils;
import com.tencent.beacon.a.c.b;
import com.tencent.beacon.a.c.c;
import g.a.a.a.a;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class e {
    public static AtomicBoolean a = new AtomicBoolean(false);

    public static void a(String str) {
        c.b(a.w("[strict]  ", str), new Object[0]);
        if (a.get()) {
            throw new IllegalStateException(a.w("[strict] ", str));
        }
    }

    public static void a(Map map) {
        if (a.get() && map != null) {
            for (Object next : map.keySet()) {
                if (!(next instanceof String)) {
                    a("Key必须为String类型!");
                }
                if (!(map.get(next) instanceof String)) {
                    a("Value必须为String类型!");
                }
            }
        }
    }

    private static boolean a() {
        return a.get() || b.d(c.d().c());
    }

    public static boolean a(String str, Object obj) {
        boolean isEmpty = obj instanceof String ? TextUtils.isEmpty((String) obj) : obj == null;
        c.a(a.f(a.l(str, " "), obj == null ? "=" : "!", "= null!"), new Object[0]);
        if (!isEmpty || !a()) {
            return isEmpty;
        }
        throw new NullPointerException(a.w(str, " == null!"));
    }
}
