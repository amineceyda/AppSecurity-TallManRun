package g.c.a.e.k.i;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class a {
    public static final Logger a = LoggerFactory.getLogger("JumpActivityLog");

    /* JADX WARNING: Can't wrap try/catch for region: R(7:14|15|16|17|18|19|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0071, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0072, code lost:
        a.warn("startDevelopmentAdapter jump to development page Exception", (java.lang.Throwable) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0066 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r4) {
        /*
            if (r4 != 0) goto L_0x000a
            org.slf4j.Logger r4 = a
            java.lang.String r0 = "guideDevelopmentActivity context is null"
            r4.warn(r0)
            return
        L_0x000a:
            android.content.ContentResolver r0 = r4.getContentResolver()
            r1 = 0
            java.lang.String r2 = "development_settings_enabled"
            int r0 = android.provider.Settings.Secure.getInt(r0, r2, r1)
            if (r0 == 0) goto L_0x0018
            r1 = 1
        L_0x0018:
            org.slf4j.Logger r0 = a
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            java.lang.String r3 = "isOpenDevelopmentSetting : {}"
            r0.info((java.lang.String) r3, (java.lang.Object) r2)
            if (r1 != 0) goto L_0x0039
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x0030 }
            java.lang.String r1 = "android.settings.SETTINGS"
            r0.<init>(r1)     // Catch:{ Exception -> 0x0030 }
            r4.startActivity(r0)     // Catch:{ Exception -> 0x0030 }
            goto L_0x0038
        L_0x0030:
            r4 = move-exception
            org.slf4j.Logger r0 = a
            java.lang.String r1 = "jump to device info Exception"
            r0.warn((java.lang.String) r1, (java.lang.Throwable) r4)
        L_0x0038:
            return
        L_0x0039:
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x0044 }
            java.lang.String r1 = "android.settings.APPLICATION_DEVELOPMENT_SETTINGS"
            r0.<init>(r1)     // Catch:{ Exception -> 0x0044 }
            r4.startActivity(r0)     // Catch:{ Exception -> 0x0044 }
            goto L_0x0079
        L_0x0044:
            r0 = move-exception
            org.slf4j.Logger r1 = a
            java.lang.String r2 = "jump to development page Exception"
            r1.warn((java.lang.String) r2, (java.lang.Throwable) r0)
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ Exception -> 0x0066 }
            java.lang.String r1 = "com.android.settings"
            java.lang.String r2 = "com.android.settings.DevelopmentSettings"
            r0.<init>(r1, r2)     // Catch:{ Exception -> 0x0066 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x0066 }
            r1.<init>()     // Catch:{ Exception -> 0x0066 }
            r1.setComponent(r0)     // Catch:{ Exception -> 0x0066 }
            java.lang.String r0 = "android.intent.action.View"
            r1.setAction(r0)     // Catch:{ Exception -> 0x0066 }
            r4.startActivity(r1)     // Catch:{ Exception -> 0x0066 }
            goto L_0x0079
        L_0x0066:
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x0071 }
            java.lang.String r1 = "com.android.settings.APPLICATION_DEVELOPMENT_SETTINGS"
            r0.<init>(r1)     // Catch:{ Exception -> 0x0071 }
            r4.startActivity(r0)     // Catch:{ Exception -> 0x0071 }
            goto L_0x0079
        L_0x0071:
            r4 = move-exception
            org.slf4j.Logger r0 = a
            java.lang.String r1 = "startDevelopmentAdapter jump to development page Exception"
            r0.warn((java.lang.String) r1, (java.lang.Throwable) r4)
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a.e.k.i.a.a(android.content.Context):void");
    }
}
