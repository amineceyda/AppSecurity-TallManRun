package g.i.b.e.f.a;

import android.text.TextUtils;
import g.i.b.e.b.j;
import g.i.b.e.f.g;
import g.i.b.e.f.i;
import g.i.b.e.h.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class c extends b implements g {
    public j b = new j();
    public List<Object> c = new ArrayList();

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            String f2 = g.i.b.e.f.j.f("settings_in_client", "", true);
            b.f("SettingsClient", "loadLocal jsonData:".concat(String.valueOf(f2)));
            if (!TextUtils.isEmpty(f2)) {
                try {
                    c.this.b.b(f2);
                    c.this.d();
                } catch (Throwable th) {
                    th.printStackTrace();
                    g.i.b.e.f.j.e("settings_in_client", "", true);
                }
            }
        }
    }

    public c() {
        g.i.b.e.c.n.post(new a());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00bf, code lost:
        r0 = r0.optString(r2);
     */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00bc A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(java.lang.String r15, int r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            r14 = this;
            r1 = r14
            g.i.b.e.b.j r10 = r1.b
            monitor-enter(r10)
            org.json.JSONObject r0 = r10.a     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x00c4
            boolean r0 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x0010
            goto L_0x00c4
        L_0x0010:
            org.json.JSONObject r0 = r10.a     // Catch:{ all -> 0x00c8 }
            java.lang.String r2 = "data"
            org.json.JSONObject r0 = r0.optJSONObject(r2)     // Catch:{ all -> 0x00c8 }
            if (r0 != 0) goto L_0x001c
            goto L_0x00c4
        L_0x001c:
            r2 = r15
            org.json.JSONObject r0 = r0.optJSONObject(r15)     // Catch:{ all -> 0x00c8 }
            if (r0 != 0) goto L_0x0025
            goto L_0x00c4
        L_0x0025:
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x00c8 }
            r11.<init>()     // Catch:{ all -> 0x00c8 }
            java.util.Iterator r12 = r0.keys()     // Catch:{ all -> 0x00c8 }
        L_0x002e:
            boolean r2 = r12.hasNext()     // Catch:{ all -> 0x00c8 }
            if (r2 == 0) goto L_0x0066
            java.lang.Object r2 = r12.next()     // Catch:{ all -> 0x00c8 }
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x00c8 }
            boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x00c8 }
            if (r2 != 0) goto L_0x002e
            java.lang.String r2 = "deviceid"
            boolean r2 = r4.equals(r2)     // Catch:{ all -> 0x00c8 }
            if (r2 == 0) goto L_0x004d
            java.lang.String r2 = "deviceid"
            goto L_0x00bf
        L_0x004d:
            g.i.b.e.b.j$a r13 = new g.i.b.e.b.j$a     // Catch:{ all -> 0x00c8 }
            r2 = r13
            r3 = r10
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00c8 }
            boolean r2 = r13.b     // Catch:{ all -> 0x00c8 }
            if (r2 == 0) goto L_0x002e
            r11.add(r13)     // Catch:{ all -> 0x00c8 }
            goto L_0x002e
        L_0x0066:
            int r2 = r11.size()     // Catch:{ all -> 0x00c8 }
            if (r2 != 0) goto L_0x006d
            goto L_0x00c4
        L_0x006d:
            int r2 = r11.size()     // Catch:{ all -> 0x00c8 }
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L_0x007e
            java.lang.Object r2 = r11.get(r3)     // Catch:{ all -> 0x00c8 }
            g.i.b.e.b.j$a r2 = (g.i.b.e.b.j.a) r2     // Catch:{ all -> 0x00c8 }
        L_0x007b:
            java.lang.String r2 = r2.a     // Catch:{ all -> 0x00c8 }
            goto L_0x00bf
        L_0x007e:
            java.lang.Object r2 = r11.get(r3)     // Catch:{ all -> 0x00c8 }
            g.i.b.e.b.j$a r2 = (g.i.b.e.b.j.a) r2     // Catch:{ all -> 0x00c8 }
            r3 = 1
        L_0x0085:
            int r5 = r11.size()     // Catch:{ all -> 0x00c8 }
            if (r3 >= r5) goto L_0x007b
            java.lang.Object r5 = r11.get(r3)     // Catch:{ all -> 0x00c8 }
            g.i.b.e.b.j$a r5 = (g.i.b.e.b.j.a) r5     // Catch:{ all -> 0x00c8 }
            boolean r6 = r2.b     // Catch:{ all -> 0x00c8 }
            if (r6 == 0) goto L_0x00b8
            boolean r6 = r5.c     // Catch:{ all -> 0x00c8 }
            boolean r7 = r2.c     // Catch:{ all -> 0x00c8 }
            if (r6 == r7) goto L_0x009c
            goto L_0x00b9
        L_0x009c:
            boolean r6 = r5.f4117d     // Catch:{ all -> 0x00c8 }
            boolean r7 = r2.f4117d     // Catch:{ all -> 0x00c8 }
            if (r6 == r7) goto L_0x00a3
            goto L_0x00b9
        L_0x00a3:
            boolean r6 = r5.f4118e     // Catch:{ all -> 0x00c8 }
            boolean r7 = r2.f4118e     // Catch:{ all -> 0x00c8 }
            if (r6 == r7) goto L_0x00aa
            goto L_0x00b9
        L_0x00aa:
            boolean r6 = r5.f4119f     // Catch:{ all -> 0x00c8 }
            boolean r7 = r2.f4119f     // Catch:{ all -> 0x00c8 }
            if (r6 == r7) goto L_0x00b1
            goto L_0x00b9
        L_0x00b1:
            boolean r6 = r5.f4120g     // Catch:{ all -> 0x00c8 }
            boolean r7 = r2.f4120g     // Catch:{ all -> 0x00c8 }
            if (r6 == r7) goto L_0x00b8
            goto L_0x00b9
        L_0x00b8:
            r6 = 1
        L_0x00b9:
            if (r6 == 0) goto L_0x00bc
            r2 = r5
        L_0x00bc:
            int r3 = r3 + 1
            goto L_0x0085
        L_0x00bf:
            java.lang.String r0 = r0.optString(r2)     // Catch:{ all -> 0x00c8 }
            goto L_0x00c6
        L_0x00c4:
            java.lang.String r0 = ""
        L_0x00c6:
            monitor-exit(r10)
            return r0
        L_0x00c8:
            r0 = move-exception
            monitor-exit(r10)
            goto L_0x00cc
        L_0x00cb:
            throw r0
        L_0x00cc:
            goto L_0x00cb
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.b.e.f.a.c.a(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public final void b(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && !g.i.b.e.f.c.a.b.a().d().equals(str2)) {
            g.i.b.e.f.c.a.b.a().c(str2, true);
        }
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.b) {
                j jVar = this.b;
                synchronized (jVar) {
                    jVar.a = null;
                }
                this.b.b(str);
            }
            g.i.b.e.f.j.e("settings_in_client", this.b.a(), true);
            d();
        }
    }

    public final void c() {
        i.e().c.b();
    }

    public final synchronized void d() {
        Iterator<Object> it = this.c.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
