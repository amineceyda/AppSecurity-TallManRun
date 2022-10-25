package g.e.a.b.f.b;

import android.content.SharedPreferences;
import android.os.Bundle;
import g.c.b.b.f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class o3 {
    public final String a = "default_event_parameters";
    public final Bundle b = new Bundle();
    public Bundle c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ s3 f3272d;

    public o3(s3 s3Var) {
        this.f3272d = s3Var;
        f.k("default_event_parameters");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:35|36|47) */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r11.f3272d.a.d().f3136f.a("Error reading value from SharedPreferences. Value dropped");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00a1 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0099 A[Catch:{ NumberFormatException | JSONException -> 0x00a1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle a() {
        /*
            r11 = this;
            android.os.Bundle r0 = r11.c
            if (r0 == 0) goto L_0x0006
            goto L_0x00ce
        L_0x0006:
            g.e.a.b.f.b.s3 r0 = r11.f3272d
            android.content.SharedPreferences r0 = r0.o()
            java.lang.String r1 = r11.a
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 == 0) goto L_0x00c6
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ JSONException -> 0x00b7 }
            r1.<init>()     // Catch:{ JSONException -> 0x00b7 }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00b7 }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x00b7 }
            r0 = 0
            r3 = 0
        L_0x0021:
            int r4 = r2.length()     // Catch:{ JSONException -> 0x00b7 }
            if (r3 >= r4) goto L_0x00b4
            org.json.JSONObject r4 = r2.getJSONObject(r3)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            java.lang.String r5 = "n"
            java.lang.String r5 = r4.getString(r5)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            java.lang.String r6 = "t"
            java.lang.String r6 = r4.getString(r6)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            int r7 = r6.hashCode()     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            r8 = 100
            r9 = 2
            r10 = 1
            if (r7 == r8) goto L_0x005e
            r8 = 108(0x6c, float:1.51E-43)
            if (r7 == r8) goto L_0x0054
            r8 = 115(0x73, float:1.61E-43)
            if (r7 == r8) goto L_0x004a
            goto L_0x0068
        L_0x004a:
            java.lang.String r7 = "s"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0068
            r7 = 0
            goto L_0x0069
        L_0x0054:
            java.lang.String r7 = "l"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0068
            r7 = 2
            goto L_0x0069
        L_0x005e:
            java.lang.String r7 = "d"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0068
            r7 = 1
            goto L_0x0069
        L_0x0068:
            r7 = -1
        L_0x0069:
            java.lang.String r8 = "v"
            if (r7 == 0) goto L_0x0099
            if (r7 == r10) goto L_0x008d
            if (r7 == r9) goto L_0x0081
            g.e.a.b.f.b.s3 r4 = r11.f3272d     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            g.e.a.b.f.b.n4 r4 = r4.a     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            g.e.a.b.f.b.f3 r4 = r4.d()     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            g.e.a.b.f.b.d3 r4 = r4.f3136f     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            java.lang.String r5 = "Unrecognized persisted bundle type. Type"
            r4.b(r5, r6)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            goto L_0x00b0
        L_0x0081:
            java.lang.String r4 = r4.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            long r6 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            r1.putLong(r5, r6)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            goto L_0x00b0
        L_0x008d:
            java.lang.String r4 = r4.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            double r6 = java.lang.Double.parseDouble(r4)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            r1.putDouble(r5, r6)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            goto L_0x00b0
        L_0x0099:
            java.lang.String r4 = r4.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            r1.putString(r5, r4)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            goto L_0x00b0
        L_0x00a1:
            g.e.a.b.f.b.s3 r4 = r11.f3272d     // Catch:{ JSONException -> 0x00b7 }
            g.e.a.b.f.b.n4 r4 = r4.a     // Catch:{ JSONException -> 0x00b7 }
            g.e.a.b.f.b.f3 r4 = r4.d()     // Catch:{ JSONException -> 0x00b7 }
            g.e.a.b.f.b.d3 r4 = r4.f3136f     // Catch:{ JSONException -> 0x00b7 }
            java.lang.String r5 = "Error reading value from SharedPreferences. Value dropped"
            r4.a(r5)     // Catch:{ JSONException -> 0x00b7 }
        L_0x00b0:
            int r3 = r3 + 1
            goto L_0x0021
        L_0x00b4:
            r11.c = r1     // Catch:{ JSONException -> 0x00b7 }
            goto L_0x00c6
        L_0x00b7:
            g.e.a.b.f.b.s3 r0 = r11.f3272d
            g.e.a.b.f.b.n4 r0 = r0.a
            g.e.a.b.f.b.f3 r0 = r0.d()
            g.e.a.b.f.b.d3 r0 = r0.f3136f
            java.lang.String r1 = "Error loading bundle from SharedPreferences. Values will be lost"
            r0.a(r1)
        L_0x00c6:
            android.os.Bundle r0 = r11.c
            if (r0 != 0) goto L_0x00ce
            android.os.Bundle r0 = r11.b
            r11.c = r0
        L_0x00ce:
            android.os.Bundle r0 = r11.c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.o3.a():android.os.Bundle");
    }

    public final void b(Bundle bundle) {
        String str;
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.f3272d.o().edit();
        if (bundle.size() == 0) {
            edit.remove(this.a);
        } else {
            String str2 = this.a;
            JSONArray jSONArray = new JSONArray();
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str3);
                        jSONObject.put("v", obj.toString());
                        if (obj instanceof String) {
                            str = "s";
                        } else if (obj instanceof Long) {
                            str = "l";
                        } else if (obj instanceof Double) {
                            str = "d";
                        } else {
                            this.f3272d.a.d().f3136f.b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONObject.put("t", str);
                        jSONArray.put(jSONObject);
                    } catch (JSONException e2) {
                        this.f3272d.a.d().f3136f.b("Cannot serialize bundle value to SharedPreferences", e2);
                    }
                }
            }
            edit.putString(str2, jSONArray.toString());
        }
        edit.apply();
        this.c = bundle;
    }
}
