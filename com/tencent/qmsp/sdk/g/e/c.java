package com.tencent.qmsp.sdk.g.e;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.os.Handler;

public class c {

    /* renamed from: g  reason: collision with root package name */
    public static volatile c f899g;
    public b a = new b("udid");
    public b b = new b("oaid");
    public b c = new b("aaid");

    /* renamed from: d  reason: collision with root package name */
    public b f900d = new b("vaid");

    /* renamed from: e  reason: collision with root package name */
    public Boolean f901e;

    /* renamed from: f  reason: collision with root package name */
    public BroadcastReceiver f902f;

    public static final c a() {
        if (f899g == null) {
            synchronized (c.class) {
                f899g = new c();
            }
        }
        return f899g;
    }

    public static e a(Cursor cursor) {
        String str;
        e eVar = new e((String) null, 0);
        if (cursor == null) {
            str = "parseValue fail, cursor is null.";
        } else if (!cursor.isClosed()) {
            cursor.moveToFirst();
            int columnIndex = cursor.getColumnIndex("value");
            if (columnIndex >= 0) {
                eVar.c = cursor.getString(columnIndex);
            } else {
                b("parseValue fail, index < 0.");
            }
            int columnIndex2 = cursor.getColumnIndex("code");
            if (columnIndex2 >= 0) {
                eVar.a = cursor.getInt(columnIndex2);
            } else {
                b("parseCode fail, index < 0.");
            }
            int columnIndex3 = cursor.getColumnIndex("expired");
            if (columnIndex3 >= 0) {
                eVar.b = cursor.getLong(columnIndex3);
                return eVar;
            }
            str = "parseExpired fail, index < 0.";
        } else {
            str = "parseValue fail, cursor is closed.";
        }
        b(str);
        return eVar;
    }

    public static void b(String str) {
        com.tencent.qmsp.sdk.base.c.a("MzOpenIdManager " + str);
    }

    public b a(String str) {
        if ("oaid".equals(str)) {
            return this.b;
        }
        if ("vaid".equals(str)) {
            return this.f900d;
        }
        if ("aaid".equals(str)) {
            return this.c;
        }
        if (!"udid".equals(str)) {
            return null;
        }
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00bc, code lost:
        r10 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bd, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bf, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c2, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:8:0x0038, B:17:0x005b] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:8:0x0038, B:19:0x0061] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bc A[ExcHandler: all (th java.lang.Throwable), Splitter:B:8:0x0038] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(android.content.Context r10, com.tencent.qmsp.sdk.g.e.b r11) {
        /*
            r9 = this;
            r0 = 0
            if (r11 != 0) goto L_0x0005
            goto L_0x00d3
        L_0x0005:
            boolean r1 = r11.a()
            if (r1 != 0) goto L_0x00d1
            java.lang.String r1 = "queryId : "
            java.lang.StringBuilder r1 = g.a.a.a.a.i(r1)
            java.lang.String r2 = r11.c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            b(r1)
            java.lang.String r1 = "content://com.meizu.flyme.openidsdk/"
            android.net.Uri r3 = android.net.Uri.parse(r1)
            android.content.ContentResolver r2 = r10.getContentResolver()     // Catch:{ Exception -> 0x00ca, all -> 0x00c3 }
            r4 = 0
            r5 = 0
            r1 = 1
            java.lang.String[] r6 = new java.lang.String[r1]     // Catch:{ Exception -> 0x00ca, all -> 0x00c3 }
            java.lang.String r7 = r11.c     // Catch:{ Exception -> 0x00ca, all -> 0x00c3 }
            r8 = 0
            r6[r8] = r7     // Catch:{ Exception -> 0x00ca, all -> 0x00c3 }
            r7 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x00ca, all -> 0x00c3 }
            if (r2 != 0) goto L_0x005b
            r9.a((android.content.Context) r10, (boolean) r8)     // Catch:{ Exception -> 0x0059, all -> 0x00bc }
            boolean r10 = r9.a((android.content.Context) r10, (boolean) r1)     // Catch:{ Exception -> 0x0059, all -> 0x00bc }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0059, all -> 0x00bc }
            r11.<init>()     // Catch:{ Exception -> 0x0059, all -> 0x00bc }
            java.lang.String r1 = "forceQuery isSupported : "
            r11.append(r1)     // Catch:{ Exception -> 0x0059, all -> 0x00bc }
            r11.append(r10)     // Catch:{ Exception -> 0x0059, all -> 0x00bc }
            java.lang.String r10 = r11.toString()     // Catch:{ Exception -> 0x0059, all -> 0x00bc }
            b(r10)     // Catch:{ Exception -> 0x0059, all -> 0x00bc }
            if (r2 == 0) goto L_0x0058
            r2.close()
        L_0x0058:
            return r0
        L_0x0059:
            goto L_0x00cb
        L_0x005b:
            com.tencent.qmsp.sdk.g.e.e r3 = a((android.database.Cursor) r2)     // Catch:{ Exception -> 0x00bf, all -> 0x00bc }
            java.lang.String r4 = r3.c     // Catch:{ Exception -> 0x00bf, all -> 0x00bc }
            r11.a((java.lang.String) r4)     // Catch:{ Exception -> 0x00cd, all -> 0x00bc }
            long r5 = r3.b     // Catch:{ Exception -> 0x00cd, all -> 0x00bc }
            r11.a((long) r5)     // Catch:{ Exception -> 0x00cd, all -> 0x00bc }
            int r5 = r3.a     // Catch:{ Exception -> 0x00cd, all -> 0x00bc }
            r11.a((int) r5)     // Catch:{ Exception -> 0x00cd, all -> 0x00bc }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00cd, all -> 0x00bc }
            r5.<init>()     // Catch:{ Exception -> 0x00cd, all -> 0x00bc }
            java.lang.String r6 = r11.c     // Catch:{ Exception -> 0x00cd, all -> 0x00bc }
            r5.append(r6)     // Catch:{ Exception -> 0x00cd, all -> 0x00bc }
            java.lang.String r6 = " errorCode : "
            r5.append(r6)     // Catch:{ Exception -> 0x00cd, all -> 0x00bc }
            int r11 = r11.a     // Catch:{ Exception -> 0x00cd, all -> 0x00bc }
            r5.append(r11)     // Catch:{ Exception -> 0x00cd, all -> 0x00bc }
            java.lang.String r11 = r5.toString()     // Catch:{ Exception -> 0x00cd, all -> 0x00bc }
            b(r11)     // Catch:{ Exception -> 0x00cd, all -> 0x00bc }
            int r11 = r3.a     // Catch:{ Exception -> 0x00cd, all -> 0x00bc }
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r11 != r3) goto L_0x0093
            r2.close()
            return r4
        L_0x0093:
            r9.a((android.content.Context) r10)     // Catch:{ Exception -> 0x00cd, all -> 0x00bc }
            boolean r11 = r9.a((android.content.Context) r10, (boolean) r8)     // Catch:{ Exception -> 0x00cd, all -> 0x00bc }
            if (r11 == 0) goto L_0x00a0
            r2.close()
            return r4
        L_0x00a0:
            boolean r10 = r9.a((android.content.Context) r10, (boolean) r1)     // Catch:{ Exception -> 0x00cd, all -> 0x00bc }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00cd, all -> 0x00bc }
            r11.<init>()     // Catch:{ Exception -> 0x00cd, all -> 0x00bc }
            java.lang.String r1 = "not support, forceQuery isSupported: "
            r11.append(r1)     // Catch:{ Exception -> 0x00cd, all -> 0x00bc }
            r11.append(r10)     // Catch:{ Exception -> 0x00cd, all -> 0x00bc }
            java.lang.String r10 = r11.toString()     // Catch:{ Exception -> 0x00cd, all -> 0x00bc }
            b(r10)     // Catch:{ Exception -> 0x00cd, all -> 0x00bc }
            r2.close()
            return r4
        L_0x00bc:
            r10 = move-exception
            r0 = r2
            goto L_0x00c4
        L_0x00bf:
            r2.close()
            return r0
        L_0x00c3:
            r10 = move-exception
        L_0x00c4:
            if (r0 == 0) goto L_0x00c9
            r0.close()
        L_0x00c9:
            throw r10
        L_0x00ca:
            r2 = r0
        L_0x00cb:
            if (r2 == 0) goto L_0x00d3
        L_0x00cd:
            r2.close()
            goto L_0x00d3
        L_0x00d1:
            java.lang.String r0 = r11.f898d
        L_0x00d3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qmsp.sdk.g.e.c.a(android.content.Context, com.tencent.qmsp.sdk.g.e.b):java.lang.String");
    }

    public final void a(Context context) {
        synchronized (this) {
            if (this.f902f == null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.meizu.flyme.openid.ACTION_OPEN_ID_CHANGE");
                a aVar = new a();
                this.f902f = aVar;
                context.registerReceiver(aVar, intentFilter, "com.meizu.flyme.openid.permission.OPEN_ID_CHANGE", (Handler) null);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r10.resolveContentProvider("com.meizu.flyme.openidsdk", 0) == null) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0080, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0083, code lost:
        if (r10 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0086, code lost:
        if (r10 != null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0088, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008b, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0080 A[ExcHandler: all (r9v1 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r10 
      PHI: (r10v4 android.database.Cursor) = (r10v2 android.database.Cursor), (r10v2 android.database.Cursor), (r10v5 android.database.Cursor), (r10v5 android.database.Cursor), (r10v5 android.database.Cursor), (r10v5 android.database.Cursor), (r10v5 android.database.Cursor) binds: [B:15:0x0036, B:18:0x003e, B:23:0x0050, B:24:?, B:26:0x005d, B:27:?, B:29:0x006c] A[DONT_GENERATE, DONT_INLINE], Splitter:B:15:0x0036] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.content.Context r9, boolean r10) {
        /*
            r8 = this;
            java.lang.Boolean r0 = r8.f901e
            r1 = 0
            if (r0 == 0) goto L_0x000d
            if (r10 != 0) goto L_0x000d
            boolean r1 = r0.booleanValue()
            goto L_0x0091
        L_0x000d:
            if (r9 != 0) goto L_0x0011
        L_0x000f:
            r0 = 0
            goto L_0x0023
        L_0x0011:
            android.content.pm.PackageManager r10 = r9.getPackageManager()
            if (r10 != 0) goto L_0x0019
            r0 = 0
            goto L_0x001a
        L_0x0019:
            r0 = 1
        L_0x001a:
            java.lang.String r2 = "com.meizu.flyme.openidsdk"
            android.content.pm.ProviderInfo r10 = r10.resolveContentProvider(r2, r1)
            if (r10 != 0) goto L_0x0023
            goto L_0x000f
        L_0x0023:
            if (r0 != 0) goto L_0x002f
            java.lang.String r9 = "is not Supported, for isLegalProvider : false"
            b(r9)
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r8.f901e = r9
            goto L_0x0091
        L_0x002f:
            java.lang.String r10 = "content://com.meizu.flyme.openidsdk/"
            android.net.Uri r3 = android.net.Uri.parse(r10)
            r10 = 0
            android.content.ContentResolver r2 = r9.getContentResolver()     // Catch:{ Exception -> 0x004e, all -> 0x0080 }
            r4 = 0
            r5 = 0
            java.lang.String r9 = "supported"
            java.lang.String[] r6 = new java.lang.String[]{r9}     // Catch:{ Exception -> 0x004e, all -> 0x0080 }
            r7 = 0
            android.database.Cursor r10 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x004e, all -> 0x0080 }
            if (r10 != 0) goto L_0x0050
            java.lang.Boolean r9 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x004e, all -> 0x0080 }
            r8.f901e = r9     // Catch:{ Exception -> 0x004e, all -> 0x0080 }
            goto L_0x0050
        L_0x004e:
            goto L_0x008c
        L_0x0050:
            com.tencent.qmsp.sdk.g.e.e r9 = a((android.database.Cursor) r10)     // Catch:{ Exception -> 0x0082, all -> 0x0080 }
            java.lang.String r9 = r9.c     // Catch:{ Exception -> 0x0082, all -> 0x0080 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0082, all -> 0x0080 }
            r0.<init>()     // Catch:{ Exception -> 0x0082, all -> 0x0080 }
            java.lang.String r2 = "querySupport, result : "
            r0.append(r2)     // Catch:{ Exception -> 0x0082, all -> 0x0080 }
            r0.append(r9)     // Catch:{ Exception -> 0x0082, all -> 0x0080 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0082, all -> 0x0080 }
            b(r0)     // Catch:{ Exception -> 0x0082, all -> 0x0080 }
            java.lang.String r0 = "0"
            boolean r9 = r0.equals(r9)     // Catch:{ Exception -> 0x0082, all -> 0x0080 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch:{ Exception -> 0x0082, all -> 0x0080 }
            r8.f901e = r9     // Catch:{ Exception -> 0x0082, all -> 0x0080 }
            boolean r9 = r9.booleanValue()     // Catch:{ Exception -> 0x0082, all -> 0x0080 }
            if (r10 == 0) goto L_0x007f
            r10.close()
        L_0x007f:
            return r9
        L_0x0080:
            r9 = move-exception
            goto L_0x0086
        L_0x0082:
            if (r10 == 0) goto L_0x0091
            goto L_0x008e
        L_0x0086:
            if (r10 == 0) goto L_0x008b
            r10.close()
        L_0x008b:
            throw r9
        L_0x008c:
            if (r10 == 0) goto L_0x0091
        L_0x008e:
            r10.close()
        L_0x0091:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qmsp.sdk.g.e.c.a(android.content.Context, boolean):boolean");
    }
}
