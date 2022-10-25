package com.apkpure.aegon.main.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.apkpure.aegon.application.AegonApplication;
import com.apkpure.aegon.signstuff.view.StuffApkInstallView;
import com.tencent.crabshell.common.DataSavingUtils;
import g.c.a.b.c.h;
import g.c.a.f.d;
import g.c.a.g.a.k;
import g.c.a.g.a.l;
import g.c.a.g.b.a;
import g.c.a.l.l.o;
import g.c.c.n.f;
import g.i.c.a.a.i.b;
import i.j;
import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SplashActivity extends a {
    public static final Logger t = LoggerFactory.getLogger("SplashActivityLog");
    public d r;
    public final h s = new h();

    /* access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ j B(o oVar) {
        String str;
        if (oVar == null || g.c.a.l.d.a.c()) {
            g.c.a.l.d.a.k();
            z();
            str = "";
        } else {
            D();
            StuffApkInstallView stuffApkInstallView = this.r.a;
            stuffApkInstallView.k(true);
            stuffApkInstallView.j(false);
            stuffApkInstallView.i(oVar);
            stuffApkInstallView.l();
            new Handler().postDelayed(new k(this), 0);
            str = oVar.g();
        }
        C(str);
        return j.a;
    }

    public final void C(String str) {
        if (!DataSavingUtils.getDataBoolean(AegonApplication.getApplication(), "first_open")) {
            HashMap hashMap = new HashMap();
            if (str != null && !str.isEmpty()) {
                hashMap.put("package_name", str);
            }
            g.c.a.e.h.b.d.f("first_open", hashMap);
            DataSavingUtils.putData(this.n, "first_open", true);
        }
    }

    public final void D() {
        View inflate = LayoutInflater.from(this).inflate(2131492924, (ViewGroup) null);
        this.r = d.a(inflate);
        setContentView(inflate);
    }

    public final void E() {
        g.c.a.l.d.a.g(new l(this));
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        b.C0166b.a.c(this, motionEvent, false, true);
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        b.C0166b.a.c(this, motionEvent, dispatchTouchEvent, false);
        return dispatchTouchEvent;
    }

    public void finish() {
        super.finish();
        overridePendingTransition(2130772054, 2130772061);
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b.C0166b.a.b(this, configuration);
    }

    public void onCreate(Bundle bundle) {
        Intent intent;
        Logger logger = t;
        logger.info("SplashActivity onCreate");
        super.onCreate(bundle);
        y();
        e.e.i.b.R(this, 0, true, true);
        if (!isTaskRoot() && (intent = getIntent()) != null) {
            String action = intent.getAction();
            if (intent.hasCategory("android.intent.category.LAUNCHER") && "android.intent.action.MAIN".equals(action)) {
                finish();
                return;
            }
        }
        E();
        this.s.a(this.o);
        f.a();
        logger.info("SplashActivity end");
    }

    public void onDestroy() {
        t.info("SplashActivity onDestroy");
        super.onDestroy();
    }

    public String r() {
        return "page_open_screen";
    }

    public long s() {
        return 2118;
    }

    public final void y() {
        g.c.a.e.h.b.d.j(this, "page_open_screen", "page_open_screen", (HashMap<String, Object>) null);
    }

    public final void z() {
        g.c.a.g.d.a.c(this, getIntent());
        finish();
    }
}
