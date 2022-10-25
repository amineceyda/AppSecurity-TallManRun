package com.tencent.qmsp.sdk.g.i;

import android.content.Context;
import com.tencent.qmsp.sdk.base.IVendorCallback;
import com.tencent.raft.raftframework.sla.SLAConstant;
import java.lang.reflect.Method;

public class b implements com.tencent.qmsp.sdk.base.b {
    public a a;

    private static String a(String str, String str2) {
        Class<String> cls = String.class;
        try {
            Class<?> cls2 = Class.forName("android.os.SystemProperties");
            Method method = cls2.getMethod("get", new Class[]{cls, cls});
            Object[] objArr = new Object[2];
            objArr[0] = str;
            objArr[1] = "unknown";
            return (String) method.invoke(cls2, objArr);
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public String a() {
        return this.a.a(0, "");
    }

    public void a(Context context, IVendorCallback iVendorCallback) {
        this.a = new a(context);
    }

    public String b() {
        return null;
    }

    public void c() {
    }

    public boolean d() {
        return true;
    }

    public boolean e() {
        return SLAConstant.TYPE_DEPRECATED_START.equals(a("persist.sys.identifierid.supported", "0"));
    }

    public void f() {
    }
}
