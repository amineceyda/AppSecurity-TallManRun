package g.i.c.a.a.t;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import e.e.i.b;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class f {

    /* renamed from: e  reason: collision with root package name */
    public static final Object f4523e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public static volatile f f4524f;
    public String a = "";
    public String b = "";
    public Map<String, Long> c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public Handler f4525d = new a(Looper.getMainLooper());

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (message.what == 1) {
                f fVar = f.this;
                Objects.requireNonNull(fVar);
                synchronized (f.f4523e) {
                    SharedPreferences.Editor edit = b.E(g.i.c.a.a.b0.f.c(), fVar.a).edit();
                    for (String next : fVar.c.keySet()) {
                        edit.putString(next, String.valueOf(fVar.c.get(next)));
                    }
                    edit.apply();
                }
            }
            super.handleMessage(message);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x009e A[Catch:{ all -> 0x00be }, LOOP:1: B:25:0x0098->B:28:0x009e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d8 A[SYNTHETIC, Splitter:B:40:0x00d8] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x010d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f() {
        /*
            r9 = this;
            r9.<init>()
            java.lang.String r0 = ""
            r9.a = r0
            r9.b = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r9.c = r1
            g.i.c.a.a.t.f$a r1 = new g.i.c.a.a.t.f$a
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            r9.f4525d = r1
            android.content.Context r1 = g.i.c.a.a.b0.f.c()
            java.lang.String r2 = "ProcessUtils"
            if (r1 != 0) goto L_0x0025
            goto L_0x00ef
        L_0x0025:
            r3 = 0
            java.lang.String r4 = "activity"
            java.lang.Object r1 = r1.getSystemService(r4)     // Catch:{ Exception -> 0x0054 }
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch:{ Exception -> 0x0054 }
            java.util.List r1 = r1.getRunningAppProcesses()     // Catch:{ Exception -> 0x0054 }
            if (r1 == 0) goto L_0x006e
            java.util.Iterator r4 = r1.iterator()     // Catch:{ Exception -> 0x0052 }
        L_0x0038:
            boolean r5 = r4.hasNext()     // Catch:{ Exception -> 0x0052 }
            if (r5 == 0) goto L_0x006e
            java.lang.Object r5 = r4.next()     // Catch:{ Exception -> 0x0052 }
            android.app.ActivityManager$RunningAppProcessInfo r5 = (android.app.ActivityManager.RunningAppProcessInfo) r5     // Catch:{ Exception -> 0x0052 }
            if (r5 == 0) goto L_0x0038
            int r6 = r5.pid     // Catch:{ Exception -> 0x0052 }
            int r7 = android.os.Process.myPid()     // Catch:{ Exception -> 0x0052 }
            if (r6 != r7) goto L_0x0038
            java.lang.String r1 = r5.processName     // Catch:{ Exception -> 0x0052 }
            goto L_0x00f1
        L_0x0052:
            r4 = move-exception
            goto L_0x0057
        L_0x0054:
            r1 = move-exception
            r4 = r1
            r1 = r3
        L_0x0057:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "getProcessName error "
            r5.append(r6)
            r5.append(r1)
            r5.append(r4)
            java.lang.String r1 = r5.toString()
            g.c.b.b.f.w(r2, r1)
        L_0x006e:
            int r1 = android.os.Process.myPid()
            java.lang.String r4 = "getProcessName close reader error "
            java.io.FileReader r5 = new java.io.FileReader     // Catch:{ all -> 0x00c1 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c1 }
            r6.<init>()     // Catch:{ all -> 0x00c1 }
            java.lang.String r7 = "/proc/"
            r6.append(r7)     // Catch:{ all -> 0x00c1 }
            r6.append(r1)     // Catch:{ all -> 0x00c1 }
            java.lang.String r1 = "/cmdline"
            r6.append(r1)     // Catch:{ all -> 0x00c1 }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x00c1 }
            r5.<init>(r1)     // Catch:{ all -> 0x00c1 }
            r1 = 512(0x200, float:7.175E-43)
            char[] r3 = new char[r1]     // Catch:{ all -> 0x00be }
            r5.read(r3)     // Catch:{ all -> 0x00be }
            r6 = 0
            r7 = 0
        L_0x0098:
            if (r7 >= r1) goto L_0x00a1
            char r8 = r3[r7]     // Catch:{ all -> 0x00be }
            if (r8 == 0) goto L_0x00a1
            int r7 = r7 + 1
            goto L_0x0098
        L_0x00a1:
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x00be }
            r1.<init>(r3, r6, r7)     // Catch:{ all -> 0x00be }
            r5.close()     // Catch:{ all -> 0x00aa }
            goto L_0x00f1
        L_0x00aa:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            g.c.b.b.f.x(r2, r3)
            goto L_0x00f1
        L_0x00be:
            r1 = move-exception
            r3 = r5
            goto L_0x00c2
        L_0x00c1:
            r1 = move-exception
        L_0x00c2:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0114 }
            r5.<init>()     // Catch:{ all -> 0x0114 }
            java.lang.String r6 = "getProcessName wrapper throw e"
            r5.append(r6)     // Catch:{ all -> 0x0114 }
            r5.append(r1)     // Catch:{ all -> 0x0114 }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x0114 }
            g.c.b.b.f.x(r2, r1)     // Catch:{ all -> 0x0114 }
            if (r3 == 0) goto L_0x00ef
            r3.close()     // Catch:{ all -> 0x00dc }
            goto L_0x00ef
        L_0x00dc:
            r1 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            g.c.b.b.f.x(r2, r1)
        L_0x00ef:
            java.lang.String r1 = "unknown"
        L_0x00f1:
            java.lang.String r2 = "SP_seq_"
            java.lang.String r1 = g.a.a.a.a.w(r2, r1)
            r9.a = r1
            android.content.Context r1 = g.i.c.a.a.b0.f.c()
            java.lang.String r2 = r9.a
            java.lang.String r3 = "key_seqtime_base_key"
            java.lang.Object r0 = e.e.i.b.n(r1, r2, r3, r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x0111
            java.lang.String r0 = r9.c()
        L_0x0111:
            r9.b = r0
            return
        L_0x0114:
            r0 = move-exception
            if (r3 == 0) goto L_0x012e
            r3.close()     // Catch:{ all -> 0x011b }
            goto L_0x012e
        L_0x011b:
            r1 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            g.c.b.b.f.x(r2, r1)
        L_0x012e:
            goto L_0x0130
        L_0x012f:
            throw r0
        L_0x0130:
            goto L_0x012f
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.c.a.a.t.f.<init>():void");
    }

    public static String a(String str, String str2, long j2, String str3) {
        return str + "_" + str2 + "_" + j2 + "_" + str3;
    }

    public final long b(String str) {
        long longValue = ((Long) b.n(g.i.c.a.a.b0.f.c(), this.a, g.a.a.a.a.f(new StringBuilder(), this.b, str), 0L)).longValue();
        if (longValue != 0) {
            return longValue;
        }
        long currentTimeMillis = System.currentTimeMillis();
        b.L(g.i.c.a.a.b0.f.c(), this.a, g.a.a.a.a.f(new StringBuilder(), this.b, str), Long.valueOf(currentTimeMillis));
        return currentTimeMillis;
    }

    public final String c() {
        String str = System.currentTimeMillis() + "";
        b.L(g.i.c.a.a.b0.f.c(), this.a, "key_seqtime_base_key", str);
        return str;
    }
}
