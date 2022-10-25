package com.tencent.assistant.alive.log;

import com.tencent.raft.raftannotation.RService;

@RService(process = {"ALL"}, scope = "Singleton")
public interface IXLogService {
    void a(String str, int i2, String str2, String str3, Throwable th);

    void b(Throwable th);
}
