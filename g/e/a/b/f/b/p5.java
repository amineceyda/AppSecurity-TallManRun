package g.e.a.b.f.b;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzcl;
import java.util.Objects;

public final class p5 {
    public final Context a;
    public String b;
    public String c;

    /* renamed from: d  reason: collision with root package name */
    public String f3291d;

    /* renamed from: e  reason: collision with root package name */
    public Boolean f3292e;

    /* renamed from: f  reason: collision with root package name */
    public long f3293f;

    /* renamed from: g  reason: collision with root package name */
    public zzcl f3294g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3295h = true;

    /* renamed from: i  reason: collision with root package name */
    public final Long f3296i;

    /* renamed from: j  reason: collision with root package name */
    public String f3297j;

    public p5(Context context, zzcl zzcl, Long l2) {
        Context applicationContext = context.getApplicationContext();
        Objects.requireNonNull(applicationContext, "null reference");
        this.a = applicationContext;
        this.f3296i = l2;
        if (zzcl != null) {
            this.f3294g = zzcl;
            this.b = zzcl.zzf;
            this.c = zzcl.zze;
            this.f3291d = zzcl.zzd;
            this.f3295h = zzcl.zzc;
            this.f3293f = zzcl.zzb;
            this.f3297j = zzcl.zzh;
            Bundle bundle = zzcl.zzg;
            if (bundle != null) {
                this.f3292e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
