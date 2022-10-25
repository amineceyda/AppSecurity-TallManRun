package g.i.b.e.f.c.b;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.raft.codegenmeta.utils.Constants;
import com.tencent.raft.measure.report.ATTAReporter;
import g.i.b.e.f.i;
import g.i.b.e.f.j;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class d implements g.i.b.e.f.e, Runnable {

    /* renamed from: k  reason: collision with root package name */
    public static volatile d f4204k = null;

    /* renamed from: l  reason: collision with root package name */
    public static int f4205l = -1;
    public Map<String, e> b = new HashMap();
    public g.i.b.e.f.d c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4206d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4207e = false;

    /* renamed from: f  reason: collision with root package name */
    public Handler f4208f;

    /* renamed from: g  reason: collision with root package name */
    public Map<String, c> f4209g = new ConcurrentHashMap();

    /* renamed from: h  reason: collision with root package name */
    public Runnable f4210h = new a();

    /* renamed from: i  reason: collision with root package name */
    public Runnable f4211i = new b();

    /* renamed from: j  reason: collision with root package name */
    public Runnable f4212j = new c();

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            int i2;
            d dVar = d.this;
            if (dVar.f4206d) {
                g.i.b.e.h.b.c("halley-cloud-HttpPlatformConnection", "isRequesting, just ignore..");
                return;
            }
            dVar.f4206d = true;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                g.i.b.e.h.b.a("halley-cloud-HttpPlatformConnection", "requestTask start");
                b bVar = new b();
                for (c b2 : d.this.f4209g.values()) {
                    b2.b(bVar);
                }
                byte[] a = bVar.a();
                if (g.i.b.e.h.e.f(a)) {
                    e c = d.c(d.this, g.i.b.e.b.e.f4111f);
                    c.a = SystemClock.elapsedRealtime();
                    c.b = 0;
                    d.f(d.this);
                    d.this.f4206d = false;
                    return;
                }
                g.i.b.e.h.b.a("halley-cloud-HttpPlatformConnection", "HttpPlatform request:" + new String(a));
                g.i.b.e.d.a.c a2 = g.i.b.e.d.a.c.a("https://yun-hl.3g.qq.com/halleycloud", (Map<String, String>) null, a, 15000, g.i.b.e.h.e.j(), i.e().f());
                a2.s = Constants.Raft.PLATFORM;
                g.i.b.e.d.a.f c2 = a2.c();
                i2 = c2.a;
                try {
                    g.i.b.e.h.b.a("halley-cloud-HttpPlatformConnection", "HttpPlatform rspCode:" + i2 + ",httpStatus:" + c2.c);
                    if (c2.a == 0 && c2.c == 200) {
                        i2 = d.b(d.this, c2);
                    }
                    a2.f4138j = SystemClock.elapsedRealtime() - elapsedRealtime;
                    a2.b(false);
                    e c3 = d.c(d.this, g.i.b.e.b.e.f4111f);
                    c3.a = SystemClock.elapsedRealtime();
                    c3.b = i2;
                    d.f(d.this);
                    d.this.f4206d = false;
                } catch (Throwable th) {
                    th = th;
                    try {
                        th.printStackTrace();
                    } finally {
                        e c4 = d.c(d.this, g.i.b.e.b.e.f4111f);
                        c4.a = SystemClock.elapsedRealtime();
                        c4.b = i2;
                        d.f(d.this);
                        d.this.f4206d = false;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                i2 = 0;
                th.printStackTrace();
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            String str;
            int i2;
            try {
                g.i.b.e.h.b.a("halley-cloud-HttpPlatformConnection", "checkTask start");
                g.i.b.e.b.e.d();
                e c = d.c(d.this, g.i.b.e.b.e.f4111f);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int i3 = c.b;
                if (i3 == 0) {
                    str = "http_platform_update_interval_succ";
                } else {
                    if (i3 != -4) {
                        if (i3 != -3) {
                            str = "http_platform_update_interval_fail";
                        }
                    }
                    str = "http_platform_update_interval_nonet";
                }
                if (i3 == 0) {
                    i2 = 1800000;
                } else {
                    if (i3 != -4) {
                        if (i3 != -3) {
                            i2 = ATTAReporter.TIMEOUT;
                        }
                    }
                    i2 = 60000;
                }
                int b2 = g.h.a.a.b(str, 60000, 43200000, i2);
                long j2 = c.a;
                if (elapsedRealtime - j2 > ((long) b2) || elapsedRealtime < j2) {
                    d.f4205l = 2;
                    if (!d.this.f4206d) {
                        g.i.b.e.h.b.a("halley-cloud-HttpPlatformConnection", "post requestTask");
                        g.i.b.e.b.f.a().a.execute(d.this.f4210h);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public final void run() {
            g.i.b.e.h.b.a("halley-cloud-HttpPlatformConnection", "delayCheckTask start");
            d.this.g();
            d.this.f4207e = false;
        }
    }

    /* renamed from: g.i.b.e.f.c.b.d$d  reason: collision with other inner class name */
    public class C0154d implements Runnable {
        public C0154d(d dVar) {
        }

        public final void run() {
            int b = g.h.a.a.b("detect_obtain_ip_type_interval", 0, 1000, 24);
            g.i.b.e.h.b.c("halley-cloud-HttpPlatformConnection", "ready to obtain ip type report interval:".concat(String.valueOf(b)));
            if (b > 0) {
                SharedPreferences a = j.a(false);
                long j2 = a != null ? a.getLong("next_detect_report_time", 0) : -1;
                long j3 = (long) (b * 60 * 60 * 1000);
                if (j2 != 0 && System.currentTimeMillis() > j2) {
                    j.d("next_detect_report_time", System.currentTimeMillis() + j3);
                    g.i.b.e.h.b.c("halley-cloud-HttpPlatformConnection", "Report Not real detect..");
                    HashMap hashMap = new HashMap();
                    StringBuilder sb = new StringBuilder();
                    sb.append(g.i.b.e.b.e.c);
                    hashMap.put("D9", sb.toString());
                    hashMap.put("D40", g.i.b.e.c.f4129k);
                    String c = g.i.b.e.b.e.c();
                    if (!TextUtils.isEmpty(c)) {
                        hashMap.put("D39", c);
                    }
                    g.h.a.a.j("HLNotRealDetectEvent", true, hashMap, false);
                } else if (j2 == 0) {
                    j.d("next_detect_report_time", System.currentTimeMillis() + j3);
                }
            }
        }
    }

    public class e {
        public long a;
        public int b;

        public e(d dVar, byte b2) {
        }
    }

    public final class f extends g.i.b.e.f.c.a.a {
        public f(String str) {
            super(str);
        }
    }

    public final class g implements Runnable {
        public final /* synthetic */ String b;
        public final /* synthetic */ byte[] c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ h f4213d;

        public g(h hVar, String str, byte[] bArr) {
            this.f4213d = hVar;
            this.b = str;
            this.c = bArr;
        }

        public final void run() {
            String str = this.b;
            byte[] bArr = this.c;
            if (g.i.b.e.h.e.e(str) || g.i.b.e.h.e.f(bArr)) {
                g.i.b.e.b.e.d();
                str = g.i.b.e.b.e.f4111f;
                bArr = this.f4213d.b.b(str);
            }
            d.e().c.c(str, bArr, (String) null);
        }
    }

    public final class h extends c {
        public f b = new f("HttpSchedulerHandler");

        public final void a() {
            g.i.b.e.c.n.post(new g(this, (String) null, (byte[]) null));
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:24|25|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            r1 = new org.json.JSONObject();
            r2 = new java.lang.StringBuilder();
            r2.append(g.i.b.e.c.f4126h);
            r1.put(r2.toString(), new org.json.JSONObject());
            r12.a.put("directScheduleCodes", r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ba, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bb, code lost:
            r12 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00bc, code lost:
            r12.printStackTrace();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00bf, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x009a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(g.i.b.e.f.c.b.b r12) {
            /*
                r11 = this;
                java.lang.String r0 = "directScheduleCodes"
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x009a }
                r1.<init>()     // Catch:{ Exception -> 0x009a }
                g.i.b.e.f.c.b.d$f r2 = r11.b     // Catch:{ Exception -> 0x009a }
                g.i.b.e.b.e.d()     // Catch:{ Exception -> 0x009a }
                java.lang.String r3 = g.i.b.e.b.e.f4111f     // Catch:{ Exception -> 0x009a }
                byte[] r2 = r2.b(r3)     // Catch:{ Exception -> 0x009a }
                boolean r3 = g.i.b.e.h.e.f(r2)     // Catch:{ Exception -> 0x009a }
                if (r3 != 0) goto L_0x0023
                java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x009a }
                r3.<init>(r2)     // Catch:{ Exception -> 0x009a }
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x009a }
                r2.<init>(r3)     // Catch:{ Exception -> 0x009a }
                goto L_0x0024
            L_0x0023:
                r2 = 0
            L_0x0024:
                if (r2 == 0) goto L_0x007e
                java.lang.String r3 = "resultMap"
                org.json.JSONObject r2 = r2.optJSONObject(r3)     // Catch:{ Exception -> 0x009a }
                if (r2 == 0) goto L_0x006a
                java.util.Iterator r3 = r2.keys()     // Catch:{ Exception -> 0x009a }
            L_0x0032:
                boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x009a }
                if (r4 == 0) goto L_0x0094
                java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x009a }
                java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x009a }
                org.json.JSONArray r5 = r2.optJSONArray(r4)     // Catch:{ Exception -> 0x009a }
                if (r5 == 0) goto L_0x0032
                org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x009a }
                r6.<init>()     // Catch:{ Exception -> 0x009a }
                r7 = 0
            L_0x004a:
                int r8 = r5.length()     // Catch:{ Exception -> 0x009a }
                if (r7 >= r8) goto L_0x0066
                org.json.JSONObject r8 = r5.getJSONObject(r7)     // Catch:{ Exception -> 0x009a }
                java.lang.String r9 = "unit"
                java.lang.String r9 = r8.optString(r9)     // Catch:{ Exception -> 0x009a }
                java.lang.String r10 = "schedulecode"
                java.lang.String r8 = r8.optString(r10)     // Catch:{ Exception -> 0x009a }
                r6.put(r9, r8)     // Catch:{ Exception -> 0x009a }
                int r7 = r7 + 1
                goto L_0x004a
            L_0x0066:
                r1.put(r4, r6)     // Catch:{ Exception -> 0x009a }
                goto L_0x0032
            L_0x006a:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009a }
                r2.<init>()     // Catch:{ Exception -> 0x009a }
                int r3 = g.i.b.e.c.f4126h     // Catch:{ Exception -> 0x009a }
                r2.append(r3)     // Catch:{ Exception -> 0x009a }
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x009a }
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x009a }
                r3.<init>()     // Catch:{ Exception -> 0x009a }
                goto L_0x0091
            L_0x007e:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009a }
                r2.<init>()     // Catch:{ Exception -> 0x009a }
                int r3 = g.i.b.e.c.f4126h     // Catch:{ Exception -> 0x009a }
                r2.append(r3)     // Catch:{ Exception -> 0x009a }
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x009a }
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x009a }
                r3.<init>()     // Catch:{ Exception -> 0x009a }
            L_0x0091:
                r1.put(r2, r3)     // Catch:{ Exception -> 0x009a }
            L_0x0094:
                java.util.Map<java.lang.String, java.lang.Object> r2 = r12.a     // Catch:{ Exception -> 0x009a }
                r2.put(r0, r1)     // Catch:{ Exception -> 0x009a }
                return
            L_0x009a:
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x00bb }
                r1.<init>()     // Catch:{ Exception -> 0x00bb }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00bb }
                r2.<init>()     // Catch:{ Exception -> 0x00bb }
                int r3 = g.i.b.e.c.f4126h     // Catch:{ Exception -> 0x00bb }
                r2.append(r3)     // Catch:{ Exception -> 0x00bb }
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00bb }
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x00bb }
                r3.<init>()     // Catch:{ Exception -> 0x00bb }
                r1.put(r2, r3)     // Catch:{ Exception -> 0x00bb }
                java.util.Map<java.lang.String, java.lang.Object> r12 = r12.a     // Catch:{ Exception -> 0x00bb }
                r12.put(r0, r1)     // Catch:{ Exception -> 0x00bb }
                return
            L_0x00bb:
                r12 = move-exception
                r12.printStackTrace()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g.i.b.e.f.c.b.d.h.b(g.i.b.e.f.c.b.b):void");
        }

        public final void c(JSONObject jSONObject) {
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("AccessScheduleRsp");
                if (optJSONObject != null) {
                    String jSONObject2 = optJSONObject.toString();
                    if (!g.i.b.e.h.e.e(jSONObject2)) {
                        byte[] bytes = jSONObject2.getBytes();
                        if (!g.i.b.e.h.e.f(bytes)) {
                            String str = g.i.b.e.b.e.f4111f;
                            this.b.a(str, bytes);
                            g.i.b.e.c.n.post(new g(this, str, bytes));
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static int b(d dVar, g.i.b.e.d.a.f fVar) {
        String str;
        Objects.requireNonNull(dVar);
        String str2 = "";
        if (g.i.b.e.h.e.f(fVar.f4146d)) {
            return -320;
        }
        try {
            str = new String(fVar.f4146d);
            try {
                JSONObject jSONObject = new JSONObject(str);
                g.i.b.e.h.b.a("halley-cloud-HttpPlatformConnection", "HttpPlatform rspData:".concat(str));
                g.i.b.e.b.e.d();
                for (c c2 : dVar.f4209g.values()) {
                    c2.c(jSONObject);
                }
                return 0;
            } catch (Throwable th) {
                th = th;
                th.printStackTrace();
                try {
                    str2 = InetAddress.getByName("yun-hl.3g.qq.com").getHostAddress();
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                StringBuilder l2 = g.a.a.a.a.l(str2, "/");
                l2.append(str.substring(0, Math.min(str.length(), 20)));
                fVar.b = l2.toString();
                return -321;
            }
        } catch (Throwable th3) {
            th = th3;
            str = str2;
            th.printStackTrace();
            str2 = InetAddress.getByName("yun-hl.3g.qq.com").getHostAddress();
            StringBuilder l22 = g.a.a.a.a.l(str2, "/");
            l22.append(str.substring(0, Math.min(str.length(), 20)));
            fVar.b = l22.toString();
            return -321;
        }
    }

    public static e c(d dVar, String str) {
        JSONObject optJSONObject;
        if (dVar.b.isEmpty()) {
            try {
                String f2 = j.f("apnrecords", "", true);
                if (!f2.isEmpty()) {
                    JSONObject jSONObject = new JSONObject(f2);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (!TextUtils.isEmpty(next) && (optJSONObject = jSONObject.optJSONObject(next)) != null) {
                            e eVar = new e(dVar, (byte) 0);
                            eVar.b = optJSONObject.optInt("lastCode");
                            eVar.a = optJSONObject.optLong("lastReqTime");
                            dVar.b.put(next, eVar);
                        }
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        e eVar2 = dVar.b.get(str);
        if (eVar2 != null) {
            return eVar2;
        }
        e eVar3 = new e(dVar, (byte) 0);
        dVar.b.put(str, eVar3);
        return eVar3;
    }

    public static d e() {
        if (f4204k == null) {
            synchronized (d.class) {
                if (f4204k == null) {
                    f4204k = new d();
                }
            }
        }
        return f4204k;
    }

    public static /* synthetic */ void f(d dVar) {
        if (!dVar.b.isEmpty()) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry next : dVar.b.entrySet()) {
                e eVar = (e) next.getValue();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("lastCode", eVar.b);
                    jSONObject2.put("lastReqTime", eVar.a);
                    jSONObject.put((String) next.getKey(), jSONObject2);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            j.e("apnrecords", jSONObject.toString(), true);
        }
    }

    public final void a() {
        this.f4209g.get("accessscheduler").a();
    }

    public final void a(g.i.b.e.f.d dVar) {
        this.c = dVar;
        this.f4209g.put("state", new g.i.b.e.f.c.b.f.a());
        this.f4209g.put("accessscheduler", new h());
        this.f4209g.put("settings", new g.i.b.e.f.c.b.e.a());
        this.f4209g.put("detector", new g.i.b.e.f.c.b.a.a());
    }

    public final void b() {
        this.f4209g.get("settings").b();
    }

    public final void d() {
        g.i.b.e.h.b.f("halley-cloud-HttpPlatformConnection", "startPlatform");
        Handler handler = g.i.b.e.c.n;
        this.f4208f = handler;
        handler.post(this);
        this.f4208f.postDelayed(new C0154d(this), 10000);
        this.c.c();
    }

    public final void g() {
        this.f4208f.removeCallbacks(this.f4211i);
        this.f4208f.post(this.f4211i);
    }

    public void run() {
        if (g.h.a.a.b("http_platform_start_update_on", 0, 1, 1) == 1) {
            g.i.b.e.h.b.f("halley-cloud-HttpPlatformConnection", "update on start");
            f4205l = 1;
            g();
            return;
        }
        g.i.b.e.h.b.f("halley-cloud-HttpPlatformConnection", "not update on start");
    }
}
