package g.i.b.e.b;

import org.json.JSONObject;

public final class j {
    public JSONObject a;

    public final class a {
        public String a;
        public boolean b = true;
        public boolean c = false;

        /* renamed from: d  reason: collision with root package name */
        public boolean f4117d = false;

        /* renamed from: e  reason: collision with root package name */
        public boolean f4118e = false;

        /* renamed from: f  reason: collision with root package name */
        public boolean f4119f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f4120g = false;

        /* renamed from: h  reason: collision with root package name */
        public String[] f4121h;

        public a(j jVar, String str, int i2, String str2, String str3, String str4, String str5) {
            this.a = str;
            String[] split = str.split("-");
            if (split.length < 5) {
                this.f4121h = new String[]{"all", "all", "all", "all", "all"};
                for (int i3 = 0; i3 < split.length; i3++) {
                    this.f4121h[i3] = split[i3];
                }
            } else {
                this.f4121h = split;
            }
            this.c = a(0, String.valueOf(i2));
            this.f4117d = a(1, str2);
            this.f4118e = a(2, str3);
            this.f4119f = a(3, str4);
            this.f4120g = a(4, str5);
            this.f4121h = null;
        }

        public final boolean a(int i2, String str) {
            String[] strArr = this.f4121h;
            if (strArr.length < i2 + 1) {
                return false;
            }
            boolean equals = strArr[i2].equals(str);
            if (!equals && !this.f4121h[i2].equals("all")) {
                this.b = false;
            }
            return equals;
        }
    }

    public final synchronized String a() {
        JSONObject jSONObject = this.a;
        if (jSONObject == null) {
            return "";
        }
        return jSONObject.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a5, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b(java.lang.String r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "halley-cloud-SettingsQuerier"
            java.lang.String r1 = "received new json data:"
            java.lang.String r2 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00ae }
            java.lang.String r1 = r1.concat(r2)     // Catch:{ all -> 0x00ae }
            g.i.b.e.h.b.f(r0, r1)     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = "halley-cloud-SettingsQuerier"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ae }
            java.lang.String r2 = "old json data:"
            r1.<init>(r2)     // Catch:{ all -> 0x00ae }
            org.json.JSONObject r2 = r5.a     // Catch:{ all -> 0x00ae }
            r1.append(r2)     // Catch:{ all -> 0x00ae }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00ae }
            g.i.b.e.h.b.f(r0, r1)     // Catch:{ all -> 0x00ae }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x00ae }
            if (r0 == 0) goto L_0x002d
            monitor-exit(r5)
            return
        L_0x002d:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x00a6 }
            r0.<init>(r6)     // Catch:{ all -> 0x00a6 }
            org.json.JSONObject r6 = r5.a     // Catch:{ all -> 0x00a6 }
            if (r6 != 0) goto L_0x003a
            r5.a = r0     // Catch:{ all -> 0x00a6 }
            monitor-exit(r5)
            return
        L_0x003a:
            java.lang.String r6 = "data"
            org.json.JSONObject r6 = r0.optJSONObject(r6)     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = "version"
            java.lang.String r0 = r0.optString(r1)     // Catch:{ all -> 0x00a6 }
            if (r6 == 0) goto L_0x00a4
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x00a6 }
            if (r1 != 0) goto L_0x00a4
            org.json.JSONObject r1 = r5.a     // Catch:{ all -> 0x00a6 }
            java.lang.String r2 = "data"
            org.json.JSONObject r1 = r1.optJSONObject(r2)     // Catch:{ all -> 0x00a6 }
            if (r1 != 0) goto L_0x0068
            org.json.JSONObject r1 = r5.a     // Catch:{ all -> 0x00a6 }
            java.lang.String r2 = "data"
            r1.putOpt(r2, r6)     // Catch:{ all -> 0x00a6 }
            org.json.JSONObject r6 = r5.a     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = "version"
            r6.putOpt(r1, r0)     // Catch:{ all -> 0x00a6 }
            monitor-exit(r5)
            return
        L_0x0068:
            java.util.Iterator r2 = r6.keys()     // Catch:{ all -> 0x00a6 }
        L_0x006c:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00a6 }
            if (r3 == 0) goto L_0x0088
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00a6 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00a6 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x00a6 }
            if (r4 != 0) goto L_0x006c
            org.json.JSONObject r4 = r6.optJSONObject(r3)     // Catch:{ all -> 0x00a6 }
            if (r4 == 0) goto L_0x006c
            r1.putOpt(r3, r4)     // Catch:{ all -> 0x00a6 }
            goto L_0x006c
        L_0x0088:
            org.json.JSONObject r6 = r5.a     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = "version"
            r6.putOpt(r1, r0)     // Catch:{ all -> 0x00a6 }
            java.lang.String r6 = "halley-cloud-SettingsQuerier"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = "updated json data:"
            r0.<init>(r1)     // Catch:{ all -> 0x00a6 }
            org.json.JSONObject r1 = r5.a     // Catch:{ all -> 0x00a6 }
            r0.append(r1)     // Catch:{ all -> 0x00a6 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00a6 }
            g.i.b.e.h.b.f(r6, r0)     // Catch:{ all -> 0x00a6 }
        L_0x00a4:
            monitor-exit(r5)
            return
        L_0x00a6:
            r6 = move-exception
            java.lang.String r0 = "halley-cloud-SettingsQuerier"
            g.i.b.e.h.b.b(r0, r6)     // Catch:{ all -> 0x00ae }
            monitor-exit(r5)
            return
        L_0x00ae:
            r6 = move-exception
            monitor-exit(r5)
            goto L_0x00b2
        L_0x00b1:
            throw r6
        L_0x00b2:
            goto L_0x00b1
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.b.e.b.j.b(java.lang.String):void");
    }
}
