package com.tencent.raft.raftframework.service;

import android.content.Context;
import com.tencent.raft.raftframework.service.api.IRaftProvider;
import com.tencent.raft.raftframework.service.api.IServiceEntry;
import com.tencent.raft.raftframework.service.api.ServiceWrapper;

public abstract class RAServiceEntry implements IServiceEntry {
    public ServiceWrapper createService() {
        return createService("");
    }

    public ServiceWrapper createService(Context context, String str) {
        Object loadSingleService = RAServiceLoader.get(getKey()).loadSingleService(str);
        if (loadSingleService instanceof IRaftProvider) {
            ((IRaftProvider) loadSingleService).init(context);
        }
        return new ServiceWrapper(loadSingleService, getScope());
    }

    public ServiceWrapper createService(String str) {
        return new ServiceWrapper(RAServiceLoader.get(getKey()).loadSingleService(str), getScope());
    }

    public int getPriority() {
        return 1;
    }

    public abstract String[] getProcess();

    public abstract String getScope();

    public void register(String str, Class<?> cls) {
        RAServiceLoader.get(getKey()).register(str, cls);
    }
}
