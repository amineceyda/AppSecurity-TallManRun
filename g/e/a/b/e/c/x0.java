package g.e.a.b.e.c;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcl;
import g.e.a.b.c.a;

public final class x0 extends m0 implements z0 {
    public x0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public final void beginAdUnitExposure(String str, long j2) throws RemoteException {
        Parcel z = z();
        z.writeString(str);
        z.writeLong(j2);
        B(23, z);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel z = z();
        z.writeString(str);
        z.writeString(str2);
        o0.b(z, bundle);
        B(9, z);
    }

    public final void endAdUnitExposure(String str, long j2) throws RemoteException {
        Parcel z = z();
        z.writeString(str);
        z.writeLong(j2);
        B(24, z);
    }

    public final void generateEventId(c1 c1Var) throws RemoteException {
        Parcel z = z();
        o0.c(z, c1Var);
        B(22, z);
    }

    public final void getCachedAppInstanceId(c1 c1Var) throws RemoteException {
        Parcel z = z();
        o0.c(z, c1Var);
        B(19, z);
    }

    public final void getConditionalUserProperties(String str, String str2, c1 c1Var) throws RemoteException {
        Parcel z = z();
        z.writeString(str);
        z.writeString(str2);
        o0.c(z, c1Var);
        B(10, z);
    }

    public final void getCurrentScreenClass(c1 c1Var) throws RemoteException {
        Parcel z = z();
        o0.c(z, c1Var);
        B(17, z);
    }

    public final void getCurrentScreenName(c1 c1Var) throws RemoteException {
        Parcel z = z();
        o0.c(z, c1Var);
        B(16, z);
    }

    public final void getGmpAppId(c1 c1Var) throws RemoteException {
        Parcel z = z();
        o0.c(z, c1Var);
        B(21, z);
    }

    public final void getMaxUserProperties(String str, c1 c1Var) throws RemoteException {
        Parcel z = z();
        z.writeString(str);
        o0.c(z, c1Var);
        B(6, z);
    }

    public final void getUserProperties(String str, String str2, boolean z, c1 c1Var) throws RemoteException {
        Parcel z2 = z();
        z2.writeString(str);
        z2.writeString(str2);
        ClassLoader classLoader = o0.a;
        z2.writeInt(z ? 1 : 0);
        o0.c(z2, c1Var);
        B(5, z2);
    }

    public final void initialize(a aVar, zzcl zzcl, long j2) throws RemoteException {
        Parcel z = z();
        o0.c(z, aVar);
        o0.b(z, zzcl);
        z.writeLong(j2);
        B(1, z);
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j2) throws RemoteException {
        Parcel z3 = z();
        z3.writeString(str);
        z3.writeString(str2);
        o0.b(z3, bundle);
        z3.writeInt(z ? 1 : 0);
        z3.writeInt(z2 ? 1 : 0);
        z3.writeLong(j2);
        B(2, z3);
    }

    public final void logHealthData(int i2, String str, a aVar, a aVar2, a aVar3) throws RemoteException {
        Parcel z = z();
        z.writeInt(5);
        z.writeString(str);
        o0.c(z, aVar);
        o0.c(z, aVar2);
        o0.c(z, aVar3);
        B(33, z);
    }

    public final void onActivityCreated(a aVar, Bundle bundle, long j2) throws RemoteException {
        Parcel z = z();
        o0.c(z, aVar);
        o0.b(z, bundle);
        z.writeLong(j2);
        B(27, z);
    }

    public final void onActivityDestroyed(a aVar, long j2) throws RemoteException {
        Parcel z = z();
        o0.c(z, aVar);
        z.writeLong(j2);
        B(28, z);
    }

    public final void onActivityPaused(a aVar, long j2) throws RemoteException {
        Parcel z = z();
        o0.c(z, aVar);
        z.writeLong(j2);
        B(29, z);
    }

    public final void onActivityResumed(a aVar, long j2) throws RemoteException {
        Parcel z = z();
        o0.c(z, aVar);
        z.writeLong(j2);
        B(30, z);
    }

    public final void onActivitySaveInstanceState(a aVar, c1 c1Var, long j2) throws RemoteException {
        Parcel z = z();
        o0.c(z, aVar);
        o0.c(z, c1Var);
        z.writeLong(j2);
        B(31, z);
    }

    public final void onActivityStarted(a aVar, long j2) throws RemoteException {
        Parcel z = z();
        o0.c(z, aVar);
        z.writeLong(j2);
        B(25, z);
    }

    public final void onActivityStopped(a aVar, long j2) throws RemoteException {
        Parcel z = z();
        o0.c(z, aVar);
        z.writeLong(j2);
        B(26, z);
    }

    public final void registerOnMeasurementEventListener(f1 f1Var) throws RemoteException {
        Parcel z = z();
        o0.c(z, f1Var);
        B(35, z);
    }

    public final void setConditionalUserProperty(Bundle bundle, long j2) throws RemoteException {
        Parcel z = z();
        o0.b(z, bundle);
        z.writeLong(j2);
        B(8, z);
    }

    public final void setCurrentScreen(a aVar, String str, String str2, long j2) throws RemoteException {
        Parcel z = z();
        o0.c(z, aVar);
        z.writeString(str);
        z.writeString(str2);
        z.writeLong(j2);
        B(15, z);
    }

    public final void setDataCollectionEnabled(boolean z) throws RemoteException {
        Parcel z2 = z();
        ClassLoader classLoader = o0.a;
        z2.writeInt(z ? 1 : 0);
        B(39, z2);
    }
}
