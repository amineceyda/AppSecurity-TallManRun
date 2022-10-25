package g.i.a.a.a;

import android.app.Application;
import android.app.Instrumentation;
import android.app.Service;
import g.i.a.a.h.a;
import java.lang.reflect.Method;

public class c {
    public Class<? extends Instrumentation> a;
    public String b = "";
    public Class<? extends a> c;

    /* renamed from: d  reason: collision with root package name */
    public String f4086d = "";

    /* renamed from: e  reason: collision with root package name */
    public Class<? extends a> f4087e;

    /* renamed from: f  reason: collision with root package name */
    public String f4088f = "";

    public c(Class<? extends Instrumentation> cls) {
        this.a = cls;
        String str = null;
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke((Object) null, new Object[0]);
            if (invoke instanceof String) {
                str = (String) invoke;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.f4088f = str;
    }

    public Class<? extends Service> a() {
        if (this.f4088f.equals(this.b)) {
            return this.f4087e;
        }
        if (this.f4088f.equals(this.f4086d)) {
            return this.c;
        }
        return null;
    }
}
