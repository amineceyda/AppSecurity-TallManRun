package g.e.a.b.a.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.tencent.raft.raftframework.sla.SLAConstant;
import g.c.b.b.f;
import g.e.a.b.b.b;
import g.e.a.b.e.a.c;
import g.e.a.b.e.a.d;
import g.e.a.b.e.a.e;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
public class a {
    @GuardedBy("this")
    public g.e.a.b.b.a a;
    @GuardedBy("this")
    public e b;
    @GuardedBy("this")
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f2836d = new Object();
    @GuardedBy("mAutoDisconnectTaskLock")

    /* renamed from: e  reason: collision with root package name */
    public c f2837e;
    @GuardedBy("this")

    /* renamed from: f  reason: collision with root package name */
    public final Context f2838f;

    /* renamed from: g  reason: collision with root package name */
    public final long f2839g;

    /* renamed from: g.e.a.b.a.a.a$a  reason: collision with other inner class name */
    public static final class C0106a {
        public final String a;
        public final boolean b;

        @Deprecated
        public C0106a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public String toString() {
            String str = this.a;
            boolean z = this.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    public a(Context context, long j2, boolean z, boolean z2) {
        Context applicationContext;
        Objects.requireNonNull(context, "null reference");
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f2838f = context;
        this.c = false;
        this.f2839g = j2;
    }

    public static C0106a a(Context context) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        a aVar = new a(context, -1, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.c(false);
            C0106a e2 = aVar.e(-1);
            aVar.d(e2, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, (Throwable) null);
            aVar.b();
            return e2;
        } catch (Throwable th) {
            aVar.b();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            g.c.b.b.f.m(r0)
            monitor-enter(r3)
            android.content.Context r0 = r3.f2838f     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0031
            g.e.a.b.b.a r0 = r3.a     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x000f
            goto L_0x0031
        L_0x000f:
            boolean r0 = r3.c     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0027
            g.e.a.b.b.g.a r0 = g.e.a.b.b.g.a.b()     // Catch:{ all -> 0x001f }
            android.content.Context r1 = r3.f2838f     // Catch:{ all -> 0x001f }
            g.e.a.b.b.a r2 = r3.a     // Catch:{ all -> 0x001f }
            r0.c(r1, r2)     // Catch:{ all -> 0x001f }
            goto L_0x0027
        L_0x001f:
            r0 = move-exception
            java.lang.String r1 = "AdvertisingIdClient"
            java.lang.String r2 = "AdvertisingIdClient unbindService failed."
            android.util.Log.i(r1, r2, r0)     // Catch:{ all -> 0x0033 }
        L_0x0027:
            r0 = 0
            r3.c = r0     // Catch:{ all -> 0x0033 }
            r0 = 0
            r3.b = r0     // Catch:{ all -> 0x0033 }
            r3.a = r0     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0031:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.a.a.a.b():void");
    }

    public final void c(boolean z) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        f.m("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.c) {
                    b();
                }
                Context context = this.f2838f;
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int a2 = b.b.a(context, 12451000);
                if (a2 != 0) {
                    if (a2 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                }
                g.e.a.b.b.a aVar = new g.e.a.b.b.a();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (g.e.a.b.b.g.a.b().a(context, intent, aVar, 1)) {
                    this.a = aVar;
                    IBinder a3 = aVar.a(10000, TimeUnit.MILLISECONDS);
                    int i2 = d.a;
                    IInterface queryLocalInterface = a3.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    this.b = queryLocalInterface instanceof e ? (e) queryLocalInterface : new c(a3);
                    this.c = true;
                    if (z) {
                        f();
                    }
                } else {
                    throw new IOException("Connection failure");
                }
            } catch (PackageManager.NameNotFoundException unused) {
                throw new GooglePlayServicesNotAvailableException(9);
            } catch (InterruptedException unused2) {
                throw new IOException("Interrupted exception");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(C0106a aVar, boolean z, float f2, long j2, Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String str = SLAConstant.TYPE_DEPRECATED_START;
        hashMap.put("app_context", str);
        if (aVar != null) {
            if (true != aVar.b) {
                str = "0";
            }
            hashMap.put("limit_ad_tracking", str);
            String str2 = aVar.a;
            if (str2 != null) {
                hashMap.put("ad_id_size", Integer.toString(str2.length()));
            }
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j2));
        new b(hashMap).start();
        return true;
    }

    public final C0106a e(int i2) throws IOException {
        C0106a aVar;
        f.m("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.c) {
                synchronized (this.f2836d) {
                    c cVar = this.f2837e;
                    if (cVar == null || !cVar.f2841e) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    c(false);
                    if (!this.c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (RemoteException e2) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                    throw new IOException("Remote exception");
                } catch (Exception e3) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e3);
                }
            }
            Objects.requireNonNull(this.a, "null reference");
            Objects.requireNonNull(this.b, "null reference");
            aVar = new C0106a(this.b.k(), this.b.n(true));
        }
        f();
        return aVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|8|9|(1:11)|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0011 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f2836d
            monitor-enter(r0)
            g.e.a.b.a.a.c r1 = r6.f2837e     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0011
            java.util.concurrent.CountDownLatch r1 = r1.f2840d     // Catch:{ all -> 0x0022 }
            r1.countDown()     // Catch:{ all -> 0x0022 }
            g.e.a.b.a.a.c r1 = r6.f2837e     // Catch:{ InterruptedException -> 0x0011 }
            r1.join()     // Catch:{ InterruptedException -> 0x0011 }
        L_0x0011:
            long r1 = r6.f2839g     // Catch:{ all -> 0x0022 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0020
            g.e.a.b.a.a.c r3 = new g.e.a.b.a.a.c     // Catch:{ all -> 0x0022 }
            r3.<init>(r6, r1)     // Catch:{ all -> 0x0022 }
            r6.f2837e = r3     // Catch:{ all -> 0x0022 }
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return
        L_0x0022:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.a.a.a.f():void");
    }

    public final void finalize() throws Throwable {
        b();
        super.finalize();
    }
}
