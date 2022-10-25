package m.b.a.a.b;

import java.lang.management.ManagementFactory;
import java.util.concurrent.Callable;
import javax.management.MBeanServer;
import javax.management.ObjectName;
import javax.management.StandardMBean;
import m.b.a.a.a;

public class e implements Callable<Void> {
    public final MBeanServer a;
    public final ObjectName b;

    public e(a aVar) throws Exception {
        MBeanServer platformMBeanServer = ManagementFactory.getPlatformMBeanServer();
        this.a = platformMBeanServer;
        ObjectName objectName = new ObjectName("org.jacoco:type=Runtime");
        this.b = objectName;
        platformMBeanServer.registerMBean(new StandardMBean(aVar, a.class), objectName);
    }

    public Void a() throws Exception {
        this.a.unregisterMBean(this.b);
        return null;
    }

    public /* bridge */ /* synthetic */ Object call() throws Exception {
        a();
        return null;
    }
}
