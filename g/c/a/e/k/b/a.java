package g.c.a.e.k.b;

import java.security.MessageDigest;

public class a {
    public static MessageDigest a;
    public static MessageDigest b;
    public static final char[] c = "0123456789abcdef".toCharArray();

    public static String a(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b2 = bArr[i2] & 255;
            int i3 = i2 * 2;
            char[] cArr2 = c;
            cArr[i3] = cArr2[b2 >>> 4];
            cArr[i3 + 1] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public static String b(MessageDigest messageDigest, String str) {
        byte[] bytes = str.getBytes();
        if (messageDigest == null || bytes == null) {
            return null;
        }
        return a(messageDigest.digest(bytes));
    }

    public static MessageDigest c() {
        MessageDigest messageDigest;
        try {
            if (b == null) {
                try {
                    messageDigest = MessageDigest.getInstance("MD5");
                } catch (Exception unused) {
                    messageDigest = null;
                }
                b = messageDigest;
            }
            return b;
        } catch (Exception unused2) {
            return null;
        }
    }

    public static MessageDigest d() {
        MessageDigest messageDigest;
        try {
            if (a == null) {
                try {
                    messageDigest = MessageDigest.getInstance("SHA-1");
                } catch (Exception unused) {
                    messageDigest = null;
                }
                a = messageDigest;
            }
            return a;
        } catch (Exception unused2) {
            return null;
        }
    }
}
