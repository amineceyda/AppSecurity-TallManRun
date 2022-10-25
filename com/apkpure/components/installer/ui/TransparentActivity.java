package com.apkpure.components.installer.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TransparentActivity extends Activity {

    /* renamed from: d  reason: collision with root package name */
    public static final Logger f345d = LoggerFactory.getLogger("TransparentActivityLog");
    public int b = -1;
    public String c = "";

    public final void a() {
        f345d.info("TransparentActivity finish()");
        finish();
    }

    public void finish() {
        super.finish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (r5 == -1) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r4, int r5, android.content.Intent r6) {
        /*
            r3 = this;
            super.onActivityResult(r4, r5, r6)
            org.slf4j.Logger r6 = f345d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.String r2 = "TransparentActivity onActivityResult, requestCode:{}, resultCode:{}"
            r6.info((java.lang.String) r2, (java.lang.Object) r0, (java.lang.Object) r1)
            r0 = -1
            r1 = 1
            if (r4 == r1) goto L_0x002b
            r2 = 2
            if (r4 == r2) goto L_0x0028
            r1 = 3
            if (r4 == r1) goto L_0x0020
        L_0x001c:
            r3.a()
            goto L_0x003f
        L_0x0020:
            if (r5 != r0) goto L_0x001c
            java.lang.String r4 = "获取安装权限异常."
            r6.info(r4)
            goto L_0x001c
        L_0x0028:
            if (r5 != r0) goto L_0x001c
            goto L_0x0035
        L_0x002b:
            if (r5 == r0) goto L_0x0035
            int r4 = r3.b
            java.lang.String r5 = r3.c
            g.c.b.b.k.q.b(r3, r4, r5)
            goto L_0x003f
        L_0x0035:
            android.content.Context r4 = r3.getApplicationContext()
            int r5 = r3.b
            g.c.b.b.k.q.a(r1, r4, r5)
            goto L_0x001c
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apkpure.components.installer.ui.TransparentActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onCreate(Bundle bundle) {
        Logger logger = f345d;
        logger.info("TransparentActivity onCreate");
        super.onCreate(bundle);
        if (getIntent() != null) {
            this.b = getIntent().getIntExtra("intent_key_commit", -1);
            this.c = getIntent().getStringExtra("intent_key_task_path");
        }
        setContentView(2131493389);
        logger.debug("TransparentActivity getInstallPromise");
        try {
            startActivityForResult(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + getPackageName())), 1);
        } catch (Exception e2) {
            f345d.warn("getInstallPromise error", (Throwable) e2);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        f345d.info("transparent activity destroyed");
    }
}
