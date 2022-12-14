package com.tencent.beacon.pack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class ModuleStrategy extends AbstractJceStruct {
    public static Map<String, String> cache_detail;
    public static ArrayList<String> cache_preventEventCode;
    public static ArrayList<String> cache_sampleEvent;
    public static Object cache_sms;
    public Map<String, String> detail = null;
    public byte mId = 0;
    public byte onOff = 0;
    public ArrayList<String> preventEventCode = null;
    public ArrayList<String> sampleEvent = null;
    public Object sms = null;
    public String url = "";

    public ModuleStrategy() {
    }

    public ModuleStrategy(byte b, byte b2, String str, Map<String, String> map, ArrayList<String> arrayList, Object obj, ArrayList<String> arrayList2) {
        this.mId = b;
        this.onOff = b2;
        this.url = str;
        this.detail = map;
        this.preventEventCode = arrayList;
        this.sms = obj;
        this.sampleEvent = arrayList2;
    }

    public void readFrom(a aVar) {
        this.mId = aVar.a(this.mId, 0, true);
        this.onOff = aVar.a(this.onOff, 1, true);
        this.url = aVar.a(2, true);
        if (cache_detail == null) {
            HashMap hashMap = new HashMap();
            cache_detail = hashMap;
            hashMap.put("", "");
        }
        this.detail = (Map) aVar.a(cache_detail, 3, true);
        if (cache_preventEventCode == null) {
            ArrayList<String> arrayList = new ArrayList<>();
            cache_preventEventCode = arrayList;
            arrayList.add("");
        }
        this.preventEventCode = (ArrayList) aVar.a(cache_preventEventCode, 4, false);
        Object obj = cache_sms;
        if (obj != null) {
            this.sms = aVar.a(obj, 5, false);
        }
        if (cache_sampleEvent == null) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            cache_sampleEvent = arrayList2;
            arrayList2.add("");
        }
        this.sampleEvent = (ArrayList) aVar.a(cache_sampleEvent, 6, false);
    }

    public void writeTo(b bVar) {
        bVar.a(this.mId, 0);
        bVar.a(this.onOff, 1);
        bVar.a(this.url, 2);
        bVar.a(this.detail, 3);
        ArrayList<String> arrayList = this.preventEventCode;
        if (arrayList != null) {
            bVar.a(arrayList, 4);
        }
        Object obj = this.sms;
        if (obj != null) {
            bVar.a(obj, 5);
        }
        ArrayList<String> arrayList2 = this.sampleEvent;
        if (arrayList2 != null) {
            bVar.a(arrayList2, 6);
        }
    }
}
