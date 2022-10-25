package g.c.a.g.a;

import android.net.Uri;
import com.apkpure.aegon.main.activity.MainTabActivity;

public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ MainTabActivity b;
    public final /* synthetic */ Uri c;

    public /* synthetic */ b(MainTabActivity mainTabActivity, Uri uri) {
        this.b = mainTabActivity;
        this.c = uri;
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0220  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r29 = this;
            r1 = r29
            com.apkpure.aegon.main.activity.MainTabActivity r0 = r1.b
            android.net.Uri r2 = r1.c
            java.util.Objects.requireNonNull(r0)
            g.c.a.g.d.b r3 = g.c.a.g.d.b.a
            android.app.Activity r3 = r0.o
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "url"
            i.o.c.h.e(r2, r4)
            java.lang.String r0 = "context"
            i.o.c.h.e(r3, r0)
            i.o.c.h.e(r3, r0)
            r0 = 0
            android.net.Uri r5 = android.net.Uri.parse(r2)     // Catch:{ Exception -> 0x0024 }
            goto L_0x0025
        L_0x0024:
            r5 = r0
        L_0x0025:
            if (r5 != 0) goto L_0x0028
            goto L_0x002c
        L_0x0028:
            java.lang.String r0 = r5.getScheme()
        L_0x002c:
            r6 = r0
            r8 = 0
            if (r5 != 0) goto L_0x0031
            goto L_0x008f
        L_0x0031:
            java.lang.String r0 = "source_type"
            java.lang.String r0 = r5.getQueryParameter(r0)     // Catch:{ Exception -> 0x0082 }
            if (r0 == 0) goto L_0x008f
            int r9 = r0.length()     // Catch:{ Exception -> 0x0082 }
            if (r9 != 0) goto L_0x0041
            r9 = 1
            goto L_0x0042
        L_0x0041:
            r9 = 0
        L_0x0042:
            if (r9 == 0) goto L_0x0045
            goto L_0x008f
        L_0x0045:
            java.lang.String r9 = "source_pop_type"
            java.lang.String r9 = r5.getQueryParameter(r9)     // Catch:{ Exception -> 0x0082 }
            if (r9 == 0) goto L_0x008f
            int r10 = r9.length()     // Catch:{ Exception -> 0x0082 }
            if (r10 != 0) goto L_0x0055
            r10 = 1
            goto L_0x0056
        L_0x0055:
            r10 = 0
        L_0x0056:
            if (r10 == 0) goto L_0x0059
            goto L_0x008f
        L_0x0059:
            java.lang.String r10 = "2"
            boolean r10 = r10.equals(r0)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r11 = "artificial"
            if (r10 == 0) goto L_0x006d
            boolean r0 = r9.equals(r11)     // Catch:{ Exception -> 0x0082 }
            if (r0 != 0) goto L_0x006a
            goto L_0x008f
        L_0x006a:
            g.c.a.b.c.f r0 = g.c.a.b.c.f.ARTIFICIAL_POPUP     // Catch:{ Exception -> 0x0082 }
            goto L_0x007e
        L_0x006d:
            java.lang.String r10 = "3"
            boolean r0 = r10.equals(r0)     // Catch:{ Exception -> 0x0082 }
            if (r0 == 0) goto L_0x008f
            boolean r0 = r9.equals(r11)     // Catch:{ Exception -> 0x0082 }
            if (r0 != 0) goto L_0x007c
            goto L_0x008f
        L_0x007c:
            g.c.a.b.c.f r0 = g.c.a.b.c.f.ARTIFICIAL_PUSH     // Catch:{ Exception -> 0x0082 }
        L_0x007e:
            g.c.a.b.c.g.d(r0)     // Catch:{ Exception -> 0x0082 }
            goto L_0x008f
        L_0x0082:
            r0 = move-exception
            org.slf4j.Logger r9 = g.c.a.g.d.b.b
            java.lang.String r10 = r5.toString()
            r9.info(r10)
            r0.printStackTrace()
        L_0x008f:
            java.lang.String r0 = "apkpure"
            if (r6 == 0) goto L_0x0098
            boolean r0 = r0.contentEquals(r6)
            goto L_0x00c2
        L_0x0098:
            boolean r9 = r6 instanceof java.lang.String
            if (r9 == 0) goto L_0x00a1
            boolean r0 = i.o.c.h.a(r0, r6)
            goto L_0x00c2
        L_0x00a1:
            if (r0 != r6) goto L_0x00a4
            goto L_0x00bf
        L_0x00a4:
            if (r6 == 0) goto L_0x00c1
            int r9 = r6.length()
            r10 = 7
            if (r10 == r9) goto L_0x00ae
            goto L_0x00c1
        L_0x00ae:
            r9 = 0
        L_0x00af:
            if (r9 >= r10) goto L_0x00bf
            char r11 = r0.charAt(r9)
            char r12 = r6.charAt(r9)
            if (r11 == r12) goto L_0x00bc
            goto L_0x00c1
        L_0x00bc:
            int r9 = r9 + 1
            goto L_0x00af
        L_0x00bf:
            r0 = 1
            goto L_0x00c2
        L_0x00c1:
            r0 = 0
        L_0x00c2:
            if (r0 == 0) goto L_0x029f
            if (r5 == 0) goto L_0x029f
            java.lang.String r0 = r5.getAuthority()
            java.lang.String r5 = "install-app"
            boolean r0 = i.o.c.h.a(r5, r0)
            if (r0 == 0) goto L_0x029f
            java.lang.String r5 = "fast_download_id"
            java.lang.String r6 = "recommend_id"
            java.lang.String r9 = ""
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            e.e.d.l.a.j0(r0, r4, r2)
            java.lang.String r10 = java.lang.String.valueOf(r8)
            java.lang.String r11 = "isComment"
            e.e.d.l.a.j0(r0, r11, r10)
            java.lang.String r10 = "SchemeInstallAppLauncher"
            g.c.a.e.h.b.d.f(r10, r0)
            org.slf4j.Logger r0 = g.c.a.g.d.b.b     // Catch:{ Exception -> 0x013f }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x013f }
            r10.<init>()     // Catch:{ Exception -> 0x013f }
            java.lang.String r11 = "Parse installApp params, uri["
            r10.append(r11)     // Catch:{ Exception -> 0x013f }
            r10.append(r2)     // Catch:{ Exception -> 0x013f }
            java.lang.String r11 = "] "
            r10.append(r11)     // Catch:{ Exception -> 0x013f }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x013f }
            r0.info(r10)     // Catch:{ Exception -> 0x013f }
            java.lang.String r0 = android.net.Uri.decode(r2)     // Catch:{ Exception -> 0x013f }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ Exception -> 0x013f }
            java.lang.String r10 = "app_digest"
            java.lang.String r10 = r0.getQueryParameter(r10)     // Catch:{ Exception -> 0x013f }
            java.lang.String r11 = "uri.getQueryParameter(\"app_digest\")"
            i.o.c.h.d(r10, r11)     // Catch:{ Exception -> 0x013f }
            java.lang.String r11 = "open_detail"
            java.lang.String r11 = r0.getQueryParameter(r11)     // Catch:{ Exception -> 0x013d }
            if (r11 != 0) goto L_0x0126
            r11 = 0
            goto L_0x012c
        L_0x0126:
            java.lang.String r12 = "1"
            boolean r11 = r11.contentEquals(r12)     // Catch:{ Exception -> 0x013d }
        L_0x012c:
            java.lang.String r12 = "report_context"
            java.lang.String r0 = r0.getQueryParameter(r12)     // Catch:{ Exception -> 0x013b }
            java.lang.String r12 = "uri.getQueryParameter(\"report_context\")"
            i.o.c.h.d(r0, r12)     // Catch:{ Exception -> 0x013b }
            r12 = r11
            r11 = r10
            r10 = r0
            goto L_0x014c
        L_0x013b:
            r0 = move-exception
            goto L_0x0142
        L_0x013d:
            r0 = move-exception
            goto L_0x0141
        L_0x013f:
            r0 = move-exception
            r10 = r9
        L_0x0141:
            r11 = 0
        L_0x0142:
            org.slf4j.Logger r12 = g.c.a.g.d.b.b
            java.lang.String r13 = "parse url exception"
            r12.warn((java.lang.String) r13, (java.lang.Throwable) r0)
            r12 = r11
            r11 = r10
            r10 = r9
        L_0x014c:
            org.slf4j.Logger r0 = g.c.a.g.d.b.b
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "Parse installApp params digestJson["
            r13.append(r14)
            r13.append(r11)
            java.lang.String r14 = "] isOpen["
            r13.append(r14)
            r13.append(r12)
            java.lang.String r14 = "] recommendIdJson["
            r13.append(r14)
            r13.append(r10)
            r14 = 93
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r0.debug(r13)
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ Exception -> 0x01b3 }
            r13.<init>(r10)     // Catch:{ Exception -> 0x01b3 }
            java.lang.Object r15 = r13.get(r5)     // Catch:{ Exception -> 0x01b3 }
            java.lang.String r15 = r15.toString()     // Catch:{ Exception -> 0x01b3 }
            java.lang.String r8 = "fast_download_type"
            java.lang.Object r8 = r13.get(r8)     // Catch:{ Exception -> 0x01b0 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x01b0 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ae }
            r13.<init>()     // Catch:{ Exception -> 0x01ae }
            java.lang.String r7 = "Parse installApp params fastDownloadId["
            r13.append(r7)     // Catch:{ Exception -> 0x01ae }
            r13.append(r15)     // Catch:{ Exception -> 0x01ae }
            java.lang.String r7 = "] fastDownloadType["
            r13.append(r7)     // Catch:{ Exception -> 0x01ae }
            r13.append(r8)     // Catch:{ Exception -> 0x01ae }
            r13.append(r14)     // Catch:{ Exception -> 0x01ae }
            java.lang.String r7 = r13.toString()     // Catch:{ Exception -> 0x01ae }
            r0.info(r7)     // Catch:{ Exception -> 0x01ae }
            goto L_0x01bd
        L_0x01ae:
            r0 = move-exception
            goto L_0x01b6
        L_0x01b0:
            r0 = move-exception
            r8 = r9
            goto L_0x01b6
        L_0x01b3:
            r0 = move-exception
            r8 = r9
            r15 = r8
        L_0x01b6:
            org.slf4j.Logger r7 = g.c.a.g.d.b.b
            java.lang.String r13 = "parse fast download exception"
            r7.warn((java.lang.String) r13, (java.lang.Throwable) r0)
        L_0x01bd:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x01ef }
            r0.<init>(r10)     // Catch:{ Exception -> 0x01ef }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ Exception -> 0x01ef }
            java.lang.String r9 = r0.toString()     // Catch:{ Exception -> 0x01ef }
            java.lang.String r7 = android.net.Uri.encode(r9)     // Catch:{ Exception -> 0x01ef }
            java.lang.String r0 = "encode(recommendId)"
            i.o.c.h.d(r7, r0)     // Catch:{ Exception -> 0x01ef }
            org.slf4j.Logger r0 = g.c.a.g.d.b.b     // Catch:{ Exception -> 0x01ed }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ed }
            r9.<init>()     // Catch:{ Exception -> 0x01ed }
            java.lang.String r10 = "Parse installApp params recommendId["
            r9.append(r10)     // Catch:{ Exception -> 0x01ed }
            r9.append(r7)     // Catch:{ Exception -> 0x01ed }
            r9.append(r14)     // Catch:{ Exception -> 0x01ed }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x01ed }
            r0.info(r9)     // Catch:{ Exception -> 0x01ed }
            goto L_0x01f8
        L_0x01ed:
            r0 = move-exception
            goto L_0x01f1
        L_0x01ef:
            r0 = move-exception
            r7 = r9
        L_0x01f1:
            org.slf4j.Logger r9 = g.c.a.g.d.b.b
            java.lang.String r10 = "parse recommend exception"
            r9.warn((java.lang.String) r10, (java.lang.Throwable) r0)
        L_0x01f8:
            r9 = 1
            java.lang.String r0 = java.lang.String.valueOf(r9)
            boolean r0 = i.o.c.h.a(r8, r0)
            if (r0 == 0) goto L_0x0209
            g.c.a.b.c.f r0 = g.c.a.b.c.f.MICRO_DOWNLOAD_H5_FAST
            g.c.a.b.c.g.c(r0)
            goto L_0x020e
        L_0x0209:
            g.c.a.b.c.f r0 = g.c.a.b.c.f.MICRO_DOWNLOAD_H5_NORMAL
            g.c.a.b.c.g.c(r0)
        L_0x020e:
            int r0 = r11.length()
            if (r0 != 0) goto L_0x0217
            r16 = 1
            goto L_0x0219
        L_0x0217:
            r16 = 0
        L_0x0219:
            if (r16 == 0) goto L_0x0220
            org.slf4j.Logger r0 = g.c.a.g.d.b.b
            java.lang.String r2 = "Parse installApp params digestJson is null or empty."
            goto L_0x022a
        L_0x0220:
            com.apkpure.aegon.components.models.AppDigest r0 = com.apkpure.aegon.components.models.AppDigest.d(r11)
            if (r0 != 0) goto L_0x022e
            org.slf4j.Logger r0 = g.c.a.g.d.b.b
            java.lang.String r2 = "digest is null."
        L_0x022a:
            r0.info(r2)
            goto L_0x029f
        L_0x022e:
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            java.lang.String r10 = "active_type"
            r9.put(r10, r8)
            r9.put(r5, r15)
            r9.put(r6, r7)
            if (r12 == 0) goto L_0x0261
            java.lang.String r18 = r0.a()
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            com.apkpure.aegon.components.models.SimpleDisplayInfo r5 = com.apkpure.aegon.components.models.SimpleDisplayInfo.h(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28)
            g.c.a.g.d.a.a(r3, r5, r9)
        L_0x0261:
            java.lang.String r0 = r0.a()
            java.lang.String r3 = "digest.packageName"
            i.o.c.h.d(r0, r3)
            com.apkpure.aegon.components.statistics.datong.DTStatInfo r3 = new com.apkpure.aegon.components.statistics.datong.DTStatInfo
            r3.<init>()
            r3.downloadId = r15
            r3.recommendId = r7
            r3.activeType = r8
            g.c.a.e.k.a.f.f(r0, r3)
            java.lang.String r0 = "recommendId"
            i.o.c.h.e(r7, r0)
            java.lang.String r0 = "fastDownloadId"
            i.o.c.h.e(r15, r0)
            java.lang.String r0 = "fastDownloadType"
            i.o.c.h.e(r8, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            e.e.d.l.a.j0(r0, r4, r2)
            e.e.d.l.a.j0(r0, r6, r7)
            e.e.d.l.a.j0(r0, r10, r8)
            java.lang.String r2 = "apk_download_id"
            e.e.d.l.a.j0(r0, r2, r15)
            java.lang.String r2 = "SchemeInstallAppParseSucc"
            g.c.a.e.h.b.d.f(r2, r0)
        L_0x029f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a.g.a.b.run():void");
    }
}
