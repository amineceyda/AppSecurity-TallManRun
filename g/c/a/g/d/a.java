package g.c.a.g.d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.apkpure.aegon.app.activity.AppDetailActivity;
import com.apkpure.aegon.components.models.SimpleDisplayInfo;
import com.apkpure.aegon.main.activity.MainTabActivity;
import com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo;
import g.c.a.e.k.h.b;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class a {
    public static final Logger a = LoggerFactory.getLogger("LauncherLog");

    public static void a(Context context, SimpleDisplayInfo simpleDisplayInfo, Map<String, String> map) {
        if (simpleDisplayInfo != null) {
            Intent intent = new Intent(context, AppDetailActivity.class);
            Bundle bundle = new Bundle();
            if (map != null && !map.isEmpty()) {
                for (String next : map.keySet()) {
                    bundle.putString(next, map.get(next));
                }
            }
            bundle.putString("transmit_app_info_tag", b.c(simpleDisplayInfo));
            intent.putExtras(bundle);
            intent.setFlags(268435456);
            context.startActivity(intent);
        }
    }

    public static void b(Context context, AppDetailInfo appDetailInfo) {
        SimpleDisplayInfo f2 = SimpleDisplayInfo.f(appDetailInfo);
        if (appDetailInfo != null) {
            try {
                if (!TextUtils.isEmpty(appDetailInfo.openPosition)) {
                    f2.i(Integer.parseInt(appDetailInfo.openPosition));
                }
            } catch (Exception e2) {
                a.warn("解析 openPosition 异常", (Throwable) e2);
            }
        }
        a(context, f2, (Map<String, String>) null);
    }

    public static void c(Context context, Intent intent) {
        Intent intent2 = new Intent(context, MainTabActivity.class);
        intent2.putExtra("intent-filter", intent);
        context.startActivity(intent2);
    }

    public static void d(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            a.info("Start web activity fail. url is empty.");
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (context != null && intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
        }
    }
}
