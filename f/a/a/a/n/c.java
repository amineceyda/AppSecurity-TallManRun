package f.a.a.a.n;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.spi.MDCAdapter;

public final class c implements MDCAdapter {
    public final ThreadLocal<Map<String, String>> a = new ThreadLocal<>();
    public final ThreadLocal<Integer> b = new ThreadLocal<>();

    public final Map<String, String> a(Map<String, String> map) {
        Map<String, String> synchronizedMap = Collections.synchronizedMap(new HashMap());
        if (map != null) {
            synchronized (map) {
                synchronizedMap.putAll(map);
            }
        }
        this.a.set(synchronizedMap);
        return synchronizedMap;
    }

    public void clear() {
        this.b.set(1);
        this.a.remove();
    }

    public String get(String str) {
        Map map = this.a.get();
        if (map != null) {
            return (String) map.get(str);
        }
        return null;
    }

    public Map<String, String> getCopyOfContextMap() {
        Map map = this.a.get();
        if (map == null) {
            return null;
        }
        return new HashMap(map);
    }

    public void put(String str, String str2) throws IllegalArgumentException {
        Map<String, String> map = this.a.get();
        Integer num = this.b.get();
        boolean z = true;
        this.b.set(1);
        if (!(num == null || num.intValue() == 2)) {
            z = false;
        }
        if (z || map == null) {
            map = a(map);
        }
        map.put(str, str2);
    }

    public void remove(String str) {
        Map<String, String> map = this.a.get();
        if (map != null) {
            Integer num = this.b.get();
            boolean z = true;
            this.b.set(1);
            if (!(num == null || num.intValue() == 2)) {
                z = false;
            }
            if (z) {
                map = a(map);
            }
            map.remove(str);
        }
    }

    public void setContextMap(Map<String, String> map) {
        this.b.set(1);
        Map synchronizedMap = Collections.synchronizedMap(new HashMap());
        synchronizedMap.putAll(map);
        this.a.set(synchronizedMap);
    }
}
