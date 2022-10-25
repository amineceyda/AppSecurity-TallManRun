package com.tencent.beacon.module;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.SparseArray;
import com.tencent.beacon.a.a.d;
import com.tencent.beacon.a.c.e;
import com.tencent.beacon.a.c.g;
import com.tencent.beacon.base.util.b;
import com.tencent.beacon.base.util.c;
import g.a.a.a.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.slf4j.Marker;

public class AuditModule implements BeaconModule, d {
    private boolean a = true;
    private boolean b = true;
    private String c;

    /* renamed from: d  reason: collision with root package name */
    private Set<String> f746d;

    /* renamed from: e  reason: collision with root package name */
    private int f747e = 2;

    /* renamed from: f  reason: collision with root package name */
    private Context f748f;

    public static String a() {
        ArrayList<String> a2 = b.a(new String[]{"/system/bin/sh", "-c", "getprop ro.build.fingerprint"});
        return (a2 == null || a2.size() <= 0) ? "" : a2.get(0);
    }

    private String a(String str) {
        if (str == null) {
            return "";
        }
        String replace = str.replace("=", "%3D").replace("/", "%2F").replace(Marker.ANY_NON_NULL_MARKER, "%2B");
        return replace.length() > 1024 ? a.w(replace, ";") : replace;
    }

    @SuppressLint({"NewApi"})
    public static String b(Context context) {
        try {
            if (Integer.parseInt(Build.VERSION.SDK) < 9) {
                c.b("[audit] Api level < 9,return null!", new Object[0]);
                return "";
            }
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            StringBuilder sb = new StringBuilder();
            sb.append("[audit] get app_first_installed_time:");
            sb.append(String.valueOf(packageInfo.firstInstallTime));
            c.a(sb.toString(), new Object[0]);
            return String.valueOf(packageInfo.firstInstallTime);
        } catch (Throwable th) {
            c.a(th);
            return "";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String c() {
        /*
            r1 = this;
            com.tencent.beacon.e.b r0 = com.tencent.beacon.e.b.a()
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r1.c
            if (r0 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            java.lang.String r0 = ""
        L_0x000d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.beacon.module.AuditModule.c():java.lang.String");
    }

    private Activity d() {
        SparseArray<WeakReference<Activity>> a2;
        if (Integer.valueOf(Build.VERSION.SDK).intValue() < 16) {
            return null;
        }
        try {
            String e2 = e();
            if (e2 == null || (a2 = com.tencent.beacon.d.a.c.a()) == null) {
                return null;
            }
            for (int i2 = 0; i2 < a2.size(); i2++) {
                WeakReference weakReference = a2.get(a2.keyAt(i2));
                if (!(weakReference == null || weakReference.get() == null)) {
                    Activity activity = (Activity) weakReference.get();
                    if (activity.getClass().getName().equals(e2)) {
                        return activity;
                    }
                }
            }
            return null;
        } catch (Exception e3) {
            c.a((Throwable) e3);
        }
    }

    private String e() {
        Intent launchIntentForPackage = this.f748f.getPackageManager().getLaunchIntentForPackage(this.f748f.getPackageName());
        if (launchIntentForPackage != null) {
            return launchIntentForPackage.getComponent().getClassName();
        }
        return null;
    }

    public void a(Context context) {
        this.f748f = context;
        com.tencent.beacon.a.a.b.a().a(2, this);
        com.tencent.beacon.a.a.b.a().a(10, this);
    }

    public void a(com.tencent.beacon.a.a.c cVar) {
        boolean z;
        int i2 = cVar.a;
        boolean z2 = false;
        if (i2 == 2) {
            Map map = (Map) cVar.b.get("d_m");
            if (map != null) {
                this.a = b.a((String) map.get("upAc"), this.a);
                this.f747e = b.a((String) map.get("deleteSoCrashTime"), this.f747e, 1, 10);
                this.c = (String) map.get("appendXMeths");
                String str = (String) map.get("auditIgnore");
                if (!TextUtils.isEmpty(str)) {
                    this.f746d = new HashSet(Arrays.asList(str.split(",")));
                }
                if (this.f746d != null) {
                    z = !this.f746d.contains((g.e().h() + "_" + Build.VERSION.SDK).replaceAll(" ", ""));
                } else {
                    z = true;
                }
                if (this.a && z) {
                    z2 = true;
                }
                this.b = z2;
            }
        } else if (i2 == 10) {
            c.d("[module] native audit module > %s", Boolean.valueOf(this.b));
            if (this.b && com.tencent.beacon.e.b.a().f()) {
                b();
            }
        }
    }

    public void b() {
        Context context = this.f748f;
        if (context != null && com.tencent.beacon.a.c.b.g(context)) {
            c.a("[audit] start upload ac event", new Object[0]);
            e l2 = e.l();
            HashMap hashMap = new HashMap();
            hashMap.put("A19", l2.q());
            String str = "Y";
            hashMap.put("A58", l2.m() ? str : "N");
            hashMap.put("A82", a());
            if (!com.tencent.beacon.a.c.b.f583d) {
                str = "N";
            }
            hashMap.put("A85", str);
            hashMap.put("A88", b(this.f748f));
            hashMap.put("A89", l2.a(this.f748f));
            hashMap.put("A90", "");
            hashMap.put("A91", "");
            hashMap.put("A92", "");
            hashMap.put("B13", a(com.tencent.beacon.c.a.a(this.f748f, Integer.valueOf(Build.VERSION.SDK).intValue(), d(), c(), this.f747e)));
            hashMap.put("A31", "" + l2.p());
            ((StatModule) com.tencent.beacon.a.c.c.d().a(ModuleName.STAT)).a((Map<String, String>) hashMap);
        }
    }
}
