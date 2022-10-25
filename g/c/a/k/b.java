package g.c.a.k;

import com.apkpure.aegon.services.AppProtoBufUpdateService;
import i.o.b.p;

public final /* synthetic */ class b implements p {
    public final /* synthetic */ AppProtoBufUpdateService b;

    public /* synthetic */ b(AppProtoBufUpdateService appProtoBufUpdateService) {
        this.b = appProtoBufUpdateService;
    }

    public final Object d(Object obj, Object obj2) {
        AppProtoBufUpdateService appProtoBufUpdateService = this.b;
        Integer num = (Integer) obj;
        String str = (String) obj2;
        synchronized (appProtoBufUpdateService.f264f) {
            appProtoBufUpdateService.f265g = false;
        }
        return null;
    }
}
