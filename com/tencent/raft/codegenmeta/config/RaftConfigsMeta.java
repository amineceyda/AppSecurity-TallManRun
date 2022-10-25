package com.tencent.raft.codegenmeta.config;

import com.tencent.raft.codegenmeta.utils.Constants;
import com.tencent.raft.codegenmeta.utils.RLog;
import com.tencent.raft.codegenmeta.utils.TextUtils;
import g.a.a.a.a;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RaftConfigsMeta {
    private static final String TAG = "RaftConfigsMeta";
    private final Map<String, RaftConfigService> mConfigServices = new HashMap(64);
    private Map<String, Object> mDeclareBasics = new HashMap(32);
    private Map<String, Object> mDeclareCloud = new HashMap(32);
    private final LinkedHashMap<String, RaftConfigService> mDeclaresServices = new LinkedHashMap<>(32);

    private Map<String, Object> findMethodArgMap(RaftConfigService raftConfigService, String str) {
        Map<String, Object> map = null;
        for (Map<String, Map<String, Object>> entrySet : raftConfigService.methods) {
            for (Map.Entry entry : entrySet.entrySet()) {
                if (((String) entry.getKey()).equals(str)) {
                    map = (Map) entry.getValue();
                }
            }
        }
        return map;
    }

    private void initConfigServices(Map<String, Object> map) {
        List<Map> list;
        Map map2 = (Map) map.get(Constants.Configs.CONFIGS);
        if (map2 != null && (list = (List) map2.get("services")) != null) {
            for (Map parse : list) {
                RaftConfigService raftConfigService = new RaftConfigService();
                raftConfigService.parse(parse);
                RaftConfigService raftConfigService2 = this.mConfigServices.get(raftConfigService.getServiceKey());
                if (raftConfigService2 != null && raftConfigService2.from == Constants.ConfigFrom.ANNOTATION) {
                    mergeArgFromAnnotation(raftConfigService2, raftConfigService);
                }
                this.mConfigServices.put(raftConfigService.getServiceKey(), raftConfigService);
            }
        }
    }

    private void initDeclares(Map<String, Object> map) {
        Map map2 = (Map) map.get(Constants.Configs.DECLARE);
        if (map2 != null) {
            Map<String, Object> map3 = (Map) map2.get(Constants.Configs.BASICS);
            Map<String, Object> map4 = (Map) map2.get(Constants.Configs.CLOUD);
            Map map5 = (Map) map2.get("services");
            if (map5 != null) {
                for (String str : map5.keySet()) {
                    Object obj = map5.get(str);
                    RaftConfigService raftConfigService = new RaftConfigService();
                    raftConfigService.parse((Map) obj);
                    this.mDeclaresServices.put(str, raftConfigService);
                }
            }
            if (map3 != null) {
                this.mDeclareBasics = map3;
            }
            if (map4 != null) {
                this.mDeclareCloud = map4;
            }
        }
    }

    private void replaceArgValueWithAnnotation(Map<String, Object> map, Map<String, Object> map2) {
        if (map != null && map2 != null) {
            for (Map.Entry next : map.entrySet()) {
                Object obj = map2.get(next.getKey());
                if (obj != null) {
                    next.setValue(obj);
                }
            }
        }
    }

    public synchronized Map<String, Object> getAllDeclareConstant() {
        HashMap hashMap;
        hashMap = new HashMap();
        hashMap.putAll(this.mDeclareBasics);
        hashMap.putAll(this.mDeclareCloud);
        return hashMap;
    }

    public synchronized Map<String, RaftConfigService> getAllDeclareService() {
        return this.mDeclaresServices;
    }

    public synchronized RaftConfigService getConfigService(String str) {
        if (!TextUtils.isEmpty(str)) {
            Map<String, RaftConfigService> map = this.mConfigServices;
            if (map != null) {
                return map.get(str);
            }
        }
        return null;
    }

    public synchronized Object getDeclareBasic(String str) {
        Map<String, Object> map = this.mDeclareBasics;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public synchronized Object getDeclareCloud(String str) {
        Map<String, Object> map = this.mDeclareCloud;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public synchronized RaftConfigService getDeclareService(String str) {
        if (!TextUtils.isEmpty(str)) {
            LinkedHashMap<String, RaftConfigService> linkedHashMap = this.mDeclaresServices;
            if (linkedHashMap != null) {
                return linkedHashMap.get(str);
            }
        }
        return null;
    }

    public void init(Map<String, Object> map) {
        if (map != null) {
            initDeclares(map);
            initConfigServices(map);
            StringBuilder i2 = a.i("init success! services:");
            i2.append(this.mConfigServices.size());
            RLog.d(TAG, i2.toString());
        }
    }

    public void mergeArgFromAnnotation(RaftConfigService raftConfigService, RaftConfigService raftConfigService2) {
        if (raftConfigService != null && raftConfigService2 != null) {
            Constants.Scope scope = raftConfigService.scope;
            if (scope != null) {
                raftConfigService2.scope = scope;
            }
            replaceArgValueWithAnnotation(raftConfigService2.constructorArgs, raftConfigService.constructorArgs);
            replaceArgValueWithAnnotation(raftConfigService2.factoryMethodArgs, raftConfigService.constructorArgs);
            replaceArgValueWithAnnotation(raftConfigService2.properties, raftConfigService.constructorArgs);
            List<Map<String, Map<String, Object>>> list = raftConfigService2.methods;
            if (list != null && raftConfigService.methods != null) {
                for (Map<String, Map<String, Object>> entrySet : list) {
                    for (Map.Entry entry : entrySet.entrySet()) {
                        replaceArgValueWithAnnotation((Map) entry.getValue(), findMethodArgMap(raftConfigService, (String) entry.getKey()));
                    }
                }
            }
        }
    }

    public synchronized void updateServiceByAnnotation(RaftConfigService raftConfigService) {
        Map<String, RaftConfigService> map = this.mConfigServices;
        if (map != null) {
            map.put(raftConfigService.getServiceKey(), raftConfigService);
        }
    }
}
