package com.tencent.raft.transform;

import com.tencent.raft.raftannotation.RServiceProcess;
import com.tencent.raft.raftframework.service.RAServiceEntry;
import g.i.a.a.a.d.a;

public class assistant_alive_api_IKeepAliveServiceEntry extends RAServiceEntry {
    public assistant_alive_api_IKeepAliveServiceEntry() {
        register("", a.class);
    }

    public String getKey() {
        return "assistant_alive_api_IKeepAliveService";
    }

    public String[] getProcess() {
        return new String[]{RServiceProcess.ALL};
    }

    public String getScope() {
        return "Singleton";
    }
}
