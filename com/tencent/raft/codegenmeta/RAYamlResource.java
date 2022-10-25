package com.tencent.raft.codegenmeta;

import com.tencent.raft.codegenmeta.utils.Constants;
import g.a.a.a.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.slf4j.helpers.MessageFormatter;

public class RAYamlResource {
    public static final String DEFAULT_STRING = "RaYamlResource_DEFAULT_STRING";
    public String apiVersion;
    public List<Map<String, Object>> configs = new ArrayList();
    public String description;
    public String kind;
    public String name;
    public String platform;
    public List<Map<String, Object>> services = new ArrayList();
    public String version;

    private static Object defaultIfEmpty(Object obj, Object obj2) {
        return obj == null ? obj2 : obj;
    }

    public void parse(Map<String, Object> map) {
        this.apiVersion = (String) defaultIfEmpty(map.get(Constants.Raft.API_VERSION), DEFAULT_STRING);
        this.kind = (String) defaultIfEmpty(map.get(Constants.Raft.KIND), DEFAULT_STRING);
        this.platform = (String) defaultIfEmpty(map.get(Constants.Raft.PLATFORM), DEFAULT_STRING);
        this.name = (String) defaultIfEmpty(map.get("name"), DEFAULT_STRING);
        this.version = (String) defaultIfEmpty(map.get(Constants.Raft.VERSION), DEFAULT_STRING);
        this.description = (String) defaultIfEmpty(map.get("description"), DEFAULT_STRING);
        Map map2 = (Map) map.get(Constants.Raft.EXPORTS);
        if (map2 != null) {
            this.services = (List) defaultIfEmpty(map2.get("services"), new ArrayList());
        }
    }

    public String toString() {
        StringBuilder i2 = a.i("RAYamlResource{apiVersion='");
        a.p(i2, this.apiVersion, '\'', ", kind='");
        a.p(i2, this.kind, '\'', ", platform='");
        a.p(i2, this.platform, '\'', ", name='");
        a.p(i2, this.name, '\'', ", version='");
        a.p(i2, this.version, '\'', ", description='");
        a.p(i2, this.description, '\'', ", services=");
        i2.append(this.services);
        i2.append('\'');
        i2.append(", configs='");
        i2.append(this.configs);
        i2.append('\'');
        i2.append(MessageFormatter.DELIM_STOP);
        return i2.toString();
    }
}
