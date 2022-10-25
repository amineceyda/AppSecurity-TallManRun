package com.tencent.raft.raftframework.exception;

import g.a.a.a.a;

public class RAFTServiceNotFoundException extends RuntimeException {
    public static final int TYPE_HOST = 2;
    public static final int TYPE_NAME_BIND = 3;
    public static final int TYPE_RAFT = 1;
    private final int type;

    public RAFTServiceNotFoundException(int i2) {
        super(a.q("type=", i2));
        this.type = i2;
    }

    public RAFTServiceNotFoundException(int i2, Throwable th) {
        super(a.q("type=", i2), th);
        this.type = i2;
    }

    public int getType() {
        return this.type;
    }
}
