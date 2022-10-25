package g.d.a.l.t.c0;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

public final class j {
    public final int a;
    public final int b;
    public final Context c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2454d;

    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        public static final int f2455e = (Build.VERSION.SDK_INT < 26 ? 4 : 1);
        public final Context a;
        public ActivityManager b;
        public c c;

        /* renamed from: d  reason: collision with root package name */
        public float f2456d = ((float) f2455e);

        public a(Context context) {
            this.a = context;
            this.b = (ActivityManager) context.getSystemService("activity");
            this.c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && this.b.isLowRamDevice()) {
                this.f2456d = 0.0f;
            }
        }
    }

    public static final class b implements c {
        public final DisplayMetrics a;

        public b(DisplayMetrics displayMetrics) {
            this.a = displayMetrics;
        }
    }

    public interface c {
    }

    public j(a aVar) {
        this.c = aVar.a;
        int i2 = aVar.b.isLowRamDevice() ? 2097152 : 4194304;
        this.f2454d = i2;
        ActivityManager activityManager = aVar.b;
        int round = Math.round(((float) (activityManager.getMemoryClass() * 1024 * 1024)) * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = ((b) aVar.c).a;
        float f2 = (float) (displayMetrics.widthPixels * displayMetrics.heightPixels * 4);
        int round2 = Math.round(aVar.f2456d * f2);
        int round3 = Math.round(f2 * 2.0f);
        int i3 = round - i2;
        int i4 = round3 + round2;
        if (i4 <= i3) {
            this.b = round3;
            this.a = round2;
        } else {
            float f3 = ((float) i3) / (aVar.f2456d + 2.0f);
            this.b = Math.round(2.0f * f3);
            this.a = Math.round(f3 * aVar.f2456d);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder i5 = g.a.a.a.a.i("Calculation complete, Calculated memory cache size: ");
            i5.append(a(this.b));
            i5.append(", pool size: ");
            i5.append(a(this.a));
            i5.append(", byte array size: ");
            i5.append(a(i2));
            i5.append(", memory class limited? ");
            i5.append(i4 > round);
            i5.append(", max size: ");
            i5.append(a(round));
            i5.append(", memoryClass: ");
            i5.append(aVar.b.getMemoryClass());
            i5.append(", isLowMemoryDevice: ");
            i5.append(aVar.b.isLowRamDevice());
            Log.d("MemorySizeCalculator", i5.toString());
        }
    }

    public final String a(int i2) {
        return Formatter.formatFileSize(this.c, (long) i2);
    }
}
