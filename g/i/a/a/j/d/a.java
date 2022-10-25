package g.i.a.a.j.d;

import android.content.ComponentName;
import android.os.Parcel;
import java.lang.Class;
import java.lang.reflect.Field;

public abstract class a<T extends Class<?>> {
    public final int a;
    public final Parcel b;
    public final long c;

    public a(String str, T t) {
        try {
            Parcel obtain = Parcel.obtain();
            this.b = obtain;
            this.a = a(b(), c());
            this.c = d(new ComponentName(str, t.getCanonicalName()), obtain);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public final int a(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.app.IActivityManager$Stub");
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            int i2 = declaredField.getInt(cls);
            g.i.a.a.m.a.a("BaseComponentParam", "get binderCode from " + str + ": " + i2);
            return i2;
        } catch (Exception unused) {
            try {
                Class<?> cls2 = Class.forName("android.app.IActivityManager");
                Field declaredField2 = cls2.getDeclaredField(str2);
                declaredField2.setAccessible(true);
                int i3 = declaredField2.getInt(cls2);
                g.i.a.a.m.a.a("BaseComponentParam", "get binderCode from " + str2 + ": " + i3);
                return i3;
            } catch (Exception unused2) {
                return -1;
            }
        }
    }

    public abstract String b();

    public abstract String c();

    public abstract long d(ComponentName componentName, Parcel parcel) throws Exception;
}
