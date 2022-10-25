package com.tencent.raft.raftframework.service;

import com.tencent.raft.raftframework.exception.RAFTNotDeclareServiceException;
import com.tencent.raft.raftframework.exception.RAFTServiceNotFoundException;
import java.util.Map;

public interface IRServiceManager {
    void destroy();

    <T> T get(Class<T> cls, String str) throws RAFTServiceNotFoundException, RAFTNotDeclareServiceException;

    <T> Map<String, T> getAllRService(Class<T> cls) throws RAFTNotDeclareServiceException, RAFTServiceNotFoundException;
}
