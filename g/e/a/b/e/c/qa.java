package g.e.a.b.e.c;

import android.support.v4.media.session.PlaybackStateCompat;

public final class qa implements pa {
    public static final x5 A;
    public static final x5 B;
    public static final x5 C;
    public static final x5 D;
    public static final x5 E;
    public static final x5 F;
    public static final x5 G;
    public static final x5 H;
    public static final x5 I;
    public static final x5 a;
    public static final x5 b;
    public static final x5 c;

    /* renamed from: d  reason: collision with root package name */
    public static final x5 f3033d;

    /* renamed from: e  reason: collision with root package name */
    public static final x5 f3034e;

    /* renamed from: f  reason: collision with root package name */
    public static final x5 f3035f;

    /* renamed from: g  reason: collision with root package name */
    public static final x5 f3036g;

    /* renamed from: h  reason: collision with root package name */
    public static final x5 f3037h;

    /* renamed from: i  reason: collision with root package name */
    public static final x5 f3038i;

    /* renamed from: j  reason: collision with root package name */
    public static final x5 f3039j;

    /* renamed from: k  reason: collision with root package name */
    public static final x5 f3040k;

    /* renamed from: l  reason: collision with root package name */
    public static final x5 f3041l;

    /* renamed from: m  reason: collision with root package name */
    public static final x5 f3042m;
    public static final x5 n;
    public static final x5 o;
    public static final x5 p;
    public static final x5 q;
    public static final x5 r;
    public static final x5 s;
    public static final x5 t;
    public static final x5 u;
    public static final x5 v;
    public static final x5 w;
    public static final x5 x;
    public static final x5 y;
    public static final x5 z;

    static {
        v5 v5Var = new v5(p5.a("com.google.android.gms.measurement"));
        a = v5Var.a("measurement.ad_id_cache_time", 10000);
        b = v5Var.a("measurement.max_bundles_per_iteration", 100);
        c = v5Var.a("measurement.config.cache_time", 86400000);
        new u5(v5Var, "measurement.log_tag", "FA");
        f3033d = new u5(v5Var, "measurement.config.url_authority", "app-measurement.com");
        f3034e = new u5(v5Var, "measurement.config.url_scheme", "https");
        f3035f = v5Var.a("measurement.upload.debug_upload_interval", 1000);
        f3036g = v5Var.a("measurement.lifetimevalue.max_currency_tracked", 4);
        f3037h = v5Var.a("measurement.store.max_stored_events_per_app", 100000);
        f3038i = v5Var.a("measurement.experiment.max_ids", 50);
        f3039j = v5Var.a("measurement.audience.filter_result_max_count", 200);
        f3040k = v5Var.a("measurement.alarm_manager.minimum_interval", 60000);
        f3041l = v5Var.a("measurement.upload.minimum_delay", 500);
        f3042m = v5Var.a("measurement.monitoring.sample_period_millis", 86400000);
        n = v5Var.a("measurement.upload.realtime_upload_interval", 10000);
        o = v5Var.a("measurement.upload.refresh_blacklisted_config_interval", 604800000);
        v5Var.a("measurement.config.cache_time.service", 3600000);
        p = v5Var.a("measurement.service_client.idle_disconnect_millis", 5000);
        new u5(v5Var, "measurement.log_tag.service", "FA-SVC");
        q = v5Var.a("measurement.upload.stale_data_deletion_interval", 86400000);
        r = v5Var.a("measurement.sdk.attribution.cache.ttl", 604800000);
        s = v5Var.a("measurement.upload.backoff_period", 43200000);
        t = v5Var.a("measurement.upload.initial_upload_delay_time", 15000);
        u = v5Var.a("measurement.upload.interval", 3600000);
        v = v5Var.a("measurement.upload.max_bundle_size", PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH);
        w = v5Var.a("measurement.upload.max_bundles", 100);
        x = v5Var.a("measurement.upload.max_conversions_per_day", 500);
        y = v5Var.a("measurement.upload.max_error_events_per_day", 1000);
        z = v5Var.a("measurement.upload.max_events_per_bundle", 1000);
        A = v5Var.a("measurement.upload.max_events_per_day", 100000);
        B = v5Var.a("measurement.upload.max_public_events_per_day", 50000);
        C = v5Var.a("measurement.upload.max_queue_time", 2419200000L);
        D = v5Var.a("measurement.upload.max_realtime_events_per_day", 10);
        E = v5Var.a("measurement.upload.max_batch_size", PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH);
        F = v5Var.a("measurement.upload.retry_count", 6);
        G = v5Var.a("measurement.upload.retry_time", 1800000);
        H = new u5(v5Var, "measurement.upload.url", "https://app-measurement.com/a");
        I = v5Var.a("measurement.upload.window_interval", 3600000);
    }

    public final String A() {
        return (String) f3034e.b();
    }

    public final long B() {
        return ((Long) u.b()).longValue();
    }

    public final long C() {
        return ((Long) F.b()).longValue();
    }

    public final long D() {
        return ((Long) q.b()).longValue();
    }

    public final String E() {
        return (String) H.b();
    }

    public final long F() {
        return ((Long) G.b()).longValue();
    }

    public final long G() {
        return ((Long) z.b()).longValue();
    }

    public final long H() {
        return ((Long) C.b()).longValue();
    }

    public final long I() {
        return ((Long) v.b()).longValue();
    }

    public final long a() {
        return ((Long) f3041l.b()).longValue();
    }

    public final long b() {
        return ((Long) f3036g.b()).longValue();
    }

    public final long c() {
        return ((Long) a.b()).longValue();
    }

    public final long d() {
        return ((Long) f3039j.b()).longValue();
    }

    public final long e() {
        return ((Long) f3040k.b()).longValue();
    }

    public final long f() {
        return ((Long) n.b()).longValue();
    }

    public final long g() {
        return ((Long) f3037h.b()).longValue();
    }

    public final long h() {
        return ((Long) f3042m.b()).longValue();
    }

    public final long i() {
        return ((Long) r.b()).longValue();
    }

    public final long j() {
        return ((Long) b.b()).longValue();
    }

    public final long k() {
        return ((Long) c.b()).longValue();
    }

    public final long l() {
        return ((Long) f3035f.b()).longValue();
    }

    public final long m() {
        return ((Long) f3038i.b()).longValue();
    }

    public final long n() {
        return ((Long) I.b()).longValue();
    }

    public final long o() {
        return ((Long) A.b()).longValue();
    }

    public final long p() {
        return ((Long) D.b()).longValue();
    }

    public final long q() {
        return ((Long) w.b()).longValue();
    }

    public final long r() {
        return ((Long) s.b()).longValue();
    }

    public final long s() {
        return ((Long) B.b()).longValue();
    }

    public final long t() {
        return ((Long) o.b()).longValue();
    }

    public final long u() {
        return ((Long) x.b()).longValue();
    }

    public final String v() {
        return (String) f3033d.b();
    }

    public final long w() {
        return ((Long) t.b()).longValue();
    }

    public final long x() {
        return ((Long) E.b()).longValue();
    }

    public final long y() {
        return ((Long) p.b()).longValue();
    }

    public final long z() {
        return ((Long) y.b()).longValue();
    }
}
