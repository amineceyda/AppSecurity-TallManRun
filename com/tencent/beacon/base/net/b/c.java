package com.tencent.beacon.base.net.b;

import android.content.Context;
import android.util.Base64;
import com.tencent.raft.measure.utils.MeasureConst;
import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class c {
    public static byte[] a(int i2, String str, byte[] bArr) throws Exception {
        if (i2 == 3) {
            return a(str, bArr);
        }
        return null;
    }

    public static byte[] a(Context context, String str) {
        if (str == null) {
            return null;
        }
        try {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) (context.getApplicationInfo().targetSdkVersion >= 28 ? KeyFactory.getInstance("RSA") : KeyFactory.getInstance("RSA", "BC")).generatePublic(new X509EncodedKeySpec(Base64.decode("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCsAxNCSLyNUCOP1QqYStE8ZeiU\nv4afaMqEmoLCKb0mUZYvYOoVN7LPMi2IVY2MRaFJvuND3glVw1RDm2VJJtjQkwUd\n3kpR9TrHAf7UQOVTpNo3Vi7pXTOqZ6bh3ZA/fs56jDCCKV6+wT/pCeu8N6vVnPrD\nz3SdHIeNeWb/woazCwIDAQAB", 0)));
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            instance.init(1, rSAPublicKey);
            return instance.doFinal(str.getBytes(Charset.forName(MeasureConst.CHARSET_UTF8)));
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static byte[] a(String str, byte[] bArr) throws Exception {
        if (str == null || bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(str);
        for (int length = sb.length(); length < 16; length++) {
            sb.append("0");
        }
        String substring = sb.toString().substring(0, 16);
        SecretKeySpec secretKeySpec = new SecretKeySpec(substring.getBytes(Charset.forName(MeasureConst.CHARSET_UTF8)), "AES");
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(2, secretKeySpec, new IvParameterSpec(substring.getBytes(Charset.forName(MeasureConst.CHARSET_UTF8))));
        return instance.doFinal(bArr);
    }

    public static byte[] b(int i2, String str, byte[] bArr) throws Exception, NoSuchAlgorithmException {
        if (i2 == 3) {
            return b(str, bArr);
        }
        return null;
    }

    private static byte[] b(String str, byte[] bArr) throws Exception, NoSuchAlgorithmException {
        if (str == null || bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(str);
        for (int length = sb.length(); length < 16; length++) {
            sb.append("0");
        }
        String substring = sb.toString().substring(0, 16);
        SecretKeySpec secretKeySpec = new SecretKeySpec(substring.getBytes(Charset.forName(MeasureConst.CHARSET_UTF8)), "AES");
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(1, secretKeySpec, new IvParameterSpec(substring.getBytes(Charset.forName(MeasureConst.CHARSET_UTF8))));
        return instance.doFinal(bArr);
    }
}
