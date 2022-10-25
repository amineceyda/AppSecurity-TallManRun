package com.ola.qsea.x;

import com.ola.qsea.i.e;
import com.ola.qsea.w.g;
import com.tencent.raft.codegenmeta.utils.Constants;
import org.json.JSONException;
import org.json.JSONObject;

public class a {
    public static final a a = new a();

    /* renamed from: com.ola.qsea.x.a$a  reason: collision with other inner class name */
    public enum C0003a implements com.ola.qsea.g.a<Boolean> {
        KEY_DATA_ENABLE_QSEA(com.ola.qsea.a.b.a(0), com.ola.qsea.w.d.a().v()),
        KEY_DATA_ENABLE_QSEA36(com.ola.qsea.a.b.a(1), com.ola.qsea.w.d.a().t()),
        KEY_DATA_ENABLE_USERID("userId", com.ola.qsea.w.d.a().b()),
        KEY_DATA_ENABLE_EI(com.ola.qsea.a.b.a(6), com.ola.qsea.w.d.a().C()),
        KEY_DATA_ENABLE_SI(com.ola.qsea.a.b.a(7), com.ola.qsea.w.d.a().D()),
        KEY_DATA_ENABLE_AD(com.ola.qsea.a.b.a(11), com.ola.qsea.w.d.a().w()),
        KEY_DATA_ENABLE_MC(com.ola.qsea.a.b.a(8), com.ola.qsea.w.d.a().o()),
        KEY_DATA_ENABLE_CD(com.ola.qsea.a.b.a(9), com.ola.qsea.w.d.a().l()),
        KEY_DATA_ENABLE_PROCESS_INFO("processInfo", com.ola.qsea.w.d.a().x()),
        KEY_DATA_ENABLE_AUDIT("audit", com.ola.qsea.w.d.a().s()),
        KEY_DATA_FORCE_UPDATE_QSEA(com.ola.qsea.a.b.a(10), com.ola.qsea.w.d.a().j()),
        KEY_DATA_ENABLE_REPORT("report", com.ola.qsea.w.d.a().z()),
        KEY_DATA_ENABLE_BC_ID("isBidEnable", com.ola.qsea.w.d.a().i()),
        KEY_DATA_ENABLE_OZ("oz", com.ola.qsea.w.d.a().f()),
        KEY_DATA_ENABLE_OO("oo", com.ola.qsea.w.d.a().u());
        
        public static final com.ola.qsea.i.c<Boolean> p = null;
        public final String r;
        public final boolean s;

        /* access modifiers changed from: public */
        static {
            p = new com.ola.qsea.i.b(new com.ola.qsea.g.a[0]);
        }

        /* access modifiers changed from: public */
        C0003a(String str, boolean z) {
            this.r = str;
            this.s = z;
        }

        public Boolean a() {
            return Boolean.valueOf(this.s);
        }

        public Boolean a(String str) {
            return p.a(this, g.a(str));
        }

        public String b() {
            return this.r;
        }
    }

    public enum b implements com.ola.qsea.g.a<Integer> {
        KEY_DATA_QSEA_REPORT_RATE("reportRate", com.ola.qsea.w.d.a().A()),
        KEY_DATA_QSEA_JS_TIME("jsTime", com.ola.qsea.w.d.a().c()),
        KEY_DATA_QSEA_ARDT("ardt", com.ola.qsea.w.d.a().q());
        

        /* renamed from: d  reason: collision with root package name */
        public static final com.ola.qsea.i.c<Integer> f521d = null;

        /* renamed from: f  reason: collision with root package name */
        public final String f523f;

        /* renamed from: g  reason: collision with root package name */
        public final int f524g;

        /* access modifiers changed from: public */
        static {
            f521d = new com.ola.qsea.i.d(new com.ola.qsea.g.a[0]);
        }

        /* access modifiers changed from: public */
        b(String str, int i2) {
            this.f523f = str;
            this.f524g = i2;
        }

        public Integer a() {
            return Integer.valueOf(this.f524g);
        }

        public Integer a(String str) {
            return f521d.a(this, g.a(str));
        }

        public String b() {
            return this.f523f;
        }
    }

    public enum c {
        KEY_CIPHER_KEY("key"),
        KEY_PLATFORM_ID("platformId"),
        KEY_OS_VERSION("osVersion"),
        KEY_APP_VERSION("appVersion"),
        KEY_SDK_VERSION("sdkVersion"),
        KEY_AUDIT_VERSION("auditVersion"),
        KEY_APP_KEY("appKey"),
        KEY_CONFIG_VERSION("configVersion"),
        KEY_PACKAGE_NAME("packageName");
        

        /* renamed from: k  reason: collision with root package name */
        public String f532k;

        /* access modifiers changed from: public */
        c(String str) {
            this.f532k = str;
        }

        public String a() {
            return this.f532k;
        }
    }

    public enum d implements com.ola.qsea.g.a<String> {
        KEY_DATA_VERSION(Constants.Raft.VERSION, ""),
        KEY_DATA_QSEA_REQUEST_URL("url", com.ola.qsea.w.d.a().r()),
        KEY_DATA_PEAK_TIME("peakTime", com.ola.qsea.w.d.a().g());
        

        /* renamed from: d  reason: collision with root package name */
        public static final com.ola.qsea.i.c<String> f533d = null;

        /* renamed from: f  reason: collision with root package name */
        public final String f535f;

        /* renamed from: g  reason: collision with root package name */
        public final String f536g;

        /* access modifiers changed from: public */
        static {
            f533d = new e(new com.ola.qsea.g.a[0]);
        }

        /* access modifiers changed from: public */
        d(String str, String str2) {
            this.f535f = str;
            this.f536g = str2;
        }

        public String a() {
            return this.f536g;
        }

        public String a(String str) {
            return f533d.a(this, g.a(str));
        }

        public String b() {
            return this.f535f;
        }
    }

    public static a a() {
        return a;
    }

    public String a(String str) {
        if (!str.isEmpty()) {
            return g.a.a.a.a.w(str, "/config");
        }
        return com.ola.qsea.f.a.a() + "/config";
    }

    public String a(String str, String str2) {
        com.ola.qsea.v.d b2 = com.ola.qsea.v.d.b();
        com.ola.qsea.d.c n = com.ola.qsea.d.c.n();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(c.KEY_CIPHER_KEY.a(), com.ola.qsea.a.a.b(str, com.ola.qsea.f.a.b()));
            jSONObject.put(c.KEY_PLATFORM_ID.a(), n.y());
            jSONObject.put(c.KEY_OS_VERSION.a(), n.v());
            jSONObject.put(c.KEY_APP_VERSION.a(), com.ola.qsea.d.a.a());
            jSONObject.put(c.KEY_SDK_VERSION.a(), b2.getSdkVersion());
            jSONObject.put(c.KEY_AUDIT_VERSION.a(), b2.L());
            jSONObject.put(c.KEY_APP_KEY.a(), str2);
            jSONObject.put(c.KEY_CONFIG_VERSION.a(), com.ola.qsea.w.d.a(str2).p());
            jSONObject.put(c.KEY_PACKAGE_NAME.a(), com.ola.qsea.d.a.c());
            StringBuilder sb = new StringBuilder();
            sb.append(a().b());
            sb.append(", raw content: ");
            sb.append(jSONObject.toString());
            com.ola.qsea.m.a.d(sb.toString(), new Object[0]);
            return jSONObject.toString();
        } catch (JSONException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public String b() {
        return "STRATEGY";
    }
}
