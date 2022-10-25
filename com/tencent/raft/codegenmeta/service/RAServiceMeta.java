package com.tencent.raft.codegenmeta.service;

import com.tencent.raft.codegenmeta.utils.Constants;
import com.tencent.raft.codegenmeta.utils.TextUtils;
import g.a.a.a.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.helpers.MessageFormatter;

public class RAServiceMeta {
    private static final String TAG = "RAServiceMeta";
    public List<ArgsDescription> constructorArgsDesc = new ArrayList();
    public String factoryClass;
    public String factoryMethod;
    public List<ArgsDescription> factoryMethodArgsDesc = new ArrayList();
    public List<String> interfaces = new ArrayList();
    public String itemClass;
    public List<Map<String, Object>> methodInjection;
    public List<Map<String, List<ArgsDescription>>> methods = new ArrayList();
    public List<ArgsDescription> properties = new ArrayList();

    public static final class ArgsDescription {
        public String name;
        public String type;

        public ArgsDescription(String str, String str2) {
            this.name = str;
            this.type = str2;
        }

        public static ArgsDescription build(Map map) {
            String str = (String) map.keySet().toArray()[0];
            return new ArgsDescription(str, (String) map.get(str));
        }
    }

    private static Object defaultIfEmpty(Object obj, Object obj2) {
        return obj == null ? obj2 : obj;
    }

    private static void fetchArgFromMethodObj(Map<String, Object> map, List<ArgsDescription> list) {
        List list2 = (List) map.get(Constants.Service.ARGS);
        if (list2 != null) {
            for (int i2 = 0; i2 < list2.size(); i2++) {
                Object obj = list2.get(i2);
                if (obj instanceof List) {
                    for (Map build : (List) obj) {
                        list.add(ArgsDescription.build(build));
                    }
                } else if (obj instanceof Map) {
                    list.add(ArgsDescription.build((Map) obj));
                }
            }
        }
    }

    public static boolean isEmpty(String str) {
        return str == null || str.equals("");
    }

    private void parseConstructorArgs(Map<String, Object> map) {
        List list = (List) ((Map) defaultIfEmpty(map.get(Constants.Service.INIT_METHOD), new HashMap())).get(Constants.Service.ARGS);
        if (list != null) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                Map map2 = (Map) list.get(i2);
                String str = (String) map2.keySet().toArray()[0];
                this.constructorArgsDesc.add(new ArgsDescription(str, (String) map2.get(str)));
            }
        }
    }

    private void parseFactory(Map<String, Object> map) {
        this.factoryClass = (String) defaultIfEmpty(map.get(Constants.Service.FACTORY_CLASS), (Object) null);
        Map map2 = (Map) defaultIfEmpty(map.get(Constants.Service.FACTORY_METHOD), (Object) null);
        if (map2 != null) {
            this.factoryMethod = (String) map2.get("name");
            fetchArgFromMethodObj(map2, this.factoryMethodArgsDesc);
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
                ArrayList arrayList = new ArrayList();
                if (obj2 instanceof List) {
                    List list = (List) obj2;
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        Map map3 = (Map) list.get(i2);
                        String str2 = (String) map3.keySet().toArray()[0];
                        arrayList.add(new ArgsDescription(str2, (String) map3.get(str2)));
                    }
                }
                HashMap hashMap = new HashMap();
                hashMap.put(str, arrayList);
                this.methods.add(hashMap);
            }
        }
    }

    private void parseProperties(Map<String, Object> map) {
        List list = (List) defaultIfEmpty(map.get(Constants.Service.PROPERTIES), (Object) null);
        if (list != null) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                Map map2 = (Map) list.get(i2);
                String str = (String) map2.keySet().toArray()[0];
                this.properties.add(new ArgsDescription(str, (String) map2.get(str)));
            }
        }
    }

    public String getServiceKey() {
        String str;
        List<String> list = this.interfaces;
        if (list == null || list.size() <= 0) {
            str = !TextUtils.isEmpty(this.itemClass) ? this.itemClass : null;
        } else {
            int size = this.interfaces.size();
            String[] strArr = new String[size];
            for (int i2 = 0; i2 < this.interfaces.size(); i2++) {
                strArr[i2] = this.interfaces.get(i2);
            }
            Arrays.sort(strArr);
            StringBuilder sb = new StringBuilder();
            for (int i3 = 0; i3 < size; i3++) {
                sb.append(strArr[i3]);
            }
            int hashCode = sb.toString().hashCode();
            if (hashCode < 0) {
                hashCode = -hashCode;
            }
            str = a.q(Constants.Service.INTERFACE, hashCode);
        }
        if (str.startsWith("com.")) {
            str = str.substring(4);
        }
        return str.startsWith("tencent.") ? str.substring(8) : str;
    }

    public void parse(Map<String, Object> map) {
        this.itemClass = (String) defaultIfEmpty(map.get(Constants.Service.CLASS), (Object) null);
        this.methodInjection = (List) defaultIfEmpty(map.get(Constants.Service.REPLACE_METHOD), (Object) null);
        parseInterface(map);
        parseConstructorArgs(map);
        parseFactory(map);
        parseProperties(map);
        parseMethods(map);
    }

    public void parseDeclare(Map<String, Object> map) {
        this.itemClass = (String) defaultIfEmpty(map.get(Constants.Service.CLASS), (Object) null);
        this.methodInjection = (List) defaultIfEmpty(map.get(Constants.Service.REPLACE_METHOD), (Object) null);
        parseInterface(map);
        parseConstructorArgs(map);
        parseFactory(map);
        parseProperties(map);
    }

    public String toString() {
        StringBuilder i2 = a.i("RAServiceMeta{interfaces=");
        i2.append(this.interfaces);
        i2.append(", itemClass='");
        a.p(i2, this.itemClass, '\'', ", factoryClass='");
        a.p(i2, this.factoryClass, '\'', ", factoryMethod='");
        a.p(i2, this.factoryMethod, '\'', ", factoryMethodArgsDesc=");
        i2.append(this.factoryMethodArgsDesc);
        i2.append(", constructorArgsDesc=");
        i2.append(this.constructorArgsDesc);
        i2.append(", properties=");
        i2.append(this.properties);
        i2.append(", methodInjection=");
        i2.append(this.methodInjection);
        i2.append(MessageFormatter.DELIM_STOP);
        return i2.toString();
    }
}
