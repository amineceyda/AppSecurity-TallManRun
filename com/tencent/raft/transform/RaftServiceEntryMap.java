package com.tencent.raft.transform;

import java.util.HashMap;
import java.util.Map;

public class RaftServiceEntryMap {
    public static final Map<String, String> sServicesMap;

    static {
        HashMap hashMap = new HashMap();
        sServicesMap = hashMap;
        hashMap.put("com.tencent.assistant.alive.api.IKeepAliveService", "com.tencent.raft.transform.assistant_alive_api_IKeepAliveServiceEntry");
        hashMap.put("com.tencent.assistant.alive.config.IServerConfigService", "com.tencent.raft.transform.assistant_alive_config_IServerConfigServiceEntry");
        hashMap.put("com.tencent.assistant.alive.db.ISettingService", "com.tencent.raft.transform.assistant_alive_db_ISettingServiceEntry");
        hashMap.put("com.tencent.assistant.alive.lifecycle.IAppLifeCycleService", "com.tencent.raft.transform.assistant_alive_lifecycle_IAppLifeCycleServiceEntry");
        hashMap.put("com.tencent.assistant.alive.log.IXLogService", "com.tencent.raft.transform.assistant_alive_log_IXLogServiceEntry");
        hashMap.put("com.tencent.assistant.alive.timer.ITimerJobService", "com.tencent.raft.transform.assistant_alive_timer_ITimerJobServiceEntry");
    }
}
