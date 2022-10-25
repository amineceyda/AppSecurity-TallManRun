package com.tencent.raft.raftframework.remote;

import android.os.Bundle;

public class RAFTRemoteResult {
    public static final int CODE_CONNECTION_INVALID = -2;
    public static final int CODE_CONNECT_FAILED = -105;
    public static final int CODE_ERR = -102;
    public static final int CODE_HAS_EXCEPTION = -101;
    public static final int CODE_NO_CONNECT = -1;
    public static final int CODE_NO_ERR = 0;
    public static final int CODE_UNKNOWN = -100;
    public int code;
    public Bundle data;
    public Throwable throwable;

    public RAFTRemoteResult() {
        this.code = -100;
    }

    public RAFTRemoteResult(int i2, Bundle bundle) {
        this.code = -100;
        this.code = i2;
        this.data = bundle;
    }

    public RAFTRemoteResult(int i2, Bundle bundle, Throwable th) {
        this.code = -100;
        this.code = i2;
        this.data = bundle;
        this.throwable = th;
    }

    public RAFTRemoteResult(int i2, Throwable th) {
        this.code = -100;
        this.code = i2;
        this.throwable = th;
    }

    public RAFTRemoteResult(Throwable th) {
        this.code = -100;
        this.code = CODE_HAS_EXCEPTION;
        this.throwable = th;
    }

    public static RAFTRemoteResult createExceptionResult(Throwable th) {
        RAFTRemoteResult rAFTRemoteResult = new RAFTRemoteResult();
        rAFTRemoteResult.code = CODE_HAS_EXCEPTION;
        rAFTRemoteResult.throwable = th;
        return rAFTRemoteResult;
    }
}
