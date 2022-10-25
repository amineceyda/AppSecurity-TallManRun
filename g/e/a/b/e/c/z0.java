package g.e.a.b.e.c;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcl;
import g.e.a.b.c.a;
import java.util.Map;

public interface z0 extends IInterface {
    void beginAdUnitExposure(String str, long j2) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    void clearMeasurementEnabled(long j2) throws RemoteException;

    void endAdUnitExposure(String str, long j2) throws RemoteException;

    void generateEventId(c1 c1Var) throws RemoteException;

    void getAppInstanceId(c1 c1Var) throws RemoteException;

    void getCachedAppInstanceId(c1 c1Var) throws RemoteException;

    void getConditionalUserProperties(String str, String str2, c1 c1Var) throws RemoteException;

    void getCurrentScreenClass(c1 c1Var) throws RemoteException;

    void getCurrentScreenName(c1 c1Var) throws RemoteException;

    void getGmpAppId(c1 c1Var) throws RemoteException;

    void getMaxUserProperties(String str, c1 c1Var) throws RemoteException;

    void getTestFlag(c1 c1Var, int i2) throws RemoteException;

    void getUserProperties(String str, String str2, boolean z, c1 c1Var) throws RemoteException;

    void initForTests(Map map) throws RemoteException;

    void initialize(a aVar, zzcl zzcl, long j2) throws RemoteException;

    void isDataCollectionEnabled(c1 c1Var) throws RemoteException;

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j2) throws RemoteException;

    void logEventAndBundle(String str, String str2, Bundle bundle, c1 c1Var, long j2) throws RemoteException;

    void logHealthData(int i2, String str, a aVar, a aVar2, a aVar3) throws RemoteException;

    void onActivityCreated(a aVar, Bundle bundle, long j2) throws RemoteException;

    void onActivityDestroyed(a aVar, long j2) throws RemoteException;

    void onActivityPaused(a aVar, long j2) throws RemoteException;

    void onActivityResumed(a aVar, long j2) throws RemoteException;

    void onActivitySaveInstanceState(a aVar, c1 c1Var, long j2) throws RemoteException;

    void onActivityStarted(a aVar, long j2) throws RemoteException;

    void onActivityStopped(a aVar, long j2) throws RemoteException;

    void performAction(Bundle bundle, c1 c1Var, long j2) throws RemoteException;

    void registerOnMeasurementEventListener(f1 f1Var) throws RemoteException;

    void resetAnalyticsData(long j2) throws RemoteException;

    void setConditionalUserProperty(Bundle bundle, long j2) throws RemoteException;

    void setConsent(Bundle bundle, long j2) throws RemoteException;

    void setConsentThirdParty(Bundle bundle, long j2) throws RemoteException;

    void setCurrentScreen(a aVar, String str, String str2, long j2) throws RemoteException;

    void setDataCollectionEnabled(boolean z) throws RemoteException;

    void setDefaultEventParameters(Bundle bundle) throws RemoteException;

    void setEventInterceptor(f1 f1Var) throws RemoteException;

    void setInstanceIdProvider(h1 h1Var) throws RemoteException;

    void setMeasurementEnabled(boolean z, long j2) throws RemoteException;

    void setMinimumSessionDuration(long j2) throws RemoteException;

    void setSessionTimeoutDuration(long j2) throws RemoteException;

    void setUserId(String str, long j2) throws RemoteException;

    void setUserProperty(String str, String str2, a aVar, boolean z, long j2) throws RemoteException;

    void unregisterOnMeasurementEventListener(f1 f1Var) throws RemoteException;
}
