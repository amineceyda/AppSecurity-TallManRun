package com.tencent.raft.codegenmeta.service;

import com.tencent.raft.codegenmeta.utils.TextUtils;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RAServiceMetaCenter {
    private static final String TAG = "RAServiceMetaCenter";
    public Map<String, String> mClassToServiceNameMap = new ConcurrentHashMap();
    public Map<String, RAServiceMeta> mServiceNameToMetaMap = new ConcurrentHashMap();

    public RAServiceMeta getServiceMeta(String str) {
        return this.mServiceNameToMetaMap.get(str);
    }

    public synchronized void init(List<Map<String, Object>> list) {
        if (list != null) {
            for (Map<String, Object> parse : list) {
                RAServiceMeta rAServiceMeta = new RAServiceMeta();
                rAServiceMeta.parse(parse);
                String serviceKey = rAServiceMeta.getServiceKey();
                this.mServiceNameToMetaMap.put(serviceKey, rAServiceMeta);
                if (!TextUtils.isEmpty(rAServiceMeta.itemClass)) {
                    this.mClassToServiceNameMap.put(rAServiceMeta.itemClass, serviceKey);
                }
                for (String put : rAServiceMeta.interfaces) {
                    this.mClassToServiceNameMap.put(put, serviceKey);
                }
                if (!TextUtils.isEmpty(rAServiceMeta.factoryClass)) {
                    this.mClassToServiceNameMap.put(rAServiceMeta.factoryClass, serviceKey);
                }
            }
        }
    }
}
