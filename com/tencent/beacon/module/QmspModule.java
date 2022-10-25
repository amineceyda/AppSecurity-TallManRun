package com.tencent.beacon.module;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.beacon.a.a.b;
import com.tencent.beacon.a.a.d;
import com.tencent.beacon.a.b.a;
import com.tencent.beacon.a.c.i;
import com.tencent.beacon.base.util.c;
import com.tencent.qmsp.sdk.u.U;

public class QmspModule implements BeaconModule, d {
    private Context a;
    /* access modifiers changed from: private */
    public boolean b;
    private final Runnable c = new Runnable() {
        public void run() {
            String str;
            if (!QmspModule.this.b) {
                QmspModule.this.a(i.c());
            }
            try {
                if (U.getSDKIsAlive()) {
                    str = "Y";
                    c.a("[qmsp] current qmsp is alive:%s", str);
                    com.tencent.beacon.a.c.c.d().c(str);
                }
            } catch (Throwable th) {
                c.b("[qmsp] getSDKIsAlive error! exception msg", th.getMessage());
                c.a(th);
            }
            str = "N";
            c.a("[qmsp] current qmsp is alive:%s", str);
            com.tencent.beacon.a.c.c.d().c(str);
        }
    };

    /* access modifiers changed from: private */
    public synchronized void a(String str) {
        int i2;
        Throwable th;
        if (!this.b) {
            c.a("[qmsp] init qmsp qimei: %s", str);
            if (!TextUtils.isEmpty(str)) {
                com.tencent.beacon.a.c.c d2 = com.tencent.beacon.a.c.c.d();
                String l2 = com.tencent.beacon.a.c.c.d().l();
                String f2 = com.tencent.beacon.a.c.c.d().f();
                try {
                    c.a("[qmsp] startQ: userId: %s, qimei:%s, appKey:%s, sdkVersion: %s", l2, str, f2, d2.j());
                    i2 = U.startQ(this.a, l2, str, f2, d2.j(), c.a());
                    try {
                        a.a().a(114, 0, 300000, this.c);
                        this.b = true;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    i2 = 0;
                    c.b("[qmsp] qmspSDk start error! result:%d, exception msg: %s", Integer.valueOf(i2), th.getMessage());
                    c.a(th);
                    U.stopQ();
                    this.b = false;
                    c.a("[qmsp] qmspSDK start result:%d", Integer.valueOf(i2));
                }
                c.a("[qmsp] qmspSDK start result:%d", Integer.valueOf(i2));
            }
        }
    }

    public void a(Context context) {
        if (!com.tencent.beacon.a.c.c.d().m()) {
            c.a("qmsp disable by user", new Object[0]);
            return;
        }
        this.a = context;
        b.a().a(13, this);
    }

    public void a(com.tencent.beacon.a.a.c cVar) {
        if (cVar.a == 13) {
            a(i.c());
        }
    }
}
