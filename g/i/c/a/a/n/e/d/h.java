package g.i.c.a.a.n.e.d;

import java.util.Map;
import java.util.Objects;

public class h extends b {
    public l a = new l();

    public Object c(Map<?, ?> map, String str) {
        Objects.requireNonNull(this.a);
        return map.remove(str);
    }

    public void f(String str, Map<String, Object> map, Map<String, Object> map2) {
        super.f(str, map, map2);
        if ((map instanceof Map) && (map2 instanceof Map)) {
            if ("appout".equals(str)) {
                this.a.k(map, map2);
                if (map2.containsKey("dt_app_stoptime")) {
                    map.put("dt_app_stoptime", c(map2, "dt_app_stoptime"));
                }
                if (map2.containsKey("dt_sys_elapsed_realtime")) {
                    map.put("dt_sys_elapsed_realtime", c(map2, "dt_sys_elapsed_realtime"));
                }
                if (map2.containsKey("dt_app_foreground_duration")) {
                    map.put("dt_app_foreground_duration", c(map2, "dt_app_foreground_duration"));
                }
                if (map2.containsKey("dt_app_sessionid")) {
                    map.put("dt_app_sessionid", c(map2, "dt_app_sessionid"));
                }
            } else if ("appin".equals(str)) {
                if (map2.containsKey("dt_app_starttime")) {
                    map.put("dt_app_starttime", c(map2, "dt_app_starttime"));
                }
                if (map2.containsKey("dt_sys_elapsed_realtime")) {
                    map.put("dt_sys_elapsed_realtime", c(map2, "dt_sys_elapsed_realtime"));
                }
                if (map2.containsKey("dt_app_heartbeat_interval")) {
                    map.put("dt_app_heartbeat_interval", c(map2, "dt_app_heartbeat_interval"));
                }
                if (map2.containsKey("dt_app_file_interval")) {
                    map.put("dt_app_file_interval", c(map2, "dt_app_file_interval"));
                }
                if (map2.containsKey("dt_app_sessionid")) {
                    map.put("dt_app_sessionid", c(map2, "dt_app_sessionid"));
                }
            } else if ("dt_app_heartbeat".equals(str)) {
                if (map2.containsKey("dt_app_sessionid")) {
                    map.put("dt_app_sessionid", c(map2, "dt_app_sessionid"));
                }
                if (map2.containsKey("dt_app_foreground_heartbeat_duration")) {
                    map.put("dt_app_foreground_heartbeat_duration", c(map2, "dt_app_foreground_heartbeat_duration"));
                }
            }
        }
    }
}
