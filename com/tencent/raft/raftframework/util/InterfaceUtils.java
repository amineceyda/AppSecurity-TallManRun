package com.tencent.raft.raftframework.util;

import com.tencent.raft.standard.channel.IRChannel;
import com.tencent.raft.standard.log.IRLog;
import com.tencent.raft.standard.report.IRReport;

public final class InterfaceUtils {
    private InterfaceUtils() {
    }

    public static boolean isStandardRaftInterface(Class<?> cls) {
        return IRLog.class == cls || IRReport.class == cls || IRChannel.class == cls;
    }
}
