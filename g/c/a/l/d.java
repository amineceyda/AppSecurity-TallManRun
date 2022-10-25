package g.c.a.l;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import com.apkpure.aegon.application.AegonApplication;
import com.apkpure.aegon.application.RealApplicationLike;
import com.google.gson.Gson;
import g.c.a.b.c.g;
import g.c.a.l.l.c0;
import g.c.a.l.l.d0;
import g.c.a.l.l.e0;
import g.c.a.l.l.o;
import g.c.b.b.f;
import g.c.c.k;
import g.e.c.e;
import i.c;
import i.j;
import i.o.b.l;
import i.o.c.h;
import i.o.c.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class d {
    public static final d a = new d();
    public static final Logger b = LoggerFactory.getLogger("Stuff|StuffApkHelper");
    public static final Handler c;

    /* renamed from: d  reason: collision with root package name */
    public static o f2041d;

    /* renamed from: e  reason: collision with root package name */
    public static d0 f2042e;

    /* renamed from: f  reason: collision with root package name */
    public static final List<e0> f2043f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public static final List<l<o, j>> f2044g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public static boolean f2045h;

    /* renamed from: i  reason: collision with root package name */
    public static boolean f2046i;

    /* renamed from: j  reason: collision with root package name */
    public static boolean f2047j;

    /* renamed from: k  reason: collision with root package name */
    public static boolean f2048k;

    /* renamed from: l  reason: collision with root package name */
    public static final c f2049l = f.U(b.b);

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            j.values();
            int[] iArr = new int[5];
            iArr[2] = 1;
            iArr[3] = 2;
            a = iArr;
        }
    }

    public static final class b extends i implements i.o.b.a<Gson> {
        public static final b b = new b();

        public b() {
            super(0);
        }

        public Object a() {
            e eVar = new e();
            eVar.b();
            eVar.c = g.e.c.c.LOWER_CASE_WITH_UNDERSCORES;
            return eVar.a();
        }
    }

    static {
        Looper myLooper = Looper.myLooper();
        h.c(myLooper);
        c = new Handler(myLooper);
    }

    public final void b() {
        o h2 = h();
        f2041d = h2;
        if (h2 != null) {
            Context context = AegonApplication.getContext();
            h.d(context, "getContext()");
            if (e(context)) {
                g.c(g.c.a.b.c.f.MICRO_DOWNLOAD_FAST);
            }
        }
    }

    public final boolean c() {
        int i2;
        Context context = AegonApplication.getContext();
        if (context == null) {
            return true;
        }
        c0 f2 = f(context);
        if (f2 == null || f2041d == null) {
            return false;
        }
        String a2 = f2.a();
        o oVar = f2041d;
        h.c(oVar);
        if (!h.a(a2, oVar.g())) {
            d(context);
            return false;
        }
        try {
            i2 = Integer.parseInt(f2.b());
        } catch (Exception unused) {
            i2 = 0;
        }
        o oVar2 = f2041d;
        h.c(oVar2);
        if (oVar2.k() > 0) {
            o oVar3 = f2041d;
            h.c(oVar3);
            if (i2 < oVar3.k()) {
                d(context);
                return false;
            }
        }
        return f2.c();
    }

    public final void d(Context context) {
        h.e(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("micro_download_config", 0);
        h.d(sharedPreferences, "context.getSharedPreferences(\n                PREFERENCE_NAME_MICRO_DOWNLOAD_CONFIG,\n                Context.MODE_PRIVATE)");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.remove("micro_download_state_key");
        edit.apply();
    }

    public final boolean e(Context context) {
        h.e(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("micro_download_config", 0);
        h.d(sharedPreferences, "context.getSharedPreferences(\n                PREFERENCE_NAME_MICRO_DOWNLOAD_CONFIG,\n                Context.MODE_PRIVATE)");
        return sharedPreferences.getBoolean("is_first_show_pop_key", true);
    }

    public final c0 f(Context context) {
        h.e(context, "context");
        boolean z = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences("micro_download_config", 0);
        h.d(sharedPreferences, "context.getSharedPreferences(\n                PREFERENCE_NAME_MICRO_DOWNLOAD_CONFIG,\n                Context.MODE_PRIVATE)");
        String string = sharedPreferences.getString("micro_download_state_key", (String) null);
        if (string == null) {
            return null;
        }
        b.info(h.j("获取状态： ", string));
        h.e(string, "jsonString");
        if (string.length() == 0) {
            z = true;
        }
        if (z) {
            return null;
        }
        return (c0) g.c.a.e.k.h.b.b(string, c0.class);
    }

    public final void g(l<? super o, j> lVar) {
        h.e(lVar, "callBack");
        if (f2046i) {
            b.debug("Is finish parser call back now.");
            lVar.g(f2041d);
            return;
        }
        b.debug("Add parser listener now.");
        List<l<o, j>> list = f2044g;
        synchronized (list) {
            if (!list.contains(lVar)) {
                list.add(lVar);
            }
        }
        if (!f2045h) {
            f2045h = true;
            e.e.i.b.D().a(b.b);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final g.c.a.l.l.o h() {
        /*
            r17 = this;
            g.c.a.l.i r1 = g.c.a.l.i.a
            r2 = 10
            r3 = 104(0x68, float:1.46E-43)
            r4 = 0
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            r7 = 4
            g.c.a.l.i.b(r1, r2, r3, r4, r5, r6, r7)
            android.content.Context r0 = com.apkpure.aegon.application.AegonApplication.getContext()
            r1 = 0
            if (r0 != 0) goto L_0x001c
            org.slf4j.Logger r0 = b
            java.lang.String r2 = "Get XApk info context is null."
            goto L_0x0176
        L_0x001c:
            g.c.a.l.m.a$a r2 = g.c.a.l.m.a.c
            g.c.a.l.m.a r2 = r2.a()
            java.lang.String r3 = "install-app"
            java.lang.String r4 = "context"
            i.o.c.h.e(r0, r4)
            java.lang.String r4 = "action"
            i.o.c.h.e(r3, r4)
            java.util.List<java.lang.String> r4 = r2.b
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x003d
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r4 = 0
            goto L_0x003e
        L_0x003d:
            r4 = 1
        L_0x003e:
            java.lang.String r7 = "Get uri by action["
            if (r4 == 0) goto L_0x009b
            java.lang.String r0 = r2.a(r0)
            int r4 = r0.length()
            if (r4 != 0) goto L_0x004e
            r4 = 1
            goto L_0x004f
        L_0x004e:
            r4 = 0
        L_0x004f:
            if (r4 == 0) goto L_0x005b
            org.slf4j.Logger r0 = g.c.a.l.m.a.f2078d
            java.lang.StringBuilder r2 = g.a.a.a.a.l(r7, r3)
            java.lang.String r3 = "] comment is null."
            goto L_0x00f2
        L_0x005b:
            int r4 = r0.length()
            if (r4 != 0) goto L_0x0063
            r4 = 1
            goto L_0x0064
        L_0x0063:
            r4 = 0
        L_0x0064:
            if (r4 == 0) goto L_0x0073
            org.slf4j.Logger r0 = g.c.a.l.m.a.f2078d
            java.lang.String r4 = "Parser uri list from comment,comment is null or empty"
            r0.info(r4)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto L_0x0099
        L_0x0073:
            g.c.a.e.k.h.a r4 = new g.c.a.e.k.h.a     // Catch:{ Exception -> 0x008c }
            r4.<init>()     // Catch:{ Exception -> 0x008c }
            java.lang.reflect.Type r4 = r4.b     // Catch:{ Exception -> 0x008c }
            com.google.gson.Gson r8 = g.c.a.e.k.h.b.a()     // Catch:{ Exception -> 0x0083 }
            java.lang.Object r0 = r8.e(r0, r4)     // Catch:{ Exception -> 0x0083 }
            goto L_0x0084
        L_0x0083:
            r0 = r1
        L_0x0084:
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x008c }
            java.lang.String r4 = "{\n            JsonUtils.stringListFromJson(comment)\n        }"
            i.o.c.h.d(r0, r4)     // Catch:{ Exception -> 0x008c }
            goto L_0x0099
        L_0x008c:
            r0 = move-exception
            org.slf4j.Logger r4 = g.c.a.l.m.a.f2078d
            java.lang.String r8 = "Parser uri list from comment exception"
            r4.warn((java.lang.String) r8, (java.lang.Throwable) r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0099:
            r2.b = r0
        L_0x009b:
            java.util.List<java.lang.String> r0 = r2.b
            if (r0 == 0) goto L_0x00a8
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00a6
            goto L_0x00a8
        L_0x00a6:
            r0 = 0
            goto L_0x00a9
        L_0x00a8:
            r0 = 1
        L_0x00a9:
            if (r0 == 0) goto L_0x00b4
            org.slf4j.Logger r0 = g.c.a.l.m.a.f2078d
            java.lang.StringBuilder r2 = g.a.a.a.a.l(r7, r3)
            java.lang.String r3 = "] instructionList is null."
            goto L_0x00f2
        L_0x00b4:
            java.util.List<java.lang.String> r0 = r2.b
            if (r0 != 0) goto L_0x00ba
            r2 = r1
            goto L_0x00dc
        L_0x00ba:
            java.util.Iterator r0 = r0.iterator()
        L_0x00be:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00d9
            java.lang.Object r2 = r0.next()
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r8 = "apkpure://"
            java.lang.String r8 = i.o.c.h.j(r8, r3)
            r9 = 2
            boolean r4 = i.t.e.m(r4, r8, r5, r9)
            if (r4 == 0) goto L_0x00be
            goto L_0x00da
        L_0x00d9:
            r2 = r1
        L_0x00da:
            java.lang.String r2 = (java.lang.String) r2
        L_0x00dc:
            if (r2 == 0) goto L_0x00e7
            int r0 = r2.length()
            if (r0 != 0) goto L_0x00e5
            goto L_0x00e7
        L_0x00e5:
            r0 = 0
            goto L_0x00e8
        L_0x00e7:
            r0 = 1
        L_0x00e8:
            if (r0 == 0) goto L_0x00fe
            org.slf4j.Logger r0 = g.c.a.l.m.a.f2078d
            java.lang.StringBuilder r2 = g.a.a.a.a.l(r7, r3)
            java.lang.String r3 = "] uri is null."
        L_0x00f2:
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.info(r2)
            r2 = r1
            goto L_0x0103
        L_0x00fe:
            android.net.Uri r0 = android.net.Uri.parse(r2)
            r2 = r0
        L_0x0103:
            if (r2 != 0) goto L_0x010a
            org.slf4j.Logger r0 = b
            java.lang.String r2 = "Get XApk info uri is null."
            goto L_0x0176
        L_0x010a:
            org.slf4j.Logger r0 = b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Get XApk info uri["
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = "]."
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.debug(r3)
            java.lang.String r3 = "app_digest"
            java.lang.String r3 = r2.getQueryParameter(r3)
            if (r3 == 0) goto L_0x0133
            int r4 = r3.length()
            if (r4 != 0) goto L_0x0134
        L_0x0133:
            r5 = 1
        L_0x0134:
            if (r5 == 0) goto L_0x0139
            java.lang.String r2 = "Get XApk info, app digest is null."
            goto L_0x0176
        L_0x0139:
            i.c r0 = f2049l     // Catch:{ Exception -> 0x014b }
            java.lang.Object r0 = r0.getValue()     // Catch:{ Exception -> 0x014b }
            com.google.gson.Gson r0 = (com.google.gson.Gson) r0     // Catch:{ Exception -> 0x014b }
            java.lang.Class<g.c.a.l.l.o> r4 = g.c.a.l.l.o.class
            java.lang.Object r0 = r0.d(r3, r4)     // Catch:{ Exception -> 0x014b }
            g.c.a.l.l.o r0 = (g.c.a.l.l.o) r0     // Catch:{ Exception -> 0x014b }
            r4 = r0
            goto L_0x015c
        L_0x014b:
            r0 = move-exception
            org.slf4j.Logger r4 = b
            java.lang.String r0 = r0.getMessage()
            java.lang.String r5 = "Get XApk info from stuff uri exception."
            java.lang.String r0 = i.o.c.h.j(r5, r0)
            r4.warn(r0)
            r4 = r1
        L_0x015c:
            if (r4 != 0) goto L_0x017d
            org.slf4j.Logger r0 = b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Get XApk info from stuff uri is null. appDigest["
            r2.append(r4)
            r2.append(r3)
            r3 = 93
            r2.append(r3)
            java.lang.String r2 = r2.toString()
        L_0x0176:
            r0.info(r2)
            r0 = r1
            r1 = r17
            goto L_0x01d8
        L_0x017d:
            r4.f2074h = r6
            g.c.a.l.j r0 = g.c.a.l.j.DOWNLOAD
            java.lang.String r1 = "<set-?>"
            i.o.c.h.e(r0, r1)
            r4.b = r0
            java.lang.String r1 = ""
            java.lang.String r0 = "report_context"
            java.lang.String r2 = r2.getQueryParameter(r0)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x01ab }
            r0.<init>(r2)     // Catch:{ Exception -> 0x01ab }
            java.lang.String r3 = "fast_download_id"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ Exception -> 0x01ab }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x01ab }
            java.lang.String r5 = "fast_download_type"
            java.lang.Object r0 = r0.get(r5)     // Catch:{ Exception -> 0x01a9 }
            r0.toString()     // Catch:{ Exception -> 0x01a9 }
            goto L_0x01b4
        L_0x01a9:
            r0 = move-exception
            goto L_0x01ad
        L_0x01ab:
            r0 = move-exception
            r3 = r1
        L_0x01ad:
            org.slf4j.Logger r5 = b
            java.lang.String r6 = "Parser download id exception:"
            r5.warn((java.lang.String) r6, (java.lang.Throwable) r0)
        L_0x01b4:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x01c4 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x01c4 }
            java.lang.String r2 = "recommend_id"
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x01c4 }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x01c4 }
            goto L_0x01cc
        L_0x01c4:
            r0 = move-exception
            org.slf4j.Logger r2 = b
            java.lang.String r5 = "Parser recommend id exception:"
            r2.warn((java.lang.String) r5, (java.lang.Throwable) r0)
        L_0x01cc:
            r4.n(r3)
            r4.o(r1)
            r1 = r17
            g.c.a.l.l.o r0 = r1.l(r4)
        L_0x01d8:
            if (r0 == 0) goto L_0x01f0
            r2 = 10
            r0.c = r2
            g.c.a.l.i r3 = g.c.a.l.i.a
            r4 = 10
            r5 = 105(0x69, float:1.47E-43)
            r6 = 0
            java.lang.String r7 = r0.g()
            r9 = 4
            java.lang.String r8 = ""
            g.c.a.l.i.b(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0200
        L_0x01f0:
            g.c.a.l.i r10 = g.c.a.l.i.a
            r11 = 10
            r12 = 106(0x6a, float:1.49E-43)
            r13 = 0
            r16 = 4
            java.lang.String r14 = ""
            java.lang.String r15 = ""
            g.c.a.l.i.b(r10, r11, r12, r13, r14, r15, r16)
        L_0x0200:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a.l.d.h():g.c.a.l.l.o");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void i(g.c.a.l.l.o r31) {
        /*
            r30 = this;
            r0 = r31
            if (r0 != 0) goto L_0x0009
            org.slf4j.Logger r1 = b
            java.lang.String r2 = "Report install status, apkDescription is null."
            goto L_0x003d
        L_0x0009:
            int r1 = r0.c
            r2 = 21
            if (r1 == r2) goto L_0x002d
            r2 = 61
            if (r1 != r2) goto L_0x0014
            goto L_0x002d
        L_0x0014:
            g.c.a.l.i r3 = g.c.a.l.i.a
            java.lang.String r1 = "apkDescription"
            i.o.c.h.e(r0, r1)
            int r4 = r0.c
            int r5 = r0.f2071e
            r6 = 0
            java.lang.String r7 = r31.g()
            java.lang.String r8 = r31.b()
            r9 = 4
            g.c.a.l.i.b(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0040
        L_0x002d:
            org.slf4j.Logger r1 = b
            java.lang.String r2 = "Report install status["
            java.lang.StringBuilder r2 = g.a.a.a.a.i(r2)
            int r3 = r0.c
            java.lang.String r4 = "]."
            java.lang.String r2 = g.a.a.a.a.e(r2, r3, r4)
        L_0x003d:
            r1.debug(r2)
        L_0x0040:
            java.util.List<g.c.a.l.l.e0> r1 = f2043f
            monitor-enter(r1)
            if (r0 != 0) goto L_0x0077
            g.c.a.l.l.o r0 = new g.c.a.l.l.o     // Catch:{ all -> 0x00b0 }
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 33554431(0x1ffffff, float:9.403954E-38)
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x00b0 }
            r2 = 11
            r0.c = r2     // Catch:{ all -> 0x00b0 }
        L_0x0077:
            r2 = r0
            java.util.Iterator r3 = r1.iterator()     // Catch:{ all -> 0x00b0 }
        L_0x007c:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x00ae
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x00b0 }
            g.c.a.l.l.e0 r0 = (g.c.a.l.l.e0) r0     // Catch:{ all -> 0x00b0 }
            r0.a(r2)     // Catch:{ Exception -> 0x008c }
            goto L_0x007c
        L_0x008c:
            r0 = move-exception
            r4 = r0
            org.slf4j.Logger r0 = b     // Catch:{ all -> 0x00b0 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b0 }
            r5.<init>()     // Catch:{ all -> 0x00b0 }
            java.lang.String r6 = "Remove onApkListener listener exception["
            r5.append(r6)     // Catch:{ all -> 0x00b0 }
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x00b0 }
            r5.append(r4)     // Catch:{ all -> 0x00b0 }
            java.lang.String r4 = "]."
            r5.append(r4)     // Catch:{ all -> 0x00b0 }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x00b0 }
            r0.warn(r4)     // Catch:{ all -> 0x00b0 }
            goto L_0x007c
        L_0x00ae:
            monitor-exit(r1)
            return
        L_0x00b0:
            r0 = move-exception
            monitor-exit(r1)
            goto L_0x00b4
        L_0x00b3:
            throw r0
        L_0x00b4:
            goto L_0x00b3
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a.l.d.i(g.c.a.l.l.o):void");
    }

    public final void j(o oVar) {
        f2046i = true;
        List<l<o, j>> list = f2044g;
        synchronized (list) {
            Logger logger = b;
            StringBuilder sb = new StringBuilder();
            sb.append("Notify on parser listeners size[");
            sb.append(list == null ? null : Integer.valueOf(list.size()));
            sb.append("].");
            logger.debug(sb.toString());
            for (l aVar : list) {
                c.post(new a(aVar, oVar));
            }
            f2044g.clear();
        }
    }

    public final void k() {
        Logger logger = b;
        logger.info("微下载任务执行成功,或者不存在微下载任务, 开始拉取全量包地址进行套壳升级.");
        f2048k = true;
        if (!(!TextUtils.isEmpty(g.c.c.n.f.b))) {
            logger.info("微下载任务执行完成时, 全量包没有下载完成.");
            Logger logger2 = g.c.c.l.a;
            HashMap hashMap = new HashMap();
            e.e.d.l.a.j0(hashMap, "apk_download_id", g.c.c.l.c);
            g.c.c.l.a.debug("上报: 微下载执行完成时,全量包还未下载完成");
            g.c.a.e.h.b.d.f("LiteStuffSuccAndDownloading", hashMap);
            return;
        }
        String str = "";
        logger.info("开始安装全量包. path: {}", (Object) TextUtils.isEmpty(g.c.c.n.f.b) ^ true ? g.c.c.n.f.b : str);
        k a2 = k.a();
        Context context = RealApplicationLike.getContext();
        if (true ^ TextUtils.isEmpty(g.c.c.n.f.b)) {
            str = g.c.c.n.f.b;
        }
        a2.c(context, str);
    }

    public final o l(o oVar) {
        Boolean bool;
        if (oVar != null) {
            String e2 = oVar.e();
            if (e2 == null) {
                bool = null;
            } else {
                bool = Boolean.valueOf(e2.length() == 0);
            }
            if (!bool.booleanValue()) {
                try {
                    byte[] decode = Base64.decode(oVar.e(), 0);
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                    oVar.f2070d = decodeByteArray;
                    if (decodeByteArray != null) {
                        b.info("Parser bitmap from iconBase64 bitmap is null.");
                    }
                } catch (Exception e3) {
                    b.info(h.j("Parser bitmap from iconBase64 exception: ", e3.getMessage()));
                }
                return oVar;
            }
        }
        b.info("Parser bitmap from iconBase64 is null.");
        return oVar;
    }

    public final boolean m() {
        d0 d0Var = f2042e;
        if (d0Var == null) {
            b.info("Re install after granted store permission, apkManager is null.");
            return false;
        }
        h.c(d0Var);
        return d0Var.i();
    }

    public final void n(Context context, c0 c0Var) {
        h.e(context, "context");
        h.e(c0Var, "state");
        b.info(h.j("保存状态： ", c0Var.f()));
        SharedPreferences sharedPreferences = context.getSharedPreferences("micro_download_config", 0);
        h.d(sharedPreferences, "context.getSharedPreferences(\n                PREFERENCE_NAME_MICRO_DOWNLOAD_CONFIG,\n                Context.MODE_PRIVATE)");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("micro_download_state_key", c0Var.f());
        edit.apply();
        if (c0Var.c()) {
            k();
        }
    }
}
