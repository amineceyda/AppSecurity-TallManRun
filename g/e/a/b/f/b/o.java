package g.e.a.b.f.b;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzas;
import g.c.b.b.f;
import java.util.Iterator;
import java.util.Objects;
import org.slf4j.helpers.MessageFormatter;

public final class o {
    public final String a;
    public final String b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final long f3269d;

    /* renamed from: e  reason: collision with root package name */
    public final long f3270e;

    /* renamed from: f  reason: collision with root package name */
    public final zzas f3271f;

    public o(n4 n4Var, String str, String str2, String str3, long j2, long j3, Bundle bundle) {
        zzas zzas;
        f.k(str2);
        f.k(str3);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.f3269d = j2;
        this.f3270e = j3;
        if (j3 != 0 && j3 > j2) {
            n4Var.d().f3139i.b("Event created with reverse previous/current timestamps. appId", f3.t(str2));
        }
        if (!bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (str4 == null) {
                    n4Var.d().f3136f.a("Param name can't be null");
                } else {
                    Object o = n4Var.A().o(str4, bundle2.get(str4));
                    if (o == null) {
                        n4Var.d().f3139i.b("Param value can't be null", n4Var.f3264m.e(str4));
                    } else {
                        n4Var.A().A(bundle2, str4, o);
                    }
                }
                it.remove();
            }
            zzas = new zzas(bundle2);
        } else {
            zzas = new zzas(new Bundle());
        }
        this.f3271f = zzas;
    }

    public final o a(n4 n4Var, long j2) {
        return new o(n4Var, this.c, this.a, this.b, this.f3269d, j2, this.f3271f);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String zzas = this.f3271f.toString();
        StringBuilder sb = new StringBuilder(zzas.length() + String.valueOf(str).length() + 33 + String.valueOf(str2).length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(zzas);
        sb.append(MessageFormatter.DELIM_STOP);
        return sb.toString();
    }

    public o(n4 n4Var, String str, String str2, String str3, long j2, long j3, zzas zzas) {
        f.k(str2);
        f.k(str3);
        Objects.requireNonNull(zzas, "null reference");
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.f3269d = j2;
        this.f3270e = j3;
        if (j3 != 0 && j3 > j2) {
            n4Var.d().f3139i.c("Event created with reverse previous/current timestamps. appId, name", f3.t(str2), f3.t(str3));
        }
        this.f3271f = zzas;
    }
}
