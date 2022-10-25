package com.tencent.beacon.pack;

import java.util.HashMap;
import java.util.Map;

public final class EventRecordV2 extends AbstractJceStruct implements Cloneable {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static byte[] cache_byteValue;
    public static Map<String, String> cache_mapValue;
    public static int cache_valueType = 0;
    public String apn = "";
    public String appKey = "";
    public byte[] byteValue = null;
    public String eventCode = "";
    public boolean eventResult = true;
    public long eventTime = 0;
    public int eventType = 0;
    public Map<String, String> mapValue = null;
    public String reserved = "";
    public String srcIp = "";
    public int valueType = 0;

    static {
        Class<EventRecordV2> cls = EventRecordV2.class;
        HashMap hashMap = new HashMap();
        cache_mapValue = hashMap;
        hashMap.put("", "");
        byte[] bArr = new byte[1];
        cache_byteValue = bArr;
        bArr[0] = 0;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public void readFrom(a aVar) {
        this.appKey = aVar.a(0, false);
        this.apn = aVar.a(1, false);
        this.srcIp = aVar.a(2, false);
        this.eventCode = aVar.a(3, true);
        this.valueType = aVar.a(this.valueType, 4, false);
        this.mapValue = (Map) aVar.a(cache_mapValue, 5, false);
        this.byteValue = aVar.a(cache_byteValue, 6, false);
        this.eventTime = aVar.a(this.eventTime, 7, true);
        this.eventResult = aVar.a(this.eventResult, 8, false);
        this.eventType = aVar.a(this.eventType, 9, false);
        this.reserved = aVar.a(10, false);
    }

    public void writeTo(b bVar) {
        String str = this.appKey;
        if (str != null) {
            bVar.a(str, 0);
        }
        String str2 = this.apn;
        if (str2 != null) {
            bVar.a(str2, 1);
        }
        String str3 = this.srcIp;
        if (str3 != null) {
            bVar.a(str3, 2);
        }
        bVar.a(this.eventCode, 3);
        bVar.a(this.valueType, 4);
        Map<String, String> map = this.mapValue;
        if (map != null) {
            bVar.a(map, 5);
        }
        byte[] bArr = this.byteValue;
        if (bArr != null) {
            bVar.a(bArr, 6);
        }
        bVar.a(this.eventTime, 7);
        bVar.a(this.eventResult, 8);
        bVar.a(this.eventType, 9);
        String str4 = this.reserved;
        if (str4 != null) {
            bVar.a(str4, 10);
        }
    }
}
