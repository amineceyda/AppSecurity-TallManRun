package com.tencent.beacon.a.c;

import android.app.ActivityManager;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.common.ConnectionResult;
import com.tencent.beacon.a.d.a;
import com.tencent.beacon.base.net.b.e;
import com.tencent.beacon.base.util.b;
import com.tencent.beacon.base.util.c;
import com.tencent.beacon.base.util.d;
import com.tencent.raft.measure.utils.MeasureConst;
import g.a.a.a.a;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import org.slf4j.Marker;

public class e implements e.a {
    private static volatile e a;
    private final Context b;
    private String c = "";

    /* renamed from: d  reason: collision with root package name */
    private String f601d = "";

    /* renamed from: e  reason: collision with root package name */
    private String f602e = "";

    /* renamed from: f  reason: collision with root package name */
    private String f603f = "";

    /* renamed from: g  reason: collision with root package name */
    private String f604g = "";

    private e() {
        Context c2 = c.d().c();
        this.b = c2;
        com.tencent.beacon.base.net.b.e.a(c2, this);
        F();
    }

    private void F() {
        this.f603f = G();
    }

    private String G() {
        NetworkInfo activeNetworkInfo;
        String str = "unknown";
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.b.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return str;
            }
            if (activeNetworkInfo.getType() == 1) {
                str = "wifi";
            } else if (activeNetworkInfo.getType() == 0) {
                TelephonyManager telephonyManager = (TelephonyManager) this.b.getSystemService("phone");
                if (telephonyManager != null) {
                    int networkType = telephonyManager.getNetworkType();
                    if (networkType != 20) {
                        switch (networkType) {
                            case 1:
                            case 2:
                            case 4:
                            case 7:
                            case 11:
                                str = "2G";
                                break;
                            case 3:
                            case 5:
                            case 6:
                            case 8:
                            case 9:
                            case 10:
                            case 12:
                            case ConnectionResult.TIMEOUT:
                            case ConnectionResult.INTERRUPTED:
                                str = "3G";
                                break;
                            case ConnectionResult.CANCELED:
                                str = "4G";
                                break;
                            default:
                                StringBuilder sb = new StringBuilder();
                                sb.append("unknown_");
                                sb.append(telephonyManager.getNetworkType());
                                str = sb.toString();
                                break;
                        }
                    } else {
                        str = "5G";
                    }
                }
            }
            c.a(a.w("[DeviceInfo] NetWork Type:", str), new Object[0]);
            return str;
        } catch (Exception e2) {
            c.a((Throwable) e2);
        }
    }

    public static e l() {
        if (a == null) {
            synchronized (e.class) {
                if (a == null) {
                    a = new e();
                }
            }
        }
        return a;
    }

    public String A() {
        String str;
        String str2;
        String str3;
        c.a("[model] getSensor2 start", new Object[0]);
        String str4 = "Y";
        String str5 = B() ? str4 : "N";
        String str6 = "X";
        if (Integer.parseInt(Build.VERSION.SDK) >= 10) {
            try {
                SensorManager sensorManager = (SensorManager) this.b.getSystemService("sensor");
                str3 = sensorManager.getDefaultSensor(1) != null ? str4 : "N";
                try {
                    str2 = sensorManager.getDefaultSensor(5) != null ? str4 : "N";
                    try {
                        str = BluetoothAdapter.getDefaultAdapter() == null ? "N" : str4;
                    } catch (Throwable unused) {
                        str = str6;
                        c.b("[model] getSensor2 error!", new Object[0]);
                        str4 = str6;
                        str6 = str3;
                        return a.d(str5, str6, str2, str, str4);
                    }
                } catch (Throwable unused2) {
                    str2 = str6;
                    str = str2;
                    c.b("[model] getSensor2 error!", new Object[0]);
                    str4 = str6;
                    str6 = str3;
                    return a.d(str5, str6, str2, str, str4);
                }
                try {
                    if (!this.b.getPackageManager().hasSystemFeature("android.hardware.nfc")) {
                        str4 = "N";
                    }
                } catch (Throwable unused3) {
                    c.b("[model] getSensor2 error!", new Object[0]);
                    str4 = str6;
                    str6 = str3;
                    return a.d(str5, str6, str2, str, str4);
                }
            } catch (Throwable unused4) {
                str2 = str6;
                str3 = str2;
                str = str3;
                c.b("[model] getSensor2 error!", new Object[0]);
                str4 = str6;
                str6 = str3;
                return a.d(str5, str6, str2, str, str4);
            }
            str6 = str3;
        } else {
            str4 = str6;
            str2 = str4;
            str = str2;
        }
        return a.d(str5, str6, str2, str, str4);
    }

    public boolean B() {
        return ((WifiManager) this.b.getSystemService("wifi")) != null;
    }

    public void C() {
        String string = com.tencent.beacon.a.d.a.a().getString("BEACON_ANDROID_ID_DENGTA", "");
        this.c = string;
        if (TextUtils.isEmpty(string)) {
            this.c = b.a();
            a.C0005a edit = com.tencent.beacon.a.d.a.a().edit();
            if (b.a((SharedPreferences.Editor) edit)) {
                edit.putString("BEACON_ANDROID_ID_DENGTA", this.c);
            }
        }
    }

    public boolean D() {
        BufferedReader bufferedReader;
        boolean z;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(new String[]{"/system/bin/cat", "/proc/cpuinfo"}).getInputStream(), Charset.defaultCharset()));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        if (-1 != readLine.toLowerCase().indexOf("armv7")) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        c.a(th);
                        return false;
                    } finally {
                        b.a(bufferedReader);
                    }
                }
            }
            b.a(bufferedReader);
            return z;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
            c.a(th);
            return false;
        }
    }

    public String E() {
        if (TextUtils.isEmpty(this.f604g)) {
            try {
                Class<?> cls = Class.forName("com.huawei.system.BuildEx");
                String str = "harmony".equals(cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0])) ? "Y" : "N";
                this.f604g = str;
                return str;
            } catch (Throwable unused) {
                this.f604g = "N";
            }
        }
        return this.f604g;
    }

    public String a(Context context) {
        try {
            if (Integer.parseInt(Build.VERSION.SDK) < 9) {
                c.b("[audit] Api level < 9;return null!", new Object[0]);
                return "";
            }
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            StringBuilder sb = new StringBuilder();
            sb.append("[audit] get app_last_updated_time:");
            sb.append(String.valueOf(packageInfo.lastUpdateTime));
            c.a(sb.toString(), new Object[0]);
            return String.valueOf(packageInfo.lastUpdateTime);
        } catch (Throwable th) {
            c.a(th);
            c.b("[audit] get app_last_updated_time failed!", new Object[0]);
            return "";
        }
    }

    public void a() {
        F();
    }

    public void b() {
        F();
    }

    public boolean c() {
        return Environment.getExternalStorageState().equals("mounted");
    }

    public String d() {
        return this.c;
    }

    public int e() {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(new String[]{"/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"}).getInputStream(), Charset.forName(MeasureConst.CHARSET_UTF8)));
            try {
                String readLine = bufferedReader.readLine();
                int parseInt = readLine != null ? Integer.parseInt(readLine.trim()) / 1000 : 0;
                b.a(bufferedReader);
                return parseInt;
            } catch (Throwable th) {
                th = th;
                try {
                    c.a(th);
                    return 0;
                } finally {
                    b.a(bufferedReader);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
            c.a(th);
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r0 = r1.substring(r1.indexOf(com.tencent.raft.codegenmeta.utils.Constants.KEY_INDEX_FILE_SEPARATOR) + 1).trim();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String f() {
        /*
            r7 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "/system/bin/cat"
            java.lang.String r2 = "/proc/cpuinfo"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            r2 = 0
            r3 = 1
            java.lang.Runtime r4 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x004f }
            java.lang.Process r1 = r4.exec(r1)     // Catch:{ all -> 0x004f }
            java.io.InputStream r1 = r1.getInputStream()     // Catch:{ all -> 0x004f }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ all -> 0x004f }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ all -> 0x004f }
            java.lang.String r6 = "UTF-8"
            java.nio.charset.Charset r6 = java.nio.charset.Charset.forName(r6)     // Catch:{ all -> 0x004f }
            r5.<init>(r1, r6)     // Catch:{ all -> 0x004f }
            r4.<init>(r5)     // Catch:{ all -> 0x004f }
        L_0x0028:
            java.lang.String r1 = r4.readLine()     // Catch:{ all -> 0x004d }
            if (r1 == 0) goto L_0x0045
            java.lang.String r5 = "Processor"
            boolean r5 = r1.contains(r5)     // Catch:{ all -> 0x004d }
            if (r5 == 0) goto L_0x0028
            java.lang.String r5 = ":"
            int r5 = r1.indexOf(r5)     // Catch:{ all -> 0x004d }
            int r5 = r5 + r3
            java.lang.String r1 = r1.substring(r5)     // Catch:{ all -> 0x004d }
            java.lang.String r0 = r1.trim()     // Catch:{ all -> 0x004d }
        L_0x0045:
            java.io.Closeable[] r1 = new java.io.Closeable[r3]
            r1[r2] = r4
            com.tencent.beacon.base.util.b.a((java.io.Closeable[]) r1)
            goto L_0x005b
        L_0x004d:
            r1 = move-exception
            goto L_0x0051
        L_0x004f:
            r1 = move-exception
            r4 = 0
        L_0x0051:
            com.tencent.beacon.base.util.c.a((java.lang.Throwable) r1)     // Catch:{ all -> 0x005c }
            java.io.Closeable[] r1 = new java.io.Closeable[r3]
            r1[r2] = r4
            com.tencent.beacon.base.util.b.a((java.io.Closeable[]) r1)
        L_0x005b:
            return r0
        L_0x005c:
            r0 = move-exception
            java.io.Closeable[] r1 = new java.io.Closeable[r3]
            r1[r2] = r4
            com.tencent.beacon.base.util.b.a((java.io.Closeable[]) r1)
            goto L_0x0066
        L_0x0065:
            throw r0
        L_0x0066:
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.beacon.a.c.e.f():java.lang.String");
    }

    public String g() {
        return Locale.getDefault().getCountry();
    }

    public String h() {
        return Build.HARDWARE;
    }

    public DisplayMetrics i() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) this.b.getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    public long j() {
        ActivityManager activityManager = (ActivityManager) this.b.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager == null) {
            return -1;
        }
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public String k() {
        long j2 = j();
        if (j2 <= 0) {
            return "0";
        }
        return ((j2 / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) + "";
    }

    public boolean m() {
        return d.d();
    }

    public String n() {
        return Locale.getDefault().getLanguage();
    }

    public String o() {
        return Build.MANUFACTURER;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:35|34|37|38|39|40|41) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        com.tencent.beacon.base.util.c.a("getNandInfo error", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        com.tencent.beacon.base.util.b.a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        com.tencent.beacon.base.util.c.a("getNandInfo error", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0067, code lost:
        com.tencent.beacon.base.util.b.a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0095, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b3, code lost:
        r6 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00bc, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00bd, code lost:
        r2 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c6, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c7, code lost:
        r2 = r5;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0062 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0097 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String p() {
        /*
            r10 = this;
            java.lang.String r0 = "getNandInfo error"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
            r3 = 1
            r4 = 0
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ Exception -> 0x002d, all -> 0x002a }
            java.io.FileReader r6 = new java.io.FileReader     // Catch:{ Exception -> 0x002d, all -> 0x002a }
            java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x002d, all -> 0x002a }
            java.lang.String r8 = "/sys/block/mmcblk0/device/type"
            r7.<init>(r8)     // Catch:{ Exception -> 0x002d, all -> 0x002a }
            r6.<init>(r7)     // Catch:{ Exception -> 0x002d, all -> 0x002a }
            r5.<init>(r6)     // Catch:{ Exception -> 0x002d, all -> 0x002a }
            java.lang.String r6 = r5.readLine()     // Catch:{ Exception -> 0x002e }
            r1.append(r6)     // Catch:{ Exception -> 0x002e }
            java.io.Closeable[] r6 = new java.io.Closeable[r3]
            r6[r4] = r5
            com.tencent.beacon.base.util.b.a((java.io.Closeable[]) r6)
            goto L_0x003a
        L_0x002a:
            r0 = move-exception
            goto L_0x00c8
        L_0x002d:
            r5 = r2
        L_0x002e:
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x00c6 }
            com.tencent.beacon.base.util.c.a((java.lang.String) r0, (java.lang.Object[]) r6)     // Catch:{ all -> 0x00c6 }
            java.io.Closeable[] r6 = new java.io.Closeable[r3]
            r6[r4] = r5
            com.tencent.beacon.base.util.b.a((java.io.Closeable[]) r6)
        L_0x003a:
            java.lang.String r5 = ","
            r1.append(r5)
            java.lang.String r6 = "/sys/block/mmcblk0/device/name"
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0061, all -> 0x005f }
            java.io.FileReader r8 = new java.io.FileReader     // Catch:{ Exception -> 0x0061, all -> 0x005f }
            java.io.File r9 = new java.io.File     // Catch:{ Exception -> 0x0061, all -> 0x005f }
            r9.<init>(r6)     // Catch:{ Exception -> 0x0061, all -> 0x005f }
            r8.<init>(r9)     // Catch:{ Exception -> 0x0061, all -> 0x005f }
            r7.<init>(r8)     // Catch:{ Exception -> 0x0061, all -> 0x005f }
            java.lang.String r6 = r7.readLine()     // Catch:{ Exception -> 0x0062 }
            r1.append(r6)     // Catch:{ Exception -> 0x0062 }
            java.io.Closeable[] r6 = new java.io.Closeable[r3]
            r6[r4] = r7
            com.tencent.beacon.base.util.b.a((java.io.Closeable[]) r6)
            goto L_0x006e
        L_0x005f:
            r0 = move-exception
            goto L_0x00be
        L_0x0061:
            r7 = r2
        L_0x0062:
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x00bc }
            com.tencent.beacon.base.util.c.a((java.lang.String) r0, (java.lang.Object[]) r6)     // Catch:{ all -> 0x00bc }
            java.io.Closeable[] r6 = new java.io.Closeable[r3]
            r6[r4] = r7
            com.tencent.beacon.base.util.b.a((java.io.Closeable[]) r6)
        L_0x006e:
            r1.append(r5)
            java.lang.String r5 = "/sys/block/mmcblk0/device/cid"
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0097 }
            java.io.FileReader r7 = new java.io.FileReader     // Catch:{ Exception -> 0x0097 }
            java.io.File r8 = new java.io.File     // Catch:{ Exception -> 0x0097 }
            r8.<init>(r5)     // Catch:{ Exception -> 0x0097 }
            r7.<init>(r8)     // Catch:{ Exception -> 0x0097 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x0097 }
            java.lang.String r2 = r6.readLine()     // Catch:{ Exception -> 0x0093, all -> 0x0091 }
            r1.append(r2)     // Catch:{ Exception -> 0x0093, all -> 0x0091 }
            java.io.Closeable[] r0 = new java.io.Closeable[r3]
            r0[r4] = r6
            com.tencent.beacon.base.util.b.a((java.io.Closeable[]) r0)
            goto L_0x00a3
        L_0x0091:
            r0 = move-exception
            goto L_0x00b4
        L_0x0093:
            r2 = r6
            goto L_0x0097
        L_0x0095:
            r0 = move-exception
            goto L_0x00b3
        L_0x0097:
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x0095 }
            com.tencent.beacon.base.util.c.a((java.lang.String) r0, (java.lang.Object[]) r5)     // Catch:{ all -> 0x0095 }
            java.io.Closeable[] r0 = new java.io.Closeable[r3]
            r0[r4] = r2
            com.tencent.beacon.base.util.b.a((java.io.Closeable[]) r0)
        L_0x00a3:
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "[DeviceInfo] Nand Info:"
            java.lang.String r1 = g.a.a.a.a.w(r1, r0)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            com.tencent.beacon.base.util.c.a((java.lang.String) r1, (java.lang.Object[]) r2)
            return r0
        L_0x00b3:
            r6 = r2
        L_0x00b4:
            java.io.Closeable[] r1 = new java.io.Closeable[r3]
            r1[r4] = r6
            com.tencent.beacon.base.util.b.a((java.io.Closeable[]) r1)
            throw r0
        L_0x00bc:
            r0 = move-exception
            r2 = r7
        L_0x00be:
            java.io.Closeable[] r1 = new java.io.Closeable[r3]
            r1[r4] = r2
            com.tencent.beacon.base.util.b.a((java.io.Closeable[]) r1)
            throw r0
        L_0x00c6:
            r0 = move-exception
            r2 = r5
        L_0x00c8:
            java.io.Closeable[] r1 = new java.io.Closeable[r3]
            r1[r4] = r2
            com.tencent.beacon.base.util.b.a((java.io.Closeable[]) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.beacon.a.c.e.p():java.lang.String");
    }

    public String q() {
        return this.f603f;
    }

    public int r() {
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new d(this));
            if (listFiles == null) {
                return 1;
            }
            return listFiles.length;
        } catch (Exception e2) {
            c.b("[model] CPU Count: Failed.", new Object[0]);
            c.a((Throwable) e2);
            return 1;
        }
    }

    public String s() {
        if (!TextUtils.isEmpty(this.f601d)) {
            return this.f601d;
        }
        StringBuilder i2 = g.a.a.a.a.i("Android ");
        i2.append(Build.VERSION.RELEASE);
        i2.append(",level ");
        i2.append(Build.VERSION.SDK);
        String sb = i2.toString();
        this.f601d = sb;
        c.a("[DeviceInfo] os version: %s", sb);
        return this.f601d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x007e A[SYNTHETIC, Splitter:B:33:0x007e] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0086 A[Catch:{ all -> 0x0082 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String t() {
        /*
            r10 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "[model] IO close error!"
            java.lang.String r2 = "/proc/meminfo"
            r3 = 0
            r4 = 0
            java.io.FileReader r5 = new java.io.FileReader     // Catch:{ all -> 0x006f }
            r5.<init>(r2)     // Catch:{ all -> 0x006f }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x006c }
            r6 = 8192(0x2000, float:1.14794E-41)
            r2.<init>(r5, r6)     // Catch:{ all -> 0x006c }
            java.lang.String r6 = r2.readLine()     // Catch:{ all -> 0x006a }
            if (r6 == 0) goto L_0x0059
            java.lang.String r7 = ":\\s+"
            r8 = 2
            java.lang.String[] r6 = r6.split(r7, r8)     // Catch:{ all -> 0x006a }
            r7 = 1
            r6 = r6[r7]     // Catch:{ all -> 0x006a }
            java.lang.String r6 = r6.toLowerCase()     // Catch:{ all -> 0x006a }
            java.lang.String r7 = "kb"
            java.lang.String r6 = r6.replace(r7, r0)     // Catch:{ all -> 0x006a }
            java.lang.String r6 = r6.trim()     // Catch:{ all -> 0x006a }
            long r6 = java.lang.Long.parseLong(r6)     // Catch:{ all -> 0x006a }
            r8 = 1024(0x400, double:5.06E-321)
            long r6 = r6 / r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x006a }
            r8.<init>()     // Catch:{ all -> 0x006a }
            r8.append(r6)     // Catch:{ all -> 0x006a }
            r8.append(r0)     // Catch:{ all -> 0x006a }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x006a }
            r2.close()     // Catch:{ all -> 0x004f }
            r5.close()     // Catch:{ all -> 0x004f }
            goto L_0x0058
        L_0x004f:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r4]
            com.tencent.beacon.base.util.c.b(r1, r3)
            com.tencent.beacon.base.util.c.a((java.lang.Throwable) r2)
        L_0x0058:
            return r0
        L_0x0059:
            r2.close()     // Catch:{ all -> 0x0060 }
            r5.close()     // Catch:{ all -> 0x0060 }
            goto L_0x0090
        L_0x0060:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r4]
            com.tencent.beacon.base.util.c.b(r1, r2)
        L_0x0066:
            com.tencent.beacon.base.util.c.a((java.lang.Throwable) r0)
            goto L_0x0090
        L_0x006a:
            r0 = move-exception
            goto L_0x0072
        L_0x006c:
            r0 = move-exception
            r2 = r3
            goto L_0x0072
        L_0x006f:
            r0 = move-exception
            r2 = r3
            r5 = r2
        L_0x0072:
            java.lang.String r6 = "[model] get free RAM error!"
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ all -> 0x0091 }
            com.tencent.beacon.base.util.c.b(r6, r7)     // Catch:{ all -> 0x0091 }
            com.tencent.beacon.base.util.c.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x0091 }
            if (r2 == 0) goto L_0x0084
            r2.close()     // Catch:{ all -> 0x0082 }
            goto L_0x0084
        L_0x0082:
            r0 = move-exception
            goto L_0x008a
        L_0x0084:
            if (r5 == 0) goto L_0x0090
            r5.close()     // Catch:{ all -> 0x0082 }
            goto L_0x0090
        L_0x008a:
            java.lang.Object[] r2 = new java.lang.Object[r4]
            com.tencent.beacon.base.util.c.b(r1, r2)
            goto L_0x0066
        L_0x0090:
            return r3
        L_0x0091:
            r0 = move-exception
            if (r2 == 0) goto L_0x009a
            r2.close()     // Catch:{ all -> 0x0098 }
            goto L_0x009a
        L_0x0098:
            r2 = move-exception
            goto L_0x00a0
        L_0x009a:
            if (r5 == 0) goto L_0x00a8
            r5.close()     // Catch:{ all -> 0x0098 }
            goto L_0x00a8
        L_0x00a0:
            java.lang.Object[] r3 = new java.lang.Object[r4]
            com.tencent.beacon.base.util.c.b(r1, r3)
            com.tencent.beacon.base.util.c.a((java.lang.Throwable) r2)
        L_0x00a8:
            goto L_0x00aa
        L_0x00a9:
            throw r0
        L_0x00aa:
            goto L_0x00a9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.beacon.a.c.e.t():java.lang.String");
    }

    public String u() {
        DisplayMetrics i2 = i();
        if (i2 == null) {
            return "";
        }
        return i2.widthPixels + Marker.ANY_MARKER + i2.heightPixels;
    }

    public String v() {
        ArrayList<String> a2 = b.a(new String[]{"/system/bin/sh", "-c", "getprop ro.build.fingerprint"});
        return (a2 == null || a2.size() <= 0) ? "" : a2.get(0);
    }

    public String w() {
        if (!TextUtils.isEmpty(this.f602e)) {
            return this.f602e;
        }
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockSize = (long) statFs.getBlockSize();
        this.f602e = (((((long) statFs.getBlockCount()) * blockSize) / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) + "";
        StringBuilder i2 = g.a.a.a.a.i("[DeviceInfo] Rom Size:");
        i2.append(this.f602e);
        c.a(i2.toString(), new Object[0]);
        return this.f602e;
    }

    public long x() {
        if (!c()) {
            return 0;
        }
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return ((((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        } catch (Throwable th) {
            c.a(th);
            return 0;
        }
    }

    public int y() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) this.b.getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            double d2 = (double) displayMetrics.density;
            Double.isNaN(d2);
            if (d2 - 0.75d <= 1.0E-6d) {
                return 120;
            }
            Double.isNaN(d2);
            if (d2 - 1.5d <= 1.0E-6d) {
                return 240;
            }
            Double.isNaN(d2);
            if (d2 - 2.0d <= 1.0E-6d) {
                return 320;
            }
            Double.isNaN(d2);
            if (d2 - 3.0d <= 1.0E-6d) {
                return 480;
            }
        }
        return 160;
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c7 A[Catch:{ all -> 0x00e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String z() {
        /*
            r18 = this;
            r1 = 0
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r2 = "[DeviceInfo] getSensor start"
            com.tencent.beacon.base.util.c.a((java.lang.String) r2, (java.lang.Object[]) r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = android.os.Build.VERSION.SDK
            int r0 = java.lang.Integer.parseInt(r0)
            java.lang.String r3 = "Y"
            java.lang.String r4 = "X"
            java.lang.String r5 = "N"
            r6 = 10
            if (r0 < r6) goto L_0x00f8
            java.lang.String r0 = "android.hardware.Camera"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x00e4 }
            java.lang.String r6 = "getNumberOfCameras"
            java.lang.Class[] r7 = new java.lang.Class[r1]     // Catch:{ all -> 0x00e4 }
            java.lang.reflect.Method r6 = r0.getMethod(r6, r7)     // Catch:{ all -> 0x00e4 }
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ all -> 0x00e4 }
            java.lang.Object r6 = r6.invoke(r0, r7)     // Catch:{ all -> 0x00e4 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x00e4 }
            int r6 = r6.intValue()     // Catch:{ all -> 0x00e4 }
            if (r6 != 0) goto L_0x003f
            r1 = r18
            r13 = r5
        L_0x003c:
            r14 = r13
            goto L_0x00bb
        L_0x003f:
            java.lang.String r7 = "android.hardware.Camera$CameraInfo"
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x00e4 }
            java.lang.Object r8 = r7.newInstance()     // Catch:{ all -> 0x00e4 }
            java.lang.reflect.Method[] r9 = r0.getMethods()     // Catch:{ all -> 0x00e4 }
            r10 = 0
            int r11 = r9.length     // Catch:{ all -> 0x00e4 }
            r12 = 0
        L_0x0050:
            if (r12 >= r11) goto L_0x0065
            r13 = r9[r12]     // Catch:{ all -> 0x00e4 }
            java.lang.String r14 = r13.getName()     // Catch:{ all -> 0x00e4 }
            java.lang.String r15 = "getCameraInfo"
            boolean r14 = r14.equals(r15)     // Catch:{ all -> 0x00e4 }
            if (r14 == 0) goto L_0x0062
            r10 = r13
            goto L_0x0065
        L_0x0062:
            int r12 = r12 + 1
            goto L_0x0050
        L_0x0065:
            java.lang.String r9 = "facing"
            java.lang.reflect.Field r9 = r7.getField(r9)     // Catch:{ all -> 0x00e4 }
            java.lang.String r11 = "CAMERA_FACING_BACK"
            java.lang.reflect.Field r11 = r7.getField(r11)     // Catch:{ all -> 0x00e4 }
            java.lang.String r12 = "CAMERA_FACING_FRONT"
            java.lang.reflect.Field r7 = r7.getField(r12)     // Catch:{ all -> 0x00e4 }
            if (r10 == 0) goto L_0x00b7
            r13 = r4
            r14 = r13
            r12 = 0
        L_0x007c:
            if (r12 >= r6) goto L_0x00b4
            r15 = 2
            java.lang.Object[] r15 = new java.lang.Object[r15]     // Catch:{ all -> 0x00b0 }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x00b0 }
            r15[r1] = r16     // Catch:{ all -> 0x00b0 }
            r1 = 1
            r15[r1] = r8     // Catch:{ all -> 0x00b0 }
            r10.invoke(r0, r15)     // Catch:{ all -> 0x00b0 }
            int r15 = r9.getInt(r8)     // Catch:{ all -> 0x00b0 }
            int r1 = r11.getInt(r8)     // Catch:{ all -> 0x00b0 }
            r17 = r0
            int r0 = r7.getInt(r8)     // Catch:{ all -> 0x00b0 }
            if (r15 != r1) goto L_0x00a3
            r1 = 1
            r13 = r3
            if (r6 != r1) goto L_0x00aa
            r14 = r5
            goto L_0x00aa
        L_0x00a3:
            r1 = 1
            if (r15 != r0) goto L_0x00aa
            r14 = r3
            if (r6 != r1) goto L_0x00aa
            r13 = r5
        L_0x00aa:
            int r12 = r12 + 1
            r0 = r17
            r1 = 0
            goto L_0x007c
        L_0x00b0:
            r0 = move-exception
            r1 = r18
            goto L_0x00e2
        L_0x00b4:
            r1 = r18
            goto L_0x00bb
        L_0x00b7:
            r1 = r18
            r13 = r4
            goto L_0x003c
        L_0x00bb:
            android.content.Context r0 = r1.b     // Catch:{ all -> 0x00e1 }
            java.lang.String r6 = "sensor"
            java.lang.Object r0 = r0.getSystemService(r6)     // Catch:{ all -> 0x00e1 }
            android.hardware.SensorManager r0 = (android.hardware.SensorManager) r0     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x00de
            r6 = 9
            android.hardware.Sensor r6 = r0.getDefaultSensor(r6)     // Catch:{ all -> 0x00e1 }
            if (r6 == 0) goto L_0x00d1
            r6 = r3
            goto L_0x00d2
        L_0x00d1:
            r6 = r5
        L_0x00d2:
            r7 = 4
            android.hardware.Sensor r0 = r0.getDefaultSensor(r7)     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x00da
            goto L_0x00f6
        L_0x00da:
            r3 = r5
            goto L_0x00f6
        L_0x00dc:
            r0 = move-exception
            goto L_0x00ea
        L_0x00de:
            r3 = r4
            r6 = r3
            goto L_0x00f6
        L_0x00e1:
            r0 = move-exception
        L_0x00e2:
            r6 = r4
            goto L_0x00ea
        L_0x00e4:
            r0 = move-exception
            r1 = r18
            r6 = r4
            r13 = r6
            r14 = r13
        L_0x00ea:
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r5 = "[model] getSensor error!"
            com.tencent.beacon.base.util.c.b(r5, r3)
            com.tencent.beacon.base.util.c.a((java.lang.Throwable) r0)
            r3 = r4
        L_0x00f6:
            r4 = r13
            goto L_0x00fd
        L_0x00f8:
            r1 = r18
            r3 = r4
            r6 = r3
            r14 = r6
        L_0x00fd:
            r2.append(r4)
            r2.append(r14)
            r2.append(r6)
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.beacon.a.c.e.z():java.lang.String");
    }
}
