package com.tencent.assistant.alive.api;

import com.tencent.raft.raftannotation.RService;
import g.i.a.a.a.b;

@RService(process = {"ALL"}, scope = "Singleton")
public interface IKeepAliveService {
    boolean a();

    void b(b bVar);

    b c();
}
