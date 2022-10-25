package g.i.a.a.m;

import com.tencent.assistant.alive.log.IXLogService;
import com.tencent.raft.raftframework.RAFT;

public class a {
    public static C0145a a = new C0145a();

    /* renamed from: g.i.a.a.m.a$a  reason: collision with other inner class name */
    public static class C0145a {
        public boolean a = false;
        public String b = "";
        public IXLogService c;

        public C0145a() {
        }

        public C0145a(boolean z, String str, IXLogService iXLogService) {
            this.a = z;
            this.b = str;
            this.c = null;
        }
    }

    public static void a(String str, String str2) {
        c(str, 3, str2, (Throwable) null);
    }

    public static void b(Throwable th) {
        C0145a aVar = a;
        if (aVar.a) {
            IXLogService iXLogService = aVar.c;
            if (iXLogService != null) {
                iXLogService.b(th);
            }
            ((IXLogService) RAFT.get(IXLogService.class)).b(th);
        }
    }

    public static void c(String str, int i2, String str2, Throwable th) {
        C0145a aVar = a;
        if (aVar.a || i2 >= 5) {
            IXLogService iXLogService = aVar.c;
            if (iXLogService != null) {
                iXLogService.a(str, i2, aVar.b, str2, (Throwable) null);
            }
            ((IXLogService) RAFT.get(IXLogService.class)).a(str, i2, a.b, str2, (Throwable) null);
        }
    }
}
