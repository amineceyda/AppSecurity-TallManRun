package com.tencent.raft.raftframework;

import com.tencent.raft.raftframework.service.api.ServiceWrapper;

public interface IServiceProvider {
    ServiceWrapper provide();
}
