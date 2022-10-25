package com.tencent.raft.transform;

import com.tencent.raft.raftannotation.RServiceProcess;
import com.tencent.raft.raftframework.service.RAServiceEntry;
import g.i.a.a.c.a.a;

public class assistant_alive_config_IServerConfigServiceEntry extends RAServiceEntry {
    public assistant_alive_config_IServerConfigServiceEntry() {
        register("", a.class);
    }

    public String getKey() {
        return "assistant_alive_config_IServerConfigService";
    }

    public String[] getProcess() {
        return new String[]{RServiceProcess.ALL};
    }

    public String getScope() {
        return "Singleton";
    }
}
