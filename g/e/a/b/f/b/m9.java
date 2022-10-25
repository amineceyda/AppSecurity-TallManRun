package g.e.a.b.f.b;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzkh;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzp;
import com.tencent.raft.codegenmeta.utils.Constants;
import g.a.a.a.a;
import g.e.a.b.b.h.c;
import g.e.a.b.e.c.b7;
import g.e.a.b.e.c.bc;
import g.e.a.b.e.c.d3;
import g.e.a.b.e.c.d4;
import g.e.a.b.e.c.d8;
import g.e.a.b.e.c.e4;
import g.e.a.b.e.c.f4;
import g.e.a.b.e.c.g6;
import g.e.a.b.e.c.j7;
import g.e.a.b.e.c.l4;
import g.e.a.b.e.c.l7;
import g.e.a.b.e.c.n4;
import g.e.a.b.e.c.o4;
import g.e.a.b.e.c.p4;
import g.e.a.b.e.c.r3;
import g.e.a.b.e.c.t2;
import g.e.a.b.e.c.t3;
import g.e.a.b.e.c.u3;
import g.e.a.b.e.c.v3;
import g.e.a.b.e.c.x2;
import g.e.a.b.e.c.y3;
import g.e.a.b.e.c.z2;
import g.e.a.b.e.c.z3;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;

public final class m9 extends b9 {
    public m9(k9 k9Var) {
        super(k9Var);
    }

    public static g6 B(g6 g6Var, byte[] bArr) throws zzkh {
        Class<b7> cls = b7.class;
        b7 b7Var = b7.c;
        if (b7Var == null) {
            synchronized (cls) {
                b7Var = b7.c;
                if (b7Var == null) {
                    b7Var = j7.b(cls);
                    b7.c = b7Var;
                }
            }
        }
        if (b7Var != null) {
            Objects.requireNonNull(g6Var);
            l7 l7Var = (l7) g6Var;
            l7Var.i(bArr, 0, bArr.length, b7Var);
            return l7Var;
        }
        Objects.requireNonNull(g6Var);
        l7 l7Var2 = (l7) g6Var;
        l7Var2.i(bArr, 0, bArr.length, b7.a());
        return l7Var2;
    }

    public static List F(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            long j2 = 0;
            for (int i3 = 0; i3 < 64; i3++) {
                int i4 = (i2 * 64) + i3;
                if (i4 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i4)) {
                    j2 |= 1 << i3;
                }
            }
            arrayList.add(Long.valueOf(j2));
        }
        return arrayList;
    }

    public static boolean J(List list, int i2) {
        if (i2 >= ((d8) list).f2916d * 64) {
            return false;
        }
        return ((1 << (i2 % 64)) & ((Long) ((d8) list).get(i2 / 64)).longValue()) != 0;
    }

    public static boolean L(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static final void N(u3 u3Var, String str, Object obj) {
        List u = u3Var.u();
        int i2 = 0;
        while (true) {
            if (i2 >= u.size()) {
                i2 = -1;
                break;
            } else if (str.equals(((z3) u.get(i2)).y())) {
                break;
            } else {
                i2++;
            }
        }
        y3 w = z3.w();
        w.m(str);
        if (obj instanceof Long) {
            w.l(((Long) obj).longValue());
        }
        if (i2 >= 0) {
            if (u3Var.f2990d) {
                u3Var.f();
                u3Var.f2990d = false;
            }
            v3.B((v3) u3Var.c, i2, (z3) w.j());
            return;
        }
        u3Var.o(w);
    }

    public static final boolean l(zzau zzau, zzp zzp) {
        Objects.requireNonNull(zzau, "null reference");
        return !TextUtils.isEmpty(zzp.zzb) || !TextUtils.isEmpty(zzp.zzq);
    }

    public static final z3 m(v3 v3Var, String str) {
        for (z3 z3Var : v3Var.A()) {
            if (z3Var.y().equals(str)) {
                return z3Var;
            }
        }
        return null;
    }

    public static final Object n(v3 v3Var, String str) {
        z3 m2 = m(v3Var, str);
        if (m2 == null) {
            return null;
        }
        if (m2.P()) {
            return m2.z();
        }
        if (m2.N()) {
            return Long.valueOf(m2.v());
        }
        if (m2.L()) {
            return Double.valueOf(m2.s());
        }
        if (m2.u() <= 0) {
            return null;
        }
        List<z3> A = m2.A();
        ArrayList arrayList = new ArrayList();
        for (z3 z3Var : A) {
            if (z3Var != null) {
                Bundle bundle = new Bundle();
                for (z3 z3Var2 : z3Var.A()) {
                    if (z3Var2.P()) {
                        bundle.putString(z3Var2.y(), z3Var2.z());
                    } else if (z3Var2.N()) {
                        bundle.putLong(z3Var2.y(), z3Var2.v());
                    } else if (z3Var2.L()) {
                        bundle.putDouble(z3Var2.y(), z3Var2.s());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static final void q(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append("  ");
        }
    }

    public static final String r(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    public static final void s(StringBuilder sb, int i2, String str, l4 l4Var) {
        if (l4Var != null) {
            q(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            if (l4Var.t() != 0) {
                q(sb, 4);
                sb.append("results: ");
                int i3 = 0;
                for (Long l2 : l4Var.C()) {
                    int i4 = i3 + 1;
                    if (i3 != 0) {
                        sb.append(", ");
                    }
                    sb.append(l2);
                    i3 = i4;
                }
                sb.append(10);
            }
            if (l4Var.v() != 0) {
                q(sb, 4);
                sb.append("status: ");
                int i5 = 0;
                for (Long l3 : l4Var.E()) {
                    int i6 = i5 + 1;
                    if (i5 != 0) {
                        sb.append(", ");
                    }
                    sb.append(l3);
                    i5 = i6;
                }
                sb.append(10);
            }
            if (l4Var.s() != 0) {
                q(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                int i7 = 0;
                for (t3 t3Var : l4Var.B()) {
                    int i8 = i7 + 1;
                    if (i7 != 0) {
                        sb.append(", ");
                    }
                    sb.append(t3Var.z() ? Integer.valueOf(t3Var.s()) : null);
                    sb.append(Constants.KEY_INDEX_FILE_SEPARATOR);
                    sb.append(t3Var.y() ? Long.valueOf(t3Var.t()) : null);
                    i7 = i8;
                }
                sb.append("}\n");
            }
            if (l4Var.u() != 0) {
                q(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                int i9 = 0;
                for (n4 n4Var : l4Var.D()) {
                    int i10 = i9 + 1;
                    if (i9 != 0) {
                        sb.append(", ");
                    }
                    sb.append(n4Var.A() ? Integer.valueOf(n4Var.t()) : null);
                    sb.append(": [");
                    int i11 = 0;
                    for (Long longValue : n4Var.x()) {
                        long longValue2 = longValue.longValue();
                        int i12 = i11 + 1;
                        if (i11 != 0) {
                            sb.append(", ");
                        }
                        sb.append(longValue2);
                        i11 = i12;
                    }
                    sb.append("]");
                    i9 = i10;
                }
                sb.append("}\n");
            }
            q(sb, 3);
            sb.append("}\n");
        }
    }

    public static final void t(StringBuilder sb, int i2, String str, Object obj) {
        if (obj != null) {
            q(sb, i2 + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    public static final void u(StringBuilder sb, int i2, String str, x2 x2Var) {
        if (x2Var != null) {
            q(sb, i2);
            sb.append(str);
            sb.append(" {\n");
            if (x2Var.y()) {
                int D = x2Var.D();
                t(sb, i2, "comparison_type", D != 1 ? D != 2 ? D != 3 ? D != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
            }
            if (x2Var.A()) {
                t(sb, i2, "match_as_float", Boolean.valueOf(x2Var.x()));
            }
            if (x2Var.z()) {
                t(sb, i2, "comparison_value", x2Var.u());
            }
            if (x2Var.C()) {
                t(sb, i2, "min_comparison_value", x2Var.w());
            }
            if (x2Var.B()) {
                t(sb, i2, "max_comparison_value", x2Var.v());
            }
            q(sb, i2);
            sb.append("}\n");
        }
    }

    public static int v(e4 e4Var, String str) {
        for (int i2 = 0; i2 < ((f4) e4Var.c).k1(); i2++) {
            if (str.equals(((f4) e4Var.c).z1(i2).x())) {
                return i2;
            }
        }
        return -1;
    }

    public final v3 A(o oVar) {
        u3 w = v3.w();
        long j2 = oVar.f3270e;
        if (w.f2990d) {
            w.f();
            w.f2990d = false;
        }
        v3.I((v3) w.c, j2);
        for (String str : oVar.f3271f.zza.keySet()) {
            y3 w2 = z3.w();
            w2.m(str);
            Object l2 = oVar.f3271f.l(str);
            Objects.requireNonNull(l2, "null reference");
            H(w2, l2);
            w.o(w2);
        }
        return (v3) w.j();
    }

    public final String C(d4 d4Var) {
        StringBuilder i2 = a.i("\nbatch {\n");
        for (f4 f4Var : d4Var.v()) {
            if (f4Var != null) {
                q(i2, 1);
                i2.append("bundle {\n");
                if (f4Var.Z0()) {
                    t(i2, 1, "protocol_version", Integer.valueOf(f4Var.h1()));
                }
                t(i2, 1, Constants.Raft.PLATFORM, f4Var.B());
                if (f4Var.V0()) {
                    t(i2, 1, "gmp_version", Long.valueOf(f4Var.q1()));
                }
                if (f4Var.f1()) {
                    t(i2, 1, "uploading_gmp_version", Long.valueOf(f4Var.v1()));
                }
                if (f4Var.r0()) {
                    t(i2, 1, "dynamite_version", Long.valueOf(f4Var.o1()));
                }
                if (f4Var.o0()) {
                    t(i2, 1, "config_version", Long.valueOf(f4Var.m1()));
                }
                t(i2, 1, "gmp_app_id", f4Var.y());
                t(i2, 1, "admob_app_id", f4Var.A1());
                t(i2, 1, "app_id", f4Var.B1());
                t(i2, 1, "app_version", f4Var.t());
                if (f4Var.m0()) {
                    t(i2, 1, "app_version_major", Integer.valueOf(f4Var.R()));
                }
                t(i2, 1, "firebase_instance_id", f4Var.x());
                if (f4Var.q0()) {
                    t(i2, 1, "dev_cert_hash", Long.valueOf(f4Var.n1()));
                }
                t(i2, 1, "app_store", f4Var.s());
                if (f4Var.e1()) {
                    t(i2, 1, "upload_timestamp_millis", Long.valueOf(f4Var.u1()));
                }
                if (f4Var.c1()) {
                    t(i2, 1, "start_timestamp_millis", Long.valueOf(f4Var.t1()));
                }
                if (f4Var.U0()) {
                    t(i2, 1, "end_timestamp_millis", Long.valueOf(f4Var.p1()));
                }
                if (f4Var.Y0()) {
                    t(i2, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(f4Var.s1()));
                }
                if (f4Var.X0()) {
                    t(i2, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(f4Var.r1()));
                }
                t(i2, 1, "app_instance_id", f4Var.C1());
                t(i2, 1, "resettable_device_id", f4Var.C());
                t(i2, 1, "ds_id", f4Var.w());
                if (f4Var.W0()) {
                    t(i2, 1, "limited_ad_tracking", Boolean.valueOf(f4Var.j0()));
                }
                t(i2, 1, "os_version", f4Var.A());
                t(i2, 1, "device_model", f4Var.v());
                t(i2, 1, "user_default_language", f4Var.D());
                if (f4Var.d1()) {
                    t(i2, 1, "time_zone_offset_minutes", Integer.valueOf(f4Var.j1()));
                }
                if (f4Var.n0()) {
                    t(i2, 1, "bundle_sequential_index", Integer.valueOf(f4Var.R0()));
                }
                if (f4Var.b1()) {
                    t(i2, 1, "service_upload", Boolean.valueOf(f4Var.k0()));
                }
                t(i2, 1, "health_monitor", f4Var.z());
                if (!this.a.f3258g.u((String) null, s2.h0) && f4Var.l0() && f4Var.l1() != 0) {
                    t(i2, 1, "android_id", Long.valueOf(f4Var.l1()));
                }
                if (f4Var.a1()) {
                    t(i2, 1, "retry_counter", Integer.valueOf(f4Var.i1()));
                }
                if (f4Var.p0()) {
                    t(i2, 1, "consent_signals", f4Var.u());
                }
                List<p4> G = f4Var.G();
                if (G != null) {
                    for (p4 p4Var : G) {
                        if (p4Var != null) {
                            q(i2, 2);
                            i2.append("user_property {\n");
                            t(i2, 2, "set_timestamp_millis", p4Var.J() ? Long.valueOf(p4Var.u()) : null);
                            t(i2, 2, "name", this.a.f3264m.f(p4Var.x()));
                            t(i2, 2, "string_value", p4Var.y());
                            t(i2, 2, "int_value", p4Var.I() ? Long.valueOf(p4Var.t()) : null);
                            t(i2, 2, "double_value", p4Var.H() ? Double.valueOf(p4Var.s()) : null);
                            q(i2, 2);
                            i2.append("}\n");
                        }
                    }
                }
                List<r3> E = f4Var.E();
                if (E != null) {
                    for (r3 r3Var : E) {
                        if (r3Var != null) {
                            q(i2, 2);
                            i2.append("audience_membership {\n");
                            if (r3Var.C()) {
                                t(i2, 2, "audience_id", Integer.valueOf(r3Var.s()));
                            }
                            if (r3Var.D()) {
                                t(i2, 2, "new_audience", Boolean.valueOf(r3Var.B()));
                            }
                            s(i2, 2, "current_data", r3Var.v());
                            if (r3Var.E()) {
                                s(i2, 2, "previous_data", r3Var.w());
                            }
                            q(i2, 2);
                            i2.append("}\n");
                        }
                    }
                }
                List<v3> F = f4Var.F();
                if (F != null) {
                    for (v3 v3Var : F) {
                        if (v3Var != null) {
                            q(i2, 2);
                            i2.append("event {\n");
                            t(i2, 2, "name", this.a.f3264m.d(v3Var.z()));
                            if (v3Var.L()) {
                                t(i2, 2, "timestamp_millis", Long.valueOf(v3Var.v()));
                            }
                            if (v3Var.K()) {
                                t(i2, 2, "previous_timestamp_millis", Long.valueOf(v3Var.u()));
                            }
                            if (v3Var.J()) {
                                t(i2, 2, "count", Integer.valueOf(v3Var.s()));
                            }
                            if (v3Var.t() != 0) {
                                o(i2, 2, v3Var.A());
                            }
                            q(i2, 2);
                            i2.append("}\n");
                        }
                    }
                }
                q(i2, 1);
                i2.append("}\n");
            }
        }
        i2.append("}\n");
        return i2.toString();
    }

    public final String D(z2 z2Var) {
        StringBuilder i2 = a.i("\nproperty_filter {\n");
        if (z2Var.B()) {
            t(i2, 0, "filter_id", Integer.valueOf(z2Var.s()));
        }
        t(i2, 0, "property_name", this.a.f3264m.f(z2Var.w()));
        String r = r(z2Var.y(), z2Var.z(), z2Var.A());
        if (!r.isEmpty()) {
            t(i2, 0, "filter_type", r);
        }
        p(i2, 1, z2Var.t());
        i2.append("}\n");
        return i2.toString();
    }

    public final List E(List list, List list2) {
        int i2;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.a.d().f3139i.b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.a.d().f3139i.c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & ((1 << (num.intValue() % 64)) ^ -1)));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i3 = size2;
            i2 = size;
            size = i3;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i2);
    }

    public final Map G(Bundle bundle, boolean z) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            bc.c.c().c();
            if (!this.a.f3258g.u((String) null, s2.k0) ? (obj instanceof Bundle[]) || (obj instanceof ArrayList) || (obj instanceof Bundle) : (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (obj instanceof Parcelable[]) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(G((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            Object obj2 = arrayList2.get(i2);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(G((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(G((Bundle) obj, false));
                    }
                    hashMap.put(str, arrayList);
                }
            } else if (obj != null) {
                hashMap.put(str, obj);
            }
        }
        return hashMap;
    }

    public final void H(y3 y3Var, Object obj) {
        if (y3Var.f2990d) {
            y3Var.f();
            y3Var.f2990d = false;
        }
        z3.D((z3) y3Var.c);
        if (y3Var.f2990d) {
            y3Var.f();
            y3Var.f2990d = false;
        }
        z3.F((z3) y3Var.c);
        if (y3Var.f2990d) {
            y3Var.f();
            y3Var.f2990d = false;
        }
        z3.H((z3) y3Var.c);
        if (y3Var.f2990d) {
            y3Var.f();
            y3Var.f2990d = false;
        }
        z3.K((z3) y3Var.c);
        if (obj instanceof String) {
            y3Var.n((String) obj);
        } else if (obj instanceof Long) {
            y3Var.l(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (y3Var.f2990d) {
                y3Var.f();
                y3Var.f2990d = false;
            }
            z3.G((z3) y3Var.c, doubleValue);
        } else if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    y3 w = z3.w();
                    for (String str : bundle.keySet()) {
                        y3 w2 = z3.w();
                        w2.m(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            w2.l(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            w2.n((String) obj2);
                        } else if (obj2 instanceof Double) {
                            double doubleValue2 = ((Double) obj2).doubleValue();
                            if (w2.f2990d) {
                                w2.f();
                                w2.f2990d = false;
                            }
                            z3.G((z3) w2.c, doubleValue2);
                        }
                        if (w.f2990d) {
                            w.f();
                            w.f2990d = false;
                        }
                        z3.I((z3) w.c, (z3) w2.j());
                    }
                    if (((z3) w.c).u() > 0) {
                        arrayList.add((z3) w.j());
                    }
                }
            }
            if (y3Var.f2990d) {
                y3Var.f();
                y3Var.f2990d = false;
            }
            z3.J((z3) y3Var.c, arrayList);
        } else {
            this.a.d().f3136f.b("Ignoring invalid (type) event param value", obj);
        }
    }

    public final void I(o4 o4Var, Object obj) {
        Objects.requireNonNull(obj, "null reference");
        if (o4Var.f2990d) {
            o4Var.f();
            o4Var.f2990d = false;
        }
        p4.C((p4) o4Var.c);
        if (o4Var.f2990d) {
            o4Var.f();
            o4Var.f2990d = false;
        }
        p4.E((p4) o4Var.c);
        if (o4Var.f2990d) {
            o4Var.f();
            o4Var.f2990d = false;
        }
        p4.G((p4) o4Var.c);
        if (obj instanceof String) {
            String str = (String) obj;
            if (o4Var.f2990d) {
                o4Var.f();
                o4Var.f2990d = false;
            }
            p4.B((p4) o4Var.c, str);
        } else if (obj instanceof Long) {
            o4Var.l(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (o4Var.f2990d) {
                o4Var.f();
                o4Var.f2990d = false;
            }
            p4.F((p4) o4Var.c, doubleValue);
        } else {
            this.a.d().f3136f.b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final boolean K(long j2, long j3) {
        if (j2 == 0 || j3 <= 0) {
            return true;
        }
        Objects.requireNonNull((c) this.a.n);
        return Math.abs(System.currentTimeMillis() - j2) > j3;
    }

    public final byte[] M(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            this.a.d().f3136f.b("Failed to gzip content", e2);
            throw e2;
        }
    }

    public final boolean k() {
        return false;
    }

    public final void o(StringBuilder sb, int i2, List list) {
        if (list != null) {
            int i3 = i2 + 1;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                z3 z3Var = (z3) it.next();
                if (z3Var != null) {
                    q(sb, i3);
                    sb.append("param {\n");
                    Double d2 = null;
                    t(sb, i3, "name", z3Var.O() ? this.a.f3264m.e(z3Var.y()) : null);
                    t(sb, i3, "string_value", z3Var.P() ? z3Var.z() : null);
                    t(sb, i3, "int_value", z3Var.N() ? Long.valueOf(z3Var.v()) : null);
                    if (z3Var.L()) {
                        d2 = Double.valueOf(z3Var.s());
                    }
                    t(sb, i3, "double_value", d2);
                    if (z3Var.u() > 0) {
                        o(sb, i3, z3Var.A());
                    }
                    q(sb, i3);
                    sb.append("}\n");
                }
            }
        }
    }

    public final void p(StringBuilder sb, int i2, t2 t2Var) {
        String str;
        if (t2Var != null) {
            q(sb, i2);
            sb.append("filter {\n");
            if (t2Var.z()) {
                t(sb, i2, "complement", Boolean.valueOf(t2Var.y()));
            }
            if (t2Var.B()) {
                t(sb, i2, "param_name", this.a.f3264m.e(t2Var.w()));
            }
            if (t2Var.C()) {
                int i3 = i2 + 1;
                d3 v = t2Var.v();
                if (v != null) {
                    q(sb, i3);
                    sb.append("string_filter {\n");
                    if (v.A()) {
                        switch (v.B()) {
                            case 1:
                                str = "UNKNOWN_MATCH_TYPE";
                                break;
                            case 2:
                                str = "REGEXP";
                                break;
                            case 3:
                                str = "BEGINS_WITH";
                                break;
                            case 4:
                                str = "ENDS_WITH";
                                break;
                            case 5:
                                str = "PARTIAL";
                                break;
                            case 6:
                                str = "EXACT";
                                break;
                            default:
                                str = "IN_LIST";
                                break;
                        }
                        t(sb, i3, "match_type", str);
                    }
                    if (v.z()) {
                        t(sb, i3, "expression", v.v());
                    }
                    if (v.y()) {
                        t(sb, i3, "case_sensitive", Boolean.valueOf(v.x()));
                    }
                    if (v.s() > 0) {
                        q(sb, i3 + 1);
                        sb.append("expression_list {\n");
                        for (String append : v.w()) {
                            q(sb, i3 + 2);
                            sb.append(append);
                            sb.append("\n");
                        }
                        sb.append("}\n");
                    }
                    q(sb, i3);
                    sb.append("}\n");
                }
            }
            if (t2Var.A()) {
                u(sb, i2 + 1, "number_filter", t2Var.u());
            }
            q(sb, i2);
            sb.append("}\n");
        }
    }

    public final long w(byte[] bArr) {
        this.a.A().h();
        MessageDigest r = q9.r();
        if (r != null) {
            return q9.m0(r.digest(bArr));
        }
        this.a.d().f3136f.a("Failed to get MD5");
        return 0;
    }

    public final Bundle x(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, (String) null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                bc.c.c().c();
                ArrayList arrayList = (ArrayList) obj;
                if (this.a.f3258g.u((String) null, s2.k0)) {
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        arrayList2.add(x((Map) arrayList.get(i2), false));
                    }
                    bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    int size2 = arrayList.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        arrayList3.add(x((Map) arrayList.get(i3), false));
                    }
                    bundle.putParcelableArrayList(str, arrayList3);
                }
            }
        }
        return bundle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4.a.d().f3136f.a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Parcelable y(byte[] r5, android.os.Parcelable.Creator r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ SafeParcelReader$ParseException -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ SafeParcelReader$ParseException -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ SafeParcelReader$ParseException -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ SafeParcelReader$ParseException -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ SafeParcelReader$ParseException -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002d
        L_0x001c:
            g.e.a.b.f.b.n4 r5 = r4.a     // Catch:{ all -> 0x001a }
            g.e.a.b.f.b.f3 r5 = r5.d()     // Catch:{ all -> 0x001a }
            g.e.a.b.f.b.d3 r5 = r5.f3136f     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002d:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.m9.y(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        r1 = r0.get("_o");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzau z(g.e.a.b.e.c.b r9) {
        /*
            r8 = this;
            java.util.Map r0 = r9.c
            r1 = 1
            android.os.Bundle r0 = r8.x(r0, r1)
            java.lang.String r1 = "_o"
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L_0x001a
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L_0x001a
            java.lang.String r1 = r1.toString()
            goto L_0x001c
        L_0x001a:
            java.lang.String r1 = "app"
        L_0x001c:
            r5 = r1
            java.lang.String r1 = r9.a
            java.lang.String r1 = g.e.a.b.f.b.k5.b(r1)
            if (r1 != 0) goto L_0x0027
            java.lang.String r1 = r9.a
        L_0x0027:
            r3 = r1
            com.google.android.gms.measurement.internal.zzau r1 = new com.google.android.gms.measurement.internal.zzau
            com.google.android.gms.measurement.internal.zzas r4 = new com.google.android.gms.measurement.internal.zzas
            r4.<init>(r0)
            long r6 = r9.b
            r2 = r1
            r2.<init>(r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.m9.z(g.e.a.b.e.c.b):com.google.android.gms.measurement.internal.zzau");
    }
}
