package com.tencent.qmsp.sdk.d;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.tencent.qmsp.sdk.a.c;
import com.tencent.qmsp.sdk.app.a;
import com.tencent.qmsp.sdk.d.d;
import com.tencent.qmsp.sdk.f.g;
import com.tencent.qmsp.sdk.f.h;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Marker;

public class b {
    private List<d.b> a = new ArrayList();
    private SharedPreferences b = null;

    public b() {
        Context context = a.getContext();
        this.b = context.getSharedPreferences(com.tencent.qmsp.sdk.c.b.a + a(d.b), 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        /*
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0024
            java.lang.String r0 = "1"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000f
            goto L_0x0024
        L_0x000f:
            java.lang.String r0 = "2"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0021
            android.content.Context r3 = com.tencent.qmsp.sdk.app.a.getContext()
            r0 = 0
            java.io.File r3 = r3.getExternalFilesDir(r0)
            goto L_0x002c
        L_0x0021:
            java.lang.String r3 = ""
            goto L_0x0030
        L_0x0024:
            android.content.Context r3 = com.tencent.qmsp.sdk.app.a.getContext()
            java.io.File r3 = r3.getFilesDir()
        L_0x002c:
            java.lang.String r3 = r3.getParent()
        L_0x0030:
            java.lang.String r0 = java.io.File.separator
            boolean r1 = r3.endsWith(r0)
            if (r1 != 0) goto L_0x0042
            boolean r1 = r4.startsWith(r0)
            if (r1 != 0) goto L_0x0042
            java.lang.String r3 = g.a.a.a.a.w(r3, r0)
        L_0x0042:
            java.lang.String r3 = g.a.a.a.a.w(r3, r4)
            boolean r4 = r4.endsWith(r0)
            if (r4 == 0) goto L_0x0051
            java.lang.StringBuilder r3 = g.a.a.a.a.i(r3)
            goto L_0x0055
        L_0x0051:
            java.lang.StringBuilder r3 = g.a.a.a.a.l(r3, r0)
        L_0x0055:
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qmsp.sdk.d.b.a(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    private String a(byte[] bArr) {
        return h.a(bArr);
    }

    private boolean a(String str, long j2, long j3) {
        int i2;
        int i3;
        if (str == null || !str.equals("android") || j2 < 0 || j3 < 0) {
            return false;
        }
        long j4 = (long) Build.VERSION.SDK_INT;
        if (i2 == 0 && i3 == 0) {
            return true;
        }
        return (i2 != 0 || i3 <= 0) ? (i2 <= 0 || i3 != 0) ? i2 > 0 && i3 > 0 && j4 >= j2 && j4 <= j3 : j4 >= j2 : j4 <= j3;
    }

    private boolean a(String str, String str2) {
        if (!(str == null || str2 == null)) {
            String replace = str.replace(" ", "");
            String replace2 = str2.replace(" ", "");
            boolean equals = replace.equals(Marker.ANY_MARKER);
            boolean equals2 = replace2.equals(Marker.ANY_MARKER);
            if (equals && equals2) {
                return true;
            }
            String c = c.c();
            if (TextUtils.isEmpty(c)) {
                return false;
            }
            if (!equals || equals2) {
                return (equals || !equals2) ? !equals && !equals2 && b(c, replace2) <= 0 && b(c, replace) >= 0 : b(c, replace) >= 0;
            }
            try {
                return b(c, replace2) <= 0;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    private int b(String str, String str2) {
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int length = split.length < split2.length ? split.length : split2.length;
        for (int i2 = 0; i2 < length; i2++) {
            int parseInt = Integer.parseInt(split[i2]);
            int parseInt2 = Integer.parseInt(split2[i2]);
            if (parseInt > parseInt2) {
                return 1;
            }
            if (parseInt < parseInt2) {
                return -1;
            }
        }
        return 0;
    }

    private String b() {
        return com.tencent.qmsp.sdk.a.b.c() + a(d.a);
    }

    private boolean b(String str) {
        if (str == null) {
            return false;
        }
        String replace = str.replace(" ", "");
        if (replace.equals(Marker.ANY_MARKER)) {
            return true;
        }
        String str2 = Build.CPU_ABI;
        String[] split = replace.split(",");
        if (split == null) {
            return false;
        }
        for (String contains : split) {
            if (str2.contains(contains)) {
                return true;
            }
        }
        return false;
    }

    private boolean c(String str) {
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str);
            byte[][] bArr = d.f858g;
            jSONObject.getLong(a(bArr[0]));
            jSONObject.getBoolean(a(bArr[1]));
            JSONArray jSONArray = jSONObject.getJSONArray(a(bArr[2]));
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                d.b bVar = new d.b();
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                byte[][] bArr2 = d.f858g;
                bVar.a = jSONObject2.getLong(a(bArr2[3]));
                bVar.b = jSONObject2.getLong(a(bArr2[4]));
                jSONObject2.getLong(a(bArr2[7]));
                bVar.c = jSONObject2.getString(a(bArr2[5]));
                bVar.f866d = jSONObject2.getString(a(bArr2[6]));
                bVar.f867e = jSONObject2.getString(a(bArr2[8]));
                bVar.f868f = jSONObject2.getLong(a(bArr2[15]));
                bVar.f869g = jSONObject2.getLong(a(bArr2[16]));
                bVar.f872j = jSONObject2.getString(a(bArr2[18]));
                bVar.f870h = jSONObject2.getString(a(bArr2[10]));
                bVar.f871i = jSONObject2.getString(a(bArr2[11]));
                String string = jSONObject2.getString(a(bArr2[9]));
                bVar.f873k = string;
                bVar.f875m = a(string, bVar.f868f, bVar.f869g);
                bVar.n = b(bVar.f872j);
                bVar.f874l = a(bVar.f870h, bVar.f871i);
                if (jSONObject2.has(a(bArr2[20]))) {
                    bVar.u = jSONObject2.getInt(a(bArr2[20]));
                }
                JSONArray jSONArray2 = jSONObject2.getJSONArray(a(bArr2[12]));
                for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i3);
                    d.a aVar = new d.a();
                    byte[][] bArr3 = d.f858g;
                    jSONObject3.getLong(a(bArr3[7]));
                    aVar.f859d = jSONObject3.getString(a(bArr3[13]));
                    aVar.f860e = jSONObject3.getString(a(bArr3[14]));
                    String string2 = jSONObject3.getString(a(bArr3[5]));
                    aVar.a = string2;
                    aVar.f861f = a(aVar.f859d, aVar.f860e, string2);
                    aVar.b = jSONObject3.getString(a(bArr3[6]));
                    aVar.f863h = jSONObject3.getLong(a(bArr3[17]));
                    if (jSONObject3.has(a(bArr3[19]))) {
                        aVar.f864i = jSONObject3.getString(a(bArr3[19]));
                    }
                    bVar.o.add(aVar);
                }
                arrayList.add(bVar);
            }
            this.a = arrayList;
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            g.a("Qp.QPUpdate", 1, "[SFU] parsing config error");
            return false;
        }
    }

    public List<d.b> a() {
        return this.a;
    }

    public List<d.b> a(long j2) {
        ArrayList arrayList = new ArrayList();
        if (a(b()) && !this.a.isEmpty()) {
            for (int i2 = 0; i2 < this.a.size(); i2++) {
                d.b bVar = this.a.get(i2);
                if (bVar.b == j2) {
                    for (int i3 = 0; i3 < bVar.o.size(); i3++) {
                        d.a aVar = bVar.o.get(i3);
                        aVar.f862g = this.b.getString(aVar.f861f, "");
                    }
                    for (int i4 = 0; i4 < bVar.q.size(); i4++) {
                        d.a aVar2 = bVar.q.get(i4);
                        aVar2.f862g = this.b.getString(aVar2.f861f, "");
                    }
                    for (int i5 = 0; i5 < bVar.p.size(); i5++) {
                        d.a aVar3 = bVar.p.get(i5);
                        aVar3.f862g = this.b.getString(aVar3.f861f, "");
                    }
                    arrayList.add(bVar);
                }
            }
        }
        return arrayList;
    }

    public boolean a(String str) {
        byte[] a2 = e.a(new File(str), (String) null);
        if (a2 != null) {
            return c(new String(a2));
        }
        g.a("Qp.QPUpdate", 1, String.format("[SFU] invalid sig of config: %s", new Object[]{str}));
        return false;
    }
}
