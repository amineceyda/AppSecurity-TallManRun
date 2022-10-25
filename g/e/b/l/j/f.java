package g.e.b.l.j;

import android.util.Log;

public class f {
    public static final f a = new f("FirebaseCrashlytics");

    public f(String str) {
    }

    public final boolean a(int i2) {
        return 4 <= i2 || Log.isLoggable("FirebaseCrashlytics", i2);
    }

    public void b(String str) {
        if (a(3)) {
            Log.d("FirebaseCrashlytics", str, (Throwable) null);
        }
    }

    public void c(String str) {
        if (a(6)) {
            Log.e("FirebaseCrashlytics", str, (Throwable) null);
        }
    }

    public void d(String str, Throwable th) {
        if (a(6)) {
            Log.e("FirebaseCrashlytics", str, th);
        }
    }

    public void e(String str) {
        if (a(2)) {
            Log.v("FirebaseCrashlytics", str, (Throwable) null);
        }
    }

    public void f(String str) {
        if (a(5)) {
            Log.w("FirebaseCrashlytics", str, (Throwable) null);
        }
    }

    public void g(String str, Throwable th) {
        if (a(5)) {
            Log.w("FirebaseCrashlytics", str, th);
        }
    }
}
