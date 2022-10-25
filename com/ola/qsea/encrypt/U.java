package com.ola.qsea.encrypt;

import android.content.Context;

public class U {
    public static boolean a = true;

    static {
        try {
            System.loadLibrary("qsealib");
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        }
    }

    public static byte a(String str, long j2) {
        if (!a) {
            return -1;
        }
        try {
            return e(str, j2);
        } catch (NoSuchMethodError e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    public static String a() {
        if (!a) {
            return "";
        }
        try {
            return u();
        } catch (NoSuchMethodError e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String a(Context context) {
        if (!a) {
            return "";
        }
        try {
            return z(context);
        } catch (NoSuchMethodError e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String a(String str) {
        if (!a) {
            return "";
        }
        try {
            return x(str);
        } catch (NoSuchMethodError e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static boolean a(Context context, String str) {
        if (a) {
            try {
                n(context, str);
                return true;
            } catch (NoSuchMethodError e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    public static native byte[] a(int i2, byte[] bArr, byte[] bArr2, byte[] bArr3);

    public static byte[] a(long j2) {
        if (!a) {
            return null;
        }
        try {
            return d(j2);
        } catch (NoSuchMethodError e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String[] a(int i2) {
        if (!a) {
            return null;
        }
        try {
            return c(i2);
        } catch (NoSuchMethodError e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String b() {
        if (!a) {
            return "";
        }
        try {
            return o();
        } catch (NoSuchMethodError e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static byte[] b(int i2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (!a) {
            return null;
        }
        try {
            return a(i2, bArr, bArr2, bArr3);
        } catch (NoSuchMethodError e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String c() {
        if (!a) {
            return "";
        }
        try {
            return p();
        } catch (NoSuchMethodError e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static native String[] c(int i2);

    public static String d() {
        if (!a) {
            return "";
        }
        try {
            return s();
        } catch (NoSuchMethodError e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static native byte[] d(long j2);

    public static native byte e(String str, long j2);

    public static native void n(Context context, String str);

    public static native String o();

    public static native String p();

    public static native String r();

    public static native String s();

    public static native String u();

    public static native String x(String str);

    public static native String z(Context context);
}
