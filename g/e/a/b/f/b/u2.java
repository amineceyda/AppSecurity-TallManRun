package g.e.a.b.f.b;

import g.e.a.b.e.c.n0;

public abstract class u2 extends n0 implements v2 {
    public u2() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00c5, code lost:
        r10.writeNoException();
        r10.writeTypedList(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x026d, code lost:
        r10.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0270, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean z(int r8, android.os.Parcel r9, android.os.Parcel r10, int r11) throws android.os.RemoteException {
        /*
            r7 = this;
            r11 = 0
            r0 = 1
            java.lang.String r1 = "null reference"
            switch(r8) {
                case 1: goto L_0x024c;
                case 2: goto L_0x022a;
                case 3: goto L_0x0007;
                case 4: goto L_0x0213;
                case 5: goto L_0x01ef;
                case 6: goto L_0x01d7;
                case 7: goto L_0x015b;
                case 8: goto L_0x0007;
                case 9: goto L_0x0140;
                case 10: goto L_0x0128;
                case 11: goto L_0x0111;
                case 12: goto L_0x00f9;
                case 13: goto L_0x00cd;
                case 14: goto L_0x00a5;
                case 15: goto L_0x0088;
                case 16: goto L_0x0070;
                case 17: goto L_0x005c;
                case 18: goto L_0x003d;
                case 19: goto L_0x0018;
                case 20: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            return r11
        L_0x0008:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzp> r8 = com.google.android.gms.measurement.internal.zzp.CREATOR
            android.os.Parcelable r8 = g.e.a.b.e.c.o0.a(r9, r8)
            com.google.android.gms.measurement.internal.zzp r8 = (com.google.android.gms.measurement.internal.zzp) r8
            r9 = r7
            g.e.a.b.f.b.g5 r9 = (g.e.a.b.f.b.g5) r9
            r9.b(r8)
            goto L_0x026d
        L_0x0018:
            android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
            android.os.Parcelable r8 = g.e.a.b.e.c.o0.a(r9, r8)
            android.os.Bundle r8 = (android.os.Bundle) r8
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzp> r11 = com.google.android.gms.measurement.internal.zzp.CREATOR
            android.os.Parcelable r9 = g.e.a.b.e.c.o0.a(r9, r11)
            com.google.android.gms.measurement.internal.zzp r9 = (com.google.android.gms.measurement.internal.zzp) r9
            r11 = r7
            g.e.a.b.f.b.g5 r11 = (g.e.a.b.f.b.g5) r11
            r11.B(r9)
            java.lang.String r9 = r9.zza
            java.util.Objects.requireNonNull(r9, r1)
            g.e.a.b.f.b.o4 r1 = new g.e.a.b.f.b.o4
            r1.<init>(r11, r9, r8)
            r11.A(r1)
            goto L_0x026d
        L_0x003d:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzp> r8 = com.google.android.gms.measurement.internal.zzp.CREATOR
            android.os.Parcelable r8 = g.e.a.b.e.c.o0.a(r9, r8)
            com.google.android.gms.measurement.internal.zzp r8 = (com.google.android.gms.measurement.internal.zzp) r8
            r9 = r7
            g.e.a.b.f.b.g5 r9 = (g.e.a.b.f.b.g5) r9
            java.lang.String r1 = r8.zza
            g.c.b.b.f.k(r1)
            java.lang.String r1 = r8.zza
            r9.C(r1, r11)
            g.e.a.b.f.b.v4 r11 = new g.e.a.b.f.b.v4
            r11.<init>(r9, r8)
            r9.A(r11)
            goto L_0x026d
        L_0x005c:
            java.lang.String r8 = r9.readString()
            java.lang.String r11 = r9.readString()
            java.lang.String r9 = r9.readString()
            r1 = r7
            g.e.a.b.f.b.g5 r1 = (g.e.a.b.f.b.g5) r1
            java.util.List r8 = r1.r(r8, r11, r9)
            goto L_0x00c5
        L_0x0070:
            java.lang.String r8 = r9.readString()
            java.lang.String r11 = r9.readString()
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzp> r1 = com.google.android.gms.measurement.internal.zzp.CREATOR
            android.os.Parcelable r9 = g.e.a.b.e.c.o0.a(r9, r1)
            com.google.android.gms.measurement.internal.zzp r9 = (com.google.android.gms.measurement.internal.zzp) r9
            r1 = r7
            g.e.a.b.f.b.g5 r1 = (g.e.a.b.f.b.g5) r1
            java.util.List r8 = r1.u(r8, r11, r9)
            goto L_0x00c5
        L_0x0088:
            java.lang.String r8 = r9.readString()
            java.lang.String r1 = r9.readString()
            java.lang.String r2 = r9.readString()
            java.lang.ClassLoader r3 = g.e.a.b.e.c.o0.a
            int r9 = r9.readInt()
            if (r9 == 0) goto L_0x009d
            r11 = 1
        L_0x009d:
            r9 = r7
            g.e.a.b.f.b.g5 r9 = (g.e.a.b.f.b.g5) r9
            java.util.List r8 = r9.h(r8, r1, r2, r11)
            goto L_0x00c5
        L_0x00a5:
            java.lang.String r8 = r9.readString()
            java.lang.String r1 = r9.readString()
            java.lang.ClassLoader r2 = g.e.a.b.e.c.o0.a
            int r2 = r9.readInt()
            if (r2 == 0) goto L_0x00b6
            r11 = 1
        L_0x00b6:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzp> r2 = com.google.android.gms.measurement.internal.zzp.CREATOR
            android.os.Parcelable r9 = g.e.a.b.e.c.o0.a(r9, r2)
            com.google.android.gms.measurement.internal.zzp r9 = (com.google.android.gms.measurement.internal.zzp) r9
            r2 = r7
            g.e.a.b.f.b.g5 r2 = (g.e.a.b.f.b.g5) r2
            java.util.List r8 = r2.f(r8, r1, r11, r9)
        L_0x00c5:
            r10.writeNoException()
            r10.writeTypedList(r8)
            goto L_0x0270
        L_0x00cd:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzab> r8 = com.google.android.gms.measurement.internal.zzab.CREATOR
            android.os.Parcelable r8 = g.e.a.b.e.c.o0.a(r9, r8)
            com.google.android.gms.measurement.internal.zzab r8 = (com.google.android.gms.measurement.internal.zzab) r8
            r9 = r7
            g.e.a.b.f.b.g5 r9 = (g.e.a.b.f.b.g5) r9
            java.util.Objects.requireNonNull(r8, r1)
            com.google.android.gms.measurement.internal.zzks r11 = r8.zzc
            java.util.Objects.requireNonNull(r11, r1)
            java.lang.String r11 = r8.zza
            g.c.b.b.f.k(r11)
            java.lang.String r11 = r8.zza
            r9.C(r11, r0)
            com.google.android.gms.measurement.internal.zzab r11 = new com.google.android.gms.measurement.internal.zzab
            r11.<init>(r8)
            g.e.a.b.f.b.q4 r8 = new g.e.a.b.f.b.q4
            r8.<init>(r9, r11)
            r9.A(r8)
            goto L_0x026d
        L_0x00f9:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzab> r8 = com.google.android.gms.measurement.internal.zzab.CREATOR
            android.os.Parcelable r8 = g.e.a.b.e.c.o0.a(r9, r8)
            com.google.android.gms.measurement.internal.zzab r8 = (com.google.android.gms.measurement.internal.zzab) r8
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzp> r11 = com.google.android.gms.measurement.internal.zzp.CREATOR
            android.os.Parcelable r9 = g.e.a.b.e.c.o0.a(r9, r11)
            com.google.android.gms.measurement.internal.zzp r9 = (com.google.android.gms.measurement.internal.zzp) r9
            r11 = r7
            g.e.a.b.f.b.g5 r11 = (g.e.a.b.f.b.g5) r11
            r11.g(r8, r9)
            goto L_0x026d
        L_0x0111:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzp> r8 = com.google.android.gms.measurement.internal.zzp.CREATOR
            android.os.Parcelable r8 = g.e.a.b.e.c.o0.a(r9, r8)
            com.google.android.gms.measurement.internal.zzp r8 = (com.google.android.gms.measurement.internal.zzp) r8
            r9 = r7
            g.e.a.b.f.b.g5 r9 = (g.e.a.b.f.b.g5) r9
            java.lang.String r8 = r9.o(r8)
            r10.writeNoException()
            r10.writeString(r8)
            goto L_0x0270
        L_0x0128:
            long r2 = r9.readLong()
            java.lang.String r4 = r9.readString()
            java.lang.String r5 = r9.readString()
            java.lang.String r6 = r9.readString()
            r1 = r7
            g.e.a.b.f.b.g5 r1 = (g.e.a.b.f.b.g5) r1
            r1.c(r2, r4, r5, r6)
            goto L_0x026d
        L_0x0140:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzau> r8 = com.google.android.gms.measurement.internal.zzau.CREATOR
            android.os.Parcelable r8 = g.e.a.b.e.c.o0.a(r9, r8)
            com.google.android.gms.measurement.internal.zzau r8 = (com.google.android.gms.measurement.internal.zzau) r8
            java.lang.String r9 = r9.readString()
            r11 = r7
            g.e.a.b.f.b.g5 r11 = (g.e.a.b.f.b.g5) r11
            byte[] r8 = r11.x(r8, r9)
            r10.writeNoException()
            r10.writeByteArray(r8)
            goto L_0x0270
        L_0x015b:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzp> r8 = com.google.android.gms.measurement.internal.zzp.CREATOR
            android.os.Parcelable r8 = g.e.a.b.e.c.o0.a(r9, r8)
            com.google.android.gms.measurement.internal.zzp r8 = (com.google.android.gms.measurement.internal.zzp) r8
            int r9 = r9.readInt()
            if (r9 == 0) goto L_0x016a
            r11 = 1
        L_0x016a:
            r9 = r7
            g.e.a.b.f.b.g5 r9 = (g.e.a.b.f.b.g5) r9
            r9.B(r8)
            java.lang.String r2 = r8.zza
            java.util.Objects.requireNonNull(r2, r1)
            g.e.a.b.f.b.k9 r1 = r9.a
            g.e.a.b.f.b.k4 r1 = r1.b()
            g.e.a.b.f.b.d5 r3 = new g.e.a.b.f.b.d5
            r3.<init>(r9, r2)
            java.util.concurrent.Future r1 = r1.p(r3)
            java.util.concurrent.FutureTask r1 = (java.util.concurrent.FutureTask) r1     // Catch:{ InterruptedException -> 0x01ba, ExecutionException -> 0x01b8 }
            java.lang.Object r1 = r1.get()     // Catch:{ InterruptedException -> 0x01ba, ExecutionException -> 0x01b8 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ InterruptedException -> 0x01ba, ExecutionException -> 0x01b8 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ InterruptedException -> 0x01ba, ExecutionException -> 0x01b8 }
            int r3 = r1.size()     // Catch:{ InterruptedException -> 0x01ba, ExecutionException -> 0x01b8 }
            r2.<init>(r3)     // Catch:{ InterruptedException -> 0x01ba, ExecutionException -> 0x01b8 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ InterruptedException -> 0x01ba, ExecutionException -> 0x01b8 }
        L_0x0199:
            boolean r3 = r1.hasNext()     // Catch:{ InterruptedException -> 0x01ba, ExecutionException -> 0x01b8 }
            if (r3 == 0) goto L_0x01cf
            java.lang.Object r3 = r1.next()     // Catch:{ InterruptedException -> 0x01ba, ExecutionException -> 0x01b8 }
            g.e.a.b.f.b.o9 r3 = (g.e.a.b.f.b.o9) r3     // Catch:{ InterruptedException -> 0x01ba, ExecutionException -> 0x01b8 }
            if (r11 != 0) goto L_0x01af
            java.lang.String r4 = r3.c     // Catch:{ InterruptedException -> 0x01ba, ExecutionException -> 0x01b8 }
            boolean r4 = g.e.a.b.f.b.q9.U(r4)     // Catch:{ InterruptedException -> 0x01ba, ExecutionException -> 0x01b8 }
            if (r4 != 0) goto L_0x0199
        L_0x01af:
            com.google.android.gms.measurement.internal.zzks r4 = new com.google.android.gms.measurement.internal.zzks     // Catch:{ InterruptedException -> 0x01ba, ExecutionException -> 0x01b8 }
            r4.<init>(r3)     // Catch:{ InterruptedException -> 0x01ba, ExecutionException -> 0x01b8 }
            r2.add(r4)     // Catch:{ InterruptedException -> 0x01ba, ExecutionException -> 0x01b8 }
            goto L_0x0199
        L_0x01b8:
            r11 = move-exception
            goto L_0x01bb
        L_0x01ba:
            r11 = move-exception
        L_0x01bb:
            g.e.a.b.f.b.k9 r9 = r9.a
            g.e.a.b.f.b.f3 r9 = r9.d()
            g.e.a.b.f.b.d3 r9 = r9.f3136f
            java.lang.String r8 = r8.zza
            java.lang.Object r8 = g.e.a.b.f.b.f3.t(r8)
            java.lang.String r1 = "Failed to get user properties. appId"
            r9.c(r1, r8, r11)
            r2 = 0
        L_0x01cf:
            r10.writeNoException()
            r10.writeTypedList(r2)
            goto L_0x0270
        L_0x01d7:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzp> r8 = com.google.android.gms.measurement.internal.zzp.CREATOR
            android.os.Parcelable r8 = g.e.a.b.e.c.o0.a(r9, r8)
            com.google.android.gms.measurement.internal.zzp r8 = (com.google.android.gms.measurement.internal.zzp) r8
            r9 = r7
            g.e.a.b.f.b.g5 r9 = (g.e.a.b.f.b.g5) r9
            r9.B(r8)
            g.e.a.b.f.b.x4 r11 = new g.e.a.b.f.b.x4
            r11.<init>(r9, r8)
            r9.A(r11)
            goto L_0x026d
        L_0x01ef:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzau> r8 = com.google.android.gms.measurement.internal.zzau.CREATOR
            android.os.Parcelable r8 = g.e.a.b.e.c.o0.a(r9, r8)
            com.google.android.gms.measurement.internal.zzau r8 = (com.google.android.gms.measurement.internal.zzau) r8
            java.lang.String r11 = r9.readString()
            r9.readString()
            r9 = r7
            g.e.a.b.f.b.g5 r9 = (g.e.a.b.f.b.g5) r9
            java.util.Objects.requireNonNull(r8, r1)
            g.c.b.b.f.k(r11)
            r9.C(r11, r0)
            g.e.a.b.f.b.a5 r1 = new g.e.a.b.f.b.a5
            r1.<init>(r9, r8, r11)
            r9.A(r1)
            goto L_0x026d
        L_0x0213:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzp> r8 = com.google.android.gms.measurement.internal.zzp.CREATOR
            android.os.Parcelable r8 = g.e.a.b.e.c.o0.a(r9, r8)
            com.google.android.gms.measurement.internal.zzp r8 = (com.google.android.gms.measurement.internal.zzp) r8
            r9 = r7
            g.e.a.b.f.b.g5 r9 = (g.e.a.b.f.b.g5) r9
            r9.B(r8)
            g.e.a.b.f.b.e5 r11 = new g.e.a.b.f.b.e5
            r11.<init>(r9, r8)
            r9.A(r11)
            goto L_0x026d
        L_0x022a:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzks> r8 = com.google.android.gms.measurement.internal.zzks.CREATOR
            android.os.Parcelable r8 = g.e.a.b.e.c.o0.a(r9, r8)
            com.google.android.gms.measurement.internal.zzks r8 = (com.google.android.gms.measurement.internal.zzks) r8
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzp> r11 = com.google.android.gms.measurement.internal.zzp.CREATOR
            android.os.Parcelable r9 = g.e.a.b.e.c.o0.a(r9, r11)
            com.google.android.gms.measurement.internal.zzp r9 = (com.google.android.gms.measurement.internal.zzp) r9
            r11 = r7
            g.e.a.b.f.b.g5 r11 = (g.e.a.b.f.b.g5) r11
            java.util.Objects.requireNonNull(r8, r1)
            r11.B(r9)
            g.e.a.b.f.b.c5 r1 = new g.e.a.b.f.b.c5
            r1.<init>(r11, r8, r9)
            r11.A(r1)
            goto L_0x026d
        L_0x024c:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzau> r8 = com.google.android.gms.measurement.internal.zzau.CREATOR
            android.os.Parcelable r8 = g.e.a.b.e.c.o0.a(r9, r8)
            com.google.android.gms.measurement.internal.zzau r8 = (com.google.android.gms.measurement.internal.zzau) r8
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzp> r11 = com.google.android.gms.measurement.internal.zzp.CREATOR
            android.os.Parcelable r9 = g.e.a.b.e.c.o0.a(r9, r11)
            com.google.android.gms.measurement.internal.zzp r9 = (com.google.android.gms.measurement.internal.zzp) r9
            r11 = r7
            g.e.a.b.f.b.g5 r11 = (g.e.a.b.f.b.g5) r11
            java.util.Objects.requireNonNull(r8, r1)
            r11.B(r9)
            g.e.a.b.f.b.z4 r1 = new g.e.a.b.f.b.z4
            r1.<init>(r11, r8, r9)
            r11.A(r1)
        L_0x026d:
            r10.writeNoException()
        L_0x0270:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.u2.z(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
