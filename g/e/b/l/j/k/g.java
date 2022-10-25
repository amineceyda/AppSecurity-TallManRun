package g.e.b.l.j.k;

import com.tencent.raft.measure.utils.MeasureConst;
import g.e.b.l.j.n.f;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class g {
    public static final Charset b = Charset.forName(MeasureConst.CHARSET_UTF8);
    public final f a;

    public g(f fVar) {
        this.a = fVar;
    }

    public static Map<String, String> a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String str2 = null;
            if (!jSONObject.isNull(next)) {
                str2 = jSONObject.optString(next, (String) null);
            }
            hashMap.put(next, str2);
        }
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0045 A[Catch:{ all -> 0x0037 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map<java.lang.String, java.lang.String> b(java.lang.String r5, boolean r6) {
        /*
            r4 = this;
            java.lang.String r0 = "Failed to close user metadata file."
            if (r6 == 0) goto L_0x000d
            g.e.b.l.j.n.f r6 = r4.a
            java.lang.String r1 = "internal-keys"
            java.io.File r5 = r6.f(r5, r1)
            goto L_0x0015
        L_0x000d:
            g.e.b.l.j.n.f r6 = r4.a
            java.lang.String r1 = "keys"
            java.io.File r5 = r6.f(r5, r1)
        L_0x0015:
            boolean r6 = r5.exists()
            if (r6 != 0) goto L_0x0020
            java.util.Map r5 = java.util.Collections.emptyMap()
            return r5
        L_0x0020:
            r6 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0039 }
            r1.<init>(r5)     // Catch:{ Exception -> 0x0039 }
            java.lang.String r5 = g.e.b.l.j.j.l.m(r1)     // Catch:{ Exception -> 0x0034, all -> 0x0032 }
            java.util.Map r5 = a(r5)     // Catch:{ Exception -> 0x0034, all -> 0x0032 }
            g.e.b.l.j.j.l.a(r1, r0)
            return r5
        L_0x0032:
            r5 = move-exception
            goto L_0x0053
        L_0x0034:
            r5 = move-exception
            r6 = r1
            goto L_0x003a
        L_0x0037:
            r5 = move-exception
            goto L_0x0052
        L_0x0039:
            r5 = move-exception
        L_0x003a:
            g.e.b.l.j.f r1 = g.e.b.l.j.f.a     // Catch:{ all -> 0x0037 }
            java.lang.String r2 = "Error deserializing user metadata."
            r3 = 6
            boolean r1 = r1.a(r3)     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x004a
            java.lang.String r1 = "FirebaseCrashlytics"
            android.util.Log.e(r1, r2, r5)     // Catch:{ all -> 0x0037 }
        L_0x004a:
            g.e.b.l.j.j.l.a(r6, r0)
            java.util.Map r5 = java.util.Collections.emptyMap()
            return r5
        L_0x0052:
            r1 = r6
        L_0x0053:
            g.e.b.l.j.j.l.a(r1, r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.b.l.j.k.g.b(java.lang.String, boolean):java.util.Map");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x007a A[Catch:{ all -> 0x0066 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String c(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "Failed to close user metadata file."
            g.e.b.l.j.n.f r1 = r7.a
            java.lang.String r2 = "user-data"
            java.io.File r1 = r1.f(r8, r2)
            boolean r2 = r1.exists()
            r3 = 0
            if (r2 != 0) goto L_0x0028
            g.e.b.l.j.f r0 = g.e.b.l.j.f.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No userId set for session "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.b(r8)
            return r3
        L_0x0028:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x006d, all -> 0x006b }
            r2.<init>(r1)     // Catch:{ Exception -> 0x006d, all -> 0x006b }
            java.lang.String r1 = g.e.b.l.j.j.l.m(r2)     // Catch:{ Exception -> 0x0069 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0069 }
            r4.<init>(r1)     // Catch:{ Exception -> 0x0069 }
            java.lang.String r1 = "userId"
            boolean r5 = r4.isNull(r1)     // Catch:{ Exception -> 0x0069 }
            if (r5 != 0) goto L_0x0043
            java.lang.String r1 = r4.optString(r1, r3)     // Catch:{ Exception -> 0x0069 }
            goto L_0x0044
        L_0x0043:
            r1 = r3
        L_0x0044:
            g.e.b.l.j.f r4 = g.e.b.l.j.f.a     // Catch:{ Exception -> 0x0069 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0069 }
            r5.<init>()     // Catch:{ Exception -> 0x0069 }
            java.lang.String r6 = "Loaded userId "
            r5.append(r6)     // Catch:{ Exception -> 0x0069 }
            r5.append(r1)     // Catch:{ Exception -> 0x0069 }
            java.lang.String r6 = " for session "
            r5.append(r6)     // Catch:{ Exception -> 0x0069 }
            r5.append(r8)     // Catch:{ Exception -> 0x0069 }
            java.lang.String r8 = r5.toString()     // Catch:{ Exception -> 0x0069 }
            r4.b(r8)     // Catch:{ Exception -> 0x0069 }
            g.e.b.l.j.j.l.a(r2, r0)
            return r1
        L_0x0066:
            r8 = move-exception
            r3 = r2
            goto L_0x0083
        L_0x0069:
            r8 = move-exception
            goto L_0x006f
        L_0x006b:
            r8 = move-exception
            goto L_0x0083
        L_0x006d:
            r8 = move-exception
            r2 = r3
        L_0x006f:
            g.e.b.l.j.f r1 = g.e.b.l.j.f.a     // Catch:{ all -> 0x0066 }
            java.lang.String r4 = "Error deserializing user metadata."
            r5 = 6
            boolean r1 = r1.a(r5)     // Catch:{ all -> 0x0066 }
            if (r1 == 0) goto L_0x007f
            java.lang.String r1 = "FirebaseCrashlytics"
            android.util.Log.e(r1, r4, r8)     // Catch:{ all -> 0x0066 }
        L_0x007f:
            g.e.b.l.j.j.l.a(r2, r0)
            return r3
        L_0x0083:
            g.e.b.l.j.j.l.a(r3, r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.b.l.j.k.g.c(java.lang.String):java.lang.String");
    }
}
