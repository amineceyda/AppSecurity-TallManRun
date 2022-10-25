package com.tencent.raft.transform;

import com.tencent.raft.raftannotation.RServiceProcess;
import com.tencent.raft.raftframework.service.RAServiceEntry;
import g.i.a.a.l.d.a;

public class assistant_alive_timer_ITimerJobServiceEntry extends RAServiceEntry {
    public assistant_alive_timer_ITimerJobServiceEntry() {
        register("", a.class);
    }

    public String getKey() {
        return "assistant_alive_timer_ITimerJobService";
    }

    public String[] getProcess() {
        return new String[]{RServiceProcess.ALL};
    }

    public String getScope() {
        return "Singleton";
    }
}
