package g.e.a.b.f.b;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzkh;
import com.tencent.raft.raftframework.sla.SLAConstant;
import e.d.a;
import e.d.e;
import g.c.b.b.f;
import g.e.a.b.e.c.f3;
import g.e.a.b.e.c.h3;
import g.e.a.b.e.c.i3;
import g.e.a.b.e.c.j3;
import g.e.a.b.e.c.l3;
import g.e.a.b.e.c.t4;
import g.e.a.b.e.c.v4;
import g.e.a.b.e.c.w0;
import java.util.Map;
import java.util.Objects;

public final class g4 extends b9 implements e {

    /* renamed from: d  reason: collision with root package name */
    public final Map f3166d = new a();

    /* renamed from: e  reason: collision with root package name */
    public final Map f3167e = new a();

    /* renamed from: f  reason: collision with root package name */
    public final Map f3168f = new a();

    /* renamed from: g  reason: collision with root package name */
    public final Map f3169g = new a();

    /* renamed from: h  reason: collision with root package name */
    public final Map f3170h = new a();

    /* renamed from: i  reason: collision with root package name */
    public final e f3171i = new d4(this);

    /* renamed from: j  reason: collision with root package name */
    public final e4 f3172j = new e4(this);

    /* renamed from: k  reason: collision with root package name */
    public final Map f3173k = new a();

    public g4(k9 k9Var) {
        super(k9Var);
    }

    public static final Map y(j3 j3Var) {
        a aVar = new a();
        for (l3 l3Var : j3Var.C()) {
            aVar.put(l3Var.t(), l3Var.u());
        }
        return aVar;
    }

    public final String a(String str, String str2) {
        h();
        w(str);
        Map map = (Map) this.f3166d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    public final boolean k() {
        return false;
    }

    public final int l(String str, String str2) {
        Integer num;
        h();
        w(str);
        Map map = (Map) this.f3170h.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final j3 m(String str) {
        i();
        h();
        f.k(str);
        w(str);
        return (j3) this.f3169g.get(str);
    }

    public final boolean n(String str) {
        h();
        j3 m2 = m(str);
        if (m2 == null) {
            return false;
        }
        return m2.F();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r3 = (g.e.a.b.e.c.j3) r2.f3169g.get(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean o(java.lang.String r3) {
        /*
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.util.Map r0 = r2.f3169g
            java.lang.Object r3 = r0.get(r3)
            g.e.a.b.e.c.j3 r3 = (g.e.a.b.e.c.j3) r3
            if (r3 != 0) goto L_0x0013
            return r1
        L_0x0013:
            int r3 = r3.s()
            if (r3 == 0) goto L_0x001b
            r3 = 1
            return r3
        L_0x001b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.g4.o(java.lang.String):boolean");
    }

    public final boolean p(String str) {
        return SLAConstant.TYPE_DEPRECATED_START.equals(a(str, "measurement.upload.blacklist_internal"));
    }

    public final boolean q(String str, String str2) {
        Boolean bool;
        h();
        w(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f3168f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean r(String str, String str2) {
        Boolean bool;
        h();
        w(str);
        if (SLAConstant.TYPE_DEPRECATED_START.equals(a(str, "measurement.upload.blacklist_internal")) && q9.U(str2)) {
            return true;
        }
        if (SLAConstant.TYPE_DEPRECATED_START.equals(a(str, "measurement.upload.blacklist_public")) && q9.V(str2)) {
            return true;
        }
        Map map = (Map) this.f3167e.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean s(String str) {
        return SLAConstant.TYPE_DEPRECATED_START.equals(a(str, "measurement.upload.blacklist_public"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0341, code lost:
        if (r13.G() == false) goto L_0x034c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0343, code lost:
        r3 = java.lang.Integer.valueOf(r13.t());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x034c, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x034d, code lost:
        r12.put("filter_id", r3);
        r12.put("event_name", r13.y());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x035d, code lost:
        if (r13.H() == false) goto L_0x0368;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x035f, code lost:
        r3 = java.lang.Boolean.valueOf(r13.E());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0368, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0369, code lost:
        r12.put("session_scoped", r3);
        r12.put("data", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x037b, code lost:
        if (r5.A().insertWithOnConflict(r4, (java.lang.String) null, r12, 5) != -1) goto L_0x038e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x037d, code lost:
        r5.a.d().f3136f.b("Failed to insert event filter (got -1). appId", g.e.a.b.f.b.f3.t(r28));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x038e, code lost:
        r3 = r20;
        r1 = r23;
        r12 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0396, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:?, code lost:
        r1 = r5.a.d().f3136f;
        r3 = "Error storing event filter. appId";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x03a7, code lost:
        r0 = r0.z().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x03b3, code lost:
        if (r0.hasNext() == false) goto L_0x04a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x03b5, code lost:
        r1 = (g.e.a.b.e.c.z2) r0.next();
        r5.i();
        r5.h();
        g.c.b.b.f.k(r28);
        java.util.Objects.requireNonNull(r1, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03cf, code lost:
        if (android.text.TextUtils.isEmpty(r1.w()) == false) goto L_0x03fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03d1, code lost:
        r0 = r5.a.d().f3139i;
        r7 = g.e.a.b.f.b.f3.t(r28);
        r8 = java.lang.Integer.valueOf(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03e7, code lost:
        if (r1.B() == false) goto L_0x03f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x03e9, code lost:
        r1 = java.lang.Integer.valueOf(r1.s());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03f2, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03f3, code lost:
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r7, r8, java.lang.String.valueOf(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03fc, code lost:
        r12 = r1.i();
        r13 = new android.content.ContentValues();
        r13.put(r3, r2);
        r25 = r0;
        r13.put("audience_id", java.lang.Integer.valueOf(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0415, code lost:
        if (r1.B() == false) goto L_0x0420;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0417, code lost:
        r0 = java.lang.Integer.valueOf(r1.s());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0420, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0421, code lost:
        r13.put("filter_id", r0);
        r26 = r3;
        r13.put("property_name", r1.w());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0433, code lost:
        if (r1.C() == false) goto L_0x043e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0435, code lost:
        r0 = java.lang.Boolean.valueOf(r1.A());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x043e, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x043f, code lost:
        r13.put("session_scoped", r0);
        r13.put("data", r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0451, code lost:
        if (r5.A().insertWithOnConflict("property_filters", (java.lang.String) null, r13, 5) != -1) goto L_0x0465;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0453, code lost:
        r5.a.d().f3136f.b("Failed to insert property filter (got -1). appId", g.e.a.b.f.b.f3.t(r28));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0465, code lost:
        r0 = r25;
        r3 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x046b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:?, code lost:
        r1 = r5.a.d().f3136f;
        r3 = "Error storing property filter. appId";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0478, code lost:
        r1.c(r3, g.e.a.b.f.b.f3.t(r28), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x047b, code lost:
        r5.i();
        r5.h();
        g.c.b.b.f.k(r28);
        r0 = r5.A();
        r8 = r17;
        r0.delete("property_filters", r8, new java.lang.String[]{r2, java.lang.String.valueOf(r11)});
        r0.delete(r4, r8, new java.lang.String[]{r2, java.lang.String.valueOf(r11)});
        r17 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x04a9, code lost:
        r19 = r10;
        r3 = r20;
        r1 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0647, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        r12 = r0.z().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x029f, code lost:
        if (r12.hasNext() == false) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x02ab, code lost:
        if (((g.e.a.b.e.c.z2) r12.next()).B() != false) goto L_0x029b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x02ad, code lost:
        r0 = r5.a.d().f3139i;
        r7 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
        r8 = g.e.a.b.f.b.f3.t(r28);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        r12 = r0.y().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02cf, code lost:
        r20 = r3;
        r3 = "app_id";
        r23 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02df, code lost:
        if (r12.hasNext() == false) goto L_0x03a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        r13 = (g.e.a.b.e.c.r2) r12.next();
        r5.i();
        r5.h();
        g.c.b.b.f.k(r28);
        java.util.Objects.requireNonNull(r13, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02fb, code lost:
        if (android.text.TextUtils.isEmpty(r13.y()) == false) goto L_0x0328;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02fd, code lost:
        r0 = r5.a.d().f3139i;
        r3 = g.e.a.b.f.b.f3.t(r28);
        r7 = java.lang.Integer.valueOf(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0313, code lost:
        if (r13.G() == false) goto L_0x031e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0315, code lost:
        r8 = java.lang.Integer.valueOf(r13.t());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x031e, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x031f, code lost:
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r3, r7, java.lang.String.valueOf(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0328, code lost:
        r1 = r13.i();
        r25 = r12;
        r12 = new android.content.ContentValues();
        r12.put(r3, r2);
        r12.put("audience_id", java.lang.Integer.valueOf(r11));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean t(java.lang.String r28, byte[] r29, java.lang.String r30) {
        /*
            r27 = this;
            r1 = r27
            r2 = r28
            r3 = r30
            r27.i()
            r27.h()
            g.c.b.b.f.k(r28)
            g.e.a.b.e.c.j3 r0 = r27.u(r28, r29)
            g.e.a.b.e.c.l7 r0 = r0.n()
            r4 = r0
            g.e.a.b.e.c.i3 r4 = (g.e.a.b.e.c.i3) r4
            r1.v(r2, r4)
            g.e.a.b.e.c.o7 r0 = r4.j()
            g.e.a.b.e.c.j3 r0 = (g.e.a.b.e.c.j3) r0
            r1.x(r2, r0)
            java.util.Map r0 = r1.f3169g
            g.e.a.b.e.c.o7 r5 = r4.j()
            g.e.a.b.e.c.j3 r5 = (g.e.a.b.e.c.j3) r5
            r0.put(r2, r5)
            java.util.Map r0 = r1.f3173k
            r0.put(r2, r3)
            java.util.Map r0 = r1.f3166d
            g.e.a.b.e.c.o7 r5 = r4.j()
            g.e.a.b.e.c.j3 r5 = (g.e.a.b.e.c.j3) r5
            java.util.Map r5 = y(r5)
            r0.put(r2, r5)
            g.e.a.b.f.b.k9 r0 = r1.b
            g.e.a.b.f.b.k r5 = r0.c
            g.e.a.b.f.b.k9.I(r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            g.e.a.b.e.c.o7 r0 = r4.c
            g.e.a.b.e.c.j3 r0 = (g.e.a.b.e.c.j3) r0
            java.util.List r0 = r0.A()
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r6.<init>(r0)
            java.lang.String r7 = "app_id=? and audience_id=?"
            java.lang.String r0 = "app_id=?"
            java.lang.String r8 = "event_filters"
            java.lang.String r9 = "property_filters"
            java.lang.String r10 = "null reference"
            r12 = 0
        L_0x0068:
            int r13 = r6.size()
            if (r12 >= r13) goto L_0x01ee
            java.lang.Object r13 = r6.get(r12)
            g.e.a.b.e.c.p2 r13 = (g.e.a.b.e.c.p2) r13
            g.e.a.b.e.c.l7 r13 = r13.n()
            g.e.a.b.e.c.o2 r13 = (g.e.a.b.e.c.o2) r13
            g.e.a.b.e.c.o7 r15 = r13.c
            g.e.a.b.e.c.p2 r15 = (g.e.a.b.e.c.p2) r15
            int r15 = r15.t()
            if (r15 == 0) goto L_0x016e
            r15 = r13
            r14 = 0
        L_0x0086:
            g.e.a.b.e.c.o7 r11 = r15.c
            g.e.a.b.e.c.p2 r11 = (g.e.a.b.e.c.p2) r11
            int r11 = r11.t()
            if (r14 >= r11) goto L_0x0165
            g.e.a.b.e.c.o7 r11 = r15.c
            g.e.a.b.e.c.p2 r11 = (g.e.a.b.e.c.p2) r11
            g.e.a.b.e.c.r2 r11 = r11.w(r14)
            g.e.a.b.e.c.l7 r11 = r11.n()
            g.e.a.b.e.c.q2 r11 = (g.e.a.b.e.c.q2) r11
            g.e.a.b.e.c.l7 r16 = r11.clone()
            r3 = r16
            g.e.a.b.e.c.q2 r3 = (g.e.a.b.e.c.q2) r3
            g.e.a.b.e.c.o7 r1 = r11.c
            g.e.a.b.e.c.r2 r1 = (g.e.a.b.e.c.r2) r1
            java.lang.String r1 = r1.y()
            java.lang.String r1 = g.e.a.b.f.b.k5.b(r1)
            if (r1 == 0) goto L_0x00c9
            r16 = r4
            boolean r4 = r3.f2990d
            if (r4 == 0) goto L_0x00c0
            r3.f()
            r4 = 0
            r3.f2990d = r4
        L_0x00c0:
            g.e.a.b.e.c.o7 r4 = r3.c
            g.e.a.b.e.c.r2 r4 = (g.e.a.b.e.c.r2) r4
            g.e.a.b.e.c.r2.A(r4, r1)
            r1 = 1
            goto L_0x00cc
        L_0x00c9:
            r16 = r4
            r1 = 0
        L_0x00cc:
            r17 = r7
            r4 = 0
        L_0x00cf:
            g.e.a.b.e.c.o7 r7 = r11.c
            g.e.a.b.e.c.r2 r7 = (g.e.a.b.e.c.r2) r7
            int r7 = r7.s()
            if (r4 >= r7) goto L_0x012e
            g.e.a.b.e.c.o7 r7 = r11.c
            g.e.a.b.e.c.r2 r7 = (g.e.a.b.e.c.r2) r7
            g.e.a.b.e.c.t2 r7 = r7.w(r4)
            r18 = r11
            java.lang.String r11 = r7.w()
            r19 = r10
            java.lang.String[] r10 = g.e.a.b.f.b.l5.a
            r20 = r8
            java.lang.String[] r8 = g.e.a.b.f.b.l5.b
            java.lang.String r8 = g.e.a.b.f.b.x6.a(r11, r10, r8)
            if (r8 == 0) goto L_0x0125
            g.e.a.b.e.c.l7 r1 = r7.n()
            g.e.a.b.e.c.s2 r1 = (g.e.a.b.e.c.s2) r1
            boolean r7 = r1.f2990d
            if (r7 == 0) goto L_0x0106
            r1.f()
            r7 = 0
            r1.f2990d = r7
            goto L_0x0107
        L_0x0106:
            r7 = 0
        L_0x0107:
            g.e.a.b.e.c.o7 r10 = r1.c
            g.e.a.b.e.c.t2 r10 = (g.e.a.b.e.c.t2) r10
            g.e.a.b.e.c.t2.x(r10, r8)
            g.e.a.b.e.c.o7 r1 = r1.j()
            g.e.a.b.e.c.t2 r1 = (g.e.a.b.e.c.t2) r1
            boolean r8 = r3.f2990d
            if (r8 == 0) goto L_0x011d
            r3.f()
            r3.f2990d = r7
        L_0x011d:
            g.e.a.b.e.c.o7 r7 = r3.c
            g.e.a.b.e.c.r2 r7 = (g.e.a.b.e.c.r2) r7
            g.e.a.b.e.c.r2.B(r7, r4, r1)
            r1 = 1
        L_0x0125:
            int r4 = r4 + 1
            r11 = r18
            r10 = r19
            r8 = r20
            goto L_0x00cf
        L_0x012e:
            r20 = r8
            r19 = r10
            if (r1 == 0) goto L_0x0155
            boolean r1 = r15.f2990d
            if (r1 == 0) goto L_0x013e
            r15.f()
            r1 = 0
            r15.f2990d = r1
        L_0x013e:
            g.e.a.b.e.c.o7 r1 = r15.c
            g.e.a.b.e.c.p2 r1 = (g.e.a.b.e.c.p2) r1
            g.e.a.b.e.c.o7 r3 = r3.j()
            g.e.a.b.e.c.r2 r3 = (g.e.a.b.e.c.r2) r3
            g.e.a.b.e.c.p2.B(r1, r14, r3)
            g.e.a.b.e.c.o7 r1 = r13.j()
            g.e.a.b.e.c.p2 r1 = (g.e.a.b.e.c.p2) r1
            r6.set(r12, r1)
            r15 = r13
        L_0x0155:
            int r14 = r14 + 1
            r1 = r27
            r3 = r30
            r4 = r16
            r7 = r17
            r10 = r19
            r8 = r20
            goto L_0x0086
        L_0x0165:
            r16 = r4
            r17 = r7
            r20 = r8
            r19 = r10
            goto L_0x0177
        L_0x016e:
            r16 = r4
            r17 = r7
            r20 = r8
            r19 = r10
            r15 = r13
        L_0x0177:
            g.e.a.b.e.c.o7 r1 = r15.c
            g.e.a.b.e.c.p2 r1 = (g.e.a.b.e.c.p2) r1
            int r1 = r1.u()
            if (r1 == 0) goto L_0x01de
            r1 = 0
        L_0x0182:
            g.e.a.b.e.c.o7 r3 = r15.c
            g.e.a.b.e.c.p2 r3 = (g.e.a.b.e.c.p2) r3
            int r3 = r3.u()
            if (r1 >= r3) goto L_0x01de
            g.e.a.b.e.c.o7 r3 = r15.c
            g.e.a.b.e.c.p2 r3 = (g.e.a.b.e.c.p2) r3
            g.e.a.b.e.c.z2 r3 = r3.x(r1)
            java.lang.String r4 = r3.w()
            java.lang.String[] r7 = g.e.a.b.f.b.m5.a
            java.lang.String[] r8 = g.e.a.b.f.b.m5.b
            java.lang.String r4 = g.e.a.b.f.b.x6.a(r4, r7, r8)
            if (r4 == 0) goto L_0x01db
            g.e.a.b.e.c.l7 r3 = r3.n()
            g.e.a.b.e.c.y2 r3 = (g.e.a.b.e.c.y2) r3
            boolean r7 = r3.f2990d
            if (r7 == 0) goto L_0x01b3
            r3.f()
            r7 = 0
            r3.f2990d = r7
            goto L_0x01b4
        L_0x01b3:
            r7 = 0
        L_0x01b4:
            g.e.a.b.e.c.o7 r8 = r3.c
            g.e.a.b.e.c.z2 r8 = (g.e.a.b.e.c.z2) r8
            g.e.a.b.e.c.z2.x(r8, r4)
            boolean r4 = r15.f2990d
            if (r4 == 0) goto L_0x01c4
            r15.f()
            r15.f2990d = r7
        L_0x01c4:
            g.e.a.b.e.c.o7 r4 = r15.c
            g.e.a.b.e.c.p2 r4 = (g.e.a.b.e.c.p2) r4
            g.e.a.b.e.c.o7 r3 = r3.j()
            g.e.a.b.e.c.z2 r3 = (g.e.a.b.e.c.z2) r3
            g.e.a.b.e.c.p2.A(r4, r1, r3)
            g.e.a.b.e.c.o7 r3 = r13.j()
            g.e.a.b.e.c.p2 r3 = (g.e.a.b.e.c.p2) r3
            r6.set(r12, r3)
            r15 = r13
        L_0x01db:
            int r1 = r1 + 1
            goto L_0x0182
        L_0x01de:
            int r12 = r12 + 1
            r1 = r27
            r3 = r30
            r4 = r16
            r7 = r17
            r10 = r19
            r8 = r20
            goto L_0x0068
        L_0x01ee:
            r16 = r4
            r17 = r7
            r20 = r8
            r19 = r10
            r5.i()
            r5.h()
            g.c.b.b.f.k(r28)
            android.database.sqlite.SQLiteDatabase r1 = r5.A()
            r1.beginTransaction()
            r5.i()     // Catch:{ all -> 0x025b }
            r5.h()     // Catch:{ all -> 0x025b }
            g.c.b.b.f.k(r28)     // Catch:{ all -> 0x025b }
            android.database.sqlite.SQLiteDatabase r3 = r5.A()     // Catch:{ all -> 0x025b }
            r4 = 1
            java.lang.String[] r7 = new java.lang.String[r4]     // Catch:{ all -> 0x025b }
            r8 = 0
            r7[r8] = r2     // Catch:{ all -> 0x025b }
            r3.delete(r9, r0, r7)     // Catch:{ all -> 0x025b }
            java.lang.String[] r7 = new java.lang.String[r4]     // Catch:{ all -> 0x025b }
            r7[r8] = r2     // Catch:{ all -> 0x025b }
            r4 = r20
            r3.delete(r4, r0, r7)     // Catch:{ all -> 0x025b }
            java.util.Iterator r3 = r6.iterator()     // Catch:{ all -> 0x025b }
        L_0x0229:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x025b }
            if (r0 == 0) goto L_0x04b6
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x04b1 }
            g.e.a.b.e.c.p2 r0 = (g.e.a.b.e.c.p2) r0     // Catch:{ all -> 0x04b1 }
            r5.i()     // Catch:{ all -> 0x04b1 }
            r5.h()     // Catch:{ all -> 0x04b1 }
            g.c.b.b.f.k(r28)     // Catch:{ all -> 0x04b1 }
            r10 = r19
            java.util.Objects.requireNonNull(r0, r10)     // Catch:{ all -> 0x04b1 }
            boolean r11 = r0.C()     // Catch:{ all -> 0x04b1 }
            if (r11 != 0) goto L_0x0262
            g.e.a.b.f.b.n4 r0 = r5.a     // Catch:{ all -> 0x025b }
            g.e.a.b.f.b.f3 r0 = r0.d()     // Catch:{ all -> 0x025b }
            g.e.a.b.f.b.d3 r0 = r0.f3139i     // Catch:{ all -> 0x025b }
            java.lang.String r7 = "Audience with no ID. appId"
            java.lang.Object r8 = g.e.a.b.f.b.f3.t(r28)     // Catch:{ all -> 0x025b }
            r0.b(r7, r8)     // Catch:{ all -> 0x025b }
            goto L_0x02bf
        L_0x025b:
            r0 = move-exception
            r3 = r27
            r23 = r1
            goto L_0x064a
        L_0x0262:
            int r11 = r0.s()     // Catch:{ all -> 0x04b1 }
            java.util.List r12 = r0.y()     // Catch:{ all -> 0x04b1 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x04b1 }
        L_0x026e:
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x04b1 }
            if (r13 == 0) goto L_0x0293
            java.lang.Object r13 = r12.next()     // Catch:{ all -> 0x025b }
            g.e.a.b.e.c.r2 r13 = (g.e.a.b.e.c.r2) r13     // Catch:{ all -> 0x025b }
            boolean r13 = r13.G()     // Catch:{ all -> 0x025b }
            if (r13 != 0) goto L_0x026e
            g.e.a.b.f.b.n4 r0 = r5.a     // Catch:{ all -> 0x025b }
            g.e.a.b.f.b.f3 r0 = r0.d()     // Catch:{ all -> 0x025b }
            g.e.a.b.f.b.d3 r0 = r0.f3139i     // Catch:{ all -> 0x025b }
            java.lang.String r7 = "Event filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r8 = g.e.a.b.f.b.f3.t(r28)     // Catch:{ all -> 0x025b }
        L_0x028e:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x025b }
            goto L_0x02bc
        L_0x0293:
            java.util.List r12 = r0.z()     // Catch:{ all -> 0x04b1 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x04b1 }
        L_0x029b:
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x04b1 }
            if (r13 == 0) goto L_0x02c3
            java.lang.Object r13 = r12.next()     // Catch:{ all -> 0x025b }
            g.e.a.b.e.c.z2 r13 = (g.e.a.b.e.c.z2) r13     // Catch:{ all -> 0x025b }
            boolean r13 = r13.B()     // Catch:{ all -> 0x025b }
            if (r13 != 0) goto L_0x029b
            g.e.a.b.f.b.n4 r0 = r5.a     // Catch:{ all -> 0x025b }
            g.e.a.b.f.b.f3 r0 = r0.d()     // Catch:{ all -> 0x025b }
            g.e.a.b.f.b.d3 r0 = r0.f3139i     // Catch:{ all -> 0x025b }
            java.lang.String r7 = "Property filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r8 = g.e.a.b.f.b.f3.t(r28)     // Catch:{ all -> 0x025b }
            goto L_0x028e
        L_0x02bc:
            r0.c(r7, r8, r11)     // Catch:{ all -> 0x025b }
        L_0x02bf:
            r19 = r10
            goto L_0x0229
        L_0x02c3:
            java.util.List r12 = r0.y()     // Catch:{ all -> 0x04b1 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x04b1 }
        L_0x02cb:
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x04b1 }
            java.lang.String r14 = "data"
            java.lang.String r15 = "session_scoped"
            java.lang.String r7 = "filter_id"
            java.lang.String r8 = "audience_id"
            r20 = r3
            java.lang.String r3 = "app_id"
            r21 = -1
            r23 = r1
            if (r13 == 0) goto L_0x03a7
            java.lang.Object r13 = r12.next()     // Catch:{ all -> 0x0647 }
            g.e.a.b.e.c.r2 r13 = (g.e.a.b.e.c.r2) r13     // Catch:{ all -> 0x0647 }
            r5.i()     // Catch:{ all -> 0x0647 }
            r5.h()     // Catch:{ all -> 0x0647 }
            g.c.b.b.f.k(r28)     // Catch:{ all -> 0x0647 }
            java.util.Objects.requireNonNull(r13, r10)     // Catch:{ all -> 0x0647 }
            java.lang.String r24 = r13.y()     // Catch:{ all -> 0x0647 }
            boolean r24 = android.text.TextUtils.isEmpty(r24)     // Catch:{ all -> 0x0647 }
            if (r24 == 0) goto L_0x0328
            g.e.a.b.f.b.n4 r0 = r5.a     // Catch:{ all -> 0x0647 }
            g.e.a.b.f.b.f3 r0 = r0.d()     // Catch:{ all -> 0x0647 }
            g.e.a.b.f.b.d3 r0 = r0.f3139i     // Catch:{ all -> 0x0647 }
            java.lang.String r1 = "Event filter had no event name. Audience definition ignored. appId, audienceId, filterId"
            java.lang.Object r3 = g.e.a.b.f.b.f3.t(r28)     // Catch:{ all -> 0x0647 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0647 }
            boolean r8 = r13.G()     // Catch:{ all -> 0x0647 }
            if (r8 == 0) goto L_0x031e
            int r8 = r13.t()     // Catch:{ all -> 0x0647 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0647 }
            goto L_0x031f
        L_0x031e:
            r8 = 0
        L_0x031f:
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0647 }
            r0.d(r1, r3, r7, r8)     // Catch:{ all -> 0x0647 }
            goto L_0x047b
        L_0x0328:
            byte[] r1 = r13.i()     // Catch:{ all -> 0x0647 }
            r25 = r12
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ all -> 0x0647 }
            r12.<init>()     // Catch:{ all -> 0x0647 }
            r12.put(r3, r2)     // Catch:{ all -> 0x0647 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0647 }
            r12.put(r8, r3)     // Catch:{ all -> 0x0647 }
            boolean r3 = r13.G()     // Catch:{ all -> 0x0647 }
            if (r3 == 0) goto L_0x034c
            int r3 = r13.t()     // Catch:{ all -> 0x0647 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0647 }
            goto L_0x034d
        L_0x034c:
            r3 = 0
        L_0x034d:
            r12.put(r7, r3)     // Catch:{ all -> 0x0647 }
            java.lang.String r3 = "event_name"
            java.lang.String r7 = r13.y()     // Catch:{ all -> 0x0647 }
            r12.put(r3, r7)     // Catch:{ all -> 0x0647 }
            boolean r3 = r13.H()     // Catch:{ all -> 0x0647 }
            if (r3 == 0) goto L_0x0368
            boolean r3 = r13.E()     // Catch:{ all -> 0x0647 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0647 }
            goto L_0x0369
        L_0x0368:
            r3 = 0
        L_0x0369:
            r12.put(r15, r3)     // Catch:{ all -> 0x0647 }
            r12.put(r14, r1)     // Catch:{ all -> 0x0647 }
            android.database.sqlite.SQLiteDatabase r1 = r5.A()     // Catch:{ SQLiteException -> 0x0396 }
            r3 = 5
            r7 = 0
            long r12 = r1.insertWithOnConflict(r4, r7, r12, r3)     // Catch:{ SQLiteException -> 0x0396 }
            int r1 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r1 != 0) goto L_0x038e
            g.e.a.b.f.b.n4 r1 = r5.a     // Catch:{ SQLiteException -> 0x0396 }
            g.e.a.b.f.b.f3 r1 = r1.d()     // Catch:{ SQLiteException -> 0x0396 }
            g.e.a.b.f.b.d3 r1 = r1.f3136f     // Catch:{ SQLiteException -> 0x0396 }
            java.lang.String r3 = "Failed to insert event filter (got -1). appId"
            java.lang.Object r7 = g.e.a.b.f.b.f3.t(r28)     // Catch:{ SQLiteException -> 0x0396 }
            r1.b(r3, r7)     // Catch:{ SQLiteException -> 0x0396 }
        L_0x038e:
            r3 = r20
            r1 = r23
            r12 = r25
            goto L_0x02cb
        L_0x0396:
            r0 = move-exception
            g.e.a.b.f.b.n4 r1 = r5.a     // Catch:{ all -> 0x0647 }
            g.e.a.b.f.b.f3 r1 = r1.d()     // Catch:{ all -> 0x0647 }
            g.e.a.b.f.b.d3 r1 = r1.f3136f     // Catch:{ all -> 0x0647 }
            java.lang.String r3 = "Error storing event filter. appId"
        L_0x03a1:
            java.lang.Object r7 = g.e.a.b.f.b.f3.t(r28)     // Catch:{ all -> 0x0647 }
            goto L_0x0478
        L_0x03a7:
            java.util.List r0 = r0.z()     // Catch:{ all -> 0x0647 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0647 }
        L_0x03af:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0647 }
            if (r1 == 0) goto L_0x04a9
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0647 }
            g.e.a.b.e.c.z2 r1 = (g.e.a.b.e.c.z2) r1     // Catch:{ all -> 0x0647 }
            r5.i()     // Catch:{ all -> 0x0647 }
            r5.h()     // Catch:{ all -> 0x0647 }
            g.c.b.b.f.k(r28)     // Catch:{ all -> 0x0647 }
            java.util.Objects.requireNonNull(r1, r10)     // Catch:{ all -> 0x0647 }
            java.lang.String r12 = r1.w()     // Catch:{ all -> 0x0647 }
            boolean r12 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0647 }
            if (r12 == 0) goto L_0x03fc
            g.e.a.b.f.b.n4 r0 = r5.a     // Catch:{ all -> 0x0647 }
            g.e.a.b.f.b.f3 r0 = r0.d()     // Catch:{ all -> 0x0647 }
            g.e.a.b.f.b.d3 r0 = r0.f3139i     // Catch:{ all -> 0x0647 }
            java.lang.String r3 = "Property filter had no property name. Audience definition ignored. appId, audienceId, filterId"
            java.lang.Object r7 = g.e.a.b.f.b.f3.t(r28)     // Catch:{ all -> 0x0647 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0647 }
            boolean r12 = r1.B()     // Catch:{ all -> 0x0647 }
            if (r12 == 0) goto L_0x03f2
            int r1 = r1.s()     // Catch:{ all -> 0x0647 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0647 }
            goto L_0x03f3
        L_0x03f2:
            r1 = 0
        L_0x03f3:
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0647 }
            r0.d(r3, r7, r8, r1)     // Catch:{ all -> 0x0647 }
            goto L_0x047b
        L_0x03fc:
            byte[] r12 = r1.i()     // Catch:{ all -> 0x0647 }
            android.content.ContentValues r13 = new android.content.ContentValues     // Catch:{ all -> 0x0647 }
            r13.<init>()     // Catch:{ all -> 0x0647 }
            r13.put(r3, r2)     // Catch:{ all -> 0x0647 }
            r25 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0647 }
            r13.put(r8, r0)     // Catch:{ all -> 0x0647 }
            boolean r0 = r1.B()     // Catch:{ all -> 0x0647 }
            if (r0 == 0) goto L_0x0420
            int r0 = r1.s()     // Catch:{ all -> 0x0647 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0647 }
            goto L_0x0421
        L_0x0420:
            r0 = 0
        L_0x0421:
            r13.put(r7, r0)     // Catch:{ all -> 0x0647 }
            java.lang.String r0 = "property_name"
            r26 = r3
            java.lang.String r3 = r1.w()     // Catch:{ all -> 0x0647 }
            r13.put(r0, r3)     // Catch:{ all -> 0x0647 }
            boolean r0 = r1.C()     // Catch:{ all -> 0x0647 }
            if (r0 == 0) goto L_0x043e
            boolean r0 = r1.A()     // Catch:{ all -> 0x0647 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0647 }
            goto L_0x043f
        L_0x043e:
            r0 = 0
        L_0x043f:
            r13.put(r15, r0)     // Catch:{ all -> 0x0647 }
            r13.put(r14, r12)     // Catch:{ all -> 0x0647 }
            android.database.sqlite.SQLiteDatabase r0 = r5.A()     // Catch:{ SQLiteException -> 0x046b }
            r1 = 0
            r3 = 5
            long r12 = r0.insertWithOnConflict(r9, r1, r13, r3)     // Catch:{ SQLiteException -> 0x046b }
            int r0 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r0 != 0) goto L_0x0465
            g.e.a.b.f.b.n4 r0 = r5.a     // Catch:{ SQLiteException -> 0x046b }
            g.e.a.b.f.b.f3 r0 = r0.d()     // Catch:{ SQLiteException -> 0x046b }
            g.e.a.b.f.b.d3 r0 = r0.f3136f     // Catch:{ SQLiteException -> 0x046b }
            java.lang.String r1 = "Failed to insert property filter (got -1). appId"
            java.lang.Object r3 = g.e.a.b.f.b.f3.t(r28)     // Catch:{ SQLiteException -> 0x046b }
            r0.b(r1, r3)     // Catch:{ SQLiteException -> 0x046b }
            goto L_0x047b
        L_0x0465:
            r0 = r25
            r3 = r26
            goto L_0x03af
        L_0x046b:
            r0 = move-exception
            g.e.a.b.f.b.n4 r1 = r5.a     // Catch:{ all -> 0x0647 }
            g.e.a.b.f.b.f3 r1 = r1.d()     // Catch:{ all -> 0x0647 }
            g.e.a.b.f.b.d3 r1 = r1.f3136f     // Catch:{ all -> 0x0647 }
            java.lang.String r3 = "Error storing property filter. appId"
            goto L_0x03a1
        L_0x0478:
            r1.c(r3, r7, r0)     // Catch:{ all -> 0x0647 }
        L_0x047b:
            r5.i()     // Catch:{ all -> 0x0647 }
            r5.h()     // Catch:{ all -> 0x0647 }
            g.c.b.b.f.k(r28)     // Catch:{ all -> 0x0647 }
            android.database.sqlite.SQLiteDatabase r0 = r5.A()     // Catch:{ all -> 0x0647 }
            r1 = 2
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ all -> 0x0647 }
            r7 = 0
            r3[r7] = r2     // Catch:{ all -> 0x0647 }
            java.lang.String r8 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0647 }
            r12 = 1
            r3[r12] = r8     // Catch:{ all -> 0x0647 }
            r8 = r17
            r0.delete(r9, r8, r3)     // Catch:{ all -> 0x0647 }
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x0647 }
            r1[r7] = r2     // Catch:{ all -> 0x0647 }
            java.lang.String r3 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0647 }
            r1[r12] = r3     // Catch:{ all -> 0x0647 }
            r0.delete(r4, r8, r1)     // Catch:{ all -> 0x0647 }
            r17 = r8
        L_0x04a9:
            r19 = r10
            r3 = r20
            r1 = r23
            goto L_0x0229
        L_0x04b1:
            r0 = move-exception
            r23 = r1
            goto L_0x0648
        L_0x04b6:
            r23 = r1
            r1 = 0
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0647 }
            r0.<init>()     // Catch:{ all -> 0x0647 }
            java.util.Iterator r3 = r6.iterator()     // Catch:{ all -> 0x0647 }
        L_0x04c2:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0647 }
            if (r4 == 0) goto L_0x04e2
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0647 }
            g.e.a.b.e.c.p2 r4 = (g.e.a.b.e.c.p2) r4     // Catch:{ all -> 0x0647 }
            boolean r6 = r4.C()     // Catch:{ all -> 0x0647 }
            if (r6 == 0) goto L_0x04dd
            int r4 = r4.s()     // Catch:{ all -> 0x0647 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0647 }
            goto L_0x04de
        L_0x04dd:
            r7 = r1
        L_0x04de:
            r0.add(r7)     // Catch:{ all -> 0x0647 }
            goto L_0x04c2
        L_0x04e2:
            g.c.b.b.f.k(r28)     // Catch:{ all -> 0x0647 }
            r5.i()     // Catch:{ all -> 0x0647 }
            r5.h()     // Catch:{ all -> 0x0647 }
            android.database.sqlite.SQLiteDatabase r1 = r5.A()     // Catch:{ all -> 0x0647 }
            r3 = 1
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x058e }
            r3 = 0
            r4[r3] = r2     // Catch:{ SQLiteException -> 0x058e }
            java.lang.String r3 = "select count(1) from audience_filter_values where app_id=?"
            long r3 = r5.v(r3, r4)     // Catch:{ SQLiteException -> 0x058e }
            g.e.a.b.f.b.n4 r5 = r5.a     // Catch:{ all -> 0x0647 }
            g.e.a.b.f.b.f r5 = r5.f3258g     // Catch:{ all -> 0x0647 }
            r6 = 2000(0x7d0, float:2.803E-42)
            g.e.a.b.f.b.r2 r7 = g.e.a.b.f.b.s2.F     // Catch:{ all -> 0x0647 }
            int r5 = r5.n(r2, r7)     // Catch:{ all -> 0x0647 }
            int r5 = java.lang.Math.min(r6, r5)     // Catch:{ all -> 0x0647 }
            r6 = 0
            int r5 = java.lang.Math.max(r6, r5)     // Catch:{ all -> 0x0647 }
            long r6 = (long) r5     // Catch:{ all -> 0x0647 }
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x0517
            goto L_0x05a0
        L_0x0517:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0647 }
            r3.<init>()     // Catch:{ all -> 0x0647 }
            r4 = 0
        L_0x051d:
            int r6 = r0.size()     // Catch:{ all -> 0x0647 }
            if (r4 >= r6) goto L_0x0539
            java.lang.Object r6 = r0.get(r4)     // Catch:{ all -> 0x0647 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x0647 }
            if (r6 == 0) goto L_0x05a0
            int r6 = r6.intValue()     // Catch:{ all -> 0x0647 }
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x0647 }
            r3.add(r6)     // Catch:{ all -> 0x0647 }
            int r4 = r4 + 1
            goto L_0x051d
        L_0x0539:
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r3)     // Catch:{ all -> 0x0647 }
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0647 }
            int r3 = r3.length()     // Catch:{ all -> 0x0647 }
            r4 = 2
            int r3 = r3 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0647 }
            r4.<init>(r3)     // Catch:{ all -> 0x0647 }
            java.lang.String r3 = "("
            r4.append(r3)     // Catch:{ all -> 0x0647 }
            r4.append(r0)     // Catch:{ all -> 0x0647 }
            java.lang.String r0 = ")"
            r4.append(r0)     // Catch:{ all -> 0x0647 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0647 }
            java.lang.String r3 = "audience_filter_values"
            int r4 = r0.length()     // Catch:{ all -> 0x0647 }
            int r4 = r4 + 140
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0647 }
            r6.<init>(r4)     // Catch:{ all -> 0x0647 }
            java.lang.String r4 = "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in "
            r6.append(r4)     // Catch:{ all -> 0x0647 }
            r6.append(r0)     // Catch:{ all -> 0x0647 }
            java.lang.String r0 = " order by rowid desc limit -1 offset ?)"
            r6.append(r0)     // Catch:{ all -> 0x0647 }
            r4 = 2
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch:{ all -> 0x0647 }
            r4 = 0
            r0[r4] = r2     // Catch:{ all -> 0x0647 }
            java.lang.String r4 = java.lang.Integer.toString(r5)     // Catch:{ all -> 0x0647 }
            r5 = 1
            r0[r5] = r4     // Catch:{ all -> 0x0647 }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x0647 }
            r1.delete(r3, r4, r0)     // Catch:{ all -> 0x0647 }
            goto L_0x05a0
        L_0x058e:
            r0 = move-exception
            g.e.a.b.f.b.n4 r1 = r5.a     // Catch:{ all -> 0x0647 }
            g.e.a.b.f.b.f3 r1 = r1.d()     // Catch:{ all -> 0x0647 }
            g.e.a.b.f.b.d3 r1 = r1.f3136f     // Catch:{ all -> 0x0647 }
            java.lang.String r3 = "Database error querying filters. appId"
            java.lang.Object r4 = g.e.a.b.f.b.f3.t(r28)     // Catch:{ all -> 0x0647 }
            r1.c(r3, r4, r0)     // Catch:{ all -> 0x0647 }
        L_0x05a0:
            r23.setTransactionSuccessful()     // Catch:{ all -> 0x0647 }
            r23.endTransaction()
            r1 = r16
            boolean r0 = r1.f2990d     // Catch:{ RuntimeException -> 0x05c6 }
            if (r0 == 0) goto L_0x05b2
            r1.f()     // Catch:{ RuntimeException -> 0x05c6 }
            r3 = 0
            r1.f2990d = r3     // Catch:{ RuntimeException -> 0x05c6 }
        L_0x05b2:
            g.e.a.b.e.c.o7 r0 = r1.c     // Catch:{ RuntimeException -> 0x05c6 }
            g.e.a.b.e.c.j3 r0 = (g.e.a.b.e.c.j3) r0     // Catch:{ RuntimeException -> 0x05c6 }
            g.e.a.b.e.c.j3.E(r0)     // Catch:{ RuntimeException -> 0x05c6 }
            g.e.a.b.e.c.o7 r0 = r1.j()     // Catch:{ RuntimeException -> 0x05c6 }
            g.e.a.b.e.c.j3 r0 = (g.e.a.b.e.c.j3) r0     // Catch:{ RuntimeException -> 0x05c6 }
            byte[] r0 = r0.i()     // Catch:{ RuntimeException -> 0x05c6 }
            r3 = r27
            goto L_0x05dc
        L_0x05c6:
            r0 = move-exception
            r3 = r27
            g.e.a.b.f.b.n4 r4 = r3.a
            g.e.a.b.f.b.f3 r4 = r4.d()
            g.e.a.b.f.b.d3 r4 = r4.f3139i
            java.lang.Object r5 = g.e.a.b.f.b.f3.t(r28)
            java.lang.String r6 = "Unable to serialize reduced-size config. Storing full config instead. appId"
            r4.c(r6, r5, r0)
            r0 = r29
        L_0x05dc:
            g.e.a.b.f.b.k9 r4 = r3.b
            g.e.a.b.f.b.k r4 = r4.c
            g.e.a.b.f.b.k9.I(r4)
            g.c.b.b.f.k(r28)
            r4.h()
            r4.i()
            android.content.ContentValues r5 = new android.content.ContentValues
            r5.<init>()
            java.lang.String r6 = "remote_config"
            r5.put(r6, r0)
            java.lang.String r0 = "config_last_modified_time"
            r6 = r30
            r5.put(r0, r6)
            android.database.sqlite.SQLiteDatabase r0 = r4.A()     // Catch:{ SQLiteException -> 0x0628 }
            r6 = 1
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0628 }
            r6 = 0
            r7[r6] = r2     // Catch:{ SQLiteException -> 0x0628 }
            java.lang.String r6 = "apps"
            java.lang.String r8 = "app_id = ?"
            int r0 = r0.update(r6, r5, r8, r7)     // Catch:{ SQLiteException -> 0x0628 }
            long r5 = (long) r0     // Catch:{ SQLiteException -> 0x0628 }
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x063a
            g.e.a.b.f.b.n4 r0 = r4.a     // Catch:{ SQLiteException -> 0x0628 }
            g.e.a.b.f.b.f3 r0 = r0.d()     // Catch:{ SQLiteException -> 0x0628 }
            g.e.a.b.f.b.d3 r0 = r0.f3136f     // Catch:{ SQLiteException -> 0x0628 }
            java.lang.String r5 = "Failed to update remote config (got 0). appId"
            java.lang.Object r6 = g.e.a.b.f.b.f3.t(r28)     // Catch:{ SQLiteException -> 0x0628 }
            r0.b(r5, r6)     // Catch:{ SQLiteException -> 0x0628 }
            goto L_0x063a
        L_0x0628:
            r0 = move-exception
            g.e.a.b.f.b.n4 r4 = r4.a
            g.e.a.b.f.b.f3 r4 = r4.d()
            g.e.a.b.f.b.d3 r4 = r4.f3136f
            java.lang.Object r5 = g.e.a.b.f.b.f3.t(r28)
            java.lang.String r6 = "Error storing remote config. appId"
            r4.c(r6, r5, r0)
        L_0x063a:
            java.util.Map r0 = r3.f3169g
            g.e.a.b.e.c.o7 r1 = r1.j()
            g.e.a.b.e.c.j3 r1 = (g.e.a.b.e.c.j3) r1
            r0.put(r2, r1)
            r1 = 1
            return r1
        L_0x0647:
            r0 = move-exception
        L_0x0648:
            r3 = r27
        L_0x064a:
            r23.endTransaction()
            goto L_0x064f
        L_0x064e:
            throw r0
        L_0x064f:
            goto L_0x064e
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.g4.t(java.lang.String, byte[], java.lang.String):boolean");
    }

    public final j3 u(String str, byte[] bArr) {
        f3 d2;
        if (bArr == null) {
            return j3.y();
        }
        try {
            j3 j3Var = (j3) ((i3) m9.B(j3.w(), bArr)).j();
            d3 d3Var = this.a.d().n;
            String str2 = null;
            Long valueOf = j3Var.H() ? Long.valueOf(j3Var.u()) : null;
            if (j3Var.G()) {
                str2 = j3Var.z();
            }
            d3Var.c("Parsed config. version, gmp_app_id", valueOf, str2);
            return j3Var;
        } catch (zzkh e2) {
            e = e2;
            d2 = this.a.d();
            d2.f3139i.c("Unable to merge remote config. appId", f3.t(str), e);
            return j3.y();
        } catch (RuntimeException e3) {
            e = e3;
            d2 = this.a.d();
            d2.f3139i.c("Unable to merge remote config. appId", f3.t(str), e);
            return j3.y();
        }
    }

    public final void v(String str, i3 i3Var) {
        a aVar = new a();
        a aVar2 = new a();
        a aVar3 = new a();
        for (int i2 = 0; i2 < ((j3) i3Var.c).t(); i2++) {
            f3 f3Var = (f3) ((j3) i3Var.c).v(i2).n();
            if (TextUtils.isEmpty(f3Var.m())) {
                this.a.d().f3139i.a("EventConfig contained null event name");
            } else {
                String m2 = f3Var.m();
                String b = k5.b(f3Var.m());
                if (!TextUtils.isEmpty(b)) {
                    if (f3Var.f2990d) {
                        f3Var.f();
                        f3Var.f2990d = false;
                    }
                    h3.v((h3) f3Var.c, b);
                    if (i3Var.f2990d) {
                        i3Var.f();
                        i3Var.f2990d = false;
                    }
                    j3.D((j3) i3Var.c, i2, (h3) f3Var.j());
                }
                if (((h3) f3Var.c).y() && ((h3) f3Var.c).w()) {
                    aVar.put(m2, Boolean.TRUE);
                }
                if (((h3) f3Var.c).z() && ((h3) f3Var.c).x()) {
                    aVar2.put(f3Var.m(), Boolean.TRUE);
                }
                if (((h3) f3Var.c).A()) {
                    if (f3Var.l() < 2 || f3Var.l() > 65535) {
                        this.a.d().f3139i.c("Invalid sampling rate. Event name, sample rate", f3Var.m(), Integer.valueOf(f3Var.l()));
                    } else {
                        aVar3.put(f3Var.m(), Integer.valueOf(f3Var.l()));
                    }
                }
            }
        }
        this.f3167e.put(str, aVar);
        this.f3168f.put(str, aVar2);
        this.f3170h.put(str, aVar3);
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008b, code lost:
        if (r2 != null) goto L_0x008d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w(java.lang.String r13) {
        /*
            r12 = this;
            r12.i()
            r12.h()
            g.c.b.b.f.k(r13)
            java.util.Map r0 = r12.f3169g
            java.lang.Object r0 = r0.get(r13)
            if (r0 != 0) goto L_0x00f5
            g.e.a.b.f.b.k9 r0 = r12.b
            g.e.a.b.f.b.k r0 = r0.c
            g.e.a.b.f.b.k9.I(r0)
            g.c.b.b.f.k(r13)
            r0.h()
            r0.i()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r0.A()     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            java.lang.String r3 = "remote_config"
            java.lang.String r4 = "config_last_modified_time"
            java.lang.String[] r4 = new java.lang.String[]{r3, r4}     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            r10 = 1
            java.lang.String[] r6 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            r11 = 0
            r6[r11] = r13     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            java.lang.String r3 = "apps"
            java.lang.String r5 = "app_id=?"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0066 }
            if (r3 != 0) goto L_0x0046
            goto L_0x008d
        L_0x0046:
            byte[] r3 = r2.getBlob(r11)     // Catch:{ SQLiteException -> 0x0066 }
            java.lang.String r4 = r2.getString(r10)     // Catch:{ SQLiteException -> 0x0066 }
            boolean r5 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0066 }
            if (r5 == 0) goto L_0x0068
            g.e.a.b.f.b.n4 r5 = r0.a     // Catch:{ SQLiteException -> 0x0066 }
            g.e.a.b.f.b.f3 r5 = r5.d()     // Catch:{ SQLiteException -> 0x0066 }
            g.e.a.b.f.b.d3 r5 = r5.f3136f     // Catch:{ SQLiteException -> 0x0066 }
            java.lang.String r6 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r7 = g.e.a.b.f.b.f3.t(r13)     // Catch:{ SQLiteException -> 0x0066 }
            r5.b(r6, r7)     // Catch:{ SQLiteException -> 0x0066 }
            goto L_0x0068
        L_0x0066:
            r3 = move-exception
            goto L_0x007a
        L_0x0068:
            if (r3 != 0) goto L_0x006b
            goto L_0x008d
        L_0x006b:
            android.util.Pair r5 = new android.util.Pair     // Catch:{ SQLiteException -> 0x0066 }
            r5.<init>(r3, r4)     // Catch:{ SQLiteException -> 0x0066 }
            r2.close()
            goto L_0x0091
        L_0x0074:
            r13 = move-exception
            goto L_0x00ef
        L_0x0077:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L_0x007a:
            g.e.a.b.f.b.n4 r0 = r0.a     // Catch:{ all -> 0x00ed }
            g.e.a.b.f.b.f3 r0 = r0.d()     // Catch:{ all -> 0x00ed }
            g.e.a.b.f.b.d3 r0 = r0.f3136f     // Catch:{ all -> 0x00ed }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r5 = g.e.a.b.f.b.f3.t(r13)     // Catch:{ all -> 0x00ed }
            r0.c(r4, r5, r3)     // Catch:{ all -> 0x00ed }
            if (r2 == 0) goto L_0x0090
        L_0x008d:
            r2.close()
        L_0x0090:
            r5 = r1
        L_0x0091:
            if (r5 != 0) goto L_0x00b2
            java.util.Map r0 = r12.f3166d
            r0.put(r13, r1)
            java.util.Map r0 = r12.f3167e
            r0.put(r13, r1)
            java.util.Map r0 = r12.f3168f
            r0.put(r13, r1)
            java.util.Map r0 = r12.f3169g
            r0.put(r13, r1)
            java.util.Map r0 = r12.f3173k
            r0.put(r13, r1)
            java.util.Map r0 = r12.f3170h
        L_0x00ae:
            r0.put(r13, r1)
            return
        L_0x00b2:
            java.lang.Object r0 = r5.first
            byte[] r0 = (byte[]) r0
            g.e.a.b.e.c.j3 r0 = r12.u(r13, r0)
            g.e.a.b.e.c.l7 r0 = r0.n()
            g.e.a.b.e.c.i3 r0 = (g.e.a.b.e.c.i3) r0
            r12.v(r13, r0)
            java.util.Map r1 = r12.f3166d
            g.e.a.b.e.c.o7 r2 = r0.j()
            g.e.a.b.e.c.j3 r2 = (g.e.a.b.e.c.j3) r2
            java.util.Map r2 = y(r2)
            r1.put(r13, r2)
            java.util.Map r1 = r12.f3169g
            g.e.a.b.e.c.o7 r2 = r0.j()
            g.e.a.b.e.c.j3 r2 = (g.e.a.b.e.c.j3) r2
            r1.put(r13, r2)
            g.e.a.b.e.c.o7 r0 = r0.j()
            g.e.a.b.e.c.j3 r0 = (g.e.a.b.e.c.j3) r0
            r12.x(r13, r0)
            java.util.Map r0 = r12.f3173k
            java.lang.Object r1 = r5.second
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x00ae
        L_0x00ed:
            r13 = move-exception
            r1 = r2
        L_0x00ef:
            if (r1 == 0) goto L_0x00f4
            r1.close()
        L_0x00f4:
            throw r13
        L_0x00f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.g4.w(java.lang.String):void");
    }

    public final void x(String str, j3 j3Var) {
        if (j3Var.s() != 0) {
            this.a.d().n.b("EES programs found", Integer.valueOf(j3Var.s()));
            v4 v4Var = (v4) j3Var.B().get(0);
            try {
                w0 w0Var = new w0();
                w0Var.a.f2932d.a.put("internal.remoteConfig", new a4(this, str));
                w0Var.a.f2932d.a.put("internal.appMetadata", new c4(this, str));
                w0Var.a.f2932d.a.put("internal.logger", new z3(this));
                w0Var.a(v4Var);
                this.f3171i.c(str, w0Var);
                this.a.d().n.c("EES program loaded for appId, activities", str, Integer.valueOf(v4Var.s().s()));
                for (t4 t : v4Var.s().v()) {
                    this.a.d().n.b("EES program activity", t.t());
                }
            } catch (zzd unused) {
                this.a.d().f3136f.b("Failed to load EES program. appId", str);
            }
        } else {
            e eVar = this.f3171i;
            Objects.requireNonNull(eVar);
            Objects.requireNonNull(str, "key == null");
            synchronized (eVar) {
                if (eVar.a.remove(str) != null) {
                    eVar.b--;
                }
            }
        }
    }
}
