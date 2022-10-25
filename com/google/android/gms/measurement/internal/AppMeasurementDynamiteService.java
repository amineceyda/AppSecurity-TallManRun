package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.zzcl;
import e.d.a;
import g.c.b.b.f;
import g.e.a.b.c.b;
import g.e.a.b.e.c.c1;
import g.e.a.b.e.c.f1;
import g.e.a.b.e.c.gb;
import g.e.a.b.e.c.h1;
import g.e.a.b.e.c.y0;
import g.e.a.b.f.b.c6;
import g.e.a.b.f.b.g6;
import g.e.a.b.f.b.h6;
import g.e.a.b.f.b.i6;
import g.e.a.b.f.b.j6;
import g.e.a.b.f.b.k6;
import g.e.a.b.f.b.n4;
import g.e.a.b.f.b.n5;
import g.e.a.b.f.b.p6;
import g.e.a.b.f.b.q6;
import g.e.a.b.f.b.q9;
import g.e.a.b.f.b.r5;
import g.e.a.b.f.b.r9;
import g.e.a.b.f.b.s2;
import g.e.a.b.f.b.s5;
import g.e.a.b.f.b.s9;
import g.e.a.b.f.b.t5;
import g.e.a.b.f.b.t9;
import g.e.a.b.f.b.u6;
import g.e.a.b.f.b.u7;
import g.e.a.b.f.b.u9;
import g.e.a.b.f.b.v5;
import g.e.a.b.f.b.v8;
import g.e.a.b.f.b.w5;
import g.e.a.b.f.b.x6;
import g.e.a.b.f.b.y6;
import g.e.a.b.f.b.z5;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

@DynamiteApi
public class AppMeasurementDynamiteService extends y0 {
    public n4 a = null;
    public final Map b = new a();

    @EnsuresNonNull({"scion"})
    public final void A() {
        if (this.a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    public void beginAdUnitExposure(String str, long j2) throws RemoteException {
        A();
        this.a.n().i(str, j2);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        A();
        this.a.v().I(str, str2, bundle);
    }

    public void clearMeasurementEnabled(long j2) throws RemoteException {
        A();
        q6 v = this.a.v();
        v.i();
        v.a.b().r(new k6(v, (Boolean) null));
    }

    public void endAdUnitExposure(String str, long j2) throws RemoteException {
        A();
        this.a.n().j(str, j2);
    }

    public void generateEventId(c1 c1Var) throws RemoteException {
        A();
        long n0 = this.a.A().n0();
        A();
        this.a.A().G(c1Var, n0);
    }

    public void getAppInstanceId(c1 c1Var) throws RemoteException {
        A();
        this.a.b().r(new v5(this, c1Var));
    }

    public void getCachedAppInstanceId(c1 c1Var) throws RemoteException {
        A();
        String F = this.a.v().F();
        A();
        this.a.A().H(c1Var, F);
    }

    public void getConditionalUserProperties(String str, String str2, c1 c1Var) throws RemoteException {
        A();
        this.a.b().r(new r9(this, c1Var, str, str2));
    }

    public void getCurrentScreenClass(c1 c1Var) throws RemoteException {
        A();
        y6 y6Var = this.a.v().a.x().c;
        String str = y6Var != null ? y6Var.b : null;
        A();
        this.a.A().H(c1Var, str);
    }

    public void getCurrentScreenName(c1 c1Var) throws RemoteException {
        A();
        y6 y6Var = this.a.v().a.x().c;
        String str = y6Var != null ? y6Var.a : null;
        A();
        this.a.A().H(c1Var, str);
    }

    public void getGmpAppId(c1 c1Var) throws RemoteException {
        A();
        q6 v = this.a.v();
        n4 n4Var = v.a;
        String str = n4Var.b;
        if (str == null) {
            try {
                str = x6.b(n4Var.a, "google_app_id", n4Var.s);
            } catch (IllegalStateException e2) {
                v.a.d().f3136f.b("getGoogleAppId failed with exception", e2);
                str = null;
            }
        }
        A();
        this.a.A().H(c1Var, str);
    }

    public void getMaxUserProperties(String str, c1 c1Var) throws RemoteException {
        A();
        q6 v = this.a.v();
        Objects.requireNonNull(v);
        f.k(str);
        g.e.a.b.f.b.f fVar = v.a.f3258g;
        A();
        this.a.A().F(c1Var, 25);
    }

    public void getTestFlag(c1 c1Var, int i2) throws RemoteException {
        A();
        if (i2 == 0) {
            q9 A = this.a.A();
            q6 v = this.a.v();
            Objects.requireNonNull(v);
            AtomicReference atomicReference = new AtomicReference();
            A.H(c1Var, (String) v.a.b().o(atomicReference, 15000, "String test flag value", new g6(v, atomicReference)));
        } else if (i2 == 1) {
            q9 A2 = this.a.A();
            q6 v2 = this.a.v();
            Objects.requireNonNull(v2);
            AtomicReference atomicReference2 = new AtomicReference();
            A2.G(c1Var, ((Long) v2.a.b().o(atomicReference2, 15000, "long test flag value", new h6(v2, atomicReference2))).longValue());
        } else if (i2 == 2) {
            q9 A3 = this.a.A();
            q6 v3 = this.a.v();
            Objects.requireNonNull(v3);
            AtomicReference atomicReference3 = new AtomicReference();
            double doubleValue = ((Double) v3.a.b().o(atomicReference3, 15000, "double test flag value", new j6(v3, atomicReference3))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                c1Var.a(bundle);
            } catch (RemoteException e2) {
                A3.a.d().f3139i.b("Error returning double value to wrapper", e2);
            }
        } else if (i2 == 3) {
            q9 A4 = this.a.A();
            q6 v4 = this.a.v();
            Objects.requireNonNull(v4);
            AtomicReference atomicReference4 = new AtomicReference();
            A4.F(c1Var, ((Integer) v4.a.b().o(atomicReference4, 15000, "int test flag value", new i6(v4, atomicReference4))).intValue());
        } else if (i2 == 4) {
            q9 A5 = this.a.A();
            q6 v5 = this.a.v();
            Objects.requireNonNull(v5);
            AtomicReference atomicReference5 = new AtomicReference();
            A5.B(c1Var, ((Boolean) v5.a.b().o(atomicReference5, 15000, "boolean test flag value", new c6(v5, atomicReference5))).booleanValue());
        }
    }

    public void getUserProperties(String str, String str2, boolean z, c1 c1Var) throws RemoteException {
        A();
        this.a.b().r(new u7(this, c1Var, str, str2, z));
    }

    public void initForTests(Map map) throws RemoteException {
        A();
    }

    public void initialize(g.e.a.b.c.a aVar, zzcl zzcl, long j2) throws RemoteException {
        n4 n4Var = this.a;
        if (n4Var == null) {
            Context context = (Context) b.B(aVar);
            Objects.requireNonNull(context, "null reference");
            this.a = n4.u(context, zzcl, Long.valueOf(j2));
            return;
        }
        n4Var.d().f3139i.a("Attempting to initialize multiple times");
    }

    public void isDataCollectionEnabled(c1 c1Var) throws RemoteException {
        A();
        this.a.b().r(new s9(this, c1Var));
    }

    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j2) throws RemoteException {
        A();
        this.a.v().n(str, str2, bundle, z, z2, j2);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, c1 c1Var, long j2) throws RemoteException {
        Bundle bundle2;
        A();
        f.k(str2);
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.a.b().r(new u6(this, c1Var, new zzau(str2, new zzas(bundle), "app", j2), str));
    }

    public void logHealthData(int i2, String str, g.e.a.b.c.a aVar, g.e.a.b.c.a aVar2, g.e.a.b.c.a aVar3) throws RemoteException {
        A();
        Object obj = null;
        Object B = aVar == null ? null : b.B(aVar);
        Object B2 = aVar2 == null ? null : b.B(aVar2);
        if (aVar3 != null) {
            obj = b.B(aVar3);
        }
        this.a.d().x(i2, true, false, str, B, B2, obj);
    }

    public void onActivityCreated(g.e.a.b.c.a aVar, Bundle bundle, long j2) throws RemoteException {
        A();
        p6 p6Var = this.a.v().c;
        if (p6Var != null) {
            this.a.v().l();
            p6Var.onActivityCreated((Activity) b.B(aVar), bundle);
        }
    }

    public void onActivityDestroyed(g.e.a.b.c.a aVar, long j2) throws RemoteException {
        A();
        p6 p6Var = this.a.v().c;
        if (p6Var != null) {
            this.a.v().l();
            p6Var.onActivityDestroyed((Activity) b.B(aVar));
        }
    }

    public void onActivityPaused(g.e.a.b.c.a aVar, long j2) throws RemoteException {
        A();
        p6 p6Var = this.a.v().c;
        if (p6Var != null) {
            this.a.v().l();
            p6Var.onActivityPaused((Activity) b.B(aVar));
        }
    }

    public void onActivityResumed(g.e.a.b.c.a aVar, long j2) throws RemoteException {
        A();
        p6 p6Var = this.a.v().c;
        if (p6Var != null) {
            this.a.v().l();
            p6Var.onActivityResumed((Activity) b.B(aVar));
        }
    }

    public void onActivitySaveInstanceState(g.e.a.b.c.a aVar, c1 c1Var, long j2) throws RemoteException {
        A();
        p6 p6Var = this.a.v().c;
        Bundle bundle = new Bundle();
        if (p6Var != null) {
            this.a.v().l();
            p6Var.onActivitySaveInstanceState((Activity) b.B(aVar), bundle);
        }
        try {
            c1Var.a(bundle);
        } catch (RemoteException e2) {
            this.a.d().f3139i.b("Error returning bundle value to wrapper", e2);
        }
    }

    public void onActivityStarted(g.e.a.b.c.a aVar, long j2) throws RemoteException {
        A();
        if (this.a.v().c != null) {
            this.a.v().l();
            Activity activity = (Activity) b.B(aVar);
        }
    }

    public void onActivityStopped(g.e.a.b.c.a aVar, long j2) throws RemoteException {
        A();
        if (this.a.v().c != null) {
            this.a.v().l();
            Activity activity = (Activity) b.B(aVar);
        }
    }

    public void performAction(Bundle bundle, c1 c1Var, long j2) throws RemoteException {
        A();
        c1Var.a((Bundle) null);
    }

    public void registerOnMeasurementEventListener(f1 f1Var) throws RemoteException {
        Object obj;
        A();
        synchronized (this.b) {
            obj = (n5) this.b.get(Integer.valueOf(f1Var.l()));
            if (obj == null) {
                obj = new u9(this, f1Var);
                this.b.put(Integer.valueOf(f1Var.l()), obj);
            }
        }
        q6 v = this.a.v();
        v.i();
        if (!v.f3303e.add(obj)) {
            v.a.d().f3139i.a("OnEventListener already registered");
        }
    }

    public void resetAnalyticsData(long j2) throws RemoteException {
        A();
        q6 v = this.a.v();
        v.f3305g.set((Object) null);
        v.a.b().r(new z5(v, j2));
    }

    public void setConditionalUserProperty(Bundle bundle, long j2) throws RemoteException {
        A();
        if (bundle == null) {
            this.a.d().f3136f.a("Conditional user property must not be null");
        } else {
            this.a.v().u(bundle, j2);
        }
    }

    public void setConsent(Bundle bundle, long j2) throws RemoteException {
        A();
        q6 v = this.a.v();
        Objects.requireNonNull(v);
        gb.c.c().c();
        if (v.a.f3258g.u((String) null, s2.j0)) {
            v.a.b().s(new s5(v, bundle, j2));
        } else {
            v.C(bundle, j2);
        }
    }

    public void setConsentThirdParty(Bundle bundle, long j2) throws RemoteException {
        A();
        this.a.v().v(bundle, -20, j2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0084, code lost:
        if (r4.length() <= 100) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ad, code lost:
        if (r5.length() <= 100) goto L_0x00c3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setCurrentScreen(g.e.a.b.c.a r3, java.lang.String r4, java.lang.String r5, long r6) throws android.os.RemoteException {
        /*
            r2 = this;
            r2.A()
            g.e.a.b.f.b.n4 r6 = r2.a
            g.e.a.b.f.b.f7 r6 = r6.x()
            java.lang.Object r3 = g.e.a.b.c.b.B(r3)
            android.app.Activity r3 = (android.app.Activity) r3
            g.e.a.b.f.b.n4 r7 = r6.a
            g.e.a.b.f.b.f r7 = r7.f3258g
            boolean r7 = r7.v()
            if (r7 != 0) goto L_0x0028
            g.e.a.b.f.b.n4 r3 = r6.a
            g.e.a.b.f.b.f3 r3 = r3.d()
            g.e.a.b.f.b.d3 r3 = r3.f3141k
            java.lang.String r4 = "setCurrentScreen cannot be called while screen reporting is disabled."
        L_0x0023:
            r3.a(r4)
            goto L_0x00ee
        L_0x0028:
            g.e.a.b.f.b.y6 r7 = r6.c
            if (r7 != 0) goto L_0x0037
            g.e.a.b.f.b.n4 r3 = r6.a
            g.e.a.b.f.b.f3 r3 = r3.d()
            g.e.a.b.f.b.d3 r3 = r3.f3141k
            java.lang.String r4 = "setCurrentScreen cannot be called while no activity active"
            goto L_0x0023
        L_0x0037:
            java.util.Map r0 = r6.f3149f
            java.lang.Object r0 = r0.get(r3)
            if (r0 != 0) goto L_0x004a
            g.e.a.b.f.b.n4 r3 = r6.a
            g.e.a.b.f.b.f3 r3 = r3.d()
            g.e.a.b.f.b.d3 r3 = r3.f3141k
            java.lang.String r4 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            goto L_0x0023
        L_0x004a:
            if (r5 != 0) goto L_0x0056
            java.lang.Class r5 = r3.getClass()
            java.lang.String r0 = "Activity"
            java.lang.String r5 = r6.p(r5, r0)
        L_0x0056:
            java.lang.String r0 = r7.b
            boolean r0 = g.e.a.b.f.b.q9.Y(r0, r5)
            java.lang.String r7 = r7.a
            boolean r7 = g.e.a.b.f.b.q9.Y(r7, r4)
            if (r0 == 0) goto L_0x0072
            if (r7 != 0) goto L_0x0067
            goto L_0x0072
        L_0x0067:
            g.e.a.b.f.b.n4 r3 = r6.a
            g.e.a.b.f.b.f3 r3 = r3.d()
            g.e.a.b.f.b.d3 r3 = r3.f3141k
            java.lang.String r4 = "setCurrentScreen cannot be called with the same class and name"
            goto L_0x0023
        L_0x0072:
            r7 = 100
            if (r4 == 0) goto L_0x009d
            int r0 = r4.length()
            if (r0 <= 0) goto L_0x0087
            g.e.a.b.f.b.n4 r0 = r6.a
            g.e.a.b.f.b.f r0 = r0.f3258g
            int r0 = r4.length()
            if (r0 > r7) goto L_0x0087
            goto L_0x009d
        L_0x0087:
            g.e.a.b.f.b.n4 r3 = r6.a
            g.e.a.b.f.b.f3 r3 = r3.d()
            g.e.a.b.f.b.d3 r3 = r3.f3141k
            int r4 = r4.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Invalid screen name length in setCurrentScreen. Length"
        L_0x0099:
            r3.b(r5, r4)
            goto L_0x00ee
        L_0x009d:
            if (r5 == 0) goto L_0x00c3
            int r0 = r5.length()
            if (r0 <= 0) goto L_0x00b0
            g.e.a.b.f.b.n4 r0 = r6.a
            g.e.a.b.f.b.f r0 = r0.f3258g
            int r0 = r5.length()
            if (r0 > r7) goto L_0x00b0
            goto L_0x00c3
        L_0x00b0:
            g.e.a.b.f.b.n4 r3 = r6.a
            g.e.a.b.f.b.f3 r3 = r3.d()
            g.e.a.b.f.b.d3 r3 = r3.f3141k
            int r4 = r5.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Invalid class name length in setCurrentScreen. Length"
            goto L_0x0099
        L_0x00c3:
            g.e.a.b.f.b.n4 r7 = r6.a
            g.e.a.b.f.b.f3 r7 = r7.d()
            g.e.a.b.f.b.d3 r7 = r7.n
            if (r4 != 0) goto L_0x00d0
            java.lang.String r0 = "null"
            goto L_0x00d1
        L_0x00d0:
            r0 = r4
        L_0x00d1:
            java.lang.String r1 = "Setting current screen to name, class"
            r7.c(r1, r0, r5)
            g.e.a.b.f.b.y6 r7 = new g.e.a.b.f.b.y6
            g.e.a.b.f.b.n4 r0 = r6.a
            g.e.a.b.f.b.q9 r0 = r0.A()
            long r0 = r0.n0()
            r7.<init>(r4, r5, r0)
            java.util.Map r4 = r6.f3149f
            r4.put(r3, r7)
            r4 = 1
            r6.l(r3, r7, r4)
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreen(g.e.a.b.c.a, java.lang.String, java.lang.String, long):void");
    }

    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        A();
        q6 v = this.a.v();
        v.i();
        v.a.b().r(new t5(v, z));
    }

    public void setDefaultEventParameters(Bundle bundle) {
        A();
        q6 v = this.a.v();
        v.a.b().r(new r5(v, bundle == null ? null : new Bundle(bundle)));
    }

    public void setEventInterceptor(f1 f1Var) throws RemoteException {
        A();
        t9 t9Var = new t9(this, f1Var);
        if (this.a.b().t()) {
            this.a.v().x(t9Var);
        } else {
            this.a.b().r(new v8(this, t9Var));
        }
    }

    public void setInstanceIdProvider(h1 h1Var) throws RemoteException {
        A();
    }

    public void setMeasurementEnabled(boolean z, long j2) throws RemoteException {
        A();
        q6 v = this.a.v();
        Boolean valueOf = Boolean.valueOf(z);
        v.i();
        v.a.b().r(new k6(v, valueOf));
    }

    public void setMinimumSessionDuration(long j2) throws RemoteException {
        A();
    }

    public void setSessionTimeoutDuration(long j2) throws RemoteException {
        A();
        q6 v = this.a.v();
        v.a.b().r(new w5(v, j2));
    }

    public void setUserId(String str, long j2) throws RemoteException {
        A();
        if (str == null || str.length() != 0) {
            this.a.v().A((String) null, "_id", str, true, j2);
        } else {
            this.a.d().f3139i.a("User ID must be non-empty");
        }
    }

    public void setUserProperty(String str, String str2, g.e.a.b.c.a aVar, boolean z, long j2) throws RemoteException {
        A();
        this.a.v().A(str, str2, b.B(aVar), z, j2);
    }

    public void unregisterOnMeasurementEventListener(f1 f1Var) throws RemoteException {
        Object obj;
        A();
        synchronized (this.b) {
            obj = (n5) this.b.remove(Integer.valueOf(f1Var.l()));
        }
        if (obj == null) {
            obj = new u9(this, f1Var);
        }
        q6 v = this.a.v();
        v.i();
        if (!v.f3303e.remove(obj)) {
            v.a.d().f3139i.a("OnEventListener had not been registered");
        }
    }
}
