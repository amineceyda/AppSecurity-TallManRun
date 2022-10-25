package com.ola.qsea.d;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.ola.qsea.encrypt.U;
import com.ola.qsea.l.f;
import com.ola.qsea.m.a;
import com.ola.qsea.v.d;
import java.io.File;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

@SuppressLint({"MissingPermission"})
public class c {
    public static final c a = new c();
    public final Context b = d.b().F();
    public long c = 0;

    /* renamed from: d  reason: collision with root package name */
    public String f427d;

    /* renamed from: e  reason: collision with root package name */
    public String f428e;

    /* renamed from: f  reason: collision with root package name */
    public String f429f;

    /* renamed from: g  reason: collision with root package name */
    public String f430g;

    /* renamed from: h  reason: collision with root package name */
    public String f431h;

    /* renamed from: i  reason: collision with root package name */
    public String f432i;

    /* renamed from: j  reason: collision with root package name */
    public String f433j;

    /* renamed from: k  reason: collision with root package name */
    public String f434k;

    /* renamed from: l  reason: collision with root package name */
    public String f435l;

    /* renamed from: m  reason: collision with root package name */
    public String f436m;
    public Enumeration<NetworkInterface> n = null;

    public c() {
        E();
    }

    public static synchronized c n() {
        c cVar;
        synchronized (c.class) {
            cVar = a;
        }
        return cVar;
    }

    public synchronized String A() {
        if (this.f436m == null) {
            this.f436m = U.a();
        }
        return this.f436m;
    }

    public boolean B() {
        return Process.myUid() / 100000 != 0;
    }

    public boolean C() {
        String str = (String) f.a("com.huawei.system.BuildEx", "getOsBrand", new Class[0], new Object[0]);
        if (str == null) {
            return false;
        }
        return "harmony".equalsIgnoreCase(str);
    }

    public boolean D() {
        try {
            if (((UiModeManager) this.b.getSystemService("uimode")).getCurrentModeType() == 4) {
                return true;
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (!this.b.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    return this.b.getPackageManager().hasSystemFeature("android.software.leanback");
                }
            }
            return false;
        } catch (Throwable th) {
            a.a(th);
        }
    }

    public void E() {
        this.f429f = com.ola.qsea.j.a.a();
    }

    public final boolean a() {
        try {
            Intent registerReceiver = this.b.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            boolean z = registerReceiver.getIntExtra("status", -1) == 5;
            boolean z2 = registerReceiver.getIntExtra("plugged", -1) == 1;
            StringBuilder sb = new StringBuilder();
            sb.append("AC电流：： ");
            sb.append(z2);
            a.b("SDK_INIT ｜ DeviceInfo", sb.toString(), new Object[0]);
            return z && z2;
        } catch (Throwable th) {
            a.a(th);
            return false;
        }
    }

    public final boolean b() {
        boolean a2 = a();
        boolean c2 = c();
        a.b("SDK_INIT ｜ DeviceInfo", "batteryIsTV： " + a2 + "simIsTV: " + c2, new Object[0]);
        return a2 || c2;
    }

    public final boolean c() {
        TelephonyManager telephonyManager = (TelephonyManager) this.b.getSystemService("phone");
        return telephonyManager == null || telephonyManager.getPhoneType() == 0;
    }

    @SuppressLint({"HardwareIds"})
    public synchronized String d() {
        String str = this.f427d;
        if (str != null) {
            return str;
        }
        String str2 = "";
        Context context = this.b;
        if (context == null) {
            return str2;
        }
        try {
            str2 = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Exception e2) {
            a.a((Throwable) e2);
        }
        String lowerCase = str2 != null ? str2.toLowerCase() : "";
        this.f427d = lowerCase;
        a.d("[DeviceInfo] Android ID:%s", lowerCase);
        return lowerCase;
    }

    public synchronized String e() {
        if (this.f432i == null) {
            this.f432i = b.a(Build.VERSION.SDK_INT);
        }
        return this.f432i;
    }

    public synchronized String f() {
        String str = this.f433j;
        if (str != null) {
            return str;
        }
        String str2 = Build.MODEL;
        this.f433j = str2;
        a.a("[DeviceInfo] build model: %s", str2);
        return this.f433j;
    }

    public synchronized String g() {
        return "";
    }

    public final String h() {
        String c2 = com.ola.qsea.l.a.c("/proc/self/mountinfo");
        if (c2.isEmpty()) {
            return "";
        }
        if (c2.contains("/lxc_container/")) {
            return "lxc";
        }
        String replaceAll = com.ola.qsea.l.a.c("/proc/self/cpuset").replaceAll("[\\t\\n\\r]", "");
        return (!replaceAll.contains("/docker") || !c2.contains(replaceAll)) ? "" : "docker";
    }

    public final String i() {
        int indexOf;
        File file = new File("/");
        if (file.listFiles() == null) {
            return "";
        }
        for (File name : file.listFiles()) {
            String name2 = name.getName();
            if (name2.startsWith("init.") && name2.endsWith(".environment.rc") && (indexOf = name2.indexOf(".environment.rc")) > 5) {
                return name2.substring(5, indexOf);
            }
        }
        return "";
    }

    public String j() {
        String str = "";
        try {
            String i2 = i();
            String h2 = h();
            if (!i2.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("1#");
                sb.append(i2);
                str = sb.toString();
            }
            if (h2.isEmpty()) {
                return str;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("2#");
            sb2.append(h2);
            return sb2.toString();
        } catch (Throwable th) {
            a.a(th);
            return str;
        }
    }

    public String k() {
        try {
            UiModeManager uiModeManager = (UiModeManager) this.b.getSystemService("uimode");
            if (uiModeManager == null && b()) {
                return "TV";
            }
            int currentModeType = uiModeManager.getCurrentModeType();
            return D() ? "TV" : currentModeType == 6 ? "WATCH" : currentModeType == 3 ? "CAR" : (this.b.getResources().getConfiguration().screenLayout & 15) >= 3 ? "Pad" : "Phone";
        } catch (Throwable th) {
            if (b()) {
                return "TV";
            }
            a.a(th);
            return "Phone";
        }
    }

    public synchronized String l() {
        return "";
    }

    public synchronized String m() {
        return "";
    }

    public synchronized String o() {
        if (this.f431h == null) {
            this.f431h = p();
        }
        return this.f431h;
    }

    public final String p() {
        Enumeration<NetworkInterface> s = s();
        if (s == null) {
            return "0.0.0.0";
        }
        while (s.hasMoreElements()) {
            Enumeration<InetAddress> inetAddresses = s.nextElement().getInetAddresses();
            while (true) {
                if (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet4Address)) {
                        return nextElement.getHostAddress();
                    }
                }
            }
        }
        return "0.0.0.0";
    }

    public synchronized String q() {
        return "";
    }

    public String r() {
        String str = this.f429f;
        return str == null ? "" : str;
    }

    public final synchronized Enumeration<NetworkInterface> s() {
        if (this.n == null) {
            try {
                this.n = NetworkInterface.getNetworkInterfaces();
            } catch (SocketException e2) {
                a.a((Throwable) e2);
            }
        }
        return this.n;
    }

    public String t() {
        String str = this.f430g;
        return str == null ? "" : str;
    }

    public synchronized String u() {
        if (this.f435l == null) {
            this.f435l = U.b();
        }
        return this.f435l;
    }

    public synchronized String v() {
        String str = this.f428e;
        if (str != null) {
            return str;
        }
        String str2 = "Android " + Build.VERSION.RELEASE + ",level " + Build.VERSION.SDK;
        this.f428e = str2;
        a.a("[DeviceInfo] os version: %s", str2);
        return str2;
    }

    public synchronized String w() {
        if (this.f434k == null) {
            this.f434k = U.a(this.b);
        }
        return this.f434k;
    }

    public String x() {
        Context context = this.b;
        return context == null ? "" : context.getPackageName();
    }

    public byte y() {
        return 1;
    }

    public String z() {
        return U.d();
    }
}
