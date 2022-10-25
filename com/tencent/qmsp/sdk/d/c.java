package com.tencent.qmsp.sdk.d;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.qmsp.sdk.a.f;
import com.tencent.qmsp.sdk.b.e;
import com.tencent.qmsp.sdk.d.d;
import com.tencent.qmsp.sdk.f.g;
import com.tencent.qmsp.sdk.f.h;
import com.tencent.qmsp.sdk.f.k;
import com.tencent.trpcprotocol.projecta.vl_recall_app_detail.vl_recall_app_detail.nano.vlRecallAppDetail;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class c implements Handler.Callback {
    private ConcurrentHashMap<String, com.tencent.qmsp.sdk.b.b> a = new ConcurrentHashMap<>();
    private Handler b = new Handler(com.tencent.qmsp.sdk.app.b.e().b(), this);
    public final Object c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private int f840d = 0;

    /* renamed from: e  reason: collision with root package name */
    private d.b f841e = null;

    /* renamed from: f  reason: collision with root package name */
    private String f842f = "";

    /* renamed from: g  reason: collision with root package name */
    private String f843g = "";

    /* renamed from: h  reason: collision with root package name */
    private SharedPreferences f844h = null;

    /* renamed from: i  reason: collision with root package name */
    private b f845i = null;

    /* renamed from: j  reason: collision with root package name */
    private int f846j = 0;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            c.this.a();
        }
    }

    public class b implements e {
        public b() {
        }

        public void a(int i2, JSONObject jSONObject) {
            if (i2 == 161 && jSONObject != null) {
                c.this.a(i2, (Object) jSONObject);
            }
        }
    }

    /* renamed from: com.tencent.qmsp.sdk.d.c$c  reason: collision with other inner class name */
    public static class C0014c {
        public int a;
        public int b;
        public String c;

        /* renamed from: d  reason: collision with root package name */
        public String f847d;

        /* renamed from: e  reason: collision with root package name */
        public String f848e;

        /* renamed from: f  reason: collision with root package name */
        public String f849f;

        /* renamed from: g  reason: collision with root package name */
        public int f850g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f851h;

        /* renamed from: i  reason: collision with root package name */
        public int f852i;

        /* renamed from: j  reason: collision with root package name */
        public long f853j;

        /* renamed from: k  reason: collision with root package name */
        public int f854k;

        public C0014c(int i2, int i3, String str, String str2, String str3, String str4, int i4, boolean z, int i5, long j2, int i6) {
            this.a = i2;
            this.b = i3;
            this.c = str;
            this.f847d = str2;
            this.f848e = str3;
            this.f849f = str4;
            this.f850g = i4;
            this.f851h = z;
            this.f852i = i5;
            this.f853j = j2;
            this.f854k = i6;
        }

        public String toString() {
            return "filePath=" + this.c + ",fileName=" + this.f847d + ",fileId=" + this.b + ",fileUrl=" + this.f848e + ",fileHash=" + this.f849f + ",fileVersion=" + this.f850g + ",zipFlag=" + this.f851h + ",startTime=" + this.f853j + ",tryTimes=" + this.f852i + ",downloadFlag=" + this.f854k;
        }
    }

    public c(Context context) {
        this.f844h = context.getSharedPreferences(com.tencent.qmsp.sdk.c.b.a + a(d.b), 0);
        this.f845i = new b();
    }

    private int a(int i2, String str) {
        String a2;
        if (i2 == 0) {
            try {
                g.a("Qp.QUM", 1, "No matched update from server.");
                return -1;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else if (this.f844h.getInt(a(d.f855d), 0) < i2) {
            return 0;
        } else {
            String c2 = c();
            if (new File(c2).exists() && (a2 = a.a(c2)) != null) {
                if (a2.equalsIgnoreCase(str)) {
                    return a2.equalsIgnoreCase(str) ? 1 : -1;
                }
            }
            return 0;
        }
    }

    private String a(byte[] bArr) {
        return h.a(bArr);
    }

    private void a(int i2, int i3) {
        try {
            JSONObject a2 = com.tencent.qmsp.sdk.a.d.a(2);
            if (a2 != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.tencent.qmsp.sdk.a.e.a(20), i2);
                jSONObject.put(com.tencent.qmsp.sdk.a.e.a(21), i3);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(com.tencent.qmsp.sdk.a.e.a(15), a2);
                jSONObject2.put(com.tencent.qmsp.sdk.a.e.a(16), jSONObject);
                StringBuilder sb = new StringBuilder();
                sb.append("[SFU] request : ");
                sb.append(jSONObject2.toString());
                g.d("Qp.QUM", 0, sb.toString());
                com.tencent.qmsp.sdk.b.g.b().a(2, com.tencent.qmsp.sdk.app.a.getAppID(), 2, jSONObject2, new b());
                a("0X80078AA", i2, this.f846j, "", "");
                g.a("Qp.QUM", 1, String.format("[SFU] send update query: fileid=%d, localversion=%d", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a(String str, int i2, int i3, String str2, String str3) {
        String format = String.format("%d", new Object[]{Integer.valueOf(i2)});
        d.b bVar = this.f841e;
        int i4 = bVar != null ? (int) bVar.b : 0;
        String format2 = bVar != null ? String.format("%d", new Object[]{Long.valueOf(bVar.a)}) : "";
        g.a("Qp.QUM", 1, String.format("[SFU] report: actiontype=%s, actionname=%s, actionfrom=%d, actionresult=%d, sectionId=%s, reportId=%s, fileInfo: %s", new Object[]{str, str, Integer.valueOf(i4), Integer.valueOf(this.f840d), format2, format, "", ""}));
        com.tencent.qmsp.sdk.a.g gVar = new com.tencent.qmsp.sdk.a.g();
        try {
            gVar.a(str).a(format).a(format2).a(this.f840d).a(i3).a(str2).a(str3);
            f.a(gVar.toString(), 2);
        } catch (Exception e2) {
            e2.printStackTrace();
            g.b(g.a, 0, "onReport error! <JsonObject userData>!");
        }
    }

    private void a(boolean z, com.tencent.qmsp.sdk.b.b bVar) {
        int i2;
        if (!z || bVar == null) {
            a(3);
            return;
        }
        File file = new File(bVar.b);
        C0014c cVar = (C0014c) bVar.a();
        if (!file.exists() || cVar == null) {
            a(3);
            return;
        }
        g.a("Qp.QUM", 1, String.format("[SFU] http download complete: %s, %s", new Object[]{bVar.b, cVar.f848e}));
        int i3 = cVar.a;
        if (i3 == 1) {
            File file2 = new File(c());
            new File(bVar.b).renameTo(file2);
            a("0X80078AC", cVar.f850g, this.f846j, "", "");
            if (this.f845i.a(file2.toString())) {
                this.f844h.edit().putInt(a(d.f855d), cVar.f850g).commit();
                if (this.f845i.a().isEmpty()) {
                    g.a("Qp.QUM", 1, "[SFU] config ok but without any sections");
                    i2 = 16;
                } else {
                    i2 = 5;
                }
            } else {
                a("0X80078AD", cVar.f850g, this.f846j, cVar.f847d, cVar.f848e);
                g.a("Qp.QUM", 1, "[SFU] invalid config (sig not accepted)");
                a(1);
                return;
            }
        } else if (i3 == 2) {
            a("0X80078AE", cVar.f850g, this.f846j, "", "");
            i2 = 7;
        } else {
            return;
        }
        b(i2);
    }

    private boolean a(C0014c cVar) {
        if (cVar == null) {
            return false;
        }
        if (cVar.a == 2 && cVar.f854k != 1 && !com.tencent.qmsp.sdk.f.f.b(com.tencent.qmsp.sdk.app.a.getContext())) {
            g.a("Qp.QUM", 1, "[SFU] donot download file because not using wifi");
            com.tencent.qmsp.sdk.a.a.a(3, 3);
            return false;
        } else if (cVar.f852i < 3 && this.a.contains(cVar.f849f.toLowerCase())) {
            return false;
        } else {
            com.tencent.qmsp.sdk.b.b bVar = new com.tencent.qmsp.sdk.b.b();
            bVar.a = cVar.f848e;
            bVar.b = cVar.c + cVar.f847d;
            bVar.f786d = cVar.f847d;
            bVar.c = cVar.c;
            cVar.f852i = cVar.f852i + 1;
            bVar.a(cVar);
            this.a.put(cVar.f849f.toLowerCase(), bVar);
            try {
                com.tencent.qmsp.sdk.b.d.a(bVar);
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            g.a("Qp.QUM", 1, String.format("[SFU] begin http download %s", new Object[]{cVar.f848e}));
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0086, code lost:
        if (r11.r == r5) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(com.tencent.qmsp.sdk.d.d.b r11) {
        /*
            r10 = this;
            java.lang.String r0 = "Qp.QUM"
            r1 = 0
            r2 = 1
            if (r11 == 0) goto L_0x008a
            java.lang.Object[] r3 = new java.lang.Object[r2]
            long r4 = r11.a
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3[r1] = r4
            java.lang.String r4 = "[SFU] backup: sid=%d"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            com.tencent.qmsp.sdk.f.g.a(r0, r2, r3)
            long r3 = r11.r
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0027
            java.lang.String r11 = "[SFU] no files need to backup"
            com.tencent.qmsp.sdk.f.g.a(r0, r2, r11)
            goto L_0x0088
        L_0x0027:
            if (r7 <= 0) goto L_0x008a
            java.lang.String r3 = r10.f(r11)
            r4 = 0
        L_0x002e:
            java.util.List<com.tencent.qmsp.sdk.d.d$a> r7 = r11.q
            int r7 = r7.size()
            if (r4 >= r7) goto L_0x0064
            java.util.List<com.tencent.qmsp.sdk.d.d$a> r7 = r11.q
            java.lang.Object r7 = r7.get(r4)
            com.tencent.qmsp.sdk.d.d$a r7 = (com.tencent.qmsp.sdk.d.d.a) r7
            int r8 = r7.f865j
            if (r2 != r8) goto L_0x0061
            java.lang.StringBuilder r8 = g.a.a.a.a.i(r3)
            java.lang.String r9 = r7.c
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.io.File r9 = new java.io.File
            java.lang.String r7 = r7.f861f
            r9.<init>(r7)
            java.io.File r7 = new java.io.File
            r7.<init>(r8)
            r10.a((java.io.File) r9, (java.io.File) r7)
            r7 = 1
            long r5 = r5 + r7
        L_0x0061:
            int r4 = r4 + 1
            goto L_0x002e
        L_0x0064:
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Long r4 = java.lang.Long.valueOf(r5)
            r3[r1] = r4
            java.util.List<com.tencent.qmsp.sdk.d.d$a> r4 = r11.q
            int r4 = r4.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r2] = r4
            java.lang.String r4 = "[SFU] backup %d files of %d"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            com.tencent.qmsp.sdk.f.g.a(r0, r2, r3)
            long r3 = r11.r
            int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r11 != 0) goto L_0x008a
        L_0x0088:
            r11 = 1
            goto L_0x008b
        L_0x008a:
            r11 = 0
        L_0x008b:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r11)
            r3[r1] = r4
            java.lang.String r1 = "[SFU] backup result: %b"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            com.tencent.qmsp.sdk.f.g.a(r0, r2, r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qmsp.sdk.d.c.a(com.tencent.qmsp.sdk.d.d$b):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: java.io.FileOutputStream} */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:15|16|(2:17|(1:19)(1:62))|20|21|22|23|24|25|26) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0057 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x006f A[SYNTHETIC, Splitter:B:41:0x006f] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0076 A[SYNTHETIC, Splitter:B:45:0x0076] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0081 A[SYNTHETIC, Splitter:B:54:0x0081] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0088 A[SYNTHETIC, Splitter:B:58:0x0088] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(java.io.File r5, java.io.File r6) {
        /*
            r4 = this;
            r0 = 0
            r1 = 0
            boolean r2 = r6.exists()     // Catch:{ IOException -> 0x0068, all -> 0x0065 }
            if (r2 == 0) goto L_0x000f
            boolean r2 = r6.delete()     // Catch:{ IOException -> 0x0068, all -> 0x0065 }
            if (r2 != 0) goto L_0x0025
            return r1
        L_0x000f:
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x0068, all -> 0x0065 }
            java.lang.String r3 = r6.getParent()     // Catch:{ IOException -> 0x0068, all -> 0x0065 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0068, all -> 0x0065 }
            boolean r3 = r2.exists()     // Catch:{ IOException -> 0x0068, all -> 0x0065 }
            if (r3 != 0) goto L_0x0025
            boolean r2 = r2.mkdirs()     // Catch:{ IOException -> 0x0068, all -> 0x0065 }
            if (r2 != 0) goto L_0x0025
            return r1
        L_0x0025:
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0068, all -> 0x0065 }
            r2.<init>(r6)     // Catch:{ IOException -> 0x0068, all -> 0x0065 }
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0061, all -> 0x005f }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0061, all -> 0x005f }
            r3.<init>(r5)     // Catch:{ IOException -> 0x0061, all -> 0x005f }
            r6.<init>(r3)     // Catch:{ IOException -> 0x0061, all -> 0x005f }
            com.tencent.qmsp.sdk.f.a r5 = com.tencent.qmsp.sdk.f.a.a()     // Catch:{ IOException -> 0x005d, all -> 0x005b }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r5 = r5.a((int) r0)     // Catch:{ IOException -> 0x005d, all -> 0x005b }
        L_0x003e:
            int r0 = r6.read(r5)     // Catch:{ IOException -> 0x005d, all -> 0x005b }
            r3 = -1
            if (r0 == r3) goto L_0x004c
            r2.write(r5, r1, r0)     // Catch:{ IOException -> 0x005d, all -> 0x005b }
            r2.flush()     // Catch:{ IOException -> 0x005d, all -> 0x005b }
            goto L_0x003e
        L_0x004c:
            com.tencent.qmsp.sdk.f.a r0 = com.tencent.qmsp.sdk.f.a.a()     // Catch:{ IOException -> 0x005d, all -> 0x005b }
            r0.a((byte[]) r5)     // Catch:{ IOException -> 0x005d, all -> 0x005b }
            r5 = 1
            r2.close()     // Catch:{ IOException -> 0x0057 }
        L_0x0057:
            r6.close()     // Catch:{ IOException -> 0x005a }
        L_0x005a:
            return r5
        L_0x005b:
            r5 = move-exception
            goto L_0x007c
        L_0x005d:
            r5 = move-exception
            goto L_0x0063
        L_0x005f:
            r5 = move-exception
            goto L_0x007d
        L_0x0061:
            r5 = move-exception
            r6 = r0
        L_0x0063:
            r0 = r2
            goto L_0x006a
        L_0x0065:
            r5 = move-exception
            r6 = r0
            goto L_0x007f
        L_0x0068:
            r5 = move-exception
            r6 = r0
        L_0x006a:
            r5.printStackTrace()     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x0074
            r0.close()     // Catch:{ IOException -> 0x0073 }
            goto L_0x0074
        L_0x0073:
        L_0x0074:
            if (r6 == 0) goto L_0x0079
            r6.close()     // Catch:{ IOException -> 0x0079 }
        L_0x0079:
            return r1
        L_0x007a:
            r5 = move-exception
            r2 = r0
        L_0x007c:
            r0 = r6
        L_0x007d:
            r6 = r0
            r0 = r2
        L_0x007f:
            if (r0 == 0) goto L_0x0086
            r0.close()     // Catch:{ IOException -> 0x0085 }
            goto L_0x0086
        L_0x0085:
        L_0x0086:
            if (r6 == 0) goto L_0x008b
            r6.close()     // Catch:{ IOException -> 0x008b }
        L_0x008b:
            goto L_0x008d
        L_0x008c:
            throw r5
        L_0x008d:
            goto L_0x008c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qmsp.sdk.d.c.a(java.io.File, java.io.File):boolean");
    }

    private void b() {
        try {
            this.f844h.edit().putLong(a(d.c), System.currentTimeMillis()).commit();
            b(2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009b, code lost:
        c(r7);
        r1 = 13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0103, code lost:
        a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0115, code lost:
        if (e(r13) == false) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0117, code lost:
        r1 = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x011a, code lost:
        r1 = 16;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(int r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "[SFU] update event: %d"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            java.lang.String r2 = "Qp.QUM"
            r4 = 2
            com.tencent.qmsp.sdk.f.g.a(r2, r4, r1)
            r1 = 6
            r2 = 5
            r5 = 10
            r6 = 9
            r7 = 8
            r8 = 17
            if (r13 == r0) goto L_0x0121
            if (r13 == r4) goto L_0x011d
            switch(r13) {
                case 5: goto L_0x0107;
                case 6: goto L_0x00f7;
                case 7: goto L_0x00db;
                case 8: goto L_0x00bf;
                case 9: goto L_0x00a2;
                case 10: goto L_0x008c;
                case 11: goto L_0x007e;
                case 12: goto L_0x006e;
                case 13: goto L_0x0051;
                case 14: goto L_0x0048;
                case 15: goto L_0x0035;
                case 16: goto L_0x002e;
                case 17: goto L_0x0029;
                default: goto L_0x0027;
            }
        L_0x0027:
            goto L_0x0131
        L_0x0029:
            r12.h()     // Catch:{ all -> 0x012d }
            goto L_0x0131
        L_0x002e:
            r12.g()     // Catch:{ all -> 0x012d }
        L_0x0031:
            r1 = 17
            goto L_0x0129
        L_0x0035:
            com.tencent.qmsp.sdk.d.d$b r13 = r12.f841e     // Catch:{ all -> 0x012d }
            r12.i(r13)     // Catch:{ all -> 0x012d }
            r13 = 0
            r12.f841e = r13     // Catch:{ all -> 0x012d }
            boolean r13 = r12.f()     // Catch:{ all -> 0x012d }
            if (r13 == 0) goto L_0x0045
            goto L_0x011a
        L_0x0045:
            r1 = 5
            goto L_0x0129
        L_0x0048:
            com.tencent.qmsp.sdk.d.d$b r13 = r12.f841e     // Catch:{ all -> 0x012d }
            if (r13 == 0) goto L_0x0117
            r12.b((com.tencent.qmsp.sdk.d.d.b) r13)     // Catch:{ all -> 0x012d }
            goto L_0x0117
        L_0x0051:
            com.tencent.qmsp.sdk.d.d$b r13 = r12.f841e     // Catch:{ all -> 0x012d }
            if (r13 == 0) goto L_0x005d
            boolean r13 = r12.j(r13)     // Catch:{ all -> 0x012d }
            if (r13 == 0) goto L_0x005d
            goto L_0x0103
        L_0x005d:
            java.lang.String r7 = "0X80078B3"
            r8 = 0
            int r9 = r12.f846j     // Catch:{ all -> 0x012d }
            java.lang.String r10 = ""
            java.lang.String r11 = ""
            r6 = r12
            r6.a(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x012d }
            r3 = 10
            goto L_0x0103
        L_0x006e:
            com.tencent.qmsp.sdk.d.d$b r13 = r12.f841e     // Catch:{ all -> 0x012d }
            if (r13 == 0) goto L_0x007a
            boolean r13 = r12.c((com.tencent.qmsp.sdk.d.d.b) r13)     // Catch:{ all -> 0x012d }
            if (r13 == 0) goto L_0x007a
            goto L_0x0103
        L_0x007a:
            r3 = 9
            goto L_0x0103
        L_0x007e:
            com.tencent.qmsp.sdk.d.d$b r13 = r12.f841e     // Catch:{ all -> 0x012d }
            if (r13 == 0) goto L_0x009b
            boolean r13 = r12.m(r13)     // Catch:{ all -> 0x012d }
            if (r13 == 0) goto L_0x009b
            r1 = 12
            goto L_0x0129
        L_0x008c:
            com.tencent.qmsp.sdk.d.d$b r13 = r12.f841e     // Catch:{ all -> 0x012d }
            if (r13 == 0) goto L_0x009a
            boolean r13 = r12.l(r13)     // Catch:{ all -> 0x012d }
            if (r13 == 0) goto L_0x009a
            r1 = 11
            goto L_0x0129
        L_0x009a:
            r7 = 7
        L_0x009b:
            r12.c((int) r7)     // Catch:{ all -> 0x012d }
            r1 = 13
            goto L_0x0129
        L_0x00a2:
            com.tencent.qmsp.sdk.d.d$b r13 = r12.f841e     // Catch:{ all -> 0x012d }
            if (r13 == 0) goto L_0x00b0
            boolean r13 = r12.a((com.tencent.qmsp.sdk.d.d.b) r13)     // Catch:{ all -> 0x012d }
            if (r13 == 0) goto L_0x00b0
            r1 = 10
            goto L_0x0129
        L_0x00b0:
            java.lang.String r3 = "0X80078B1"
            r4 = 0
            int r5 = r12.f846j     // Catch:{ all -> 0x012d }
            java.lang.String r6 = ""
            java.lang.String r7 = ""
            r2 = r12
            r2.a(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x012d }
            r3 = 6
            goto L_0x0103
        L_0x00bf:
            com.tencent.qmsp.sdk.d.d$b r13 = r12.f841e     // Catch:{ all -> 0x012d }
            if (r13 == 0) goto L_0x00cc
            boolean r13 = r12.k(r13)     // Catch:{ all -> 0x012d }
            if (r13 == 0) goto L_0x00cc
            r1 = 9
            goto L_0x0129
        L_0x00cc:
            java.lang.String r4 = "0X80078B0"
            r5 = 0
            int r6 = r12.f846j     // Catch:{ all -> 0x012d }
            java.lang.String r7 = ""
            java.lang.String r8 = ""
            r3 = r12
            r3.a(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x012d }
            r3 = 5
            goto L_0x0103
        L_0x00db:
            com.tencent.qmsp.sdk.d.d$b r13 = r12.f841e     // Catch:{ all -> 0x012d }
            if (r13 == 0) goto L_0x00e8
            boolean r13 = r12.n(r13)     // Catch:{ all -> 0x012d }
            if (r13 == 0) goto L_0x00e8
            r1 = 8
            goto L_0x0129
        L_0x00e8:
            java.lang.String r1 = "0X80078AF"
            r2 = 0
            int r3 = r12.f846j     // Catch:{ all -> 0x012d }
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            r0 = r12
            r0.a(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x012d }
            r3 = 4
            goto L_0x0103
        L_0x00f7:
            com.tencent.qmsp.sdk.d.d$b r13 = r12.f841e     // Catch:{ all -> 0x012d }
            if (r13 == 0) goto L_0x0102
            boolean r13 = r12.d(r13)     // Catch:{ all -> 0x012d }
            if (r13 == 0) goto L_0x0102
            goto L_0x0131
        L_0x0102:
            r3 = 3
        L_0x0103:
            r12.a((int) r3)     // Catch:{ all -> 0x012d }
            goto L_0x0131
        L_0x0107:
            boolean r13 = r12.d()     // Catch:{ all -> 0x012d }
            if (r13 == 0) goto L_0x011a
            com.tencent.qmsp.sdk.d.d$b r13 = r12.f841e     // Catch:{ all -> 0x012d }
            if (r13 == 0) goto L_0x011a
            boolean r13 = r12.e(r13)     // Catch:{ all -> 0x012d }
            if (r13 != 0) goto L_0x0129
        L_0x0117:
            r1 = 15
            goto L_0x0129
        L_0x011a:
            r1 = 16
            goto L_0x0129
        L_0x011d:
            r12.i()     // Catch:{ all -> 0x012d }
            goto L_0x0131
        L_0x0121:
            int r13 = r12.f840d     // Catch:{ all -> 0x012d }
            if (r13 != r0) goto L_0x0127
            goto L_0x0031
        L_0x0127:
            r1 = 14
        L_0x0129:
            r12.b((int) r1)     // Catch:{ all -> 0x012d }
            goto L_0x0131
        L_0x012d:
            r13 = move-exception
            r13.printStackTrace()
        L_0x0131:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qmsp.sdk.d.c.b(int):void");
    }

    private void b(com.tencent.qmsp.sdk.b.c cVar) {
        if (cVar != null) {
            int i2 = cVar.a;
            if (i2 == 2) {
                g.a("Qp.QUM", 1, String.format("[SFU] http download error=%d", new Object[]{Integer.valueOf(i2)}));
                return;
            }
            C0014c cVar2 = (C0014c) cVar.b.a();
            if (cVar2 != null) {
                boolean z = cVar.a == 0;
                if (!z) {
                    try {
                        int i3 = cVar2.f852i;
                        if (i3 < 3) {
                            g.a("Qp.QUM", 1, String.format("[SFU] retried to download, retry=%d, result=%b, url=%s", new Object[]{Integer.valueOf(i3), Boolean.valueOf(z), cVar2.f848e}));
                            a(cVar2);
                            return;
                        }
                        File file = new File(cVar.b.b);
                        if (file.exists()) {
                            file.delete();
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                        return;
                    }
                }
                this.a.remove(cVar2.f849f.toLowerCase());
                a(z, cVar.b);
            }
        }
    }

    private void b(d.b bVar) {
        if (bVar != null) {
            g.a("Qp.QUM", 1, String.format("[SFU] cleanup: sid=%d", new Object[]{Long.valueOf(bVar.a)}));
            com.tencent.qmsp.sdk.f.d.a(g(bVar), false);
        }
    }

    private String c() {
        return e() + a(d.a);
    }

    private void c(int i2) {
        this.f840d = i2;
    }

    private boolean c(d.b bVar) {
        return true;
    }

    private boolean d() {
        boolean z;
        this.f841e = null;
        List<d.b> a2 = this.f845i.a();
        int i2 = 0;
        while (true) {
            if (i2 >= a2.size()) {
                z = false;
                break;
            }
            d.b bVar = a2.get(i2);
            if (!bVar.a()) {
                if (bVar.f875m && bVar.f874l && bVar.n) {
                    this.f841e = bVar;
                    c(0);
                    g.a("Qp.QUM", 1, String.format("[SFU] next update: sid=%d", new Object[]{Long.valueOf(this.f841e.a)}));
                    z = true;
                    break;
                }
                g.d("Qp.QUM", 1, String.format("[SFU] not matched section: sid=%d, os: %b, qq:%b, cpu:%b", new Object[]{Long.valueOf(bVar.a), Boolean.valueOf(bVar.f875m), Boolean.valueOf(bVar.f874l), Boolean.valueOf(bVar.n)}));
                bVar.b();
            }
            i2++;
        }
        g.a("Qp.QUM", 1, String.format("[SFU] get next section result? %b", new Object[]{Boolean.valueOf(z)}));
        return z;
    }

    private boolean d(d.b bVar) {
        d.b bVar2 = bVar;
        if (bVar2 != null) {
            g.a("Qp.QUM", 1, String.format("[SFU] download package: sid=%d", new Object[]{Long.valueOf(bVar2.a)}));
            return a(new C0014c(2, 0, g(bVar), bVar2.c, bVar2.f867e, bVar2.f866d, 0, true, 0, System.currentTimeMillis(), bVar2.u));
        }
        return false;
    }

    private String e() {
        String c2 = com.tencent.qmsp.sdk.a.b.c();
        File file = new File(c2);
        if (!file.exists()) {
            file.mkdirs();
        }
        return c2;
    }

    private boolean e(d.b bVar) {
        if (bVar == null) {
            return false;
        }
        g.a("Qp.QUM", 1, String.format("[SFU] get different: sid=%d", new Object[]{Long.valueOf(bVar.a)}));
        List<d.a> list = bVar.o;
        for (int i2 = 0; i2 < list.size(); i2++) {
            d.a aVar = list.get(i2);
            if (!new File(aVar.f861f).exists()) {
                aVar.f865j = 2;
                bVar.q.add(aVar);
            } else {
                String a2 = a.a(aVar.f861f);
                if (a2 == null || !a2.equalsIgnoreCase(aVar.b)) {
                    aVar.f865j = 1;
                    if (a2 == null) {
                        a2 = "";
                    }
                    aVar.c = a2;
                    bVar.q.add(aVar);
                    bVar.r++;
                }
            }
        }
        g.a("Qp.QUM", 1, String.format("[SFU] need to update %d files of %d", new Object[]{Integer.valueOf(bVar.q.size()), Integer.valueOf(bVar.o.size())}));
        return !bVar.q.isEmpty();
    }

    private String f(d.b bVar) {
        String str = g(bVar) + "bak" + File.separator;
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    private boolean f() {
        boolean z;
        List<d.b> a2 = this.f845i.a();
        int i2 = 0;
        while (true) {
            if (i2 >= a2.size()) {
                z = true;
                break;
            } else if (!a2.get(i2).a()) {
                z = false;
                break;
            } else {
                i2++;
            }
        }
        Object[] objArr = new Object[1];
        objArr[0] = z ? "yes" : "no";
        g.a("Qp.QUM", 1, String.format("[SFU] all complete: %s", objArr));
        return z;
    }

    private String g(d.b bVar) {
        String str = e() + bVar.a + File.separator;
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    private void g() {
        g.a("Qp.QUM", 1, "[SFU] all sections update complete");
        try {
            if (!TextUtils.isEmpty(this.f842f)) {
                com.tencent.qmsp.sdk.c.f.i().e();
                this.f844h.edit().putString(a(d.f856e), this.f842f).putString(a(d.f857f), this.f843g).commit();
                a("0X80078B6", 0, this.f846j, this.f842f, this.f843g);
            }
            g.a("Qp.QUM", 1, String.format("[SFU] notify update complete: %s", new Object[]{this.f842f}));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private String h(d.b bVar) {
        return g(bVar) + bVar.c;
    }

    private void h() {
        synchronized (this.c) {
            a("0X80078B5", 0, this.f846j, "", "");
            this.f841e = null;
            g.a("Qp.QUM", 1, "[SFU] update ended");
        }
    }

    private void i() {
        a(1, this.f844h.getInt(a(d.f855d), 0));
        this.f844h.edit().remove(a(d.f856e)).commit();
    }

    private void i(d.b bVar) {
        if (bVar != null) {
            g.a("Qp.QUM", 1, String.format("[SFU] update complete: sid=%d", new Object[]{Long.valueOf(bVar.a)}));
            bVar.b();
            if (j()) {
                this.f842f += String.format("#%d#", new Object[]{Long.valueOf(bVar.b)});
                this.f843g += String.format("#%d#", new Object[]{Long.valueOf(bVar.a)});
            }
            a("0X80078B4", 0, this.f846j, "", "");
        }
    }

    private boolean j() {
        return this.f840d == 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a4, code lost:
        if (r4 == ((long) r14.p.size())) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean j(com.tencent.qmsp.sdk.d.d.b r14) {
        /*
            r13 = this;
            java.lang.String r0 = "Qp.QUM"
            r1 = 0
            r2 = 1
            if (r14 == 0) goto L_0x00a8
            java.lang.Object[] r3 = new java.lang.Object[r2]
            long r4 = r14.a
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3[r1] = r4
            java.lang.String r4 = "[SFU] rollback: sid=%d"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            com.tencent.qmsp.sdk.f.g.a(r0, r2, r3)
            java.util.List<com.tencent.qmsp.sdk.d.d$a> r3 = r14.p
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0029
            java.lang.String r14 = "[SFU] no files need to rollback"
            com.tencent.qmsp.sdk.f.g.a(r0, r2, r14)
        L_0x0026:
            r14 = 1
            goto L_0x00a9
        L_0x0029:
            java.lang.String r3 = r13.f(r14)
            r4 = 0
            r6 = 0
        L_0x0030:
            java.util.List<com.tencent.qmsp.sdk.d.d$a> r7 = r14.p
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x009b
            java.util.List<com.tencent.qmsp.sdk.d.d$a> r7 = r14.p
            java.lang.Object r7 = r7.get(r6)
            com.tencent.qmsp.sdk.d.d$a r7 = (com.tencent.qmsp.sdk.d.d.a) r7
            java.io.File r8 = new java.io.File
            java.lang.String r9 = r7.f861f
            r8.<init>(r9)
            java.io.File r9 = new java.io.File
            java.lang.String r10 = r7.f862g
            r9.<init>(r10)
            boolean r10 = r9.exists()
            r11 = 1
            if (r10 == 0) goto L_0x0060
            boolean r10 = r9.delete()
            if (r10 != 0) goto L_0x005f
            r9.deleteOnExit()
        L_0x005f:
            long r4 = r4 + r11
        L_0x0060:
            int r9 = r7.f865j
            r10 = 2
            if (r9 != r10) goto L_0x0075
            boolean r9 = r8.exists()
            if (r9 == 0) goto L_0x0075
            boolean r9 = r8.delete()
            if (r9 != 0) goto L_0x0074
            r8.deleteOnExit()
        L_0x0074:
            long r4 = r4 + r11
        L_0x0075:
            java.io.File r9 = new java.io.File
            java.lang.String r7 = r7.c
            r9.<init>(r3, r7)
            boolean r7 = r9.exists()
            if (r7 == 0) goto L_0x0098
            boolean r7 = r9.canRead()
            if (r7 == 0) goto L_0x0098
            boolean r7 = r8.exists()
            if (r7 == 0) goto L_0x0098
            boolean r7 = r8.canWrite()
            if (r7 == 0) goto L_0x0098
            r13.a((java.io.File) r9, (java.io.File) r8)
            long r4 = r4 + r11
        L_0x0098:
            int r6 = r6 + 1
            goto L_0x0030
        L_0x009b:
            java.util.List<com.tencent.qmsp.sdk.d.d$a> r14 = r14.p
            int r14 = r14.size()
            long r6 = (long) r14
            int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r14 != 0) goto L_0x00a8
            goto L_0x0026
        L_0x00a8:
            r14 = 0
        L_0x00a9:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r14)
            r3[r1] = r4
            java.lang.String r1 = "[SFU] rollback result: %b"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            com.tencent.qmsp.sdk.f.g.a(r0, r2, r1)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qmsp.sdk.d.c.j(com.tencent.qmsp.sdk.d.d$b):boolean");
    }

    private boolean k(d.b bVar) {
        boolean z;
        if (bVar != null) {
            g.a("Qp.QUM", 1, String.format("[SFU] unzip package: sid=%d", new Object[]{Long.valueOf(bVar.a)}));
            String g2 = g(bVar);
            File file = new File(g2);
            if (!file.exists()) {
                file.mkdir();
            }
            if (k.a(h(bVar), g2) == 0) {
                z = true;
                g.a("Qp.QUM", 1, String.format("[SFU] unzip result: %b", new Object[]{Boolean.valueOf(z)}));
                return z;
            }
        }
        z = false;
        g.a("Qp.QUM", 1, String.format("[SFU] unzip result: %b", new Object[]{Boolean.valueOf(z)}));
        return z;
    }

    private boolean l(d.b bVar) {
        boolean z;
        if (bVar != null && !bVar.q.isEmpty()) {
            g.a("Qp.QUM", 1, String.format("[SFU] do update files: sid=%d", new Object[]{Long.valueOf(bVar.a)}));
            String g2 = g(bVar);
            int i2 = 0;
            while (true) {
                if (i2 >= bVar.q.size()) {
                    break;
                }
                d.a aVar = bVar.q.get(i2);
                File file = new File(g2, aVar.b);
                File file2 = new File(aVar.f861f);
                if (file.exists() && file.canRead()) {
                    boolean a2 = a(file, file2);
                    if (!a2) {
                        String f2 = g.a.a.a.a.f(new StringBuilder(), aVar.f861f, ".1");
                        File file3 = new File(f2);
                        aVar.f865j = 3;
                        aVar.f862g = f2;
                        a2 = a(file, file3);
                        g.a("Qp.QUM", 1, String.format("[SFU] copied failed, renamed to: %s", new Object[]{aVar.f862g}));
                        if (a2) {
                            this.f844h.edit().putString(aVar.f861f, aVar.f862g).commit();
                        }
                    }
                    if (!a2) {
                        a("0X80078B2", (int) aVar.f863h, this.f846j, aVar.a, aVar.b);
                        g.a("Qp.QUM", 1, String.format("[SFU] failed copied: %s", new Object[]{aVar.f861f}));
                        break;
                    }
                    g.a("Qp.QUM", 1, String.format("[SFU] success copied: %s", new Object[]{aVar.f861f}));
                    bVar.p.add(aVar);
                    bVar.s++;
                } else {
                    g.a("Qp.QUM", 1, String.format("[SFU] copied failed, src not existed or cannot read: %s", new Object[]{file.toString()}));
                }
                i2++;
            }
            g.a("Qp.QUM", 1, String.format("[SFU] update %d files of %d", new Object[]{Long.valueOf(bVar.s), Integer.valueOf(bVar.q.size())}));
            if (bVar.s == ((long) bVar.q.size())) {
                z = true;
                g.a("Qp.QUM", 1, String.format("[SFU] update result: %b", new Object[]{Boolean.valueOf(z)}));
                return z;
            }
        }
        z = false;
        g.a("Qp.QUM", 1, String.format("[SFU] update result: %b", new Object[]{Boolean.valueOf(z)}));
        return z;
    }

    private boolean m(d.b bVar) {
        boolean z;
        if (bVar != null) {
            g.a("Qp.QUM", 1, String.format("[SFU] verify: sid=%d", new Object[]{Long.valueOf(bVar.a)}));
            if (bVar.q.isEmpty()) {
                g.a("Qp.QUM", 1, String.format("[SFU] no diff: sid=%d", new Object[]{Long.valueOf(bVar.a)}));
            } else {
                int i2 = 0;
                while (i2 < bVar.q.size()) {
                    d.a aVar = bVar.q.get(i2);
                    String a2 = a.a(TextUtils.isEmpty(aVar.f862g) ? aVar.f861f : aVar.f862g);
                    if (a2 == null || !a2.equalsIgnoreCase(aVar.b)) {
                        g.a("Qp.QUM", 1, String.format("[SFU] not matched: %s!=%s, sid=%d", new Object[]{a2, aVar.b, Long.valueOf(bVar.a)}));
                    } else {
                        i2++;
                    }
                }
            }
            z = true;
            g.a("Qp.QUM", 1, String.format("[SFU] verify result: %b", new Object[]{Boolean.valueOf(z)}));
            return z;
        }
        z = false;
        g.a("Qp.QUM", 1, String.format("[SFU] verify result: %b", new Object[]{Boolean.valueOf(z)}));
        return z;
    }

    private boolean n(d.b bVar) {
        boolean z;
        if (bVar != null) {
            g.a("Qp.QUM", 1, String.format("[SFU] verify package: sid=%d", new Object[]{Long.valueOf(bVar.a)}));
            String a2 = a.a(h(bVar));
            if (a2 == null) {
                return false;
            }
            z = a2.equalsIgnoreCase(bVar.f866d);
        } else {
            z = false;
        }
        g.a("Qp.QUM", 1, String.format("[SFU] verify result: %b", new Object[]{Boolean.valueOf(z)}));
        return z;
    }

    public void a() {
        if (!com.tencent.qmsp.sdk.app.a.getTaskStatus()) {
            g.a("Qp.QUM", 1, "[SFU] Plugin Update Task Finish！");
        } else if (!com.tencent.qmsp.sdk.c.f.i().a((int) vlRecallAppDetail.AppNotFound).booleanValue()) {
            a((long) com.tencent.qmsp.sdk.app.a.getAtomUpdateInterval().get());
        } else {
            long j2 = 0;
            long j3 = this.f844h.getLong(a(d.c), 0);
            long currentTimeMillis = System.currentTimeMillis() - j3;
            if (currentTimeMillis >= 0) {
                j2 = currentTimeMillis;
            }
            long j4 = (long) com.tencent.qmsp.sdk.app.a.getAtomUpdateInterval().get();
            g.a("Qp.QUM", 2, String.format("[SFU] startSFU last time: %d, interval: %d", new Object[]{Long.valueOf(j3), Long.valueOf(j2)}));
            if (j2 >= ((long) com.tencent.qmsp.sdk.app.a.getAtomUpdateInterval().get())) {
                b();
            } else {
                j4 = ((long) com.tencent.qmsp.sdk.app.a.getAtomUpdateInterval().get()) - j2;
                g.a("Qp.QUM", 0, "[SFU] next time: " + j4);
            }
            a(j4);
        }
    }

    public void a(int i2) {
        g.b("Qp.QUM", 2, String.format("[SFU] update error: %d", new Object[]{Integer.valueOf(i2)}));
        switch (i2) {
            case 1:
                File file = new File(c());
                if (file.exists()) {
                    file.delete();
                    break;
                }
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
                c(i2);
                break;
        }
        b(1);
    }

    public void a(int i2, Object obj) {
        String str;
        Object obj2 = obj;
        try {
            JSONObject jSONObject = (JSONObject) obj2;
            StringBuilder sb = new StringBuilder();
            sb.append("[SFU] rcv : ");
            sb.append(obj2);
            boolean z = false;
            g.a("Qp.QUM", 0, sb.toString());
            if (jSONObject != null) {
                int optInt = jSONObject.optInt("st");
                int intValue = Integer.valueOf(jSONObject.optString("tsi")).intValue();
                this.f846j = intValue;
                a("0X80078B8", optInt, intValue, "", "");
                if (optInt == 0) {
                    int optInt2 = jSONObject.optInt("sc");
                    int optInt3 = jSONObject.optInt("fi");
                    int optInt4 = jSONObject.optInt("fv");
                    String str2 = (String) jSONObject.opt("fh");
                    String str3 = (String) jSONObject.opt("fu");
                    int optInt5 = jSONObject.optInt("zf");
                    boolean z2 = optInt5 == 1;
                    int a2 = a(optInt4, str2);
                    int i3 = 5;
                    g.a("Qp.QUM", 1, String.format("[SFU] resp: cmd=%d, status=%d, fileid=%d, fileversion=%d, md5=%s, url=%s, zipped: %d", new Object[]{Integer.valueOf(optInt2), Integer.valueOf(optInt), Integer.valueOf(optInt3), Integer.valueOf(optInt4), str2, str3, Integer.valueOf(optInt5)}));
                    if (a2 == 0) {
                        a("0X80078AB", optInt3, this.f846j, "", "");
                        g.a("Qp.QUM", 1, String.format("Need to update config file, fileid=%d", new Object[]{Integer.valueOf(optInt3)}));
                        z = a(new C0014c(1, optInt3, e(), a(d.a), str3, str2, optInt4, z2, 0, System.currentTimeMillis(), 1));
                    } else if (a2 == 1) {
                        if (this.f845i.a(new File(c()).toString())) {
                            if (this.f845i.a().isEmpty()) {
                                i3 = 16;
                            }
                            b(i3);
                            z = true;
                        }
                    } else {
                        str = "[SFU] NO Need UPDATE";
                    }
                } else {
                    str = String.format("[SFU] Server replied with error, status=%d", new Object[]{Integer.valueOf(optInt)});
                }
                g.a("Qp.QUM", 1, str);
            }
            if (!z) {
                b(17);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            b(17);
        }
    }

    public void a(long j2) {
        com.tencent.qmsp.sdk.c.f.i().c().postDelayed(new a(), j2);
    }

    public void a(com.tencent.qmsp.sdk.b.c cVar) {
        Handler handler = this.b;
        if (handler != null) {
            handler.obtainMessage(1052688, cVar).sendToTarget();
        }
    }

    public boolean handleMessage(Message message) {
        if (message.what != 1052688) {
            return false;
        }
        b((com.tencent.qmsp.sdk.b.c) message.obj);
        return false;
    }
}
