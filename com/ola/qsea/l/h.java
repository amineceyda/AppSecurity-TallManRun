package com.ola.qsea.l;

import com.tencent.raft.codegenmeta.utils.Constants;

public class h {
    public static String a(String str) {
        return str.trim().replace(" ", "").replace("\t", "").replace("&", "").replace(Constants.KEY_INDEX_FILE_SEPARATOR, "").replace("=", "").replace(";", "");
    }

    public static void a(String[] strArr) {
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (strArr[i2] == null) {
                strArr[i2] = "";
            }
        }
    }
}
