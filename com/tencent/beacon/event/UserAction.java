package com.tencent.beacon.event;

import android.annotation.TargetApi;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.beacon.a.c.c;
import com.tencent.beacon.a.c.e;
import com.tencent.beacon.a.c.f;
import com.tencent.beacon.a.c.g;
import com.tencent.beacon.a.c.h;
import com.tencent.beacon.a.c.i;
import com.tencent.beacon.base.net.b.b;
import com.tencent.beacon.core.info.BeaconPubParams;
import com.tencent.beacon.event.c.d;
import com.tencent.beacon.event.open.BeaconConfig;
import com.tencent.beacon.event.open.BeaconEvent;
import com.tencent.beacon.event.open.BeaconReport;
import com.tencent.beacon.event.open.EventType;
import com.tencent.beacon.module.EventModule;
import com.tencent.beacon.module.ModuleName;
import com.tencent.beacon.upload.InitHandleListener;
import com.tencent.beacon.upload.TunnelInfo;
import com.tencent.beacon.upload.UploadHandleListener;
import g.a.a.a.a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

@Deprecated
public class UserAction {
    private static String a;
    private static BeaconConfig.Builder b = BeaconConfig.builder();
    private static String c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f680d = true;
    public static Context mContext;

    @Deprecated
    public static void closeUseInfoEvent() {
    }

    public static void doUploadRecords() {
        EventModule eventModule = (EventModule) c.d().a(ModuleName.EVENT);
        if (eventModule != null) {
            eventModule.a(false);
        }
    }

    public static void flushObjectsToDB(boolean z) {
    }

    public static Map<String, String> getAdditionalInfo() {
        return getAdditionalInfo((String) null);
    }

    public static Map<String, String> getAdditionalInfo(String str) {
        EventModule eventModule = (EventModule) c.d().a(ModuleName.EVENT);
        if (eventModule != null) {
            return eventModule.a(str);
        }
        return null;
    }

    public static String getAppKey() {
        return a;
    }

    public static String getCloudParas(String str) {
        return "";
    }

    public static BeaconPubParams getCommonParams() {
        return BeaconReport.getInstance().getCommonParams(mContext);
    }

    public static String getEventDomain() {
        return b.c;
    }

    public static String getOpenID(String str) {
        EventModule eventModule = (EventModule) c.d().a(ModuleName.EVENT);
        return eventModule != null ? eventModule.b(str) : "";
    }

    public static String getQIMEI() {
        h b2 = i.b();
        return b2 == null ? "" : b2.a();
    }

    public static void getQimei(f fVar) throws NullPointerException {
        i.a(fVar);
    }

    public static String getQimeiByKey(String str) {
        h b2;
        return (!TextUtils.isEmpty(str) && (b2 = i.b()) != null) ? str.equals("A3") ? b2.a() : str.equals("A153") ? b2.b() : "" : "";
    }

    public static String getQimeiNew() {
        h b2 = i.b();
        return b2 == null ? "" : b2.b();
    }

    @Deprecated
    public static String getRtQIMEI(Context context) {
        h a2 = i.a(context);
        return a2 == null ? "" : a2.a();
    }

    public static String getSDKVersion() {
        return BeaconReport.getInstance().getSDKVersion();
    }

    public static String getStrategyDomain() {
        return b.f621d;
    }

    public static String getUserID(String str) {
        EventModule eventModule = (EventModule) c.d().a(ModuleName.EVENT);
        return eventModule != null ? eventModule.c(str) : "";
    }

    public static void initUserAction(Context context) {
        initUserAction(context, true);
    }

    public static void initUserAction(Context context, boolean z) {
        initUserAction(context, z, 0);
    }

    public static void initUserAction(Context context, boolean z, long j2) {
        initUserAction(context, z, j2, (InitHandleListener) null, (UploadHandleListener) null);
    }

    @TargetApi(14)
    public static void initUserAction(Context context, boolean z, long j2, InitHandleListener initHandleListener, UploadHandleListener uploadHandleListener) {
        if (f680d) {
            mContext = context;
            BeaconReport.getInstance().start(context, a, b.build());
            return;
        }
        Log.e("beacon", "UserAction.initUserAction is not available");
    }

    public static boolean loginEvent(boolean z, long j2, Map<String, String> map) {
        if (mContext != null) {
            map.put("A19", e.l().q());
        }
        return onUserAction("rqd_wgLogin", z, j2, 0, map, true);
    }

    public static boolean onDTUserAction(Context context, String str, boolean z, long j2, long j3, Map<String, String> map, boolean z2, boolean z3) {
        Map<String, String> map2 = map;
        if (context == null) {
            return false;
        }
        if (map2 == null) {
            return onUserAction(str, z, j2, j3, (Map<String, String>) null, z2, z3);
        }
        c.d().a(context);
        e l2 = e.l();
        g e2 = g.e();
        HashMap hashMap = new HashMap(map2);
        StringBuilder i2 = a.i("");
        i2.append(e2.c());
        hashMap.put("dt_imei2", i2.toString());
        hashMap.put("dt_meid", "" + e2.g());
        hashMap.put("dt_mf", "" + l2.o());
        return onUserAction(str, z, j2, j3, hashMap, z2, z3);
    }

    public static boolean onDTUserActionToTunnel(Context context, String str, String str2, Map<String, String> map, boolean z, boolean z2) {
        if (context == null) {
            return false;
        }
        if (map == null) {
            return onUserActionToTunnel(str, str2, (Map<String, String>) null, z, z2);
        }
        c.d().a(context);
        e l2 = e.l();
        g e2 = g.e();
        HashMap hashMap = new HashMap(map);
        StringBuilder i2 = a.i("");
        i2.append(e2.c());
        hashMap.put("dt_imei2", i2.toString());
        hashMap.put("dt_meid", "" + e2.g());
        hashMap.put("dt_mf", "" + l2.o());
        return onUserActionToTunnel(str, str2, hashMap, z, z2);
    }

    public static void onPageIn(String str) {
        com.tencent.beacon.d.a.a(d.d(str));
    }

    public static void onPageOut(String str) {
        com.tencent.beacon.d.a.b(d.d(str));
    }

    public static boolean onUserAction(String str, Map<String, String> map, boolean z, boolean z2) {
        return onUserAction(str, true, -1, -1, map, z, z2);
    }

    public static boolean onUserAction(String str, boolean z, long j2, long j3, Map<String, String> map, boolean z2) {
        return onUserAction(str, z, j2, j3, map, z2, false);
    }

    public static boolean onUserAction(String str, boolean z, long j2, long j3, Map<String, String> map, boolean z2, boolean z3) {
        return BeaconReport.getInstance().report(BeaconEvent.builder().withCode(str).withType(z2 ? EventType.REALTIME : EventType.NORMAL).withParams(map).withAppKey(a).withIsSucceed(z).build()).isSuccess();
    }

    public static boolean onUserActionToTunnel(String str, String str2, Map<String, String> map, boolean z, boolean z2) {
        return onUserActionToTunnel(str, str2, true, -1, -1, map, z, z2);
    }

    public static boolean onUserActionToTunnel(String str, String str2, boolean z, long j2, long j3, Map<String, String> map, boolean z2, boolean z3) {
        return BeaconReport.getInstance().report(BeaconEvent.builder().withCode(str2).withType(z2 ? EventType.REALTIME : EventType.NORMAL).withParams(map).withAppKey(str).withIsSucceed(z).build()).isSuccess();
    }

    public static void registerTunnel(TunnelInfo tunnelInfo) {
    }

    public static void setAdditionalInfo(String str, Map<String, String> map) {
        BeaconReport.getInstance().setAdditionalParams(str, map);
    }

    public static void setAdditionalInfo(Map<String, String> map) {
        setAdditionalInfo((String) null, map);
    }

    public static void setAppKey(String str) {
        a = str;
    }

    public static void setAppVersion(String str) {
        c = str;
    }

    @Deprecated
    public static void setAutoLaunchEventUsable(boolean z) {
    }

    public static void setChannelID(String str) {
        BeaconReport.getInstance().setChannelID(str);
    }

    public static void setJsClientId(String str) {
    }

    public static void setLogAble(boolean z, boolean z2) {
        com.tencent.beacon.base.util.c.a(z);
        com.tencent.beacon.base.util.c.b(z);
    }

    public static void setOAID(String str) {
        BeaconReport.getInstance().setOAID(str);
    }

    @Deprecated
    public static void setOldInitMethodEnable(boolean z) {
        f680d = z;
    }

    public static void setOmgId(String str) {
        BeaconReport.getInstance().setOmgID(str);
    }

    public static void setOpenID(String str) {
        BeaconReport.getInstance().setOpenID((String) null, str);
    }

    public static void setQQ(String str) {
        BeaconReport.getInstance().setQQ(str);
    }

    public static void setReportDomain(String str, String str2) {
        b.a(str, str2);
    }

    public static void setReportIP(String str, String str2) {
        b.b(str, str2);
    }

    public static void setScheduledService(ScheduledExecutorService scheduledExecutorService) {
        b.setExecutorService(scheduledExecutorService);
    }

    public static void setStrictMode(boolean z) {
        BeaconReport.getInstance().setStrictMode(z);
    }

    public static void setUploadMode(boolean z) {
        EventModule eventModule = (EventModule) c.d().a(ModuleName.EVENT);
        if (eventModule != null) {
            eventModule.b(z);
        } else {
            b.eventReportEnable(z);
        }
    }

    public static void setUserID(String str) {
        setUserID((String) null, str);
    }

    public static void setUserID(String str, String str2) {
        BeaconReport.getInstance().setUserID(str, str2);
    }
}
