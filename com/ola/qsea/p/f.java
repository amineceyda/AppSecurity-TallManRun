package com.ola.qsea.p;

import android.os.Build;
import com.ola.qsea.d.c;
import com.ola.qsea.encrypt.U;
import com.ola.qsea.l.d;
import com.ola.qsea.l.e;
import com.ola.qsea.sdk.Qsea;
import com.tencent.raft.raftframework.sla.SLAConstant;
import org.json.JSONException;
import org.json.JSONObject;

public class f {
    public static final f a = new f();

    public enum a {
        KEY_ENCRYPT_KEY("key"),
        KEY_PARAMS("params"),
        KEY_TIME("time"),
        KEY_NONCE("nonce"),
        KEY_SIGN("sign"),
        KEY_EXTRA("extra"),
        KEY_PARAMS_AD(com.ola.qsea.a.b.a(11)),
        KEY_PARAMS_PLATFORM_ID("platformId"),
        KEY_PARAMS_APP_KEY("appKey"),
        KEY_PARAMS_APP_VERSION("appVersion"),
        KEY_PARAMS_BC_ID_SRC(com.ola.qsea.t.a.a("YmVhY29uSWRTcmM=")),
        KEY_PARAMS_BRAND("brand"),
        KEY_PARAMS_CHANNEL_ID("channelId"),
        KEY_PARAMS_CD(com.ola.qsea.a.b.a(9)),
        KEY_PARAMS_EI(com.ola.qsea.a.b.a(6)),
        KEY_PARAMS_SI(com.ola.qsea.a.b.a(7)),
        KEY_PARAMS_MC(com.ola.qsea.a.b.a(8)),
        KEY_PARAMS_MODEL("model"),
        KEY_PARAMS_NETWORK_TYPE("networkType"),
        KEY_PARAMS_OD(com.ola.qsea.a.b.a(5)),
        KEY_PARAMS_OS_VERSION("osVersion"),
        KEY_PARAMS_QSEA(com.ola.qsea.a.b.a(0)),
        KEY_PARAMS_QSEA36(com.ola.qsea.a.b.a(1)),
        KEY_PARAMS_RESERVED("reserved"),
        KEY_PARAMS_SDKVERSION("sdkVersion"),
        KEY_PARAMS_TARGETSDKVERSION("targetSdkVersion"),
        KEY_PARAMS_TRUSTEDENV("audit"),
        KEY_PARAMS_USERID("userId"),
        KEY_PARAMS_DEVICE_TYPE("deviceType"),
        KEY_PARAMS_PACKAGE_ID("packageId"),
        KEY_PARAMS_SKDNAME("sdkName"),
        KEY_RESERVED_HARMONY("harmony"),
        KEY_RESERVED_CLONE("clone"),
        KEY_RESERVED_CONTAINE("containe"),
        KEY_RESERVED_OZ("oz"),
        KEY_RESERVED_OO("oo"),
        KEY_RESERVED_KELONG("kelong"),
        KEY_RESERVED_UPTIMES("uptimes"),
        KEY_RESERVED_USERS("multiUser"),
        KEY_RESERVED_BOD("bod"),
        KEY_RESERVED_BRD("brd"),
        KEY_RESERVED_DV("dv"),
        KEY_RESERVED_FAL("firstLevel"),
        KEY_RESERVED_MT("manufact"),
        KEY_RESERVED_NAME("name"),
        KEY_RESERVED_HOST("host"),
        KEY_RESERVED_KL("kernel");
        
        public String W;

        /* access modifiers changed from: public */
        a(String str) {
            this.W = str;
        }

        public String a() {
            return this.W;
        }
    }

    public enum b {
        KEY_CODE("code"),
        KEY_DATA("data"),
        KEY_DATA_QSEA_16("q16"),
        KEY_DATA_QSEA_36("q36");
        

        /* renamed from: f  reason: collision with root package name */
        public String f484f;

        /* access modifiers changed from: public */
        b(String str) {
            this.f484f = str;
        }

        public static Qsea a(String str) {
            return new Qsea(KEY_DATA_QSEA_16.a(str, new b[0]), KEY_DATA_QSEA_36.a(str, new b[0]));
        }

        public String a() {
            return this.f484f;
        }

        public String a(String str, b... bVarArr) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                for (b bVar : bVarArr) {
                    if (jSONObject == null) {
                        return "";
                    }
                    jSONObject = jSONObject.optJSONObject(bVar.a());
                }
                return jSONObject == null ? "" : jSONObject.optString(a());
            } catch (JSONException e2) {
                e2.printStackTrace();
                return "";
            }
        }
    }

    public static f a() {
        return a;
    }

    public final String a(c cVar, com.ola.qsea.n.a aVar, com.ola.qsea.r.a aVar2, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            String a2 = a.KEY_RESERVED_HARMONY.a();
            boolean C = cVar.C();
            String str2 = SLAConstant.TYPE_DEPRECATED_START;
            jSONObject.put(a2, C ? str2 : "0");
            jSONObject.put(a.KEY_RESERVED_CLONE.a(), cVar.B() ? str2 : "0");
            jSONObject.put(a.KEY_RESERVED_CONTAINE.a(), cVar.j());
            a aVar3 = a.KEY_RESERVED_KELONG;
            jSONObject.put(aVar3.a(), aVar2.a() ? str2 : "0");
            jSONObject.put(a.KEY_RESERVED_OZ.a(), aVar.l());
            jSONObject.put(a.KEY_RESERVED_OO.a(), aVar.k());
            String a3 = aVar3.a();
            if (!aVar2.a()) {
                str2 = "0";
            }
            jSONObject.put(a3, str2);
            jSONObject.put(a.KEY_RESERVED_USERS.a(), d.a(com.ola.qsea.v.d.b().F()));
            jSONObject.put(a.KEY_RESERVED_UPTIMES.a(), new e(com.ola.qsea.v.d.b().F(), str).a());
            jSONObject.put(a.KEY_RESERVED_BOD.a(), U.a(com.ola.qsea.a.b.a(12)));
            jSONObject.put(a.KEY_RESERVED_BRD.a(), U.a(com.ola.qsea.a.b.a(13)));
            jSONObject.put(a.KEY_RESERVED_DV.a(), U.a(com.ola.qsea.a.b.a(14)));
            jSONObject.put(a.KEY_RESERVED_FAL.a(), U.a(com.ola.qsea.a.b.a(15)));
            jSONObject.put(a.KEY_RESERVED_MT.a(), U.a(com.ola.qsea.a.b.a(16)));
            jSONObject.put(a.KEY_RESERVED_NAME.a(), U.a(com.ola.qsea.a.b.a(17)));
            jSONObject.put(a.KEY_RESERVED_HOST.a(), U.a(com.ola.qsea.a.b.a(18)));
            jSONObject.put(a.KEY_RESERVED_KL.a(), c.n().A());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject.toString();
    }

    public final String a(String str, com.ola.qsea.v.a aVar) {
        return !com.ola.qsea.w.d.a(str).b() ? "" : aVar.H();
    }

    public String a(String str, String str2) {
        if (!str.isEmpty()) {
            return g.a.a.a.a.w(str, "/android");
        }
        if (!str2.isEmpty()) {
            return g.a.a.a.a.w(str2, "/android");
        }
        return com.ola.qsea.f.a.a() + "/android";
    }

    public String a(String str, String str2, Qsea qsea, long j2, String str3) {
        String str4 = str;
        String str5 = str2;
        com.ola.qsea.v.d b2 = com.ola.qsea.v.d.b();
        com.ola.qsea.v.a aVar = new com.ola.qsea.v.a(str2);
        com.ola.qsea.n.a a2 = com.ola.qsea.n.a.a(str2);
        c n = c.n();
        com.ola.qsea.r.a a3 = com.ola.qsea.r.a.a(str2);
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(a.KEY_PARAMS_AD.a(), a2.c());
            jSONObject2.put(a.KEY_PARAMS_PLATFORM_ID.a(), n.y());
            jSONObject2.put(a.KEY_PARAMS_APP_KEY.a(), str2);
            jSONObject2.put(a.KEY_PARAMS_APP_VERSION.a(), com.ola.qsea.d.a.a());
            jSONObject2.put(a.KEY_PARAMS_BC_ID_SRC.a(), a2.d());
            jSONObject2.put(a.KEY_PARAMS_BRAND.a(), Build.BRAND);
            jSONObject2.put(a.KEY_PARAMS_CHANNEL_ID.a(), aVar.E());
            jSONObject2.put(a.KEY_PARAMS_CD.a(), a2.i());
            jSONObject2.put(a.KEY_PARAMS_EI.a(), a2.f());
            jSONObject2.put(a.KEY_PARAMS_SI.a(), a2.g());
            jSONObject2.put(a.KEY_PARAMS_MC.a(), a2.h());
            jSONObject2.put(a.KEY_PARAMS_MODEL.a(), a2.e());
            jSONObject2.put(a.KEY_PARAMS_NETWORK_TYPE.a(), n.r());
            jSONObject2.put(a.KEY_PARAMS_OD.a(), a2.j());
            jSONObject2.put(a.KEY_PARAMS_OS_VERSION.a(), n.v());
            jSONObject2.put(a.KEY_PARAMS_QSEA.a(), qsea == null ? "" : qsea.a());
            jSONObject2.put(a.KEY_PARAMS_QSEA36.a(), qsea == null ? "" : qsea.b());
            jSONObject2.put(a.KEY_PARAMS_SDKVERSION.a(), b2.getSdkVersion());
            jSONObject2.put(a.KEY_PARAMS_TARGETSDKVERSION.a(), String.valueOf(com.ola.qsea.v.d.b().F().getApplicationInfo().targetSdkVersion));
            jSONObject2.put(a.KEY_PARAMS_USERID.a(), a(str2, aVar));
            jSONObject2.put(a.KEY_PARAMS_PACKAGE_ID.a(), n.x());
            jSONObject2.put(a.KEY_PARAMS_DEVICE_TYPE.a(), n.k());
            jSONObject2.put(a.KEY_PARAMS_SKDNAME.a(), aVar.I());
            jSONObject2.put(a.KEY_PARAMS_RESERVED.a(), a(n, a2, a3, str2));
            jSONObject.put(a.KEY_ENCRYPT_KEY.a(), com.ola.qsea.a.a.b(str, com.ola.qsea.f.a.b()));
            jSONObject.put(a.KEY_PARAMS.a(), com.ola.qsea.a.a.a(jSONObject2.toString(), str));
            a(jSONObject, j2, str3);
            return jSONObject.toString();
        } catch (JSONException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public String a(String str, String str2, Qsea qsea, String str3) {
        return a(str, str2, qsea, System.currentTimeMillis(), str3);
    }

    public void a(JSONObject jSONObject, long j2, String str) throws JSONException {
        String a2 = com.ola.qsea.l.a.a();
        String optString = jSONObject.optString(a.KEY_ENCRYPT_KEY.a());
        String optString2 = jSONObject.optString(a.KEY_PARAMS.a());
        String b2 = com.ola.qsea.l.a.b(optString + optString2 + j2 + a2 + c.n().z() + str);
        jSONObject.put(a.KEY_TIME.a(), String.valueOf(j2));
        jSONObject.put(a.KEY_NONCE.a(), a2);
        jSONObject.put(a.KEY_SIGN.a(), b2);
        jSONObject.put(a.KEY_EXTRA.a(), str);
    }
}
