package g.e.b.l.j.j;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.os.Debug;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import g.e.b.l.j.f;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class l {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static long b = -1;

    public enum a {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        

        /* renamed from: l  reason: collision with root package name */
        public static final Map<String, a> f3514l = null;

        /* access modifiers changed from: public */
        static {
            a aVar;
            a aVar2;
            a aVar3;
            a aVar4;
            HashMap hashMap = new HashMap(4);
            f3514l = hashMap;
            hashMap.put("armeabi-v7a", aVar3);
            hashMap.put("armeabi", aVar2);
            hashMap.put("arm64-v8a", aVar4);
            hashMap.put("x86", aVar);
        }
    }

    public static void a(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                if (f.a.a(6)) {
                    Log.e("FirebaseCrashlytics", str, e2);
                }
            }
        }
    }

    public static long b(String str, String str2, int i2) {
        return Long.parseLong(str.split(str2)[0].trim()) * ((long) i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String c(java.io.File r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "Failed to close system file reader."
            boolean r1 = r6.exists()
            r2 = 0
            if (r1 == 0) goto L_0x005d
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
            r3.<init>(r6)     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r3, r4)     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
        L_0x0015:
            java.lang.String r3 = r1.readLine()     // Catch:{ Exception -> 0x0037 }
            if (r3 == 0) goto L_0x0053
            java.lang.String r4 = "\\s*:\\s*"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)     // Catch:{ Exception -> 0x0037 }
            r5 = 2
            java.lang.String[] r3 = r4.split(r3, r5)     // Catch:{ Exception -> 0x0037 }
            int r4 = r3.length     // Catch:{ Exception -> 0x0037 }
            r5 = 1
            if (r4 <= r5) goto L_0x0015
            r4 = 0
            r4 = r3[r4]     // Catch:{ Exception -> 0x0037 }
            boolean r4 = r4.equals(r7)     // Catch:{ Exception -> 0x0037 }
            if (r4 == 0) goto L_0x0015
            r6 = r3[r5]     // Catch:{ Exception -> 0x0037 }
            r2 = r6
            goto L_0x0053
        L_0x0037:
            r7 = move-exception
            goto L_0x003d
        L_0x0039:
            r6 = move-exception
            goto L_0x0059
        L_0x003b:
            r7 = move-exception
            r1 = r2
        L_0x003d:
            g.e.b.l.j.f r3 = g.e.b.l.j.f.a     // Catch:{ all -> 0x0057 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0057 }
            r4.<init>()     // Catch:{ all -> 0x0057 }
            java.lang.String r5 = "Error parsing "
            r4.append(r5)     // Catch:{ all -> 0x0057 }
            r4.append(r6)     // Catch:{ all -> 0x0057 }
            java.lang.String r6 = r4.toString()     // Catch:{ all -> 0x0057 }
            r3.d(r6, r7)     // Catch:{ all -> 0x0057 }
        L_0x0053:
            a(r1, r0)
            goto L_0x005d
        L_0x0057:
            r6 = move-exception
            r2 = r1
        L_0x0059:
            a(r2, r0)
            throw r6
        L_0x005d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.b.l.j.j.l.c(java.io.File, java.lang.String):java.lang.String");
    }

    public static int d(Context context) {
        boolean z = true;
        int i2 = j(context) ? 1 : 0;
        if (k(context)) {
            i2 |= 2;
        }
        if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger()) {
            z = false;
        }
        return z ? i2 | 4 : i2;
    }

    public static String e(Context context) {
        int f2 = f(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (f2 == 0) {
            f2 = f(context, "com.crashlytics.android.build_id", "string");
        }
        if (f2 != 0) {
            return context.getResources().getString(f2);
        }
        return null;
    }

    public static int f(Context context, String str, String str2) {
        String str3;
        Resources resources = context.getResources();
        int i2 = context.getApplicationContext().getApplicationInfo().icon;
        if (i2 > 0) {
            try {
                str3 = context.getResources().getResourcePackageName(i2);
                if ("android".equals(str3)) {
                    str3 = context.getPackageName();
                }
            } catch (Resources.NotFoundException unused) {
            }
            return resources.getIdentifier(str, str2, str3);
        }
        str3 = context.getPackageName();
        return resources.getIdentifier(str, str2, str3);
    }

    public static SharedPreferences g(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    public static synchronized long h() {
        long j2;
        synchronized (l.class) {
            if (b == -1) {
                long j3 = 0;
                String c = c(new File("/proc/meminfo"), "MemTotal");
                if (!TextUtils.isEmpty(c)) {
                    String upperCase = c.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            j3 = b(upperCase, "KB", 1024);
                        } else if (upperCase.endsWith("MB")) {
                            j3 = b(upperCase, "MB", 1048576);
                        } else if (upperCase.endsWith("GB")) {
                            j3 = b(upperCase, "GB", 1073741824);
                        } else {
                            f fVar = f.a;
                            fVar.f("Unexpected meminfo format while computing RAM: " + upperCase);
                        }
                    } catch (NumberFormatException e2) {
                        f fVar2 = f.a;
                        fVar2.d("Unexpected meminfo format while computing RAM: " + upperCase, e2);
                    }
                }
                b = j3;
            }
            j2 = b;
        }
        return j2;
    }

    public static String i(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b2 = bArr[i2] & 255;
            int i3 = i2 * 2;
            char[] cArr2 = a;
            cArr[i3] = cArr2[b2 >>> 4];
            cArr[i3 + 1] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public static boolean j(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (!Build.PRODUCT.contains("sdk")) {
            String str = Build.HARDWARE;
            return str.contains("goldfish") || str.contains("ranchu") || string == null;
        }
    }

    public static boolean k(Context context) {
        boolean j2 = j(context);
        String str = Build.TAGS;
        if ((!j2 && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        return !j2 && new File("/system/xbin/su").exists();
    }

    public static String l(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(bytes);
            return i(instance.digest());
        } catch (NoSuchAlgorithmException e2) {
            f fVar = f.a;
            fVar.d("Could not create hashing algorithm: " + "SHA-1" + ", returning empty string.", e2);
            return "";
        }
    }

    public static String m(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return useDelimiter.hasNext() ? useDelimiter.next() : "";
    }
}
