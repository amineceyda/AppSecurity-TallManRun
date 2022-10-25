package com.apkpure.aegon.main.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.apkpure.aegon.application.AegonApplication;
import com.apkpure.aegon.signstuff.view.StuffApkInstallView;
import com.apkpure.aegon.widgets.swipe.SwipeRefreshLayout;
import g.c.a.g.a.j;
import g.c.a.g.a.n.j.h;
import g.c.a.g.b.a;
import g.c.a.l.l.o;
import g.c.a.m.d;
import g.i.c.a.a.i.b;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainTabActivity extends a {
    public static final Logger w = LoggerFactory.getLogger("MainTabActivityLog");
    public h r;
    public SwipeRefreshLayout s;
    public StuffApkInstallView t;
    public ImageView u;
    public final d v = new j(this);

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        b.C0166b.a.c(this, motionEvent, false, true);
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        b.C0166b.a.c(this, motionEvent, dispatchTouchEvent, false);
        return dispatchTouchEvent;
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b.C0166b.a.b(this, configuration);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x01c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            org.slf4j.Logger r0 = w
            java.lang.String r1 = "MainTabActivity onCreate"
            r0.info(r1)
            super.onCreate(r11)
            android.content.Intent r11 = r10.getIntent()
            r10.y(r11)
            r11 = 2131493487(0x7f0c026f, float:1.8610456E38)
            r10.setContentView((int) r11)
            r11 = 2131298669(0x7f09096d, float:1.8215318E38)
            android.view.View r11 = r10.findViewById(r11)
            com.apkpure.aegon.widgets.swipe.SwipeRefreshLayout r11 = (com.apkpure.aegon.widgets.swipe.SwipeRefreshLayout) r11
            r10.s = r11
            g.c.a.g.a.i r0 = new g.c.a.g.a.i
            r0.<init>(r10)
            r11.setOnRefreshListener(r0)
            r11 = 2131298662(0x7f090966, float:1.8215303E38)
            android.view.View r11 = r10.findViewById(r11)
            g.c.a.g.a.f r0 = new g.c.a.g.a.f
            r0.<init>(r10)
            r11.setOnClickListener(r0)
            r11 = 2131298643(0x7f090953, float:1.8215265E38)
            android.view.View r11 = r10.findViewById(r11)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r10.u = r11
            g.c.a.g.a.a r0 = new g.c.a.g.a.a
            r0.<init>(r10)
            r11.setOnClickListener(r0)
            r11 = 2131298645(0x7f090955, float:1.821527E38)
            android.view.View r11 = r10.findViewById(r11)
            g.c.a.g.a.g r0 = new g.c.a.g.a.g
            r0.<init>(r10)
            r11.setOnClickListener(r0)
            r11 = 2131298670(0x7f09096e, float:1.821532E38)
            android.view.View r11 = r10.findViewById(r11)
            com.apkpure.aegon.signstuff.view.StuffApkInstallView r11 = (com.apkpure.aegon.signstuff.view.StuffApkInstallView) r11
            r10.t = r11
            r11 = 2131298664(0x7f090968, float:1.8215308E38)
            android.view.View r11 = r10.findViewById(r11)
            com.apkpure.aegon.widgets.xlistview.XListView r11 = (com.apkpure.aegon.widgets.xlistview.XListView) r11
            g.c.a.g.a.n.j.h r0 = new g.c.a.g.a.n.j.h
            com.apkpure.aegon.widgets.swipe.SwipeRefreshLayout r1 = r10.s
            r0.<init>(r11, r1)
            r10.r = r0
            r1 = 2131298636(0x7f09094c, float:1.821525E38)
            android.view.View r1 = r10.findViewById(r1)
            r2 = 1
            int[] r3 = new int[r2]
            r4 = 2130969859(0x7f040503, float:1.7548412E38)
            r5 = 0
            r3[r5] = r4
            android.content.res.TypedArray r3 = r10.obtainStyledAttributes(r3)
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            int r4 = r3.getColor(r5, r4)
            r3.recycle()
            r1.setBackgroundColor(r4)
            r3 = 2131297059(0x7f090323, float:1.8212052E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r4 = 2131297058(0x7f090322, float:1.821205E38)
            android.view.View r4 = r1.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r6 = 2131820957(0x7f11019d, float:1.9274644E38)
            r3.setText(r6)
            r3 = 2131821432(0x7f110378, float:1.9275607E38)
            r4.setText(r3)
            g.c.a.g.a.d r3 = new g.c.a.g.a.d
            r3.<init>(r10)
            r4.setOnClickListener(r3)
            r0.f2181e = r1
            g.c.a.g.a.n.j.h r0 = r10.r
            g.c.a.g.a.c r1 = new g.c.a.g.a.c
            r1.<init>(r10)
            r0.f2185i = r1
            g.c.a.g.a.m r1 = new g.c.a.g.a.m
            r1.<init>(r10)
            r0.registerDataSetObserver(r1)
            g.c.a.g.a.n.j.h r0 = r10.r
            r11.setAdapter((android.widget.ListAdapter) r0)
            g.c.a.l.d r11 = g.c.a.l.d.a
            g.c.a.g.a.e r0 = new g.c.a.g.a.e
            r0.<init>(r10)
            r11.g(r0)
            com.apkpure.aegon.widgets.swipe.SwipeRefreshLayout r11 = r10.s
            r11.setRefreshing(r2)
            g.c.a.b.b.d r11 = g.c.a.b.b.d.a
            java.lang.String r11 = "activity"
            i.o.c.h.e(r10, r11)
            org.slf4j.Logger r0 = g.c.a.b.b.d.b
            java.lang.String r1 = "restoreInstaller"
            r0.info(r1)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            java.lang.String r3 = "path"
            if (r0 >= r1) goto L_0x00fd
            goto L_0x014b
        L_0x00fd:
            java.lang.String r0 = g.c.b.b.l.e.a(r10)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x0108
            goto L_0x014b
        L_0x0108:
            i.o.c.h.d(r0, r3)
            java.lang.String r1 = "filePath"
            i.o.c.h.e(r0, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0123
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r1 = r1.exists()
            if (r1 == 0) goto L_0x0123
            r1 = 1
            goto L_0x0124
        L_0x0123:
            r1 = 0
        L_0x0124:
            if (r1 != 0) goto L_0x0127
            goto L_0x014b
        L_0x0127:
            android.content.pm.PackageManager r1 = r10.getPackageManager()     // Catch:{ Exception -> 0x013b }
            android.content.pm.PackageInfo r0 = r1.getPackageArchiveInfo(r0, r5)     // Catch:{ Exception -> 0x013b }
            if (r0 != 0) goto L_0x0132
            goto L_0x014b
        L_0x0132:
            java.lang.String r0 = r0.packageName     // Catch:{ Exception -> 0x013b }
            java.lang.String r1 = "com.apkpure.aegon"
            boolean r0 = i.o.c.h.a(r0, r1)     // Catch:{ Exception -> 0x013b }
            goto L_0x014c
        L_0x013b:
            r0 = move-exception
            org.slf4j.Logger r1 = g.c.a.b.b.d.b
            java.lang.String r4 = r0.getMessage()
            java.lang.String r6 = "restoreInstaller 异常, "
            java.lang.String r4 = i.o.c.h.j(r6, r4)
            r1.warn((java.lang.String) r4, (java.lang.Throwable) r0)
        L_0x014b:
            r0 = 0
        L_0x014c:
            g.c.a.b.b.g r1 = g.c.a.b.b.g.RestoreInstaller
            g.c.a.b.b.d.f1911d = r1
            int r4 = android.os.Build.VERSION.SDK_INT
            r6 = 29
            java.lang.String r7 = ""
            if (r4 <= r6) goto L_0x0184
            java.lang.String r8 = g.c.b.b.l.e.a(r10)
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x0184
            boolean r8 = g.c.b.b.l.e.b()
            if (r8 == 0) goto L_0x0174
            g.c.b.b.l.g r8 = g.c.b.b.l.g.a(r10)
            android.content.SharedPreferences r8 = r8.a
            java.lang.String r9 = "dt_stat_info_str"
            java.lang.String r7 = r8.getString(r9, r7)
        L_0x0174:
            java.lang.String r8 = "dtStatInfoStr(activity)"
            i.o.c.h.d(r7, r8)
            org.slf4j.Logger r8 = g.c.a.b.b.d.b
            java.lang.String r9 = "restoreInstaller 中获取上次的上报参数: "
            java.lang.String r9 = i.o.c.h.j(r9, r7)
            r8.info(r9)
        L_0x0184:
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.lang.String r9 = "stat_info"
            e.e.d.l.a.j0(r8, r9, r7)
            g.c.b.b.c$b r7 = g.c.b.b.c.f2226m
            g.c.b.b.c r7 = r7.a()
            g.c.b.b.j.b$a r9 = new g.c.b.b.j.b$a
            r9.<init>()
            r9.f2288e = r5
            r9.f2287d = r0
            java.util.Locale r0 = g.c.a.m.l.b()
            java.lang.String r5 = "getLanguage()"
            i.o.c.h.d(r0, r5)
            r9.c(r0)
            r9.f2294k = r8
            r0 = 0
            g.c.a.b.b.c r5 = new g.c.a.b.b.c
            r5.<init>(r10, r1, r0)
            r9.b(r5)
            g.c.b.b.j.b r0 = r9.a()
            java.util.Objects.requireNonNull(r7)
            i.o.c.h.e(r10, r11)
            if (r4 <= r6) goto L_0x0241
            java.lang.String r11 = g.c.b.b.l.e.a(r10)
            org.slf4j.Logger r1 = g.c.b.b.c.n
            java.lang.String r4 = "restoreInstaller, have path: "
            java.lang.StringBuilder r4 = g.a.a.a.a.i(r4)
            boolean r5 = android.text.TextUtils.isEmpty(r11)
            r2 = r2 ^ r5
            r4.append(r2)
            java.lang.String r2 = ", path: "
            r4.append(r2)
            r4.append(r11)
            java.lang.String r2 = r4.toString()
            r1.info(r2)
            i.o.c.h.d(r11, r3)
            java.lang.String r2 = g.c.b.b.f.u0(r11)
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r4 = "getDefault()"
            i.o.c.h.d(r3, r4)
            java.lang.String r2 = r2.toLowerCase(r3)
            java.lang.String r3 = "(this as java.lang.String).toLowerCase(locale)"
            i.o.c.h.d(r2, r3)
            java.lang.String r5 = ".xapk"
            boolean r2 = i.o.c.h.a(r2, r5)
            if (r2 != 0) goto L_0x0238
            java.lang.String r2 = g.c.b.b.f.u0(r11)
            java.util.Locale r5 = java.util.Locale.getDefault()
            i.o.c.h.d(r5, r4)
            java.lang.String r2 = r2.toLowerCase(r5)
            i.o.c.h.d(r2, r3)
            java.lang.String r3 = ".apk"
            boolean r2 = i.o.c.h.a(r2, r3)
            if (r2 != 0) goto L_0x0238
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "path: "
            r0.append(r2)
            r0.append(r11)
            java.lang.String r11 = " 错误, 不进行安装."
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r1.info(r11)
            goto L_0x0241
        L_0x0238:
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            if (r1 != 0) goto L_0x0241
            r7.m(r10, r11, r0)
        L_0x0241:
            android.content.Context r11 = r10.n
            g.c.a.e.b.d r11 = g.c.a.e.b.d.c(r11)
            g.c.a.m.d r0 = r10.v
            r11.b(r0)
            org.slf4j.Logger r11 = w
            java.lang.String r0 = "MainTabActivity end"
            r11.info(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apkpure.aegon.main.activity.MainTabActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        g.c.a.e.b.d.c(this.n).e(this.v);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        y(intent);
    }

    public void onResume() {
        String str;
        Logger logger;
        super.onResume();
        StuffApkInstallView stuffApkInstallView = this.t;
        if (stuffApkInstallView != null) {
            o oVar = stuffApkInstallView.B;
            if (oVar == null) {
                StuffApkInstallView.S.debug("On resume apkDescription is null.");
                return;
            }
            Integer num = null;
            Integer valueOf = Integer.valueOf(oVar.f2071e);
            if (valueOf != null && valueOf.intValue() == 2001) {
                o oVar2 = stuffApkInstallView.B;
                if (oVar2 != null) {
                    num = Integer.valueOf(oVar2.c);
                }
                if (num != null && num.intValue() == 62) {
                    if (Build.VERSION.SDK_INT < 23 || AegonApplication.getContext().checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
                        g.c.a.l.d.a.m();
                        return;
                    }
                    logger = StuffApkInstallView.S;
                    str = "ReInstall obb not READ_EXTERNAL_STORAGE permission.";
                    logger.info(str);
                }
            }
            logger = StuffApkInstallView.S;
            str = "Not need reinstall.";
            logger.info(str);
        }
    }

    public String r() {
        return "main_active";
    }

    public long s() {
        return 2004;
    }

    public void u() {
        overridePendingTransition(2130772054, 2130772061);
    }

    public void y(Intent intent) {
        if (intent == null || intent.getParcelableExtra("intent-filter") == null) {
            w.info("Handle intent filter is null");
            return;
        }
        Uri data = ((Intent) intent.getParcelableExtra("intent-filter")).getData();
        if (data != null) {
            w.info("Handle intent filter uri[{}]", (Object) data);
            new Handler(getMainLooper()).postDelayed(new g.c.a.g.a.b(this, data), 500);
        }
    }

    public final void z() {
        if (!g.c.a.e.f.b.a.c(this)) {
            Context context = this.n;
            Logger logger = g.h.a.c.a.t.d.a;
            g.h.a.c.a.t.d.b(context, context.getResources().getString(2131821132));
            new Handler(Looper.getMainLooper()).postDelayed(new g.c.a.g.a.h(this), 500);
            return;
        }
        h hVar = this.r;
        if (hVar != null) {
            hVar.b();
        }
    }
}
