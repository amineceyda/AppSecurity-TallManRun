package g.c.b.b.l;

import android.content.Context;
import android.os.Build;
import g.c.b.b.c;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class e {
    public static final Logger a = LoggerFactory.getLogger("InstallerUtilsLog");

    public static String a(Context context) {
        return b() ? g.a(context).a.getString("xapk_apk_path", "") : "";
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT > 29;
    }

    public static int c(Context context) {
        return g.a(context).a.getInt("install_source_flag", 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0042, code lost:
        r5 = r4.f2286k;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(android.content.Context r3, boolean r4, java.lang.String r5) {
        /*
            boolean r0 = b()
            if (r0 == 0) goto L_0x0071
            org.slf4j.Logger r0 = a
            java.lang.String r1 = "InstallerHelper recordInstallingPath {}"
            r0.debug((java.lang.String) r1, (java.lang.Object) r5)
            g.c.b.b.l.g r1 = g.c.b.b.l.g.a(r3)
            android.content.SharedPreferences r1 = r1.a
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r2 = "xapk_apk_path"
            android.content.SharedPreferences$Editor r1 = r1.putString(r2, r5)
            r1.apply()
            if (r4 == 0) goto L_0x003a
            java.lang.String r4 = "InstallerHelper seek  path {}"
            r0.debug((java.lang.String) r4, (java.lang.Object) r5)
            g.c.b.b.l.g r4 = g.c.b.b.l.g.a(r3)
            android.content.SharedPreferences r4 = r4.a
            android.content.SharedPreferences$Editor r4 = r4.edit()
            java.lang.String r1 = "xapk_seekable"
            android.content.SharedPreferences$Editor r4 = r4.putString(r1, r5)
            r4.apply()
        L_0x003a:
            g.c.b.b.c r4 = g.c.b.b.c.d()
            g.c.b.b.j.b r4 = r4.f2228e
            if (r4 == 0) goto L_0x0057
            java.util.Map<java.lang.String, java.lang.String> r5 = r4.f2286k
            if (r5 == 0) goto L_0x0057
            java.lang.String r1 = "stat_info"
            java.lang.Object r5 = r5.get(r1)
            if (r5 == 0) goto L_0x0057
            java.util.Map<java.lang.String, java.lang.String> r4 = r4.f2286k
            java.lang.Object r4 = r4.get(r1)
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0059
        L_0x0057:
            java.lang.String r4 = ""
        L_0x0059:
            java.lang.String r5 = "InstallerHelper 存入上报信息: {}"
            r0.info((java.lang.String) r5, (java.lang.Object) r4)
            g.c.b.b.l.g r3 = g.c.b.b.l.g.a(r3)
            android.content.SharedPreferences r3 = r3.a
            android.content.SharedPreferences$Editor r3 = r3.edit()
            java.lang.String r5 = "dt_stat_info_str"
            android.content.SharedPreferences$Editor r3 = r3.putString(r5, r4)
            r3.apply()
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.b.b.l.e.d(android.content.Context, boolean, java.lang.String):void");
    }

    public static void e(Context context) {
        g.a(context).a.edit().putInt("latest_install_source_flag", c(context)).apply();
        g a2 = g.a(context);
        a2.a.edit().putInt("install_source_flag", c.d().f2230g.ordinal()).apply();
        a.info("更新安装来源为, 本次真实: {}, 本次记录: {}, 上次: {}", Integer.valueOf(c.d().f2230g.ordinal()), Integer.valueOf(c(context)), Integer.valueOf(g.a(context).a.getInt("latest_install_source_flag", 0)));
    }

    public static void f(Context context, boolean z) {
        if (b()) {
            a.debug("InstallerHelper removeInstallingPath");
            g.a(context).a.edit().remove("xapk_apk_path").apply();
        }
        if (b()) {
            a.debug("InstallerHelper removeDtStatInfoStr");
            g.a(context).a.edit().remove("dt_stat_info_str").apply();
        }
        if (z && b()) {
            a.debug("InstallerHelper removeSeekInstallPath");
            g.a(context).a.edit().remove("xapk_seekable").apply();
        }
    }

    public static void g(Context context) {
        a.debug("InstallerHelper removeInstallSourceOrdinal");
        g.a(context).a.edit().remove("install_source_flag").apply();
    }

    public static String h(Context context) {
        return b() ? g.a(context).a.getString("xapk_seekable", "") : "";
    }
}
