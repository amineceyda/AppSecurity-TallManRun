package com.tencent.assistant.alive.db;

import com.tencent.raft.raftannotation.RService;

@RService(process = {"ALL"}, scope = "Singleton")
public interface ISettingService {
    byte[] a(String str);

    long getLong(String str, long j2);

    boolean putLong(String str, long j2);
}
