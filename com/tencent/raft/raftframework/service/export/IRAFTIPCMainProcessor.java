package com.tencent.raft.raftframework.service.export;

import android.os.Bundle;
import com.tencent.raft.raftframework.remote.RAFTRemoteResult;

public interface IRAFTIPCMainProcessor {
    RAFTRemoteResult callInMainProcess(String str, Bundle bundle, int i2);
}
