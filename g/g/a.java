package g.g;

import android.app.Application;
import android.text.TextUtils;
import com.apkpure.aegon.application.RealApplicationLike;
import com.apkpure.keepalive.AlphaService;
import com.apkpure.keepalive.BetaService;
import com.apkpure.keepalive.QDInstrumentation;
import com.tencent.assistant.alive.api.IKeepAliveService;
import com.tencent.assistant.alive.lifecycle.IAppLifeCycleService;
import com.tencent.raft.raftframework.RAFT;
import e.e.i.b;
import g.i.a.a.a.b;
import g.i.a.a.a.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class a {
    public static final Logger a = LoggerFactory.getLogger("APKPure_KeepAliveLog");
    public static final List<Long> b = new ArrayList(Arrays.asList(new Long[]{20000L, 40000L, 60000L, 120000L, 180000L, 300000L}));

    /* renamed from: g.g.a$a  reason: collision with other inner class name */
    public static class C0139a implements g.i.a.a.a.a {
        public final /* synthetic */ Application a;

        public C0139a(Application application) {
            this.a = application;
        }
    }

    public static boolean a() {
        return RAFT.isInit() && ((IKeepAliveService) RAFT.get(IKeepAliveService.class)).a();
    }

    public static void b(boolean z) {
        if (a()) {
            try {
                ((IAppLifeCycleService) RAFT.get(IAppLifeCycleService.class)).onWindowFocusChanged(z);
            } catch (Exception e2) {
                a.warn("onWindowFocusChanged: {}", (Object) e2.getMessage(), (Object) e2);
            }
        }
    }

    public static void c() {
        if (a()) {
            try {
                ((IAppLifeCycleService) RAFT.get(IAppLifeCycleService.class)).a();
            } catch (Exception e2) {
                a.warn("refreshAppFrontState: {}", (Object) e2.getMessage(), (Object) e2);
            }
        }
    }

    public static void d(Application application) {
        Logger logger = a;
        String y = b.y();
        if (y == null) {
            y = "";
        }
        logger.info("启动保活服务 Process name: {}", (Object) y);
        c cVar = new c(QDInstrumentation.class);
        cVar.b = RealApplicationLike.MAIN_PROCESS_NAME;
        cVar.c = AlphaService.class;
        cVar.f4086d = RealApplicationLike.BETA_PROCESS_NAME;
        cVar.f4087e = BetaService.class;
        g.i.a.a.a.b bVar = new g.i.a.a.a.b((b.a) null);
        boolean z = true;
        bVar.f4081d = true;
        bVar.f4084g = false;
        bVar.f4082e = true;
        bVar.f4085h = cVar;
        List<Long> list = b;
        if (!list.isEmpty()) {
            bVar.c.clear();
            bVar.c.addAll(list);
        }
        bVar.a = application;
        bVar.b = new C0139a(application);
        ((IKeepAliveService) RAFT.get(IKeepAliveService.class)).b(bVar);
        String y2 = e.e.i.b.y();
        if (!TextUtils.isEmpty(y2) && !RealApplicationLike.MAIN_PROCESS_NAME.equals(y2)) {
            z = false;
        }
        if (z && g.g.b.b.b(application) == 0) {
            g.g.b.b.d(application);
        }
    }
}
