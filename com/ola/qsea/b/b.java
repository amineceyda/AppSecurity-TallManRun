package com.ola.qsea.b;

import android.util.Base64;
import com.tencent.raft.measure.utils.MeasureConst;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

public class b {
    public static String a(String str, String str2) throws Exception {
        byte[] decode = Base64.decode(str2, 2);
        Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        instance.init(1, (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode)));
        return Base64.encodeToString(instance.doFinal(str.getBytes(MeasureConst.CHARSET_UTF8)), 2);
    }
}
