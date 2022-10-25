package com.tencent.raft.transform;

import com.tencent.raft.raftannotation.RServiceProcess;
import com.tencent.raft.raftframework.service.RAServiceEntry;
import g.i.a.a.d.a;

public class assistant_alive_db_ISettingServiceEntry extends RAServiceEntry {
    public assistant_alive_db_ISettingServiceEntry() {
        register("", a.class);
    }

    public String getKey() {
        return "assistant_alive_db_ISettingService";
    }

    public String[] getProcess() {
        return new String[]{RServiceProcess.ALL};
    }

    public String getScope() {
        return "Singleton";
    }
}
