package g.e.b;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import g.e.a.b.b.e.a.a;
import g.e.a.b.b.h.f;
import g.e.b.k.r;
import g.e.b.k.x;
import g.e.b.p.g;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.GuardedBy;
import org.slf4j.Marker;

public class h {

    /* renamed from: j  reason: collision with root package name */
    public static final Object f3440j = new Object();

    /* renamed from: k  reason: collision with root package name */
    public static final Executor f3441k = new d((a) null);
    @GuardedBy("LOCK")

    /* renamed from: l  reason: collision with root package name */
    public static final Map<String, h> f3442l = new e.d.a();
    public final Context a;
    public final String b;
    public final i c;

    /* renamed from: d  reason: collision with root package name */
    public final r f3443d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f3444e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f3445f = new AtomicBoolean();

    /* renamed from: g  reason: collision with root package name */
    public final x<g.e.b.s.a> f3446g;

    /* renamed from: h  reason: collision with root package name */
    public final g.e.b.q.b<g> f3447h;

    /* renamed from: i  reason: collision with root package name */
    public final List<b> f3448i = new CopyOnWriteArrayList();

    public interface b {
        void a(boolean z);
    }

    @TargetApi(14)
    public static class c implements a.C0107a {
        public static AtomicReference<c> a = new AtomicReference<>();

        public void a(boolean z) {
            Object obj = h.f3440j;
            synchronized (h.f3440j) {
                Iterator it = new ArrayList(h.f3442l.values()).iterator();
                while (it.hasNext()) {
                    h hVar = (h) it.next();
                    if (hVar.f3444e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        for (b a2 : hVar.f3448i) {
                            a2.a(z);
                        }
                    }
                }
            }
        }
    }

    public static class d implements Executor {
        public static final Handler b = new Handler(Looper.getMainLooper());

        public d(a aVar) {
        }

        public void execute(Runnable runnable) {
            b.post(runnable);
        }
    }

    @TargetApi(24)
    public static class e extends BroadcastReceiver {
        public static AtomicReference<e> b = new AtomicReference<>();
        public final Context a;

        public e(Context context) {
            this.a = context;
        }

        public void onReceive(Context context, Intent intent) {
            Object obj = h.f3440j;
            synchronized (h.f3440j) {
                for (h d2 : h.f3442l.values()) {
                    d2.d();
                }
            }
            this.a.unregisterReceiver(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bb A[LOOP:1: B:25:0x00b5->B:27:0x00bb, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h(android.content.Context r9, java.lang.String r10, g.e.b.i r11) {
        /*
            r8 = this;
            r8.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r8.f3444e = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r8.f3445f = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r8.f3448i = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r9, r0)
            r8.a = r9
            g.c.b.b.f.k(r10)
            r8.b = r10
            java.util.Objects.requireNonNull(r11, r0)
            r8.c = r11
            java.lang.Class<com.google.firebase.components.ComponentDiscoveryService> r10 = com.google.firebase.components.ComponentDiscoveryService.class
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r2 = "ComponentDiscovery"
            r3 = 0
            android.content.pm.PackageManager r4 = r9.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0067 }
            if (r4 != 0) goto L_0x0042
            java.lang.String r10 = "Context has no PackageManager."
            goto L_0x0060
        L_0x0042:
            android.content.ComponentName r5 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0067 }
            r5.<init>(r9, r10)     // Catch:{ NameNotFoundException -> 0x0067 }
            r6 = 128(0x80, float:1.794E-43)
            android.content.pm.ServiceInfo r4 = r4.getServiceInfo(r5, r6)     // Catch:{ NameNotFoundException -> 0x0067 }
            if (r4 != 0) goto L_0x0064
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x0067 }
            r4.<init>()     // Catch:{ NameNotFoundException -> 0x0067 }
            r4.append(r10)     // Catch:{ NameNotFoundException -> 0x0067 }
            java.lang.String r10 = " has no service info."
            r4.append(r10)     // Catch:{ NameNotFoundException -> 0x0067 }
            java.lang.String r10 = r4.toString()     // Catch:{ NameNotFoundException -> 0x0067 }
        L_0x0060:
            android.util.Log.w(r2, r10)     // Catch:{ NameNotFoundException -> 0x0067 }
            goto L_0x006c
        L_0x0064:
            android.os.Bundle r10 = r4.metaData     // Catch:{ NameNotFoundException -> 0x0067 }
            goto L_0x006d
        L_0x0067:
            java.lang.String r10 = "Application info not found."
            android.util.Log.w(r2, r10)
        L_0x006c:
            r10 = r3
        L_0x006d:
            if (r10 != 0) goto L_0x0079
            java.lang.String r10 = "Could not retrieve metadata, returning empty list of registrars."
            android.util.Log.w(r2, r10)
            java.util.List r10 = java.util.Collections.emptyList()
            goto L_0x00b1
        L_0x0079:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Set r4 = r10.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0086:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00b0
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r10.get(r5)
            java.lang.String r7 = "com.google.firebase.components.ComponentRegistrar"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x0086
            java.lang.String r6 = "com.google.firebase.components:"
            boolean r6 = r5.startsWith(r6)
            if (r6 == 0) goto L_0x0086
            r6 = 31
            java.lang.String r5 = r5.substring(r6)
            r2.add(r5)
            goto L_0x0086
        L_0x00b0:
            r10 = r2
        L_0x00b1:
            java.util.Iterator r10 = r10.iterator()
        L_0x00b5:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x00ca
            java.lang.Object r2 = r10.next()
            java.lang.String r2 = (java.lang.String) r2
            g.e.b.k.c r4 = new g.e.b.k.c
            r4.<init>(r2)
            r0.add(r4)
            goto L_0x00b5
        L_0x00ca:
            java.util.concurrent.Executor r10 = f3441k
            int r2 = g.e.b.k.r.f3467g
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r2.addAll(r0)
            com.google.firebase.FirebaseCommonRegistrar r0 = new com.google.firebase.FirebaseCommonRegistrar
            r0.<init>()
            g.e.b.k.e r5 = new g.e.b.k.e
            r5.<init>(r0)
            r2.add(r5)
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Class[] r5 = new java.lang.Class[r1]
            g.e.b.k.n r0 = g.e.b.k.n.c(r9, r0, r5)
            r4.add(r0)
            java.lang.Class<g.e.b.h> r0 = g.e.b.h.class
            java.lang.Class[] r5 = new java.lang.Class[r1]
            g.e.b.k.n r0 = g.e.b.k.n.c(r8, r0, r5)
            r4.add(r0)
            java.lang.Class<g.e.b.i> r0 = g.e.b.i.class
            java.lang.Class[] r1 = new java.lang.Class[r1]
            g.e.b.k.n r11 = g.e.b.k.n.c(r11, r0, r1)
            r4.add(r11)
            g.e.b.k.r r11 = new g.e.b.k.r
            r11.<init>(r10, r2, r4, r3)
            r8.f3443d = r11
            g.e.b.k.x r10 = new g.e.b.k.x
            g.e.b.b r0 = new g.e.b.b
            r0.<init>(r8, r9)
            r10.<init>(r0)
            r8.f3446g = r10
            java.lang.Class<g.e.b.p.g> r9 = g.e.b.p.g.class
            g.e.b.q.b r9 = r11.c(r9)
            r8.f3447h = r9
            g.e.b.a r9 = new g.e.b.a
            r9.<init>(r8)
            r8.a()
            java.util.concurrent.atomic.AtomicBoolean r10 = r8.f3444e
            boolean r10 = r10.get()
            if (r10 == 0) goto L_0x0142
            g.e.a.b.b.e.a.a r10 = g.e.a.b.b.e.a.a.f2842f
            java.util.concurrent.atomic.AtomicBoolean r10 = r10.b
            boolean r10 = r10.get()
            if (r10 == 0) goto L_0x0142
            r10 = 1
            r9.a(r10)
        L_0x0142:
            java.util.List<g.e.b.h$b> r10 = r8.f3448i
            r10.add(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.b.h.<init>(android.content.Context, java.lang.String, g.e.b.i):void");
    }

    public static h b() {
        h hVar;
        synchronized (f3440j) {
            hVar = f3442l.get("[DEFAULT]");
            if (hVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + f.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return hVar;
    }

    public static h e(Context context, i iVar) {
        h hVar;
        AtomicReference<c> atomicReference = c.a;
        boolean z = true;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            if (c.a.get() == null) {
                c cVar = new c();
                if (c.a.compareAndSet((Object) null, cVar)) {
                    g.e.a.b.b.e.a.a aVar = g.e.a.b.b.e.a.a.f2842f;
                    synchronized (aVar) {
                        if (!aVar.f2844e) {
                            application.registerActivityLifecycleCallbacks(aVar);
                            application.registerComponentCallbacks(aVar);
                            aVar.f2844e = true;
                        }
                    }
                    synchronized (aVar) {
                        aVar.f2843d.add(cVar);
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f3440j) {
            Map<String, h> map = f3442l;
            if (map.containsKey("[DEFAULT]")) {
                z = false;
            }
            g.c.b.b.f.r(z, "FirebaseApp name [DEFAULT] already exists!");
            g.c.b.b.f.o(context, "Application context cannot be null.");
            hVar = new h(context, "[DEFAULT]", iVar);
            map.put("[DEFAULT]", hVar);
        }
        hVar.d();
        return hVar;
    }

    public final void a() {
        g.c.b.b.f.r(!this.f3445f.get(), "FirebaseApp was deleted");
    }

    public String c() {
        String str;
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.b.getBytes(Charset.defaultCharset());
        String str2 = null;
        if (bytes == null) {
            str = null;
        } else {
            str = Base64.encodeToString(bytes, 11);
        }
        sb.append(str);
        sb.append(Marker.ANY_NON_NULL_MARKER);
        a();
        byte[] bytes2 = this.c.b.getBytes(Charset.defaultCharset());
        if (bytes2 != null) {
            str2 = Base64.encodeToString(bytes2, 11);
        }
        sb.append(str2);
        return sb.toString();
    }

    public final void d() {
        HashMap hashMap;
        if (!e.e.d.l.a.Y(this.a)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.a;
            if (e.b.get() == null) {
                e eVar = new e(context);
                if (e.b.compareAndSet((Object) null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(this.b);
        Log.i("FirebaseApp", sb2.toString());
        r rVar = this.f3443d;
        boolean g2 = g();
        if (rVar.f3470f.compareAndSet((Object) null, Boolean.valueOf(g2))) {
            synchronized (rVar) {
                hashMap = new HashMap(rVar.a);
            }
            rVar.f(hashMap, g2);
        }
        this.f3447h.get().b();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        String str = this.b;
        h hVar = (h) obj;
        hVar.a();
        return str.equals(hVar.b);
    }

    public boolean f() {
        boolean z;
        a();
        g.e.b.s.a aVar = this.f3446g.get();
        synchronized (aVar) {
            z = aVar.f3761d;
        }
        return z;
    }

    public boolean g() {
        a();
        return "[DEFAULT]".equals(this.b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        g.e.a.b.b.f.g gVar = new g.e.a.b.b.f.g(this);
        gVar.a("name", this.b);
        gVar.a("options", this.c);
        return gVar.toString();
    }
}
