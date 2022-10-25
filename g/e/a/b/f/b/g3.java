package g.e.a.b.f.b;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzas;
import com.google.android.gms.measurement.internal.zzau;
import g.a.a.a.a;

public final class g3 {
    public final String a;
    public final String b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final Bundle f3165d;

    public g3(String str, String str2, Bundle bundle, long j2) {
        this.a = str;
        this.b = str2;
        this.f3165d = bundle;
        this.c = j2;
    }

    public static g3 b(zzau zzau) {
        return new g3(zzau.zza, zzau.zzc, zzau.zzb.f(), zzau.zzd);
    }

    public final zzau a() {
        return new zzau(this.a, new zzas(new Bundle(this.f3165d)), this.b, this.c);
    }

    public final String toString() {
        String str = this.b;
        String str2 = this.a;
        String obj = this.f3165d.toString();
        StringBuilder sb = new StringBuilder(obj.length() + String.valueOf(str).length() + 21 + String.valueOf(str2).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        return a.f(sb, ",params=", obj);
    }
}
