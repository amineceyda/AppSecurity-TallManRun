package com.ola.qsea.o;

import android.os.Build;
import com.ola.qsea.n.a;
import com.tencent.crabshell.common.AppVersion;
import com.tencent.raft.raftframework.sla.SLAConstant;
import java.util.HashMap;
import org.json.JSONObject;

public class c {
    public static String a(String str) {
        a a = a.a(str);
        HashMap hashMap = new HashMap();
        hashMap.put("a1", com.ola.qsea.d.a.f());
        hashMap.put("a2", com.ola.qsea.d.a.e());
        hashMap.put("a3", Build.CPU_ABI);
        hashMap.put("a4", Build.CPU_ABI2);
        hashMap.put("a5", a.e());
        hashMap.put("a6", Build.BRAND);
        hashMap.put("a7", Build.VERSION.SDK);
        return new JSONObject(hashMap).toString();
    }

    public static void a(String str, byte b) {
        i.a().a(f.REPORT_CACHE.a(), Byte.valueOf(b)).b(str).setPath("/report").a("v6");
    }

    public static void a(String str, long j2, long j3, long j4, long j5) {
        i.a().a(f.REPORT_QSEA_USED_TIME.a(), Long.valueOf(j2)).a(f.REPORT_QSEA_LOCAL_USED_TIME.a(), Long.valueOf(j3)).a(f.REPORT_OAID_USED_TIME.a(), Long.valueOf(j4)).a(f.REPORT_QSEA_INIT_TIME.a(), Long.valueOf(j5)).b(str).setPath("/report").a("v1");
    }

    public static void a(String str, String str2) {
        i.a().a(f.REPORT_QSEA_ERROR_CODE.a(), "1004").a(f.REPORT_QSEA_ERROR_DESC.a(), str2).b(str).setPath("/report").a("v2");
    }

    public static void a(String str, String str2, int i2, String str3) {
        a a = i.a().a(f.REPORT_QSEA_ERROR_CODE.a(), str2.equals("451") ? "1001" : AppVersion.VERSION_CODE);
        String a2 = f.REPORT_QSEA_ERROR_DESC.a();
        a.a(a2, "error code: " + i2 + ", msg:" + str3).b(str).setPath("/report").a("v2");
    }

    public static void a(String str, String str2, String str3) {
        a a = i.a().a(f.REPORT_QSEA_ERROR_CODE.a(), "1002");
        String a2 = f.REPORT_QSEA_ERROR_DESC.a();
        a.a(a2, "decrypt error, aes key: " + str2 + ", content:" + str3).b(str).setPath("/report").a("v2");
    }

    public static void a(String str, String str2, String str3, String str4, long j2) {
        i.a().a(f.REPORT_COLLECT_RATE_Q16.a(), str2).a(f.REPORT_COLLECT_RATE_Q36.a(), str3).a(f.REPORT_COLLECT_RATE_DELAY.a(), String.valueOf(j2)).a(f.REPORT_STARTUP_DURAtION.a(), str4).b(str).setPath("/report").a("v8");
    }

    public static void a(String str, String str2, String str3, String str4, String str5, boolean z) {
        i.a().a(f.REPORT_QSEA_CHANGE_OLD_Q16.a(), str2).a(f.REPORT_QSEA_CHANGE_OLD_Q36.a(), str3).a(f.REPORT_QSEA_CHANGE_NEW_Q16.a(), str4).a(f.REPORT_QSEA_CHANGE_NEW_Q36.a(), str5).a(f.REPORT_QSEA_FROM_BC.a(), z ? SLAConstant.TYPE_DEPRECATED_START : "0").b(str).setPath("/report").a("v3");
    }

    public static void a(String str, HashMap<String, String> hashMap, int i2) {
        com.ola.qsea.m.a.b("CloneDetect", "clone event report: appKey: %s，report params： %s", str, hashMap.toString());
        i.a().a(f.REPORT_CLONE_CACHE_Q16.a(), hashMap.get("o16")).a(f.REPORT_CLONE_CACHE_Q36.a(), hashMap.get("o36")).a(f.REPORT_CLONE_CACHE_NEW_Q16.a(), hashMap.get("n16")).a(f.REPORT_CLONE_CACHE_NEW_Q36.a(), hashMap.get("n36")).a(f.REPORT_CLONE_DETECT_TYPE.a(), Integer.valueOf(i2)).b(str).setPath("/report").a("v7");
        com.ola.qsea.m.a.b("CloneDetect", "%s may be cloned. Check method is %d", com.ola.qsea.d.a.c(), Integer.valueOf(i2));
    }

    public static void b(String str) {
        i.a().a(f.REPORT_QSEA_ERROR_CODE.a(), "1005").a(f.REPORT_QSEA_ERROR_DESC.a(), a(str)).b(str).setPath("/report").a("v2");
    }
}
