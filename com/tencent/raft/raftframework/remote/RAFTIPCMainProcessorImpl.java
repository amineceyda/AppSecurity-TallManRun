package com.tencent.raft.raftframework.remote;

import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.raft.raftframework.RAFT;
import com.tencent.raft.raftframework.log.RLog;
import com.tencent.raft.raftframework.service.export.IRAFTIPCMainProcessor;
import g.a.a.a.a;

public class RAFTIPCMainProcessorImpl implements IRAFTIPCMainProcessor {
    private static final String TAG = "RAFTIPCMainProcessorImpl";

    public RAFTRemoteResult callInMainProcess(String str, Bundle bundle, int i2) {
        if (RAFT.getConfig().isDebugVersion()) {
            RLog.i(TAG, "action:" + str + " callbackId=" + i2);
        }
        if (TextUtils.isEmpty(str) || !str.contains(RemoteProxyUtil.SPLIT_CHAR)) {
            return RAFTRemoteResult.createExceptionResult(new IllegalStateException("wrong action"));
        }
        String[] split = str.split("\\$");
        if (split.length != 4) {
            return RAFTRemoteResult.createExceptionResult(new IllegalStateException(a.w("wrong action, action = ", str)));
        }
        if (split[0].compareTo(RemoteProxyUtil.KEY_CALL_API) == 0) {
            return RAFTRemoteProxy.callInMainProcess(str, bundle, i2);
        }
        StringBuilder i3 = a.i("RAFTRemoteProxy.callInMainProcess result is null, callType=");
        i3.append(split[0]);
        return RAFTRemoteResult.createExceptionResult(new IllegalStateException(i3.toString()));
    }
}
