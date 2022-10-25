package com.tencent.raft.raftframework.service.api;

public interface IServiceEntry {
    ServiceWrapper createService();

    String getKey();

    int getPriority();
}
