package com.tencent.raft.standard.channel;

public interface IRChannel {
    void cancelTransfer(long j2);

    long transfer(BaseRTransferArgs baseRTransferArgs, IRTransferCallback iRTransferCallback);
}
