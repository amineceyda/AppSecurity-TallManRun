package com.tencent.beacon.pack;

import g.a.a.a.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class RequestPackageV2 extends AbstractJceStruct implements Cloneable {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static Map<String, String> cache_common;
    public static ArrayList<EventRecordV2> cache_events = new ArrayList<>();
    public String appVersion = "";
    public Map<String, String> common = null;
    public ArrayList<EventRecordV2> events = null;
    public String mainAppKey = "";
    public String model = "";
    public String osVersion = "";
    public String packageName = "";
    public int platformId = 0;
    public String reserved = "";
    public String sdkId = "";
    public String sdkVersion = "";

    static {
        Class<RequestPackageV2> cls = RequestPackageV2.class;
        cache_events.add(new EventRecordV2());
        HashMap hashMap = new HashMap();
        cache_common = hashMap;
        hashMap.put("", "");
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public void readFrom(a aVar) {
        this.platformId = aVar.a(this.platformId, 0, true);
        this.mainAppKey = aVar.a(1, true);
        this.appVersion = aVar.a(2, true);
        this.sdkVersion = aVar.a(3, true);
        this.events = (ArrayList) aVar.a(cache_events, 4, true);
        this.packageName = aVar.a(5, false);
        this.common = (Map) aVar.a(cache_common, 6, false);
        this.model = aVar.a(7, false);
        this.osVersion = aVar.a(8, false);
        this.reserved = aVar.a(9, false);
        this.sdkId = aVar.a(10, false);
    }

    public String toString() {
        StringBuilder i2 = a.i("RequestPackageV2{platformId=");
        i2.append(this.platformId);
        i2.append(", mainAppKey='");
        a.p(i2, this.mainAppKey, '\'', ", appVersion='");
        a.p(i2, this.appVersion, '\'', ", sdkVersion='");
        a.p(i2, this.sdkVersion, '\'', ", packageName='");
        a.p(i2, this.packageName, '\'', ", model='");
        a.p(i2, this.model, '\'', ", osVersion='");
        a.p(i2, this.osVersion, '\'', ", reserved='");
        a.p(i2, this.reserved, '\'', ", sdkId='");
        a.p(i2, this.sdkId, '\'', "} ");
        i2.append(super.toString());
        return i2.toString();
    }

    public void writeTo(b bVar) {
        bVar.a(this.platformId, 0);
        bVar.a(this.mainAppKey, 1);
        bVar.a(this.appVersion, 2);
        bVar.a(this.sdkVersion, 3);
        bVar.a(this.events, 4);
        String str = this.packageName;
        if (str != null) {
            bVar.a(str, 5);
        }
        Map<String, String> map = this.common;
        if (map != null) {
            bVar.a(map, 6);
        }
        String str2 = this.model;
        if (str2 != null) {
            bVar.a(str2, 7);
        }
        String str3 = this.osVersion;
        if (str3 != null) {
            bVar.a(str3, 8);
        }
        String str4 = this.reserved;
        if (str4 != null) {
            bVar.a(str4, 9);
        }
        String str5 = this.sdkId;
        if (str5 != null) {
            bVar.a(str5, 10);
        }
    }
}
