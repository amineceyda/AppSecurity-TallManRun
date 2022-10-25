package com.tencent.raft.codegenmeta;

import com.tencent.raft.codegenmeta.config.RaftConfigsMeta;
import com.tencent.raft.codegenmeta.service.RAServiceMetaCenter;
import com.tencent.raft.codegenmeta.utils.RLog;
import java.util.Map;

public class RaftCodeGenRepository {
    public static final String TAG = "RaftCodeGenRepository";
    private static RaftCodeGenRepository sInstance;
    private RaftConfigsMeta mConfigs = new RaftConfigsMeta();
    private RAServiceMetaCenter mServiceMetaCenter = new RAServiceMetaCenter();

    public static RaftCodeGenRepository get() {
        if (sInstance == null) {
            sInstance = new RaftCodeGenRepository();
        }
        return sInstance;
    }

    public static RaftConfigsMeta getConfigCenter() {
        return get().mConfigs;
    }

    public static RAServiceMetaCenter getServiceMetaCenter() {
        return get().mServiceMetaCenter;
    }

    public void initWithYMLData(RAYamlResource rAYamlResource, Map<String, Object> map) {
        if (rAYamlResource == null) {
            RLog.e(TAG, "initWithYMLData error, serviceData not found");
            return;
        }
        RLog.d(TAG, "initWithYMLData: " + rAYamlResource);
        RAServiceMetaCenter rAServiceMetaCenter = new RAServiceMetaCenter();
        this.mServiceMetaCenter = rAServiceMetaCenter;
        rAServiceMetaCenter.init(rAYamlResource.services);
        RaftConfigsMeta raftConfigsMeta = new RaftConfigsMeta();
        this.mConfigs = raftConfigsMeta;
        raftConfigsMeta.init(map);
    }
}
