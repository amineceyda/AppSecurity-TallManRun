package com.ola.qsea.j;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.android.gms.common.ConnectionResult;
import com.ola.qsea.v.d;

public final class a {
    public static String a() {
        ConnectivityManager connectivityManager;
        Context F = d.b().F();
        if (F == null || (connectivityManager = (ConnectivityManager) F.getSystemService("connectivity")) == null) {
            return "unknown";
        }
        String a = Build.VERSION.SDK_INT >= 29 ? a(connectivityManager) : b(connectivityManager);
        return a.equals("mobile") ? a(F) : a;
    }

    @SuppressLint({"MissingPermission"})
    public static String a(Context context) {
        int i2;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return "unknown";
        }
        try {
            i2 = Build.VERSION.SDK_INT < 30 ? telephonyManager.getNetworkType() : telephonyManager.getDataNetworkType();
        } catch (Exception e2) {
            com.ola.qsea.m.a.a((Throwable) e2);
            i2 = 0;
        }
        switch (i2) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case ConnectionResult.TIMEOUT:
            case ConnectionResult.INTERRUPTED:
                return "3G";
            case ConnectionResult.CANCELED:
                return "4G";
            default:
                return g.a.a.a.a.q("unknown_", i2);
        }
    }

    @SuppressLint({"MissingPermission"})
    public static String a(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilities;
        try {
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                return "unknown";
            }
            networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            return networkCapabilities == null ? "unknown" : networkCapabilities.hasTransport(1) ? "wifi" : networkCapabilities.hasTransport(0) ? "mobile" : "unknown";
        } catch (Exception e2) {
            com.ola.qsea.m.a.a((Throwable) e2);
            networkCapabilities = null;
        }
    }

    @SuppressLint({"MissingPermission"})
    public static String b(ConnectivityManager connectivityManager) {
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo == null ? "unknown" : activeNetworkInfo.getType() == 1 ? "wifi" : activeNetworkInfo.getType() == 0 ? "mobile" : "unknown";
        } catch (Exception e2) {
            com.ola.qsea.m.a.a((Throwable) e2);
            return "unknown";
        }
    }

    public static boolean b() {
        ConnectivityManager connectivityManager;
        Context F = d.b().F();
        if (F == null || (connectivityManager = (ConnectivityManager) F.getSystemService("connectivity")) == null) {
            return false;
        }
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities != null) {
                    return networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3);
                }
                return false;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (SecurityException e2) {
            e2.printStackTrace();
            com.ola.qsea.m.a.a("NETWORK", "no permission to query network status，please add permission in AndroidManifest <uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\" />", new Object[0]);
            return false;
        } catch (Exception e3) {
            com.ola.qsea.m.a.a((Throwable) e3);
            return false;
        }
    }
}
