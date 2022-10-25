package g.c.a.e.h.b;

import android.text.TextUtils;
import com.apkpure.aegon.application.AegonApplication;
import com.tencent.crabshell.common.DataSavingUtils;
import g.c.a.e.e.a;
import g.c.a.e.h.a.h;
import g.i.c.a.a.j.c;
import java.util.UUID;
import java.util.zip.CRC32;

public class f implements c {
    public static boolean b(String str, long j2) {
        String dataString = DataSavingUtils.getDataString(AegonApplication.getContext(), str);
        a.a("DTReport", "needReport key " + str + ", config:" + dataString);
        try {
            if (!TextUtils.isEmpty(dataString)) {
                j2 = Long.parseLong(dataString);
            }
        } catch (Exception unused) {
        }
        String c = h.a().c();
        if (TextUtils.isEmpty(c)) {
            c = h.a().b();
        }
        if (TextUtils.isEmpty(c)) {
            c = UUID.randomUUID().toString();
        }
        if (TextUtils.isEmpty(c)) {
            a.a.warn("tag: {}, msg: {}", (Object) "DTReport", (Object) "real targetKey is empty ");
            return false;
        }
        CRC32 crc32 = new CRC32();
        crc32.update(c.getBytes());
        a.b("DTReport", "real reportPercentage: " + (crc32.getValue() % 100) + ", logPercentage:" + j2);
        if (crc32.getValue() % 100 < j2) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(g.i.c.a.a.j.d r8) {
        /*
            r7 = this;
            android.app.Application r0 = com.apkpure.aegon.application.AegonApplication.getApplication()
            android.app.Application r1 = com.apkpure.aegon.application.AegonApplication.getApplication()
            java.lang.String r2 = "instruction"
            r3 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)
            java.lang.String r2 = "comment"
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getString(r2, r3)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x0027
            g.c.a.l.m.a$a r1 = g.c.a.l.m.a.c
            g.c.a.l.m.a r1 = r1.a()
            java.lang.String r1 = r1.a(r0)
        L_0x0027:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0041
            java.lang.String r0 = "\\u0026"
            java.lang.String r2 = "&"
            java.lang.String r0 = r1.replace(r0, r2)
            java.lang.String r1 = "\"]"
            java.lang.String r0 = r0.replace(r1, r3)
            java.lang.String r1 = "\r\n"
            java.lang.String r1 = r0.replace(r1, r3)
        L_0x0041:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r2 = "context"
            java.lang.String r4 = "channel_id"
            if (r0 != 0) goto L_0x0089
            android.net.Uri r0 = android.net.Uri.parse(r1)     // Catch:{ all -> 0x006c }
            java.lang.String r5 = "report_context"
            java.lang.String r0 = r0.getQueryParameter(r5)     // Catch:{ all -> 0x006c }
            boolean r5 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x006b }
            if (r5 == 0) goto L_0x005e
            java.lang.String r5 = "none"
            goto L_0x005f
        L_0x005e:
            r5 = r0
        L_0x005f:
            java.lang.String r6 = "\\"
            java.lang.String r3 = r5.replace(r6, r3)     // Catch:{ all -> 0x006b }
            java.util.Map<java.lang.String, java.lang.String> r0 = r8.c     // Catch:{ all -> 0x006c }
            r0.put(r2, r3)     // Catch:{ all -> 0x006c }
            goto L_0x0071
        L_0x006b:
            r3 = r0
        L_0x006c:
            java.util.Map<java.lang.String, java.lang.String> r0 = r8.c
            r0.put(r2, r1)
        L_0x0071:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x0084 }
            r0.<init>(r3)     // Catch:{ all -> 0x0084 }
            java.util.Map<java.lang.String, java.lang.String> r1 = r8.c     // Catch:{ all -> 0x0084 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0084 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0084 }
            r1.put(r4, r0)     // Catch:{ all -> 0x0084 }
            goto L_0x0097
        L_0x0084:
            java.util.Map<java.lang.String, java.lang.String> r0 = r8.c
            java.lang.String r1 = "-1"
            goto L_0x0094
        L_0x0089:
            java.util.Map<java.lang.String, java.lang.String> r0 = r8.c
            java.lang.String r1 = "none_url"
            r0.put(r2, r1)
            java.util.Map<java.lang.String, java.lang.String> r0 = r8.c
            java.lang.String r1 = "0"
        L_0x0094:
            r0.put(r4, r1)
        L_0x0097:
            java.lang.String r0 = r8.b
            g.c.a.e.h.a.g r1 = new g.c.a.e.h.a.g
            r1.<init>(r0)
            r0 = 1
            r1.f1984d = r0
            java.util.Map<java.lang.String, java.lang.String> r0 = r8.c
            if (r0 == 0) goto L_0x00aa
            java.util.Map<java.lang.String, java.lang.String> r2 = r1.b
            r2.putAll(r0)
        L_0x00aa:
            boolean r0 = g.c.a.e.h.a.d.b
            if (r0 == 0) goto L_0x00bb
            android.os.Handler r0 = g.c.a.e.j.a.a()
            g.c.a.e.h.a.b r2 = new g.c.a.e.h.a.b
            r2.<init>(r1)
            r0.post(r2)
            goto L_0x00c9
        L_0x00bb:
            android.os.Handler r0 = g.c.a.e.j.a.a()
            g.c.a.e.h.a.c r2 = new g.c.a.e.h.a.c
            r2.<init>(r1)
            r3 = 7000(0x1b58, double:3.4585E-320)
            r0.postDelayed(r2, r3)
        L_0x00c9:
            com.tencent.beacon.event.open.BeaconReport r0 = com.tencent.beacon.event.open.BeaconReport.getInstance()
            android.content.Context r1 = com.apkpure.aegon.application.AegonApplication.getContext()
            com.tencent.beacon.core.info.BeaconPubParams r0 = r0.getCommonParams(r1)
            r0.getAndroidId()
            java.util.List r0 = g.c.a.e.h.a.e.a
            java.lang.String r0 = "report event.getKey() = "
            java.lang.StringBuilder r0 = g.a.a.a.a.i(r0)
            java.lang.String r1 = r8.b
            r0.append(r1)
            java.lang.String r1 = ", event.getParams() = "
            r0.append(r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r8.c
            r0.append(r1)
            java.lang.String r1 = ", event.getAppKey() = "
            r0.append(r1)
            java.lang.String r1 = r8.f4445f
            r0.append(r1)
            java.lang.String r1 = ", event.getType() = "
            r0.append(r1)
            g.i.c.a.a.j.a r8 = r8.f4444e
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = "DTReport"
            g.c.a.e.e.a.a(r0, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a.e.h.b.f.a(g.i.c.a.a.j.d):void");
    }
}
