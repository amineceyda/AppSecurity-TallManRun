package com.tencent.beacon.event.c;

import android.os.Build;
import android.text.TextUtils;
import com.tencent.beacon.a.c.c;
import com.tencent.beacon.a.c.e;
import com.tencent.beacon.a.c.g;
import com.tencent.beacon.base.net.RequestType;
import com.tencent.beacon.base.net.b.b;
import com.tencent.beacon.base.net.call.JceRequestEntity;
import com.tencent.beacon.event.EventBean;
import com.tencent.beacon.event.open.EventType;
import com.tencent.beacon.module.BeaconModule;
import com.tencent.beacon.pack.AbstractJceStruct;
import com.tencent.beacon.pack.EventRecordV2;
import com.tencent.beacon.pack.RequestPackageV2;
import com.tencent.raft.codegenmeta.utils.Constants;
import g.a.a.a.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class d {
    public static int a(EventType eventType) {
        int i2 = c.a[eventType.ordinal()];
        if (i2 == 3 || i2 == 4) {
            return 1;
        }
        if (i2 != 5) {
            return i2 != 6 ? 0 : 3;
        }
        return 2;
    }

    public static JceRequestEntity a(List<EventBean> list, boolean z) {
        return JceRequestEntity.builder().a(RequestType.EVENT).a(z ? 2 : 1).b(b.a(false)).a(b.a(true), 8081).a(c.d().f()).a(Constants.Raft.VERSION, "v2").a((AbstractJceStruct) a(list)).a();
    }

    public static RequestPackageV2 a(EventBean eventBean) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(eventBean);
        return a((List<EventBean>) arrayList);
    }

    public static RequestPackageV2 a(List<EventBean> list) {
        RequestPackageV2 requestPackageV2 = new RequestPackageV2();
        requestPackageV2.appVersion = com.tencent.beacon.a.c.b.a();
        requestPackageV2.common = a();
        ArrayList<EventRecordV2> arrayList = new ArrayList<>();
        for (EventBean b : list) {
            EventRecordV2 b2 = b(b);
            if (b2 != null) {
                arrayList.add(b2);
            }
        }
        requestPackageV2.events = arrayList;
        c d2 = c.d();
        requestPackageV2.mainAppKey = d2.f();
        requestPackageV2.model = g.e().h();
        requestPackageV2.osVersion = e.l().s();
        requestPackageV2.packageName = com.tencent.beacon.a.c.b.b();
        requestPackageV2.platformId = d2.h();
        requestPackageV2.sdkId = d2.i();
        requestPackageV2.sdkVersion = d2.j();
        requestPackageV2.reserved = "";
        return requestPackageV2;
    }

    public static String a(String str) {
        if (!(str == null || str.trim().length() == 0)) {
            if (g(str.trim())) {
                String trim = str.trim();
                return trim.length() > 16 ? trim.substring(0, 16) : trim;
            }
            com.tencent.beacon.base.util.c.e(a.w("[core] channelID should be Numeric! channelID:", str), new Object[0]);
        }
        return "unknown";
    }

    private static Map<String, String> a() {
        HashMap hashMap = new HashMap();
        e l2 = e.l();
        c d2 = c.d();
        StringBuilder i2 = a.i("");
        i2.append(l2.p());
        hashMap.put("A31", i2.toString());
        hashMap.put("A67", com.tencent.beacon.a.c.b.c(d2.c()));
        hashMap.put("A76", com.tencent.beacon.a.c.b.d());
        hashMap.put("A89", l2.a(d2.c()));
        hashMap.put("A52", String.valueOf(l2.y()));
        hashMap.put("A58", l2.m() ? "Y" : "N");
        hashMap.put("A12", l2.n());
        hashMap.put("A17", l2.u());
        g e2 = g.e();
        hashMap.put("A10", e2.h());
        hashMap.put("A2", "" + e2.b());
        hashMap.put("A4", e2.d());
        hashMap.put("A6", e2.f());
        hashMap.put("A7", e2.a());
        hashMap.put("A20", e2.j());
        hashMap.put("A69", e2.k());
        hashMap.put("A9", Build.BRAND);
        hashMap.put("A158", l2.d());
        return hashMap;
    }

    public static boolean a(int i2) {
        return i2 != 0;
    }

    private static EventRecordV2 b(EventBean eventBean) {
        if (eventBean == null) {
            return null;
        }
        EventRecordV2 eventRecordV2 = new EventRecordV2();
        eventRecordV2.appKey = eventBean.getAppKey();
        String str = "";
        eventRecordV2.apn = eventBean.getApn() != null ? eventBean.getApn() : str;
        if (eventBean.getSrcIp() != null) {
            str = eventBean.getSrcIp();
        }
        eventRecordV2.srcIp = str;
        eventRecordV2.eventCode = eventBean.getEventCode();
        eventRecordV2.valueType = eventBean.getValueType();
        eventRecordV2.mapValue = eventBean.getEventValue();
        eventRecordV2.byteValue = eventBean.getByteValue();
        eventRecordV2.eventTime = eventBean.getEventTime();
        eventRecordV2.eventResult = eventBean.getEventResult();
        eventRecordV2.eventType = eventBean.getEventType();
        eventRecordV2.reserved = eventBean.getReserved();
        return eventRecordV2;
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            if (com.tencent.beacon.base.util.e.a.get()) {
                com.tencent.beacon.a.b.g.e().a("101", "eventCode == null");
                com.tencent.beacon.base.util.e.a("eventCode == null");
            }
            return "";
        }
        String trim = str.replace('|', '_').trim();
        if (!g(trim)) {
            String w = a.w(str, " is not ASCII");
            com.tencent.beacon.a.b.g.e().a("101", w);
            com.tencent.beacon.base.util.e.a(w);
            return "";
        } else if (trim.length() <= 128) {
            return trim;
        } else {
            String w2 = a.w(str, " length > 128.");
            com.tencent.beacon.a.b.g.e().a("101", w2);
            com.tencent.beacon.base.util.e.a(w2);
            return trim.substring(0, 128);
        }
    }

    public static String c(String str) {
        return (str == null || str.length() == 0) ? "" : str;
    }

    public static String d(String str) {
        return (str == null || str.length() == 0) ? "DefaultPageID" : str.length() > 50 ? str.substring(0, 50) : str;
    }

    public static String e(String str) {
        if (str == null || str.length() == 0) {
            return "10000";
        }
        String trim = str.replace('|', '_').trim();
        if (g(trim)) {
            if (trim.length() < 5) {
                com.tencent.beacon.base.util.c.e("[core] userID length should < 5!", new Object[0]);
            }
            return trim.length() > 128 ? trim.substring(0, 128) : trim;
        }
        com.tencent.beacon.base.util.c.e(a.w("[core] userID should be ASCII code in 32-126! userID:", str), new Object[0]);
        return "10000";
    }

    public static BeaconModule f(String str) throws Exception {
        return (BeaconModule) Class.forName(str).newInstance();
    }

    private static boolean g(String str) {
        int length = str.length();
        boolean z = true;
        while (true) {
            length--;
            if (length < 0) {
                return z;
            }
            char charAt = str.charAt(length);
            if (charAt < ' ' || charAt >= 127) {
                z = false;
            }
        }
    }
}
