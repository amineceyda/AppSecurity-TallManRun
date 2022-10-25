package com.ola.qsea.b;

import android.util.Base64;
import com.ola.qsea.encrypt.U;
import com.tencent.raft.measure.utils.MeasureConst;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class a {
    public static String a(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int length = sb.length(); length < 16; length++) {
            sb.append("0");
        }
        return sb.toString().substring(0, 16);
    }

    public static String a(String str, String str2) throws Exception {
        return new String(a(Base64.decode(str, 2), str2.getBytes(MeasureConst.CHARSET_UTF8)), MeasureConst.CHARSET_UTF8).trim();
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) throws Exception {
        return a(bArr, bArr2, 2);
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, int i2) throws Exception {
        byte[] b = U.b(i2, bArr2, bArr2, bArr);
        if (b != null) {
            return b;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(i2, secretKeySpec, ivParameterSpec);
        return instance.doFinal(bArr);
    }

    public static String b(String str, String str2) throws Exception {
        return Base64.encodeToString(b(str.getBytes(MeasureConst.CHARSET_UTF8), str2.getBytes(MeasureConst.CHARSET_UTF8)), 2);
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) throws Exception {
        return a(bArr, bArr2, 1);
    }
}
