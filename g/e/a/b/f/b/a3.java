package g.e.a.b.f.b;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzas;
import com.google.android.gms.measurement.internal.zzau;
import g.a.a.a.a;
import g.c.b.b.f;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public final class a3 {
    public static final AtomicReference b = new AtomicReference();
    public static final AtomicReference c = new AtomicReference();

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicReference f3105d = new AtomicReference();
    public final o5 a;

    public a3(o5 o5Var) {
        this.a = o5Var;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        Objects.requireNonNull(atomicReference, "null reference");
        f.g(strArr.length == strArr2.length);
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (q9.Y(str, strArr[i2])) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i2];
                    if (str2 == null) {
                        str2 = strArr2[i2] + "(" + strArr[i2] + ")";
                        strArr3[i2] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder i2 = a.i("[");
        for (Bundle bundle : objArr) {
            String b2 = bundle instanceof Bundle ? b(bundle) : String.valueOf(bundle);
            if (b2 != null) {
                if (i2.length() != 1) {
                    i2.append(", ");
                }
                i2.append(b2);
            }
        }
        i2.append("]");
        return i2.toString();
    }

    public final String b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.a.a()) {
            return bundle.toString();
        }
        StringBuilder i2 = a.i("Bundle[{");
        for (String str : bundle.keySet()) {
            if (i2.length() != 8) {
                i2.append(", ");
            }
            i2.append(e(str));
            i2.append("=");
            Object obj = bundle.get(str);
            i2.append(obj instanceof Bundle ? a(new Object[]{obj}) : obj instanceof Object[] ? a((Object[]) obj) : obj instanceof ArrayList ? a(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        i2.append("}]");
        return i2.toString();
    }

    public final String c(zzau zzau) {
        if (!this.a.a()) {
            return zzau.toString();
        }
        StringBuilder i2 = a.i("origin=");
        i2.append(zzau.zzc);
        i2.append(",name=");
        i2.append(d(zzau.zza));
        i2.append(",params=");
        zzas zzas = zzau.zzb;
        i2.append(zzas == null ? null : !this.a.a() ? zzas.toString() : b(zzas.f()));
        return i2.toString();
    }

    public final String d(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.a() ? str : g(str, k5.c, k5.a, b);
    }

    public final String e(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.a() ? str : g(str, l5.b, l5.a, c);
    }

    public final String f(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.a() ? str : str.startsWith("_exp_") ? a.c("experiment_id(", str, ")") : g(str, m5.b, m5.a, f3105d);
    }
}
