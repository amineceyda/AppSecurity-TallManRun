package f.a.a.b;

import f.a.a.b.w.i;
import f.a.a.b.w.j;
import f.a.a.b.w.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

public class d implements i, k {
    public long b = System.currentTimeMillis();
    public String c;

    /* renamed from: d  reason: collision with root package name */
    public c f1685d = new c();

    /* renamed from: e  reason: collision with root package name */
    public Map<String, String> f1686e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public Map<String, Object> f1687f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public j f1688g = new j();

    /* renamed from: h  reason: collision with root package name */
    public ScheduledExecutorService f1689h;

    /* renamed from: i  reason: collision with root package name */
    public List<ScheduledFuture<?>> f1690i = new ArrayList(1);

    /* renamed from: j  reason: collision with root package name */
    public h f1691j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1692k;

    public d() {
        g();
    }

    public String b(String str) {
        if ("CONTEXT_NAME".equals(str)) {
            return this.c;
        }
        return this.f1686e.get(str);
    }

    public synchronized h c() {
        if (this.f1691j == null) {
            this.f1691j = new h();
        }
        return this.f1691j;
    }

    public synchronized ScheduledExecutorService d() {
        if (this.f1689h == null) {
            ThreadFactory threadFactory = f.a.a.b.z.j.a;
            this.f1689h = new ScheduledThreadPoolExecutor(2, f.a.a.b.z.j.a);
        }
        return this.f1689h;
    }

    public void e(String str) throws IllegalStateException {
        if (str == null || !str.equals(this.c)) {
            String str2 = this.c;
            if (str2 == null || "default".equals(str2)) {
                this.c = str;
                return;
            }
            throw new IllegalStateException("Context has been already given a name");
        }
    }

    public void g() {
        this.f1687f.put("FA_FILENAME_COLLISION_MAP", new HashMap());
        this.f1687f.put("RFA_FILENAME_PATTERN_COLLISION_MAP", new HashMap());
    }

    public void h(String str, String str2) {
        throw null;
    }

    public boolean k() {
        return this.f1692k;
    }

    public void stop() {
        synchronized (this) {
            ScheduledExecutorService scheduledExecutorService = this.f1689h;
            if (scheduledExecutorService != null) {
                ThreadFactory threadFactory = f.a.a.b.z.j.a;
                scheduledExecutorService.shutdownNow();
                this.f1689h = null;
            }
        }
        this.f1692k = false;
    }
}
