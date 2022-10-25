package com.tencent.raft.raftframework.service.api;

import android.text.TextUtils;
import com.tencent.raft.raftframework.constant.RAFTConstants;

public class ServiceWrapper {
    public RAFTConstants.Scope scope = RAFTConstants.Scope.PROTOTYPE;
    public Object service;

    public ServiceWrapper(Object obj, String str) {
        this.service = obj;
        if (!TextUtils.isEmpty(str)) {
            this.scope = RAFTConstants.Scope.parse(str);
        }
    }
}
