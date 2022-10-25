package com.tencent.raft.codegenmeta.config;

import com.tencent.raft.codegenmeta.RaftCodeGenRepository;
import com.tencent.raft.codegenmeta.service.RAServiceMetaCenter;
import com.tencent.raft.codegenmeta.utils.Constants;
import com.tencent.raft.codegenmeta.utils.RLog;
import com.tencent.raft.codegenmeta.utils.TextUtils;
import g.a.a.a.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.helpers.MessageFormatter;

public class RaftConfigService implements Serializable {
    private static final String TAG = "RaftConfigService";
    private static final long serialVersionUID = 1001;
    public String className;
    public Map<String, Object> constructorArgs = null;
    public String factoryClass;
    public String factoryMethod;
    public Map<String, Object> factoryMethodArgs = null;
    public Constants.ConfigFrom from;
    public List<String> interfaces = new ArrayList();
    public List<Map<String, Map<String, Object>>> methods = null;
    public Map<String, Object> properties = null;
    public Constants.Scope scope;

    private void handleArgs(Map<String, Object> map, Map<String, Object> map2) {
        if (map2 != null) {
            String str = (String) map2.keySet().toArray()[0];
            Object obj = map2.get(str);
            if (obj instanceof HashMap) {
                Map map3 = (Map) ((Map) obj).get(Constants.Configs.SERVICE);
                if (map3 != null) {
                    RaftConfigService raftConfigService = new RaftConfigService();
                    raftConfigService.parse(map3);
                    map.put(str, raftConfigService);
                    return;
                }
                return;
            }
            map.put(str, obj);
        }
    }

    private Object handleValueWithDefault(Object obj, Object obj2) {
        return obj != null ? obj : obj2;
    }

    private void parseConstructorArgs(Map<String, Object> map) {
        Object obj = map.get(Constants.Service.INIT_METHOD);
        if (obj instanceof HashMap) {
            Object obj2 = ((Map) obj).get(Constants.Service.ARGS);
            if (obj2 instanceof List) {
                List list = (List) obj2;
                this.constructorArgs = new HashMap(1);
                for (int i2 = 0; i2 < list.size(); i2++) {
                    handleArgs(this.constructorArgs, (Map) list.get(i2));
                }
            }
        }
    }

    private void parseFactory(Map<String, Object> map) {
        this.factoryClass = (String) handleValueWithDefault(map.get(Constants.Service.FACTORY_CLASS), (Object) null);
        Object obj = map.get(Constants.Service.FACTORY_METHOD);
        if (obj instanceof HashMap) {
            HashMap hashMap = (HashMap) obj;
            this.factoryMethod = (String) hashMap.get("name");
            Object obj2 = hashMap.get(Constants.Service.ARGS);
            if (obj2 instanceof List) {
                List list = (List) obj2;
                this.factoryMethodArgs = new HashMap(1);
                for (int i2 = 0; i2 < list.size(); i2++) {
                    handleArgs(this.factoryMethodArgs, (Map) list.get(i2));
                }
            }
        }
    }

    private void parseInterface(Map<String, Object> map) {
        Object obj = map.get(Constants.Service.INTERFACE);
        if (obj == null) {
            return;
        }
        if (obj instanceof List) {
            this.interfaces.addAll((List) obj);
        } else if (obj instanceof String) {
            this.interfaces.add((String) obj);
        } else {
            throw new IllegalArgumentException("interface parse error :" + obj);
        }
    }

    private void parseMethods(Map<String, Object> map) {
        Object obj = map.get(Constants.Service.METHODS);
        if (obj instanceof List) {
            for (Map map2 : (List) obj) {
                String str = (String) map2.get("name");
                Object obj2 = map2.get(Constants.Service.ARGS);
                HashMap hashMap = new HashMap(1);
                if (obj2 instanceof List) {
                    List list = (List) obj2;
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        handleArgs(hashMap, (Map) list.get(i2));
                    }
                }
                if (this.methods == null) {
                    this.methods = new ArrayList();
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put(str, hashMap);
                this.methods.add(hashMap2);
            }
        }
    }

    private void parseProperties(Map<String, Object> map) {
        Object obj = map.get(Constants.Service.PROPERTIES);
        if (obj instanceof List) {
            List list = (List) obj;
            this.properties = new HashMap(1);
            for (int i2 = 0; i2 < list.size(); i2++) {
                handleArgs(this.properties, (Map) list.get(i2));
            }
        }
    }

    public String getServiceKey() {
        List<String> list;
        RAServiceMetaCenter serviceMetaCenter = RaftCodeGenRepository.getServiceMetaCenter();
        if (serviceMetaCenter == null) {
            RLog.w(TAG, "cannot find serviceMeta: " + this + ", maybe not a problem");
            return "invalidate_service_key";
        }
        String str = null;
        if (!TextUtils.isEmpty(this.className)) {
            str = serviceMetaCenter.mClassToServiceNameMap.get(this.className);
        }
        if (TextUtils.isEmpty(str) && (list = this.interfaces) != null && list.size() > 0) {
            str = serviceMetaCenter.mClassToServiceNameMap.get(this.interfaces.get(0));
        }
        if (TextUtils.isEmpty(str)) {
            RLog.e(TAG, "cannot find service: " + this);
        }
        return str;
    }

    public void parse(Map<String, Object> map) {
        this.className = (String) handleValueWithDefault(map.get(Constants.Service.CLASS), (Object) null);
        this.from = Constants.ConfigFrom.CONFIG_YAML;
        this.scope = Constants.Scope.parse((String) handleValueWithDefault(map.get(Constants.Service.SCOPE), Constants.Scope.PROTOTYPE.getAlias()));
        parseInterface(map);
        parseConstructorArgs(map);
        parseFactory(map);
        parseProperties(map);
        parseMethods(map);
    }

    public String toString() {
        StringBuilder i2 = a.i("RaftConfigService{from='");
        i2.append(this.from);
        i2.append('\'');
        i2.append(", className='");
        a.p(i2, this.className, '\'', ", scope=");
        i2.append(this.scope);
        i2.append(", factoryClass='");
        a.p(i2, this.factoryClass, '\'', ", factoryMethod='");
        a.p(i2, this.factoryMethod, '\'', ", factoryMethodArgs=");
        i2.append(this.factoryMethodArgs);
        i2.append(", constructorArgs=");
        i2.append(this.constructorArgs);
        i2.append(", properties=");
        i2.append(this.properties);
        i2.append(", methods=");
        i2.append(this.methods);
        i2.append(MessageFormatter.DELIM_STOP);
        return i2.toString();
    }
}
