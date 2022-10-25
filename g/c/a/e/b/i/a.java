package g.c.a.e.b.i;

import g.i.b.c;

public class a {
    public static volatile a c;
    public g.i.b.a a;
    public c b;

    public static a a() {
        if (c == null) {
            synchronized (a.class) {
                if (c == null) {
                    c = new a();
                }
            }
        }
        return c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: java.io.BufferedReader} */
    /* JADX WARNING: type inference failed for: r9v7 */
    /* JADX WARNING: type inference failed for: r9v8, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r9v9 */
    /* JADX WARNING: type inference failed for: r9v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0098 A[SYNTHETIC, Splitter:B:23:0x0098] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0220 A[SYNTHETIC, Splitter:B:80:0x0220] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00ec A[EDGE_INSN: B:86:0x00ec->B:53:0x00ec ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(android.content.Context r14) {
        /*
            r13 = this;
            g.i.b.d r0 = new g.i.b.d
            java.lang.String r1 = "uuid"
            java.lang.String r2 = "channelid"
            r3 = 0
            r0.<init>(r14, r3, r1, r2)
            g.i.b.b r14 = g.i.b.b.c()
            r13.a = r14
            g.i.b.b r14 = (g.i.b.b) r14
            java.util.Objects.requireNonNull(r14)
            java.lang.String r14 = "halley-cloud-HalleyAgent"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "HalleyAgent.init start. initFinish:"
            r1.<init>(r2)
            boolean r2 = g.i.b.b.b
            r1.append(r2)
            java.lang.String r2 = ",type:http,param:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            g.i.b.e.h.b.h(r14, r1)
            boolean r14 = g.i.b.b.b
            r1 = 1
            if (r14 == 0) goto L_0x0039
            goto L_0x0202
        L_0x0039:
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = android.os.SystemClock.elapsedRealtime()
            android.content.Context r14 = r0.a
            java.lang.String r2 = g.i.b.e.f.j.a
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x004f
            java.lang.String r14 = g.i.b.e.f.j.a
            goto L_0x00ef
        L_0x004f:
            java.lang.String r2 = r14.getPackageName()
            int r8 = android.os.Process.myPid()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "/proc/"
            r9.<init>(r10)
            r9.append(r8)
            java.lang.String r8 = "/cmdline"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r9 = 0
            java.io.BufferedReader r10 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0091, all -> 0x008e }
            java.io.FileReader r11 = new java.io.FileReader     // Catch:{ Exception -> 0x0091, all -> 0x008e }
            r11.<init>(r8)     // Catch:{ Exception -> 0x0091, all -> 0x008e }
            r10.<init>(r11)     // Catch:{ Exception -> 0x0091, all -> 0x008e }
            java.lang.String r8 = r10.readLine()     // Catch:{ Exception -> 0x008c }
            boolean r11 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x008c }
            if (r11 != 0) goto L_0x0083
            java.lang.String r8 = r8.trim()     // Catch:{ Exception -> 0x008c }
        L_0x0083:
            r10.close()     // Catch:{ IOException -> 0x0087 }
            goto L_0x00a1
        L_0x0087:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x00a1
        L_0x008c:
            r8 = move-exception
            goto L_0x0093
        L_0x008e:
            r14 = move-exception
            goto L_0x021e
        L_0x0091:
            r8 = move-exception
            r10 = r9
        L_0x0093:
            r8.printStackTrace()     // Catch:{ all -> 0x021c }
            if (r10 == 0) goto L_0x00a0
            r10.close()     // Catch:{ IOException -> 0x009c }
            goto L_0x00a0
        L_0x009c:
            r8 = move-exception
            r8.printStackTrace()
        L_0x00a0:
            r8 = r9
        L_0x00a1:
            boolean r10 = android.text.TextUtils.isEmpty(r8)
            if (r10 != 0) goto L_0x00b0
            boolean r2 = r8.startsWith(r2)
            if (r2 != 0) goto L_0x00ae
            goto L_0x00b0
        L_0x00ae:
            r14 = r8
            goto L_0x00ed
        L_0x00b0:
            int r2 = android.os.Process.myPid()
            java.lang.String r8 = "activity"
            java.lang.Object r14 = r14.getSystemService(r8)
            if (r14 == 0) goto L_0x00c3
            android.app.ActivityManager r14 = (android.app.ActivityManager) r14     // Catch:{ all -> 0x00bf }
            goto L_0x00c4
        L_0x00bf:
            r14 = move-exception
            r14.printStackTrace()
        L_0x00c3:
            r14 = r9
        L_0x00c4:
            if (r14 != 0) goto L_0x00c7
            goto L_0x00ec
        L_0x00c7:
            java.util.List r14 = r14.getRunningAppProcesses()
            if (r14 == 0) goto L_0x00ec
            int r8 = r14.size()
            if (r8 <= 0) goto L_0x00ec
            int r8 = r14.size()
            r10 = 0
        L_0x00d8:
            if (r10 >= r8) goto L_0x00ec
            java.lang.Object r11 = r14.get(r10)
            android.app.ActivityManager$RunningAppProcessInfo r11 = (android.app.ActivityManager.RunningAppProcessInfo) r11
            if (r11 == 0) goto L_0x00e9
            int r12 = r11.pid
            if (r12 != r2) goto L_0x00e9
            java.lang.String r9 = r11.processName
            goto L_0x00ec
        L_0x00e9:
            int r10 = r10 + 1
            goto L_0x00d8
        L_0x00ec:
            r14 = r9
        L_0x00ed:
            g.i.b.e.f.j.a = r14
        L_0x00ef:
            java.lang.String r2 = g.i.b.e.c.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r8 = "initSDKBaseInfo,isTestMode:"
            r2.<init>(r8)
            r2.append(r3)
            java.lang.String r8 = ",isSDKMode:"
            r2.append(r8)
            boolean r8 = g.i.b.e.c.f4127i
            r2.append(r8)
            java.lang.String r8 = ",uuid:"
            r2.append(r8)
            java.lang.String r8 = g.i.b.e.c.f4122d
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            java.lang.String r8 = "halley-cloud-SDKBaseInfo"
            g.i.b.e.h.b.f(r8, r2)
            g.i.b.e.c.o = r3
            int r2 = android.os.Process.myPid()
            g.i.b.e.c.f4124f = r2
            android.content.Context r2 = r0.a
            android.content.Context r8 = r2.getApplicationContext()
            g.i.b.e.c.f4125g = r8
            java.lang.String r2 = r2.getPackageName()
            g.i.b.e.c.f4128j = r2
            int r2 = r0.b
            g.i.b.e.c.f4126h = r2
            boolean r2 = r0.c
            g.i.b.e.c.f4127i = r2
            java.lang.String r2 = r0.f4092d
            boolean r8 = g.i.b.e.h.e.e(r2)
            java.lang.String r9 = ""
            if (r8 == 0) goto L_0x0141
            r2 = r9
        L_0x0141:
            g.i.b.e.c.f4122d = r2
            java.lang.String r2 = r0.f4093e
            boolean r8 = g.i.b.e.h.e.e(r2)
            if (r8 == 0) goto L_0x014c
            goto L_0x014d
        L_0x014c:
            r9 = r2
        L_0x014d:
            g.i.b.e.c.f4123e = r9
            java.lang.String r2 = "0.1.1"
            g.i.b.e.c.f4129k = r2
            android.os.Handler r2 = new android.os.Handler
            android.content.Context r8 = g.i.b.e.c.f4125g
            android.os.Looper r8 = r8.getMainLooper()
            r2.<init>(r8)
            g.i.b.e.c.f4130l = r2
            g.i.b.e.c.f4131m = r14
            java.lang.String r2 = g.i.b.e.c.f4128j
            r2.equals(r14)
            java.lang.String r2 = "TempTask"
            android.os.Handler r2 = g.h.a.a.d(r2)
            g.i.b.e.c.n = r2
            g.i.b.e.a r8 = new g.i.b.e.a
            r8.<init>()
            r2.post(r8)
            java.lang.String r2 = g.i.b.e.b.c.a
            android.os.Handler r2 = g.i.b.e.c.n
            g.i.b.e.b.d r8 = new g.i.b.e.b.d
            r8.<init>()
            r2.post(r8)
            java.lang.String r2 = "0M100WJ33N1CQ08O"
            g.h.a.a.a = r2
            java.lang.String r2 = "halley-cloud-HalleyAgent"
            java.lang.String r8 = "HalleyAgent.init try startPlatform on process:"
            java.lang.String r9 = java.lang.String.valueOf(r14)
            java.lang.String r8 = r8.concat(r9)
            g.i.b.e.h.b.h(r2, r8)
            g.i.b.e.f.i r2 = g.i.b.e.f.i.e()
            g.i.b.e.f.h r8 = g.i.b.e.f.h.f4214e
            if (r8 != 0) goto L_0x01b1
            java.lang.Class<g.i.b.e.f.h> r8 = g.i.b.e.f.h.class
            monitor-enter(r8)
            g.i.b.e.f.h r9 = g.i.b.e.f.h.f4214e     // Catch:{ all -> 0x01ae }
            if (r9 != 0) goto L_0x01ac
            g.i.b.e.f.h r9 = new g.i.b.e.f.h     // Catch:{ all -> 0x01ae }
            r9.<init>()     // Catch:{ all -> 0x01ae }
            g.i.b.e.f.h.f4214e = r9     // Catch:{ all -> 0x01ae }
        L_0x01ac:
            monitor-exit(r8)     // Catch:{ all -> 0x01ae }
            goto L_0x01b1
        L_0x01ae:
            r14 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x01ae }
            throw r14
        L_0x01b1:
            g.i.b.e.f.h r8 = g.i.b.e.f.h.f4214e
            r2.c = r8
            r8.a(r2)
            g.i.b.e.f.e r2 = r2.c
            r2.d()
            g.i.b.b.b = r1
            g.i.b.f.h.e.b()
            long r8 = android.os.SystemClock.elapsedRealtime()
            long r8 = r8 - r6
            java.lang.String r2 = "halley-cloud-HalleyAgent"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "HalleyAgent.init finished on process:"
            r6.<init>(r7)
            r6.append(r14)
            java.lang.String r14 = ",initFinish:"
            r6.append(r14)
            boolean r14 = g.i.b.b.b
            r6.append(r14)
            java.lang.String r14 = ",initTime:"
            r6.append(r14)
            r6.append(r4)
            java.lang.String r14 = ",costTime:"
            r6.append(r14)
            r6.append(r8)
            java.lang.String r14 = r6.toString()
            g.i.b.e.h.b.h(r2, r14)
            android.content.Context r14 = r0.a
            com.tencent.raft.measure.config.RAFTComConfig r2 = g.i.b.e.c.p
            com.tencent.raft.measure.RAFTMeasure.enableCrashMonitor(r14, r2)
            android.content.Context r14 = r0.a
            java.lang.String r0 = "init_cost"
            com.tencent.raft.measure.RAFTMeasure.reportAvg(r14, r2, r0, r8)
        L_0x0202:
            g.i.b.c r14 = new g.i.b.c
            r14.<init>()
            r13.b = r14
            java.util.Objects.requireNonNull(r14)
            g.i.b.e.h.b.a = r1
            g.i.b.e.h.b.b = r3
            g.i.b.c r14 = r13.b
            java.util.Objects.requireNonNull(r14)
            g.i.b.f.h.e r14 = g.i.b.f.h.e.b()
            r14.f4271e = r1
            return
        L_0x021c:
            r14 = move-exception
            r9 = r10
        L_0x021e:
            if (r9 == 0) goto L_0x0228
            r9.close()     // Catch:{ IOException -> 0x0224 }
            goto L_0x0228
        L_0x0224:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0228:
            goto L_0x022a
        L_0x0229:
            throw r14
        L_0x022a:
            goto L_0x0229
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a.e.b.i.a.b(android.content.Context):void");
    }
}
