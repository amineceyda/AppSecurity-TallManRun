package com.tencent.beacon.a.b;

import android.os.Build;
import android.text.TextUtils;
import com.tencent.beacon.a.c.b;
import com.tencent.beacon.a.c.c;
import com.tencent.beacon.a.c.g;
import com.tencent.beacon.base.net.BResponse;
import com.tencent.beacon.base.net.adapter.AbstractNetAdapter;
import com.tencent.beacon.base.net.call.Callback;
import com.tencent.raft.codegenmeta.utils.Constants;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class e {
    /* access modifiers changed from: private */
    public static final Map<String, String> a = new LinkedHashMap();
    private boolean b = false;
    private boolean c = false;

    /* access modifiers changed from: private */
    public synchronized void b(String str, String str2, Throwable th) {
        a(str, str2, th, true, new d(this));
    }

    private synchronized void e() {
        if (!this.b) {
            Map<String, String> map = a;
            map.put("attaid", b());
            map.put("token", c());
            map.put("error_code", "");
            map.put(Constants.Raft.PLATFORM, "Android");
            map.put("uin", com.tencent.beacon.a.c.e.l().d());
            map.put("model", Build.BOARD + " " + g.e().h());
            map.put("os", com.tencent.beacon.a.c.e.l().s());
            map.put("error_msg", "");
            map.put("error_stack_full", "");
            map.put("app_version", b.a());
            map.put("sdk_version", c.d().j());
            map.put("product_id", c.d().f());
            map.put("_dc", "");
            this.b = true;
        }
    }

    public synchronized void a(String str, String str2) {
        a(str, str2, (Throwable) null);
    }

    public synchronized void a(String str, String str2, Throwable th) {
        a(str, str2, th, false, new b(this, str, str2, th));
    }

    public synchronized void a(String str, String str2, Throwable th, boolean z, Callback<BResponse> callback) {
        if (d()) {
            if (!this.b) {
                e();
            }
            if (TextUtils.isEmpty(str)) {
                com.tencent.beacon.base.util.c.b("[atta] errorCode isn't valid value!", new Object[0]);
            } else {
                a.a().a((Runnable) new c(this, str, str2, th, z, callback));
            }
        }
    }

    public void a(boolean z) {
        this.c = z;
    }

    public abstract String b();

    public abstract String c();

    public boolean d() {
        if (this.c) {
            return true;
        }
        if (com.tencent.beacon.base.util.c.a()) {
            return false;
        }
        String d2 = com.tencent.beacon.a.c.e.l().d();
        return !TextUtils.isEmpty(d2) && ((double) Math.abs(d2.hashCode() % AbstractNetAdapter.READ_TIMEOUT)) < 100.0d;
    }
}
