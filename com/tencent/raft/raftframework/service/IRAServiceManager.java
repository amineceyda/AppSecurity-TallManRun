package com.tencent.raft.raftframework.service;

import com.tencent.raft.raftframework.IServiceProvider;

public interface IRAServiceManager {
    void destroy();

    <T> T getService(Class<T> cls, IServiceProvider iServiceProvider);
}
