package com.tencent.qmsp.sdk.g.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface a extends IInterface {

    /* renamed from: com.tencent.qmsp.sdk.g.a.a$a  reason: collision with other inner class name */
    public static abstract class C0017a extends Binder implements a {

        /* renamed from: com.tencent.qmsp.sdk.g.a.a$a$a  reason: collision with other inner class name */
        public static class C0018a implements a {
            public IBinder a;

            public C0018a(IBinder iBinder) {
                this.a = iBinder;
            }

            public IBinder asBinder() {
                return this.a;
            }

            public String c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } catch (Throwable unused) {
                    obtain2.recycle();
                    obtain.recycle();
                    return "";
                }
            }

            /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
                if (r1.readInt() == 0) goto L_0x0027;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean g() {
                /*
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.asus.msa.SupplementaryDID.IDidAidlInterface"
                    r3 = 0
                    r4 = 1
                    r0.writeInterfaceToken(r2)     // Catch:{ Exception -> 0x0026, all -> 0x001e }
                    android.os.IBinder r2 = r5.a     // Catch:{ Exception -> 0x0026, all -> 0x001e }
                    r2.transact(r4, r0, r1, r3)     // Catch:{ Exception -> 0x0026, all -> 0x001e }
                    r1.readException()     // Catch:{ Exception -> 0x0026, all -> 0x001e }
                    int r2 = r1.readInt()     // Catch:{ Exception -> 0x0026, all -> 0x001e }
                    if (r2 != 0) goto L_0x0026
                    goto L_0x0027
                L_0x001e:
                    r2 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r2
                L_0x0026:
                    r3 = 1
                L_0x0027:
                    r1.recycle()
                    r0.recycle()
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.qmsp.sdk.g.a.a.C0017a.C0018a.g():boolean");
            }

            public String h() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                    this.a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } catch (Throwable unused) {
                    obtain2.recycle();
                    obtain.recycle();
                    return "";
                }
            }
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.asus.msa.SupplementaryDID.IDidAidlInterface");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0018a(iBinder) : (a) queryLocalInterface;
        }
    }

    String c();

    boolean g();

    String h();
}
