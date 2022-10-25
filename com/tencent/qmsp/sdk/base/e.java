package com.tencent.qmsp.sdk.base;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.qmsp.sdk.c.b;
import com.tencent.raft.measure.utils.MeasureConst;

public class e implements IVendorCallback {
    private static boolean c = false;

    /* renamed from: d  reason: collision with root package name */
    private static String f798d = g.a.a.a.a.f(new StringBuilder(), b.a, "b2FpZA");

    /* renamed from: e  reason: collision with root package name */
    private static String f799e = g.a.a.a.a.f(new StringBuilder(), b.a, "b2FpZA");

    /* renamed from: f  reason: collision with root package name */
    private static Context f800f = null;
    private b a = null;
    private IVendorCallback b = null;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(39:0|(2:1|2)|3|5|6|7|8|9|11|12|13|(2:15|16)|17|(2:19|20)|21|23|24|25|27|28|29|(2:31|32)|33|(2:35|36)|37|39|40|41|43|44|45|46|47|48|49|50|51|52|54) */
        /* JADX WARNING: Can't wrap try/catch for region: R(42:0|1|2|3|5|6|7|8|9|11|12|13|(2:15|16)|17|19|20|21|23|24|25|27|28|29|(2:31|32)|33|35|36|37|39|40|41|43|44|45|46|47|48|49|50|51|52|54) */
        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|1|2|3|5|6|7|8|9|11|12|13|15|16|17|19|20|21|23|24|25|27|28|29|31|32|33|35|36|37|39|40|41|43|44|45|46|47|48|49|50|51|52|54) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0070 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0017 */
        static {
            /*
                com.tencent.qmsp.sdk.base.d.values()
                r0 = 17
                int[] r0 = new int[r0]
                a = r0
                r1 = 1
                r2 = 2
                com.tencent.qmsp.sdk.base.d r3 = com.tencent.qmsp.sdk.base.d.XIAOMI     // Catch:{ NoSuchFieldError -> 0x000f }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 14
                int[] r3 = a     // Catch:{ NoSuchFieldError -> 0x0017 }
                com.tencent.qmsp.sdk.base.d r4 = com.tencent.qmsp.sdk.base.d.BLACKSHARK     // Catch:{ NoSuchFieldError -> 0x0017 }
                r3[r0] = r2     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = a     // Catch:{ NoSuchFieldError -> 0x001e }
                com.tencent.qmsp.sdk.base.d r3 = com.tencent.qmsp.sdk.base.d.VIVO     // Catch:{ NoSuchFieldError -> 0x001e }
                r3 = 3
                r2[r3] = r3     // Catch:{ NoSuchFieldError -> 0x001e }
            L_0x001e:
                r2 = 4
                int[] r3 = a     // Catch:{ NoSuchFieldError -> 0x0025 }
                com.tencent.qmsp.sdk.base.d r4 = com.tencent.qmsp.sdk.base.d.HUA_WEI     // Catch:{ NoSuchFieldError -> 0x0025 }
                r3[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0025 }
            L_0x0025:
                r1 = 5
                int[] r3 = a     // Catch:{ NoSuchFieldError -> 0x002c }
                com.tencent.qmsp.sdk.base.d r4 = com.tencent.qmsp.sdk.base.d.OPPO     // Catch:{ NoSuchFieldError -> 0x002c }
                r3[r2] = r1     // Catch:{ NoSuchFieldError -> 0x002c }
            L_0x002c:
                r2 = 6
                r3 = 13
                int[] r4 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.tencent.qmsp.sdk.base.d r5 = com.tencent.qmsp.sdk.base.d.ONEPLUS     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                r4 = 7
                int[] r5 = a     // Catch:{ NoSuchFieldError -> 0x003c }
                com.tencent.qmsp.sdk.base.d r6 = com.tencent.qmsp.sdk.base.d.MOTO     // Catch:{ NoSuchFieldError -> 0x003c }
                r5[r1] = r4     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                r1 = 8
                int[] r5 = a     // Catch:{ NoSuchFieldError -> 0x0044 }
                com.tencent.qmsp.sdk.base.d r6 = com.tencent.qmsp.sdk.base.d.LENOVO     // Catch:{ NoSuchFieldError -> 0x0044 }
                r5[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                r2 = 9
                int[] r5 = a     // Catch:{ NoSuchFieldError -> 0x004c }
                com.tencent.qmsp.sdk.base.d r6 = com.tencent.qmsp.sdk.base.d.ASUS     // Catch:{ NoSuchFieldError -> 0x004c }
                r5[r4] = r2     // Catch:{ NoSuchFieldError -> 0x004c }
            L_0x004c:
                r4 = 10
                int[] r5 = a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.tencent.qmsp.sdk.base.d r6 = com.tencent.qmsp.sdk.base.d.SAMSUNG     // Catch:{ NoSuchFieldError -> 0x0054 }
                r5[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r1 = 11
                int[] r5 = a     // Catch:{ NoSuchFieldError -> 0x005c }
                com.tencent.qmsp.sdk.base.d r6 = com.tencent.qmsp.sdk.base.d.MEIZU     // Catch:{ NoSuchFieldError -> 0x005c }
                r5[r2] = r1     // Catch:{ NoSuchFieldError -> 0x005c }
            L_0x005c:
                r2 = 12
                int[] r5 = a     // Catch:{ NoSuchFieldError -> 0x0064 }
                com.tencent.qmsp.sdk.base.d r6 = com.tencent.qmsp.sdk.base.d.ALPS     // Catch:{ NoSuchFieldError -> 0x0064 }
                r5[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                int[] r4 = a     // Catch:{ NoSuchFieldError -> 0x006a }
                com.tencent.qmsp.sdk.base.d r5 = com.tencent.qmsp.sdk.base.d.NUBIA     // Catch:{ NoSuchFieldError -> 0x006a }
                r4[r1] = r3     // Catch:{ NoSuchFieldError -> 0x006a }
            L_0x006a:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x0070 }
                com.tencent.qmsp.sdk.base.d r3 = com.tencent.qmsp.sdk.base.d.ZTE     // Catch:{ NoSuchFieldError -> 0x0070 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0070 }
            L_0x0070:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.tencent.qmsp.sdk.base.d r1 = com.tencent.qmsp.sdk.base.d.FREEMEOS     // Catch:{ NoSuchFieldError -> 0x0078 }
                r1 = 15
                r0[r1] = r1     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0080 }
                com.tencent.qmsp.sdk.base.d r1 = com.tencent.qmsp.sdk.base.d.SSUIOS     // Catch:{ NoSuchFieldError -> 0x0080 }
                r1 = 16
                r0[r1] = r1     // Catch:{ NoSuchFieldError -> 0x0080 }
            L_0x0080:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.qmsp.sdk.base.e.a.<clinit>():void");
        }
    }

    public static String a(Context context, String str, int i2) {
        String str2 = null;
        if (context == null) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(f798d, 0);
            String string = sharedPreferences.getString(f799e, (String) null);
            String str3 = !TextUtils.isEmpty(string) ? new String(Base64.decode(string.getBytes(MeasureConst.CHARSET_UTF8), 0)) : null;
            if (i2 == 1) {
                try {
                    if (c) {
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        if (!TextUtils.isEmpty(str)) {
                            str2 = Base64.encodeToString(str.getBytes(MeasureConst.CHARSET_UTF8), 0);
                        }
                        edit.putString(f799e, str2);
                        edit.commit();
                    }
                } catch (Exception e2) {
                    e = e2;
                    str2 = str3;
                    e.printStackTrace();
                    return str2;
                }
            }
            return str3;
        } catch (Exception e3) {
            e = e3;
        }
    }

    public static void a(Context context) {
        if (context != null) {
            try {
                context.getSharedPreferences(f798d, 0).edit().clear().commit();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void a(Context context, boolean z, boolean z2) {
        c = z;
        f800f = context;
        c.a(z2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int a(com.tencent.qmsp.sdk.base.IVendorCallback r5) {
        /*
            r4 = this;
            r4.b = r5
            java.lang.String r5 = android.os.Build.MANUFACTURER
            com.tencent.qmsp.sdk.base.d r5 = com.tencent.qmsp.sdk.base.d.a(r5)
            com.tencent.qmsp.sdk.base.d r0 = com.tencent.qmsp.sdk.base.d.UNSUPPORT
            r1 = 0
            r2 = 0
            if (r5 != r0) goto L_0x0014
            r4.onResult(r1, r2, r2)
            int r5 = com.tencent.qmsp.sdk.base.a.a
            return r5
        L_0x0014:
            int[] r0 = com.tencent.qmsp.sdk.base.e.a.a
            int r5 = r5.ordinal()
            r5 = r0[r5]
            switch(r5) {
                case 1: goto L_0x0056;
                case 2: goto L_0x0056;
                case 3: goto L_0x0050;
                case 4: goto L_0x004a;
                case 5: goto L_0x0044;
                case 6: goto L_0x0044;
                case 7: goto L_0x003e;
                case 8: goto L_0x003e;
                case 9: goto L_0x0038;
                case 10: goto L_0x0032;
                case 11: goto L_0x002c;
                case 12: goto L_0x002c;
                case 13: goto L_0x0026;
                case 14: goto L_0x0020;
                case 15: goto L_0x0020;
                case 16: goto L_0x0020;
                default: goto L_0x001f;
            }
        L_0x001f:
            goto L_0x005d
        L_0x0020:
            com.tencent.qmsp.sdk.g.d.e r5 = new com.tencent.qmsp.sdk.g.d.e
            r5.<init>()
            goto L_0x005b
        L_0x0026:
            com.tencent.qmsp.sdk.g.f.a r5 = new com.tencent.qmsp.sdk.g.f.a
            r5.<init>()
            goto L_0x005b
        L_0x002c:
            com.tencent.qmsp.sdk.g.e.f r5 = new com.tencent.qmsp.sdk.g.e.f
            r5.<init>()
            goto L_0x005b
        L_0x0032:
            com.tencent.qmsp.sdk.g.h.c r5 = new com.tencent.qmsp.sdk.g.h.c
            r5.<init>()
            goto L_0x005b
        L_0x0038:
            com.tencent.qmsp.sdk.g.a.c r5 = new com.tencent.qmsp.sdk.g.a.c
            r5.<init>()
            goto L_0x005b
        L_0x003e:
            com.tencent.qmsp.sdk.g.c.b r5 = new com.tencent.qmsp.sdk.g.c.b
            r5.<init>()
            goto L_0x005b
        L_0x0044:
            com.tencent.qmsp.sdk.g.g.c r5 = new com.tencent.qmsp.sdk.g.g.c
            r5.<init>()
            goto L_0x005b
        L_0x004a:
            com.tencent.qmsp.sdk.g.b.c r5 = new com.tencent.qmsp.sdk.g.b.c
            r5.<init>()
            goto L_0x005b
        L_0x0050:
            com.tencent.qmsp.sdk.g.i.b r5 = new com.tencent.qmsp.sdk.g.i.b
            r5.<init>()
            goto L_0x005b
        L_0x0056:
            com.tencent.qmsp.sdk.g.j.a r5 = new com.tencent.qmsp.sdk.g.j.a
            r5.<init>()
        L_0x005b:
            r4.a = r5
        L_0x005d:
            com.tencent.qmsp.sdk.base.b r5 = r4.a
            if (r5 != 0) goto L_0x006c
            java.lang.String r5 = "vendorInfo == null"
            com.tencent.qmsp.sdk.base.c.b(r5)
            r4.onResult(r1, r2, r2)
            int r5 = com.tencent.qmsp.sdk.base.a.b
            return r5
        L_0x006c:
            java.lang.String r5 = "init"
            com.tencent.qmsp.sdk.base.c.b(r5)
            com.tencent.qmsp.sdk.base.b r5 = r4.a     // Catch:{ Exception -> 0x00ab }
            android.content.Context r0 = f800f     // Catch:{ Exception -> 0x00ab }
            r5.a(r0, r4)     // Catch:{ Exception -> 0x00ab }
            com.tencent.qmsp.sdk.base.b r5 = r4.a
            boolean r5 = r5.d()
            if (r5 != 0) goto L_0x008c
            com.tencent.qmsp.sdk.base.b r5 = r4.a     // Catch:{ Exception -> 0x0086 }
            r5.c()     // Catch:{ Exception -> 0x0086 }
            goto L_0x00aa
        L_0x0086:
            r4.onResult(r1, r2, r2)
            int r5 = com.tencent.qmsp.sdk.base.a.c
            return r5
        L_0x008c:
            java.lang.String r5 = "sync"
            com.tencent.qmsp.sdk.base.c.b(r5)
            com.tencent.qmsp.sdk.base.b r5 = r4.a     // Catch:{ Exception -> 0x00a7 }
            boolean r5 = r5.e()     // Catch:{ Exception -> 0x00a7 }
            com.tencent.qmsp.sdk.base.b r0 = r4.a     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r0 = r0.b()     // Catch:{ Exception -> 0x00a7 }
            com.tencent.qmsp.sdk.base.b r3 = r4.a     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r3 = r3.a()     // Catch:{ Exception -> 0x00a7 }
            r4.onResult(r5, r0, r3)     // Catch:{ Exception -> 0x00a7 }
            goto L_0x00aa
        L_0x00a7:
            r4.onResult(r1, r2, r2)
        L_0x00aa:
            return r1
        L_0x00ab:
            r4.onResult(r1, r2, r2)
            int r5 = com.tencent.qmsp.sdk.base.a.c
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qmsp.sdk.base.e.a(com.tencent.qmsp.sdk.base.IVendorCallback):int");
    }

    public void onResult(boolean z, String str, String str2) {
        c.c("vm onResult " + z);
        if (TextUtils.isEmpty(str2)) {
            str2 = a(f800f, (String) null, 0);
        } else {
            a(f800f, str2, 1);
        }
        IVendorCallback iVendorCallback = this.b;
        if (iVendorCallback != null) {
            iVendorCallback.onResult(z, str, str2);
        }
        b bVar = this.a;
        if (bVar != null) {
            bVar.f();
        }
    }
}
