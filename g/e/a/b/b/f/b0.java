package g.e.a.b.b.f;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashMap;
import java.util.Map;

public final class b0 implements ServiceConnection {
    public final Map<ServiceConnection, ServiceConnection> a = new HashMap();
    public int b = 2;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public IBinder f2857d;

    /* renamed from: e  reason: collision with root package name */
    public final a0 f2858e;

    /* renamed from: f  reason: collision with root package name */
    public ComponentName f2859f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ d0 f2860g;

    public b0(d0 d0Var, a0 a0Var) {
        this.f2860g = d0Var;
        this.f2858e = a0Var;
    }

    /* JADX WARNING: type inference failed for: r4v13, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r10, java.util.concurrent.Executor r11) {
        /*
            r9 = this;
            r0 = 3
            r9.b = r0
            g.e.a.b.b.f.d0 r0 = r9.f2860g
            g.e.a.b.b.g.a r1 = r0.f2864g
            android.content.Context r2 = r0.f2861d
            g.e.a.b.b.f.a0 r0 = r9.f2858e
            java.lang.String r3 = "ConnectionStatusConfig"
            java.lang.String r4 = r0.a
            r5 = 0
            if (r4 == 0) goto L_0x0079
            boolean r4 = r0.f2846d
            if (r4 == 0) goto L_0x0067
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r6 = r0.a
            java.lang.String r7 = "serviceActionBundleKey"
            r4.putString(r7, r6)
            android.content.ContentResolver r6 = r2.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x002f }
            android.net.Uri r7 = g.e.a.b.b.f.a0.f2845e     // Catch:{ IllegalArgumentException -> 0x002f }
            java.lang.String r8 = "serviceIntentCall"
            android.os.Bundle r4 = r6.call(r7, r8, r5, r4)     // Catch:{ IllegalArgumentException -> 0x002f }
            goto L_0x003e
        L_0x002f:
            r4 = move-exception
            java.lang.String r4 = r4.toString()
            java.lang.String r6 = "Dynamic intent resolution failed: "
            java.lang.String r4 = r6.concat(r4)
            android.util.Log.w(r3, r4)
            r4 = r5
        L_0x003e:
            if (r4 != 0) goto L_0x0041
            goto L_0x004a
        L_0x0041:
            java.lang.String r5 = "serviceResponseIntentKey"
            android.os.Parcelable r4 = r4.getParcelable(r5)
            r5 = r4
            android.content.Intent r5 = (android.content.Intent) r5
        L_0x004a:
            if (r5 != 0) goto L_0x0067
            java.lang.String r4 = r0.a
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r6 = "Dynamic lookup for intent failed for action: "
            int r7 = r4.length()
            if (r7 == 0) goto L_0x005f
            java.lang.String r4 = r6.concat(r4)
            goto L_0x0064
        L_0x005f:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r6)
        L_0x0064:
            android.util.Log.w(r3, r4)
        L_0x0067:
            if (r5 == 0) goto L_0x006a
            goto L_0x0082
        L_0x006a:
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r4 = r0.a
            r3.<init>(r4)
            java.lang.String r0 = r0.b
            android.content.Intent r0 = r3.setPackage(r0)
            r4 = r0
            goto L_0x0083
        L_0x0079:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            android.content.Intent r5 = r0.setComponent(r5)
        L_0x0082:
            r4 = r5
        L_0x0083:
            g.e.a.b.b.f.a0 r0 = r9.f2858e
            int r6 = r0.c
            r7 = 1
            r3 = r10
            r5 = r9
            r8 = r11
            boolean r10 = r1.d(r2, r3, r4, r5, r6, r7, r8)
            r9.c = r10
            if (r10 == 0) goto L_0x00aa
            g.e.a.b.b.f.d0 r10 = r9.f2860g
            android.os.Handler r10 = r10.f2862e
            g.e.a.b.b.f.a0 r11 = r9.f2858e
            r0 = 1
            android.os.Message r10 = r10.obtainMessage(r0, r11)
            g.e.a.b.b.f.d0 r11 = r9.f2860g
            android.os.Handler r11 = r11.f2862e
            g.e.a.b.b.f.d0 r0 = r9.f2860g
            long r0 = r0.f2866i
            r11.sendMessageDelayed(r10, r0)
            return
        L_0x00aa:
            r10 = 2
            r9.b = r10
            g.e.a.b.b.f.d0 r10 = r9.f2860g     // Catch:{ IllegalArgumentException -> 0x00b6 }
            g.e.a.b.b.g.a r11 = r10.f2864g     // Catch:{ IllegalArgumentException -> 0x00b6 }
            android.content.Context r10 = r10.f2861d     // Catch:{ IllegalArgumentException -> 0x00b6 }
            r11.c(r10, r9)     // Catch:{ IllegalArgumentException -> 0x00b6 }
        L_0x00b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.b.f.b0.a(java.lang.String, java.util.concurrent.Executor):void");
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f2860g.c) {
            this.f2860g.f2862e.removeMessages(1, this.f2858e);
            this.f2857d = iBinder;
            this.f2859f = componentName;
            for (ServiceConnection onServiceConnected : this.a.values()) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f2860g.c) {
            this.f2860g.f2862e.removeMessages(1, this.f2858e);
            this.f2857d = null;
            this.f2859f = componentName;
            for (ServiceConnection onServiceDisconnected : this.a.values()) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.b = 2;
        }
    }
}
