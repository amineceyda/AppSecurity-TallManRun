package g.e.a.b.f.b;

import android.content.Context;
import com.tencent.beacon.base.net.adapter.AbstractNetAdapter;
import g.e.a.b.e.c.g5;
import g.e.a.b.e.c.p5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public final class s2 {
    public static final r2 A = a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, d0.a);
    public static final r2 B = a("measurement.upload.retry_time", 1800000L, 1800000L, e0.a);
    public static final r2 C = a("measurement.upload.retry_count", 6, 6, g0.a);
    public static final r2 D = a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, h0.a);
    public static final r2 E = a("measurement.lifetimevalue.max_currency_tracked", 4, 4, i0.a);
    public static final r2 F = a("measurement.audience.filter_result_max_count", 200, 200, k0.a);
    public static final r2 G = a("measurement.upload.max_public_user_properties", 25, 25, (q2) null);
    public static final r2 H = a("measurement.upload.max_event_name_cardinality", 500, 500, (q2) null);
    public static final r2 I = a("measurement.upload.max_public_event_params", 25, 25, (q2) null);
    public static final r2 J = a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, l0.a);
    public static final r2 K;
    public static final r2 L = a("measurement.test.string_flag", "---", "---", n0.a);
    public static final r2 M = a("measurement.test.long_flag", -1L, -1L, o0.a);
    public static final r2 N = a("measurement.test.int_flag", -2, -2, p0.a);
    public static final r2 O;
    public static final r2 P = a("measurement.experiment.max_ids", 50, 50, s0.a);
    public static final r2 Q = a("measurement.max_bundles_per_iteration", 100, 100, t0.a);
    public static final r2 R = a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, u0.a);
    public static final r2 S;
    public static final r2 T;
    public static final r2 U;
    public static final r2 V;
    public static final r2 W;
    public static final r2 X;
    public static final r2 Y;
    public static final r2 Z;
    public static final List a = Collections.synchronizedList(new ArrayList());
    public static final r2 a0;
    public static final r2 b = a("measurement.ad_id_cache_time", 10000L, 10000L, t.a);
    public static final r2 b0;
    public static final r2 c = a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, f0.a);
    public static final r2 c0;

    /* renamed from: d  reason: collision with root package name */
    public static final r2 f3327d = a("measurement.config.cache_time", 86400000L, 3600000L, w.a);
    public static final r2 d0;

    /* renamed from: e  reason: collision with root package name */
    public static final r2 f3328e = a("measurement.config.url_scheme", "https", "https", j0.a);
    public static final r2 e0;

    /* renamed from: f  reason: collision with root package name */
    public static final r2 f3329f = a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", v0.a);
    public static final r2 f0;

    /* renamed from: g  reason: collision with root package name */
    public static final r2 f3330g = a("measurement.upload.max_bundles", 100, 100, i1.a);
    public static final r2 g0;

    /* renamed from: h  reason: collision with root package name */
    public static final r2 f3331h = a("measurement.upload.max_batch_size", 65536, 65536, u1.a);
    public static final r2 h0;

    /* renamed from: i  reason: collision with root package name */
    public static final r2 f3332i = a("measurement.upload.max_bundle_size", 65536, 65536, h2.a);
    public static final r2 i0 = a("measurement.service.storage_consent_support_version", 203600, 203600, q1.a);

    /* renamed from: j  reason: collision with root package name */
    public static final r2 f3333j = a("measurement.upload.max_events_per_bundle", 1000, 1000, l2.a);
    public static final r2 j0;

    /* renamed from: k  reason: collision with root package name */
    public static final r2 f3334k = a("measurement.upload.max_events_per_day", 100000, 100000, m2.a);
    public static final r2 k0;

    /* renamed from: l  reason: collision with root package name */
    public static final r2 f3335l = a("measurement.upload.max_error_events_per_day", 1000, 1000, q0.a);
    public static final r2 l0;

    /* renamed from: m  reason: collision with root package name */
    public static final r2 f3336m = a("measurement.upload.max_public_events_per_day", 50000, 50000, c1.a);
    public static final r2 m0;
    public static final r2 n;
    public static final r2 n0;
    public static final r2 o = a("measurement.upload.max_realtime_events_per_day", 10, 10, y1.a);
    public static final r2 o0;
    public static final r2 p = a("measurement.store.max_stored_events_per_app", 100000, 100000, k2.a);
    public static final r2 p0;
    public static final r2 q = a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", n2.a);
    public static final r2 q0;
    public static final r2 r = a("measurement.upload.backoff_period", 43200000L, 43200000L, o2.a);
    public static final r2 r0;
    public static final r2 s = a("measurement.upload.window_interval", 3600000L, 3600000L, p2.a);
    public static final r2 s0;
    public static final r2 t = a("measurement.upload.interval", 3600000L, 3600000L, u.a);
    public static final r2 t0;
    public static final r2 u = a("measurement.upload.realtime_upload_interval", 10000L, 10000L, v.a);
    public static final r2 u0;
    public static final r2 v = a("measurement.upload.debug_upload_interval", 1000L, 1000L, y.a);
    public static final r2 v0;
    public static final r2 w = a("measurement.upload.minimum_delay", 500L, 500L, z.a);
    public static final r2 x = a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, a0.a);
    public static final r2 y = a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, b0.a);
    public static final r2 z = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, c0.a);

    static {
        Collections.synchronizedSet(new HashSet());
        Integer valueOf = Integer.valueOf(AbstractNetAdapter.READ_TIMEOUT);
        n = a("measurement.upload.max_conversions_per_day", valueOf, valueOf, n1.a);
        Boolean bool = Boolean.FALSE;
        K = a("measurement.test.boolean_flag", bool, bool, m0.a);
        Double valueOf2 = Double.valueOf(-3.0d);
        O = a("measurement.test.double_flag", valueOf2, valueOf2, r0.a);
        Boolean bool2 = Boolean.TRUE;
        S = a("measurement.validation.internal_limits_internal_event_params", bool2, bool2, w0.a);
        T = a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, x0.a);
        U = a("measurement.quality.checksum", bool, bool, (q2) null);
        V = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, z0.a);
        W = a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, a1.a);
        X = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, b1.a);
        Y = a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, d1.a);
        Z = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, e1.a);
        a0 = a("measurement.lifecycle.app_in_background_parameter", bool, bool, f1.a);
        b0 = a("measurement.integration.disable_firebase_instance_id", bool, bool, g1.a);
        c0 = a("measurement.collection.service.update_with_analytics_fix", bool, bool, h1.a);
        d0 = a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, j1.a);
        e0 = a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, k1.a);
        f0 = a("measurement.scheduler.task_thread.cleanup_on_exit", bool, bool, l1.a);
        g0 = a("measurement.upload.file_truncate_fix", bool, bool, m1.a);
        a("measurement.collection.synthetic_data_mitigation", bool, bool, o1.a);
        h0 = a("measurement.androidId.delete_feature", bool2, bool2, p1.a);
        a("measurement.client.click_identifier_control.dev", bool, bool, r1.a);
        a("measurement.service.click_identifier_control", bool, bool, s1.a);
        j0 = a("measurement.client.consent.gmpappid_worker_thread_fix", bool2, bool2, t1.a);
        k0 = a("measurement.module.pixie.fix_array", bool2, bool2, v1.a);
        l0 = a("measurement.adid_zero.service", bool2, bool2, w1.a);
        m0 = a("measurement.adid_zero.remove_lair_if_adidzero_false", bool2, bool2, x1.a);
        n0 = a("measurement.adid_zero.remove_lair_if_userid_cleared", bool2, bool2, a2.a);
        o0 = a("measurement.adid_zero.remove_lair_on_id_value_change_only", bool2, bool2, b2.a);
        p0 = a("measurement.adid_zero.adid_uid", bool, bool, c2.a);
        q0 = a("measurement.adid_zero.app_instance_id_fix", bool2, bool2, d2.a);
        r0 = a("measurement.service.refactor.package_side_screen", bool2, bool2, e2.a);
        s0 = a("measurement.enhanced_campaign.service", bool, bool, f2.a);
        t0 = a("measurement.enhanced_campaign.client", bool, bool, g2.a);
        u0 = a("measurement.service.store_null_safelist", bool, bool, i2.a);
        v0 = a("measurement.service.store_safelist", bool, bool, j2.a);
    }

    public static r2 a(String str, Object obj, Object obj2, q2 q2Var) {
        r2 r2Var = new r2(str, obj, obj2, q2Var);
        a.add(r2Var);
        return r2Var;
    }

    public static Map b(Context context) {
        g5 b2 = g5.b(context.getContentResolver(), p5.a("com.google.android.gms.measurement"));
        return b2 == null ? Collections.emptyMap() : b2.c();
    }
}
