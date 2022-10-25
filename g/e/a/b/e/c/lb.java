package g.e.a.b.e.c;

public final class lb implements kb {
    public static final x5 a;
    public static final x5 b;
    public static final x5 c;

    static {
        v5 v5Var = new v5(p5.a("com.google.android.gms.measurement"));
        v5Var.b("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        a = v5Var.b("measurement.audience.refresh_event_count_filters_timestamp", false);
        b = v5Var.b("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        c = v5Var.b("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    public final boolean c() {
        return true;
    }

    public final boolean j() {
        return ((Boolean) a.b()).booleanValue();
    }

    public final boolean k() {
        return ((Boolean) b.b()).booleanValue();
    }

    public final boolean l() {
        return ((Boolean) c.b()).booleanValue();
    }
}
