package com.apkpure.aegon.components.install;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.IBinder;
import android.text.TextUtils;
import com.apkpure.aegon.components.models.AssetInfo;
import g.c.a.e.d.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AppWatcherService extends Service {
    public static Map<String, AssetInfo> b = new HashMap();

    static {
        new ArrayList();
    }

    public final void a() {
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        BitmapFactory.decodeResource(getResources(), 2131623937);
    }

    public void onDestroy() {
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        if (intent != null && "HANDLE_PACKAGE_EVENT".equals(intent.getStringExtra("command"))) {
            String stringExtra = intent.getStringExtra("event");
            if (TextUtils.isEmpty(stringExtra)) {
                return 2;
            }
            String stringExtra2 = intent.getStringExtra("packageName");
            if (TextUtils.isEmpty(stringExtra2)) {
                return 2;
            }
            if ("PACKAGE_ADDING".equals(stringExtra)) {
                b.put(stringExtra2, (AssetInfo) intent.getParcelableExtra("assetInfo"));
            } else if ("PACKAGE_ADDED".equals(stringExtra)) {
                if (b.containsKey(stringExtra2)) {
                    b.remove(stringExtra2);
                    new c(this).execute(new Object[]{stringExtra2, b.get(stringExtra2)});
                }
            } else if (!"PACKAGE_REMOVING".equals(stringExtra)) {
                "PACKAGE_REMOVED".equals(stringExtra);
            }
        }
        return 2;
    }
}
