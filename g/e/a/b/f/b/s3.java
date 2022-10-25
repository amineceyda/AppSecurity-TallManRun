package g.e.a.b.f.b;

import android.content.SharedPreferences;
import android.util.Pair;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class s3 extends i5 {
    public static final Pair x = new Pair("", 0L);
    public SharedPreferences c;

    /* renamed from: d  reason: collision with root package name */
    public q3 f3337d;

    /* renamed from: e  reason: collision with root package name */
    public final p3 f3338e = new p3(this, "first_open_time", 0);

    /* renamed from: f  reason: collision with root package name */
    public final p3 f3339f = new p3(this, "app_install_time", 0);

    /* renamed from: g  reason: collision with root package name */
    public final r3 f3340g = new r3(this, "app_instance_id");

    /* renamed from: h  reason: collision with root package name */
    public String f3341h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3342i;

    /* renamed from: j  reason: collision with root package name */
    public long f3343j;

    /* renamed from: k  reason: collision with root package name */
    public final p3 f3344k = new p3(this, "session_timeout", 1800000);

    /* renamed from: l  reason: collision with root package name */
    public final n3 f3345l = new n3(this, "start_new_session", true);

    /* renamed from: m  reason: collision with root package name */
    public final r3 f3346m = new r3(this, "non_personalized_ads");
    public final n3 n = new n3(this, "allow_remote_dynamite", false);
    public final p3 o = new p3(this, "last_pause_time", 0);
    public boolean p;
    public final n3 q = new n3(this, "app_backgrounded", false);
    public final n3 r = new n3(this, "deep_link_retrieval_complete", false);
    public final p3 s = new p3(this, "deep_link_retrieval_attempts", 0);
    public final r3 t = new r3(this, "firebase_feature_rollouts");
    public final r3 u = new r3(this, "deferred_attribution_cache");
    public final p3 v = new p3(this, "deferred_attribution_cache_timestamp", 0);
    public final o3 w = new o3(this);

    public s3(n4 n4Var) {
        super(n4Var);
    }

    @EnsuresNonNull.List({@EnsuresNonNull({"this.preferences"}), @EnsuresNonNull({"this.monitoringSample"})})
    public final void i() {
        SharedPreferences sharedPreferences = this.a.a.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.c = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.p = z;
        if (!z) {
            SharedPreferences.Editor edit = this.c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        f fVar = this.a.f3258g;
        this.f3337d = new q3(this, Math.max(0, ((Long) s2.c.a((Object) null)).longValue()));
    }

    public final boolean j() {
        return true;
    }

    public final SharedPreferences o() {
        h();
        k();
        Objects.requireNonNull(this.c, "null reference");
        return this.c;
    }

    public final h p() {
        h();
        return h.b(o().getString("consent_settings", "G1"));
    }

    public final Boolean q() {
        h();
        if (o().contains("measurement_enabled")) {
            return Boolean.valueOf(o().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    public final void r(Boolean bool) {
        h();
        SharedPreferences.Editor edit = o().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    public final void s(boolean z) {
        h();
        this.a.d().n.b("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = o().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    public final boolean t(long j2) {
        return j2 - this.f3344k.a() > this.o.a();
    }

    public final boolean u(int i2) {
        return h.f(i2, o().getInt("consent_source", 100));
    }
}
