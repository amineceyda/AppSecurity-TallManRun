package g.i.a.a.i;

import com.tencent.assistant.alive.db.ISettingService;
import com.tencent.raft.raftframework.RAFT;
import g.g.a;
import g.i.a.a.j.c.b;
import g.i.a.a.l.e.a;
import java.util.List;

public class b extends a implements b.a {
    private long currentPeriodProcessAliveTime = 0;
    private String currentProcessName;
    private boolean isBeginReportAliveTime = false;
    private final Object lock = new Object();
    public a proceeAliveReportTimeIntervalConfig;
    private g.i.a.a.a.a processAliveCallback;
    private long totalProcessAliveTime = 0;

    public b(g.i.a.a.a.b bVar) {
        if (bVar != null) {
            this.currentProcessName = bVar.f4085h.f4088f;
            this.processAliveCallback = bVar.b;
            a aVar = new a();
            this.proceeAliveReportTimeIntervalConfig = aVar;
            List<Long> list = bVar.c;
            if (!list.isEmpty()) {
                aVar.a.clear();
                aVar.a.addAll(list);
            }
        }
    }

    public long X() {
        long j2;
        a aVar = this.proceeAliveReportTimeIntervalConfig;
        if (aVar.a.isEmpty()) {
            j2 = 10000;
        } else {
            if (aVar.b >= aVar.a.size()) {
                aVar.b = aVar.a.size() - 1;
            }
            List<Long> list = aVar.a;
            int i2 = aVar.b;
            aVar.b = i2 + 1;
            j2 = list.get(i2).longValue();
        }
        this.currentPeriodProcessAliveTime = j2;
        StringBuilder i3 = g.a.a.a.a.i("currentPeriodProcessAliveTime：");
        i3.append(this.currentPeriodProcessAliveTime);
        g.i.a.a.m.a.a("ProcessAliveTimeReporter", i3.toString());
        return this.currentPeriodProcessAliveTime;
    }

    @Deprecated
    public void Y(String str) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        r0 = com.tencent.assistant.alive.db.ISettingService.class;
        r5 = 0;
        r1 = ((com.tencent.assistant.alive.db.ISettingService) com.tencent.raft.raftframework.RAFT.get(r0)).getLong("key_last_process_report_time_" + r10.currentProcessName, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r7 = java.lang.Long.parseLong(g.i.a.a.e.a.a("dead_stamp").a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0057, code lost:
        g.i.a.a.m.a.b(r3);
        r7 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
            r10 = this;
            java.lang.String r0 = "ProcessAliveTimeReporter"
            java.lang.String r1 = "startReport: "
            java.lang.StringBuilder r1 = g.a.a.a.a.i(r1)
            java.lang.String r2 = r10.currentProcessName
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            g.i.a.a.m.a.a(r0, r1)
            boolean r0 = r10.isBeginReportAliveTime
            if (r0 == 0) goto L_0x0019
            return
        L_0x0019:
            java.lang.Object r0 = r10.lock
            monitor-enter(r0)
            boolean r1 = r10.isBeginReportAliveTime     // Catch:{ all -> 0x00ff }
            if (r1 == 0) goto L_0x0022
            monitor-exit(r0)     // Catch:{ all -> 0x00ff }
            return
        L_0x0022:
            r1 = 1
            r10.isBeginReportAliveTime = r1     // Catch:{ all -> 0x00ff }
            monitor-exit(r0)     // Catch:{ all -> 0x00ff }
            java.lang.Class<com.tencent.assistant.alive.db.ISettingService> r0 = com.tencent.assistant.alive.db.ISettingService.class
            java.lang.Object r1 = com.tencent.raft.raftframework.RAFT.get(r0)
            com.tencent.assistant.alive.db.ISettingService r1 = (com.tencent.assistant.alive.db.ISettingService) r1
            java.lang.String r2 = r10.currentProcessName
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "key_last_process_report_time_"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r5 = 0
            long r1 = r1.getLong(r2, r5)
            java.lang.String r3 = "dead_stamp"
            com.tencent.assistant.alive.db.jni.MemFileJniApi r3 = g.i.a.a.e.a.a(r3)
            java.lang.String r3 = r3.a()
            long r7 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x0056 }
            goto L_0x005b
        L_0x0056:
            r3 = move-exception
            g.i.a.a.m.a.b(r3)
            r7 = r5
        L_0x005b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r9 = "fixWithNativeDeadStamp "
            r3.append(r9)
            r3.append(r1)
            java.lang.String r9 = " getNative long: "
            r3.append(r9)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            java.lang.String r9 = "ProcessAliveTimeReporter"
            g.i.a.a.m.a.a(r9, r3)
            long r1 = java.lang.Math.max(r1, r7)
            java.lang.Object r3 = com.tencent.raft.raftframework.RAFT.get(r0)
            com.tencent.assistant.alive.db.ISettingService r3 = (com.tencent.assistant.alive.db.ISettingService) r3
            java.lang.String r7 = r10.currentProcessName
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r4)
            r8.append(r7)
            java.lang.String r4 = r8.toString()
            r3.putLong(r4, r5)
            java.lang.Object r0 = com.tencent.raft.raftframework.RAFT.get(r0)
            com.tencent.assistant.alive.db.ISettingService r0 = (com.tencent.assistant.alive.db.ISettingService) r0
            java.lang.String r3 = r10.currentProcessName
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "key_last_process_alive_time_"
            r4.append(r7)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            long r3 = r0.getLong(r3, r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "getLastReport: "
            r0.append(r7)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            g.i.a.a.m.a.a(r9, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "getLastDied: "
            r0.append(r7)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            g.i.a.a.m.a.a(r9, r0)
            long r1 = r1 - r3
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x00e2
            goto L_0x00e3
        L_0x00e2:
            r5 = r1
        L_0x00e3:
            r10.totalProcessAliveTime = r5
            java.lang.String r0 = "ProcessAliveTimeReporter"
            java.lang.String r1 = "restoreLastProcessAliveTime: "
            java.lang.StringBuilder r1 = g.a.a.a.a.i(r1)
            long r2 = r10.totalProcessAliveTime
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            g.i.a.a.m.a.a(r0, r1)
            g.i.a.a.l.c r0 = g.i.a.a.l.c.a.a
            r0.a(r10)
            return
        L_0x00ff:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ff }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.a.a.i.b.a():void");
    }

    public void v() {
        this.totalProcessAliveTime += this.currentPeriodProcessAliveTime;
        long currentTimeMillis = System.currentTimeMillis();
        ((ISettingService) RAFT.get(ISettingService.class)).putLong("key_last_process_alive_time_" + this.currentProcessName, currentTimeMillis);
        g.i.a.a.m.a.a("ProcessAliveTimeReporter", "lastReportTime: " + currentTimeMillis);
        g.i.a.a.m.a.a("ProcessAliveTimeReporter", "process alive：" + this.currentProcessName + "|" + this.currentPeriodProcessAliveTime + "|" + this.totalProcessAliveTime);
        g.i.a.a.a.a aVar = this.processAliveCallback;
        if (aVar != null) {
            String str = this.currentProcessName;
            long j2 = this.currentPeriodProcessAliveTime;
            long j3 = this.totalProcessAliveTime;
            a.C0139a aVar2 = (a.C0139a) aVar;
            g.g.a.a.debug("processName: {}, currentPeriodProcessAliveTime: {}|{}, ", str, Long.valueOf(j2), Long.valueOf(j3));
            if (j2 != 0) {
                g.g.b.b.c(aVar2.a, j2);
            } else if (j3 > 1000) {
                g.g.b.b.c(aVar2.a, j3);
            }
        }
    }
}
