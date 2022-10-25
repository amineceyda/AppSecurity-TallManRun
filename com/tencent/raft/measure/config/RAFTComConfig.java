package com.tencent.raft.measure.config;

import android.text.TextUtils;
import g.a.a.a.a;
import org.slf4j.helpers.MessageFormatter;

public class RAFTComConfig {
    private final String comName;
    private final String comVersion;

    public RAFTComConfig(String str, String str2) {
        this.comName = str;
        this.comVersion = str2;
    }

    public String getComName() {
        return this.comName;
    }

    public String getComVersion() {
        return this.comVersion;
    }

    public String getUniKey() {
        return getComName() + "_" + getComVersion();
    }

    public boolean isDataValid() {
        return !TextUtils.isEmpty(this.comName) && !TextUtils.isEmpty(this.comVersion);
    }

    public String toString() {
        StringBuilder i2 = a.i("RAFTComConfig{comName='");
        a.p(i2, this.comName, '\'', ", comVersion='");
        i2.append(this.comVersion);
        i2.append('\'');
        i2.append(MessageFormatter.DELIM_STOP);
        return i2.toString();
    }
}
