package com.ola.qsea.p;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ola.qsea.log.IObservableLog;
import com.ola.qsea.o.i;
import com.ola.qsea.p.c;
import com.ola.qsea.p.k;
import com.ola.qsea.q.a;
import com.ola.qsea.sdk.IAsyncQseaListener;
import com.ola.qsea.sdk.IQseaSDK;
import com.ola.qsea.sdk.Qsea;
import com.ola.qsea.sdk.QseaSDK;
import com.ola.qsea.sdk.debug.IDebugger;
import com.ola.qsea.strategy.terminal.ITerminalStrategy;
import com.ola.qsea.v.b;
import com.ola.qsea.v.c;
import com.ola.qsea.v.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class o implements IQseaSDK, b, c, com.ola.qsea.h.c, c.a, k.b {
    public static final Map<String, o> a = new ConcurrentHashMap();
    public static final String b = QseaSDK.class.getCanonicalName();
    public final List<IAsyncQseaListener> c = Collections.synchronizedList(new ArrayList(8));

    /* renamed from: d  reason: collision with root package name */
    public final String f493d;

    /* renamed from: e  reason: collision with root package name */
    public Context f494e = null;

    /* renamed from: f  reason: collision with root package name */
    public boolean f495f = false;

    /* renamed from: g  reason: collision with root package name */
    public String f496g = "";

    /* renamed from: h  reason: collision with root package name */
    public String f497h = "";

    /* renamed from: i  reason: collision with root package name */
    public final HashMap<String, String> f498i = new HashMap<>();

    /* renamed from: j  reason: collision with root package name */
    public final IDebugger f499j;

    /* renamed from: k  reason: collision with root package name */
    public final com.ola.qsea.y.b f500k = new com.ola.qsea.y.b();

    /* renamed from: l  reason: collision with root package name */
    public long f501l;

    public o(String str) {
        this.f493d = str;
        this.f499j = new a(str);
    }

    public static synchronized IQseaSDK a(String str) {
        o oVar;
        synchronized (o.class) {
            Map<String, o> map = a;
            oVar = map.get(str);
            if (oVar == null) {
                oVar = new o(str);
                map.put(str, oVar);
            }
        }
        return oVar;
    }

    public String E() {
        return this.f496g;
    }

    public Context F() {
        if (this.f494e == null) {
            com.ola.qsea.m.a.b("SDK_INIT", "Context has been destroyed!!", new Object[0]);
        }
        return this.f494e;
    }

    public String G() {
        Qsea qsea = getQsea();
        return qsea == null ? "" : qsea.getQsea16();
    }

    public String H() {
        return new JSONObject(this.f498i).toString();
    }

    public String I() {
        return this.f497h;
    }

    public String J() {
        Qsea qsea = getQsea();
        return qsea == null ? "" : qsea.getQsea36();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void K() {
        /*
            r4 = this;
            java.util.List<com.ola.qsea.sdk.IAsyncQseaListener> r0 = r4.c
            monitor-enter(r0)
            com.ola.qsea.sdk.Qsea r1 = r4.getQsea()     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x002d
            boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x002f }
            if (r2 == 0) goto L_0x0010
            goto L_0x002d
        L_0x0010:
            java.util.List<com.ola.qsea.sdk.IAsyncQseaListener> r2 = r4.c     // Catch:{ all -> 0x002f }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x002f }
        L_0x0016:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x002f }
            if (r3 == 0) goto L_0x0026
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x002f }
            com.ola.qsea.sdk.IAsyncQseaListener r3 = (com.ola.qsea.sdk.IAsyncQseaListener) r3     // Catch:{ all -> 0x002f }
            r3.onQseaDispatch(r1)     // Catch:{ all -> 0x002f }
            goto L_0x0016
        L_0x0026:
            java.util.List<com.ola.qsea.sdk.IAsyncQseaListener> r1 = r4.c     // Catch:{ all -> 0x002f }
            r1.clear()     // Catch:{ all -> 0x002f }
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x002d:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x002f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            goto L_0x0033
        L_0x0032:
            throw r1
        L_0x0033:
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ola.qsea.p.o.K():void");
    }

    public String L() {
        return "";
    }

    public void a() {
        j();
    }

    public final void a(IAsyncQseaListener iAsyncQseaListener) {
        synchronized (this.c) {
            if (!this.c.contains(iAsyncQseaListener)) {
                this.c.add(iAsyncQseaListener);
            }
        }
    }

    public IQseaSDK addUserId(String str, String str2) {
        this.f498i.put(str, str2);
        return this;
    }

    public void b() {
    }

    public long c() {
        return this.f501l;
    }

    public void d() {
        e();
    }

    public final void e() {
        getToken();
        j();
        f();
    }

    public final void f() {
        getQsea(new m(this));
    }

    public final synchronized boolean g() {
        if (TextUtils.isEmpty(this.f493d)) {
            throw new AssertionError("Assertion failed: AppKey Forgot Set!");
        }
        return this.f494e != null;
    }

    public String getBCTicket() {
        return !i() ? "" : p.h(this.f493d);
    }

    public IDebugger getDebugger() {
        return this.f499j;
    }

    public Qsea getQsea() {
        if (!i()) {
            return null;
        }
        return p.e(this.f493d);
    }

    public synchronized void getQsea(IAsyncQseaListener iAsyncQseaListener) {
        if (!i()) {
            a(iAsyncQseaListener);
        } else {
            com.ola.qsea.c.a.a().a(new l(this, iAsyncQseaListener));
        }
    }

    public String getSdkVersion() {
        return "1.2.13";
    }

    public ITerminalStrategy getStrategy() {
        return this.f500k.E();
    }

    public String getToken() {
        return !i() ? "" : r.a(this.f493d).a();
    }

    public final void h() {
        d.a(this);
        com.ola.qsea.v.a.a(this, this.f493d);
        i.a().a(this.f494e);
        com.ola.qsea.s.b b2 = com.ola.qsea.s.b.b();
        Context context = this.f494e;
        String str = b;
        if (!b2.a(context, str)) {
            com.ola.qsea.o.c.b(this.f493d);
        }
        com.ola.qsea.k.a.c(this.f493d).a(this.f494e, str);
        new c(this.f493d, this.f494e, this, this.f500k, this).c();
    }

    public final synchronized boolean i() {
        boolean z;
        z = g() && this.f495f;
        if (!z) {
            com.ola.qsea.m.a.a("SDK_INIT", "appKey:%s not initialized", this.f493d);
        }
        return z;
    }

    public synchronized boolean init(Context context) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f495f) {
            return true;
        }
        com.ola.qsea.m.a.b("SDK_INIT", "\n\n\n\n_____________________________________\n< Welcome to QimeiSDK! Your AppKey is: %s SDK_VERSION is: %s>\n -------------------------------------\n        \\   ^__^\n         \\  (oo)\\_______\n            (__)\\       )\\/\\\n                ||----w |\n                ||     || \n\n\n\n", this.f493d, getSdkVersion());
        this.f494e = context;
        if (!g()) {
            com.ola.qsea.m.a.a("SDK_INIT", "parameter abnormal, appKey is %s", this.f493d);
            return false;
        }
        h();
        com.ola.qsea.m.a.b("SDK_INIT", "\n\n\n\n\t\t\t\t ----- initialization is complete! From appkey:%s ----- \n\n\n\n\t\t\t\t", this.f493d);
        this.f495f = true;
        this.f501l = SystemClock.uptimeMillis() - uptimeMillis;
        return true;
    }

    public boolean isQseaValid(String str, String str2) {
        return true;
    }

    public final void j() {
        boolean z;
        if (p.k(this.f493d)) {
            z = true;
        } else if (p.l(this.f493d)) {
            z = !p.b(this.f493d, this.f494e);
        } else {
            com.ola.qsea.m.a.b("SDK_INIT ｜ QSEA", "no need to update Qsea, appKey: %s)", this.f493d);
            K();
            return;
        }
        if (z) {
            com.ola.qsea.c.a.a().a(k.a(this.f493d, (k.b) this));
            return;
        }
        int c2 = p.c(this.f493d);
        com.ola.qsea.c.a.a().a((long) c2, k.a(this.f493d, (k.b) this));
        com.ola.qsea.m.a.b("SDK_INIT ｜ QSEA", "update QSEA in staggered peak %d, appKey: %s)", Integer.valueOf(c2), this.f493d);
    }

    public final void k() {
        getQsea(new n(this));
    }

    public IQseaSDK setAppVersion(String str) {
        com.ola.qsea.d.a.d(str);
        return this;
    }

    public IQseaSDK setChannelID(String str) {
        this.f496g = str;
        return this;
    }

    public synchronized IQseaSDK setLogAble(boolean z) {
        com.ola.qsea.m.a.a(z);
        com.ola.qsea.m.a.b(z);
        return this;
    }

    public synchronized IQseaSDK setLogObserver(IObservableLog iObservableLog) {
        com.ola.qsea.m.a.a(iObservableLog);
        return this;
    }

    public IQseaSDK setSdkName(String str) {
        if (!this.f495f) {
            this.f497h = str;
        }
        return this;
    }
}
