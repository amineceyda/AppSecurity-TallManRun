package g.i.a.a.a.d;

import android.os.Looper;
import com.tencent.assistant.alive.api.IKeepAliveService;
import com.tencent.assistant.alive.config.IServerConfigService;
import com.tencent.assistant.alive.lifecycle.IAppLifeCycleService;
import com.tencent.assistant.alive.log.IXLogService;
import com.tencent.raft.raftannotation.RServiceImpl;
import com.tencent.raft.raftframework.RAFT;
import g.i.a.a.a.b;
import g.i.a.a.j.b.c;
import g.i.a.a.k.b;
import g.i.a.a.m.a;
import java.util.Objects;

@RServiceImpl(bindInterface = {IKeepAliveService.class})
public class a implements IKeepAliveService {
    public b a;

    /* renamed from: g.i.a.a.a.d.a$a  reason: collision with other inner class name */
    public class C0142a implements Runnable {
        public final /* synthetic */ b b;

        public C0142a(b bVar) {
            this.b = bVar;
        }

        public void run() {
            b bVar = this.b;
            g.i.a.a.m.a.a = new a.C0145a(bVar.f4084g, bVar.f4085h.f4088f, (IXLogService) null);
            if (!a.this.a()) {
                g.i.a.a.m.a.a("IKeepAliveService", "not enable");
                return;
            }
            g.i.a.a.m.a.a("IKeepAliveService", "enable keep alive");
            ((IServerConfigService) RAFT.get(IServerConfigService.class)).a();
            c cVar = new c(this.b);
            g.i.a.a.m.a.a("IKeepAliveService", String.format("aliveStrategy name:%s", new Object[]{c.class.getSimpleName()}));
            if (cVar.processMonitor != null) {
                g.i.a.a.k.b bVar2 = b.C0144b.a;
                g.i.a.a.j.b.a aVar = new g.i.a.a.j.b.a(cVar);
                Objects.requireNonNull(bVar2);
                try {
                    bVar2.a.submit(aVar);
                } catch (Throwable th) {
                    g.i.a.a.m.a.b(th);
                }
            }
            g.i.a.a.a.b bVar3 = this.b;
            if (bVar3.f4085h.f4088f.equals(bVar3.a())) {
                ((IAppLifeCycleService) RAFT.get(IAppLifeCycleService.class)).b(this.b);
                g.i.a.a.a.b bVar4 = cVar.config;
                if (bVar4.f4082e) {
                    g.i.a.a.i.b bVar5 = new g.i.a.a.i.b(bVar4);
                    cVar.processAliveTimeReportJob = bVar5;
                    ((g.i.a.a.j.c.a) cVar.processMonitor).a(bVar5);
                    cVar.processAliveTimeReportJob.a();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a() {
        /*
            r6 = this;
            g.i.a.a.a.b r0 = r6.a
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0048
            g.i.a.a.a.c r3 = r0.f4085h
            java.lang.String r4 = r3.f4088f
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x0011
            goto L_0x0038
        L_0x0011:
            java.lang.String r4 = r3.b
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x001a
            goto L_0x0038
        L_0x001a:
            java.lang.String r4 = r3.f4086d
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x0023
            goto L_0x0038
        L_0x0023:
            java.lang.String r4 = r3.f4088f
            java.lang.String r5 = r3.b
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x003a
            java.lang.String r4 = r3.f4088f
            java.lang.String r3 = r3.f4086d
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r3 = 0
            goto L_0x003b
        L_0x003a:
            r3 = 1
        L_0x003b:
            if (r3 == 0) goto L_0x0043
            boolean r0 = r0.f4081d
            if (r0 == 0) goto L_0x0043
            r0 = 1
            goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            if (r0 == 0) goto L_0x0048
            r0 = 1
            goto L_0x0049
        L_0x0048:
            r0 = 0
        L_0x0049:
            if (r0 != 0) goto L_0x0053
            java.lang.String r0 = "IKeepAliveService"
            java.lang.String r1 = "clientEnable not true"
            g.i.a.a.m.a.a(r0, r1)
            return r2
        L_0x0053:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.a.a.a.d.a.a():boolean");
    }

    public void b(g.i.a.a.a.b bVar) {
        this.a = bVar;
        g.i.a.a.k.b bVar2 = b.C0144b.a;
        C0142a aVar = new C0142a(bVar);
        Objects.requireNonNull(bVar2);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            aVar.run();
        }
        try {
            bVar2.a.submit(aVar);
        } catch (Throwable th) {
            g.i.a.a.m.a.b(th);
        }
    }

    public g.i.a.a.a.b c() {
        return this.a;
    }
}
