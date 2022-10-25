package g.i.c.a.a.n.e.d;

import java.util.Map;
import java.util.Objects;

public class i extends e {
    public l a = new l();

    public Object c(Map<?, ?> map, String str) {
        Objects.requireNonNull(this.a);
        return map.remove(str);
    }

    public void f(String str, Map<String, Object> map, Map<String, Object> map2) {
        if ((map instanceof Map) && (map2 instanceof Map)) {
            if ("dt_audio_start".equals(str)) {
                if (map2.containsKey("dt_audio_starttime")) {
                    map.put("dt_audio_starttime", c(map2, "dt_audio_starttime"));
                }
                if (map2.containsKey("dt_audio_sessionid")) {
                    map.put("dt_audio_sessionid", c(map2, "dt_audio_sessionid"));
                }
                if (map2.containsKey("dt_audio_heartbeat_interval")) {
                    map.put("dt_audio_heartbeat_interval", c(map2, "dt_audio_heartbeat_interval"));
                }
                if (map2.containsKey("dt_audio_file_interval")) {
                    map.put("dt_audio_file_interval", c(map2, "dt_audio_file_interval"));
                }
                if (map2.containsKey("dt_play_type")) {
                    map.put("dt_play_type", c(map2, "dt_play_type"));
                }
                if (map2.containsKey("dt_audio_player_type")) {
                    map.put("dt_audio_player_type", c(map2, "dt_audio_player_type"));
                }
                if (map2.containsKey("dt_audio_contentid")) {
                    map.put("dt_audio_contentid", c(map2, "dt_audio_contentid"));
                }
            } else if ("dt_audio_end".equals(str)) {
                if (map2.containsKey("dt_audio_endtime")) {
                    map.put("dt_audio_endtime", c(map2, "dt_audio_endtime"));
                }
                if (map2.containsKey("dt_audio_sessionid")) {
                    map.put("dt_audio_sessionid", c(map2, "dt_audio_sessionid"));
                }
                if (map2.containsKey("dt_audio_duration_foreground")) {
                    map.put("dt_audio_duration_foreground", c(map2, "dt_audio_duration_foreground"));
                }
                if (map2.containsKey("dt_bg_play_duration")) {
                    map.put("dt_bg_play_duration", c(map2, "dt_bg_play_duration"));
                }
                if (map2.containsKey("dt_audio_contentid")) {
                    map.put("dt_audio_contentid", c(map2, "dt_audio_contentid"));
                }
            } else if ("dt_audio_heartbeat".equals(str)) {
                if (map2.containsKey("dt_audio_heartbeat_interval")) {
                    map.put("dt_audio_heartbeat_interval", c(map2, "dt_audio_heartbeat_interval"));
                }
                if (map2.containsKey("dt_audio_sessionid")) {
                    map.put("dt_audio_sessionid", c(map2, "dt_audio_sessionid"));
                }
                if (map2.containsKey("dt_audio_duration_foreground")) {
                    map.put("dt_audio_duration_foreground", c(map2, "dt_audio_duration_foreground"));
                }
                if (map2.containsKey("dt_bg_play_duration")) {
                    map.put("dt_bg_play_duration", c(map2, "dt_bg_play_duration"));
                }
                if (map2.containsKey("dt_audio_contentid")) {
                    map.put("dt_audio_contentid", c(map2, "dt_audio_contentid"));
                }
            }
        }
    }
}
