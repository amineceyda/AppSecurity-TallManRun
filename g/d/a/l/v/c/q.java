package g.d.a.l.v.c;

import android.os.Build;
import android.util.Log;
import java.io.File;

public final class q {

    /* renamed from: f  reason: collision with root package name */
    public static final File f2594f = new File("/proc/self/fd");

    /* renamed from: g  reason: collision with root package name */
    public static volatile q f2595g;
    public final boolean a;
    public final int b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public int f2596d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2597e = true;

    public q() {
        boolean z = true;
        String str = Build.MODEL;
        if (str != null && str.length() >= 7) {
            String substring = str.substring(0, 7);
            substring.hashCode();
            char c2 = 65535;
            switch (substring.hashCode()) {
                case -1398613787:
                    if (substring.equals("SM-A520")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1398431166:
                    if (substring.equals("SM-G930")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1398431161:
                    if (substring.equals("SM-G935")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -1398431073:
                    if (substring.equals("SM-G960")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -1398431068:
                    if (substring.equals("SM-G965")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -1398343746:
                    if (substring.equals("SM-J720")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case -1398222624:
                    if (substring.equals("SM-N935")) {
                        c2 = 6;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    if (Build.VERSION.SDK_INT == 26) {
                        z = false;
                        break;
                    }
                    break;
            }
        }
        this.a = z;
        if (Build.VERSION.SDK_INT >= 28) {
            this.b = 20000;
            this.c = 0;
            return;
        }
        this.b = 700;
        this.c = 128;
    }

    public static q a() {
        if (f2595g == null) {
            synchronized (q.class) {
                if (f2595g == null) {
                    f2595g = new q();
                }
            }
        }
        return f2595g;
    }

    public boolean b(int i2, int i3, boolean z, boolean z2) {
        int i4;
        boolean z3;
        if (!z || !this.a || Build.VERSION.SDK_INT < 26 || z2 || i2 < (i4 = this.c) || i3 < i4) {
            return false;
        }
        synchronized (this) {
            int i5 = this.f2596d + 1;
            this.f2596d = i5;
            if (i5 >= 50) {
                this.f2596d = 0;
                int length = f2594f.list().length;
                boolean z4 = length < this.b;
                this.f2597e = z4;
                if (!z4 && Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + this.b);
                }
            }
            z3 = this.f2597e;
        }
        return z3;
    }
}
