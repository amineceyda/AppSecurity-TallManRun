package g.i.c.a.a.n.f;

import android.util.Pair;
import g.c.a.b.c.g;
import g.c.b.b.f;
import g.i.c.a.a.n.f.a;
import g.i.c.a.a.r.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import org.slf4j.Logger;

public class d implements g.i.c.a.a.c {
    public g.i.c.a.a.n.b.b a;
    public final ThreadLocal<Map<String, Object>> b = new c((a) null);
    public final ThreadLocal<Map<String, Object>> c = new c((a) null);

    /* renamed from: d  reason: collision with root package name */
    public final ThreadLocal<Map<String, Object>> f4469d = new c((a) null);

    public static class b {
        public static d a = new d((a) null);
    }

    public static class c extends ThreadLocal<Map<String, Object>> {
        public c(a aVar) {
        }

        public Object initialValue() {
            return new HashMap();
        }
    }

    public d(a aVar) {
    }

    public void a(Map<String, Object> map) {
        Map map2 = this.c.get();
        map2.clear();
        Objects.requireNonNull((g.c.a.e.h.b.b) this.a);
        d(map2);
        if (map != null) {
            map.putAll(map2);
        }
        if (!(this.a == null || map == null)) {
            HashMap hashMap = new HashMap();
            String str = "";
            hashMap.put("dt_qq", str);
            hashMap.put("dt_qqopenid", str);
            hashMap.put("dt_wxopenid", str);
            hashMap.put("dt_wxunionid", str);
            hashMap.put("dt_wbopenid", str);
            hashMap.put("dt_mainlogin", str);
            hashMap.put("dt_accountid", str);
            a aVar = a.b.a;
            String valueOf = String.valueOf(aVar.a);
            if (valueOf == null) {
                valueOf = str;
            }
            hashMap.put("dt_starttype", valueOf);
            String str2 = aVar.b;
            if (str2 == null) {
                str2 = str;
            }
            hashMap.put("dt_callfrom", str2);
            String str3 = aVar.c;
            if (str3 == null) {
                str3 = str;
            }
            hashMap.put("dt_callschema", str3);
            hashMap.put("dt_omgbzid", str);
            try {
                Logger logger = g.a;
            } catch (Throwable unused) {
                Logger logger2 = g.c.a.e.e.a.a;
            }
            hashMap.put("dt_fchlid", str);
            try {
                Logger logger3 = g.a;
            } catch (Throwable unused2) {
                Logger logger4 = g.c.a.e.e.a.a;
            }
            hashMap.put("dt_mchlid", str);
            hashMap.put("dt_simtype", str);
            hashMap.put("dt_adcode", str);
            hashMap.put("dt_tid", str);
            hashMap.put("dt_oaid", str);
            hashMap.put("dt_guid", str);
            String valueOf2 = String.valueOf(2350);
            if (valueOf2 != null) {
                str = valueOf2;
            }
            hashMap.put("dt_sdkversion", str);
            map.putAll(hashMap);
        }
        map2.clear();
    }

    public void b(String str, Map<String, Object> map) {
        Map map2 = this.f4469d.get();
        map2.clear();
        Objects.requireNonNull((g.c.a.e.h.b.b) this.a);
        d(map2);
        if (map != null) {
            map.putAll(map2);
        }
        map2.clear();
    }

    public void c(Map<String, Object> map) {
        Map map2 = this.b.get();
        map2.clear();
        Objects.requireNonNull((g.c.a.e.h.b.b) this.a);
        d(map2);
        map.putAll(map2);
        map2.clear();
    }

    public final void d(Map<String, Object> map) {
        Pair pair;
        if (e.b.a.a) {
            if (map.size() > 0) {
                Iterator<String> it = map.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String next = it.next();
                    boolean z = false;
                    if (next != null && next.length() != 0 && !next.startsWith("dt_") && !next.startsWith("rqd_") && !Pattern.matches("^[Aa][0-9].*", next)) {
                        z = true;
                        continue;
                    }
                    if (!z) {
                        pair = new Pair(next, Boolean.FALSE);
                        break;
                    }
                }
            }
            pair = new Pair("", Boolean.TRUE);
            if (!((Boolean) pair.second).booleanValue()) {
                String str = "invalid input key:" + ((String) pair.first) + "," + " 参数key不能为空，且不能以^[Aa][0-9].*, dt_, rqd_开头";
                if (e.b.a.a) {
                    f.x("DT_DataCheck", str);
                    throw new RuntimeException(str);
                }
            }
        }
    }
}
