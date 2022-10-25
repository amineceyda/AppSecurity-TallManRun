package g.i.c.a.a.w;

import g.a.a.a.a;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class f {
    public static final Set<String> a;
    public static final Set<String> b;

    static {
        HashSet hashSet = new HashSet();
        a = hashSet;
        HashSet hashSet2 = new HashSet();
        b = hashSet2;
        hashSet.add("dt_video_start");
        hashSet.add("dt_video_end");
        hashSet2.add("dt_audio_end");
    }

    public static String a(String str, Map<String, Object> map) {
        if (a.contains(str)) {
            return a.d(str, "_", (String) map.get("dt_content_type"), "_", (String) map.get("dt_video_contentid"));
        }
        if (b.contains(str)) {
            return a.c(str, "_", (String) map.get("dt_audio_contentid"));
        }
        return null;
    }
}
