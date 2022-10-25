package com.tencent.assistant.alive.timer;

import com.tencent.raft.raftannotation.RService;
import g.i.a.a.l.a;

@RService(process = {"ALL"}, scope = "Singleton")
public interface ITimerJobService {
    void a(a aVar);
}
