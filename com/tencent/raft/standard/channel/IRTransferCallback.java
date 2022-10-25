package com.tencent.raft.standard.channel;

public interface IRTransferCallback {
    void onTransferFinished(BaseRTransferArgs baseRTransferArgs, BaseRTransferResult baseRTransferResult);
}
