package com.apkpure.components.installer.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import g.c.b.b.c;
import g.c.b.b.f;
import g.c.b.b.j.a;
import g.c.b.b.k.q;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InstallReceiverActivity extends Activity {
    public static final Logger b = LoggerFactory.getLogger("InstallReceiverActivityLog");

    public final void a() {
        b.info("InstallReceiverActivity finish()");
        c.d().s();
        finish();
    }

    public final void b(Intent intent) {
        Bundle extras = intent.getExtras();
        if ((getPackageName() + ".SESSION_API_PACKAGE_INSTALLED").equals(intent.getAction())) {
            int i2 = extras.getInt("android.content.pm.extra.STATUS");
            String string = extras.getString("android.content.pm.extra.STATUS_MESSAGE");
            switch (i2) {
                case -1:
                    b.info("二次拉起...{}", (Object) Long.valueOf(System.currentTimeMillis()));
                    try {
                        startActivity((Intent) extras.get("android.intent.extra.INTENT"));
                        break;
                    } catch (Exception unused) {
                        c(19, f.C(18));
                        break;
                    }
                case 0:
                    Logger logger = b;
                    logger.info("获取成功...{}", (Object) Long.valueOf(System.currentTimeMillis()));
                    logger.info("调用 session 安装成功回调.");
                    a aVar = q.c;
                    if (aVar == null) {
                        logger.info("onSuccessCallBack installTask is null");
                    }
                    if (!(c.d().f2227d == null || aVar == null)) {
                        c.d().f2227d.e(aVar);
                        break;
                    }
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    b.info("获取失败...{}", (Object) Long.valueOf(System.currentTimeMillis()));
                    c(i2, string);
                    break;
                default:
                    b.info("调用 session default.");
                    c(i2, string);
                    break;
            }
            a();
        }
    }

    public final void c(int i2, String str) {
        Logger logger = b;
        logger.info("调用 session 安装失败. status: {}, msg: {}", (Object) Integer.valueOf(i2), (Object) str);
        a aVar = q.c;
        if (aVar == null) {
            logger.info("onFailedCallBack installTask is null");
        }
        if (c.d().f2227d != null && aVar != null) {
            c.d().f2227d.c(aVar, i2, str);
        }
    }

    public void onCreate(Bundle bundle) {
        Logger logger = b;
        logger.debug("页面创建...{}", (Object) Long.valueOf(System.currentTimeMillis()));
        logger.info("InstallReceiverActivity onCreate, data: {}", (Object) getIntent());
        if (getIntent().getExtras() != null) {
            logger.info("onNewIntent extras: {}", (Object) getIntent().getExtras());
        }
        super.onCreate(bundle);
        setContentView(2131493389);
        if (getIntent() != null) {
            b(getIntent());
        }
    }

    public void onNewIntent(Intent intent) {
        Logger logger = b;
        logger.info("onNewIntent intent: {}", (Object) intent);
        if (!(intent == null || intent.getExtras() == null)) {
            logger.info("onNewIntent extras: {}", (Object) intent.getExtras().toString());
        }
        super.onNewIntent(intent);
        if (intent != null) {
            b(intent);
        }
    }
}
