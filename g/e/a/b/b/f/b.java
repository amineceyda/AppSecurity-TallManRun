package g.e.a.b.b.f;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
import g.c.b.b.f;
import g.e.a.b.f.b.e8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

public abstract class b<T extends IInterface> {
    public static final Feature[] u = new Feature[0];
    public e0 a;
    public final Context b;
    public final c c;

    /* renamed from: d  reason: collision with root package name */
    public final g.e.a.b.b.b f2847d;

    /* renamed from: e  reason: collision with root package name */
    public final Handler f2848e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f2849f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f2850g;
    @GuardedBy("mServiceBrokerLock")

    /* renamed from: h  reason: collision with root package name */
    public f f2851h;

    /* renamed from: i  reason: collision with root package name */
    public c f2852i;
    @GuardedBy("mLock")

    /* renamed from: j  reason: collision with root package name */
    public T f2853j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList<r<?>> f2854k;
    @GuardedBy("mLock")

    /* renamed from: l  reason: collision with root package name */
    public t f2855l;
    @GuardedBy("mLock")

    /* renamed from: m  reason: collision with root package name */
    public int f2856m;
    public final a n;
    public final C0108b o;
    public final int p;
    public final String q;
    public ConnectionResult r;
    public boolean s;
    public AtomicInteger t;

    public interface a {
    }

    /* renamed from: g.e.a.b.b.f.b$b  reason: collision with other inner class name */
    public interface C0108b {
    }

    public interface c {
    }

    public class d implements c {
        public d() {
        }

        public final void a(ConnectionResult connectionResult) {
            if (connectionResult.c()) {
                b bVar = b.this;
                Objects.requireNonNull(bVar);
                Set emptySet = Collections.emptySet();
                Bundle bundle = new Bundle();
                GetServiceRequest getServiceRequest = new GetServiceRequest(bVar.p, (String) null);
                getServiceRequest.f357e = bVar.b.getPackageName();
                getServiceRequest.f360h = bundle;
                if (emptySet != null) {
                    getServiceRequest.f359g = (Scope[]) emptySet.toArray(new Scope[emptySet.size()]);
                }
                Feature[] featureArr = b.u;
                getServiceRequest.f362j = featureArr;
                getServiceRequest.f363k = featureArr;
                try {
                    synchronized (bVar.f2850g) {
                        f fVar = bVar.f2851h;
                        if (fVar != null) {
                            fVar.p(new s(bVar, bVar.t.get()), getServiceRequest);
                        } else {
                            Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                        }
                    }
                } catch (DeadObjectException e2) {
                    Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
                    Handler handler = bVar.f2848e;
                    handler.sendMessage(handler.obtainMessage(6, bVar.t.get(), 3));
                } catch (SecurityException e3) {
                    throw e3;
                } catch (RemoteException | RuntimeException e4) {
                    Log.w("GmsClient", "IGmsServiceBroker.getService failed", e4);
                    int i2 = bVar.t.get();
                    Handler handler2 = bVar.f2848e;
                    handler2.sendMessage(handler2.obtainMessage(1, i2, -1, new u(bVar, 8, (IBinder) null, (Bundle) null)));
                }
            } else {
                C0108b bVar2 = b.this.o;
                if (bVar2 != null) {
                    ((e8) bVar2).a(connectionResult);
                }
            }
        }
    }

    public b(Context context, Looper looper, int i2, a aVar, C0108b bVar, String str) {
        synchronized (c.a) {
            if (c.b == null) {
                c.b = new d0(context.getApplicationContext(), context.getMainLooper());
            }
        }
        d0 d0Var = c.b;
        g.e.a.b.b.b bVar2 = g.e.a.b.b.b.b;
        Objects.requireNonNull(aVar, "null reference");
        Objects.requireNonNull(bVar, "null reference");
        this.f2849f = new Object();
        this.f2850g = new Object();
        this.f2854k = new ArrayList<>();
        this.f2856m = 1;
        this.r = null;
        this.s = false;
        this.t = new AtomicInteger(0);
        f.o(context, "Context must not be null");
        this.b = context;
        f.o(looper, "Looper must not be null");
        f.o(d0Var, "Supervisor must not be null");
        this.c = d0Var;
        f.o(bVar2, "API availability must not be null");
        this.f2847d = bVar2;
        this.f2848e = new q(this, looper);
        this.p = i2;
        this.n = aVar;
        this.o = bVar;
        this.q = null;
    }

    public static /* bridge */ /* synthetic */ void f(b bVar, int i2) {
        int i3;
        int i4;
        synchronized (bVar.f2849f) {
            i3 = bVar.f2856m;
        }
        if (i3 == 3) {
            bVar.s = true;
            i4 = 5;
        } else {
            i4 = 4;
        }
        Handler handler = bVar.f2848e;
        handler.sendMessage(handler.obtainMessage(i4, bVar.t.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean g(b bVar, int i2, int i3, IInterface iInterface) {
        synchronized (bVar.f2849f) {
            if (bVar.f2856m != i2) {
                return false;
            }
            bVar.i(i3, iInterface);
            return true;
        }
    }

    public static /* bridge */ /* synthetic */ boolean h(b bVar) {
        if (bVar.s || TextUtils.isEmpty("com.google.android.gms.measurement.internal.IMeasurementService") || TextUtils.isEmpty((CharSequence) null)) {
            return false;
        }
        try {
            Class.forName("com.google.android.gms.measurement.internal.IMeasurementService");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public void a() {
        int a2 = this.f2847d.a(this.b, 12451000);
        if (a2 != 0) {
            i(1, (IInterface) null);
            d dVar = new d();
            f.o(dVar, "Connection progress callbacks cannot be null.");
            this.f2852i = dVar;
            Handler handler = this.f2848e;
            handler.sendMessage(handler.obtainMessage(3, this.t.get(), a2, (Object) null));
            return;
        }
        d dVar2 = new d();
        f.o(dVar2, "Connection progress callbacks cannot be null.");
        this.f2852i = dVar2;
        i(2, (IInterface) null);
    }

    public final T b() throws DeadObjectException {
        T t2;
        synchronized (this.f2849f) {
            try {
                if (this.f2856m == 5) {
                    throw new DeadObjectException();
                } else if (c()) {
                    t2 = this.f2853j;
                    f.o(t2, "Client is connected but service is null");
                } else {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t2;
    }

    public boolean c() {
        boolean z;
        synchronized (this.f2849f) {
            z = this.f2856m == 4;
        }
        return z;
    }

    public boolean d() {
        boolean z;
        synchronized (this.f2849f) {
            int i2 = this.f2856m;
            z = true;
            if (i2 != 2) {
                if (i2 != 3) {
                    z = false;
                }
            }
        }
        return z;
    }

    public final String e() {
        String str = this.q;
        return str == null ? this.b.getClass().getName() : str;
    }

    public final void i(int i2, T t2) {
        f.g((i2 == 4) == (t2 != null));
        synchronized (this.f2849f) {
            try {
                this.f2856m = i2;
                this.f2853j = t2;
                if (i2 == 1) {
                    t tVar = this.f2855l;
                    if (tVar != null) {
                        c cVar = this.c;
                        Objects.requireNonNull(this.a);
                        Objects.requireNonNull(this.a);
                        String e2 = e();
                        Objects.requireNonNull(this.a);
                        cVar.a("com.google.android.gms.measurement.START", "com.google.android.gms", 4225, tVar, e2, false);
                        this.f2855l = null;
                    }
                } else if (i2 == 2 || i2 == 3) {
                    t tVar2 = this.f2855l;
                    if (!(tVar2 == null || this.a == null)) {
                        StringBuilder sb = new StringBuilder("com.google.android.gms.measurement.START".length() + 70 + "com.google.android.gms".length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append("com.google.android.gms.measurement.START");
                        sb.append(" on ");
                        sb.append("com.google.android.gms");
                        Log.e("GmsClient", sb.toString());
                        c cVar2 = this.c;
                        Objects.requireNonNull(this.a);
                        Objects.requireNonNull(this.a);
                        String e3 = e();
                        Objects.requireNonNull(this.a);
                        cVar2.a("com.google.android.gms.measurement.START", "com.google.android.gms", 4225, tVar2, e3, false);
                        this.t.incrementAndGet();
                    }
                    t tVar3 = new t(this, this.t.get());
                    this.f2855l = tVar3;
                    Object obj = c.a;
                    e0 e0Var = new e0("com.google.android.gms", "com.google.android.gms.measurement.START", 4225, false);
                    this.a = e0Var;
                    c cVar3 = this.c;
                    Objects.requireNonNull(e0Var);
                    String e4 = e();
                    Objects.requireNonNull(this.a);
                    if (!cVar3.b(new a0("com.google.android.gms.measurement.START", "com.google.android.gms", 4225, false), tVar3, e4, (Executor) null)) {
                        Objects.requireNonNull(this.a);
                        StringBuilder sb2 = new StringBuilder("com.google.android.gms.measurement.START".length() + 34 + "com.google.android.gms".length());
                        sb2.append("unable to connect to service: ");
                        sb2.append("com.google.android.gms.measurement.START");
                        sb2.append(" on ");
                        sb2.append("com.google.android.gms");
                        Log.w("GmsClient", sb2.toString());
                        int i3 = this.t.get();
                        Handler handler = this.f2848e;
                        handler.sendMessage(handler.obtainMessage(7, i3, -1, new v(this, 16)));
                    }
                } else if (i2 == 4) {
                    Objects.requireNonNull(t2, "null reference");
                    System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
