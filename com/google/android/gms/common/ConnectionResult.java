package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.apkpure.aegon.components.download.DownloadTask;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import e.e.d.l.a;
import g.c.b.b.f;
import g.e.a.b.b.f.g;
import g.e.a.b.b.j;
import java.util.Arrays;

public final class ConnectionResult extends AbstractSafeParcelable {
    public static final int API_DISABLED = 23;
    public static final int API_DISABLED_FOR_CONNECTION = 24;
    public static final int API_UNAVAILABLE = 16;
    public static final int CANCELED = 13;
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new j();
    public static final int DEVELOPER_ERROR = 10;
    @Deprecated
    public static final int DRIVE_EXTERNAL_STORAGE_REQUIRED = 1500;
    public static final int INTERNAL_ERROR = 8;
    public static final int INTERRUPTED = 15;
    public static final int INVALID_ACCOUNT = 5;
    public static final int LICENSE_CHECK_FAILED = 11;
    public static final int NETWORK_ERROR = 7;
    public static final int RESOLUTION_ACTIVITY_NOT_FOUND = 22;
    public static final int RESOLUTION_REQUIRED = 6;
    public static final int RESTRICTED_PROFILE = 20;
    public static final ConnectionResult RESULT_SUCCESS = new ConnectionResult(0);
    public static final int SERVICE_DISABLED = 3;
    public static final int SERVICE_INVALID = 9;
    public static final int SERVICE_MISSING = 1;
    public static final int SERVICE_MISSING_PERMISSION = 19;
    public static final int SERVICE_UPDATING = 18;
    public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
    public static final int SIGN_IN_FAILED = 17;
    public static final int SIGN_IN_REQUIRED = 4;
    public static final int SUCCESS = 0;
    public static final int TIMEOUT = 14;
    public static final int UNKNOWN = -1;
    public final int b;
    private final int zzb;
    private final PendingIntent zzc;
    private final String zzd;

    public ConnectionResult(int i2) {
        this.b = 1;
        this.zzb = i2;
        this.zzc = null;
        this.zzd = null;
    }

    public ConnectionResult(int i2, int i3, PendingIntent pendingIntent, String str) {
        this.b = i2;
        this.zzb = i3;
        this.zzc = pendingIntent;
        this.zzd = str;
    }

    public boolean c() {
        return this.zzb == 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.zzb == connectionResult.zzb && f.y(this.zzc, connectionResult.zzc) && f.y(this.zzd, connectionResult.zzd);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public String toString() {
        String str;
        g gVar = new g(this);
        int i2 = this.zzb;
        if (i2 == 99) {
            str = "UNFINISHED";
        } else if (i2 != 1500) {
            switch (i2) {
                case -1:
                    str = "UNKNOWN";
                    break;
                case 0:
                    str = DownloadTask.DOWNLOAD_STATUS_SUCCESS;
                    break;
                case 1:
                    str = "SERVICE_MISSING";
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
                case 9:
                    str = "SERVICE_INVALID";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 11:
                    str = "LICENSE_CHECK_FAILED";
                    break;
                default:
                    switch (i2) {
                        case CANCELED /*13*/:
                            str = "CANCELED";
                            break;
                        case TIMEOUT /*14*/:
                            str = "TIMEOUT";
                            break;
                        case INTERRUPTED /*15*/:
                            str = "INTERRUPTED";
                            break;
                        case API_UNAVAILABLE /*16*/:
                            str = "API_UNAVAILABLE";
                            break;
                        case SIGN_IN_FAILED /*17*/:
                            str = "SIGN_IN_FAILED";
                            break;
                        case SERVICE_UPDATING /*18*/:
                            str = "SERVICE_UPDATING";
                            break;
                        case SERVICE_MISSING_PERMISSION /*19*/:
                            str = "SERVICE_MISSING_PERMISSION";
                            break;
                        case 20:
                            str = "RESTRICTED_PROFILE";
                            break;
                        case 21:
                            str = "API_VERSION_UPDATE_REQUIRED";
                            break;
                        case RESOLUTION_ACTIVITY_NOT_FOUND /*22*/:
                            str = "RESOLUTION_ACTIVITY_NOT_FOUND";
                            break;
                        case API_DISABLED /*23*/:
                            str = "API_DISABLED";
                            break;
                        case API_DISABLED_FOR_CONNECTION /*24*/:
                            str = "API_DISABLED_FOR_CONNECTION";
                            break;
                        default:
                            StringBuilder sb = new StringBuilder(31);
                            sb.append("UNKNOWN_ERROR_CODE(");
                            sb.append(i2);
                            sb.append(")");
                            str = sb.toString();
                            break;
                    }
            }
        } else {
            str = "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        gVar.a("statusCode", str);
        gVar.a("resolution", this.zzc);
        gVar.a("message", this.zzd);
        return gVar.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int T0 = a.T0(parcel, 20293);
        int i3 = this.b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        int i4 = this.zzb;
        parcel.writeInt(262146);
        parcel.writeInt(i4);
        a.P0(parcel, 3, this.zzc, i2, false);
        a.Q0(parcel, 4, this.zzd, false);
        a.V0(parcel, T0);
    }

    public ConnectionResult(int i2, PendingIntent pendingIntent) {
        this.b = 1;
        this.zzb = i2;
        this.zzc = pendingIntent;
        this.zzd = null;
    }
}
