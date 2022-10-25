package g.i.a.a.f;

import com.tencent.assistant.alive.lifecycle.IAppLifeCycleService;
import g.i.a.a.l.e.a;

public class c extends a {
    public IAppLifeCycleService appLifeCycleService = null;

    public c(IAppLifeCycleService iAppLifeCycleService) {
        this.appLifeCycleService = iAppLifeCycleService;
    }

    public long X() {
        return 1000;
    }

    public void v() {
        IAppLifeCycleService iAppLifeCycleService = this.appLifeCycleService;
        if (iAppLifeCycleService != null) {
            iAppLifeCycleService.a();
        }
    }
}
