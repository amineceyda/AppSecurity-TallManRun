package g.e.a.b.e.c;

import android.os.IBinder;
import android.os.IInterface;

public abstract class y0 extends n0 implements z0 {
    public y0() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static z0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return queryLocalInterface instanceof z0 ? (z0) queryLocalInterface : new x0(iBinder);
    }

    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v5, types: [g.e.a.b.e.c.c1] */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v11, types: [g.e.a.b.e.c.c1] */
    /* JADX WARNING: type inference failed for: r4v16, types: [g.e.a.b.e.c.c1] */
    /* JADX WARNING: type inference failed for: r4v20, types: [g.e.a.b.e.c.c1] */
    /* JADX WARNING: type inference failed for: r4v26, types: [g.e.a.b.e.c.c1] */
    /* JADX WARNING: type inference failed for: r4v30, types: [g.e.a.b.e.c.c1] */
    /* JADX WARNING: type inference failed for: r4v34, types: [g.e.a.b.e.c.h1] */
    /* JADX WARNING: type inference failed for: r4v38, types: [g.e.a.b.e.c.c1] */
    /* JADX WARNING: type inference failed for: r4v42, types: [g.e.a.b.e.c.c1] */
    /* JADX WARNING: type inference failed for: r4v46, types: [g.e.a.b.e.c.c1] */
    /* JADX WARNING: type inference failed for: r4v50, types: [g.e.a.b.e.c.c1] */
    /* JADX WARNING: type inference failed for: r4v54, types: [g.e.a.b.e.c.c1] */
    /* JADX WARNING: type inference failed for: r4v59, types: [g.e.a.b.e.c.c1] */
    /* JADX WARNING: type inference failed for: r4v66, types: [g.e.a.b.e.c.f1] */
    /* JADX WARNING: type inference failed for: r4v70, types: [g.e.a.b.e.c.f1] */
    /* JADX WARNING: type inference failed for: r4v74, types: [g.e.a.b.e.c.f1] */
    /* JADX WARNING: type inference failed for: r4v78, types: [g.e.a.b.e.c.c1] */
    /* JADX WARNING: type inference failed for: r4v82, types: [g.e.a.b.e.c.c1] */
    /* JADX WARNING: type inference failed for: r4v86 */
    /* JADX WARNING: type inference failed for: r4v87 */
    /* JADX WARNING: type inference failed for: r4v88 */
    /* JADX WARNING: type inference failed for: r4v89 */
    /* JADX WARNING: type inference failed for: r4v90 */
    /* JADX WARNING: type inference failed for: r4v91 */
    /* JADX WARNING: type inference failed for: r4v92 */
    /* JADX WARNING: type inference failed for: r4v93 */
    /* JADX WARNING: type inference failed for: r4v94 */
    /* JADX WARNING: type inference failed for: r4v95 */
    /* JADX WARNING: type inference failed for: r4v96 */
    /* JADX WARNING: type inference failed for: r4v97 */
    /* JADX WARNING: type inference failed for: r4v98 */
    /* JADX WARNING: type inference failed for: r4v99 */
    /* JADX WARNING: type inference failed for: r4v100 */
    /* JADX WARNING: type inference failed for: r4v101 */
    /* JADX WARNING: type inference failed for: r4v102 */
    /* JADX WARNING: type inference failed for: r4v103 */
    /* JADX WARNING: type inference failed for: r4v104 */
    /* JADX WARNING: type inference failed for: r4v105 */
    /* JADX WARNING: type inference failed for: r4v106 */
    /* JADX WARNING: type inference failed for: r4v107 */
    /* JADX WARNING: type inference failed for: r4v108 */
    /* JADX WARNING: type inference failed for: r4v109 */
    /* JADX WARNING: type inference failed for: r4v110 */
    /* JADX WARNING: type inference failed for: r4v111 */
    /* JADX WARNING: type inference failed for: r4v112 */
    /* JADX WARNING: type inference failed for: r4v113 */
    /* JADX WARNING: type inference failed for: r4v114 */
    /* JADX WARNING: type inference failed for: r4v115 */
    /* JADX WARNING: type inference failed for: r4v116 */
    /* JADX WARNING: type inference failed for: r4v117 */
    /* JADX WARNING: type inference failed for: r4v118 */
    /* JADX WARNING: type inference failed for: r4v119 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean z(int r13, android.os.Parcel r14, android.os.Parcel r15, int r16) throws android.os.RemoteException {
        /*
            r12 = this;
            r8 = r12
            r0 = r14
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IEventHandlerProxy"
            r9 = 1
            r2 = 0
            java.lang.String r3 = "com.google.android.gms.measurement.api.internal.IBundleReceiver"
            r4 = 0
            switch(r13) {
                case 1: goto L_0x043a;
                case 2: goto L_0x040a;
                case 3: goto L_0x03d7;
                case 4: goto L_0x03ae;
                case 5: goto L_0x0380;
                case 6: goto L_0x035f;
                case 7: goto L_0x0352;
                case 8: goto L_0x0341;
                case 9: goto L_0x032c;
                case 10: goto L_0x0307;
                case 11: goto L_0x02f5;
                case 12: goto L_0x02ec;
                case 13: goto L_0x02e3;
                case 14: goto L_0x02da;
                case 15: goto L_0x02c0;
                case 16: goto L_0x02a3;
                case 17: goto L_0x0286;
                case 18: goto L_0x0267;
                case 19: goto L_0x024a;
                case 20: goto L_0x022d;
                case 21: goto L_0x0210;
                case 22: goto L_0x01f3;
                case 23: goto L_0x01e6;
                case 24: goto L_0x01d9;
                case 25: goto L_0x01c8;
                case 26: goto L_0x01b7;
                case 27: goto L_0x019e;
                case 28: goto L_0x018d;
                case 29: goto L_0x017c;
                case 30: goto L_0x016b;
                case 31: goto L_0x0142;
                case 32: goto L_0x0119;
                case 33: goto L_0x00f3;
                case 34: goto L_0x00d6;
                case 35: goto L_0x00b9;
                case 36: goto L_0x009c;
                case 37: goto L_0x0091;
                case 38: goto L_0x0070;
                case 39: goto L_0x0062;
                case 40: goto L_0x0045;
                case 41: goto L_0x000c;
                case 42: goto L_0x0038;
                case 43: goto L_0x002f;
                case 44: goto L_0x001e;
                case 45: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            return r2
        L_0x000d:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = g.e.a.b.e.c.o0.a(r14, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            long r2 = r14.readLong()
            r12.setConsentThirdParty(r1, r2)
            goto L_0x0451
        L_0x001e:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = g.e.a.b.e.c.o0.a(r14, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            long r2 = r14.readLong()
            r12.setConsent(r1, r2)
            goto L_0x0451
        L_0x002f:
            long r0 = r14.readLong()
            r12.clearMeasurementEnabled(r0)
            goto L_0x0451
        L_0x0038:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = g.e.a.b.e.c.o0.a(r14, r1)
            android.os.Bundle r0 = (android.os.Bundle) r0
            r12.setDefaultEventParameters(r0)
            goto L_0x0451
        L_0x0045:
            android.os.IBinder r0 = r14.readStrongBinder()
            if (r0 != 0) goto L_0x004c
            goto L_0x005d
        L_0x004c:
            android.os.IInterface r1 = r0.queryLocalInterface(r3)
            boolean r2 = r1 instanceof g.e.a.b.e.c.c1
            if (r2 == 0) goto L_0x0058
            r4 = r1
            g.e.a.b.e.c.c1 r4 = (g.e.a.b.e.c.c1) r4
            goto L_0x005d
        L_0x0058:
            g.e.a.b.e.c.a1 r4 = new g.e.a.b.e.c.a1
            r4.<init>(r0)
        L_0x005d:
            r12.isDataCollectionEnabled(r4)
            goto L_0x0451
        L_0x0062:
            java.lang.ClassLoader r1 = g.e.a.b.e.c.o0.a
            int r0 = r14.readInt()
            if (r0 == 0) goto L_0x006b
            r2 = 1
        L_0x006b:
            r12.setDataCollectionEnabled(r2)
            goto L_0x0451
        L_0x0070:
            android.os.IBinder r1 = r14.readStrongBinder()
            if (r1 != 0) goto L_0x0077
            goto L_0x0088
        L_0x0077:
            android.os.IInterface r2 = r1.queryLocalInterface(r3)
            boolean r3 = r2 instanceof g.e.a.b.e.c.c1
            if (r3 == 0) goto L_0x0083
            r4 = r2
            g.e.a.b.e.c.c1 r4 = (g.e.a.b.e.c.c1) r4
            goto L_0x0088
        L_0x0083:
            g.e.a.b.e.c.a1 r4 = new g.e.a.b.e.c.a1
            r4.<init>(r1)
        L_0x0088:
            int r0 = r14.readInt()
            r12.getTestFlag(r4, r0)
            goto L_0x0451
        L_0x0091:
            java.lang.ClassLoader r1 = g.e.a.b.e.c.o0.a
            java.util.HashMap r0 = r14.readHashMap(r1)
            r12.initForTests(r0)
            goto L_0x0451
        L_0x009c:
            android.os.IBinder r0 = r14.readStrongBinder()
            if (r0 != 0) goto L_0x00a3
            goto L_0x00b4
        L_0x00a3:
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof g.e.a.b.e.c.f1
            if (r2 == 0) goto L_0x00af
            r4 = r1
            g.e.a.b.e.c.f1 r4 = (g.e.a.b.e.c.f1) r4
            goto L_0x00b4
        L_0x00af:
            g.e.a.b.e.c.d1 r4 = new g.e.a.b.e.c.d1
            r4.<init>(r0)
        L_0x00b4:
            r12.unregisterOnMeasurementEventListener(r4)
            goto L_0x0451
        L_0x00b9:
            android.os.IBinder r0 = r14.readStrongBinder()
            if (r0 != 0) goto L_0x00c0
            goto L_0x00d1
        L_0x00c0:
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof g.e.a.b.e.c.f1
            if (r2 == 0) goto L_0x00cc
            r4 = r1
            g.e.a.b.e.c.f1 r4 = (g.e.a.b.e.c.f1) r4
            goto L_0x00d1
        L_0x00cc:
            g.e.a.b.e.c.d1 r4 = new g.e.a.b.e.c.d1
            r4.<init>(r0)
        L_0x00d1:
            r12.registerOnMeasurementEventListener(r4)
            goto L_0x0451
        L_0x00d6:
            android.os.IBinder r0 = r14.readStrongBinder()
            if (r0 != 0) goto L_0x00dd
            goto L_0x00ee
        L_0x00dd:
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof g.e.a.b.e.c.f1
            if (r2 == 0) goto L_0x00e9
            r4 = r1
            g.e.a.b.e.c.f1 r4 = (g.e.a.b.e.c.f1) r4
            goto L_0x00ee
        L_0x00e9:
            g.e.a.b.e.c.d1 r4 = new g.e.a.b.e.c.d1
            r4.<init>(r0)
        L_0x00ee:
            r12.setEventInterceptor(r4)
            goto L_0x0451
        L_0x00f3:
            int r1 = r14.readInt()
            java.lang.String r2 = r14.readString()
            android.os.IBinder r3 = r14.readStrongBinder()
            g.e.a.b.c.a r3 = g.e.a.b.c.a.C0109a.A(r3)
            android.os.IBinder r4 = r14.readStrongBinder()
            g.e.a.b.c.a r4 = g.e.a.b.c.a.C0109a.A(r4)
            android.os.IBinder r0 = r14.readStrongBinder()
            g.e.a.b.c.a r5 = g.e.a.b.c.a.C0109a.A(r0)
            r0 = r12
            r0.logHealthData(r1, r2, r3, r4, r5)
            goto L_0x0451
        L_0x0119:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = g.e.a.b.e.c.o0.a(r14, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            android.os.IBinder r2 = r14.readStrongBinder()
            if (r2 != 0) goto L_0x0128
            goto L_0x0139
        L_0x0128:
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof g.e.a.b.e.c.c1
            if (r4 == 0) goto L_0x0134
            r4 = r3
            g.e.a.b.e.c.c1 r4 = (g.e.a.b.e.c.c1) r4
            goto L_0x0139
        L_0x0134:
            g.e.a.b.e.c.a1 r4 = new g.e.a.b.e.c.a1
            r4.<init>(r2)
        L_0x0139:
            long r2 = r14.readLong()
            r12.performAction(r1, r4, r2)
            goto L_0x0451
        L_0x0142:
            android.os.IBinder r1 = r14.readStrongBinder()
            g.e.a.b.c.a r1 = g.e.a.b.c.a.C0109a.A(r1)
            android.os.IBinder r2 = r14.readStrongBinder()
            if (r2 != 0) goto L_0x0151
            goto L_0x0162
        L_0x0151:
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof g.e.a.b.e.c.c1
            if (r4 == 0) goto L_0x015d
            r4 = r3
            g.e.a.b.e.c.c1 r4 = (g.e.a.b.e.c.c1) r4
            goto L_0x0162
        L_0x015d:
            g.e.a.b.e.c.a1 r4 = new g.e.a.b.e.c.a1
            r4.<init>(r2)
        L_0x0162:
            long r2 = r14.readLong()
            r12.onActivitySaveInstanceState(r1, r4, r2)
            goto L_0x0451
        L_0x016b:
            android.os.IBinder r1 = r14.readStrongBinder()
            g.e.a.b.c.a r1 = g.e.a.b.c.a.C0109a.A(r1)
            long r2 = r14.readLong()
            r12.onActivityResumed(r1, r2)
            goto L_0x0451
        L_0x017c:
            android.os.IBinder r1 = r14.readStrongBinder()
            g.e.a.b.c.a r1 = g.e.a.b.c.a.C0109a.A(r1)
            long r2 = r14.readLong()
            r12.onActivityPaused(r1, r2)
            goto L_0x0451
        L_0x018d:
            android.os.IBinder r1 = r14.readStrongBinder()
            g.e.a.b.c.a r1 = g.e.a.b.c.a.C0109a.A(r1)
            long r2 = r14.readLong()
            r12.onActivityDestroyed(r1, r2)
            goto L_0x0451
        L_0x019e:
            android.os.IBinder r1 = r14.readStrongBinder()
            g.e.a.b.c.a r1 = g.e.a.b.c.a.C0109a.A(r1)
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = g.e.a.b.e.c.o0.a(r14, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            long r3 = r14.readLong()
            r12.onActivityCreated(r1, r2, r3)
            goto L_0x0451
        L_0x01b7:
            android.os.IBinder r1 = r14.readStrongBinder()
            g.e.a.b.c.a r1 = g.e.a.b.c.a.C0109a.A(r1)
            long r2 = r14.readLong()
            r12.onActivityStopped(r1, r2)
            goto L_0x0451
        L_0x01c8:
            android.os.IBinder r1 = r14.readStrongBinder()
            g.e.a.b.c.a r1 = g.e.a.b.c.a.C0109a.A(r1)
            long r2 = r14.readLong()
            r12.onActivityStarted(r1, r2)
            goto L_0x0451
        L_0x01d9:
            java.lang.String r1 = r14.readString()
            long r2 = r14.readLong()
            r12.endAdUnitExposure(r1, r2)
            goto L_0x0451
        L_0x01e6:
            java.lang.String r1 = r14.readString()
            long r2 = r14.readLong()
            r12.beginAdUnitExposure(r1, r2)
            goto L_0x0451
        L_0x01f3:
            android.os.IBinder r0 = r14.readStrongBinder()
            if (r0 != 0) goto L_0x01fa
            goto L_0x020b
        L_0x01fa:
            android.os.IInterface r1 = r0.queryLocalInterface(r3)
            boolean r2 = r1 instanceof g.e.a.b.e.c.c1
            if (r2 == 0) goto L_0x0206
            r4 = r1
            g.e.a.b.e.c.c1 r4 = (g.e.a.b.e.c.c1) r4
            goto L_0x020b
        L_0x0206:
            g.e.a.b.e.c.a1 r4 = new g.e.a.b.e.c.a1
            r4.<init>(r0)
        L_0x020b:
            r12.generateEventId(r4)
            goto L_0x0451
        L_0x0210:
            android.os.IBinder r0 = r14.readStrongBinder()
            if (r0 != 0) goto L_0x0217
            goto L_0x0228
        L_0x0217:
            android.os.IInterface r1 = r0.queryLocalInterface(r3)
            boolean r2 = r1 instanceof g.e.a.b.e.c.c1
            if (r2 == 0) goto L_0x0223
            r4 = r1
            g.e.a.b.e.c.c1 r4 = (g.e.a.b.e.c.c1) r4
            goto L_0x0228
        L_0x0223:
            g.e.a.b.e.c.a1 r4 = new g.e.a.b.e.c.a1
            r4.<init>(r0)
        L_0x0228:
            r12.getGmpAppId(r4)
            goto L_0x0451
        L_0x022d:
            android.os.IBinder r0 = r14.readStrongBinder()
            if (r0 != 0) goto L_0x0234
            goto L_0x0245
        L_0x0234:
            android.os.IInterface r1 = r0.queryLocalInterface(r3)
            boolean r2 = r1 instanceof g.e.a.b.e.c.c1
            if (r2 == 0) goto L_0x0240
            r4 = r1
            g.e.a.b.e.c.c1 r4 = (g.e.a.b.e.c.c1) r4
            goto L_0x0245
        L_0x0240:
            g.e.a.b.e.c.a1 r4 = new g.e.a.b.e.c.a1
            r4.<init>(r0)
        L_0x0245:
            r12.getAppInstanceId(r4)
            goto L_0x0451
        L_0x024a:
            android.os.IBinder r0 = r14.readStrongBinder()
            if (r0 != 0) goto L_0x0251
            goto L_0x0262
        L_0x0251:
            android.os.IInterface r1 = r0.queryLocalInterface(r3)
            boolean r2 = r1 instanceof g.e.a.b.e.c.c1
            if (r2 == 0) goto L_0x025d
            r4 = r1
            g.e.a.b.e.c.c1 r4 = (g.e.a.b.e.c.c1) r4
            goto L_0x0262
        L_0x025d:
            g.e.a.b.e.c.a1 r4 = new g.e.a.b.e.c.a1
            r4.<init>(r0)
        L_0x0262:
            r12.getCachedAppInstanceId(r4)
            goto L_0x0451
        L_0x0267:
            android.os.IBinder r0 = r14.readStrongBinder()
            if (r0 != 0) goto L_0x026e
            goto L_0x0281
        L_0x026e:
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IStringProvider"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof g.e.a.b.e.c.h1
            if (r2 == 0) goto L_0x027c
            r4 = r1
            g.e.a.b.e.c.h1 r4 = (g.e.a.b.e.c.h1) r4
            goto L_0x0281
        L_0x027c:
            g.e.a.b.e.c.g1 r4 = new g.e.a.b.e.c.g1
            r4.<init>(r0)
        L_0x0281:
            r12.setInstanceIdProvider(r4)
            goto L_0x0451
        L_0x0286:
            android.os.IBinder r0 = r14.readStrongBinder()
            if (r0 != 0) goto L_0x028d
            goto L_0x029e
        L_0x028d:
            android.os.IInterface r1 = r0.queryLocalInterface(r3)
            boolean r2 = r1 instanceof g.e.a.b.e.c.c1
            if (r2 == 0) goto L_0x0299
            r4 = r1
            g.e.a.b.e.c.c1 r4 = (g.e.a.b.e.c.c1) r4
            goto L_0x029e
        L_0x0299:
            g.e.a.b.e.c.a1 r4 = new g.e.a.b.e.c.a1
            r4.<init>(r0)
        L_0x029e:
            r12.getCurrentScreenClass(r4)
            goto L_0x0451
        L_0x02a3:
            android.os.IBinder r0 = r14.readStrongBinder()
            if (r0 != 0) goto L_0x02aa
            goto L_0x02bb
        L_0x02aa:
            android.os.IInterface r1 = r0.queryLocalInterface(r3)
            boolean r2 = r1 instanceof g.e.a.b.e.c.c1
            if (r2 == 0) goto L_0x02b6
            r4 = r1
            g.e.a.b.e.c.c1 r4 = (g.e.a.b.e.c.c1) r4
            goto L_0x02bb
        L_0x02b6:
            g.e.a.b.e.c.a1 r4 = new g.e.a.b.e.c.a1
            r4.<init>(r0)
        L_0x02bb:
            r12.getCurrentScreenName(r4)
            goto L_0x0451
        L_0x02c0:
            android.os.IBinder r1 = r14.readStrongBinder()
            g.e.a.b.c.a r1 = g.e.a.b.c.a.C0109a.A(r1)
            java.lang.String r2 = r14.readString()
            java.lang.String r3 = r14.readString()
            long r4 = r14.readLong()
            r0 = r12
            r0.setCurrentScreen(r1, r2, r3, r4)
            goto L_0x0451
        L_0x02da:
            long r0 = r14.readLong()
            r12.setSessionTimeoutDuration(r0)
            goto L_0x0451
        L_0x02e3:
            long r0 = r14.readLong()
            r12.setMinimumSessionDuration(r0)
            goto L_0x0451
        L_0x02ec:
            long r0 = r14.readLong()
            r12.resetAnalyticsData(r0)
            goto L_0x0451
        L_0x02f5:
            java.lang.ClassLoader r1 = g.e.a.b.e.c.o0.a
            int r1 = r14.readInt()
            if (r1 == 0) goto L_0x02fe
            r2 = 1
        L_0x02fe:
            long r0 = r14.readLong()
            r12.setMeasurementEnabled(r2, r0)
            goto L_0x0451
        L_0x0307:
            java.lang.String r1 = r14.readString()
            java.lang.String r2 = r14.readString()
            android.os.IBinder r0 = r14.readStrongBinder()
            if (r0 != 0) goto L_0x0316
            goto L_0x0327
        L_0x0316:
            android.os.IInterface r3 = r0.queryLocalInterface(r3)
            boolean r4 = r3 instanceof g.e.a.b.e.c.c1
            if (r4 == 0) goto L_0x0322
            r4 = r3
            g.e.a.b.e.c.c1 r4 = (g.e.a.b.e.c.c1) r4
            goto L_0x0327
        L_0x0322:
            g.e.a.b.e.c.a1 r4 = new g.e.a.b.e.c.a1
            r4.<init>(r0)
        L_0x0327:
            r12.getConditionalUserProperties(r1, r2, r4)
            goto L_0x0451
        L_0x032c:
            java.lang.String r1 = r14.readString()
            java.lang.String r2 = r14.readString()
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = g.e.a.b.e.c.o0.a(r14, r3)
            android.os.Bundle r0 = (android.os.Bundle) r0
            r12.clearConditionalUserProperty(r1, r2, r0)
            goto L_0x0451
        L_0x0341:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = g.e.a.b.e.c.o0.a(r14, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            long r2 = r14.readLong()
            r12.setConditionalUserProperty(r1, r2)
            goto L_0x0451
        L_0x0352:
            java.lang.String r1 = r14.readString()
            long r2 = r14.readLong()
            r12.setUserId(r1, r2)
            goto L_0x0451
        L_0x035f:
            java.lang.String r1 = r14.readString()
            android.os.IBinder r0 = r14.readStrongBinder()
            if (r0 != 0) goto L_0x036a
            goto L_0x037b
        L_0x036a:
            android.os.IInterface r2 = r0.queryLocalInterface(r3)
            boolean r3 = r2 instanceof g.e.a.b.e.c.c1
            if (r3 == 0) goto L_0x0376
            r4 = r2
            g.e.a.b.e.c.c1 r4 = (g.e.a.b.e.c.c1) r4
            goto L_0x037b
        L_0x0376:
            g.e.a.b.e.c.a1 r4 = new g.e.a.b.e.c.a1
            r4.<init>(r0)
        L_0x037b:
            r12.getMaxUserProperties(r1, r4)
            goto L_0x0451
        L_0x0380:
            java.lang.String r1 = r14.readString()
            java.lang.String r5 = r14.readString()
            java.lang.ClassLoader r6 = g.e.a.b.e.c.o0.a
            int r6 = r14.readInt()
            if (r6 == 0) goto L_0x0391
            r2 = 1
        L_0x0391:
            android.os.IBinder r0 = r14.readStrongBinder()
            if (r0 != 0) goto L_0x0398
            goto L_0x03a9
        L_0x0398:
            android.os.IInterface r3 = r0.queryLocalInterface(r3)
            boolean r4 = r3 instanceof g.e.a.b.e.c.c1
            if (r4 == 0) goto L_0x03a4
            r4 = r3
            g.e.a.b.e.c.c1 r4 = (g.e.a.b.e.c.c1) r4
            goto L_0x03a9
        L_0x03a4:
            g.e.a.b.e.c.a1 r4 = new g.e.a.b.e.c.a1
            r4.<init>(r0)
        L_0x03a9:
            r12.getUserProperties(r1, r5, r2, r4)
            goto L_0x0451
        L_0x03ae:
            java.lang.String r1 = r14.readString()
            java.lang.String r3 = r14.readString()
            android.os.IBinder r4 = r14.readStrongBinder()
            g.e.a.b.c.a r4 = g.e.a.b.c.a.C0109a.A(r4)
            java.lang.ClassLoader r5 = g.e.a.b.e.c.o0.a
            int r5 = r14.readInt()
            if (r5 == 0) goto L_0x03c8
            r5 = 1
            goto L_0x03c9
        L_0x03c8:
            r5 = 0
        L_0x03c9:
            long r6 = r14.readLong()
            r0 = r12
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r0.setUserProperty(r1, r2, r3, r4, r5)
            goto L_0x0451
        L_0x03d7:
            java.lang.String r1 = r14.readString()
            java.lang.String r2 = r14.readString()
            android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
            android.os.Parcelable r5 = g.e.a.b.e.c.o0.a(r14, r5)
            android.os.Bundle r5 = (android.os.Bundle) r5
            android.os.IBinder r6 = r14.readStrongBinder()
            if (r6 != 0) goto L_0x03ee
            goto L_0x03ff
        L_0x03ee:
            android.os.IInterface r3 = r6.queryLocalInterface(r3)
            boolean r4 = r3 instanceof g.e.a.b.e.c.c1
            if (r4 == 0) goto L_0x03f9
            g.e.a.b.e.c.c1 r3 = (g.e.a.b.e.c.c1) r3
            goto L_0x03fe
        L_0x03f9:
            g.e.a.b.e.c.a1 r3 = new g.e.a.b.e.c.a1
            r3.<init>(r6)
        L_0x03fe:
            r4 = r3
        L_0x03ff:
            long r6 = r14.readLong()
            r0 = r12
            r3 = r5
            r5 = r6
            r0.logEventAndBundle(r1, r2, r3, r4, r5)
            goto L_0x0451
        L_0x040a:
            java.lang.String r1 = r14.readString()
            java.lang.String r3 = r14.readString()
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            android.os.Parcelable r4 = g.e.a.b.e.c.o0.a(r14, r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            int r5 = r14.readInt()
            if (r5 == 0) goto L_0x0422
            r5 = 1
            goto L_0x0423
        L_0x0422:
            r5 = 0
        L_0x0423:
            int r6 = r14.readInt()
            if (r6 == 0) goto L_0x042b
            r6 = 1
            goto L_0x042c
        L_0x042b:
            r6 = 0
        L_0x042c:
            long r10 = r14.readLong()
            r0 = r12
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r10
            r0.logEvent(r1, r2, r3, r4, r5, r6)
            goto L_0x0451
        L_0x043a:
            android.os.IBinder r1 = r14.readStrongBinder()
            g.e.a.b.c.a r1 = g.e.a.b.c.a.C0109a.A(r1)
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzcl> r2 = com.google.android.gms.internal.measurement.zzcl.CREATOR
            android.os.Parcelable r2 = g.e.a.b.e.c.o0.a(r14, r2)
            com.google.android.gms.internal.measurement.zzcl r2 = (com.google.android.gms.internal.measurement.zzcl) r2
            long r3 = r14.readLong()
            r12.initialize(r1, r2, r3)
        L_0x0451:
            r15.writeNoException()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.e.c.y0.z(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
