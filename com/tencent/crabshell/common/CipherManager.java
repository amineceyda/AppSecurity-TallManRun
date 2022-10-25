package com.tencent.crabshell.common;

import android.text.TextUtils;
import android.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.b.a.a.b.f;

public class CipherManager {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    private static final String ALGORITHM = "AES";
    private static final String ALGORITHM_STR = "AES/ECB/PKCS5Padding";
    private static final int KEY_MAX_LENGTH = 16;
    private static SecretKeySpec key;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = f.a(-7019568130345410571L, "com/tencent/crabshell/common/CipherManager", 16);
        $jacocoData = a;
        return a;
    }

    public CipherManager(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[0] = true;
        if (TextUtils.isEmpty(str)) {
            $jacocoInit[1] = true;
        } else if (str.length() <= 16) {
            $jacocoInit[2] = true;
        } else {
            $jacocoInit[3] = true;
            key = new SecretKeySpec(str.substring(0, 16).getBytes(), ALGORITHM);
            $jacocoInit[4] = true;
            return;
        }
        key = new SecretKeySpec(str.getBytes(), ALGORITHM);
        $jacocoInit[5] = true;
    }

    public String decryptData(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        try {
            Cipher instance = Cipher.getInstance(ALGORITHM_STR);
            $jacocoInit[11] = true;
            instance.init(2, key);
            $jacocoInit[12] = true;
            String str2 = new String(instance.doFinal(Base64.decode(str, 0)), "utf-8");
            $jacocoInit[13] = true;
            return str2;
        } catch (Exception e2) {
            $jacocoInit[14] = true;
            e2.printStackTrace();
            $jacocoInit[15] = true;
            return null;
        }
    }

    public String encryptData(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        try {
            Cipher instance = Cipher.getInstance(ALGORITHM_STR);
            $jacocoInit[6] = true;
            instance.init(1, key);
            $jacocoInit[7] = true;
            String encodeToString = Base64.encodeToString(instance.doFinal(str.getBytes("utf-8")), 0);
            $jacocoInit[8] = true;
            return encodeToString;
        } catch (Exception e2) {
            $jacocoInit[9] = true;
            e2.printStackTrace();
            $jacocoInit[10] = true;
            return null;
        }
    }
}
