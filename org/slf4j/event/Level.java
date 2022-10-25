package org.slf4j.event;

import com.tencent.raft.codegenmeta.utils.RLog;

public enum Level {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, RLog.DEBUG),
    TRACE(0, "TRACE");
    
    private int levelInt;
    private String levelStr;

    private Level(int i2, String str) {
        this.levelInt = i2;
        this.levelStr = str;
    }

    public int toInt() {
        return this.levelInt;
    }

    public String toString() {
        return this.levelStr;
    }
}
