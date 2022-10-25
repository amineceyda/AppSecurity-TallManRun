package com.tencent.raft.transform;

import com.tencent.raft.raftannotation.RServiceProcess;
import com.tencent.raft.raftframework.service.RAServiceEntry;
import g.i.a.a.g.a.a;

public class assistant_alive_log_IXLogServiceEntry extends RAServiceEntry {
    public assistant_alive_log_IXLogServiceEntry() {
        register("", a.class);
    }

    public String getKey() {
        return "assistant_alive_log_IXLogService";
    }

    public String[] getProcess() {
        return new String[]{RServiceProcess.ALL};
    }

    public String getScope() {
        return "Singleton";
    }
}
