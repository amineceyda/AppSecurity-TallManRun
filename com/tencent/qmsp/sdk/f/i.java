package com.tencent.qmsp.sdk.f;

import com.tencent.raft.codegenmeta.utils.Constants;

public class i {
    public static String a(String str) {
        return str.trim().replace(" ", "").replace("\t", "").replace("&", "").replace(Constants.KEY_INDEX_FILE_SEPARATOR, "").replace("=", "").replace(";", "");
    }
}
