package g.e.a.b.f.b;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.raft.raftframework.sla.SLAConstant;
import g.e.a.b.b.i.b;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

public final class f extends h5 {
    public Boolean b;
    public e c = d.a;

    /* renamed from: d  reason: collision with root package name */
    public Boolean f3133d;

    public f(n4 n4Var) {
        super(n4Var);
    }

    public static final long i() {
        return ((Long) s2.D.a((Object) null)).longValue();
    }

    public final String j(String str, String str2) {
        d3 d3Var;
        String str3;
        Class<String> cls = String.class;
        try {
            String str4 = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke((Object) null, new Object[]{str, ""});
            Objects.requireNonNull(str4, "null reference");
            return str4;
        } catch (ClassNotFoundException e2) {
            e = e2;
            d3Var = this.a.d().f3136f;
            str3 = "Could not find SystemProperties class";
            d3Var.b(str3, e);
            return "";
        } catch (NoSuchMethodException e3) {
            e = e3;
            d3Var = this.a.d().f3136f;
            str3 = "Could not find SystemProperties.get() method";
            d3Var.b(str3, e);
            return "";
        } catch (IllegalAccessException e4) {
            e = e4;
            d3Var = this.a.d().f3136f;
            str3 = "Could not access SystemProperties.get()";
            d3Var.b(str3, e);
            return "";
        } catch (InvocationTargetException e5) {
            e = e5;
            d3Var = this.a.d().f3136f;
            str3 = "SystemProperties.get() threw an exception";
            d3Var.b(str3, e);
            return "";
        }
    }

    public final int k(String str) {
        return Math.max(Math.min(n(str, s2.H), 2000), 500);
    }

    public final int l() {
        q9 A = this.a.A();
        Boolean bool = A.a.y().f3158e;
        if (A.l0() < 201500) {
            return (bool == null || bool.booleanValue()) ? 25 : 100;
        }
        return 100;
    }

    public final int m(String str) {
        return Math.max(Math.min(n(str, s2.I), 100), 25);
    }

    public final int n(String str, r2 r2Var) {
        if (str != null) {
            String a = this.c.a(str, r2Var.a);
            if (!TextUtils.isEmpty(a)) {
                try {
                    return ((Integer) r2Var.a(Integer.valueOf(Integer.parseInt(a)))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Integer) r2Var.a((Object) null)).intValue();
    }

    public final int o(String str, r2 r2Var, int i2, int i3) {
        return Math.max(Math.min(n(str, r2Var), i3), i2);
    }

    public final long p() {
        b bVar = this.a.f3257f;
        return 55005;
    }

    public final long q(String str, r2 r2Var) {
        if (str != null) {
            String a = this.c.a(str, r2Var.a);
            if (!TextUtils.isEmpty(a)) {
                try {
                    return ((Long) r2Var.a(Long.valueOf(Long.parseLong(a)))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Long) r2Var.a((Object) null)).longValue();
    }

    public final Bundle r() {
        try {
            if (this.a.a.getPackageManager() == null) {
                this.a.d().f3136f.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a = b.a(this.a.a).a(this.a.a.getPackageName(), 128);
            if (a != null) {
                return a.metaData;
            }
            this.a.d().f3136f.a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            this.a.d().f3136f.b("Failed to load metadata: Package name not found", e2);
            return null;
        }
    }

    public final Boolean s(String str) {
        g.c.b.b.f.k(str);
        Bundle r = r();
        if (r == null) {
            this.a.d().f3136f.a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!r.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(r.getBoolean(str));
        }
    }

    public final boolean t() {
        Boolean s = s("google_analytics_adid_collection_enabled");
        return s == null || s.booleanValue();
    }

    public final boolean u(String str, r2 r2Var) {
        Object a;
        if (str != null) {
            String a2 = this.c.a(str, r2Var.a);
            if (!TextUtils.isEmpty(a2)) {
                a = r2Var.a(Boolean.valueOf(SLAConstant.TYPE_DEPRECATED_START.equals(a2)));
                return ((Boolean) a).booleanValue();
            }
        }
        a = r2Var.a((Object) null);
        return ((Boolean) a).booleanValue();
    }

    public final boolean v() {
        Boolean s = s("google_analytics_automatic_screen_reporting_enabled");
        return s == null || s.booleanValue();
    }

    public final boolean w() {
        b bVar = this.a.f3257f;
        Boolean s = s("firebase_analytics_collection_deactivated");
        return s != null && s.booleanValue();
    }

    public final boolean x(String str) {
        return SLAConstant.TYPE_DEPRECATED_START.equals(this.c.a(str, "measurement.event_sampling_enabled"));
    }

    public final boolean y() {
        if (this.b == null) {
            Boolean s = s("app_measurement_lite");
            this.b = s;
            if (s == null) {
                this.b = Boolean.FALSE;
            }
        }
        return this.b.booleanValue() || !this.a.f3256e;
    }
}
