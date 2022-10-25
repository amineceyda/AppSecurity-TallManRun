package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.apkpure.aegon.components.download.DownloadTask;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import e.e.d.l.a;
import g.c.b.b.f;
import g.e.a.b.b.e.c;
import g.e.a.b.b.f.g;
import java.util.Arrays;

public final class Status extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new c();
    public static final Status RESULT_CANCELED = new Status(16);
    public static final Status RESULT_DEAD_CLIENT = new Status(18);
    public static final Status RESULT_INTERNAL_ERROR = new Status(8);
    public static final Status RESULT_INTERRUPTED = new Status(14);
    public static final Status RESULT_SUCCESS = new Status(0);
    public static final Status RESULT_TIMEOUT = new Status(15);
    public static final Status zza = new Status(17);
    public final int b;
    private final int zzc;
    private final String zzd;
    private final PendingIntent zze;
    private final ConnectionResult zzf;

    public Status(int i2) {
        this.b = 1;
        this.zzc = i2;
        this.zzd = null;
        this.zze = null;
        this.zzf = null;
    }

    public Status(int i2, int i3, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.b = i2;
        this.zzc = i3;
        this.zzd = str;
        this.zze = pendingIntent;
        this.zzf = connectionResult;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.b == status.b && this.zzc == status.zzc && f.y(this.zzd, status.zzd) && f.y(this.zze, status.zze) && f.y(this.zzf, status.zzf);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.zzc), this.zzd, this.zze, this.zzf});
    }

    public String toString() {
        g gVar = new g(this);
        String str = this.zzd;
        if (str == null) {
            int i2 = this.zzc;
            switch (i2) {
                case -1:
                    str = "SUCCESS_CACHE";
                    break;
                case 0:
                    str = DownloadTask.DOWNLOAD_STATUS_SUCCESS;
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str = "SERVICE_DISABLED";
                    break;
                case 4:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    str = "INVALID_ACCOUNT";
                    break;
                case 6:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
                    str = "INTERNAL_ERROR";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case ConnectionResult.CANCELED:
                    str = "ERROR";
                    break;
                case ConnectionResult.TIMEOUT:
                    str = "INTERRUPTED";
                    break;
                case ConnectionResult.INTERRUPTED:
                    str = "TIMEOUT";
                    break;
                case ConnectionResult.API_UNAVAILABLE:
                    str = "CANCELED";
                    break;
                case ConnectionResult.SIGN_IN_FAILED:
                    str = "API_NOT_CONNECTED";
                    break;
                case ConnectionResult.SERVICE_UPDATING:
                    str = "DEAD_CLIENT";
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION:
                    str = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    str = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    str = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case ConnectionResult.RESOLUTION_ACTIVITY_NOT_FOUND:
                    str = "RECONNECTION_TIMED_OUT";
                    break;
                default:
                    StringBuilder sb = new StringBuilder(32);
                    sb.append("unknown status code: ");
                    sb.append(i2);
                    str = sb.toString();
                    break;
            }
        }
        gVar.a("statusCode", str);
        gVar.a("resolution", this.zze);
        return gVar.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int T0 = a.T0(parcel, 20293);
        int i3 = this.zzc;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        a.Q0(parcel, 2, this.zzd, false);
        a.P0(parcel, 3, this.zze, i2, false);
        a.P0(parcel, 4, this.zzf, i2, false);
        int i4 = this.b;
        parcel.writeInt(263144);
        parcel.writeInt(i4);
        a.V0(parcel, T0);
    }
}
