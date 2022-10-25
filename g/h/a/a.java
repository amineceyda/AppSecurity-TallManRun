package g.h.a;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.tencent.raft.codegenmeta.utils.Constants;
import com.tencent.raft.raftframework.remote.RemoteProxyUtil;
import com.tencent.raft.raftframework.sla.SLAConstant;
import g.c.b.b.f;
import g.i.b.e.c;
import g.i.b.e.e.a;
import g.i.c.a.a.b0.n;
import g.i.c.a.a.b0.p;
import g.i.c.a.a.i.b;
import g.i.c.a.a.l.g;
import g.i.c.a.a.n.e.d.b;
import g.i.c.a.a.n.e.d.d;
import g.i.c.a.a.n.e.d.e;
import g.i.c.a.a.n.e.d.m;
import g.i.c.a.a.r.e;
import g.i.c.a.a.s.t;
import g.i.c.a.a.z.b;
import i.o.c.h;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import k.r;
import org.json.JSONObject;

public final class a {
    public static String a;
    public static volatile d b;
    public static volatile b c;

    /* renamed from: d  reason: collision with root package name */
    public static volatile m f4024d;

    /* renamed from: e  reason: collision with root package name */
    public static volatile e f4025e;

    /* renamed from: f  reason: collision with root package name */
    public static volatile e f4026f;

    /* renamed from: g  reason: collision with root package name */
    public static volatile String f4027g;

    /* renamed from: h  reason: collision with root package name */
    public static WeakReference<Activity> f4028h;

    public static Object A(g.i.c.a.a.l.b bVar, String str) {
        Map<String, Object> map;
        if (bVar == null || TextUtils.isEmpty(str) || (map = bVar.f4461k) == null) {
            return null;
        }
        return map.get(str);
    }

    public static String B(Context context, String str) {
        return g.a.a.a.a.f(g.a.a.a.a.i(context.getDir("proc", 0).getPath()), File.separator, str);
    }

    public static Object C(g.i.c.a.a.l.b bVar, String str) {
        Map<String, Object> map;
        if (bVar == null || (map = bVar.f4459i) == null) {
            return null;
        }
        return map.get(str);
    }

    public static String D(Map<String, Object> map) {
        try {
            return new JSONObject(map).toString();
        } catch (Throwable th) {
            f.x("JsonUtils", "getJsonFromMap " + th);
            return "";
        }
    }

    public static Map<String, Object> E() {
        if (TextUtils.isEmpty("last_app_heart_beat_map")) {
            return null;
        }
        String str = (String) e.e.i.b.n(g.i.c.a.a.b0.f.c(), (String) null, "last_app_heart_beat_map", "");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return F(str);
    }

    public static Map<String, Object> F(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            HashMap hashMap = new HashMap();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.get(next));
            }
            return hashMap;
        } catch (Throwable th) {
            f.x("JsonUtils", "getMapForJson " + th);
            return null;
        }
    }

    public static String G(g.i.c.a.a.l.b bVar) {
        if (bVar == null) {
            return null;
        }
        return bVar.f4456f;
    }

    public static Object H(Object obj, View view) {
        Object u;
        if (obj != null) {
            return obj;
        }
        if (view == null || (u = t.b.a.u(view.getRootView())) == null) {
            return null;
        }
        return u;
    }

    public static String I(Object obj, View view, String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            str = "";
            if (view != null) {
                str = view.hashCode() + str;
            }
        }
        if (z) {
            str = g.a.a.a.a.w("identifier_scroll", str);
        }
        return obj.hashCode() + str;
    }

    public static String J(int i2, Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put("code", Integer.valueOf(i2));
        hashMap.put(RemoteProxyUtil.KEY_RESULT, obj);
        return new JSONObject(hashMap).toString();
    }

    public static Activity K() {
        WeakReference<Activity> weakReference = f4028h;
        Activity activity = null;
        Activity activity2 = weakReference != null ? (Activity) weakReference.get() : null;
        if (activity2 != null) {
            return activity2;
        }
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke((Object) null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            Iterator it = ((Map) declaredField.get(invoke)).values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Class<?> cls2 = next.getClass();
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(next)) {
                    Field declaredField3 = cls2.getDeclaredField("activity");
                    declaredField3.setAccessible(true);
                    activity = (Activity) declaredField3.get(next);
                    break;
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return activity;
    }

    public static void L(Object obj, String str) {
        if (obj instanceof WebView) {
            ((WebView) obj).loadUrl(str);
        } else if (obj instanceof com.tencent.smtt.sdk.WebView) {
            ((com.tencent.smtt.sdk.WebView) obj).loadUrl(str);
        }
    }

    public static void M(Fragment fragment) {
        if (e.b.a.a) {
            StringBuilder i2 = g.a.a.a.a.i("onDestroyView: fragment = ");
            i2.append(fragment.getClass().getName());
            f.K("FragmentCollector", i2.toString());
        }
        b.C0166b.a.d(u(fragment));
    }

    public static void N(Object obj, String str) {
        if (obj instanceof WebView) {
            ((WebView) obj).evaluateJavascript(str, (ValueCallback) null);
        } else if (obj instanceof com.tencent.smtt.sdk.WebView) {
            ((com.tencent.smtt.sdk.WebView) obj).evaluateJavascript(str, (com.tencent.smtt.sdk.ValueCallback) null);
        }
    }

    public static void O(Fragment fragment, View view) {
        g.i.c.a.a.r.e eVar = e.b.a;
        if (eVar.i()) {
            if (eVar.a) {
                StringBuilder i2 = g.a.a.a.a.i("onFragmentViewCreated: fragment = ");
                i2.append(fragment.getClass().getName());
                i2.append(", view = ");
                i2.append(n.b(view));
                f.K("FragmentCollector", i2.toString());
            }
            t.b.a.t(view, fragment);
        }
    }

    public static void P(Fragment fragment, boolean z) {
        if (e.b.a.a) {
            StringBuilder i2 = g.a.a.a.a.i("onHiddenChanged: fragment = ");
            i2.append(fragment.getClass().getName());
            i2.append(", hidden = ");
            i2.append(z);
            f.K("FragmentCollector", i2.toString());
        }
        if (z) {
            b.C0166b.a.e(u(fragment));
        } else {
            b.C0166b.a.f(u(fragment));
        }
    }

    public static void Q(Fragment fragment) {
        if (e.b.a.a) {
            StringBuilder i2 = g.a.a.a.a.i("onPause: fragment = ");
            i2.append(fragment.getClass().getName());
            f.K("FragmentCollector", i2.toString());
        }
        b.C0166b.a.e(u(fragment));
    }

    public static void R(Fragment fragment) {
        if (e.b.a.a) {
            StringBuilder i2 = g.a.a.a.a.i("onResume: fragment = ");
            i2.append(fragment.getClass().getName());
            f.K("FragmentCollector", i2.toString());
        }
        b.C0166b.a.f(u(fragment));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Class<?>[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void S(org.json.JSONArray r2, java.lang.Class<?>[] r3, java.lang.Object[] r4, java.lang.String r5, int r6) throws org.json.JSONException {
        /*
            java.lang.String r0 = "string"
            boolean r0 = r0.equals(r5)
            r1 = 0
            if (r0 == 0) goto L_0x001b
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r3[r6] = r5
            boolean r3 = r2.isNull(r6)
            if (r3 == 0) goto L_0x0014
            goto L_0x0018
        L_0x0014:
            java.lang.String r1 = r2.getString(r6)
        L_0x0018:
            r4[r6] = r1
            goto L_0x0071
        L_0x001b:
            java.lang.String r0 = "number"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0032
            java.lang.Class r5 = java.lang.Integer.TYPE
            r3[r6] = r5
            int r2 = r2.getInt(r6)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4[r6] = r2
            goto L_0x0071
        L_0x0032:
            java.lang.String r0 = "boolean"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0049
            java.lang.Class r5 = java.lang.Boolean.TYPE
            r3[r6] = r5
            boolean r2 = r2.getBoolean(r6)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r4[r6] = r2
            goto L_0x0071
        L_0x0049:
            java.lang.String r0 = "object"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x0071
            boolean r5 = r2.isNull(r6)
            if (r5 == 0) goto L_0x0058
            goto L_0x005c
        L_0x0058:
            java.lang.String r1 = r2.getString(r6)
        L_0x005c:
            r4[r6] = r1
            r2 = r4[r6]
            if (r2 == 0) goto L_0x006d
            org.json.JSONObject r2 = new org.json.JSONObject
            r5 = r4[r6]
            java.lang.String r5 = (java.lang.String) r5
            r2.<init>(r5)
            r4[r6] = r2
        L_0x006d:
            java.lang.Class<org.json.JSONObject> r2 = org.json.JSONObject.class
            r3[r6] = r2
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.h.a.a.S(org.json.JSONArray, java.lang.Class[], java.lang.Object[], java.lang.String, int):void");
    }

    public static boolean T(String str) {
        return !str.equals("GET") && !str.equals("HEAD");
    }

    public static void U(Object obj, View view, String str, g.i.c.a.a.t.k.a aVar, boolean z) {
        Object H = H(obj, view);
        if (H != null) {
            x(H).put(I(H, view, str, z), aVar);
        }
    }

    public static void V(g.i.c.a.a.l.b bVar, String str, Object obj) {
        if (bVar != null && !TextUtils.isEmpty(str)) {
            if (bVar.f4459i == null) {
                bVar.f4459i = new HashMap(1);
            }
            bVar.f4459i.put(str, obj);
        }
    }

    public static String W(r rVar) {
        String e2 = rVar.e();
        String g2 = rVar.g();
        if (g2 == null) {
            return e2;
        }
        return e2 + '?' + g2;
    }

    public static synchronized void X(String str, String str2) {
        synchronized (a.class) {
            Map E = E();
            if (E == null) {
                E = new HashMap();
            }
            if (!TextUtils.isEmpty(str2)) {
                E.put(str, str2);
            } else if (E.containsKey(str)) {
                E.remove(str);
            } else {
                return;
            }
            Y(E);
        }
    }

    public static synchronized void Y(Map<String, Object> map) {
        synchronized (a.class) {
            if (!TextUtils.isEmpty("last_app_heart_beat_map")) {
                e.e.i.b.L(g.i.c.a.a.b0.f.c(), (String) null, "last_app_heart_beat_map", D(map));
            }
        }
    }

    public static void Z(Fragment fragment, boolean z) {
        if (e.b.a.a) {
            StringBuilder i2 = g.a.a.a.a.i("setUserVisibleHint: fragment = ");
            i2.append(fragment.getClass().getName());
            i2.append(", isVisible = ");
            i2.append(z);
            f.K("FragmentCollector", i2.toString());
        }
        if (z) {
            b.C0166b.a.f(u(fragment));
        } else {
            b.C0166b.a.e(u(fragment));
        }
    }

    public static int a(String str, int i2) {
        int b2 = b("report_all_events", -1, 1, 1);
        if (b2 == 1) {
            return 1;
        }
        if (b2 == -1) {
            return 0;
        }
        return p(str, i2);
    }

    public static void a0(Activity activity, String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle("提示").setMessage(str).setCancelable(false).setPositiveButton("确定", new g.i.c.a.a.v.a(activity));
        AlertDialog create = builder.create();
        try {
            create.getButton(-1).setTextColor(-65536);
            create.getButton(-1).setBackgroundColor(-1);
        } catch (Exception e2) {
            StringBuilder i2 = g.a.a.a.a.i("showDialog exception: ");
            i2.append(e2.getLocalizedMessage());
            f.x("Visual.SchemeRouterHelper", i2.toString());
        }
        create.show();
    }

    public static int b(String str, int i2, int i3, int i4) {
        int i5;
        try {
            String e2 = e(str, c.f4126h);
            if (TextUtils.isEmpty(e2)) {
                e2 = e(str, 0);
            }
            g.i.b.e.h.b.a("halley-cloud-SettingsQuerier", "querySetting " + str + Constants.KEY_INDEX_FILE_SEPARATOR + e2);
            i5 = Integer.parseInt(e2);
        } catch (Throwable unused) {
            i5 = i4;
        }
        return g.i.b.e.h.e.a(i5, i2, i3, i4);
    }

    public static final int b0(Context context, float f2) {
        h.f(context, "receiver$0");
        Resources resources = context.getResources();
        h.b(resources, "resources");
        return (int) (f2 * resources.getDisplayMetrics().scaledDensity);
    }

    public static int c(String str, int i2, int i3, Map<String, String> map) {
        String str2;
        boolean z;
        if (i2 == 2) {
            return k(str, i3);
        }
        if ("HLHttpDirect".equals(str) && map != null && "event".equals(map.get("B15"))) {
            return k(str, i3);
        }
        int i4 = 100;
        if ("HLConnEvent".equals(str)) {
            String str3 = i3 == 0 ? "report_conn_succ_denominator_value" : m(i3) ? "report_conn_nonet_fail_denominator_value" : "report_conn_other_fail_denominator_value";
            if (i3 != 0 && !m(i3)) {
                i4 = 1;
            }
            return a(str3, i4);
        } else if ("HLSecurityEvent".equals(str)) {
            String str4 = i3 == 0 ? "report_security_req_succ_denominator_value" : "report_security_req_fail_denominator_value";
            if (i3 != 0) {
                i4 = 1;
            }
            return a(str4, i4);
        } else if ("HLDisconnEvent".equals(str)) {
            return a("report_disconn_denominator_value", 2);
        } else {
            boolean z2 = false;
            if ("HLReqRspEvent".equals(str) || "HLHttpAgent".equals(str) || "HLHttpDirect".equals(str)) {
                if (i3 == 0 && map != null) {
                    if (i2 == c.f4126h) {
                        if (!g.i.b.e.g.a.a || (!"HLReqRspEvent".equals(str) && !"HLHttpAgent".equals(str))) {
                            z = false;
                        } else {
                            g.i.b.e.g.a.a = false;
                            z = true;
                        }
                        if (g.i.b.e.g.a.b && "HLHttpDirect".equals(str)) {
                            String str5 = map.get("B15");
                            if (!g.i.b.e.h.e.e(str5) && str5.equals("app")) {
                                g.i.b.e.g.a.b = false;
                                z2 = true;
                            }
                        }
                        z2 = z;
                    }
                    if (z2) {
                        map.put("B28", SLAConstant.TYPE_DEPRECATED_START);
                        str2 = "report_req_ssl_first_denominator_value";
                        return a(str2, i4);
                    }
                }
                str2 = i3 == 0 ? "report_req_succ_denominator_value" : m(i3) ? "report_req_nonet_fail_denominator_value" : "report_req_other_fail_denominator_value";
                if (i3 != 0 && !m(i3)) {
                    i4 = 1;
                }
                return a(str2, i4);
            } else if ("HLPushEvent".equals(str)) {
                return a("report_push_denominator_value", 10);
            } else {
                if ("B_DLSDK_Result".equals(str)) {
                    return a("report_mass_download_denominator_value", 1);
                }
                if ("HLDownTiny".equals(str)) {
                    return a("report_ease_download_denominator_value", 10);
                }
                if (!"HLMsgClickEvent".equals(str) && !"HLMsgProcessEvent".equals(str) && !"HLMsgDispatchEvent".equals(str)) {
                    return 0;
                }
                return a(i3 == 0 ? "report_msg_push_succ_denominator_value" : "report_msg_push_fail_denominator_value", 1);
            }
        }
    }

    public static Handler d(String str) {
        HandlerThread handlerThread = new HandlerThread(l(str), 10);
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String e(java.lang.String r8, int r9) {
        /*
            g.i.b.e.f.c.a.b r0 = g.i.b.e.f.c.a.b.a()
            java.lang.String r1 = g.i.b.e.b.e.f4111f
            java.util.Objects.requireNonNull(r0)
            boolean r2 = g.i.b.e.h.e.e(r1)
            if (r2 != 0) goto L_0x0030
            java.lang.String r2 = "unknown"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0018
            goto L_0x0030
        L_0x0018:
            java.util.Map<java.lang.String, java.lang.String> r2 = r0.a
            monitor-enter(r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.a     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x002d }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x002d }
            boolean r1 = g.i.b.e.h.e.e(r0)     // Catch:{ all -> 0x002d }
            if (r1 != 0) goto L_0x002b
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            goto L_0x0032
        L_0x002b:
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            goto L_0x0030
        L_0x002d:
            r8 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            throw r8
        L_0x0030:
            java.lang.String r0 = ""
        L_0x0032:
            r6 = r0
            int r0 = g.i.b.e.b.e.f4112g
            r1 = 2
            if (r0 != r1) goto L_0x003c
            java.lang.String r0 = "2g"
        L_0x003a:
            r7 = r0
            goto L_0x0051
        L_0x003c:
            r1 = 3
            if (r0 != r1) goto L_0x0042
            java.lang.String r0 = "3g"
            goto L_0x003a
        L_0x0042:
            r1 = 4
            if (r0 != r1) goto L_0x0048
            java.lang.String r0 = "4g"
            goto L_0x003a
        L_0x0048:
            r1 = 1
            if (r0 != r1) goto L_0x004e
            java.lang.String r0 = "wifi"
            goto L_0x003a
        L_0x004e:
            java.lang.String r0 = ""
            goto L_0x003a
        L_0x0051:
            g.i.b.e.f.i r0 = g.i.b.e.f.i.e()
            java.util.Map<java.lang.String, g.i.b.e.f.a.b> r0 = r0.b
            java.lang.String r1 = "settings"
            java.lang.Object r0 = r0.get(r1)
            r1 = r0
            g.i.b.e.f.g r1 = (g.i.b.e.f.g) r1
            java.lang.String r4 = g.i.b.e.c.f4128j
            java.lang.String r5 = g.i.b.e.c.a
            r2 = r8
            r3 = r9
            java.lang.String r8 = r1.a(r2, r3, r4, r5, r6, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g.h.a.a.e(java.lang.String, int):java.lang.String");
    }

    public static String f(Throwable th) {
        return th.getClass().getName() + Constants.KEY_INDEX_FILE_SEPARATOR + th.getMessage();
    }

    public static boolean g(int i2) {
        return i2 > 0 && i2 <= Integer.MAX_VALUE && new Random().nextInt(i2) == 0;
    }

    public static boolean h(File file) {
        if (!file.exists()) {
            return false;
        }
        File file2 = new File(file.getAbsolutePath() + "_" + System.currentTimeMillis());
        return file.renameTo(file2) ? file2.delete() : file.delete();
    }

    public static boolean i(Exception exc) {
        String message;
        if (exc == null || !(exc instanceof IOException) || (message = exc.getMessage()) == null) {
            return false;
        }
        return message.contains("ENOSPC") || message.contains("No space left on device");
    }

    public static boolean j(String str, boolean z, Map<String, String> map, boolean z2) {
        g.i.b.e.h.b.c("UserActionWrapper", "onUserAction...eventName:" + str + " ,map:");
        for (String next : map.keySet()) {
            StringBuilder l2 = g.a.a.a.a.l(next, Constants.KEY_INDEX_FILE_SEPARATOR);
            l2.append(map.get(next));
            g.i.b.e.h.b.c("UserActionWrapper", l2.toString());
        }
        try {
            if (g.i.b.e.e.d.s == null) {
                synchronized (g.i.b.e.e.d.class) {
                    if (g.i.b.e.e.d.s == null) {
                        g.i.b.e.e.d.s = new g.i.b.e.e.d();
                    }
                }
            }
            g.i.b.e.e.d dVar = g.i.b.e.e.d.s;
            String c2 = g.i.b.e.e.d.c(str, z, map);
            try {
                int andIncrement = dVar.f4162i.getAndIncrement();
                String str2 = dVar.a;
                g.i.b.e.h.b.f(str2, "upload:" + c2 + " newCount:" + andIncrement);
                if (andIncrement > dVar.f4163j) {
                    g.i.b.e.h.b.c(dVar.a, "queue in halleyReportThread is full, abandon report data");
                    dVar.f4162i.decrementAndGet();
                    return true;
                }
                new a.e(c2, z2).a(false);
                return true;
            } catch (Throwable th) {
                th.printStackTrace();
                return true;
            }
        } catch (Throwable th2) {
            try {
                th2.printStackTrace();
                return true;
            } catch (Throwable th3) {
                th3.printStackTrace();
                return false;
            }
        }
    }

    public static int k(String str, int i2) {
        if (str.equals("HLDisconnEvent")) {
            return -2;
        }
        return p((i2 == 0 || m(i2)) ? "self_report_succ_denominator_value" : "self_report_fail_denominator_value", (i2 == 0 || m(i2)) ? 100 : 2);
    }

    public static String l(String str) {
        return "halley_" + c.f4126h + "_" + str;
    }

    public static boolean m(int i2) {
        return i2 == -4 || i2 == -3 || i2 == -288;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r1 = r1.getMessage();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean n(java.lang.Exception r1) {
        /*
            if (r1 == 0) goto L_0x0016
            boolean r0 = r1 instanceof java.io.IOException
            if (r0 == 0) goto L_0x0016
            java.lang.String r1 = r1.getMessage()
            if (r1 == 0) goto L_0x0016
            java.lang.String r0 = "Read-only file system"
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L_0x0016
            r1 = 1
            return r1
        L_0x0016:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g.h.a.a.n(java.lang.Exception):boolean");
    }

    public static boolean o(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] split = str.split("\\.");
        if (split.length != 4) {
            return false;
        }
        int length = split.length;
        int i2 = 0;
        while (i2 < length) {
            try {
                int parseInt = Integer.parseInt(split[i2]);
                if (parseInt >= 0 && parseInt <= 255) {
                    i2++;
                }
            } catch (NumberFormatException unused) {
            }
            return false;
        }
        return true;
    }

    public static int p(String str, int i2) {
        int b2 = b(str, 0, Integer.MAX_VALUE, i2);
        g.i.b.e.h.b.c("halley-cloud-SamplingUtils", "getReportDenominatorValue for key:" + str + ",default:" + i2 + ",denominator:" + b2);
        return b2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = r1.getMessage();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean q(java.lang.Exception r1) {
        /*
            if (r1 == 0) goto L_0x0012
            java.lang.String r1 = r1.getMessage()
            if (r1 == 0) goto L_0x0012
            java.lang.String r0 = "Permission denied"
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L_0x0012
            r1 = 1
            return r1
        L_0x0012:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g.h.a.a.q(java.lang.Exception):boolean");
    }

    /* JADX WARNING: type inference failed for: r9v8, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean r(java.lang.String r9) {
        /*
            java.lang.String r0 = "::"
            boolean r1 = r9.contains(r0)
            r2 = 0
            if (r1 == 0) goto L_0x0014
            int r3 = r9.indexOf(r0)
            int r4 = r9.lastIndexOf(r0)
            if (r3 == r4) goto L_0x0014
            return r2
        L_0x0014:
            java.lang.String r3 = ":"
            boolean r4 = r9.startsWith(r3)
            if (r4 == 0) goto L_0x0022
            boolean r4 = r9.startsWith(r0)
            if (r4 == 0) goto L_0x002e
        L_0x0022:
            boolean r4 = r9.endsWith(r3)
            if (r4 == 0) goto L_0x002f
            boolean r4 = r9.endsWith(r0)
            if (r4 != 0) goto L_0x002f
        L_0x002e:
            return r2
        L_0x002f:
            java.lang.String[] r3 = r9.split(r3)
            if (r1 == 0) goto L_0x0066
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.List r3 = java.util.Arrays.asList(r3)
            r4.<init>(r3)
            boolean r3 = r9.endsWith(r0)
            if (r3 == 0) goto L_0x004a
            java.lang.String r9 = ""
            r4.add(r9)
            goto L_0x0059
        L_0x004a:
            boolean r9 = r9.startsWith(r0)
            if (r9 == 0) goto L_0x0059
            boolean r9 = r4.isEmpty()
            if (r9 != 0) goto L_0x0059
            r4.remove(r2)
        L_0x0059:
            int r9 = r4.size()
            java.lang.String[] r9 = new java.lang.String[r9]
            java.lang.Object[] r9 = r4.toArray(r9)
            r3 = r9
            java.lang.String[] r3 = (java.lang.String[]) r3
        L_0x0066:
            int r9 = r3.length
            r0 = 8
            if (r9 <= r0) goto L_0x006c
            return r2
        L_0x006c:
            r9 = 0
            r4 = 0
            r5 = 0
        L_0x006f:
            int r6 = r3.length
            r7 = 1
            if (r9 >= r6) goto L_0x00b7
            r6 = r3[r9]
            int r8 = r6.length()
            if (r8 != 0) goto L_0x007f
            int r5 = r5 + r7
            if (r5 <= r7) goto L_0x00ad
            goto L_0x00bf
        L_0x007f:
            int r5 = r3.length
            int r5 = r5 - r7
            if (r9 != r5) goto L_0x0096
            java.lang.String r5 = "."
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L_0x0096
            boolean r5 = o(r6)
            if (r5 != 0) goto L_0x0092
            goto L_0x00bf
        L_0x0092:
            int r4 = r4 + 2
            r5 = 0
            goto L_0x00af
        L_0x0096:
            int r5 = r6.length()
            r7 = 4
            if (r5 <= r7) goto L_0x009e
            goto L_0x00bf
        L_0x009e:
            r5 = 16
            int r5 = java.lang.Integer.parseInt(r6, r5)     // Catch:{ NumberFormatException -> 0x00b2 }
            if (r5 < 0) goto L_0x00bf
            r6 = 65535(0xffff, float:9.1834E-41)
            if (r5 <= r6) goto L_0x00ac
            goto L_0x00bf
        L_0x00ac:
            r5 = 0
        L_0x00ad:
            int r4 = r4 + 1
        L_0x00af:
            int r9 = r9 + 1
            goto L_0x006f
        L_0x00b2:
            r9 = move-exception
            r9.printStackTrace()
            goto L_0x00bf
        L_0x00b7:
            if (r4 > r0) goto L_0x00bf
            if (r4 >= r0) goto L_0x00be
            if (r1 != 0) goto L_0x00be
            goto L_0x00bf
        L_0x00be:
            r2 = 1
        L_0x00bf:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g.h.a.a.r(java.lang.String):boolean");
    }

    public static boolean s(g.i.c.a.a.l.b bVar) {
        if (bVar == null) {
            return false;
        }
        return !TextUtils.isEmpty(y(bVar));
    }

    public static <T extends g.i.c.a.a.o.c> void t(View view, boolean z, g.i.c.a.a.o.e<T> eVar, g.i.c.a.a.a0.b bVar) {
        if (view != null && bVar != null) {
            g.i.c.a.a.r.e eVar2 = e.b.a;
            if (eVar2.a) {
                Map<String, b.C0188b> map = g.i.c.a.a.z.b.a;
                g.i.c.a.a.z.b.a("detect").c = System.nanoTime();
            }
            T c2 = eVar.c();
            g.i.c.a.a.o.a aVar = c2.f4487d.get(0);
            if (view.getGlobalVisibleRect(aVar.a)) {
                Rect rect = aVar.a;
                aVar.c = rect;
                aVar.b = rect;
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    aVar.f4484d = viewGroup.getScrollX();
                    aVar.f4485e = viewGroup.getScrollY();
                    aVar.f4486f = p.a.a(viewGroup);
                }
                ((g.i.c.a.a.a0.f) bVar).d(view, 1, new g.i.c.a.a.o.d(c2, eVar, z));
                if (eVar2.a) {
                    Map<String, b.C0188b> map2 = g.i.c.a.a.z.b.a;
                    long nanoTime = System.nanoTime();
                    b.C0188b a2 = g.i.c.a.a.z.b.a("detect");
                    long j2 = a2.c;
                    long j3 = -1;
                    if (j2 != -1) {
                        a2.a++;
                        long j4 = nanoTime - j2;
                        a2.b += j4;
                        a2.c = -1;
                        j3 = j4;
                    }
                    StringBuilder i2 = g.a.a.a.a.i("detect: ");
                    i2.append(j3 / 1000);
                    i2.append(" us cost, ");
                    i2.append(c2.a);
                    i2.append(" views detected");
                    f.w("ExposureDetector", i2.toString());
                }
            }
        }
    }

    public static g.i.c.a.a.q.c.a u(Fragment fragment) {
        g.i.c.a.a.q.c.a aVar = new g.i.c.a.a.q.c.a();
        aVar.b = fragment.getActivity();
        aVar.a = fragment.getView();
        return aVar;
    }

    public static String v(g.i.c.a.a.l.b bVar) {
        if (bVar == null) {
            return null;
        }
        return bVar.f4457g;
    }

    public static g.i.c.a.a.t.k.a w(Object obj, View view, String str, boolean z) {
        Object H = H(obj, view);
        if (H == null) {
            return null;
        }
        Object obj2 = x(H).get(I(H, view, str, z));
        if (obj2 instanceof g.i.c.a.a.t.k.a) {
            return (g.i.c.a.a.t.k.a) obj2;
        }
        return null;
    }

    public static Map<String, Object> x(Object obj) {
        Object e2 = g.i.c.a.a.l.c.e(obj, "element_exposure_map");
        if (e2 instanceof Map) {
            return (Map) e2;
        }
        HashMap hashMap = new HashMap();
        g.i.c.a.a.l.c.j(obj, "element_exposure_map", hashMap);
        return hashMap;
    }

    public static String y(g.i.c.a.a.l.b bVar) {
        if (bVar == null) {
            return null;
        }
        return bVar.a;
    }

    public static Map<String, ?> z(g.i.c.a.a.l.b bVar) {
        Map<String, Object> map = null;
        if (bVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (!e.e.i.b.G(bVar.b)) {
            hashMap.putAll(bVar.b);
        }
        g gVar = bVar.c;
        if (gVar != null) {
            map = gVar.a();
        }
        if (!e.e.i.b.G(map)) {
            hashMap.putAll(map);
        }
        return hashMap;
    }
}
