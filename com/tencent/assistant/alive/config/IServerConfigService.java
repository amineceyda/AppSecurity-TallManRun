package com.tencent.assistant.alive.config;

import com.tencent.raft.raftannotation.RService;

@RService(process = {"ALL"}, scope = "Singleton")
public interface IServerConfigService {
    KeepAliveServerConfig a();
}
