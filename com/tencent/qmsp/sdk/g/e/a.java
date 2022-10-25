package com.tencent.qmsp.sdk.g.e;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.ArrayList;

public class a extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        b a;
        if (context != null && intent != null) {
            boolean z = false;
            int intExtra = intent.getIntExtra("openIdNotifyFlag", 0);
            c.b("shouldUpdateId, notifyFlag : " + intExtra);
            if (intExtra != 1) {
                if (intExtra == 2) {
                    ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("openIdPackageList");
                    if (stringArrayListExtra != null) {
                        boolean contains = stringArrayListExtra.contains(context.getPackageName());
                        if (contains) {
                            b a2 = c.a().a(intent.getStringExtra("openIdType"));
                            if (a2 != null) {
                                a2.b();
                                return;
                            }
                            return;
                        }
                        z = contains;
                    } else {
                        return;
                    }
                } else {
                    z = true;
                }
                if (intExtra == 0 && z) {
                    b a3 = c.a().a(intent.getStringExtra("openIdType"));
                    if (a3 != null) {
                        a3.b();
                        return;
                    }
                    return;
                }
            } else if (TextUtils.equals(intent.getStringExtra("openIdPackage"), context.getPackageName())) {
                z = true;
            }
            if (z && (a = c.a().a(intent.getStringExtra("openIdType"))) != null) {
                a.b();
            }
        }
    }
}
