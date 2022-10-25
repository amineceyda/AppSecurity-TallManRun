package com.tencent.raft.raftframework.exception;

import com.tencent.raft.codegenmeta.utils.Constants;

public class RAFTIPCNotSupportException extends RuntimeException {
    private final Reason mReason;

    public enum Reason {
        UNSUPPORTED_PROCESS,
        UNSUPPORTED_METHOD,
        UNSUPPORTED_THREAD,
        UNSUPPORTED_PROXY
    }

    public RAFTIPCNotSupportException(Class<?> cls, Reason reason) {
        super(cls.getName() + Constants.KEY_INDEX_FILE_SEPARATOR + reason);
        this.mReason = reason;
    }

    public RAFTIPCNotSupportException(String str, Reason reason) {
        super(str + Constants.KEY_INDEX_FILE_SEPARATOR + reason);
        this.mReason = reason;
    }

    public RAFTIPCNotSupportException(String str, Reason reason, Throwable th) {
        super(str + Constants.KEY_INDEX_FILE_SEPARATOR + reason, th);
        this.mReason = reason;
    }

    public Reason getReason() {
        return this.mReason;
    }
}
