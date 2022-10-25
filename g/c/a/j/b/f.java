package g.c.a.j.b;

import android.content.Context;
import g.c.a.e.j.a;
import g.c.a.m.h;

public final class f implements h {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Context c;

    public f(String str, String str2, Context context) {
        this.a = str;
        this.b = str2;
        this.c = context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r0 = g.c.a.e.e.a.a;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0045 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
            r6 = this;
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r6.a
            r1.append(r2)
            java.lang.String r2 = java.io.File.separator
            r1.append(r2)
            java.lang.String r2 = r6.b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            android.content.Context r1 = r6.c
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "android.intent.action.SEND"
            r2.<init>(r3)
            r3 = 0
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x004d }
            r5 = 24
            if (r4 < r5) goto L_0x0048
            android.app.Application r4 = com.apkpure.aegon.application.AegonApplication.getApplication()     // Catch:{ Exception -> 0x0045 }
            java.lang.String r5 = "com.apkpure.aegon.fileprovider"
            androidx.core.content.FileProvider$a r4 = androidx.core.content.FileProvider.a(r4, r5)     // Catch:{ Exception -> 0x0045 }
            android.net.Uri r0 = r4.b(r0)     // Catch:{ Exception -> 0x0045 }
            r4 = 1
            r2.addFlags(r4)     // Catch:{ Exception -> 0x0045 }
            r4 = 2
            r2.addFlags(r4)     // Catch:{ Exception -> 0x0045 }
            r3 = r0
            goto L_0x004f
        L_0x0045:
            org.slf4j.Logger r0 = g.c.a.e.e.a.a     // Catch:{ Exception -> 0x004d }
            goto L_0x004f
        L_0x0048:
            android.net.Uri r3 = android.net.Uri.fromFile(r0)     // Catch:{ Exception -> 0x004d }
            goto L_0x004f
        L_0x004d:
            org.slf4j.Logger r0 = g.c.a.e.e.a.a
        L_0x004f:
            java.lang.String r0 = "android.intent.extra.STREAM"
            r2.putExtra(r0, r3)
            java.lang.String r0 = "application/octet-stream"
            r2.setType(r0)
            r1.startActivity(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a.j.b.f.a():void");
    }

    public void b() {
        a.c().post(new a(this.c));
    }
}
