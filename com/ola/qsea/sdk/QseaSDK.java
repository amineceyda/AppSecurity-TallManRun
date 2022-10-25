package com.ola.qsea.sdk;

import com.ola.qsea.p.o;

public class QseaSDK {
    public static final String TAG = "QseaSDK";

    public static IQseaSDK getInstance(String str) {
        return o.a(str);
    }
}
