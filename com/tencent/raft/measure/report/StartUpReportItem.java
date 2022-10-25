package com.tencent.raft.measure.report;

import com.tencent.raft.measure.BuildConfig;
import com.tencent.raft.measure.config.RAFTComConfig;
import com.tencent.raft.measure.utils.MeasureConst;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public final class StartUpReportItem {
    private final String appId;
    private final String appName;
    private final String appVersion;
    private final String comName;
    private final String comVersion;
    private final String samplingRate = String.valueOf(5);

    public StartUpReportItem(RAFTComConfig rAFTComConfig, AppInfo appInfo) {
        this.comName = rAFTComConfig.getComName();
        this.comVersion = rAFTComConfig.getComVersion();
        this.appId = appInfo.getAppId();
        this.appName = appInfo.getAppName();
        this.appVersion = appInfo.getAppVersion();
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

    public String getComName() {
        return this.comName;
    }

    public String getComVersion() {
        return this.comVersion;
    }

    public String getSamplingRate() {
        return this.samplingRate;
    }

    public String toUrlParams() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("com_name=");
            sb.append(URLEncoder.encode(this.comName, MeasureConst.CHARSET_UTF8));
            sb.append("&");
            sb.append("com_ver=");
            sb.append(URLEncoder.encode(this.comVersion, MeasureConst.CHARSET_UTF8));
            sb.append("&");
            sb.append("rate=");
            sb.append(URLEncoder.encode(this.samplingRate, MeasureConst.CHARSET_UTF8));
            sb.append("&");
            sb.append("sli_type=");
            sb.append(URLEncoder.encode(MeasureConst.SLI_TYPE_LAUNCH, MeasureConst.CHARSET_UTF8));
            sb.append("&");
            sb.append("app_id=");
            sb.append(URLEncoder.encode(this.appId, MeasureConst.CHARSET_UTF8));
            sb.append("&");
            sb.append("app_name=");
            sb.append(URLEncoder.encode(this.appName, MeasureConst.CHARSET_UTF8));
            sb.append("&");
            sb.append("app_ver=");
            sb.append(URLEncoder.encode(this.appVersion, MeasureConst.CHARSET_UTF8));
            sb.append("&");
            sb.append("sdk_ver=");
            sb.append(URLEncoder.encode(BuildConfig.RAFT_VERSION, MeasureConst.CHARSET_UTF8));
            sb.append("&");
            sb.append("platform=Android");
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
        }
        return sb.toString();
    }
}
