package com.tencent.raft.raftframework.exception;

public class RAFTCallBeforeInitException extends RuntimeException {
    public RAFTCallBeforeInitException() {
        super("You must call RAFT#init before getService");
    }
}
