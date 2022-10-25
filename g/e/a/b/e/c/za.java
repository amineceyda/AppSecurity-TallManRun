package g.e.a.b.e.c;

public final class za implements ya {
    public static final x5 a;
    public static final x5 b;

    static {
        v5 v5Var = new v5((String) null, p5.a("com.google.android.gms.measurement"), true);
        v5Var.b("measurement.collection.event_safelist", true);
        a = v5Var.b("measurement.service.store_null_safelist", false);
        b = v5Var.b("measurement.service.store_safelist", false);
        v5Var.a("measurement.id.service.store_safelist", 0);
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
}
