package com.tencent.beacon.event.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import com.tencent.beacon.a.b.f;
import com.tencent.beacon.a.c.b;
import com.tencent.beacon.base.util.c;
import com.tencent.beacon.event.open.EventType;
import g.a.a.a.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class g {
    private static final Map<String, g> a = new ConcurrentHashMap(5);
    private static volatile Handler b;
    private final Runnable A = new e(this);
    private boolean B = false;
    private final String c = "normal_log_id";

    /* renamed from: d  reason: collision with root package name */
    private final String f691d = "realtime_log_id";

    /* renamed from: e  reason: collision with root package name */
    private final String f692e = "immediate_log_id";

    /* renamed from: f  reason: collision with root package name */
    private final String f693f = "normal_min_log_id";

    /* renamed from: g  reason: collision with root package name */
    private final String f694g = "normal_max_log_id";

    /* renamed from: h  reason: collision with root package name */
    private final String f695h = "realtime_min_log_id";

    /* renamed from: i  reason: collision with root package name */
    private final String f696i = "realtime_max_log_id";

    /* renamed from: j  reason: collision with root package name */
    private final String f697j = "immediate_min_log_id";

    /* renamed from: k  reason: collision with root package name */
    private final String f698k = "immediate_max_log_id";

    /* renamed from: l  reason: collision with root package name */
    private final String f699l = "on_date";
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final Context f700m;
    /* access modifiers changed from: private */
    public final String n;
    private final List<String> o = new ArrayList();
    /* access modifiers changed from: private */
    public long p;
    /* access modifiers changed from: private */
    public AtomicLong q = new AtomicLong(0);
    /* access modifiers changed from: private */
    public AtomicLong r = new AtomicLong(0);
    /* access modifiers changed from: private */
    public AtomicLong s = new AtomicLong(0);
    /* access modifiers changed from: private */
    public long t;
    /* access modifiers changed from: private */
    public long u;
    /* access modifiers changed from: private */
    public long v;
    /* access modifiers changed from: private */
    public long w;
    /* access modifiers changed from: private */
    public long x;
    /* access modifiers changed from: private */
    public long y;
    private SharedPreferences z;

    private g(Context context, String str) {
        this.f700m = context;
        this.n = str;
    }

    private long a(EventType eventType) {
        AtomicLong atomicLong;
        switch (f.a[eventType.ordinal()]) {
            case 1:
            case 2:
                atomicLong = this.q;
                break;
            case 3:
            case 4:
                atomicLong = this.r;
                break;
            case 5:
            case 6:
                atomicLong = this.s;
                break;
            default:
                return -1;
        }
        return atomicLong.incrementAndGet();
    }

    /* access modifiers changed from: private */
    public SharedPreferences a(Context context) {
        if (this.z == null) {
            StringBuilder i2 = a.i("new_b_log_ID_");
            i2.append(b.c(context));
            i2.append("_");
            i2.append(this.n);
            this.z = context.getSharedPreferences(i2.toString(), 0);
        }
        return this.z;
    }

    public static synchronized g a(Context context, String str) {
        g gVar;
        synchronized (g.class) {
            Map<String, g> map = a;
            gVar = map.get(str);
            if (gVar == null) {
                gVar = new g(context, str);
                map.put(str, gVar);
            }
        }
        return gVar;
    }

    private void a() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (d()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.p);
            String str6 = "";
            sb.append(str6);
            String sb2 = sb.toString();
            String c2 = b.c(this.f700m);
            String packageName = this.f700m.getPackageName();
            if (this.t == 0) {
                str = str6;
            } else {
                str = (this.t - 1) + str6;
            }
            if (this.u == 0) {
                str2 = str6;
            } else {
                str2 = this.u + str6;
            }
            if (this.v == 0) {
                str3 = str6;
            } else {
                str3 = (this.v - 1) + str6;
            }
            if (this.w == 0) {
                str4 = str6;
            } else {
                str4 = this.w + str6;
            }
            if (this.x == 0) {
                str5 = str6;
            } else {
                str5 = (this.x - 1) + str6;
            }
            if (this.y != 0) {
                str6 = this.y + str6;
            }
            f.e().a("701", "process_name=" + c2 + "&real_logid_min=" + str + "&real_logid_max=" + str2 + "&normal_logid_min=" + str3 + "&normal_logid_max=" + str4 + "&immediate_logid_min=" + str5 + "&immediate_logid_max=" + str6 + "&logid_day=" + sb2.substring(0, sb2.length() - 3) + "&appkey=" + this.n + "&bundleid=" + packageName);
            e();
        }
    }

    private void a(long j2, EventType eventType) {
        if (eventType == EventType.REALTIME || eventType == EventType.DT_REALTIME) {
            long j3 = this.u;
            this.u = j3 == 0 ? j2 : Math.max(j2, j3);
            long j4 = this.t;
            if (j4 != 0) {
                j2 = Math.min(j2, j4);
            }
            this.t = j2;
        } else if (eventType == EventType.NORMAL || eventType == EventType.DT_NORMAL) {
            long j5 = this.w;
            this.w = j5 == 0 ? j2 : Math.max(j2, j5);
            long j6 = this.v;
            if (j6 != 0) {
                j2 = Math.min(j2, j6);
            }
            this.v = j2;
        } else if (eventType == EventType.IMMEDIATE_MSF || eventType == EventType.IMMEDIATE_WNS) {
            long j7 = this.y;
            this.y = j7 == 0 ? j2 : Math.max(j2, j7);
            long j8 = this.x;
            if (j8 != 0) {
                j2 = Math.min(j2, j8);
            }
            this.x = j2;
        }
    }

    private void b() {
        b = com.tencent.beacon.a.b.a.a().a(113);
        this.o.add("rqd_model");
        this.o.add("rqd_appresumed");
        c();
    }

    private void c() {
        SharedPreferences a2 = a(this.f700m);
        this.p = a2.getLong("on_date", 0);
        this.r.set(a2.getLong("realtime_log_id", 0));
        this.q.set(a2.getLong("normal_log_id", 0));
        this.s.set(a2.getLong("immediate_log_id", 0));
        this.t = a2.getLong("realtime_min_log_id", 0);
        this.u = a2.getLong("realtime_max_log_id", 0);
        this.v = a2.getLong("normal_min_log_id", 0);
        this.w = a2.getLong("normal_max_log_id", 0);
        this.x = a2.getLong("immediate_min_log_id", 0);
        this.y = a2.getLong("immediate_max_log_id", 0);
        c.a(a.f(a.i("[LogID "), this.n, "]"), " load LogID from sp, date: %s , realtime: %d, normal: %d, immediate: %d", Long.valueOf(this.p), Long.valueOf(this.r.get()), Long.valueOf(this.q.get()), Long.valueOf(this.s.get()));
    }

    private boolean d() {
        long c2 = com.tencent.beacon.base.util.b.c();
        long j2 = this.p;
        return j2 != 0 && !com.tencent.beacon.base.util.b.a(c2, j2);
    }

    private void e() {
        this.t = this.u + 1;
        this.v = this.w + 1;
        this.x = this.y + 1;
    }

    public synchronized String a(String str, EventType eventType) {
        if (!this.B) {
            b();
            this.B = true;
        }
        if (this.o.contains(str)) {
            return "";
        }
        long a2 = a(eventType);
        a();
        this.p = com.tencent.beacon.base.util.b.c();
        a(a2, eventType);
        c.a("[stat " + this.n + "]", "type: %s, code: %s, logID: %s.", eventType, str, Long.valueOf(a2));
        b.post(this.A);
        return a2 + "";
    }
}
