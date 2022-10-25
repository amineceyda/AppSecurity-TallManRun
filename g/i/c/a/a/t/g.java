package g.i.c.a.a.t;

import android.content.pm.PackageInfo;
import com.tencent.raft.raftframework.sla.SLAConstant;
import g.i.c.a.a.b0.e;
import g.i.c.a.a.b0.f;
import g.i.c.a.a.r.e;
import g.i.c.a.a.t.a;
import g.i.c.a.a.w.e;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class g {
    public static g.i.c.a.a.b0.e<d> a = new g.i.c.a.a.b0.e<>();
    public static ThreadLocal<e> b = new a();

    public static class a extends ThreadLocal<e> {
        public Object initialValue() {
            return new e((a) null);
        }
    }

    public static class b implements Runnable {
        public final /* synthetic */ Map b;
        public final /* synthetic */ Object c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String f4526d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ g.i.c.a.a.u.c f4527e;

        public b(Map map, Object obj, String str, g.i.c.a.a.u.c cVar) {
            this.b = map;
            this.c = obj;
            this.f4526d = str;
            this.f4527e = cVar;
        }

        public void run() {
            j.a(this.b);
            Map map = this.b;
            g.i.c.a.a.c cVar = e.b.a.f4498g;
            if (cVar != null) {
                cVar.a(map);
            }
            j.c(this.c, this.b);
            j.b(this.f4526d, this.f4527e.a, this.b);
            HashMap hashMap = new HashMap();
            Map<String, Object> map2 = this.f4527e.c;
            if (map2 != null) {
                hashMap.putAll(map2);
            }
            hashMap.putAll(this.b);
            Object obj = this.c;
            g.i.c.a.a.u.c cVar2 = this.f4527e;
            g.e(obj, cVar2.a, cVar2.b, hashMap, this.f4526d);
            g.a(this.f4527e);
        }
    }

    public static class c implements Runnable {
        public final /* synthetic */ Map b;
        public final /* synthetic */ Object c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ g.i.c.a.a.u.c f4528d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ boolean f4529e;

        public c(Map map, Object obj, g.i.c.a.a.u.c cVar, boolean z) {
            this.b = map;
            this.c = obj;
            this.f4528d = cVar;
            this.f4529e = z;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r7 = this;
                java.util.Map r0 = r7.b
                g.i.c.a.a.t.j.a(r0)
                java.util.Map r0 = r7.b
                g.i.c.a.a.r.e r1 = g.i.c.a.a.r.e.b.a
                g.i.c.a.a.c r2 = r1.f4498g
                if (r2 == 0) goto L_0x0010
                r2.a(r0)
            L_0x0010:
                java.lang.Object r0 = r7.c
                java.util.Map r2 = r7.b
                g.i.c.a.a.t.j.c(r0, r2)
                g.i.c.a.a.a r0 = r1.d()
                g.i.c.a.a.b0.d r0 = r0.p
                g.i.c.a.a.u.c r1 = r7.f4528d
                java.lang.String r2 = r1.a
                java.util.Map r3 = r7.b
                java.util.Map<java.lang.String, java.lang.Object> r1 = r1.c
                r4 = 0
                if (r1 != 0) goto L_0x002a
                r1 = r4
                goto L_0x0033
            L_0x002a:
                java.util.HashMap r1 = new java.util.HashMap
                g.i.c.a.a.u.c r5 = r7.f4528d
                java.util.Map<java.lang.String, java.lang.Object> r5 = r5.c
                r1.<init>(r5)
            L_0x0033:
                java.util.Map r0 = r0.a(r2, r3, r1)
                g.i.c.a.a.u.c r1 = r7.f4528d
                java.lang.String r1 = r1.a
                java.util.Set<java.lang.String> r2 = g.i.c.a.a.n.f.b.a
                if (r0 != 0) goto L_0x0041
                goto L_0x00b1
            L_0x0041:
                java.lang.String r2 = g.i.c.a.a.n.f.b.a(r0)
                boolean r3 = android.text.TextUtils.isEmpty(r2)
                if (r3 != 0) goto L_0x004e
                r4 = r2
                goto L_0x00b1
            L_0x004e:
                java.lang.String r2 = "udf_kv"
                java.lang.Object r2 = r0.get(r2)
                boolean r3 = r2 instanceof java.util.Map
                if (r3 != 0) goto L_0x0059
                goto L_0x00b1
            L_0x0059:
                java.lang.String r5 = g.i.c.a.a.n.f.b.a(r2)
                boolean r6 = android.text.TextUtils.isEmpty(r5)
                if (r6 == 0) goto L_0x00b0
                java.util.Set<java.lang.String> r6 = g.i.c.a.a.n.f.b.a
                boolean r1 = r6.contains(r1)
                if (r1 != 0) goto L_0x006c
                goto L_0x00b0
            L_0x006c:
                if (r3 == 0) goto L_0x0078
                r1 = r2
                java.util.Map r1 = (java.util.Map) r1
                java.lang.String r5 = "element_params"
                java.lang.Object r1 = r1.get(r5)
                goto L_0x0079
            L_0x0078:
                r1 = r4
            L_0x0079:
                boolean r5 = r1 instanceof java.util.List
                if (r5 != 0) goto L_0x007e
                goto L_0x0099
            L_0x007e:
                java.util.List r1 = (java.util.List) r1
                java.util.Iterator r1 = r1.iterator()
            L_0x0084:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L_0x0099
                java.lang.Object r5 = r1.next()
                java.lang.String r5 = g.i.c.a.a.n.f.b.a(r5)
                boolean r6 = android.text.TextUtils.isEmpty(r5)
                if (r6 != 0) goto L_0x0084
                goto L_0x009a
            L_0x0099:
                r5 = r4
            L_0x009a:
                boolean r1 = android.text.TextUtils.isEmpty(r5)
                if (r1 != 0) goto L_0x00a1
                goto L_0x00b0
            L_0x00a1:
                if (r3 == 0) goto L_0x00ab
                java.util.Map r2 = (java.util.Map) r2
                java.lang.String r1 = "cur_pg"
                java.lang.Object r4 = r2.get(r1)
            L_0x00ab:
                java.lang.String r4 = g.i.c.a.a.n.f.b.a(r4)
                goto L_0x00b1
            L_0x00b0:
                r4 = r5
            L_0x00b1:
                boolean r1 = r7.f4529e
                if (r1 != 0) goto L_0x00bc
                g.i.c.a.a.u.c r1 = r7.f4528d
                java.lang.String r1 = r1.a
                g.i.c.a.a.t.j.b(r4, r1, r0)
            L_0x00bc:
                g.i.c.a.a.r.e r1 = g.i.c.a.a.r.e.b.a
                java.util.Objects.requireNonNull(r1)
                boolean r1 = r7.f4529e
                if (r1 == 0) goto L_0x00fb
                g.i.c.a.a.u.c r1 = r7.f4528d
                java.lang.String r1 = r1.a
                g.i.c.a.a.w.e r2 = g.i.c.a.a.w.e.a.a
                java.lang.String r3 = g.i.c.a.a.w.f.a(r1, r0)
                if (r3 != 0) goto L_0x00ed
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "stashEvent, The event key: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r1 = "hasn't specified stashId, stash event is ignored!"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "EventStashManager"
                g.c.b.b.f.w0(r1, r0)
                goto L_0x0106
            L_0x00ed:
                g.i.c.a.a.w.g.a r5 = new g.i.c.a.a.w.g.a
                r5.<init>(r1, r0, r4)
                g.i.c.a.a.w.b r0 = new g.i.c.a.a.w.b
                r0.<init>(r2, r3, r5)
                g.i.c.a.a.y.a.a(r0)
                goto L_0x0106
            L_0x00fb:
                java.lang.Object r1 = r7.c
                g.i.c.a.a.u.c r2 = r7.f4528d
                java.lang.String r3 = r2.a
                g.i.c.a.a.j.a r2 = r2.b
                g.i.c.a.a.t.g.e(r1, r3, r2, r0, r4)
            L_0x0106:
                g.i.c.a.a.u.c r0 = r7.f4528d
                g.i.c.a.a.t.g.a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g.i.c.a.a.t.g.c.run():void");
        }
    }

    public interface d {
        void a(Object obj, g.i.c.a.a.u.c cVar, Map<String, Object> map);
    }

    public static class e implements e.b<d> {
        public Object a;
        public g.i.c.a.a.u.c b;
        public Map<String, Object> c;

        public e() {
        }

        public e(a aVar) {
        }

        public void a(Object obj) {
            ((d) obj).a(this.a, this.b, this.c);
        }
    }

    public static void a(g.i.c.a.a.u.c cVar) {
        cVar.a = null;
        cVar.b = null;
        cVar.c.clear();
        g.i.c.a.a.y.a.e(new h(cVar));
    }

    public static void b(Object obj, g.i.c.a.a.u.c cVar) {
        d(obj, cVar, false, false);
    }

    public static void c(Object obj, g.i.c.a.a.u.c cVar, String str) {
        HashMap hashMap = new HashMap();
        g.i.c.a.a.r.e eVar = e.b.a;
        Map<String, Object> map = eVar.f4497f;
        if (map != null) {
            hashMap.putAll(map);
        }
        g.i.c.a.a.c cVar2 = eVar.f4498g;
        if (cVar2 != null) {
            cVar2.c(hashMap);
        }
        a aVar = a.e.a;
        hashMap.put("usid", aVar.f4521l);
        hashMap.put("us_stmp", Long.valueOf(aVar.p));
        hashMap.put("ussn", Long.valueOf(aVar.f4522m));
        hashMap.put("coldstart", aVar.f4520k ? SLAConstant.TYPE_DEPRECATED_START : "0");
        PackageInfo d2 = f.d();
        hashMap.put("app_vr", d2 != null ? d2.versionName : "");
        PackageInfo d3 = f.d();
        hashMap.put("app_bld", Integer.valueOf(d3 != null ? d3.versionCode : -1));
        g.i.c.a.a.y.a.b(new b(hashMap, (Object) null, str, cVar), false);
    }

    public static void d(Object obj, g.i.c.a.a.u.c cVar, boolean z, boolean z2) {
        if (cVar != null) {
            HashMap hashMap = new HashMap();
            g.i.c.a.a.r.e eVar = e.b.a;
            Map<String, Object> map = eVar.f4497f;
            if (map != null) {
                hashMap.putAll(map);
            }
            g.i.c.a.a.c cVar2 = eVar.f4498g;
            if (cVar2 != null) {
                cVar2.c(hashMap);
            }
            a aVar = a.e.a;
            hashMap.put("usid", aVar.f4521l);
            hashMap.put("us_stmp", Long.valueOf(aVar.p));
            hashMap.put("ussn", Long.valueOf(aVar.f4522m));
            hashMap.put("coldstart", aVar.f4520k ? SLAConstant.TYPE_DEPRECATED_START : "0");
            PackageInfo d2 = f.d();
            hashMap.put("app_vr", d2 != null ? d2.versionName : "");
            PackageInfo d3 = f.d();
            hashMap.put("app_bld", Integer.valueOf(d3 != null ? d3.versionCode : -1));
            e eVar2 = b.get();
            eVar2.a = obj;
            eVar2.b = cVar;
            eVar2.c = hashMap;
            a.b(eVar2);
            eVar2.a = null;
            eVar2.b = null;
            eVar2.c = null;
            g.i.c.a.a.y.a.b(new c(hashMap, obj, cVar, z2), z);
        }
    }

    public static void e(Object obj, String str, g.i.c.a.a.j.a aVar, Map<String, Object> map, String str2) {
        String str3;
        g.i.c.a.a.j.a aVar2 = g.i.c.a.a.j.a.NORMAL;
        Map<String, String> map2 = e.a;
        if (map2.containsKey(str)) {
            str3 = map2.get(str);
        } else {
            g.c.b.b.f.K("DTReportHelper", "origin event key:" + str + " no need to transform");
            str3 = str;
        }
        HashMap hashMap = new HashMap();
        if (!e.e.i.b.G(map)) {
            for (Map.Entry next : map.entrySet()) {
                String str4 = (String) next.getKey();
                Object value = next.getValue();
                if (str4 != null) {
                    String str5 = "";
                    try {
                        if (value instanceof Map) {
                            str5 = new JSONObject((Map) value).toString();
                        } else if (value instanceof List) {
                            str5 = new JSONArray((List) value).toString();
                        } else if (value != null) {
                            str5 = String.valueOf(value);
                        }
                        hashMap.put(str4, str5);
                    } catch (Exception e2) {
                        g.c.b.b.f.x("DTReportHelper", e2.getLocalizedMessage());
                    }
                }
            }
        }
        if ("dt_act".equals(str3) || "dt_vst".equals(str3) || "dt_origin_vst".equals(str3) || "dt_appin".equals(str3) || "dt_appout".equals(str3)) {
            aVar2 = g.i.c.a.a.j.a.REALTIME;
        }
        g.i.c.a.a.j.a aVar3 = aVar == null ? aVar2 : aVar;
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap2.putAll(hashMap);
        if (map != null) {
            hashMap3.putAll(map);
        }
        g.i.c.a.a.j.d dVar = new g.i.c.a.a.j.d(obj, str3, hashMap2, hashMap3, aVar3, str2);
        for (g.i.c.a.a.j.c next2 : e.b.a.f4495d) {
            if (next2 != null) {
                next2.a(dVar);
            }
        }
        g.i.c.a.a.w.e eVar = e.a.a;
        String a2 = g.i.c.a.a.w.f.a(str, map);
        if (a2 != null) {
            g.i.c.a.a.y.a.a(new g.i.c.a.a.w.c(eVar, a2));
        }
    }
}
