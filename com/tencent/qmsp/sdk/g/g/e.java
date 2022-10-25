package com.tencent.qmsp.sdk.g.g;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import com.tencent.beacon.pack.AbstractJceStruct;
import com.tencent.crabshell.common.SHA1;
import com.tencent.qmsp.sdk.g.g.d;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class e {

    /* renamed from: f  reason: collision with root package name */
    public static final e f903f = new e();
    public d a;
    public String b;
    public String c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f904d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public ServiceConnection f905e = new a();

    public class a implements ServiceConnection {
        public a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            e.this.a = d.a.a(iBinder);
            synchronized (e.this.f904d) {
                e.this.f904d.notify();
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            e.this.a = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0045, code lost:
        if (r4.a == null) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String a(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch:{ all -> 0x005d }
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x005d }
            if (r0 == r1) goto L_0x0055
            com.tencent.qmsp.sdk.g.g.d r0 = r4.a     // Catch:{ all -> 0x005d }
            if (r0 != 0) goto L_0x0048
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x005d }
            r0.<init>()     // Catch:{ all -> 0x005d }
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch:{ all -> 0x005d }
            java.lang.String r2 = "com.heytap.openid"
            java.lang.String r3 = "com.heytap.openid.IdentifyService"
            r1.<init>(r2, r3)     // Catch:{ all -> 0x005d }
            r0.setComponent(r1)     // Catch:{ all -> 0x005d }
            java.lang.String r1 = "action.com.heytap.openid.OPEN_ID_SERVICE"
            r0.setAction(r1)     // Catch:{ all -> 0x005d }
            android.content.ServiceConnection r1 = r4.f905e     // Catch:{ all -> 0x005d }
            r2 = 1
            boolean r0 = r5.bindService(r0, r1, r2)     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x0043
            java.lang.Object r0 = r4.f904d     // Catch:{ all -> 0x005d }
            monitor-enter(r0)     // Catch:{ all -> 0x005d }
            java.lang.Object r1 = r4.f904d     // Catch:{ InterruptedException -> 0x003b }
            r2 = 3000(0xbb8, double:1.482E-320)
            r1.wait(r2)     // Catch:{ InterruptedException -> 0x003b }
            goto L_0x003f
        L_0x0039:
            r5 = move-exception
            goto L_0x0041
        L_0x003b:
            r1 = move-exception
            r1.printStackTrace()     // Catch:{ all -> 0x0039 }
        L_0x003f:
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            goto L_0x0043
        L_0x0041:
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            throw r5     // Catch:{ all -> 0x005d }
        L_0x0043:
            com.tencent.qmsp.sdk.g.g.d r0 = r4.a     // Catch:{ all -> 0x005d }
            if (r0 != 0) goto L_0x0048
            goto L_0x0051
        L_0x0048:
            java.lang.String r5 = r4.b(r5, r6)     // Catch:{ Exception -> 0x004d }
            goto L_0x0053
        L_0x004d:
            r5 = move-exception
            r5.printStackTrace()     // Catch:{ all -> 0x005d }
        L_0x0051:
            java.lang.String r5 = ""
        L_0x0053:
            monitor-exit(r4)     // Catch:{ all -> 0x005d }
            return r5
        L_0x0055:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x005d }
            java.lang.String r6 = "Cannot run on MainThread"
            r5.<init>(r6)     // Catch:{ all -> 0x005d }
            throw r5     // Catch:{ all -> 0x005d }
        L_0x005d:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x005d }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qmsp.sdk.g.g.e.a(android.content.Context, java.lang.String):java.lang.String");
    }

    public boolean a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 0);
            if (Build.VERSION.SDK_INT < 28) {
                return packageInfo != null && packageInfo.versionCode >= 1;
            }
            if (packageInfo != null) {
                if (packageInfo.getLongVersionCode() >= 1) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
        }
    }

    public final String b(Context context, String str) {
        Signature[] signatureArr;
        if (TextUtils.isEmpty(this.b)) {
            this.b = context.getPackageName();
        }
        if (TextUtils.isEmpty(this.c)) {
            String str2 = null;
            try {
                signatureArr = context.getPackageManager().getPackageInfo(this.b, 64).signatures;
            } catch (PackageManager.NameNotFoundException e2) {
                e2.printStackTrace();
                signatureArr = null;
            }
            if (signatureArr != null && signatureArr.length > 0) {
                byte[] byteArray = signatureArr[0].toByteArray();
                try {
                    MessageDigest instance = MessageDigest.getInstance(SHA1.TAG);
                    if (instance != null) {
                        byte[] digest = instance.digest(byteArray);
                        StringBuilder sb = new StringBuilder();
                        for (byte b2 : digest) {
                            sb.append(Integer.toHexString((b2 & 255) | AbstractJceStruct.BYTE).substring(1, 3));
                        }
                        str2 = sb.toString();
                    }
                } catch (NoSuchAlgorithmException e3) {
                    e3.printStackTrace();
                }
            }
            this.c = str2;
        }
        String a2 = ((d.a.C0025a) this.a).a(this.b, this.c, str);
        return TextUtils.isEmpty(a2) ? "" : a2;
    }
}
