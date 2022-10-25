package g.e.b.l.j.p;

import android.content.Context;
import g.e.a.b.g.g;
import g.e.b.l.j.j.g0;
import g.e.b.l.j.j.o0;
import g.e.b.l.j.p.j.c;
import g.e.b.l.j.p.j.d;
import g.e.b.l.j.p.j.f;
import g.e.b.l.j.p.k.a;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

public class e implements f {
    public final Context a;
    public final f b;
    public final g c;

    /* renamed from: d  reason: collision with root package name */
    public final o0 f3697d;

    /* renamed from: e  reason: collision with root package name */
    public final a f3698e;

    /* renamed from: f  reason: collision with root package name */
    public final a f3699f;

    /* renamed from: g  reason: collision with root package name */
    public final g0 f3700g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicReference<d> f3701h;

    /* renamed from: i  reason: collision with root package name */
    public final AtomicReference<g<g.e.b.l.j.p.j.a>> f3702i = new AtomicReference<>(new g());

    public e(Context context, f fVar, o0 o0Var, g gVar, a aVar, a aVar2, g0 g0Var) {
        o0 o0Var2 = o0Var;
        AtomicReference<d> atomicReference = new AtomicReference<>();
        this.f3701h = atomicReference;
        this.a = context;
        this.b = fVar;
        this.f3697d = o0Var2;
        this.c = gVar;
        this.f3698e = aVar;
        this.f3699f = aVar2;
        this.f3700g = g0Var;
        JSONObject jSONObject = new JSONObject();
        atomicReference.set(new g.e.b.l.j.p.j.e(b.c(o0Var2, 3600, jSONObject), (g.e.b.l.j.p.j.a) null, new c(jSONObject.optInt("max_custom_exception_events", 8), 4), b.b(jSONObject), 0, 3600));
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final g.e.b.l.j.p.j.e a(g.e.b.l.j.p.c r10) {
        /*
            r9 = this;
            java.lang.String r0 = "FirebaseCrashlytics"
            r1 = 6
            r2 = 0
            g.e.b.l.j.p.c r3 = g.e.b.l.j.p.c.SKIP_CACHE_LOOKUP     // Catch:{ Exception -> 0x0068 }
            boolean r3 = r3.equals(r10)     // Catch:{ Exception -> 0x0068 }
            if (r3 != 0) goto L_0x0076
            g.e.b.l.j.p.a r3 = r9.f3698e     // Catch:{ Exception -> 0x0068 }
            org.json.JSONObject r3 = r3.a()     // Catch:{ Exception -> 0x0068 }
            if (r3 == 0) goto L_0x0060
            g.e.b.l.j.p.g r4 = r9.c     // Catch:{ Exception -> 0x0068 }
            g.e.b.l.j.p.j.e r4 = r4.a(r3)     // Catch:{ Exception -> 0x0068 }
            if (r4 == 0) goto L_0x0052
            java.lang.String r5 = "Loaded cached settings: "
            r9.c(r3, r5)     // Catch:{ Exception -> 0x0068 }
            g.e.b.l.j.j.o0 r3 = r9.f3697d     // Catch:{ Exception -> 0x0068 }
            java.util.Objects.requireNonNull(r3)     // Catch:{ Exception -> 0x0068 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0068 }
            g.e.b.l.j.p.c r3 = g.e.b.l.j.p.c.IGNORE_CACHE_EXPIRATION     // Catch:{ Exception -> 0x0068 }
            boolean r10 = r3.equals(r10)     // Catch:{ Exception -> 0x0068 }
            if (r10 != 0) goto L_0x0046
            long r7 = r4.f3703d     // Catch:{ Exception -> 0x0068 }
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 >= 0) goto L_0x003a
            r10 = 1
            goto L_0x003b
        L_0x003a:
            r10 = 0
        L_0x003b:
            if (r10 != 0) goto L_0x003e
            goto L_0x0046
        L_0x003e:
            g.e.b.l.j.f r10 = g.e.b.l.j.f.a     // Catch:{ Exception -> 0x0068 }
            java.lang.String r3 = "Cached settings have expired."
            r10.e(r3)     // Catch:{ Exception -> 0x0068 }
            goto L_0x0076
        L_0x0046:
            g.e.b.l.j.f r10 = g.e.b.l.j.f.a     // Catch:{ Exception -> 0x004f }
            java.lang.String r2 = "Returning cached settings."
            r10.e(r2)     // Catch:{ Exception -> 0x004f }
            r2 = r4
            goto L_0x0076
        L_0x004f:
            r10 = move-exception
            r2 = r4
            goto L_0x0069
        L_0x0052:
            g.e.b.l.j.f r10 = g.e.b.l.j.f.a     // Catch:{ Exception -> 0x0068 }
            java.lang.String r3 = "Failed to parse cached settings data."
            boolean r10 = r10.a(r1)     // Catch:{ Exception -> 0x0068 }
            if (r10 == 0) goto L_0x0076
            android.util.Log.e(r0, r3, r2)     // Catch:{ Exception -> 0x0068 }
            goto L_0x0076
        L_0x0060:
            g.e.b.l.j.f r10 = g.e.b.l.j.f.a     // Catch:{ Exception -> 0x0068 }
            java.lang.String r3 = "No cached settings data found."
            r10.b(r3)     // Catch:{ Exception -> 0x0068 }
            goto L_0x0076
        L_0x0068:
            r10 = move-exception
        L_0x0069:
            g.e.b.l.j.f r3 = g.e.b.l.j.f.a
            boolean r1 = r3.a(r1)
            if (r1 == 0) goto L_0x0076
            java.lang.String r1 = "Failed to get cached settings"
            android.util.Log.e(r0, r1, r10)
        L_0x0076:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.b.l.j.p.e.a(g.e.b.l.j.p.c):g.e.b.l.j.p.j.e");
    }

    public d b() {
        return this.f3701h.get();
    }

    public final void c(JSONObject jSONObject, String str) throws JSONException {
        g.e.b.l.j.f fVar = g.e.b.l.j.f.a;
        StringBuilder i2 = g.a.a.a.a.i(str);
        i2.append(jSONObject.toString());
        fVar.b(i2.toString());
    }
}
