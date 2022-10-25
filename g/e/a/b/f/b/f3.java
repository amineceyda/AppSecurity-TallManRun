package g.e.a.b.f.b;

import android.text.TextUtils;
import android.util.Log;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class f3 extends i5 {
    public char c = 0;

    /* renamed from: d  reason: collision with root package name */
    public long f3134d = -1;

    /* renamed from: e  reason: collision with root package name */
    public String f3135e;

    /* renamed from: f  reason: collision with root package name */
    public final d3 f3136f = new d3(this, 6, false, false);

    /* renamed from: g  reason: collision with root package name */
    public final d3 f3137g = new d3(this, 6, true, false);

    /* renamed from: h  reason: collision with root package name */
    public final d3 f3138h = new d3(this, 6, false, true);

    /* renamed from: i  reason: collision with root package name */
    public final d3 f3139i = new d3(this, 5, false, false);

    /* renamed from: j  reason: collision with root package name */
    public final d3 f3140j = new d3(this, 5, true, false);

    /* renamed from: k  reason: collision with root package name */
    public final d3 f3141k = new d3(this, 5, false, true);

    /* renamed from: l  reason: collision with root package name */
    public final d3 f3142l = new d3(this, 4, false, false);

    /* renamed from: m  reason: collision with root package name */
    public final d3 f3143m = new d3(this, 3, false, false);
    public final d3 n = new d3(this, 2, false, false);

    public f3(n4 n4Var) {
        super(n4Var);
    }

    public static Object t(String str) {
        if (str == null) {
            return null;
        }
        return new e3(str);
    }

    public static String u(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String v = v(z, obj);
        String v2 = v(z, obj2);
        String v3 = v(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(v)) {
            sb.append(str2);
            sb.append(v);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(v2)) {
            sb.append(str2);
            sb.append(v2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(v3)) {
            sb.append(str3);
            sb.append(v3);
        }
        return sb.toString();
    }

    public static String v(boolean z, Object obj) {
        String className;
        String str = "";
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i2 = 0;
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l2 = (Long) obj;
            if (Math.abs(l2.longValue()) < 100) {
                return obj.toString();
            }
            if (obj.toString().charAt(0) == '-') {
                str = "-";
            }
            String valueOf = String.valueOf(Math.abs(l2.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 4.0d);
            StringBuilder sb = new StringBuilder(str.length() + str.length() + 43);
            sb.append(str);
            sb.append(round);
            sb.append("...");
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return obj.toString();
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
                String y = y(n4.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i2];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && y(className).equals(y)) {
                        sb2.append(": ");
                        sb2.append(stackTraceElement);
                        break;
                    }
                    i2++;
                }
                return sb2.toString();
            } else if (obj instanceof e3) {
                return ((e3) obj).a;
            } else {
                if (z) {
                    return "-";
                }
                return obj.toString();
            }
        }
    }

    public static String y(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    public final boolean j() {
        return false;
    }

    public final d3 o() {
        return this.f3143m;
    }

    public final d3 p() {
        return this.f3136f;
    }

    public final d3 q() {
        return this.n;
    }

    public final d3 r() {
        return this.f3139i;
    }

    public final d3 s() {
        return this.f3141k;
    }

    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    public final String w() {
        String str;
        synchronized (this) {
            if (this.f3135e == null) {
                n4 n4Var = this.a;
                String str2 = n4Var.f3255d;
                if (str2 != null) {
                    this.f3135e = str2;
                } else {
                    b bVar = n4Var.f3258g.a.f3257f;
                    this.f3135e = "FA";
                }
            }
            Objects.requireNonNull(this.f3135e, "null reference");
            str = this.f3135e;
        }
        return str;
    }

    public final void x(int i2, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(w(), i2)) {
            Log.println(i2, w(), u(false, str, obj, obj2, obj3));
        }
        if (!z2 && i2 >= 5) {
            Objects.requireNonNull(str, "null reference");
            k4 k4Var = this.a.f3261j;
            if (k4Var == null) {
                Log.println(6, w(), "Scheduler not set. Not logging error/warn");
            } else if (!k4Var.n()) {
                Log.println(6, w(), "Scheduler not initialized. Not logging error/warn");
            } else {
                k4Var.r(new c3(this, i2 >= 9 ? 8 : i2, str, obj, obj2, obj3));
            }
        }
    }
}
