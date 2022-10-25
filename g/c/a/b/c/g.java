package g.c.a.b.c;

import com.apkpure.aegon.application.AegonApplication;
import com.apkpure.crabshell.GlobalConst;
import com.tencent.raft.raftframework.sla.SLAConstant;
import g.c.a.e.h.b.d;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class g {
    public static Logger a = LoggerFactory.getLogger("");
    public static String b = SLAConstant.TYPE_DEPRECATED_START;
    public static String c = SLAConstant.TYPE_DEPRECATED_START;

    public static synchronized String a() {
        String str;
        synchronized (g.class) {
            str = b;
        }
        return str;
    }

    public static String b() {
        AegonApplication.getContext();
        StringBuilder sb = new StringBuilder();
        Logger logger = g.c.a.m.g.a;
        sb.append(GlobalConst.VERSION_NAME);
        sb.append("_");
        sb.append(GlobalConst.VERSIONCODE);
        sb.append("_");
        sb.append(g.c.a.m.g.b());
        return sb.toString();
    }

    public static synchronized void c(f fVar) {
        synchronized (g.class) {
            a.info("set viaSource: {}", (Object) fVar);
            b = String.valueOf(fVar.ordinal());
            Logger logger = d.a;
            d.l("active_source", a());
        }
    }

    public static synchronized void d(f fVar) {
        synchronized (g.class) {
            b = String.valueOf(fVar.ordinal() + 1);
            Logger logger = d.a;
            d.l("create_via", a());
        }
    }
}
