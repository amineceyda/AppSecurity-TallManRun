package e.e.b;

import android.util.Log;
import java.lang.reflect.Method;

public class e implements Runnable {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public e(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    public void run() {
        try {
            Method method = d.f1266d;
            if (method != null) {
                method.invoke(this.b, new Object[]{this.c, Boolean.FALSE, "AppCompat recreation"});
                return;
            }
            d.f1267e.invoke(this.b, new Object[]{this.c, Boolean.FALSE});
        } catch (RuntimeException e2) {
            if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                throw e2;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}
