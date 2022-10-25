package g.c.a.e.h.b;

import android.content.Context;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import e.b.g.c;
import e.e.i.b;
import g.c.a.g.b.a;
import g.c.b.b.f;
import g.i.c.a.a.r.e;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class d {
    public static final Logger a = LoggerFactory.getLogger("DTReportApiLog");

    public static Map<String, Object> a(String str, Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        boolean z = true;
        if (!TextUtils.isEmpty(str)) {
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -2064893046:
                    if (str.equals("AppClickToDownload")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1757328807:
                    if (str.equals("AppClickToInstall")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1375587957:
                    if (str.equals("AppSuccDownload")) {
                        c = 2;
                        break;
                    }
                    break;
                case -777038884:
                    if (str.equals("AppFailInstall")) {
                        c = 3;
                        break;
                    }
                    break;
                case -755135602:
                    if (str.equals("AppClickToCancelCollect")) {
                        c = 4;
                        break;
                    }
                    break;
                case -211966327:
                    if (str.equals("AppStartDownload")) {
                        c = 5;
                        break;
                    }
                    break;
                case 219622473:
                    if (str.equals("AppDownloadConnectionSucc")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1451495480:
                    if (str.equals("AppSuccInstall")) {
                        c = 7;
                        break;
                    }
                    break;
                case 1513843008:
                    if (str.equals("AppCancelInstall")) {
                        c = 8;
                        break;
                    }
                    break;
                case 1528163639:
                    if (str.equals("AppClickToPreRegist")) {
                        c = 9;
                        break;
                    }
                    break;
                case 1529513448:
                    if (str.equals("AppClickToCollect")) {
                        c = 10;
                        break;
                    }
                    break;
                case 1904673658:
                    if (str.equals("AppStartInstall")) {
                        c = 11;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    break;
            }
        }
        z = false;
        if (z) {
            map.put("report_element", "app");
        }
        return map;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x00bf, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x00c4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b() {
        /*
            g.c.a.e.h.b.b r0 = new g.c.a.e.h.b.b
            r0.<init>()
            g.i.c.a.a.n.a$b r1 = new g.i.c.a.a.n.a$b
            r1.<init>(r0)
            r0 = 0
            r1.f4464d = r0
            g.i.c.a.a.a$a r2 = r1.c
            r2.f4401g = r0
            r2 = 1
            r1.f4465e = r2
            g.c.a.e.h.b.f r3 = new g.c.a.e.h.b.f
            r3.<init>()
            java.util.List<g.i.c.a.a.j.c> r4 = r1.b
            r4.add(r3)
            g.i.c.a.a.k.a r3 = g.i.c.a.a.k.a.REPORT_ALL
            g.i.c.a.a.a$a r4 = r1.c
            r4.b = r3
            g.i.c.a.a.k.c r3 = g.i.c.a.a.k.c.REPORT_FIRST
            r4.c = r3
            g.i.c.a.a.k.b r3 = g.i.c.a.a.k.b.REPORT_NONE
            r4.f4398d = r3
            r3 = 60
            r4.f4404j = r3
            r5 = 5
            r4.f4405k = r5
            r4.f4402h = r3
            r4.f4403i = r5
            g.i.c.a.a.n.a r3 = new g.i.c.a.a.n.a
            r4 = 0
            r3.<init>(r1, r4)
            android.app.Application r1 = com.apkpure.aegon.application.RealApplicationLike.getApplication()
            g.i.c.a.a.r.e r5 = g.i.c.a.a.r.e.b.a
            g.i.c.a.a.k.d r6 = g.i.c.a.a.k.d.INIT_ALL
            java.util.Objects.requireNonNull(r5)
            java.lang.String r7 = "VideoReportInner.startWithComponent"
            g.i.c.a.a.z.a.a(r7)
            g.i.c.a.a.a r3 = r3.a()
            r5.t(r1, r3, r6)
            g.i.c.a.a.z.a.b(r7)
            java.util.Objects.requireNonNull(r5)
            g.i.c.a.a.m.d.a(r0)
            java.util.Objects.requireNonNull(r5)
            g.i.c.a.a.n.b.a r1 = g.i.c.a.a.n.d.a.a
            r1.a(r2)
            java.lang.String r1 = g.c.a.b.c.g.a()
            java.lang.String r3 = "create_via"
            l(r3, r1)
            java.lang.String r1 = g.c.a.b.c.g.a()
            java.lang.String r3 = "active_source"
            l(r3, r1)
            java.lang.String r1 = g.c.a.b.c.g.b()
            java.lang.String r5 = "event_app_version"
            l(r5, r1)
            boolean r1 = g.c.a.e.k.d.a.b()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r5 = "harmony_os"
            l(r5, r1)
            java.lang.String r1 = g.c.a.e.k.d.a.b
            java.lang.String r5 = ""
            if (r1 == 0) goto L_0x0096
        L_0x0093:
            java.lang.String r1 = g.c.a.e.k.d.a.b
            goto L_0x00c8
        L_0x0096:
            boolean r1 = g.c.a.e.k.d.a.b()
            if (r1 != 0) goto L_0x009d
            goto L_0x00c4
        L_0x009d:
            java.lang.String r1 = "hw_sc.build.platform.version"
            java.lang.String r6 = "android.os.SystemProperties"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ all -> 0x00c2 }
            java.lang.String r7 = "get"
            java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch:{ all -> 0x00c2 }
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r8[r0] = r9     // Catch:{ all -> 0x00c2 }
            java.lang.reflect.Method r7 = r6.getDeclaredMethod(r7, r8)     // Catch:{ all -> 0x00c2 }
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x00c2 }
            r8[r0] = r1     // Catch:{ all -> 0x00c2 }
            java.lang.Object r1 = r7.invoke(r6, r8)     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00c2 }
            boolean r6 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00c2 }
            if (r6 == 0) goto L_0x00c5
            goto L_0x00c4
        L_0x00c2:
            org.slf4j.Logger r1 = g.c.a.e.e.a.a
        L_0x00c4:
            r1 = r5
        L_0x00c5:
            g.c.a.e.k.d.a.b = r1
            goto L_0x0093
        L_0x00c8:
            java.lang.String r6 = "harmony_os_version"
            l(r6, r1)
            boolean r1 = g.c.a.e.k.d.a.b()
            if (r1 != 0) goto L_0x00d4
            goto L_0x00e8
        L_0x00d4:
            android.app.Application r1 = com.apkpure.aegon.application.AegonApplication.getApplication()     // Catch:{ Exception -> 0x00e6 }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r6 = "pure_mode_state"
            int r1 = android.provider.Settings.Secure.getInt(r1, r6, r0)     // Catch:{ Exception -> 0x00e6 }
            if (r1 != 0) goto L_0x00e8
            r1 = 1
            goto L_0x00e9
        L_0x00e6:
            org.slf4j.Logger r1 = g.c.a.e.e.a.a
        L_0x00e8:
            r1 = 0
        L_0x00e9:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r6 = "is_pure_mode"
            l(r6, r1)
            g.c.a.e.h.b.g.a r1 = g.c.a.e.h.b.g.a.STATUS_LOGOUT
            java.lang.String r6 = r1.a()
            java.lang.String r7 = "login_type"
            l(r7, r6)
            java.lang.String r6 = r1.a()
            java.lang.String r7 = "userid"
            l(r7, r6)
            java.lang.String r1 = r1.a()
            java.lang.String r6 = "login_state"
            l(r6, r1)
            android.app.Application r1 = com.apkpure.aegon.application.AegonApplication.getApplication()
            android.content.ContentResolver r1 = r1.getContentResolver()
            java.lang.String r6 = "android_id"
            java.lang.String r1 = android.provider.Settings.Secure.getString(r1, r6)
            l(r6, r1)
            g.c.a.e.h.a.h r1 = g.c.a.e.h.a.h.a()
            java.lang.String r6 = r1.c
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x012f
            java.lang.String r1 = r1.c
            goto L_0x0159
        L_0x012f:
            g.c.a.e.i.b.a$b r6 = g.c.a.e.i.b.a.c
            g.c.a.e.i.b.a r7 = r6.d()
            android.content.SharedPreferences r7 = r7.b
            if (r7 != 0) goto L_0x0140
            g.c.a.e.i.b.a r7 = r6.d()
            r7.a()
        L_0x0140:
            g.c.a.e.i.b.a r6 = r6.d()
            android.content.SharedPreferences r6 = r6.b
            if (r6 != 0) goto L_0x0149
            goto L_0x014f
        L_0x0149:
            java.lang.String r4 = "key_oaid_cache"
            java.lang.String r4 = r6.getString(r4, r5)
        L_0x014f:
            org.slf4j.Logger r5 = g.c.a.e.h.a.h.f1985d
            java.lang.String r6 = "从 Setting 获取 oaid: {}"
            r5.info((java.lang.String) r6, (java.lang.Object) r4)
            r1.c = r4
            r1 = r4
        L_0x0159:
            java.lang.String r4 = "oaid"
            l(r4, r1)
            java.lang.String r1 = g.c.a.b.c.g.a()
            l(r3, r1)
            java.lang.String r1 = g.c.a.b.c.g.c
            java.lang.String r3 = "is_lite_package"
            l(r3, r1)
            android.content.Context r1 = com.apkpure.aegon.application.RealApplicationLike.getContext()
            java.lang.String r3 = "com.android.vending"
            boolean r3 = g.c.a.e.k.a.f.a(r1, r3)
            java.lang.String r4 = "com.google.android.gms"
            boolean r4 = g.c.a.e.k.a.f.a(r1, r4)
            java.lang.String r5 = "com.google.android.gsf"
            boolean r1 = g.c.a.e.k.a.f.a(r1, r5)
            org.slf4j.Logger r5 = a
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            r6[r0] = r7
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r6[r2] = r0
            r0 = 2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            r6[r0] = r2
            java.lang.String r0 = "install_vending: {} ,install_gms:{} ,install_gsf:{} "
            r5.info((java.lang.String) r0, (java.lang.Object[]) r6)
            java.lang.String r0 = "1"
            java.lang.String r2 = "0"
            if (r3 == 0) goto L_0x01a7
            r3 = r0
            goto L_0x01a8
        L_0x01a7:
            r3 = r2
        L_0x01a8:
            java.lang.String r5 = "is_install_vending"
            l(r5, r3)
            if (r4 == 0) goto L_0x01b1
            r3 = r0
            goto L_0x01b2
        L_0x01b1:
            r3 = r2
        L_0x01b2:
            java.lang.String r4 = "is_install_gms"
            l(r4, r3)
            if (r1 == 0) goto L_0x01ba
            goto L_0x01bb
        L_0x01ba:
            r0 = r2
        L_0x01bb:
            java.lang.String r1 = "is_install_gsf"
            l(r1, r0)
            java.lang.String r0 = "gaid"
            java.lang.String r1 = "default"
            l(r0, r1)
            g.c.a.e.j.b r0 = e.e.i.b.D()
            g.c.a.e.h.b.c r1 = new g.c.a.e.h.b.c
            r1.<init>()
            android.app.Application r2 = com.apkpure.aegon.application.AegonApplication.getApplication()
            r3 = 2131821518(0x7f1103ce, float:1.9275781E38)
            r2.getString(r3)
            r0.a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a.e.h.b.d.b():void");
    }

    public static Map<String, Object> c(Context context, Map<String, Object> map) {
        a aVar;
        if (map == null) {
            map = new HashMap<>();
        }
        if (context instanceof c) {
            context = ((c) context).getBaseContext();
        } else if (!(context instanceof a) && (context instanceof ContextThemeWrapper)) {
            context = ((ContextThemeWrapper) context).getBaseContext();
        }
        if (!(context instanceof a) || (aVar = ((a) context).p) == null) {
            return map;
        }
        map.put("source_scene", Long.valueOf(aVar.sourceScene));
        map.put("source_position", aVar.sourcePosition);
        map.put("source_small_position", aVar.sourceSmallPosition);
        map.put("source_model_type", Integer.valueOf(aVar.sourceModelType));
        map.put("source_module_name", aVar.sourceModuleName);
        return map;
    }

    public static void d(View view) {
        if (view != null) {
            e("imp", view, c(view.getContext(), (Map<String, Object>) null));
        }
    }

    public static void e(String str, Object obj, Map<String, Object> map) {
        Logger logger = e.a;
        b.N(str, obj, a(str, map));
    }

    public static void f(String str, Map<String, Object> map) {
        Logger logger = e.a;
        try {
            b.N(str, (Object) null, a(str, map));
        } catch (ConcurrentModificationException e2) {
            a.warn("自定义事件上报异常: {}", (Object) e2.getMessage(), (Object) e2);
        }
    }

    public static void g(View view, String str, Map<String, Object> map) {
        Logger logger = e.a;
        h(view, str, false);
        i(view, map);
    }

    public static void h(View view, String str, boolean z) {
        g.i.c.a.a.k.b bVar = g.i.c.a.a.k.b.REPORT_ALL;
        Logger logger = e.a;
        if (view != null) {
            e eVar = e.b.a;
            if (eVar.a) {
                f.K("VideoReportInner", "setElementId: object=" + view + ", elementId=" + str);
            }
            if (eVar.a(view)) {
                g.i.c.a.a.l.c.h(view, str);
            }
            b.Q(view, g.i.c.a.a.k.c.REPORT_FIRST, "element_expose_policy");
            if ((TextUtils.isEmpty(str) || !str.equals("scene")) && !z) {
                bVar = g.i.c.a.a.k.b.REPORT_NONE;
            }
            b.Q(view, bVar, "element_end_expose_policy");
            HashMap hashMap = new HashMap();
            hashMap.put("report_element", str);
            i(view, c(view.getContext(), hashMap));
        }
    }

    public static void i(Object obj, Map<String, Object> map) {
        Logger logger = e.a;
        e eVar = e.b.a;
        if (eVar.a) {
            f.K("VideoReportInner", "setElementParams: object=" + obj + ", map=" + map);
        }
        if (eVar.a(obj)) {
            g.i.c.a.a.l.c.i(obj, map);
        }
    }

    public static void j(Object obj, String str, String str2, HashMap<String, Object> hashMap) {
        Logger logger = e.a;
        e eVar = e.b.a;
        if (eVar.a) {
            f.K("VideoReportInner", "setPageId: object=" + obj + ", pageId=" + str);
        }
        g.i.c.a.a.r.a aVar = new g.i.c.a.a.r.a(eVar, obj, str);
        AtomicInteger atomicInteger = g.i.c.a.a.y.a.a;
        if (g.i.c.a.a.y.a.c()) {
            aVar.run();
        } else {
            g.i.c.a.a.y.a.e(aVar);
        }
        eVar.s(obj, str2, false);
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        hashMap.put("report_element", "page");
        k(obj, str2, hashMap);
    }

    public static void k(Object obj, String str, HashMap<String, Object> hashMap) {
        Logger logger = e.a;
        e eVar = e.b.a;
        if (eVar.a) {
            f.K("VideoReportInner", "setPageParams: object=" + obj + ", key=" + str + ", value=" + hashMap);
        }
        g.i.c.a.a.r.b bVar = new g.i.c.a.a.r.b(eVar, obj, str, hashMap);
        AtomicInteger atomicInteger = g.i.c.a.a.y.a.a;
        if (g.i.c.a.a.y.a.c()) {
            bVar.run();
        } else {
            g.i.c.a.a.y.a.e(bVar);
        }
    }

    public static void l(String str, Object obj) {
        Logger logger = e.a;
        e eVar = e.b.a;
        if (eVar.a) {
            f.K("VideoReportInner", "setPublicParam: key=" + str + ", value=" + obj);
        }
        if (!TextUtils.isEmpty(str)) {
            if (eVar.f4497f == null) {
                eVar.f4497f = new HashMap(1);
            }
            eVar.f4497f.put(str, obj);
        }
    }
}
