package com.tencent.raft.raftframework.declare;

public interface IRADeclareManager {
    void destroy();

    String getDeclareConstant(String str);

    Object getDeclareService(String str);
}
