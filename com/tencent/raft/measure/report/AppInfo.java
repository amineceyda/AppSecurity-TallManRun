package com.tencent.raft.measure.report;

import android.text.TextUtils;

public class AppInfo {
    private String appId;
    private String appName;
    private String appVersion;

    public AppInfo(String str, String str2, String str3) {
        this.appId = str;
        this.appName = str2;
        this.appVersion = str3;
    }

    public void ensureNotNull() {
        if (TextUtils.isEmpty(this.appId)) {
            this.appId = "";
        }
        if (TextUtils.isEmpty(this.appName)) {
            this.appName = "";
        }
        if (TextUtils.isEmpty(this.appVersion)) {
            this.appVersion = "";
        }
    }

    public String getAppId() {
        return this.appId;
    }

    public String getAppName() {
        return this.appName;
    }

    public String getAppVersion() {
        return this.appVersion;
    }
}
