package g.c.a.b.c.i;

import com.apkpure.aegon.proto.projecta_config_svr.projecta_config_svr.nano.GetRainConfigReq;
import com.apkpure.aegon.proto.projecta_config_svr.projecta_config_svr.nano.GetRainConfigRsp;
import g.c.b.a.e;
import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class d {
    public static final Logger a = LoggerFactory.getLogger("RainbowConfig");
    public static final HashMap<String, String> b = new HashMap<>();
    public static final HashMap<String, Long> c = new HashMap<>();

    public static void a(String str, e eVar) {
        GetRainConfigReq getRainConfigReq = new GetRainConfigReq();
        getRainConfigReq.keyword = str;
        e.a aVar = new e.a();
        aVar.f("get_rainbow_config");
        aVar.c = getRainConfigReq;
        aVar.d(b.b);
        aVar.c(GetRainConfigRsp.class, new a(str, eVar));
        aVar.b(new c(str, eVar));
        aVar.e();
    }

    public static void b(String str, e eVar) {
        a.info("请求配置 {} 时, 是否使用缓存{}", (Object) str, (Object) Boolean.TRUE);
        String str2 = b.get(str);
        if (str2 != null) {
            Long l2 = c.get(str);
            boolean z = true;
            if (l2 != null && System.currentTimeMillis() - l2.longValue() <= 300000) {
                z = false;
            }
            if (!z) {
                eVar.a(str2);
                return;
            }
        }
        a(str, eVar);
    }
}
