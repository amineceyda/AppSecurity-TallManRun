package g.e.a.b.e.c;

public final class rb implements qb {
    public static final x5 a;

    static {
        v5 v5Var = new v5(p5.a("com.google.android.gms.measurement"));
        v5Var.b("measurement.sdk.collection.enable_extend_user_property_size", true);
        v5Var.b("measurement.sdk.collection.last_deep_link_referrer2", true);
        a = v5Var.b("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        v5Var.a("measurement.id.sdk.collection.last_deep_link_referrer2", 0);
    }

    public final boolean c() {
        return ((Boolean) a.b()).booleanValue();
    }
}
