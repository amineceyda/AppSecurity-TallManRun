package com.tencent.beacon.pack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class CommonStrategy extends AbstractJceStruct {
    public static Map<String, String> cache_cloudParas;
    public static ArrayList<ModuleStrategy> cache_moduleList;
    public Map<String, String> cloudParas = null;
    public ArrayList<ModuleStrategy> moduleList = null;
    public int queryInterval = 0;
    public String url = "";

    public CommonStrategy() {
    }

    public CommonStrategy(ArrayList<ModuleStrategy> arrayList, int i2, String str, Map<String, String> map) {
        this.moduleList = arrayList;
        this.queryInterval = i2;
        this.url = str;
        this.cloudParas = map;
    }

    public void readFrom(a aVar) {
        if (cache_moduleList == null) {
            cache_moduleList = new ArrayList<>();
            cache_moduleList.add(new ModuleStrategy());
        }
        this.moduleList = (ArrayList) aVar.a(cache_moduleList, 0, true);
        this.queryInterval = aVar.a(this.queryInterval, 1, true);
        this.url = aVar.a(2, true);
        if (cache_cloudParas == null) {
            HashMap hashMap = new HashMap();
            cache_cloudParas = hashMap;
            hashMap.put("", "");
        }
        this.cloudParas = (Map) aVar.a(cache_cloudParas, 3, false);
    }

    public void writeTo(b bVar) {
        bVar.a(this.moduleList, 0);
        bVar.a(this.queryInterval, 1);
        bVar.a(this.url, 2);
        Map<String, String> map = this.cloudParas;
        if (map != null) {
            bVar.a(map, 3);
        }
    }
}
