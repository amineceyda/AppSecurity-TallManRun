package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import e.e.d.l.a;
import g.e.a.b.b.g.b;
import java.util.List;
import javax.annotation.Nullable;

@Deprecated
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new b();
    public final int b;
    private final long zzb;
    private int zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final int zzg;
    @Nullable
    private final List<String> zzh;
    private final String zzi;
    private final long zzj;
    private int zzk;
    private final String zzl;
    private final float zzm;
    private final long zzn;
    private final boolean zzo;
    private long zzp = -1;

    public WakeLockEvent(int i2, long j2, int i3, String str, int i4, @Nullable List<String> list, String str2, long j3, int i5, String str3, String str4, float f2, long j4, String str5, boolean z) {
        this.b = i2;
        this.zzb = j2;
        this.zzc = i3;
        this.zzd = str;
        this.zze = str3;
        this.zzf = str5;
        this.zzg = i4;
        this.zzh = list;
        this.zzi = str2;
        this.zzj = j3;
        this.zzk = i5;
        this.zzl = str4;
        this.zzm = f2;
        this.zzn = j4;
        this.zzo = z;
    }

    public final int c() {
        return this.zzc;
    }

    public final long e() {
        return this.zzp;
    }

    public final long f() {
        return this.zzb;
    }

    public final String h() {
        List<String> list = this.zzh;
        String str = this.zzd;
        int i2 = this.zzg;
        String str2 = "";
        String join = list == null ? str2 : TextUtils.join(",", list);
        int i3 = this.zzk;
        String str3 = this.zze;
        if (str3 == null) {
            str3 = str2;
        }
        String str4 = this.zzl;
        if (str4 == null) {
            str4 = str2;
        }
        float f2 = this.zzm;
        String str5 = this.zzf;
        if (str5 != null) {
            str2 = str5;
        }
        boolean z = this.zzo;
        StringBuilder sb = new StringBuilder(str2.length() + str4.length() + str3.length() + String.valueOf(str).length() + 51 + String.valueOf(join).length());
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(i2);
        sb.append("\t");
        sb.append(join);
        sb.append("\t");
        sb.append(i3);
        sb.append("\t");
        sb.append(str3);
        sb.append("\t");
        sb.append(str4);
        sb.append("\t");
        sb.append(f2);
        sb.append("\t");
        sb.append(str2);
        sb.append("\t");
        sb.append(z);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int T0 = a.T0(parcel, 20293);
        int i3 = this.b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        long j2 = this.zzb;
        parcel.writeInt(524290);
        parcel.writeLong(j2);
        a.Q0(parcel, 4, this.zzd, false);
        int i4 = this.zzg;
        parcel.writeInt(262149);
        parcel.writeInt(i4);
        List<String> list = this.zzh;
        if (list != null) {
            int T02 = a.T0(parcel, 6);
            parcel.writeStringList(list);
            a.V0(parcel, T02);
        }
        long j3 = this.zzj;
        parcel.writeInt(524296);
        parcel.writeLong(j3);
        a.Q0(parcel, 10, this.zze, false);
        int i5 = this.zzc;
        parcel.writeInt(262155);
        parcel.writeInt(i5);
        a.Q0(parcel, 12, this.zzi, false);
        a.Q0(parcel, 13, this.zzl, false);
        int i6 = this.zzk;
        parcel.writeInt(262158);
        parcel.writeInt(i6);
        float f2 = this.zzm;
        parcel.writeInt(262159);
        parcel.writeFloat(f2);
        long j4 = this.zzn;
        parcel.writeInt(524304);
        parcel.writeLong(j4);
        a.Q0(parcel, 17, this.zzf, false);
        boolean z = this.zzo;
        parcel.writeInt(262162);
        parcel.writeInt(z ? 1 : 0);
        a.V0(parcel, T0);
    }
}
