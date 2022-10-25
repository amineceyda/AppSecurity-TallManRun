package com.tencent.qqlive.module.videoreport.scheme;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import g.a.a.a.a;
import g.c.b.b.f;
import g.i.c.a.a.c0.a.a;
import g.i.c.a.a.r.e;

public class SchemeRouterActivity extends Activity {
    public final void a(Intent intent) {
        Uri uri;
        String str;
        if (!e.b.a.j()) {
            f.w0("Visual.SchemaRouterActivity", "handleIntent(), please initialize the sdk first！");
            Toast.makeText(this, "请先初始化大同SDK", 0).show();
            finish();
            return;
        }
        if (intent != null) {
            try {
                uri = intent.getData();
            } catch (Exception e2) {
                StringBuilder i2 = a.i("handleSchemeUrl exception: ");
                i2.append(e2.getLocalizedMessage());
                f.x("Visual.SchemeRouterHelper", i2.toString());
                return;
            }
        } else {
            uri = null;
        }
        if (uri == null) {
            f.w0("Visual.SchemeRouterHelper", "handleSchemeUrl, uri is null!");
        } else {
            f.w("Visual.SchemeRouterHelper", "handleSchemeUrl, uri=" + uri);
            if ("visual_debug".equals(uri.getHost())) {
                String queryParameter = uri.getQueryParameter("dt_appid");
                String queryParameter2 = uri.getQueryParameter("dt_debugid");
                if (TextUtils.isEmpty(queryParameter)) {
                    f.w0("Visual.SchemeRouterHelper", "handleSchemeUrl, 缺少必要参数：dt_appid");
                    str = "缺少必要参数：dt_appid";
                } else if (TextUtils.isEmpty(queryParameter2)) {
                    f.w0("Visual.SchemeRouterHelper", "handleSchemeUrl, 缺少必要参数：dt_debugid");
                    str = "缺少必要参数：dt_debugid";
                } else {
                    a.b.a.v(queryParameter, queryParameter2);
                    Toast.makeText(this, "已开启大同可视化联调模式 ：)", 0).show();
                }
                g.h.a.a.a0(this, str);
                return;
            }
        }
        finish();
    }

    public void finish() {
        if (isTaskRoot()) {
            try {
                startActivity(getPackageManager().getLaunchIntentForPackage(getPackageName()));
                f.K("Visual.SchemeRouterHelper", "startLaunchActivity");
            } catch (Exception e2) {
                StringBuilder i2 = g.a.a.a.a.i("startLaunchActivity exception: ");
                i2.append(e2.getLocalizedMessage());
                f.x("Visual.SchemeRouterHelper", i2.toString());
            }
        }
        super.finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f.K("Visual.SchemaRouterActivity", "onCreate");
        a(getIntent());
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        a(intent);
    }
}
