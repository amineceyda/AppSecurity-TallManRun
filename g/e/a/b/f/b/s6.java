package g.e.a.b.f.b;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final /* synthetic */ class s6 implements Runnable {
    public final /* synthetic */ t6 b;
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Exception f3349d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ byte[] f3350e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Map f3351f;

    public /* synthetic */ s6(t6 t6Var, int i2, Exception exc, byte[] bArr, Map map) {
        this.b = t6Var;
        this.c = i2;
        this.f3349d = exc;
        this.f3350e = bArr;
        this.f3351f = map;
    }

    public final void run() {
        t6 t6Var = this.b;
        int i2 = this.c;
        Exception exc = this.f3349d;
        byte[] bArr = this.f3350e;
        n4 n4Var = t6Var.f3356e.a;
        if (!(i2 == 200 || i2 == 204)) {
            if (i2 == 304) {
                i2 = 304;
            }
            n4Var.d().f3139i.c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i2), exc);
        }
        if (exc == null) {
            n4Var.t().r.a(true);
            if (bArr == null || bArr.length == 0) {
                n4Var.d().f3143m.a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                String optString2 = jSONObject.optString("gclid", "");
                double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                if (TextUtils.isEmpty(optString)) {
                    n4Var.d().f3143m.a("Deferred Deep Link is empty.");
                    return;
                }
                q9 A = n4Var.A();
                n4 n4Var2 = A.a;
                if (!TextUtils.isEmpty(optString)) {
                    List<ResolveInfo> queryIntentActivities = A.a.a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                    if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gclid", optString2);
                        bundle.putString("_cis", "ddp");
                        n4Var.p.o("auto", "_cmp", bundle);
                        q9 A2 = n4Var.A();
                        if (!TextUtils.isEmpty(optString)) {
                            try {
                                SharedPreferences.Editor edit = A2.a.a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                edit.putString("deeplink", optString);
                                edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                if (edit.commit()) {
                                    A2.a.a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                    return;
                                }
                                return;
                            } catch (RuntimeException e2) {
                                A2.a.d().f3136f.b("Failed to persist Deferred Deep Link. exception", e2);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
                n4Var.d().f3139i.c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            } catch (JSONException e3) {
                n4Var.d().f3136f.b("Failed to parse the Deferred Deep Link response. exception", e3);
                return;
            }
        }
        n4Var.d().f3139i.c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i2), exc);
    }
}
