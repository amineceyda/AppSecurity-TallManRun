package com.tencent.raft.raftframework.remote;

import com.tencent.raft.raftframework.service.api.IServiceEntry;
import com.tencent.raft.raftframework.service.api.ServiceWrapper;

public class RAFTIPCMainProcessorEntry implements IServiceEntry {
    public ServiceWrapper createService() {
        return new ServiceWrapper(new RAFTIPCMainProcessorImpl(), "Singleton");
    }

    public String getKey() {
        return "RAFTIPCMainProcessorEntry";
    }

    public int getPriority() {
        return 1;
    }
}
