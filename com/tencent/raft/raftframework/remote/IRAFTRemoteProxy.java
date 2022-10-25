package com.tencent.raft.raftframework.remote;

import android.os.Bundle;

public interface IRAFTRemoteProxy {
    RAFTRemoteResult callServerSync(String str, Bundle bundle);
}
