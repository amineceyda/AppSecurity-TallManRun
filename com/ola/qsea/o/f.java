package com.ola.qsea.o;

import com.ola.qsea.a.b;
import com.tencent.raft.codegenmeta.utils.Constants;

public enum f {
    REPORT_TYPE("type"),
    REPORT_DATA("params"),
    REPORT_DATA_Q16("q16"),
    REPORT_DATA_Q36("q36"),
    REPORT_DATA_IP("ip"),
    REPORT_PLATFORM_ID("platformId"),
    REPORT_AD(b.a(11)),
    REPORT_DATA_NET_TYPE("networkType"),
    REPORT_APPKEY("appKey"),
    REPORT_SDKVERSION("sdkVersion"),
    REPORT_QSEA_USED_TIME("p1"),
    REPORT_QSEA_LOCAL_USED_TIME("p2"),
    REPORT_OAID_USED_TIME("p3"),
    REPORT_QSEA_INIT_TIME("p4"),
    REPORT_QSEA_ERROR_CODE("p1"),
    REPORT_QSEA_ERROR_DESC("p2"),
    REPORT_QSEA_CHANGE_OLD_Q16("p1"),
    REPORT_QSEA_CHANGE_OLD_Q36("p2"),
    REPORT_QSEA_CHANGE_NEW_Q16("p3"),
    REPORT_QSEA_CHANGE_NEW_Q36("p4"),
    REPORT_QSEA_FROM_BC("p5"),
    REPORT_CLONE_CACHE_Q16("p1"),
    REPORT_CLONE_CACHE_Q36("p2"),
    REPORT_CLONE_DETECT_TYPE("p3"),
    REPORT_CLONE_CACHE_NEW_Q16("p4"),
    REPORT_CLONE_CACHE_NEW_Q36("p5"),
    REPORT_CACHE("p1"),
    REPORT_JS_H5ID("hid"),
    REPORT_JS_UA("userAgent"),
    REPORT_JS_BROWSER_TYPE("browser"),
    REPORT_JS_VERSION(Constants.Raft.VERSION),
    REPORT_COLLECT_RATE_Q16("p1"),
    REPORT_COLLECT_RATE_Q36("p2"),
    REPORT_COLLECT_RATE_DELAY("p3"),
    REPORT_STARTUP_DURAtION("p4");
    
    public String K;

    /* access modifiers changed from: public */
    f(String str) {
        this.K = str;
    }

    public String a() {
        return this.K;
    }
}
