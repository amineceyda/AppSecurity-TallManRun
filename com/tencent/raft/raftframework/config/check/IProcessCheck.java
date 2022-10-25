package com.tencent.raft.raftframework.config.check;

public interface IProcessCheck {
    boolean check(Class<?> cls, String str, boolean z);
}
