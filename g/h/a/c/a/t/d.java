package g.h.a.c.a.t;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.widget.Toast;
import java.lang.reflect.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class d {
    public static final Logger a = LoggerFactory.getLogger("SimplexToastLog");
    public static Toast b;
    public static int c;

    /* renamed from: d  reason: collision with root package name */
    public static final Handler f4054d = new Handler(Looper.getMainLooper());

    public static class a implements Runnable {
        public final /* synthetic */ Context b;
        public final /* synthetic */ String c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f4055d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ int f4056e;

        public a(Context context, String str, int i2, int i3) {
            this.b = context;
            this.c = str;
            this.f4055d = i2;
            this.f4056e = i3;
        }

        public void run() {
            d.c(this.b, this.c, this.f4055d, this.f4056e);
        }
    }

    public static class b extends Handler {
        public Handler a;

        public b(Handler handler) {
            this.a = handler;
        }

        public void handleMessage(Message message) {
            try {
                this.a.handleMessage(message);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static Toast a(Context context) {
        if (context != null) {
            if (b == null) {
                Toast makeText = Toast.makeText(context, "", 0);
                b = makeText;
                c = makeText.getYOffset();
            }
            b.setDuration(0);
            b.setGravity(80, 0, c);
            b.setMargin(0.0f, 0.0f);
            return b;
        }
        throw new IllegalArgumentException("Context should not be null!!!");
    }

    public static void b(Context context, String str) {
        c(context, str, 80, 0);
    }

    public static void c(Context context, String str, int i2, int i3) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            f4054d.post(new a(context, str, i2, i3));
        } else if (!TextUtils.isEmpty(str)) {
            if (b == null) {
                try {
                    a(context.getApplicationContext());
                } catch (Exception e2) {
                    a.warn("创建 Toast 异常: {}", (Object) e2.getMessage(), (Object) e2);
                    return;
                }
            }
            b.setText(str);
            b.setDuration(i3);
            b.setGravity(i2, 0, c);
            Toast toast = b;
            try {
                Field declaredField = toast.getClass().getDeclaredField("mTN");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(toast);
                Field declaredField2 = obj.getClass().getDeclaredField("mHandler");
                declaredField2.setAccessible(true);
                Handler handler = (Handler) declaredField2.get(obj);
                if (!(handler instanceof b)) {
                    declaredField2.set(obj, new b(handler));
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            b.show();
        }
    }
}
