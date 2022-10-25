package g.e.a.b.b.f;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
import e.e.d.l.a;

public final class z implements Parcelable.Creator<GetServiceRequest> {
    public static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i2) {
        int T0 = a.T0(parcel, 20293);
        int i3 = getServiceRequest.b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        int i4 = getServiceRequest.c;
        parcel.writeInt(262146);
        parcel.writeInt(i4);
        int i5 = getServiceRequest.f356d;
        parcel.writeInt(262147);
        parcel.writeInt(i5);
        a.Q0(parcel, 4, getServiceRequest.f357e, false);
        a.O0(parcel, 5, getServiceRequest.f358f, false);
        a.R0(parcel, 6, getServiceRequest.f359g, i2, false);
        a.N0(parcel, 7, getServiceRequest.f360h, false);
        a.P0(parcel, 8, getServiceRequest.f361i, i2, false);
        a.R0(parcel, 10, getServiceRequest.f362j, i2, false);
        a.R0(parcel, 11, getServiceRequest.f363k, i2, false);
        boolean z = getServiceRequest.f364l;
        parcel.writeInt(262156);
        parcel.writeInt(z ? 1 : 0);
        int i6 = getServiceRequest.f365m;
        parcel.writeInt(262157);
        parcel.writeInt(i6);
        boolean z2 = getServiceRequest.n;
        parcel.writeInt(262158);
        parcel.writeInt(z2 ? 1 : 0);
        a.Q0(parcel, 15, getServiceRequest.c(), false);
        a.V0(parcel, T0);
    }

    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int K0 = a.K0(parcel);
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        Feature[] featureArr = null;
        Feature[] featureArr2 = null;
        String str2 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        int i5 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < K0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i2 = a.m0(parcel2, readInt);
                    break;
                case 2:
                    i3 = a.m0(parcel2, readInt);
                    break;
                case 3:
                    i4 = a.m0(parcel2, readInt);
                    break;
                case 4:
                    str = a.q(parcel2, readInt);
                    break;
                case 5:
                    iBinder = a.l0(parcel2, readInt);
                    break;
                case 6:
                    scopeArr = (Scope[]) a.s(parcel2, readInt, Scope.CREATOR);
                    break;
                case 7:
                    bundle = a.m(parcel2, readInt);
                    break;
                case 8:
                    account = (Account) a.p(parcel2, readInt, Account.CREATOR);
                    break;
                case 10:
                    featureArr = (Feature[]) a.s(parcel2, readInt, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) a.s(parcel2, readInt, Feature.CREATOR);
                    break;
                case 12:
                    z = a.k0(parcel2, readInt);
                    break;
                case ConnectionResult.CANCELED:
                    i5 = a.m0(parcel2, readInt);
                    break;
                case ConnectionResult.TIMEOUT:
                    z2 = a.k0(parcel2, readInt);
                    break;
                case ConnectionResult.INTERRUPTED:
                    str2 = a.q(parcel2, readInt);
                    break;
                default:
                    a.I0(parcel2, readInt);
                    break;
            }
        }
        a.x(parcel2, K0);
        return new GetServiceRequest(i2, i3, i4, str, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z, i5, z2, str2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new GetServiceRequest[i2];
    }
}
