package g.c.a.b.c.i;

import android.text.TextUtils;
import com.apkpure.aegon.proto.projecta_config_svr.projecta_config_svr.nano.GetRainConfigRsp;
import g.c.b.a.d;
import i.o.b.l;
import java.util.Map;
import org.slf4j.Logger;

public final /* synthetic */ class a implements l {
    public final /* synthetic */ String b;
    public final /* synthetic */ e c;

    public /* synthetic */ a(String str, e eVar) {
        this.b = str;
        this.c = eVar;
    }

    public final Object g(Object obj) {
        String str;
        Logger logger;
        String str2;
        Map<String, String> map;
        String str3 = this.b;
        e eVar = this.c;
        T t = ((d) obj).b;
        if (t == null || (map = ((GetRainConfigRsp) t).data) == null) {
            logger = d.a;
            str2 = "请求配置 {} 时成功, 回包为空";
        } else {
            str = map.get(str3);
            if (TextUtils.isEmpty(str) || str == null) {
                logger = d.a;
                str2 = "请求配置 {} 时成功, 回包中不包含此 key";
            } else {
                d.a.info("请求配置 {} 时成功, value: {}", (Object) str3, (Object) str);
                d.b.put(str3, str);
                d.c.put(str3, Long.valueOf(System.currentTimeMillis()));
                eVar.a(str);
                return null;
            }
        }
        logger.info(str2, (Object) str3);
        str = "";
        eVar.a(str);
        return null;
    }
}
