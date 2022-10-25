package e.e.b;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Arrays;

public class a extends e.e.c.a {
    public static final /* synthetic */ int b = 0;

    /* renamed from: e.e.b.a$a  reason: collision with other inner class name */
    public class C0041a implements Runnable {
        public final /* synthetic */ String[] b;
        public final /* synthetic */ Activity c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f1265d;

        public C0041a(String[] strArr, Activity activity, int i2) {
            this.b = strArr;
            this.c = activity;
            this.f1265d = i2;
        }

        public void run() {
            int[] iArr = new int[this.b.length];
            PackageManager packageManager = this.c.getPackageManager();
            String packageName = this.c.getPackageName();
            int length = this.b.length;
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = packageManager.checkPermission(this.b[i2], packageName);
            }
            ((b) this.c).onRequestPermissionsResult(this.f1265d, this.b, iArr);
        }
    }

    public interface b {
        void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr);
    }

    public interface c {
        void a(int i2);
    }

    public static void d(Activity activity, String[] strArr, int i2) {
        int length = strArr.length;
        int i3 = 0;
        while (i3 < length) {
            if (!TextUtils.isEmpty(strArr[i3])) {
                i3++;
            } else {
                throw new IllegalArgumentException(g.a.a.a.a.f(g.a.a.a.a.i("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof c) {
                ((c) activity).a(i2);
            }
            activity.requestPermissions(strArr, i2);
        } else if (activity instanceof b) {
            new Handler(Looper.getMainLooper()).post(new C0041a(strArr, activity, i2));
        }
    }
}
