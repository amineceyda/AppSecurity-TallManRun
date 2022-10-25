package com.tencent.qmsp.sdk.g.d;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface a extends IInterface {

    /* renamed from: com.tencent.qmsp.sdk.g.d.a$a  reason: collision with other inner class name */
    public static abstract class C0023a extends Binder implements a {

        /* renamed from: com.tencent.qmsp.sdk.g.d.a$a$a  reason: collision with other inner class name */
        public static class C0024a implements a {
            private IBinder a;

            public C0024a(IBinder iBinder) {
                this.a = iBinder;
            }

            /* JADX INFO: finally extract failed */
            public String a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                    obtain2.recycle();
                    obtain.recycle();
                    return "";
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public IBinder asBinder() {
                return this.a;
            }

            /* JADX INFO: finally extract failed */
            public String b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                    this.a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                    obtain2.recycle();
                    obtain.recycle();
                    return "";
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public boolean c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                boolean z = false;
                try {
                    obtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
                obtain2.recycle();
                obtain.recycle();
                return z;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
                if (r1.readInt() != 0) goto L_0x0025;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean d() {
                /*
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "com.bun.lib.MsaIdInterface"
                    r3 = 1
                    r4 = 0
                    r0.writeInterfaceToken(r2)     // Catch:{ RemoteException -> 0x0020 }
                    android.os.IBinder r2 = r5.a     // Catch:{ RemoteException -> 0x0020 }
                    r2.transact(r3, r0, r1, r4)     // Catch:{ RemoteException -> 0x0020 }
                    r1.readException()     // Catch:{ RemoteException -> 0x0020 }
                    int r2 = r1.readInt()     // Catch:{ RemoteException -> 0x0020 }
                    if (r2 == 0) goto L_0x0024
                    goto L_0x0025
                L_0x001e:
                    r2 = move-exception
                    goto L_0x002c
                L_0x0020:
                    r2 = move-exception
                    r2.printStackTrace()     // Catch:{ all -> 0x001e }
                L_0x0024:
                    r3 = 0
                L_0x0025:
                    r1.recycle()
                    r0.recycle()
                    return r3
                L_0x002c:
                    r1.recycle()
                    r0.recycle()
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.qmsp.sdk.g.d.a.C0023a.C0024a.d():boolean");
            }

            public void e() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                    this.a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bun.lib.MsaIdInterface");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0024a(iBinder) : (a) queryLocalInterface;
        }
    }

    String a();

    String b();

    boolean c();

    boolean d();

    void e();
}
