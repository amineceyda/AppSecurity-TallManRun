package com.tencent.raft.codegenmeta.utils;

import com.tencent.raft.codegenmeta.utils.Constants;
import java.util.Collection;
import java.util.Map;

public class Utils {
    public static String getDeclareRefName(String str) {
        return str.replace(Constants.Configs.DECLARES_REF, "");
    }

    public static boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.size() == 0;
    }

    public static boolean isEmpty(Map<?, ?> map) {
        return map == null || map.size() == 0;
    }

    public static boolean isNotEmpty(CharSequence charSequence) {
        return !isEmpty(charSequence);
    }
}
